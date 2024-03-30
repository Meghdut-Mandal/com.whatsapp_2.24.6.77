package com.whatsapp.payments.ui.widget;

import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C224514j;
import X.C34081gQ;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PaymentMethodRow extends LinearLayout implements C18700tb {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public ShimmerFrameLayout A03;
    public WaImageView A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public View A07;
    public RadioButton A08;
    public TextView A09;
    public CopyableTextView A0A;

    public void A00() {
        this.A08.setVisibility(0);
        this.A04.setVisibility(8);
        C34081gQ.A02(this.A07);
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public void A04(boolean z) {
        TextView textView = this.A02;
        Context context = getContext();
        if (!z) {
            C36331k8.A0r(context, textView, R.color.f6nameremoved);
            this.A07.setBackground((Drawable) null);
            return;
        }
        C36331k8.A0r(context, textView, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAccountId(String str) {
        this.A0A.setText(str);
        this.A0A.setVisibility(C36381kD.A00(TextUtils.isEmpty(str) ? 1 : 0));
    }

    public void setIconBackground(Drawable drawable) {
        this.A00.setBackground(drawable);
    }

    public void setIconScaleType(ImageView.ScaleType scaleType) {
        this.A00.setScaleType(scaleType);
    }

    public void setRadioButtonChecked(boolean z) {
        this.A08.setChecked(z);
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A01();
    }

    public void A01() {
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A07 = C012005e.A02(this, R.id.payment_method_row_container);
        this.A00 = C36401kF.A0G(this, R.id.payment_method_provider_icon);
        this.A02 = C36391kE.A0O(this, R.id.payment_method_bank_name);
        this.A0A = (CopyableTextView) C012005e.A02(this, R.id.payment_method_account_id);
        this.A09 = C36391kE.A0O(this, R.id.payment_method_provider_name);
        this.A04 = C36431kI.A0X(this, R.id.payment_method_decorate_icon);
        this.A08 = (RadioButton) C012005e.A02(this, R.id.payment_method_radio_button);
        this.A01 = C36391kE.A0O(this, R.id.payment_branding);
        this.A03 = (ShimmerFrameLayout) C012005e.A02(this, R.id.payment_method_name_shimmer);
        this.A0A.setVisibility(8);
        this.A09.setVisibility(8);
        this.A04.setVisibility(8);
        this.A01.setVisibility(8);
        this.A03.A01();
    }

    public void A03(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A09.setVisibility(8);
            C36391kE.A1K(this.A09);
            return;
        }
        boolean contains = str.contains("\n");
        TextView textView = this.A09;
        if (contains) {
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
            this.A09.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.A09.setText(str);
        this.A09.setVisibility(0);
    }

    public void A05(boolean z) {
        C012005e.A02(this, R.id.account_number_divider).setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public int getLayoutRes() {
        return R.layout.f9nameremoved;
    }

    public ImageView getMethodIconView() {
        return this.A00;
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context) {
        super(context);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
