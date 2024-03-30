package X;

import com.whatsapp.util.Log;

/* renamed from: X.AAx  reason: case insensitive filesystem */
public class C21163AAx implements C160057kO {
    public final B2S A00;
    public final AnonymousClass6P0 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public final void BVK() {
        Log.e("FBUserEntityManagement : Network failed while sending the payload");
        this.A00.BVK();
    }

    public final void BWk(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload", exc);
        this.A00.BWk(exc);
    }

    public final void Bi5(AnonymousClass6OQ r3) {
        boolean z;
        AnonymousClass1UU r1 = (AnonymousClass1UU) this.A02.get();
        if (r3 != null) {
            z = r1.A07(r3);
        } else {
            r1.A06(this.A01);
            z = true;
        }
        B2S b2s = this.A00;
        if (z) {
            b2s.Bi5(r3);
        } else {
            b2s.BWk(AnonymousClass001.A09("Unable to perform operation."));
        }
    }

    public C21163AAx(B2S b2s, AnonymousClass6P0 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = b2s;
    }
}
