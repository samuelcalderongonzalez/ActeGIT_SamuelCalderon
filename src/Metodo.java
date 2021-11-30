
public class Metodo {

	public static void main(String[] args) {
		int[] array = new int[20];
		int[] aux = new int[10];
		
		for (int i = 0; i < aux.length; i++) {
			aux[i] = 0;
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
			System.out.println(array[i]);
			if(array[i] == 1)
				aux[0]++;
			else if(array[i] == 2)
				aux[1]++;
			else if(array[i] == 3)
				aux[2]++;
			else if(array[i] == 4)
				aux[3]++;
			else if(array[i] == 5)
				aux[4]++;
			else if(array[i] == 6)
				aux[5]++;
			else if(array[i] == 7)
				aux[6]++;
			else if(array[i] == 8)
				aux[7]++;
			else if(array[i] == 9)
				aux[8]++;
			else if(array[i] == 10)
				aux[9]++;
		}

	}

}
