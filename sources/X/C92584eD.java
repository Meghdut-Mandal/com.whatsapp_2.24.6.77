package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.HashMap;

/* renamed from: X.4eD  reason: invalid class name and case insensitive filesystem */
public final class C92584eD extends WebChromeClient {
    public final AnonymousClass6Ey A00;

    public Bitmap getDefaultVideoPoster() {
        return this.A00.A00.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        return this.A00.A00.getVideoLoadingProgressView();
    }

    public void getVisitedHistory(ValueCallback valueCallback) {
        this.A00.A00.getVisitedHistory(valueCallback);
    }

    public void onCloseWindow(WebView webView) {
        this.A00.A00.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AnonymousClass6Ey r1 = this.A00;
        if (!(r1 instanceof C98334rG)) {
            return r1.A00.onConsoleMessage(consoleMessage);
        }
        AnonymousClass00C.A0D(consoleMessage, 0);
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport;
        AnonymousClass6Ey r3 = this.A00;
        if (!(r3 instanceof C98334rG)) {
            return r3.A00.onCreateWindow(webView, z, z2, message);
        }
        C98334rG r32 = (C98334rG) r3;
        C36341k9.A1E(webView, 0, message);
        if (!z2 || !r32.A01.A04) {
            return false;
        }
        Context context = webView.getContext();
        C92624eH r2 = new C92624eH(context);
        r2.setWebViewClient(new C92634eI(context, r32));
        Object obj = message.obj;
        if (!(obj instanceof WebView.WebViewTransport) || (webViewTransport = (WebView.WebViewTransport) obj) == null) {
            return false;
        }
        webViewTransport.setWebView(r2);
        message.sendToTarget();
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.A00.A00.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.A00.A00.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onHideCustomView() {
        this.A00.A00.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.A00.A00.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequest(permissionRequest);
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequestCanceled(permissionRequest);
    }

    public void onProgressChanged(WebView webView, int i) {
        String str;
        String str2;
        if ((webView instanceof C92624eH) && i >= 20) {
            C123065vs r4 = ((C92624eH) webView).A06;
            if (r4.A02) {
                C92624eH r5 = r4.A03;
                if (r5.getSettings().getJavaScriptEnabled() && (str = r4.A00) != null && !r4.A01) {
                    HashMap hashMap = r4.A04;
                    boolean containsKey = hashMap.containsKey(str);
                    String str3 = r4.A00;
                    if (!containsKey) {
                        C131056No r1 = new C131056No(str3);
                        str2 = r1.A01;
                        hashMap.put(r4.A00, r1);
                    } else {
                        C131056No r0 = (C131056No) hashMap.get(str3);
                        if (r0 != null) {
                            str2 = r0.A01;
                        } else {
                            str2 = "";
                        }
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("javascript:var __fbAndroidBridgeAuthToken = '");
                    A0u.append(str2);
                    r5.A04(AnonymousClass000.A0q("';window.dispatchEvent(new Event('__fbAndroidBridgeAuthTokenInjected'));", A0u));
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass6Ey r12 = this.A00;
        if (r12 instanceof C98334rG) {
            C98334rG r13 = (C98334rG) r12;
            ProgressBar progressBar = r13.A00;
            if (progressBar != null) {
                boolean z = r13.A01.A03;
                int i2 = 0;
                if (!z || i == 100) {
                    i2 = 8;
                }
                progressBar.setVisibility(i2);
                progressBar.setProgress(i);
                return;
            }
            return;
        }
        r12.A00.onProgressChanged(webView, i);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.A00.A00.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        AnonymousClass6Ey r1 = this.A00;
        if (r1 instanceof C98334rG) {
            C36321k7.A0w(webView, str);
            C160997lv r12 = ((C98334rG) r1).A02;
            r12.Bx6(webView.getUrl());
            if (!AnonymousClass14B.A0F(str) && !"about:blank".equals(str)) {
                r12.Bx5(str);
                return;
            }
            return;
        }
        r1.A00.onReceivedTitle(webView, str);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.A00.A00.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onRequestFocus(WebView webView) {
        this.A00.A00.onRequestFocus(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.A00.A00.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AnonymousClass6Ey r1 = this.A00;
        if (!(r1 instanceof C98334rG)) {
            return r1.A00.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        C36321k7.A0x(valueCallback, fileChooserParams);
        return ((C98334rG) r1).A02.Bgd(valueCallback, fileChooserParams);
    }

    public C92584eD(AnonymousClass6Ey r1) {
        this.A00 = r1;
    }
}
