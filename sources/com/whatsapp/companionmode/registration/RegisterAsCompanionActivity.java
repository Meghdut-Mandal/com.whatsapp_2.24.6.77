package com.whatsapp.companionmode.registration;

import X.AnonymousClass005;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1Pd;
import X.AnonymousClass1RU;
import X.AnonymousClass3LW;
import X.AnonymousClass3TX;
import X.AnonymousClass3UF;
import X.AnonymousClass3ZZ;
import X.AnonymousClass4XM;
import X.C03570Gk;
import X.C07690Yx;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C27651Pc;
import X.C27661Pe;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37351mE;
import X.C39001qm;
import X.C53592rZ;
import X.C53672rh;
import X.C62603Gu;
import X.C65983Uf;
import X.C66943Xx;
import X.C89324Wc;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class RegisterAsCompanionActivity extends AnonymousClass155 {
    public LinearLayout A00;
    public ProgressBar A01;
    public C19460v5 A02;
    public QrImageView A03;
    public C27651Pc A04;
    public AnonymousClass1Pd A05;
    public C27661Pe A06;
    public CompanionRegistrationViewModel A07;
    public C19630wG A08;
    public C18820ts A09;
    public C62603Gu A0A;
    public C29501Ww A0B;
    public AnonymousClass3TX A0C;
    public AnonymousClass005 A0D;
    public boolean A0E;

    private void A01() {
        String str;
        C29501Ww.A02(this.A0B, 1, true);
        AnonymousClass3TX r2 = this.A0C;
        if (this.A06.A01()) {
            str = "register_as_companion_phone";
        } else {
            str = "register_as_companion";
        }
        r2.A08(str, "tapped");
        startActivity(AnonymousClass190.A0B(this));
    }

    public static void A07(RegisterAsCompanionActivity registerAsCompanionActivity) {
        String str = ((AnonymousClass1RU) registerAsCompanionActivity.A0D.get()).A01;
        if (!TextUtils.isEmpty(str)) {
            C53672rh.A00(registerAsCompanionActivity, (AnonymousClass1RU) registerAsCompanionActivity.A0D.get(), str);
            return;
        }
        C39001qm A002 = AnonymousClass3LW.A00(registerAsCompanionActivity);
        A002.A0c(R.string.f12nameremoved);
        A002.A0d(R.string.f12nameremoved);
        A002.A0r(false);
        A002.A0i(new AnonymousClass4XM(registerAsCompanionActivity, 6), registerAsCompanionActivity.getString(R.string.f12nameremoved));
        A002.A0b();
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A08 = C36351kA.A0W(A0B2);
            this.A02 = C19470v6.A00;
            this.A0C = C36431kI.A0u(r2);
            this.A09 = C36341k9.A0T(A0B2);
            this.A0D = C18840tu.A00(A0B2.A08);
            this.A0A = (C62603Gu) r2.A8A.get();
            this.A0B = C36401kF.A0d(A0B2);
            this.A05 = (AnonymousClass1Pd) A0B2.AEE.get();
            this.A04 = (C27651Pc) A0B2.A1w.get();
            this.A06 = (C27661Pe) A0B2.A1u.get();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        ViewGroup A0E2 = C36421kH.A0E(this, 16908290);
        boolean A012 = this.A06.A01();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = R.layout.f9nameremoved;
        if (A012) {
            i = R.layout.f9nameremoved;
        }
        layoutInflater.inflate(i, A0E2);
        CompanionRegistrationViewModel companionRegistrationViewModel = (CompanionRegistrationViewModel) C36441kJ.A0b(this).A00(CompanionRegistrationViewModel.class);
        this.A07 = companionRegistrationViewModel;
        C53592rZ.A00(this, companionRegistrationViewModel.A00, 38);
        C53592rZ.A00(this, this.A07.A01, 39);
        C53592rZ.A00(this, this.A07.A02, 40);
        TextView A0Q = C36391kE.A0Q(this, R.id.companion_registration_title);
        this.A06.A01();
        A0Q.setText(R.string.f12nameremoved);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.companion_registration_subtitle);
        boolean A013 = this.A06.A01();
        int i2 = R.string.f12nameremoved;
        if (A013) {
            i2 = R.string.f12nameremoved;
        }
        A0Q2.setText(i2);
        QrImageView qrImageView = (QrImageView) findViewById(R.id.registration_qr);
        this.A03 = qrImageView;
        qrImageView.setVisibility(4);
        this.A03.setContentDescription(this.A08.A01(R.string.f12nameremoved));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reload_qr_layout);
        this.A00 = linearLayout;
        linearLayout.setVisibility(4);
        this.A01 = (ProgressBar) findViewById(R.id.loading_spinner);
        C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_one).setText(R.string.f12nameremoved);
        TextView A0Q3 = C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_two);
        Spanned fromHtml = Html.fromHtml(getString(R.string.f12nameremoved));
        SpannableStringBuilder A014 = C37351mE.A01(A0Q3.getPaint(), AnonymousClass3UF.A08(C36381kD.A0H(this, R.drawable.ic_ios_settings), C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), fromHtml, "[settings_icon]");
        A0Q3.setText(C37351mE.A01(A0Q3.getPaint(), AnonymousClass3UF.A08(C36381kD.A0H(this, R.drawable.vec_ic_more), C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved)), A014, "[overflow_menu_icon]"));
        C36361kB.A1P(getString(R.string.f12nameremoved), C36391kE.A0Q(this, R.id.companion_registration_linking_instructions_step_three));
        if (C36401kF.A1X(this.A09)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.linking_instructions_constraint_layout);
            C07690Yx r1 = new C07690Yx();
            r1.A0B(constraintLayout);
            r1.A07(R.id.companion_registration_linking_instructions_step_one);
            r1.A07(R.id.companion_registration_linking_instructions_step_two);
            r1.A07(R.id.companion_registration_linking_instructions_step_three);
            r1.A07(R.id.companion_registration_linking_instructions_step_four);
            r1.A09(constraintLayout);
        }
        C66943Xx.A00(findViewById(R.id.reload_qr_button), this, 21);
        View findViewById = findViewById(R.id.scroll_view);
        if (findViewById != null) {
            Toolbar toolbar = (Toolbar) C03570Gk.A0B(this, R.id.title_toolbar);
            ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(C36411kG.A01(this)));
            colorDrawable.setAlpha(0);
            toolbar.setBackground(colorDrawable);
            findViewById.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass3ZZ(colorDrawable, findViewById, toolbar, (int) getTheme().obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f)));
        }
        if (!"entry_eula".equals(getIntent().getStringExtra("entry_point"))) {
            this.A05.A01(2);
        }
        C65983Uf.A0M(A0E2, this, this.A09, R.id.title_toolbar, false, this.A06.A01(), false);
        AnonymousClass3TX r12 = this.A0C;
        if (A012) {
            str = "register_as_companion_phone";
        } else {
            str = "register_as_companion";
        }
        r12.A05(str);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A06.A01()) {
            menu.add(0, 0, 0, R.string.f12nameremoved);
        } else {
            menu.add(0, 2, 0, R.string.f12nameremoved);
        }
        this.A06.A00();
        menu.add(0, 1, 0, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public RegisterAsCompanionActivity(int i) {
        this.A0E = false;
        C89324Wc.A00(this, 24);
    }

    public void onBackPressed() {
        if ("entry_phone_reg".equals(getIntent().getStringExtra("entry_point")) && this.A06.A01()) {
            A01();
        } else if (isTaskRoot() && ((AnonymousClass1RU) this.A0D.get()).A0F(false)) {
            Log.i("AccountSwitcher/abandonAddAccount");
            ((AnonymousClass1RU) this.A0D.get()).A06(this, (String) null, true);
        }
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C62603Gu.A00(this, this.A0A, "RegisterAsCompanionActivity");
        } else if (itemId == 1) {
            if (!this.A06.A01()) {
                this.A05.A01(1);
            }
            A01();
            finish();
        } else if (itemId == 2) {
            startActivity(C36331k8.A04("https://faq.whatsapp.com/1317564962315842"));
        } else if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public RegisterAsCompanionActivity() {
        this(0);
    }
}
