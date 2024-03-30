package X;

/* renamed from: X.3CN  reason: invalid class name */
public final class AnonymousClass3CN {
    public final C19460v5 A00;

    public final C51762oL A00(AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        int i = r3.A1I;
        if (i == 0) {
            C19460v5 r1 = this.A00;
            if (r1.A05() && C36441kJ.A0f(r1).B5k(r3)) {
                return C51762oL.AGENT_LINKS;
            }
        } else if (i == 1 || i == 3) {
            String A1a = ((AnonymousClass2bU) r3).A1a();
            if (A1a == null || A1a.length() == 0) {
                return C51762oL.IMAGES;
            }
        } else if (i == 20 && r3.A0M == null) {
            return C51762oL.STICKERS;
        }
        return C51762oL.NONE;
    }

    public AnonymousClass3CN(C19460v5 r1) {
        this.A00 = r1;
    }
}
