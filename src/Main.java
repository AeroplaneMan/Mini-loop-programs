public class Main {
    public static void main(String[] args) {
        patternD();
        System.out.println();
        patternE();
    }
    public static void patternD(){
        int rows = 5;
        int count = 5;
        int count2 = 1;
        for (int i = 0; i < rows; i++) {
            for (int n = 1; n <= count; n++) {
                System.out.print(n * count2);
            }
            System.out.println();
            count2++;
            count--;
        }
    }
    public static void patternE(){
        int rows = 5;
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int n = 0; n < count; n++) {
                System.out.print(">");
            }
            System.out.print("*");
            for (int j = 0; j < count; j++) {
                System.out.print("<");
            }
            System.out.println();
            count++;
        }
    }
}