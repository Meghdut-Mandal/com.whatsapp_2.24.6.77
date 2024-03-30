package X;

import java.util.Set;

/* renamed from: X.B7m  reason: case insensitive filesystem */
public class C23152B7m implements C22914AyQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23152B7m(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BRO(C21097A8i a8i) {
        C22914AyQ ayQ;
        Set set;
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ayQ = (C22914AyQ) this.A01;
            set = ((C196169Xz) obj).A03;
        } else {
            ayQ = (C22914AyQ) this.A01;
            set = ((C196089Xp) obj).A03;
        }
        set.add(a8i);
        if (ayQ != null) {
            ayQ.BRO(a8i);
        }
    }
}
