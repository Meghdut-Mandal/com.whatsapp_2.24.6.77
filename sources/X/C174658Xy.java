package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Xy  reason: invalid class name and case insensitive filesystem */
public final class C174658Xy extends C181008mm {
    public List A00 = C023409w.A00;

    public final void A1Z(List list) {
        AnonymousClass00C.A0D(list, 0);
        C13540k2 r4 = new C13540k2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9VX r1 = (AnonymousClass9VX) it.next();
            C172158Mt r2 = (C172158Mt) C173088Qi.DEFAULT_INSTANCE.A0p();
            r2.A0U(r1.A01);
            C172418Nt r0 = r1.A00;
            if (r0 != null) {
                C173088Qi r12 = (C173088Qi) C90524aI.A0H(r2);
                r12.placeholderMessageResendResponse_ = r0;
                r12.bitField0_ |= 8;
            }
            r4.add(r2.A0R());
        }
        this.A00 = AnonymousClass03S.A00(r4);
    }

    public C174658Xy(C64933Qa r2, String str, long j) {
        super(r2, 84, j);
        this.A00 = str;
    }
}
