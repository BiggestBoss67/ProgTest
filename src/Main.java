import java.util.Scanner;
void main() {
    String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");


    System.out.printf("%-20s %-15s %-15s %-15s%n", " ", "PS5", "XBOX", "SWITCH");
    for (int i = 0; i < cities.length; i++) {
        System.out.printf("%-20s %-15d %-15d %-15d%n",
                cities[i],
                sales[i][0],
                sales[1][1],
                sales[i][2]);

    }
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");

    for (int i = 0; i < sales.length; i++) {
        int cityTotal = 0;
        for (int j = 0; j < sales.length; j++)
            cityTotal += sales[i][j];
        System.out.printf("%-20s %d%n", cities[i], cityTotal);

        int maxSales = 0;
        String topCity;

        if (cityTotal > maxSales) {
            maxSales = cityTotal;
            topCity = cities[i];
        }

    }
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("CITY WITH THE MOST SALES: %s%n", topCity);
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
}