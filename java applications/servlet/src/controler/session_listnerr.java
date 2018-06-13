package controler;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by saeedtavana on 6/8/17.
 */
public class session_listnerr implements HttpSessionListener {
    private static long online;

    public static long getVisited() {
        return visited;
    }

    public static void setVisited(long visited) {
        session_listnerr.visited = visited;
    }

    public static long getOnline() {
        return online;
    }

    public static void setOnline(long online) {
        session_listnerr.online = online;
    }

    private static long visited;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        online++;
        visited++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        online--;
    }
}
