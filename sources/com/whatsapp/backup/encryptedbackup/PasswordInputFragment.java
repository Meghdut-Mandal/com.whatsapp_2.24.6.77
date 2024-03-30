package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass3LW;
import X.AnonymousClass3T3;
import X.C001700s;
import X.C012005e;
import X.C132936Vw;
import X.C1496972k;
import X.C163057pa;
import X.C165097ss;
import X.C165147sx;
import X.C18820ts;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C32711e4;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C48732hx;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Normalizer;

public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public CodeInputField A02;
    public EncBackupViewModel A03;
    public C21060yb A04;
    public C18820ts A05;
    public C20810yC A06;
    public C32711e4 A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextEmojiLabel A0B;
    public WDSButton A0C;

    public void A1Z() {
        String str;
        EncBackupViewModel encBackupViewModel;
        C19770wU r2;
        int i;
        if (this instanceof VerifyPasswordFragment) {
            Editable text = this.A02.getText();
            if (text != null) {
                EncBackupViewModel encBackupViewModel2 = this.A03;
                encBackupViewModel2.A05.A0D(Normalizer.normalize(text.toString().trim(), Normalizer.Form.NFKC));
                encBackupViewModel = this.A03;
                C36341k9.A16(encBackupViewModel.A04, 2);
                r2 = encBackupViewModel.A0G;
                i = 47;
            } else {
                return;
            }
        } else if (this instanceof RestorePasswordInputFragment) {
            Editable text2 = this.A02.getText();
            if (text2 != null) {
                EncBackupViewModel encBackupViewModel3 = this.A03;
                encBackupViewModel3.A05.A0D(Normalizer.normalize(text2.toString().trim(), Normalizer.Form.NFKC));
                encBackupViewModel = this.A03;
                boolean A0G = encBackupViewModel.A0F.A0G();
                C001700s r1 = encBackupViewModel.A04;
                if (!A0G) {
                    C36341k9.A16(r1, 4);
                    return;
                }
                C36341k9.A16(r1, 2);
                r2 = encBackupViewModel.A0G;
                i = 45;
            } else {
                return;
            }
        } else if (this instanceof CreatePasswordFragment) {
            Editable text3 = this.A02.getText();
            if (text3 != null) {
                String normalize = Normalizer.normalize(text3.toString().trim(), Normalizer.Form.NFKC);
                AnonymousClass00C.A08(normalize);
                int A002 = C132936Vw.A00(normalize);
                if (A002 == 1) {
                    Resources A0G2 = C36341k9.A0G(this);
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, 6, 0);
                    str = A0G2.getQuantityString(R.plurals.f10nameremoved, 6, objArr);
                } else if (A002 == 2) {
                    Resources A0G3 = C36341k9.A0G(this);
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1L(objArr2, 1, 0);
                    str = A0G3.getQuantityString(R.plurals.f10nameremoved, 1, objArr2);
                } else if (A002 == 3) {
                    str = A0n(R.string.f12nameremoved);
                } else if (A002 == 4) {
                    this.A03.A05.A0D(normalize);
                    C36341k9.A16(this.A03.A03, 400);
                    return;
                } else {
                    return;
                }
                A1c(str, true);
                return;
            }
            return;
        } else {
            ConfirmPasswordFragment confirmPasswordFragment = (ConfirmPasswordFragment) this;
            Editable text4 = confirmPasswordFragment.A02.getText();
            if (text4 == null || !AnonymousClass00C.A0J(Normalizer.normalize(text4.toString().trim(), Normalizer.Form.NFKC), confirmPasswordFragment.A00)) {
                confirmPasswordFragment.A1c(confirmPasswordFragment.A0n(R.string.f12nameremoved), true);
                return;
            }
            int i2 = confirmPasswordFragment.A00;
            EncBackupViewModel encBackupViewModel4 = confirmPasswordFragment.A03;
            if (i2 == 1) {
                C36341k9.A16(encBackupViewModel4.A03, 500);
                return;
            } else {
                encBackupViewModel4.A0U();
                return;
            }
        }
        r2.Boy(new C1496972k(encBackupViewModel, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r1 == 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 <= 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1a() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment
            if (r0 != 0) goto L_0x0089
            boolean r0 = r9 instanceof com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            if (r0 != 0) goto L_0x0089
            boolean r1 = r9 instanceof com.whatsapp.backup.encryptedbackup.CreatePasswordFragment
            com.whatsapp.CodeInputField r0 = r9.A02
            android.text.Editable r0 = r0.getText()
            if (r1 == 0) goto L_0x005a
            r8 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.toString()
            int r1 = X.C132936Vw.A00(r0)
            r0 = 1
            if (r1 > r8) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r9.A1e(r0)
            r7 = 2131755087(0x7f10004f, float:1.9141043E38)
            android.content.Context r6 = r9.A1D()
            if (r6 == 0) goto L_0x0059
            r5 = 0
            X.C18740tg.A0B(r8)
            android.widget.TextView r4 = r9.A01
            android.content.res.Resources r3 = X.C36341k9.A0G(r9)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            r1 = 6
            X.AnonymousClass000.A1L(r2, r1, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r8] = r0
            java.lang.String r0 = r3.getQuantityString(r7, r1, r2)
            r4.setText(r0)
            android.widget.TextView r1 = r9.A01
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36331k8.A0r(r6, r1, r0)
            android.widget.TextView r0 = r9.A01
            r0.setVisibility(r5)
        L_0x0059:
            return
        L_0x005a:
            r1 = 1
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r0.toString()
            int r0 = X.C132936Vw.A00(r0)
            if (r0 <= r1) goto L_0x0087
        L_0x0067:
            r9.A1e(r1)
            r1 = 2131889127(0x7f120be7, float:1.9412909E38)
            android.content.Context r3 = r9.A1D()
            if (r3 == 0) goto L_0x0059
            r2 = 0
            android.widget.TextView r0 = r9.A01
            r0.setText(r1)
            android.widget.TextView r1 = r9.A01
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            X.C36331k8.A0r(r3, r1, r0)
            android.widget.TextView r0 = r9.A01
            r0.setVisibility(r2)
            return
        L_0x0087:
            r1 = 0
            goto L_0x0067
        L_0x0089:
            com.whatsapp.CodeInputField r0 = r9.A02
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r0.toString()
            int r1 = X.C132936Vw.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            r9.A1e(r0)
            android.widget.TextView r1 = r9.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A1a():void");
    }

    public void A1b(Runnable runnable) {
        this.A0B.setVisibility(0);
        SpannableStringBuilder A012 = C32711e4.A01(A0i().getApplicationContext(), runnable, C36371kC.A0u(this.A0B));
        C36331k8.A1A(this.A06, this.A0B);
        this.A0B.setText(A012);
    }

    public void A1d(boolean z) {
        this.A02.setEnabled(z);
        if (z) {
            InputMethodManager A0N = this.A04.A0N();
            if (A0N != null && !A0N.isAcceptingText()) {
                A0N.toggleSoftInput(1, 1);
            }
            this.A02.requestFocus();
        }
    }

    public void A1e(boolean z) {
        C163057pa r0;
        CodeInputField codeInputField;
        this.A0C.setEnabled(z);
        WDSButton wDSButton = this.A0C;
        if (z) {
            C48732hx.A00(wDSButton, this, 22);
            codeInputField = this.A02;
            r0 = new C163057pa(this, 0);
        } else {
            r0 = null;
            wDSButton.setOnClickListener((View.OnClickListener) null);
            codeInputField = this.A02;
        }
        codeInputField.setOnEditorActionListener(r0);
    }

    public static void A05(DialogInterface.OnClickListener onClickListener, PasswordInputFragment passwordInputFragment, String str, boolean z) {
        C39001qm A052 = AnonymousClass3LW.A05(passwordInputFragment);
        A052.A0p(str);
        A052.A0h(onClickListener, R.string.f12nameremoved);
        C36341k9.A11(A052);
        passwordInputFragment.A1d(z);
        passwordInputFragment.A1e(false);
        AnonymousClass3T3.A03(passwordInputFragment.A04);
        C36321k7.A1Q("encb/PasswordInputFragment/error modal shown with message: ", str, AnonymousClass000.A0u());
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1Q(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36381kD.A0P(this).A00(EncBackupViewModel.class);
        this.A03 = encBackupViewModel;
        this.A00 = encBackupViewModel.A0S();
        this.A09 = C36391kE.A0O(view, R.id.enc_backup_password_input_title);
        this.A08 = C36391kE.A0O(view, R.id.enc_backup_password_input_instruction);
        this.A0B = C36401kF.A0O(view, R.id.enc_backup_password_input_forgot_password);
        this.A02 = (CodeInputField) C012005e.A02(view, R.id.enc_backup_password_input);
        this.A01 = C36391kE.A0O(view, R.id.enc_backup_password_input_requirement);
        this.A0C = C36431kI.A0y(view, R.id.enc_backup_password_input_button);
        this.A0A = C36391kE.A0O(view, R.id.enc_backup_password_input_use_encryption_key_button);
        this.A0B.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A02.addTextChangedListener(new C165097ss(this, 1));
        A1e(false);
        C165147sx.A02(A0m(), this.A03.A04, this, 4);
    }

    public void A1c(String str, boolean z) {
        Context A1D = A1D();
        if (A1D != null) {
            this.A01.setText(str);
            C36331k8.A0r(A1D, this.A01, R.color.f6nameremoved);
            this.A01.setVisibility(0);
            A1d(z);
            A1e(false);
            AnonymousClass3T3.A03(this.A04);
            C36321k7.A1Q("encb/PasswordInputFragment/error message shown: ", str, AnonymousClass000.A0u());
        }
    }
}
