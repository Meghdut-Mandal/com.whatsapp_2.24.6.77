package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6sX  reason: invalid class name and case insensitive filesystem */
public class C144616sX implements C30631aW {
    public final C1272167k A00;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        C1272167k r6 = this.A00;
        ArrayList A002 = r6.A00();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            AnonymousClass7g1 r7 = (AnonymousClass7g1) it.next();
            if (((double) (((int) (System.currentTimeMillis() - r7.BIJ())) / 86400000)) > 90.0d) {
                A0I.add(r7);
            }
        }
        A002.removeAll(A0I);
        C1501874h.A01(r6.A03, r6, A002, 23);
    }

    public C144616sX(C1272167k r1) {
        this.A00 = r1;
    }
}
