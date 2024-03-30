package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0MG  reason: invalid class name */
public abstract class AnonymousClass0MG extends AnonymousClass0E0 implements C17410rK {
    public AnonymousClass0MG() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable.Creator creator;
        switch (i) {
            case 3:
                Parcelable.Creator creator2 = AnonymousClass0L0.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                creator = AnonymousClass0L3.CREATOR;
                break;
            case 4:
            case 6:
                creator = Status.CREATOR;
                break;
            case 7:
                Parcelable.Creator creator3 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    creator3.createFromParcel(parcel);
                }
                creator = GoogleSignInAccount.CREATOR;
                break;
            case 8:
                C07370Xj.A00(parcel);
                Bxq((AnonymousClass0K9) AnonymousClass000.A0W(parcel, AnonymousClass0K9.CREATOR));
                break;
            case 9:
                creator = AnonymousClass0L2.CREATOR;
                break;
            default:
                return false;
        }
        if (parcel.readInt() != 0) {
            creator.createFromParcel(parcel);
        }
        C07370Xj.A00(parcel);
        parcel2.writeNoException();
        return true;
    }
}
