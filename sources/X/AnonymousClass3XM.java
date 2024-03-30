package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XM  reason: invalid class name */
public final class AnonymousClass3XM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66553Wk();
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3XM) {
                AnonymousClass3XM r5 = (AnonymousClass3XM) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return (((C36341k9.A09(this.A02) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36421kH.A05(this.A01);
    }

    public AnonymousClass3XM(Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A00 = bool;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FunStickerData(displayName=");
        A0u.append(this.A02);
        A0u.append(", isGroup=");
        A0u.append(this.A00);
        A0u.append(", chatJid=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
