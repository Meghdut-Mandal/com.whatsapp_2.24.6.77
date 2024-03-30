package X;

import java.util.Collection;

/* renamed from: X.1Js  reason: invalid class name and case insensitive filesystem */
public final class C26321Js {
    public final C19700wN A00;
    public final C19600wD A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass17Z A03;
    public final AnonymousClass005 A04;

    public C26321Js(C19700wN r3, C19600wD r4, AnonymousClass17Z r5, AnonymousClass17B r6, AnonymousClass005 r7) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A00 = r3;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = new AnonymousClass00U(new C26331Jt(r6));
    }

    public final boolean A01(C51322nd r6, AnonymousClass3T1 r7) {
        AnonymousClass00T r3 = this.A02;
        int i = r7.A1I;
        if (!((AnonymousClass9XG) r3.getValue()).A02(i)) {
            return false;
        }
        AnonymousClass4VA r1 = (AnonymousClass4VA) ((AnonymousClass9XG) r3.getValue()).A00(i);
        if ((r6 != C51322nd.PIN || !r1.BMi(r7)) && (r6 != C51322nd.UNPIN || !r1.BNV(r7))) {
            return false;
        }
        return true;
    }

    public static final boolean A00(C51322nd r3, C26321Js r4, AnonymousClass3T1 r5) {
        Object obj = r4.A04.get();
        AnonymousClass00C.A08(obj);
        Iterable<AnonymousClass4RP> iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (AnonymousClass4RP BMi : iterable) {
                if (!BMi.BMi(r5)) {
                    return false;
                }
            }
        }
        if (r4.A01(r3, r5)) {
            return true;
        }
        return false;
    }
}
