public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        Ingredients ingredient1 = new Ingredients();
        ingredient1.gramsOfSugar = 100;
        ingredient1.millilitersOfWater = 300;
        ingredient1.friut = "Strawberry";
        drink1.ingredients = ingredient1;

        Glass glass1 = new Glass();
        glass1.type ="Hurricane";
        glass1.volume = 400;
        drink1.glass = glass1;



    }
}
