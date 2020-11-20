package bilgisayarNesne;

public class bagliListe {

	Node first;
	Node last;
	
	public bagliListe() {
		this.first=null;
		this.last=null;
	}
	
	public void basaEkle(computer c) {
		Node n = new Node(c);
		if(this.first==null) {
			this.last=n;
		}
		else {
			this.first.prev=n;
			n.next=this.first;
		}
		this.first=n;
	}
	
	public void sonaEkle(computer c) {
		Node n =  new Node(c);
		if(this.first==null) {
			this.first=n;
		}
		else {
			n.prev=this.last;
			this.last.next=n;
		}
		this.last=n;
	}
	

	public void sonrasinaEkle(Node s, computer c) {
		Node n = new Node(c);
		if(s==null) {
			this.basaEkle(c);
		}
		else if(s==this.last) {
			this.sonaEkle(c);
		}
		else {
			s.next.prev=n;
			n.prev=s;
			n.next=s.next;
			s.next=n;
		}
	}
	
	public void siraliEkle(computer c) {
		Node n = new Node(c);
		if(this.first==null) {
			this.basaEkle(c);
		}
		else if(this.first.computer.GHZ > n.computer.GHZ) {
			this.basaEkle(c);
		}
		else if(this.first.computer.GHZ == n.computer.GHZ) {
			if(this.first.computer.RAM > n.computer.RAM) {
				this.basaEkle(c);
			}
			else if(this.first.computer.RAM == n.computer.RAM) {
				if(this.first.computer.HDD > n.computer.HDD) {
					this.basaEkle(c);
				}
			}
		}
		else {
			Node current = this.first;
			while(current.next != null && current.next.computer.GHZ > n.computer.GHZ) {
				current = current.next;
			}
			this.sonrasinaEkle(current,c);
		}
		
	}
	
		
	public void add(computer c) {
		Node n = new Node(c);
		if(this.first==null) {
			this.first=n;
		}
		else {
			if(this.first.computer.GHZ > n.computer.GHZ) {
				n.next = this.first;
				this.first=n;
			}
			else {
			Node tmp = this.first;
			while(tmp.next !=null && tmp.next.computer.GHZ < n.computer.GHZ) {
				tmp=tmp.next;
			}
			n.next=tmp.next;
			tmp.next=n;
		}
	}
	}
	
	public void printForward() {
		Node tmp = this.first;
		while(tmp != null) {
			System.out.println(tmp.computer);
			tmp=tmp.next;
		}
		System.out.println("");
	}
	
	public void printReverse() {
		Node tmp = this.last;
		while(tmp != null) {
			System.out.println(tmp.computer);
			tmp=tmp.prev;
		}
		System.out.println("");
	}


		
}
