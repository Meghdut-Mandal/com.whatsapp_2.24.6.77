package X;

/* renamed from: X.6Ai  reason: invalid class name and case insensitive filesystem */
public final class C127966Ai {
    public final long A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127966Ai) {
                C127966Ai r8 = (C127966Ai) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90464aC.A08(this.A00) + this.A01;
    }

    public C127966Ai(long j, int i) {
        this.A00 = j;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("QueuePlayerInfo(durationMsToFinish=");
        A0u.append(this.A00);
        A0u.append(", numberOfQueuedVideos=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
