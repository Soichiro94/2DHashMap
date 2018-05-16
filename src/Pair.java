import java.util.Objects;

/**
 * Pair class.
 * used for key handling
 */
public class Pair {

    private String key1;
    private String key2;

    /**
     * Pair constructor for an object that contains both key
     * @param key1 for row
     * @param key2 for column
     */
    public Pair(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public String getKey1() {
        return key1;
    }
    
    public void setKey1(String key1) {
        this.key1 = key1;
    }
    
    public String getKey2() {
        return key2;
    }
    
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pair pair = (Pair) object;
        return Objects.equals(key1, pair.key1)
                && Objects.equals(key2, pair.key2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key1, key2);
    }
}
