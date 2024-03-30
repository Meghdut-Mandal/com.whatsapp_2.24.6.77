package com.whatsapp.inappsupport.ui;

import X.AnonymousClass155;
import X.AnonymousClass3GU;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y3;
import X.C18800tq;
import X.C18830tt;
import X.C19430v1;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C37741n8;
import X.C89334Wd;
import X.C90004Ys;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.Objects;

public class FaqItemActivityV2 extends AnonymousClass155 {
    public AnonymousClass3GU A00;
    public String A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public FaqItemActivityV2(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 47);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass3GU r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.f12nameremoved);
        setTitle(string);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar A0N = C36361kB.A0N(this);
        AnonymousClass3UF.A0C(this, A0N, this.A00);
        A0N.setTitle((CharSequence) string);
        A0N.setNavigationOnClickListener(new AnonymousClass3Y3(this, 20));
        setSupportActionBar(A0N);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) findViewById(R.id.faq_item_web_view);
        Objects.requireNonNull(stringExtra);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", C19430v1.A0B, (String) null);
        View findViewById = findViewById(R.id.not_helpful_button_container);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new C90004Ys(findViewById, this, 2));
        this.A00 = AnonymousClass3GU.A00(this, webView, findViewById);
        webView.setWebViewClient(new C37741n8(this));
        AnonymousClass3Y3.A00(this.A00.A01, this, 21);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"))) {
            return super.onCreateOptionsMenu(menu);
        }
        this.A01 = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        menu.add(0, R.id.menuitem_open_in_browser, 0, getString(R.string.f12nameremoved)).setShowAsAction(0);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.menuitem_open_in_browser) {
            return false;
        } else {
            String str = this.A01;
            Objects.requireNonNull(str);
            startActivity(C36331k8.A04(str));
            return true;
        }
    }

    public FaqItemActivityV2() {
        this(0);
    }
}
