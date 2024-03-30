package com.whatsapp.greenalert;

import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass17Z;
import X.AnonymousClass1E9;
import X.AnonymousClass1M4;
import X.AnonymousClass1N3;
import X.AnonymousClass3RI;
import X.AnonymousClass3Y2;
import X.AnonymousClass3YD;
import X.AnonymousClass4Y3;
import X.C011004s;
import X.C03570Gk;
import X.C16720pz;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C29341Wg;
import X.C29371Wj;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C36421kH;
import X.C42811zW;
import X.C89174Vn;
import X.C89334Wd;
import X.C90104Zc;
import X.C90204Zm;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import com.whatsapp.wds.components.button.WDSButton;

public class GreenAlertActivity extends AnonymousClass155 {
    public static final int[] A0I = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0J = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0K = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0L = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0M = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0N = {R.string.f12nameremoved, R.string.f12nameremoved};
    public static final int[] A0O = {R.string.f12nameremoved, R.string.f12nameremoved};
    public WaImageButton A00;
    public WaImageButton A01;
    public WaViewPager A02;
    public AnonymousClass17Z A03;
    public C18820ts A04;
    public C29371Wj A05;
    public C29341Wg A06;
    public C20380xT A07;
    public AnonymousClass1E9 A08;
    public AnonymousClass1M4 A09;
    public WDSButton A0A;
    public View A0B;
    public View A0C;
    public WaImageButton A0D;
    public WaTabLayout A0E;
    public C42811zW A0F;
    public boolean A0G;
    public final C16720pz A0H;

    public static void A01(GreenAlertActivity greenAlertActivity) {
        int currentLogicalItem = greenAlertActivity.A02.getCurrentLogicalItem();
        if (AnonymousClass3RI.A02(greenAlertActivity.A06)) {
            C29371Wj r2 = greenAlertActivity.A05;
            int i = 12;
            if (currentLogicalItem == 1) {
                i = 4;
            }
            C29371Wj.A01(r2, Integer.valueOf(i));
            greenAlertActivity.finish();
            return;
        }
        C24801Dv.A02(greenAlertActivity);
    }

    public static void A07(GreenAlertActivity greenAlertActivity, int i) {
        greenAlertActivity.A00.setVisibility(C36421kH.A00(i));
        WDSButton wDSButton = greenAlertActivity.A0A;
        int i2 = R.string.f12nameremoved;
        if (i == 1) {
            i2 = R.string.f12nameremoved;
        }
        wDSButton.setText(i2);
    }

    public static void A0F(GreenAlertActivity greenAlertActivity, int i) {
        WaImageButton waImageButton;
        View findViewWithTag = greenAlertActivity.A02.findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag != null) {
            int i2 = 0;
            if (i != 1 || !greenAlertActivity.A02.findViewWithTag(1).canScrollVertically(1)) {
                greenAlertActivity.A0A.setVisibility(0);
                waImageButton = greenAlertActivity.A0D;
                i2 = 8;
            } else {
                greenAlertActivity.A0A.setVisibility(4);
                waImageButton = greenAlertActivity.A0D;
            }
            waImageButton.setVisibility(i2);
            float dimension = greenAlertActivity.getResources().getDimension(R.dimen.f7nameremoved);
            View view = greenAlertActivity.A0C;
            float f = 0.0f;
            if (findViewWithTag.getScrollY() <= 0) {
                dimension = 0.0f;
            }
            C011004s.A05(view, dimension);
            float dimension2 = greenAlertActivity.getResources().getDimension(R.dimen.f7nameremoved);
            boolean canScrollVertically = findViewWithTag.canScrollVertically(1);
            View view2 = greenAlertActivity.A0B;
            if (canScrollVertically) {
                f = dimension2;
            }
            C011004s.A05(view2, f);
        }
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A09 = C36361kB.A0f(A0B2);
            this.A07 = C36331k8.A0I(A0B2);
            this.A04 = C36341k9.A0T(A0B2);
            this.A05 = (C29371Wj) A0B2.A8p.get();
            this.A06 = (C29341Wg) A0B2.A8q.get();
            this.A08 = (AnonymousClass1E9) A0B2.A8c.get();
            this.A03 = C36411kG.A0c(A0B2);
        }
    }

    public void onBackPressed() {
        int max = Math.max(-1, this.A02.getCurrentLogicalItem() - 1);
        if (max < 0) {
            A01(this);
            return;
        }
        this.A02.setCurrentLogicalItem(max);
        A07(this, max);
        A0F(this, max);
    }

    public GreenAlertActivity(int i) {
        this.A0G = false;
        C89334Wd.A00(this, 32);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WaViewPager waViewPager = this.A02;
        View findViewWithTag = waViewPager.findViewWithTag(Integer.valueOf(waViewPager.getCurrentLogicalItem()));
        if (findViewWithTag != null) {
            C90204Zm.A00(findViewWithTag.getViewTreeObserver(), this, findViewWithTag, 3);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A00 = (WaImageButton) C03570Gk.A0B(this, R.id.green_alert_back_button);
        this.A01 = (WaImageButton) C03570Gk.A0B(this, R.id.green_alert_dismiss_button);
        this.A0A = (WDSButton) C03570Gk.A0B(this, R.id.green_alert_continue_button);
        this.A0D = (WaImageButton) C03570Gk.A0B(this, R.id.green_alert_scroll_tos_button);
        this.A0E = (WaTabLayout) C03570Gk.A0B(this, R.id.green_alert_tab_layout);
        this.A0C = C03570Gk.A0B(this, R.id.green_alert_sticky_top_panel);
        this.A0B = C03570Gk.A0B(this, R.id.green_alert_sticky_bottom_panel);
        this.A02 = (WaViewPager) C03570Gk.A0B(this, R.id.green_alert_viewpager);
        boolean A022 = AnonymousClass3RI.A02(this.A06);
        C20810yC r11 = this.A0D;
        AnonymousClass17Y r6 = this.A05;
        AnonymousClass1M4 r13 = this.A09;
        C24801Dv r5 = this.A01;
        AnonymousClass1N3 r7 = this.A04;
        C20380xT r12 = this.A07;
        C21060yb r8 = this.A08;
        C18820ts r10 = this.A04;
        C42811zW r3 = new C42811zW(this.A0H, r5, r6, r7, r8, this.A03, r10, r11, r12, r13);
        this.A0F = r3;
        this.A02.setAdapter(r3);
        this.A02.A0K(new C89174Vn(this, 0));
        C90104Zc.A00(this.A02.getViewTreeObserver(), this, 21);
        this.A0E.setupWithViewPager(this.A02);
        this.A0E.setupTabsForAccessibility(this.A0A);
        this.A0E.setTabsClickable(false);
        AnonymousClass3YD.A00(this.A00, this, 7, A022);
        AnonymousClass3Y2.A00(this.A01, this, 22);
        AnonymousClass3YD.A00(this.A0A, this, 8, A022);
        AnonymousClass3Y2.A00(this.A0D, this, 23);
        int intExtra = getIntent().getIntExtra("page", 0);
        this.A02.setCurrentLogicalItem(intExtra);
        A07(this, intExtra);
        A0F(this, intExtra);
        C29371Wj.A01(this.A05, C36421kH.A0U());
    }

    public void onResume() {
        super.onResume();
        this.A01.setVisibility(C36421kH.A00(AnonymousClass3RI.A02(this.A06) ? 1 : 0));
    }

    public GreenAlertActivity() {
        this(0);
        this.A0H = new AnonymousClass4Y3(this, 0);
    }
}
