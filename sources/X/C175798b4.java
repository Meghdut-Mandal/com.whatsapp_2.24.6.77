package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8b4  reason: invalid class name and case insensitive filesystem */
public final class C175798b4 extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(26);
    public int A00;
    public int A01;

    public static String A02(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "elo" : "discover" : "amex" : "mastercard" : "visa";
    }

    public static String A03(int i) {
        if (i == 1) {
            return "Visa";
        }
        if (i == 2) {
            return "MasterCard";
        }
        if (i == 3) {
            return "American Express";
        }
        if (i == 4) {
            return "Discover";
        }
        if (i != 5) {
            return null;
        }
        return "Elo";
    }

    public int describeContents() {
        return 0;
    }

    public static int A00(String str) {
        if ("debit".equals(str)) {
            return 1;
        }
        if ("credit".equals(str)) {
            return 4;
        }
        if ("combo".equals(str)) {
            return 6;
        }
        if ("prepaid".equals(str)) {
            return 8;
        }
        if ("UNKNOWN".equals(str)) {
            return 7;
        }
        return 0;
    }

    public static int A01(String str) {
        if ("visa".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("mastercard".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("amex".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("discover".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("elo".equalsIgnoreCase(str)) {
            return 5;
        }
        return 0;
    }

    public C175798b4(Parcel parcel) {
        A0D(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ CARD: ");
        A0u.append(super.toString());
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C175798b4(C202159l8 r4, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        this.A00 = i;
        this.A01 = i6;
        this.A0B = str2;
        C18740tg.A06(r4);
        this.A07 = r4;
        A0C(i2);
        A0B(i3);
        if (i4 != 1 || this.A07.A00 == (i8 = this.A00)) {
            this.A03 = i4;
            if (i5 != 1 || this.A07.A01 == (i7 = this.A00)) {
                this.A02 = i5;
                this.A0A = str;
                if (str3 != null) {
                    A0E(str3);
                    return;
                }
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: ");
            A0u.append(i7);
            throw AnonymousClass000.A0c(" in country cannot be primary account type", A0u);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("PAY: ");
        A0u2.append(i8);
        throw AnonymousClass000.A0c(" in country cannot be primary account type", A0u2);
    }
}
