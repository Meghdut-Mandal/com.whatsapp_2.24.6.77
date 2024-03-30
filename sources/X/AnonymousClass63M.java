package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.63M  reason: invalid class name */
public final class AnonymousClass63M {
    public int A00 = 1;
    public String A01 = "";
    public final TextView A02;
    public final C18820ts A03;

    public AnonymousClass63M(TextView textView, C18820ts r4) {
        C36321k7.A0v(r4, 1, textView);
        this.A03 = r4;
        this.A02 = textView;
    }

    public final void A00(String str, boolean z) {
        TextView textView = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        C18820ts r5 = this.A03;
        boolean A1X = C36401kF.A1X(r5);
        boolean A1O = AnonymousClass000.A1O(this.A00);
        if (A1X) {
            A0u.append(8207);
        }
        A0u.append(AnonymousClass1JZ.A02(this.A01));
        if (A1O) {
            A0u.append(AnonymousClass1JZ.A01(r5, ": "));
            A0u.append(AnonymousClass1JZ.A02(str));
        }
        if (!z && A1O) {
            Context A0B = C36371kC.A0B(textView);
            A0u.append(AnonymousClass1JZ.A01(r5, " • "));
            A0u.append(A0B.getString(R.string.f12nameremoved));
        }
        textView.setText(C36381kD.A0y(A0u));
    }
}
