package com.whatsapp.payments.ui.widget;

import X.A8T;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16X;
import X.AnonymousClass1QZ;
import X.AnonymousClass3LN;
import X.AnonymousClass9S4;
import X.B88;
import X.C012005e;
import X.C123415wS;
import X.C147386x8;
import X.C165577te;
import X.C165587tf;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C21100yf;
import X.C21688AWi;
import X.C23141B7b;
import X.C24611Dc;
import X.C24631De;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90514aH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

public class IndiaUpiDisplaySecureQrCodeView extends LinearLayout implements C18700tb {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass9S4 A09;
    public QrImageView A0A;
    public C21100yf A0B;
    public C18820ts A0C;
    public AnonymousClass16T A0D;
    public C24631De A0E;
    public PaymentAmountInputField A0F;
    public IndiaUpiSecureQrCodeViewModel A0G;
    public AnonymousClass1QZ A0H;
    public boolean A0I;
    public final C24611Dc A0J;

    public void A01() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A0B = C36431kI.A0W(r1);
            this.A0C = C36341k9.A0T(r1);
            this.A0E = (C24631De) C165577te.A0f(r1);
            this.A0D = C165587tf.A0Q(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0H;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public String getUserInputAmount() {
        return C36361kB.A0n(this.A0F);
    }

    public void setup(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel) {
        this.A0G = indiaUpiSecureQrCodeViewModel;
        C36421kH.A12(this.A03, indiaUpiSecureQrCodeViewModel, 38);
        this.A08.setText(AnonymousClass3LN.A01(C21688AWi.A00, getContext().getString(R.string.f12nameremoved), "try-again"));
        C36421kH.A12(this.A08, indiaUpiSecureQrCodeViewModel, 39);
        this.A0F.A04 = findViewById(R.id.send_payment_amount_container);
        this.A0F.setOnFocusChangeListener(new B88(this, 2));
        this.A0F.setErrorTextView(this.A07);
        this.A0F.setOnEditorActionListener(new C23141B7b(this, 2));
        this.A0F.A00 = new A8T(this);
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0J = C165587tf.A0X("IndiaUpiDisplaySecureQrCodeView");
        A00();
    }

    private void A00() {
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(R.id.qr_code);
        this.A05 = C36391kE.A0O(this, R.id.add_amount);
        this.A06 = C36391kE.A0O(this, R.id.display_payment_amount);
        this.A07 = C36391kE.A0O(this, R.id.amount_input_error_text);
        this.A02 = C36401kF.A0G(this, R.id.dashed_underline);
        this.A0F = (PaymentAmountInputField) C012005e.A02(this, R.id.user_payment_amount);
        AnonymousClass16U A012 = this.A0D.A01("INR");
        PaymentAmountInputField paymentAmountInputField = this.A0F;
        paymentAmountInputField.A0A = A012;
        paymentAmountInputField.A03 = 1;
        AnonymousClass16X A0P = C165587tf.A0P(C21100yf.A1l, this.A0B, A012);
        this.A0F.A0C = new C147386x8(getContext(), this.A0C, A012, A0P, A0P, A0P, (C123415wS) null);
        this.A03 = C90514aH.A0U(this, R.id.add_or_display_amount);
        this.A00 = C012005e.A02(this, R.id.user_amount_input);
        this.A04 = C36441kJ.A0U(this, R.id.qr_code_signing_secure_title_container);
        this.A08 = C36391kE.A0P(this, R.id.qr_code_signing_retry_text);
        this.A01 = (FrameLayout) findViewById(R.id.progress_container);
    }

    public AnonymousClass9S4 getQrCode() {
        return this.A09;
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A0J = C165587tf.A0X("IndiaUpiDisplaySecureQrCodeView");
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A0J = C165587tf.A0X("IndiaUpiDisplaySecureQrCodeView");
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context) {
        super(context);
        A01();
        this.A0J = C165587tf.A0X("IndiaUpiDisplaySecureQrCodeView");
        A00();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
