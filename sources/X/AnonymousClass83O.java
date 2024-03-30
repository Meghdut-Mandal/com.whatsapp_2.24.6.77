package X;

/* renamed from: X.83O  reason: invalid class name */
public class AnonymousClass83O extends AnonymousClass103 {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass83O r6 = (AnonymousClass83O) obj;
            if (!(Double.compare(r6.systemTimeS, this.systemTimeS) == 0 && Double.compare(r6.userTimeS, this.userTimeS) == 0 && Double.compare(r6.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(r6.childUserTimeS, this.childUserTimeS) == 0)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A01(AnonymousClass103 r1) {
        A03((AnonymousClass83O) r1);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A02(AnonymousClass103 r5, AnonymousClass103 r6) {
        AnonymousClass83O r52 = (AnonymousClass83O) r5;
        AnonymousClass83O r62 = (AnonymousClass83O) r6;
        if (r62 == null) {
            r62 = new AnonymousClass83O();
        }
        if (r52 == null) {
            r62.A03(this);
            return r62;
        }
        r62.systemTimeS = this.systemTimeS - r52.systemTimeS;
        r62.userTimeS = this.userTimeS - r52.userTimeS;
        r62.childSystemTimeS = this.childSystemTimeS - r52.childSystemTimeS;
        r62.childUserTimeS = this.childUserTimeS - r52.childUserTimeS;
        return r62;
    }

    public void A03(AnonymousClass83O r3) {
        this.userTimeS = r3.userTimeS;
        this.systemTimeS = r3.systemTimeS;
        this.childUserTimeS = r3.childUserTimeS;
        this.childSystemTimeS = r3.childSystemTimeS;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CpuMetrics{userTimeS=");
        A0u.append(this.userTimeS);
        A0u.append(", systemTimeS=");
        A0u.append(this.systemTimeS);
        A0u.append(", childUserTimeS=");
        A0u.append(this.childUserTimeS);
        A0u.append(", childSystemTimeS=");
        A0u.append(this.childSystemTimeS);
        return AnonymousClass000.A0s(A0u);
    }
}
