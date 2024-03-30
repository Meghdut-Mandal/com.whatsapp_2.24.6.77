package X;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Qv  reason: invalid class name and case insensitive filesystem */
public abstract class C131836Qv {
    public static float A00(C134976bv r1, C134976bv r2) {
        return C90474aD.A0J(C134976bv.A03(r1), "origin").distanceTo(C90474aD.A0J(C134976bv.A03(r2), "destination"));
    }

    public static void A01(AnonymousClass6QG r7, List list) {
        if (!r7.A04()) {
            Double d = r7.A03;
            C18740tg.A06(d);
            double doubleValue = d.doubleValue();
            Double d2 = r7.A04;
            C18740tg.A06(d2);
            double doubleValue2 = d2.doubleValue();
            Location location = new Location("");
            location.setLatitude(doubleValue);
            location.setLongitude(doubleValue2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C144416s9) it.next()).B2B(location);
            }
        }
    }
}
