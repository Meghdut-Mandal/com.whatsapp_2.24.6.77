package X;

import com.whatsapp.util.Log;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public abstract class C55232uI {
    public static final void A00(AnonymousClass17Y r2) {
        C81143wX A00;
        AnonymousClass00C.A0D(r2, 0);
        C225014r r1 = r2.A00;
        if (r1 != null) {
            Log.e("UnrecoverableErrorUtils/show error dialog");
            A00 = C81143wX.A00(r1, 23);
        } else {
            Log.e("UnrecoverableErrorUtils/show error toast");
            A00 = C81143wX.A00(r2, 24);
        }
        r2.Bp3(A00);
    }
}
