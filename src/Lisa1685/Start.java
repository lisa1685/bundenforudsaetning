package Lisa1685;

import Lisa1685.Studerende;
import Lisa1685.DatHoldet;
import Lisa1685.MineMetoder;


public class Start {
    public static void main(String[] args) {

    MineMetoder minBog = new MineMetoder();

    //kalder på metoden fra MineMetoder, og sætter værdierne og udskriver dem.

        minBog.setSidetal(201);
        minBog.setPris(199.95);
        minBog.setGenre("Krimi");
        minBog.setTitel("Det der ikke slår os ihjel");

        System.out.println("Bogen jeg gerne vil købe hedder " + minBog.getTitel()+", det er en " + minBog.getGenre());
        System.out.println("Med " + minBog.getSidetal()+ " sider");
        System.out.println("Prisen på bogen er " + minBog.getPris());


        System.out.println("Men der er 25% rabat!!!");
        minBog.setPris(149.95);
        System.out.println("Min bog koster derfor kun " + minBog.getPris());


       // continue springer et sted over og køre op og evaluere igen.
        //break - man kan hoppe ud af et loop
        for (int sider = 1; sider < 201; sider++){
            if (sider == 20)
                continue;
            System.out.println(sider);
            if (sider == 75)
                break;
        }
       boolean brugtepenge = 149.95 <= 200;

        if (brugtepenge == true) {
            System.out.println("Jeg havde penge nok til min bog");

        }
    //if, else if statement til at finde ud af om det er a, b eller c der er størst
        int a = 9;
        int b = 54;
        int c = 87;

        if (a > b && a>c)
            System.out.println("X er størst");
        else if (b > a && b > c)
            System.out.println("Y er størst");
        else if (c > b && c > a)
            System.out.println("Z er størst");
        else
            System.out.println("intet er sandt. Alle er ens");
// et andet eksempel
        if (5>2||5<3) {
            System.out.println("Det passer at, 5 er størst");

            if (5 == 5)
                System.out.println("Det er sandt at, 5 = 5");

            else
                System.out.println("Nej fem er ikke fem");
        } else
            System.out.println("done");
/* Hvis intet af det er sandt vil der blive udskrevet en else sætning
         så hvis der f.eks. står syv i alle int variablerne vil else blive udskrevet*/

        // switch kan kun bruges med int, mere overskueligt til større sætninger.
        //Switch statement svarer til det sidste else i en if/else sætning.
        //Jeg har sat en intværdi og med switch fået den til at køre igennem en masse cases til den finder min værdi
        //og udskriver min sout der er sat til den værdi.

        int værdi = 10;

        switch (værdi){

            case 1:
                System.out.println("værdien er 1");
                break;

            case 2:
                System.out.println("værdien er 2");
                break;
            case 3:
                System.out.println("værdien er 3");
                break;
            case 4:
                System.out.println("værdien er 4");
                break;
            case 5:
                System.out.println("værdien er 5");
                break;
            case 6:
                System.out.println("værdien er 6");
                break;
            case 7:
                System.out.println("værdien er 7");
                break;
            case 8:
                System.out.println("værdien er 8");
                break;
            case 9:
                System.out.println("værdien er 9");
                break;
            case 10:
                System.out.println("værdien er 10");
                break;
        }
        }

        }


