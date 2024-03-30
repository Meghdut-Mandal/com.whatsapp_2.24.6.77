package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ua  reason: invalid class name and case insensitive filesystem */
public class C207119ua implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(35);
    public final int A00;
    public final AnonymousClass16U A01;
    public final AnonymousClass16X A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C207119ua r5 = (C207119ua) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int A01() {
        return (int) (this.A02.A00.doubleValue() * ((double) this.A00));
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, (31 * this.A02.hashCode()) + this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, 1);
        parcel.writeInt(this.A00);
        AnonymousClass16U r1 = this.A01;
        AnonymousClass16U[] r0 = AnonymousClass16T.A01;
        r1.writeToParcel(parcel, i);
    }

    public C207119ua(AnonymousClass16U r6, int i, long j) {
        C18740tg.A0E(C36401kF.A1U(i), "offset must be a number greater or equal to zero");
        this.A00 = i;
        this.A01 = r6;
        this.A02 = new AnonymousClass16X(new BigDecimal(((double) j) / ((double) i)), ((AnonymousClass16V) r6).A01);
    }

    public static String A00(C207119ua r3, Object[] objArr) {
        objArr[0] = new AnonymousClass1AL("value", r3.A01());
        objArr[1] = new AnonymousClass1AL("offset", r3.A00);
        return ((AnonymousClass16V) r3.A01).A02;
    }

    public JSONObject A02() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            double doubleValue = this.A02.A00.doubleValue();
            int i = this.A00;
            A1B.put("value", (int) (doubleValue * ((double) i)));
            A1B.put("offset", i);
            AnonymousClass16U r2 = this.A01;
            A1B.put("currencyType", ((AnonymousClass16V) r2).A00);
            AnonymousClass16U[] r0 = AnonymousClass16T.A01;
            A1B.put("currency", r2.Bvn());
            return A1B;
        } catch (JSONException e) {
            Log.w("PAY: PaymentMoney toJson threw: ", e);
            return A1B;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PaymentMoney{amount=");
        A0u.append(this.A02);
        A0u.append(", offset=");
        A0u.append(this.A00);
        A0u.append(", currency=");
        A0u.append(((AnonymousClass16V) this.A01).A02);
        return AnonymousClass000.A0s(A0u);
    }

    public C207119ua(Parcel parcel) {
        this.A02 = (AnonymousClass16X) C36411kG.A0H(parcel, AnonymousClass16X.class);
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass16T.A00(parcel);
    }
}
