public class Otocenecislo {

    public static void main(String[] args) {

        int I = 1234, otoc = 0;

        while(I != 0) {
            int digit = I % 10;
            otoc = otoc * 10 + digit;
            I /= 10;
        }

        System.out.println("O: " + otoc);
    }
}