package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6jV  reason: invalid class name and case insensitive filesystem */
public final class C139266jV implements AnonymousClass7eR {
    public C97624q0 A00;
    public float A01 = 21.0f;
    public float A02 = 2.0f;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public C158997ia A08;
    public AnonymousClass7eL A09;
    public AnonymousClass7eM A0A;
    public AnonymousClass7eN A0B;
    public AnonymousClass7eO A0C;
    public AnonymousClass7eP A0D;
    public C139206jP A0E;
    public C97614pz A0F;
    public C97664q4 A0G;
    public AnonymousClass6WW A0H;
    public AnonymousClass6WW A0I;
    public AnonymousClass6WW A0J;
    public AnonymousClass6WW A0K;
    public boolean A0L = false;
    public boolean A0M;
    public final int A0N;
    public final Context A0O;
    public final Matrix A0P = C90524aI.A0B();
    public final C92794ej A0Q;
    public final AnonymousClass6WY A0R;
    public final AnonymousClass63E A0S;
    public final C97814qJ A0T;
    public final AnonymousClass6NI A0U;
    public final ArrayList A0V = AnonymousClass001.A0I();
    public final List A0W = AnonymousClass001.A0I();
    public final float[] A0X = C90524aI.A0v();

    public final float A00() {
        return ((float) 0) + (((float) (this.A0Q.A0F - this.A06)) / 2.0f);
    }

    public final void A09(C1264964g r3) {
        A0A(r3, (C158997ia) null, 0);
    }

    public final float A01() {
        int i = this.A07;
        return ((float) i) + (((float) ((this.A0Q.A0E - i) - this.A05)) / 2.0f);
    }

    public final C134996bx A02() {
        float[] fArr = this.A0X;
        C92794ej r6 = this.A0Q;
        fArr[0] = r6.A06 - A00();
        fArr[1] = r6.A07 - A01();
        r6.A0f.mapVectors(fArr);
        double d = r6.A04;
        float f = fArr[0];
        float f2 = (float) r6.A0J;
        return new C134996bx(C134976bv.A00(AnonymousClass6WY.A02(r6.A05 - ((double) (fArr[1] / f2))), ((d - ((double) (f / f2))) * 360.0d) - 180.0d), r6.getZoom(), 0.0f, r6.A0C);
    }

    public void A03() {
        List list = this.A0W;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C139206jP r1 = (C139206jP) list.get(i);
            if (r1 instanceof C97654q3) {
                ((C97654q3) r1).A08();
            }
        }
    }

    public void A04() {
        if (this.A0A != null || !this.A0V.isEmpty()) {
            C134996bx A022 = A02();
            AnonymousClass7eM r0 = this.A0A;
            if (r0 != null) {
                r0.BSp(A022);
            }
            ArrayList arrayList = this.A0V;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass7eM) it.next()).BSp(A022);
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A0W.iterator();
        while (it.hasNext()) {
            int i = ((C139206jP) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0Q.invalidate();
    }

    public final void A06() {
        AnonymousClass6WW r0 = this.A0I;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass6WW r02 = this.A0J;
        if (r02 != null) {
            r02.A03();
        }
        AnonymousClass6WW r03 = this.A0K;
        if (r03 != null) {
            r03.A03();
        }
        AnonymousClass6WW r04 = this.A0H;
        if (r04 != null) {
            r04.A03();
        }
    }

    public final void A07(int i, int i2, int i3) {
        C92794ej r8 = this.A0Q;
        double d = r8.A04;
        long j = r8.A0J << 1;
        r8.A0D(d + ((double) (((long) ((0 - this.A06) - (-i2))) / j)), r8.A05 + ((double) (((long) ((this.A07 - this.A05) - (i - i3))) / j)));
        this.A07 = i;
        this.A06 = i2;
        this.A05 = i3;
        r8.requestLayout();
        r8.invalidate();
    }

    public final void A08(C1264964g r3) {
        A0A(r3, (C158997ia) null, 1500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C1264964g r21, X.C158997ia r22, int r23) {
        /*
            r20 = this;
            r7 = r20
            X.4ej r6 = r7.A0Q
            boolean r0 = r6.A0Y
            if (r0 != 0) goto L_0x010d
            r3 = 1
            r12 = r23
            if (r23 == 0) goto L_0x0018
            X.4qJ r0 = r7.A0T
            r2 = -1
            X.6TZ r1 = r0.A09
            int r0 = r1.A03
            if (r0 != r2) goto L_0x0018
            r1.A03 = r3
        L_0x0018:
            r7.A06()
            r7.A0L = r3
            float r14 = r7.A00()
            float r13 = r7.A01()
            float r2 = r6.getZoom()
            r7.A03 = r14
            r7.A04 = r13
            r4 = r21
            float r1 = r4.A01
            r5 = 0
            r19 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01ac
            r2 = r1
        L_0x0039:
            float r1 = r7.A02
            float r0 = r7.A01
            float r0 = java.lang.Math.min(r0, r2)
            float r9 = java.lang.Math.max(r1, r0)
            double r0 = r6.A04
            double r2 = r6.A05
            X.6bv r8 = r4.A06
            r16 = 0
            if (r8 != 0) goto L_0x0057
            X.6c5 r8 = r4.A07
            if (r8 == 0) goto L_0x00a0
            X.6bv r8 = r8.A00()
        L_0x0057:
            double r0 = r8.A01
            double r0 = X.AnonymousClass6WY.A01(r0)
            double r2 = r8.A00
            double r2 = X.AnonymousClass6WY.A00(r2)
            float[] r15 = r7.A0X
            float r8 = r6.A06
            float r8 = r8 - r14
            r15[r5] = r8
            float r11 = r6.A07
            float r11 = r11 - r13
            r10 = 1
            r15[r10] = r11
            r8 = r15[r5]
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x007a
            int r8 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x00a0
        L_0x007a:
            int r8 = (int) r9
            int r10 = r10 << r8
            int r8 = r7.A0N
            int r10 = r10 * r8
            r11 = 1065353216(0x3f800000, float:1.0)
            float r8 = r9 % r11
            float r8 = r8 + r11
            android.graphics.Matrix r11 = r7.A0P
            r11.setScale(r8, r8)
            float r8 = r6.A0C
            r11.postRotate(r8)
            r11.invert(r11)
            r11.mapVectors(r15)
            r5 = r15[r5]
            float r8 = (float) r10
            float r5 = r5 / r8
            double r10 = (double) r5
            double r0 = r0 + r10
            r5 = 1
            r5 = r15[r5]
            float r5 = r5 / r8
            double r10 = (double) r5
            double r2 = r2 + r10
        L_0x00a0:
            float r8 = r6.A0C
            float r10 = r4.A00
            int r4 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x00b5
            r11 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r11
            float r4 = r8 - r10
            r5 = 1127481344(0x43340000, float:180.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x019f
            float r8 = r11 + r10
        L_0x00b5:
            double r4 = X.C92794ej.A00(r0)
            int r0 = (int) r9
            r1 = 1
            int r1 = r1 << r0
            int r0 = r7.A0N
            int r1 = r1 * r0
            long r0 = (long) r1
            double r2 = r6.A0B(r2, r0)
            r10 = r22
            if (r23 > 0) goto L_0x010e
            float r0 = r6.getZoom()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            float r1 = r7.A03
            float r0 = r7.A04
            r6.A0I(r9, r1, r0)
        L_0x00d7:
            double r0 = r6.A04
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00e3
            double r0 = r6.A05
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e6
        L_0x00e3:
            r6.A0D(r4, r2)
        L_0x00e6:
            float r0 = r6.A0C
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            r6.A0E(r8, r14, r13)
        L_0x00ef:
            r6.invalidate()
            r7.A04()
        L_0x00f5:
            X.6WW r0 = r7.A0I
            if (r0 != 0) goto L_0x010d
            X.6WW r0 = r7.A0J
            if (r0 != 0) goto L_0x010d
            X.6WW r0 = r7.A0K
            if (r0 != 0) goto L_0x010d
            X.6WW r0 = r7.A0H
            if (r0 != 0) goto L_0x010d
            if (r22 == 0) goto L_0x010d
            r0 = 0
            r7.A08 = r0
            r10.BY0()
        L_0x010d:
            return
        L_0x010e:
            r7.A08 = r10
            float r1 = r6.getZoom()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
            X.6WW r9 = X.AnonymousClass6WW.A00(r1, r9)
            r7.A0K = r9
            r9.A07(r7)
            r9.A08(r7)
            long r0 = (long) r12
            r9.A06(r0)
        L_0x0128:
            double r0 = r6.A04
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x014b
            double r17 = r4 - r0
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0197
            double r4 = r4 - r15
        L_0x0139:
            float r9 = (float) r0
            float r0 = (float) r4
            X.6WW r4 = X.AnonymousClass6WW.A00(r9, r0)
            r7.A0I = r4
            r4.A07(r7)
            r4.A08(r7)
            long r0 = (long) r12
            r4.A06(r0)
        L_0x014b:
            double r0 = r6.A05
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0163
            float r4 = (float) r0
            float r0 = (float) r2
            X.6WW r2 = X.AnonymousClass6WW.A00(r4, r0)
            r7.A0J = r2
            r2.A07(r7)
            r2.A08(r7)
            long r0 = (long) r12
            r2.A06(r0)
        L_0x0163:
            float r1 = r6.A0C
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            X.6WW r2 = X.AnonymousClass6WW.A00(r1, r8)
            r7.A0H = r2
            r2.A07(r7)
            r2.A08(r7)
            long r0 = (long) r12
            r2.A06(r0)
        L_0x0179:
            X.6WW r0 = r7.A0I
            if (r0 == 0) goto L_0x0180
            r0.A05()
        L_0x0180:
            X.6WW r0 = r7.A0J
            if (r0 == 0) goto L_0x0187
            r0.A05()
        L_0x0187:
            X.6WW r0 = r7.A0K
            if (r0 == 0) goto L_0x018e
            r0.A05()
        L_0x018e:
            X.6WW r0 = r7.A0H
            if (r0 == 0) goto L_0x00f5
            r0.A05()
            goto L_0x00f5
        L_0x0197:
            r13 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x0139
            double r4 = r4 + r15
            goto L_0x0139
        L_0x019f:
            float r4 = r10 - r8
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a9
            float r8 = r10 - r11
            goto L_0x00b5
        L_0x01a9:
            r8 = r10
            goto L_0x00b5
        L_0x01ac:
            float r1 = r4.A02
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01c7
            float r2 = r2 + r1
            float r1 = r4.A03
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01bf
            float r0 = r4.A04
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
        L_0x01bf:
            r7.A03 = r1
            float r0 = r4.A04
            r7.A04 = r0
            goto L_0x0039
        L_0x01c7:
            X.6c5 r10 = r4.A07
            if (r10 == 0) goto L_0x0039
            int r3 = r6.A0F
            int r0 = r7.A06
            int r3 = r3 - r0
            int r2 = r6.A0E
            int r0 = r7.A07
            int r2 = r2 - r0
            int r0 = r7.A05
            int r2 = r2 - r0
            if (r3 != 0) goto L_0x01e3
            if (r2 != 0) goto L_0x01e3
            java.lang.String r0 = "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01e3:
            int r0 = r4.A05
            int r1 = r0 * 2
            int r0 = r3 + r1
            if (r0 <= r3) goto L_0x01ec
            int r3 = r3 - r1
        L_0x01ec:
            int r0 = r2 + r1
            if (r0 <= r2) goto L_0x01f1
            int r2 = r2 - r1
        L_0x01f1:
            int r9 = java.lang.Math.max(r5, r3)
            int r11 = java.lang.Math.max(r5, r2)
            X.6bv r8 = r10.A00
            double r0 = r8.A01
            double r2 = X.AnonymousClass6WY.A01(r0)
            X.6bv r10 = r10.A01
            double r0 = r10.A01
            double r0 = X.AnonymousClass6WY.A01(r0)
            double r17 = X.C90504aG.A00(r2, r0)
            double r0 = r10.A00
            double r2 = X.AnonymousClass6WY.A00(r0)
            double r0 = r8.A00
            double r0 = X.AnonymousClass6WY.A00(r0)
            double r15 = X.C90504aG.A00(r2, r0)
            double r0 = (double) r9
            double r0 = r0 / r17
            int r2 = r7.A0N
            double r2 = (double) r2
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r9 = X.C92794ej.A0n
            double r0 = r0 / r9
            float r8 = (float) r0
            double r0 = (double) r11
            double r0 = r0 / r15
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r9
            float r2 = (float) r0
            float r2 = java.lang.Math.min(r8, r2)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139266jV.A0A(X.64g, X.7ia, int):void");
    }

    public final void A0B(C139206jP r3) {
        List list = this.A0W;
        int binarySearch = Collections.binarySearch(list, r3, C139206jP.A0E);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, r3);
            r3.A04();
            this.A0Q.invalidate();
        }
    }

    public final void A0C(C139206jP r2) {
        this.A0W.remove(r2);
        this.A0Q.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.AnonymousClass00F.A01(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0O
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.AnonymousClass00F.A01(r1, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.AnonymousClass00F.A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A0M = r0
            r3 = r3 & r0
            X.6NI r0 = r2.A0U
            r0.A01(r3)
            if (r3 == 0) goto L_0x003d
            X.4q4 r0 = r2.A0G
            if (r0 != 0) goto L_0x0037
            X.4q4 r0 = new X.4q4
            r0.<init>(r2)
            r2.A0G = r0
            r2.A0B(r0)
            X.4q4 r0 = r2.A0G
            X.6WW r1 = r0.A04
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0037
            r1.A05()
        L_0x0037:
            X.63E r0 = r2.A0S
            r0.A00()
            return
        L_0x003d:
            X.4q4 r1 = r2.A0G
            if (r1 == 0) goto L_0x0037
            X.6WW r0 = r1.A04
            r0.A03()
            r1.A03()
            X.4q4 r0 = r2.A0G
            r2.A0C(r0)
            r0 = 0
            r2.A0G = r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139266jV.A0D(boolean):void");
    }

    public void BRA(AnonymousClass6WW r7) {
        C92794ej r3;
        double d;
        double d2;
        AnonymousClass6WW r0 = this.A0I;
        if (r7 == r0) {
            r3 = this.A0Q;
            d = (double) r0.A00;
            d2 = r3.A05;
        } else {
            AnonymousClass6WW r02 = this.A0J;
            if (r7 == r02) {
                r3 = this.A0Q;
                d = r3.A04;
                d2 = (double) r02.A00;
            } else {
                if (r7 == this.A0K) {
                    r3 = this.A0Q;
                    if (r3.A0I(r7.A00, this.A03, this.A04)) {
                        r3.A0M.A04();
                    }
                } else if (r7 == this.A0H) {
                    r3 = this.A0Q;
                    r3.A0E(r7.A00, A00(), A01());
                } else {
                    return;
                }
                r3.invalidate();
            }
        }
        r3.A0D(d, d2);
        r3.invalidate();
    }

    public C139266jV(C124515yJ r6, C92794ej r7) {
        PorterDuffColorFilter porterDuffColorFilter;
        String str;
        this.A0Q = r7;
        Context applicationContext = r7.getContext().getApplicationContext();
        this.A0O = applicationContext;
        this.A0R = new AnonymousClass6WY(this);
        AnonymousClass63E r4 = new AnonymousClass63E(this);
        this.A0S = r4;
        AnonymousClass5Y9.A00(applicationContext);
        int i = AnonymousClass000.A0X(applicationContext).densityDpi >= 320 ? 512 : 256;
        this.A0N = i;
        C97814qJ r2 = new C97814qJ(this, new C97694q7(applicationContext, r6, i));
        A0B(r2);
        this.A0T = r2;
        AnonymousClass6NI r3 = new AnonymousClass6NI(r7.getContext());
        this.A0U = r3;
        C114605hW r1 = new C114605hW(this);
        r3.A01 = r1;
        if (r3.A00 != null && r3.A03) {
            r1.A00.A0Q.invalidate();
        }
        if (r6 != null) {
            boolean z = r6.A05;
            C139266jV r12 = r4.A00;
            C97614pz r0 = r12.A0F;
            if (z) {
                if (r0 == null) {
                    C97614pz r02 = new C97614pz(r12);
                    r12.A0F = r02;
                    r12.A0B(r02);
                }
            } else if (r0 != null) {
                r12.A0C(r0);
                r12.A0F = null;
            }
            r4.A02 = r6.A07;
            r4.A03 = r6.A08;
            this.A01 = Math.min(Math.max(21.0f, 2.0f), 21.0f);
            this.A02 = Math.min(Math.max(2.0f, 2.0f), 21.0f);
            int i2 = r6.A00;
            if (i2 != r2.A00) {
                r2.A00 = i2;
                if (!r2.A04) {
                    r2.A05(true);
                }
                C97694q7 r13 = r2.A03;
                switch (i2) {
                    case 5:
                        str = "live_maps";
                        break;
                    case 6:
                        str = "crowdsourcing_osm";
                        break;
                    case 7:
                        str = "indoor_osm";
                        break;
                    case 8:
                        if (!r13.A03.A06) {
                            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                            break;
                        } else {
                            str = "whatsapp_dark";
                            break;
                        }
                    default:
                        if (!r13.A03.A06) {
                            str = null;
                            break;
                        } else {
                            str = "dark";
                            break;
                        }
                }
                r13.A01 = str;
                C139266jV r03 = r2.A07;
                r03.A03();
                r03.A0Q.invalidate();
            }
            boolean z2 = r6.A06;
            Paint paint = r2.A02;
            if (z2) {
                porterDuffColorFilter = C97814qJ.A05;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    C97814qJ.A05 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }
}
