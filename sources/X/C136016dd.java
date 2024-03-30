package X;

import android.webkit.ValueCallback;
import com.whatsapp.util.Log;

/* renamed from: X.6dd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136016dd implements ValueCallback {
    public static final /* synthetic */ C136016dd A00 = new C136016dd();

    public final void onReceiveValue(Object obj) {
        if (!AnonymousClass000.A1X(obj)) {
            Log.e("WebViewWrapperView/configWebView: Safe browsing is not enabled");
        }
    }
}
