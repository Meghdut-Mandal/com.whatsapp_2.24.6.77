package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.7rG  reason: invalid class name and case insensitive filesystem */
public class C164097rG implements AnonymousClass4QW {
    public Object A00;
    public final int A01;

    public C164097rG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWO(AnonymousClass1XQ r3) {
        C88314Sf r1;
        switch (this.A01) {
            case 0:
                r1 = ((CartFragment) this.A00).A1A;
                break;
            case 1:
                r1 = ((C124555yO) this.A00).A04;
                break;
            case 2:
                AnonymousClass00C.A0D(r3, 1);
                r1 = ((C90714ab) this.A00).A0B;
                break;
            default:
                r1 = (C88314Sf) this.A00;
                break;
        }
        r1.BWN(r3.A00);
    }
}
