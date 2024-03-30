package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3te  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79393te implements C34871hm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70803fk A01;

    public /* synthetic */ C79393te(C70803fk r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void BZ9(View view) {
        C70803fk r6 = this.A01;
        int i = this.A00;
        ImageView A0P = C36431kI.A0P(C70803fk.A0B(r6), R.id.payment_button);
        A0P.setImageDrawable(r6.A4Y.A0K(A0P.getContext(), r6.A4Q.A02(), R.color.f6nameremoved, R.dimen.f7nameremoved));
        C67143Yr.A00(A0P, r6, i, 11);
        r6.A0F = C03570Gk.A0B(C70803fk.A0B(r6), R.id.payment_button_nux);
    }
}
