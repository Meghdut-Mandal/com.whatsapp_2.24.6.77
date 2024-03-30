package com.whatsapp.expiringgroups;

import X.AnonymousClass00C;
import X.AnonymousClass04F;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass155;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass3Y1;
import X.AnonymousClass3p2;
import X.C03570Gk;
import X.C18750th;
import X.C18800tq;
import X.C18830tt;
import X.C203399nx;
import X.C220412q;
import X.C222013h;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C588931l;
import X.C65073Qp;
import X.C89334Wd;
import X.C89654Xj;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

public class ChangeExpiringGroupsSettingActivity extends AnonymousClass155 {
    public static final int[][] A08 = {new int[]{-1, R.string.f12nameremoved}, new int[]{0, R.string.f12nameremoved}, new int[]{1, R.string.f12nameremoved}, new int[]{7, R.string.f12nameremoved}, new int[]{30, R.string.f12nameremoved}};
    public int A00;
    public int A01;
    public long A02;
    public C65073Qp A03;
    public C220412q A04;
    public AnonymousClass3p2 A05;
    public AnonymousClass19A A06;
    public boolean A07;

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36351kA.A0a(A0B);
            this.A06 = C36361kB.A0c(A0B);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        long j;
        MenuItem menuItem2 = menuItem;
        if (!(menuItem2.getItemId() != 16908332 || this.A02 == -1 || this.A00 == (i = this.A01))) {
            long A0B = C36391kE.A0B(System.currentTimeMillis());
            if (i != 0) {
                if (i == 1) {
                    j = 86400;
                } else if (i == 7) {
                    j = 604800;
                } else if (i != 30) {
                    A0B = -10;
                } else {
                    j = 2592000;
                }
                A0B += j;
            }
            AnonymousClass3p2 r12 = this.A05;
            AnonymousClass11F A062 = this.A03.A06();
            AnonymousClass00C.A0D(A062, 0);
            AnonymousClass19A r11 = r12.A00;
            String A09 = r11.A09();
            C203399nx r8 = new C203399nx("expire", A0B > 0 ? new AnonymousClass1AL[]{new AnonymousClass1AL("timestamp", A0B)} : null);
            AnonymousClass1AL[] r7 = new AnonymousClass1AL[4];
            C36341k9.A1S(r7, 0);
            C36331k8.A1R(A09, r7, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r7, 2);
            C36341k9.A1L("to", A062.getRawString(), r7, 3);
            r11.A0K(r12, C36391kE.A0m(r8, r7), A09, 380, 20000);
            if (A0B == -10) {
                this.A09.A1I(this.A03.A06());
            } else {
                this.A09.A1J(this.A03.A06(), A0B);
            }
        }
        return super.onOptionsItemSelected(menuItem2);
    }

    public ChangeExpiringGroupsSettingActivity(int i) {
        this.A07 = false;
        C89334Wd.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        View A0B = C03570Gk.A0B(this, R.id.ephemeral_image);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C03570Gk.A0B(this, R.id.ephemeral_lottie_animation);
        if (C222013h.A07) {
            C03570Gk.A0B(this, R.id.ephemeral_illustration).setVisibility(0);
        }
        Boolean bool = C18750th.A03;
        lottieAnimationView.setAnimation("ephemeral_settings_lottie_animation.lottie");
        C36381kD.A1B(lottieAnimationView, A0B);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        C36391kE.A15(this, R.string.f12nameremoved);
        Toolbar A0N = C36361kB.A0N(this);
        C36331k8.A0s(this, A0N, this.A00, R.drawable.ic_back);
        A0N.setTitle((CharSequence) getString(R.string.f12nameremoved));
        A0N.setBackgroundResource(C36441kJ.A04(this));
        A0N.A0J(this, R.style.f13nameremoved);
        A0N.setNavigationOnClickListener(new AnonymousClass3Y1(this, 7));
        setSupportActionBar(A0N);
        AnonymousClass11F A0F = C36331k8.A0F(this);
        C65073Qp A0W = C36371kC.A0W(this.A04, A0F);
        this.A03 = A0W;
        if (A0W == null || !AnonymousClass143.A0G(A0F)) {
            finish();
            return;
        }
        long A0R = this.A09.A0R(A0F);
        this.A02 = A0R;
        if (A0R == -1) {
            C36401kF.A0H(this, R.id.expiring_setting_title).setText(R.string.f12nameremoved);
            radioGroup.setVisibility(8);
            return;
        }
        this.A00 = -2;
        this.A01 = -2;
        if (bundle != null) {
            this.A01 = bundle.getInt("selected_setting", -2);
        }
        radioGroup.setOnCheckedChangeListener(new C89654Xj(this, 3));
        int i = 0;
        while (true) {
            int[][] iArr = A08;
            if (i < 5) {
                int[] iArr2 = iArr[i];
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(this, R.style.f13nameremoved));
                appCompatRadioButton.setId(AnonymousClass04F.A00());
                appCompatRadioButton.setTag(Integer.valueOf(iArr2[0]));
                appCompatRadioButton.setText(iArr2[1]);
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                radioGroup.addView(appCompatRadioButton);
                i++;
            } else {
                this.A05 = new AnonymousClass3p2(new C588931l(this), this.A06);
                return;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    public ChangeExpiringGroupsSettingActivity() {
        this(0);
    }
}
