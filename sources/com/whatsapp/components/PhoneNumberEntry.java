package com.whatsapp.components;

import X.AUN;
import X.AnonymousClass043;
import X.AnonymousClass04F;
import X.AnonymousClass172;
import X.AnonymousClass1N4;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.AnonymousClass3FT;
import X.AnonymousClass3U2;
import X.AnonymousClass4WI;
import X.AnonymousClass4WJ;
import X.C012005e;
import X.C166267vR;
import X.C18700tb;
import X.C18740tg;
import X.C18800tq;
import X.C203559oI;
import X.C21060yb;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C90364a2;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

public class PhoneNumberEntry extends LinearLayout implements C18700tb, AnonymousClass043 {
    public AnonymousClass1N4 A00;
    public WaEditText A01;
    public WaEditText A02;
    public AnonymousClass3FT A03;
    public C21060yb A04;
    public AnonymousClass1QZ A05;
    public String A06;
    public TextWatcher A07;
    public boolean A08;

    private void A00(Context context, AttributeSet attributeSet) {
        setSaveEnabled(true);
        AnonymousClass04F.A05(this, 0);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A01 = (WaEditText) findViewById(R.id.registration_cc);
        WaEditText waEditText = (WaEditText) findViewById(R.id.registration_phone);
        this.A02 = waEditText;
        waEditText.setSaveEnabled(false);
        this.A01.setSaveEnabled(false);
        this.A01.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        this.A02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
        this.A02.setTextDirection(3);
        C90364a2 r2 = new C90364a2(this, 0);
        WaEditText waEditText2 = this.A01;
        waEditText2.A01 = r2;
        this.A02.A01 = r2;
        AnonymousClass4WJ.A00(waEditText2, this, 3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0E);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            C012005e.A0F(colorStateList, this.A02);
            C012005e.A0F(colorStateList, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public static String[] A01(AnonymousClass1N4 r6, C21060yb r7, int i, boolean z) {
        ClipboardManager A09;
        ClipData primaryClip;
        String str;
        int i2;
        if (!((i != 16908322 && i != 16908337) || (A09 = r7.A09()) == null || (primaryClip = A09.getPrimaryClip()) == null || primaryClip.getItemCount() == 0)) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || itemAt.getText() == null) {
                str = "";
            } else {
                str = itemAt.getText().toString();
            }
            if (!str.startsWith("+")) {
                return null;
            }
            try {
                AUN A0F = C203559oI.A00().A0F(str, (String) null);
                String num = Integer.toString(A0F.countryCode_);
                String A022 = C203559oI.A02(A0F);
                if (z) {
                    i2 = AnonymousClass3U2.A01(r6, num, A022);
                } else {
                    i2 = AnonymousClass3U2.A00(r6, num, A022);
                }
                if (i2 != 1) {
                    return null;
                }
                String[] A1S = C36441kJ.A1S();
                A1S[0] = num;
                A1S[1] = A022;
                return A1S;
            } catch (AnonymousClass172 unused) {
            }
        }
        return null;
    }

    public void A02() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0U(A0W);
            this.A00 = C36351kA.A0K(A0W);
        }
    }

    public void A03(String str) {
        this.A06 = str;
        TextWatcher textWatcher = this.A07;
        if (textWatcher != null) {
            this.A02.removeTextChangedListener(textWatcher);
        }
        try {
            AnonymousClass4WI r1 = new AnonymousClass4WI(0, str, this);
            this.A07 = r1;
            this.A02.addTextChangedListener(r1);
        } catch (NullPointerException unused) {
            Log.e("PhoneNumberEntry/formatter exception");
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C166267vR r3 = (C166267vR) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.A01.setText(r3.A00);
        this.A02.setText(r3.A01);
    }

    public PhoneNumberEntry(Context context) {
        super(context);
        A02();
        A00(context, (AttributeSet) null);
    }

    public WaEditText getCountryCodeField() {
        return this.A01;
    }

    public WaEditText getPhoneNumberField() {
        return this.A02;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable text = this.A01.getText();
        C18740tg.A06(text);
        String obj = text.toString();
        Editable text2 = this.A02.getText();
        C18740tg.A06(text2);
        return new C166267vR(onSaveInstanceState, obj, text2.toString());
    }

    public void setOnPhoneNumberChangeListener(AnonymousClass3FT r1) {
        this.A03 = r1;
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A00(context, attributeSet);
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public PhoneNumberEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context, attributeSet);
    }
}
