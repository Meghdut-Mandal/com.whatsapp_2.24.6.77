package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

/* renamed from: X.6Fd  reason: invalid class name */
public abstract class AnonymousClass6Fd {
    public final WebViewClient A00 = new WebViewClient();

    @Deprecated
    public void A01(WebView webView, int i, String str, String str2) {
        if (this instanceof C98354rI) {
            C98354rI r4 = (C98354rI) this;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WaSecureWebViewClient/onReceivedError: Error loading the page ");
            A0u.append(C98354rI.A00(C133036Wk.A01(str2)));
            C36321k7.A1P(": ", str, A0u);
            C160997lv r2 = r4.A04;
            if (r2.BmU().A02) {
                r2.Bke(str, i);
            } else if (str2 == null || str2.equals(r4.A01)) {
                if (r4.A00 == null) {
                    View inflate = r4.A02.inflate();
                    r4.A00 = inflate;
                    C012005e.A02(inflate, R.id.webview_error_action).setOnClickListener(new C135496cn(r4, webView, 8));
                }
                View view = r4.A00;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        } else {
            this.A00.onReceivedError(webView, i, str, str2);
        }
    }

    public void A02(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        String str;
        Context context;
        if (this instanceof C98354rI) {
            C98354rI r2 = (C98354rI) this;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WaSecureWebViewClient/onSafeBrowsingHit: Unsafe page hit: ");
            String str2 = null;
            if (webView != null) {
                str = webView.getUrl();
            } else {
                str = null;
            }
            C36321k7.A1Z(A0u, C98354rI.A00(C133036Wk.A01(str)));
            C160997lv r22 = r2.A04;
            if (!(webView == null || (context = webView.getContext()) == null)) {
                str2 = context.getString(R.string.f12nameremoved);
            }
            r22.Bke(str2, i);
            return;
        }
        this.A00.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void A03(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A00.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void A04(WebView webView, String str) {
        this.A00.onPageCommitVisible(webView, str);
    }

    public boolean A05(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A00.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void A06(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void A07(WebView webView, String str) {
        this.A00.onPageFinished(webView, str);
    }

    public void A08(WebView webView, String str, Bitmap bitmap) {
        this.A00.onPageStarted(webView, str, bitmap);
    }

    public void A09(WebView webView, String str, boolean z) {
        this.A00.doUpdateVisitedHistory(webView, str, z);
    }
}
