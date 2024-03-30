package com.whatsapp.emoji;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass17Y;
import X.AnonymousClass1H2;
import X.AnonymousClass1JZ;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1XN;
import X.AnonymousClass22t;
import X.AnonymousClass2gA;
import X.AnonymousClass3J6;
import X.AnonymousClass3UG;
import X.AnonymousClass3Y0;
import X.AnonymousClass4U0;
import X.AnonymousClass4WJ;
import X.AnonymousClass6O1;
import X.C012005e;
import X.C1261362r;
import X.C18820ts;
import X.C19420v0;
import X.C19700wN;
import X.C19890wg;
import X.C20810yC;
import X.C21060yb;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C56002vY;
import X.C66763Xf;
import X.C81113wU;
import X.C88314Sf;
import X.C89604Xe;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class EmojiEditTextBottomSheetDialogFragment extends Hilt_EmojiEditTextBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public C19700wN A03;
    public AnonymousClass17Y A04;
    public WaEditText A05;
    public C21060yb A06;
    public C19420v0 A07;
    public C18820ts A08;
    public AnonymousClass4U0 A09;
    public AnonymousClass1N0 A0A;
    public C1261362r A0B;
    public AnonymousClass6O1 A0C;
    public AnonymousClass1XN A0D;
    public AnonymousClass1H2 A0E;
    public EmojiSearchProvider A0F;
    public C20810yC A0G;
    public C19890wg A0H;
    public AnonymousClass1N2 A0I;
    public WDSButton A0J;
    public String[] A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S = 0;
    public ImageButton A0T;
    public WDSButton A0U;
    public String A0V;
    public final C88314Sf A0W = new C89604Xe(this, 5);

    public static EmojiEditTextBottomSheetDialogFragment A03(String str, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("dialogId", i);
        A072.putInt("hintResId", i2);
        A072.putInt("titleResId", i3);
        A072.putInt("messageResId", i4);
        A072.putInt("emptyErrorResId", i5);
        A072.putString("defaultStr", str);
        A072.putInt("maxLength", i6);
        A072.putInt("inputType", i7);
        A072.putStringArray("codepointBlacklist", strArr);
        A072.putBoolean("shouldHideEmojiBtn", false);
        A072.putString("supportedDigits", (String) null);
        A072.putBoolean("allowBlank", z);
        emojiEditTextBottomSheetDialogFragment.A17(A072);
        return emojiEditTextBottomSheetDialogFragment;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        View inflate = C36381kD.A0J(this).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.dialog_title_tv);
        int i = this.A0N;
        if (i != 0) {
            A0O2.setText(i);
        }
        if (this.A0M != 0) {
            TextView textView = (TextView) C36401kF.A0E(C36431kI.A0M(inflate, R.id.message_text_view_stub), R.layout.f9nameremoved);
            textView.setText(this.A0M);
            textView.setVisibility(0);
        }
        WaEditText waEditText = (WaEditText) C012005e.A02(inflate, R.id.edit_text);
        this.A05 = waEditText;
        int i2 = this.A0S;
        if (i2 != 0) {
            waEditText.setHint(i2);
        }
        this.A0J = C36441kJ.A0u(inflate, R.id.save_button);
        if (!this.A0P) {
            AnonymousClass4WJ.A00(this.A05, this, 9);
            this.A0J.setEnabled(false);
        }
        TextView A0O3 = C36391kE.A0O(inflate, R.id.counter_tv);
        AnonymousClass1JZ.A09(this.A05, this.A08);
        if (this.A02 > 0) {
            A0O3.setVisibility(0);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i3 = this.A02;
        if (i3 > 0) {
            A0I2.add(new C66763Xf(i3));
        }
        if (!A0I2.isEmpty()) {
            this.A05.setFilters((InputFilter[]) A0I2.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A05;
        AnonymousClass1H2 r9 = this.A0E;
        waEditText2.addTextChangedListener(new AnonymousClass2gA(waEditText2, A0O3, this.A06, this.A08, this.A0A, r9, this.A0H, this.A02, 0, false, false, false));
        this.A05.setInputType(this.A0L);
        if (!TextUtils.isEmpty(this.A0O)) {
            this.A05.setKeyFilter(this.A0O);
        }
        this.A05.A0C(true);
        this.A02.getWindow().setAttributes(C36381kD.A0M(this.A02.getWindow()));
        AnonymousClass3Y0.A01(this.A0J, this, 28);
        WDSButton A0u = C36441kJ.A0u(inflate, R.id.cancel_button);
        this.A0U = A0u;
        if (A0u != null) {
            AnonymousClass3Y0.A01(A0u, this, 29);
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(R.id.emoji_edit_text_layout);
        keyboardPopupLayout.A05 = true;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_btn);
        this.A0T = imageButton;
        AnonymousClass01I A0h = A0h();
        C20810yC r18 = this.A0G;
        C19700wN r15 = this.A03;
        AnonymousClass1H2 r14 = this.A0E;
        AnonymousClass1XN r13 = this.A0D;
        C21060yb r10 = this.A06;
        C18820ts r92 = this.A08;
        C1261362r r8 = this.A0B;
        EmojiSearchProvider emojiSearchProvider = this.A0F;
        C19420v0 r6 = this.A07;
        C19890wg r5 = this.A0H;
        WaEditText waEditText3 = this.A05;
        AnonymousClass1N2 r31 = this.A0I;
        WaEditText waEditText4 = waEditText3;
        C21060yb r21 = r10;
        C19420v0 r22 = r6;
        ImageButton imageButton2 = imageButton;
        C19700wN r182 = r15;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        AnonymousClass22t r152 = new AnonymousClass22t(A0h, imageButton2, r182, keyboardPopupLayout2, waEditText4, r21, r22, r92, r8, this.A0C, r13, r14, emojiSearchProvider, r18, r5, r31, 27, (Integer) null);
        AnonymousClass3J6.A00(new AnonymousClass3J6(A0h(), r152, (EmojiSearchContainer) inflate.findViewById(R.id.emoji_search_container)), this, 3);
        r152.A0H(this.A0W);
        r152.A0F = new C81113wU((Object) this, 47);
        this.A05.setText(AnonymousClass3UG.A05(A0h(), this.A0E, this.A0V));
        if (!TextUtils.isEmpty(this.A0V)) {
            this.A05.selectAll();
        }
        this.A02.setOnShowListener(new C56002vY(this, 3));
        Bundle bundle2 = bundle;
        if (bundle == null) {
            z = true;
        } else {
            z = bundle2.getBoolean("is_keyboard_showing");
        }
        this.A0Q = z;
        if (this.A0R) {
            C36421kH.A0s(this.A0T);
        }
        return inflate;
    }

    public void A19() {
        super.A19();
        this.A09 = null;
    }

    public void A1L() {
        super.A1L();
        this.A05.requestFocus();
        if (this.A0Q) {
            this.A05.A0C(false);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.02E] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1O(android.content.Context r3) {
        /*
            r2 = this;
            super.A1O(r3)
            X.02E r1 = r2.A0I
            boolean r0 = r1 instanceof X.AnonymousClass4U0
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x000a:
            X.4U0 r3 = (X.AnonymousClass4U0) r3
            r2.A09 = r3
            return
        L_0x000f:
            boolean r0 = r3 instanceof X.AnonymousClass4U0
            if (r0 != 0) goto L_0x000a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Activity/Fragment must implement "
            r1.append(r0)
            java.lang.Class<X.4U0> r0 = X.AnonymousClass4U0.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment.A1O(android.content.Context):void");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
        Bundle A0b = A0b();
        this.A00 = A0b.getInt("dialogId");
        this.A0N = A0b.getInt("titleResId");
        this.A0M = A0b.getInt("messageResId");
        this.A01 = A0b.getInt("emptyErrorResId");
        this.A0S = A0b.getInt("hintResId");
        this.A0V = A0b.getString("defaultStr");
        this.A02 = A0b.getInt("maxLength");
        this.A0L = A0b.getInt("inputType");
        this.A0K = A0b.getStringArray("codepointBlacklist");
        this.A0R = A0b.getBoolean("shouldHideEmojiBtn");
        this.A0O = A0b.getString("supportedDigits");
        this.A0P = A0b.getBoolean("allowBlank");
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        boolean A002 = AnonymousClass1N2.A00(this.A05);
        this.A0Q = A002;
        bundle.putBoolean("is_keyboard_showing", A002);
    }
}
