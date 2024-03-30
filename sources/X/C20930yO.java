package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public class C20930yO implements C20920yN {
    public final C20940yP A00 = new C20940yP();
    public final C20940yP A01 = new C20940yP();
    public final C20880yJ A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public void A00(int i) {
        C19930wk r0;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        C20880yJ r02 = this.A02;
        if (z) {
            r0 = r02.A01;
        } else {
            r0 = r02.A02;
        }
        r0.A01();
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A01(Object obj, int i, int i2) {
        C20940yP r0;
        if (i2 == 1 || i2 == 0) {
            r0 = this.A00;
        } else {
            r0 = this.A01;
        }
        r0.A00(i, obj);
    }

    public void BqE(Object obj, int i, int i2) {
        C35271iQ r6;
        C19930wk r5;
        C20880yJ r62 = this.A02;
        long j = r62.A00.A06;
        Thread currentThread = Thread.currentThread();
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (j == currentThread.getId()) {
            A01(obj, i, i2);
            return;
        }
        if (i2 == 0 || i2 == 1) {
            r5 = r62.A01;
            r6 = new C35271iQ(this, i4, obj2, i3, 3);
        } else {
            r5 = r62.A02;
            if (r5.A06 == currentThread.getId()) {
                A00(i2);
                A01(obj, i, i2);
                return;
            }
            r6 = new C35271iQ(this, i4, obj2, i3, 4);
        }
        r5.execute(r6);
    }

    public C20930yO(C20880yJ r3) {
        this.A02 = r3;
    }
}
