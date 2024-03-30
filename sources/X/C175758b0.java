package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;

/* renamed from: X.8b0  reason: invalid class name and case insensitive filesystem */
public final class C175758b0 extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(23);
    public final C135086c7 A00;

    public C175758b0(Bitmap bitmap, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = C165617ti.A0P(C146356vT.A00(), String.class, str, "upiAppPackageName");
        if (bitmap != null) {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, A0Q);
            this.A0D = A0Q.toByteArray();
            A0Q.close();
        }
        A0E(str2);
        this.A0A = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        super.writeToParcel(parcel, i);
    }

    public C175758b0(Parcel parcel) {
        Parcelable A0H = C36411kG.A0H(parcel, C135086c7.class);
        if (A0H != null) {
            this.A00 = (C135086c7) A0H;
            A0D(parcel);
            return;
        }
        throw C36381kD.A0l();
    }
}
