public class EnumApp {

	enum Continent { AFRICA, ANTARCTICA, ASIA, AUSTRAILIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA }

	Continent continent;

	public static void main(String[] args) {
		EnumApp ea = new EnumApp();
		
		ea.setContinent(Continent.EUROPE);
		
		Continent myContinent = Continent.EUROPE;

		System.out.println("[II] Your country is in the continent " + ea.getContinent() + ".");	
	}

	public void setContinent(Continent selection) {
		this.continent = selection;
		System.out.println("Your country is in the continent " + this.continent + ".");
	}
	public Continent getContinent() {
		return this.continent;
	}
}