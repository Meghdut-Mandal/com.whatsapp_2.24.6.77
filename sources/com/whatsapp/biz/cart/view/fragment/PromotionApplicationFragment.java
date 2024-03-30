package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass04H;
import X.AnonymousClass60S;
import X.AnonymousClass7S0;
import X.C012005e;
import X.C102194zS;
import X.C128826Dt;
import X.C138346hi;
import X.C138496iC;
import X.C165097ss;
import X.C165147sx;
import X.C167627yS;
import X.C18820ts;
import X.C21060yb;
import X.C222813r;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C67113Yo;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class PromotionApplicationFragment extends Hilt_PromotionApplicationFragment {
    public TextInputLayout A00;
    public AnonymousClass60S A01;
    public C21060yb A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C102194zS r9, com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment r10) {
        /*
            r7 = 0
            if (r9 == 0) goto L_0x003c
            com.google.android.material.textfield.TextInputLayout r8 = r10.A00
            if (r8 == 0) goto L_0x0037
            boolean r0 = r9 instanceof X.C102184zR
            if (r0 != 0) goto L_0x002d
            boolean r0 = r9 instanceof X.C102174zQ
            if (r0 == 0) goto L_0x0052
            X.0ts r6 = r10.A01
            if (r6 == 0) goto L_0x002d
            r5 = 2131888513(0x7f120981, float:1.9411663E38)
            r4 = 1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r2 = 0
            X.4zQ r9 = (X.C102174zQ) r9
            X.6Tk r1 = r9.A00
            java.math.BigDecimal r0 = r9.A01
            java.lang.String r0 = r1.A03(r6, r0, r4)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r0 = X.C36401kF.A0q(r10, r0, r3, r2, r5)
            if (r0 != 0) goto L_0x0034
        L_0x002d:
            r0 = 2131893264(0x7f121c10, float:1.94213E38)
            java.lang.String r0 = r10.A0n(r0)
        L_0x0034:
            r8.setError(r0)
        L_0x0037:
            com.google.android.material.textfield.TextInputLayout r1 = r10.A00
            if (r1 != 0) goto L_0x004e
        L_0x003b:
            return
        L_0x003c:
            com.google.android.material.textfield.TextInputLayout r0 = r10.A00
            if (r0 == 0) goto L_0x0043
            r0.setError(r7)
        L_0x0043:
            com.google.android.material.textfield.TextInputLayout r1 = r10.A00
            if (r1 == 0) goto L_0x003b
            r0 = 2131886504(0x7f1201a8, float:1.9407589E38)
            java.lang.String r7 = r10.A0n(r0)
        L_0x004e:
            r1.setHelperText(r7)
            return
        L_0x0052:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment.A03(X.4zS, com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment):void");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1R(Bundle bundle) {
        EditText editText;
        Editable text;
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        TextInputLayout textInputLayout = this.A00;
        if (textInputLayout != null && (editText = textInputLayout.A0B) != null && (text = editText.getText()) != null) {
            bundle.putString("store.coupon.input.key", text.toString());
        }
    }

    public void A1S(Bundle bundle, View view) {
        C167627yS r2;
        EditText editText;
        C128826Dt A0S;
        String string;
        AnonymousClass60S r1;
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass02E r3 = this.A0I;
        if (r3 == null) {
            r3 = this;
        }
        Bundle bundle2 = this.A0A;
        EditText editText2 = null;
        if (bundle2 == null || (string = bundle2.getString("business.jid.arg")) == null || (r1 = this.A01) == null) {
            r2 = null;
        } else {
            C222813r r0 = UserJid.Companion;
            r2 = (C167627yS) new AnonymousClass04H(new C138496iC(r1.A00(C222813r.A01(string))), r3).A00(C167627yS.class);
        }
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.input_promo);
        this.A00 = textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setHint((CharSequence) A0n(R.string.f12nameremoved));
        }
        A03((C102194zS) null, this);
        TextInputLayout textInputLayout2 = this.A00;
        if (!(textInputLayout2 == null || (editText = textInputLayout2.A0B) == null)) {
            editText.setInputType(49152);
            C012005e.A0W(editText, C138346hi.A00, new String[]{"image/*"});
            if (!(r2 == null || (A0S = r2.A0S()) == null)) {
                editText.setText(A0S.A06);
            }
            editText2 = editText;
            editText.addTextChangedListener(new C165097ss(this, 2));
            editText.requestFocus();
        }
        C67113Yo.A00(view.findViewById(R.id.apply_promo_button), editText2, this, r2, 5);
        if (r2 != null) {
            C165147sx.A02(this, r2.A02.A09, new AnonymousClass7S0(this), 33);
        }
        View findViewById = view.findViewById(R.id.close_promotion_application_cta);
        if (findViewById != null) {
            C18820ts r02 = this.A01;
            if (r02 != null && C36401kF.A1X(r02)) {
                findViewById.setScaleX(-1.0f);
            }
            C36421kH.A10(findViewById, this, 35);
        }
    }

    public void A1A(Bundle bundle) {
        String string;
        TextInputLayout textInputLayout;
        EditText editText;
        super.A1A(bundle);
        if (bundle != null && (string = bundle.getString("store.coupon.input.key")) != null && (textInputLayout = this.A00) != null && (editText = textInputLayout.A0B) != null) {
            editText.setText(string);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(2, R.style.f13nameremoved);
    }
}
