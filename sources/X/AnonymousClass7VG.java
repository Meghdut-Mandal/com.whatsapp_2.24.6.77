package X;

import com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker;

/* renamed from: X.7VG  reason: invalid class name */
public final class AnonymousClass7VG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $name;
    public final /* synthetic */ C10810fG $result;
    public final /* synthetic */ int $version;
    public final /* synthetic */ PttMLModelDownloadWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VG(PttMLModelDownloadWorker pttMLModelDownloadWorker, String str, C10810fG r4, int i) {
        super(1);
        this.this$0 = pttMLModelDownloadWorker;
        this.$result = r4;
        this.$name = str;
        this.$version = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r20
            X.0AK r0 = (X.AnonymousClass0AK) r0
            java.lang.Object r6 = r0.value
            r2 = r19
            com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker r9 = r2.this$0
            X.0fG r3 = r2.$result
            java.lang.String r8 = r2.$name
            int r7 = r2.$version
            boolean r0 = r6 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            r5 = 32
            if (r0 == 0) goto L_0x0100
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            X.13E r1 = r9.A04
            X.0yd r0 = r9.A07
            r4 = 0
            X.6v1 r11 = r1.A02(r0, r10, r4)
            X.0ww r1 = r9.A02     // Catch:{ all -> 0x0031 }
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0031 }
            X.5RE r4 = r11.B8D(r1, r4, r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            X.03N r4 = X.C90524aI.A0t(r0)
        L_0x0036:
            boolean r0 = r4 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ef
            r10 = r4
            java.io.InputStream r10 = (java.io.InputStream) r10
            java.net.HttpURLConnection r0 = r11.A01
            int r0 = r0.getContentLength()
            long r0 = (long) r0
            X.617 r11 = r9.A06
            X.7UM r12 = new X.7UM
            r12.<init>(r9, r0)
            java.lang.String r9 = "PttFileManager/inputStream/closing"
            X.C36321k7.A0w(r10, r8)
            java.lang.String r18 = r11.A00(r8, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r18)
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r17 = X.C90524aI.A0S(r0)
            java.io.File r0 = r17.getParentFile()     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            if (r0 == 0) goto L_0x006d
            X.C90474aD.A15(r0)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
        L_0x006d:
            java.io.FileOutputStream r11 = X.C90524aI.A0W(r17)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            r14 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            byte[] r1 = new byte[r14]     // Catch:{ all -> 0x00ad }
            r16 = 0
        L_0x0078:
            int r15 = r10.read(r1, r13, r14)     // Catch:{ all -> 0x00ad }
            r0 = -1
            if (r15 == r0) goto L_0x008c
            r11.write(r1, r13, r15)     // Catch:{ all -> 0x00ad }
            int r16 = r16 + r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00ad }
            r12.invoke(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x0078
        L_0x008c:
            r11.close()     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            java.io.File r1 = X.C90524aI.A0S(r18)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            r0 = r17
            boolean r0 = r0.renameTo(r1)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            if (r0 == 0) goto L_0x00a0
            X.4ox r1 = X.C97344ox.A00()     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            goto L_0x00cf
        L_0x00a0:
            java.lang.String r0 = "PttFileManager/saveFile/failed to rename file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            X.C90464aC.A18(r17)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            goto L_0x00cf
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
            throw r0     // Catch:{ IOException -> 0x00c2, SecurityException -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "PttFileManager/saveFile/failed to create a directory"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d3 }
            X.C90464aC.A18(r17)     // Catch:{ all -> 0x00d3 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x00d3 }
            goto L_0x00cf
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "PttFileManager/saveFile/failed to save file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d3 }
            X.C90464aC.A18(r17)     // Catch:{ all -> 0x00d3 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            r10.close()     // Catch:{ IOException -> 0x00dd }
            goto L_0x00e1
        L_0x00d3:
            r1 = move-exception
            r10.close()     // Catch:{ IOException -> 0x00d8 }
            throw r1
        L_0x00d8:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
            throw r1
        L_0x00dd:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
        L_0x00e1:
            r3.element = r1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PttMLModelDownloadWorker/fetchLargeModel/found ml model url for "
            X.C90464aC.A1J(r0, r8, r1, r5)
            X.C36321k7.A1Y(r1, r7)
        L_0x00ef:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r4)
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = "PttMLModelDownloadWorker/call/failed to get input stream"
            com.whatsapp.util.Log.e(r0, r1)
            X.4ow r0 = X.C97334ow.A00()
            r3.element = r0
        L_0x0100:
            java.lang.String r4 = r2.$name
            int r3 = r2.$version
            X.0fG r2 = r2.$result
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r6)
            if (r0 == 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PttMLModelDownloadWorker/fetchLargeModel/ml model url not found for "
            X.C90464aC.A1J(r0, r4, r1, r5)
            X.C36351kA.A1R(r1, r3)
            X.4ow r0 = X.C97334ow.A00()
            r2.element = r0
        L_0x011e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VG.invoke(java.lang.Object):java.lang.Object");
    }
}
