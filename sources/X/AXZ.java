package X;

import java.util.Comparator;
import java.util.Map;

public final /* synthetic */ class AXZ implements Comparator {
    public static final /* synthetic */ AXZ A00 = new AXZ();

    public final int compare(Object obj, Object obj2) {
        C21663AUf aUf = (C21663AUf) ((Map.Entry) obj2).getValue();
        C21663AUf aUf2 = (C21663AUf) ((Map.Entry) obj).getValue();
        if (aUf2 == aUf) {
            return 0;
        }
        long j = (long) (aUf.A00 - aUf2.A00);
        if (j == 0) {
            j = aUf.A01 - aUf2.A01;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }
}
