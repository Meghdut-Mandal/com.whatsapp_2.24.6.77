package X;

/* renamed from: X.6PT  reason: invalid class name */
public abstract class AnonymousClass6PT {
    public final C19970wo A00;
    public final C130936Na A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;

    public final void A01(C160227kf r11, AnonymousClass57O r12, Object obj, int i) {
        AnonymousClass00C.A0D(r12, 0);
        C160227kf r5 = r11;
        C123535wf r4 = new C123535wf(r5, this, r12, obj, i);
        AnonymousClass1UA A0M = C90524aI.A0M(this.A02);
        AnonymousClass6P0 r3 = C113435fX.A00;
        AnonymousClass6OQ A002 = A0M.A00(r3);
        if (A002 == null) {
            r11.BWl(AnonymousClass001.A09("user does not exist"), (Integer) null);
            return;
        }
        C18740tg.A06(A002);
        ((AnonymousClass6Mw) this.A03.get()).A01(r3, new C145586uC(A002, r11, r4));
    }

    public static final void A00(AnonymousClass6OQ r7, C128936Ee r8, C203399nx r9, C160227kf r10, AnonymousClass64P r11, AnonymousClass6PT r12, int i) {
        Exception exc;
        AnonymousClass737 r4 = new AnonymousClass737(r8, r11, r7, 32);
        boolean z = true;
        if (i != 190) {
            if (i != 405) {
                if (i == 408 || i == 429 || i == 500) {
                    AnonymousClass6OH r1 = (AnonymousClass6OH) r12.A04.get();
                    AnonymousClass00C.A0D(r8, 0);
                    Long A012 = r8.A01();
                    if (A012 != null) {
                        r1.A00.BpM(r4, "WaffleIQErrorHelper/retry", A012.longValue());
                        return;
                    }
                } else if (!(i == 503 || i == 400)) {
                    if (i != 401) {
                        if (i == 480) {
                            ((AnonymousClass6OH) r12.A04.get()).A01(r8, new C110385aa(r4, r10, 3), new Exception(AnonymousClass000.A0r("code=", AnonymousClass000.A0u(), 480)));
                            return;
                        } else if (i != 481) {
                            switch (i) {
                                case 483:
                                    ((C130716Md) ((AnonymousClass6OH) r12.A04.get()).A01.get()).A01();
                                    break;
                                case 484:
                                    AnonymousClass005 r3 = r12.A05;
                                    ((C116755l8) r3.get()).A00.A00.A0A(true);
                                    if (r9 != null) {
                                        try {
                                            boolean A1S = AnonymousClass000.A1S(r9.A0S("ndc", 0), 1);
                                            if (r9.A0S("npr", 0) != 1) {
                                                z = false;
                                            }
                                            if (!A1S && !z) {
                                                C90524aI.A0M(((C116755l8) r3.get()).A00.A02).A04(new C164037rA(r4, r10, 0), C113435fX.A00, (C128936Ee) null, new C120425rU(1, r7));
                                                return;
                                            }
                                        } catch (C235919b e) {
                                            r10.BWl(e, Integer.valueOf(i));
                                            return;
                                        }
                                    }
                                    break;
                                case 485:
                                    ((AnonymousClass6OH) r12.A04.get()).A00(new C145496tz(r4, r10), new Exception(AnonymousClass000.A0r("code=", AnonymousClass000.A0u(), 485)));
                                    return;
                                default:
                                    exc = C90464aC.A0R("unsupported error: ", AnonymousClass000.A0u(), i);
                                    C18740tg.A0A(exc);
                                    break;
                            }
                        } else {
                            r12.A04.get();
                            AnonymousClass00C.A0D(r8, 0);
                            if (r8.A04()) {
                                r4.run();
                                return;
                            }
                        }
                    }
                }
            }
            exc = new Exception(AnonymousClass000.A0r("code=", AnonymousClass000.A0u(), i));
            r10.BWl(exc, Integer.valueOf(i));
        }
        if (r8.A04()) {
            AnonymousClass1UA A0M = C90524aI.A0M(r12.A02);
            C145466tw r32 = new C145466tw(r8, r10, r11, i);
            r12.A05.get();
            A0M.A02(r7, r32, new C128936Ee(1, AnonymousClass6X5.A0L));
            return;
        }
        exc = new Exception(AnonymousClass000.A0r("code=", AnonymousClass000.A0u(), i));
        r10.BWl(exc, Integer.valueOf(i));
    }

    public AnonymousClass6PT(C19970wo r1, C130936Na r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
    }
}
