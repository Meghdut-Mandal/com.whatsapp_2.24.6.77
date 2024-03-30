package X;

import android.widget.EditText;

/* renamed from: X.3MT  reason: invalid class name */
public abstract class AnonymousClass3MT {
    public static int A00(EditText editText) {
        if (!editText.isFocused()) {
            return -1;
        }
        String A0n = C36361kB.A0n(editText);
        int i = 0;
        int i2 = 0;
        while (i < editText.getSelectionEnd() && i <= A0n.length()) {
            if (A0n.charAt(i) <= '9' && A0n.charAt(i) >= '0') {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public static void A01(EditText editText, int i) {
        int A06 = C36381kD.A06(editText);
        if (i <= -1 || i > A06) {
            if (i > A06) {
                editText.requestFocus();
            }
            editText.setSelection(A06);
            return;
        }
        editText.requestFocus();
        String A0n = C36361kB.A0n(editText);
        int i2 = 0;
        for (int i3 = 0; i3 < A0n.length() && i > 0; i3++) {
            if (A0n.charAt(i3) <= '9' && A0n.charAt(i3) >= '0') {
                i--;
            }
            i2++;
        }
        editText.setSelection(i2);
    }
}
