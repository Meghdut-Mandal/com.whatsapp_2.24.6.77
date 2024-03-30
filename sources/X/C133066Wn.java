package X;

/* renamed from: X.6Wn  reason: invalid class name and case insensitive filesystem */
public final class C133066Wn {
    public final C20810yC A00;
    public final C33761ft A01;
    public final C19770wU A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;

    public static final String A00(int i) {
        return i != 304 ? i != 429 ? i != 500 ? i != 503 ? i != 400 ? i != 401 ? i != 405 ? i != 406 ? i != 408 ? i != 409 ? i != 480 ? i != 481 ? "UNKNOWN" : "TIMESTAMP_EXPIRED" : "PAYLOAD_ENC_DEC" : "CONFLICT" : "REQUEST_TIMEOUT" : "REQUEST_NOT_ACCEPTABLE" : "REQUEST_NOT_ALLOWED" : "NOT_AUTHORIZED" : "BAD_REQUEST" : "SERVICE_UNAVAILABLE" : "INTERNAL_SERVER_ERROR" : "RATE_OVER_LIMIT" : "ALREADY_EXISTS";
    }

    public static final void A01(C160057kO r1, C128936Ee r2, C133066Wn r3, AnonymousClass5V6 r4, Runnable runnable, int i) {
        if (i != 405) {
            if (!(i == 406 || i == 408 || i == 429)) {
                if (i != 481) {
                    if (i != 500) {
                        if (i != 503) {
                            return;
                        }
                    }
                } else if (r2.A04()) {
                    runnable.run();
                    return;
                }
            }
            Long A012 = r2.A01();
            if (A012 != null) {
                r3.A02.BpM(runnable, "SupportUserIqErrorHelper/retryOperationWithDelay", A012.longValue());
                return;
            }
        }
        r1.BWk(r4);
    }

    public static final void A03(C160057kO r4, C133066Wn r5, AnonymousClass5V6 r6, AnonymousClass00S r7) {
        AnonymousClass005 r1 = r5.A03;
        AnonymousClass1UA A0M = C90524aI.A0M(r1);
        AnonymousClass6P0 r3 = C113275fH.A00;
        if (A0M.A00(r3) == null) {
            r7.invoke();
        } else {
            C90524aI.A0M(r1).A05(new C164057rC(r4, r6, r7, 1), r3, (C128936Ee) null, (String) null);
        }
    }

    public C133066Wn(C20810yC r2, C33761ft r3, C19770wU r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7) {
        C36321k7.A1B(r4, r5, r6, r7, r3);
        AnonymousClass00C.A0D(r2, 6);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final void A02(C160057kO r4, C128936Ee r5, C133066Wn r6, AnonymousClass5V6 r7, C006302t r8) {
        if (!r5.A04() || r5.A03()) {
            r4.BWk(r7);
            return;
        }
        r5.A02();
        AnonymousClass6P0 r3 = C113275fH.A00;
        ((C132196Sp) r6.A04.get()).A02(r3);
        ((AnonymousClass6Mw) r6.A05.get()).A01(r3, new C110385aa(r4, r8, 1));
    }
}
