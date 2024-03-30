package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pS  reason: invalid class name and case insensitive filesystem */
public class C76793pS implements C236119d {
    public C591332t A00;
    public final C19730wQ A01;
    public final C19600wD A02;
    public final AnonymousClass19A A03;
    public final C19700wN A04;
    public final AnonymousClass17Y A05;

    public void BVN(String str) {
        Log.e("DeleteBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A05.Bp3(new C81153wY((Object) this, 38));
        }
    }

    public void BWw(C203399nx r5, String str) {
        Log.e("DeleteBusinessActivityReport/onError");
        if (this.A00 != null) {
            this.A05.Bp3(new C81153wY((Object) this, 39));
        }
        C19700wN r3 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("error_code=");
        r3.A0E("DeleteBusinessActivityReport/delete business activity error", C36381kD.A10(A0u, AnonymousClass3ME.A00(r5)), true);
    }

    public void BiM(C203399nx r4, String str) {
        if (this.A00 != null) {
            this.A05.Bp3(new C81153wY((Object) this, 40));
        }
    }

    public C76793pS(C19700wN r1, AnonymousClass17Y r2, C19730wQ r3, C19600wD r4, AnonymousClass19A r5) {
        this.A05 = r2;
        this.A04 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
