package roaches;



public class RoachPopulation {
	int roaches;
	int growth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * sets roach initial population
	 */
	RoachPopulation(int roaches)
	{
		this.roaches = roaches;
	}
	/**
	 * breeds the roaches
	 */
	public void breed()
	{
		roaches = roaches*2;
	}
	/**
	 * finds the percent killed by spray
	 * 
	 */
	public void spray(int pct)
	{
		this.roaches = roaches - (roaches * pct)/100;
		
	}
	/**
	 * returns the roach population
	 * 
	 */
	public int getroaches()
	{
		return roaches;
	}
	
}

