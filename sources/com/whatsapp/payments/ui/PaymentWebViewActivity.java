package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass098;
import X.AnonymousClass099;
import X.AnonymousClass6JT;
import X.C100744vb;
import X.C123555wh;
import X.C207369uz;
import X.C36371kC;
import X.C36431kI;
import X.C51032n5;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C91364bt;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.Set;

public class PaymentWebViewActivity extends C51032n5 {
    public int A00 = -1;
    public String A01;
    public Set A02 = C90504aG.A0w(new String[]{"android-app", "app"});

    public void A3m(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        AnonymousClass00C.A0D(toolbar, 1);
        C100744vb A002 = C91364bt.A00(this, this.A00, R.drawable.ic_close);
        C90514aH.A1H(PorterDuff.Mode.SRC_ATOP, A002, AnonymousClass00F.A00(this, R.color.f6nameremoved));
        toolbar.setNavigationIcon((Drawable) A002);
        toolbar.setNavigationOnClickListener(new C207369uz(this, 41));
    }

    public boolean BLZ(String str) {
        AnonymousClass00C.A0D(str, 0);
        int i = this.A00;
        if (i == 0) {
            return this.A02.contains(str);
        }
        if (i == 1) {
            for (String A0y : C36431kI.A1b(C90494aF.A0i(C36431kI.A19(this.A0D, 4642), ","))) {
                if (str.equals(C36371kC.A0y(A0y))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A3q() {
        if (this instanceof P2mLiteWebViewActivity) {
            P2mLiteWebViewActivity p2mLiteWebViewActivity = (P2mLiteWebViewActivity) this;
            p2mLiteWebViewActivity.A02 = true;
            p2mLiteWebViewActivity.onBackPressed();
            return;
        }
        A3i();
    }

    public void A3i() {
        super.A3i();
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        WebStorage.getInstance().deleteAllData();
    }

    public boolean A3p(String str) {
        String str2;
        String str3;
        boolean A3p = super.A3p(str);
        if (A3p || str == null || !(!AnonymousClass098.A06(str)) || (str2 = this.A01) == null || !(!AnonymousClass098.A06(str2)) || (str3 = this.A01) == null || !AnonymousClass099.A0O(str, str3, false)) {
            return A3p;
        }
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("webview_callback", str);
        A3j(0, A0D);
        return true;
    }

    public C123555wh BmU() {
        C123555wh r1 = new AnonymousClass6JT(super.BmU()).A00;
        r1.A00 = 1;
        return r1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = getIntent().getStringExtra("webview_cancel_callback");
        this.A00 = getIntent().getIntExtra("deep_link_type_support", -1);
    }
}
