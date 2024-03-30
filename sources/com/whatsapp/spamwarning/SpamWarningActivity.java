package com.whatsapp.spamwarning;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass19J;
import X.AnonymousClass4VS;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C20420xX;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36421kH;
import X.C68883cc;
import X.C89364Wg;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public class SpamWarningActivity extends AnonymousClass155 {
    public int A00;
    public AnonymousClass19J A01;
    public C20380xT A02;
    public C20420xX A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = C36331k8.A0I(A0B);
            this.A01 = (AnonymousClass19J) A0B.A9p.get();
        }
    }

    public void onDestroy() {
        C20420xX r1 = this.A03;
        if (r1 != null) {
            this.A01.unregisterObserver(r1);
            this.A03 = null;
        }
        super.onDestroy();
    }

    public SpamWarningActivity(int i) {
        this.A04 = false;
        C89364Wg.A00(this, 46);
    }

    public void onBackPressed() {
        super.onBackPressed();
        C24801Dv.A02(this);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SpamWarningActivity started with code ");
        A0u.append(intExtra);
        A0u.append(" and expiry (in seconds) ");
        C36321k7.A1Y(A0u, this.A00);
        switch (intExtra) {
            case 101:
                i = R.string.f12nameremoved;
                break;
            case 102:
                i = R.string.f12nameremoved;
                break;
            case 103:
                i = R.string.f12nameremoved;
                break;
            case 104:
                i = R.string.f12nameremoved;
                break;
            case 106:
                i = R.string.f12nameremoved;
                break;
            default:
                int i2 = this.A00;
                i = R.string.f12nameremoved;
                if (i2 == -1) {
                    i = R.string.f12nameremoved;
                    break;
                }
                break;
        }
        C36421kH.A14(findViewById(R.id.btn_spam_warning_learn_more), this, stringExtra2, 21);
        TextView A0Q = C36391kE.A0Q(this, R.id.spam_warning_info_textview);
        if (stringExtra == null || stringExtra.isEmpty()) {
            A0Q.setText(i);
        } else {
            A0Q.setText(stringExtra);
        }
        if (this.A00 == -1) {
            C36341k9.A13(this, R.id.progress_bar, 8);
            if (this.A01.A04 == 2 || this.A01.A04 == 1) {
                startActivity(AnonymousClass190.A03(this));
                finish();
                return;
            }
            C68883cc r1 = new C68883cc(this);
            this.A03 = r1;
            this.A01.A00(r1);
            return;
        }
        C36341k9.A13(this, R.id.spam_warning_generic_data_connection_missing_textview, 8);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0E = true;
        circularProgressBar.setMax(this.A00 * 1000);
        new AnonymousClass4VS(circularProgressBar, this, (long) (this.A00 * 1000)).start();
    }

    public SpamWarningActivity() {
        this(0);
    }
}
