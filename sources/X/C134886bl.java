package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.6bl  reason: invalid class name and case insensitive filesystem */
public final class C134886bl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134156aa();
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134886bl) {
                C134886bl r8 = (C134886bl) obj;
                if (this.A06 != r8.A06 || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A04, C36381kD.A08(this.A05, C36381kD.A08(this.A03, C36381kD.A08(this.A02, C36381kD.A08(this.A01, C36321k7.A00(this.A00, C36341k9.A01(this.A06 ? 1 : 0) * 31))))));
    }

    public C134886bl(String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        this.A06 = z;
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    public final JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("secure", this.A06);
        A1B.put("expiry", this.A00);
        A1B.put("domain", this.A01);
        A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
        A1B.put("path", this.A03);
        A1B.put("value", this.A05);
        return A1B;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FBAccountCookie(secure=");
        A0u.append(this.A06);
        A0u.append(", expiry=");
        A0u.append(this.A00);
        A0u.append(", domain=");
        C90494aF.A1N(A0u, this.A01);
        A0u.append(this.A02);
        A0u.append(", path=");
        A0u.append(this.A03);
        A0u.append(", value=");
        A0u.append(this.A05);
        A0u.append(", url=");
        return C36321k7.A0E(this.A04, A0u);
    }
}
