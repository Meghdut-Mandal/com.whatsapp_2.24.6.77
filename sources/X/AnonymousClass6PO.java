package X;

/* renamed from: X.6PO  reason: invalid class name */
public final class AnonymousClass6PO {
    public final C19730wQ A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass1BF A03;
    public final C005502l A04;

    public final C119575q5 A00(boolean z) {
        String str;
        if (z) {
            str = "EMOJI";
        } else {
            str = "GIFS";
        }
        String string = C36341k9.A0E(this.A01).getString("expressions_keyboard_selected_tab", str);
        AnonymousClass00C.A08(string);
        int ordinal = C108535Tw.valueOf(string).ordinal();
        if (ordinal == 0) {
            return AnonymousClass55N.A00;
        }
        if (ordinal == 1) {
            return AnonymousClass55O.A00;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw C36441kJ.A18();
            }
        } else if (this.A03.A01() || (!this.A00.A0L() && this.A02.A0E(4890))) {
            return AnonymousClass55M.A00;
        }
        return AnonymousClass55P.A00;
    }

    public AnonymousClass6PO(C19730wQ r1, C19420v0 r2, C20810yC r3, AnonymousClass1BF r4, C005502l r5) {
        C36321k7.A1B(r3, r1, r2, r4, r5);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
