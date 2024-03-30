package X;

import android.os.Parcelable;

/* renamed from: X.6as  reason: invalid class name and case insensitive filesystem */
public final class C134336as implements Parcelable.Creator {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.6bT[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r7 = X.C36341k9.A0g(r14)
            java.lang.String r8 = r14.readString()
            java.lang.String r0 = r14.readString()
            X.5SO r6 = X.AnonymousClass5SO.valueOf(r0)
            int r0 = r14.readInt()
            r3 = 0
            if (r0 != 0) goto L_0x003a
            r4 = r3
        L_0x0018:
            X.6be r4 = (X.C134816be) r4
            java.lang.String r9 = r14.readString()
            java.lang.String r10 = r14.readString()
            java.lang.String r11 = r14.readString()
            int r2 = r14.readInt()
            X.6bT[] r12 = new X.C134706bT[r2]
            r1 = 0
        L_0x002d:
            if (r1 == r2) goto L_0x0041
            android.os.Parcelable$Creator r0 = X.C134706bT.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r14)
            r12[r1] = r0
            int r1 = r1 + 1
            goto L_0x002d
        L_0x003a:
            android.os.Parcelable$Creator r0 = X.C134816be.CREATOR
            java.lang.Object r4 = r0.createFromParcel(r14)
            goto L_0x0018
        L_0x0041:
            int r0 = r14.readInt()
            if (r0 != 0) goto L_0x0066
            r5 = r3
        L_0x0048:
            X.6bF r5 = (X.C134566bF) r5
            android.os.Parcelable$Creator r0 = X.C134636bM.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r14)
            X.6bM r2 = (X.C134636bM) r2
            int r0 = r14.readInt()
            if (r0 == 0) goto L_0x005e
            android.os.Parcelable$Creator r0 = X.C134636bM.CREATOR
            java.lang.Object r3 = r0.createFromParcel(r14)
        L_0x005e:
            X.6bM r3 = (X.C134636bM) r3
            X.6bi r1 = new X.6bi
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0066:
            android.os.Parcelable$Creator r0 = X.C134566bF.CREATOR
            java.lang.Object r5 = r0.createFromParcel(r14)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134336as.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C134856bi[i];
    }
}
