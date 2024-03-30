package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;

/* renamed from: X.7qr  reason: invalid class name and case insensitive filesystem */
public class C163847qr implements C158697hv {
    public Object A00;
    public final int A01;

    public C163847qr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BU1(C111855cx r4) {
        C225314u r2;
        if (this.A01 != 0) {
            Log.i("BloksCDSBottomSheetActivity - Completed async action");
            Activity activity = (Activity) this.A00;
            activity.runOnUiThread(new C1498172w(r4, activity, 32));
            return;
        }
        AnonymousClass01L r22 = (AnonymousClass01L) ((Reference) this.A00).get();
        if (r22 == null || r22.isDestroyed() || r22.isFinishing()) {
            r22 = null;
        }
        if ((r22 instanceof C225314u) && (r2 = (C225314u) r22) != null) {
            r2.Bnv();
        }
    }
}
