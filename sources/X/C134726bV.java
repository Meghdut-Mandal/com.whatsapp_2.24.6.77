package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.6bV  reason: invalid class name and case insensitive filesystem */
public final class C134726bV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133906aB();
    public final BigDecimal A00;
    public final Date A01;
    public final Date A02;
    public final C132386Tk A03;

    public C134726bV(C132386Tk r2, BigDecimal bigDecimal, Date date, Date date2) {
        AnonymousClass00C.A0D(bigDecimal, 1);
        this.A00 = bigDecimal;
        this.A03 = r2;
        this.A02 = date;
        this.A01 = date2;
    }

    public final boolean A00(Date date) {
        Date date2;
        AnonymousClass00C.A0D(date, 0);
        Date date3 = this.A02;
        if (date3 == null || (date2 = this.A01) == null || (date.after(date3) && date.before(date2))) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C134726bV r4 = (C134726bV) obj;
            if (!C1901797e.A00(this.A00, r4.A00) || !C1901797e.A00(this.A03, r4.A03) || !C1901797e.A00(this.A02, r4.A02) || !C1901797e.A00(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeSerializable(this.A00);
        String str = this.A03.A00;
        AnonymousClass00C.A08(str);
        parcel.writeString(str);
        parcel.writeSerializable(this.A02);
        parcel.writeSerializable(this.A01);
    }

    public int hashCode() {
        int i = 0;
        int A05 = (C36351kA.A05(this.A03, C36391kE.A0A(this.A00)) + AnonymousClass000.A0J(this.A02)) * 31;
        Date date = this.A01;
        if (date != null) {
            i = date.hashCode();
        }
        return A05 + i;
    }
}
