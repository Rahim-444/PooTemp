package Ticket;

import java.util.Scanner;

public class LigneAchat {
    private Article article;
    private int Qts;

    Scanner sc = new Scanner(System.in);

    public void Lire() {
        this.article = new Article();
        this.article.Lire();
        System.out.print("enter the Qts : ");
        this.Qts = sc.nextInt();
    }

    public float sommeAchat() {
        return this.article.getUnitPrice() * this.Qts;
    }

    public void Afficher() {
        this.article.Afficher();
        System.out.print(" Qts : " + this.Qts);
    }
}
