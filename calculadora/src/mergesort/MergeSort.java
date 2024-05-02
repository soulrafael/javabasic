package mergesort;

import java.util.ArrayList;

public class MergeSort {

	/*public static void main(String[] args) {
		int vetor[]= {10,3,7,2,8,9,5};//vetor com numeros aleatorios tamanho 7
		int auxiliar;// um auxiliary
		int inicio=vetor[0];
		int fim =vetor.length;
		int meio=fim/2;
	System.out.print(meio);
	System.out.print(vetor[meio+1]);	
}
	}*/
	
	    public static void sort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Encontre o meio da lista
	            int mid = low + (high - low) / 2;

	            // Ordenação recursiva das sub-listas
	            sort(arr, low, mid);
	            sort(arr, mid + 1, high);

	            // Combinar as sub-listas ordenadas
	            merge(arr, low, mid, high);
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        // Tamanho das duas sub-listas
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        // Arrays temporários para armazenar as sub-listas
	        int[] left = new int[n1];
	        int[] right = new int[n2];

	        // Copiar dados para os arrays temporários
	        System.arraycopy(arr, low, left, 0, n1);
	        System.arraycopy(arr, mid + 1, right, 0, n2);

	        // Indices para os arrays temporários e o array principal
	        int i = 0, j = 0, k = low;

	        // Combinar as sub-listas ordenadas na lista principal
	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        // Copiar os elementos restantes (se houver)
	        while (i < n1) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
	        sort(arr, 0, arr.length - 1);

	        System.out.println("Array ordenado:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }}
	

