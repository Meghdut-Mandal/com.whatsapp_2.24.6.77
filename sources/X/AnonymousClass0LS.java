package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0LS  reason: invalid class name */
public class AnonymousClass0LS extends AnonymousClass0K0 {
    public static final Parcelable.Creator CREATOR = new C08530at();
    public final C05090Nj A00;
    public final String A01;
    public final int A02;

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        return AnonymousClass000.A0M(Integer.valueOf(this.A02), objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0LS) {
            AnonymousClass0LS r4 = (AnonymousClass0LS) obj;
            if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(Integer.valueOf(this.A02), Integer.valueOf(r4.A02))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0LS(int i, String str, int i2) {
        try {
            for (C05090Nj r1 : C05090Nj.values()) {
                if (i == r1.zzb) {
                    this.A00 = r1;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new AnonymousClass0O1(i);
        } catch (AnonymousClass0O1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String toString() {
        AnonymousClass0UO r4 = new AnonymousClass0UO(getClass().getSimpleName());
        String valueOf = String.valueOf(this.A00.zzb);
        AnonymousClass0MU r1 = new AnonymousClass0MU((AnonymousClass0OX) null);
        r4.A00.A00 = r1;
        r4.A00 = r1;
        r1.A01 = valueOf;
        r1.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            r4.A00(str, "errorMessage");
        }
        return r4.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A00.zzb);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, false);
        AnonymousClass0Z9.A08(parcel, 4, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
