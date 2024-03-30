package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uS  reason: invalid class name and case insensitive filesystem */
public class C207039uS implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(38);
    public final float A00;
    public final C187738yS A01;
    public final C187738yS A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207039uS)) {
            return false;
        }
        C207039uS r4 = (C207039uS) obj;
        return Float.compare(r4.A00, this.A00) == 0 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C36391kE.A1E(parcel, this.A01);
        C36391kE.A1E(parcel, this.A02);
        parcel.writeFloat(this.A00);
    }

    public C207039uS(Parcel parcel) {
        C187738yS valueOf;
        C187738yS valueOf2;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = C187738yS.NONE;
        } else {
            valueOf = C187738yS.valueOf(readString);
        }
        this.A01 = valueOf;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = C187738yS.NONE;
        } else {
            valueOf2 = C187738yS.valueOf(readString2);
        }
        this.A02 = valueOf2;
        this.A00 = parcel.readFloat();
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A01;
        A1Q[1] = this.A02;
        return C90484aE.A0D(Float.valueOf(this.A00), A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        A0u.append(this.A01);
        A0u.append(", mAudioFocusTransientLossBehavior=");
        A0u.append(this.A02);
        A0u.append(", mAudioFocusTransientLossDuckVolume=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }

    public C207039uS() {
        this.A01 = C187738yS.PAUSE;
        this.A02 = C187738yS.NONE;
        this.A00 = 0.0f;
    }
}
