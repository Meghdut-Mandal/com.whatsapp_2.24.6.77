package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* renamed from: X.7rS  reason: invalid class name and case insensitive filesystem */
public class C164217rS implements Executor {
    public Object A00;
    public final int A01;

    public C164217rS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.A01) {
            case 0:
                ((Choreographer) this.A00).postFrameCallback(new C164227rT(runnable, 0));
                return;
            case 1:
                handler = ((C138956iy) this.A00).A00;
                break;
            case 2:
                Handler A002 = AnonymousClass6UV.A00();
                Object obj = ((AnonymousClass6PY) this.A00).A03;
                A002.removeCallbacksAndMessages(obj);
                A002.postAtTime(runnable, obj, 0);
                return;
            case 3:
                handler = (Handler) this.A00;
                break;
            default:
                ((C19770wU) this.A00).Boy(runnable);
                return;
        }
        handler.post(runnable);
    }
}
