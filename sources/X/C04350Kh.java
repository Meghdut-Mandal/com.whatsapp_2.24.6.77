package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0Kh  reason: invalid class name and case insensitive filesystem */
public class C04350Kh extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08370ad();
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A00;
        objArr[2] = this.A01;
        return AnonymousClass000.A0M(this.A02, objArr, 3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04350Kh) {
            C04350Kh r4 = (C04350Kh) obj;
            if (!Arrays.equals(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04350Kh(String str, String str2, String str3, byte[] bArr) {
        AnonymousClass006.A01(bArr);
        this.A03 = bArr;
        AnonymousClass006.A01(str);
        this.A00 = str;
        this.A01 = str2;
        AnonymousClass006.A01(str3);
        this.A02 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0F(parcel, this.A03, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A00, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 4, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 5, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
