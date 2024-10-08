package Oct08_2024;

public class Reverse_String {
    public static void main(String[] args) {
        String name="Apurva", Reversename=" ";

        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            Reversename=ch+Reversename;
        }
        System.out.println(Reversename);

    }
}
