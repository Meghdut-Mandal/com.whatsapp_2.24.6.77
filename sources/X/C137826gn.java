package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6gn  reason: invalid class name and case insensitive filesystem */
public final class C137826gn implements SubcomposeSlotReusePolicy {
    public final C1268966b A00;
    public final Map A01 = C36431kI.A1G();

    public boolean B1O(Object obj, Object obj2) {
        C1268966b r0 = this.A00;
        return AnonymousClass00C.A0J(r0.A00(obj), r0.A00(obj2));
    }

    public void BHh(AnonymousClass75R r6) {
        int i;
        Map map = this.A01;
        map.clear();
        Iterator it = r6.iterator();
        while (it.hasNext()) {
            Object A002 = this.A00.A00(it.next());
            Number A0b = C90524aI.A0b(A002, map);
            if (A0b != null) {
                i = A0b.intValue();
                if (i == 7) {
                    it.remove();
                }
            } else {
                i = 0;
            }
            C36421kH.A1M(A002, map, i + 1);
        }
    }

    public C137826gn(C1268966b r2) {
        this.A00 = r2;
    }
}
