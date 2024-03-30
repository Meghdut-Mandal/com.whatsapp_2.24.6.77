package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.218  reason: invalid class name */
public final class AnonymousClass218 extends AnonymousClass6Fd {
    public final /* synthetic */ C609439y A00;

    public void A07(WebView webView, String str) {
        AnonymousClass00C.A0D(str, 1);
        C609439y r1 = this.A00;
        r1.A01 = C52402pN.SUCCESS;
        super.A07(webView, str);
        C92624eH r0 = r1.A00;
        if (r0 != null) {
            r0.onPause();
            r0.removeAllViews();
            r0.destroy();
        }
        r1.A00 = null;
    }

    public AnonymousClass218(C609439y r1) {
        this.A00 = r1;
    }

    public void A06(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C609439y r1 = this.A00;
        r1.A01 = C52402pN.FAILED;
        super.A06(webView, webResourceRequest, webResourceError);
        C92624eH r0 = r1.A00;
        if (r0 != null) {
            r0.onPause();
            r0.removeAllViews();
            r0.destroy();
        }
        r1.A00 = null;
    }
}
