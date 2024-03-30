package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3P8  reason: invalid class name */
public class AnonymousClass3P8 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final AtomicInteger A0A;

    public AnonymousClass3P8(String str, String str2, String str3, int i, int i2) {
        this((Integer) null, str, str2, str3, (String) null, i, i2, 0, false);
    }

    public void A00() {
        this.A04 = true;
    }

    public AnonymousClass3P8(Integer num, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        this.A00 = -1;
        this.A08 = str;
        this.A01 = str2;
        this.A09 = str3;
        this.A06 = i;
        this.A04 = z;
        this.A05 = i2;
        this.A07 = num;
        this.A0A = new AtomicInteger(i3);
        this.A02 = str4;
    }
}
