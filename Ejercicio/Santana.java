public class Santana {
    private String name, number, artery_pres,direction,sugar_onBlood,nuisance,
                   prescriptions, date, n_vaccine, emergency, accident, atention;
    private int event_flag;
    private double weight,height;

    public Santana(String name, String number,String artery_pres,String sugar_OnBlood, double weight, double height, String nuisance, String prescriptions) {
        event_flag = 0;
        this.name = name;
        this.number = number;
        this.artery_pres = artery_pres;
        this.sugar_onBlood = sugar_OnBlood;
        this.weight = weight;
        this.height = height;
        this.nuisance = nuisance;
        this.prescriptions = prescriptions;
    }
    public Santana(String date, String prescriptions, String nuisance) {
        event_flag = 1;
        this.date = date;
        this.prescriptions = prescriptions;
        this.nuisance = nuisance;
    }
    public Santana(String name, String date, String n_vaccine, String ) {
        event_flag = 2;
        this.name = name;
        this.date = date;
        this.n_vaccine = n_vaccine;
        this.

    }
} 