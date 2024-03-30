package X;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.0Jf  reason: invalid class name and case insensitive filesystem */
public final class C04090Jf extends C06380Tj {
    public final /* synthetic */ C10300e1 A00;
    public final /* synthetic */ AnonymousClass0K9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04090Jf(C10300e1 r1, C17340r8 r2, AnonymousClass0K9 r3) {
        super(r2);
        this.A00 = r1;
        this.A01 = r3;
    }

    public final void A00() {
        C10300e1 r3 = this.A00;
        AnonymousClass0K9 r1 = this.A01;
        if (C10300e1.A07(r3, 0)) {
            AnonymousClass0L0 r4 = r1.A01;
            if (r4.A01 == 0) {
                C04370Kj r12 = r1.A02;
                AnonymousClass006.A01(r12);
                r4 = r12.A02;
                if (r4.A01 == 0) {
                    r3.A04 = true;
                    IAccountAccessor A002 = r12.A00();
                    AnonymousClass006.A01(A002);
                    r3.A00 = A002;
                    r3.A05 = r12.A03;
                    r3.A06 = r12.A04;
                } else {
                    String valueOf = String.valueOf(r4);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                    C10300e1.A02(r4, r3);
                    return;
                }
            } else {
                if (r3.A02 && !r4.A00()) {
                    C10300e1.A03(r3);
                }
                C10300e1.A02(r4, r3);
                return;
            }
            C10300e1.A04(r3);
        }
    }
}
