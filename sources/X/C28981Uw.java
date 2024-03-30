package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Uw  reason: invalid class name and case insensitive filesystem */
public final class C28981Uw extends AnonymousClass11F implements Parcelable {
    public static final C222613p A02 = C222613p.A01();
    public static final C65313Ro A03 = new C65313Ro();
    public static final Parcelable.Creator CREATOR = new C66613Wq();
    public boolean A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28981Uw(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "newsletter";
    }

    public int getType() {
        return 21;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A01);
    }

    public static final boolean A00(AnonymousClass11F r2) {
        C28981Uw r22;
        if (!(r2 instanceof C28981Uw) || (r22 = (C28981Uw) r2) == null || !r22.A00) {
            return false;
        }
        return true;
    }
}
