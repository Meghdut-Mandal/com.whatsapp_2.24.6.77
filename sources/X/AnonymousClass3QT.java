package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.3QT  reason: invalid class name */
public final class AnonymousClass3QT {
    public String A00 = "";
    public String A01 = "";
    public final Context A02;
    public final EditText A03;
    public final EditText A04;
    public final EditText A05;
    public final ImageView A06;
    public final TextInputLayout A07;
    public final C61733Df A08;
    public final AnonymousClass1H2 A09;

    public AnonymousClass3QT(Context context, View view, C61733Df r11, AnonymousClass1H2 r12) {
        this.A02 = context;
        this.A09 = r12;
        this.A08 = r11;
        EditText editText = (EditText) C36361kB.A0G(view, R.id.first_name_field);
        this.A04 = editText;
        EditText editText2 = (EditText) C36361kB.A0G(view, R.id.last_name_field);
        this.A05 = editText2;
        EditText editText3 = (EditText) C36361kB.A0G(view, R.id.business_name_field);
        this.A03 = editText3;
        this.A06 = C36341k9.A0L(view, R.id.business_name_icon);
        TextInputLayout textInputLayout = (TextInputLayout) C36361kB.A0G(view, R.id.business_name_input_layout);
        this.A07 = textInputLayout;
        View A022 = C012005e.A02(view, R.id.first_name_input_layout);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
        ((TextInputLayout) A022).setHint((CharSequence) context.getResources().getString(R.string.f12nameremoved));
        View A023 = C012005e.A02(view, R.id.last_name_input_layout);
        AnonymousClass00C.A0E(A023, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
        ((TextInputLayout) A023).setHint((CharSequence) context.getResources().getString(R.string.f12nameremoved));
        textInputLayout.setHint((CharSequence) context.getResources().getString(R.string.f12nameremoved));
        editText.addTextChangedListener(new AnonymousClass4WK(editText, this, 0));
        editText2.addTextChangedListener(new AnonymousClass4WK(editText2, this, 0));
        editText3.addTextChangedListener(new AnonymousClass4WK(editText3, this, 0));
    }

    public static String A00(EditText editText) {
        return A01(editText.getText().toString());
    }

    public static final String A01(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = AnonymousClass00C.A00(str.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return new C10880fN(" +").A00(str.subSequence(i, length + 1).toString(), " ");
    }

    public final String A02() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A00(this.A04));
        A0u.append(' ');
        String A0q = AnonymousClass000.A0q(A00(this.A05), A0u);
        int length = A0q.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = AnonymousClass00C.A00(A0q.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return A0q.subSequence(i, length + 1).toString();
    }
}
