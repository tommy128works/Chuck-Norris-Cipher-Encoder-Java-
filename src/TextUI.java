public class TextUI {




    public TextUI() {

    }

    public void printWithSpaces(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c + " ");
        }
    }

    public void printToBinary(String text) {
        System.out.println("The result:");
        for (char c : text.toCharArray()) {
            System.out.print(c + " = ");
            String binary = Integer.toBinaryString(c);
            String paddedBinary = String.format("%7s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }
    }

    public void printToChuckNorris(String text) {
        System.out.println("The result:");
        for (char c : text.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            String paddedBinary = String.format("%7s", binary).replace(' ', '0');

            // loop for whole string
            while (!paddedBinary.isEmpty()) {
                char sequenceChar = paddedBinary.charAt(0);
                int sequenceLength = 1;

                for (int i = 1; i < paddedBinary.length(); i++) {
                    if (paddedBinary.charAt(i) == paddedBinary.charAt(i - 1)) {
                        sequenceLength++;
                    } else {
                        break;
                    }
                }

                paddedBinary = paddedBinary.substring(1);

                // loop for char sequence
                while (!paddedBinary.isEmpty()) {


                }

            }

        }
    }

}
