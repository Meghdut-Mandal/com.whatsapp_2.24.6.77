package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xd  reason: invalid class name and case insensitive filesystem */
public final class C66743Xd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66523Wh();
    public final int A00;
    public final C52252p8 A01;
    public final C52262p9 A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66743Xd) {
                C66743Xd r5 = (C66743Xd) obj;
                if (!(this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A03, r5.A03) && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A04, r5.A04) && this.A05 == r5.A05 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        C36391kE.A1E(parcel, this.A02);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        C36391kE.A1E(parcel, this.A01);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66743Xd(java.lang.String r8, java.lang.String r9, int r10, int r11, int r12, boolean r13) {
        /*
            r7 = this;
            X.2p9 r2 = X.C52262p9.ONBOARDING
            int r0 = r2.code
            if (r11 == r0) goto L_0x0019
            X.2p9 r2 = X.C52262p9.ACTIVE
            int r0 = r2.code
            if (r11 == r0) goto L_0x0019
            X.2p9 r2 = X.C52262p9.REMOVED
            int r0 = r2.code
            if (r11 == r0) goto L_0x0019
            java.lang.String r0 = "invalid integrator status"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0019:
            X.2p8 r1 = X.C52252p8.USERNAME
            int r0 = r1.code
            if (r12 == r0) goto L_0x0032
            X.2p8 r1 = X.C52252p8.PHONE
            int r0 = r1.code
            if (r12 == r0) goto L_0x0032
            X.2p8 r1 = X.C52252p8.EMAIL
            int r0 = r1.code
            if (r12 == r0) goto L_0x0032
            java.lang.String r0 = "invalid integrator identifier type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0032:
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r13
            r0.<init>((X.C52252p8) r1, (X.C52262p9) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66743Xd.<init>(java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A02, C36381kD.A08(this.A03, this.A00 * 31));
        return C36401kF.A02(this.A01, (C36381kD.A08(this.A04, A052) + C36341k9.A01(this.A05 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IntegratorInfo(id=");
        A0u.append(this.A00);
        A0u.append(", displayName=");
        A0u.append(this.A03);
        A0u.append(", status=");
        A0u.append(this.A02);
        A0u.append(", iconDirectPath=");
        A0u.append(this.A04);
        A0u.append(", optedIn=");
        A0u.append(this.A05);
        A0u.append(", identifierType=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C66743Xd(C52252p8 r2, C52262p9 r3, String str, String str2, int i, boolean z) {
        C36321k7.A12(str, r3, str2);
        AnonymousClass00C.A0D(r2, 6);
        this.A00 = i;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
        this.A05 = z;
        this.A01 = r2;
    }
}
