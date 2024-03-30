package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.6cK  reason: invalid class name and case insensitive filesystem */
public class C135206cK implements TextWatcher {
    public Runnable A00;
    public final C1271967i A01;
    public final C140456lc A02;
    public final long A03;
    public final Handler A04 = C36341k9.A0H();
    public final C142036oE A05;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A05.A05 = charSequence.toString();
        C140456lc r7 = this.A02;
        C160377ku A0X = r7.A0X(56);
        if (A0X != null) {
            long j = this.A03;
            if (j <= 0) {
                C131756Qk.A02(this.A01, r7, C1273868b.A04(C1273868b.A00(), charSequence.toString(), 0), A0X);
                return;
            }
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A04.removeCallbacks(runnable);
            }
            C1502474n r1 = new C1502474n(this, A0X, charSequence, 1);
            this.A00 = r1;
            this.A04.postDelayed(r1, j);
        }
    }

    public C135206cK(C1271967i r2, C140456lc r3, C142036oE r4, long j) {
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r4;
        this.A03 = j;
    }
}
