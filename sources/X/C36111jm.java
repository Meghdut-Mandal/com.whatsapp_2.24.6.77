package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1jm  reason: invalid class name and case insensitive filesystem */
public class C36111jm implements Parcelable.Creator {
    public final int A00;

    public C36111jm(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass16X(parcel);
            case 1:
                return new AnonymousClass16W(parcel);
            default:
                return AnonymousClass6Y1.A01((AnonymousClass11F) null, parcel.readInt(), parcel.readInt());
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass16X[i];
            case 1:
                return new AnonymousClass16W[i];
            default:
                return new C25471Gl[i];
        }
    }
}
