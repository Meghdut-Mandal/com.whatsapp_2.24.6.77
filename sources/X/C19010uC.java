package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0uC  reason: invalid class name and case insensitive filesystem */
public class C19010uC implements AnonymousClass00A {
    public static AtomicReference A00 = new AtomicReference();

    public void BRo(boolean z) {
        synchronized (C18960u7.A09) {
            Iterator it = new ArrayList(C18960u7.A0A.values()).iterator();
            while (it.hasNext()) {
                C18960u7 r2 = (C18960u7) it.next();
                if (r2.A06.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = r2.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw new NullPointerException("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
