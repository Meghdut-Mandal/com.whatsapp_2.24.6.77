package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Map;

/* renamed from: X.4iy  reason: invalid class name and case insensitive filesystem */
public abstract class C94894iy extends C94744ii implements C160787la, C161687nJ, AnonymousClass7e1 {
    public static final C137396g4 A0J = new C137396g4();
    public static final C124495yH A0K = new C124495yH();
    public static final C160297km A0L = new AnonymousClass6HD(0);
    public static final C160297km A0M = new AnonymousClass6HD(1);
    public static final C006302t A0N = C155447Wc.A00;
    public static final C006302t A0O = C155457Wd.A00;
    public static final float[] A0P = AnonymousClass6VX.A04();
    public float A00;
    public long A01 = AnonymousClass6TU.A01;
    public AnonymousClass675 A02;
    public C160287kl A03;
    public C124495yH A04;
    public C94894iy A05;
    public C94894iy A06;
    public C160967ls A07;
    public C161937ni A08;
    public C006302t A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D = 0.8f;
    public AnonymousClass5RW A0E;
    public Map A0F;
    public final C137846gp A0G;
    public final AnonymousClass00S A0H = new AnonymousClass7J9(this);
    public final C006302t A0I = new AnonymousClass7RV(this);

    public static final void A04(C137856gq r12, AnonymousClass76X r13, C160297km r14, C94894iy r15, float f, long j, boolean z, boolean z2) {
        C137856gq r7 = r12;
        AnonymousClass76X r8 = r13;
        C160297km r9 = r14;
        C94894iy r10 = r15;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r7 == null) {
            r10.A0Y(r8, r9, j2, z3, z4);
            return;
        }
        C137856gq r5 = r7;
        float f2 = f;
        if (((AnonymousClass6HD) r9).A00 == 0) {
            C1506776e r4 = null;
            do {
                if (r5 instanceof C161847nZ) {
                    if (((C161847nZ) r5).BKp()) {
                        AnonymousClass7P1 r6 = new AnonymousClass7P1(r7, r8, r9, r10, f2, j2, z3, z4);
                        int i = r8.A00;
                        int size = r8.size() - 1;
                        if (i == size) {
                            r8.A02(r7, r6, f2, z4);
                            if (r8.A00 + 1 == r8.size() - 1) {
                                AnonymousClass76X.A01(r8);
                                return;
                            }
                            return;
                        }
                        long A002 = AnonymousClass76X.A00(r8);
                        r8.A00 = size;
                        r8.A02(r7, r6, f2, z4);
                        int i2 = r8.A00 + 1;
                        int size2 = r8.size();
                        if (i2 < size2 - 1 && C109215Ws.A00(A002, AnonymousClass76X.A00(r8)) > 0) {
                            int i3 = i + 1;
                            Object[] objArr = r8.A03;
                            AnonymousClass02Q.A05(objArr, i3, objArr, i2, size2);
                            long[] jArr = r8.A02;
                            System.arraycopy(jArr, i2, jArr, i3, r8.size() - i2);
                            r8.A00 = ((r8.size() + i) - r8.A00) - 1;
                        }
                        AnonymousClass76X.A01(r8);
                        r8.A00 = i;
                        return;
                    }
                } else if ((r5.A01 & 16) != 0 && (r5 instanceof C94114hf)) {
                    int i4 = 0;
                    for (C137856gq r2 = ((C94114hf) r5).A00; r2 != null; r2 = r2.A02) {
                        if ((r2.A01 & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                r5 = r2;
                            } else {
                                r4 = C90464aC.A0G(r4);
                                r5 = C90524aI.A0D(r4, r5);
                                r4.A0D(r2);
                            }
                        }
                    }
                    if (i4 == 1) {
                        continue;
                    }
                }
                r5 = AnonymousClass6VZ.A00(r4);
                continue;
            } while (r5 != null);
        }
        A04(C109275Wy.A00(r7, r9.B6i()), r8, r9, r10, f2, j2, z3, z4);
    }

    public static final void A06(C161047m3 r9, C94894iy r10) {
        C94894iy r8 = r10;
        C137856gq r1 = r10.A0M().A04;
        C161047m3 r6 = r9;
        if (r1 != null) {
            C137856gq A032 = A03(r10, false);
            while (A032 != null && (A032.A00 & 4) != 0) {
                if ((A032.A01 & 4) == 0) {
                    if (A032 == r1) {
                        break;
                    }
                    A032 = A032.A02;
                } else {
                    C137506gF r5 = ((AndroidComposeView) C129586Hq.A00(r10.A0G)).A0X;
                    long A022 = AnonymousClass6GI.A02(r10.A03);
                    C1506776e r4 = null;
                    do {
                        if (A032 instanceof C161817nW) {
                            r5.A00(r6, (C161817nW) A032, r8, A022);
                        } else if ((A032.A01 & 4) != 0 && (A032 instanceof C94114hf)) {
                            int i = 0;
                            for (C137856gq r2 = ((C94114hf) A032).A00; r2 != null; r2 = r2.A02) {
                                if ((r2.A01 & 4) != 0) {
                                    i++;
                                    if (i == 1) {
                                        A032 = r2;
                                    } else {
                                        r4 = C90464aC.A0F(r4);
                                        A032 = C90524aI.A0D(r4, A032);
                                        r4.A0D(r2);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        A032 = AnonymousClass6VZ.A00(r4);
                        continue;
                    } while (A032 != null);
                    return;
                }
            }
        }
        r10.A0U(r9);
    }

    public static final void A07(C94894iy r3, C006302t r4, float f, long j) {
        r3.A0a(r4, false);
        if (r3.A01 != j) {
            r3.A01 = j;
            C137846gp r1 = r3.A0G;
            r1.A0P.A0G.A0G();
            C160967ls r0 = r3.A07;
            if (r0 != null) {
                r0.BPx(j);
            } else {
                C94894iy r02 = r3.A06;
                if (r02 != null) {
                    r02.A0P();
                }
            }
            C94744ii.A01(r3);
            C161327mZ r03 = r1.A09;
            if (r03 != null) {
                r03.BZb(r1);
            }
        }
        r3.A00 = f;
    }

    private final long A02(C94894iy r3, long j) {
        if (r3 == this) {
            return j;
        }
        C94894iy r1 = this.A06;
        if (r1 == null || AnonymousClass00C.A0J(r3, r1)) {
            return A0J(j);
        }
        return A0J(r1.A02(r3, j));
    }

    public static final C137856gq A03(C94894iy r3, boolean z) {
        C137856gq A0M2;
        AnonymousClass6XQ r2 = r3.A0G.A0R;
        if (r2.A04 == r3) {
            return r2.A02;
        }
        C94894iy r0 = r3.A06;
        if (z) {
            if (r0 == null || (A0M2 = r0.A0M()) == null) {
                return null;
            }
            return A0M2.A02;
        } else if (r0 != null) {
            return r0.A0M();
        } else {
            return null;
        }
    }

    private final void A05(AnonymousClass675 r8, C94894iy r9, boolean z) {
        if (r9 != this) {
            C94894iy r0 = this.A06;
            if (r0 != null) {
                r0.A05(r8, r9, z);
            }
            long j = this.A01;
            float A082 = (float) C90494aF.A08(j);
            r8.A01 -= A082;
            r8.A02 -= A082;
            float f = (float) ((int) (j & 4294967295L));
            r8.A03 -= f;
            r8.A00 -= f;
            C160967ls r1 = this.A07;
            if (r1 != null) {
                r1.BP2(r8, true);
                if (this.A0A && z) {
                    long j2 = this.A03;
                    r8.A00(0.0f, 0.0f, (float) C90494aF.A08(j2), (float) ((int) (j2 & 4294967295L)));
                }
            }
        }
    }

    public static final void A08(C94894iy r9, boolean z) {
        C161327mZ r0;
        C160967ls r6 = r9.A07;
        if (r6 != null) {
            C006302t r5 = r9.A09;
            if (r5 != null) {
                C137396g4 r4 = A0J;
                if (r4.A02 != 1.0f) {
                    r4.A05 |= 1;
                    r4.A02 = 1.0f;
                }
                if (r4.A03 != 1.0f) {
                    r4.A05 |= 2;
                    r4.A03 = 1.0f;
                }
                if (r4.A00 != 1.0f) {
                    r4.A05 |= 4;
                    r4.A00 = 1.0f;
                }
                if (r4.A04 != 0.0f) {
                    r4.A05 |= 32;
                    r4.A04 = 0.0f;
                }
                long j = C112345dk.A00;
                r4.Bq9(j);
                r4.BsJ(j);
                if (r4.A01 != 8.0f) {
                    r4.A05 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    r4.A01 = 8.0f;
                }
                long j2 = C112365dm.A00;
                if (r4.A08 != j2) {
                    r4.A05 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                    r4.A08 = j2;
                }
                r4.BsE(C112355dl.A00);
                if (r4.A0B) {
                    r4.A05 |= 16384;
                    r4.A0B = false;
                }
                long j3 = AnonymousClass6X0.A02;
                r4.A05 = 0;
                C137846gp r2 = r9.A0G;
                r4.A0A = r2.A0B;
                ((AndroidComposeView) C129586Hq.A00(r2)).A0Z.A00(r9, new AnonymousClass7JA(r5), A0O);
                C124495yH r3 = r9.A04;
                if (r3 == null) {
                    r3 = new C124495yH();
                    r9.A04 = r3;
                }
                r3.A04 = r4.A02;
                r3.A05 = r4.A03;
                r3.A06 = 0.0f;
                r3.A07 = 0.0f;
                r3.A01 = 0.0f;
                r3.A02 = 0.0f;
                r3.A03 = 0.0f;
                r3.A00 = r4.A01;
                r3.A08 = r4.A08;
                r6.Bwi(r4, r2.A0B, r2.A0C);
                r9.A0A = r4.A0B;
                r9.A0D = r4.A00;
                if (z && (r0 = r2.A09) != null) {
                    r0.BZb(r2);
                    return;
                }
                return;
            }
            throw AnonymousClass001.A09("updateLayerParameters requires a non-null layerBlock");
        } else if (r9.A09 != null) {
            throw AnonymousClass001.A09("null layer with a non-null layerBlock");
        }
    }

    public long A0J(long j) {
        long j2 = this.A01;
        long A0B2 = C90464aC.A0B(C133206Xf.A00(j) - ((float) C90494aF.A08(j2)), C133206Xf.A01(j) - ((float) C90474aD.A03(j2)));
        C160967ls r1 = this.A07;
        if (r1 != null) {
            return r1.BP3(A0B2, true);
        }
        return A0B2;
    }

    public long A0K(long j) {
        C160967ls r1 = this.A07;
        if (r1 != null) {
            j = r1.BP3(j, false);
        }
        long j2 = this.A01;
        return C90464aC.A0B(C133206Xf.A00(j) + ((float) C90494aF.A08(j2)), C133206Xf.A01(j) + ((float) C90474aD.A03(j2)));
    }

    public C137856gq A0M() {
        if (this instanceof C94934jV) {
            return ((C137856gq) ((C94934jV) this).A00).A03;
        }
        return ((C94944jW) this).A01;
    }

    public C94924j1 A0N() {
        if (this instanceof C94934jV) {
            return ((C94934jV) this).A01;
        }
        return ((C94944jW) this).A00;
    }

    public final C94894iy A0O(C94894iy r7) {
        C137846gp r5 = r7.A0G;
        C137846gp r4 = r5;
        C137846gp r3 = this.A0G;
        C137846gp r2 = r3;
        if (r5 == r3) {
            C137856gq A0M2 = r7.A0M();
            C137856gq r1 = A0M().A03;
            if (!r1.A08) {
                throw AnonymousClass001.A09("visitLocalAncestors called on an unattached node");
            }
            while (true) {
                r1 = r1.A04;
                if (r1 != null) {
                    if ((r1.A01 & 2) != 0 && r1 == A0M2) {
                        break;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (r5.A00 > r3.A00) {
                r5 = r5.A0A();
                AnonymousClass00C.A0B(r5);
            }
            while (r3.A00 > r5.A00) {
                r3 = r3.A0A();
                AnonymousClass00C.A0B(r3);
            }
            while (r5 != r3) {
                r5 = r5.A0A();
                r3 = r3.A0A();
                if (r5 != null) {
                    if (r3 == null) {
                    }
                }
                throw AnonymousClass001.A08("layouts are not part of the same hierarchy");
            }
            if (r3 == r2) {
                return this;
            }
            if (r5 != r4) {
                return r5.A0R.A06;
            }
        }
        return r7;
    }

    public void A0P() {
        C160967ls r0 = this.A07;
        if (r0 != null) {
            r0.invalidate();
            return;
        }
        C94894iy r02 = this.A06;
        if (r02 != null) {
            r02.A0P();
        }
    }

    public final void A0Q() {
        C129056Et r3 = this.A0G.A0P;
        Integer num = r3.A0F.A0P.A05;
        if (num == C023109s.A0C || num == C023109s.A0G) {
            if (r3.A0G.A0E) {
                r3.A04(true);
            } else {
                r3.A03(true);
            }
        }
        if (num == C023109s.A0G) {
            C94724ig r0 = r3.A04;
            if (r0 == null || !r0.A08) {
                r3.A03(true);
            } else {
                r3.A04(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        if (r1 == 1) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r12 = this;
            r11 = 128(0x80, float:1.794E-43)
            r0 = 1
            X.6gq r0 = A03(r12, r0)
            if (r0 == 0) goto L_0x0089
            X.6gq r0 = r0.A03
            int r0 = r0.A00
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0089
            androidx.compose.runtime.snapshots.Snapshot r10 = X.AnonymousClass6VV.A02()
            androidx.compose.runtime.snapshots.Snapshot r9 = r10.A06()     // Catch:{ all -> 0x0081 }
            X.6gq r8 = r12.A0M()     // Catch:{ all -> 0x007c }
            r7 = 1
            X.6gq r6 = A03(r12, r7)     // Catch:{ all -> 0x007c }
        L_0x0021:
            if (r6 == 0) goto L_0x0078
            int r0 = r6.A00     // Catch:{ all -> 0x007c }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0078
            int r0 = r6.A01     // Catch:{ all -> 0x007c }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0073
            r5 = 0
            r4 = r6
            r3 = r5
        L_0x0030:
            boolean r0 = r4 instanceof X.C161827nX     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0040
            X.7nX r4 = (X.C161827nX) r4     // Catch:{ all -> 0x007c }
            long r0 = r12.A03     // Catch:{ all -> 0x007c }
            r4.BeX(r0)     // Catch:{ all -> 0x007c }
        L_0x003b:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r3)     // Catch:{ all -> 0x007c }
            goto L_0x0070
        L_0x0040:
            int r0 = r4.A01     // Catch:{ all -> 0x007c }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x003b
            boolean r0 = r4 instanceof X.C94114hf     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x003b
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0     // Catch:{ all -> 0x007c }
            X.6gq r2 = r0.A00     // Catch:{ all -> 0x007c }
            r1 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x006e
            int r0 = r2.A01     // Catch:{ all -> 0x007c }
            r0 = r0 & r11
            if (r0 == 0) goto L_0x006b
            int r1 = r1 + 1
            if (r1 != r7) goto L_0x005c
            r4 = r2
            goto L_0x006b
        L_0x005c:
            if (r3 != 0) goto L_0x0062
            X.76e r3 = X.C1506776e.A01()     // Catch:{ all -> 0x007c }
        L_0x0062:
            if (r4 == 0) goto L_0x0068
            r3.A0D(r4)     // Catch:{ all -> 0x007c }
            r4 = r5
        L_0x0068:
            r3.A0D(r2)     // Catch:{ all -> 0x007c }
        L_0x006b:
            X.6gq r2 = r2.A02     // Catch:{ all -> 0x007c }
            goto L_0x004f
        L_0x006e:
            if (r1 != r7) goto L_0x003b
        L_0x0070:
            if (r4 == 0) goto L_0x0073
            goto L_0x0030
        L_0x0073:
            if (r6 == r8) goto L_0x0078
            X.6gq r6 = r6.A02     // Catch:{ all -> 0x007c }
            goto L_0x0021
        L_0x0078:
            X.C1269066c.A00(r9)     // Catch:{ all -> 0x0081 }
            goto L_0x0086
        L_0x007c:
            r0 = move-exception
            X.C1269066c.A00(r9)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r10.A0B()
            throw r0
        L_0x0086:
            r10.A0B()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94894iy.A0R():void");
    }

    public final void A0S() {
        C137856gq A0M2 = A0M();
        C137856gq A032 = A03(this, true);
        while (A032 != null && (A032.A00 & 128) != 0) {
            if ((A032.A01 & 128) != 0) {
                C1506776e r4 = null;
                C137856gq r3 = A032;
                do {
                    if (r3 instanceof C161827nX) {
                        ((C161827nX) r3).Bcj(this);
                    } else if ((r3.A01 & 128) != 0 && (r3 instanceof C94114hf)) {
                        int i = 0;
                        for (C137856gq r2 = ((C94114hf) r3).A00; r2 != null; r2 = r2.A02) {
                            if ((r2.A01 & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    r3 = r2;
                                } else {
                                    r4 = C90464aC.A0F(r4);
                                    r3 = C90524aI.A0D(r4, r3);
                                    r4.A0D(r2);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r3 = AnonymousClass6VZ.A00(r4);
                    continue;
                } while (r3 != null);
            }
            if (A032 != A0M2) {
                A032 = A032.A02;
            } else {
                return;
            }
        }
    }

    public final void A0T(AnonymousClass675 r10, boolean z, boolean z2) {
        C160967ls r5 = this.A07;
        if (r5 != null) {
            if (this.A0A) {
                if (z2) {
                    long Bvs = this.A08.Bvs(this.A0G.A0A.BEJ());
                    float A012 = AnonymousClass6X0.A01(Bvs) / 2.0f;
                    float A002 = AnonymousClass6X0.A00(Bvs) / 2.0f;
                    long j = this.A03;
                    r10.A00(-A012, -A002, ((float) C90494aF.A08(j)) + A012, ((float) C90474aD.A03(j)) + A002);
                } else if (z) {
                    long j2 = this.A03;
                    r10.A00(0.0f, 0.0f, (float) C90494aF.A08(j2), (float) C90474aD.A03(j2));
                }
                if (r10.A01 >= r10.A02 || r10.A03 >= r10.A00) {
                    return;
                }
            }
            r5.BP2(r10, false);
        }
        long j3 = this.A01;
        float A082 = (float) C90494aF.A08(j3);
        r10.A01 += A082;
        r10.A02 += A082;
        float A032 = (float) C90474aD.A03(j3);
        r10.A03 += A032;
        r10.A00 += A032;
    }

    public void A0U(C161047m3 r7) {
        C158827iI r0;
        if (this instanceof C94934jV) {
            C94894iy r02 = this.A05;
            AnonymousClass00C.A0B(r02);
            r02.A0V(r7);
            if (((AndroidComposeView) C129586Hq.A00(this.A0G)).A08) {
                r0 = C94934jV.A02;
            } else {
                return;
            }
        } else {
            C137846gp r03 = this.A0G;
            C161327mZ A002 = C129586Hq.A00(r03);
            C1506776e A082 = r03.A08();
            int i = A082.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = A082.A01;
                do {
                    C137846gp r1 = (C137846gp) objArr[i2];
                    if (r1.A0P.A0G.A0C) {
                        r1.A0R.A04.A0V(r7);
                    }
                    i2++;
                } while (i2 < i);
            }
            if (((AndroidComposeView) A002).A08) {
                r0 = C94944jW.A02;
            } else {
                return;
            }
        }
        A0W(r7, r0);
    }

    public final void A0V(C161047m3 r5) {
        C160967ls r0 = this.A07;
        if (r0 != null) {
            r0.B69(r5);
            return;
        }
        long j = this.A01;
        float A082 = (float) C90494aF.A08(j);
        float A032 = (float) C90474aD.A03(j);
        r5.Bw6(A082, A032);
        A06(r5, this);
        r5.Bw6(-A082, -A032);
    }

    public final void A0W(C161047m3 r10, C158827iI r11) {
        long j = this.A03;
        AnonymousClass6QC r0 = new AnonymousClass6QC(0.5f, 0.5f, ((float) C90494aF.A08(j)) - 0.5f, ((float) C90474aD.A03(j)) - 0.5f);
        r10.B6D(r11, 0.5f, 0.5f, r0.A02, r0.A00);
    }

    public void A0X(C160287kl r9) {
        C160287kl r2 = this.A03;
        if (r9 != r2) {
            this.A03 = r9;
            if (!(r2 != null && r9.getWidth() == r2.getWidth() && r9.getHeight() == r2.getHeight())) {
                int width = r9.getWidth();
                int height = r9.getHeight();
                C160967ls r22 = this.A07;
                if (r22 != null) {
                    r22.Boc(C90484aE.A0J(width, height));
                } else {
                    C94894iy r0 = this.A06;
                    if (r0 != null) {
                        r0.A0P();
                    }
                }
                long A0J2 = C90484aE.A0J(width, height);
                if (this.A03 != A0J2) {
                    this.A03 = A0J2;
                    AnonymousClass6Q4.A09(this);
                }
                A08(this, false);
                C137856gq r7 = A0M().A04;
                if (r7 != null) {
                    C137856gq A032 = A03(this, false);
                    while (A032 != null && (A032.A00 & 4) != 0) {
                        if ((A032.A01 & 4) != 0) {
                            C1506776e r5 = null;
                            C137856gq r4 = A032;
                            do {
                                if (r4 instanceof C161817nW) {
                                    ((C161817nW) r4).BaV();
                                } else if ((r4.A01 & 4) != 0 && (r4 instanceof C94114hf)) {
                                    int i = 0;
                                    for (C137856gq r23 = ((C94114hf) r4).A00; r23 != null; r23 = r23.A02) {
                                        if ((r23.A01 & 4) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r4 = r23;
                                            } else {
                                                r5 = C90464aC.A0F(r5);
                                                r4 = C90524aI.A0D(r5, r4);
                                                r5.A0D(r23);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r4 = AnonymousClass6VZ.A00(r5);
                                continue;
                            } while (r4 != null);
                        }
                        if (A032 == r7) {
                            break;
                        }
                        A032 = A032.A02;
                    }
                }
                C137846gp r1 = this.A0G;
                C161327mZ r02 = r1.A09;
                if (r02 != null) {
                    r02.BZb(r1);
                }
            }
            Map map = this.A0F;
            if ((map != null && !map.isEmpty()) || (!r9.B8T().isEmpty())) {
                Map B8T = r9.B8T();
                if (!AnonymousClass00C.A0J(B8T, this.A0F)) {
                    this.A0G.A0P.A0G.A0K.A02();
                    Map map2 = this.A0F;
                    if (map2 == null) {
                        map2 = C36431kI.A1G();
                        this.A0F = map2;
                    }
                    map2.clear();
                    map2.putAll(B8T);
                }
            }
        }
    }

    public void A0Y(AnonymousClass76X r27, C160297km r28, long j, boolean z, boolean z2) {
        C160297km r14;
        boolean z3;
        C1496172a A0B2;
        boolean z4 = z2;
        C160297km r3 = r28;
        AnonymousClass76X r13 = r27;
        long j2 = j;
        boolean z5 = z;
        if (this instanceof C94944jW) {
            C137846gp r6 = this.A0G;
            int i = ((AnonymousClass6HD) r3).A00;
            if (i == 0 || (A0B2 = r6.A0B()) == null || !A0B2.A00) {
                if (!A0c(j2)) {
                    if (z) {
                        float A0I2 = A0I(j2, this.A08.Bvs(r6.A0A.BEJ()));
                        if (!Float.isInfinite(A0I2) && !Float.isNaN(A0I2)) {
                            z4 = false;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int i2 = r13.A00;
                C1506776e A082 = r6.A08();
                int i3 = A082.A00;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr = A082.A01;
                    loop0:
                    do {
                        C137846gp r2 = (C137846gp) objArr[i4];
                        if (r2.A0P.A0G.A0C) {
                            AnonymousClass6XQ r9 = r2.A0R;
                            long A0J2 = r9.A04.A0J(j2);
                            C94894iy r12 = r9.A04;
                            if (i != 0) {
                                r14 = A0M;
                                z3 = true;
                            } else {
                                r14 = A0L;
                                z3 = z5;
                            }
                            r12.A0Z(r13, r14, A0J2, z3, z4);
                            long A002 = AnonymousClass76X.A00(r13);
                            if (C90464aC.A01(A002) < 0.0f && C90474aD.A03(A002) != 0) {
                                C137856gq A032 = A03(r2.A0R.A04, false);
                                if (A032 == null || !A032.A08) {
                                    break;
                                }
                                C137856gq r122 = A032.A03;
                                if (r122.A08) {
                                    if ((r122.A00 & 16) == 0) {
                                        break;
                                    }
                                    while (true) {
                                        r122 = r122.A02;
                                        if (r122 == null) {
                                            break loop0;
                                        } else if ((r122.A01 & 16) != 0) {
                                            C1506776e r11 = null;
                                            C137856gq r10 = r122;
                                            do {
                                                if (r10 instanceof C161847nZ) {
                                                    if (((C161847nZ) r10).Bst()) {
                                                        r13.A00 = r13.size() - 1;
                                                        break;
                                                    }
                                                } else if ((r10.A01 & 16) != 0 && (r10 instanceof C94114hf)) {
                                                    int i5 = 0;
                                                    for (C137856gq r92 = ((C94114hf) r10).A00; r92 != null; r92 = r92.A02) {
                                                        if ((r92.A01 & 16) != 0) {
                                                            i5++;
                                                            if (i5 == 1) {
                                                                r10 = r92;
                                                            } else {
                                                                r11 = C90464aC.A0G(r11);
                                                                r10 = C90524aI.A0D(r11, r10);
                                                                r11.A0D(r92);
                                                            }
                                                        }
                                                    }
                                                    if (i5 == 1) {
                                                        continue;
                                                    }
                                                }
                                                r10 = AnonymousClass6VZ.A00(r11);
                                                continue;
                                            } while (r10 != null);
                                        }
                                    }
                                } else {
                                    throw AnonymousClass001.A09("visitLocalDescendants called on an unattached node");
                                }
                            }
                        }
                        i4--;
                    } while (i4 >= 0);
                }
                r13.A00 = i2;
                return;
            }
            return;
        }
        C94894iy r22 = this.A05;
        if (r22 != null) {
            r22.A0Z(r13, r3, r22.A0J(j2), z5, z4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r4 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (X.C109215Ws.A00(X.AnonymousClass76X.A00(r5), X.C90474aD.A0C((long) java.lang.Float.floatToIntBits(r8), X.C90474aD.A09(r12 ? 1 : 0))) > 0) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z(X.AnonymousClass76X r23, X.C160297km r24, long r25, boolean r27, boolean r28) {
        /*
            r22 = this;
            r6 = r24
            r12 = r28
            int r2 = r6.B6i()
            r0 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r7 = r22
            X.6gq r1 = r7.A0M()
            if (r0 != 0) goto L_0x00b0
            X.6gq r1 = r1.A04
            if (r1 != 0) goto L_0x00b0
        L_0x001b:
            r4 = 0
        L_0x001c:
            r9 = r25
            boolean r0 = r7.A0c(r9)
            r5 = r23
            r11 = r27
            if (r0 != 0) goto L_0x0074
            if (r27 == 0) goto L_0x0073
            X.7ni r2 = r7.A08
            X.6gp r0 = r7.A0G
            X.7k5 r0 = r0.A0A
            long r0 = r0.BEJ()
            long r0 = r2.Bvs(r0)
            float r8 = r7.A0I(r9, r0)
            boolean r0 = java.lang.Float.isInfinite(r8)
            if (r0 != 0) goto L_0x0073
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x0073
            int r1 = r5.A00
            int r0 = r5.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0067
            int r0 = java.lang.Float.floatToIntBits(r8)
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            r0 = 0
            long r0 = r0 | r2
            long r2 = X.AnonymousClass76X.A00(r5)
            int r0 = X.C109215Ws.A00(r2, r0)
            if (r0 <= 0) goto L_0x0073
        L_0x0067:
            r12 = 0
            if (r4 != 0) goto L_0x00f6
        L_0x006a:
            r0 = r7
            r1 = r5
            r2 = r6
            r3 = r9
            r5 = r11
            r6 = r12
            r0.A0Y(r1, r2, r3, r5, r6)
        L_0x0073:
            return
        L_0x0074:
            if (r4 == 0) goto L_0x006a
            float r3 = X.C133206Xf.A00(r9)
            float r2 = X.C133206Xf.A01(r9)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            int r0 = r7.A0C()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c5
            int r0 = r7.A0B()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c5
            X.7Ou r13 = new X.7Ou
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r9
            r20 = r11
            r21 = r12
            r13.<init>(r14, r15, r16, r17, r18, r20, r21)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.A02(r4, r13, r0, r12)
            return
        L_0x00b0:
            X.6gq r4 = A03(r7, r0)
        L_0x00b4:
            if (r4 == 0) goto L_0x001b
            int r0 = r4.A00
            r0 = r0 & r2
            if (r0 == 0) goto L_0x001b
            int r0 = r4.A01
            r0 = r0 & r2
            if (r0 != 0) goto L_0x001c
            if (r4 == r1) goto L_0x001b
            X.6gq r4 = r4.A02
            goto L_0x00b4
        L_0x00c5:
            if (r27 != 0) goto L_0x00ff
            r8 = 2139095040(0x7f800000, float:Infinity)
        L_0x00c9:
            boolean r0 = java.lang.Float.isInfinite(r8)
            if (r0 != 0) goto L_0x0112
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x0112
            int r1 = r5.A00
            int r0 = r5.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x00f6
            int r0 = java.lang.Float.floatToIntBits(r8)
            long r2 = (long) r0
            long r0 = X.C90474aD.A09(r12)
            long r2 = X.C90474aD.A0C(r2, r0)
            long r0 = X.AnonymousClass76X.A00(r5)
            int r0 = X.C109215Ws.A00(r0, r2)
            if (r0 <= 0) goto L_0x0112
        L_0x00f6:
            X.7P0 r3 = new X.7P0
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12)
            r5.A02(r4, r3, r8, r12)
            return
        L_0x00ff:
            X.7ni r2 = r7.A08
            X.6gp r0 = r7.A0G
            X.7k5 r0 = r0.A0A
            long r0 = r0.BEJ()
            long r0 = r2.Bvs(r0)
            float r8 = r7.A0I(r9, r0)
            goto L_0x00c9
        L_0x0112:
            A04(r4, r5, r6, r7, r8, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94894iy.A0Z(X.76X, X.7km, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5.A0E != r3.A0C) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(X.C006302t r6, boolean r7) {
        /*
            r5 = this;
            X.6gp r3 = r5.A0G
            r2 = 0
            if (r7 != 0) goto L_0x001a
            X.02t r0 = r5.A09
            if (r0 != r6) goto L_0x001a
            X.7ni r1 = r5.A08
            X.7ni r0 = r3.A0B
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x001a
            X.5RW r1 = r5.A0E
            X.5RW r0 = r3.A0C
            r4 = 0
            if (r1 == r0) goto L_0x001b
        L_0x001a:
            r4 = 1
        L_0x001b:
            r5.A09 = r6
            X.7ni r0 = r3.A0B
            r5.A08 = r0
            X.5RW r0 = r3.A0C
            r5.A0E = r0
            X.7mZ r0 = r3.A09
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            if (r6 == 0) goto L_0x005d
            X.7ls r0 = r5.A07
            if (r0 != 0) goto L_0x0056
            X.7mZ r1 = X.C129586Hq.A00(r3)
            X.02t r0 = r5.A0I
            X.00S r4 = r5.A0H
            X.7ls r2 = r1.B4d(r4, r0)
            long r0 = r5.A03
            r2.Boc(r0)
            long r0 = r5.A01
            r2.BPx(r0)
            r5.A07 = r2
            r0 = 1
            A08(r5, r0)
            r3.A0G = r0
            r4.invoke()
        L_0x0055:
            return
        L_0x0056:
            if (r4 == 0) goto L_0x0055
            r0 = 1
            A08(r5, r0)
            return
        L_0x005d:
            X.7ls r0 = r5.A07
            if (r0 == 0) goto L_0x007b
            r0.destroy()
            r0 = 1
            r3.A0G = r0
            X.00S r0 = r5.A0H
            r0.invoke()
            X.6gq r0 = r5.A0M()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x007b
            X.7mZ r0 = r3.A09
            if (r0 == 0) goto L_0x007b
            r0.BZb(r3)
        L_0x007b:
            r5.A07 = r1
            r5.A0B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94894iy.A0a(X.02t, boolean):void");
    }

    public final boolean A0b() {
        if (this.A07 != null && this.A0D <= 0.0f) {
            return true;
        }
        C94894iy r0 = this.A06;
        if (r0 != null) {
            return r0.A0b();
        }
        return false;
    }

    public float BAy() {
        return this.A0G.A0B.BAy();
    }

    public float BC0() {
        return this.A0G.A0B.BC0();
    }

    public boolean BNc() {
        if (this.A07 == null || this.A0C || this.A0G.A09 == null) {
            return false;
        }
        return true;
    }

    public long BOR(C160787la r5, long j) {
        if (r5 instanceof C137606gQ) {
            long BOR = r5.BOR(this, C90464aC.A0B(-C133206Xf.A00(j), -C133206Xf.A01(j)));
            return C90464aC.A0B(-C133206Xf.A00(BOR), -C133206Xf.A01(BOR));
        }
        AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        C94894iy r52 = (C94894iy) r5;
        r52.A0Q();
        C94894iy A0O2 = A0O(r52);
        while (r52 != A0O2) {
            j = r52.A0K(j);
            r52 = r52.A06;
            AnonymousClass00C.A0B(r52);
        }
        return A02(A0O2, j);
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A0G.A0C;
    }

    public C94894iy(C137846gp r3) {
        this.A0G = r3;
        this.A08 = r3.A0B;
        this.A0E = r3.A0C;
    }

    public final float A0I(long j, long j2) {
        float A0C2;
        float A0B2;
        if (((float) A0C()) < AnonymousClass6X0.A01(j2) || ((float) A0B()) < AnonymousClass6X0.A00(j2)) {
            long A0L2 = A0L(j2);
            float A012 = AnonymousClass6X0.A01(A0L2);
            float A002 = AnonymousClass6X0.A00(A0L2);
            float A003 = C133206Xf.A00(j);
            if (A003 < 0.0f) {
                A0C2 = -A003;
            } else {
                A0C2 = A003 - ((float) A0C());
            }
            float max = Math.max(0.0f, A0C2);
            float A013 = C133206Xf.A01(j);
            if (A013 < 0.0f) {
                A0B2 = -A013;
            } else {
                A0B2 = A013 - ((float) A0B());
            }
            long A0B3 = C90464aC.A0B(max, Math.max(0.0f, A0B2));
            if ((A012 > 0.0f || A002 > 0.0f) && C133206Xf.A00(A0B3) <= A012 && C133206Xf.A01(A0B3) <= A002) {
                return (C133206Xf.A00(A0B3) * C133206Xf.A00(A0B3)) + (C133206Xf.A01(A0B3) * C133206Xf.A01(A0B3));
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long A0L(long j) {
        return C90464aC.A0B(Math.max(0.0f, (AnonymousClass6X0.A01(j) - ((float) A0C())) / 2.0f), Math.max(0.0f, (AnonymousClass6X0.A00(j) - ((float) A0B())) / 2.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0c(long r5) {
        /*
            r4 = this;
            float r1 = X.C133206Xf.A00(r5)
            boolean r0 = java.lang.Float.isInfinite(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0034
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0034
            float r1 = X.C133206Xf.A01(r5)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L_0x0034
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0034
        L_0x0021:
            r2 = 0
            if (r3 == 0) goto L_0x0033
            X.7ls r1 = r4.A07
            if (r1 == 0) goto L_0x0032
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0032
            boolean r0 = r1.BLx(r5)
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            return r2
        L_0x0034:
            r3 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94894iy.A0c(long):boolean");
    }

    public final C160787la BF7() {
        if (A0M().A08) {
            A0Q();
            return this.A0G.A0R.A04.A06;
        }
        throw AnonymousClass001.A09("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final long BHd() {
        return this.A03;
    }

    public boolean BLA() {
        return A0M().A08;
    }

    public AnonymousClass6QC BOQ(C160787la r8, boolean z) {
        C94894iy r3;
        C137606gQ r0;
        if (!A0M().A08) {
            throw AnonymousClass001.A09("LayoutCoordinate operations are only valid when isAttached is true");
        } else if (r8.BLA()) {
            if (!(r8 instanceof C137606gQ) || (r0 = (C137606gQ) r8) == null || (r3 = r0.A00.A04) == null) {
                r3 = (C94894iy) r8;
            }
            r3.A0Q();
            C94894iy A0O2 = A0O(r3);
            AnonymousClass675 r4 = this.A02;
            if (r4 == null) {
                r4 = new AnonymousClass675();
                this.A02 = r4;
            }
            r4.A01 = 0.0f;
            r4.A03 = 0.0f;
            long BHd = r8.BHd();
            r4.A02 = (float) C90494aF.A08(BHd);
            r4.A00 = (float) C90474aD.A03(BHd);
            while (r3 != A0O2) {
                r3.A0T(r4, z, false);
                if (r4.A01 >= r4.A02 || r4.A03 >= r4.A00) {
                    return AnonymousClass6QC.A04;
                }
                r3 = r3.A06;
                AnonymousClass00C.A0B(r3);
            }
            A05(r4, A0O2, z);
            return new AnonymousClass6QC(r4.A01, r4.A03, r4.A02, r4.A00);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LayoutCoordinates ");
            A0u.append(r8);
            throw AnonymousClass000.A0g(" is not attached!", A0u);
        }
    }

    public long BOS(long j) {
        if (A0M().A08) {
            A0Q();
            C94894iy r0 = this;
            do {
                j = r0.A0K(j);
                r0 = r0.A06;
            } while (r0 != null);
            return j;
        }
        throw AnonymousClass001.A09("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public long BOU(long j) {
        long BOS = BOS(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) C129586Hq.A00(this.A0G);
        AndroidComposeView.A0A(androidComposeView);
        return AnonymousClass6VX.A00(androidComposeView.A0n, BOS);
    }

    public void A0E(C006302t r1, float f, long j) {
        A07(this, r1, f, j);
    }
}
