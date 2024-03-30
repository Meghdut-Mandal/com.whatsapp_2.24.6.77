package X;

/* renamed from: X.ATc  reason: case insensitive filesystem */
public final class C21636ATc implements C23052B1x {
    public final C196349Zg A00 = new C196349Zg();

    public C193939Nm B1F(AnonymousClass9OY r11, C87374On r12) {
        C193259Kq r2;
        C36331k8.A1I(r12, r11);
        C197849cT r3 = ((C21642ATi) r12).A08.A00;
        if (r3.A00 != C188148z7.UNKNOWN) {
            try {
                r2 = C196349Zg.A00(r3, r11, this.A00, r12);
            } catch (C1888791c | IllegalArgumentException | NullPointerException unused) {
                r2 = new C193259Kq((C23931Ak) null, r3, false);
            }
            if (!r2.A02) {
                C23931Ak r1 = r2.A00;
                if (r1 == null || r1.isEmpty()) {
                    C197849cT r4 = r2.A01;
                    if (r4 != null) {
                        return new C193939Nm((C193229Kn) null, r4, "Failed filter clause", (Throwable) null, false, false, false);
                    }
                    return new C193939Nm((C193229Kn) null, (C197849cT) null, (String) null, (Throwable) null, false, false, false);
                }
                C193229Kn r22 = (C193229Kn) r1.get(0);
                AnonymousClass00C.A0B(r22);
                AnonymousClass00C.A0D(r22, 1);
                return new C193939Nm(r22, (C197849cT) null, "Failed context filter", (Throwable) null, false, false, false);
            }
        }
        return C200489hU.A00();
    }

    public String BxT() {
        return "client_filters";
    }
}
