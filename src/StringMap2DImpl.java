import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * StringMap2DImpl class.
 * implementation class for the StringMap2D interface
 * used to control and manage the map
 */
public class StringMap2DImpl implements StringMap2D {

    private final Map<Pair, String> map;

    /**
     * constructor for initialize the map
     */
    public StringMap2DImpl() {
        map = new HashMap<>();
    }


    @Override
    public String put(String row, String column, String value) {
        return map.put(new Pair(row, column), value);
    }

    @Override
    public String get(String row, String column) {
        return map.get(new Pair(row, column));
    }

    @Override
    public String remove(String row, String column) {
        return map.remove(new Pair(row, column));
    }

    @Override
    public boolean contains(String row, String column) {
        return map.get(new Pair(row, column)) != null;
    }

    @Override
    public boolean contains(String value) {
        return map.containsValue(value);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Iterator<Entry> iterator() {
        return null;
    }

    @Override
    public StringMap2D flipped() {
        return null;
    }
}
