package org.example;

public class Main {
    public static void main(String[] args) {
      Adherent adherent=new Adherent("adam","figaoui","ahfig@gamil.com","0688521478",25,16);
      Auteur auteur=new Auteur("almohandis","majed","majeed@gmail.com","0789652314",56,12);
      Livre livre =new Livre(12236541,"l'art moderne", auteur);
        System.out.println("Infos de l'adhérent :");
        adherent.afficher();
        System.out.println("Infos du livre :");
        livre.afficher();

    }
}