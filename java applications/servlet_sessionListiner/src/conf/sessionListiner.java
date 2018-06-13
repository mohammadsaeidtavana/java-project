package conf;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by saeedtavana on 7/7/17.
 */
public class sessionListiner implements HttpSessionListener {

    private  static int online;
    private  static  int visited;

    public static int getVisited() {
        return visited;
    }

    public static void setVisited(int visited) {
        sessionListiner.visited = visited;
    }

    public static int getOnline() {
        return online;
    }

    public static void setOnline(int online) {
        sessionListiner.online = online;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        System.out.println("session created");
        visited++;
        online++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session destroyed");
        online--;
    }
}
