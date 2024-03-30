package X;

import java.util.List;

/* renamed from: X.B8f  reason: case insensitive filesystem */
public class C23171B8f implements AnonymousClass4Q6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23171B8f(AnonymousClass3T1 r1, C182688pU r2, List list, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = list;
    }

    public final void BU2(Object obj) {
        if (this.A03 != 0) {
            C182688pU r2 = (C182688pU) this.A00;
            r2.A04 = (CharSequence) obj;
            C182688pU.A03((AnonymousClass3T1) this.A01, r2, (List) this.A02);
            return;
        }
        C182688pU r4 = (C182688pU) this.A00;
        AnonymousClass3T1 r3 = (AnonymousClass3T1) this.A01;
        List list = (List) this.A02;
        AnonymousClass9K1 r6 = (AnonymousClass9K1) obj;
        if (r6 != null) {
            r4.A08(r6.A00, r6.A01, r3, list);
        }
    }
}
