package X;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;

/* renamed from: X.1n8  reason: invalid class name and case insensitive filesystem */
public class C37741n8 extends WebViewClient {
    public final /* synthetic */ FaqItemActivityV2 A00;

    public C37741n8(FaqItemActivityV2 faqItemActivityV2) {
        this.A00 = faqItemActivityV2;
    }

    public void onPageFinished(WebView webView, String str) {
        this.A00.A00.A01();
    }
}
