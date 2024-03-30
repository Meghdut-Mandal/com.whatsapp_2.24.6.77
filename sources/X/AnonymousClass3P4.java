package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.3P4  reason: invalid class name */
public final class AnonymousClass3P4 {
    public HashMap A00 = AnonymousClass001.A0J();
    public final C19970wo A01;
    public final C20810yC A02;
    public final C233818g A03;
    public final C19770wU A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass4EA(this));
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4EB(this));
    public final C21010yW A07;

    public final AnonymousClass3DQ A01(int i) {
        if (!this.A02.A0E(4928)) {
            return null;
        }
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        ((C19930wk) this.A06.getValue()).execute(new C80353vG(this, i, leastSignificantBits, 6));
        return new AnonymousClass3DQ(this, leastSignificantBits);
    }

    public AnonymousClass3P4(C19970wo r2, C20810yC r3, C21010yW r4, C233818g r5, C19770wU r6) {
        C36321k7.A1B(r2, r3, r6, r4, r5);
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r6;
        this.A07 = r4;
        this.A03 = r5;
    }

    public static final void A00(AnonymousClass37X r5, AnonymousClass3P4 r6) {
        long A0B = C36391kE.A0B(SystemClock.elapsedRealtime() - r5.A00);
        if (A0B > 0) {
            AnonymousClass2QW r1 = r5.A01;
            r1.A02 = Long.valueOf(A0B);
            r6.A07.Blv(r1);
        }
    }
}
