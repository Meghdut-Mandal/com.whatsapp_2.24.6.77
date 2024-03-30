package X;

import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: X.7qk  reason: invalid class name and case insensitive filesystem */
public class C163777qk implements Callable {
    public int A00;
    public Object A01;
    public final int A02;

    public C163777qk(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        if (this.A02 != 0) {
            C1493370u r2 = (C1493370u) this.A01;
            int i3 = this.A00;
            if (!r2.A0G.get()) {
                i2 = -6;
            } else {
                r2.A0E.setScaleType(i3);
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
        C141356n6 r1 = (C141356n6) this.A01;
        Process.setThreadPriority(this.A00);
        AnonymousClass79Y r22 = r1.A04;
        if (r22.mEnableThreadLockSync) {
            r22.lock();
        }
        while (true) {
            try {
                if (!r1.A0K && !Thread.currentThread().isInterrupted()) {
                    if (r22.mEnableThreadLockSync && r1.A0L) {
                        break;
                    }
                    C141206mq B5H = r1.A0I.B5H((long) r1.A0E);
                    if (B5H != null) {
                        if (B5H.B95() != null) {
                            int A022 = r1.A0H.A02(B5H.B95());
                            long A03 = r1.A0H.A03() - 0;
                            if (A022 <= 0) {
                                B5H.BqJ(0, 0, 0, 4);
                                r1.A0I.Bmi(B5H);
                                break;
                            }
                            C114965i7 r0 = r1.A0H.A05;
                            if (r0 != null) {
                                i = r0.A00.getSampleFlags();
                            } else {
                                i = -1;
                            }
                            B5H.BqJ(0, A022, A03, i);
                            r1.A0I.Bmi(B5H);
                            r1.A0H.A08();
                        } else {
                            C109605Yf.A00("VideoDemuxDecodeWrapperTag", "extractVideoFrame: byteBuffer cannot be null", new Object[0]);
                            throw AnonymousClass001.A09("byteBuffer cannot be null");
                        }
                    }
                } else {
                    break;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        r22.close();
        return null;
    }
}
