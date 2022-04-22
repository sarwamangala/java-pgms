package  com.xworkz.railwaystationapp.dto;
public class RailwayStationDTO {
	private int stationId;
	private String stationName;
	private String town;
	private int platformNumbers;
	

	public RailwayStationDTO() {
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public int getStationId() {
		return stationId;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationName() {
		return stationName;
	}
	public void setTown(String town) {
		this.town = town;	
	}
	public String getTown() {
		return town;
	}
	public void setPlatformNumbers(int platformNumbers) {
		this.platformNumbers = platformNumbers;
	}
	public int getPlatformNumbers() {
		return platformNumbers;
	}
	@Override
	public String toString() {
		return"RailwayStationDTO-[Id="+stationId+",+StationName="+this.stationName+","+"platformNumbers="+this.platformNumbers+"]";
		
	}
	
	}
