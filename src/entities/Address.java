package entities;

public class Address {
	
	private String HouseNo;
	private String BuildingName;
	private String StreetName;
	private String Locality;
	private String Dist;
	private int Pin;
	
	
	
	public  Address() {
		HouseNo = "2-21";
		BuildingName = "RRK nilayam";
		StreetName = "Canara Nagar";
		Locality = "P & T Colony";
		Dist = "Telanagana";
		Pin = 500098;
		
	}
	
	public Address(String houseNo, String buildingName, String streetName, String locality, String dist, int pin) {
		super();
		HouseNo = houseNo;
		BuildingName = buildingName;
		StreetName = streetName;
		Locality = locality;
		Dist = dist;
		Pin = pin;
	}
	
	

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		this.HouseNo = houseNo;
	}

	public String getBuildingName() {
		return BuildingName;
	}

	public void setBuildingName(String buildingName) {
		this.BuildingName = buildingName;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		this.StreetName = streetName;
	}

	public String getLocality() {
		return Locality;
	}

	public void setLocality(String locality) {
		this.Locality = locality;
	}

	public String getDist() {
		return Dist;
	}

	public void setDist(String dist) {
		this.Dist = dist;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		this.Pin = pin;
	}

	@Override
	public String toString() {
		return "Address [HouseNo=" + HouseNo + ", BuildingName=" + BuildingName + ", StreetName=" + StreetName
				+ ", Locality=" + Locality + ", Dist=" + Dist + ", Pin=" + Pin + "]";
	}	
	
	
	
	

	
	
	
	
}
