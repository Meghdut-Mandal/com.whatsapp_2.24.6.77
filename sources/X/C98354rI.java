package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.4rI  reason: invalid class name and case insensitive filesystem */
public final class C98354rI extends AnonymousClass6Fd {
    public View A00;
    public String A01;
    public final ViewStub A02;
    public final AnonymousClass17Y A03;
    public final C160997lv A04;

    public C98354rI(ViewStub viewStub, AnonymousClass17Y r3, C160997lv r4) {
        AnonymousClass00C.A0D(viewStub, 3);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = viewStub;
    }

    public static String A00(Uri uri) {
        C121895tt r1;
        String str;
        C120255rD r4 = C113405fU.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new C121895tt();
            r1.A01 = uri.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            uri.getQuery();
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            C111705ci.A00(uri, r4);
            r1 = new C121895tt();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str;
        }
        String str2 = r1.A01;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public void A06(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i;
        String str;
        Uri url;
        CharSequence description;
        if (webResourceError != null) {
            i = webResourceError.getErrorCode();
        } else {
            i = -1;
        }
        String str2 = null;
        if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
            str = null;
        } else {
            str = description.toString();
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            str2 = url.toString();
        }
        A01(webView, i, str, str2);
    }

    public void A09(WebView webView, String str, boolean z) {
        this.A04.B5p(str);
        super.A09(webView, str, z);
    }

    public void A07(WebView webView, String str) {
        String str2;
        String title;
        super.A07(webView, str);
        C160997lv r2 = this.A04;
        r2.Ba8(false, str);
        r2.Bx6(str);
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!"about:blank".equals(str2) && webView != null && (title = webView.getTitle()) != null) {
            r2.Bx5(title);
        }
    }

    public void A08(WebView webView, String str, Bitmap bitmap) {
        super.A08(webView, str, bitmap);
        C36331k8.A0y(this.A00);
        this.A01 = str;
        this.A04.Ba8(true, str);
    }
}
