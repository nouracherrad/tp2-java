package org.example;


public class Main {
    public static void main(String[] args) {

        Ingénieur ingenieur = new Ingénieur("cherrad","noura" , "nouracherrad722@gmail.com",
                "0688626059" , 3500 , "dev wep"  );


        Manager mgr = new Manager("chocho" , "imane" , "imane10@gmail.com" , "0669854712", 10000 ,
                "management" );

        // infos d'ing
        System.out.println("ingénieur : Nom   "+ ingenieur.getNom() + "Prénom : " + ingenieur.getPrenom() +"Salaire : "
                + ingenieur.calculerSalaire() + "Spécialité : " + ingenieur.getSpecialite());


        // infos manager
        System.out.println("manager : Nom : " + mgr.getNom() +"prénom : " + mgr.getPrenom() +"salaire : " + mgr.calculerSalaire()
                +"service : " + mgr.getService());

    }
}
