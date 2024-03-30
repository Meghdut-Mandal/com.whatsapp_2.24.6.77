package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: X.4s3  reason: invalid class name and case insensitive filesystem */
public final class C98804s3 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205079r2();
    public final int A00;
    public final int A01;
    public final int A02;
    public final C170198Ci A03;

    public final void A00(C160357ks r4) {
        int i = this.A00;
        if (i == 1) {
            r4.BTK(this.A03);
        } else if (i == 2) {
            r4.BTJ(this.A03, this.A01, this.A02);
        } else if (i == 3) {
            r4.BZD(this.A03, this.A01, this.A02);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", AnonymousClass000.A0r("Unknown type: ", C90524aI.A0h(25), i));
        } else {
            r4.Bc4(this.A03, this.A01, this.A02);
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.A03);
        int i = this.A00;
        if (i == 1) {
            str = "CHANNEL_OPENED";
        } else if (i == 2) {
            str = "CHANNEL_CLOSED";
        } else if (i == 3) {
            str = "INPUT_CLOSED";
        } else if (i != 4) {
            str = Integer.toString(i);
        } else {
            str = "OUTPUT_CLOSED";
        }
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            str2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 == 2) {
            str2 = "CLOSE_REASON_REMOTE_CLOSE";
        } else if (i2 != 3) {
            str2 = Integer.toString(i2);
        } else {
            str2 = "CLOSE_REASON_LOCAL_CLOSE";
        }
        int i3 = this.A02;
        int A05 = C90474aD.A05(valueOf);
        StringBuilder A0h = C90524aI.A0h(A05 + 81 + C90474aD.A05(str) + C90474aD.A05(str2));
        A0h.append("ChannelEventParcelable[, channel=");
        A0h.append(valueOf);
        A0h.append(", type=");
        A0h.append(str);
        A0h.append(", closeReason=");
        A0h.append(str2);
        A0h.append(", appErrorCode=");
        A0h.append(i3);
        return C90474aD.A0g(A0h);
    }

    public C98804s3(C170198Ci r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A03, 2, i, false);
        AnonymousClass0Z9.A08(parcel, 3, this.A00);
        AnonymousClass0Z9.A08(parcel, 4, this.A01);
        AnonymousClass0Z9.A08(parcel, 5, this.A02);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
