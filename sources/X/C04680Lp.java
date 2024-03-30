package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0Lp  reason: invalid class name and case insensitive filesystem */
public abstract class C04680Lp extends C03290Dz implements C17430rM {
    public C04680Lp() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                AnonymousClass0YQ.A00(parcel);
                throw AnonymousClass001.A0D();
            case 2:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                AnonymousClass000.A0W(parcel, C04720Lt.CREATOR);
                AnonymousClass0YQ.A00(parcel);
                throw AnonymousClass001.A0D();
            case 3:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                AnonymousClass000.A0W(parcel, C04690Lq.CREATOR);
                AnonymousClass0YQ.A00(parcel);
                throw AnonymousClass001.A0D();
            case 4:
                Byn();
                return true;
            case 5:
                AnonymousClass0YQ.A00(parcel);
                Byj((Status) AnonymousClass000.A0W(parcel, Status.CREATOR));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                AnonymousClass0YQ.A00(parcel);
                ByX(createByteArray);
                return true;
            case 7:
                AnonymousClass000.A0W(parcel, AnonymousClass0KA.CREATOR);
                AnonymousClass0YQ.A00(parcel);
                throw AnonymousClass001.A0D();
            default:
                return false;
        }
    }
}
