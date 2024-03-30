package com.whatsapp.payments.ui.mapper.register;

import X.AE0;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C54932tn;
import X.C65993Ug;
import X.C84334Cv;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

public final class IndiaUpiMapperLinkActivity extends AnonymousClass155 {
    public TextView A00;
    public AE0 A01;
    public AF7 A02;
    public IndiaUpiMapperLinkViewModel A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass00S A06;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (AE0) A0B.A49.get();
            this.A02 = C36371kC.A0i(A0B);
        }
    }

    public final AF7 A3i() {
        AF7 af7 = this.A02;
        if (af7 != null) {
            return af7;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }

    public IndiaUpiMapperLinkActivity(int i) {
        this.A05 = false;
        C89354Wf.A00(this, 7);
    }

    public void onBackPressed() {
        String str;
        super.onBackPressed();
        AF7 A3i = A3i();
        Integer A0i = C36361kB.A0i();
        if (this.A04) {
            str = "alias_switch_in_progress";
        } else {
            str = "alias_in_progress";
        }
        A3i.BOm(A0i, A0i, str, C36331k8.A0e(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView((int) R.layout.f9nameremoved);
        TextView textView = (TextView) C36361kB.A0H(this, R.id.mapper_link_title);
        AnonymousClass00C.A0D(textView, 0);
        this.A00 = textView;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A06.invoke();
        AnonymousClass00C.A0D(indiaUpiMapperLinkViewModel, 0);
        this.A03 = indiaUpiMapperLinkViewModel;
        if (bundle == null) {
            this.A04 = false;
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(R.string.f12nameremoved);
                IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = this.A03;
                if (indiaUpiMapperLinkViewModel2 != null) {
                    indiaUpiMapperLinkViewModel2.A0S(false);
                } else {
                    throw C36331k8.A0d("indiaUpiMapperLinkViewModel");
                }
            } else {
                throw C36331k8.A0d("titleTextView");
            }
        }
        C54932tn.A00(this, R.drawable.onboarding_actionbar_home_close);
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel3 = this.A03;
        if (indiaUpiMapperLinkViewModel3 != null) {
            indiaUpiMapperLinkViewModel3.A05.A08(this, new C65993Ug(this, 27));
            onConfigurationChanged(AnonymousClass000.A0U(this));
            AF7 A3i = A3i();
            if (this.A04) {
                str = "alias_switch_in_progress";
            } else {
                str = "alias_in_progress";
            }
            Intent intent = getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra("extra_referral_screen");
            } else {
                str2 = null;
            }
            A3i.BOm(0, (Integer) null, str, str2);
            return;
        }
        throw C36331k8.A0d("indiaUpiMapperLinkViewModel");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C36341k9.A06(menuItem) == 16908332) {
            AF7 A3i = A3i();
            Integer A0i = C36361kB.A0i();
            Integer A0n = C36371kC.A0n();
            if (this.A04) {
                str = "alias_switch_in_progress";
            } else {
                str = "alias_in_progress";
            }
            A3i.BOm(A0i, A0n, str, C36331k8.A0e(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperLinkActivity() {
        this(0);
        this.A06 = new C84334Cv(this);
    }
}
