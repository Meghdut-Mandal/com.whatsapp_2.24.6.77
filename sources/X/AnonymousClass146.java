package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.146  reason: invalid class name */
public final class AnonymousClass146 extends GroupJid implements Parcelable {
    public static final AnonymousClass3BZ A01 = new AnonymousClass3BZ();
    public static final Parcelable.Creator CREATOR = new C66623Wr();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass146(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        if (!AnonymousClass099.A0O(str, "-", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid group id: ");
            sb.append(str);
            throw new C19740wR(sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "temp";
    }

    public int getType() {
        return 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        String substring = getRawString().substring(AnonymousClass099.A0C(getRawString(), "-", 0, false) + 1);
        AnonymousClass00C.A08(substring);
        return substring;
    }
}
