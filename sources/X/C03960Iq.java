package X;

import android.os.Parcel;

/* renamed from: X.0Iq  reason: invalid class name and case insensitive filesystem */
public final class C03960Iq extends AnonymousClass0JZ {
    public final /* synthetic */ AnonymousClass0K3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03960Iq(AnonymousClass0K3 r2) {
        super(1607);
        this.A00 = r2;
    }

    public final void A01(C04600Lh r5) {
        C04650Lm r3 = new C04650Lm(this, this);
        AnonymousClass0K3 r2 = this.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r5.A00);
        r2.writeToParcel(obtain, AnonymousClass000.A1U(r3.asBinder(), obtain) ? 1 : 0);
        r5.A01(6, obtain);
    }
}
