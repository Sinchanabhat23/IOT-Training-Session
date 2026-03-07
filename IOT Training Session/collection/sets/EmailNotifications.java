package DSA.collection.sets;

import java.util.HashSet;
import java.util.Set;
public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("@sinchana.com");
        emailQueue.add("@Teju.com");
        emailQueue.add("@sinchana.com");
        emailQueue.add("@sinchuu.com");
        emailQueue.add("@gundii.com");
        emailQueue.add("@sinchana.com");
        System.out.println("Email to send:"+emailQueue);
        System.out.println("Unique elements:"+emailQueue.size());
    }
}
