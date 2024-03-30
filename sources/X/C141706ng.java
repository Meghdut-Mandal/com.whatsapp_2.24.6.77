package X;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.6ng  reason: invalid class name and case insensitive filesystem */
public class C141706ng implements AnonymousClass7f9 {
    public final /* synthetic */ C93014fP A00;

    public C141706ng(C93014fP r1) {
        this.A00 = r1;
    }

    public void BWM(TextInputLayout textInputLayout) {
        View.OnFocusChangeListener onFocusChangeListener;
        C93014fP r3 = this.A00;
        EditText editText = r3.A08;
        if (editText != textInputLayout.A0B) {
            if (editText != null) {
                editText.removeTextChangedListener(r3.A0D);
                if (r3.A08.getOnFocusChangeListener() == r3.A03().A05()) {
                    r3.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.A0B;
            r3.A08 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(r3.A0D);
            }
            r3.A03().A08(r3.A08);
            C129176Fq A03 = r3.A03();
            EditText editText3 = r3.A08;
            if (editText3 != null) {
                View.OnFocusChangeListener A05 = A03.A05();
                if (A05 != null) {
                    editText3.setOnFocusChangeListener(A05);
                }
                if ((A03 instanceof C99374tB) && (onFocusChangeListener = ((C99374tB) A03).A08) != null) {
                    r3.A0G.setOnFocusChangeListener(onFocusChangeListener);
                }
            }
        }
    }
}
