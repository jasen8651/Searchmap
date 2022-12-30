package dto;

public class LibmapDTO {
	private String mart;//상호명
	private String area;//한식중식일식
	private String middlecategory;// 중분류
	private String subdivision; // 소분류
	private String dong;//동
	private String address;
	private String latitude;
	private String longitude;
	
	public LibmapDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getMart() {
		return mart;
	}

	public void setMart(String mart) {
		this.mart = mart;
	}


	public String getArea() {
		return area; //키워드
	}

	public void setArea(String area) {
		this.area = area; //키워드
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMiddlecategory() {
		return middlecategory;
	}

	public void setMiddlecategory(String middlecategory) {
		this.middlecategory = middlecategory;
	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}
	
	
}
