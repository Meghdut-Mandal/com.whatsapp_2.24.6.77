package X;

import java.util.List;

/* renamed from: X.1vC  reason: invalid class name and case insensitive filesystem */
public final class C40251vC extends C06730Uv {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C54872th r1 = (C54872th) C007103b.A0P(this.A01, i);
        C54872th r3 = (C54872th) C007103b.A0P(this.A00, i2);
        if (r1 instanceof C46532Yf) {
            return r3 instanceof C46532Yf;
        }
        if (!(r1 instanceof C46522Ye) || !(r3 instanceof C46522Ye) || ((C46522Ye) r1).A00.size() != ((C46522Ye) r3).A00.size()) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        Object obj = (C54872th) C007103b.A0P(this.A01, i);
        Object obj2 = (C54872th) C007103b.A0P(this.A00, i2);
        if (obj instanceof C46532Yf) {
            if (!(obj2 instanceof C46532Yf)) {
                return false;
            }
            obj = ((C46532Yf) obj).A00;
            obj2 = ((C46532Yf) obj2).A00;
        } else if (obj instanceof C46522Ye) {
            return obj2 instanceof C46522Ye;
        } else {
            if (obj == null) {
                return false;
            }
        }
        if (AnonymousClass00C.A0J(obj, obj2)) {
            return true;
        }
        return false;
    }

    public C40251vC(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
