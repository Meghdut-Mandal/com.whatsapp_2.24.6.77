package X;

import android.media.ImageReader;
import android.os.Handler;
import android.os.Trace;

/* renamed from: X.9pj  reason: invalid class name and case insensitive filesystem */
public class C204269pj implements ImageReader.OnImageAvailableListener {
    public int A00;
    public int A01;
    public int A02;
    public ImageReader A03;
    public C199559fW A04;
    public final Handler A05;
    public final Runnable A06 = new AnonymousClass759((Object) this, 40);
    public final Runnable A07 = new AnonymousClass759((Object) this, 41);
    public final Runnable A08 = new AnonymousClass759((Object) this, 42);
    public final AnonymousClass9J8 A09 = new AnonymousClass9J8();
    public final AnonymousClass9C2 A0A;
    public final AnonymousClass9GR A0B = new AnonymousClass9GR(new AnonymousClass9C1(this));
    public final AnonymousClass9J8[] A0C = new AnonymousClass9J8[1];
    public volatile boolean A0D;

    public static void A00(C204269pj r3) {
        if (r3.A03 == null && r3.A02 > 0 && r3.A01 > 0) {
            Trace.beginSection("AddImageReader");
            ImageReader newInstance = ImageReader.newInstance(r3.A02, r3.A01, 1, 1);
            r3.A03 = newInstance;
            newInstance.setOnImageAvailableListener(r3, (Handler) null);
            C199559fW r0 = new C199559fW(r3.A03.getSurface(), true);
            r3.A04 = r0;
            r0.A08 = true;
            AnonymousClass9C2 r02 = r3.A0A;
            C199559fW r32 = r3.A04;
            C20980A1u a1u = r02.A00;
            C20983A1x a1x = a1u.A02;
            a1x.A00(a1x.A00, new A22(a1u.A07, r32));
            Trace.endSection();
        }
    }

    public static void A01(C204269pj r3) {
        Trace.beginSection("RemoveImageReader");
        C199559fW r2 = r3.A04;
        if (r2 != null) {
            r3.A0A.A00.A02.A02(r2);
            r3.A04 = null;
        }
        ImageReader imageReader = r3.A03;
        if (imageReader != null) {
            imageReader.close();
            r3.A03 = null;
        }
        Trace.endSection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        if (r16 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r18) {
        /*
            r17 = this;
            r7 = r17
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00e8
            r3 = 0
            java.lang.String r0 = "OnImageAvailable"
            android.os.Trace.beginSection(r0)
            r2 = 0
            android.media.Image r16 = r18.acquireNextImage()     // Catch:{ all -> 0x00bd }
            if (r16 != 0) goto L_0x0015
            goto L_0x00dd
        L_0x0015:
            X.9GR r1 = r7.A0B     // Catch:{ all -> 0x00bb }
            java.util.concurrent.ConcurrentLinkedQueue r0 = r1.A00     // Catch:{ all -> 0x00bb }
            java.lang.Object r6 = r0.poll()     // Catch:{ all -> 0x00bb }
            X.A0q r6 = (X.C20957A0q) r6     // Catch:{ all -> 0x00bb }
            if (r6 != 0) goto L_0x002c
            X.9UW r0 = new X.9UW     // Catch:{ all -> 0x00bb }
            r0.<init>()     // Catch:{ all -> 0x00bb }
            X.A0q r6 = new X.A0q     // Catch:{ all -> 0x00bb }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x00bb }
            goto L_0x003c
        L_0x002c:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x00bb }
            r0 = 1
            boolean r0 = r1.compareAndSet(r3, r0)     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "Can only reset a previously released reference."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x003c:
            java.lang.Object r14 = r6.get()     // Catch:{ all -> 0x00c0 }
            X.9UW r14 = (X.AnonymousClass9UW) r14     // Catch:{ all -> 0x00c0 }
            android.media.Image$Plane[] r1 = r16.getPlanes()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00b2
            int r0 = r1.length     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b2
            r0 = r1[r3]     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b2
            X.9J8 r8 = r7.A09     // Catch:{ all -> 0x00c0 }
            java.nio.ByteBuffer r4 = r0.getBuffer()     // Catch:{ all -> 0x00c0 }
            int r1 = r0.getPixelStride()     // Catch:{ all -> 0x00c0 }
            int r0 = r0.getRowStride()     // Catch:{ all -> 0x00c0 }
            r8.A02 = r4     // Catch:{ all -> 0x00c0 }
            r8.A00 = r1     // Catch:{ all -> 0x00c0 }
            r8.A01 = r0     // Catch:{ all -> 0x00c0 }
            X.9J8[] r13 = r7.A0C     // Catch:{ all -> 0x00c0 }
            r13[r3] = r8     // Catch:{ all -> 0x00c0 }
            long r4 = r16.getTimestamp()     // Catch:{ all -> 0x00c0 }
            int r12 = r16.getWidth()     // Catch:{ all -> 0x00c0 }
            int r11 = r16.getHeight()     // Catch:{ all -> 0x00c0 }
            int r10 = r7.A00     // Catch:{ all -> 0x00c0 }
            r9 = 1
            X.9J8[] r0 = r14.A05     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0090
            r1 = 0
        L_0x007b:
            X.9J8[] r15 = r14.A05     // Catch:{ all -> 0x00c0 }
            int r0 = r15.length     // Catch:{ all -> 0x00c0 }
            if (r1 >= r0) goto L_0x0090
            r0 = r15[r1]     // Catch:{ all -> 0x00c0 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x008d
            r0 = r15[r1]     // Catch:{ all -> 0x00c0 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c0 }
            r0.clear()     // Catch:{ all -> 0x00c0 }
        L_0x008d:
            int r1 = r1 + 1
            goto L_0x007b
        L_0x0090:
            r14.A05 = r13     // Catch:{ all -> 0x00c0 }
            r14.A02 = r9     // Catch:{ all -> 0x00c0 }
            r14.A04 = r4     // Catch:{ all -> 0x00c0 }
            r14.A03 = r12     // Catch:{ all -> 0x00c0 }
            r14.A01 = r11     // Catch:{ all -> 0x00c0 }
            r14.A00 = r10     // Catch:{ all -> 0x00c0 }
            boolean r0 = r7.A0D     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00d0
            X.9C2 r0 = r7.A0A     // Catch:{ all -> 0x00c0 }
            X.A1u r0 = r0.A00     // Catch:{ all -> 0x00c0 }
            X.9C3 r0 = r0.A06     // Catch:{ all -> 0x00c0 }
            X.A1y r0 = r0.A00     // Catch:{ all -> 0x00c0 }
            X.A2m r1 = r0.A0J     // Catch:{ all -> 0x00c0 }
            r1.A00 = r6     // Catch:{ all -> 0x00c0 }
            X.9Xm r0 = r0.A0F     // Catch:{ all -> 0x00c0 }
            r0.A01(r1, r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00d0
        L_0x00b2:
            X.9J8 r0 = r7.A09
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
            goto L_0x00d6
        L_0x00bb:
            r6 = r2
            goto L_0x00c0
        L_0x00bd:
            r16 = r2
            r6 = r2
        L_0x00c0:
            X.9J8 r0 = r7.A09
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
            if (r6 == 0) goto L_0x00cd
            r6.release()
        L_0x00cd:
            if (r16 == 0) goto L_0x00e5
            goto L_0x00d9
        L_0x00d0:
            r8.A02 = r2
            r8.A00 = r3
            r8.A01 = r3
        L_0x00d6:
            r6.release()
        L_0x00d9:
            r16.close()
            goto L_0x00e5
        L_0x00dd:
            X.9J8 r0 = r7.A09
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
        L_0x00e5:
            android.os.Trace.endSection()
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204269pj.onImageAvailable(android.media.ImageReader):void");
    }

    public C204269pj(Handler handler, AnonymousClass9C2 r4) {
        this.A0A = r4;
        this.A05 = handler;
    }
}
