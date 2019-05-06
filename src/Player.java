public class Player {

    private String playerName;
    private Grid playerGrid;
    private Grid enemyFieldGrid;

    private int playerGridStatus = 0;
    private int enemyGridStatus = 3;

    /* Grid Status Details
        Player Grid
        0: Casella Vuota
        1: Casella Nave (free)
        2: Casella Nave (hit)

        Enemy Grid
        3: Casella Vuota
        4: Casella colpita (acqua)
        5: Casella colpita (fuoco)
    */

    public Player(String playerName){
        this.playerName = playerName;
        playerGrid = new Grid(0);
        enemyFieldGrid = new Grid(3);
    }

    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public Grid getPlayerGrid() { return playerGrid; }
    // public void setPlayerGrid(Grid playerGrid) { this.playerGrid = playerGrid; }
    public Grid getEnemyFieldGrid() { return enemyFieldGrid; }
    // public void setEnemyFieldGrid(Grid enemyFieldGrid) { this.enemyFieldGrid = enemyFieldGrid; }

    public void printPlayerGrid(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(playerGrid.getGridPieceAt(i, j).getStatus());
            }
            System.out.println();
        }
    }
    public void printEnemyGrid(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(enemyFieldGrid.getGridPieceAt(i, j).getStatus());
            }
            System.out.println();
        }
    }
    public void printField(){
        System.out.println(this.playerName);
        this.printPlayerGrid();
        System.out.println("\n");
        System.out.println("Nemico");
        this.printEnemyGrid();
    }


    // TODO Metodo che modifica la griglia quando si subisce un colpo
    public boolean firedAt(int xPos, int yPos){
        return false;
    }

    public boolean hittedAt(int xPos, int yPos, boolean hit){
        return false;
    }
}
