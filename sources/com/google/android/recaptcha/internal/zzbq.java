package com.google.android.recaptcha.internal;

public final class zzbq {
    public final zzh zza;
    public final zzbg zzb;

    public zzbq(zzh zzh, zzbg zzbg) {
        this.zza = zzh;
        this.zzb = zzbg;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = com.google.android.recaptcha.internal.zzp.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        throw X.C165617ti.A0K(com.google.android.recaptcha.internal.zzl.zzR, com.google.android.recaptcha.internal.zzn.zzc, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.recaptcha.internal.zzoe zza(java.lang.String r6, byte[] r7, com.google.android.recaptcha.internal.zzbd r8) {
        /*
            r5 = this;
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.VALIDATE_INPUT
            com.google.android.recaptcha.internal.zzbb r3 = r8.zza(r0)
            com.google.android.recaptcha.internal.zzbg r1 = r5.zzb
            r2 = 0
            r0 = 2
            r1.zze.put(r3, new com.google.android.recaptcha.internal.zzbf(r3, r1.zza, new com.google.android.recaptcha.internal.zzac()))
            java.net.URLConnection r4 = X.C90504aG.A0r(r6)     // Catch:{ zzp -> 0x0087 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.AnonymousClass00C.A0E(r4, r0)     // Catch:{ zzp -> 0x0087 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ zzp -> 0x0087 }
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)     // Catch:{ zzp -> 0x0087 }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ zzp -> 0x0087 }
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "application/x-protobuffer"
            r4.setRequestProperty(r1, r0)     // Catch:{ zzp -> 0x0087 }
            r4.connect()     // Catch:{ Exception -> 0x0077 }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{ Exception -> 0x0077 }
            r0.write(r7)     // Catch:{ Exception -> 0x0077 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x0077 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0053
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x0048 }
            com.google.android.recaptcha.internal.zzoe r1 = com.google.android.recaptcha.internal.zzoe.zzi(r0)     // Catch:{ Exception -> 0x0048 }
            com.google.android.recaptcha.internal.zzbg r0 = r5.zzb     // Catch:{ zzp -> 0x0087 }
            r0.zza(r3)     // Catch:{ zzp -> 0x0087 }
            return r1
        L_0x0048:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzR     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r2)     // Catch:{ Exception -> 0x0077 }
            throw r0     // Catch:{ Exception -> 0x0077 }
        L_0x0053:
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x0077 }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x006e
            java.io.InputStream r0 = r4.getErrorStream()     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzoz r1 = com.google.android.recaptcha.internal.zzoz.zzg(r0)     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzpb r0 = r1.zzi()     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzp r0 = com.google.android.recaptcha.internal.zzo.zza(r0)     // Catch:{ Exception -> 0x0077 }
        L_0x006d:
            throw r0     // Catch:{ Exception -> 0x0077 }
        L_0x006e:
            int r0 = r4.getResponseCode()     // Catch:{ Exception -> 0x0077 }
            com.google.android.recaptcha.internal.zzp r0 = com.google.android.recaptcha.internal.zzbr.zza(r0)     // Catch:{ Exception -> 0x0077 }
            goto L_0x006d
        L_0x0077:
            r1 = move-exception
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp     // Catch:{ zzp -> 0x0087 }
            if (r0 != 0) goto L_0x0086
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ zzp -> 0x0087 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ zzp -> 0x0087 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzQ     // Catch:{ zzp -> 0x0087 }
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r2)     // Catch:{ zzp -> 0x0087 }
        L_0x0086:
            throw r1     // Catch:{ zzp -> 0x0087 }
        L_0x0087:
            r1 = move-exception
            com.google.android.recaptcha.internal.zzbg r0 = r5.zzb
            r0.zzb(r3, r1, r2)
            com.google.android.recaptcha.RecaptchaException r0 = r1.zzc()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zza(java.lang.String, byte[], com.google.android.recaptcha.internal.zzbd):com.google.android.recaptcha.internal.zzoe");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = r10.zzb;
        r0 = com.google.android.recaptcha.internal.zzp.zza;
        r4.zzb(r9, X.C165617ti.A0K(com.google.android.recaptcha.internal.zzl.zzad, com.google.android.recaptcha.internal.zzn.zzn, (java.lang.String) null), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = com.google.android.recaptcha.internal.zzp.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        throw X.C165617ti.A0K(com.google.android.recaptcha.internal.zzl.zzab, com.google.android.recaptcha.internal.zzn.zze, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b A[Catch:{ Exception -> 0x011e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb(com.google.android.recaptcha.internal.zzoe r11, com.google.android.recaptcha.internal.zzbd r12) {
        /*
            r10 = this;
            java.lang.String r5 = "gzip"
            r3 = 0
            java.lang.String r8 = r11.zzh     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = r11.zzg     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzh r0 = r10.zza     // Catch:{ Exception -> 0x011e }
            boolean r0 = r0.zzd(r6)     // Catch:{ Exception -> 0x011e }
            r1 = 1
            r7 = 2
            if (r0 != r1) goto L_0x0048
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.LOAD_CACHE_JS     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbb r9 = r12.zza(r0)     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ Exception -> 0x011e }
            r0.zze.put(r9, new com.google.android.recaptcha.internal.zzbf(r9, r0.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzh r0 = r10.zza     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = r0.zza(r6)     // Catch:{ Exception -> 0x002a }
            if (r4 == 0) goto L_0x0039
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ Exception -> 0x002a }
            r0.zza(r9)     // Catch:{ Exception -> 0x002a }
            goto L_0x0049
        L_0x002a:
            com.google.android.recaptcha.internal.zzbg r4 = r10.zzb     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzn     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzad     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r2, r3)     // Catch:{ Exception -> 0x011e }
            r4.zzb(r9, r0, r3)     // Catch:{ Exception -> 0x011e }
        L_0x0039:
            com.google.android.recaptcha.internal.zzbg r4 = r10.zzb     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzn     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzae     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r2, r3)     // Catch:{ Exception -> 0x011e }
            r4.zzb(r9, r0, r3)     // Catch:{ Exception -> 0x011e }
        L_0x0048:
            r4 = r3
        L_0x0049:
            if (r4 != 0) goto L_0x0114
            com.google.android.recaptcha.internal.zzh r0 = r10.zza     // Catch:{ Exception -> 0x011e }
            r0.zzb()     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.DOWNLOAD_JS     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbb r2 = r12.zza(r0)     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ zzp -> 0x00fe }
            r0.zze.put(r2, new com.google.android.recaptcha.internal.zzbf(r2, r0.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ zzp -> 0x00fe }
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00f3 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00f3 }
            java.net.URLConnection r4 = r0.openConnection()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.AnonymousClass00C.A0E(r4, r0)     // Catch:{ Exception -> 0x00e8 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "GET"
            r4.setRequestMethod(r0)     // Catch:{ Exception -> 0x00e8 }
            r4.setDoInput(r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "application/x-protobuffer"
            r4.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "Accept-Encoding"
            r4.setRequestProperty(r0, r5)     // Catch:{ Exception -> 0x00e8 }
            r4.connect()     // Catch:{ Exception -> 0x00e8 }
            int r1 = r4.getResponseCode()     // Catch:{ zzp -> 0x00fe }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00d7
            java.lang.String r0 = r4.getContentEncoding()     // Catch:{ Exception -> 0x00cc }
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x00cc }
            if (r0 == 0) goto L_0x00a7
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ Exception -> 0x00cc }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00cc }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00cc }
        L_0x00a2:
            java.lang.String r4 = X.C05610Qj.A00(r1)     // Catch:{ Exception -> 0x00cc }
            goto L_0x00b1
        L_0x00a7:
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x00cc }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00cc }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00cc }
            goto L_0x00a2
        L_0x00b1:
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ zzp -> 0x00fe }
            r0.zza(r2)     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.SAVE_CACHE_JS     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbb r5 = r12.zza(r0)     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ Exception -> 0x0105 }
            r0.zze.put(r5, new com.google.android.recaptcha.internal.zzbf(r5, r0.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ Exception -> 0x0105 }
            com.google.android.recaptcha.internal.zzh r0 = r10.zza     // Catch:{ Exception -> 0x0105 }
            r0.zzc(r6, r4)     // Catch:{ Exception -> 0x0105 }
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ Exception -> 0x0105 }
            r0.zza(r5)     // Catch:{ Exception -> 0x0105 }
            goto L_0x0114
        L_0x00cc:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzab     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ zzp -> 0x00fe }
            throw r0     // Catch:{ zzp -> 0x00fe }
        L_0x00d7:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ zzp -> 0x00fe }
            int r0 = r4.getResponseCode()     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzl r0 = X.C165617ti.A0J(r0)     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ zzp -> 0x00fe }
            throw r0     // Catch:{ zzp -> 0x00fe }
        L_0x00e8:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzaa     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ zzp -> 0x00fe }
            throw r0     // Catch:{ zzp -> 0x00fe }
        L_0x00f3:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzZ     // Catch:{ zzp -> 0x00fe }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ zzp -> 0x00fe }
            throw r0     // Catch:{ zzp -> 0x00fe }
        L_0x00fe:
            r1 = move-exception
            com.google.android.recaptcha.internal.zzbg r0 = r10.zzb     // Catch:{ Exception -> 0x011e }
            r0.zzb(r2, r1, r3)     // Catch:{ Exception -> 0x011e }
            throw r1     // Catch:{ Exception -> 0x011e }
        L_0x0105:
            com.google.android.recaptcha.internal.zzbg r2 = r10.zzb     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzn     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzaf     // Catch:{ Exception -> 0x011e }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ Exception -> 0x011e }
            r2.zzb(r5, r0, r3)     // Catch:{ Exception -> 0x011e }
        L_0x0114:
            java.lang.String r2 = r11.zzf     // Catch:{ Exception -> 0x011e }
            java.lang.String r1 = "JAVASCRIPT_TAG"
            r0 = 0
            java.lang.String r0 = X.AnonymousClass098.A05(r2, r1, r4, r0)     // Catch:{ Exception -> 0x011e }
            return r0
        L_0x011e:
            r1 = move-exception
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp
            if (r0 != 0) goto L_0x012b
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzX
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r3)
        L_0x012b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zzb(com.google.android.recaptcha.internal.zzoe, com.google.android.recaptcha.internal.zzbd):java.lang.String");
    }
}
