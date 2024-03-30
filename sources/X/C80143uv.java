package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3uv  reason: invalid class name and case insensitive filesystem */
public class C80143uv implements Comparable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C19730wQ A03;
    public final AnonymousClass11F A04;
    public final String A05;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A05;
        C36361kB.A1W(objArr, this.A01);
        objArr[3] = Long.valueOf(this.A02);
        return AnonymousClass000.A0M(Long.valueOf(this.A00), objArr, 4);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C80143uv r7 = (C80143uv) obj;
        C19730wQ r0 = this.A03;
        AnonymousClass11F r5 = this.A04;
        boolean A0M = r0.A0M(r5);
        AnonymousClass11F r4 = r7.A04;
        if (A0M == r0.A0M(r4)) {
            int compare = Long.compare(this.A02, r7.A02);
            if (compare != 0) {
                return compare;
            }
            int compareTo = r5.compareTo((Jid) r4);
            if (compareTo == 0) {
                return Long.compare(this.A00, r7.A00);
            }
            return compareTo;
        } else if (A0M) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C80143uv)) {
            return false;
        }
        C80143uv r7 = (C80143uv) obj;
        if (this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A04.equals(r7.A04) && C1901797e.A00(this.A05, r7.A05)) {
            return true;
        }
        return false;
    }

    public C80143uv(C19730wQ r1, AnonymousClass11F r2, String str, long j, long j2, long j3) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = str;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }
}
