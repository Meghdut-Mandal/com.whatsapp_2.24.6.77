package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass09Y;
import X.AnonymousClass17Y;
import X.AnonymousClass1N3;
import X.C012005e;
import X.C1496972k;
import X.C19700wN;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C32711e4;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C48732hx;
import X.C55492ui;
import X.C89384Wi;
import X.C89414Wl;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.deviceauth.BiometricAuthPlugin;

public class EncryptionKeyInputFragment extends Hilt_EncryptionKeyInputFragment {
    public C24801Dv A00;
    public C19700wN A01;
    public AnonymousClass17Y A02;
    public AnonymousClass1N3 A03;
    public EncBackupViewModel A04;
    public C21060yb A05;
    public BiometricAuthPlugin A06;
    public C20810yC A07;
    public C32711e4 A08;
    public Button A09;
    public RelativeLayout A0A;
    public EncryptionKeyFragment A0B;

    public void A1S(Bundle bundle, View view) {
        Resources A0G;
        int i;
        Object[] objArr;
        super.A1Q(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36331k8.A0A(this);
        this.A04 = encBackupViewModel;
        int A0S = encBackupViewModel.A0S();
        View view2 = view;
        TextView A0O = C36391kE.A0O(view2, R.id.enc_backup_encryption_key_input_instructional);
        TextEmojiLabel A0O2 = C36401kF.A0O(view2, R.id.enc_backup_encryption_key_input_forgot);
        int i2 = 64;
        if (A0S == 6 || A0S == 4) {
            C20810yC r11 = this.A07;
            AnonymousClass17Y r2 = this.A02;
            AnonymousClass17Y r16 = r2;
            this.A06 = new BiometricAuthPlugin(A0i(), this.A01, r16, this.A05, new C89414Wl(this, 0), r11, R.string.f12nameremoved, R.string.f12nameremoved);
            SpannableStringBuilder A012 = C32711e4.A01(A0i().getApplicationContext(), new C1496972k(this, 48), C36371kC.A0u(A0O2));
            C36331k8.A1A(this.A07, A0O2);
            A0O2.setText(A012);
            C55492ui.A01(A0m(), this.A04.A04, this, 11);
            if (A0S == 6) {
                A0G = C36341k9.A0G(this);
                i = R.plurals.f10nameremoved;
                objArr = new Object[]{64};
                i2 = 64;
                C36351kA.A16(A0G, A0O, objArr, i, i2);
                AnonymousClass09Y A0S2 = C36411kG.A0S(this);
                EncryptionKeyFragment encryptionKeyFragment = new EncryptionKeyFragment();
                this.A0B = encryptionKeyFragment;
                A0S2.A0B(encryptionKeyFragment, R.id.encryption_key_input_encryption_key_container);
                A0S2.A01();
                this.A09 = (Button) C012005e.A02(view2, R.id.encryption_key_input_next_button);
                this.A0A = (RelativeLayout) C012005e.A02(view2, R.id.enc_key_background);
                A1Z(false);
                C55492ui.A01(A0m(), this.A04.A02, this, 12);
            }
            i2 = 64;
            A0G = C36341k9.A0G(this);
            i = R.plurals.f10nameremoved;
        } else {
            if (A0S == 2) {
                C48732hx.A00(A0O2, this, 20);
                A0G = C36341k9.A0G(this);
                i = R.plurals.f10nameremoved;
            }
            AnonymousClass09Y A0S22 = C36411kG.A0S(this);
            EncryptionKeyFragment encryptionKeyFragment2 = new EncryptionKeyFragment();
            this.A0B = encryptionKeyFragment2;
            A0S22.A0B(encryptionKeyFragment2, R.id.encryption_key_input_encryption_key_container);
            A0S22.A01();
            this.A09 = (Button) C012005e.A02(view2, R.id.encryption_key_input_next_button);
            this.A0A = (RelativeLayout) C012005e.A02(view2, R.id.enc_key_background);
            A1Z(false);
            C55492ui.A01(A0m(), this.A04.A02, this, 12);
        }
        objArr = new Object[]{64};
        C36351kA.A16(A0G, A0O, objArr, i, i2);
        AnonymousClass09Y A0S222 = C36411kG.A0S(this);
        EncryptionKeyFragment encryptionKeyFragment22 = new EncryptionKeyFragment();
        this.A0B = encryptionKeyFragment22;
        A0S222.A0B(encryptionKeyFragment22, R.id.encryption_key_input_encryption_key_container);
        A0S222.A01();
        this.A09 = (Button) C012005e.A02(view2, R.id.encryption_key_input_next_button);
        this.A0A = (RelativeLayout) C012005e.A02(view2, R.id.enc_key_background);
        A1Z(false);
        C55492ui.A01(A0m(), this.A04.A02, this, 12);
    }

    public void A1Z(boolean z) {
        C48732hx r0;
        C89384Wi r02;
        int i;
        this.A09.setEnabled(z);
        Button button = this.A09;
        if (z) {
            r0 = new C48732hx(this, 21);
        } else {
            r0 = null;
        }
        button.setOnClickListener(r0);
        RelativeLayout relativeLayout = this.A0A;
        int i2 = R.drawable.enc_backup_enc_key_bg_disabled;
        if (z) {
            i2 = R.drawable.enc_backup_enc_key_bg;
        }
        relativeLayout.setBackgroundResource(i2);
        EncryptionKeyFragment encryptionKeyFragment = this.A0B;
        CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
        if (codeInputFieldArr != null) {
            CodeInputField codeInputField = codeInputFieldArr[codeInputFieldArr.length - 1];
            if (z) {
                r02 = new C89384Wi(encryptionKeyFragment, 0);
            } else {
                r02 = null;
            }
            codeInputField.setOnEditorActionListener(r02);
            Context A1D = encryptionKeyFragment.A1D();
            if (A1D != null) {
                if (z) {
                    i = C36381kD.A02(encryptionKeyFragment.A1D());
                } else {
                    i = R.color.f6nameremoved;
                }
                for (CodeInputField A0r : encryptionKeyFragment.A04) {
                    C36331k8.A0r(A1D, A0r, i);
                }
            }
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
