package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.6xM  reason: invalid class name and case insensitive filesystem */
public final class C147526xM implements AnonymousClass7hL {
    public final /* synthetic */ C123945xL A00;
    public final /* synthetic */ CountDownLatch A01;

    public C147526xM(C123945xL r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public void Ba6(Integer num) {
        this.A00.A00 = C36331k8.A0h(num);
        this.A01.countDown();
    }
}
