package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

public final /* synthetic */ class A9G implements C157997fd {
    public final /* synthetic */ AnonymousClass4PD A00;
    public final /* synthetic */ AnonymousClass8VW A01;
    public final /* synthetic */ CartFragment A02;

    public /* synthetic */ A9G(AnonymousClass4PD r1, AnonymousClass8VW r2, CartFragment cartFragment) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = cartFragment;
    }

    public final void BZd(long j) {
        AnonymousClass8VW r0 = this.A01;
        AnonymousClass4PD r2 = this.A00;
        CartFragment cartFragment = this.A02;
        r2.BBA(r0.A04());
        View A0d = cartFragment.A0d();
        C18820ts r22 = cartFragment.A0g;
        Object[] A0L = AnonymousClass001.A0L();
        C90474aD.A1S(A0L, j);
        C99304t3.A01(A0d, r22.A0L(A0L, R.plurals.f10nameremoved, j), -1).A0P();
    }
}
