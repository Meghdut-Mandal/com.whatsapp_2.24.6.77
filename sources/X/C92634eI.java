package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.4eI  reason: invalid class name and case insensitive filesystem */
public final class C92634eI extends WebViewClient {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C98334rG A01;

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        AnonymousClass00C.A0D(webResourceRequest, 1);
        String A0y = C36381kD.A0y(webResourceRequest.getUrl());
        Uri A012 = C133036Wk.A01(A0y);
        AnonymousClass00C.A08(A012);
        if (webResourceRequest.isForMainFrame() && ((URLUtil.isHttpsUrl(A0y) || ((scheme = A012.getScheme()) != null && C36371kC.A1X(Boolean.valueOf(this.A01.A02.BLZ(scheme)), true))) && !this.A01.A02.BtH(A0y))) {
            this.A00.startActivity(C36391kE.A0G(C133036Wk.A01(A0y)));
        }
        return true;
    }

    public C92634eI(Context context, C98334rG r2) {
        this.A01 = r2;
        this.A00 = context;
    }
}
