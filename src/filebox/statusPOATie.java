package filebox;


/**
* filebox/statusPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Tuesday, April 2, 2013 10:15:42 AM BST
*/

public class statusPOATie extends statusPOA
{

  // Constructors

  public statusPOATie ( filebox.statusOperations delegate ) {
      this._impl = delegate;
  }
  public statusPOATie ( filebox.statusOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public filebox.statusOperations _delegate() {
      return this._impl;
  }
  public void _delegate (filebox.statusOperations delegate ) {
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
  public int code ()
  {
    return _impl.code();
  } // code
  public void code (int newCode)
  {
    _impl.code(newCode);
  } // code


  // 0 - success, 1 - error
  public String text ()
  {
    return _impl.text();
  } // text

  // 0 - success, 1 - error
  public void text (String newText)
  {
    _impl.text(newText);
  } // text

  private filebox.statusOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class statusPOATie
