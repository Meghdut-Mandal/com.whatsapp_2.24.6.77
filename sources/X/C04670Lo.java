package X;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.0Lo  reason: invalid class name and case insensitive filesystem */
public final class C04670Lo extends C03290Dz implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable A0W = AnonymousClass000.A0W(parcel, Bundle.CREATOR);
        AnonymousClass0YQ.A00(parcel);
        AnonymousClass0JJ.A00((Status) AnonymousClass000.A0W(parcel, Status.CREATOR), this.A00, A0W);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C04670Lo(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C04670Lo() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }
}
