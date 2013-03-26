package filebox;


/**
* filebox/userOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from filebox.idl
* 26 March 2013 19:08:12 o'clock GMT
*/

public interface userOperations 
{
  int uid ();
  String username ();
  void username (String newUsername);
  String password ();
  void password (String newPassword);
  int lastlogin ();
  void lastlogin (int newLastlogin);
  short filestatus ();
  void filestatus (short newFilestatus);

  // 0 = public 1 = private
  filebox.user addUser (int uid, String username, String password);
  filebox.user login (String username, String password);
  filebox.user addFile (String files);
  filebox.user changeFileStatus (String files, short filestatus);
  filebox.user removeFile (String files);
  filebox.user checkFileUpdates (String files, int lastlogin, String filename);
} // interface userOperations
