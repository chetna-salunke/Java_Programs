//WAJP to print the duplicate charcters from string.

class DuplicateChar{
    public static void main(String[] args) 
    {
        String s = "java is a programming language";
        char[] ch = s.toCharArray();

        // Outer loop to check each character
        for (int i = 0; i < ch.length; i++) {
            // Skip if the character is already counted or is a space
            if (ch[i] == ' ') {
                continue;
            }
            
            int count = 1; // Initialize count for each character
            
            // Inner loop to count occurrences of ch[i]
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = ' '; // Mark character as counted by replacing with space
                }
            }
            
            // If count is greater than 1, it's a duplicate
            if (count > 1) {
                System.out.println(ch[i] + " " + count);
            }
        }
    }
}

    