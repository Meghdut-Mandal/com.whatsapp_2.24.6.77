package X;

import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: X.6oE  reason: invalid class name and case insensitive filesystem */
public class C142036oE implements AnonymousClass7fE {
    public int A00;
    public int A01 = -1;
    public TextWatcher A02;
    public TextWatcher A03;
    public TextInputEditText A04;
    public String A05;

    public boolean BqD(C1271967i r6, Object obj, int i) {
        TextInputEditText textInputEditText;
        int length;
        int length2;
        boolean z = false;
        if (i != 50) {
            return false;
        }
        this.A05 = (String) obj;
        TextInputEditText textInputEditText2 = this.A04;
        if (textInputEditText2 != null) {
            TextWatcher textWatcher = this.A03;
            if (textWatcher != null) {
                textInputEditText2.removeTextChangedListener(textWatcher);
            }
            TextWatcher textWatcher2 = this.A02;
            if (textWatcher2 != null) {
                this.A04.removeTextChangedListener(textWatcher2);
            }
            int A06 = C36381kD.A06(this.A04) - this.A04.getSelectionEnd();
            if (this.A04.getSelectionEnd() == 0) {
                z = true;
            }
            this.A04.setText(this.A05);
            if (!z) {
                if (A06 <= 0 || A06 > (length2 = this.A05.length())) {
                    textInputEditText = this.A04;
                    length = this.A05.length();
                } else {
                    textInputEditText = this.A04;
                    length = Math.min(length2 - A06, length2);
                }
                textInputEditText.setSelection(length);
            }
            TextWatcher textWatcher3 = this.A03;
            if (textWatcher3 != null) {
                this.A04.addTextChangedListener(textWatcher3);
            }
            TextWatcher textWatcher4 = this.A02;
            if (textWatcher4 != null) {
                this.A04.addTextChangedListener(textWatcher4);
            }
        }
        return true;
    }

    public C142036oE(String str) {
        this.A05 = str;
    }
}
