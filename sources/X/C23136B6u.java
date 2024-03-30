package X;

import java.util.List;

/* renamed from: X.B6u  reason: case insensitive filesystem */
public class C23136B6u extends C02830Cb {
    public final int A00;

    public C23136B6u(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        Integer num;
        Integer num2;
        Object obj3;
        switch (this.A00) {
            case 0:
                return obj.equals(obj2);
            case 1:
                AnonymousClass9X9 r8 = (AnonymousClass9X9) obj;
                AnonymousClass9X9 r9 = (AnonymousClass9X9) obj2;
                C36321k7.A0w(r8, r9);
                if (!AnonymousClass00C.A0J(r8.A02, r9.A02) || r8.A00 != r9.A00) {
                    return false;
                }
                List list = r8.A04;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                List list2 = r9.A04;
                if (list2 != null) {
                    num2 = Integer.valueOf(list2.size());
                } else {
                    num2 = null;
                }
                if (!AnonymousClass00C.A0J(num, num2)) {
                    return false;
                }
                if (list == null) {
                    return true;
                }
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        throw C36351kA.A0v();
                    }
                    if (list2 != null) {
                        obj3 = list2.get(i);
                    } else {
                        obj3 = null;
                    }
                    if (!AnonymousClass00C.A0J(next, obj3)) {
                        return false;
                    }
                    i = i2;
                }
                return true;
            default:
                C191909Ey r82 = (C191909Ey) obj;
                C191909Ey r92 = (C191909Ey) obj2;
                C36321k7.A0w(r82, r92);
                if (!(r82 instanceof C178268ff) || !(r92 instanceof C178268ff)) {
                    return C36381kD.A1Y(r82, r92);
                }
                C195829We r3 = ((C178268ff) r82).A00;
                C195829We r2 = ((C178268ff) r92).A00;
                if (!AnonymousClass00C.A0J(r3.A03, r2.A03) || !AnonymousClass00C.A0J(r3.A00, r2.A00)) {
                    return false;
                }
                return true;
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        switch (this.A00) {
            case 0:
                return AnonymousClass000.A1S(((AnonymousClass9TY) obj).A00, ((AnonymousClass9TY) obj2).A00);
            case 1:
                AnonymousClass9X9 r3 = (AnonymousClass9X9) obj;
                AnonymousClass9X9 r4 = (AnonymousClass9X9) obj2;
                C36321k7.A0w(r3, r4);
                return AnonymousClass00C.A0J(r3.A02, r4.A02);
            default:
                C191909Ey r32 = (C191909Ey) obj;
                C191909Ey r42 = (C191909Ey) obj2;
                C36321k7.A0w(r32, r42);
                if (!(r32 instanceof C178268ff) || !(r42 instanceof C178268ff)) {
                    obj3 = r32.getClass();
                    obj4 = r42.getClass();
                } else {
                    obj3 = ((C178268ff) r32).A00.A02;
                    obj4 = ((C178268ff) r42).A00.A02;
                }
                return AnonymousClass00C.A0J(obj3, obj4);
        }
    }
}
