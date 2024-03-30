package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ka  reason: invalid class name and case insensitive filesystem */
public class C04280Ka extends C10440eF {
    public static final C04280Ka A02 = new C04280Ka(AnonymousClass0Nk.NOT_SUPPORTED.toString(), (String) null);
    public static final C04280Ka A03 = new C04280Ka(AnonymousClass0Nk.SUPPORTED.toString(), (String) null);
    public static final Parcelable.Creator CREATOR = new C08400ag();
    public final AnonymousClass0Nk A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (X.C04280Ka) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C04280Ka
            r2 = 0
            if (r0 == 0) goto L_0x0025
            X.0Ka r4 = (X.C04280Ka) r4
            X.0Nk r1 = r3.A00
            X.0Nk r0 = r4.A00
            if (r1 == r0) goto L_0x0015
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0015:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 == r0) goto L_0x0023
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r0 = 1
            return r0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04280Ka.equals(java.lang.Object):boolean");
    }

    public C04280Ka(String str, String str2) {
        AnonymousClass006.A01(str);
        try {
            for (AnonymousClass0Nk r1 : AnonymousClass0Nk.values()) {
                if (str.equals(r1.zzb)) {
                    this.A00 = r1;
                    this.A01 = str2;
                    return;
                }
            }
            throw new AnonymousClass0O4(str);
        } catch (AnonymousClass0O4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, C10440eF.A06(parcel, this.A00.toString()));
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
