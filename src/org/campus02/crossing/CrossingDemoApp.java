package org.campus02.crossing;

public class CrossingDemoApp {
    public static void main(String[] args) {


        // Wir simulieren unsere User
        Profile p = new Profile("Susi", "Sorglos",
                "susi.sorglos@gmail.com", 39,
                false, 6000) ;

        System.out.println(p.toString());

        p.changePrivacySettings(2);

        System.out.println(p.toString());

    }
}
