package X;

/* renamed from: X.51z  reason: invalid class name and case insensitive filesystem */
public final class C1028051z extends AnonymousClass1PM {
    public final C121635tS A0E(String str) {
        AnonymousClass00C.A0D(str, 0);
        C121635tS r3 = (C121635tS) A09(str);
        if (r3 != null) {
            String str2 = r3.A00;
            if (!C90484aE.A1W(str2)) {
                A0C(str);
            } else {
                if (r3.A02 == null && !C224714l.A02()) {
                    r3.A02 = C25541Gs.A04(C90524aI.A0S(str2));
                }
                return r3;
            }
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1028051z(C19760wT r2, C220112n r3, int i) {
        super(r2, r3, "gifmemorycache", i);
        C36321k7.A0x(r3, r2);
        A08();
    }
}
