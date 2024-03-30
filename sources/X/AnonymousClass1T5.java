package X;

/* renamed from: X.1T5  reason: invalid class name */
public final class AnonymousClass1T5 {
    public final C19730wQ A00;
    public final C19980wp A01;

    public AnonymousClass1T5(C19730wQ r2, C19980wp r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean A00() {
        if (!this.A00.A0L() || C19980wp.A00(this.A01).getBoolean("ddm_settings_feature_flag", false)) {
            return true;
        }
        return false;
    }
}
