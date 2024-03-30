package X;

/* renamed from: X.83N  reason: invalid class name */
public class AnonymousClass83N extends AnonymousClass103 {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass83N r7 = (AnonymousClass83N) obj;
            if (!(this.mobileBytesTx == r7.mobileBytesTx && this.mobileBytesRx == r7.mobileBytesRx && this.wifiBytesTx == r7.wifiBytesTx && this.wifiBytesRx == r7.wifiBytesRx)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A01(AnonymousClass103 r3) {
        AnonymousClass83N r32 = (AnonymousClass83N) r3;
        this.mobileBytesRx = r32.mobileBytesRx;
        this.mobileBytesTx = r32.mobileBytesTx;
        this.wifiBytesRx = r32.wifiBytesRx;
        this.wifiBytesTx = r32.wifiBytesTx;
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A02(AnonymousClass103 r5, AnonymousClass103 r6) {
        AnonymousClass83N r52 = (AnonymousClass83N) r5;
        AnonymousClass83N r62 = (AnonymousClass83N) r6;
        if (r62 == null) {
            r62 = new AnonymousClass83N();
        }
        if (r52 == null) {
            r62.mobileBytesRx = this.mobileBytesRx;
            r62.mobileBytesTx = this.mobileBytesTx;
            r62.wifiBytesRx = this.wifiBytesRx;
            r62.wifiBytesTx = this.wifiBytesTx;
            return r62;
        }
        r62.mobileBytesTx = this.mobileBytesTx - r52.mobileBytesTx;
        r62.mobileBytesRx = this.mobileBytesRx - r52.mobileBytesRx;
        r62.wifiBytesTx = this.wifiBytesTx - r52.wifiBytesTx;
        r62.wifiBytesRx = this.wifiBytesRx - r52.wifiBytesRx;
        return r62;
    }

    public int hashCode() {
        long j = this.mobileBytesTx;
        int A04 = C165577te.A04(this.wifiBytesTx, C165577te.A04(this.mobileBytesRx, ((int) (j ^ (j >>> 32))) * 31));
        long j2 = this.wifiBytesRx;
        return A04 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NetworkMetrics{mobileBytesTx=");
        A0u.append(this.mobileBytesTx);
        A0u.append(", mobileBytesRx=");
        A0u.append(this.mobileBytesRx);
        A0u.append(", wifiBytesTx=");
        A0u.append(this.wifiBytesTx);
        A0u.append(", wifiBytesRx=");
        A0u.append(this.wifiBytesRx);
        return AnonymousClass000.A0s(A0u);
    }
}
