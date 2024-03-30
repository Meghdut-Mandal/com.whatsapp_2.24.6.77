package X;

/* renamed from: X.9fo  reason: invalid class name and case insensitive filesystem */
public final class C199699fo {
    public int A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199699fo) {
                C199699fo r8 = (C199699fo) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90464aC.A08(this.A01) + this.A00;
    }

    public C199699fo(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EphemeralSyncResponseInfo(lastSyncResponseSentTimestamp=");
        A0u.append(this.A01);
        A0u.append(", noOfRetriesSentAlready=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C199699fo() {
        this(0, 0);
    }
}
