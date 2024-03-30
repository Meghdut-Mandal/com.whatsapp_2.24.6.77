package com.whatsapp.twofactor;

import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass3LN;
import X.AnonymousClass3LW;
import X.AnonymousClass4WJ;
import X.AnonymousClass4XQ;
import X.C20810yC;
import X.C21060yb;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C39001qm;
import X.C48772i1;
import X.C81183wb;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

public class SetEmailFragment extends Hilt_SetEmailFragment {
    public int A00;
    public EditText A01;
    public TextView A02;
    public C21060yb A03;
    public C20810yC A04;
    public TwoFactorAuthActivity A05;
    public TextWatcher A06 = new AnonymousClass4WJ(this, 20);
    public Button A07;

    public void A1J() {
        this.A02 = null;
        this.A01 = null;
        this.A07 = null;
        this.A05 = null;
        super.A1J();
    }

    public class ConfirmSkipEmailDialog extends Hilt_SetEmailFragment_ConfirmSkipEmailDialog {
        public Dialog A1a(Bundle bundle) {
            C39001qm A02 = AnonymousClass3LW.A02(this);
            A02.A0c(R.string.f12nameremoved);
            C39001qm.A03(new AnonymousClass4XQ(this, 13), A02, R.string.f12nameremoved);
            return A02.create();
        }
    }

    public static void A00(SetEmailFragment setEmailFragment) {
        Button button = setEmailFragment.A07;
        if (button != null) {
            String A0f = C36331k8.A0f(setEmailFragment.A01);
            int indexOf = A0f.indexOf(64);
            boolean z = true;
            if (indexOf <= 0 || indexOf >= A0f.length() - 1 || indexOf != A0f.lastIndexOf(64)) {
                z = false;
            }
            button.setEnabled(z);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1L() {
        String str;
        super.A1L();
        EditText editText = this.A01;
        TextWatcher textWatcher = this.A06;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.A01;
        int i = this.A00;
        TwoFactorAuthActivity twoFactorAuthActivity = this.A05;
        if (i == 1) {
            str = twoFactorAuthActivity.A04;
        } else {
            str = twoFactorAuthActivity.A05;
        }
        editText2.setText(str);
        this.A01.addTextChangedListener(textWatcher);
        A00(this);
        this.A01.requestFocus();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A00 = A0b().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        this.A05 = (TwoFactorAuthActivity) A0h();
        Button button = (Button) view.findViewById(R.id.submit);
        this.A07 = button;
        C48772i1.A00(button, this, 33);
        this.A01 = (EditText) view.findViewById(R.id.email);
        this.A02 = C36391kE.A0P(view, R.id.error);
        TextEmojiLabel A0P = C36401kF.A0P(view, R.id.description);
        int i2 = this.A00;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                A0P.setText(R.string.f12nameremoved);
                this.A07.setText(R.string.f12nameremoved);
                i = 1;
            }
            i = 0;
        } else {
            if (this.A05.A07[0] != 2) {
                C36331k8.A1A(this.A04, A0P);
                C36331k8.A16(A0P, this.A03);
                String A0n = A0n(R.string.f12nameremoved);
                int A002 = AnonymousClass00F.A00(A1D(), C36341k9.A05(A1D()));
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(A1D(), R.style.f13nameremoved);
                C81183wb A003 = C81183wb.A00(this, 36);
                HashMap A0J = AnonymousClass001.A0J();
                A0J.put("skip", A003);
                A0P.setText(AnonymousClass3LN.A00(textAppearanceSpan, A0n, A0J, A002, false));
            } else {
                A0P.setText(R.string.f12nameremoved);
            }
            this.A07.setText(R.string.f12nameremoved);
            i = 0;
        }
        TwoFactorAuthActivity twoFactorAuthActivity = this.A05;
        if (!twoFactorAuthActivity.A3l(this) || twoFactorAuthActivity.A07.length == 1) {
            i3 = i;
        }
        twoFactorAuthActivity.A3i(view, i3);
    }
}
