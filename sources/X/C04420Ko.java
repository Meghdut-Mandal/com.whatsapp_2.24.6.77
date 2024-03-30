package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Ko  reason: invalid class name and case insensitive filesystem */
public class C04420Ko extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08470an();
    public final AnonymousClass0KK A00;
    public final AnonymousClass0KM A01;
    public final AnonymousClass0KL A02;
    public final AnonymousClass0KO A03;
    public final AnonymousClass0KP A04;
    public final AnonymousClass0KQ A05;
    public final AnonymousClass0KR A06;
    public final AnonymousClass0KS A07;
    public final AnonymousClass0KT A08;
    public final AnonymousClass0KU A09;

    public boolean equals(Object obj) {
        if (obj instanceof C04420Ko) {
            C04420Ko r4 = (C04420Ko) obj;
            if (!AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A07, r4.A07) || !AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A09, r4.A09) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A08, r4.A08) || !AnonymousClass0QM.A00(this.A05, r4.A05) || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A06, r4.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        objArr[0] = this.A00;
        objArr[1] = this.A07;
        objArr[2] = this.A01;
        objArr[3] = this.A09;
        objArr[4] = this.A03;
        objArr[5] = this.A04;
        objArr[6] = this.A08;
        objArr[7] = this.A05;
        objArr[8] = this.A02;
        return AnonymousClass000.A0M(this.A06, objArr, 9);
    }

    public C04420Ko(AnonymousClass0KK r1, AnonymousClass0KL r2, AnonymousClass0KM r3, AnonymousClass0KO r4, AnonymousClass0KP r5, AnonymousClass0KQ r6, AnonymousClass0KR r7, AnonymousClass0KS r8, AnonymousClass0KT r9, AnonymousClass0KU r10) {
        this.A00 = r1;
        this.A01 = r3;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A05 = r6;
        this.A02 = r2;
        this.A06 = r7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A00, 2, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A07, 3, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 4, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A09, 5, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A03, 6, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A04, 7, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A08, 8, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A05, 9, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A02, 10, i, false);
        AnonymousClass0Z9.A0B(parcel, this.A06, 11, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
