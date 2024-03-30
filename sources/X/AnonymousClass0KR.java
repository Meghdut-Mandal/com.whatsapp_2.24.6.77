package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0KR  reason: invalid class name */
public final class AnonymousClass0KR extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08300aW();
    public final byte[][] A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KR)) {
            return false;
        }
        return Arrays.deepEquals(this.A00, ((AnonymousClass0KR) obj).A00);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] A0M : this.A00) {
            i ^= AnonymousClass000.A0M(A0M, AnonymousClass001.A0L(), 0);
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r6[r3] != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0KR(byte[][] r6) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1V(r6)
            X.AnonymousClass006.A06(r0)
            int r4 = r6.length
            r0 = r4 & 1
            r1 = r0 ^ 1
            r0 = 1
            if (r2 == r1) goto L_0x0014
            r0 = 0
        L_0x0014:
            X.AnonymousClass006.A06(r0)
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0043
            if (r3 == 0) goto L_0x0021
            r1 = r6[r3]
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            X.AnonymousClass006.A06(r0)
            int r1 = r3 + 1
            r0 = r6[r1]
            boolean r0 = X.AnonymousClass000.A1V(r0)
            X.AnonymousClass006.A06(r0)
            r0 = r6[r1]
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L_0x003c
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            X.AnonymousClass006.A06(r0)
            int r3 = r3 + 2
            goto L_0x0018
        L_0x0043:
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KR.<init>(byte[][]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0I(parcel, this.A00, 1);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
