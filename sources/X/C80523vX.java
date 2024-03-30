package X;

/* renamed from: X.3vX  reason: invalid class name and case insensitive filesystem */
public class C80523vX implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C80523vX(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.2PE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.2Po} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.2PE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: X.2PE} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0261, code lost:
        if (r2 != 4) goto L_0x0259;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A04
            switch(r0) {
                case 0: goto L_0x0274;
                case 1: goto L_0x0264;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01b6;
                case 5: goto L_0x01a4;
                case 6: goto L_0x0179;
                case 7: goto L_0x0155;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00a1;
                case 10: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.3KW r1 = (X.AnonymousClass3KW) r1
            java.lang.Object r4 = r10.A02
            android.content.Context r4 = (android.content.Context) r4
            int r3 = r10.A00
            java.lang.String r2 = r10.A03
            X.17Y r0 = r1.A00
            X.14r r0 = r0.A00
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "banmanager/startPermanentBanFlow/showLoginFailureNotificationIfNeeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ww r0 = r1.A07
            r0.A0A()
            return
        L_0x0022:
            java.lang.String r0 = "banmanager/startPermanentBanFlow/launching-banappeals"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r0 = 3
            android.content.Intent r1 = X.AnonymousClass190.A1A(r4, r2, r3, r0, r1)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r1.setFlags(r0)
            r4.startActivity(r1)
            return
        L_0x0037:
            java.lang.Object r2 = r10.A01
            X.3pI r2 = (X.C76693pI) r2
            java.lang.Object r8 = r10.A02
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = r10.A03
            int r9 = r10.A00
            X.1XF r1 = r2.A03     // Catch:{ IOException -> 0x009a }
            X.0wo r4 = r1.A00     // Catch:{ IOException -> 0x009a }
            X.0wG r0 = r1.A01     // Catch:{ IOException -> 0x009a }
            android.content.Context r3 = r0.A00     // Catch:{ IOException -> 0x009a }
            X.0v0 r5 = r1.A02     // Catch:{ IOException -> 0x009a }
            X.32l r6 = new X.32l     // Catch:{ IOException -> 0x009a }
            r6.<init>(r2)     // Catch:{ IOException -> 0x009a }
            X.C133306Xt.A01(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x009a }
            r0 = 2
            if (r9 != r0) goto L_0x006c
            X.1XG r1 = r1.A03     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x009a }
            X.1XH r3 = r1.A01     // Catch:{ IOException -> 0x009a }
            boolean r0 = r3.A01()     // Catch:{ IOException -> 0x009a }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken/not eligible"
        L_0x0069:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x009a }
        L_0x006c:
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x009a }
            goto L_0x0099
        L_0x0072:
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ IOException -> 0x009a }
            X.0wG r0 = r1.A00     // Catch:{ IOException -> 0x009a }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x009a }
            r0 = 2
            byte[] r1 = X.C133306Xt.A05(r1, r0)     // Catch:{ IOException -> 0x009a }
            if (r1 != 0) goto L_0x0084
            java.lang.String r0 = "FoaBackupTokenSender/sendFoaBackupToken/foa backup token is null"
            goto L_0x0069
        L_0x0084:
            r0 = 3
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "foa_backup_token"
            r2.putString(r0, r1)     // Catch:{ IOException -> 0x009a }
            X.1kc r1 = new X.1kc     // Catch:{ IOException -> 0x009a }
            r1.<init>()     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "com.facebook.SET_FOA_BACKUP_TOKEN"
            r3.A00(r1, r2, r0)     // Catch:{ IOException -> 0x009a }
            goto L_0x006c
        L_0x0099:
            return
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x00a1:
            java.lang.Object r5 = r10.A01
            X.3PX r5 = (X.AnonymousClass3PX) r5
            java.lang.Object r4 = r10.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r1 = r10.A00
            java.lang.String r3 = r10.A03
            X.629 r0 = r5.A01
            X.58T r2 = r0.A00(r4, r1)
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "cta"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x00bd }
            goto L_0x00c2
        L_0x00bd:
            java.lang.String r0 = "MessageWithLinkLogging/getEventAttributes failed to construct message class attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00c2:
            java.lang.String r0 = r1.toString()
            r2.A07 = r0
            boolean r0 = r4 instanceof X.AnonymousClass2cW
            if (r0 == 0) goto L_0x00da
            X.2cW r4 = (X.AnonymousClass2cW) r4
            X.3F4 r0 = r4.A00
            java.lang.String r0 = r0.A05
        L_0x00d2:
            r2.A08 = r0
            X.0yW r0 = r5.A00
            r0.Blv(r2)
            return
        L_0x00da:
            r0 = 0
            goto L_0x00d2
        L_0x00dc:
            java.lang.Object r4 = r10.A01
            X.5KA r4 = (X.AnonymousClass5KA) r4
            java.lang.String r7 = r10.A03
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r6 = r4.A04
            r1.append(r6)
            java.lang.String r5 = "/"
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = "; async task started, start_id="
            X.C36321k7.A1T(r0, r1, r3)
            r2.run()     // Catch:{ Exception -> 0x0102 }
            goto L_0x0124
        L_0x0102:
            r8 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0142 }
            X.AnonymousClass000.A1D(r6, r5, r7, r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "; async task failed, start_id="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x0142 }
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x0142 }
            X.0wN r2 = r4.A00     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0l(r8, r0, r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "xpm-export-service-error"
            r2.A0D(r0, r1, r8)     // Catch:{ all -> 0x0142 }
        L_0x0124:
            monitor-enter(r4)
            X.B6T r1 = r4.A03     // Catch:{ all -> 0x013f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013f }
            r1.remove(r0)     // Catch:{ all -> 0x013f }
            X.AnonymousClass5KA.A00(r4)     // Catch:{ all -> 0x013f }
            monitor-exit(r4)     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r6, r5, r7, r1)
            java.lang.String r0 = "; async task completed, start_id="
            X.C36321k7.A1T(r0, r1, r3)
            return
        L_0x013f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            r2 = move-exception
            monitor-enter(r4)
            X.B6T r1 = r4.A03     // Catch:{ all -> 0x0152 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0152 }
            r1.remove(r0)     // Catch:{ all -> 0x0152 }
            X.AnonymousClass5KA.A00(r4)     // Catch:{ all -> 0x0152 }
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            throw r2
        L_0x0152:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            throw r0
        L_0x0155:
            int r0 = r10.A00
            java.lang.String r3 = r10.A03
            java.lang.Object r2 = r10.A01
            X.3Os r2 = (X.AnonymousClass3Os) r2
            java.lang.Object r1 = r10.A02
            X.11F r1 = (X.AnonymousClass11F) r1
            X.2Po r4 = new X.2Po
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            r4.A02 = r3
            X.0wQ r0 = r2.A00
            java.lang.String r0 = X.C54662tJ.A00(r0, r1)
            r4.A01 = r0
            X.0yW r0 = r2.A01
            goto L_0x019e
        L_0x0179:
            int r0 = r10.A00
            java.lang.String r3 = r10.A03
            java.lang.Object r2 = r10.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r1 = r10.A02
            X.3PR r1 = (X.AnonymousClass3PR) r1
            X.2PE r4 = new X.2PE
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            r4.A01 = r3
            if (r2 == 0) goto L_0x01a2
            X.0wQ r0 = r1.A00
            java.lang.String r0 = X.C54662tJ.A00(r0, r2)
        L_0x019a:
            r4.A02 = r0
            X.0yW r0 = r1.A01
        L_0x019e:
            r0.Bly(r4)
            return
        L_0x01a2:
            r0 = 0
            goto L_0x019a
        L_0x01a4:
            java.lang.Object r0 = r10.A01
            X.2Wm r0 = (X.C46332Wm) r0
            java.lang.Object r3 = r10.A02
            X.4Qn r3 = (X.C87884Qn) r3
            java.lang.String r2 = r10.A03
            int r1 = r10.A00
            boolean r0 = r0.A01
            r3.BZi(r2, r1, r0)
            return
        L_0x01b6:
            java.lang.String r4 = r10.A03
            java.lang.Object r2 = r10.A01
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            java.lang.Object r3 = r10.A02
            X.3Jr r3 = (X.C63343Jr) r3
            int r1 = r10.A00
            X.AnonymousClass00C.A0B(r2)
            X.1H2 r0 = r3.A01
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3SX.A00(r2, r0, r4)
            r0 = 0
            r2.setBounds(r0, r0, r1, r1)
            X.17Y r1 = r3.A00
            r0 = 37
            X.C81193wc.A00(r1, r3, r2, r0)
            return
        L_0x01d7:
            java.lang.Object r0 = r10.A01
            X.6W1 r0 = (X.AnonymousClass6W1) r0
            java.lang.String r3 = r10.A03
            java.lang.Object r2 = r10.A02
            com.whatsapp.voipcalling.CallInfo r2 = (com.whatsapp.voipcalling.CallInfo) r2
            int r6 = r10.A00
            java.util.UUID r4 = java.util.UUID.randomUUID()
            X.AnonymousClass00C.A08(r4)
            r5 = 16
            r7 = 1
            X.6Dh r1 = new X.6Dh
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A00 = r1
            return
        L_0x01f5:
            java.lang.Object r0 = r10.A01
            X.3pg r0 = (X.C76933pg) r0
            int r4 = r10.A00
            java.lang.String r2 = r10.A03
            java.lang.Object r3 = r10.A02
            java.lang.Number r3 = (java.lang.Number) r3
            X.C76933pg.A00(r0)
            X.9nj r6 = r0.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncResponseHandler/onGlobalError request failed with global error code="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", text="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", backoffMs="
            X.C36321k7.A1J(r3, r0, r1)
            X.0wy r2 = X.C203289nj.A0K
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r2.containsKey(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0239
            java.lang.Object r0 = r2.get(r1)
            X.C18740tg.A06(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r6.A06(r0, r5)
            return
        L_0x0239:
            int r2 = r4 / 100
            r0 = 5
            if (r2 != r0) goto L_0x025e
            r4 = 1
            X.1Cm r0 = r6.A0I
            java.lang.Long r5 = r0.A00()
            if (r3 == 0) goto L_0x0259
            if (r5 == 0) goto L_0x0259
            long r2 = r3.longValue()
            long r0 = r5.longValue()
            long r0 = java.lang.Math.max(r2, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x0259:
            r1 = 0
        L_0x025a:
            X.C203289nj.A01(r6, r5, r4, r1)
            return
        L_0x025e:
            r4 = 0
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x025a
            goto L_0x0259
        L_0x0264:
            java.lang.Object r3 = r10.A01
            X.6WM r3 = (X.AnonymousClass6WM) r3
            java.lang.String r2 = r10.A03
            java.lang.Object r1 = r10.A02
            byte[] r1 = (byte[]) r1
            int r0 = r10.A00
            X.AnonymousClass6WM.A02(r3, r2, r1, r0)
            return
        L_0x0274:
            java.lang.Object r3 = r10.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r3 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r3
            java.lang.Object r2 = r10.A02
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r10.A00
            java.lang.String r0 = r10.A03
            r3.m15lambda$showCallNotAllowedActivity$8$comwhatsappcallingserviceVoiceServiceEventCallback(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80523vX.run():void");
    }
}
