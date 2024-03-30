package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7aI  reason: invalid class name and case insensitive filesystem */
public final class C156637aI extends AnonymousClass00R implements C019408g {
    public static final C156637aI A00 = new C156637aI();

    public C156637aI() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C161717nM r6 = (C161717nM) obj;
        AnonymousClass6Q4 BPj = ((C161687nJ) obj2).BPj(((Constraints) obj3).A00);
        int Bor = r6.Bor(C113785g7.A00 * ((float) 2));
        int A0C = BPj.A0C() - Bor;
        if (A0C < 0) {
            A0C = 0;
        }
        int A0B = BPj.A0B() - Bor;
        if (A0B < 0) {
            A0B = 0;
        }
        return C90474aD.A0M(r6, new C154657Ta(BPj, Bor), A0C, A0B);
    }
}
