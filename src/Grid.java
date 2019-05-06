public class Grid {

    private static final int rows = 10;
    private static final int cols = 10;

    private GridPiece[][] gameGrid;

    public Grid(int initialGridStatus){
        this.gameGrid = new GridPiece[10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                GridPiece gp = new GridPiece(i, j, initialGridStatus);
                gameGrid[i][j] = gp;
            }
        }
    }


    public GridPiece getGridPieceAt(int xPos, int yPos){
        return this.gameGrid[xPos][yPos];
    }

    public boolean setGridPieceAt(int xPos, int yPos, byte status){
        if (this.gameGrid[xPos][yPos].getStatus() == status) return false;
        else{
            this.gameGrid[xPos][yPos].setStatus(status);
            return true;
        }
    }

    public boolean[] getLegalPositionsForShip(int origXPos, int origYPos, int shipLenght) throws Exception{

        boolean[] legalPositions = new boolean[]{false, false, false, false};

        if (origXPos > 9 || origYPos > 9) throw new Exception("Origin pointers are out of bounds.");
        else{
            if (shipLenght < 2 || shipLenght > 5) throw new Exception("Ship dimension is out of range.");
            else{
                if (origXPos + shipLenght < 10){
                    // System.out.println("Ship origin to right");
                    legalPositions[1] = true;
                }
                if (origXPos - shipLenght >= 0) {
                    // System.out.println("Ship origin to left");
                    legalPositions[3] = true;
                }
                if (origYPos + shipLenght < 10){
                    // System.out.println("Ship origin to bottom");
                    legalPositions[2] = true;
                }
                if (origYPos - shipLenght >= 0){
                    // System.out.println("Ship origin to top");
                    legalPositions[0] = true;
                }
            }
        }
        return legalPositions;
    }

    public void placeShipAtCoords(int origXPos, int origYPos, int shipLenght, int placeDirection){ }
}