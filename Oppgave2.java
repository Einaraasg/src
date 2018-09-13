import java.util.Scanner;
public class Oppgave2 {    


public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    
        System.out.print("Skriv din inntekt for året ");
        double inntekt = input.nextDouble();


        double skatt = 0;

        if (inntekt <= 164100)
            skatt = inntekt *0;
        else if (inntekt <= 230951)
            skatt = (inntekt - 164100)*0.0093;
        else if (inntekt <= 580651)
            skatt = (230950 -164101) * 0.0093 + (inntekt - 230951) * 0.0241;
        else if (inntekt <= 934051)
            skatt = (230950 -164101) * 0.0093 + (580651 - 230951) * 0.0241+ (inntekt-580651)*0.1152;
        else if (inntekt >= 934051)
            skatt = (230950 -164101) * 0.0093 + (580651 - 230951) * 0.0241+ (934051-580651)*0.1152 + (inntekt - 934051)*0.1452;

        if (inntekt <=  164100)
            System.out.println("Du betaler ikke toppskatt");
        else if (inntekt <= 230951)
            System.out.println("Du betaler trinn 1 skatt,0,93%. som blir " + skatt);
        else if (inntekt <= 580651)
            System.out.println("Du betaler trinn 2 skatt, 2.41% som blir " + skatt);
        else if (inntekt <= 934051)
            System.out.println("Du betaler trinn 3 skatt, 11.52% som blir " + skatt );
        else if (inntekt >= 934051)
            System.out.println("Du betaler trinn 4 skatt, 14	14.52% som blir " + skatt );
    }
}