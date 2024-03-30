package X;

import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.6e6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136266e6 implements AnonymousClass7dV {
    public final /* synthetic */ IOnDoneCallback A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Throwable A02;

    public /* synthetic */ C136266e6(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        this.A00 = iOnDoneCallback;
        this.A02 = th;
        this.A01 = str;
    }

    public final Object call() {
        IOnDoneCallback iOnDoneCallback = this.A00;
        Throwable th = this.A02;
        String str = this.A01;
        try {
            iOnDoneCallback.onFailure(new C134946bs((Object) new FailureResponse(th)));
            return null;
        } catch (AnonymousClass5VC e) {
            Log.e("CarApp.Dispatch", AnonymousClass000.A0p("Serialization failure in ", str, AnonymousClass000.A0u()), e);
            return null;
        }
    }
}
