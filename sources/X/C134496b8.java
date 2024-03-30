package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.6b8  reason: invalid class name and case insensitive filesystem */
public final class C134496b8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134186ad();
    public final int A00;
    public final int A01;
    public final File A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02.getAbsolutePath());
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
    }

    public C134496b8(File file, int i, int i2, boolean z) {
        this.A00 = i;
        this.A02 = file;
        this.A03 = z;
        this.A01 = i2;
    }
}
