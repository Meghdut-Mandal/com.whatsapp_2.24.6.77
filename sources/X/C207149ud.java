package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;

/* renamed from: X.9ud  reason: invalid class name and case insensitive filesystem */
public class C207149ud implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23181B8p(18);
    public AnonymousClass90O A00;
    public C206919uD A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        AnonymousClass90O r0 = this.A00;
        if (r0 != null) {
            i2 = r0.value;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public C207149ud(AnonymousClass90O r3, C206919uD r4, String str) {
        String str2;
        String str3;
        this.A04 = str;
        this.A01 = r4;
        this.A05 = 2;
        this.A00 = r3;
        if (r4 != null && (str2 = r4.A01) != null) {
            try {
                str3 = C36441kJ.A1C(str2).optString("description");
            } catch (JSONException unused) {
                str3 = null;
            }
            this.A02 = str3;
        }
    }

    public C207149ud(String str, String str2, String str3, int i) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = i;
    }

    public C207149ud(Parcel parcel) {
        AnonymousClass90O r0;
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A01 = (C206919uD) C36411kG.A0H(parcel, C206919uD.class);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r0 = AnonymousClass90O.DEFAULT;
        } else if (readInt != 1) {
            r0 = null;
        } else {
            r0 = AnonymousClass90O.EXTENSIONS_1;
        }
        this.A00 = r0;
    }
}
