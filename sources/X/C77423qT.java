package X;

/* renamed from: X.3qT  reason: invalid class name and case insensitive filesystem */
public final class C77423qT implements C88544Tc {
    public C220412q A00;
    public C20810yC A01;

    public /* synthetic */ boolean BMn(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 1);
        return BN1(r2);
    }

    public boolean BN1(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass11F r1 = r5.A1J.A00;
        if (r1 instanceof C28981Uw) {
            C220412q r0 = this.A00;
            if (r0 != null) {
                C65073Qp A09 = r0.A09(r1, false);
                AnonymousClass00C.A0E(A09, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
                if (!((C44072La) A09).A0L()) {
                    return false;
                }
                C20810yC r12 = this.A01;
                if (r12 == null) {
                    throw C36321k7.A07();
                } else if (r12.A0E(7211)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                throw C36331k8.A0d("chatsCache");
            }
        }
        return true;
    }
}
