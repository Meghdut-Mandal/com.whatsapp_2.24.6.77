package com.whatsapp.accountlinking;

import android.os.Bundle;
import android.webkit.CookieManager;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

public final class FxWaInAppBrowserActivity extends WaInAppBrowsingActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
