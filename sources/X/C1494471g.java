package X;

import android.os.ConditionVariable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.71g  reason: invalid class name and case insensitive filesystem */
public final class C1494471g implements AnonymousClass7i6 {
    public final C19700wN A00;
    public final C20810yC A01;
    public final C19770wU A02;
    public final ConcurrentHashMap A03 = C90524aI.A0s();
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7NI(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass7NJ(this));
    public final C21010yW A06;

    public void Bkl(String str, long j) {
        if (j >= C36351kA.A08(this.A05)) {
            AnonymousClass135 r1 = new AnonymousClass135();
            r1.A02 = "work-manager-worker-duration";
            r1.A00 = Long.valueOf(j);
            r1.A01 = str;
            this.A06.Bly(r1);
        }
    }

    public C1494471g(C19700wN r2, C20810yC r3, C21010yW r4, C19770wU r5) {
        C36321k7.A18(r3, r2, r5, r4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r5;
        this.A06 = r4;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
