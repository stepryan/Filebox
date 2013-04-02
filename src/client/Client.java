package client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.omg.CORBA.ORB;

import filebox.file;
import filebox.status;
import filebox.service;
import filebox.serviceHelper;
import filebox.user;

public class Client {
  public static void main(String args[]) {
    try {
      ORB orb = ORB.init(args, null);
      BufferedReader br = new BufferedReader(new FileReader("filebox.ior"));
      String ior = br.readLine();
      org.omg.CORBA.Object obj = orb.string_to_object(ior);

      service fileboxService = serviceHelper.narrow(obj);

      // create users

      int user1Id = fileboxService.addUser("User1", "Password1");
      status status1 = fileboxService.getStatus();
      int user2Id = fileboxService.addUser("User2", "Password2");
      status status2 = fileboxService.getStatus();
      int user3Id = fileboxService.addUser("User3", "Password3");
      status status3 = fileboxService.getStatus();
      int user3_2Id = fileboxService.addUser("User3", "Password3"); // the same user
      status status3_2 = fileboxService.getStatus();

      System.out.println("Message >>> code=" + status1.code() + ", text=" + status1.text());
      if (status1.code() == 0)
        System.out.println("Generated user ID: " + user1Id);
      System.out.println("Message >>> code=" + status2.code() + ", text=" + status2.text());
      if (status2.code() == 0)
        System.out.println("Generated user ID: " + user2Id);
      System.out.println("Message >>> code=" + status3.code() + ", text=" + status3.text());
      if (status3.code() == 0)
        System.out.println("Generated user ID: " + user3Id);
      System.out.println("Message >>> code=" + status3_2.code() + ", text=" + status3_2.text());
      if (status3_2.code() == 0)
        System.out.println("Generated user ID: " + user3_2Id);
      System.out.println("==================================");

      // get users' details

      user user1 = fileboxService.getUser(user1Id);
      user user2 = fileboxService.getUser(user2Id);
      user user3 = fileboxService.getUser(user3Id);

      System.out.println("Retrieved details for ID " + user1Id + ": " + "[id=" + user1.id() + ", username="          + user1.username() + ", password=" + user1.password() + "]");
      System.out.println("Retrieved details for ID " + user2Id + ": " + "[id=" + user2.id() + ", username="          + user2.username() + ", password=" + user2.password() + "]");
      System.out.println("Retrieved details for ID " + user3Id + ": " + "[id=" + user3.id() + ", username="          + user3.username() + ", password=" + user3.password() + "]");
      System.out.println("==================================");

      // login

      user1Id = fileboxService.login("User1", "Password1"); // ok
      status1 = fileboxService.getStatus();
      user2Id = fileboxService.login("User2", "Password2222"); // bad
      status2 = fileboxService.getStatus();

      System.out.println("Message >>> code=" + status1.code() + ", text=" + status1.text());
      if (status1.code() == 0) System.out.println("Logged in user ID: " + user1Id);
      System.out.println("Message >>> code=" + status2.code() + ", text=" + status2.text());
      if (status2.code() == 0) System.out.println("Logged in user ID: " + user2Id);
      System.out.println("==================================");

      // add 2 files for the same user, and try 3rd with the same name
      
      int file1Id = fileboxService.addFile("File01", readFile("File01.txt"), 1, user1Id); // ok
      status1 = fileboxService.getStatus();
      int file2Id = fileboxService.addFile("File02", readFile("File02.txt"), 0, user1Id); // ok
      status2 = fileboxService.getStatus();
      int file3Id = fileboxService.addFile("File02", readFile("File02.txt"), 1, user1Id); // bad name
      status3 = fileboxService.getStatus();
      int file4Id = fileboxService.addFile("File02", readFile("File02.txt"), 0, -666); // bad user id
      status status4 = fileboxService.getStatus();
      
      System.out.println("Message >>> code=" + status1.code() + ", text=" + status1.text());
      if (status1.code() == 0) System.out.println("Generated file ID: " + file1Id);
      System.out.println("Message >>> code=" + status2.code() + ", text=" + status2.text());
      if (status2.code() == 0) System.out.println("Generated file ID: " + file2Id);
      System.out.println("Message >>> code=" + status3.code() + ", text=" + status3.text());
      if (status3.code() == 0) System.out.println("Generated file ID: " + file3Id);
      System.out.println("Message >>> code=" + status4.code() + ", text=" + status4.text());
      if (status4.code() == 0) System.out.println("Generated file ID: " + file4Id);
      System.out.println("==================================");
      
      // retrieve files
      file file1 = fileboxService.getFile("File01", user1Id);
      status1 = fileboxService.getStatus();
      file file2 = fileboxService.getFile("File01", -666); // bad user id
      status2 = fileboxService.getStatus();
      
      System.out.println("Message >>> code=" + status1.code() + ", text=" + status1.text());
      if (status1.code() == 0) System.out.println("Retrieved file: name=" + file1.name() + ", content=" + file1.content());
      System.out.println("Message >>> code=" + status2.code() + ", text=" + status2.text());
      if (status2.code() == 0) System.out.println("Retrieved file: name=" + file2.name() + ", content=" + file2.content());
      System.out.println("==================================");
    } catch (Exception e) {
      System.out.println("ERROR : " + e);
      e.printStackTrace(System.out);
    }
  }

  // Default path is: PROJECT_ROOT/res
  private static String readFile(String name) {
    return readFile(System.getProperty("user.dir"), name);
  }

  private static String readFile(String path, String name) {
    StringBuilder sb = new StringBuilder();
    
    BufferedReader br = null;
    try {
      String line = null;
      br = new BufferedReader(new FileReader(path + File.separator + "res" + File.separator + name));

      while ((line = br.readLine()) != null) {
        System.out.println(line);
        sb.append(line);
      }
      System.out.println("==================================");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)
          br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return sb.toString();
  }
}