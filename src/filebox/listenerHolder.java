package filebox;

/**
* filebox/listenerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Saturday, April 6, 2013 6:25:21 PM BST
*/

public final class listenerHolder implements org.omg.CORBA.portable.Streamable
{
  public filebox.listener value = null;

  public listenerHolder ()
  {
  }

  public listenerHolder (filebox.listener initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = filebox.listenerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    filebox.listenerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return filebox.listenerHelper.type ();
  }

}
