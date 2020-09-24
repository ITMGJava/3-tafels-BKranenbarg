public class tafelBas {
    public static void main(String[] args) {
        //string voor weegeven tafels
        //variable getal tafel
        int y = 8;

        // getallen van een tot tien in lus aanmaken
        for (int x=1; x<=10; x++) {
            String output = x + " x " + y + " = ";
                int z = x * y;
                output = output + z;
                System.out.println(output);
       }
    }
}
