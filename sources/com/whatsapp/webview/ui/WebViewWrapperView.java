package com.whatsapp.webview.ui;

import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass1QZ;
import X.C012005e;
import X.C123555wh;
import X.C136016dd;
import X.C160997lv;
import X.C18700tb;
import X.C18770tn;
import X.C18800tq;
import X.C19630wG;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C90474aD;
import X.C90984bG;
import X.C92624eH;
import X.C98334rG;
import X.C98344rH;
import X.C98354rI;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class WebViewWrapperView extends FrameLayout implements C18700tb {
    public ViewStub A00;
    public ProgressBar A01;
    public C92624eH A02;
    public AnonymousClass17Y A03;
    public C19630wG A04;
    public C123555wh A05;
    public AnonymousClass1QZ A06;
    public boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C98344rH r1;
        AnonymousClass00C.A0D(context, 1);
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0W(A0W);
            this.A03 = C36351kA.A0M(A0W);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        addView(inflate);
        View rootView = getRootView();
        AnonymousClass00C.A08(rootView);
        Resources resources = rootView.getResources();
        AnonymousClass00C.A08(resources);
        try {
            r1 = new C98344rH(new C90984bG(C36371kC.A0B(rootView), A00(resources)), this);
            r1.setId(R.id.main_webview);
            C90474aD.A0z(r1);
            C36411kG.A0O(rootView, R.id.webview_container).addView(r1, 0);
        } catch (Exception e) {
            Log.e("WebViewWrapperView/createAndInsertWebView() can't create webview", e);
            r1 = null;
        }
        this.A02 = r1;
        this.A01 = (ProgressBar) C012005e.A02(inflate, R.id.progress_bar_page_progress);
        this.A00 = (ViewStub) C36361kB.A0G(inflate, R.id.webview_error_container_stub);
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setWebViewDelegate(C160997lv r7) {
        C98344rH r0;
        AnonymousClass00C.A0D(r7, 0);
        C92624eH r4 = this.A02;
        if (r4 != null) {
            C123555wh BmU = r7.BmU();
            this.A05 = BmU;
            if (Build.VERSION.SDK_INT >= 27) {
                WebView.startSafeBrowsing(getWaContext().A00, C136016dd.A00);
            }
            r4.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            r4.getSettings().setGeolocationEnabled(false);
            r4.getSettings().setSupportMultipleWindows(false);
            r4.getSettings().setSaveFormData(false);
            CookieManager.getInstance().setAcceptCookie(false);
            if (BmU.A01) {
                r4.clearCache(true);
            }
            r4.A03(new C98354rI(this.A00, getGlobalUI(), r7));
            r4.A02(new C98334rG(this.A01, BmU, r7));
            if ((r4 instanceof C98344rH) && (r0 = (C98344rH) r4) != null) {
                r0.A00 = r7;
            }
            if (BmU.A04) {
                r4.getSettings().setSupportMultipleWindows(true);
            }
            if (BmU.A00 == 1) {
                CookieManager instance = CookieManager.getInstance();
                instance.removeAllCookies((ValueCallback) null);
                WebStorage.getInstance().deleteAllData();
                r4.getSettings().setDomStorageEnabled(true);
                instance.setAcceptCookie(true);
            }
        }
    }

    private final Resources A00(Resources resources) {
        if (!(resources instanceof C18770tn)) {
            return resources;
        }
        Resources resources2 = ((C18770tn) resources).A00;
        AnonymousClass00C.A08(resources2);
        return A00(resources2);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (1 != r1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r4 = this;
            X.5wh r0 = r4.A05
            r3 = 1
            if (r0 == 0) goto L_0x000a
            int r1 = r0.A00
            r0 = 1
            if (r3 == r1) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.removeAllCookies(r2)
            android.webkit.WebStorage r0 = android.webkit.WebStorage.getInstance()
            r0.deleteAllData()
        L_0x001c:
            X.4eH r1 = r4.A02
            if (r1 == 0) goto L_0x0031
            r1.onPause()
            java.lang.String r0 = "about:blank"
            r1.loadUrl(r0)
            r1.clearHistory()
            r1.removeAllViews()
            r1.destroyDrawingCache()
        L_0x0031:
            X.5wh r0 = r4.A05
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.A01
            if (r0 != r3) goto L_0x0040
            X.4eH r0 = r4.A02
            if (r0 == 0) goto L_0x0040
            r0.clearCache(r3)
        L_0x0040:
            X.4eH r0 = r4.A02
            if (r0 == 0) goto L_0x0047
            r0.destroy()
        L_0x0047:
            r4.A02 = r2
            super.onDetachedFromWindow()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webview.ui.WebViewWrapperView.onDetachedFromWindow():void");
    }

    public final C92624eH getWebView() {
        return this.A02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }
}
