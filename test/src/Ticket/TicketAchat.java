package Ticket;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class TicketAchat {
    ArrayList<LigneAchat> lignes = new ArrayList<LigneAchat>();
    static int TicketNumber = 0;
    LocalDate currentDate;
    Scanner sc = new Scanner(System.in);

    public TicketAchat() {
        int n;
        System.out.print("enter the number of articles bought( <= 5) : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            this.lignes.add(new LigneAchat());
            this.lignes.get(i).Lire();
        }
        TicketNumber++;
        this.currentDate = LocalDate.now();
    }

    public float totalPrice() {
        float sum = 0;
        for (LigneAchat ligne : this.lignes) {
            sum += ligne.sommeAchat();
        }
        return sum;
    }

    public void itNumber() {
        TicketNumber = 1;
    }

    public void afficher() {
        System.out.println("date : " + currentDate);
        System.out.println("ticket number : " + TicketNumber);
        for (LigneAchat ligne : this.lignes) {
            ligne.Afficher();
            System.out.println();
        }
        System.out.println("the total is : " + this.totalPrice());
    }
}
