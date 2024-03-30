package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3uV  reason: invalid class name and case insensitive filesystem */
public final class C79923uV implements B0B {
    public final C19760wT A00;
    public final C19420v0 A01;
    public final C20810yC A02;

    public boolean B1C(C193229Kn r9, C16540pP r10, C87374On r11) {
        TimeUnit timeUnit;
        long parseLong;
        AnonymousClass00C.A0D(r9, 1);
        String A1A = C36431kI.A1A("param", r9.A01);
        if (A1A == null) {
            timeUnit = TimeUnit.MINUTES;
            parseLong = C36441kJ.A0B(this.A02, 4214);
        } else {
            timeUnit = TimeUnit.SECONDS;
            parseLong = Long.parseLong(A1A);
        }
        long millis = timeUnit.toMillis(parseLong);
        C19420v0 r3 = this.A01;
        int A0O = r3.A0O("privacy_profile_photo", 0);
        long A0V = r3.A0V("privacy_tip_remove_profile_photo_timestamp");
        if (((int) A0V) == -1) {
            return false;
        }
        long j = A0V + millis;
        if (A0O != 0 || System.currentTimeMillis() >= j) {
            return false;
        }
        return true;
    }

    public C79923uV(C19760wT r1, C19420v0 r2, C20810yC r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
