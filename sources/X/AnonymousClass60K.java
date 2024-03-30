package X;

import java.util.Map;

/* renamed from: X.60K  reason: invalid class name */
public class AnonymousClass60K {
    public final Map A00 = AnonymousClass001.A0J();

    public void A00() {
        C114935i4 r0;
        String obj = C90524aI.A0i("LiteOverlayRenderer").toString();
        Map map = this.A00;
        if (!map.containsKey(obj)) {
            r0 = new C114935i4();
            map.put(obj, r0);
        } else {
            r0 = (C114935i4) map.get(obj);
            if (r0 == null) {
                return;
            }
        }
        r0.A00++;
    }
}
