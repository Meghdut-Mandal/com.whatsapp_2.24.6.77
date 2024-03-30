package X;

import android.media.ImageReader;

/* renamed from: X.B7d  reason: case insensitive filesystem */
public class C23143B7d implements ImageReader.OnImageAvailableListener {
    public Object A00;
    public final int A01;

    public C23143B7d(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r2 = r19
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0156;
                case 2: goto L_0x0075;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00d5;
                case 5: goto L_0x016b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            org.pjsip.PjCamera r0 = (org.pjsip.PjCamera) r0
            r0.imageAvailableListener(r2)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r6 = r1.A00
            X.A2P r6 = (X.A2P) r6
            android.media.ImageReader r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L_0x001d
            r0.setOnImageAvailableListener(r5, r5)
        L_0x001d:
            X.9PF r4 = r6.A03
            r6.A03 = r5
            if (r4 == 0) goto L_0x0010
            android.media.Image r2 = r2.acquireNextImage()     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x0063
            android.media.Image$Plane[] r1 = r2.getPlanes()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0045
            int r0 = r1.length     // Catch:{ all -> 0x0049 }
            if (r0 <= 0) goto L_0x0045
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0049 }
            java.nio.ByteBuffer r1 = r0.getBuffer()     // Catch:{ all -> 0x0049 }
            r1.rewind()     // Catch:{ all -> 0x0049 }
            int r0 = r1.remaining()     // Catch:{ all -> 0x0049 }
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x0049 }
            r1.get(r5)     // Catch:{ all -> 0x0049 }
        L_0x0045:
            r2.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0063
        L_0x0049:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0053 }
        L_0x0052:
            throw r1     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            r3 = move-exception
            java.lang.String r2 = "DefaultPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r3)     // Catch:{ all -> 0x0173 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x0173 }
        L_0x0063:
            boolean r0 = X.C131956Rl.A00()
            if (r0 == 0) goto L_0x006d
            byte[] r5 = X.C131956Rl.A01()
        L_0x006d:
            int r1 = r6.A01
            X.9ch r0 = new X.9ch
            r0.<init>(r5, r1)
            goto L_0x00c5
        L_0x0075:
            java.lang.Object r1 = r1.A00
            X.A2O r1 = (X.A2O) r1
            X.9PF r4 = r1.A01
            android.media.ImageReader r0 = r1.A00
            r7 = 0
            if (r0 == 0) goto L_0x0085
            r0.setOnImageAvailableListener(r7, r7)
            r1.A01 = r7
        L_0x0085:
            android.media.Image r6 = r2.acquireLatestImage()     // Catch:{ Exception -> 0x00ae }
            if (r6 == 0) goto L_0x00be
            X.9Sq r5 = new X.9Sq     // Catch:{ all -> 0x00a0 }
            r5.<init>()     // Catch:{ all -> 0x00a0 }
            r12 = 1
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = 1
            r8 = r7
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x009e }
            r7 = r5
            r6.close()     // Catch:{ Exception -> 0x00ae }
            goto L_0x00be
        L_0x009e:
            r1 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r1 = move-exception
            r5 = r7
        L_0x00a2:
            r6.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00ab }
        L_0x00aa:
            throw r1     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            r3 = move-exception
            r7 = r5
            goto L_0x00af
        L_0x00ae:
            r3 = move-exception
        L_0x00af:
            java.lang.String r2 = "YuvPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r3)
            X.C202389lj.A02(r2, r0)
        L_0x00be:
            if (r4 == 0) goto L_0x0010
            X.9ch r0 = new X.9ch
            r0.<init>(r7)
        L_0x00c5:
            r4.A00(r0)
            return
        L_0x00c9:
            java.lang.Object r0 = r1.A00
            X.ASu r0 = (X.C21628ASu) r0
            android.media.ImageReader$OnImageAvailableListener r0 = r0.A01
            if (r0 == 0) goto L_0x0010
            r0.onImageAvailable(r2)
            return
        L_0x00d5:
            java.lang.Object r3 = r1.A00
            X.8rQ r3 = (X.C183828rQ) r3
            android.media.Image r2 = r2.acquireLatestImage()
            if (r2 == 0) goto L_0x0010
            java.util.Map r0 = r3.virtualCameras
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)
        L_0x00e5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0189
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r7)
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.voipcalling.camera.VoipCamera r0 = (com.whatsapp.voipcalling.camera.VoipCamera) r0
            boolean r0 = r0.started
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r8 = r1.getValue()
            com.whatsapp.voipcalling.camera.VoipCamera r8 = (com.whatsapp.voipcalling.camera.VoipCamera) r8
            r3.updateCameraCallbackCheck()
            android.media.Image$Plane[] r0 = r2.getPlanes()
            int r4 = r0.length
            r1 = 0
            r0 = 1
            android.media.Image$Plane r6 = X.C165617ti.A09(r2, r1)
            if (r4 != r0) goto L_0x0123
            int r5 = r2.getWidth()
            int r4 = r2.getHeight()
            java.nio.ByteBuffer r1 = r6.getBuffer()
            int r0 = r6.getRowStride()
            r8.abgrFramePlaneCallback(r5, r4, r1, r0)
            goto L_0x00e5
        L_0x0123:
            android.media.Image$Plane r4 = X.C165617ti.A09(r2, r0)
            android.media.Image$Plane[] r1 = r2.getPlanes()
            r0 = 2
            r0 = r1[r0]
            int r9 = r2.getWidth()
            int r10 = r2.getHeight()
            java.nio.ByteBuffer r11 = r6.getBuffer()
            int r12 = r6.getRowStride()
            java.nio.ByteBuffer r13 = r4.getBuffer()
            int r14 = r4.getRowStride()
            java.nio.ByteBuffer r15 = r0.getBuffer()
            int r16 = r0.getRowStride()
            int r17 = r4.getPixelStride()
            r8.framePlaneCallback(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00e5
        L_0x0156:
            java.lang.Object r1 = r1.A00
            X.A2B r1 = (X.A2B) r1
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x0161
            r0.close()
        L_0x0161:
            android.media.Image r0 = r2.acquireNextImage()
            r1.A00 = r0
            X.A2B.A00(r1)
            return
        L_0x016b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.camera.VoipLiteCamera r0 = (com.whatsapp.voipcalling.camera.VoipLiteCamera) r0
            com.whatsapp.voipcalling.camera.VoipLiteCamera.maybeInitSUPCamera$lambda$6(r0, r2)
            return
        L_0x0173:
            r2 = move-exception
            boolean r0 = X.C131956Rl.A00()
            if (r0 == 0) goto L_0x017e
            byte[] r5 = X.C131956Rl.A01()
        L_0x017e:
            int r1 = r6.A01
            X.9ch r0 = new X.9ch
            r0.<init>(r5, r1)
            r4.A00(r0)
            throw r2
        L_0x0189:
            java.lang.Object r1 = r3.A0C
            monitor-enter(r1)
            android.media.Image r0 = r3.A02     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0193
            r0.close()     // Catch:{ all -> 0x0197 }
        L_0x0193:
            r3.A02 = r2     // Catch:{ all -> 0x0197 }
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            return
        L_0x0197:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23143B7d.onImageAvailable(android.media.ImageReader):void");
    }
}
