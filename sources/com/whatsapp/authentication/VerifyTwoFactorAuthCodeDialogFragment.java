package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass01I;
import X.AnonymousClass09Y;
import X.AnonymousClass17Y;
import X.AnonymousClass3LN;
import X.AnonymousClass3M1;
import X.AnonymousClass4VT;
import X.C1496972k;
import X.C18740tg;
import X.C19770wU;
import X.C21060yb;
import X.C29011Uz;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C56002vY;
import X.C81283wl;
import X.C88614Tj;
import X.C90044Yw;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements C88614Tj {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public AnonymousClass17Y A04;
    public C21060yb A05;
    public C29011Uz A06;
    public C19770wU A07;
    public final Handler A08 = new AnonymousClass4VT(Looper.getMainLooper(), this, 1);
    public final Runnable A09 = new C1496972k(this, 34);

    public void Bjj(int i) {
        if (this.A00 == 1) {
            this.A00 = 0;
            this.A04.A0G(this.A09);
            this.A04.A0I(new C81283wl((Object) this, i, 10), 500);
        }
    }

    public void Bjk() {
        if (this.A00 == 1) {
            this.A00 = 3;
            this.A04.A0G(this.A09);
            this.A04.A0I(new C1496972k(this, 35), 500);
        }
    }

    public static void A03(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        AnonymousClass01I A0h = verifyTwoFactorAuthCodeDialogFragment.A0h();
        if (A0h != null) {
            AnonymousClass09Y A0O = C36341k9.A0O(A0h);
            A0O.A08(verifyTwoFactorAuthCodeDialogFragment);
            A0O.A03 = 8194;
            A0O.A02();
        }
    }

    public void A1K() {
        super.A1K();
        List list = this.A06.A09;
        C18740tg.A0C(list.contains(this));
        list.remove(this);
    }

    public void A1L() {
        super.A1L();
        List list = this.A06.A09;
        C18740tg.A0C(!list.contains(this));
        list.add(this);
    }

    public Dialog A1a(Bundle bundle) {
        Dialog dialog = new Dialog(A0i());
        dialog.requestWindowFeature(1);
        C36371kC.A1G(dialog.getWindow(), 0);
        dialog.setContentView(R.layout.f9nameremoved);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(R.id.nag_text);
        C36331k8.A1A(this.A02, textEmojiLabel);
        C36331k8.A16(textEmojiLabel, this.A05);
        textEmojiLabel.setText(AnonymousClass3LN.A01(new C1496972k(this, 37), A0n(R.string.f12nameremoved), "forgot-pin"));
        this.A02 = (TextView) dialog.findViewById(R.id.error);
        this.A03 = (CodeInputField) dialog.findViewById(R.id.code);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, 6, 0);
        String A0o = A0o(R.string.f12nameremoved, objArr);
        CodeInputField codeInputField = this.A03;
        codeInputField.A0H(new C90044Yw(this, 0), new AnonymousClass3M1(codeInputField.getContext(), 0), (String) null, A0o, '*', '*', 6);
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(R.id.progress_bar_code_input_blocked);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new C56002vY(this, 0));
        dialog.getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        return dialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        int i = this.A00;
        if (i != 2 && i != 4) {
            C36341k9.A15(this);
        }
    }
}
