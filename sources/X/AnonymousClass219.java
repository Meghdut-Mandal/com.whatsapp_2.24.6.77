package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.219  reason: invalid class name */
public final class AnonymousClass219 extends AnonymousClass6Fd {
    public final /* synthetic */ C74313lP A00;

    public void A07(WebView webView, String str) {
        AnonymousClass00C.A0D(str, 1);
        super.A07(webView, str);
        C74313lP r3 = this.A00;
        C006302t r1 = r3.A01;
        if (r1 != null) {
            r1.invoke(true);
        }
        r3.A01 = null;
        C92624eH r12 = r3.A00;
        if (r12 != null) {
            r12.onPause();
            r12.clearHistory();
            r12.clearCache(true);
            r12.removeAllViews();
            r12.destroy();
        }
        r3.A00 = null;
    }

    public AnonymousClass219(C74313lP r1) {
        this.A00 = r1;
    }

    public void A06(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A06(webView, webResourceRequest, webResourceError);
        C74313lP r3 = this.A00;
        C006302t r1 = r3.A01;
        if (r1 != null) {
            r1.invoke(C36381kD.A0j());
        }
        r3.A01 = null;
        C92624eH r12 = r3.A00;
        if (r12 != null) {
            r12.onPause();
            r12.clearHistory();
            r12.clearCache(true);
            r12.removeAllViews();
            r12.destroy();
        }
        r3.A00 = null;
    }
}
