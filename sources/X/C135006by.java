package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6by  reason: invalid class name and case insensitive filesystem */
public class C135006by implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(28);
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C135006by r5 = (C135006by) obj;
            if (!this.A01.equals(r5.A01) || this.A03 != r5.A03 || !TextUtils.equals(this.A02, r5.A02) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A02, (((this.A01.hashCode() + 31) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public C135006by(Parcel parcel) {
        this.A01 = (UserJid) C36411kG.A0H(parcel, UserJid.class);
        this.A03 = AnonymousClass000.A1R(parcel.readInt());
        this.A02 = C90514aH.A0u(parcel);
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLog.Key[jid=");
        A0u.append(this.A01);
        A0u.append("; fromMe=");
        A0u.append(this.A03);
        A0u.append("; callId=");
        A0u.append(this.A02);
        A0u.append("; transactionId=");
        A0u.append(this.A00);
        return C90474aD.A0g(A0u);
    }

    public C135006by(int i, UserJid userJid, String str, boolean z) {
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }
}
