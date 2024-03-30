package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0KV  reason: invalid class name */
public final class AnonymousClass0KV extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07890Zr();
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0KV) {
                AnonymousClass0KV r5 = (AnonymousClass0KV) obj;
                if (this.A01 != r5.A01 || !AnonymousClass0QM.A00(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0KV(boolean z, String str) {
        if (z) {
            AnonymousClass006.A01(str);
        }
        this.A01 = z;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C10440eF.A05(A0M, this.A01);
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0A(parcel, 1, this.A01);
        C10440eF.A04(parcel, this.A00, A002);
    }
}
