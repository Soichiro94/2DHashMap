import java.util.Iterator;
import java.util.Map;


/**
 * Created by soich on 16.05.2018.
 */
public class EntryIterator implements Iterator<StringMap2D.Entry>{

    StringMap2D map;
    Iterator<StringMap2D.Entry> it;



    public EntryIterator(StringMap2D map){
        it = map.iterator();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public StringMap2D.Entry next() {
        return  it.next();
    }

    @Override
    public void remove() {

    }
}
