package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4kE  reason: invalid class name and case insensitive filesystem */
public class C95204kE extends C08840bP {
    public static final Parcelable.Creator CREATOR = new C165107st(0);
    public final AnonymousClass007 A00;

    public C95204kE(Parcelable parcelable) {
        super(parcelable);
        this.A00 = new AnonymousClass007(0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExtendableSavedState{");
        C90504aG.A0z(System.identityHashCode(this), A0u);
        A0u.append(" states=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            super.writeToParcel(r8, r9)
            X.007 r6 = r7.A00
            int r5 = r6.size()
            r8.writeInt(r5)
            java.lang.String[] r4 = new java.lang.String[r5]
            android.os.Bundle[] r3 = new android.os.Bundle[r5]
            r2 = 0
            r1 = 0
        L_0x0012:
            if (r1 >= r5) goto L_0x0023
            java.lang.Object r0 = r6.A04(r1)
            r4[r1] = r0
            java.lang.Object r0 = r6.A06(r1)
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0023:
            r8.writeStringArray(r4)
            r8.writeTypedArray(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95204kE.writeToParcel(android.os.Parcel, int):void");
    }

    public C95204kE(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new AnonymousClass007(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }
}
