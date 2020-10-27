import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class RecordSplitter {

  public static Set<String> readSetFromFile(String fileName, String splitter) throws IOException {
    File f = new File(fileName);
    BufferedReader reader = new BufferedReader(new FileReader(f));
    String line = null;
    Set<String> lids = new HashSet<>();
    if (splitter != null) {
      while ((line = reader.readLine()) != null) {
        String[] splitLine = line.split(splitter);
        lids.add(splitLine[0]);
      }
    } else {
      while ((line = reader.readLine()) != null) {
        lids.add(line);
      }
    }
    return lids;

  }
