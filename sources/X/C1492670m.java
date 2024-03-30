package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.70m  reason: invalid class name and case insensitive filesystem */
public final class C1492670m implements C159737jq {
    public final /* synthetic */ C159737jq A00;
    public final /* synthetic */ CountDownLatch A01;

    public void BjT(C46812bi r3, String str) {
        AnonymousClass00C.A0D(str, 1);
        try {
            this.A00.BjT(r3, str);
        } finally {
            this.A01.countDown();
        }
    }

    public C1492670m(C159737jq r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public void BjS(C46812bi r3, C108145Si r4) {
        try {
            this.A00.BjS(r3, r4);
        } finally {
            this.A01.countDown();
        }
    }
}
