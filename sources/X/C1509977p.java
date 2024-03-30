package X;

import java.util.List;

/* renamed from: X.77p  reason: invalid class name and case insensitive filesystem */
public final class C1509977p implements C009003v, C019408g, C019508h, C019708j, C020008m, AnonymousClass08n, C020108o, C020308q, C020408r, C020508s, C020608t, C020708u, C020808v, C020908w, C021008x, C021108y, C019608i, C019808k, C019908l {
    public AnonymousClass7bI A00;
    public Object A01;
    public List A02;
    public final int A03;
    public final boolean A04;

    public Object A05(C161337ma r16, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C161337ma r7 = r16;
        r7.Bun(this.A03);
        A00(r7);
        int i2 = i;
        Object obj5 = this.A01;
        AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C07710Yz.A03(obj5, 6);
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        Object obj9 = obj4;
        Object BKv = ((C019708j) obj5).BKv(obj6, obj7, obj8, obj9, r7, Integer.valueOf((C36371kC.A00(r7.B2f(this) ? 1 : 0) << 13) | i));
        C136976fO B6Z = r7.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C156147Yv(this, obj6, obj7, obj8, obj9, i2);
        }
        return BKv;
    }

    public /* bridge */ /* synthetic */ Object BKv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A05((C161337ma) obj5, obj, obj2, obj3, obj4, AnonymousClass000.A0I(obj6));
    }

    private final void A00(C161337ma r6) {
        C136976fO A0P;
        if (this.A04 && (A0P = ((C136916fF) r6).A0P()) != null) {
            A0P.A01 |= 1;
            if (A02(this.A00, A0P)) {
                this.A00 = A0P;
                return;
            }
            List list = this.A02;
            if (list == null) {
                list = AnonymousClass001.A0I();
                this.A02 = list;
            } else {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (A02((AnonymousClass7bI) list.get(i), A0P)) {
                        list.set(i, A0P);
                        return;
                    }
                }
            }
            list.add(A0P);
        }
    }

    public static final boolean A02(AnonymousClass7bI r3, AnonymousClass7bI r4) {
        AnonymousClass606 r0;
        if (r3 == null) {
            return true;
        }
        if (!(r3 instanceof C136976fO) || !(r4 instanceof C136976fO)) {
            return false;
        }
        C136976fO r2 = (C136976fO) r3;
        if (r2.A05 == null || (r0 = r2.A04) == null || r0.A00 == Integer.MIN_VALUE || r3.equals(r4) || AnonymousClass00C.A0J(r2.A04, ((C136976fO) r4).A04)) {
            return true;
        }
        return false;
    }

    public Object A03(C161337ma r4, Object obj, int i) {
        r4.Bun(this.A03);
        A00(r4);
        Object obj2 = this.A01;
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C07710Yz.A03(obj2, 3);
        Object BKt = ((C019408g) obj2).BKt(obj, r4, Integer.valueOf((C36371kC.A00(r4.B2f(this) ? 1 : 0) << 4) | i));
        C136976fO B6Z = r4.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7YX(this, obj, i);
        }
        return BKt;
    }

    public Object A04(C161337ma r4, Object obj, Object obj2, int i) {
        r4.Bun(this.A03);
        A00(r4);
        Object obj3 = this.A01;
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C07710Yz.A03(obj3, 4);
        Object BKu = ((C019508h) obj3).BKu(obj, obj2, r4, Integer.valueOf((C36371kC.A00(r4.B2f(this) ? 1 : 0) << 7) | i));
        C136976fO B6Z = r4.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C155987Yf(this, obj, obj2, i);
        }
        return BKu;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        return A03((C161337ma) obj2, obj, AnonymousClass000.A0I(obj3));
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        return A04((C161337ma) obj3, obj, obj2, AnonymousClass000.A0I(obj4));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r5 = (C161337ma) obj;
        int A0I = AnonymousClass000.A0I(obj2);
        r5.Bun(this.A03);
        A00(r5);
        int i = 1 << 1;
        if (r5.B2f(this)) {
            i = 2 << 1;
        }
        int i2 = A0I | i;
        Object obj3 = this.A01;
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C07710Yz.A03(obj3, 2);
        Object invoke = ((C009003v) obj3).invoke(r5, Integer.valueOf(i2));
        C136976fO B6Z = r5.B6Z();
        if (B6Z != null) {
            C07710Yz.A03(this, 2);
            B6Z.A06 = this;
        }
        return invoke;
    }

    public C1509977p(int i, Object obj, boolean z) {
        this.A03 = i;
        this.A04 = z;
        this.A01 = obj;
    }

    public static void A01(C161337ma r1, C1509977p r2, Object obj, int i) {
        r2.BKt(obj, r1, Integer.valueOf(i));
        r1.Bum(2058660585);
    }

    public /* bridge */ /* synthetic */ Object BKw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        throw null;
    }
}
