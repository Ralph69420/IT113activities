public class App {

    public static void main(String[] args) throws Exception {
        Player one = new Player("Ralph", 100);
        Player two = new Player("Jansen", 200);
        Player three = new Player("Billy", 600);

        System.out.println("Total number of Players: " + Player.getPlayerCount());
        System.out.println("Player with max level: " + Player.getMaxLevel());
    }
}
