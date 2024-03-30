package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
public class C04340Kg extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08460am();
    public final AnonymousClass0KJ A00;
    public final AnonymousClass0KN A01;
    public final AnonymousClass0KZ A02;
    public final AnonymousClass0KY A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A03;
        objArr[2] = this.A00;
        return AnonymousClass000.A0M(this.A02, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04340Kg) {
            C04340Kg r4 = (C04340Kg) obj;
            if (!AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04340Kg(AnonymousClass0KJ r1, AnonymousClass0KN r2, AnonymousClass0KY r3, AnonymousClass0KZ r4) {
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A01, 1, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A03, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 3, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 4, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
