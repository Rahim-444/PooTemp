package Ticket;

import java.util.Scanner;

public class Article {
    private String ref;
    private float unitPrice;
    Scanner sc = new Scanner(System.in);

    public void Lire() {
        System.out.print("enter the ref of the article : ");
        this.ref = sc.nextLine();
        System.out.print("enter the until price of the article : ");
        this.unitPrice = sc.nextFloat();
    }

    public void Afficher() {
        System.out.print("the article " + this.ref + " costs : " + this.unitPrice);
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
