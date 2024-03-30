package X;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

/* renamed from: X.3cA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68603cA implements C87424Ot {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CodeInputField A01;

    public /* synthetic */ C68603cA(CodeInputField codeInputField, int i) {
        this.A01 = codeInputField;
        this.A00 = i;
    }

    public final SpannableStringBuilder BHn(String str) {
        int A002;
        int A003;
        CodeInputField codeInputField = this.A01;
        int i = this.A00;
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        for (int i2 = 0; i2 < A0P.length(); i2++) {
            if (A0P.charAt(i2) == ')') {
                int i3 = i2 + 1;
                A0P.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                if (i != 0) {
                    A003 = i;
                } else {
                    A003 = AnonymousClass00F.A00(codeInputField.getContext(), C224314h.A01(codeInputField.getContext(), R.attr.f4nameremoved));
                }
                A0P.setSpan(new C37391mI(codeInputField.A06, A003), i2, i3, 33);
            } else if (A0P.charAt(i2) != 160) {
                if (i != 0) {
                    A002 = i;
                } else {
                    A002 = AnonymousClass00F.A00(codeInputField.getContext(), C224314h.A01(codeInputField.getContext(), R.attr.f4nameremoved));
                }
                A0P.setSpan(new C37391mI(codeInputField.A06, A002), i2, i2 + 1, 33);
            }
        }
        return A0P;
    }
}
