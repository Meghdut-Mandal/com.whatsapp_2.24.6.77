package X;

import java.util.Map;
import java.util.TimerTask;

/* renamed from: X.79D  reason: invalid class name */
public final class AnonymousClass79D extends TimerTask {
    public final /* synthetic */ C132676Uu A00;
    public final /* synthetic */ Map A01;

    public AnonymousClass79D(C132676Uu r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public void run() {
        C132676Uu r4 = this.A00;
        C119115pG r1 = r4.A07;
        Map map = this.A01;
        AnonymousClass00C.A0D(map, 0);
        C53372rD.A00(r1.A00, r1.A01, map, 40);
        C23114B5t b5t = r4.A02;
        if (b5t != null) {
            b5t.pause();
        }
        C132676Uu.A01(C132676Uu.A00(r4.A05, r4), r4);
    }
}
