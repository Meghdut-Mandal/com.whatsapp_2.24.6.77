package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.8Et  reason: invalid class name and case insensitive filesystem */
public final class C170778Et extends AnonymousClass8BQ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ byte[] A01;

    public final /* bridge */ /* synthetic */ C16780q5 A03(Status status) {
        return new C141636nZ(status, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170778Et(AnonymousClass0XK r1, String str, byte[] bArr) {
        super(r1);
        this.A00 = str;
        this.A01 = bArr;
    }

    public final /* bridge */ /* synthetic */ void A0A(C15900oC r8) {
        String str = this.A00;
        byte[] bArr = this.A01;
        C133806a1 r3 = (C133806a1) ((C07560Yg) r8).A04();
        C170728Eo r2 = new C170728Eo(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r2);
        obtain.writeString(str);
        obtain.writeString("/altLinkingPrefillResponse");
        obtain.writeByteArray(bArr);
        r3.A00(12, obtain);
    }
}
