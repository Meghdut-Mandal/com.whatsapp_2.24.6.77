package com.whatsapp.payments.ui;

import X.AEA;
import X.AF7;
import X.AVX;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass1EY;
import X.AnonymousClass1XD;
import X.AnonymousClass3LW;
import X.AnonymousClass3M9;
import X.AnonymousClass9KX;
import X.AnonymousClass9YX;
import X.AnonymousClass9v5;
import X.B7Z;
import X.B84;
import X.C1271267b;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C173858Tk;
import X.C176658cT;
import X.C179128jE;
import X.C179648kT;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C199729fr;
import X.C202059ky;
import X.C20430xY;
import X.C206359tF;
import X.C207359uy;
import X.C24611Dc;
import X.C24851Ea;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import X.C90494aF;
import X.C90514aH;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Objects;

public class IndiaUpiPaymentsTosActivity extends C179128jE implements AnonymousClass1XD {
    public C24851Ea A00;
    public AEA A01;
    public C1271267b A02;
    public C179648kT A03;
    public C32681e1 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C176658cT A08;
    public final C24611Dc A09;

    private void A0z(int i) {
        this.A03.A00.A0C(3);
        this.A0S.reset();
        C165587tf.A1B(this.A02);
        this.A09.A0A("showErrorAndFinish", (Throwable) null);
        findViewById(R.id.progress).setVisibility(4);
        C199729fr A032 = this.A01.A03((AnonymousClass9YX) null, i);
        if (A032.A00 != 0) {
            C199729fr.A00(this, A032).A1f(getSupportFragmentManager(), (String) null);
        } else {
            BO5(R.string.f12nameremoved);
        }
    }

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A04 = C36351kA.A0p(r1);
            this.A02 = (C1271267b) r2.AVg.get();
            this.A01 = C165607th.A0W(r1);
            this.A03 = C173858Tk.A0G(r1);
        }
    }

    public void Bes(C202059ky r4) {
        C24611Dc r2 = this.A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("got request error for accept-tos: ");
        r2.A05(C36381kD.A10(A0u, r4.A00));
        A0z(r4.A00);
    }

    public void Bf0(C202059ky r4) {
        C24611Dc r2 = this.A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("got response error for accept-tos: ");
        C165577te.A1D(r2, A0u, r4.A00);
        A0z(r4.A00);
    }

    public void Bf1(AnonymousClass9KX r5) {
        C24611Dc r2 = this.A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("got response for accept-tos: ");
        C165577te.A1E(r2, A0u, r5.A02);
        if (!C36371kC.A1U(this.A0P.A03(), "payment_usync_triggered")) {
            C19770wU r22 = this.A04;
            C20430xY r1 = this.A04;
            Objects.requireNonNull(r1);
            AVX.A00(r22, r1, 34);
            C36331k8.A0w(C90494aF.A0E(this.A0P), "payment_usync_triggered", true);
        }
        if (!this.A00.A03.equals("tos_no_wallet")) {
            return;
        }
        if (r5.A00) {
            this.A03.A00.A0C(3);
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            B84.A00(A002, this, 14, R.string.f12nameremoved);
            A002.A0b();
            return;
        }
        C206359tF A042 = this.A0P.A04();
        if (A042 != null) {
            String str = A042.A02;
            if (!TextUtils.isEmpty(str) && str.startsWith("tos_upgrade_step_up")) {
                this.A0P.A08();
            }
        }
        this.A0I.A0A(this.A00);
        setResult(-1);
        if (this.A05) {
            Intent A0G = C165597tg.A0G(this);
            A42(A0G);
            A0G.putExtra("extra_previous_screen", "tos_page");
            AnonymousClass3M9.A01(A0G, "tosAccept");
            A33(A0G, true);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (this.A07) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        C176658cT r1 = this.A08;
        r1.A07 = C36371kC.A0n();
        r1.A08 = C36361kB.A0i();
        C173858Tk.A0r(r1, this);
        this.A03.A00.A0C(4);
    }

    public IndiaUpiPaymentsTosActivity(int i) {
        this.A06 = false;
        B7Z.A00(this, 29);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_img);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        C176658cT r3;
        boolean z;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A00 = this.A0I.A04(stringExtra);
                this.A05 = true;
            } else {
                this.A00 = this.A0I.A04("tos_no_wallet");
            }
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView((int) R.layout.f9nameremoved);
        A3z(R.string.f12nameremoved, R.id.scroll_view);
        TextView A0Q = C36391kE.A0Q(this, R.id.title);
        if (getIntent() == null || !getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            A0Q.setText(R.string.f12nameremoved);
            r3 = this.A08;
            z = false;
        } else {
            this.A07 = true;
            A0Q.setText(R.string.f12nameremoved);
            r3 = this.A08;
            z = true;
        }
        r3.A01 = z;
        C207359uy.A00(findViewById(R.id.learn_more), this, 47);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.payments_tos_desc);
        String[] strArr = new String[3];
        C90514aH.A1Q(this.A04.A00("https://www.whatsapp.com/legal/payments/india/terms"), strArr, 0);
        C90514aH.A1Q(this.A04.A00("https://www.whatsapp.com/legal/payments/india/privacy-policy"), strArr, 1);
        strArr[2] = C165597tg.A0k(this.A04, "https://www.whatsapp.com/legal/payments/india/psp");
        SpannableString A012 = this.A04.A01(A0I.getContext(), getString(R.string.f12nameremoved), new Runnable[]{new AVY(this, 12), new AVY(this, 13), new AVY(this, 14)}, new String[]{"terms", "privacy-policy", "payment-provider-terms"}, strArr);
        C36331k8.A16(A0I, this.A08);
        C36331k8.A1A(this.A0D, A0I);
        A0I.setText(A012);
        View findViewById = findViewById(R.id.payments_tos_continue);
        findViewById.setOnClickListener(new AnonymousClass9v5((Object) this, (Object) findViewById, 34));
        C24611Dc r2 = this.A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onCreate step: ");
        C165567td.A17(r2, this.A00, A0u);
        AF7 af7 = this.A0S;
        af7.reset();
        r3.A0b = "tos_page";
        C176658cT.A02(r3, 0);
        r3.A0Y = this.A0b;
        r3.A0a = this.A0e;
        af7.BOl(r3);
        if (this.A0D.A0E(842)) {
            this.A0Y = C165597tg.A0T(this);
        }
        onConfigurationChanged(AnonymousClass000.A0U(this));
        this.A0P.A09();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0P.A07(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C176658cT r1 = this.A08;
            r1.A07 = C36371kC.A0n();
            r1.A08 = C36361kB.A0i();
            C173858Tk.A0r(r1, this);
            this.A03.A00.A0C(4);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("extra_show_updated_tos");
    }

    public void onResume() {
        super.onResume();
        this.A03.A00.A08("tosShown");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A07);
    }

    public IndiaUpiPaymentsTosActivity() {
        this(0);
        this.A00 = AnonymousClass1EY.A05;
        this.A05 = false;
        this.A07 = false;
        this.A08 = new C176658cT();
        this.A09 = C165607th.A0b("IndiaUpiPaymentsTosActivity");
    }
}
