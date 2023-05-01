package chapter9;

public class Location {
    public int ROW;
    public int COL;
    public double MAXVALUE;

    public Location(int row, int col, double maxValue){
        this.ROW=row;
        this.COL=col;
        this.MAXVALUE = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        int row = 0;
        int col = 0;
        double maxValue = a[row][col];

        //iterating through 2D array
        for(int i=0;i<a.length;i++){
            for (int j=0; j<a[i].length;j++){
                if (a[i][j]>maxValue){
                    maxValue =  a[i][j];
                    row = i;
                    col = j;

                }
            }
        }
        return new Location(row, col, maxValue);
    }

}
