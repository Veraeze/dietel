package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FetchTest {
    @Test
    public void canExtractDataFromColumn(){
        Fetch fetchData = new Fetch();
        int [][] dataset = {
                {4,2,4,1},
                {6,8,3,6},
                {2,6,8,2},
                {5,8,2,6}
        };
        int column = 2;
        int start = 2;
        int end = 4;

        int[] result = fetchData.extractByColumn(dataset, column, start, end);

        assertEquals(8, result[0]);
        assertEquals(6, result[1]);
        assertEquals(8, result[2]);
        assertEquals(3, result.length);

    }

}