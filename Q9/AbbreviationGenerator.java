//Write a program that takes your full name as input and displays the
//abbreviations of the first and middle names except the last name which is displayed
//as it is. For example, if your name is Sachin Ramesh Tendulkar, then the output
//should be S.R.Tendulkar.
package Q9;

public class AbbreviationGenerator {

    public String abbreviationGenerator(String fullName){
        fullName=fullName.trim();
        String abbreviatedName=""+fullName.charAt(0)+". ";
        int store=fullName.lastIndexOf(' ');
        store++;
        String sirName=fullName.substring(store);
        for(int i=1;i<fullName.length()-sirName.length()-1;i++){
            while (fullName.charAt(i)!=' '){
                i++;
            }
            ++i;
            if(fullName.charAt(i)!=' '&&i<fullName.length()-sirName.length()-1)
            abbreviatedName=abbreviatedName+fullName.charAt(i)+". ";
        }
        abbreviatedName=abbreviatedName+sirName;
        return abbreviatedName;
    }

    public static void main(String[] args) {
        AbbreviationGenerator a = new AbbreviationGenerator();
        System.out.println(a.abbreviationGenerator("Raj   Rajendra   Singh"));
    }
}
