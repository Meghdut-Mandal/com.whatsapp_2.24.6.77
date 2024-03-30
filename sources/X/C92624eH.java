package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4eH  reason: invalid class name and case insensitive filesystem */
public class C92624eH extends WebView {
    public String A00;
    public C157867eo A01;
    public AnonymousClass67A A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final C123065vs A06 = new C123065vs(this);
    public final Context A07;

    public static void A00(WebSettings webSettings) {
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A01(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public void loadUrl(String str) {
        loadUrl(str, (Map) null);
    }

    public final void setCookieStringsSecure(String str, C125245zZ r3, Collection collection) {
        setCookieStrings(str, r3, collection, (ValueCallback) null);
    }

    public final void A02(AnonymousClass6Ey r5) {
        C157867eo r3;
        if (this.A04 && (r3 = this.A01) != null) {
            r3.BoD("webview.SecureWebView", "WebChromeClient has been set already", (Throwable) null);
        }
        this.A04 = true;
        super.setWebChromeClient(new C92584eD(r5));
    }

    public final void A03(AnonymousClass6Fd r5) {
        C157867eo r3;
        if (this.A05 && (r3 = this.A01) != null) {
            r3.BoD("webview.SecureWebView", "WebViewClient has been set already", (Throwable) null);
        }
        this.A05 = true;
        super.setWebViewClient(new C92654eK(r5));
    }

    public final void setCookieStrings(String str, C125245zZ r7, Collection collection, ValueCallback valueCallback) {
        if (collection != null) {
            try {
                if (!r7.A00(C133036Wk.A01(str))) {
                    AnonymousClass6YR.A0F(this.A00, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", str);
                    return;
                }
                try {
                    CookieManager instance = CookieManager.getInstance();
                    instance.flush();
                    instance.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        if (valueCallback != null) {
                            instance.setCookie(str, A0C, valueCallback);
                        } else {
                            instance.setCookie(str, A0C);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                AnonymousClass6YR.A0E(this.A00, "Parse url run triggers the exception on url: \n%s\n", e, str);
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection collection) {
        setCookieStrings(str, C112855eZ.A00, collection, (ValueCallback) null);
    }

    public C92624eH(Context context) {
        super(context);
        C1257361b r4 = new C1257361b();
        List list = r4.A00;
        AnonymousClass68X r2 = new AnonymousClass68X();
        r2.A02("http", "https");
        C125245zZ A002 = r2.A00();
        AnonymousClass00C.A08(A002);
        list.add(A002);
        this.A02 = r4.A00();
        this.A00 = "SecureWebView";
        this.A07 = context;
        WebSettings webSettings = getSecureSettings().A00;
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowContentAccess(false);
        A00(webSettings);
        A01(webSettings);
        C140836mF r1 = new C140836mF();
        this.A03 = AnonymousClass001.A0I();
        this.A01 = r1;
        this.A05 = false;
        this.A04 = false;
    }

    public final C123065vs getSecureJsBridgeAuth() {
        return this.A06;
    }

    public C56942xP getSecureSettings() {
        return new C56942xP(getSettings());
    }

    public final AnonymousClass67A getUriHandler() {
        return this.A02;
    }

    public void A04(String str) {
        super.loadUrl(str);
    }

    public final void setReporter(C157867eo r1) {
        this.A01 = r1;
    }

    public void loadUrl(String str, Map map) {
        AnonymousClass67A r0 = this.A02;
        getContext();
        if (r0.A01(str).ordinal() == 0) {
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                getContext();
                throw AnonymousClass001.A0A("execute");
            }
            super.loadUrl(str, map);
        }
    }
}
