package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass17Y;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass2gA;
import X.BA2;
import X.C012005e;
import X.C131606Ps;
import X.C166207vL;
import X.C18740tg;
import X.C18820ts;
import X.C19890wg;
import X.C207359uy;
import X.C21060yb;
import X.C23041B1m;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C66763Xf;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiEditTransactionDescriptionFragment extends Hilt_IndiaUpiEditTransactionDescriptionFragment {
    public AnonymousClass17Y A00;
    public WaEditText A01;
    public WaTextView A02;
    public C21060yb A03;
    public C18820ts A04;
    public AnonymousClass1N0 A05;
    public AnonymousClass1H2 A06;
    public AF7 A07;
    public C23041B1m A08;
    public C19890wg A09;
    public WDSButton A0A;
    public String A0B;

    public void A1S(Bundle bundle, View view) {
        String string = A0b().getString("arg_payment_description");
        C18740tg.A06(string);
        this.A0B = string;
        View view2 = view;
        C207359uy.A00(C012005e.A02(view2, R.id.common_action_bar_header_back), this, 15);
        this.A0A = C36431kI.A0y(view2, R.id.save_description_button);
        this.A02 = C36401kF.A0Q(view2, R.id.payment_description_error);
        WaEditText waEditText = (WaEditText) C012005e.A02(view2, R.id.payment_description_text);
        this.A01 = waEditText;
        waEditText.requestFocus();
        this.A01.addTextChangedListener(new BA2(this, 1));
        AnonymousClass1H2 r11 = this.A06;
        C21060yb r8 = this.A03;
        C18820ts r9 = this.A04;
        C19890wg r12 = this.A09;
        AnonymousClass2gA r5 = new AnonymousClass2gA(this.A01, C36391kE.A0O(view2, R.id.counter), r8, r9, this.A05, r11, r12, 50, 0, true, false, false);
        this.A01.setFilters(new InputFilter[]{new C66763Xf(50)});
        this.A01.addTextChangedListener(r5);
        if (!TextUtils.isEmpty(this.A0B) && this.A01.getText() != null) {
            this.A01.setText(this.A0B);
            WaEditText waEditText2 = this.A01;
            waEditText2.setSelection(waEditText2.getText().length());
        }
        C207359uy.A00(C012005e.A02(view2, R.id.save_description_button), this, 14);
        TextView A0O = C36391kE.A0O(view2, R.id.payment_description_disclaimer_text);
        String A0n = A0n(R.string.f12nameremoved);
        String A0o = A0o(R.string.f12nameremoved, A0n);
        SpannableStringBuilder A0P = C36441kJ.A0P(A0o);
        C166207vL r4 = new C166207vL(this);
        int length = A0o.length();
        A0P.setSpan(r4, length - A0n.length(), length, 33);
        A0O.setText(A0P);
        A0O.setLinksClickable(true);
        A0O.setMovementMethod(LinkMovementMethod.getInstance());
        this.A07.BOp((C131606Ps) null, 0, (Integer) null, "payment_description", (String) null);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
