package X;

import android.util.Log;
import java.util.Queue;

/* renamed from: X.61h  reason: invalid class name and case insensitive filesystem */
public class C1257961h {
    public boolean A00 = true;
    public final Queue A01 = C90524aI.A0l();

    public void A00(Runnable runnable) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksCallbackQueue/run/active=");
        Log.d("Whatsapp", C36421kH.A0d(A0u, this.A00));
        if (this.A00) {
            runnable.run();
        } else {
            this.A01.add(runnable);
        }
    }
}
