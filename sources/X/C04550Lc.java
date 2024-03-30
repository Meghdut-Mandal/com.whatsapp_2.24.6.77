package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Lc  reason: invalid class name and case insensitive filesystem */
public final class C04550Lc extends C03280Dy implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Parcelable A0W = AnonymousClass000.A0W(parcel, AnonymousClass0KI.CREATOR);
        C07580Yk.A00(parcel);
        AnonymousClass0QK.A00((Status) AnonymousClass000.A0W(parcel, Status.CREATOR), this.A00, A0W);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C04550Lc(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C04550Lc() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }
}
