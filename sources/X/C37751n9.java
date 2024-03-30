package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;
import com.whatsapp.support.faq.FaqItemActivity;

/* renamed from: X.1n9  reason: invalid class name and case insensitive filesystem */
public class C37751n9 extends WebViewClient {
    public final /* synthetic */ FaqItemActivity A00;

    public C37751n9(FaqItemActivity faqItemActivity) {
        this.A00 = faqItemActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        AnonymousClass3GU r0 = this.A00.A05;
        if (r0 != null) {
            r0.A01();
        }
    }

    private boolean A00(Uri uri) {
        if (uri.toString().startsWith("tel:")) {
            this.A00.startActivity(new Intent("android.intent.action.DIAL", uri));
            return true;
        }
        FaqItemActivity faqItemActivity = this.A00;
        if (!"ombudsman".equals(uri.getHost())) {
            return false;
        }
        if (faqItemActivity.A0D.A0E(2341)) {
            Class BA5 = faqItemActivity.A04.A05().BA5();
            if (BA5 == null) {
                return true;
            }
            faqItemActivity.startActivity(C36441kJ.A0H(faqItemActivity, BA5));
            return true;
        }
        C39001qm A002 = AnonymousClass3LW.A00(faqItemActivity);
        A002.A0c(R.string.f12nameremoved);
        C39001qm.A04(faqItemActivity, A002);
        A002.A0b();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webResourceRequest.getUrl());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(Uri.parse(str));
    }
}
