package X;

import java.util.Map;

/* renamed from: X.3Ol  reason: invalid class name and case insensitive filesystem */
public class C64553Ol {
    public final C21010yW A00;
    public final Map A01 = AnonymousClass001.A0J();
    public final C19970wo A02;

    public static void A00(C64553Ol r2, String str, int i, boolean z) {
        C45262Qr r1 = new C45262Qr();
        r1.A02 = Integer.valueOf(i);
        r1.A04 = (Long) r2.A01.get(str);
        r1.A00 = Boolean.valueOf(z);
        r2.A00.Bly(r1);
    }

    public void A01(String str, boolean z) {
        C45262Qr r1 = new C45262Qr();
        r1.A02 = C36371kC.A0p();
        r1.A04 = (Long) this.A01.get(str);
        r1.A00 = C36371kC.A0m();
        r1.A01 = Boolean.valueOf(z);
        this.A00.Bly(r1);
    }

    public C64553Ol(C19970wo r2, C21010yW r3) {
        this.A02 = r2;
        this.A00 = r3;
    }
}
