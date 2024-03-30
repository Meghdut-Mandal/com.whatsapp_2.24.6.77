package X;

import java.util.Map;

/* renamed from: X.3uK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79813uK implements AnonymousClass4SV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C594233w A01;
    public final /* synthetic */ AnonymousClass1KH A02;

    public /* synthetic */ C79813uK(C594233w r1, AnonymousClass1KH r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void BfK(boolean z) {
        AnonymousClass1KH r6 = this.A02;
        int i = this.A00;
        C594233w r4 = this.A01;
        int A04 = C36361kB.A04(r6, r4, 0);
        Map A11 = C36391kE.A11("result", C36391kE.A11("success", Boolean.valueOf(z)));
        if (z) {
            r6.A08.Boy(new C35201iJ(r6, i, A04));
            AnonymousClass1KI r2 = r6.A09;
            r2.A00(r2.A00, 7, i);
        }
        r6.A00.Bp3(new C35651j2(r4, A11, 5));
    }
}
