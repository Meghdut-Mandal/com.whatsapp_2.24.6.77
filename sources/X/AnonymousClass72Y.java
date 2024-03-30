package X;

import java.io.Serializable;
import java.text.DateFormat;

/* renamed from: X.72Y  reason: invalid class name */
public class AnonymousClass72Y implements Comparable, Serializable {
    public static final long serialVersionUID = 8139806907588338737L;
    public final long ntpTime;
    public DateFormat simpleFormatter;
    public DateFormat utcFormatter;

    public static long A00(long j) {
        long j2;
        long j3 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (j & 4294967295L)) * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j3) == 0) {
            j2 = 2085978496000L;
        } else {
            j2 = -2208988800000L;
        }
        return (j3 * 1000) + j2 + round;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = (this.ntpTime > ((AnonymousClass72Y) obj).ntpTime ? 1 : (this.ntpTime == ((AnonymousClass72Y) obj).ntpTime ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return C90504aG.A1T(i) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass72Y) || this.ntpTime != ((AnonymousClass72Y) obj).ntpTime) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.ntpTime);
    }

    public String toString() {
        long j = this.ntpTime;
        StringBuilder A0u = AnonymousClass000.A0u();
        String hexString = Long.toHexString((j >>> 32) & 4294967295L);
        for (int length = hexString.length(); length < 8; length++) {
            A0u.append('0');
        }
        A0u.append(hexString);
        A0u.append('.');
        String hexString2 = Long.toHexString(j & 4294967295L);
        for (int length2 = hexString2.length(); length2 < 8; length2++) {
            A0u.append('0');
        }
        return AnonymousClass000.A0q(hexString2, A0u);
    }

    public AnonymousClass72Y(long j) {
        this.ntpTime = j;
    }
}
