package com.inherito.test.invoice;

public class Invoice {

    public static void main(String[] args) {


        Client firstClient = new Client("Jacek", "Makaruk", "Warsaw", "00-258",
                "Brzozowa"); // Constructor (client)

        Order order2 = new Order("Pomarańcze", 7, 3);                  // Constructor (order)

        Order order = new Order();                                                            // or like this
        order.setProduct("Kiwi");
        order.setCost(12);
        order.setQuantity(10);


        System.out.println(firstClient.getFirstName() + "  "+ firstClient.getSurname());              // print user data
        System.out.println(firstClient.getPostal() + " " +firstClient.getPostalNumber() + " " +firstClient.getStreat());


        int productCount = 1;
        int priceSum = 0;
        double tax = 0;

        System.out.println(productCount +  "  "+order.getProduct() + " Cena za szt.: " +order.getCost() +  " Ilość:  "
                +order.getQuantity()+ " Koszt: " + order.getPrice()+ " Podatek A: " + order.calculateTax() );

        productCount ++;
        priceSum = order.getPrice();
        tax = order.calculateTax();

        System.out.println(productCount +  "  "+order2.getProduct() + " Cena za szt.: " +order2.getCost() +  " Ilość:  "
                +order2.getQuantity()+ " Koszt: " + order2.getPrice() + " Podatek A " + order2.calculateTax());//product no 2

        productCount++;
        priceSum += order2.getPrice();
        tax += order2.calculateTax();

        System.out.print("Razem:  " + priceSum);        //Cost of all % tax
        System.out.println("   Podatek A  " + tax);
    }
}
