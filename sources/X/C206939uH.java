package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.9uH  reason: invalid class name and case insensitive filesystem */
public final class C206939uH implements Parcelable {
    public static final C205879sM CREATOR = new C205879sM();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A0B);
        String str = this.A06;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            String str2 = this.A01;
            if (str2 != null) {
                parcel.writeString(str2);
                String str3 = this.A03;
                if (str3 != null) {
                    parcel.writeString(str3);
                    String str4 = this.A0A;
                    if (str4 != null) {
                        parcel.writeString(str4);
                        parcel.writeString(this.A09);
                        String str5 = this.A05;
                        if (str5 != null) {
                            parcel.writeString(str5);
                            String str6 = this.A04;
                            if (str6 != null) {
                                parcel.writeString(str6);
                                String str7 = this.A02;
                                if (str7 != null) {
                                    parcel.writeString(str7);
                                    return;
                                }
                                throw C36331k8.A0d("crc16");
                            }
                            throw C36331k8.A0d("payeeCity");
                        }
                        throw C36331k8.A0d("payeeName");
                    }
                    throw C36331k8.A0d("txnCurrency");
                }
                throw C36331k8.A0d("payeeCategoryCode");
            }
            throw C36331k8.A0d("countryCode");
        }
        throw C36331k8.A0d("payloadFormatIndicator");
    }

    public C206939uH(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A0B = parcel.readString();
        String readString = parcel.readString();
        Objects.requireNonNull(readString, "Failed to read mandatory filed 'Payload Format Indicator' from Parcel");
        AnonymousClass00C.A0D(readString, 0);
        this.A06 = readString;
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2, "Failed to read mandatory filed 'Country Code' from Parcel");
        AnonymousClass00C.A0D(readString2, 0);
        this.A01 = readString2;
        String readString3 = parcel.readString();
        Objects.requireNonNull(readString3, "Failed to read mandatory filed 'Payee Category Code' from Parcel");
        AnonymousClass00C.A0D(readString3, 0);
        this.A03 = readString3;
        String readString4 = parcel.readString();
        Objects.requireNonNull(readString4, "Failed to read mandatory filed 'Txn Currency' from Parcel");
        AnonymousClass00C.A0D(readString4, 0);
        this.A0A = readString4;
        this.A09 = parcel.readString();
        String readString5 = parcel.readString();
        Objects.requireNonNull(readString5, "Failed to read mandatory filed 'Payee Name' from Parcel");
        AnonymousClass00C.A0D(readString5, 0);
        this.A05 = readString5;
        String readString6 = parcel.readString();
        Objects.requireNonNull(readString6, "Failed to read mandatory filed 'Payee City' from Parcel");
        AnonymousClass00C.A0D(readString6, 0);
        this.A04 = readString6;
        String readString7 = parcel.readString();
        Objects.requireNonNull(readString7, "Failed to read mandatory filed 'CRC 16' from Parcel");
        AnonymousClass00C.A0D(readString7, 0);
        this.A02 = readString7;
    }

    public C206939uH() {
    }
}
