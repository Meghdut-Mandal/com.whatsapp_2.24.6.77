package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.4s4  reason: invalid class name and case insensitive filesystem */
public final class C98814s4 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205069r1();
    public final String A00;
    public final List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0031
            r2 = 0
            if (r5 == 0) goto L_0x002a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x002a
            X.4s4 r5 = (X.C98814s4) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
        L_0x001e:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0031
        L_0x002a:
            return r2
        L_0x002b:
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            return r2
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98814s4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        List list = this.A01;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 18 + C90474aD.A05(valueOf));
        A0h.append("CapabilityInfo{");
        C90474aD.A1L(A0h, str);
        A0h.append(valueOf);
        return AnonymousClass000.A0q("}", A0h);
    }

    public C98814s4(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        AnonymousClass006.A01(str);
        AnonymousClass006.A01(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A00, 2, false);
        AnonymousClass0Z9.A0E(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
