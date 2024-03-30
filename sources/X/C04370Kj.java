package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.0Kj  reason: invalid class name and case insensitive filesystem */
public final class C04370Kj extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08090aB();
    public final int A00;
    public final IBinder A01;
    public final AnonymousClass0L0 A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof C04370Kj) {
                    C04370Kj r5 = (C04370Kj) obj;
                    if (!this.A02.equals(r5.A02) || !AnonymousClass0QM.A00(A00(), r5.A00())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final IAccountAccessor A00() {
        IBinder iBinder = this.A01;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new AnonymousClass0MN(iBinder);
    }

    public C04370Kj(IBinder iBinder, AnonymousClass0L0 r2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = r2;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A04(this.A01, parcel, 2);
        AnonymousClass0Z9.A0B(parcel, this.A02, 3, i, false);
        AnonymousClass0Z9.A0A(parcel, 4, this.A03);
        AnonymousClass0Z9.A0A(parcel, 5, this.A04);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
