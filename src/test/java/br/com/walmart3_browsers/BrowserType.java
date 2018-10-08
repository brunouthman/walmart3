package br.com.walmart3_browsers;

public enum BrowserType {
	
	CHROME(1), FIREFOX(2), IE(3), SAFARI(4);
	
	private int browserTypeId;

	BrowserType(int navigatorTypeId) {
		this.browserTypeId = navigatorTypeId;
	}


	public int getNavigatorTypeId() {
		return this.browserTypeId;
	}
	
	

}
