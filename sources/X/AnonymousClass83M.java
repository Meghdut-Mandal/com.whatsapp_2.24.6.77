package X;

/* renamed from: X.83M  reason: invalid class name */
public class AnonymousClass83M extends AnonymousClass103 {
    public long realtimeMs;
    public long uptimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass83M r7 = (AnonymousClass83M) obj;
            if (!(this.uptimeMs == r7.uptimeMs && this.realtimeMs == r7.realtimeMs)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A01(AnonymousClass103 r3) {
        AnonymousClass83M r32 = (AnonymousClass83M) r3;
        this.uptimeMs = r32.uptimeMs;
        this.realtimeMs = r32.realtimeMs;
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A02(AnonymousClass103 r5, AnonymousClass103 r6) {
        AnonymousClass83M r52 = (AnonymousClass83M) r5;
        AnonymousClass83M r62 = (AnonymousClass83M) r6;
        if (r62 == null) {
            r62 = new AnonymousClass83M();
        }
        if (r52 == null) {
            r62.uptimeMs = this.uptimeMs;
            r62.realtimeMs = this.realtimeMs;
            return r62;
        }
        r62.uptimeMs = this.uptimeMs - r52.uptimeMs;
        r62.realtimeMs = this.realtimeMs - r52.realtimeMs;
        return r62;
    }

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TimeMetrics{uptimeMs=");
        A0u.append(this.uptimeMs);
        A0u.append(", realtimeMs=");
        A0u.append(this.realtimeMs);
        return AnonymousClass000.A0s(A0u);
    }
}
