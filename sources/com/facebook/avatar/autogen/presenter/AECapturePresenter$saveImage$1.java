package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C139536k1;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1", f = "AECapturePresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$saveImage$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ byte[] $data;
    public final /* synthetic */ int $frameHeight;
    public final /* synthetic */ int $frameWidth;
    public final /* synthetic */ int $rotation;
    public int label;
    public final /* synthetic */ C139536k1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$saveImage$1(Rect rect, C139536k1 r3, C023509x r4, byte[] bArr, int i, int i2, int i3) {
        super(2, r4);
        this.this$0 = r3;
        this.$data = bArr;
        this.$frameWidth = i;
        this.$frameHeight = i2;
        this.$cropRect = rect;
        this.$rotation = i3;
    }

    public final C023509x create(Object obj, C023509x r10) {
        return new AECapturePresenter$saveImage$1(this.$cropRect, this.this$0, r10, this.$data, this.$frameWidth, this.$frameHeight, this.$rotation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r1 = "AECapturePresenter"
            int r0 = r14.label
            if (r0 != 0) goto L_0x00e6
            X.AnonymousClass0AN.A00(r15)
            X.6k1 r0 = r14.this$0
            X.6bt r0 = r0.A03
            java.lang.String r0 = r0.A00
            byte[] r7 = r14.$data
            r8 = 17
            int r9 = r14.$frameWidth
            int r10 = r14.$frameHeight
            r11 = 0
            android.graphics.YuvImage r6 = new android.graphics.YuvImage
            r6.<init>(r7, r8, r9, r10, r11)
            java.io.ByteArrayOutputStream r4 = X.C90524aI.A0Q()
            int r3 = r14.$frameWidth
            int r2 = r14.$frameHeight
            int r2 = java.lang.Math.min(r3, r2)
            r5 = 1137180672(0x43c80000, float:400.0)
            float r2 = (float) r2
            float r5 = r5 / r2
            android.graphics.Rect r2 = r14.$cropRect     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            r3 = 100
            r6.compressToJpeg(r2, r3, r4)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            byte[] r4 = r4.toByteArray()     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            android.graphics.Matrix r12 = X.C90524aI.A0B()     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            int r2 = r14.$rotation     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            r12.postRotate(r2)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            r12.postScale(r5, r5)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            r8 = 0
            int r2 = r4.length     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r4, r8, r2)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            android.graphics.Rect r2 = r14.$cropRect     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            int r10 = r2.width()     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            android.graphics.Rect r2 = r14.$cropRect     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            int r11 = r2.height()     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            r13 = 1
            r9 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            X.AnonymousClass00C.A08(r4)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            java.io.FileOutputStream r5 = X.C90524aI.A0W(r0)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            X.6k1 r2 = r14.this$0     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00ad }
            r4.compress(r0, r3, r5)     // Catch:{ all -> 0x00ad }
            X.6Uu r7 = r2.A04     // Catch:{ all -> 0x00ad }
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x00ad }
            X.6bt r0 = r7.A06     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0091
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x00ad }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0091
            java.lang.String r0 = "selfie_photo"
            r6.put(r0, r2)     // Catch:{ all -> 0x00ad }
        L_0x0091:
            X.B5t r0 = r7.A02     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0098
            r0.pause()     // Catch:{ all -> 0x00ad }
        L_0x0098:
            java.lang.String r0 = "onSuccessTimer"
            java.util.Timer r4 = new java.util.Timer     // Catch:{ all -> 0x00ad }
            r4.<init>(r0, r8)     // Catch:{ all -> 0x00ad }
            r2 = 800(0x320, double:3.953E-321)
            X.79D r0 = new X.79D     // Catch:{ all -> 0x00ad }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x00ad }
            r4.schedule(r0, r2)     // Catch:{ all -> 0x00ad }
            r5.close()     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            goto L_0x00e0
        L_0x00ad:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r5, r2)     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
            throw r0     // Catch:{ IOException -> 0x00b4, IllegalArgumentException -> 0x00c1 }
        L_0x00b4:
            r2 = move-exception
            java.lang.String r0 = "Failed to save image to file"
            X.AnonymousClass6YR.A09(r1, r0, r2)
            X.6k1 r0 = r14.this$0
            X.6Uu r1 = r0.A04
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x00cd
        L_0x00c1:
            r2 = move-exception
            java.lang.String r0 = "Failed to create image from frame"
            X.AnonymousClass6YR.A09(r1, r0, r2)
            X.6k1 r0 = r14.this$0
            X.6Uu r1 = r0.A04
            java.lang.Integer r0 = X.C023109s.A01
        L_0x00cd:
            X.5pG r1 = r1.A07
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r3 = "image_creation_failed"
        L_0x00d7:
            X.67i r2 = r1.A00
            X.6lc r1 = r1.A01
            r0 = 36
            X.C53372rD.A00(r2, r1, r3, r0)
        L_0x00e0:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00e3:
            java.lang.String r3 = "save_image_failed"
            goto L_0x00d7
        L_0x00e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AECapturePresenter$saveImage$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
