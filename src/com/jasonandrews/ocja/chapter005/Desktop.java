public class Desktop {

	private String manufacturer;
	private String model;
	private int yearCreated = 0;

	private String videoCard;

	Desktop() {
		this.manufacturer = "unknown";
		this.model = "unknown";	
		this.videoCard = "unknown";	
	}

	Desktop(String manufacturer, String model, int yearCreated) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.yearCreated = yearCreated;
	}

	Desktop(String manufacturer, String model, int yearCreated, String videoCard) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.yearCreated = yearCreated;
		this.videoCard = videoCard;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public String getModel() {
		return this.model;
	}


}		