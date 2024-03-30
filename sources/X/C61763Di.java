package X;

import com.whatsapp.R;

/* renamed from: X.3Di  reason: invalid class name and case insensitive filesystem */
public final class C61763Di {
    public final C19420v0 A00;
    public final C236519h A01;
    public final C20810yC A02;

    public final void A00(AnonymousClass01I r9) {
        if (this.A02.A0E(7306) && C19550w8.A08() && !this.A01.A00.A00() && !this.A00.A2U("android.permission.SCHEDULE_EXACT_ALARM") && !r9.isFinishing() && (r9 instanceof C225314u)) {
            ((C225314u) r9).A3A(new AnonymousClass4YD(r9, this, 4), new C89644Xi(this, 3), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public C61763Di(C236519h r1, C19420v0 r2, C20810yC r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }
}
