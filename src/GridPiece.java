public class GridPiece {
    private int xPos;
    private int yPos;
    private int status;

    public GridPiece(int xPos, int yPos, int status){
        this.xPos = xPos;
        this.yPos = yPos;
        this.status = status;
    }

    public int getXPos() {
        return xPos;
    }
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }
    public void setPPos(int yPos) {
        this.yPos = yPos;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "x-> " + this.xPos + " - " + "y-> " + this.yPos + " " + "Status: " + this.getStatus();
    }
}