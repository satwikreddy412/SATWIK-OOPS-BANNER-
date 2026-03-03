public class OOPSBannerApp {

    public static void main(String[] args) {

        // Creating banner using String array
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                "*        OOPS BANNER APP        *",
                "*        UC4 - Arrays & Loops   *",
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Printing banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}