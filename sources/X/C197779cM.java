package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9cM  reason: invalid class name and case insensitive filesystem */
public final class C197779cM {
    public final C197999cj A00;
    public final C30131Zi A01;
    public final C19770wU A02;

    public static final void A00(C159607jd r15, C197779cM r16, AnonymousClass2bS r17, String str) {
        Map A0D;
        List list;
        C19770wU r3;
        Runnable r2;
        AnonymousClass2bS r4 = r17;
        C64933Qa r1 = r4.A1J;
        AnonymousClass11F r7 = r1.A00;
        C197779cM r5 = r16;
        if (!(r7 instanceof C28981Uw)) {
            r3 = r5.A02;
            r2 = new C81123wV((Object) r15, 14);
        } else {
            String str2 = r1.A01;
            AnonymousClass00C.A07(str2);
            C197999cj r32 = r5.A00;
            C197999cj.A00(r32);
            C199839g6 r0 = (C199839g6) r32.A02.get(str2);
            String str3 = str;
            if (str == null) {
                if (r0 != null) {
                    A0D = r0.A03;
                }
                A0D = C000400e.A0D();
            } else {
                if (r0 == null || (list = C90524aI.A0o(str3, r0.A02)) == null) {
                    list = C023409w.A00;
                }
                if (C36401kF.A1a(list)) {
                    A0D = C36391kE.A11(str3, list);
                }
                A0D = C000400e.A0D();
            }
            if (!A0D.isEmpty()) {
                r3 = r5.A02;
                r2 = new C1502074j(r15, A0D, 37);
            } else {
                int size = r4.A05.size();
                if (size < 2) {
                    size = 2;
                }
                int i = 5000;
                if (str == null) {
                    i = size * 10;
                }
                C30131Zi r12 = r5.A01;
                AnonymousClass00C.A0E(r7, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                C28981Uw r72 = (C28981Uw) r7;
                long j = r4.A1O;
                Integer valueOf = Integer.valueOf(i);
                C21228ADk aDk = new C21228ADk(r32, r15, r4, str3);
                AnonymousClass00C.A0D(r72, 0);
                C18800tq r13 = r12.A08.A00.A00;
                AnonymousClass171 A0S = C36341k9.A0S(r13);
                new AnonymousClass8fT(C36351kA.A0N(r13), C36341k9.A0R(r13), A0S, (AnonymousClass12O) r13.A98.get(), C36391kE.A0g(r13), r72, (AnonymousClass4OL) r13.A5l.get(), aDk, C36341k9.A0Z(r13), valueOf, str3, j).A01();
                return;
            }
        }
        r3.Boy(r2);
    }

    public C197779cM(C197999cj r1, C30131Zi r2, C19770wU r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
