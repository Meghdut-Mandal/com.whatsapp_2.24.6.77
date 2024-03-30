package X;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.4eJ  reason: invalid class name and case insensitive filesystem */
public class C92644eJ extends WebViewClient {
    public final /* synthetic */ C24801Dv A00;
    public final /* synthetic */ AnonymousClass5NQ A01;

    public C92644eJ(C24801Dv r1, AnonymousClass5NQ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AnonymousClass5NQ r3 = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("webview_error_");
        AnonymousClass5NQ.A01(r3, "WebViewClient error", C36381kD.A10(A0u, webResourceError.getErrorCode()), true);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("y://error")) {
            AnonymousClass5NQ.A01(this.A01, "iFrame api script error", "iframe_api_script_error", true);
        }
        if (str.startsWith("https://")) {
            this.A00.Bp7(webView.getContext(), Uri.parse(str), (AnonymousClass3T1) null);
        }
        return true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        AnonymousClass5NQ.A01(this.A01, "WebViewClient error", AnonymousClass000.A0r("webview_error_", AnonymousClass000.A0u(), i), true);
    }
}
