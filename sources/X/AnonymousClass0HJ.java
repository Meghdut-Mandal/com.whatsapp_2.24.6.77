package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.0HJ  reason: invalid class name */
public class AnonymousClass0HJ extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C18580tO(2);
    public SparseArray A00;

    public AnonymousClass0HJ(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        SparseArray sparseArray = new SparseArray(readInt);
        this.A00 = sparseArray;
        for (int i = 0; i < readInt; i++) {
            sparseArray.append(iArr[i], readParcelableArray[i]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.Parcelable[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            super.writeToParcel(r6, r7)
            android.util.SparseArray r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x0028
            int r3 = r0.size()
        L_0x000c:
            r6.writeInt(r3)
            int[] r2 = new int[r3]
            android.os.Parcelable[] r1 = new android.os.Parcelable[r3]
        L_0x0013:
            if (r4 >= r3) goto L_0x002a
            android.util.SparseArray r0 = r5.A00
            int r0 = r0.keyAt(r4)
            r2[r4] = r0
            android.util.SparseArray r0 = r5.A00
            java.lang.Object r0 = r0.valueAt(r4)
            r1[r4] = r0
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            r3 = 0
            goto L_0x000c
        L_0x002a:
            r6.writeIntArray(r2)
            r6.writeParcelableArray(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HJ.writeToParcel(android.os.Parcel, int):void");
    }

    public AnonymousClass0HJ(Parcelable parcelable) {
        super(parcelable);
    }
}
