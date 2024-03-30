package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.3ur  reason: invalid class name and case insensitive filesystem */
public class C80113ur implements Serializable {
    public static final long serialVersionUID = 1;
    public final int actualActors;
    public final int hostStorage;
    public final long privacyModeTs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C80113ur r7 = (C80113ur) obj;
            if (!(this.hostStorage == r7.hostStorage && this.actualActors == r7.actualActors && this.privacyModeTs == r7.privacyModeTs)) {
                return false;
            }
        }
        return true;
    }

    public C80113ur(C80113ur r3) {
        long j;
        if (r3 == null) {
            this.hostStorage = 0;
            this.actualActors = 0;
            j = 0;
        } else {
            this.hostStorage = r3.hostStorage;
            this.actualActors = r3.actualActors;
            j = r3.privacyModeTs;
        }
        this.privacyModeTs = j;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.hostStorage);
        AnonymousClass000.A1K(A1Q, this.actualActors);
        C36361kB.A1W(A1Q, this.privacyModeTs);
        return Arrays.hashCode(A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyMode{hostStorage=");
        A0u.append(this.hostStorage);
        A0u.append(", actualActors=");
        A0u.append(this.actualActors);
        A0u.append(", privacyModeTs=");
        A0u.append(this.privacyModeTs);
        return AnonymousClass000.A0s(A0u);
    }

    public C80113ur(String str, String str2, String str3) {
        this.hostStorage = AnonymousClass3MC.A01(str);
        this.actualActors = AnonymousClass3MC.A00(str2);
        this.privacyModeTs = AnonymousClass6R8.A01(str3, 0);
    }

    public C80113ur(int i, long j, int i2) {
        this.hostStorage = i;
        this.actualActors = i2;
        this.privacyModeTs = j;
    }

    public C80113ur() {
        this.hostStorage = 0;
        this.actualActors = 0;
        this.privacyModeTs = 0;
    }
}
