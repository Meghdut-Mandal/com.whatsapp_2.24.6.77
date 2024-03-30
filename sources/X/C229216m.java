package X;

/* renamed from: X.16m  reason: invalid class name and case insensitive filesystem */
public final class C229216m {
    public final C19730wQ A00;
    public final C20830yE A01;

    public C229216m(C19730wQ r2, C20830yE r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean A00() {
        C20830yE r1 = this.A01;
        if ((r1.A02("android.permission.READ_CONTACTS") != 0 || r1.A02("android.permission.WRITE_CONTACTS") != 0) && !this.A00.A0L()) {
            return false;
        }
        return true;
    }
}
