package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class AWA implements Runnable {
    public static final /* synthetic */ AWA A00 = new AWA();

    public final void run() {
        float andSet = (float) C197109b9.A05.getAndSet(0);
        float andSet2 = (float) C197109b9.A04.getAndSet(0);
        float andSet3 = (float) C197109b9.A03.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                Iterator A10 = C36371kC.A10(C197109b9.A02);
                while (A10.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A10);
                    C197109b9.A00((C192189Ga) A11.getKey(), -C90484aE.A0G(A11));
                }
            } else if (f2 > 0.98f) {
                Iterator A102 = C36371kC.A10(C197109b9.A02);
                while (A102.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A102);
                    C197109b9.A00((C192189Ga) A112.getKey(), C90484aE.A0G(A112));
                }
            }
            C197109b9.A02.clear();
        }
        ((Handler) C197109b9.A06.getValue()).postDelayed(C197109b9.A00, 2000);
    }
}
