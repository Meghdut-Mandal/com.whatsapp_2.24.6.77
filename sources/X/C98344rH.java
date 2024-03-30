package X;

import android.content.Context;
import com.whatsapp.webview.ui.WebViewWrapperView;

/* renamed from: X.4rH  reason: invalid class name and case insensitive filesystem */
public final class C98344rH extends C92624eH {
    public C160997lv A00;
    public final /* synthetic */ WebViewWrapperView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98344rH(Context context, WebViewWrapperView webViewWrapperView) {
        super(context);
        this.A01 = webViewWrapperView;
    }

    public final C160997lv getWebViewDelegate$app_productinfra_webview_webview_non_modified() {
        return this.A00;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C160997lv r0 = this.A00;
        if (r0 != null) {
            r0.Bkf(i, i2, i3, i4);
        }
    }

    public final void setWebViewDelegate$app_productinfra_webview_webview_non_modified(C160997lv r1) {
        this.A00 = r1;
    }
}
