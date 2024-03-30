package X;

import java.util.TimerTask;

/* renamed from: X.Aca  reason: case insensitive filesystem */
public class C21904Aca extends TimerTask {
    public final /* synthetic */ C202899mr A00;

    public C21904Aca(C202899mr r1) {
        this.A00 = r1;
    }

    public void run() {
        C202899mr r3 = this.A00;
        if (!r3.A00) {
            C202899mr.A0M.remove(r3.A0H.toString());
            if (!r3.A01) {
                r3.A04.A0H(new C81133wW((Object) this, 8));
            }
            C202899mr.A01(r3, 2);
        }
    }
}
