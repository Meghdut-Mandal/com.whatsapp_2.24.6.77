package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.8e3  reason: invalid class name and case insensitive filesystem */
public final class C177598e3 extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205699s4();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177598e3(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length >= 18 && length <= 32) {
            int i = 0;
            do {
                char charAt = str.charAt(i);
                if ('0' <= charAt) {
                    if (charAt >= ':') {
                        char c = 'g';
                        if ('a' > charAt) {
                            if ('A' <= charAt) {
                                c = 'G';
                            }
                        }
                        if (charAt >= c) {
                        }
                    }
                    i++;
                }
            } while (i < length);
            return;
        }
        throw new C19740wR(str);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 10;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }
}
