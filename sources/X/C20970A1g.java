package X;

import java.util.Objects;

/* renamed from: X.A1g  reason: case insensitive filesystem */
public abstract class C20970A1g implements C23113B5s {
    public B3B A00;

    public final void B5X() {
        if (this instanceof C1690683c) {
            C199559fW r0 = ((C1690683c) this).A08;
            if (r0 != null) {
                r0.A07 = false;
            }
        } else if (this instanceof C1690483a) {
            C1690483a r2 = (C1690483a) this;
            if (r2.A03 != null) {
                C204349pr r3 = r2.A04;
                C201589jv r22 = r3.A05;
                if (r22.A0B && !r22.A0F) {
                    synchronized (r22.A09) {
                        r22.A0F = true;
                    }
                }
                r3.A01.sendEmptyMessage(2);
            }
        }
    }

    public final void BKJ() {
        if (this instanceof C1690583b) {
            C1690583b r4 = (C1690583b) this;
            C1691688a r0 = C23108B5n.A00;
            B3B b3b = r4.A00;
            Objects.requireNonNull(b3b);
            C23113B5s B9y = b3b.B9y(r0);
            AnonymousClass00C.A08(B9y);
            C23108B5n b5n = (C23108B5n) B9y;
            B2o b2o = r4.A01;
            if (b2o == null) {
                b2o = new BA1(r4, 1);
                r4.A01 = b2o;
            }
            b5n.B0h(b2o);
            if (AnonymousClass000.A1X(r4.A04(B5j.A00, C36381kD.A0j()))) {
                C1691688a r1 = C23104B5d.A00;
                Objects.requireNonNull(b3b);
                if (b3b.BLR(r1)) {
                    Objects.requireNonNull(b3b);
                    AnonymousClass00C.A08(b3b.B9y(r1));
                    if (r4.A00 == null) {
                        r4.A00 = new AnonymousClass9C0(r4);
                    }
                    throw AnonymousClass001.A0A("addDeviceOrientationChangedListener");
                }
            }
        }
    }

    public final void BKS() {
        if (this instanceof C1690483a) {
            C1690483a r4 = (C1690483a) this;
            C1691688a r2 = C23106B5l.A01;
            B3B b3b = r4.A00;
            Objects.requireNonNull(b3b);
            if (b3b.BLR(r2)) {
                Objects.requireNonNull(b3b);
                C1690483a.A02(r4, ((AnonymousClass88N) ((C23106B5l) b3b.B9y(r2))).A00);
            }
            C20984A1y a1y = r4.A04.A00;
            if (a1y != null) {
                Objects.requireNonNull(a1y);
            }
        } else if (this instanceof AnonymousClass83Y) {
            AnonymousClass83Y r42 = (AnonymousClass83Y) this;
            if (r42.A00 == null) {
                C1691688a r22 = C23106B5l.A01;
                B3B b3b2 = r42.A00;
                Objects.requireNonNull(b3b2);
                if (b3b2.BLR(r22)) {
                    Objects.requireNonNull(b3b2);
                    new B9L(r42, 1).BmS(((AnonymousClass88N) ((C23106B5l) b3b2.B9y(r22))).A00);
                }
            }
        } else if (this instanceof AnonymousClass83Z) {
            AnonymousClass83Z r43 = (AnonymousClass83Z) this;
            C1691688a r1 = C23106B5l.A01;
            B3B b3b3 = r43.A00;
            Objects.requireNonNull(b3b3);
            if (b3b3.BLR(r1)) {
                Objects.requireNonNull(b3b3);
                new B9L(r43, 0).BmS(((AnonymousClass88N) ((C23106B5l) b3b3.B9y(r1))).A00);
            }
            AnonymousClass9N0 r23 = r43.A00;
            Objects.requireNonNull(b3b3);
            C1691688a r12 = C23108B5n.A00;
            if (b3b3.BLR(r12)) {
                C23108B5n b5n = (C23108B5n) b3b3.B9y(r12);
                r23.A02 = b5n;
                b5n.B0h(r23.A04);
            }
            C1691688a r13 = B5i.A01;
            if (b3b3.BLR(r13)) {
                b3b3.B9y(r13);
                throw AnonymousClass001.A0A("setPreProcessOnTouchListener");
            }
            C1691688a r14 = B5b.A00;
            if (b3b3.BLR(r14)) {
                b3b3.B9y(r14);
                throw AnonymousClass001.A0A("getRenderers");
            }
        }
    }

    public final void connect() {
        if (this instanceof C1690683c) {
            C199559fW r0 = ((C1690683c) this).A08;
            if (r0 != null) {
                r0.A07 = true;
            }
        } else if (this instanceof C1690483a) {
            C1690483a r2 = (C1690483a) this;
            if (r2.A03 != null) {
                r2.A04.A01.sendEmptyMessage(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r3 = (X.C1690483a) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void release() {
        /*
            r4 = this;
            r3 = r4
            boolean r0 = r4 instanceof X.C1690683c
            if (r0 == 0) goto L_0x000b
            X.83c r3 = (X.C1690683c) r3
            X.C1690683c.A00(r3)
        L_0x000a:
            return
        L_0x000b:
            boolean r0 = r4 instanceof X.C1690583b
            if (r0 == 0) goto L_0x0035
            X.83b r3 = (X.C1690583b) r3
            X.88a r1 = X.C23108B5n.A00
            X.B3B r0 = r3.A00
            java.util.Objects.requireNonNull(r0)
            X.B5s r2 = r0.B9y(r1)
            X.AnonymousClass00C.A08(r2)
            X.B5n r2 = (X.C23108B5n) r2
            X.B2o r1 = r3.A01
            if (r1 != 0) goto L_0x002d
            r0 = 1
            X.BA1 r1 = new X.BA1
            r1.<init>(r3, r0)
            r3.A01 = r1
        L_0x002d:
            X.83c r2 = (X.C1690683c) r2
            X.9VB r0 = r2.A03
            r0.A02(r1)
            return
        L_0x0035:
            boolean r0 = r4 instanceof X.C1690483a
            if (r0 == 0) goto L_0x000a
            X.83a r3 = (X.C1690483a) r3
            X.9cn r2 = r3.A03
            if (r2 == 0) goto L_0x000a
            r1 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r3.A0A = r0
            X.9pr r0 = r3.A04
            android.os.Handler r1 = r0.A01
            r0 = 3
            r1.sendEmptyMessage(r0)
            X.6Xg r0 = r2.A00
            if (r0 == 0) goto L_0x0059
            r0.A05()
            r0 = 0
            r2.A00 = r0
        L_0x0059:
            X.9bn r2 = r2.A03
            X.94R r0 = X.C197489bn.A04
            java.lang.Boolean r1 = X.C36381kD.A0j()
            java.util.Map r2 = r2.A00
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x006a
            r1 = r0
        L_0x006a:
            boolean r1 = X.AnonymousClass000.A1X(r1)
            X.94R r0 = X.C197489bn.A0A
            java.lang.Object r0 = r2.remove(r0)
            X.6Xg r0 = (X.C133216Xg) r0
            if (r1 == 0) goto L_0x000a
            if (r0 == 0) goto L_0x000a
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20970A1g.release():void");
    }

    public final Object A04(AnonymousClass94Q r2, Object obj) {
        B3B b3b = this.A00;
        Objects.requireNonNull(b3b);
        Object BA0 = b3b.BA0(r2);
        if (BA0 != null) {
            return BA0;
        }
        return obj;
    }

    public C20970A1g(B3B b3b) {
        this.A00 = b3b;
    }
}
