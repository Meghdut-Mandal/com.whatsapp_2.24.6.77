package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.6cM  reason: invalid class name and case insensitive filesystem */
public final class C135226cM implements TextWatcher {
    public EditText A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final ArrayList A04 = AnonymousClass001.A0I();

    public void afterTextChanged(Editable editable) {
        AnonymousClass00C.A0D(editable, 0);
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A03 && !this.A02) {
                this.A02 = true;
            } else if (!this.A02) {
                this.A02 = true;
                if (C36381kD.A1Z(this.A04, selectionStart)) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i = selectionStart - 1;
                        if (this.A01.charAt(i) == '#') {
                            editable.delete(i, selectionStart);
                            selectionStart = i;
                            break;
                        }
                        editable.delete(i, selectionStart);
                        selectionStart--;
                    }
                }
            } else {
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            int length = editable.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isDigit(editable.charAt(i3))) {
                    A0u.append(editable.charAt(i3));
                    if (i3 < selectionStart) {
                        i2++;
                    }
                }
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < A0u.length()) {
                String str = this.A01;
                if (i5 >= str.length()) {
                    break;
                }
                if (str.charAt(i5) == '#') {
                    A0u2.append(A0u.charAt(i4));
                    if (i4 < i2) {
                        i6++;
                    }
                    i4++;
                } else {
                    C90514aH.A1R(this.A01, A0u2, i5);
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String A0d = C90494aF.A0d(this.A01, i5);
            int length2 = A0d.length();
            if (length2 > 0 && !AnonymousClass099.A0O(A0d, "#", false)) {
                A0u2.append(A0d);
                if (i4 <= i2) {
                    i6 += length2;
                }
            }
            editText.setText(A0u2);
            editText.setSelection(i6);
            this.A02 = false;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C135226cM(EditText editText, String str) {
        this.A01 = str;
        int length = this.A01.length();
        for (int i = 0; i < length; i++) {
            if (this.A01.charAt(i) != '#') {
                AnonymousClass000.A1F(this.A04, i);
            }
        }
        this.A00 = editText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = AnonymousClass000.A1T(i3, i2);
    }
}
