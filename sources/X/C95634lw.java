package X;

/* renamed from: X.4lw  reason: invalid class name and case insensitive filesystem */
public final class C95634lw extends C02830Cb {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        String str;
        String str2;
        C1266865b r3 = (C1266865b) obj;
        C1266865b r4 = (C1266865b) obj2;
        C36321k7.A0w(r3, r4);
        if ((r3 instanceof C1035555x) && (r4 instanceof C1035555x)) {
            str = ((C1035555x) r3).A03;
            str2 = ((C1035555x) r4).A03;
        } else if (!(r3 instanceof C1035355v) || !(r4 instanceof C1035355v)) {
            return false;
        } else {
            str = ((C1035355v) r3).A01.A0E;
            str2 = ((C1035355v) r4).A01.A0E;
        }
        return AnonymousClass00C.A0J(str, str2);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C36321k7.A0w(obj, obj2);
        return obj.equals(obj2);
    }
}
