package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9uh  reason: invalid class name and case insensitive filesystem */
public class C207189uh implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(44);
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
    }

    public C207189uh(C203399nx r9, String str) {
        if (str != null) {
            this.A03 = AnonymousClass6R8.A00(str, 0) == 1;
        }
        if (r9 != null) {
            String A0i = r9.A0i("created-ts", (String) null);
            if (A0i != null) {
                this.A00 = AnonymousClass6R8.A01(A0i, 0) * 1000;
            }
            String A0i2 = r9.A0i("updated-ts", (String) null);
            if (A0i2 != null) {
                this.A01 = AnonymousClass6R8.A01(A0i2, 0) * 1000;
            }
            String A0i3 = r9.A0i("complaint-status", (String) null);
            if (!TextUtils.isEmpty(A0i3)) {
                this.A02 = A0i3;
            }
        }
    }

    public String A00() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("is-complaint-eligible", this.A03);
            long j = this.A00;
            if (j > 0) {
                A1B.put("created-ts", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A1B.put("updated-ts", j2);
            }
            String str = this.A02;
            if (str != null) {
                A1B.put("complaint-status", str);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionComplaintData toJson threw: ", e);
        }
        return A1B.toString();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiTransactionComplaintData{isComplaintEligible='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", createdTs='");
        A0u.append(this.A00);
        A0u.append('\'');
        A0u.append(", updatedTs='");
        A0u.append(this.A01);
        A0u.append('\'');
        A0u.append(", complaintStatus='");
        A0u.append(this.A02);
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }

    public C207189uh(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A03 = A1C.optBoolean("is-complaint-eligible", false);
                this.A00 = A1C.optLong("created-ts");
                this.A01 = A1C.optLong("updated-ts");
                this.A02 = A1C.optString("complaint-status");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e);
            }
        }
    }

    public C207189uh(Parcel parcel) {
        this.A03 = C165567td.A1Y(parcel);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
    }
}
