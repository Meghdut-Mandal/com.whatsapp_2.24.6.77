package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.75X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass75X implements Comparator {
    public final /* synthetic */ Map A00;

    public /* synthetic */ AnonymousClass75X(Map map) {
        this.A00 = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.A00;
        C227415p r5 = (C227415p) obj;
        C227415p r6 = (C227415p) obj2;
        if (r5 == r6) {
            return 0;
        }
        return -Long.compare(C36431kI.A09(map.get(r5.A05)), C36431kI.A09(map.get(r6.A05)));
    }
}
