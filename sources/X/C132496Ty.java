package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.6Ty  reason: invalid class name and case insensitive filesystem */
public abstract class C132496Ty {
    public static void A00(IOnDoneCallback iOnDoneCallback, AnonymousClass7dU r7, AnonymousClass01M r8, String str) {
        AnonymousClass6HW.A00(new C1503574y(r8, iOnDoneCallback, r7, str, 0));
    }

    public static void A01(IOnDoneCallback iOnDoneCallback, AnonymousClass7dU r3, String str) {
        AnonymousClass6HW.A00(new C1502274l(iOnDoneCallback, r3, str, 1));
    }

    public static void A03(AnonymousClass7dV r3, String str) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Dispatching call ");
                A0u.append(str);
                Log.d("CarApp", AnonymousClass000.A0q(" to host", A0u));
            }
            r3.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Remote ");
            A0u2.append(str);
            throw new AnonymousClass78G(AnonymousClass000.A0q(" call failed", A0u2), e2);
        } catch (RemoteException e3) {
            Log.e("CarApp.Dispatch", AnonymousClass000.A0p("Host unresponsive when dispatching call ", str, AnonymousClass000.A0u()), e3);
        }
    }

    public static void A02(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        A03(new C136266e6(iOnDoneCallback, str, th), AnonymousClass000.A0q(" onFailure", AnonymousClass000.A0v(str)));
    }
}
