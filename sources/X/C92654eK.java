package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

/* renamed from: X.4eK  reason: invalid class name and case insensitive filesystem */
public final class C92654eK extends WebViewClient {
    public boolean A00 = false;
    public final AnonymousClass6Fd A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (java.lang.Boolean.valueOf(r3) != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(android.webkit.WebView r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C92624eH
            r6 = 0
            if (r0 == 0) goto L_0x004b
            X.4eH r8 = (X.C92624eH) r8
            r0 = 1
            r7.A00 = r0
            X.67A r0 = r8.A02
            if (r10 == 0) goto L_0x0050
            r8.getContext()
            X.5S7 r1 = r0.A01(r9)
        L_0x0015:
            X.5S7 r0 = X.AnonymousClass5S7.NAVIGATE
            boolean r5 = X.C36371kC.A1W(r1, r0)
            X.6Fd r4 = r7.A01
            boolean r0 = r4 instanceof X.C98354rI
            if (r0 == 0) goto L_0x004e
            X.4rI r4 = (X.C98354rI) r4
            if (r9 == 0) goto L_0x004c
            X.7lv r0 = r4.A04
            boolean r3 = r0.BtH(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x004c
        L_0x0031:
            android.content.Context r2 = r8.getContext()
            if (r3 != 0) goto L_0x0040
            if (r2 == 0) goto L_0x0040
            X.17Y r1 = r4.A03
            r0 = 48
            X.C1498172w.A01(r1, r4, r2, r0)
        L_0x0040:
            if (r5 != 0) goto L_0x0044
            if (r3 == 0) goto L_0x004b
        L_0x0044:
            r7.A00 = r6
            if (r5 != 0) goto L_0x004a
            if (r3 == 0) goto L_0x004b
        L_0x004a:
            r6 = 1
        L_0x004b:
            return r6
        L_0x004c:
            r3 = 0
            goto L_0x0031
        L_0x004e:
            r3 = 0
            goto L_0x0040
        L_0x0050:
            X.5S7 r1 = r0.A00(r9)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92654eK.A00(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.A01.A09(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.A01.A00.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.A01.A00.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.A01.A04(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.A01.A07(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C92624eH) {
            C92624eH r3 = (C92624eH) webView;
            C123065vs r1 = r3.A06;
            if (r1.A02 && r1.A03.getSettings().getJavaScriptEnabled()) {
                r1.A01 = false;
                r1.A00 = C131056No.A00(str);
            }
            if (this.A00) {
                this.A00 = false;
            }
            this.A01.A08(r3, str, bitmap);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.A01.A00.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A06(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.A01.A00.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.A03(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.A01.A00.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        Integer num;
        int i;
        Context context;
        AnonymousClass6Fd r2 = this.A01;
        if (r2 instanceof C98354rI) {
            C98354rI r22 = (C98354rI) r2;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WaSecureWebViewClient/onReceivedSslError: SSL Error while loading the page: ");
            String str2 = null;
            if (sslError != null) {
                str = sslError.getUrl();
            } else {
                str = null;
            }
            A0u.append(C98354rI.A00(C133036Wk.A01(str)));
            A0u.append(": Code ");
            if (sslError != null) {
                num = Integer.valueOf(sslError.getPrimaryError());
            } else {
                num = null;
            }
            C36331k8.A1P(num, A0u);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            if (webView != null) {
                webView.stopLoading();
            }
            C160997lv r23 = r22.A04;
            if (!(webView == null || (context = webView.getContext()) == null)) {
                str2 = context.getString(R.string.f12nameremoved);
            }
            if (sslError != null) {
                i = sslError.getPrimaryError();
            } else {
                i = -1;
            }
            r23.Bke(str2, i);
            return;
        }
        r2.A00.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.A05(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.A01.A02(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.A01.A00.onScaleChanged(webView, f, f2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.A01.A00.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        WebResourceResponse Beu;
        AnonymousClass6Fd r1 = this.A01;
        boolean z = r1 instanceof C98354rI;
        C98354rI r12 = r1;
        if (z) {
            C98354rI r13 = (C98354rI) r1;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str = null;
            } else {
                str = url.toString();
                if (!(str == null || (Beu = r13.A04.Beu(str)) == null)) {
                    return Beu;
                }
            }
            r12 = r13;
            if (!URLUtil.isHttpsUrl(str)) {
                C36321k7.A1P("WaSecureWebViewClient/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ", str, AnonymousClass000.A0u());
                return new WebResourceResponse("application/octet-stream", C19430v1.A0B, C90524aI.A0P(C36371kC.A1Z("", AnonymousClass0S4.A05)));
            }
        }
        return r12.A00.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.A01.A00.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public C92654eK(AnonymousClass6Fd r2) {
        this.A01 = r2;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webView, webResourceRequest.getUrl().toString(), AnonymousClass000.A1P(webResourceRequest.isForMainFrame() ? 1 : 0));
    }

    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A01(webView, i, str, str2);
    }

    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(webView, str, true);
    }
}
