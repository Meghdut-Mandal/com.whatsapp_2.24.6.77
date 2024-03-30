package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0Lg  reason: invalid class name and case insensitive filesystem */
public abstract class C04590Lg extends C03280Dy implements C17420rL {
    public C04590Lg() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                AnonymousClass000.A0W(parcel, GoogleSignInAccount.CREATOR);
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                C07580Yk.A00(parcel);
                throw AnonymousClass001.A0D();
            case 102:
                C07580Yk.A00(parcel);
                By9((Status) AnonymousClass000.A0W(parcel, Status.CREATOR));
                break;
            case 103:
                C07580Yk.A00(parcel);
                By8((Status) AnonymousClass000.A0W(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
