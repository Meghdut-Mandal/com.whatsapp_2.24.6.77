package X;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6By  reason: invalid class name and case insensitive filesystem */
public final class C128356By {
    public final Object A00 = C36441kJ.A11();
    public final AtomicBoolean A01 = C36431kI.A1H();
    public final AtomicInteger A02 = new AtomicInteger();
    public final ConcurrentLinkedDeque A03 = new ConcurrentLinkedDeque();

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer A00(int r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A02
            int r1 = r2.get()
            r0 = 10
            if (r1 != r0) goto L_0x0014
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A01
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001c
            r0 = 0
            return r0
        L_0x0014:
            int r0 = r1 + 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0000
        L_0x001c:
            java.util.concurrent.ConcurrentLinkedDeque r0 = r3.A03
            java.lang.Object r1 = r0.poll()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            if (r1 != 0) goto L_0x002f
            int r0 = r4 * 1500
            int r0 = r0 / 1000
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            return r0
        L_0x002f:
            int r0 = r1.capacity()
            if (r0 < r4) goto L_0x001c
            r1.clear()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128356By.A00(int):java.nio.ByteBuffer");
    }

    public final void A02(ByteBuffer byteBuffer) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.A02;
            i = atomicInteger.get();
            if (i == 0) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i - 1));
        this.A03.add(byteBuffer);
        if (i == 10) {
            Object obj = this.A00;
            synchronized (obj) {
                obj.notify();
            }
        }
    }

    public final ByteBuffer A01(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ByteBuffer A002 = A00(remaining);
        if (A002 == null) {
            while (true) {
                A002 = A00(remaining);
                if (A002 != null) {
                    break;
                }
                Object obj = this.A00;
                synchronized (obj) {
                    while (this.A02.get() == 10 && !this.A01.get()) {
                        obj.wait();
                    }
                }
            }
        }
        A002.put(byteBuffer);
        A002.flip();
        return A002;
    }
}
