package X;

/* renamed from: X.6uw  reason: invalid class name and case insensitive filesystem */
public final class C146046uw implements C159497jS {
    public static final C110925bS A06 = new C110925bS();
    public final C19970wo A00;
    public final AnonymousClass1UA A01;
    public final AnonymousClass6P0 A02;
    public final C110925bS A03;
    public final C158287gg A04;
    public final C21430zE A05;

    public static final void A00(C146046uw r3) {
        AnonymousClass1UA r0 = r3.A01;
        ((C1257060y) r0.A01.get()).A00(r3.A02);
        new C128936Ee(3, AnonymousClass6X5.A0L);
        throw AnonymousClass001.A0D();
    }

    public void Blp(C160087kR r18) {
        AnonymousClass6OQ r8;
        C21430zE r3 = this.A05;
        r3.markerStart(386138113);
        AnonymousClass6P0 r11 = this.A02;
        r3.markerAnnotate(386138113, "fb_user_type", r11.A01);
        C160087kR r7 = r18;
        if (!r11.A00) {
            r8 = this.A01.A00(r11);
            if (r8 != null) {
                C19970wo r1 = this.A00;
                Long l = r8.A07;
                if (l != null && C36371kC.A09(r1) > r8.A00 + l.longValue()) {
                    A00(this);
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                A00(this);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            AnonymousClass1UA r9 = this.A01;
            r8 = r9.A00(r11);
            if (r8 != null) {
                C19970wo r12 = this.A00;
                if (!C110935bT.A00(r12, r8, r11)) {
                    Long l2 = r8.A07;
                    if (l2 != null && C36371kC.A09(r12) > r8.A00 + l2.longValue()) {
                        r9.A02(r8, new C164037rA(this, r7, 2), (C128936Ee) null);
                        return;
                    }
                }
            }
            r9.A03(new C164037rA(this, r7, 1), r11, (C128936Ee) null, C90494aF.A0U(), (String) null, (String) null, (String) null);
            return;
        }
        this.A04.B3w((String) C135086c7.A00(r8.A02)).Blp(new AnonymousClass7OV(r8, this, r7, 0));
    }

    public C146046uw(C19970wo r2, AnonymousClass1UA r3, AnonymousClass6P0 r4, C110925bS r5, C158287gg r6, C21430zE r7) {
        C36321k7.A18(r2, r3, r7, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
