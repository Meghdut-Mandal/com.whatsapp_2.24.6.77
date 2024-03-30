package X;

/* renamed from: X.3wc  reason: invalid class name and case insensitive filesystem */
public class C81193wc implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C81193wc(C41301wz r2) {
        this.A02 = 42;
        this.A01 = r2;
    }

    public static void A00(AnonymousClass17Y r1, Object obj, Object obj2, int i) {
        r1.A0H(new C81193wc(obj, obj2, i));
    }

    public static void A01(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C81193wc(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cf, code lost:
        X.C39471sS.A01(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x043d, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0440, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04c4, code lost:
        if (r0.intValue() != 403) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0769, code lost:
        if (r3.A00.A02 == false) goto L_0x076b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x077f, code lost:
        if (r5.A01 == X.C023109s.A0C) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07d0, code lost:
        if (r5 == false) goto L_0x07d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a11, code lost:
        r2.A04(java.lang.Integer.valueOf(r0), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a18, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x08e0  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x08f7  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x08fb  */
    /* JADX WARNING: Removed duplicated region for block: B:462:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x098a;
                case 1: goto L_0x0043;
                case 2: goto L_0x0076;
                case 3: goto L_0x017d;
                case 4: goto L_0x0194;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01d3;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01f0;
                case 9: goto L_0x01fe;
                case 10: goto L_0x021c;
                case 11: goto L_0x0228;
                case 12: goto L_0x026d;
                case 13: goto L_0x0279;
                case 14: goto L_0x0294;
                case 15: goto L_0x02b0;
                case 16: goto L_0x02ef;
                case 17: goto L_0x030d;
                case 18: goto L_0x039a;
                case 19: goto L_0x03a8;
                case 20: goto L_0x03b8;
                case 21: goto L_0x03c7;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x03d6;
                case 25: goto L_0x040a;
                case 26: goto L_0x0429;
                case 27: goto L_0x0435;
                case 28: goto L_0x0441;
                case 29: goto L_0x045d;
                case 30: goto L_0x0478;
                case 31: goto L_0x0494;
                case 32: goto L_0x04b0;
                case 33: goto L_0x04cb;
                case 34: goto L_0x04e5;
                case 35: goto L_0x050e;
                case 36: goto L_0x051c;
                case 37: goto L_0x052b;
                case 38: goto L_0x0538;
                case 39: goto L_0x057e;
                case 40: goto L_0x058f;
                case 41: goto L_0x0628;
                case 42: goto L_0x0634;
                case 43: goto L_0x0657;
                case 44: goto L_0x0673;
                case 45: goto L_0x068c;
                case 46: goto L_0x094b;
                case 47: goto L_0x0957;
                case 48: goto L_0x0996;
                case 49: goto L_0x0a06;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.3OB r4 = (X.AnonymousClass3OB) r4
            java.lang.Object r0 = r3.A01
            X.0y6 r0 = (X.C20750y6) r0
            X.14x r3 = r0.iterator()
        L_0x0013:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0995
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            X.6EZ r1 = X.C133256Xm.A02(r2)
            X.18I r0 = r4.A07
            X.79X r2 = r0.A08(r2)
            X.189 r0 = r4.A05     // Catch:{ all -> 0x0037 }
            r0.A0E(r1)     // Catch:{ all -> 0x0037 }
            r0.A0R(r1)     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0013
            r2.close()
            goto L_0x0013
        L_0x0037:
            r1 = move-exception
            if (r2 == 0) goto L_0x0042
            r2.close()     // Catch:{ all -> 0x003e }
            throw r1
        L_0x003e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0042:
            throw r1
        L_0x0043:
            java.lang.Object r5 = r3.A00
            X.1uh r5 = (X.C40061uh) r5
            java.lang.Object r4 = r3.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.3Qa r0 = r4.A1J
            X.11F r3 = r0.A00
            if (r3 == 0) goto L_0x006c
            int r1 = r4.A0D
            r0 = 13
            r2 = 1
            if (r1 != r0) goto L_0x0061
            X.1Hr r1 = r5.A0b
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r1.A03(r3, r0, r2)
        L_0x0061:
            X.005 r0 = r5.A1C
            java.lang.Object r0 = r0.get()
            X.1NM r0 = (X.AnonymousClass1NM) r0
            r0.A0A(r3, r2)
        L_0x006c:
            X.1JN r1 = r5.A0D
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r1.A03(r0)
            return
        L_0x0076:
            java.lang.Object r5 = r3.A01
            X.1uh r5 = (X.C40061uh) r5
            if (r5 == 0) goto L_0x0995
            X.0xM r2 = r5.A0k
            X.11F r9 = r5.A0t
            boolean r0 = X.AnonymousClass143.A0G(r9)
            if (r0 != 0) goto L_0x00c2
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
        L_0x008a:
            java.util.ArrayList r1 = r5.A1D
            r1.clear()
            r1.addAll(r4)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00b1
            r4 = 8
            r0 = 0
        L_0x009b:
            X.3Fu r2 = new X.3Fu
            r2.<init>(r4, r0)
            java.lang.Object r0 = r3.A00
            X.31R r0 = (X.AnonymousClass31R) r0
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            X.00s r0 = r0.A00
            r0.A0C(r2)
            r3.A00 = r1
        L_0x00ae:
            r3.A01 = r1
            return
        L_0x00b1:
            r4 = 0
            X.0ts r0 = r5.A0h
            java.text.NumberFormat r2 = r0.A0M()
            int r0 = r1.size()
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            goto L_0x009b
        L_0x00c2:
            X.12q r1 = r2.A0I
            X.3Qp r0 = X.C36351kA.A0Z(r1, r9)
            if (r0 != 0) goto L_0x0179
            r6 = 1
        L_0x00cc:
            X.3Qp r0 = X.C36351kA.A0Z(r1, r9)
            if (r0 != 0) goto L_0x0175
            r0 = 1
        L_0x00d4:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r10 = 1
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00ec
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CoreMessageStore/get-important-messages empty jid="
            java.lang.String r0 = X.AnonymousClass000.A0l(r9, r0, r1)
        L_0x00e8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x008a
        L_0x00ec:
            java.lang.String r10 = "msgstore/get-important-messages"
            X.14g r8 = new X.14g
            r8.<init>((java.lang.String) r10)
            r10 = 3
            java.lang.String[] r10 = new java.lang.String[r10]
            r12 = 0
            X.163 r11 = r2.A0H
            X.C36331k8.A19(r11, r9, r10, r12)
            r11 = 1
            X.C36351kA.A1V(r10, r11, r6)
            r7 = 2
            X.17U r6 = r2.A0l
            long r0 = r6.A04(r0)
            X.C36351kA.A1V(r10, r7, r0)
            X.12P r0 = r2.A0c     // Catch:{ SQLiteDatabaseCorruptException -> 0x0151 }
            X.1M0 r7 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0151 }
            X.14e r6 = r7.A02     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = X.C56872x1.A00     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "GET_MESSAGES_RANGE_SQL"
            android.database.Cursor r6 = r6.A09(r1, r0, r10)     // Catch:{ all -> 0x0147 }
        L_0x011a:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x0134
            X.1A1 r0 = r2.A1B     // Catch:{ all -> 0x013b }
            X.3T1 r1 = r0.A01(r6, r9)     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x011a
            X.0wQ r0 = r2.A07     // Catch:{ all -> 0x013b }
            boolean r0 = X.C66013Ui.A0O(r0, r1)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x011a
            r4.add(r1)     // Catch:{ all -> 0x013b }
            goto L_0x011a
        L_0x0134:
            r6.close()     // Catch:{ all -> 0x0147 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0151 }
            goto L_0x015a
        L_0x013b:
            r1 = move-exception
            if (r6 == 0) goto L_0x0146
            r6.close()     // Catch:{ all -> 0x0142 }
            goto L_0x0146
        L_0x0142:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0147 }
        L_0x0146:
            throw r1     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x014c }
            goto L_0x0150
        L_0x014c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0151 }
        L_0x0150:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r2.A0b
            r0.A03()
        L_0x015a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CoreMessageStore/get-important-messages time spent:"
            r2.append(r0)
            long r0 = r8.A01()
            r2.append(r0)
            java.lang.String r0 = " found:"
            X.C36341k9.A1N(r0, r2, r4)
            java.lang.String r0 = r2.toString()
            goto L_0x00e8
        L_0x0175:
            long r0 = r0.A0L
            goto L_0x00d4
        L_0x0179:
            long r6 = r0.A0Q
            goto L_0x00cc
        L_0x017d:
            java.lang.Object r2 = r3.A00
            X.1sS r2 = (X.C39471sS) r2
            java.lang.Object r0 = r3.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.6tS r1 = r2.A01
            if (r1 == 0) goto L_0x0995
            byte[] r0 = r1.A0K(r0)
            r1.A0Q = r0
            X.6tS r1 = r2.A01
            X.2pW r0 = X.C52492pW.SMALL_THUMBNAIL_LOADED
            goto L_0x01cf
        L_0x0194:
            java.lang.Object r4 = r3.A00
            X.1sS r4 = (X.C39471sS) r4
            java.lang.Object r3 = r3.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.6tS r0 = r4.A01
            if (r0 == 0) goto L_0x0995
            X.1KK r2 = r4.A0K
            java.lang.String r1 = r2.A08(r3)
            if (r1 == 0) goto L_0x01b0
            X.6tS r0 = r4.A01
            r0.A0C = r1
            X.C39471sS.A04(r4, r3)
            return
        L_0x01b0:
            r1 = 0
            X.1cK r0 = r4.A0L
            r2.A0E(r0, r3, r1)
            return
        L_0x01b7:
            java.lang.Object r2 = r3.A00
            X.1sS r2 = (X.C39471sS) r2
            java.lang.Object r1 = r3.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.185 r0 = r2.A0P
            X.3L0 r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0995
            X.6tS r1 = r2.A01
            java.lang.String r0 = r0.A08
            r1.A0F = r0
            X.2pW r0 = X.C52492pW.PAGE_UPDATED
        L_0x01cf:
            X.C39471sS.A01(r1, r2, r0)
            return
        L_0x01d3:
            java.lang.Object r1 = r3.A00
            X.29Q r1 = (X.AnonymousClass29Q) r1
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0995
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ListView r1 = r2.A0A
            if (r1 == 0) goto L_0x01ec
            android.view.View r0 = r2.A06
            r1.removeHeaderView(r0)
        L_0x01ec:
            r0 = 0
            r2.A06 = r0
            return
        L_0x01f0:
            java.lang.Object r0 = r3.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r1 = r3.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1CR r0 = r0.A2f
            r0.A0T(r1)
            return
        L_0x01fe:
            java.lang.Object r4 = r3.A00
            X.3vW r4 = (X.C80513vW) r4
            java.lang.Object r2 = r4.A01
            X.397 r2 = (X.AnonymousClass397) r2
            int r1 = r2.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0995
            java.lang.Object r0 = r4.A02
            X.1Ak r0 = (X.C23931Ak) r0
            java.lang.Object r1 = r3.A01
            X.0X4 r1 = (X.AnonymousClass0X4) r1
            r2.A01 = r0
            X.0Ce r0 = r2.A03
            r1.A01(r0)
            return
        L_0x021c:
            java.lang.Object r1 = r3.A00
            com.whatsapp.crop.CropImage r1 = (com.whatsapp.crop.CropImage) r1
            java.lang.Object r0 = r3.A01
            X.3PL r0 = (X.AnonymousClass3PL) r0
            r1.A2j(r0)
            return
        L_0x0228:
            java.lang.Object r4 = r3.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r5 = r3.A01
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r0 = r5.getMessage()
            r3 = 0
            if (r0 == 0) goto L_0x0268
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "profileinfo/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "no-space"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            r1 = 2131889309(0x7f120c9d, float:1.9413278E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)
        L_0x025c:
            r4.setResult(r3, r0)
            java.lang.String r0 = "cropimage"
            com.whatsapp.util.Log.e(r0, r5)
            r4.finish()
            return
        L_0x0268:
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A01()
            goto L_0x025c
        L_0x026d:
            java.lang.Object r1 = r3.A00
            com.whatsapp.crop.CropImageView r1 = (com.whatsapp.crop.CropImageView) r1
            java.lang.Object r0 = r3.A01
            X.3Qg r0 = (X.AnonymousClass3Qg) r0
            r1.A08(r0)
            return
        L_0x0279:
            java.lang.Object r0 = r3.A00
            X.3uI r0 = (X.C79793uI) r0
            java.lang.Object r1 = r3.A01
            X.5Nh r1 = (X.C107265Nh) r1
            X.005 r0 = r0.A01
            java.lang.Object r3 = r0.get()
            X.16R r3 = (X.AnonymousClass16R) r3
            X.6by r0 = r1.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            int r0 = r1.A09
            long r0 = (long) r0
            r3.A03(r2, r0)
            return
        L_0x0294:
            java.lang.Object r1 = r3.A00
            X.3uI r1 = (X.C79793uI) r1
            java.lang.Object r0 = r3.A01
            X.5Nh r0 = (X.C107265Nh) r0
            X.6by r2 = r0.A04
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0995
            X.005 r0 = r1.A01
            java.lang.Object r1 = r0.get()
            X.16R r1 = (X.AnonymousClass16R) r1
            com.whatsapp.jid.UserJid r0 = r2.A01
            r1.A02(r0)
            return
        L_0x02b0:
            java.lang.Object r0 = r3.A00
            X.3pe r0 = (X.C76913pe) r0
            java.lang.Object r6 = r3.A01
            X.3Ah r6 = (X.C61033Ah) r6
            X.3E3 r5 = r0.A05
            X.1sS r4 = r5.A03
            X.6tS r2 = r4.A01
            boolean r0 = r2 instanceof X.AnonymousClass28U
            if (r0 == 0) goto L_0x0995
            X.28U r2 = (X.AnonymousClass28U) r2
            X.3FY r1 = r4.A0Q
            X.3PE r0 = r5.A01
            X.3BG r0 = r1.A01(r0, r6)
            r2.A0M(r0)
            X.00s r3 = r5.A00
            X.398 r2 = r5.A02
            r1 = 1
            X.36W r0 = new X.36W
            r0.<init>(r6, r2, r1)
            r3.A0C(r0)
            X.6tS r1 = r4.A01
            X.2pW r0 = X.C52492pW.WEB_PAGE_LOADED
            X.C39471sS.A01(r1, r4, r0)
            X.0wU r2 = r4.A0c
            r1 = 5
            X.3wU r0 = new X.3wU
            r0.<init>((X.AnonymousClass3E3) r5, (int) r1)
            r2.Boy(r0)
            return
        L_0x02ef:
            java.lang.Object r4 = r3.A00
            X.3pe r4 = (X.C76913pe) r4
            java.lang.Object r2 = r3.A01
            X.398 r2 = (X.AnonymousClass398) r2
            X.0xX r1 = r4.A00
            if (r1 == 0) goto L_0x0300
            X.19J r0 = r4.A04
            r0.unregisterObserver(r1)
        L_0x0300:
            X.3cb r1 = new X.3cb
            r1.<init>(r2, r4)
            r4.A00 = r1
            X.19J r0 = r4.A04
            r0.A00(r1)
            return
        L_0x030d:
            java.lang.Object r7 = r3.A00
            X.3pe r7 = (X.C76913pe) r7
            java.lang.Object r3 = r3.A01
            X.398 r3 = (X.AnonymousClass398) r3
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0995
            X.19A r6 = r7.A06
            java.lang.String r9 = r6.A09()
            r10 = 246(0xf6, float:3.45E-43)
            X.6QB r5 = X.C36421kH.A0T()
            java.lang.String r0 = "id"
            X.C36331k8.A1D(r5, r0, r9)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36331k8.A1D(r5, r1, r0)
            X.C36341k9.A1C(r5)
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "4"
            X.C36331k8.A1D(r5, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "fb:thrift_iq"
            X.C36331k8.A1D(r5, r1, r0)
            java.lang.String r2 = r3.A01
            java.lang.String r1 = "account_number"
            r4 = 0
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (X.AnonymousClass1AL[]) r4)
            r5.A05(r0)
            java.lang.String r2 = r3.A00
            java.lang.String r1 = "code"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (X.AnonymousClass1AL[]) r4)
            r5.A05(r0)
            java.lang.String r2 = r3.A02
            java.lang.String r1 = "expected_source_url"
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (X.AnonymousClass1AL[]) r4)
            r5.A05(r0)
            r0 = 1
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "support_icebreakers"
            java.lang.String r0 = "true"
            boolean r2 = X.C36371kC.A1Y(r1, r0, r4)
            java.lang.String r1 = "feature"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r4)
            r5.A05(r0)
            X.9nx r8 = r5.A03()
            r11 = 0
            boolean r0 = r6.A0K(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0995
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0396
            r7.A02 = r2
            X.17Y r1 = r7.A03
            r0 = 16
            A00(r1, r7, r3, r0)
            return
        L_0x0396:
            r7.BVN(r9)
            return
        L_0x039a:
            java.lang.Object r0 = r3.A00
            X.6sV r0 = (X.C144596sV) r0
            java.lang.Object r1 = r3.A01
            X.6Tt r1 = (X.C132446Tt) r1
            X.0wU r0 = r0.A0H
            X.C36331k8.A1F(r1, r0)
            return
        L_0x03a8:
            java.lang.Object r0 = r3.A00
            X.9YB r0 = (X.AnonymousClass9YB) r0
            java.lang.Object r1 = r3.A01
            X.3ty r1 = (X.C79593ty) r1
            X.16S r0 = r0.A01
            java.util.ArrayList r0 = r0.A09()
            goto L_0x043d
        L_0x03b8:
            java.lang.Object r0 = r3.A00
            X.9YB r0 = (X.AnonymousClass9YB) r0
            java.lang.Object r1 = r3.A01
            X.3ty r1 = (X.C79593ty) r1
            X.16S r0 = r0.A01
            java.util.ArrayList r0 = r0.A08()
            goto L_0x043d
        L_0x03c7:
            java.lang.Object r0 = r3.A00
            X.9YB r0 = (X.AnonymousClass9YB) r0
            java.lang.Object r1 = r3.A01
            X.3ty r1 = (X.C79593ty) r1
            X.16S r0 = r0.A01
            java.util.ArrayList r0 = r0.A0A()
            goto L_0x043d
        L_0x03d6:
            java.lang.Object r5 = r3.A00
            X.B1o r5 = (X.C23043B1o) r5
            java.lang.Object r4 = r3.A01
            X.0xM r4 = (X.C20310xM) r4
            boolean r0 = r5 instanceof X.AnonymousClass3T1
            if (r0 == 0) goto L_0x0995
            X.9uk r0 = r5.BA8()
            if (r0 == 0) goto L_0x0995
            X.9ui r3 = r0.A01
            if (r3 == 0) goto L_0x0995
            X.9uP r1 = r3.A09
            java.lang.String r0 = "canceled"
            r1.A01 = r0
            X.9uB r2 = r1.A02
            if (r2 == 0) goto L_0x0404
            java.lang.String r0 = r2.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0404
            X.9uP r1 = r3.A09
            java.lang.String r0 = r2.A01
            r1.A00 = r0
        L_0x0404:
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            r4.A0k(r5)
            return
        L_0x040a:
            java.lang.Object r5 = r3.A00
            X.3Pf r5 = (X.C64733Pf) r5
            java.lang.Object r4 = r3.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            X.19x r3 = r5.A04
            X.0wo r0 = r5.A00
            long r1 = X.C19970wo.A00(r0)
            r0 = 158(0x9e, float:2.21E-43)
            X.2bI r1 = r3.A02(r4, r0, r1)
            X.AnonymousClass00C.A08(r1)
            X.0xM r0 = r5.A03
            r0.A0P(r1)
            return
        L_0x0429:
            java.lang.Object r1 = r3.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r3.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x0435:
            java.lang.Object r1 = r3.A01
            X.3ty r1 = (X.C79593ty) r1
            java.lang.Boolean r0 = X.C36381kD.A0j()
        L_0x043d:
            r1.A0C(r0)
            return
        L_0x0441:
            java.lang.Object r0 = r3.A00
            com.whatsapp.deeplink.DeepLinkActivity r0 = (com.whatsapp.deeplink.DeepLinkActivity) r0
            X.0v5 r1 = r0.A07
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0995
            java.lang.Object r0 = r1.A02()
            X.005 r0 = (X.AnonymousClass005) r0
            r0.get()
            java.lang.String r0 = "isPremiumSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x045d:
            java.lang.Object r2 = r3.A00
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            java.lang.Object r1 = r3.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1DV r0 = r2.A0z
            int r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x0995
            X.1KI r2 = r2.A0y
            r1 = 4
            java.lang.Integer r0 = X.C36361kB.A0j()
            r2.A00(r0, r1, r3)
            return
        L_0x0478:
            java.lang.Object r1 = r3.A00
            java.lang.Object r2 = r3.A01
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r2 = (com.whatsapp.dialogs.DeleteOrArchiveChatDialog) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.List r1 = X.C36371kC.A11(r1)
            X.12t r2 = r2.A02
            if (r2 == 0) goto L_0x048d
            r0 = 3
            goto L_0x0a11
        L_0x048d:
            java.lang.String r0 = "chatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0494:
            java.lang.Object r4 = r3.A00
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            java.lang.Object r3 = r3.A01
            X.0wI r2 = r4.A06
            if (r2 == 0) goto L_0x04a9
            r1 = 32
            X.3wc r0 = new X.3wc
            r0.<init>(r4, r3, r1)
            r2.Bp3(r0)
            return
        L_0x04a9:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b0:
            java.lang.Object r4 = r3.A00
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            com.whatsapp.email.EmailVerificationActivity.A07(r4)
            if (r0 == 0) goto L_0x04c6
            int r1 = r0.intValue()
            r0 = 403(0x193, float:5.65E-43)
            r2 = 2
            if (r1 == r0) goto L_0x04c7
        L_0x04c6:
            r2 = 1
        L_0x04c7:
            X.AnonymousClass3SJ.A01(r4, r2)
            return
        L_0x04cb:
            java.lang.Object r0 = r3.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Object r2 = r3.A01
            X.3J6 r2 = (X.AnonymousClass3J6) r2
            android.view.Window r0 = r0.getWindow()
            r1 = 1
            r0.setSoftInputMode(r1)
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0995
            r2.A01(r1)
            return
        L_0x04e5:
            java.lang.Object r1 = r3.A00
            X.4WL r1 = (X.AnonymousClass4WL) r1
            java.lang.Object r3 = r3.A01
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0 = 0
            r1.A00 = r0
            java.lang.String r2 = r3.toString()
            java.lang.Object r1 = r1.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            java.lang.String r0 = r1.A0D
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0995
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0995
            java.lang.String r0 = r3.toString()
            com.whatsapp.emoji.search.EmojiSearchContainer.A00(r1, r0)
            return
        L_0x050e:
            java.lang.Object r4 = r3.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r2 = r3.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            r1 = 0
            r0 = 3
            r4.A0V(r2, r0, r1, r1)
            return
        L_0x051c:
            java.lang.Object r4 = r3.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r3 = r3.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            r2 = 0
            r1 = 1
            r0 = 3
            r4.A0V(r3, r0, r2, r1)
            return
        L_0x052b:
            java.lang.Object r2 = r3.A00
            X.3Jr r2 = (X.C63343Jr) r2
            java.lang.Object r1 = r3.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0538:
            java.lang.Object r5 = r3.A00
            X.3UT r5 = (X.AnonymousClass3UT) r5
            java.lang.Object r6 = r3.A01
            android.app.Activity r6 = (android.app.Activity) r6
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r5.A06
            if (r1 == 0) goto L_0x0548
            r0 = 5
            r1.A0W(r0)
        L_0x0548:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r4 = r5.A0A
            if (r4 == 0) goto L_0x055d
            X.1XN r3 = r5.A0N
            r0 = 4
            X.2uw r2 = new X.2uw
            r2.<init>(r5, r0)
            r1 = 1
            X.4Ww r0 = new X.4Ww
            r0.<init>(r5, r1)
            r4.A03(r6, r3, r0, r2)
        L_0x055d:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r5.A0A
            if (r0 == 0) goto L_0x0568
            com.whatsapp.InterceptingEditText r0 = r0.A04
            if (r0 == 0) goto L_0x0568
            X.C36421kH.A0r(r0)
        L_0x0568:
            com.whatsapp.KeyboardPopupLayout r3 = r5.A08
            if (r3 == 0) goto L_0x0995
            r0 = 4
            X.3v5 r2 = X.C80243v5.A00(r5, r0)
            r0 = 100
            float r1 = (float) r0
            float r0 = X.AnonymousClass3UT.A00(r5)
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x057e:
            java.lang.Object r1 = r3.A00
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r1
            java.lang.Object r0 = r3.A01
            X.0fE r0 = (X.C10790fE) r0
            X.17Y r2 = r1.A0E
            int r1 = r0.element
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x058f:
            java.lang.Object r4 = r3.A00
            X.39y r4 = (X.C609439y) r4
            java.lang.Object r3 = r3.A01
            android.content.Context r3 = (android.content.Context) r3
            X.2pN r0 = X.C52402pN.START     // Catch:{ Exception -> 0x061d }
            r4.A01 = r0     // Catch:{ Exception -> 0x061d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x061d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x061d }
            r4.A02 = r0     // Catch:{ Exception -> 0x061d }
            X.4eH r0 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r0 != 0) goto L_0x0601
            X.4eH r2 = new X.4eH     // Catch:{ Exception -> 0x061d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x061d }
            r4.A00 = r2     // Catch:{ Exception -> 0x061d }
            r1 = 0
            android.webkit.WebSettings r0 = r2.getSettings()     // Catch:{ Exception -> 0x061d }
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch:{ Exception -> 0x061d }
            android.webkit.WebSettings r0 = r2.getSettings()     // Catch:{ Exception -> 0x061d }
            r0.setGeolocationEnabled(r1)     // Catch:{ Exception -> 0x061d }
            android.webkit.WebSettings r0 = r2.getSettings()     // Catch:{ Exception -> 0x061d }
            r0.setSupportMultipleWindows(r1)     // Catch:{ Exception -> 0x061d }
            android.webkit.WebSettings r0 = r2.getSettings()     // Catch:{ Exception -> 0x061d }
            r0.setSaveFormData(r1)     // Catch:{ Exception -> 0x061d }
            X.4eH r0 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r0 == 0) goto L_0x05db
            X.2xP r0 = r0.getSecureSettings()     // Catch:{ Exception -> 0x061d }
            r1 = 1
            android.webkit.WebSettings r0 = r0.A00     // Catch:{ Exception -> 0x061d }
            r0.setJavaScriptEnabled(r1)     // Catch:{ Exception -> 0x061d }
        L_0x05db:
            X.4eH r0 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r0 == 0) goto L_0x05e9
            android.webkit.WebSettings r1 = r0.getSettings()     // Catch:{ Exception -> 0x061d }
            if (r1 == 0) goto L_0x05e9
            r0 = 2
            r1.setCacheMode(r0)     // Catch:{ Exception -> 0x061d }
        L_0x05e9:
            X.4eH r1 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r1 == 0) goto L_0x05f5
            X.6Ey r0 = new X.6Ey     // Catch:{ Exception -> 0x061d }
            r0.<init>()     // Catch:{ Exception -> 0x061d }
            r1.A02(r0)     // Catch:{ Exception -> 0x061d }
        L_0x05f5:
            X.4eH r1 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r1 == 0) goto L_0x0601
            X.218 r0 = new X.218     // Catch:{ Exception -> 0x061d }
            r0.<init>(r4)     // Catch:{ Exception -> 0x061d }
            r1.A03(r0)     // Catch:{ Exception -> 0x061d }
        L_0x0601:
            X.0yC r2 = r4.A04     // Catch:{ Exception -> 0x061d }
            r0 = 7153(0x1bf1, float:1.0023E-41)
            java.lang.String r0 = r2.A09(r0)     // Catch:{ Exception -> 0x061d }
            X.67A r0 = X.C36391kE.A0R(r0)     // Catch:{ Exception -> 0x061d }
            X.4eH r1 = r4.A00     // Catch:{ Exception -> 0x061d }
            if (r1 == 0) goto L_0x0995
            r1.A02 = r0     // Catch:{ Exception -> 0x061d }
            r0 = 7153(0x1bf1, float:1.0023E-41)
            java.lang.String r0 = r2.A09(r0)     // Catch:{ Exception -> 0x061d }
            r1.loadUrl(r0)     // Catch:{ Exception -> 0x061d }
            return
        L_0x061d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/FlowsWebPreloader.preloadWebView - Exception while preloading web url "
            X.C36321k7.A1W(r0, r1, r2)
            return
        L_0x0628:
            java.lang.Object r1 = r3.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r1
            java.lang.Object r0 = r3.A01
            X.4V2 r0 = (X.AnonymousClass4V2) r0
            com.whatsapp.gallery.MediaGalleryFragmentBase.A07(r0, r1)
            return
        L_0x0634:
            java.lang.Object r0 = r3.A01
            X.1wz r0 = (X.C41301wz) r0
            int r2 = r0.A02
            boolean r1 = r0.A07
            r0 = -1
            if (r1 == 0) goto L_0x0640
            r0 = 1
        L_0x0640:
            int r2 = r2 * r0
            java.lang.Object r1 = r3.A00
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0995
            r0 = 0
            r1.scrollBy(r0, r2)
            android.os.Handler r2 = r1.getHandler()
            if (r2 == 0) goto L_0x0995
            r0 = 10
            r2.postDelayed(r3, r0)
            return
        L_0x0657:
            java.lang.Object r4 = r3.A00
            X.2M8 r4 = (X.AnonymousClass2M8) r4
            java.lang.Object r3 = r3.A01
            android.view.View r3 = (android.view.View) r3
            int r2 = r4.A00
            r1 = 0
            if (r2 == 0) goto L_0x0667
            r0 = 1
            if (r2 == r0) goto L_0x066f
        L_0x0667:
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r4.A0M
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x066f
            r1 = 8
        L_0x066f:
            r3.setVisibility(r1)
            return
        L_0x0673:
            java.lang.Object r4 = r3.A00
            X.4vk r4 = (X.C100794vk) r4
            java.lang.Object r2 = r3.A01
            java.io.File r2 = (java.io.File) r2
            android.view.View r0 = r4.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r1)
            r0 = 0
            r4.BaW(r2, r0)
            return
        L_0x068c:
            java.lang.Object r0 = r3.A00
            X.6wd r0 = (X.C147076wd) r0
            java.lang.Object r3 = r3.A01
            X.3FS r3 = (X.AnonymousClass3FS) r3
            X.21D r1 = X.AnonymousClass21D.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r1)
            r11 = 0
            r1 = 1
            if (r2 == 0) goto L_0x0709
            r12 = 0
            X.3Q3 r10 = new X.3Q3
            r10.<init>(r11, r12, r12)
            X.3QS r9 = new X.3QS
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x06b2:
            boolean r2 = r9.A00
            if (r2 == 0) goto L_0x0707
            boolean r2 = r0.A0C
            if (r2 != 0) goto L_0x0707
            boolean r2 = r0.A0D
            if (r2 != 0) goto L_0x0707
            boolean r2 = r0.A0B
            if (r2 == 0) goto L_0x0707
            boolean r2 = r0.A0A
            if (r2 == 0) goto L_0x0707
        L_0x06c6:
            r9.A00 = r1
            com.whatsapp.glasses.layouts.SupToggle r4 = r0.A05
            if (r4 == 0) goto L_0x0995
            r4.setViewVisible(r1)
            boolean r6 = r9.A03
            boolean r2 = r9.A05
            android.widget.ImageView r0 = r4.A04
            if (r6 == 0) goto L_0x07a9
            r5 = 0
            r0.setEnabled(r5)
            android.widget.ImageView r0 = r4.A03
            r0.setEnabled(r5)
            com.whatsapp.glasses.layouts.StatusIndicator r3 = r4.A0D
            com.whatsapp.glasses.layouts.StatusIndicator.A01(r3)
            android.widget.ImageView r2 = r3.A0I
            int r1 = r3.A01
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            r2.setVisibility(r5)
            android.widget.TextView r1 = r3.A0M
            r0 = 2131886091(0x7f12000b, float:1.9406751E38)
            r1.setText(r0)
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A03
            if (r1 != 0) goto L_0x0799
            java.lang.String r0 = "statusIndicatorCollapsedOutline"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0707:
            r1 = 0
            goto L_0x06c6
        L_0x0709:
            X.21C r2 = X.AnonymousClass21C.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 != 0) goto L_0x0995
            boolean r2 = r3 instanceof X.AnonymousClass21E
            if (r2 == 0) goto L_0x073a
            X.21E r3 = (X.AnonymousClass21E) r3
            boolean r4 = r3.A00
            r2 = 2131886098(0x7f120012, float:1.9406765E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r3 = 0
            X.3Q3 r2 = new X.3Q3
            r2.<init>(r11, r3, r3)
            X.3QS r9 = new X.3QS
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r10 = r9
            r11 = r2
            r19 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x06b2
        L_0x073a:
            X.21B r2 = X.AnonymousClass21B.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x0759
            r2 = 0
            X.3Q3 r10 = new X.3Q3
            r10.<init>(r11, r2, r2)
            X.3QS r9 = new X.3QS
            r12 = 1
            r13 = 0
            r14 = 1
            r15 = 1
            r16 = 0
            r17 = 1
            r18 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x06b2
        L_0x0759:
            boolean r2 = r3 instanceof X.AnonymousClass21A
            if (r2 == 0) goto L_0x0946
            X.21A r3 = (X.AnonymousClass21A) r3
            boolean r13 = r3.A01
            if (r13 == 0) goto L_0x076b
            X.217 r2 = r3.A00
            boolean r2 = r2.A02
            r18 = 1
            if (r2 != 0) goto L_0x076d
        L_0x076b:
            r18 = 0
        L_0x076d:
            r7 = 2131896242(0x7f1227b2, float:1.942734E38)
            X.217 r2 = r3.A00
            boolean r6 = r2.A03
            X.9QU r5 = r2.A00
            boolean r2 = r2.A01
            if (r2 == 0) goto L_0x0781
            java.lang.Integer r4 = r5.A01
            java.lang.Integer r3 = X.C023109s.A0C
            r2 = 1
            if (r4 != r3) goto L_0x0782
        L_0x0781:
            r2 = 0
        L_0x0782:
            X.3Q3 r10 = new X.3Q3
            r10.<init>(r5, r6, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r15 = 0
            X.3QS r9 = new X.3QS
            r12 = 1
            r14 = r13
            r16 = 1
            r17 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x06b2
        L_0x0799:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r3.setTranslationY(r0)
            r3.A02()
            r3.A02()
            goto L_0x07b9
        L_0x07a9:
            r1 = 1
            r0.setEnabled(r1)
            android.widget.ImageView r0 = r4.A03
            r0.setEnabled(r1)
            if (r2 == 0) goto L_0x07b9
            com.whatsapp.glasses.layouts.StatusIndicator r0 = r4.A0D
            r0.A02()
        L_0x07b9:
            boolean r5 = r9.A04
            X.3Q3 r8 = r9.A01
            X.9QU r7 = r8.A00
            if (r7 == 0) goto L_0x088f
            java.lang.Integer r1 = r7.A01
        L_0x07c3:
            java.lang.Integer r0 = X.C023109s.A0C
            boolean r2 = X.C36361kB.A1a(r1, r0)
            android.view.View r1 = r4.A08
            if (r2 != 0) goto L_0x07d2
            if (r6 != 0) goto L_0x07d2
            r0 = 0
            if (r5 != 0) goto L_0x07d4
        L_0x07d2:
            r0 = 8
        L_0x07d4:
            r1.setVisibility(r0)
            if (r2 != 0) goto L_0x0889
            if (r6 != 0) goto L_0x0889
            android.widget.ImageView r2 = r4.A04
            if (r5 == 0) goto L_0x0885
            int r1 = r4.A06
        L_0x07e1:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            if (r5 != 0) goto L_0x083c
            int r2 = r4.A02
            android.view.View r1 = r4.A09
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            android.animation.LayoutTransition r3 = r4.getLayoutTransition()
            android.widget.RelativeLayout r2 = r4.A0B
            android.widget.ImageView r0 = r4.A03
            r1 = 8
            r3.hideChild(r2, r0, r1)
            android.widget.ImageView r0 = r4.A03
            r0.setVisibility(r1)
        L_0x0807:
            boolean r0 = r9.A06
            r4.setStatusIndicatorVisibility(r0)
            boolean r2 = r9.A07
            java.lang.Integer r0 = r9.A02
            if (r0 == 0) goto L_0x0824
            int r1 = r0.intValue()
            android.widget.TextView r0 = r4.A0C
            r0.setText(r1)
            android.view.View r1 = r4.A0A
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
        L_0x0824:
            boolean r0 = r8.A01
            r4.setDoublePressPromptVisibility(r0)
            if (r7 == 0) goto L_0x0995
            boolean r8 = r8.A02
            if (r8 == 0) goto L_0x08a7
            com.whatsapp.glasses.layouts.StatusIndicator r2 = r4.A0D
            android.widget.ImageView r1 = r2.A03
            if (r1 != 0) goto L_0x0892
            java.lang.String r0 = "statusIndicatorCollapsedOutline"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x083c:
            android.widget.ImageView r0 = r4.A03
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0807
            int r3 = r4.A07
            int[] r2 = X.C36441kJ.A1O()
            r1 = 0
            android.view.View r0 = r4.A09
            int r0 = r0.getHeight()
            r2[r1] = r0
            android.animation.ValueAnimator r2 = X.C36411kG.A0C(r2, r3)
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r2.setInterpolator(r0)
            X.3Ut r0 = new X.3Ut
            r0.<init>(r2, r4)
            r2.addUpdateListener(r0)
            r2.start()
            android.animation.LayoutTransition r3 = r4.getLayoutTransition()
            android.widget.RelativeLayout r2 = r4.A0B
            android.widget.ImageView r1 = r4.A03
            r0 = 8
            r3.showChild(r2, r1, r0)
            android.widget.ImageView r1 = r4.A03
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0807
        L_0x0885:
            int r1 = r4.A01
            goto L_0x07e1
        L_0x0889:
            android.widget.ImageView r2 = r4.A04
            int r1 = r4.A00
            goto L_0x07e1
        L_0x088f:
            r1 = 0
            goto L_0x07c3
        L_0x0892:
            r0 = 8
            r1.setVisibility(r0)
            if (r5 == 0) goto L_0x08a5
            float r0 = r2.A0E
        L_0x089b:
            r2.setTranslationY(r0)
            r2.A03(r7)
            r2.A02()
            goto L_0x08ae
        L_0x08a5:
            r0 = 0
            goto L_0x089b
        L_0x08a7:
            if (r6 != 0) goto L_0x08ae
            com.whatsapp.glasses.layouts.StatusIndicator r0 = r4.A0D
            r0.A04(r7, r5)
        L_0x08ae:
            com.whatsapp.glasses.layouts.StatusIndicator r6 = r4.A0D
            r9 = 0
            boolean r0 = r7 instanceof X.C169728Al
            if (r0 == 0) goto L_0x0919
            android.widget.ImageView r2 = r6.A0I
            int r1 = r6.A0G
        L_0x08b9:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x08be:
            X.6cv r3 = X.C135576cv.A00
            r2 = 1
            X.AnonymousClass00C.A0D(r3, r2)
            boolean r0 = r7 instanceof X.C169688Ah
            if (r0 != 0) goto L_0x08fb
            X.8Ab r0 = X.C169628Ab.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x08fb
            X.4rp r0 = X.C98684rp.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x08fb
            X.4ro r0 = X.C98674ro.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x08fb
            android.widget.TextView r1 = r6.A0L
            r1.setClickable(r9)
            android.graphics.Typeface r0 = r1.getTypeface()
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r9)
            r1.setTypeface(r0)
            int r0 = r6.A0G
        L_0x08f2:
            r1.setTextColor(r0)
            if (r8 == 0) goto L_0x0995
            r6.A03(r7)
            return
        L_0x08fb:
            android.widget.LinearLayout r1 = r6.A04
            r0 = 35
            X.3v5 r0 = X.C80243v5.A00(r6, r0)
            r1.post(r0)
            android.widget.TextView r1 = r6.A0L
            r1.setOnClickListener(r3)
            android.graphics.Typeface r0 = r1.getTypeface()
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            r1.setTypeface(r0)
            int r0 = r6.A00
            goto L_0x08f2
        L_0x0919:
            boolean r0 = r7 instanceof X.C169688Ah
            if (r0 == 0) goto L_0x0922
            android.widget.ImageView r2 = r6.A0I
            int r1 = r6.A0F
            goto L_0x08b9
        L_0x0922:
            boolean r0 = r7 instanceof X.C169618Aa
            if (r0 == 0) goto L_0x08be
            android.widget.TextView r5 = r6.A0K
            android.view.View r0 = r6.A0H
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131896241(0x7f1227b1, float:1.9427338E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = r7
            X.8Aa r0 = (X.C169618Aa) r0
            long r0 = r0.A00
            X.AnonymousClass000.A1M(r2, r9, r0)
            java.lang.String r0 = r4.getString(r3, r2)
            r5.setText(r0)
            goto L_0x08be
        L_0x0946:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x094b:
            java.lang.Object r1 = r3.A00
            X.6VU r1 = (X.AnonymousClass6VU) r1
            java.lang.Object r0 = r3.A01
            X.5v1 r0 = (X.C122545v1) r0
            X.AnonymousClass6VU.A04(r1, r0)
            return
        L_0x0957:
            java.lang.Object r2 = r3.A00
            X.5Ly r2 = (X.C106945Ly) r2
            int r1 = r2.A06()
            r0 = 2
            if (r1 == r0) goto L_0x0979
            X.6VU r0 = r2.A01
            X.7jR r0 = r0.A03
            if (r0 == 0) goto L_0x0979
            android.os.Handler r1 = X.C36341k9.A0H()
            r0 = 38
            X.3v5 r0 = X.C80243v5.A00(r2, r0)
            r1.post(r0)
            r0 = 1
            r2.A0D(r0)
        L_0x0979:
            java.lang.Object r0 = r3.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r3)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0995
            r0.quit()
            return
        L_0x098a:
            java.lang.Object r1 = r3.A00
            X.1uh r1 = (X.C40061uh) r1
            java.lang.Object r0 = r3.A01
            X.36f r0 = (X.C600336f) r0
            r1.A0Y(r0)
        L_0x0995:
            return
        L_0x0996:
            java.lang.Object r6 = r3.A00
            X.39E r6 = (X.AnonymousClass39E) r6
            java.lang.Object r5 = r3.A01
            X.3OK r5 = (X.AnonymousClass3OK) r5
            java.util.ArrayList r10 = X.C36341k9.A0l(r6)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Map r7 = r6.A03
            java.util.Iterator r4 = X.AnonymousClass000.A10(r7)
            r9 = 0
        L_0x09ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09d6
            java.lang.Object r3 = r4.next()
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.Object r2 = r7.get(r3)
            X.34o r2 = (X.C596034o) r2
            if (r2 == 0) goto L_0x09ad
            if (r9 != 0) goto L_0x09c9
            long r0 = r2.A00
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x09c9:
            java.lang.String r0 = r3.getRawString()
            r10.add(r0)
            java.lang.String r0 = r2.A01
            r11.add(r0)
            goto L_0x09ad
        L_0x09d6:
            X.14u r0 = r5.A05
            X.01z r4 = r0.getSupportFragmentManager()
            java.util.Set r2 = r7.keySet()
            android.content.Context r7 = r5.A03
            java.util.ArrayList r12 = r6.A01
            X.147 r8 = r6.A00
            r13 = 2
            android.content.Intent r1 = X.AnonymousClass190.A0f(r7, r8, r9, r10, r11, r12, r13)
            int r3 = r5.A02
            boolean r0 = r5.A0J
            android.os.Bundle r2 = com.whatsapp.invites.PromptSendGroupInviteDialogFragment.A03(r1, r2, r0)
            com.whatsapp.invites.PromptSendGroupInviteDialogFragment r1 = new com.whatsapp.invites.PromptSendGroupInviteDialogFragment
            r1.<init>()
            java.lang.String r0 = "invite_intent_code"
            r2.putInt(r0, r3)
            r1.A17(r2)
            java.lang.String r0 = "PromptSendGroupInvite"
            r1.A1i(r4, r0)
            return
        L_0x0a06:
            java.lang.Object r0 = r3.A00
            com.whatsapp.group.ExitGroupsDialogFragment r0 = (com.whatsapp.group.ExitGroupsDialogFragment) r0
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            X.12t r2 = r0.A06
            r0 = 2
        L_0x0a11:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81193wc.run():void");
    }

    public C81193wc(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
