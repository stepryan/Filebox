package filebox;


/**
* filebox/listenerPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Saturday, April 6, 2013 6:25:21 PM BST
*/

public class listenerPOATie extends listenerPOA
{

  // Constructors

  public listenerPOATie ( filebox.listenerOperations delegate ) {
      this._impl = delegate;
  }
  public listenerPOATie ( filebox.listenerOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public filebox.listenerOperations _delegate() {
      return this._impl;
  }
  public void _delegate (filebox.listenerOperations delegate ) {
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
  public void message (String message)
  {
    _impl.message(message);
  } // message

  private filebox.listenerOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class listenerPOATie
