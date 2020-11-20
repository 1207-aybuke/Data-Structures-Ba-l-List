package bilgisayarNesne;

public class main {

	public static void main(String[] args) {
		
		computer c1 = new computer(300,450,130);
		computer c2 = new computer(500,230,140);
		computer c3 = new computer(250,620,163);
		computer c4 = new computer(120,510,500);
		computer c5 = new computer(20,200,149);
		computer c6 = new computer(300,300,860);
		
		bagliListe b = new bagliListe();
		
		b.siraliEkle(c1);
		b.printReverse();
		b.siraliEkle(c2);
		b.printReverse();
		b.siraliEkle(c3);
		b.printReverse();
		b.siraliEkle(c4);
		b.printReverse();
		b.siraliEkle(c5);
		b.printReverse();
		b.siraliEkle(c6);
		b.printReverse();
		
		
	

	}

}
