package techproed.pojos.US25AdminOgrenciEkleme;

import java.io.Serializable;

public class DeleteStudentResponsePojo implements Serializable {
	private static String message;
	private static String httpStatus;

	public DeleteStudentResponsePojo() {
	}

	public DeleteStudentResponsePojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public static String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public static String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"DeleteStudentResponsePojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}