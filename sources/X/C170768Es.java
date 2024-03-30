package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.8Es  reason: invalid class name and case insensitive filesystem */
public final class C170768Es extends AnonymousClass8BQ {
    public final /* bridge */ /* synthetic */ void A0A(C15900oC r5) {
        C133806a1 r3 = (C133806a1) ((C07560Yg) r5).A04();
        C170718En r2 = new C170718En(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r2);
        r3.A00(15, obtain);
    }

    public final /* bridge */ /* synthetic */ C16780q5 A03(Status status) {
        return new C68353bl(status, AnonymousClass001.A0I());
    }

    public C170768Es(AnonymousClass0XK r1) {
        super(r1);
    }
}
