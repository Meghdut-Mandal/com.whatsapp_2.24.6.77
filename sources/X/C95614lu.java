package X;

/* renamed from: X.4lu  reason: invalid class name and case insensitive filesystem */
public final class C95614lu extends C02830Cb {
    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3 = (AnonymousClass5ZY) obj;
        Object obj4 = (AnonymousClass5ZY) obj2;
        C36321k7.A0w(obj3, obj4);
        if (!C36381kD.A1Y(obj3, obj4)) {
            return false;
        }
        if (!(obj3 instanceof C101424xX) || !(obj4 instanceof C101424xX)) {
            if ((obj3 instanceof C101394xU) && (obj4 instanceof C101394xU)) {
                obj3 = ((C101394xU) obj3).A01;
                obj4 = ((C101394xU) obj4).A01;
            } else if ((obj3 instanceof C101404xV) && (obj4 instanceof C101404xV)) {
                obj3 = ((C101404xV) obj3).A00;
                obj4 = ((C101404xV) obj4).A00;
            }
            return AnonymousClass00C.A0J(obj3, obj4);
        } else if (((C101424xX) obj3).A00 == ((C101424xX) obj4).A00) {
            return true;
        } else {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C36321k7.A0w(obj, obj2);
        return obj.equals(obj2);
    }
}
