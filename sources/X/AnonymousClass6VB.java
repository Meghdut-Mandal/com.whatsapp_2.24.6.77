package X;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: X.6VB  reason: invalid class name */
public final class AnonymousClass6VB {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public C161177mK A04;
    public C161177mK A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public AnonymousClass6PW A09;
    public C109065Wd A0A;
    public C161177mK A0B;
    public C157657dt A0C;
    public C161937ni A0D;
    public AnonymousClass5RW A0E;
    public boolean A0F;
    public final Outline A0G;

    public static final boolean A01(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        long j2 = AnonymousClass6RD.A00;
        float A012 = C90464aC.A01(j);
        float A002 = C90464aC.A00(j);
        return C90484aE.A1Q(((((f5 * f5) / (A012 * A012)) + ((f6 * f6) / (A002 * A002))) > 1.0f ? 1 : ((((f5 * f5) / (A012 * A012)) + ((f6 * f6) / (A002 * A002))) == 1.0f ? 0 : -1)));
    }

    public static final void A00(AnonymousClass6VB r11) {
        if (r11.A06) {
            r11.A02 = C133206Xf.A03;
            long j = r11.A03;
            r11.A01 = j;
            r11.A00 = 0.0f;
            r11.A05 = null;
            r11.A06 = false;
            r11.A08 = false;
            if (!r11.A0F || AnonymousClass6X0.A01(j) <= 0.0f || AnonymousClass6X0.A00(j) <= 0.0f) {
                r11.A0G.setEmpty();
                return;
            }
            r11.A07 = true;
            C109065Wd B4p = r11.A0C.B4p(r11.A0D, r11.A0E, j);
            r11.A0A = B4p;
            if (B4p instanceof C94504iK) {
                AnonymousClass6QC r4 = ((C94504iK) B4p).A00;
                float f = r4.A01;
                float f2 = r4.A03;
                r11.A02 = C90464aC.A0B(f, f2);
                float f3 = r4.A02;
                float f4 = r4.A00;
                r11.A01 = C90464aC.A0B(f3 - f, f4 - f2);
                r11.A0G.setRect(C14960mT.A01(f), C14960mT.A01(f2), C14960mT.A01(f3), C14960mT.A01(f4));
            } else if (B4p instanceof C94514iL) {
                AnonymousClass6PW r5 = ((C94514iL) B4p).A00;
                long j2 = r5.A06;
                long j3 = AnonymousClass6RD.A00;
                float A012 = C90464aC.A01(j2);
                float f5 = r5.A01;
                float f6 = r5.A03;
                r11.A02 = C90464aC.A0B(f5, f6);
                float f7 = r5.A02;
                float f8 = r5.A00;
                r11.A01 = C90464aC.A0B(f7 - f5, f8 - f6);
                if (A02(r5)) {
                    r11.A0G.setRoundRect(C14960mT.A01(f5), C14960mT.A01(f6), C14960mT.A01(f7), C14960mT.A01(f8), A012);
                    r11.A00 = A012;
                    return;
                }
                C161177mK r42 = r11.A04;
                if (r42 == null) {
                    r42 = new C137426g7((Path) null, (C05250Oz) null, 1);
                    r11.A04 = r42;
                }
                Path path = ((C137426g7) r42).A02;
                path.reset();
                r42.B0k(r5);
                if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
                    Outline outline = r11.A0G;
                    if (r42 instanceof C137426g7) {
                        outline.setConvexPath(path);
                        r11.A08 = !outline.canClip();
                    } else {
                        throw AnonymousClass001.A0E("Unable to obtain android.graphics.Path");
                    }
                } else {
                    r11.A07 = false;
                    r11.A0G.setEmpty();
                    r11.A08 = true;
                }
                r11.A05 = r42;
            }
        }
    }

    public static final boolean A02(AnonymousClass6PW r5) {
        long j = r5.A06;
        long j2 = AnonymousClass6RD.A00;
        float A032 = C90494aF.A03(j);
        if (A032 != C90464aC.A00(j)) {
            return false;
        }
        long j3 = r5.A07;
        if (A032 != C90494aF.A03(j3) || A032 != C90464aC.A00(j3)) {
            return false;
        }
        long j4 = r5.A05;
        if (A032 != C90494aF.A03(j4) || A032 != C90464aC.A00(j4)) {
            return false;
        }
        long j5 = r5.A04;
        if (A032 == C90494aF.A03(j5) && A032 == C90464aC.A00(j5)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (X.C90464aC.A01(r2) == r7) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C161047m3 r22) {
        /*
            r21 = this;
            r4 = r21
            A00(r4)
            X.7mK r1 = r4.A05
            r5 = r22
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r5.B2w(r1, r0)
            return
        L_0x0010:
            float r7 = r4.A00
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            X.7mK r6 = r4.A0B
            X.6PW r11 = r4.A09
            if (r6 == 0) goto L_0x0067
            long r2 = r4.A02
            long r0 = r4.A01
            if (r11 == 0) goto L_0x0067
            boolean r8 = A02(r11)
            if (r8 == 0) goto L_0x0067
            float r9 = r11.A01
            float r8 = X.C133206Xf.A00(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0067
            float r9 = r11.A03
            float r8 = X.C133206Xf.A01(r2)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0067
            float r10 = r11.A02
            float r9 = X.C133206Xf.A00(r2)
            float r8 = X.AnonymousClass6X0.A01(r0)
            float r9 = r9 + r8
            int r8 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0067
            float r8 = r11.A00
            float r0 = X.C90504aG.A03(r2, r0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            long r2 = r11.A06
            long r0 = X.AnonymousClass6RD.A00
            float r0 = X.C90464aC.A01(r2)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
        L_0x0062:
            r0 = 1
            r5.B2w(r6, r0)
            return
        L_0x0067:
            long r2 = r4.A02
            float r9 = X.C133206Xf.A00(r2)
            float r10 = X.C133206Xf.A01(r2)
            float r11 = X.C133206Xf.A00(r2)
            long r0 = r4.A01
            float r8 = X.AnonymousClass6X0.A01(r0)
            float r11 = r11 + r8
            float r12 = X.C90504aG.A03(r2, r0)
            long r2 = X.C90464aC.A0B(r7, r7)
            long r0 = X.AnonymousClass6RD.A00
            float r1 = X.C90464aC.A01(r2)
            float r0 = X.C90464aC.A00(r2)
            long r13 = X.C90464aC.A0B(r1, r0)
            X.6PW r8 = new X.6PW
            r17 = r13
            r19 = r13
            r15 = r13
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r19)
            if (r6 != 0) goto L_0x00ad
            r1 = 0
            r0 = 1
            X.6g7 r6 = new X.6g7
            r6.<init>(r1, r1, r0)
        L_0x00a5:
            r6.B0k(r8)
            r4.A09 = r8
            r4.A0B = r6
            goto L_0x0062
        L_0x00ad:
            r0 = r6
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r0 = r0.A02
            r0.reset()
            goto L_0x00a5
        L_0x00b6:
            long r0 = r4.A02
            float r6 = X.C133206Xf.A00(r0)
            float r7 = X.C133206Xf.A01(r0)
            float r8 = X.C133206Xf.A00(r0)
            long r2 = r4.A01
            float r4 = X.AnonymousClass6X0.A01(r2)
            float r8 = r8 + r4
            float r9 = X.C90504aG.A03(r0, r2)
            r10 = 1
            r5.B2x(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VB.A04(X.7m3):void");
    }

    public final boolean A05(long j) {
        C109065Wd r1;
        if (!this.A0F || (r1 = this.A0A) == null) {
            return true;
        }
        float A002 = C133206Xf.A00(j);
        float A012 = C133206Xf.A01(j);
        if (r1 instanceof C94504iK) {
            AnonymousClass6QC r12 = ((C94504iK) r1).A00;
            if (r12.A01 > A002 || A002 >= r12.A02 || r12.A03 > A012 || A012 >= r12.A00) {
                return false;
            }
        } else if (r1 instanceof C94514iL) {
            AnonymousClass6PW r10 = ((C94514iL) r1).A00;
            float f = r10.A01;
            if (A002 < f) {
                return false;
            }
            float f2 = r10.A02;
            if (A002 >= f2) {
                return false;
            }
            float f3 = r10.A03;
            if (A012 < f3) {
                return false;
            }
            float f4 = r10.A00;
            if (A012 >= f4) {
                return false;
            }
            long j2 = r10.A06;
            long j3 = AnonymousClass6RD.A00;
            float A032 = C90494aF.A03(j2);
            long j4 = r10.A07;
            float A033 = C90494aF.A03(j4);
            float f5 = f2 - f;
            if (A032 + A033 <= f5) {
                long j5 = r10.A04;
                float A034 = C90494aF.A03(j5);
                long j6 = r10.A05;
                float A035 = C90494aF.A03(j6);
                if (A034 + A035 <= f5) {
                    float A003 = C90464aC.A00(j2);
                    float A004 = C90464aC.A00(j5);
                    float f6 = f4 - f3;
                    if (A003 + A004 <= f6) {
                        float A005 = C90464aC.A00(j4);
                        float A006 = C90464aC.A00(j6);
                        if (A005 + A006 <= f6) {
                            float f7 = A032 + f;
                            float f8 = A003 + f3;
                            float f9 = f2 - A033;
                            float f10 = A005 + f3;
                            float f11 = f2 - A035;
                            float f12 = f4 - A006;
                            float f13 = f4 - A004;
                            float f14 = A034 + f;
                            if (A002 < f7 && A012 < f8) {
                                return A01(A002, A012, f7, f8, j2);
                            }
                            if (A002 < f14 && A012 > f13) {
                                return A01(A002, A012, f14, f13, j5);
                            }
                            if (A002 > f9 && A012 < f10) {
                                return A01(A002, A012, f9, f10, j4);
                            }
                            if (A002 > f11 && A012 > f12) {
                                return A01(A002, A012, f11, f12, j6);
                            }
                        }
                    }
                }
            }
            C137426g7 r4 = new C137426g7((Path) null, (C05250Oz) null, 1);
            r4.B0k(r10);
            AnonymousClass6QC r13 = new AnonymousClass6QC(A002 - 0.005f, A012 - 0.005f, A002 + 0.005f, A012 + 0.005f);
            C137426g7 r5 = new C137426g7((Path) null, (C05250Oz) null, 1);
            float f15 = r13.A01;
            if (!Float.isNaN(f15)) {
                float f16 = r13.A03;
                if (!Float.isNaN(f16)) {
                    float f17 = r13.A02;
                    if (!Float.isNaN(f17)) {
                        float f18 = r13.A00;
                        if (!Float.isNaN(f18)) {
                            RectF rectF = r5.A00;
                            if (rectF == null) {
                                rectF = C36441kJ.A0N();
                                r5.A00 = rectF;
                            }
                            rectF.set(f15, f16, f17, f18);
                            Path path = r5.A02;
                            RectF rectF2 = r5.A00;
                            AnonymousClass00C.A0B(rectF2);
                            path.addRect(rectF2, Path.Direction.CCW);
                            C137426g7 r0 = new C137426g7((Path) null, (C05250Oz) null, 1);
                            Path.Op op = Path.Op.INTERSECT;
                            Path path2 = r0.A02;
                            path2.op(r4.A02, path, op);
                            boolean isEmpty = path2.isEmpty();
                            path2.reset();
                            path.reset();
                            return !isEmpty;
                        }
                        throw AnonymousClass001.A09("Rect.bottom is NaN");
                    }
                    throw AnonymousClass001.A09("Rect.right is NaN");
                }
                throw AnonymousClass001.A09("Rect.top is NaN");
            }
            throw AnonymousClass001.A09("Rect.left is NaN");
        } else {
            throw C36441kJ.A18();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r9 > 0.0f) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.C157657dt r5, X.C161937ni r6, X.AnonymousClass5RW r7, float r8, float r9, boolean r10) {
        /*
            r4 = this;
            android.graphics.Outline r0 = r4.A0G
            r0.setAlpha(r8)
            X.7dt r0 = r4.A0C
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            r3 = 1
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x0014
            r4.A0C = r5
            r4.A06 = r3
        L_0x0014:
            if (r10 != 0) goto L_0x001c
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            boolean r0 = r4.A0F
            if (r0 == r1) goto L_0x0025
            r4.A0F = r1
            r4.A06 = r3
        L_0x0025:
            X.5RW r0 = r4.A0E
            if (r0 == r7) goto L_0x002d
            r4.A0E = r7
            r4.A06 = r3
        L_0x002d:
            X.7ni r0 = r4.A0D
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x0039
            r4.A0D = r6
            r4.A06 = r3
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VB.A06(X.7dt, X.7ni, X.5RW, float, float, boolean):boolean");
    }

    public AnonymousClass6VB(C161937ni r5) {
        this.A0D = r5;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0G = outline;
        long j = AnonymousClass6X0.A02;
        this.A03 = j;
        this.A0C = C112355dl.A00;
        this.A02 = C133206Xf.A03;
        this.A01 = j;
        this.A0E = AnonymousClass5RW.Ltr;
    }

    public final Outline A03() {
        A00(this);
        if (!this.A0F || !this.A07) {
            return null;
        }
        return this.A0G;
    }
}
