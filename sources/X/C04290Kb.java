package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: X.0Kb  reason: invalid class name and case insensitive filesystem */
public final class C04290Kb extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07900Zs();
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj instanceof C04290Kb) {
                C04290Kb r5 = (C04290Kb) obj;
                if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02) || ((str = this.A00) != (str2 = r5.A00) && (str == null || !str.equals(str2)))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C04290Kb(byte[] bArr, String str, boolean z) {
        if (z) {
            AnonymousClass006.A01(bArr);
            AnonymousClass006.A01(str);
        }
        this.A01 = z;
        this.A02 = bArr;
        this.A00 = str;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C10440eF.A05(A0M, this.A01);
        return (AnonymousClass000.A0L(this.A00, A0M) * 31) + Arrays.hashCode(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0A(parcel, 1, this.A01);
        AnonymousClass0Z9.A0F(parcel, this.A02, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A00, 3, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
