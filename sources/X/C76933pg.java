package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pg  reason: invalid class name and case insensitive filesystem */
public class C76933pg implements C236119d {
    public C62453Gf A00;
    public final C19730wQ A01;
    public final C203289nj A02;
    public final C25991Il A03;
    public final AnonymousClass1AB A04;
    public final AnonymousClass1IZ A05;
    public final AnonymousClass1IT A06;
    public final AnonymousClass19A A07;
    public final C19770wU A08;

    public static synchronized C62453Gf A00(C76933pg r2) {
        C62453Gf r1;
        synchronized (r2) {
            r1 = r2.A00;
            C18740tg.A06(r1);
            r2.A00 = null;
        }
        return r1;
    }

    public C76933pg(C19730wQ r1, C203289nj r2, C25991Il r3, AnonymousClass1AB r4, AnonymousClass1IZ r5, AnonymousClass1IT r6, AnonymousClass19A r7, C19770wU r8) {
        this.A01 = r1;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void BVN(String str) {
        C36321k7.A1P("sync-request-handler/onDeliveryFailure iqId:", str, AnonymousClass000.A0u());
        C80213v2.A01(this.A08, this, 0);
    }

    public void BWw(C203399nx r10, String str) {
        C36321k7.A1P("sync-request-handler/onError iqId:", str, AnonymousClass000.A0u());
        C203399nx A0c = r10.A0c("error");
        if (A0c != null) {
            int A0S = A0c.A0S("code", -1);
            if (A0S != -1) {
                String A0x = C36391kE.A0x(A0c, "text");
                Long l = null;
                try {
                    long A0V = A0c.A0V("backoff", -1);
                    if (A0V != -1) {
                        l = Long.valueOf(A0V * 1000);
                    }
                } catch (C235919b e) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e);
                }
                this.A08.Boy(new C80523vX(this, l, A0x, A0S, 2));
                return;
            }
            throw new C235919b(AnonymousClass000.A0l(r10, "Expected attribute code in ", AnonymousClass000.A0u()));
        }
        throw new C235919b(AnonymousClass000.A0l(r10, "Expected child error in ", AnonymousClass000.A0u()));
    }

    public void BiM(C203399nx r4, String str) {
        C36321k7.A1Q("sync-request-handler/onSuccess iqId:", str, AnonymousClass000.A0u());
        try {
            C80263v7.A00(this.A08, this, new C65763Tj(r4), 39);
        } catch (AnonymousClass198 | C1032654p e) {
            A00(this);
            C80263v7.A00(this.A08, this, e, 40);
        }
    }
}
