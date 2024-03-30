package X;

import java.io.File;

/* renamed from: X.AUg  reason: case insensitive filesystem */
public class C21664AUg implements Comparable {
    public int A00;
    public long A01 = -1;
    public boolean A02 = false;
    public final long A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final String A07;
    public final boolean A08;
    public volatile long A09 = -1;

    public C21664AUg(File file, String str, long j, long j2, long j3, boolean z) {
        this.A07 = str;
        this.A05 = j;
        this.A04 = j2;
        this.A08 = z;
        this.A06 = file;
        this.A03 = j3;
    }

    /* renamed from: A00 */
    public int compareTo(C21664AUg aUg) {
        String str = this.A07;
        String str2 = aUg.A07;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        int i = ((this.A05 - aUg.A05) > 0 ? 1 : ((this.A05 - aUg.A05) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CacheSpan{");
        A0u.append(this.A07);
        A0u.append(" lat:");
        A0u.append(this.A03);
        A0u.append(" pos: ");
        A0u.append(this.A05);
        A0u.append(" size: ");
        A0u.append(this.A04);
        return AnonymousClass000.A0s(A0u);
    }
}
