package X;

/* renamed from: X.1Ij  reason: invalid class name and case insensitive filesystem */
public class C25971Ij {
    public final C20050ww A00;
    public final C19970wo A01;
    public final C20060wx A02;
    public final C20810yC A03;
    public final C20840yF A04;
    public final AnonymousClass1BV A05;
    public final AnonymousClass1BS A06;
    public final C21100yf A07;

    public C25971Ij(C21100yf r1, C20050ww r2, C19970wo r3, C20060wx r4, C20810yC r5, C20840yF r6, AnonymousClass1BV r7, AnonymousClass1BS r8) {
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A07 = r1;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
    }

    public static void A00(C104855Br r3, String str, boolean z) {
        C133136Wx r1 = r3.A02().A00;
        if (!r1.A03()) {
            r3.A03();
            int i = r1.A01;
            boolean z2 = true;
            if (C133136Wx.A02(i)) {
                if (i != 16) {
                    z2 = false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Transient error during downloading external mutations, status: ");
                sb.append(i);
                throw new C1032654p(z2, sb.toString());
            } else if (i != 5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to download external mutation with status: ");
                sb2.append(i);
                throw new C1032654p(true, sb2.toString());
            } else if (z) {
                throw new AnonymousClass198(58, str);
            } else {
                throw new AnonymousClass198(4, str);
            }
        }
    }
}
