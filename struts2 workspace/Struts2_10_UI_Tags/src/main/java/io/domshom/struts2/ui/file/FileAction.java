package io.domshom.struts2.ui.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {

	/*single file upload*/
	private File uploadFile;
	private String uploadFileContentType;
	private String uploadFileName;
	private String fileName;

	/*download*/
	private InputStream fileInputStream;
	
	/*multiple file upload*/
	private List<String> multipleFileUploadFileName = new ArrayList<String>();
	private List<File> multipleFileUpload = new ArrayList<File>();
	private List<String> multipleFileUploadContentType = new ArrayList<String>();

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String download() {
		try{
			fileInputStream = new FileInputStream("D:\\Abc.txt");
		} catch(Exception ex){
			System.out.println("Exception occurred : "+ex);
		}
	    return SUCCESS;
	}
	
	public String multipleFileUpload() throws Exception {
		for (File file : multipleFileUpload) {
			System.out.println("File :" + file);
		}
		for (String fileName : multipleFileUploadFileName) {
			System.out.println("Filename : " + fileName);
		}
		for (String fileContentType : multipleFileUploadContentType) {
			System.out.println("File type : " + fileContentType);
		}
		return SUCCESS;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	
	public String getFileName(){
		return this.uploadFile.getName();
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}


	
	public List<File> getMultipleFileUpload() {
		return multipleFileUpload;
	}

	public void setMultipleFileUpload(List<File> multipleFileUpload) {
		this.multipleFileUpload = multipleFileUpload;
	}

	public List<String> getMultipleFileUploadContentType() {
		return multipleFileUploadContentType;
	}

	public void setMultipleFileUploadContentType(
			List<String> multipleFileUploadContentType) {
		this.multipleFileUploadContentType = multipleFileUploadContentType;
	}

	public List<String> getMultipleFileUploadFileName() {
		return multipleFileUploadFileName;
	}

	public void setMultipleFileUploadFileName(
			List<String> multipleFileUploadFileName) {
		this.multipleFileUploadFileName = multipleFileUploadFileName;
	}
	
}