package filebox;


/**
* filebox/userOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from filebox.idl
* 03 April 2013 20:38:14 o'clock IST
*/

public interface userOperations 
{
  int id ();
  String username ();
  void username (String newUsername);
  String password ();
  void password (String newPassword);
  int lastlogin ();
  void lastlogin (int newLastlogin);
} // interface userOperations
