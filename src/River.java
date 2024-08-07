import java.util.ArrayList;
import java.util.List;

record Coordinates(double lat, double log) {}
public class River extends Line {
    private List<Coordinates> line = new ArrayList<>();

    public River(double lat, double log) {
        line.add(new Coordinates(lat, log));
    }

    public List<Coordinates> addLocations(Coordinates location) {
        if(!line.contains(location)) {
            line.add(location);
        }

        return line;
    }

    @Override
    public void render() {

    }
}
