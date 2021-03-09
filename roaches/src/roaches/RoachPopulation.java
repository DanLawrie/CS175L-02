package roaches;



public class RoachPopulation {
	int roaches;
	int growth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	RoachPopulation(int roaches)
	{
		this.roaches = roaches;
	}
	public void breed()
	{
		roaches = roaches*2;
	}
	public void spray(int pct)
	{
		this.roaches = roaches - (roaches * pct)/100;
		
	}
	public int getroaches()
	{
		return roaches;
	}
	
}

