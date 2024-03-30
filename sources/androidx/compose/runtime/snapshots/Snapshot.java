package androidx.compose.runtime.snapshots;

import X.AnonymousClass001;
import X.AnonymousClass02Q;
import X.AnonymousClass666;
import X.AnonymousClass6YQ;
import X.AnonymousClass7RD;
import X.AnonymousClass7RE;
import X.AnonymousClass7WL;
import X.C006302t;
import X.C007103b;
import X.C1269066c;
import X.C129546Hk;
import X.C130346Ks;
import X.C1496472d;
import X.C1506876f;
import X.C159857k2;
import X.C90524aI;
import X.C93854hF;
import X.C93864hG;
import X.C93874hH;
import X.C93884hI;
import X.C93894hJ;
import X.C93904hK;

public abstract class Snapshot {
    public int A00;
    public int A01;
    public boolean A02;
    public C1496472d A03;

    public void A0B() {
        this.A02 = true;
        synchronized (AnonymousClass6YQ.A07) {
            int i = this.A01;
            if (i >= 0) {
                AnonymousClass6YQ.A0D(i);
                this.A01 = -1;
            }
        }
    }

    public static Snapshot A01(Object obj) {
        Snapshot snapshot = ((C93894hJ) obj).A00;
        if (snapshot == null) {
            return (Snapshot) AnonymousClass6YQ.A08.get();
        }
        return snapshot;
    }

    public static void A03(Snapshot snapshot) {
        AnonymousClass6YQ.A01 = AnonymousClass6YQ.A01.A02(snapshot.A04());
    }

    public int A04() {
        Snapshot A002;
        if (this instanceof C93894hJ) {
            A002 = A01(this);
        } else if (!(this instanceof C93864hG)) {
            return this.A00;
        } else {
            A002 = C93864hG.A00((C93864hG) this);
        }
        return A002.A04();
    }

    public int A05() {
        if (!(this instanceof C93904hK)) {
            return 0;
        }
        C93904hK r1 = (C93904hK) this;
        if (r1 instanceof C93864hG) {
            return C93864hG.A00((C93864hG) r1).A05();
        }
        return r1.A01;
    }

    public Snapshot A06() {
        C1269066c r1 = AnonymousClass6YQ.A05;
        Snapshot snapshot = (Snapshot) r1.A01();
        r1.A02(this);
        return snapshot;
    }

    public Snapshot A07(C006302t r8) {
        C93874hH r6;
        if (this instanceof C93894hJ) {
            C93894hJ r4 = (C93894hJ) this;
            C006302t A0B = AnonymousClass6YQ.A0B(r8, r4.A01, true);
            Snapshot snapshot = r4.A00;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass6YQ.A08.get();
            }
            return AnonymousClass6YQ.A01(snapshot.A07((C006302t) null), A0B, true);
        } else if (this instanceof C93884hI) {
            AnonymousClass6YQ.A0E(this);
            return new C93874hH(this, A08(), r8, A04());
        } else if (this instanceof C93874hH) {
            C93874hH r0 = (C93874hH) this;
            int A04 = r0.A04();
            return new C93874hH(r0.A00, r0.A08(), r8, A04);
        } else {
            C93904hK r42 = (C93904hK) this;
            if (r42 instanceof C93864hG) {
                C93864hG r43 = (C93864hG) r42;
                C006302t A0B2 = AnonymousClass6YQ.A0B(r8, r43.A07, true);
                boolean z = r43.A00;
                C93904hK A002 = C93864hG.A00(r43);
                if (!z) {
                    return AnonymousClass6YQ.A01(A002.A07((C006302t) null), A0B2, true);
                }
                return A002.A07(A0B2);
            } else if (r42 instanceof C93854hF) {
                AnonymousClass7RD r1 = new AnonymousClass7RD(r8);
                int i = AnonymousClass6YQ.A00;
                return (Snapshot) AnonymousClass6YQ.A09(new AnonymousClass7RE(r1));
            } else if (!(!r42.A02)) {
                throw AnonymousClass001.A08("Cannot use a disposed snapshot");
            } else if (!r42.A03 || r42.A01 >= 0) {
                int A042 = r42.A04();
                r42.A0Q(r42.A04());
                Object obj = AnonymousClass6YQ.A07;
                synchronized (obj) {
                    int i2 = AnonymousClass6YQ.A00;
                    AnonymousClass6YQ.A00 = i2 + 1;
                    AnonymousClass6YQ.A01 = AnonymousClass6YQ.A01.A02(i2);
                    C1496472d A08 = r42.A08();
                    for (int i3 = A042 + 1; i3 < i2; i3++) {
                        A08 = A08.A02(i3);
                    }
                    r6 = new C93874hH(r42, A08, r8, i2);
                }
                if (r42.A03 || r42.A02) {
                    return r6;
                }
                int A043 = r42.A04();
                synchronized (obj) {
                    int i4 = AnonymousClass6YQ.A00;
                    AnonymousClass6YQ.A00 = i4 + 1;
                    r42.A00 = i4;
                    A03(r42);
                }
                C1496472d A082 = r42.A08();
                int A044 = r42.A04();
                for (int i5 = A043 + 1; i5 < A044; i5++) {
                    A082 = A082.A02(i5);
                }
                r42.A0I(A082);
                return r6;
            } else {
                throw AnonymousClass001.A09("Unsupported operation on a disposed or applied snapshot");
            }
        }
    }

    public C1496472d A08() {
        Snapshot A002;
        if (this instanceof C93894hJ) {
            A002 = A01(this);
        } else if (!(this instanceof C93864hG)) {
            return this.A03;
        } else {
            A002 = C93864hG.A00((C93864hG) this);
        }
        return A002.A08();
    }

    public C006302t A09() {
        if (this instanceof C93894hJ) {
            return ((C93894hJ) this).A01;
        }
        if (this instanceof C93884hI) {
            return ((C93884hI) this).A01;
        }
        if (this instanceof C93874hH) {
            return ((C93874hH) this).A01;
        }
        return ((C93904hK) this).A07;
    }

    public void A0A() {
        C1496472d A012;
        if (this instanceof C93904hK) {
            C93904hK r2 = (C93904hK) this;
            A012 = AnonymousClass6YQ.A01.A01(r2.A04()).A03(r2.A02);
        } else {
            A012 = AnonymousClass6YQ.A01.A01(A04());
        }
        AnonymousClass6YQ.A01 = A012;
    }

    public void A0C() {
        if (this instanceof C93894hJ) {
            throw C129546Hk.A00();
        } else if (this instanceof C93884hI) {
            ((C93884hI) this).A00++;
        } else if (this instanceof C93874hH) {
            throw C129546Hk.A00();
        } else {
            C93904hK r1 = (C93904hK) this;
            if (r1 instanceof C93864hG) {
                throw C129546Hk.A00();
            } else if (r1 instanceof C93854hF) {
                throw C129546Hk.A00();
            } else {
                r1.A00++;
            }
        }
    }

    public void A0D() {
        if (this instanceof C93894hJ) {
            throw C129546Hk.A00();
        } else if (this instanceof C93884hI) {
            C93884hI r1 = (C93884hI) this;
            int i = r1.A00 - 1;
            r1.A00 = i;
            if (i == 0) {
                r1.A0G();
            }
        } else if (this instanceof C93874hH) {
            throw C129546Hk.A00();
        } else {
            C93904hK r7 = (C93904hK) this;
            if (r7 instanceof C93864hG) {
                throw C129546Hk.A00();
            } else if (r7 instanceof C93854hF) {
                throw C129546Hk.A00();
            } else {
                int i2 = r7.A00;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    r7.A00 = i3;
                    if (i3 == 0 && !r7.A03) {
                        C1506876f A0L = r7.A0L();
                        if (A0L != null) {
                            if (!r7.A03) {
                                r7.A0R((C1506876f) null);
                                int A04 = r7.A04();
                                Object[] objArr = A0L.A01;
                                int size = A0L.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    for (AnonymousClass666 BBv = ((C159857k2) C90524aI.A0d(objArr, i4)).BBv(); BBv != null; BBv = BBv.A01) {
                                        if (BBv.A00 == A04 || C007103b.A0j(r7.A02, Integer.valueOf(BBv.A00))) {
                                            BBv.A00 = 0;
                                        }
                                    }
                                }
                            } else {
                                throw AnonymousClass001.A09("Unsupported operation on a snapshot that has been applied");
                            }
                        }
                        r7.A0G();
                        return;
                    }
                    return;
                }
                throw AnonymousClass001.A08("no pending nested snapshots");
            }
        }
    }

    public void A0E() {
        Snapshot A002;
        if (this instanceof C93894hJ) {
            A002 = A01(this);
        } else if (!(this instanceof C93884hI) && !(this instanceof C93874hH)) {
            C93904hK r1 = (C93904hK) this;
            if (r1 instanceof C93864hG) {
                A002 = C93864hG.A00((C93864hG) r1);
            } else if (r1 instanceof C93854hF) {
                AnonymousClass6YQ.A09(AnonymousClass7WL.A00);
                return;
            } else if (!r1.A03 && !r1.A02) {
                r1.A0P();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        A002.A0E();
    }

    public void A0F() {
        int i = this.A01;
        if (i >= 0) {
            AnonymousClass6YQ.A0D(i);
            this.A01 = -1;
        }
    }

    public final void A0G() {
        synchronized (AnonymousClass6YQ.A07) {
            A0A();
            A0F();
        }
    }

    public void A0H(int i) {
        if (this instanceof C93904hK) {
            C93904hK r1 = (C93904hK) this;
            if (r1 instanceof C93864hG) {
                C93864hG.A00((C93864hG) r1).A0H(i);
            } else {
                r1.A01 = i;
            }
        } else {
            throw AnonymousClass001.A09("Updating write count is not supported for this snapshot");
        }
    }

    public void A0I(C1496472d r2) {
        if (this instanceof C93864hG) {
            throw C129546Hk.A00();
        }
        this.A03 = r2;
    }

    public void A0J(C159857k2 r3) {
        if (this instanceof C93894hJ) {
            A01(this).A0J(r3);
        } else if (this instanceof C93884hI) {
            int i = AnonymousClass6YQ.A00;
            throw AnonymousClass001.A09("Cannot modify a state object in a read-only snapshot");
        } else if (this instanceof C93874hH) {
            int i2 = AnonymousClass6YQ.A00;
            throw AnonymousClass001.A09("Cannot modify a state object in a read-only snapshot");
        } else {
            C93904hK r1 = (C93904hK) this;
            if (r1 instanceof C93864hG) {
                C93864hG.A00((C93864hG) r1).A0J(r3);
                return;
            }
            C1506876f A0L = r1.A0L();
            if (A0L == null) {
                A0L = new C1506876f();
                r1.A0R(A0L);
            }
            A0L.add(r3);
        }
    }

    public boolean A0K() {
        Snapshot A002;
        if (this instanceof C93894hJ) {
            A002 = A01(this);
        } else if ((this instanceof C93884hI) || (this instanceof C93874hH)) {
            return true;
        } else {
            C93904hK r1 = (C93904hK) this;
            if (!(r1 instanceof C93864hG)) {
                return false;
            }
            A002 = C93864hG.A00((C93864hG) r1);
        }
        return A002.A0K();
    }

    public Snapshot(C1496472d r10, int i) {
        int i2;
        int i3;
        this.A03 = r10;
        this.A00 = i;
        if (i != 0) {
            C1496472d A08 = A08();
            int[] iArr = A08.A03;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = A08.A01;
                if (j != 0) {
                    i3 = A08.A00;
                } else {
                    j = A08.A02;
                    i3 = j != 0 ? A08.A00 + 64 : i3;
                }
                int i4 = 32;
                if ((4294967295L & j) == 0) {
                    j >>= 32;
                } else {
                    i4 = 0;
                }
                if ((65535 & j) == 0) {
                    i4 += 16;
                    j >>= 16;
                }
                if ((255 & j) == 0) {
                    i4 += 8;
                    j >>= 8;
                }
                if ((15 & j) == 0) {
                    i4 += 4;
                    j >>= 4;
                }
                if ((1 & j) == 0) {
                    if ((2 & j) != 0) {
                        i4++;
                    } else if ((4 & j) != 0) {
                        i4 += 2;
                    } else {
                        i4 += 3;
                        if ((j & 8) == 0) {
                            i4 = -1;
                        }
                    }
                }
                i = i3 + i4;
            }
            synchronized (AnonymousClass6YQ.A07) {
                C130346Ks r5 = AnonymousClass6YQ.A06;
                int i5 = r5.A01 + 1;
                int[] iArr2 = r5.A04;
                int length = iArr2.length;
                if (i5 > length) {
                    int i6 = length * 2;
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    AnonymousClass02Q.A03(0, 0, length, iArr2, iArr3);
                    int[] iArr5 = r5.A03;
                    AnonymousClass02Q.A03(0, 0, iArr5.length, iArr5, iArr4);
                    r5.A04 = iArr3;
                    r5.A03 = iArr4;
                }
                int i7 = r5.A01;
                r5.A01 = i7 + 1;
                int[] iArr6 = r5.A02;
                int length2 = iArr6.length;
                if (r5.A00 >= length2) {
                    int i8 = 0;
                    int i9 = length2 * 2;
                    int[] iArr7 = new int[i9];
                    while (i8 < i9) {
                        int i10 = i8 + 1;
                        iArr7[i8] = i10;
                        i8 = i10;
                    }
                    AnonymousClass02Q.A03(0, 0, length2, iArr6, iArr7);
                    r5.A02 = iArr7;
                    iArr6 = iArr7;
                }
                i2 = r5.A00;
                r5.A00 = iArr6[i2];
                int[] iArr8 = r5.A04;
                iArr8[i7] = i;
                r5.A03[i7] = i2;
                iArr6[i2] = i7;
                int i11 = iArr8[i7];
                while (i7 > 0) {
                    int i12 = ((i7 + 1) >> 1) - 1;
                    if (iArr8[i12] <= i11) {
                        break;
                    }
                    C130346Ks.A00(r5, i12, i7);
                    i7 = i12;
                }
            }
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }

    public static AnonymousClass666 A02(Snapshot snapshot, AnonymousClass666 r3) {
        return AnonymousClass6YQ.A04(snapshot.A08(), r3, snapshot.A04());
    }
}
