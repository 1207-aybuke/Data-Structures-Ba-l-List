package bilgisayarNesne;

public class computer {

	int GHZ;
	int RAM;
	int HDD;
	
	public computer(int GHZ, int RAM, int HDD) {
		this.GHZ=GHZ;
		this.RAM=RAM;
		this.HDD=HDD;
	}

	@Override
	public String toString() {
		return "computer [GHZ=" + GHZ + ", RAM=" + RAM + ", HDD=" + HDD + "]";
	}

	
	
	
}
