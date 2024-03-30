package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.70T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70T implements C25711Hj {
    public final /* synthetic */ C135106c9 A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C122725vK A02;
    public final /* synthetic */ C29951Yq A03;
    public final /* synthetic */ CountDownLatch A04;

    public /* synthetic */ AnonymousClass70T(C135106c9 r1, C146506vi r2, C122725vK r3, C29951Yq r4, CountDownLatch countDownLatch) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = countDownLatch;
    }

    public final void accept(Object obj) {
        C29951Yq r11 = this.A03;
        C146506vi r1 = this.A01;
        C135106c9 r10 = this.A00;
        C122725vK r9 = this.A02;
        CountDownLatch countDownLatch = this.A04;
        if (AnonymousClass000.A0I(obj) == 0 && r1.A04() != null) {
            C129146Fj r12 = r1.A04().A02;
            if (r12.A00() != null) {
                byte[] bArr = r12.A00().A01;
                long j = r12.A00().A00;
                String A06 = r12.A06();
                String A05 = r12.A05();
                String A032 = r12.A03();
                boolean A0E = r11.A03.A0E(1084);
                r10.A08 = bArr;
                r10.A00 = j;
                r10.A04 = A06;
                r10.A03 = A05;
                r10.A02 = A032;
                r10.A07 = A0E;
                r9.A00 = 1;
                countDownLatch.countDown();
            }
        }
        r9.A01 = 3;
        countDownLatch.countDown();
    }
}
