package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Q5  reason: invalid class name */
public final class AnonymousClass3Q5 {
    public static final long A03 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final AnonymousClass9YF A01;
    public final String A02;

    public AnonymousClass3Q5(AnonymousClass9YF r2, String str, long j) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            AnonymousClass3Q5 r7 = (AnonymousClass3Q5) obj;
            if (!AnonymousClass00C.A0J(this.A02, r7.A02) || !AnonymousClass00C.A0J(this.A01, r7.A01) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A02;
        A1Q[1] = this.A01;
        C36361kB.A1W(A1Q, this.A00);
        return Arrays.hashCode(A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CtwaAdConsumerDCStateInfo(jid=");
        A0u.append(this.A02);
        A0u.append(", loggingTracker=");
        A0u.append(this.A01);
        A0u.append(", lastInteractionTsMs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
