package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.AXg  reason: case insensitive filesystem */
public final class C21709AXg implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(19);
    public int A00;
    public final int A01;
    public final String A02;
    public final C207069uV[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21709AXg aXg = (C21709AXg) obj;
            if (!Util.A0E(this.A02, aXg.A02) || !Arrays.equals(this.A03, aXg.A03)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = AnonymousClass9B7.A03;
        UUID uuid2 = ((C207069uV) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C207069uV) obj2).A03;
        if (equals) {
            return C36431kI.A1Q(uuid.equals(uuid3) ? 1 : 0) ? 1 : 0;
        }
        return uuid2.compareTo(uuid3);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A09 = (C36341k9.A09(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = A09;
        return A09;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public C21709AXg(String str, C207069uV... r3) {
        this.A02 = str;
        this.A03 = r3;
        this.A01 = r3.length;
        Arrays.sort(r3, this);
    }

    public C21709AXg(Parcel parcel) {
        this.A02 = parcel.readString();
        C207069uV[] r0 = (C207069uV[]) parcel.createTypedArray(C207069uV.CREATOR);
        this.A03 = r0;
        this.A01 = r0.length;
    }
}
