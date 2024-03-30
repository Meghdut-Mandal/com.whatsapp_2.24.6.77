package X;

import java.util.TimerTask;

/* renamed from: X.79A  reason: invalid class name */
public class AnonymousClass79A extends TimerTask {
    public final /* synthetic */ C107095Mn A00;

    public AnonymousClass79A(C107095Mn r1) {
        this.A00 = r1;
    }

    public void run() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/not-finished-in-");
        C107095Mn r2 = this.A00;
        A0u.append(C36391kE.A0B(r2.A07.A00()));
        C36321k7.A1a(A0u, "-seconds");
        r2.A00.A0H(new C1497072l(this, 4));
    }
}
