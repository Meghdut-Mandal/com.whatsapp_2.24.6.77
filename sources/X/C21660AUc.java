package X;

/* renamed from: X.AUc  reason: case insensitive filesystem */
public final class C21660AUc implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C196149Xx A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21660AUc aUc = (C21660AUc) obj;
        Object obj2 = this.A02;
        if (AnonymousClass000.A1W(obj2) != AnonymousClass000.A1W(aUc.A02)) {
            if (obj2 != null) {
                return -1;
            }
            return 1;
        } else if (obj2 == null) {
            return 0;
        } else {
            int i = this.A00 - aUc.A00;
            if (i != 0) {
                return i;
            }
            int i2 = (this.A01 > aUc.A01 ? 1 : (this.A01 == aUc.A01 ? 0 : -1));
            if (i2 >= 0) {
                if (i2 == 0) {
                    return 0;
                }
                return 1;
            }
        }
        return -1;
    }

    public C21660AUc(C196149Xx r1) {
        this.A03 = r1;
    }
}
