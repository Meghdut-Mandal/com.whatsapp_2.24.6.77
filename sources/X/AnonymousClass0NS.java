package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0NS  reason: invalid class name */
public class AnonymousClass0NS extends C226815j {
    public final /* synthetic */ AnonymousClass0NU A00;

    public AnonymousClass0NS(AnonymousClass0NU r1) {
        this.A00 = r1;
    }

    public void A0A(Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass141 r4 = (AnonymousClass141) it.next();
                AnonymousClass11F A05 = r4.A05();
                if (A05 != null) {
                    AnonymousClass0NU r2 = this.A00;
                    C63673Ky r1 = r2.A02;
                    if (A05.equals(r1.A00()) && r4.A03() != null) {
                        r1.A01(r4);
                        AnonymousClass3T1 r3 = r2.A03;
                        r3.A0t(r1);
                        AnonymousClass09F r22 = r2.A01;
                        r22.A0T.A05(r3, 38);
                        r22.A0E.unregisterObserver(this);
                    }
                }
            }
        }
    }
}
