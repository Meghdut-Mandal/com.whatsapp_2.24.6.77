package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass61B;
import X.AnonymousClass97A;
import X.AnonymousClass9DT;
import X.AnonymousClass9DV;
import X.AnonymousClass9Pr;
import X.B7Y;
import X.BA8;
import X.C000400e;
import X.C001700s;
import X.C162097o1;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C167587yK;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C202319lY;
import X.C203619oP;
import X.C203639oR;
import X.C207849xD;
import X.C23142B7c;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C90464aC;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.LinkedHashMap;
import java.util.Map;

public final class IndiaUpiFcsTransactionConfirmationActivity extends C179128jE {
    public int A00;
    public LottieAnimationView A01;
    public AnonymousClass9DT A02;
    public AnonymousClass9DV A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public AnonymousClass61B A09;
    public WDSButton A0A;
    public String A0B;
    public boolean A0C;
    public AnonymousClass9Pr A0D;
    public C167587yK A0E;
    public String A0F;
    public boolean A0G;
    public final C23142B7c A0H;

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A09 = C165587tf.A0Y(r2);
            this.A02 = (AnonymousClass9DT) A0L.A1d.get();
            this.A03 = (AnonymousClass9DV) A0L.A1f.get();
        }
    }

    public void onDestroy() {
        C203619oP r1;
        C162097o1 r0;
        C167587yK r02 = this.A0E;
        if (r02 == null) {
            throw C36331k8.A0d("activityViewModel");
        }
        C001700s r03 = r02.A00.A01;
        AnonymousClass00C.A08(r03);
        C202319lY r4 = (C202319lY) r03.A04();
        AnonymousClass011[] r3 = new AnonymousClass011[1];
        int i = this.A00;
        String str = "PENDING";
        if (!(i == 0 || i == 1)) {
            str = i != 2 ? "FAILURE" : "SUCCESS";
        }
        C90464aC.A1E("transaction_status", str, r3);
        LinkedHashMap A082 = C000400e.A08(r3);
        if (r4 != null) {
            String str2 = r4.A0F;
            if (str2 != null) {
                A082.put("transaction_id", str2);
            }
            String str3 = r4.A0J;
            if (str3 != null) {
                A082.put("error", str3);
            }
        }
        Map A0B2 = C000400e.A0B(A082);
        AnonymousClass61B r12 = this.A09;
        if (r12 != null) {
            String str4 = this.A0F;
            if (str4 == null) {
                throw C36331k8.A0d("fdsManagerId");
            }
            C203639oR A002 = r12.A00(str4);
            if (!(A002 == null || (r1 = A002.A00) == null || (r0 = (C162097o1) r1.A0A("native_upi_transaction_confirmation")) == null)) {
                r0.B7N(A0B2);
            }
            super.onDestroy();
            return;
        }
        throw C36331k8.A0d("phoenixManagerRegistry");
    }

    public IndiaUpiFcsTransactionConfirmationActivity(int i) {
        this.A0G = false;
        B7Y.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (this.A02 != null) {
            AnonymousClass9Pr r0 = new AnonymousClass9Pr(this);
            this.A0D = r0;
            if (!r0.A00(bundle)) {
                C36321k7.A1Z(C165567td.A0b(this), ": Activity cannot be launch because it is no longer safe to create this activity");
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra != null) {
                this.A0F = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_merchant_name");
                if (stringExtra2 != null) {
                    this.A0B = stringExtra2;
                    String stringExtra3 = getIntent().getStringExtra("extra_formatted_amount");
                    if (stringExtra3 != null) {
                        AnonymousClass9DV r2 = this.A03;
                        if (r2 != null) {
                            String str = this.A0F;
                            if (str == null) {
                                throw C36331k8.A0d("fdsManagerId");
                            }
                            C167587yK r02 = (C167587yK) C165617ti.A0A(new C207849xD(r2, str), this).A00(C167587yK.class);
                            this.A0E = r02;
                            if (r02 == null) {
                                throw C36331k8.A0d("activityViewModel");
                            }
                            C001700s r22 = r02.A00.A00;
                            AnonymousClass00C.A08(r22);
                            BA8.A01(this, r22, new AnonymousClass97A(this, 6), 44);
                            this.A04 = (WaImageView) C36361kB.A0H(this, R.id.close);
                            this.A0A = (WDSButton) C36361kB.A0H(this, R.id.done_button);
                            this.A05 = (WaTextView) C36361kB.A0H(this, R.id.amount);
                            this.A07 = (WaTextView) C36361kB.A0H(this, R.id.primary_status);
                            this.A08 = (WaTextView) C36361kB.A0H(this, R.id.secondary_status);
                            this.A06 = (WaTextView) C36361kB.A0H(this, R.id.date);
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C36361kB.A0H(this, R.id.lottie_animation);
                            this.A01 = lottieAnimationView;
                            if (lottieAnimationView == null) {
                                throw C36331k8.A0d("lottieAnimationView");
                            }
                            lottieAnimationView.setAnimation("transaction_confirmation_lottie_animation.json");
                            lottieAnimationView.A05(this.A0H);
                            lottieAnimationView.A09.A0F(0, 89);
                            lottieAnimationView.A04();
                            WaTextView waTextView = this.A05;
                            if (waTextView == null) {
                                throw C36331k8.A0d("amountTextView");
                            }
                            waTextView.setText(stringExtra3);
                            WaTextView waTextView2 = this.A07;
                            if (waTextView2 == null) {
                                throw C36331k8.A0d("primaryStatus");
                            }
                            Object[] A0L = AnonymousClass001.A0L();
                            String str2 = this.A0B;
                            if (str2 == null) {
                                throw C36331k8.A0d("merchantName");
                            }
                            A0L[0] = str2;
                            C36341k9.A0s(this, waTextView2, A0L, R.string.f12nameremoved);
                            WaImageView waImageView = this.A04;
                            if (waImageView == null) {
                                throw C36331k8.A0d("closeButton");
                            }
                            C36391kE.A1I(waImageView, this, 4);
                            WDSButton wDSButton = this.A0A;
                            if (wDSButton == null) {
                                throw C36331k8.A0d("doneButton");
                            }
                            C36391kE.A1I(wDSButton, this, 3);
                            return;
                        }
                        throw C36331k8.A0d("phoenixUpiTransactionConfirmationViewModelFactory");
                    }
                    throw C165577te.A0c(": Formatted amount is null", C165567td.A0b(this));
                }
                throw C165577te.A0c(": Merchant Name is null", C165567td.A0b(this));
            }
            throw C165577te.A0c(": FDS Manager ID is null", C165567td.A0b(this));
        }
        throw C36331k8.A0d("fcsActivityLifecycleManagerFactory");
    }

    public IndiaUpiFcsTransactionConfirmationActivity() {
        this(0);
        this.A0H = new C23142B7c(this, 1);
    }
}
