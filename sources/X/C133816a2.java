package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.6a2  reason: invalid class name and case insensitive filesystem */
public abstract class C133816a2 implements IInterface {
    public final String A00;
    public final IBinder A01;

    public C133816a2(IBinder iBinder, String str) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public final IBinder asBinder() {
        return this.A01;
    }

    public static Parcel A00(C133816a2 r2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r2.A00);
        return obtain;
    }

    public static IObjectWrapper A01(Parcel parcel, C133816a2 r1, int i) {
        Parcel A02 = r1.A02(i, parcel);
        IObjectWrapper A012 = AnonymousClass0MR.A01(A02.readStrongBinder());
        A02.recycle();
        return A012;
    }

    public final Parcel A02(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A01, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void A03(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A01, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
