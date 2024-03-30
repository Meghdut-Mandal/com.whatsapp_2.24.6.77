package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Sr  reason: invalid class name and case insensitive filesystem */
public class C132216Sr {
    public final C133326Xw A00;
    public final AnonymousClass60A A01 = new AnonymousClass60A();
    public final AnonymousClass6PQ A02;
    public final Map A03;
    public final ARModelMetadataDownloader A04;
    public final AnonymousClass5ZV A05;

    public static synchronized void A00(AnonymousClass60A r4, VersionedCapability versionedCapability, C132216Sr r6, int i) {
        synchronized (r6) {
            try {
                C159917k8 r0 = (C159917k8) r6.A03.get(versionedCapability);
                if (r0 == null) {
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = versionedCapability.toServerValue();
                    AnonymousClass6YR.A0H("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A0L);
                } else if (r0.BOP(r4, versionedCapability, i)) {
                    AnonymousClass60A r2 = r6.A01;
                    ModelPathsHolder modelPathsHolder = (ModelPathsHolder) r4.A00.get(versionedCapability);
                    if (modelPathsHolder != null) {
                        r2.A00.put(versionedCapability, modelPathsHolder);
                    }
                }
            } catch (EffectsFrameworkException e) {
                throw new AnonymousClass5VD((Exception) e);
            }
        }
    }

    public static synchronized boolean A01(C135056c3 r4, VersionedCapability versionedCapability, C132216Sr r6) {
        boolean z;
        synchronized (r6) {
            try {
                C159917k8 r1 = (C159917k8) r6.A03.get(versionedCapability);
                if (r1 == null) {
                    Object[] A0L = AnonymousClass001.A0L();
                    z = false;
                    A0L[0] = versionedCapability.toServerValue();
                    AnonymousClass6YR.A0H("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A0L);
                } else {
                    z = r1.B0I(r4.A01, versionedCapability);
                }
            } catch (EffectsFrameworkException e) {
                throw new AnonymousClass5VD((Exception) e);
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Capability not found, Requested fetching unsupported capability: ");
        r0 = new X.AnonymousClass5VD(X.AnonymousClass000.A0o(r11.mCapability, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass63F r19, X.AnonymousClass7eX r20, X.AnonymousClass6SG r21, java.util.List r22) {
        /*
            r18 = this;
            r6 = r18
            r14 = 0
            X.7sQ r0 = new X.7sQ
            r0.<init>(r6, r14)
            r2 = 0
            r17 = r20
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ 5VD -> 0x018e }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ 5VD -> 0x018e }
            java.util.Iterator r16 = r22.iterator()     // Catch:{ 5VD -> 0x018e }
        L_0x0017:
            boolean r0 = r16.hasNext()     // Catch:{ 5VD -> 0x018e }
            r7 = r21
            if (r0 == 0) goto L_0x010e
            java.lang.Object r11 = r16.next()     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r11 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r11     // Catch:{ 5VD -> 0x018e }
            java.util.Map r13 = r6.A03     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            boolean r0 = r13.containsKey(r0)     // Catch:{ 5VD -> 0x018e }
            if (r0 == 0) goto L_0x00f6
            int r10 = r11.mMinVersion     // Catch:{ 5VD -> 0x018e }
            int r8 = r11.mPreferredVersion     // Catch:{ 5VD -> 0x018e }
            X.6PQ r5 = r6.A02     // Catch:{ 5VD -> 0x018e }
            java.lang.String r1 = "DefaultARModelFetcher.addCachedModelsAndReturnMissing"
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ 5VD -> 0x018e }
            boolean r0 = X.AnonymousClass6PQ.A00(r7, r5)     // Catch:{ 5VD -> 0x018e }
            if (r0 != 0) goto L_0x008c
            X.4xF r4 = r5.A02     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = r7.A01     // Catch:{ 5VD -> 0x018e }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 5VD -> 0x018e }
            java.lang.Object[] r3 = X.C90474aD.A1a(r0)     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = r0.name()     // Catch:{ 5VD -> 0x018e }
            int r3 = X.AnonymousClass000.A0L(r0, r3)     // Catch:{ 5VD -> 0x018e }
            X.0ze r15 = r4.A00     // Catch:{ 5VD -> 0x018e }
            r0 = 22413317(0x1560005, float:3.9305606E-38)
            r15.BPM(r0, r3, r14)     // Catch:{ 5VD -> 0x018e }
            r4.A05(r7, r3)     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            java.lang.String r15 = r0.name()     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "model_type"
            r4.A03(r3, r0, r15)     // Catch:{ 5VD -> 0x018e }
            int r0 = r11.mMinVersion     // Catch:{ 5VD -> 0x018e }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "min_version"
            r4.A03(r3, r0, r15)     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "model_cache_check_call_site"
            r4.A03(r3, r0, r1)     // Catch:{ 5VD -> 0x018e }
            boolean r0 = r11.mIsMinVersionTranslatedToNmlml     // Catch:{ 5VD -> 0x018e }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "is_min_version_translated_to_nmlml"
            r4.A03(r3, r0, r1)     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "model_cache_check_start"
            r4.A02(r3, r0)     // Catch:{ 5VD -> 0x018e }
        L_0x008c:
            boolean r0 = r11.mForceDownload     // Catch:{ 5VD -> 0x018e }
            if (r0 != 0) goto L_0x00ea
            r1 = 1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r15 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            monitor-enter(r6)     // Catch:{ 5VD -> 0x018e }
            java.lang.Object r0 = r13.get(r15)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            X.7k8 r0 = (X.C159917k8) r0     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r4 = "DefaultARModelFetcher"
            java.lang.String r3 = "Trying to load model from unsupported capability: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ EffectsFrameworkException -> 0x00ef }
            java.lang.String r0 = r15.toServerValue()     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r1[r14] = r0     // Catch:{ EffectsFrameworkException -> 0x00ef }
            X.AnonymousClass6YR.A0H(r4, r3, r1)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            goto L_0x00e9
        L_0x00ac:
            X.60A r3 = new X.60A     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r3.<init>()     // Catch:{ EffectsFrameworkException -> 0x00ef }
            boolean r0 = r0.BOM(r3, r15)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r0 == 0) goto L_0x00e9
            X.60A r0 = r6.A01     // Catch:{ EffectsFrameworkException -> 0x00ef }
            java.util.Map r3 = r3.A00     // Catch:{ EffectsFrameworkException -> 0x00ef }
            java.lang.Object r4 = r3.get(r15)     // Catch:{ EffectsFrameworkException -> 0x00ef }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r4 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r4     // Catch:{ EffectsFrameworkException -> 0x00ef }
            if (r4 == 0) goto L_0x00c8
            java.util.Map r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x00ef }
            r0.put(r15, r4)     // Catch:{ EffectsFrameworkException -> 0x00ef }
        L_0x00c8:
            monitor-exit(r6)     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 5VD -> 0x018e }
            if (r0 == 0) goto L_0x00ea
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r0     // Catch:{ 5VD -> 0x018e }
            int r0 = r0.mVersion     // Catch:{ 5VD -> 0x018e }
            if (r0 < r10) goto L_0x00ea
            if (r0 > r8) goto L_0x00ea
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            r12.add(r0)     // Catch:{ 5VD -> 0x018e }
            r5.A02(r11, r7, r8, r1)     // Catch:{ 5VD -> 0x018e }
            goto L_0x0017
        L_0x00e9:
            monitor-exit(r6)     // Catch:{ 5VD -> 0x018e }
        L_0x00ea:
            r9.add(r11)     // Catch:{ 5VD -> 0x018e }
            goto L_0x0017
        L_0x00ef:
            r1 = move-exception
            X.5VD r0 = new X.5VD     // Catch:{ all -> 0x010b }
            r0.<init>((java.lang.Exception) r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VD -> 0x018e }
            java.lang.String r0 = "Capability not found, Requested fetching unsupported capability: "
            r1.append(r0)     // Catch:{ 5VD -> 0x018e }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r11.mCapability     // Catch:{ 5VD -> 0x018e }
            java.lang.String r1 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ 5VD -> 0x018e }
            X.5VD r0 = new X.5VD     // Catch:{ 5VD -> 0x018e }
            r0.<init>((java.lang.String) r1)     // Catch:{ 5VD -> 0x018e }
            goto L_0x010d
        L_0x010b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ 5VD -> 0x018e }
        L_0x010d:
            throw r0     // Catch:{ 5VD -> 0x018e }
        L_0x010e:
            X.60A r8 = r6.A01     // Catch:{ 5VD -> 0x018e }
            X.60A r5 = new X.60A     // Catch:{ 5VD -> 0x018e }
            r5.<init>()     // Catch:{ 5VD -> 0x018e }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ 5VD -> 0x018e }
        L_0x0119:
            boolean r0 = r4.hasNext()     // Catch:{ 5VD -> 0x018e }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r3 = r4.next()     // Catch:{ 5VD -> 0x018e }
            java.util.Map r0 = r8.A00     // Catch:{ 5VD -> 0x018e }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ 5VD -> 0x018e }
            if (r1 == 0) goto L_0x0119
            java.util.Map r0 = r5.A00     // Catch:{ 5VD -> 0x018e }
            r0.put(r3, r1)     // Catch:{ 5VD -> 0x018e }
            goto L_0x0119
        L_0x0131:
            X.00I r0 = X.C36441kJ.A0W(r9, r5)     // Catch:{ 5VD -> 0x018e }
            java.lang.Object r5 = r0.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r0.A01
            X.60A r4 = (X.AnonymousClass60A) r4
            int r0 = r5.size()
            r10 = r19
            if (r0 != 0) goto L_0x0152
            if (r19 == 0) goto L_0x014c
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r10.A00(r0)
        L_0x014c:
            r0 = r17
            r0.BTz(r4, r2)
            return
        L_0x0152:
            java.util.concurrent.atomic.AtomicReference r15 = new java.util.concurrent.atomic.AtomicReference
            r15.<init>()
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = r22.size()
            int r0 = r5.size()
            int r1 = r1 - r0
            double r2 = (double) r1
            double r2 = r2 * r8
            int r0 = r22.size()
            double r0 = (double) r0
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r0)
            if (r19 == 0) goto L_0x017c
            double r0 = X.C90494aF.A00(r2)
            r10.A00(r0)
        L_0x017c:
            com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader r0 = r6.A04
            X.6jt r9 = new X.6jt
            r11 = r4
            r12 = r6
            r13 = r17
            r14 = r7
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.downloadModelMetadata(r5, r7, r9)
            return
        L_0x018e:
            r1 = move-exception
            r0 = r17
            r0.BTz(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132216Sr.A02(X.63F, X.7eX, X.6SG, java.util.List):void");
    }

    public C132216Sr(C133326Xw r5, C139436jr r6, C139446js r7, ARModelMetadataDownloader aRModelMetadataDownloader, AnonymousClass6PQ r9, AnonymousClass5ZV r10) {
        this.A00 = r5;
        this.A04 = aRModelMetadataDownloader;
        this.A02 = r9;
        this.A05 = r10;
        this.A03 = AnonymousClass001.A0J();
        Iterator it = C23931Ak.of(VersionedCapability.Facetracker, VersionedCapability.Segmentation, VersionedCapability.HairSegmentation, VersionedCapability.MSuggestionsCore).iterator();
        while (it.hasNext()) {
            this.A03.put(it.next(), r7);
        }
        C225614x it2 = r6.A00.A00.iterator();
        while (it2.hasNext()) {
            this.A03.put(it2.next(), r6);
        }
    }
}
