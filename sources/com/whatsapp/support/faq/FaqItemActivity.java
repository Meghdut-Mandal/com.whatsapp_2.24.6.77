package com.whatsapp.support.faq;

import X.AnonymousClass155;
import X.AnonymousClass1EU;
import X.AnonymousClass3GU;
import X.AnonymousClass4VV;
import X.C1503274v;
import X.C18800tq;
import X.C18830tt;
import X.C1906499t;
import X.C19430v1;
import X.C21100yf;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C37751n9;
import X.C62603Gu;
import X.C67103Yn;
import X.C89374Wh;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

public class FaqItemActivity extends AnonymousClass155 {
    public long A00;
    public long A01;
    public long A02;
    public C62603Gu A03;
    public AnonymousClass1EU A04;
    public AnonymousClass3GU A05;
    public boolean A06;
    public final WebViewClient A07;

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = (C62603Gu) r1.A8A.get();
            this.A04 = C36381kD.A0f(A0B);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        getSupportActionBar().A0U(true);
        getSupportActionBar().A0Q(C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("title"));
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(this.A07);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", C19430v1.A0B, (String) null);
        this.A00 = getIntent().getLongExtra("article_id", -1);
        this.A02 = 0;
        String stringExtra3 = getIntent().getStringExtra("contact_us_context");
        if (!getIntent().getBooleanExtra("show_contact_support_button", false)) {
            return;
        }
        if (!C1906499t.A00(stringExtra3) || !this.A06.A09(C21100yf.A0d)) {
            String stringExtra4 = getIntent().getStringExtra("contact_us_context");
            View findViewById = findViewById(R.id.bottom_button_container);
            C1503274v r2 = new C1503274v(29, stringExtra4, this);
            AnonymousClass3GU A002 = AnonymousClass3GU.A00(this, webView, findViewById);
            this.A05 = A002;
            A002.A02(this, new AnonymousClass4VV(this, r2, 3), C36391kE.A0Q(this, R.id.does_not_match_button), getString(R.string.f12nameremoved), R.style.f13nameremoved);
            C67103Yn.A00(this.A05.A01, r2, 33);
            findViewById.setVisibility(0);
        }
    }

    public FaqItemActivity(int i) {
        this.A06 = false;
        C89374Wh.A00(this, 9);
    }

    public void onBackPressed() {
        C36401kF.A1L(this);
        super.onBackPressed();
        overridePendingTransition(R.anim.f1nameremoved, R.anim.f1nameremoved);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass3GU r0 = this.A05;
        if (r0 != null) {
            r0.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        overridePendingTransition(R.anim.f1nameremoved, R.anim.f1nameremoved);
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A02 += System.currentTimeMillis() - this.A01;
        this.A01 = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.A01 = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        C36401kF.A1L(this);
    }

    public FaqItemActivity() {
        this(0);
        this.A07 = new C37751n9(this);
    }
}
