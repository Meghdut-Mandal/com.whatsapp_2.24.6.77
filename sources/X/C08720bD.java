package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* renamed from: X.0bD  reason: invalid class name and case insensitive filesystem */
public final class C08720bD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18440tA(16);
    public C10940fT A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C10940fT A04;
    public final C10940fT A05;

    public C08720bD(C10940fT r5, C10940fT r6, C10940fT r7, int i) {
        Objects.requireNonNull(r5, "start cannot be null");
        Objects.requireNonNull(r6, "end cannot be null");
        Objects.requireNonNull((Object) null, "validator cannot be null");
        this.A05 = r5;
        this.A04 = r6;
        this.A00 = r7;
        this.A01 = i;
        if (r7 != null) {
            Calendar calendar = r5.A05;
            Calendar calendar2 = r7.A05;
            if (calendar.compareTo(calendar2) > 0) {
                throw AnonymousClass001.A08("start Month cannot be after current Month");
            } else if (calendar2.compareTo(r6.A05) > 0) {
                throw AnonymousClass001.A08("current Month cannot be after end Month");
            }
        }
        if (i < 0 || i > AnonymousClass0YR.A02((Calendar) null).getMaximum(7)) {
            throw AnonymousClass001.A08("firstDayOfWeek is not valid");
        } else if (r5.A05 instanceof GregorianCalendar) {
            int i2 = r6.A04 - r5.A04;
            this.A02 = (i2 * 12) + (r6.A03 - r5.A03) + 1;
            this.A03 = i2 + 1;
        } else {
            throw AnonymousClass001.A08("Only Gregorian calendars are supported.");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C08720bD) {
            C08720bD r4 = (C08720bD) obj;
            if (this.A05.equals(r4.A05) && this.A04.equals(r4.A04) && C014106d.A01(this.A00, r4.A00) && this.A01 == r4.A01) {
                throw AnonymousClass001.A0A("equals");
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        objArr[2] = this.A00;
        objArr[3] = Integer.valueOf(this.A01);
        return AnonymousClass000.A0M((Object) null, objArr, 4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable((Parcelable) null, 0);
        parcel.writeInt(this.A01);
    }
}
