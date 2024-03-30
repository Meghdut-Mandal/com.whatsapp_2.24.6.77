package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6mY  reason: invalid class name and case insensitive filesystem */
public class C141026mY implements B3J {
    public final /* synthetic */ C204369pt A00;

    public void Bct(int i, boolean z, boolean z2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C204369pt r5 = this.A00;
        Handler handler = r5.A0l;
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, z ? 1 : 0, 0);
        AnonymousClass000.A1L(objArr, i, 1);
        AnonymousClass000.A1M(objArr, 2, elapsedRealtime);
        AnonymousClass000.A1N(objArr, 3, false);
        C204369pt.A09(handler.obtainMessage(9, objArr), r5);
    }

    public void Bj7(Timeline timeline, Object obj, int i) {
    }

    public C141026mY(C204369pt r1) {
        this.A00 = r1;
    }

    public void Bcl() {
        this.A00.A0o.Bcl();
    }

    public void Bcr(AnonymousClass927 r2, AnonymousClass902 r3) {
        this.A00.A0O(r2, r3);
    }

    public void Bcy(int i) {
        C204369pt r6 = this.A00;
        if (r6.A0p.improveLooping && i == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Handler handler = r6.A0l;
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1W(A0M, i);
            AnonymousClass000.A1M(A0M, 1, elapsedRealtime);
            C204369pt.A09(handler.obtainMessage(38, A0M), r6);
        }
    }

    public void Bkc(AnonymousClass902 r4, String str) {
        this.A00.A0o.Bkb(r4.name(), "UNKNOWN", str);
    }

    public void BjP(C206419tN r1, C195269Tk r2) {
    }
}
