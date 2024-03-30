package X;

import android.content.Context;
import android.webkit.CookieManager;
import com.whatsapp.util.Log;
import java.net.URL;

/* renamed from: X.3lP  reason: invalid class name and case insensitive filesystem */
public final class C74313lP implements C87764Qb {
    public C92624eH A00;
    public C006302t A01;
    public final URL A02;

    public void BmX(Context context, C006302t r5) {
        String str;
        try {
            this.A01 = r5;
            if (this.A00 == null) {
                if (context == null) {
                    str = "FlowsLogger/WebCachePruner.makeWebView - Activity context is cleaned up";
                } else if (!context.getPackageManager().hasSystemFeature("android.software.webview")) {
                    str = "FlowsLogger/WebCachePruner.makeWebView - WebView feature is not supported.";
                } else {
                    C92624eH r2 = new C92624eH(context);
                    this.A00 = r2;
                    r2.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                    r2.getSettings().setGeolocationEnabled(false);
                    r2.getSettings().setSupportMultipleWindows(false);
                    r2.getSettings().setSaveFormData(false);
                    r2.clearCache(true);
                    CookieManager.getInstance().setAcceptCookie(false);
                    C92624eH r0 = this.A00;
                    if (r0 != null) {
                        r0.getSecureSettings().A00.setJavaScriptEnabled(true);
                    }
                    C92624eH r1 = this.A00;
                    if (r1 != null) {
                        r1.A02(new AnonymousClass6Ey());
                    }
                    C92624eH r12 = this.A00;
                    if (r12 != null) {
                        r12.A03(new AnonymousClass219(this));
                    }
                }
                Log.e(str);
            }
            URL url = this.A02;
            AnonymousClass67A A0R = C36391kE.A0R(url.toString());
            C92624eH r13 = this.A00;
            if (r13 != null) {
                r13.A02 = A0R;
                r13.loadUrl(url.toString());
            }
        } catch (Exception e) {
            C36321k7.A1W("FlowsLogger/WebCachePruner.makeWebView - Exception while cleaning up web cache ", AnonymousClass000.A0u(), e);
        }
    }

    public C74313lP(URL url) {
        this.A02 = url;
    }
}
