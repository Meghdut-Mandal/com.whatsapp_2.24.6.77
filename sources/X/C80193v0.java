package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3v0  reason: invalid class name and case insensitive filesystem */
public final class C80193v0 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C66543Wj();
    public C66753Xe A00;
    public final String A01;
    public transient AnonymousClass11F A02;

    /* renamed from: A00 */
    public int compareTo(C80193v0 r7) {
        AnonymousClass00C.A0D(r7, 0);
        C66753Xe r5 = r7.A00;
        long j = r5.A0I;
        C66753Xe r2 = this.A00;
        int signum = (int) Math.signum((float) (j - r2.A0I));
        if (signum == 0) {
            return (int) Math.signum((float) (r5.A06 - r2.A06));
        }
        return signum;
    }

    public final synchronized AnonymousClass11F A01() {
        AnonymousClass11F r0;
        r0 = this.A02;
        if (r0 == null) {
            C222713q r02 = AnonymousClass11F.A00;
            r0 = C222713q.A01(this.A01);
            this.A02 = r0;
        }
        return r0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80193v0) {
                C80193v0 r5 = (C80193v0) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A02, i);
    }

    public int hashCode() {
        return C36381kD.A08(this.A01, C36391kE.A0A(this.A00)) + AnonymousClass000.A0H(this.A02);
    }

    public C80193v0(C66753Xe r1, AnonymousClass11F r2, String str) {
        C36321k7.A0x(r1, str);
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StorageUsageModel(chatMemory=");
        A0u.append(this.A00);
        A0u.append(", contactRawJid=");
        A0u.append(this.A01);
        A0u.append(", contactJid=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
