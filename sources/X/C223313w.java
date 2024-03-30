package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.13w  reason: invalid class name and case insensitive filesystem */
public final class C223313w extends C223213v implements Parcelable {
    public static final C130946Nb A01 = new C130946Nb();
    public static final Parcelable.Creator CREATOR = new C134226ah();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C223313w(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length < 1 || length > 15) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid LID: ");
            sb.append(str);
            sb.append(" - length must be between 1 and 15");
            throw new C19740wR(sb.toString());
        }
        AnonymousClass00C.A0D("0", 1);
        if (!str.startsWith("0")) {
            char[] charArray = str.toCharArray();
            AnonymousClass00C.A08(charArray);
            for (char c : charArray) {
                if (AnonymousClass00C.A00(c, 48) < 0 || AnonymousClass00C.A00(c, 57) > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid LID: ");
                    sb2.append(str);
                    sb2.append(" - must be numeric only");
                    throw new C19740wR(sb2.toString());
                }
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid LID: ");
        sb3.append(str);
        sb3.append(" - cannot start with 0");
        throw new C19740wR(sb3.toString());
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 18;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A00);
    }
}
