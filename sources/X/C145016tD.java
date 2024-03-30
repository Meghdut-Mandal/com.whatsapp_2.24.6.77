package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.6tD  reason: invalid class name and case insensitive filesystem */
public class C145016tD implements AnonymousClass191 {
    public C21390zA A00;
    public C19630wG A01;
    public boolean A02 = false;

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.A02 = true;
        X.C111795cr.A01(r4, r2);
        X.C36321k7.A1K(r5, "MediaTranscodeService/start-service-foreground for message:", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bau(X.AnonymousClass3T1 r8, int r9) {
        /*
            r7 = this;
            X.0wG r0 = r7.A01
            android.content.Context r4 = r0.A00
            java.util.HashMap r3 = com.whatsapp.media.transcode.MediaTranscodeService.A09
            monitor-enter(r3)
            int r1 = r8.A1I     // Catch:{ all -> 0x00b1 }
            r0 = 3
            r6 = 1
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 9
            if (r1 == r0) goto L_0x001c
            r0 = 2
            if (r1 != r0) goto L_0x004e
            int r0 = r8.A09     // Catch:{ all -> 0x00b1 }
            if (r0 == r6) goto L_0x004e
        L_0x001c:
            int r0 = r8.A0D     // Catch:{ all -> 0x00b1 }
            r2 = 0
            if (r0 != r6) goto L_0x006c
            X.3Qa r5 = r8.A1J     // Catch:{ all -> 0x00b1 }
            boolean r0 = r3.containsKey(r5)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x004e
            X.2bU r8 = (X.AnonymousClass2bU) r8     // Catch:{ all -> 0x00b1 }
            r3.put(r5, r8)     // Catch:{ all -> 0x00b1 }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = X.C36441kJ.A0H(r4, r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "com.whatsapp.media.transcode.MediaTranscodeService.START"
            android.content.Intent r2 = r1.setAction(r0)     // Catch:{ all -> 0x00b1 }
            X.0zA r0 = r7.A00     // Catch:{ all -> 0x00b1 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0050
            r7.A02 = r6     // Catch:{ all -> 0x00b1 }
            X.C111795cr.A01(r4, r2)     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            X.C36321k7.A1K(r5, r0, r1)     // Catch:{ all -> 0x00b1 }
        L_0x004e:
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b0
        L_0x0050:
            r4.startService(r2)     // Catch:{ IllegalStateException -> 0x005d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalStateException -> 0x005d }
            java.lang.String r0 = "MediaTranscodeService/start-service for message:"
            X.C36321k7.A1K(r5, r0, r1)     // Catch:{ IllegalStateException -> 0x005d }
            goto L_0x004e
        L_0x005d:
            r7.A02 = r6     // Catch:{ all -> 0x00b1 }
            X.C111795cr.A01(r4, r2)     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            X.C36321k7.A1K(r5, r0, r1)     // Catch:{ all -> 0x00b1 }
            goto L_0x004e
        L_0x006c:
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x00b1 }
            java.lang.Object r5 = r3.remove(r0)     // Catch:{ all -> 0x00b1 }
            X.2bU r5 = (X.AnonymousClass2bU) r5     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x004e
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "MediaTranscodeService/stop-service for message:"
            r1.append(r0)     // Catch:{ all -> 0x00b1 }
            X.3Qa r0 = r5.A1J     // Catch:{ all -> 0x00b1 }
            X.C36321k7.A1N(r0, r1)     // Catch:{ all -> 0x00b1 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b1 }
            r0 = 26
            if (r1 < r0) goto L_0x00a6
            boolean r0 = r7.A02     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = X.C36441kJ.A0H(r4, r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "com.whatsapp.media.transcode.MediaTranscodeService.STOP"
            android.content.Intent r0 = r1.setAction(r0)     // Catch:{ all -> 0x00b1 }
            X.C111795cr.A01(r4, r0)     // Catch:{ all -> 0x00b1 }
        L_0x00a3:
            r7.A02 = r2     // Catch:{ all -> 0x00b1 }
            goto L_0x004e
        L_0x00a6:
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r0 = X.C36441kJ.A0H(r4, r0)     // Catch:{ all -> 0x00b1 }
            r4.stopService(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a3
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145016tD.Bau(X.3T1, int):void");
    }
}
