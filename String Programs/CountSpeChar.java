//WAJP to count the the no. of vowels, consonant, digit , special characters.

class CountSpeChar{
    public static void main(String[] args) {
        String s = "ab12c@4d8#";
        s = s.toUpperCase(); // Convert to uppercase for uniform vowel checking

        int vowelCount = 0, digitCount = 0, consonantCount = 0, specialCharCount = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if(ch>='A'&& ch<='Z')
            {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                {
                   vowelCount++;
                } 
                else
                {
                   consonantCount++;
                }
            }
            else if(ch >= '0' && ch <= '9') 
            {
                digitCount++;
            } 
            else 
            {
                specialCharCount++;
            }
        }

        System.out.println("The count of Vowels is: " + vowelCount);
        System.out.println("The count of Digits is: " + digitCount);
        System.out.println("The count of Consonants is: " + consonantCount);
        System.out.println("The count of Special Characters is: " + specialCharCount);
    }
}