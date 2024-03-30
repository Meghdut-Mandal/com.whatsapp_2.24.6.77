package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Yb  reason: invalid class name and case insensitive filesystem */
public class C29811Yb {
    public final C24881Ed A00;
    public final C20310xM A01;
    public final C29801Ya A02;

    public void A00(AnonymousClass2bZ r14) {
        String str;
        C207219uk r0 = r14.A00;
        C18740tg.A06(r0);
        C207199ui r1 = r0.A01;
        if (r1 == null) {
            str = "BipRepository/updateTransaction Checkout content was null";
        } else {
            String str2 = r1.A06;
            if (str2 == null) {
                str = "BipRepository/updateTransaction transaction was null";
            } else {
                C24881Ed r6 = this.A00;
                C202319lY A0K = r6.A0K(str2);
                if (A0K == null) {
                    str = "BipRepository/updateTransaction old transaction was null";
                } else {
                    int i = A0K.A02;
                    C175708av r5 = A0K.A0A;
                    if (r5 != null) {
                        A0K.A08(new C207259uo(0, r1.A0F, r14.A1J.A01), r5);
                    }
                    r6.A0d(A0K, new C64933Qa(A0K.A0C, A0K.A0L, A0K.A0Q), i, 0, -1);
                    this.A01.A0Y(A0K);
                    return;
                }
            }
        }
        Log.i(str);
    }

    public C29811Yb(C20310xM r1, C24881Ed r2, C29801Ya r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
