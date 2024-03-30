package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8e4  reason: invalid class name and case insensitive filesystem */
public final class C177608e4 extends C177508du implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C205719s6();
    public final int A00;
    public final C223313w A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177608e4(C223313w r3, int i) {
        super(r3, i);
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = i;
        if (i != 99) {
            throw new C19740wR("device_id should be 99 for hosted device");
        }
    }

    public String getServer() {
        return "hosted.lid";
    }

    public int getType() {
        return 25;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public int getDevice() {
        return this.A00;
    }

    public String getRawString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.user);
        A0u.append(':');
        A0u.append(this.A00);
        A0u.append('@');
        return AnonymousClass000.A0q("hosted.lid", A0u);
    }
}
