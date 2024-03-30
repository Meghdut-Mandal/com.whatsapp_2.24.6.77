package X;

public abstract class A25 implements B30 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public void A02() {
        if (this instanceof AnonymousClass88Y) {
            for (B30 B5X : ((AnonymousClass88Y) this).A00) {
                B5X.B5X();
            }
        } else if (this instanceof AnonymousClass88P) {
            AnonymousClass88P r2 = (AnonymousClass88P) this;
            AnonymousClass88P.A01(r2, (C199559fW) null);
            C1691688a r1 = C23108B5n.A00;
            if (r2.A00.BLR(r1)) {
                C23108B5n b5n = (C23108B5n) r2.A05(r1);
                B2o b2o = r2.A08;
                if (b2o == null) {
                    b2o = new C140216lE(r2);
                    r2.A08 = b2o;
                }
                ((C1690683c) b5n).A03.A02(b2o);
            }
            AnonymousClass9CX r12 = r2.A0N;
            if (r12 != null) {
                r12.A00 = null;
            }
        }
    }

    public void A03() {
        if (this instanceof AnonymousClass88Y) {
            for (B30 BKJ : ((AnonymousClass88Y) this).A00) {
                BKJ.BKJ();
            }
        } else if (this instanceof AnonymousClass88P) {
            AnonymousClass88P r1 = (AnonymousClass88P) this;
            r1.A06 = (C23107B5m) r1.A05(C23107B5m.A00);
            r1.A0N = ((AnonymousClass88O) ((B5g) r1.A05(B5g.A00))).A01;
        }
    }

    public void A04() {
        if (this instanceof AnonymousClass88Y) {
            for (B30 release : ((AnonymousClass88Y) this).A00) {
                release.release();
            }
        } else if (this instanceof AnonymousClass88P) {
            AnonymousClass88P r1 = (AnonymousClass88P) this;
            r1.A0K.A00();
            r1.A0N = null;
        }
    }

    public final void B5X() {
        if (!this.A00) {
            throw AnonymousClass001.A09("Observer not initialized.");
        } else if (this.A02) {
            if (this.A01) {
                A02();
                this.A01 = false;
            }
            this.A02 = false;
        }
    }

    public final void BKJ() {
        if (!this.A00) {
            this.A00 = true;
            this.A03 = true;
            this.A01 = false;
            A03();
        }
    }

    public final void BKS() {
        if (this.A00) {
            if (this instanceof AnonymousClass88Y) {
                for (B30 BKS : ((AnonymousClass88Y) this).A00) {
                    BKS.BKS();
                }
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Observer not initialized.");
    }

    public final void connect() {
        if (!this.A00) {
            throw AnonymousClass001.A09("Observer not initialized.");
        } else if (!this.A02) {
            this.A02 = true;
            if (this.A03) {
                if (this instanceof AnonymousClass88Y) {
                    for (B30 connect : ((AnonymousClass88Y) this).A00) {
                        connect.connect();
                    }
                } else if (this instanceof AnonymousClass88P) {
                    AnonymousClass88P r2 = (AnonymousClass88P) this;
                    C1691688a r1 = C23108B5n.A00;
                    if (r2.A00.BLR(r1)) {
                        C23108B5n b5n = (C23108B5n) r2.A05(r1);
                        B2o b2o = r2.A08;
                        if (b2o == null) {
                            b2o = new C140216lE(r2);
                            r2.A08 = b2o;
                        }
                        b5n.B0h(b2o);
                    }
                    AnonymousClass9CX r12 = r2.A0N;
                    if (r12 != null) {
                        C22875AxW axW = r2.A09;
                        if (axW == null) {
                            axW = new C23221BAd(r2, 1);
                            r2.A09 = axW;
                        }
                        r12.A00 = axW;
                    }
                }
                this.A01 = true;
            }
        }
    }

    public final void release() {
        if (this.A00) {
            A04();
            this.A03 = false;
            this.A00 = false;
            this.A01 = false;
        }
    }
}
