package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6cJ  reason: invalid class name and case insensitive filesystem */
public class C135196cJ implements TextWatcher {
    public boolean A00 = false;
    public final List A01;
    public final C125115zL A02;
    public final C118625oT A03;
    public final C1271967i A04;
    public final C140456lc A05;

    public void afterTextChanged(Editable editable) {
        int lineCount;
        C125115zL r3 = this.A02;
        r3.A0J = editable;
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher afterTextChanged : this.A01) {
                afterTextChanged.afterTextChanged(r3.A0J);
            }
            C140456lc r5 = this.A05;
            if (r5.A0f(63, false) && r3.A02 != (lineCount = ((TextView) r5.A0V(this.A04)).getLineCount())) {
                r3.A02 = lineCount;
                String obj = r3.A0J.toString();
                C118625oT r0 = this.A03;
                Objects.requireNonNull(r0);
                r0.A00.A04(new C118805ol(new C136236dz(obj), r5.A03));
            }
            C160377ku A0X = r5.A0X(48);
            if (A0X != null) {
                C1273868b A002 = C1273868b.A00();
                A002.A0A(r5, 0);
                C1271967i r02 = this.A04;
                A002.A0A(r02, 1);
                C1273868b.A06(r02, r5, A002, A0X);
            }
            this.A00 = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher beforeTextChanged : this.A01) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher onTextChanged : this.A01) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public C135196cJ(C118625oT r2, C1271967i r3, C140456lc r4) {
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = (C125115zL) C133266Xn.A04(r3, r4);
        this.A01 = AnonymousClass001.A0I();
    }
}
