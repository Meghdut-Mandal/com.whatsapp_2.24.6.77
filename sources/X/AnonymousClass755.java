package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.AbstractList;
import java.util.Stack;

/* renamed from: X.755  reason: invalid class name */
public class AnonymousClass755 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass755(C135106c9 r2, C145226tY r3, C17800s3 r4) {
        this.A04 = 20;
        this.A00 = r3;
        this.A01 = r2;
        this.A03 = true;
        this.A02 = r4;
    }

    public void A00(Bitmap bitmap, AnonymousClass6AQ r5) {
        ((MediaViewFragment) this.A01).A0H.A0H(new AnonymousClass736(this, bitmap, r5, 10));
    }

    public void A01(PhotoView photoView, AnonymousClass2bU r5) {
        AnonymousClass6AQ r2 = new AnonymousClass6AQ(photoView, r5);
        AbstractList abstractList = (AbstractList) this.A00;
        synchronized (abstractList) {
            abstractList.add(0, r2);
            abstractList.notifyAll();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.58d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.58m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.58m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.58m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.58d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.58d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.58d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.58d} */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.03N] */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06f0, code lost:
        r0.Bly(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0804, code lost:
        r3.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0807, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x084c, code lost:
        r0.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x084f, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:447:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[Catch:{ InterruptedException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6 A[Catch:{ InterruptedException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120 A[Catch:{ InterruptedException -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013a A[Catch:{ InterruptedException -> 0x016b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x0179;
                case 1: goto L_0x0196;
                case 2: goto L_0x01d0;
                case 3: goto L_0x02c5;
                case 4: goto L_0x02d7;
                case 5: goto L_0x0376;
                case 6: goto L_0x0458;
                case 7: goto L_0x0474;
                case 8: goto L_0x04c8;
                case 9: goto L_0x052b;
                case 10: goto L_0x0550;
                case 11: goto L_0x0574;
                case 12: goto L_0x0597;
                case 13: goto L_0x05b3;
                case 14: goto L_0x05d7;
                case 15: goto L_0x0635;
                case 16: goto L_0x0670;
                case 17: goto L_0x0044;
                case 18: goto L_0x06f9;
                case 19: goto L_0x0753;
                case 20: goto L_0x076e;
                case 21: goto L_0x07a0;
                case 22: goto L_0x082f;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r2 = r0.A03
            java.lang.Object r5 = r0.A00
            java.lang.Object r1 = r0.A01
            X.7fl r1 = (X.C158077fl) r1
            java.lang.Object r0 = r0.A02
            X.5rR r0 = (X.C120395rR) r0
            X.7ku r4 = r1.B7y()
            if (r2 == 0) goto L_0x003f
            X.6c7 r0 = r0.A00
            X.C18740tg.A06(r0)
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0027:
            X.AnonymousClass00C.A08(r3)
            X.68b r2 = X.C1273868b.A00()
            r1 = 0
        L_0x002f:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0850
            java.lang.Object r0 = r3.get(r1)
            r2.A09(r0, r1)
            int r1 = r1 + 1
            goto L_0x002f
        L_0x003f:
            java.util.List r3 = java.util.Collections.singletonList(r5)
            goto L_0x0027
        L_0x0044:
            java.lang.Object r2 = r0.A01     // Catch:{ InterruptedException -> 0x016b }
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2     // Catch:{ InterruptedException -> 0x016b }
            X.0yE r1 = r2.A0i     // Catch:{ InterruptedException -> 0x016b }
            boolean r8 = r1.A0B()     // Catch:{ InterruptedException -> 0x016b }
        L_0x004e:
            boolean r1 = r0.A03     // Catch:{ InterruptedException -> 0x016b }
            if (r1 != 0) goto L_0x0171
            java.lang.Object r3 = r0.A00     // Catch:{ InterruptedException -> 0x016b }
            java.util.Stack r3 = (java.util.Stack) r3     // Catch:{ InterruptedException -> 0x016b }
            int r1 = r3.size()     // Catch:{ InterruptedException -> 0x016b }
            if (r1 != 0) goto L_0x0061
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x016b }
            r3.wait()     // Catch:{ all -> 0x0165 }
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
        L_0x0061:
            boolean r1 = r0.A03     // Catch:{ InterruptedException -> 0x016b }
            if (r1 != 0) goto L_0x0171
            int r1 = r3.size()     // Catch:{ InterruptedException -> 0x016b }
            if (r1 == 0) goto L_0x004e
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x016b }
            java.lang.Object r1 = r3.pop()     // Catch:{ all -> 0x0168 }
            X.6AQ r1 = (X.AnonymousClass6AQ) r1     // Catch:{ all -> 0x0168 }
            monitor-exit(r3)     // Catch:{ all -> 0x0168 }
            X.2bU r6 = r1.A01     // Catch:{ InterruptedException -> 0x016b }
            X.3Qj r5 = X.AnonymousClass2bU.A00(r6)     // Catch:{ InterruptedException -> 0x016b }
            java.io.File r4 = r5.A0I     // Catch:{ InterruptedException -> 0x016b }
            r10 = 0
            if (r4 == 0) goto L_0x0160
            if (r8 == 0) goto L_0x0160
            boolean r3 = r6 instanceof X.C46882bp     // Catch:{ InterruptedException -> 0x016b }
            r15 = 1
            if (r3 != 0) goto L_0x00a1
            boolean r3 = r6 instanceof X.C46892bq     // Catch:{ InterruptedException -> 0x016b }
            if (r3 != 0) goto L_0x00a1
            int r3 = r6.A1I     // Catch:{ InterruptedException -> 0x016b }
            boolean r3 = X.C65703Td.A00(r3)     // Catch:{ InterruptedException -> 0x016b }
            if (r3 == 0) goto L_0x015b
            android.graphics.Bitmap r9 = X.C25541Gs.A01(r4)     // Catch:{ OutOfMemoryError -> 0x009e }
            if (r9 != 0) goto L_0x014e
            java.lang.String r3 = "MediaViewFragment/PhotoLoader/run/fillView/bitmap/null"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ OutOfMemoryError -> 0x009e }
            goto L_0x015b
        L_0x009e:
            r4 = move-exception
            goto L_0x0153
        L_0x00a1:
            boolean r3 = com.whatsapp.mediaview.MediaViewFragment.A0S(r2, r6)     // Catch:{ InterruptedException -> 0x016b }
            if (r3 == 0) goto L_0x00f9
            X.1D1 r7 = r2.A1B     // Catch:{ InterruptedException -> 0x016b }
            X.0wg r4 = r7.A05     // Catch:{ InterruptedException -> 0x016b }
            X.0yb r3 = r7.A00     // Catch:{ InterruptedException -> 0x016b }
            int r6 = X.AnonymousClass1K2.A02(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
            X.0yC r4 = r7.A02     // Catch:{ InterruptedException -> 0x016b }
            r3 = 3303(0xce7, float:4.628E-42)
            int r3 = r4.A07(r3)     // Catch:{ InterruptedException -> 0x016b }
            if (r6 < r3) goto L_0x00f9
            int r3 = r5.A0A     // Catch:{ InterruptedException -> 0x016b }
            r4 = 6000(0x1770, float:8.408E-42)
            int r7 = java.lang.Math.min(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
            int r3 = r5.A06     // Catch:{ InterruptedException -> 0x016b }
            int r6 = java.lang.Math.min(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
        L_0x00c9:
            X.0yC r4 = r2.A0x     // Catch:{ InterruptedException -> 0x016b }
            X.01I r3 = r2.A0i()     // Catch:{ InterruptedException -> 0x016b }
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch:{ InterruptedException -> 0x016b }
            java.lang.Long r11 = X.C55792vC.A00(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
            if (r11 != 0) goto L_0x00e2
            int r7 = r7 * r6
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x016b }
            r6 = 4
            long r3 = r3 * r6
            java.lang.Long r11 = java.lang.Long.valueOf(r3)     // Catch:{ InterruptedException -> 0x016b }
        L_0x00e2:
            java.io.File r3 = r5.A0I     // Catch:{ InterruptedException -> 0x016b }
            if (r3 == 0) goto L_0x0120
            r12 = 2147483647(0x7fffffff, float:NaN)
            r14 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
            X.6Kx r9 = new X.6Kx     // Catch:{ InterruptedException -> 0x016b }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ InterruptedException -> 0x016b }
            X.5sn r3 = X.AnonymousClass6Y8.A09(r9, r3)     // Catch:{ InterruptedException -> 0x016b }
            android.graphics.Bitmap r9 = r3.A02     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x0121
        L_0x00f9:
            com.whatsapp.mediaview.PhotoView r3 = r1.A00     // Catch:{ InterruptedException -> 0x016b }
            int r7 = r3.getWidth()     // Catch:{ InterruptedException -> 0x016b }
            int r6 = r3.getHeight()     // Catch:{ InterruptedException -> 0x016b }
            if (r7 == 0) goto L_0x0107
            if (r6 != 0) goto L_0x00c9
        L_0x0107:
            android.content.Context r3 = r2.A0a()     // Catch:{ InterruptedException -> 0x016b }
            android.view.WindowManager r3 = X.C21060yb.A01(r3)     // Catch:{ InterruptedException -> 0x016b }
            android.view.Display r4 = r3.getDefaultDisplay()     // Catch:{ InterruptedException -> 0x016b }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ InterruptedException -> 0x016b }
            r3.<init>()     // Catch:{ InterruptedException -> 0x016b }
            r4.getSize(r3)     // Catch:{ InterruptedException -> 0x016b }
            int r7 = r3.x     // Catch:{ InterruptedException -> 0x016b }
            int r6 = r3.y     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x00c9
        L_0x0120:
            r9 = r10
        L_0x0121:
            java.io.File r3 = r5.A0I     // Catch:{ IOException -> 0x0131 }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0131 }
            X.9oz r3 = new X.9oz     // Catch:{ IOException -> 0x0131 }
            r3.<init>((java.lang.String) r4)     // Catch:{ IOException -> 0x0131 }
            int r3 = r3.A0Y(r15)     // Catch:{ IOException -> 0x0131 }
            goto L_0x0138
        L_0x0131:
            r4 = move-exception
            java.lang.String r3 = "MediaViewFragment/PhotoLoader/run/getExif"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
            r3 = 1
        L_0x0138:
            if (r9 == 0) goto L_0x015b
            if (r3 == r15) goto L_0x014e
            r10 = 0
            int r12 = r9.getWidth()     // Catch:{ InterruptedException -> 0x016b }
            int r13 = r9.getHeight()     // Catch:{ InterruptedException -> 0x016b }
            android.graphics.Matrix r14 = X.AnonymousClass1GW.A09(r3)     // Catch:{ InterruptedException -> 0x016b }
            r11 = 0
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x016b }
        L_0x014e:
            r0.A00(r9, r1)     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x004e
        L_0x0153:
            java.lang.String r3 = "MediaViewFragment/PhotoLoader/run/oom"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ InterruptedException -> 0x016b }
            java.lang.System.gc()     // Catch:{ InterruptedException -> 0x016b }
        L_0x015b:
            r0.A00(r10, r1)     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x004e
        L_0x0160:
            r0.A00(r10, r1)     // Catch:{ InterruptedException -> 0x016b }
            goto L_0x004e
        L_0x0165:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            goto L_0x016a
        L_0x0168:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0168 }
        L_0x016a:
            throw r1     // Catch:{ InterruptedException -> 0x016b }
        L_0x016b:
            r2 = move-exception
            java.lang.String r1 = "MediaViewFragment/PhotoLoader/run/e = "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0171:
            java.lang.Object r0 = r0.A00
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.clear()
            return
        L_0x0179:
            boolean r4 = r0.A03
            java.lang.Object r3 = r0.A00
            X.9T8 r3 = (X.AnonymousClass9T8) r3
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r4 == 0) goto L_0x018b
            r3.A01(r2)
            return
        L_0x018b:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x0192
            java.util.Objects.requireNonNull(r1)
        L_0x0192:
            r3.A00(r1)
            return
        L_0x0196:
            boolean r5 = r0.A03
            java.lang.Object r1 = r0.A00
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r4 = r0.A01
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.Object r3 = r0.A02
            if (r5 != 0) goto L_0x01af
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01af
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r4)
            throw r0
        L_0x01af:
            java.util.Iterator r2 = r1.iterator()
        L_0x01b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0857
            java.lang.Object r1 = r2.next()
            X.9T8 r1 = (X.AnonymousClass9T8) r1
            if (r5 == 0) goto L_0x01c5
            r1.A01(r3)
            goto L_0x01b3
        L_0x01c5:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x01cc
            java.util.Objects.requireNonNull(r4)
        L_0x01cc:
            r1.A00(r4)
            goto L_0x01b3
        L_0x01d0:
            java.lang.Object r4 = r0.A00
            X.9UR r4 = (X.AnonymousClass9UR) r4
            java.lang.Object r3 = r0.A01
            X.9cs r3 = (X.C198079cs) r3
            java.lang.Object r1 = r0.A02
            X.5yV r1 = (X.C124615yV) r1
            boolean r2 = r0.A03
            if (r4 == 0) goto L_0x01e5
            android.util.LruCache r0 = r4.A00
            r0.evictAll()
        L_0x01e5:
            if (r3 == 0) goto L_0x01f7
            monitor-enter(r3)
            android.util.LruCache r0 = r3.A00     // Catch:{ all -> 0x01f3 }
            r0.evictAll()     // Catch:{ all -> 0x01f3 }
            android.util.LruCache r0 = r3.A01     // Catch:{ all -> 0x01f3 }
            r0.evictAll()     // Catch:{ all -> 0x01f3 }
            goto L_0x01f6
        L_0x01f3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01f6:
            monitor-exit(r3)
        L_0x01f7:
            if (r1 == 0) goto L_0x01ff
            java.util.concurrent.atomic.AtomicReference r1 = r1.A06
            r0 = 0
            r1.set(r0)
        L_0x01ff:
            X.6V0 r5 = X.AnonymousClass6V0.A04
            if (r2 == 0) goto L_0x0265
            X.6S3 r0 = r5.A01
            X.6V0 r6 = r0.A02
            java.util.Map r5 = r6.A03
            monitor-enter(r5)
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x0262 }
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r0)     // Catch:{ all -> 0x0262 }
            r4 = 0
        L_0x0211:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x023b
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0262 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0262 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0262 }
        L_0x0221:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0262 }
            X.B3l r0 = (X.C23079B3l) r0     // Catch:{ all -> 0x0262 }
            if (r4 != 0) goto L_0x0233
            java.util.LinkedList r4 = X.C90524aI.A0l()     // Catch:{ all -> 0x0262 }
        L_0x0233:
            r4.add(r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0221
        L_0x0237:
            r2.clear()     // Catch:{ all -> 0x0262 }
            goto L_0x0211
        L_0x023b:
            java.util.Map r0 = r6.A03     // Catch:{ all -> 0x0262 }
            r0.clear()     // Catch:{ all -> 0x0262 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0262 }
            monitor-exit(r5)     // Catch:{ all -> 0x0262 }
            if (r4 == 0) goto L_0x0857
            java.util.Iterator r2 = r4.iterator()
        L_0x024a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r1 = r2.next()
            X.B3l r1 = (X.C23079B3l) r1
            r1.stop()     // Catch:{ all -> 0x025d }
            r1.release()     // Catch:{ Exception -> 0x024a }
            goto L_0x024a
        L_0x025d:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x024a }
            throw r0     // Catch:{ Exception -> 0x024a }
        L_0x0262:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0262 }
            throw r0
        L_0x0265:
            monitor-enter(r5)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x02c2 }
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r0)     // Catch:{ all -> 0x02c2 }
            r4 = 0
        L_0x026d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0297
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x02c2 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x02c2 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x02c2 }
        L_0x027d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02c2 }
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02c2 }
            X.B3l r0 = (X.C23079B3l) r0     // Catch:{ all -> 0x02c2 }
            if (r4 != 0) goto L_0x028f
            java.util.LinkedList r4 = X.C90524aI.A0l()     // Catch:{ all -> 0x02c2 }
        L_0x028f:
            r4.add(r0)     // Catch:{ all -> 0x02c2 }
            goto L_0x027d
        L_0x0293:
            r2.clear()     // Catch:{ all -> 0x02c2 }
            goto L_0x026d
        L_0x0297:
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x02c2 }
            r0.clear()     // Catch:{ all -> 0x02c2 }
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x02c2 }
            monitor-exit(r5)     // Catch:{ all -> 0x02c2 }
            if (r4 == 0) goto L_0x0857
            java.util.Iterator r2 = r4.iterator()
        L_0x02a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r1 = r2.next()
            X.B3l r1 = (X.C23079B3l) r1
            r1.stop()     // Catch:{ all -> 0x02b9 }
            r1.release()     // Catch:{ Exception -> 0x02a6 }
            goto L_0x02a6
        L_0x02b9:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x02a6 }
            throw r0     // Catch:{ Exception -> 0x02a6 }
        L_0x02be:
            r4.clear()
            return
        L_0x02c2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02c2 }
            throw r0
        L_0x02c5:
            java.lang.Object r3 = r0.A00
            X.4c0 r3 = (X.C91434c0) r3
            java.lang.Object r2 = r0.A01
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            java.lang.Object r1 = r0.A02
            android.net.Network r1 = (android.net.Network) r1
            boolean r0 = r0.A03
            r3.A00(r1, r2, r0)
            return
        L_0x02d7:
            java.lang.Object r12 = r0.A00
            X.6YM r12 = (X.AnonymousClass6YM) r12
            java.lang.Object r14 = r0.A01
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            java.lang.Object r11 = r0.A02
            com.whatsapp.voipcalling.CallInfo r11 = (com.whatsapp.voipcalling.CallInfo) r11
            boolean r6 = r0.A03
            X.1Pb r2 = r12.A2X
            r1 = r14
            boolean r0 = r14 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0304
            com.whatsapp.jid.UserJid r0 = r11.getCreatorJid()
            if (r0 == 0) goto L_0x0304
            com.whatsapp.jid.UserJid r0 = r11.getCreatorJid()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x0304
            X.12O r0 = r12.A2r
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            X.13w r1 = r0.A09(r1)
        L_0x0304:
            java.lang.String r0 = "voip/inviteToGroupCall"
            com.whatsapp.voipcalling.CallParticipantJid r0 = r2.A00(r1, r0)
            int r5 = com.whatsapp.voipcalling.Voip.inviteToGroupCall(r0)
            if (r5 == 0) goto L_0x0370
            r0 = 670021(0xa3945, float:9.389E-40)
            if (r5 == r0) goto L_0x0370
            r0 = 670038(0xa3956, float:9.38923E-40)
            if (r5 == r0) goto L_0x0370
            X.171 r8 = r12.A2d
            X.16D r9 = r12.A2b
            X.141 r0 = r9.A0D(r14)
            java.lang.String r2 = X.C36381kD.A0v(r8, r0)
            android.content.Context r7 = r12.A22
            r1 = 2131895146(0x7f12236a, float:1.9425117E38)
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r4 = 0
            java.lang.String r1 = X.C36391kE.A0v(r7, r2, r0, r4, r1)
            r0 = 670033(0xa3951, float:9.38916E-40)
            if (r5 != r0) goto L_0x0356
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0356
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0356
            r2 = 2131896027(0x7f1226db, float:1.9426904E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.whatsapp.jid.UserJid r0 = r3.getPeerJid()
            X.141 r0 = X.C36441kJ.A0i(r9, r0)
            X.C36371kC.A1K(r8, r0, r1, r4)
            java.lang.String r1 = r7.getString(r2, r1)
        L_0x0356:
            r12.A0f(r1)
        L_0x0359:
            com.whatsapp.jid.UserJid r13 = r11.getInitialPeerJid()
            if (r5 != 0) goto L_0x0857
            if (r6 != 0) goto L_0x0857
            if (r13 == 0) goto L_0x0857
            X.0wU r0 = r12.A36
            r15 = 20
            X.74x r10 = new X.74x
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (int) r15)
            r0.Bp1(r10)
            return
        L_0x0370:
            X.1ay r0 = r12.A2x
            r0.A02(r14)
            goto L_0x0359
        L_0x0376:
            java.lang.Object r9 = r0.A00
            X.6YM r9 = (X.AnonymousClass6YM) r9
            java.lang.Object r11 = r0.A01
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r8 = r0.A02
            com.whatsapp.voipcalling.CallInfo r8 = (com.whatsapp.voipcalling.CallInfo) r8
            boolean r4 = r0.A03
            java.util.LinkedHashMap r6 = X.C36431kI.A1G()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r11.iterator()
        L_0x0390:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03ba
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r3)
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x03b6
            com.whatsapp.jid.UserJid r0 = r8.getCreatorJid()
            if (r0 == 0) goto L_0x03b6
            com.whatsapp.jid.UserJid r0 = r8.getCreatorJid()
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x03b6
            X.12O r0 = r9.A2r
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            X.13w r1 = r0.A09(r1)
        L_0x03b6:
            r2.add(r1)
            goto L_0x0390
        L_0x03ba:
            java.util.Iterator r7 = r2.iterator()
        L_0x03be:
            boolean r1 = r7.hasNext()
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L_0x03e6
            com.whatsapp.jid.UserJid r5 = X.C36441kJ.A0o(r7)
            boolean r1 = r8.isLidCall()
            boolean r0 = X.AnonymousClass143.A0I(r5)
            if (r1 == r0) goto L_0x03d5
            r3 = 0
        L_0x03d5:
            java.lang.String r0 = "voip/invite: LID mismatch between ongoing call & jid used to invite"
            X.C18740tg.A0D(r3, r0)
            X.1Pb r1 = r9.A2X
            java.lang.String r0 = "voip/invite"
            com.whatsapp.voipcalling.CallParticipantJid r0 = r1.A00(r5, r0)
            r6.put(r5, r0)
            goto L_0x03be
        L_0x03e6:
            java.util.Collection r1 = r6.values()
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = (com.whatsapp.voipcalling.CallParticipantJid[]) r0
            int r0 = com.whatsapp.voipcalling.Voip.invite(r0, r4)
            if (r0 == 0) goto L_0x042f
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r2.iterator()
        L_0x0400:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x041a
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r9.A2b
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r9.A2d
            java.lang.String r0 = X.C36381kD.A0v(r0, r1)
            r4.add(r0)
            goto L_0x0400
        L_0x041a:
            X.171 r0 = r9.A2d
            X.0ts r0 = r0.A02
            java.lang.String r2 = X.C55782vB.A00(r0, r4, r3)
            android.content.Context r1 = r9.A22
            r0 = 2131895146(0x7f12236a, float:1.9425117E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r3, r0)
            r9.A0f(r0)
            return
        L_0x042f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0433:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0443
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)
            X.1ay r0 = r9.A2x
            r0.A02(r1)
            goto L_0x0433
        L_0x0443:
            com.whatsapp.jid.UserJid r10 = r8.getInitialPeerJid()
            if (r4 != 0) goto L_0x0857
            if (r10 == 0) goto L_0x0857
            X.0wU r0 = r9.A36
            r12 = 21
            X.74x r7 = new X.74x
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (int) r12)
            r0.Bp1(r7)
            return
        L_0x0458:
            java.lang.Object r1 = r0.A00
            X.14p r1 = (X.C224914p) r1
            java.lang.Object r3 = r0.A01
            X.1wY r3 = (X.C41061wY) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x046c
            r3.A0L(r2)
            return
        L_0x046c:
            X.0wU r1 = r1.A04
            r0 = 49
            X.C36411kG.A1M(r1, r3, r2, r0)
            return
        L_0x0474:
            java.lang.Object r7 = r0.A00
            X.1uf r7 = (X.C40051uf) r7
            boolean r6 = r0.A03
            java.lang.Object r5 = r0.A01
            X.147 r5 = (X.AnonymousClass147) r5
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            X.343 r2 = r7.A0O
            X.040 r0 = r7.A16
            X.C36321k7.A0w(r0, r5)
            X.02h r1 = r0.BAE()
            r3 = 0
            if (r6 == 0) goto L_0x04a5
            com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1 r0 = new com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1
            r0.<init>(r2, r5, r4, r3)
            java.lang.Object r2 = X.C110515an.A00(r1, r0)
            X.2t2 r2 = (X.C54492t2) r2
            boolean r0 = r2 instanceof X.C46232Vp
            if (r0 == 0) goto L_0x04b9
            X.00s r1 = r7.A0J
        L_0x04a1:
            r1.A0C(r2)
            return
        L_0x04a5:
            com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1 r0 = new com.whatsapp.community.LinkExistingGroupsUseCase$linkExistingGroups$1
            r0.<init>(r2, r5, r4, r3)
            java.lang.Object r2 = X.C110515an.A00(r1, r0)
            X.2t2 r2 = (X.C54492t2) r2
            boolean r0 = r2 instanceof X.C46242Vq
            X.00s r1 = r7.A0H
            if (r0 != 0) goto L_0x04a1
            r1.A0C(r3)
        L_0x04b9:
            boolean r0 = r2 instanceof X.C46222Vo
            if (r0 == 0) goto L_0x0857
            X.00s r1 = r7.A0I
            X.2Vo r2 = (X.C46222Vo) r2
            int r0 = r2.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x04a1
        L_0x04c8:
            java.lang.Object r3 = r0.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r6 = r0.A01
            X.1Uw r6 = (X.C28981Uw) r6
            java.lang.Object r5 = r0.A02
            X.11F r5 = (X.AnonymousClass11F) r5
            boolean r10 = r0.A03
            X.005 r0 = r3.A2W
            java.lang.Object r2 = r0.get()
            X.3lC r2 = (X.C74183lC) r2
            java.util.LinkedList r8 = X.C90524aI.A0l()
            java.util.LinkedList r9 = X.C90524aI.A0l()
            X.6Tg r4 = new X.6Tg
            r4.<init>()
            X.1A5 r0 = r3.A1O
            X.141 r1 = r0.A01(r6)
            X.171 r0 = r3.A0p
            java.lang.String r14 = r0.A0H(r1)
            if (r14 != 0) goto L_0x04fb
            java.lang.String r14 = ""
        L_0x04fb:
            X.2pG r13 = X.C52332pG.LINK_CARD
            r16 = 0
            X.3Jw r7 = new X.3Jw
            r11 = r7
            r12 = r6
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16)
            android.content.Context r0 = r3.A0a()
            X.6QO r1 = r2.A03(r0, r1, r7)
            if (r1 == 0) goto L_0x0520
            android.net.Uri r0 = r1.A0J
            r8.add(r0)
            java.io.File r0 = r1.A08()
            r9.add(r0)
            r4.A06(r1)
        L_0x0520:
            X.17Y r0 = r3.A0Q
            X.74r r2 = new X.74r
            r2.<init>((com.whatsapp.contact.picker.ContactPickerFragment) r3, (X.C132366Tg) r4, (X.AnonymousClass11F) r5, (X.C28981Uw) r6, (X.C63393Jw) r7, (java.util.List) r8, (java.util.List) r9, (boolean) r10)
            r0.A0H(r2)
            return
        L_0x052b:
            java.lang.Object r4 = r0.A00
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r0.A01
            X.6W1 r3 = (X.AnonymousClass6W1) r3
            boolean r2 = r0.A03
            java.lang.Object r1 = r0.A02
            X.6O7 r1 = (X.AnonymousClass6O7) r1
            if (r4 == 0) goto L_0x0857
            java.lang.String r0 = "onContactPicked"
            X.58m r7 = X.AnonymousClass6W1.A01(r3, r0)
            if (r7 == 0) goto L_0x0857
            java.lang.Integer r0 = X.C36371kC.A0o()
            r7.A00 = r0
            X.AnonymousClass6W1.A02(r1, r7, r4, r2)
            X.0yW r0 = r3.A02
            goto L_0x06f0
        L_0x0550:
            java.lang.Object r5 = r0.A00
            X.6W1 r5 = (X.AnonymousClass6W1) r5
            java.lang.Object r4 = r0.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            boolean r3 = r0.A03
            java.lang.Object r2 = r0.A02
            X.6O7 r2 = (X.AnonymousClass6O7) r2
            r1 = 1
            java.lang.String r0 = "onInviteConfirmed"
            X.58m r7 = X.AnonymousClass6W1.A01(r5, r0)
            if (r7 == 0) goto L_0x0857
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A00 = r0
            X.AnonymousClass6W1.A02(r2, r7, r4, r3)
            X.0yW r0 = r5.A02
            goto L_0x06f0
        L_0x0574:
            java.lang.Object r4 = r0.A00
            X.6W1 r4 = (X.AnonymousClass6W1) r4
            java.lang.Object r3 = r0.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            boolean r2 = r0.A03
            java.lang.Object r1 = r0.A02
            X.6O7 r1 = (X.AnonymousClass6O7) r1
            java.lang.String r0 = "onContactDeselected"
            X.58m r7 = X.AnonymousClass6W1.A01(r4, r0)
            if (r7 == 0) goto L_0x0857
            java.lang.Integer r0 = X.C36361kB.A0j()
            r7.A00 = r0
            X.AnonymousClass6W1.A02(r1, r7, r3, r2)
            X.0yW r0 = r4.A02
            goto L_0x06f0
        L_0x0597:
            java.lang.Object r2 = r0.A00
            X.3Sw r2 = (X.C65633Sw) r2
            java.lang.Object r3 = r0.A01
            X.2bx r3 = (X.C46962bx) r3
            boolean r7 = r0.A03
            java.lang.Object r5 = r0.A02
            X.1Ap r0 = r2.A0F
            X.6c4 r4 = r0.A00(r3)
            X.17Y r0 = r2.A09
            r6 = 3
            X.74p r1 = new X.74p
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x084c
        L_0x05b3:
            java.lang.Object r2 = r0.A00
            X.2IR r2 = (X.AnonymousClass2IR) r2
            java.lang.Object r1 = r0.A01
            X.3Rh r1 = (X.C65243Rh) r1
            boolean r6 = r0.A03
            java.lang.Object r5 = r0.A02
            X.2bV r5 = (X.AnonymousClass2bV) r5
            X.1e2 r4 = r2.A0S
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = r1.A03
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r1 = 0
            if (r6 == 0) goto L_0x05d1
            r1 = r5
        L_0x05d1:
            int r0 = r5.A00
            r4.Bp8(r3, r2, r1, r0)
            return
        L_0x05d7:
            java.lang.Object r1 = r0.A00
            X.3hc r1 = (X.C71963hc) r1
            java.lang.Object r8 = r0.A01
            X.3Iw r8 = (X.C63133Iw) r8
            boolean r7 = r0.A03
            java.lang.Object r6 = r0.A02
            X.19g r5 = r1.A01
            java.lang.Object r4 = r5.A0N
            monitor-enter(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0632 }
            java.lang.String r0 = "companion-device-manager/critical sync failed. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x0632 }
            X.3SB r0 = r8.A02     // Catch:{ all -> 0x0632 }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x0632 }
            X.C36321k7.A1N(r0, r1)     // Catch:{ all -> 0x0632 }
            X.19n r0 = r5.A0A     // Catch:{ all -> 0x0632 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0632 }
            android.content.SharedPreferences r0 = X.C237119n.A00(r0)     // Catch:{ all -> 0x0632 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0632 }
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ all -> 0x0632 }
            java.util.Iterator r1 = X.C36361kB.A0s(r5)     // Catch:{ all -> 0x0632 }
        L_0x060f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0632 }
            if (r0 == 0) goto L_0x061f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0632 }
            X.192 r0 = (X.AnonymousClass192) r0     // Catch:{ all -> 0x0632 }
            r0.BUx(r8)     // Catch:{ all -> 0x0632 }
            goto L_0x060f
        L_0x061f:
            if (r7 == 0) goto L_0x0624
            java.lang.String r0 = "critical_sync_timeout"
            goto L_0x0626
        L_0x0624:
            java.lang.String r0 = "syncd_failure"
        L_0x0626:
            X.C236419g.A06(r5, r0)     // Catch:{ all -> 0x0632 }
            X.19o r0 = r5.A0H     // Catch:{ all -> 0x0632 }
            X.19q r0 = r0.A04     // Catch:{ all -> 0x0632 }
            r0.unregisterObserver(r6)     // Catch:{ all -> 0x0632 }
            monitor-exit(r4)     // Catch:{ all -> 0x0632 }
            return
        L_0x0632:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0632 }
            throw r0
        L_0x0635:
            java.lang.Object r6 = r0.A00
            com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment r6 = (com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment) r6
            java.lang.Object r5 = r0.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.0yC r2 = r6.A01
            if (r2 == 0) goto L_0x066b
            java.lang.String r0 = "extension_menu_report"
            X.3Pg r1 = new X.3Pg
            r1.<init>(r2, r5, r0, r4)
            r1.A01 = r5
            if (r3 == 0) goto L_0x0669
            X.3Qa r0 = r3.A1J
        L_0x0654:
            r1.A02 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r1.A01()
            X.01I r1 = r6.A0h()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.AnonymousClass00C.A0E(r1, r0)
            X.14r r1 = (X.C225014r) r1
            r1.Btm(r2)
            return
        L_0x0669:
            r0 = 0
            goto L_0x0654
        L_0x066b:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0670:
            java.lang.Object r4 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r3 = r0.A01
            X.3Qj r3 = (X.C65013Qj) r3
            java.lang.Object r2 = r0.A02
            X.2bU r2 = (X.AnonymousClass2bU) r2
            boolean r1 = r0.A03
            java.io.File r0 = r3.A0I
            if (r0 == 0) goto L_0x06f6
            long r14 = X.AnonymousClass1GX.A02(r0)
        L_0x0686:
            X.5qH r6 = r4.A16
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            r13 = 1
            if (r0 == 0) goto L_0x0690
            r13 = 3
        L_0x0690:
            if (r1 == 0) goto L_0x06f4
            int r9 = r4.A04
        L_0x0694:
            int r0 = r2.A0B
            long r0 = (long) r0
            java.io.File r8 = r3.A0I
            int r2 = r3.A0A
            long r4 = (long) r2
            int r2 = r3.A06
            long r2 = (long) r2
            r12 = 1
            if (r8 == 0) goto L_0x0857
            X.58d r7 = new X.58d
            r7.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A08 = r0
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r8.lastModified()
            long r10 = r10 - r0
            long r0 = X.C36391kE.A0B(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r7.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r7.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r7.A01 = r0
            long r0 = r8.length()
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r7.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r7.A0B = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.A06 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r7.A05 = r0
            X.0yW r0 = r6.A00
        L_0x06f0:
            r0.Bly(r7)
            return
        L_0x06f4:
            r9 = 4
            goto L_0x0694
        L_0x06f6:
            r14 = 0
            goto L_0x0686
        L_0x06f9:
            java.lang.Object r5 = r0.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r2 = r0.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            boolean r4 = r0.A03
            r3 = 0
            boolean r1 = X.C90484aE.A1U(r6)
            X.0wQ r0 = r5.A02
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x072b
            r0 = 2131888887(0x7f120af7, float:1.9412422E38)
            java.lang.String r2 = r5.getString(r0)
        L_0x071b:
            X.AnonymousClass00C.A0B(r2)
            if (r4 == 0) goto L_0x0748
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r1 = r5.A0v
            if (r1 != 0) goto L_0x073d
            java.lang.String r0 = "newsletterViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x072b:
            r2 = 2131888879(0x7f120aef, float:1.9412406E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.3On r0 = r5.A0s
            if (r0 == 0) goto L_0x074c
            java.lang.String r0 = r0.A01(r6)
            java.lang.String r2 = X.C36391kE.A0v(r5, r0, r1, r3, r2)
            goto L_0x071b
        L_0x073d:
            X.2La r0 = r5.A3t()
            X.1Uw r0 = r0.A0J()
            r1.A0S(r0)
        L_0x0748:
            com.whatsapp.newsletter.NewsletterInfoActivity.A17(r5, r2, r3)
            return
        L_0x074c:
            java.lang.String r0 = "newsletterMultiAdminUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0753:
            java.lang.Object r2 = r0.A00
            X.644 r2 = (X.AnonymousClass644) r2
            java.lang.Object r3 = r0.A01
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r1 = r0.A02
            X.9lY r1 = (X.C202319lY) r1
            X.9mK r0 = r2.A03
            r2 = 0
            X.C202629mK.A01(r3, r1, r0, r2)
            X.17Y r1 = r0.A00
            r0 = 2131892512(0x7f121920, float:1.9419774E38)
            r1.A06(r0, r2)
            return
        L_0x076e:
            java.lang.Object r6 = r0.A00
            X.6tY r6 = (X.C145226tY) r6
            java.lang.Object r2 = r0.A01
            X.6c9 r2 = (X.C135106c9) r2
            java.lang.Object r5 = r0.A02
            X.7hG r5 = (X.AnonymousClass7hG) r5
            X.1Yo r4 = r6.A02
            X.1Ee r1 = r4.A06
            java.lang.String r0 = r2.A0F
            X.6c9 r3 = r1.A03(r0)
            if (r3 == 0) goto L_0x0796
            X.17Y r2 = r4.A04
            r1 = 11
            X.AVb r0 = new X.AVb
            r0.<init>(r6, r3, r1)
            r2.A0H(r0)
            X.C29931Yo.A00(r3, r5, r4)
            return
        L_0x0796:
            X.17Y r3 = r4.A04
            r0 = 12
            X.AVb r1 = new X.AVb
            r1.<init>(r6, r2, r0)
            goto L_0x0804
        L_0x07a0:
            boolean r1 = r0.A03
            java.lang.Object r5 = r0.A00
            X.5xM r5 = (X.C123955xM) r5
            java.lang.Object r4 = r0.A01
            X.02t r4 = (X.C006302t) r4
            java.lang.Object r6 = r0.A02
            X.02t r6 = (X.C006302t) r6
            if (r1 != 0) goto L_0x0808
            X.1Bt r0 = r5.A01
            X.00T r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            java.lang.String r3 = X.C36371kC.A0t(r1, r0)
            if (r3 == 0) goto L_0x0808
            X.005 r0 = r5.A03
            java.lang.Object r2 = r0.get()
            X.6Mz r2 = (X.C130926Mz) r2
            X.AnonymousClass00C.A0B(r2)
            r1 = 0
            X.6bN r0 = new X.6bN
            r0.<init>(r3, r1)
            java.util.List r1 = X.C36371kC.A11(r0)
            r0 = 0
            java.util.List r0 = r2.A01(r1, r0, r0)
            java.lang.Object r0 = X.C007103b.A0M(r0)
            X.6AY r0 = (X.AnonymousClass6AY) r0
            if (r0 == 0) goto L_0x0808
            android.graphics.Bitmap r2 = r0.A00
            android.graphics.Bitmap r1 = X.AnonymousClass6Y8.A03(r2)     // Catch:{ all -> 0x07ef }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x07ef }
            r2.recycle()     // Catch:{ all -> 0x07ef }
            goto L_0x07f4
        L_0x07ef:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)
        L_0x07f4:
            boolean r0 = r1 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x07f9
            r2 = r1
        L_0x07f9:
            if (r2 == 0) goto L_0x0808
            X.17Y r3 = r5.A00
            r0 = 44
            X.72v r1 = new X.72v
            r1.<init>(r4, r2, r0)
        L_0x0804:
            r3.A0H(r1)
            return
        L_0x0808:
            X.004 r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.5qx r2 = (X.C120095qx) r2
            X.7hM r1 = r2.A01
            r7 = 3
            X.6GG r0 = new X.6GG
            r0.<init>(r2, r7)
            X.6uu r3 = r1.B3y(r0)
            X.7Ur r2 = new X.7Ur
            r2.<init>(r5, r6, r4)
            X.7UN r1 = new X.7UN
            r1.<init>(r5, r6)
            X.6jd r0 = new X.6jd
            r0.<init>(r1, r2, r7)
            r3.Blp(r0)
            return
        L_0x082f:
            java.lang.Object r3 = r0.A00
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.lang.Object r4 = r0.A01
            X.39Z r4 = (X.AnonymousClass39Z) r4
            java.lang.Object r2 = r0.A02
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            boolean r6 = r0.A03
            X.3Qj r0 = r3.A01
            if (r0 == 0) goto L_0x0857
            boolean r5 = r0.A03()
            X.17Y r0 = r4.A01
            X.3vh r1 = new X.3vh
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x084c:
            r0.A0H(r1)
            return
        L_0x0850:
            X.4vP r0 = X.C142326oh.A03(r5)
            X.C1273868b.A07(r0, r2, r4)
        L_0x0857:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass755.run():void");
    }

    public AnonymousClass755(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }

    public AnonymousClass755(MediaViewFragment mediaViewFragment) {
        this.A04 = 17;
        this.A01 = mediaViewFragment;
        this.A00 = new Stack();
        this.A02 = new C19950wm(this, "PhotoLoader");
    }

    public AnonymousClass755(TextView textView, C202319lY r3, AnonymousClass644 r4) {
        this.A04 = 19;
        this.A00 = r4;
        this.A01 = textView;
        this.A02 = r3;
        this.A03 = true;
    }
}
