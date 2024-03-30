package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.AsN  reason: case insensitive filesystem */
public abstract class C22657AsN extends AnonymousClass121 implements Iterable {
    public final C219411z[] A00;
    public final boolean A01;

    public C22657AsN() {
        this.A00 = C202169lB.A03;
        this.A01 = true;
    }

    public C22657AsN(C219411z r4) {
        Objects.requireNonNull(r4, "'element' cannot be null");
        this.A00 = new C219411z[]{r4};
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.length < 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22657AsN(X.C219411z[] r4, boolean r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 != 0) goto L_0x000c
            int r2 = r4.length
            r1 = 2
            r0 = 0
            if (r2 >= r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22657AsN.<init>(X.11z[], boolean):void");
    }

    public static void A03(C219411z[] r12) {
        int length = r12.length;
        int i = 2;
        if (length >= 2) {
            C219411z r11 = r12[0];
            C219411z r9 = r12[1];
            try {
                byte[] A1V = C165597tg.A1V(r11);
                try {
                    byte[] A1V2 = C165597tg.A1V(r9);
                    byte[] bArr = A1V2;
                    if (A04(A1V2, A1V)) {
                        C219411z r0 = r9;
                        r9 = r11;
                        r11 = r0;
                        bArr = A1V;
                        A1V = A1V2;
                    }
                    while (i < length) {
                        C219411z r4 = r12[i];
                        try {
                            byte[] A1V3 = C165597tg.A1V(r4);
                            if (A04(bArr, A1V3)) {
                                r12[i - 2] = r11;
                                r11 = r9;
                                A1V = bArr;
                                r9 = r4;
                                bArr = A1V3;
                            } else if (A04(A1V, A1V3)) {
                                r12[i - 2] = r11;
                                r11 = r4;
                                A1V = A1V3;
                            } else {
                                int i2 = i - 1;
                                while (true) {
                                    i2--;
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    C219411z r1 = r12[i2 - 1];
                                    try {
                                        if (A04(C165597tg.A1V(r1), A1V3)) {
                                            break;
                                        }
                                        r12[i2] = r1;
                                    } catch (IOException unused) {
                                        throw AnonymousClass001.A08("cannot encode object added to SET");
                                    }
                                }
                                r12[i2] = r4;
                            }
                            i++;
                        } catch (IOException unused2) {
                            throw AnonymousClass001.A08("cannot encode object added to SET");
                        }
                    }
                    r12[length - 2] = r11;
                    r12[length - 1] = r9;
                } catch (IOException unused3) {
                    throw AnonymousClass001.A08("cannot encode object added to SET");
                }
            } catch (IOException unused4) {
                throw AnonymousClass001.A08("cannot encode object added to SET");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(byte[] r5, byte[] r6) {
        /*
            r4 = 0
            byte r0 = r5[r4]
            r1 = r0 & -33
            byte r0 = r6[r4]
            r0 = r0 & -33
            r3 = 1
            if (r1 != r0) goto L_0x001f
            int r1 = r5.length
            int r0 = r6.length
            int r2 = java.lang.Math.min(r1, r0)
            int r2 = r2 - r3
        L_0x0013:
            if (r3 >= r2) goto L_0x0026
            byte r1 = r5[r3]
            byte r0 = r6[r3]
            if (r1 == r0) goto L_0x0023
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x001f:
            if (r1 >= r0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            return r4
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0026:
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r6[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0022
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22657AsN.A04(byte[], byte[]):boolean");
    }

    public AnonymousClass121 A0B() {
        boolean z = this.A01;
        C219411z[] r0 = this.A00;
        if (!z) {
            r0 = (C219411z[]) r0.clone();
            A03(r0);
        }
        return new C22678Asi(r0, true);
    }

    public boolean A0E() {
        return true;
    }

    public static C22657AsN A01(Object obj) {
        if (obj == null || (obj instanceof C22657AsN)) {
            return (C22657AsN) obj;
        }
        if (obj instanceof C23127B6i) {
            return A01(((C219411z) obj).Bve());
        }
        if (obj instanceof byte[]) {
            try {
                return A01(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A08(C36331k8.A0i("failed to construct set from byte[]: ", AnonymousClass000.A0u(), e));
            }
        } else {
            if (obj instanceof C219411z) {
                AnonymousClass121 Bve = ((C219411z) obj).Bve();
                if (Bve instanceof C22657AsN) {
                    return (C22657AsN) Bve;
                }
            }
            throw C165567td.A0N(obj, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public AnonymousClass121 A0C() {
        if ((this instanceof C22677Ash) || (this instanceof C22678Asi)) {
            return this;
        }
        return new C22677Ash(this.A00, this.A01);
    }

    public boolean A0F(AnonymousClass121 r8) {
        if (r8 instanceof C22657AsN) {
            C22657AsN asN = (C22657AsN) r8;
            int length = this.A00.length;
            if (asN.A00.length == length) {
                C22657AsN asN2 = (C22657AsN) A0B();
                C22657AsN asN3 = (C22657AsN) asN.A0B();
                int i = 0;
                while (i < length) {
                    AnonymousClass121 Bve = asN2.A00[i].Bve();
                    AnonymousClass121 Bve2 = asN3.A00[i].Bve();
                    if (Bve == Bve2 || Bve.A0F(Bve2)) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C219411z[] r3 = this.A00;
        int length = r3.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = C36401kF.A02(r3[length].Bve(), i);
        }
    }

    public Iterator iterator() {
        return new AY0(C202169lB.A04(this.A00));
    }

    public String toString() {
        C219411z[] r4 = this.A00;
        int length = r4.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer A0x = C165607th.A0x();
        A0x.append('[');
        int i = 0;
        while (true) {
            A0x.append(r4[i]);
            i++;
            if (i >= length) {
                A0x.append(']');
                return A0x.toString();
            }
            A0x.append(", ");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r2.length < 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22657AsN(X.C202169lB r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "'elementVector' cannot be null"
            java.util.Objects.requireNonNull(r6, r0)
            r4 = 2
            if (r7 == 0) goto L_0x0026
            int r3 = r6.A00
            if (r3 < r4) goto L_0x0026
            X.11z[] r2 = new X.C219411z[r3]
            X.11z[] r1 = r6.A02
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            A03(r2)
        L_0x001a:
            r5.A00 = r2
            if (r7 != 0) goto L_0x0022
            int r1 = r2.length
            r0 = 0
            if (r1 >= r4) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r5.A01 = r0
            return
        L_0x0026:
            X.11z[] r2 = r6.A07()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22657AsN.<init>(X.9lB, boolean):void");
    }

    public static C22657AsN A02(C22658AsO asO) {
        AnonymousClass121 A012 = C22658AsO.A01(asO);
        if (asO.A02) {
            if (asO instanceof C22679Asj) {
                return new C22676Asg((C219411z) A012);
            }
            return new C22677Ash((C219411z) A012);
        } else if (A012 instanceof C22657AsN) {
            C22657AsN asN = (C22657AsN) A012;
            if (asO instanceof C22679Asj) {
                return asN;
            }
            return (C22657AsN) asN.A0C();
        } else if (A012 instanceof C22656AsM) {
            C22656AsM asM = (C22656AsM) A012;
            boolean z = asM instanceof C22672Asc;
            C22672Asc asc = asM;
            if (z) {
                C22672Asc asc2 = (C22672Asc) asM;
                C22672Asc.A06(asc2);
                asc = asc2;
            }
            C219411z[] r2 = asc.A00;
            if (asO instanceof C22679Asj) {
                return new C22676Asg(r2);
            }
            return new C22677Ash(r2, false);
        } else {
            throw C165567td.A0N(asO, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public C22657AsN(C219411z[] r4) {
        for (C219411z r0 : r4) {
            if (r0 == null) {
                throw AnonymousClass001.A0A("'elements' cannot be null, or contain null");
            }
        }
        C219411z[] A04 = C202169lB.A04(r4);
        if (A04.length >= 2) {
            A03(A04);
        }
        this.A00 = A04;
        this.A01 = true;
    }
}
