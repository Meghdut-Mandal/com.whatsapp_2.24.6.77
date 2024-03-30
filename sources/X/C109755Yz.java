package X;

import java.util.concurrent.Future;

/* renamed from: X.5Yz  reason: invalid class name and case insensitive filesystem */
public abstract class C109755Yz {
    public static Object A00(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    C90484aE.A0z();
                }
                throw th;
            }
        }
        if (z) {
            C90484aE.A0z();
        }
        return obj;
    }
}
