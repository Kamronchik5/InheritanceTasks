public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setPatientName("Kamron"); // bunda faqat ism

        Surgeon patient = new Surgeon();
        patient.setPatientName("Aziz");
        patient.setSituation("Normally"); // bunda bemor ismi va holati

        EarDoctor patient2 = new EarDoctor();
        patient2.setPatientName("Akrom");
        patient2.setNumber(55); // bunda bemor ismi va qayd raqami


        // 2-task

        Electronics electronics = new Electronics();
        Computers computers = new Computers();
        computers.setType("HP Victus");
        computers.setPrice(730);

        Sounds sounds = new Sounds();
        sounds.setSoundType("High quality");
        sounds.setPrice(100);

    }
}