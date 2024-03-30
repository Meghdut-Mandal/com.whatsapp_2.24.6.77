package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2V1  reason: invalid class name */
public final class AnonymousClass2V1 extends AnonymousClass66O {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        int i;
        AnonymousClass00C.A0D(map, 0);
        Iterator A0z = AnonymousClass000.A0z(map);
        if (A0z.hasNext()) {
            i = ((C132286Sy) A0z.next()).A01;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
