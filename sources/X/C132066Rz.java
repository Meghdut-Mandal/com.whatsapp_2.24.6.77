package X;

import java.util.Iterator;

/* renamed from: X.6Rz  reason: invalid class name and case insensitive filesystem */
public final class C132066Rz {
    public final C17560rc A00;
    public final C157957ey A01;

    public static void A00(C160847lg r3, AnonymousClass6MU r4) {
        Iterator A0r = C90474aD.A0r(r4.A01.values());
        while (A0r.hasNext()) {
            C125255za r1 = (C125255za) A0r.next();
            if (r1 instanceof C98534ra) {
                ((C98534ra) r1).A00 = AnonymousClass001.A0F(r3);
            }
        }
    }

    public C132066Rz(C98454rS r1, C140966mS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
