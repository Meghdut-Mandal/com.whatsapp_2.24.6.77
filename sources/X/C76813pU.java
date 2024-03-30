package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pU  reason: invalid class name and case insensitive filesystem */
public class C76813pU implements C236119d {
    public C591132r A00;
    public final C19730wQ A01;
    public final C19600wD A02;
    public final C18820ts A03;
    public final AnonymousClass19A A04;
    public final C19700wN A05;
    public final AnonymousClass17Y A06;

    public void BVN(String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A06.Bp3(new C81153wY((Object) this, 43));
        }
    }

    public void BWw(C203399nx r6, String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/onError");
        int A002 = AnonymousClass3ME.A00(r6);
        if (this.A00 != null) {
            this.A06.Bp3(new C81293wm((Object) this, A002, 11));
        }
        this.A05.A0E("RequestBusinessActivityReportProtocolHelper/get business activity error", AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), A002), true);
    }

    public void BiM(C203399nx r6, String str) {
        AnonymousClass17Y r2;
        Runnable r1;
        C203399nx A0c = r6.A0c("p2b");
        if (A0c != null) {
            long A0V = A0c.A0V("timestamp", 0) * 1000;
            if (this.A00 != null) {
                r2 = this.A06;
                r1 = new C80303vB(this, A0V, 16);
            } else {
                return;
            }
        } else if (this.A00 != null) {
            r2 = this.A06;
            r1 = new C81153wY((Object) this, 44);
        } else {
            return;
        }
        r2.Bp3(r1);
    }

    public C76813pU(C19700wN r1, AnonymousClass17Y r2, C19730wQ r3, C19600wD r4, C18820ts r5, AnonymousClass19A r6) {
        this.A06 = r2;
        this.A05 = r1;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
    }
}
