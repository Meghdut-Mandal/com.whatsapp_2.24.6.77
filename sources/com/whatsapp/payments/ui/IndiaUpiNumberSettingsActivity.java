package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass07B;
import X.AnonymousClass17Y;
import X.AnonymousClass8gC;
import X.AnonymousClass8gD;
import X.B7Z;
import X.B9H;
import X.BA9;
import X.C131606Ps;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C19720wP;
import X.C200169gl;
import X.C202269lR;
import X.C206719tr;
import X.C207359uy;
import X.C24611Dc;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;

public class IndiaUpiNumberSettingsActivity extends C179128jE {
    public ImageView A00;
    public ImageView A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public C19720wP A09;
    public C135086c7 A0A;
    public C206719tr A0B;
    public AnonymousClass8gD A0C;
    public AnonymousClass8gC A0D;
    public C200169gl A0E;
    public IndiaUpiNumberSettingsViewModel A0F;
    public C29131Vl A0G;
    public boolean A0H;
    public final C24611Dc A0I;

    public static void A0z(IndiaUpiNumberSettingsActivity indiaUpiNumberSettingsActivity, String str) {
        if (indiaUpiNumberSettingsActivity.A0B != null) {
            C131606Ps A0F2 = C165567td.A0F();
            A0F2.A03("alias_type", indiaUpiNumberSettingsActivity.A0B.A03);
            A0F2.A03("alias_status", str);
            indiaUpiNumberSettingsActivity.A0S.BOp(A0F2, C36361kB.A0i(), 165, "alias_info", C165587tf.A0g(indiaUpiNumberSettingsActivity));
        }
    }

    public void A2F() {
        if (!this.A0H) {
            this.A0H = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A09 = (C19720wP) r2.A2U.get();
            this.A0G = C165587tf.A0Z(r2);
            this.A0E = (C200169gl) r1.A98.get();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.A0S.BOm(C36381kD.A0m(), (Integer) null, "alias_info", C165587tf.A0g(this));
        C165567td.A0j(this);
        this.A0B = (C206719tr) getIntent().getParcelableExtra("extra_payment_upi_alias");
        this.A0A = (C135086c7) getIntent().getParcelableExtra("extra_payment_name");
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C206719tr r0 = this.A0B;
            if (r0 != null) {
                String str = r0.A03;
                if (!str.equals("numeric_id")) {
                    boolean equals = str.equals("mobile_number");
                    i = R.string.f12nameremoved;
                    if (!equals) {
                        i = R.string.f12nameremoved;
                    }
                } else {
                    i = R.string.f12nameremoved;
                }
                supportActionBar.A0I(i);
            }
            supportActionBar.A0U(true);
        }
        this.A08 = (ConstraintLayout) findViewById(R.id.upi_number_container);
        this.A00 = C36411kG.A0Q(this, R.id.upi_number_image);
        this.A06 = C36391kE.A0Q(this, R.id.upi_number_update_status_text);
        this.A01 = C36411kG.A0Q(this, R.id.upi_number_update_status_image);
        this.A07 = (ConstraintLayout) findViewById(R.id.shimmer_layout_row);
        this.A02 = (LinearLayout) findViewById(R.id.remove_upi_number_container);
        this.A03 = (LinearLayout) findViewById(R.id.upi_number_update_status_container);
        this.A05 = C36391kE.A0Q(this, R.id.upi_number_text);
        this.A04 = C36391kE.A0Q(this, R.id.linked_upi_number_status);
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) C165617ti.A0A(new B9H(this, 1), this).A00(IndiaUpiNumberSettingsViewModel.class);
        this.A0F = indiaUpiNumberSettingsViewModel;
        BA9.A00(this, indiaUpiNumberSettingsViewModel.A00, 29);
        AnonymousClass17Y r6 = this.A05;
        C29131Vl r11 = this.A0G;
        C202269lR r7 = this.A0L;
        C29121Vk r9 = this.A0M;
        AF7 af7 = this.A0S;
        C29221Vu r8 = this.A0K;
        this.A0C = new AnonymousClass8gD(this, r6, r7, r8, r9, af7, r11);
        this.A0D = new AnonymousClass8gC(this, r6, this.A0H, r7, r8, r9, r11);
        C207359uy.A00(this.A02, this, 23);
        C207359uy.A00(this.A03, this, 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r4) {
        /*
            r3 = this;
            r0 = 38
            if (r4 == r0) goto L_0x0009
            android.app.Dialog r0 = super.onCreateDialog(r4)
            return r0
        L_0x0009:
            X.9tr r0 = r3.A0B
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r0.A03
            int r1 = r2.hashCode()
            r0 = -1660330099(0xffffffff9d095f8d, float:-1.8181198E-21)
            if (r1 != r0) goto L_0x0023
            java.lang.String r0 = "numeric_id"
            boolean r0 = r2.equals(r0)
            r1 = 2131895313(0x7f122411, float:1.9425455E38)
            if (r0 != 0) goto L_0x0026
        L_0x0023:
            r1 = 2131895456(0x7f1224a0, float:1.9425746E38)
        L_0x0026:
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131895457(0x7f1224a1, float:1.9425748E38)
            r2.A0d(r0)
            r2.A0c(r1)
            r1 = 2131893503(0x7f121cff, float:1.9421784E38)
            r0 = 39
            X.B83.A01(r2, r3, r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 40
            X.B83.A00(r2, r3, r0, r1)
            X.0FM r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.onCreateDialog(int):android.app.Dialog");
    }

    public IndiaUpiNumberSettingsActivity(int i) {
        this.A0H = false;
        B7Z.A00(this, 19);
    }

    public IndiaUpiNumberSettingsActivity() {
        this(0);
        this.A0I = C165607th.A0b("IndiaUpiNumberSettingsActivity");
    }
}
