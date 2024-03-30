package X;

import java.util.Collection;

/* renamed from: X.4xK  reason: invalid class name and case insensitive filesystem */
public class C101304xK extends C101344xO {
    public final long A00;
    public final C02680Bk A01;
    public final C19700wN A02;
    public final String A03;
    public final Collection A04;

    public C101304xK(C19700wN r3, C19770wU r4, String str, Collection collection, long j) {
        this.A02 = r3;
        this.A03 = str;
        this.A04 = collection;
        this.A00 = j;
        this.A01 = C55882vL.A00(r4, 10000);
    }

    public void cancel() {
        super.cancel();
        this.A01.A03();
    }
}
