package array;

public class Fetch {
    public int[] extractByRow(int[][] dataset,int row, int start, int finish ){
        int [] rowData = dataset[row - 1];
        int[] extractedData = new  int[(finish-start) + 1];
        int count = 0;
        for (int rows = start - 1; rows < finish; rows++){
            extractedData[count] = rowData[rows];
            count++;

        }
        return extractedData;
    }

    public int[] extractByColumn(int[][] dataset,int column, int start, int finish) {
        int[] columnData = dataset[column - 1];
        int[] extractedData = new int[(finish - start) + 1];
        int track = 0;
        for (int count = start - 1; count < finish; count++){
            extractedData[track] = columnData[count];
            track++;
        }
        return extractedData;
    }
}
