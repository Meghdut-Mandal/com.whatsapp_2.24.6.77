package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0L3  reason: invalid class name */
public final class AnonymousClass0L3 extends C10440eF implements C16780q5 {
    public static final Parcelable.Creator CREATOR = new C08650b5();
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status BHx() {
        if (this.A00 == 0) {
            return Status.A09;
        }
        return Status.A05;
    }

    public AnonymousClass0L3(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A02);
        AnonymousClass0Z9.A08(parcel, 2, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A01, 3, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass0L3() {
        this(2, 0, (Intent) null);
    }
}
