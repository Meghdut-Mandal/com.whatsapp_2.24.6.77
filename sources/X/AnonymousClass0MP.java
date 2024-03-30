package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.IGmsCallbacks;

/* renamed from: X.0MP  reason: invalid class name */
public final class AnonymousClass0MP extends AnonymousClass0E1 implements IGmsCallbacks {
    public C07560Yg A00;
    public final int A01;

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0KC r2;
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            C07380Xk.A00(parcel);
            AnonymousClass006.A02(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            this.A00.A0B((Bundle) AnonymousClass000.A0W(parcel, Bundle.CREATOR), readStrongBinder, readInt, this.A01);
        } else if (i == 2) {
            parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            C07380Xk.A00(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            parcel2.writeNoException();
            return true;
        } else if (i != 3) {
            return false;
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C04510Kx r7 = (C04510Kx) AnonymousClass000.A0W(parcel, C04510Kx.CREATOR);
            C07380Xk.A00(parcel);
            C07560Yg r1 = this.A00;
            AnonymousClass006.A02(r1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AnonymousClass006.A01(r7);
            r1.A0Q = r7;
            if (r1.A0D()) {
                AnonymousClass0KD r0 = r7.A02;
                AnonymousClass0Xx A002 = AnonymousClass0Xx.A00();
                if (r0 == null) {
                    r2 = null;
                } else {
                    r2 = r0.A01;
                }
                synchronized (A002) {
                    if (r2 == null) {
                        r2 = AnonymousClass0Xx.A02;
                    } else {
                        AnonymousClass0KC r02 = A002.A00;
                        if (r02 != null) {
                            if (r02.A00 < r2.A00) {
                            }
                        }
                    }
                    A002.A00 = r2;
                }
            }
            Bundle bundle = r7.A01;
            AnonymousClass006.A02(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
            this.A00.A0B(bundle, readStrongBinder2, readInt2, this.A01);
        }
        this.A00 = null;
        parcel2.writeNoException();
        return true;
    }

    public AnonymousClass0MP(C07560Yg r1, int i) {
        this();
        this.A00 = r1;
        this.A01 = i;
    }

    public AnonymousClass0MP() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
