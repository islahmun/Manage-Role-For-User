package entity;

public class BasicEntity {
	
	private int resultSuccess;
	private int errorCode;
	private int validateOnly;
	private String errorMessage;
	private String redirectToPage;
	
	public BasicEntity() { }

	public String getRedirectToPage() {
		return redirectToPage;
	}
	public void setRedirectToPage(String redirectToPage) {
		this.redirectToPage = redirectToPage;
	}
	public int getResultSuccess() {
		return resultSuccess;
	}
	public void setResultSuccess(int resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getValidateOnly() {
		return validateOnly;
	}
	public void setValidateOnly(int validateOnly) {
		this.validateOnly = validateOnly;
	}
}