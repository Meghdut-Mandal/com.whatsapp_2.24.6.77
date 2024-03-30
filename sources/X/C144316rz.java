package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6rz  reason: invalid class name and case insensitive filesystem */
public class C144316rz implements C88704Ts {
    public View.OnClickListener A00;
    public ImageView A01;

    /* renamed from: A00 */
    public void B1n(Integer num) {
        ImageView imageView;
        int i;
        if (num == null || 2 != num.intValue()) {
            imageView = this.A01;
            i = R.drawable.ic_action_arrow_next;
        } else {
            imageView = this.A01;
            i = R.drawable.input_send;
        }
        imageView.setImageResource(i);
    }

    public int BDU() {
        return R.layout.f9nameremoved;
    }

    public void BkP(View view) {
        ImageView A0G = C36401kF.A0G(view, R.id.send_payment_send);
        this.A01 = A0G;
        C36421kH.A12(A0G, this, 44);
    }
}
