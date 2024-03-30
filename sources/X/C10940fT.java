package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* renamed from: X.0fT  reason: invalid class name and case insensitive filesystem */
public final class C10940fT implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(17);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Calendar A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10940fT)) {
            return false;
        }
        C10940fT r4 = (C10940fT) obj;
        return this.A03 == r4.A03 && this.A04 == r4.A04;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A05.compareTo(((C10940fT) obj).A05);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }

    public C10940fT(Calendar calendar) {
        calendar.set(5, 1);
        Calendar A012 = AnonymousClass0YR.A01(calendar);
        this.A05 = A012;
        this.A03 = A012.get(2);
        this.A04 = A012.get(1);
        this.A02 = A012.getMaximum(7);
        this.A01 = A012.getActualMaximum(5);
        A012.getTimeInMillis();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A03);
        return AnonymousClass000.A0L(Integer.valueOf(this.A04), A0M);
    }
}
