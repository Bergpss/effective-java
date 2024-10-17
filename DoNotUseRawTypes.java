import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DoNotUseRawTypes {
    public static void main(String[] args) {
        List<Stamp> stampsTemp = new ArrayList<>();
        stampsTemp.add(new Stamp());
        Collection stamps = stampsTemp;
        stamps.add(new Coin());
        for (Iterator i = stamps.iterator(); i.hasNext();) {
            Stamp stamp = (Stamp) i.next();
        }
    }
}

class Stamp {
    private String stampName;

    public String getStampName() {
        return stampName;
    }
}

class Coin {
    private String coinName;

    public String getCoinName() {
        return coinName;
    }
}