package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CC  reason: invalid class name */
public final class AnonymousClass8CC extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204569qD();
    public final int A00;
    public final PendingIntent A01;
    public final B53 A02;
    public final AnonymousClass8CL A03;
    public final C23096B4l A04;
    public final C23097B4m A05;

    public AnonymousClass8CC(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, AnonymousClass8CL r8, int i) {
        C23097B4m r1;
        C23096B4l r12;
        this.A00 = i;
        this.A03 = r8;
        B53 b53 = null;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof C23097B4m) {
                r1 = (C23097B4m) queryLocalInterface;
            } else {
                r1 = new AnonymousClass8DX(iBinder);
            }
        }
        this.A05 = r1;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            r12 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof C23096B4l) {
                r12 = (C23096B4l) queryLocalInterface2;
            } else {
                r12 = new AnonymousClass8DW(iBinder2);
            }
        }
        this.A04 = r12;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof B53) {
                b53 = (B53) queryLocalInterface3;
            } else {
                b53 = new AnonymousClass8DU(iBinder3);
            }
        }
        this.A02 = b53;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A00);
        AnonymousClass0Z9.A0B(parcel, this.A03, 2, i, false);
        C23097B4m b4m = this.A05;
        IBinder iBinder = null;
        if (b4m == null) {
            asBinder = null;
        } else {
            asBinder = b4m.asBinder();
        }
        AnonymousClass0Z9.A04(asBinder, parcel, 3);
        AnonymousClass0Z9.A0B(parcel, this.A01, 4, i, false);
        C23096B4l b4l = this.A04;
        if (b4l == null) {
            asBinder2 = null;
        } else {
            asBinder2 = b4l.asBinder();
        }
        AnonymousClass0Z9.A04(asBinder2, parcel, 5);
        B53 b53 = this.A02;
        if (b53 != null) {
            iBinder = b53.asBinder();
        }
        AnonymousClass0Z9.A04(iBinder, parcel, 6);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
