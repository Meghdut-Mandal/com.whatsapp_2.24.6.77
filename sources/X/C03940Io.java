package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.0Io  reason: invalid class name and case insensitive filesystem */
public final class C03940Io extends C03950Ip {
    public final /* synthetic */ AnonymousClass0K6 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03940Io(AnonymousClass0K6 r2) {
        super(1606);
        this.A00 = r2;
    }

    public final void A01(C04600Lh r5) {
        IBinder asBinder;
        C04680Lp r3 = this.A00;
        AnonymousClass0K6 r2 = this.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r5.A00);
        if (r3 == null) {
            asBinder = null;
        } else {
            asBinder = r3.asBinder();
        }
        r2.writeToParcel(obtain, AnonymousClass000.A1U(asBinder, obtain) ? 1 : 0);
        r5.A01(5, obtain);
    }
}
