package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9TR  reason: invalid class name */
public class AnonymousClass9TR {
    public final StringBuilder A00;

    public void A00(String str) {
        StringBuilder sb = this.A00;
        sb.append('|');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0 || charAt == 13 || charAt == ';' || charAt == '|' || charAt == 9 || charAt == 10) {
                charAt = ' ';
            }
            sb.append(charAt);
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass9TR(char c) {
        StringBuilder A0h = C90524aI.A0h(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A00 = A0h;
        A0h.append(c);
    }
}
