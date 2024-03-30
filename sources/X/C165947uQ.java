package X;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: X.7uQ  reason: invalid class name and case insensitive filesystem */
public abstract class C165947uQ extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C165947uQ(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C06200Sr r3;
        C16800q7 r2;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C170348Db) {
            C170348Db r1 = (C170348Db) this;
            if (i != 1) {
                return false;
            }
            r1.A00.Bs2(AnonymousClass000.A0W(parcel, C170218Ck.CREATOR));
            r1.A00 = null;
            return true;
        } else if (this instanceof C170378De) {
            C170378De r12 = (C170378De) this;
            if (i != 1) {
                return false;
            }
            Location location = (Location) AnonymousClass000.A0W(parcel, Location.CREATOR);
            synchronized (r12) {
                C06200Sr r4 = r12.A00;
                r4.A00.execute(new C11560gW(new A3G(location), r4));
            }
            return true;
        } else if (this instanceof C170368Dd) {
            C170368Dd r13 = (C170368Dd) this;
            if (i == 1) {
                r3 = r13.A00;
                r2 = new C141396nB((LocationResult) AnonymousClass000.A0W(parcel, LocationResult.CREATOR));
            } else if (i != 2) {
                return false;
            } else {
                r3 = r13.A00;
                r2 = new A3F((LocationAvailability) AnonymousClass000.A0W(parcel, LocationAvailability.CREATOR));
            }
            r3.A00.execute(new C11560gW(r2, r3));
            return true;
        } else {
            C170358Dc r14 = (C170358Dc) this;
            if (i == 1) {
                r14.ByV((C170208Cj) AnonymousClass000.A0W(parcel, C170208Cj.CREATOR));
                return true;
            } else if (i != 2) {
                return false;
            } else {
                r14.zzc();
                return true;
            }
        }
    }
}
