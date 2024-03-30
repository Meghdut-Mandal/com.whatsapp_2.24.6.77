package com.whatsapp.payments.ui.international;

import X.AEA;
import X.AVY;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.BAA;
import X.C000800j;
import X.C001400p;
import X.C135086c7;
import X.C146356vT;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165617ti;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C175898bF;
import X.C179108jC;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C201659k4;
import X.C202059ky;
import X.C20380xT;
import X.C203889p7;
import X.C207249un;
import X.C22196AiJ;
import X.C22434AmZ;
import X.C22435Ama;
import X.C23140B7a;
import X.C24611Dc;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C54932tn;
import X.C90514aH;
import X.C93154fy;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class IndiaUpiInternationalActivationActivity extends C179108jC {
    public long A00;
    public DatePicker A01;
    public ProgressBar A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public C175748az A05;
    public C135086c7 A06;
    public C20380xT A07;
    public C32681e1 A08;
    public WDSButton A09;
    public boolean A0A;
    public final C24611Dc A0B;
    public final AnonymousClass00T A0C;

    public void BZk(C202059ky r11, String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str, 0);
        if (str.length() > 0) {
            C175748az r2 = this.A05;
            if (r2 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            String str3 = r2.A0B;
            C135086c7 r0 = this.A06;
            if (r0 == null) {
                throw C36331k8.A0d("seqNumber");
            }
            String str4 = (String) r0.A00;
            C175898bF r4 = r2.A08;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            C175818b6 r42 = (C175818b6) r4;
            C175748az r02 = this.A05;
            if (r02 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            A4H(r42, str2, str3, str4, (String) C207249un.A06(r02), 3);
        } else if (r11 != null && !AEA.A02(this, "upi-list-keys", r11.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                C173858Tk.A0w(this);
            } else {
                A4D();
            }
        }
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
            this.A08 = C36351kA.A0p(r1);
            this.A07 = C36331k8.A0I(r2);
        }
    }

    public void BgO(C202059ky r3) {
        throw AnonymousClass001.A0E(this.A0B.A03("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C175748az r0 = (C175748az) C173858Tk.A07(this);
        if (r0 != null) {
            this.A05 = r0;
        }
        this.A06 = C165617ti.A0P(C146356vT.A00(), String.class, C173858Tk.A0J(this), "upiSequenceNumber");
        C165567td.A0j(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A04 = (TextInputLayout) C36361kB.A0D(this, R.id.start_date);
        this.A00 = System.currentTimeMillis();
        DateFormat dateInstance = DateFormat.getDateInstance(2, C36401kF.A0x(this.A00));
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout == null) {
            throw C36331k8.A0d("startDateInputLayout");
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            editText.setEnabled(false);
        }
        TextInputLayout textInputLayout2 = this.A04;
        if (textInputLayout2 == null) {
            throw C36331k8.A0d("startDateInputLayout");
        }
        EditText editText2 = textInputLayout2.A0B;
        if (editText2 != null) {
            C165597tg.A13(editText2, dateInstance, this.A00);
        }
        TextInputLayout textInputLayout3 = (TextInputLayout) C36361kB.A0D(this, R.id.end_date);
        this.A03 = textInputLayout3;
        if (textInputLayout3 == null) {
            throw C36331k8.A0d("endDateInputLayout");
        }
        EditText editText3 = textInputLayout3.A0B;
        C18740tg.A04(editText3);
        AnonymousClass00C.A08(editText3);
        Calendar instance = Calendar.getInstance();
        DateFormat dateInstance2 = DateFormat.getDateInstance(2, C36401kF.A0x(this.A00));
        instance.add(5, 89);
        C165597tg.A13(editText3, dateInstance2, instance.getTimeInMillis());
        C93154fy r7 = new C93154fy(new C203889p7(editText3, this, dateInstance2, 1), this, (Calendar) null, R.style.f13nameremoved, instance.get(1), instance.get(2), instance.get(5));
        C36371kC.A1F(editText3, this, r7, 42);
        DatePicker datePicker = r7.A01;
        AnonymousClass00C.A08(datePicker);
        this.A01 = datePicker;
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.activate_international_payment_description);
        C32681e1 r10 = this.A08;
        if (r10 != null) {
            Context context = A0I.getContext();
            if (getIntent().getBooleanExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", false)) {
                Object[] A0M = AnonymousClass001.A0M();
                C201659k4 r4 = this.A0N;
                C175748az r02 = this.A05;
                if (r02 == null) {
                    throw C36331k8.A0d("paymentBankAccount");
                }
                A0M[0] = r4.A03(r02);
                str = C36391kE.A0v(this, "supported-countries-faq", A0M, 1, R.string.f12nameremoved);
            } else {
                str = C36351kA.A0w(this, "supported-countries-faq", 1, R.string.f12nameremoved);
            }
            AnonymousClass00C.A0B(str);
            String[] strArr = {"supported-countries-faq"};
            String[] strArr2 = new String[1];
            C20380xT r42 = this.A07;
            if (r42 != null) {
                C90514aH.A1Q(r42.A02("1293279751500598"), strArr2, 0);
                SpannableString A012 = r10.A01(context, str, new Runnable[]{new AVY(this, 39)}, strArr, strArr2);
                C36331k8.A16(A0I, this.A08);
                C36331k8.A1A(this.A0D, A0I);
                A0I.setText(A012);
                this.A02 = (ProgressBar) C36361kB.A0H(this, R.id.turn_on_button_spinner);
                this.A09 = (WDSButton) C36361kB.A0H(this, R.id.continue_button);
                C54932tn.A00(this, R.drawable.onboarding_actionbar_home_close);
                AnonymousClass00T r3 = this.A0C;
                BAA.A00(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A00, new C22435Ama(this), 11);
                BAA.A00(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A06, new C22434AmZ(this), 10);
                WDSButton wDSButton = this.A09;
                if (wDSButton == null) {
                    throw C36331k8.A0d("buttonView");
                }
                C36421kH.A12(wDSButton, this, 6);
                return;
            }
            throw C36331k8.A0d("faqLinkFactory");
        }
        throw C36331k8.A0b();
    }

    public IndiaUpiInternationalActivationActivity(int i) {
        this.A0A = false;
        C23140B7a.A00(this, 7);
    }

    public static final long A0z(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), 0, 0, 0).getTimeInMillis();
    }

    public IndiaUpiInternationalActivationActivity() {
        this(0);
        this.A0B = C165587tf.A0X("IndiaUpiInternationalActivationActivity");
        this.A0C = C001400p.A00(C000800j.NONE, new C22196AiJ(this));
    }
}
