package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.9SQ  reason: invalid class name */
public final class AnonymousClass9SQ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C19970wo A05;
    public final C21010yW A06;

    public final void A00(Integer num, String str, int i, int i2, int i3) {
        C176598cN r4 = new C176598cN();
        r4.A06 = this.A01;
        r4.A00 = Integer.valueOf(i);
        r4.A09 = this.A02;
        r4.A0B = this.A00;
        r4.A0A = this.A03;
        r4.A0C = this.A04;
        r4.A0D = String.valueOf(i2);
        r4.A07 = String.valueOf(i3);
        r4.A03 = str;
        r4.A01 = AnonymousClass6JD.A0C;
        r4.A04 = "mobile";
        r4.A05 = "Android";
        r4.A08 = String.valueOf(System.currentTimeMillis());
        if (num != null) {
            int intValue = num.intValue();
            r4.A0E = String.valueOf(intValue);
            r4.A02 = String.valueOf(C14960mT.A00((double) TimeUnit.MILLISECONDS.toSeconds((long) intValue)));
        }
        this.A06.Blv(r4);
    }

    public AnonymousClass9SQ(C19970wo r1, C21010yW r2) {
        C36321k7.A0x(r2, r1);
        this.A06 = r2;
        this.A05 = r1;
    }
}
