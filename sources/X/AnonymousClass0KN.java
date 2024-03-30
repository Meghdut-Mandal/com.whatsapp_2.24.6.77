package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0KN  reason: invalid class name */
public class AnonymousClass0KN extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08430aj();
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass0KN
            r3 = 0
            if (r0 == 0) goto L_0x000f
            X.0KN r5 = (X.AnonymousClass0KN) r5
            java.util.List r2 = r4.A00
            java.util.List r1 = r5.A00
            if (r2 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x001e
        L_0x000f:
            return r3
        L_0x0010:
            if (r1 == 0) goto L_0x000f
            boolean r0 = r2.containsAll(r1)
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x000f
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KN.equals(java.lang.Object):boolean");
    }

    public AnonymousClass0KN(List list) {
        this.A00 = list;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(new HashSet(this.A00), AnonymousClass001.A0L());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0E(parcel, this.A00, 1, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
