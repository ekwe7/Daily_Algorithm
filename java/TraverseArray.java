public class TraverseArray{

public static void main(String... ekwe){
        int[] arrNumber = new int[10];
        int size = 5;
        arrNumber[0] = 5;
        arrNumber[1] = 25;
        arrNumber[2] = 55;
        arrNumber[3] = 15;
        arrNumber[4] = 35;
        
        insertAtTheBeginningOfArray(arrNumber, 66);
        
        insertAtIndex(arrNumber, size, 77, 3);
                
        traverseArray(arrNumber, size + 1);
    }

public static void traverseArray(int[] arr, int size){
        for (int count = 0; count < size; count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println();
    }

public static void insertAtBeggining(int[] arr, int size, int number){
        for (int count = size; count > 0; count--) {
            arr[count] = arr[count - 1];
        }
        arr[0] = number;
        
}

public static void insertAtTheBeginningOfArray(int[] arr, int number){
    
        try {
            int size = 0;
            for (int num : arr) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }

            if (size == arr.length) {
                System.out.println("Array is filed up already");
                return;
            }

            for (int index = size; index > 0; index--) {
                arr[index] = arr[index - 1];
            }

            arr[0] = number;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    

public static void insertAtIndex(int[] arr, int size, int number, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (size == arr.length) {
            System.out.println("Array is filed up already");
            return;
        }

        for (int count = size; count > index; count--) {
            arr[count] = arr[count - 1];
        }

        arr[index] = number;
    }




    
    
    
}

