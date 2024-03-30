package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1tv  reason: invalid class name and case insensitive filesystem */
public final class C39841tv extends AnonymousClass04R {
    public final AnonymousClass16D A00;
    public final C220412q A01;

    public static final List A01(C39841tv r5) {
        C44072La r2;
        Collection A0F = r5.A01.A0F();
        if (A0F == null) {
            return C023409w.A00;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : A0F) {
            C65073Qp r22 = (C65073Qp) next;
            if ((r22 instanceof C44072La) && (r2 = (C44072La) r22) != null && r2.A0O()) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        for (Object next2 : A0I) {
            AnonymousClass00C.A0E(next2, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            A0J.add(next2);
        }
        return A0J;
    }

    public C39841tv(AnonymousClass16D r7, C220412q r8) {
        C36321k7.A0x(r8, r7);
        this.A01 = r8;
        this.A00 = r7;
        List A012 = A01(this);
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : A012) {
            C44072La r2 = (C44072La) next;
            if (r2.A0F == C52182p1.VERIFIED && r2.A0C == C52272pA.META_VERIFIED_SUBSCRIPTION) {
                A0I.add(next);
            }
        }
        A0I.isEmpty();
    }
}
