package X;

/* renamed from: X.ATb  reason: case insensitive filesystem */
public final class C21635ATb implements C23052B1x {
    public String BxT() {
        return null;
    }

    public C193939Nm B1F(AnonymousClass9OY r9, C87374On r10) {
        String str;
        boolean A1a = C36331k8.A1a(r10, r9);
        C20760y7 r2 = r9.A02;
        if (r2.isEmpty()) {
            str = "No triggers";
        } else {
            str = "Unsupported trigger";
            if (r2.size() == A1a) {
                Object A0I = C007103b.A0I(r2);
                if (A0I == null) {
                    throw C36381kD.A0l();
                } else if (((C21642ATi) r10).A0H.contains(A0I)) {
                }
            } else {
                for (Object contains : ((C21642ATi) r10).A0H) {
                    if (r2.contains(contains)) {
                    }
                }
            }
            return C200489hU.A00();
        }
        return new C193939Nm((C193229Kn) null, (C197849cT) null, str, (Throwable) null, false, false, false);
    }
}
