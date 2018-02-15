package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Michael";
        String surname = "Evening";
        int tel = 123456789;
        String city = "Wojkowice";
        String gornalinia = "* "+name+" "+surname;
        String dolnalinia = "* tel. "+tel+" adres: "+city;
        String gwiazdki = "**";
        String spacje = "";
        int ramka = dolnalinia.length();
        int licznik = 0;
        do {
            gwiazdki=gwiazdki+"*";
            licznik++;
        }
        while ( licznik<ramka);

        int licznik2 = 0;
        do {
            spacje = spacje + " ";
            licznik2++;
        }
        while (licznik2<dolnalinia.length()-gornalinia.length());

        System.out.println(gwiazdki);
        System.out.println(gornalinia+spacje+" *");
        System.out.println(dolnalinia+" *");
        System.out.println(gwiazdki);

    }
}
