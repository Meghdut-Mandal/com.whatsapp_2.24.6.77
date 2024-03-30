package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.2t6  reason: invalid class name and case insensitive filesystem */
public class C54532t6 implements C87754Qa {
    public Object A00;
    public final int A01;

    public C54532t6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bu5(DialogFragment dialogFragment) {
        if (this.A01 != 0) {
            ((C225314u) this.A00).Btm(dialogFragment);
        } else {
            ((PaymentView) this.A00).A0t.Btj(dialogFragment);
        }
    }
}
