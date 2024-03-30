package X;

import android.content.SharedPreferences;

/* renamed from: X.1I4  reason: invalid class name */
public class AnonymousClass1I4 {
    public boolean A00 = false;
    public boolean A01 = true;
    public final AnonymousClass17Y A02;
    public final C19420v0 A03;
    public final AnonymousClass1I3 A04;
    public final C20810yC A05;

    public boolean A00() {
        this.A02.Bp3(new C35691j6(this, 31));
        if (!C20800yB.A01(C21000yV.A02, this.A05, 1624)) {
            return true;
        }
        C19420v0 r2 = this.A03;
        if (!((SharedPreferences) r2.A00.get()).contains("tos_2016_opt_out_state") || r2.A2M()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1I4(AnonymousClass17Y r2, C19420v0 r3, AnonymousClass1I3 r4, C20810yC r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }
}
