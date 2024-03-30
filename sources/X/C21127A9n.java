package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.A9n  reason: case insensitive filesystem */
public class C21127A9n implements C88704Ts {
    public ImageView A00;
    public final AnonymousClass1HB A01;
    public final C19770wU A02;
    public final C19630wG A03;

    public /* bridge */ /* synthetic */ void B1n(Object obj) {
        AnonymousClass9HZ r3 = (AnonymousClass9HZ) obj;
        if (r3 != null && r3.A01 != null) {
            this.A00.setImageResource(R.drawable.payment_invite_bubble_icon);
        }
    }

    public C21127A9n(C19630wG r1, AnonymousClass1HB r2, C19770wU r3) {
        this.A03 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public int BDU() {
        return R.layout.f9nameremoved;
    }

    public void BkP(View view) {
        this.A00 = C36401kF.A0G(view, R.id.payment_invite_bubble_icon);
    }
}
