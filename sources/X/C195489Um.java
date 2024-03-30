package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.animated.webp.WebPImage;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.9Um  reason: invalid class name and case insensitive filesystem */
public class C195489Um {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public boolean A04;
    public int A05;
    public long A06;
    public final int A07;
    public final int A08;
    public final Bitmap A09;
    public final AnonymousClass17Y A0A;
    public final C199039eb A0B;
    public final AnonymousClass1HG A0C;
    public final AnonymousClass9IX A0D;
    public final Runnable A0E = new C81183wb(this);
    public final Set A0F = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = r15.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r15 = this;
            r11 = r15
            boolean r0 = r15.A0G
            if (r0 == 0) goto L_0x013f
            X.9IX r6 = r15.A0D
            int r5 = r6.A00
            r4 = 1
            if (r5 <= r4) goto L_0x013f
            java.util.Set r7 = r15.A0F
            int r0 = r7.size()
            if (r0 == 0) goto L_0x013f
            long r13 = android.os.SystemClock.uptimeMillis()
            long r2 = r15.A06
            int r0 = r15.A05
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0136
            android.graphics.Bitmap r3 = r15.A01
            if (r3 == 0) goto L_0x003c
            android.graphics.Bitmap r1 = r15.A02
            if (r1 == 0) goto L_0x002e
            r0 = 0
            r1.eraseColor(r0)
        L_0x002e:
            boolean r0 = r3.isRecycled()
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            r0 = 0
            r15.A01 = r0
        L_0x003c:
            java.util.ArrayList r2 = X.C36441kJ.A15(r7)
            java.util.Iterator r1 = r2.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r1.next()
            X.Awh r0 = (X.C22832Awh) r0
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x0044
        L_0x0056:
            android.graphics.Bitmap r0 = r15.A02
            if (r0 != 0) goto L_0x006d
            int r2 = r15.A08
            int r1 = r15.A07
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r15.A02 = r1
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r15.A03 = r0
        L_0x006d:
            android.graphics.Canvas r2 = r15.A03
            if (r2 != 0) goto L_0x007a
            android.graphics.Bitmap r0 = r15.A02
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r15.A03 = r2
        L_0x007a:
            r1 = 0
            r0 = 0
            r2.drawBitmap(r3, r0, r0, r1)
            goto L_0x0039
        L_0x0080:
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x00bf
            java.util.Iterator r9 = r2.iterator()
        L_0x0088:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r3 = r9.next()
            X.Awh r3 = (X.C22832Awh) r3
            X.7u5 r3 = (X.C165747u5) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0088
            int r0 = r3.A00
            int r2 = r0 + 1
            r3.A00 = r2
            boolean r1 = r3.A05
            int r0 = r3.A01
            if (r1 == 0) goto L_0x00a8
            int r0 = r0 + 1
        L_0x00a8:
            if (r2 >= r0) goto L_0x00b8
            long r7 = android.os.SystemClock.uptimeMillis()
            long r0 = r3.A02
            long r7 = r7 - r0
            int r0 = X.C165747u5.A0B
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
        L_0x00b8:
            r3.stop()
            goto L_0x0088
        L_0x00bc:
            r0 = 0
            r15.A04 = r0
        L_0x00bf:
            int r0 = r15.A00
            int r12 = r0 + 1
            int r12 = r12 % r5
            r15.A00 = r12
            if (r12 != 0) goto L_0x00ca
            r15.A04 = r4
        L_0x00ca:
            r15.A06 = r13
            int[] r0 = r6.A01
            r0 = r0[r12]
            r15.A05 = r0
            long r0 = (long) r0
            long r13 = r13 + r0
            X.1HG r1 = r15.A0C
            X.9eb r10 = r15.A0B
            X.AUd r9 = new X.AUd
            r9.<init>(r10, r11, r12, r13)
            X.1HH r8 = r1.A04
            monitor-enter(r8)
            java.util.PriorityQueue r7 = r8.A01     // Catch:{ all -> 0x0131 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0131 }
        L_0x00e6:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0131 }
            X.AUd r3 = (X.C21661AUd) r3     // Catch:{ all -> 0x0131 }
            int r2 = r3.A00     // Catch:{ all -> 0x0131 }
            int r0 = r9.A00     // Catch:{ all -> 0x0131 }
            if (r2 < r0) goto L_0x00e6
            X.9eb r2 = r3.A02     // Catch:{ all -> 0x0131 }
            X.9eb r0 = r9.A02     // Catch:{ all -> 0x0131 }
            if (r2 != r0) goto L_0x00e6
            long r4 = r9.A01     // Catch:{ all -> 0x0131 }
            long r2 = r3.A01     // Catch:{ all -> 0x0131 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            r6.remove()     // Catch:{ all -> 0x0131 }
            goto L_0x00e6
        L_0x010a:
            r7.add(r9)     // Catch:{ all -> 0x0133 }
            r8.notifyAll()     // Catch:{ all -> 0x0133 }
            monitor-exit(r8)
            X.8rP r0 = r1.A00
            if (r0 != 0) goto L_0x014e
            X.0yC r5 = r1.A02
            X.17Y r4 = r1.A01
            X.1HD r6 = r1.A03
            X.9Fg r7 = new X.9Fg
            r7.<init>(r1)
            X.8rP r3 = new X.8rP
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A00 = r3
            monitor-enter(r8)
            r8.A00 = r3     // Catch:{ all -> 0x0133 }
            monitor-exit(r8)
            X.8rP r0 = r1.A00
            r0.start()
            return
        L_0x0131:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0136:
            X.17Y r1 = r15.A0A
            java.lang.Runnable r0 = r15.A0E
            long r2 = r2 - r13
            r1.A0I(r0, r2)
            return
        L_0x013f:
            r0 = 0
            r15.A0G = r0
            android.graphics.Bitmap r1 = r15.A02
            r0 = 0
            if (r1 == 0) goto L_0x014c
            r1.recycle()
            r15.A02 = r0
        L_0x014c:
            r15.A01 = r0
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195489Um.A00():void");
    }

    public void finalize() {
        this.A0B.finalize();
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            bitmap.recycle();
            this.A02 = null;
        }
        super.finalize();
    }

    public C195489Um(Bitmap bitmap, WebPImage webPImage, AnonymousClass17Y r11, AnonymousClass1HG r12, String str, int i, int i2) {
        this.A0A = r11;
        this.A0C = r12;
        this.A09 = bitmap;
        this.A0D = new AnonymousClass9IX(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A08 = i;
        this.A07 = i2;
        this.A0B = new C199039eb(bitmap, webPImage, str, i, i2);
    }
}
