package X;

import java.util.List;

/* renamed from: X.6S6  reason: invalid class name */
public final class AnonymousClass6S6 {
    public final C19770wU A00;
    public final C19700wN A01;
    public final C117495mM A02;

    public static final void A01(AnonymousClass6S6 r3, String str) {
        C18740tg.A0D(false, str);
        r3.A01.A0E("E2eMessageValidator/invalid message sent", str, false);
    }

    public static final void A00(AnonymousClass6S6 r4, C203399nx r5, String str, List list) {
        C203399nx[] r3 = r5.A02;
        if (r3 != null) {
            List A0j = r5.A0j(str);
            AnonymousClass00C.A08(A0j);
            list.addAll(A0j);
            for (C203399nx r0 : r3) {
                AnonymousClass00C.A0B(r0);
                A00(r4, r0, str, list);
            }
        }
    }

    public AnonymousClass6S6(C19700wN r1, C117495mM r2, C19770wU r3) {
        C36321k7.A0x(r1, r3);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }
}
