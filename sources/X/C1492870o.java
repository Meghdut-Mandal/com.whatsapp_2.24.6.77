package X;

/* renamed from: X.70o  reason: invalid class name and case insensitive filesystem */
public final class C1492870o implements C158677ht {
    public final AnonymousClass17Y A00;
    public final C121795tj A01;
    public final C129706Id A02;

    public C1492870o(AnonymousClass17Y r2, C121795tj r3, C129706Id r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvy(X.C128196Bh r11) {
        /*
            r10 = this;
            r6 = 0
            java.lang.String r0 = "voicetranscription/engines/UnityTranscriptionEngine/transcribe: starting transcription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2bi r5 = r11.A00
            java.io.InputStream r2 = r11.A02
            X.7jq r4 = r11.A01
            java.lang.String r9 = "seamless_nano_ggml"
            X.5tj r7 = r10.A01
            X.617 r3 = r7.A01
            r0 = 3
            java.lang.String r0 = r3.A00(r9, r0)
            boolean r0 = X.C90484aE.A1W(r0)
            if (r0 == 0) goto L_0x0092
            r1 = 3
            java.lang.String r0 = r3.A00(r9, r1)
            boolean r0 = X.C90484aE.A1W(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r6 = r3.A00(r9, r1)
            if (r6 == 0) goto L_0x00df
            java.io.DataInputStream r8 = new java.io.DataInputStream
            r8.<init>(r2)
            X.7N7 r2 = new X.7N7     // Catch:{ all -> 0x008b }
            r2.<init>(r8)     // Catch:{ all -> 0x008b }
            X.0lt r0 = new X.0lt     // Catch:{ all -> 0x008b }
            r0.<init>(r2)     // Catch:{ all -> 0x008b }
            X.0ic r1 = new X.0ic     // Catch:{ all -> 0x008b }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x008b }
            X.0iY r0 = new X.0iY     // Catch:{ all -> 0x008b }
            r0.<init>(r1)     // Catch:{ all -> 0x008b }
            java.util.List r1 = X.C15060md.A00(r0)     // Catch:{ all -> 0x008b }
            int r0 = r1.size()     // Catch:{ all -> 0x008b }
            short[] r3 = new short[r0]     // Catch:{ all -> 0x008b }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x008b }
            r2 = 0
        L_0x0056:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x008b }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x008b }
            short r1 = r0.shortValue()     // Catch:{ all -> 0x008b }
            int r0 = r2 + 1
            r3[r2] = r1     // Catch:{ all -> 0x008b }
            r2 = r0
            goto L_0x0056
        L_0x006c:
            r8.close()
            X.5TX r2 = X.AnonymousClass5TX.UNKNOWN
            X.6zc r1 = new X.6zc
            r1.<init>(r5, r4)
            java.lang.String r0 = "unity/unitylib: before loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "unityjni"
            com.facebook.soloader.SoLoader.A06(r0)
            java.lang.String r0 = "unity/unitylib: after loadLibrary()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r2.value
            com.whatsapp.unity.UnityLib.transcribeAudio(r3, r0, r6, r1)
            return
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)
            throw r0
        L_0x0092:
            r8 = 3
            X.6EH r2 = new X.6EH
            r2.<init>()
            java.lang.String r1 = "ML_MODEL_WORKER_MODEL_NAME"
            java.util.Map r0 = r2.A00
            r0.put(r1, r9)
            java.lang.String r0 = "ML_MODEL_WORKER_MODEL_VERSION"
            r2.A01(r0, r8)
            X.6X2 r2 = r2.A00()
            java.lang.Class<com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker> r0 = com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker.class
            X.4pE r1 = new X.4pE
            r1.<init>(r0)
            X.6QA r0 = r1.A00
            r0.A0A = r2
            X.5s0 r3 = r1.A00()
            X.4pG r3 = (X.C97404pG) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            r0 = 58
            r1.append(r0)
            java.lang.String r2 = X.C36381kD.A10(r1, r8)
            X.00T r0 = r7.A02
            java.lang.Object r1 = r0.getValue()
            X.6VR r1 = (X.AnonymousClass6VR) r1
            java.lang.Integer r0 = X.C023109s.A01
            r1.A07(r3, r0, r2)
            X.17Y r1 = r10.A00
            java.lang.String r0 = "Downloading model"
            r1.A0F(r0, r6)
            X.5Si r0 = X.C108145Si.UNKNOWN_TRANSCRIPTION_ERROR
            r4.BjS(r5, r0)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1492870o.Bvy(X.6Bh):void");
    }
}
