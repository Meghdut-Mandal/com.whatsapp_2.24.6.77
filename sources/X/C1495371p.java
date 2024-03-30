package X;

import java.io.Closeable;

/* renamed from: X.71p  reason: invalid class name and case insensitive filesystem */
public class C1495371p implements Closeable {
    public boolean A00;
    public final AnonymousClass6FI A01;

    public void close() {
        boolean z;
        AnonymousClass6FI r0;
        int i;
        AnonymousClass6ZI r1;
        synchronized (this) {
            z = true;
            if (!this.A00) {
                this.A00 = true;
            } else {
                z = false;
            }
        }
        if (z) {
            AnonymousClass6FI r5 = this.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("svc-client/onSessionClosed; service=");
            String A0q = AnonymousClass000.A0q("GoogleMigrateClient", A0u);
            if (this instanceof AnonymousClass5KJ) {
                r0 = ((AnonymousClass5KJ) this).A00;
            } else {
                r0 = r5;
            }
            if (r0 == r5) {
                synchronized (r5) {
                    int i2 = r5.A00;
                    if (i2 <= 0) {
                        C36321k7.A1S(", imbalanced ref_cnt=", AnonymousClass000.A0v(A0q), i2);
                        C19700wN r3 = r5.A04;
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("name=");
                        A0u2.append("GoogleMigrateClient");
                        A0u2.append(", counter=");
                        r3.A0E("svc-client-reference-counter-imbalance", C36381kD.A10(A0u2, r5.A00), false);
                        r5.A00 = 0;
                        i = 0;
                    } else {
                        i = i2 - 1;
                        r5.A00 = i;
                    }
                    r1 = null;
                    if (i == 0) {
                        AnonymousClass6ZI r02 = r5.A01;
                        r5.A01 = null;
                        r1 = r02;
                    }
                }
                if (r1 != null) {
                    r1.A01(false);
                    return;
                }
                return;
            }
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("A session from a different client has been provided. Client: ");
            throw AnonymousClass000.A0c("GoogleMigrateClient", A0u3);
        }
    }

    public C1495371p(AnonymousClass6FI r1) {
        this.A01 = r1;
    }
}
