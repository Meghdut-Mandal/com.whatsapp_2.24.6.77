package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.9t8  reason: invalid class name and case insensitive filesystem */
public class C206329t8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(38);
    public final AnonymousClass9K8 A00;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        JSONObject A05 = C203419nz.A05(this.A00, true);
        if (A05 != null) {
            return A05.toString();
        }
        return "<json serialization failed>";
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass9K8 r2 = this.A00;
        C207249un r1 = r2.A01;
        parcel.writeInt(r1.A09());
        parcel.writeString((String) null);
        parcel.writeString(r1.A07.A03);
        parcel.writeString(r1.A0A);
        parcel.writeString((String) C207249un.A06(r1));
        if (r1 instanceof C175798b4) {
            parcel.writeInt(((C175798b4) r1).A01);
        }
        BigDecimal bigDecimal = r2.A02.A00;
        parcel.writeInt(bigDecimal.scale());
        parcel.writeString(bigDecimal.toString());
        parcel.writeInt(r2.A00);
    }

    public C206329t8(AnonymousClass9K8 r1) {
        this.A00 = r1;
    }
}
