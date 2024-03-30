package com.whatsapp.webview.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass0FM;
import X.AnonymousClass0YW;
import X.AnonymousClass1DW;
import X.AnonymousClass1RC;
import X.AnonymousClass24Z;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3T1;
import X.AnonymousClass3UF;
import X.AnonymousClass6JT;
import X.C009504a;
import X.C009904e;
import X.C100744vb;
import X.C111705ci;
import X.C113405fU;
import X.C120255rD;
import X.C121895tt;
import X.C123555wh;
import X.C133036Wk;
import X.C135476cl;
import X.C138476iA;
import X.C1498172w;
import X.C160997lv;
import X.C163367q5;
import X.C165207t3;
import X.C165397tM;
import X.C18740tg;
import X.C20380xT;
import X.C224514j;
import X.C24051Aw;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C90484aE;
import X.C91364bt;
import X.C92624eH;
import X.C99304t3;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

public class WaInAppBrowsingActivity extends AnonymousClass24Z implements C160997lv {
    public ValueCallback A00;
    public C92624eH A01;
    public C32691e2 A02;
    public AnonymousClass1DW A03;
    public C20380xT A04;
    public C24051Aw A05;
    public int A06 = 1;
    public AnonymousClass0FM A07;
    public String A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public final C009904e A0G = BnD(new C165397tM(this, 14), new C009504a());

    public void A3l(WebView webView, String str) {
    }

    public boolean A3o() {
        return true;
    }

    public /* synthetic */ void B5p(String str) {
    }

    public /* synthetic */ void Bkf(int i, int i2, int i3, int i4) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A08 = getIntent().getStringExtra("webview_callback");
        this.A0D = getIntent().getBooleanExtra("webview_open_new_tab_in_external_browser", false);
        this.A0E = getIntent().getBooleanExtra("webview_title_show_domain_only", false);
        this.A09 = getIntent().getBooleanExtra("allow_image_file_upload", false);
        this.A06 = getIntent().getIntExtra("max_images_allowed_for_upload", this.A06);
        this.A0F = getIntent().getBooleanExtra("webview_toolbar_v2", false);
        this.A0C = getIntent().getBooleanExtra("webview_should_ask_before_close", false);
        this.A0A = getIntent().getBooleanExtra("webview_can_navigate_back", false);
        this.A0B = getIntent().getBooleanExtra("webview_javascript_enabled", false);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, toolbar);
        if (A0Q != null) {
            A0Q.A0U(true);
            AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
            WaImageView waImageView = (WaImageView) findViewById(R.id.icon_lock);
            TextView A0Q2 = C36391kE.A0Q(this, R.id.website_title);
            TextView A0Q3 = C36391kE.A0Q(this, R.id.website_url);
            if (this.A0F) {
                toolbar.setOverflowIcon(AnonymousClass3UF.A02(this, R.drawable.vec_ic_more, R.color.f6nameremoved));
                waImageView.setVisibility(8);
                C36351kA.A1E(findViewById(R.id.website_info_container), this, 37);
                A0Q2.setGravity(17);
                A0Q3.setGravity(17);
                C36341k9.A0q(this, appBarLayout, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                AnonymousClass1RC.A04(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                C36371kC.A13(this, toolbar, R.drawable.wds_bottom_sheet_background);
            }
            A3m(A0Q2, A0Q3, toolbar, appBarLayout, waImageView);
        }
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) findViewById(R.id.webview_wrapper_view);
        webViewWrapperView.setWebViewDelegate(this);
        C92624eH r0 = webViewWrapperView.A02;
        this.A01 = r0;
        if (r0 == null) {
            A3n(getString(R.string.f12nameremoved), true);
            return;
        }
        r0.getSettings().setJavaScriptEnabled(this.A0B);
        if (A3o()) {
            getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        }
        A3k(this.A01);
    }

    public static String A0F(Uri uri) {
        C121895tt r1;
        String query;
        String str;
        C120255rD r4 = C113405fU.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new C121895tt();
            r1.A01 = uri.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            query = uri.getQuery();
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            query = C111705ci.A00(uri, r4);
            r1 = new C121895tt();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str;
        }
        String str2 = r1.A02;
        String str3 = r1.A00;
        String str4 = r1.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!TextUtils.isEmpty(str2)) {
            A0u.append(str2);
            A0u.append(':');
        }
        if (!TextUtils.isEmpty(str3)) {
            A0u.append("//");
            A0u.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            A0u.append(str4);
        }
        if (!TextUtils.isEmpty(query)) {
            A0u.append('?');
            A0u.append(query);
        }
        return A0u.toString();
    }

    public void A3i() {
        if (this.A0C) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            A002.A0m(this, new C165207t3(this, 15), R.string.f12nameremoved);
            A002.A0l(this, C138476iA.A00, R.string.f12nameremoved);
            C36341k9.A11(A002);
            return;
        }
        A3j(0, A07(this));
    }

    public void A3m(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        if (!this.A0F) {
            C36341k9.A0q(this, appBarLayout, C36411kG.A01(this));
        }
        C100744vb A002 = C91364bt.A00(this, this.A00, R.drawable.ic_back);
        C90484aE.A15(getResources(), A002, R.color.f6nameremoved);
        toolbar.setNavigationIcon((Drawable) A002);
        toolbar.setNavigationOnClickListener(new C135476cl(this, 36));
    }

    public void A3n(String str, boolean z) {
        if (this.A07 == null && !AnonymousClass3SJ.A04(this)) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0p(str);
            A002.A0r(false);
            A002.A0h(new C163367q5(2, this, z), R.string.f12nameremoved);
            this.A07 = A002.A0b();
        }
    }

    public void Ba8(boolean z, String str) {
        if (!z) {
            A3l(this.A01, str);
        }
    }

    public boolean Bgd(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String str;
        if (this.A09) {
            ValueCallback valueCallback2 = this.A00;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue((Object) null);
            }
            this.A00 = valueCallback;
            try {
                int i = this.A06;
                C009904e r7 = this.A0G;
                boolean A0E2 = this.A0D.A0E(7951);
                Intent A0D2 = C36431kI.A0D();
                String packageName = getPackageName();
                if (A0E2) {
                    str = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
                } else {
                    str = "com.whatsapp.gallerypicker.GalleryPicker";
                }
                A0D2.setClassName(packageName, str);
                A0D2.putExtra("max_items", i);
                A0D2.putExtra("skip_max_items_new_limit", true);
                A0D2.putExtra("preview", true);
                A0D2.putExtra("origin", 37);
                A0D2.putExtra("send", false);
                A0D2.putExtra("include_media", 1);
                A0D2.putExtra("media_sharing_user_journey_origin", 20);
                r7.A01((AnonymousClass0YW) null, A0D2);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("WaInappBrowsingActivity/onShowFileChooser: Could not launch galler picker for image upload in web view", e);
                this.A00 = null;
            }
        }
        return false;
    }

    public C123555wh BmU() {
        AnonymousClass6JT r0 = new AnonymousClass6JT();
        boolean z = this.A0D;
        C123555wh r02 = r0.A00;
        r02.A04 = z;
        return r02;
    }

    public void onBackPressed() {
        if (!this.A0A || !this.A01.canGoBack()) {
            A3i();
            return;
        }
        Bx5(getString(R.string.f12nameremoved));
        Bx6("");
        this.A01.goBack();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0F) {
            C36391kE.A1F(menu, R.id.menuitem_webview_refresh, R.string.f12nameremoved);
            C36391kE.A1F(menu, R.id.menuitem_webview_open_in_browser, R.string.f12nameremoved);
            C36391kE.A1F(menu, R.id.menuitem_webview_copy_link, R.string.f12nameremoved);
            C36391kE.A1F(menu, R.id.menuitem_webview_share_link, R.string.f12nameremoved);
            C36391kE.A1F(menu, R.id.menuitem_webview_learn_more, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public static Intent A07(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        Intent A0D2 = C36431kI.A0D();
        String stringExtra = waInAppBrowsingActivity.getIntent().getStringExtra("webview_callback");
        if (stringExtra != null) {
            A0D2.putExtra("webview_callback", stringExtra);
        }
        return A0D2;
    }

    public void A3j(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    public void A3k(WebView webView) {
        Bx5(getString(R.string.f12nameremoved));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A3p(stringExtra)) {
            return;
        }
        if (getIntent().getBooleanExtra("webview_post_on_initial_request", false)) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A01.postUrl(stringExtra, stringExtra2.getBytes());
            return;
        }
        this.A01.loadUrl(stringExtra);
    }

    public boolean A3p(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A08) || !str.contains(this.A08)) {
            return false;
        }
        Intent A0D2 = C36431kI.A0D();
        A0D2.putExtra("webview_callback", str);
        A3j(-1, A0D2);
        return true;
    }

    public void Bke(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            A3j(0, A07(this));
        } else {
            A3n(str, true);
        }
    }

    public boolean BtH(String str) {
        if (!A3p(str)) {
            if (getIntent().getBooleanExtra("webview_deeplink_enabled", false)) {
                Uri A012 = C133036Wk.A01(str);
                int A0C2 = this.A03.A0C(A012);
                if (BLZ(A012.getScheme()) || (!(A0C2 == 1 || A0C2 == 10) || ("https".equals(A012.getScheme()) && "angeloneapp.page.link".equals(A012.getHost())))) {
                    this.A02.Bp7(this.A01.getContext(), A012, (AnonymousClass3T1) null);
                }
            }
            try {
                String url = this.A01.getUrl();
                boolean booleanExtra = getIntent().getBooleanExtra("webview_avoid_external", false);
                Resources resources = getResources();
                if (URLUtil.isHttpsUrl(str)) {
                    Uri A013 = C133036Wk.A01(url);
                    Uri A014 = C133036Wk.A01(str);
                    if (A013 == null || !booleanExtra) {
                        return false;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("SecuredWebViewUtil/checkUrl: Tried to open external link when blocked: ");
                    C36321k7.A1Z(A0u, A0F(Uri.parse(str)));
                    C18740tg.A0F(A013.getHost().equals(A014.getHost()), resources.getString(R.string.f12nameremoved));
                    return false;
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("SecuredWebViewUtil/checkUrl: Tried to open non-HTTPS content on ");
                C36321k7.A1Z(A0u2, A0F(Uri.parse(str)));
                throw AnonymousClass001.A08(resources.getString(R.string.f12nameremoved));
            } catch (IllegalArgumentException | IllegalStateException e) {
                runOnUiThread(new C1498172w(this, e, 49));
                return true;
            }
        }
        return true;
    }

    public void Bx5(String str) {
        if (getSupportActionBar() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            WaTextView waTextView = (WaTextView) findViewById(R.id.website_title);
            if (!TextUtils.isEmpty(stringExtra)) {
                waTextView.setText(stringExtra);
            } else if (!TextUtils.isEmpty(str)) {
                waTextView.setText(str);
            }
            if (this.A0E) {
                C36321k7.A0M(this, waTextView, R.attr.f4nameremoved, R.color.f6nameremoved);
                waTextView.A0C();
            }
        }
    }

    public void Bx6(String str) {
        if (getSupportActionBar() != null && str != null && !"about:blank".equals(str) && !getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView A0Q = C36391kE.A0Q(this, R.id.website_url);
            WaTextView waTextView = (WaTextView) findViewById(R.id.website_title);
            if (TextUtils.isEmpty(str)) {
                C36331k8.A0r(this, waTextView, R.color.f6nameremoved);
                waTextView.A0C();
                A0Q.setVisibility(8);
                C36391kE.A1K(A0Q);
                return;
            }
            C36321k7.A0M(this, waTextView, R.attr.f4nameremoved, R.color.f6nameremoved);
            waTextView.A0A();
            Uri A012 = C133036Wk.A01(str);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A012.getScheme());
            A0u.append("://");
            A0Q.setText(AnonymousClass000.A0q(A012.getHost(), A0u));
            A0Q.setVisibility(0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C92624eH r1 = this.A01;
        if (r1 != null) {
            r1.onPause();
            r1.loadUrl("about:blank");
            r1.clearHistory();
            r1.removeAllViews();
            r1.destroyDrawingCache();
            this.A01.clearCache(true);
            this.A01.destroy();
            this.A01 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri A022;
        Intent createChooser;
        if (menuItem.getItemId() == R.id.menuitem_webview_refresh) {
            Bx5(getString(R.string.f12nameremoved));
            Bx6("");
            this.A01.reload();
        } else {
            if (menuItem.getItemId() == R.id.menuitem_webview_open_in_browser) {
                if (URLUtil.isHttpsUrl(this.A01.getUrl())) {
                    A022 = C133036Wk.A01(this.A01.getUrl());
                } else {
                    C99304t3.A00(this.A01, R.string.f12nameremoved, -1).A0P();
                }
            } else if (menuItem.getItemId() == R.id.menuitem_webview_copy_link) {
                ClipboardManager A092 = this.A08.A09();
                if (A092 != null) {
                    try {
                        A092.setPrimaryClip(ClipData.newPlainText("url", this.A01.getUrl()));
                        C99304t3.A00(this.A01, R.string.f12nameremoved, -1).A0P();
                    } catch (NullPointerException | SecurityException e) {
                        Log.e("WaInAppBrowsingActivity/onOptionsItemSelected", e);
                    }
                }
            } else if (menuItem.getItemId() == R.id.menuitem_webview_share_link) {
                Intent A0I = C36441kJ.A0I("android.intent.action.SEND");
                A0I.setType("text/plain");
                A0I.putExtra("android.intent.extra.TEXT", this.A01.getUrl());
                createChooser = Intent.createChooser(A0I, (CharSequence) null);
                startActivity(createChooser);
            } else if (menuItem.getItemId() == R.id.menuitem_webview_learn_more) {
                A022 = this.A04.A02("182446338158487");
            }
            createChooser = new Intent("android.intent.action.VIEW", A022);
            startActivity(createChooser);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public /* synthetic */ boolean BLZ(String str) {
        return false;
    }

    public WebResourceResponse Beu(String str) {
        return null;
    }
}
