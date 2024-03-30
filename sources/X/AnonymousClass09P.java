package X;

/* renamed from: X.09P  reason: invalid class name */
public abstract class AnonymousClass09P {
    public AnonymousClass09T[] A00;
    public final AnonymousClass09H A01;

    public abstract AnonymousClass09H A00();

    public void A02(AnonymousClass09T r1) {
    }

    public void A03(AnonymousClass09T r1) {
    }

    public void A04(AnonymousClass09T r1) {
    }

    public abstract void A05(AnonymousClass09T r1);

    public abstract void A06(AnonymousClass09T r1);

    public final void A01() {
        AnonymousClass09T[] r1 = this.A00;
        if (r1 != null) {
            AnonymousClass09T r2 = r1[0];
            AnonymousClass09T r12 = r1[1];
            if (r12 == null) {
                r12 = this.A01.A00.A0C(2);
            }
            if (r2 == null) {
                r2 = this.A01.A00.A0C(1);
            }
            A06(AnonymousClass09T.A02(r2, r12));
            AnonymousClass09T r0 = this.A00[4];
            if (r0 != null) {
                A03(r0);
            }
            AnonymousClass09T r02 = this.A00[5];
            if (r02 != null) {
                A02(r02);
            }
            AnonymousClass09T r03 = this.A00[6];
            if (r03 != null) {
                A04(r03);
            }
        }
    }

    public void A07(AnonymousClass09T r6, int i) {
        AnonymousClass09T[] r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass09T[9];
            this.A00 = r4;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                char c = 1;
                char c2 = 0;
                if (i2 != 1) {
                    c2 = 2;
                    if (i2 != 2) {
                        c = 4;
                        if (i2 != 4) {
                            c2 = 8;
                            if (i2 == 8) {
                                c2 = 3;
                            } else if (i2 != 16) {
                                if (i2 == 32) {
                                    c2 = 5;
                                } else if (i2 == 64) {
                                    c2 = 6;
                                } else if (i2 == 128) {
                                    c2 = 7;
                                } else if (i2 != 256) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("type needs to be >= FIRST and <= LAST, type=");
                                    sb.append(i2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    }
                    c2 = c;
                }
                r4[c2] = r6;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public AnonymousClass09P(AnonymousClass09H r1) {
        this.A01 = r1;
    }

    public AnonymousClass09P() {
        this(new AnonymousClass09H());
    }
}
