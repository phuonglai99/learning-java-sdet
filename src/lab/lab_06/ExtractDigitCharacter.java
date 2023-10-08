package lab.lab_06;

public class ExtractDigitCharacter {
    public static String getDigitNumberFromString(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(48<=current&&57>=current) str.append(current);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String test = "12345nabc6789";
        System.out.println(getDigitNumberFromString(test));
    }
}
