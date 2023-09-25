public class JavaBinSearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Se encontró el elemento, devuelve su índice.
            } else if (arr[mid] < target) {
                left = mid + 1; // El objetivo está en la mitad derecha.
            } else {
                right = mid - 1; // El objetivo está en la mitad izquierda.
            }
        }

        return -1; // El objetivo no se encontró en el arreglo.
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int target = 15;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("El elemento " + target + " se encuentra en el índice " + result);
        } else {
            System.out.println("El elemento " + target + " no se encontró en el arreglo.");
        }
    }
}
