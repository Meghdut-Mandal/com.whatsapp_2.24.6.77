package X;

import java.util.Random;

/* renamed from: X.67b  reason: invalid class name and case insensitive filesystem */
public class C1271267b {
    public long A00;
    public C19970wo A01;
    public String A02;
    public Random A03 = new Random();
    public final C24611Dc A04 = C24611Dc.A00("PaymentFieldStats", "notification", "COMMON");

    public String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[8];
        this.A03.nextBytes(bArr);
        String A06 = C18750th.A06(bArr);
        this.A02 = A06;
        return A06;
    }

    public void A01() {
        this.A04.A06("PaymentWamEvent timer reset.");
        this.A00 = C19970wo.A00(this.A01);
    }

    public C1271267b(C19970wo r4) {
        this.A01 = r4;
    }
}
