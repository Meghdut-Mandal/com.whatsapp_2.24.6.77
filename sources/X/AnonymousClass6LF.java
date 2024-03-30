package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.LinkedList;

/* renamed from: X.6LF  reason: invalid class name */
public final class AnonymousClass6LF {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final LinkedList A04;
    public final AnonymousClass00T A05;

    public AnonymousClass6LF(boolean z) {
        this.A05 = C36431kI.A1I(C153857Py.A00);
        this.A04 = C90524aI.A0l();
        C164227rT r1 = new C164227rT(this, 2);
        this.A02 = r1;
        if (C132926Vv.A03()) {
            Choreographer.getInstance().postFrameCallback(r1);
        } else {
            C90524aI.A0C(this.A05).postAtTime(new C1497572q(this, 41), SystemClock.uptimeMillis());
        }
        this.A03 = new C1497572q(this, 42);
    }

    public AnonymousClass6LF() {
        this(false);
    }
}
