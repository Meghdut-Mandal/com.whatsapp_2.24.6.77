package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3EI  reason: invalid class name */
public class AnonymousClass3EI {
    public final /* synthetic */ List A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1E9 A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3EI(AnonymousClass1E9 r1, List list, int i, boolean z) {
        this.A02 = r1;
        this.A03 = z;
        this.A01 = i;
        this.A00 = list;
    }

    public void A00(int i) {
        AnonymousClass1E9 r5 = this.A02;
        List list = this.A00;
        if (i != -1) {
            if (i == 0 || i == 400) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    AnonymousClass1EB r2 = r5.A06;
                    r2.A01(A0C, 3);
                    r2.A02(A0C, System.currentTimeMillis());
                }
            } else if (i == 500) {
                C24451Cm r6 = r5.A07;
                Long A002 = r6.A00();
                if (A002 != null) {
                    r5.A09.BpM(r5.A0A, "ToSGatingRepository/requestRefresh", A002.longValue());
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r5.A06.A02(AnonymousClass001.A0C(it2), System.currentTimeMillis());
                }
                r6.A01();
                return;
            } else {
                return;
            }
        }
        r5.A07.A01();
    }
}
