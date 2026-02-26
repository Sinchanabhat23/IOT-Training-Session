package Strings;

public class StringBaseExample {
    public static void main(String[] args) {
        char[] letters={'R','A','M'};
        String name=new String(letters);
        System.out.println(name);
        String jumbled="Sinchana1Is1From1ISE1B1Section";
        //{"Sinchana","Is","From","ISE","B","Section"}
        String[]words=jumbled.split("1");
        System.out.println(words[5]);
        for(Object o:words)
        {
            System.out.println(o+" ");
        }
        System.out.println();
        String data="         SNPSU ISE           ";
        System.out.println(data.trim());
    }
}
