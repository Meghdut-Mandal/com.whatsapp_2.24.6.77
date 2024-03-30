package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6b6  reason: invalid class name and case insensitive filesystem */
public class C134476b6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(13);
    public final AnonymousClass7fL A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7fL r3 = this.A00;
        int incrementAndGet = C113845gD.A02.incrementAndGet();
        synchronized (C113845gD.A01) {
            C113845gD.A00.append(incrementAndGet, r3);
        }
        parcel.writeInt(incrementAndGet);
    }

    public C134476b6(AnonymousClass7fL r1) {
        this.A00 = r1;
    }
}
