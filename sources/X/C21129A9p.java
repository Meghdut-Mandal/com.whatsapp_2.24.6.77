package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.A9p  reason: case insensitive filesystem */
public final class C21129A9p implements C88704Ts {
    public TextView A00;

    public void BkP(View view) {
        AnonymousClass00C.A0D(view, 0);
        TextView A0M = C36341k9.A0M(view, R.id.send_payment_amount_description);
        AnonymousClass00C.A0D(A0M, 0);
        this.A00 = A0M;
    }

    /* renamed from: A00 */
    public void B1n(AnonymousClass9HZ r4) {
        if (r4 != null) {
            String str = null;
            if (r4.A00 == 1) {
                TextView textView = this.A00;
                if (textView != null) {
                    textView.setVisibility(4);
                } else {
                    throw C36331k8.A0d("amountConversion");
                }
            }
            Object obj = r4.A01;
            if (obj != null) {
                TextView textView2 = this.A00;
                if (textView2 != null) {
                    AnonymousClass9VE r1 = (AnonymousClass9VE) obj;
                    if (r1 != null) {
                        str = r1.A00;
                    }
                    textView2.setText(str);
                    return;
                }
                throw C36331k8.A0d("amountConversion");
            }
        }
    }

    public int BDU() {
        return R.layout.f9nameremoved;
    }
}
