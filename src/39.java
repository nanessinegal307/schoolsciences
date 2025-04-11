import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);

        // Create a table with columns for ID and Value
        TableOutputFormat.outPutTable(new HadoopFileInputFormat("table", "hdfs://localhost:9000/your/hadoop/path/to/output", 16384), new HadoopTableOutputFormat(2, map));
    }
}
