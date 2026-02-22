package studentt;

public class main {

    public static void main(String[] args) {
       Studentt s=new Studentt("Sinchana" ,21);
       System.out.println(s.getname());
       s.setname("Sinchh");
       System.out.println(s.getname());
       System.out.println(s.getage());
       s.setage(20);
       System.out.println(s.getage());
       }
    }