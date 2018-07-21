package DcmsApp;


/**
* DcmsApp/DcmsOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from IDLInterfaces/Dcms.idl
* Friday, July 20, 2018 11:20:22 o'clock PM EDT
*/

public interface DcmsOperations 
{
  String createTRecord (String managerID, String teacher);
  String createSRecord (String managerID, String student);
  String getRecordCount ();
  String editRecord (String managerID, String recordID, String fieldname, String newvalue);
  String transferRecord (String managerID, String recordID, String location);
} // interface DcmsOperations
