//WAJP remove the duplicates from the givenstring

class RemoveDupliacte {
    public static void main(String[] args) {
        String s = "java is a programming language";
        char[] ch = s.toCharArray();

        // Create a boolean array to track characters that have been encountered
        boolean[] encountered = new boolean[256]; // ASCII size (assuming standard ASCII)
        
        // Loop through each character in the string
        for (int i = 0; i < ch.length; i++) {
            // If the character is a space, skip it
            if (ch[i] == ' ') {
                continue;
            }

            // If the character has already been encountered, skip it
            if (encountered[ch[i]]) {
                continue;
            }

            // Mark the character as encountered
            encountered[ch[i]] = true;

            // Print the character
            System.out.print(ch[i]);
        }
    }
}