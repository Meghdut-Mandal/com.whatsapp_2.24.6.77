package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass07B;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass8gC;
import X.AnonymousClass8gD;
import X.AnonymousClass9I9;
import X.B7Z;
import X.B84;
import X.B9H;
import X.BA9;
import X.C131606Ps;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C168127zk;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C200169gl;
import X.C202269lR;
import X.C206719tr;
import X.C24611Dc;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiProfileDetailsActivity extends C179128jE {
    public LinearLayout A00;
    public LinearLayout A01;
    public RecyclerView A02;
    public C135086c7 A03;
    public AnonymousClass8gD A04;
    public C200169gl A05;
    public IndiaUpiNumberSettingsViewModel A06;
    public C29131Vl A07;
    public String A08;
    public ImageView A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ConstraintLayout A0I;
    public AnonymousClass8gC A0J;
    public Boolean A0K;
    public boolean A0L;
    public final C24611Dc A0M;

    public static void A10(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity) {
        C206719tr A012;
        if (A12(indiaUpiProfileDetailsActivity, 12) && (A012 = indiaUpiProfileDetailsActivity.A05.A01()) != null) {
            IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = indiaUpiProfileDetailsActivity.A06;
            AnonymousClass8gC r5 = indiaUpiProfileDetailsActivity.A0J;
            indiaUpiNumberSettingsViewModel.A0S(indiaUpiProfileDetailsActivity.A0M.A08(), indiaUpiProfileDetailsActivity.A03, A012, r5, indiaUpiProfileDetailsActivity.A0M.A0E(), "active");
        }
    }

    private boolean A11() {
        String A092 = this.A0D.A09(2965);
        if (!TextUtils.isEmpty(A092)) {
            List asList = Arrays.asList(A092.split(","));
            String A0K2 = C173858Tk.A0K(this);
            if (!TextUtils.isEmpty(A0K2)) {
                return asList.contains(A0K2);
            }
        }
        return false;
    }

    public static boolean A12(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity, int i) {
        if (!indiaUpiProfileDetailsActivity.A0M.A0O()) {
            return true;
        }
        Intent A0G2 = C165597tg.A0G(indiaUpiProfileDetailsActivity);
        A0G2.putExtra("extra_setup_mode", 2);
        A0G2.putExtra("extra_payments_entry_type", i);
        A0G2.putExtra("extra_skip_value_props_display", false);
        A0G2.putExtra("extra_referral_screen", "payments_profile");
        A0G2.putExtra("extra_payment_name", indiaUpiProfileDetailsActivity.A03);
        indiaUpiProfileDetailsActivity.A42(A0G2);
        indiaUpiProfileDetailsActivity.startActivity(A0G2);
        return false;
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L2, r2, r1, this);
            C173858Tk.A0i(A0L2, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A07 = C165587tf.A0Z(r2);
            this.A05 = (C200169gl) r1.A98.get();
        }
    }

    public void A48(boolean z) {
        this.A0A.setVisibility(8);
        this.A0C.setVisibility(8);
        this.A0I.setVisibility(8);
        ArrayList A022 = this.A05.A02();
        C206719tr A012 = this.A05.A01();
        if (!z && A012 != null) {
            A022.remove(A012);
        }
        int size = A022.size();
        int i = 0;
        RecyclerView recyclerView = this.A02;
        if (size == 0) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
        this.A02.setAdapter(new C168127zk(new AnonymousClass9I9(this, A022), this, A022));
        boolean A072 = this.A05.A07();
        LinearLayout linearLayout = this.A00;
        if (A072) {
            if (A012 != null) {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = this.A01;
                if (z) {
                    i = 8;
                }
                linearLayout2.setVisibility(i);
                this.A00.setEnabled(!z);
            } else if (!this.A05.A06()) {
                i = 8;
            }
        }
        linearLayout.setVisibility(i);
        this.A01.setVisibility(8);
        this.A00.setEnabled(!z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A0j(this);
        this.A03 = (C135086c7) C36431kI.A0F(this, R.layout.f9nameremoved).getParcelableExtra("extra_payment_name");
        this.A08 = C165587tf.A0g(this);
        this.A0K = Boolean.valueOf(getIntent().getBooleanExtra("extra_mapper_recover_alias", false));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        this.A0M.A06("onCreate");
        AnonymousClass17Y r9 = this.A05;
        C29131Vl r14 = this.A07;
        C202269lR r10 = this.A0L;
        C29121Vk r12 = this.A0M;
        AF7 af7 = this.A0S;
        C29221Vu r11 = this.A0K;
        this.A04 = new AnonymousClass8gD(this, r9, r10, r11, r12, af7, r14);
        this.A0J = new AnonymousClass8gC(this, r9, this.A0H, r10, r11, r12, r14);
        TextView A0Q = C36391kE.A0Q(this, R.id.profile_name);
        this.A0H = A0Q;
        C165607th.A1A(A0Q, C165577te.A0g(this.A03));
        TextView A0Q2 = C36391kE.A0Q(this, R.id.profile_vpa);
        this.A0G = A0Q2;
        C165607th.A1A(A0Q2, this.A0M.A08().A00);
        this.A0C = (LinearLayout) findViewById(R.id.set_up_upi_number_container);
        this.A0F = C36391kE.A0Q(this, R.id.upi_number_text);
        this.A0E = C36391kE.A0Q(this, R.id.upi_number_subtext);
        this.A09 = C36411kG.A0Q(this, R.id.linked_number_image);
        this.A0A = (LinearLayout) findViewById(R.id.linked_upi_number_container);
        this.A0B = (LinearLayout) findViewById(R.id.remove_upi_number_container);
        this.A0I = (ConstraintLayout) findViewById(R.id.shimmer_layout_row);
        this.A0D = (LinearLayout) findViewById(R.id.setup_upi_numbers_container_phase2);
        this.A00 = (LinearLayout) findViewById(R.id.add_upi_number_container_phase2);
        this.A02 = (RecyclerView) findViewById(R.id.upi_numbers_list_phase2);
        this.A01 = (LinearLayout) findViewById(R.id.recover_upi_number_container);
        C36411kG.A0Q(this, R.id.vpa_icon).setImageDrawable(this.A0W.A0K(this, this.A0N.A02(), R.color.f6nameremoved, R.dimen.f7nameremoved));
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) C165617ti.A0A(new B9H(this, 2), this).A00(IndiaUpiNumberSettingsViewModel.class);
        this.A06 = indiaUpiNumberSettingsViewModel;
        BA9.A00(this, indiaUpiNumberSettingsViewModel.A00, 34);
        C36421kH.A13(this.A0B, this, 5);
        C36421kH.A13(this.A0C, this, 6);
        C36421kH.A13(this.A00, this, 7);
        C36421kH.A13(this.A01, this, 8);
        if (bundle == null && this.A0K.booleanValue()) {
            A48(true);
            A10(this);
        }
        if (!A11()) {
            A47(false);
        } else if (!this.A0K.booleanValue()) {
            A48(false);
        }
        C131606Ps r3 = null;
        if (A11()) {
            r3 = A0z(this);
        }
        this.A0S.BOp(r3, 0, (Integer) null, "payments_profile", this.A08);
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        if (i == 28) {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            B84.A00(r2, this, 18, R.string.f12nameremoved);
        } else if (i != 38) {
            return super.onCreateDialog(i);
        } else {
            this.A0S.BOm(C36381kD.A0m(), (Integer) null, "alias_remove_confirm_dialog", "payments_profile");
            r2 = AnonymousClass3LW.A00(this);
            r2.A0d(R.string.f12nameremoved);
            r2.A0c(R.string.f12nameremoved);
            B84.A00(r2, this, 19, R.string.f12nameremoved);
            B84.A01(r2, this, 20, R.string.f12nameremoved);
        }
        return r2.create();
    }

    public IndiaUpiProfileDetailsActivity(int i) {
        this.A0L = false;
        B7Z.A00(this, 35);
    }

    public static C131606Ps A0z(IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity) {
        String str;
        String str2;
        C131606Ps A0F2 = C165567td.A0F();
        Iterator it = indiaUpiProfileDetailsActivity.A05.A02().iterator();
        while (it.hasNext()) {
            C206719tr r2 = (C206719tr) it.next();
            String str3 = r2.A03;
            if (str3.equals("numeric_id")) {
                str = r2.A02;
                str2 = "numeric_alias";
            } else if (str3.equals("mobile_number")) {
                str = r2.A02;
                str2 = "phone_num_alias";
            }
            A0F2.A03(str2, str);
        }
        return A0F2;
    }

    public void A47(boolean z) {
        int i;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (A11()) {
            A48(z);
            return;
        }
        this.A0D.setVisibility(8);
        if (z) {
            this.A0I.setVisibility(0);
            this.A0A.setVisibility(8);
            linearLayout = this.A0C;
        } else {
            ArrayList A022 = this.A05.A02();
            this.A0I.setVisibility(8);
            if (A022.size() == 0) {
                this.A0A.setVisibility(8);
                linearLayout2 = this.A0C;
            } else {
                C206719tr r2 = (C206719tr) A022.get(0);
                this.A0C.setVisibility(8);
                this.A0A.setVisibility(0);
                C165607th.A1A(this.A0F, r2.A00.A00);
                TextView textView = this.A0E;
                String str = r2.A02;
                boolean equals = str.equals("active_pending");
                if (equals) {
                    i = R.string.f12nameremoved;
                } else {
                    boolean equals2 = str.equals("deregistered_pending");
                    i = R.string.f12nameremoved;
                    if (equals2) {
                        i = R.string.f12nameremoved;
                    }
                }
                textView.setText(i);
                if (equals || str.equals("deregistered_pending")) {
                    this.A09.setImageResource(R.drawable.ic_auto_pay);
                    linearLayout = this.A0B;
                } else {
                    this.A09.setImageResource(R.drawable.ic_settings_phone);
                    linearLayout2 = this.A0B;
                }
            }
            linearLayout2.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0 && intent != null) {
            AnonymousClass3SJ.A01(this, 28);
        }
    }

    public void onResume() {
        super.onResume();
        A47(false);
    }

    public IndiaUpiProfileDetailsActivity() {
        this(0);
        this.A0M = C165607th.A0b("IndiaUpiProfileDetailsActivity");
    }
}
