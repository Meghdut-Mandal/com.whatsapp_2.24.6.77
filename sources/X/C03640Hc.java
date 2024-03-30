package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0Hc  reason: invalid class name and case insensitive filesystem */
public class C03640Hc extends C004201w {
    public final /* synthetic */ DialogFragment A00;
    public final /* synthetic */ C004201w A01;

    public C03640Hc(DialogFragment dialogFragment, C004201w r2) {
        this.A00 = dialogFragment;
        this.A01 = r2;
    }

    public View A00(int i) {
        C004201w r1 = this.A01;
        if (r1.A01()) {
            return r1.A00(i);
        }
        Dialog dialog = this.A00.A02;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean A01() {
        if (this.A01.A01() || this.A00.A07) {
            return true;
        }
        return false;
    }
}
