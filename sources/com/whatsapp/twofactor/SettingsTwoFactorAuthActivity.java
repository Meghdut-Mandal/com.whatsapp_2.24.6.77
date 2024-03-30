package com.whatsapp.twofactor;

import X.AnonymousClass155;
import X.AnonymousClass1RC;
import X.AnonymousClass3LW;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y9;
import X.AnonymousClass4XQ;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C29011Uz;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C39001qm;
import X.C81183wb;
import X.C88614Tj;
import X.C89374Wh;
import X.C89634Xh;
import X.C89924Yk;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class SettingsTwoFactorAuthActivity extends AnonymousClass155 implements C88614Tj {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C29011Uz A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final Runnable A0E;

    public class ConfirmDisableDialog extends Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog {
        public Dialog A1a(Bundle bundle) {
            C39001qm A02 = AnonymousClass3LW.A02(this);
            A02.A0c(R.string.f12nameremoved);
            C39001qm.A03(new AnonymousClass4XQ(this, 14), A02, R.string.f12nameremoved);
            return A02.create();
        }
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0A = (C29011Uz) r1.A49.get();
        }
    }

    public void Bjj(int i) {
        this.A0D.removeCallbacks(this.A0E);
        Bnv();
        if (i == 405) {
            C36401kF.A1D(this, R.string.f12nameremoved, R.string.f12nameremoved);
        } else {
            BO5(R.string.f12nameremoved);
        }
        this.A04.Bp1(C81183wb.A00(this, 38));
    }

    public void Bjk() {
        this.A0D.removeCallbacks(this.A0E);
        Bnv();
        this.A04.Bp1(C81183wb.A00(this, 38));
        this.A05.A06(R.string.f12nameremoved, 1);
    }

    public SettingsTwoFactorAuthActivity(int i) {
        this.A0C = false;
        C89374Wh.A00(this, 17);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C89924Yk.A00(this.A05.getViewTreeObserver(), this, 12);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        this.A04 = C36411kG.A0Q(this, R.id.logo);
        this.A03 = findViewById(R.id.enable_panel);
        this.A02 = findViewById(R.id.disable_panel_divider);
        this.A01 = findViewById(R.id.disable_panel);
        this.A08 = C36391kE.A0Q(this, R.id.description);
        this.A06 = C36391kE.A0Q(this, R.id.change_code_button);
        this.A07 = C36391kE.A0Q(this, R.id.change_email_button);
        boolean A0E2 = this.A0D.A0E(5711);
        this.A0B = A0E2;
        if (A0E2) {
            this.A09 = C36391kE.A0Q(this, R.id.disable_button_v2);
            i = R.id.disable_button;
        } else {
            this.A09 = C36391kE.A0Q(this, R.id.disable_button);
            i = R.id.disable_button_v2;
        }
        C36341k9.A13(this, i, 8);
        AnonymousClass3Y9.A00(findViewById(R.id.enable_button), this, 3);
        AnonymousClass3Y9.A00(this.A09, this, 4);
        AnonymousClass3Y9.A00(this.A06, this, 5);
        boolean A0E3 = this.A0D.A0E(5156);
        TextView textView = this.A07;
        if (A0E3) {
            textView.setVisibility(8);
        } else {
            AnonymousClass3Y9.A00(textView, this, 6);
        }
        if (Build.VERSION.SDK_INT < 23) {
            int A002 = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
            AnonymousClass3UF.A0F(this.A09, A002);
            AnonymousClass3UF.A0F(this.A06, A002);
            AnonymousClass3UF.A0F(this.A07, A002);
        }
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C89634Xh.A00(this.A05.getViewTreeObserver(), this, 10);
        C89924Yk.A00(this.A05.getViewTreeObserver(), this, 12);
    }

    public void onPause() {
        super.onPause();
        List list = this.A0A.A09;
        C18740tg.A0C(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        List list = this.A0A.A09;
        C18740tg.A0C(!list.contains(this));
        list.add(this);
        this.A04.Bp1(C81183wb.A00(this, 38));
    }

    public SettingsTwoFactorAuthActivity() {
        this(0);
        this.A0D = C36341k9.A0H();
        this.A0E = C81183wb.A00(this, 37);
    }
}
