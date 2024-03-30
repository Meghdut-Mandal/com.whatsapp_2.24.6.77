package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.9j3  reason: invalid class name and case insensitive filesystem */
public class C201199j3 {
    public static C201199j3 A06;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Handler A04 = new Handler(Looper.getMainLooper(), new C204309pn(this));
    public final AnonymousClass9VB A05 = new AnonymousClass9VB();

    public static synchronized C201199j3 A00() {
        C201199j3 r0;
        synchronized (C201199j3.class) {
            r0 = A06;
            if (r0 == null) {
                r0 = new C201199j3();
                A06 = r0;
            }
        }
        return r0;
    }

    public static void A01(C201199j3 r4, int i, long j) {
        if (!r4.A05.A00.isEmpty()) {
            Handler handler = r4.A04;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }

    public void A02() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A01(this, 5, this.A00);
            return;
        }
        A01(this, 3, j);
        this.A01 = SystemClock.elapsedRealtime();
    }
}
