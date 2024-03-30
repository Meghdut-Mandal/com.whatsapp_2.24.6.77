package X;

/* renamed from: X.9VD  reason: invalid class name */
public abstract class AnonymousClass9VD {
    public boolean A00;

    public void A05() {
        if (this instanceof C176948cw) {
            C176948cw r2 = (C176948cw) this;
            if (r2.A04 == null) {
                throw A03(r2, "subsystem was not specified.");
            } else if (r2.A00 == null) {
                throw A03(r2, "integrationState was not specified.");
            } else if (r2.A03 == null) {
                throw A03(r2, "integrationPoint was not configured.");
            } else if (r2.A02 == null) {
                Object obj = r2.A05.A06.get();
                AnonymousClass00C.A08(obj);
                C176988d0 r1 = (C176988d0) obj;
                AnonymousClass00C.A0D(r1, 0);
                r2.A02 = r1;
                r1.A06();
                A04(r1);
            }
        } else if (this instanceof C176938cv) {
            C176938cv r12 = (C176938cv) this;
            if (r12.A01 == null) {
                throw A03(r12, "integrationInterface was not specified.");
            } else if (r12.A00 == null) {
                throw A03(r12, "defaultImplementation was not specified.");
            }
        } else if (this instanceof C176978cz) {
            C176978cz r22 = (C176978cz) this;
            if (r22.A00 != -1) {
                C176888cq A09 = r22.A09();
                A09.A06();
                A09.A08(r22.A00);
                A04(A09);
            }
            C176888cq r0 = r22.A06;
            if (r0 == null) {
                throw A03(r22, "At least one system action must be specified using systemActions{}");
            } else if (r0.A00.isEmpty()) {
                throw A03(r22, "At least one system action must be specified using systemActions{}");
            } else if (r22.A07 == null) {
                throw A03(r22, "messageClass was not specified.");
            } else if (r22.A01 != null) {
                if (r22.A05 == null) {
                    C176908cs A02 = A02(r22.A08.A04);
                    r22.A05 = A02;
                    A02.A06();
                    A04(A02);
                }
                if (r22.A04 == null) {
                    Object obj2 = r22.A08.A03.get();
                    AnonymousClass00C.A08(obj2);
                    C176878cp r13 = (C176878cp) obj2;
                    AnonymousClass00C.A0D(r13, 0);
                    r22.A04 = r13;
                    C22525Ao7 ao7 = C22525Ao7.A00;
                    r13.A06();
                    ao7.invoke(r13);
                    A04(r13);
                }
                if (r22.A03 == null) {
                    Object obj3 = r22.A08.A05.get();
                    AnonymousClass00C.A08(obj3);
                    C176998d1 r14 = (C176998d1) obj3;
                    AnonymousClass00C.A0D(r14, 0);
                    r22.A03 = r14;
                    C22526Ao8 ao8 = C22526Ao8.A00;
                    r14.A06();
                    ao8.invoke(r14);
                    A04(r14);
                }
            } else {
                throw A03(r22, "integrationState was not specified.");
            }
        } else if (this instanceof C176928cu) {
            throw A03(this, "messageClass was not specified.");
        } else if (this instanceof C176918ct) {
            C176918ct r15 = (C176918ct) this;
            if (r15.A01 == null) {
                throw A03(r15, "integrationInterface was not specified.");
            } else if (r15.A00 == null) {
                throw A03(r15, "defaultImplementation was not specified.");
            }
        } else if (this instanceof C176958cx) {
            C176958cx r23 = (C176958cx) this;
            if (r23.A04 == null) {
                throw A03(r23, "subsystem was not specified.");
            } else if (r23.A00 == null) {
                throw A03(r23, "integrationState was not specified.");
            } else if (r23.A03 == null) {
                throw A03(r23, "integrationPoint was not configured.");
            } else if (r23.A02 == null) {
                Object obj4 = r23.A05.A08.get();
                AnonymousClass00C.A08(obj4);
                C176988d0 r16 = (C176988d0) obj4;
                AnonymousClass00C.A0D(r16, 0);
                r23.A02 = r16;
                r16.A06();
                A04(r16);
            }
        } else if (this instanceof C176968cy) {
            C176968cy r24 = (C176968cy) this;
            if (r24.A05 == null) {
                throw A03(r24, "messageType was not specified.");
            } else if (r24.A06 == null) {
                throw A03(r24, "messageClass was not specified.");
            } else if (r24.A00 != null) {
                if (r24.A04 == null) {
                    C176908cs A022 = A02(r24.A07.A05);
                    r24.A04 = A022;
                    A022.A06();
                    A04(A022);
                }
                if (r24.A03 == null) {
                    Object obj5 = r24.A07.A04.get();
                    AnonymousClass00C.A08(obj5);
                    C176878cp r17 = (C176878cp) obj5;
                    AnonymousClass00C.A0D(r17, 0);
                    r24.A03 = r17;
                    C22523Ao5 ao5 = C22523Ao5.A00;
                    r17.A06();
                    ao5.invoke(r17);
                    A04(r17);
                }
                if (r24.A02 == null) {
                    Object obj6 = r24.A07.A06.get();
                    AnonymousClass00C.A08(obj6);
                    C176998d1 r18 = (C176998d1) obj6;
                    AnonymousClass00C.A0D(r18, 0);
                    r24.A02 = r18;
                    C22524Ao6 ao6 = C22524Ao6.A00;
                    r18.A06();
                    ao6.invoke(r18);
                    r18.A05();
                    r18.A00 = true;
                }
            } else {
                throw A03(r24, "integrationState was not specified.");
            }
        } else if (this instanceof C176898cr) {
            throw A03(this, "messageClass was not specified.");
        } else if (this instanceof C176868co) {
            throw A03(this, "link was not specified.");
        } else if (this instanceof C176858cn) {
            throw A03(this, "className was not specified.");
        } else if (this instanceof C176848cm) {
            throw A03(this, "implementationClass was not specified.");
        }
    }

    public final void A06() {
        if (this.A00) {
            throw A03(this, "Builder already configured. Cannot reuse.");
        }
    }

    public static C176908cs A02(AnonymousClass004 r1) {
        Object obj = r1.get();
        AnonymousClass00C.A08(obj);
        C176908cs r12 = (C176908cs) obj;
        AnonymousClass00C.A0D(r12, 0);
        return r12;
    }

    public static RuntimeException A03(AnonymousClass9VD r0, String str) {
        r0.A07(str);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static void A04(AnonymousClass9VD r1) {
        r1.A05();
        r1.A00 = true;
    }

    public final void A07(String str) {
        throw new C21848AbY(AnonymousClass000.A0p(": ", str, C165567td.A0b(this)));
    }
}
