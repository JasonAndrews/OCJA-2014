public class DesktopApp {

	public static void main(String[] args) {
		Desktop myDesktop = new Desktop();
		Desktop hisDesktop = new Desktop("Dell", "Spirin 20", 2007);
		Desktop herDesktop = new Desktop("HP", "xTreme 3", 2014, "Nvidia GTX 680");

		System.out.println(herDesktop.getManufacturer() + "  " + herDesktop.getModel());
	}

}