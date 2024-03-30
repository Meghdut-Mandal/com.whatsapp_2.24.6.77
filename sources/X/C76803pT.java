package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pT  reason: invalid class name and case insensitive filesystem */
public class C76803pT implements C236119d {
    public C591232s A00;
    public final C19730wQ A01;
    public final C19600wD A02;
    public final C19970wo A03;
    public final AnonymousClass19A A04;
    public final C19700wN A05;
    public final AnonymousClass17Y A06;

    public void BVN(String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/delivery-error");
    }

    public void BWw(C203399nx r6, String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/onError");
        int A002 = AnonymousClass3ME.A00(r6);
        if (this.A00 != null) {
            this.A06.Bp3(new C81293wm((Object) this, A002, 10));
        }
        this.A05.A0E("GetBusinessActivityReportProtocolHelper/get business activity error", AnonymousClass000.A0r("error_code=", AnonymousClass000.A0u(), A002), true);
    }

    public void BiM(C203399nx r28, String str) {
        AnonymousClass17Y r3;
        int i;
        AnonymousClass17Y r32;
        Runnable r0;
        C203399nx A0c = r28.A0c("p2b");
        if (A0c != null) {
            C203399nx A0c2 = A0c.A0c("report");
            if (A0c2 != null && this.A00 != null) {
                C203399nx A0c3 = A0c2.A0c("url");
                C203399nx A0c4 = A0c2.A0c("direct_path");
                C203399nx A0c5 = A0c2.A0c("file_name");
                C203399nx A0c6 = A0c2.A0c("file_length");
                C203399nx A0c7 = A0c2.A0c("media_key");
                C203399nx A0c8 = A0c2.A0c("file_sha256");
                C203399nx A0c9 = A0c2.A0c("file_enc_sha256");
                if (A0c3 == null || A0c5 == null || A0c6 == null || A0c8 == null || A0c9 == null || A0c7 == null || A0c4 == null) {
                    r3 = this.A06;
                    i = 41;
                } else {
                    long A012 = AnonymousClass6R8.A01(A0c6.A0e(), 0);
                    String A0e = A0c3.A0e();
                    String A0e2 = A0c4.A0e();
                    C18740tg.A06(A0e2);
                    String A0e3 = A0c5.A0e();
                    C18740tg.A06(A0e3);
                    String A0e4 = A0c7.A0e();
                    C18740tg.A06(A0e4);
                    String A0e5 = A0c8.A0e();
                    C18740tg.A06(A0e5);
                    String A0e6 = A0c9.A0e();
                    C18740tg.A06(A0e6);
                    AnonymousClass3XD r14 = new AnonymousClass3XD(A0e, A0e2, A0e3, A0e4, A0e5, A0e6, A012, A0c2.A0V("creation", 0) * 1000, A0c2.A0V("expiration", (C19970wo.A00(this.A03) + 2592000000L) / 1000) * 1000);
                    r32 = this.A06;
                    r0 = C80313vC.A00(this, r14, 42);
                }
            } else if (this.A00 != null) {
                r32 = this.A06;
                r0 = new C80303vB(this, A0c.A0V("timestamp", 0) * 1000, 15);
            } else {
                return;
            }
            r32.Bp3(r0);
            return;
        } else if (this.A00 != null) {
            r3 = this.A06;
            i = 42;
        } else {
            return;
        }
        r3.Bp3(new C81153wY((Object) this, i));
    }

    public C76803pT(C19700wN r1, AnonymousClass17Y r2, C19730wQ r3, C19600wD r4, C19970wo r5, AnonymousClass19A r6) {
        this.A03 = r5;
        this.A06 = r2;
        this.A05 = r1;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
    }
}
