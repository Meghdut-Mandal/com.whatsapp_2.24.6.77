package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.0dW  reason: invalid class name and case insensitive filesystem */
public class C10010dW implements C15810o1 {
    public final WindowId A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C10010dW) || !((C10010dW) obj).A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C10010dW(View view) {
        this.A00 = view.getWindowId();
    }
}
