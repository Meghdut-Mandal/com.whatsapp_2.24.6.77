package X;

/* renamed from: X.9Rr  reason: invalid class name and case insensitive filesystem */
public class C194899Rr {
    public final Integer A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;

    public C194899Rr(Integer num, Long l, Long l2, boolean z) {
        this.A03 = z;
        this.A02 = l;
        this.A01 = l2;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[success=");
        StringBuilder A0i = C90524aI.A0i(C36421kH.A0d(A0u, this.A03));
        Long l = this.A02;
        if (l != null) {
            A0i.append(" refresh=");
            A0i.append(l);
        }
        Long l2 = this.A01;
        if (l2 != null) {
            A0i.append(" backoff=");
            A0i.append(l2);
        }
        Integer num = this.A00;
        if (num != null) {
            A0i.append(" errorCode=");
            A0i.append(num);
        }
        return C90474aD.A0g(A0i);
    }
}
