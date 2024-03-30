package X;

import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class AEP implements C22959AzB {
    public final /* synthetic */ C175798b4 A00;
    public final /* synthetic */ B1J A01;
    public final /* synthetic */ C195159Ss A02;

    public /* synthetic */ AEP(C175798b4 r1, B1J b1j, C195159Ss r3) {
        this.A02 = r3;
        this.A01 = b1j;
        this.A00 = r1;
    }

    public final void BVV(C175798b4 r6, C202059ky r7, ArrayList arrayList, boolean z) {
        C203869p1 r1;
        C195159Ss r0 = this.A02;
        B1J b1j = this.A01;
        C175798b4 r3 = this.A00;
        if (r7 == null) {
            AnonymousClass9YB A012 = r0.A01.A01();
            if (z) {
                r1 = new C203869p1(r3, b1j, 5);
            } else {
                r1 = new C203869p1(arrayList, b1j, 6);
            }
            A012.A04(r1, r6);
            return;
        }
        b1j.BfN(r7, (List) null);
    }
}
