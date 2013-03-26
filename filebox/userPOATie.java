package filebox;


/**
* filebox/userPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from filebox.idl
* 26 March 2013 19:08:12 o'clock GMT
*/

public class userPOATie extends userPOA
{

  // Constructors

  public userPOATie ( filebox.userOperations delegate ) {
      this._impl = delegate;
  }
  public userPOATie ( filebox.userOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public filebox.userOperations _delegate() {
      return this._impl;
  }
  public void _delegate (filebox.userOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public int uid ()
  {
    return _impl.uid();
  } // uid

  public String username ()
  {
    return _impl.username();
  } // username
  public void username (String newUsername)
  {
    _impl.username(newUsername);
  } // username

  public String password ()
  {
    return _impl.password();
  } // password
  public void password (String newPassword)
  {
    _impl.password(newPassword);
  } // password

  public int lastlogin ()
  {
    return _impl.lastlogin();
  } // lastlogin
  public void lastlogin (int newLastlogin)
  {
    _impl.lastlogin(newLastlogin);
  } // lastlogin

  public short filestatus ()
  {
    return _impl.filestatus();
  } // filestatus
  public void filestatus (short newFilestatus)
  {
    _impl.filestatus(newFilestatus);
  } // filestatus


  // 0 = public 1 = private
  public filebox.user addUser (int uid, String username, String password)
  {
    return _impl.addUser(uid, username, password);
  } // addUser

  public filebox.user login (String username, String password)
  {
    return _impl.login(username, password);
  } // login

  public filebox.user addFile (String files)
  {
    return _impl.addFile(files);
  } // addFile

  public filebox.user changeFileStatus (String files, short filestatus)
  {
    return _impl.changeFileStatus(files, filestatus);
  } // changeFileStatus

  public filebox.user removeFile (String files)
  {
    return _impl.removeFile(files);
  } // removeFile

  public filebox.user checkFileUpdates (String files, int lastlogin, String filename)
  {
    return _impl.checkFileUpdates(files, lastlogin, filename);
  } // checkFileUpdates

  private filebox.userOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class userPOATie
