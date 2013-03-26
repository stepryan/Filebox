package filebox;


/**
* filebox/filePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from filebox.idl
* 26 March 2013 19:08:12 o'clock GMT
*/

public abstract class filePOA extends org.omg.PortableServer.Servant
 implements filebox.fileOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_content", new java.lang.Integer (0));
    _methods.put ("_set_content", new java.lang.Integer (1));
    _methods.put ("_get_filename", new java.lang.Integer (2));
    _methods.put ("_set_filename", new java.lang.Integer (3));
    _methods.put ("_get_fileid", new java.lang.Integer (4));
    _methods.put ("_set_fileid", new java.lang.Integer (5));
    _methods.put ("_get_filestatus", new java.lang.Integer (6));
    _methods.put ("_set_filestatus", new java.lang.Integer (7));
    _methods.put ("_get_lastchanged", new java.lang.Integer (8));
    _methods.put ("_set_lastchanged", new java.lang.Integer (9));
    _methods.put ("_get_uid", new java.lang.Integer (10));
    _methods.put ("_set_uid", new java.lang.Integer (11));
    _methods.put ("addFile", new java.lang.Integer (12));
    _methods.put ("changeFileStatus", new java.lang.Integer (13));
    _methods.put ("fileUpdate", new java.lang.Integer (14));
    _methods.put ("getFiles", new java.lang.Integer (15));
    _methods.put ("getFile", new java.lang.Integer (16));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // filebox/file/_get_content
       {
         String $result = null;
         $result = this.content ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // filebox/file/_set_content
       {
         String newContent = in.read_string ();
         this.content (newContent);
         out = $rh.createReply();
         break;
       }

       case 2:  // filebox/file/_get_filename
       {
         String $result = null;
         $result = this.filename ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // filebox/file/_set_filename
       {
         String newFilename = in.read_string ();
         this.filename (newFilename);
         out = $rh.createReply();
         break;
       }

       case 4:  // filebox/file/_get_fileid
       {
         short $result = (short)0;
         $result = this.fileid ();
         out = $rh.createReply();
         out.write_short ($result);
         break;
       }

       case 5:  // filebox/file/_set_fileid
       {
         short newFileid = in.read_short ();
         this.fileid (newFileid);
         out = $rh.createReply();
         break;
       }

       case 6:  // filebox/file/_get_filestatus
       {
         short $result = (short)0;
         $result = this.filestatus ();
         out = $rh.createReply();
         out.write_short ($result);
         break;
       }

       case 7:  // filebox/file/_set_filestatus
       {
         short newFilestatus = in.read_short ();
         this.filestatus (newFilestatus);
         out = $rh.createReply();
         break;
       }

       case 8:  // filebox/file/_get_lastchanged
       {
         int $result = (int)0;
         $result = this.lastchanged ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 9:  // filebox/file/_set_lastchanged
       {
         int newLastchanged = in.read_long ();
         this.lastchanged (newLastchanged);
         out = $rh.createReply();
         break;
       }

       case 10:  // filebox/file/_get_uid
       {
         int $result = (int)0;
         $result = this.uid ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 11:  // filebox/file/_set_uid
       {
         int newUid = in.read_long ();
         this.uid (newUid);
         out = $rh.createReply();
         break;
       }

       case 12:  // filebox/file/addFile
       {
         String content = in.read_string ();
         String filename = in.read_string ();
         short fileid = in.read_short ();
         short filestatus = in.read_short ();
         filebox.file $result = null;
         $result = this.addFile (content, filename, fileid, filestatus);
         out = $rh.createReply();
         filebox.fileHelper.write (out, $result);
         break;
       }

       case 13:  // filebox/file/changeFileStatus
       {
         String filelist = in.read_string ();
         short fileid = in.read_short ();
         short filestatus = in.read_short ();
         filebox.file $result = null;
         $result = this.changeFileStatus (filelist, fileid, filestatus);
         out = $rh.createReply();
         filebox.fileHelper.write (out, $result);
         break;
       }

       case 14:  // filebox/file/fileUpdate
       {
         String filelist = in.read_string ();
         int lastchanged = in.read_long ();
         short fileid = in.read_short ();
         filebox.file $result = null;
         $result = this.fileUpdate (filelist, lastchanged, fileid);
         out = $rh.createReply();
         filebox.fileHelper.write (out, $result);
         break;
       }

       case 15:  // filebox/file/getFiles
       {
         int uid = in.read_long ();
         String content = in.read_string ();
         filebox.file $result = null;
         $result = this.getFiles (uid, content);
         out = $rh.createReply();
         filebox.fileHelper.write (out, $result);
         break;
       }

       case 16:  // filebox/file/getFile
       {
         int uid = in.read_long ();
         String filename = in.read_string ();
         String content = in.read_string ();
         filebox.file $result = null;
         $result = this.getFile (uid, filename, content);
         out = $rh.createReply();
         filebox.fileHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:filebox/file:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public file _this() 
  {
    return fileHelper.narrow(
    super._this_object());
  }

  public file _this(org.omg.CORBA.ORB orb) 
  {
    return fileHelper.narrow(
    super._this_object(orb));
  }


} // class filePOA
