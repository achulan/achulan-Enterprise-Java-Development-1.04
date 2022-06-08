public class EnterpriseJavaDevelopment104 {
    public static void main(String[] args){
        int[] numberList = {3, 4, 5, 6};
        int largest = numberList[0];
        int smallest = numberList[0];

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] > largest) {
                largest = numberList[i];
            }
        }

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] < smallest) {
                smallest = numberList[i];
            }
        }

        int dif = difLargestSmallest (largest, smallest);

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
        System.out.println("The difference between the largest and the smallest number is " + dif);
    }

    public static int difLargestSmallest (int largest, int smallest){
        return largest - smallest;
    }
}
