package X;

import java.util.List;

/* renamed from: X.1vD  reason: invalid class name and case insensitive filesystem */
public final class C40261vD extends C06730Uv {
    public final List A00;
    public final List A01;

    public C40261vD(List list, List list2) {
        AnonymousClass00C.A0D(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C54882ti r6 = (C54882ti) C007103b.A0P(this.A01, i);
        C54882ti r3 = (C54882ti) C007103b.A0P(this.A00, i2);
        if ((r6 instanceof C46542Yg) && (r3 instanceof C46542Yg)) {
            C46542Yg r62 = (C46542Yg) r6;
            C46542Yg r32 = (C46542Yg) r3;
            C44072La r8 = r62.A02;
            AnonymousClass11F A06 = r8.A06();
            C44072La r7 = r32.A02;
            if (!AnonymousClass00C.A0J(A06, r7.A06()) || !AnonymousClass00C.A0J(r8.A0K, r7.A0K) || r8.A0P() != r7.A0P() || r8.A07 != r7.A07 || r8.A0N() != r7.A0N() || !AnonymousClass00C.A0J(Long.valueOf(r62.A00.A0C), Long.valueOf(r32.A00.A0C))) {
                return false;
            }
            return true;
        } else if (r6 instanceof C46572Yj) {
            return r3 instanceof C46572Yj;
        } else {
            if (r6 instanceof C46552Yh) {
                return r3 instanceof C46552Yh;
            }
            if (r6 instanceof C46562Yi) {
                return r3 instanceof C46562Yi;
            }
            if (r6 instanceof AnonymousClass2Yl) {
                return r3 instanceof AnonymousClass2Yl;
            }
            if (r6 instanceof AnonymousClass2Yk) {
                return r3 instanceof AnonymousClass2Yk;
            }
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        Object obj = (C54882ti) C007103b.A0P(this.A01, i);
        Object obj2 = (C54882ti) C007103b.A0P(this.A00, i2);
        if (obj instanceof C46542Yg) {
            if (!(obj2 instanceof C46542Yg)) {
                return false;
            }
            obj = ((C46542Yg) obj).A02.A06();
            obj2 = ((C46542Yg) obj2).A02.A06();
        } else if (obj instanceof C46572Yj) {
            return obj2 instanceof C46572Yj;
        } else {
            if (obj instanceof C46552Yh) {
                return obj2 instanceof C46552Yh;
            }
            if (obj instanceof C46562Yi) {
                return obj2 instanceof C46562Yi;
            }
            if (obj instanceof AnonymousClass2Yl) {
                return obj2 instanceof AnonymousClass2Yl;
            }
            if (obj instanceof AnonymousClass2Yk) {
                return obj2 instanceof AnonymousClass2Yk;
            }
            if (obj == null) {
                return false;
            }
        }
        if (AnonymousClass00C.A0J(obj, obj2)) {
            return true;
        }
        return false;
    }
}
