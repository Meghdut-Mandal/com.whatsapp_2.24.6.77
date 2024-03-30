package X;

/* renamed from: X.ATd  reason: case insensitive filesystem */
public final class C21637ATd implements B0B {
    public final C193099Jv A00;

    public C21637ATd(C193099Jv r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean B1C(C193229Kn r4, C16540pP r5, C87374On r6) {
        C193099Jv r2 = this.A00;
        if (C36371kC.A01(C36341k9.A0E(r2.A01), "privacy_profile_photo") != 0 || !C36441kJ.A0w(r2.A00.A00.getFilesDir(), "me.jpg").exists()) {
            return false;
        }
        return true;
    }
}
