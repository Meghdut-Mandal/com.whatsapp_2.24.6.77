package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Kf  reason: invalid class name and case insensitive filesystem */
public class C04330Kf extends C10440eF {
    public static final C04860Mh A03 = C04860Mh.A03(new Object[]{C05920Rp.A00, C05920Rp.A01}, 2);
    public static final Parcelable.Creator CREATOR = new C08330aZ();
    public final C05120Nn A00;
    public final List A01;
    public final byte[] A02;

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        AnonymousClass000.A1K(objArr, Arrays.hashCode(this.A02));
        return AnonymousClass000.A0M(this.A01, objArr, 2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04330Kf) {
            C04330Kf r6 = (C04330Kf) obj;
            if (this.A00.equals(r6.A00) && Arrays.equals(this.A02, r6.A02)) {
                List list = this.A01;
                List list2 = r6.A01;
                if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C04330Kf(String str, List list, byte[] bArr) {
        AnonymousClass006.A01(str);
        try {
            this.A00 = C05120Nn.A00(str);
            AnonymousClass006.A01(bArr);
            this.A02 = bArr;
            this.A01 = list;
        } catch (AnonymousClass0O2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A06 = C10440eF.A06(parcel, this.A00.toString());
        AnonymousClass0Z9.A0F(parcel, this.A02, 3, A06);
        AnonymousClass0Z9.A0E(parcel, this.A01, 4, A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
