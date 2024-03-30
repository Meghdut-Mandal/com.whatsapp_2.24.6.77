package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.147  reason: invalid class name */
public final class AnonymousClass147 extends GroupJid implements Parcelable {
    public static final C65533Sl A01 = new C65533Sl();
    public static final Parcelable.Creator CREATOR = new C66633Ws();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass147(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        if (!C65533Sl.A05(str)) {
            int A09 = AnonymousClass099.A09(str, '-', 0, false);
            if (A09 > 0 && A09 != str.length()) {
                String substring = str.substring(0, A09);
                AnonymousClass00C.A08(substring);
                Parcelable.Creator creator = PhoneUserJid.CREATOR;
                if (C222913s.A01(substring)) {
                    String substring2 = str.substring(A09 + 1);
                    AnonymousClass00C.A08(substring2);
                    int length = substring2.length();
                    if (length == 10) {
                        char charAt = substring2.charAt(0);
                        if (AnonymousClass00C.A00(charAt, 49) >= 0 && AnonymousClass00C.A00(charAt, 57) <= 0) {
                            int i = 1;
                            do {
                                char charAt2 = substring2.charAt(i);
                                if (AnonymousClass00C.A00(charAt2, 48) >= 0 && AnonymousClass00C.A00(charAt2, 57) <= 0) {
                                    i++;
                                }
                            } while (i < length);
                            return;
                        }
                    }
                }
            }
            throw new C19740wR(str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String getObfuscatedString() {
        String str = this.user;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        if (C65533Sl.A05(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AnonymousClass14B.A0B(this.user, 15));
            sb2.append(obj);
            return sb2.toString();
        }
        int A09 = AnonymousClass099.A09(str, '-', 0, false);
        if (A09 == -1) {
            return obj;
        }
        int max = Math.max(0, A09 - 4);
        StringBuilder sb3 = new StringBuilder();
        String substring = str.substring(max);
        AnonymousClass00C.A08(substring);
        sb3.append(substring);
        sb3.append(obj);
        return sb3.toString();
    }
}
