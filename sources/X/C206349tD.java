package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9tD  reason: invalid class name and case insensitive filesystem */
public final class C206349tD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205989sX();
    public final int A00;
    public final List A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0o = C90474aD.A0o(parcel, list);
        while (A0o.hasNext()) {
            ((C206639tj) A0o.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r2.isEmpty() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C206629ti A00() {
        /*
            r5 = this;
            java.util.List r3 = r5.A01
            r2 = 0
            if (r3 == 0) goto L_0x0053
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0053
            r1 = 4
            X.B8m r0 = new X.B8m
            r0.<init>(r1)
            java.util.List r0 = X.C007103b.A0c(r3, r0)
            java.lang.Object r0 = r0.get(r2)
            X.9tj r0 = (X.C206639tj) r0
            java.util.List r2 = r0.A01
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r4 = 0
            if (r1 != 0) goto L_0x0055
            int r1 = r5.A00
            int r0 = r2.size()
            int r3 = java.lang.Math.min(r1, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r1 = r2.next()
            X.9ti r1 = (X.C206629ti) r1
            int r0 = r1.A00
            if (r3 != r0) goto L_0x0036
            X.9ua r0 = r1.A01
            if (r0 == 0) goto L_0x0036
            X.16X r0 = r0.A02
            if (r0 == 0) goto L_0x0036
            java.math.BigDecimal r0 = r0.A00
            if (r0 == 0) goto L_0x0036
            return r1
        L_0x0053:
            r2 = 0
            goto L_0x0024
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206349tD.A00():X.9ti");
    }

    public C206349tD(int i, List list, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = list;
    }
}
