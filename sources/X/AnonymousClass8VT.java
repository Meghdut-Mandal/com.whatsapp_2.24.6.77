package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.8VT  reason: invalid class name */
public final class AnonymousClass8VT extends AnonymousClass80H {
    public final CartFragment A00;
    public final C18820ts A01;
    public final C20810yC A02;
    public final AnonymousClass1RJ A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;

    public AnonymousClass8VT(View view, CartFragment cartFragment, C18820ts r7, C20810yC r8) {
        super(view);
        AnonymousClass1RJ r0;
        this.A01 = r7;
        this.A02 = r8;
        this.A00 = cartFragment;
        View findViewById = view.findViewById(R.id.add_promotion_cta);
        AnonymousClass1RJ r3 = null;
        if (findViewById != null) {
            r0 = new AnonymousClass1RJ(findViewById);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        View findViewById2 = view.findViewById(R.id.applied_promotion_info);
        r3 = findViewById2 != null ? new AnonymousClass1RJ(findViewById2) : r3;
        this.A04 = r3;
        this.A06 = C36431kI.A1I(new C22088AgZ(this));
        this.A07 = C36431kI.A1I(new C22089Aga(this));
        this.A05 = C36431kI.A1I(new C22087AgY(this));
        view.setOnClickListener(new C48772i1(new C135426cg(this, 33), 34));
        if (r3 != null) {
            r3.A07(new C164677sC(this, 0));
        }
        A08(false);
    }
}
