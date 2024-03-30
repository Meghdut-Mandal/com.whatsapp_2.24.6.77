package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8au  reason: invalid class name and case insensitive filesystem */
public final class C175698au extends C175728ax {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(42);
    public C135086c7 A00;
    public C135086c7 A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06 = 1;

    public C175698au(Parcel parcel) {
        super(parcel);
        this.A01 = (C135086c7) C36411kG.A0H(parcel, C135086c7.class);
        this.A02 = parcel.readString();
    }

    public String A05() {
        JSONObject A1B;
        try {
            String A052 = super.A05();
            if (A052 != null) {
                A1B = C36441kJ.A1C(A052);
            } else {
                A1B = C36441kJ.A1B();
            }
            A1B.put("v", this.A06);
            if (!C202349ld.A02(this.A01)) {
                C165607th.A1D(this.A01, "vpaHandle", A1B);
            }
            String str = this.A02;
            if (str != null) {
                A1B.put("vpaId", str);
            }
            if (!C202349ld.A02(this.A00)) {
                C165607th.A1D(this.A00, "legalName", A1B);
            }
            return A1B.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A06(String str) {
        super.A06(str);
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                int optInt = A1C.optInt("v", 1);
                this.A06 = optInt;
                if (optInt == 1) {
                    Class<String> cls = String.class;
                    this.A01 = C165617ti.A0P(C146356vT.A00(), cls, A1C.optString("vpaHandle", (String) null), "upiHandle");
                    this.A02 = A1C.optString("vpaId", (String) null);
                    this.A00 = C165617ti.A0P(C146356vT.A00(), cls, A1C.optString("legalName", (String) null), "accountHolderName");
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ ver: ");
        A0u.append(this.A06);
        A0u.append(" jid: ");
        A0u.append(this.A04);
        A0u.append(" vpaHandle: ");
        A0u.append(this.A01);
        A0u.append(" nodal: ");
        A0u.append(this.A03);
        A0u.append(" nodalAllowed: ");
        A0u.append(this.A04);
        A0u.append(" notifAllowed: ");
        A0u.append(this.A05);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }

    public C175698au() {
    }
}
