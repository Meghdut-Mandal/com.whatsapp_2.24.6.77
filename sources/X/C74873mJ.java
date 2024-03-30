package X;

import java.util.List;

/* renamed from: X.3mJ  reason: invalid class name and case insensitive filesystem */
public final class C74873mJ implements C87774Qc {
    public final AnonymousClass6N7 A00;
    public final List A01;

    public C74873mJ(AnonymousClass6N7 r2, List list) {
        AnonymousClass00C.A0D(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public C88924Uo B4h(boolean z) {
        C135036c1 r1;
        if (z) {
            r1 = AnonymousClass6N7.A00((String) null, 7, false);
        } else {
            r1 = new C135036c1((String) null, 0, 0, 0, false, false);
            r1.A05 = true;
        }
        return new C74843mG(this, this.A00.A01(r1), this.A01);
    }
}
