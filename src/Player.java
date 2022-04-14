public class Player {
    private static String name;
    private int level;
    private static int max_level;
    private static int player_count;
    private static int count=0;

    Player(String playerName,int playerLevel){
        count++;
        this.name=playerName;
        this.level=playerLevel;
        this.player_count=count;
        for(int x=0;x<=5;x++){
            if(playerLevel>max_level){
                max_level = playerLevel;
            }
        }
    }

    public static int getMaxLevel(){
        return max_level;
    }

    public static int getPlayerCount(){
        return player_count;
    }


}
