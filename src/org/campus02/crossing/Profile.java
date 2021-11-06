package org.campus02.crossing;

public class Profile {
    private String firstname;
    private String lastname;
    private PrivacyTypeValue<String> eMail;
    private PrivacyTypeValue<Integer> age;
    private String company;
    private boolean workContractActive;
    private PrivacyTypeValue<Double> salary;

    // 1. Schritt: Was muss definiert werden,
    // damit das Objekt gültig
    // Konstruktor => Code => Generate => Konstruktor
    public Profile(String firstname, String lastname,
                   String eMail, int age,
                   boolean workContractActive, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.eMail = new PrivacyTypeValue<String>(eMail);
        this.age = new PrivacyTypeValue<Integer>(age);
        this.workContractActive = workContractActive;
        this.salary = new PrivacyTypeValue<Double>(salary);
    }

    public void changePrivacySettings(int status) {
        salary.setStatus(status);
        age.setStatus(status);
        eMail.setStatus(status);
    }

    // Code => Generate => toString
    public String toString() {
        return "Profile{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", eMail='" + eMail + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", workContractActive=" + workContractActive +
                ", salary=" + salary.toString() +
                '}';
    }
}
