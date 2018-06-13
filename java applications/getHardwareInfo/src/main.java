import java.io.File;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by saeedtavana on 2/27/18.
 */
public class main {
    public static void main(String[] args) {
         /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " +
                Runtime.getRuntime().availableProcessors());

    /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " +
                Runtime.getRuntime().totalMemory());

    /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
    /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

    /* Total memory currently available to the JVM */
        System.out.println("Total memory available to JVM (bytes): " +
                Runtime.getRuntime().totalMemory());

    /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

    /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + root.getTotalSpace());
            System.out.println("Free space (bytes): " + root.getFreeSpace());
            System.out.println("Usable space (bytes): " + root.getUsableSpace());
            System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));

        }
        System.out.println("---------------------");
        Properties properties = System.getProperties();
        Set<Object> keys = properties.keySet();
        for(Object key : keys){
            System.out.println(key + ": " + properties.get(key));
        }
        System.out.println("---------");
        Properties systemProps = System.getProperties();
        Set<Map.Entry<Object, Object>> sets = systemProps.entrySet();
        System.out.println("systems properties:");
        for(Map.Entry<Object,Object> entry : sets) {
            System.out.println("name: " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println("*******************************");
        System.out.println(System.getProperty("os.name"));


    }
}
