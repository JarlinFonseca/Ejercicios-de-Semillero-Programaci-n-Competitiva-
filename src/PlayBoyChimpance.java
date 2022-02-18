import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class PlayBoyChimpance {
	
	
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int heightsCount=Integer.parseInt(br.readLine());
		ArrayList<Integer> listaALtura=new ArrayList<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<heightsCount;i++) {
			int h=Integer.parseInt(st.nextToken());
			if (i==0 || listaALtura.get(listaALtura.size()-1)!=h) {
				listaALtura.add(h);
			}
		}
		int [] alturas=new int [listaALtura.size()];
		Iterator<Integer> it=listaALtura.iterator();
		int lel=0;
		while (it.hasNext()) {
			alturas[lel++]=it.next();
		}	
				
		int consultas=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		for (int i=0;i<consultas;i++) {
			int valorConsulta=Integer.parseInt(st.nextToken());
			int index=buscarMayorMenor(alturas,valorConsulta);
			if (alturas[index]==valorConsulta) {
				if (index>0 && index<alturas.length-1) {
					System.out.println(alturas[index-1]+" "+alturas[index+1]);
				} else if (index==0) {
					System.out.println("X "+alturas[1]);
				} else {
					System.out.println(alturas[index-1]+" X");
				}
			} else {
				if (alturas[index]>valorConsulta) {
					index--;
				}
				if (index==0) {
					System.out.println("X "+alturas[0]);
				} else if (index==alturas.length-1) {
					System.out.println(alturas[alturas.length-1]+" X");
				} else {
					System.out.println(alturas[index]+" "+alturas[index+1]);
				}
			}
		}
	}
        public static int buscarMayorMenor(int [] valor, int t) {
		int min=0;
		int max=valor.length;
		while (min<max) {
			int mid=(min+max)/2;
			if (valor[mid]==t) {
				return mid;
			} else if (valor[mid]>t) {
				max=mid-1;
			} else {
				min=mid+1;
			}
		}
		return Math.min(valor.length-1,(min+max)/2);
	}
	
}