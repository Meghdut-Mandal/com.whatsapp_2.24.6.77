package X;

import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.5bM  reason: invalid class name and case insensitive filesystem */
public abstract class C110865bM {
    public static final void A00(AnonymousClass00S r2) {
        if (Build.VERSION.SDK_INT >= 23) {
            r2.invoke();
        } else {
            Log.e("FlowsLogger/FlowsWebBridgeCallable/checkApi() -- Api check failed");
        }
    }
}
