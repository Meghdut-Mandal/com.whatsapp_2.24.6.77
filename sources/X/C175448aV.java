package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.8aV  reason: invalid class name and case insensitive filesystem */
public final class C175448aV extends C175458aW {
    public static final long A03;
    public static final long A04;
    public final long A00;
    public final C175418aS A01;
    public final AnonymousClass9YF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175448aV(C175418aS r2, AnonymousClass9YF r3, long j) {
        super(r2, r3);
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C175448aV) {
                C175448aV r8 = (C175448aV) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A04 = timeUnit.toMillis(7);
        A03 = timeUnit.toMillis(7);
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A02, C36391kE.A0A(this.A01)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CtwaAdsConversionInfo(entryPoint=");
        A0u.append(this.A01);
        A0u.append(", loggingTracker=");
        A0u.append(this.A02);
        A0u.append(", lastInteractionTsMs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
