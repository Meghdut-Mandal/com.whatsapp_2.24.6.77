package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kq  reason: invalid class name and case insensitive filesystem */
public class C04440Kq extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08540au();
    public final C05100Nl A00;
    public final Boolean A01;
    public final C05130No A02;
    public final C05080Ni A03;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        return AnonymousClass000.A0M(A00(), objArr, 3);
    }

    public C05130No A00() {
        C05130No r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        Boolean bool = this.A01;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return C05130No.RESIDENT_KEY_REQUIRED;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04440Kq) {
            C04440Kq r4 = (C04440Kq) obj;
            if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(A00(), r4.A00())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04440Kq(Boolean bool, String str, String str2, String str3) {
        C05100Nl r0;
        C05080Ni r4;
        C05130No r5 = null;
        if (str == null) {
            r0 = null;
        } else {
            try {
                r0 = C05100Nl.A00(str);
            } catch (C05190Ny | AnonymousClass0O3 | AnonymousClass0O5 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = r0;
        this.A01 = bool;
        if (str2 == null) {
            r4 = null;
        } else {
            C05080Ni[] values = C05080Ni.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                r4 = values[i];
                if (!str2.equals(r4.zze)) {
                    i++;
                }
            }
            throw new AnonymousClass0O5(str2);
        }
        this.A03 = r4;
        this.A02 = str3 != null ? C05130No.A00(str3) : r5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String obj;
        String obj2;
        String obj3;
        int A002 = AnonymousClass0Z9.A00(parcel);
        C05100Nl r0 = this.A00;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        boolean A06 = C10440eF.A06(parcel, obj);
        Boolean bool = this.A01;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C05080Ni r02 = this.A03;
        if (r02 == null) {
            obj2 = null;
        } else {
            obj2 = r02.toString();
        }
        AnonymousClass0Z9.A0C(parcel, obj2, 4, A06);
        C05130No A003 = A00();
        if (A003 == null) {
            obj3 = null;
        } else {
            obj3 = A003.toString();
        }
        AnonymousClass0Z9.A0C(parcel, obj3, 5, A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
