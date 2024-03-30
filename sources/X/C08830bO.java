package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bO  reason: invalid class name and case insensitive filesystem */
public class C08830bO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C08550av();
    public final C16890qG A00;

    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.0Nq[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.0Nq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.0Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.0Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.0Nr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.0Nr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C08830bO A00(int r6) {
        /*
            X.0Nr r0 = X.AnonymousClass0Nr.LEGACY_RS1
            int r0 = r0.zzb
            if (r6 != r0) goto L_0x000e
            X.0Nr r5 = X.AnonymousClass0Nr.RS1
        L_0x0008:
            X.0bO r0 = new X.0bO
            r0.<init>(r5)
            return r0
        L_0x000e:
            X.0Nr[] r4 = X.AnonymousClass0Nr.values()
            int r2 = r4.length
            r3 = 0
            r1 = 0
        L_0x0015:
            if (r1 >= r2) goto L_0x0020
            r5 = r4[r1]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0020:
            X.0Nq[] r2 = X.AnonymousClass0Nq.values()
            int r1 = r2.length
        L_0x0025:
            if (r3 >= r1) goto L_0x0030
            r5 = r2[r3]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0030:
            X.0O0 r0 = new X.0O0
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08830bO.A00(int):X.0bO");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C08830bO) || this.A00.B8Q() != ((C08830bO) obj).A00.B8Q()) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.B8Q());
    }

    public C08830bO(C16890qG r1) {
        AnonymousClass006.A01(r1);
        this.A00 = r1;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A00, AnonymousClass001.A0L());
    }
}
