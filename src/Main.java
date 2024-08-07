public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44.47812, -110.5677"),
                new Park("Grand Canyon", "33.47312, -112.55557"),
                new Park("Yosemite", "24.44212, -120.11117"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.123, -92.3123", "26.1231, -88.2133"),
                new River("Missouri", "44.123, -111.3123", "34.1231, -88.2133"),
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(new River("Colorado", "50.123, 44.123123", "31.4544, -73.12312"));

        riverLayer.renderLayer();
    }
}
