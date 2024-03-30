package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass4YR;
import X.AnonymousClass4ZW;
import X.C18820ts;
import X.C19550w8;
import X.C21060yb;
import X.C36331k8;
import X.C36361kB;
import X.C36411kG;
import X.C44042Kx;
import X.C67173Yu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

public class EncryptionKeyFragment extends Hilt_EncryptionKeyFragment {
    public int A00;
    public EncBackupViewModel A01;
    public C21060yb A02;
    public C18820ts A03;
    public CodeInputField[] A04;

    public void A1Z(String str) {
        String str2;
        if (str != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int i3 = i2 * 4;
                int length = str.length();
                String substring = str.substring(i * 4, Math.min(i3, length));
                if (this.A04[i].getText() != null) {
                    str2 = C36361kB.A0n(this.A04[i]);
                } else {
                    str2 = "";
                }
                if (!substring.equals(str2)) {
                    this.A04[i].setText(substring);
                    this.A04[i].setSelection(substring.length());
                }
                if (length >= i3 && i2 < 16) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        InputMethodManager A0N;
        super.A1Q(bundle);
        this.A01 = (EncBackupViewModel) C36331k8.A0A(this);
        ViewGroup A0O = C36411kG.A0O(view, R.id.encryption_key_vertical_layout);
        this.A04 = new CodeInputField[16];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            ViewGroup viewGroup = (ViewGroup) A0O.getChildAt(i2);
            int i3 = 0;
            do {
                int i4 = (i2 * 4) + i3;
                this.A04[i4] = viewGroup.getChildAt(i3);
                this.A04[i4].setLetterSpacing(0.15f);
                if (this.A01.A0S() != 1) {
                    CodeInputField codeInputField = this.A04[i4];
                    codeInputField.setEnabled(true);
                    codeInputField.setClickable(true);
                    codeInputField.setLongClickable(true);
                    codeInputField.setOnFocusChangeListener(new C67173Yu(this, i4));
                    codeInputField.addTextChangedListener(new C44042Kx(codeInputField, this, 0));
                    codeInputField.setOnKeyListener(new AnonymousClass4ZW(this, 0));
                    if (C19550w8.A01()) {
                        codeInputField.setCustomInsertionActionModeCallback(new AnonymousClass4YR(this, 0));
                    }
                }
                i3++;
            } while (i3 < 4);
        }
        String str = (String) this.A01.A02.A04();
        if (str != null) {
            A1Z(str);
            i = str.length() / 4;
        }
        if (this.A01.A0S() != 1 && (A0N = this.A02.A0N()) != null) {
            this.A04[i].requestFocus();
            A0N.toggleSoftInput(1, 1);
        }
    }
}
