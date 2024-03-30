package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6jy  reason: invalid class name and case insensitive filesystem */
public class C139506jy implements C160587lF {
    public final Map A00;
    public final C97854qN A01;

    public static AnonymousClass6VA A00(AnonymousClass6VA r22, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        AnonymousClass6VA r0 = r22;
        ARAssetType aRAssetType = r0.A02;
        boolean z = false;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        switch (aRAssetType.ordinal()) {
            case 0:
                String str = r0.A0A;
                String str2 = r0.A0B;
                String str3 = r0.A0C;
                ARAssetType aRAssetType2 = ARAssetType.EFFECT;
                if (aRAssetType == aRAssetType2) {
                    z = true;
                }
                if (z) {
                    EffectAssetType effectAssetType = r0.A04;
                    if (C36361kB.A1a(aRAssetType, aRAssetType2)) {
                        String str4 = r0.A0D;
                        String str5 = r0.A09;
                        if (C36371kC.A1W(aRAssetType, ARAssetType.SUPPORT)) {
                            String str6 = str4;
                            String str7 = str3;
                            String str8 = str2;
                            String str9 = str;
                            return new AnonymousClass6VA(aRAssetType, aRRequestAsset$CompressionMethod2, effectAssetType, (AnonymousClass5TN) null, (C108425Tl) null, (VersionedCapability) null, r0.A08, r0.A07, str9, str8, str7, str6, str5, (String) null, -1);
                        }
                        throw AnonymousClass001.A09("Cannot get isLoggingDisabled from support asset");
                    }
                    throw AnonymousClass001.A09("Cannot get required SDK version from support asset");
                }
                throw AnonymousClass001.A09("Cannot get effect asset type from asset type other than effect");
            case 1:
                String str10 = r0.A0A;
                String str11 = r0.A0C;
                VersionedCapability A03 = r0.A03();
                int A02 = r0.A02();
                String str12 = r0.A09;
                String str13 = str11;
                String str14 = str10;
                return new AnonymousClass6VA(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (AnonymousClass5TN) null, r0.A06, A03, false, r0.A07, str14, (String) null, str13, (String) null, str12, (String) null, A02);
            case 2:
            case 3:
                String str15 = r0.A0A;
                String str16 = r0.A0B;
                String str17 = r0.A0C;
                String str18 = r0.A09;
                if (C36371kC.A1W(aRAssetType, ARAssetType.SUPPORT)) {
                    Boolean bool = r0.A08;
                    String str19 = str17;
                    String str20 = str16;
                    String str21 = str15;
                    return new AnonymousClass6VA(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, r0.A05, (C108425Tl) null, (VersionedCapability) null, bool, r0.A07, str21, str20, str19, (String) null, str18, (String) null, -1);
                }
                throw AnonymousClass001.A09("Cannot get isLoggingDisabled from support asset");
            case 4:
                String str22 = r0.A0A;
                String str23 = r0.A0B;
                String str24 = r0.A0C;
                ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod3 = r0.A03;
                String str25 = r0.A09;
                if (C36371kC.A1W(aRAssetType, ARAssetType.SUPPORT)) {
                    String str26 = str24;
                    String str27 = str23;
                    String str28 = str22;
                    return new AnonymousClass6VA(aRAssetType, aRRequestAsset$CompressionMethod3, (EffectAssetType) null, (AnonymousClass5TN) null, (C108425Tl) null, (VersionedCapability) null, r0.A08, r0.A07, str28, str27, str26, (String) null, str25, (String) null, -1);
                }
                throw AnonymousClass001.A09("Cannot get isLoggingDisabled from support asset");
            case 5:
                String str29 = r0.A0A;
                String str30 = r0.A0C;
                String str31 = r0.A09;
                String str32 = str31;
                String str33 = str30;
                String str34 = str29;
                return new AnonymousClass6VA(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (AnonymousClass5TN) null, r0.A06, (VersionedCapability) null, false, r0.A07, str34, (String) null, str33, (String) null, str32, r0.A0E, -1);
            default:
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = aRAssetType;
                throw AnonymousClass001.A08(MessageFormat.format("Unknown asset type : {0}", A0L));
        }
    }

    private C114675hd A01(ARAssetType aRAssetType) {
        C114675hd r0 = (C114675hd) this.A00.get(aRAssetType);
        if (r0 != null) {
            return r0;
        }
        throw C90464aC.A0P(aRAssetType, "unsupported asset type : ", AnonymousClass000.A0u());
    }

    public File B99(AnonymousClass6VA r3, StorageCallback storageCallback) {
        A01(r3.A02);
        return this.A01.B99(A00(r3, ARRequestAsset$CompressionMethod.NONE), storageCallback);
    }

    public boolean BLG(AnonymousClass6VA r4, boolean z) {
        A01(r4.A02);
        return this.A01.BLG(A00(r4, ARRequestAsset$CompressionMethod.NONE), false);
    }

    public void Bnc(AnonymousClass6VA r2) {
        this.A01.Bnc(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.6Je} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ea A[SYNTHETIC, Splitter:B:68:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File BpG(X.AnonymousClass6VA r13, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback r14, java.io.File r15) {
        /*
            r12 = this;
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r13.A02
            X.5hd r2 = r12.A01(r0)
            X.4qN r6 = r12.A01
            java.lang.String r8 = "decompression result is null"
            java.lang.Boolean r1 = r13.A07     // Catch:{ all -> 0x011c }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x011c }
            r5 = 0
            r4 = 0
            if (r1 == 0) goto L_0x001b
            java.lang.String r8 = "Encountered Unexpected Encrypted Asset in Android Delivery"
        L_0x0016:
            r14.onExtractionFinish(r4, r8)     // Catch:{ all -> 0x011c }
            goto L_0x010a
        L_0x001b:
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r3 = r13.A03     // Catch:{ all -> 0x011c }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r1 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.NONE     // Catch:{ all -> 0x011c }
            r10 = 1
            if (r3 == r1) goto L_0x00f0
            r14.onExtractionStart()     // Catch:{ all -> 0x011c }
            X.004 r1 = r2.A00     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00e7 }
            X.5oG r1 = (X.C118535oG) r1     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x00e7 }
            java.lang.String r9 = r13.A0A     // Catch:{ all -> 0x00e7 }
            java.io.File r11 = X.C90524aI.A0T(r1, r9)     // Catch:{ all -> 0x00e7 }
            if (r15 != 0) goto L_0x0041
            java.lang.String r1 = "file to decompress is null"
            X.6Je r7 = new X.6Je     // Catch:{ all -> 0x00e7 }
            r7.<init>((java.lang.String) r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x0082
        L_0x0041:
            X.AnonymousClass6GT.A00(r11)     // Catch:{ all -> 0x00e7 }
            int r2 = r3.ordinal()     // Catch:{ all -> 0x00e2 }
            if (r2 == r10) goto L_0x006a
            r1 = 2
            if (r2 != r1) goto L_0x005f
            X.C113665fu.A00()     // Catch:{ all -> 0x00e2 }
            X.7eU r3 = X.C113665fu.A00     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = r15.getPath()     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x00e2 }
            X.6Je r7 = r3.decompress(r2, r1)     // Catch:{ all -> 0x00e2 }
            goto L_0x007b
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "Got unsupported compression: "
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r3, r0, r1)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x006a:
            X.C113665fu.A00()     // Catch:{ all -> 0x00e2 }
            X.7eU r3 = X.C113665fu.A01     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = r15.getPath()     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x00e2 }
            X.6Je r7 = r3.decompress(r2, r1)     // Catch:{ all -> 0x00e2 }
        L_0x007b:
            java.io.File r1 = r7.A00     // Catch:{ all -> 0x00e7 }
            if (r1 != 0) goto L_0x0082
            X.AnonymousClass6GT.A00(r11)     // Catch:{ all -> 0x00e7 }
        L_0x0082:
            java.io.File r2 = r7.A00     // Catch:{ all -> 0x00df }
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT     // Catch:{ all -> 0x00df }
            if (r0 == r1) goto L_0x008c
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = com.facebook.cameracore.ardelivery.model.ARAssetType.REMOTE     // Catch:{ all -> 0x00df }
            if (r0 != r1) goto L_0x00d3
        L_0x008c:
            r11 = 0
            if (r2 == 0) goto L_0x00ac
            boolean r1 = r2.exists()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00ac
            boolean r1 = r2.isDirectory()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00ac
            java.lang.String[] r3 = r2.list()     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x00ac
            int r1 = r3.length     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00ac
            if (r1 != r10) goto L_0x00ac
            r1 = r3[r4]     // Catch:{ all -> 0x00df }
            java.io.File r11 = X.C36441kJ.A0w(r2, r1)     // Catch:{ all -> 0x00df }
        L_0x00ac:
            if (r11 != 0) goto L_0x00d2
            if (r2 == 0) goto L_0x00d2
            boolean r1 = r2.isDirectory()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00d2
            java.lang.String[] r1 = r2.list()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00d2
            int r1 = r1.length     // Catch:{ all -> 0x00df }
            if (r1 <= r10) goto L_0x00d2
            java.lang.String r3 = "AlwaysUnzipStorageStrategy"
            java.lang.String r2 = "%s [%s] has more than one file in tar."
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x00df }
            r1[r4] = r0     // Catch:{ all -> 0x00df }
            r1[r10] = r9     // Catch:{ all -> 0x00df }
            X.AnonymousClass6YR.A0H(r3, r2, r1)     // Catch:{ all -> 0x00df }
        L_0x00d2:
            r2 = r11
        L_0x00d3:
            boolean r1 = X.AnonymousClass6GT.A01(r2)     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x00f2
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x011c }
            r14.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x011c }
            goto L_0x010a
        L_0x00df:
            r0 = move-exception
            r5 = r7
            goto L_0x00e8
        L_0x00e2:
            r0 = move-exception
            X.AnonymousClass6GT.A00(r11)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
        L_0x00e8:
            if (r5 == 0) goto L_0x00ec
            java.lang.String r8 = r5.A01     // Catch:{ all -> 0x011c }
        L_0x00ec:
            r14.onExtractionFinish(r4, r8)     // Catch:{ all -> 0x011c }
            goto L_0x011b
        L_0x00f0:
            r2 = r15
            goto L_0x00f7
        L_0x00f2:
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x011c }
            r14.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x011c }
        L_0x00f7:
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.NONE     // Catch:{ all -> 0x011c }
            X.6VA r0 = A00(r13, r0)     // Catch:{ all -> 0x011c }
            r14.onCachePutStart()     // Catch:{ all -> 0x011c }
            java.io.File r5 = r6.BpG(r0, r14, r2)     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0107
            r4 = 1
        L_0x0107:
            r14.onCachePutFinish(r4)     // Catch:{ all -> 0x011c }
        L_0x010a:
            boolean r0 = X.AnonymousClass6GT.A01(r15)
            if (r0 == 0) goto L_0x0116
            X.AnonymousClass00C.A0B(r15)
            r15.delete()
        L_0x0116:
            return r5
        L_0x0117:
            r0 = move-exception
            r14.onCachePutFinish(r4)     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            boolean r0 = X.AnonymousClass6GT.A01(r15)
            if (r0 == 0) goto L_0x0129
            X.AnonymousClass00C.A0B(r15)
            r15.delete()
        L_0x0129:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139506jy.BpG(X.6VA, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback, java.io.File):java.io.File");
    }

    public void Bx4(AnonymousClass6VA r2) {
        this.A01.Bx4(r2);
    }

    public C139506jy(C97854qN r3, C114675hd r4, C114675hd r5, C114675hd r6, C114675hd r7, C114675hd r8, C114675hd r9) {
        this.A01 = r3;
        HashMap A0J = AnonymousClass001.A0J();
        this.A00 = A0J;
        A0J.put(ARAssetType.EFFECT, r4);
        A0J.put(ARAssetType.SUPPORT, r5);
        A0J.put(ARAssetType.ASYNC, r6);
        A0J.put(ARAssetType.REMOTE, r7);
        A0J.put(ARAssetType.SCRIPTING_PACKAGE, r8);
        A0J.put(ARAssetType.SPARKVISION, r9);
    }
}
