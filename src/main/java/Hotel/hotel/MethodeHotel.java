package Hotel.hotel;

public class MethodeHotel {
	public int nbr_chombre_reserver(int[] t) {
		int som=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==1)
				som++;
			
		}
		
		
		
		
		return som;
	}
	public int nbr_chombre_libre(int[] t) {
		int som=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==0)
				som++;
			
		}
		
		
		
		
		return som;
	}

	public int pre_chambre_libre(int[] t) {
		int p=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==0) {
				p=i;
				break;
			}
			
		}
		
		
		
		
		return p;
	}
	
	public int der_chambre_libre(int[] t) {
		int p=0;
		
		for (int i =t.length;i>0;i--) {
			if(t[i]==0) {
				p=i;
				break;
			}
			
		}
		
		return p;
	}
	public void res_chambre(int[] t,int pos) {
		t[pos]=1;
	}
	public void lib_chambre(int[] t,int pos) {
		t[pos]=0;
	}
}
