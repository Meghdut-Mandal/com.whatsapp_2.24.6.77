package X;

import android.widget.RadioButton;
import com.whatsapp.R;

/* renamed from: X.3G8  reason: invalid class name */
public final class AnonymousClass3G8 {
    public final C38961qd A00;
    public final C18820ts A01;

    public final void A00(int i) {
        RadioButton radioButton;
        C38961qd r2 = this.A00;
        C38961qd.A00(r2);
        if (i != 0) {
            if (i == 1) {
                radioButton = r2.A02;
            } else if (i == 2) {
                radioButton = r2.A03;
            } else if (i != 3) {
                return;
            }
            radioButton.setChecked(true);
        }
        radioButton = r2.A04;
        radioButton.setChecked(true);
    }

    public final void A01(int i, int i2) {
        C18820ts r5 = this.A01;
        Object[] objArr = new Object[1];
        boolean A1b = C36361kB.A1b(objArr, i);
        String A0L = r5.A0L(objArr, R.plurals.f10nameremoved, (long) i);
        AnonymousClass00C.A08(A0L);
        C38961qd r2 = this.A00;
        r2.A06.setText(A0L);
        String A0g = C36331k8.A0g(r5, i2, A1b ? 1 : 0, R.plurals.f10nameremoved);
        AnonymousClass00C.A08(A0g);
        r2.A05.setText(A0g);
    }

    public AnonymousClass3G8(C18820ts r1, C38961qd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
