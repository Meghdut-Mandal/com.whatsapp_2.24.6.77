package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16X  reason: invalid class name */
public class AnonymousClass16X implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C36111jm(0);
    public final BigDecimal A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BigDecimal bigDecimal = this.A00;
                BigDecimal bigDecimal2 = ((AnonymousClass16X) obj).A00;
                if (bigDecimal == null) {
                    if (bigDecimal2 != null) {
                        return false;
                    }
                } else if (bigDecimal.compareTo(bigDecimal2) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass16X A00(String str, int i) {
        try {
            return new AnonymousClass16X(new BigDecimal(str), i);
        } catch (NumberFormatException e) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e);
            return null;
        }
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount", toString());
            return jSONObject;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return jSONObject;
        }
    }

    public boolean A02() {
        BigDecimal bigDecimal = this.A00;
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        BigDecimal bigDecimal = this.A00;
        if (bigDecimal == null) {
            hashCode = 0;
        } else {
            hashCode = bigDecimal.hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        return this.A00.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }

    public AnonymousClass16X(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
    }

    public AnonymousClass16X(BigDecimal bigDecimal, int i) {
        this.A00 = bigDecimal.setScale(i, 6);
    }
}
