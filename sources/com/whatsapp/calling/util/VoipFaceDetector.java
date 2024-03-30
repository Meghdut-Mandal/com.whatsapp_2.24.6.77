package com.whatsapp.calling.util;

import X.AnonymousClass000;
import X.AnonymousClass3HO;
import X.AnonymousClass8CV;
import X.AnonymousClass9H0;
import X.C170658Eh;
import X.C170698El;
import X.C18740tg;
import android.content.Context;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;

public final class VoipFaceDetector {
    public static final String TAG = "voip/video/VoipFaceDetector/";
    public final boolean detectBounds;
    public final AnonymousClass3HO detector;
    public final int maxDetections;
    public volatile int nextFrameId;
    public volatile boolean released;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r14 <= 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.calling.util.VoipFaceDetector.DetectionResult detect(java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            monitor-enter(r11)
            X.C18740tg.A06(r12)     // Catch:{ all -> 0x010a }
            X.3HO r0 = r11.detector     // Catch:{ all -> 0x010a }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x010a }
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x010a }
            r5 = 0
            if (r13 <= 0) goto L_0x0013
            r0 = 1
            if (r14 > 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x010a }
            r1 = r16
            if (r16 == 0) goto L_0x002c
            r0 = 90
            if (r1 == r0) goto L_0x002b
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0029
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0053
            r5 = 3
            goto L_0x002c
        L_0x0029:
            r5 = 2
            goto L_0x002c
        L_0x002b:
            r5 = 1
        L_0x002c:
            X.9PP r4 = new X.9PP     // Catch:{ all -> 0x010a }
            r4.<init>()     // Catch:{ all -> 0x010a }
            int r1 = r11.nextFrameId     // Catch:{ all -> 0x010a }
            int r0 = r1 + 1
            r11.nextFrameId = r0     // Catch:{ all -> 0x010a }
            X.9Gz r2 = r4.A00     // Catch:{ all -> 0x010a }
            X.9MP r3 = r2.A01     // Catch:{ all -> 0x010a }
            r3.A02 = r1     // Catch:{ all -> 0x010a }
            r3.A03 = r5     // Catch:{ all -> 0x010a }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010a }
            r3.A04 = r0     // Catch:{ all -> 0x010a }
            r4.A00(r13, r14, r12, r15)     // Catch:{ all -> 0x010a }
            java.nio.ByteBuffer r0 = r2.A00     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "Missing image data.  Call either setBitmap or setImageData to specify the image"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x010a }
            goto L_0x0059
        L_0x0053:
            java.lang.String r0 = "Unsupported rotation"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x010a }
        L_0x0059:
            throw r0     // Catch:{ all -> 0x010a }
        L_0x005a:
            X.3HO r0 = r11.detector     // Catch:{ all -> 0x010a }
            android.util.SparseArray r7 = r0.A00(r2)     // Catch:{ all -> 0x010a }
            int r1 = r11.maxDetections     // Catch:{ all -> 0x010a }
        L_0x0062:
            int r0 = r7.size()     // Catch:{ all -> 0x010a }
            if (r1 >= r0) goto L_0x006e
            r7.removeAt(r1)     // Catch:{ all -> 0x010a }
            int r1 = r1 + 1
            goto L_0x0062
        L_0x006e:
            boolean r0 = r11.detectBounds     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00fe
            int r0 = r7.size()     // Catch:{ all -> 0x010a }
            int r0 = r0 * 16
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x010a }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x010a }
            r5.order(r0)     // Catch:{ all -> 0x010a }
            r6 = 0
        L_0x0084:
            int r0 = r7.size()     // Catch:{ all -> 0x010a }
            if (r6 >= r0) goto L_0x00ff
            java.lang.Object r1 = r7.valueAt(r6)     // Catch:{ all -> 0x010a }
            X.9N5 r1 = (X.AnonymousClass9N5) r1     // Catch:{ all -> 0x010a }
            android.graphics.PointF r2 = r1.A03     // Catch:{ all -> 0x010a }
            float r8 = r2.x     // Catch:{ all -> 0x010a }
            float r0 = r1.A00     // Catch:{ all -> 0x010a }
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r8 = r8 - r0
            float r2 = r2.y     // Catch:{ all -> 0x010a }
            float r0 = r1.A01     // Catch:{ all -> 0x010a }
            float r0 = r0 / r4
            float r2 = r2 - r0
            android.graphics.PointF r10 = new android.graphics.PointF     // Catch:{ all -> 0x010a }
            r10.<init>(r8, r2)     // Catch:{ all -> 0x010a }
            int r9 = r3.A03     // Catch:{ all -> 0x010a }
            r2 = 1
            if (r9 == 0) goto L_0x00e1
            if (r9 == r2) goto L_0x00c2
            r0 = 2
            if (r9 == r0) goto L_0x00b0
            goto L_0x00d0
        L_0x00b0:
            int r0 = r3.A00     // Catch:{ all -> 0x010a }
            float r4 = (float) r0     // Catch:{ all -> 0x010a }
            float r0 = r10.x     // Catch:{ all -> 0x010a }
            float r4 = r4 - r0
            float r0 = r1.A00     // Catch:{ all -> 0x010a }
            float r4 = r4 - r0
            int r0 = r3.A01     // Catch:{ all -> 0x010a }
            float r8 = (float) r0     // Catch:{ all -> 0x010a }
            float r0 = r10.y     // Catch:{ all -> 0x010a }
            float r8 = r8 - r0
            float r0 = r1.A01     // Catch:{ all -> 0x010a }
            goto L_0x00cc
        L_0x00c2:
            float r4 = r10.y     // Catch:{ all -> 0x010a }
            int r0 = r3.A01     // Catch:{ all -> 0x010a }
            float r8 = (float) r0     // Catch:{ all -> 0x010a }
            float r0 = r10.x     // Catch:{ all -> 0x010a }
            float r8 = r8 - r0
            float r0 = r1.A00     // Catch:{ all -> 0x010a }
        L_0x00cc:
            float r8 = r8 - r0
            if (r9 == r2) goto L_0x00db
            goto L_0x00e5
        L_0x00d0:
            int r0 = r3.A00     // Catch:{ all -> 0x010a }
            float r4 = (float) r0     // Catch:{ all -> 0x010a }
            float r0 = r10.y     // Catch:{ all -> 0x010a }
            float r4 = r4 - r0
            float r0 = r1.A01     // Catch:{ all -> 0x010a }
            float r4 = r4 - r0
            float r8 = r10.x     // Catch:{ all -> 0x010a }
        L_0x00db:
            float r2 = r1.A01     // Catch:{ all -> 0x010a }
            float r2 = r2 + r4
            float r1 = r1.A00     // Catch:{ all -> 0x010a }
            goto L_0x00ea
        L_0x00e1:
            float r4 = r10.x     // Catch:{ all -> 0x010a }
            float r8 = r10.y     // Catch:{ all -> 0x010a }
        L_0x00e5:
            float r2 = r1.A00     // Catch:{ all -> 0x010a }
            float r2 = r2 + r4
            float r1 = r1.A01     // Catch:{ all -> 0x010a }
        L_0x00ea:
            float r1 = r1 + r8
            int r0 = (int) r4     // Catch:{ all -> 0x010a }
            r5.putInt(r0)     // Catch:{ all -> 0x010a }
            int r0 = (int) r8     // Catch:{ all -> 0x010a }
            r5.putInt(r0)     // Catch:{ all -> 0x010a }
            int r0 = (int) r2     // Catch:{ all -> 0x010a }
            r5.putInt(r0)     // Catch:{ all -> 0x010a }
            int r0 = (int) r1     // Catch:{ all -> 0x010a }
            r5.putInt(r0)     // Catch:{ all -> 0x010a }
            int r6 = r6 + 1
            goto L_0x0084
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            int r1 = r7.size()     // Catch:{ all -> 0x010a }
            com.whatsapp.calling.util.VoipFaceDetector$DetectionResult r0 = new com.whatsapp.calling.util.VoipFaceDetector$DetectionResult     // Catch:{ all -> 0x010a }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x010a }
            monitor-exit(r11)
            return r0
        L_0x010a:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.util.VoipFaceDetector.detect(java.nio.ByteBuffer, int, int, int, int):com.whatsapp.calling.util.VoipFaceDetector$DetectionResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2.detector.A02() == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOperational() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            X.3HO r0 = r2.detector     // Catch:{ all -> 0x0011 }
            boolean r1 = r0.A02()     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.util.VoipFaceDetector.isOperational():boolean");
    }

    public synchronized void release() {
        if (!this.released) {
            Log.i("voip/video/VoipFaceDetector/Releasing face detector");
            this.released = true;
            this.detector.A01();
        }
    }

    public final class DetectionResult {
        public final ByteBuffer faceBounds;
        public final int numOfDetections;

        public DetectionResult(int i, ByteBuffer byteBuffer) {
            this.numOfDetections = i;
            this.faceBounds = byteBuffer;
        }
    }

    public VoipFaceDetector(AnonymousClass3HO r1, int i, boolean z) {
        this.detector = r1;
        this.maxDetections = i;
        this.detectBounds = z;
    }

    public static VoipFaceDetector create(Context context, int i, boolean z) {
        C18740tg.A0B(AnonymousClass000.A1R(i));
        AnonymousClass9H0 r3 = new AnonymousClass9H0(context);
        r3.A00 = true;
        AnonymousClass8CV r2 = new AnonymousClass8CV();
        r2.A01 = 0;
        r2.A02 = 0;
        r2.A03 = 0;
        r2.A04 = true;
        r2.A05 = true;
        r2.A00 = -1.0f;
        return new VoipFaceDetector(new C170698El(new C170658Eh(r3.A01, r2)), i, z);
    }
}
