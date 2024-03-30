package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1SX  reason: invalid class name */
public class AnonymousClass1SX {
    public AnonymousClass5N5 A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C20690y0 A02;
    public final C19630wG A03;
    public final C20060wx A04;
    public final C20810yC A05;
    public final C25521Gq A06;
    public final AnonymousClass1D5 A07;
    public final AnonymousClass1HA A08;
    public final AnonymousClass1SY A09 = new AnonymousClass1SY(this);
    public final AtomicInteger A0A = new AtomicInteger();
    public final C18820ts A0B;
    public final AnonymousClass1H2 A0C;
    public final AnonymousClass1HB A0D;

    public synchronized void A01(View view, AnonymousClass3T1 r14, C123495wb r15, C160527l9 r16, Object obj, boolean z) {
        View view2;
        C1272867r r4;
        AnonymousClass3T1 r6 = r14;
        synchronized (this) {
            LinkedBlockingDeque linkedBlockingDeque = this.A09.A00;
            Iterator it = linkedBlockingDeque.iterator();
            while (true) {
                view2 = view;
                if (!it.hasNext()) {
                    break;
                }
                C1272867r r2 = (C1272867r) it.next();
                if (r2.A00 == view) {
                    linkedBlockingDeque.remove(r2);
                }
            }
            Iterator it2 = linkedBlockingDeque.iterator();
            while (true) {
                Object obj2 = obj;
                if (it2.hasNext()) {
                    C1272867r r3 = (C1272867r) it2.next();
                    if (r3.A01.A1J.equals(r14.A1J) && r3.A04.equals(obj2) && r3.A00 == view) {
                        break;
                    }
                } else {
                    C123495wb r7 = r15;
                    C160527l9 r8 = r16;
                    boolean z2 = z;
                    if (r14 instanceof AnonymousClass2bU) {
                        AnonymousClass2bU r62 = (AnonymousClass2bU) r6;
                        C65013Qj r42 = r62.A01;
                        if (r42 != null) {
                            if (!r42.A0V || r42.A0I == null || r42.A03()) {
                                r42.A0c = false;
                            } else if (!r42.A0c) {
                                r42.A0c = true;
                                Handler handler = this.A01;
                                Objects.requireNonNull(r15);
                                handler.post(new C35751jC(r15, 11));
                            }
                            if (r42.A0I != null || (r62 instanceof C46962bx) || (r62 instanceof C46882bp) || (r62 instanceof AnonymousClass2cY) || (r62 instanceof C181798o3)) {
                                if (!(r62 instanceof AnonymousClass4TX)) {
                                    r4 = new C1272867r(view2, r62, r7, r8, this, obj2, z2);
                                }
                            }
                        }
                    } else if (r14 instanceof AnonymousClass2bV) {
                        if (r14.A0a == null) {
                            if (r14.A0N() != null) {
                                if (r14.A0N().A06 == null) {
                                }
                            }
                        }
                        r4 = new C1272867r(view2, r6, r7, r8, this, obj2, z2);
                    }
                    linkedBlockingDeque.offer(r4);
                    if (this.A00 == null) {
                        AnonymousClass5N5 r43 = new AnonymousClass5N5(this.A02, this.A0B, this.A0C, this.A0D, this);
                        this.A00 = r43;
                        r43.start();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[SYNTHETIC, Splitter:B:29:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[Catch:{ all -> 0x00dd, all -> 0x00e2, IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9 A[Catch:{ all -> 0x00dd, all -> 0x00e2, IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(X.C65013Qj r14, X.C1272867r r15, X.AnonymousClass1SX r16, java.io.File r17, int[] r18) {
        /*
            X.7l9 r0 = r15.A03
            int r4 = r0.BHb()
            android.view.View r0 = r15.A00
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x001e:
            if (r4 != 0) goto L_0x005b
            r8 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "MessageThumbsThread/ getting thumb for 0 size"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0028:
            r0 = 0
            r10 = 4
            r6 = 1
            r12 = 0
            r13 = 0
            r7 = r18
            if (r18 == 0) goto L_0x006b
            r2 = r16
            X.1D5 r2 = r2.A07
            java.lang.String r3 = r14.A0L
            if (r3 == 0) goto L_0x0059
            X.1DE r2 = r2.A0H
            X.5z2 r2 = r2.A03(r3, r6)
            if (r2 == 0) goto L_0x0059
        L_0x0042:
            if (r2 == 0) goto L_0x00f3
            long r4 = r2.A0A
            r9 = 0
        L_0x0047:
            int r2 = r7.length
            if (r9 >= r2) goto L_0x006d
            r2 = r18[r9]
            long r2 = (long) r2
            long r2 = r2 + r0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x006d
            r2 = r18[r9]
            long r2 = (long) r2
            long r0 = r0 + r2
            int r9 = r9 + 1
            goto L_0x0047
        L_0x0059:
            r2 = 0
            goto L_0x0042
        L_0x005b:
            double r2 = (double) r4
            double r2 = r2 / r0
            int r8 = (int) r2
            goto L_0x0028
        L_0x005f:
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = r0 + r2
            goto L_0x001e
        L_0x006b:
            r6 = 0
            goto L_0x007a
        L_0x006d:
            r2 = r18[r13]
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x006b
            boolean r2 = r15.A05
            if (r2 == 0) goto L_0x007a
            r10 = 16
        L_0x007a:
            r3 = r17
            if (r18 != 0) goto L_0x0084
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
            goto L_0x0088
        L_0x0084:
            X.5Qt r2 = X.C111775cp.A00(r3, r0)     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
        L_0x0088:
            r1 = 2
            X.6Kx r0 = new X.6Kx     // Catch:{ all -> 0x00dd }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00dd }
            X.5sn r4 = X.AnonymousClass6Y8.A0A(r0, r2)     // Catch:{ all -> 0x00dd }
            android.graphics.Bitmap r12 = r4.A02     // Catch:{ all -> 0x00dd }
            int r0 = r14.A06     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00a7
            int r0 = r14.A0A     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00a7
            int r0 = r4.A00     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00a7
            int r0 = r4.A01     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00a7
            X.AnonymousClass1GW.A0Q(r14, r3)     // Catch:{ all -> 0x00dd }
        L_0x00a7:
            if (r12 == 0) goto L_0x00d9
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x00dd }
            X.9oz r3 = new X.9oz     // Catch:{ all -> 0x00dd }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00dd }
            r0 = 1
            int r0 = r3.A0Y(r0)     // Catch:{ all -> 0x00dd }
            android.graphics.Matrix r17 = X.AnonymousClass1GW.A09(r0)     // Catch:{ all -> 0x00dd }
            if (r17 == 0) goto L_0x00d2
            int r15 = r12.getWidth()     // Catch:{ all -> 0x00dd }
            int r16 = r12.getHeight()     // Catch:{ all -> 0x00dd }
            r14 = 0
            r18 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00dd }
            if (r12 == r0) goto L_0x00d1
            r12.recycle()     // Catch:{ all -> 0x00dd }
        L_0x00d1:
            r12 = r0
        L_0x00d2:
            if (r6 == 0) goto L_0x00d9
            if (r12 == 0) goto L_0x00d9
            com.whatsapp.filter.FilterUtils.blurNative(r12, r10, r1)     // Catch:{ all -> 0x00dd }
        L_0x00d9:
            r2.close()     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
            return r12
        L_0x00dd:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00e2 }
            goto L_0x00e6
        L_0x00e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
        L_0x00e6:
            throw r1     // Catch:{ IOException -> 0x00f3, OutOfMemoryError -> 0x00e7 }
        L_0x00e7:
            r1 = move-exception
            boolean r0 = X.C26391Jz.A01()
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "MessageThumbsThread/bitmap-decode/OutOfMemory avoided"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f3:
            return r12
        L_0x00f4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SX.A00(X.3Qj, X.67r, X.1SX, java.io.File, int[]):android.graphics.Bitmap");
    }

    public AnonymousClass1SX(C20690y0 r3, C19630wG r4, C18820ts r5, C20060wx r6, AnonymousClass1H2 r7, C20810yC r8, C25521Gq r9, AnonymousClass1D5 r10, AnonymousClass1HA r11, AnonymousClass1HB r12) {
        this.A05 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A0C = r7;
        this.A07 = r10;
        this.A04 = r6;
        this.A0B = r5;
        this.A0D = r12;
        this.A08 = r11;
        this.A06 = r9;
    }
}
