import java.util.List;

public class Layer implements Mappable {
    private List<Mappable> elements;

    public Layer(List<Mappable> elements) {
        this.elements = elements;
    }

    public List<Mappable> addElement(Mappable el) {
        if(!elements.contains(el)) {
            elements.add(el);
        }

        return elements;
    }

    public void renderLayer() {
        for (Mappable el : elements) {
            el.render();
        }
    }

    @Override
    public String render() {

    }
}
