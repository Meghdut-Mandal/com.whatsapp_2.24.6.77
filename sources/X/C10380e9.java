package X;

import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.0e9  reason: invalid class name and case insensitive filesystem */
public class C10380e9 implements C16840qB {
    public final /* synthetic */ C07560Yg A00;

    public C10380e9(C07560Yg r1) {
        this.A00 = r1;
    }

    public final void Bep(AnonymousClass0L0 r4) {
        if (r4.A01 == 0) {
            C07560Yg r2 = this.A00;
            r2.BGd((IAccountAccessor) null, ((C04270Jz) r2).A01);
            return;
        }
        AnonymousClass0oG r0 = this.A00.A0I;
        if (r0 != null) {
            ((C10370e8) r0).A00.onConnectionFailed(r4);
        }
    }
}
