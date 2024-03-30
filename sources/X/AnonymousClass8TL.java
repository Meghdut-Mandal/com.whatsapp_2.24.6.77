package X;

import java.util.List;

/* renamed from: X.8TL  reason: invalid class name */
public abstract class AnonymousClass8TL extends C196179Ya {
    public boolean A09(C199959gK r5, Object obj, String str) {
        if (obj != null) {
            C194879Rp r1 = r5.A01;
            if (obj instanceof List) {
                return true;
            }
            if (A06() && !r1.A03.contains(C188068yz.SUPPRESS_EXCEPTIONS)) {
                Object[] A0M = AnonymousClass001.A0M();
                C90514aH.A1Q(this, A0M, 0);
                A0M[1] = obj;
                throw new C173698Sr(String.format("Filter: %s can only be applied to arrays. Current context is: %s", A0M));
            }
        } else if (A06() && !r5.A01.A03.contains(C188068yz.SUPPRESS_EXCEPTIONS)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The path ");
            A0u.append(str);
            throw new C173698Sr(AnonymousClass000.A0q(" is null", A0u));
        }
        return false;
    }
}
