package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;

/* renamed from: X.ASu  reason: case insensitive filesystem */
public final class C21628ASu implements C23058B2e {
    public SurfaceTexture A00;
    public ImageReader.OnImageAvailableListener A01;
    public Handler A02;
    public A22 A03;
    public C199559fW A04;
    public final C20973A1j A05;
    public final C198549dl A06;
    public final C140206lD A07;
    public final C20979A1t A08;
    public final Context A09;
    public final C20985A1z A0A;

    public void Bwq(AnonymousClass9XT r15) {
        if (this.A03 != null) {
            C20985A1z a1z = this.A0A;
            AnonymousClass00T r2 = r15.A08;
            int A022 = C36331k8.A02(r2);
            AnonymousClass00T r1 = r15.A04;
            int A023 = C36331k8.A02(r1);
            int A024 = C36331k8.A02(r2);
            int A025 = C36331k8.A02(r1);
            int A026 = C36331k8.A02(r15.A05);
            boolean z = r15.A09;
            a1z.A00(A022, A023, A024, A025, 0, A026, 0, z);
            C199559fW r3 = this.A04;
            if (r3 != null) {
                r3.A01 = C36331k8.A02(r15.A06);
            }
            C20973A1j a1j = this.A05;
            int A027 = C36331k8.A02(r15.A06);
            C199559fW r32 = ((AnonymousClass88M) ((C23105B5k) a1j.B9y(C23105B5k.A00))).A02;
            if (r32 != null) {
                r32.A01 = -A027;
            }
            ((C23107B5m) a1j.B9y(C23107B5m.A00)).Bwt(0, C36331k8.A02(r2), C36331k8.A02(r1), C36331k8.A02(r2), C36331k8.A02(r1), z);
        }
    }

    public static final void A00(C21628ASu aSu) {
        ImageReader imageReader = ((AnonymousClass88M) ((C23105B5k) aSu.A05.B9y(C23105B5k.A00))).A00;
        if (imageReader != null) {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
            }
            imageReader.setOnImageAvailableListener(new C23143B7d(aSu, 3), aSu.A02);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.A2j} */
    /* JADX WARNING: type inference failed for: r9v9, types: [X.B0g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqn(X.C128656Dc r18, X.AnonymousClass7d4 r19) {
        /*
            r17 = this;
            r4 = r17
            X.A1j r1 = r4.A05
            X.88a r0 = X.AnonymousClass83Y.A08
            X.B5s r2 = r1.B9y(r0)
            X.83Y r2 = (X.AnonymousClass83Y) r2
            r1 = 0
            r7 = 1
            X.7lR[] r3 = r2.A07
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0018
            boolean r5 = r0 instanceof X.C20995A2j
            if (r5 == r7) goto L_0x0110
        L_0x0018:
            X.B3B r5 = r2.A00
            java.util.Objects.requireNonNull(r5)
            android.content.Context r12 = r5.getContext()
            X.AnonymousClass00C.A08(r12)
            X.9P9 r9 = r2.A01
            X.5cX r11 = r2.A04
            X.5hk r10 = r2.A03
            X.00T r5 = r2.A06
            java.lang.Object r8 = r5.getValue()
            X.B5p r8 = (X.C23110B5p) r8
            X.9LG r6 = r2.A02
            X.C36321k7.A0v(r9, r7, r11)
            r5 = 4
            X.AnonymousClass00C.A0D(r8, r5)
            X.9CR r5 = new X.9CR
            r5.<init>()
            X.9CS r14 = new X.9CS
            r14.<init>(r5)
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            java.util.concurrent.ScheduledExecutorService r15 = java.util.concurrent.Executors.newScheduledThreadPool(r5)
            java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.newSingleThreadExecutor()
            X.9LF r13 = new X.9LF
            r13.<init>(r6, r10, r11)
            X.9jR r11 = new X.9jR
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)
            X.94O r5 = new X.94O
            r5.<init>()
            X.9NS r6 = new X.9NS
            r6.<init>()
            r6.A00 = r12
            r6.A06 = r7
            r6.A04 = r11
            r6.A02 = r9
            r6.A03 = r5
            X.9bC r7 = new X.9bC
            r7.<init>(r8)
            X.9Bs r5 = new X.9Bs
            r5.<init>(r7)
            r6.A01 = r5
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r5 = new com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl
            r5.<init>()
            r6.A05 = r5
            java.util.concurrent.Executor r15 = r6.A06
            java.util.Objects.requireNonNull(r15)
            android.content.Context r9 = r6.A00
            java.util.Objects.requireNonNull(r9)
            X.9jR r13 = r6.A04
            java.util.Objects.requireNonNull(r13)
            X.9P9 r11 = r6.A02
            java.util.Objects.requireNonNull(r11)
            X.94O r12 = r6.A03
            java.util.Objects.requireNonNull(r12)
            X.9Bs r10 = r6.A01
            java.util.Objects.requireNonNull(r10)
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r14 = r6.A05
            java.util.Objects.requireNonNull(r14)
            r7 = 0
            X.A2j r8 = new X.A2j
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3[r1] = r8
            X.00T r5 = r2.A05
            java.lang.Object r5 = r5.getValue()
            X.B5a r5 = (X.C23103B5a) r5
            java.util.List r10 = X.AnonymousClass02R.A0C(r3)
            X.83Z r5 = (X.AnonymousClass83Z) r5
            X.9N0 r11 = r5.A00
            java.util.Iterator r6 = r10.iterator()
        L_0x00c7:
            boolean r5 = r6.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x0296
            java.lang.Object r8 = r6.next()
            X.7lR r8 = (X.C160697lR) r8
            boolean r5 = r8 instanceof X.C20995A2j
            if (r5 == 0) goto L_0x00c7
            r6 = r8
            X.A2j r6 = (X.C20995A2j) r6
            boolean r5 = r8 instanceof X.C23015B0g
            if (r5 == 0) goto L_0x00e2
            r9 = r8
            X.B0g r9 = (X.C23015B0g) r9
        L_0x00e2:
            r5 = r9
            r9 = r6
        L_0x00e4:
            r11.A01 = r9
            r11.A03 = r5
            X.A1y r9 = r11.A00
            java.util.Objects.requireNonNull(r9)
            android.os.Handler r5 = r9.A01
            if (r5 != 0) goto L_0x0282
            r9.A06 = r10
        L_0x00f3:
            if (r0 == 0) goto L_0x0110
            boolean r5 = r0 instanceof X.C20995A2j
            if (r5 == 0) goto L_0x02a9
            X.A2n r8 = new X.A2n
            r8.<init>(r7, r7)
            r6 = 41
            X.75C r5 = new X.75C
            r5.<init>((java.lang.Object) r8, (java.lang.Object) r0, (int) r6)
            X.A1y r0 = r2.A00
            if (r0 == 0) goto L_0x027d
            android.os.Handler r0 = r0.A01
            if (r0 == 0) goto L_0x027d
            r0.post(r5)
        L_0x0110:
            r7 = r18
            if (r18 == 0) goto L_0x0276
            X.5vm r6 = r7.A00
            java.util.List r8 = r6.A04
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0276
            r8.get(r1)
            boolean r0 = X.C1892592w.A00
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = "dynamic_pytorch_impl"
            r5 = 16
            com.facebook.soloader.SoLoader.A07(r0, r5)
            java.lang.String r0 = "torch-code-gen"
            com.facebook.soloader.SoLoader.A07(r0, r5)
            r0 = 1
            X.C1892592w.A00 = r0
        L_0x0134:
            android.content.Context r11 = r4.A09
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02a4
            java.lang.Object r0 = r8.get(r1)
            X.5oF r0 = (X.AnonymousClass5oF) r0
            java.lang.String r13 = r0.A01
            X.60A r1 = r6.A00
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker
            java.util.Map r4 = r1.A00
            java.lang.Object r1 = r4.get(r0)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r1 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting
            java.lang.Object r10 = r4.get(r0)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r10 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r10
            X.5hb r9 = r6.A03
            X.5mv r8 = new X.5mv
            r12 = r19
            r8.<init>(r12)
            X.9OS r5 = new X.9OS
            r5.<init>()
            r5.A05 = r13
            if (r1 != 0) goto L_0x0238
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
        L_0x016e:
            r5.A0B = r0
            if (r10 == 0) goto L_0x017a
            X.5Tl r0 = X.C108425Tl.A03
            java.lang.String r0 = r10.getModelPath(r0)
            r5.A07 = r0
        L_0x017a:
            X.9cr r4 = new X.9cr
            r4.<init>()
            X.9GQ r0 = new X.9GQ
            r0.<init>(r11)
            r4.A02 = r0
            X.9Ys r10 = X.AnonymousClass845.A01
            X.A0n r1 = new X.A0n
            r1.<init>()
            X.845 r0 = new X.845
            r0.<init>(r1)
            java.util.HashMap r13 = r4.A05
            r13.put(r10, r0)
            X.9Ys r1 = X.AnonymousClass842.A01
            r11 = 0
            X.842 r0 = new X.842
            r0.<init>()
            r13.put(r1, r0)
            X.9Ys r1 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A00
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r0 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration
            r0.<init>()
            r13.put(r1, r0)
            X.9Ys r10 = X.AnonymousClass843.A03
            X.6c7 r0 = r7.A02
            r1 = 0
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x01bb
            java.lang.String r11 = java.lang.String.valueOf(r0)
        L_0x01bb:
            X.6c7 r0 = r7.A01
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
        L_0x01c3:
            X.843 r0 = new X.843
            r0.<init>(r8, r11, r1)
            r13.put(r10, r0)
            X.9C8 r1 = new X.9C8
            r1.<init>()
            r0 = 1
            r1.A00 = r0
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r0 = new com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig
            r0.<init>((X.AnonymousClass9C8) r1)
            r4.A01 = r0
            X.9SF r0 = new X.9SF
            r0.<init>(r4)
            r5.A00 = r0
            java.lang.String r1 = r7.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01eb
            java.lang.String r1 = "0"
        L_0x01eb:
            r5.A08 = r1
            java.lang.String r0 = r7.A04
            r5.A09 = r0
            java.lang.String r0 = r7.A05
            r5.A0A = r0
            java.lang.String r0 = "whatsapp"
            r5.A02 = r0
            java.lang.String r0 = r7.A06
            r5.A03 = r0
            java.lang.String r0 = r6.A01
            r5.A04 = r0
            java.lang.String r0 = r6.A02
            r5.A06 = r0
            X.8zN r0 = X.C188308zN.USER_INTERACTION
            r5.A01 = r0
            java.util.Map r0 = r9.A00
            X.0wy r0 = X.C20070wy.copyOf((java.util.Map) r0)
            r5.A0C = r0
            X.9Uh r1 = new X.9Uh
            r1.<init>(r5)
            X.9bL r0 = new X.9bL
            r0.<init>(r12)
            X.A2n r4 = new X.A2n
            r4.<init>(r1, r0)
        L_0x0220:
            r0 = 0
            r3 = r3[r0]
            if (r3 == 0) goto L_0x029d
            r0 = 41
            X.75C r1 = new X.75C
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r3, (int) r0)
            X.A1y r0 = r2.A00
            if (r0 == 0) goto L_0x0299
            android.os.Handler r0 = r0.A01
            if (r0 == 0) goto L_0x0299
            r0.post(r1)
            return
        L_0x0238:
            X.5Tl r0 = X.C108425Tl.A06
            java.lang.String r15 = r1.getModelPath(r0)
            X.5Tl r0 = X.C108425Tl.A04
            java.lang.String r14 = r1.getModelPath(r0)
            X.5Tl r0 = X.C108425Tl.A05
            java.lang.String r13 = r1.getModelPath(r0)
            X.5Tl r0 = X.C108425Tl.A07
            java.lang.String r4 = r1.getModelPath(r0)
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.lang.String[] r16 = X.C1904698n.A00
            java.lang.String r0 = X.C165617ti.A0a(r16)
            r1.put(r0, r15)
            r0 = 1
            r0 = r16[r0]
            r1.put(r0, r14)
            r0 = 2
            r0 = r16[r0]
            r1.put(r0, r13)
            r0 = 3
            r0 = r16[r0]
            r1.put(r0, r4)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            goto L_0x016e
        L_0x0276:
            r0 = 0
            X.A2n r4 = new X.A2n
            r4.<init>(r0, r0)
            goto L_0x0220
        L_0x027d:
            r5.run()
            goto L_0x0110
        L_0x0282:
            r9.A06 = r7
            X.A2k r8 = new X.A2k
            r8.<init>(r10)
            android.os.Handler r5 = r9.A01
            java.util.Objects.requireNonNull(r5)
            r6 = 1
            android.os.Handler r5 = r9.A01
            X.AnonymousClass000.A14(r5, r8, r6)
            goto L_0x00f3
        L_0x0296:
            r5 = r7
            goto L_0x00e4
        L_0x0299:
            r1.run()
            return
        L_0x029d:
            java.lang.String r0 = "No renderer can be found at given index"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x02a4:
            java.lang.IllegalStateException r1 = X.C36381kD.A0l()
            throw r1
        L_0x02a9:
            java.lang.String r0 = "IGLU is not supported in WhatsApp yet"
            X.0Nv r1 = new X.0Nv
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21628ASu.Bqn(X.6Dc, X.7d4):void");
    }

    public C21628ASu(Context context, C20973A1j a1j) {
        this.A09 = context;
        this.A05 = a1j;
        C140206lD r3 = new C140206lD();
        r3.A04 = new C23144B7e(this, 1);
        this.A07 = r3;
        C20985A1z a1z = new C20985A1z(r3, new AnonymousClass88T());
        this.A0A = a1z;
        C198549dl r1 = new C198549dl();
        this.A06 = r1;
        this.A08 = new C20979A1t(r1, a1z);
        C20973A1j a1j2 = this.A05;
        a1j2.Bok();
        C1690483a.A00(a1j2).A02(this.A08);
    }
}
