package X;

/* renamed from: X.1jE  reason: invalid class name and case insensitive filesystem */
public class C35771jE implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35771jE(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.2OU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.2NQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.2OU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.2OU} */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02fa, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        if (r1 != false) goto L_0x00df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x030c;
                case 1: goto L_0x012e;
                case 2: goto L_0x0110;
                case 3: goto L_0x02fe;
                case 4: goto L_0x02c7;
                case 5: goto L_0x02ba;
                case 6: goto L_0x02ab;
                case 7: goto L_0x029f;
                case 8: goto L_0x0290;
                case 9: goto L_0x01f8;
                case 10: goto L_0x00ee;
                case 11: goto L_0x01ea;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00a5;
                case 14: goto L_0x01c9;
                case 15: goto L_0x01b2;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0083;
                case 19: goto L_0x0066;
                case 20: goto L_0x01a6;
                case 21: goto L_0x0195;
                case 22: goto L_0x001a;
                case 23: goto L_0x015e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.6Tt r0 = (X.C132446Tt) r0
            java.lang.Object r2 = r11.A01
            X.4Tn r2 = (X.C88654Tn) r2
            r1 = 1
            X.4c6 r0 = r0.A02
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x0019
            r2.B3l()
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r7 = r11.A00
            X.12u r7 = (X.C220812u) r7
            java.lang.Object r5 = r11.A01
            java.util.concurrent.CountDownLatch r5 = (java.util.concurrent.CountDownLatch) r5
            X.0zN r2 = r7.A06     // Catch:{ all -> 0x031e }
            r0 = 2863(0xb2f, float:4.012E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x031e }
            int r0 = X.C20800yB.A00(r1, r2, r0)     // Catch:{ all -> 0x031e }
            long r3 = (long) r0     // Catch:{ all -> 0x031e }
            r0 = 2864(0xb30, float:4.013E-42)
            int r6 = X.C20800yB.A00(r1, r2, r0)     // Catch:{ all -> 0x031e }
        L_0x0033:
            X.134 r2 = r7.A05     // Catch:{ all -> 0x031e }
            X.130 r0 = r7.A04     // Catch:{ all -> 0x031e }
            byte[] r1 = r0.A0J()     // Catch:{ all -> 0x031e }
            java.lang.String r0 = X.AnonymousClass134.A00(r2)     // Catch:{ all -> 0x031e }
            byte[] r2 = X.AnonymousClass134.A02(r2, r0, r1)     // Catch:{ all -> 0x031e }
            if (r2 == 0) goto L_0x0056
            X.00b r0 = r7.A08     // Catch:{ all -> 0x031e }
            com.whatsapp.wamsys.JniBridge r0 = (com.whatsapp.wamsys.JniBridge) r0     // Catch:{ all -> 0x031e }
            java.util.concurrent.atomic.AtomicReference r0 = r0.wajContext     // Catch:{ all -> 0x031e }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x031e }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x031e }
            r0 = 1
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r1, r2)     // Catch:{ all -> 0x031e }
            goto L_0x0060
        L_0x0056:
            android.os.SystemClock.sleep(r3)     // Catch:{ all -> 0x031e }
            r0 = 2
            long r3 = r3 * r0
            int r6 = r6 + -1
            if (r6 >= 0) goto L_0x0033
        L_0x0060:
            if (r5 == 0) goto L_0x0019
            r5.countDown()
            return
        L_0x0066:
            java.lang.Object r1 = r11.A00
            X.1GX r1 = (X.AnonymousClass1GX) r1
            java.lang.Object r3 = r11.A01
            java.io.File r3 = (java.io.File) r3
            X.0y0 r0 = r1.A00     // Catch:{ IOException -> 0x0326 }
            boolean r0 = r0.A0j(r3)     // Catch:{ IOException -> 0x0326 }
            if (r0 == 0) goto L_0x0019
            X.0wG r0 = r1.A02     // Catch:{ IOException -> 0x0326 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x0326 }
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x0326 }
            X.AnonymousClass1GW.A0O(r1, r0)     // Catch:{ IOException -> 0x0326 }
            goto L_0x0325
        L_0x0083:
            java.lang.Object r1 = r11.A00
            X.35p r1 = (X.C598735p) r1
            X.0Bk r3 = r1.A00
            boolean r0 = r3.A06()
            if (r0 != 0) goto L_0x0019
            java.lang.Object r2 = r11.A01
            X.1S4 r2 = (X.AnonymousClass1S4) r2
            X.08V r0 = r2.A02
            java.lang.Object r1 = r0.apply(r1)
            boolean r0 = r3.A06()
            if (r0 != 0) goto L_0x0019
            X.08S r0 = r2.A03
            r0.A0C(r1)
            return
        L_0x00a5:
            java.lang.Object r1 = r11.A00
            X.1E4 r1 = (X.AnonymousClass1E4) r1
            java.lang.Object r0 = r11.A01
            X.11F r0 = (X.AnonymousClass11F) r0
            java.lang.Integer r0 = X.AnonymousClass1E4.A00(r0, r1)
            if (r0 == 0) goto L_0x0019
            X.2NQ r4 = new X.2NQ
            r4.<init>()
            r4.A00 = r0
            X.0yW r0 = r1.A01
            goto L_0x00ea
        L_0x00bd:
            java.lang.Object r3 = r11.A00
            X.1E4 r3 = (X.AnonymousClass1E4) r3
            java.lang.Object r1 = r11.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Integer r2 = X.AnonymousClass1E4.A00(r1, r3)
            if (r2 == 0) goto L_0x0019
            X.2OU r4 = new X.2OU
            r4.<init>()
            X.1Cv r0 = r3.A00
            X.3T1 r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x00df
            X.3Qa r0 = r0.A1J
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x00e0
        L_0x00df:
            r0 = 1
        L_0x00e0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            r4.A01 = r2
            X.0yW r0 = r3.A01
        L_0x00ea:
            r0.Bly(r4)
            return
        L_0x00ee:
            java.lang.Object r0 = r11.A00
            X.1BI r0 = (X.AnonymousClass1BI) r0
            java.lang.Object r2 = r11.A01
            X.68B r2 = (X.AnonymousClass68B) r2
            X.1BB r0 = r0.A02
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0100:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r1.next()
            X.6Fn r0 = (X.C129156Fn) r0
            r0.A09(r2)
            goto L_0x0100
        L_0x0110:
            java.lang.Object r4 = r11.A00
            X.1dR r4 = (X.C32371dR) r4
            java.lang.Object r3 = r11.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.util.LinkedHashMap r2 = r4.A03
            X.3Qa r0 = r3.A1J
            java.lang.String r1 = r0.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0019
            X.AnonymousClass00C.A07(r1)
            r2.put(r1, r3)
            X.C32371dR.A01(r4)
            return
        L_0x012e:
            java.lang.Object r4 = r11.A00
            X.1dR r4 = (X.C32371dR) r4
            java.lang.Object r1 = r11.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.1dO r0 = r4.A02
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x014e
            android.os.Handler r3 = r4.A00
            r0 = 2
            X.1jE r2 = new X.1jE
            r2.<init>(r4, r1, r0)
        L_0x014a:
            r3.post(r2)
            return
        L_0x014e:
            X.2bO r1 = (X.AnonymousClass2bO) r1
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x0019
            android.os.Handler r3 = r4.A00
            r0 = 15
            X.1il r2 = new X.1il
            r2.<init>(r0, r1, r4)
            goto L_0x014a
        L_0x015e:
            java.lang.Object r1 = r11.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r11.A01
            X.1i0 r4 = (X.C35011i0) r4
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0175:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r2.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r0 = r0.A1N
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L_0x0175
        L_0x018b:
            X.17Y r2 = r4.A01
            X.1i1 r1 = r4.A05
            X.005 r0 = r4.A0B
            X.AnonymousClass6Y4.A05(r2, r1, r0, r3)
            return
        L_0x0195:
            java.lang.Object r0 = r11.A00
            X.0wa r0 = (X.C19830wa) r0
            java.lang.Object r1 = r11.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x01a6:
            java.lang.Object r1 = r11.A00
            X.0wV r1 = (X.C19780wV) r1
            java.lang.Object r0 = r11.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.Boy(r0)
            return
        L_0x01b2:
            java.lang.Object r3 = r11.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r11.A01
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            android.content.Intent r0 = r0.setData(r2)
            r3.sendBroadcast(r0)
            return
        L_0x01c9:
            java.lang.Object r2 = r11.A00
            X.1dz r2 = (X.C32661dz) r2
            java.lang.Object r1 = r11.A01
            X.2Qb r1 = (X.C45102Qb) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.C32661dz.A00(r1, r2)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r2.A00
            r0.Bly(r1)
            r0 = 0
            r2.A06 = r0
            r2.A05 = r0
            return
        L_0x01ea:
            java.lang.Object r0 = r11.A00
            X.19z r0 = (X.C238219z) r0
            java.lang.Object r1 = r11.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.176 r0 = r0.A02
            r0.A0B(r1)
            return
        L_0x01f8:
            java.lang.Object r8 = r11.A00
            X.1AP r8 = (X.AnonymousClass1AP) r8
            java.lang.Object r2 = r11.A01
            java.util.List r2 = (java.util.List) r2
            X.1BG r0 = r8.A0G
            r0.A09()
            java.lang.String r0 = "StickerRepository/reorderMyStickerPackSync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1B5 r1 = r8.A0J
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.C18740tg.A00()
            X.1B9 r4 = r1.A02
            monitor-enter(r4)
            X.005 r0 = r4.A00     // Catch:{ all -> 0x028d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x028d }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ all -> 0x028d }
            X.1M0 r6 = r0.A04()     // Catch:{ all -> 0x028d }
            X.71s r10 = r6.B1k()     // Catch:{ all -> 0x0283 }
            X.14e r9 = r6.A02     // Catch:{ all -> 0x0279 }
            java.lang.String r7 = "sticker_pack_order"
            java.lang.String r1 = "setOrder/DELETE_STICKER_PACK_ORDER"
            r0 = 0
            r9.A03(r7, r0, r1, r0)     // Catch:{ all -> 0x0279 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0279 }
        L_0x0234:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x025d
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0279 }
            X.68B r0 = (X.AnonymousClass68B) r0     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r0.A0F     // Catch:{ all -> 0x0279 }
            int r1 = r0.A00     // Catch:{ all -> 0x0279 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0279 }
            r2.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "sticker_pack_id"
            r2.put(r0, r3)     // Catch:{ all -> 0x0279 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "pack_order"
            r2.put(r0, r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = "setOrder/INSERT_STICKER_PACK_ORDER"
            r9.A05(r7, r0, r2)     // Catch:{ all -> 0x0279 }
            goto L_0x0234
        L_0x025d:
            r10.A00()     // Catch:{ all -> 0x0279 }
            r10.close()     // Catch:{ all -> 0x0283 }
            r6.close()     // Catch:{ all -> 0x028d }
            monitor-exit(r4)
            X.17Y r3 = r8.A03
            X.1BB r2 = r8.A0D
            java.util.Objects.requireNonNull(r2)
            r1 = 41
            X.1jA r0 = new X.1jA
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0H(r0)
            return
        L_0x0279:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x027e }
            goto L_0x0282
        L_0x027e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0283 }
        L_0x0282:
            throw r1     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0288 }
            goto L_0x028c
        L_0x0288:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x028d }
        L_0x028c:
            throw r1     // Catch:{ all -> 0x028d }
        L_0x028d:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0290:
            java.lang.Object r0 = r11.A00
            X.1AP r0 = (X.AnonymousClass1AP) r0
            java.lang.Object r2 = r11.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1BB r1 = r0.A0D
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x029f:
            java.lang.Object r1 = r11.A00
            X.1AP r1 = (X.AnonymousClass1AP) r1
            java.lang.Object r0 = r11.A01
            java.util.Collection r0 = (java.util.Collection) r0
            r1.A0E(r0)
            return
        L_0x02ab:
            java.lang.Object r0 = r11.A00
            X.1AP r0 = (X.AnonymousClass1AP) r0
            java.lang.Object r2 = r11.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1BB r1 = r0.A0D
            r0 = 0
            r1.A02(r2, r0)
            return
        L_0x02ba:
            java.lang.Object r2 = r11.A00
            X.1AP r2 = (X.AnonymousClass1AP) r2
            java.lang.Object r1 = r11.A01
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 1
            r2.A0F(r1, r0)
            return
        L_0x02c7:
            java.lang.Object r0 = r11.A00
            X.1AP r0 = (X.AnonymousClass1AP) r0
            java.lang.Object r1 = r11.A01
            X.68B r1 = (X.AnonymousClass68B) r1
            X.1BD r0 = r0.A0I
            java.lang.String r2 = r1.A0F
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r5 = r0.A04()
            java.lang.String r4 = "pack_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x02f7 }
            r3[r1] = r2     // Catch:{ all -> 0x02f7 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x02f7 }
            java.lang.String r1 = "new_sticker_packs"
            java.lang.String r0 = "unmarkPackAsNew/DELETE_NEW_STICKER_PACK"
            r2.A03(r1, r4, r0, r3)     // Catch:{ all -> 0x02f7 }
            r5.close()
            return
        L_0x02f7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02f9 }
        L_0x02f9:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r1
        L_0x02fe:
            java.lang.Object r0 = r11.A00
            X.1AP r0 = (X.AnonymousClass1AP) r0
            java.lang.Object r1 = r11.A01
            X.68B r1 = (X.AnonymousClass68B) r1
            X.1BH r0 = r0.A0M
            r0.A01(r1)
            return
        L_0x030c:
            java.lang.Object r2 = r11.A00
            X.1gs r2 = (X.C34341gs) r2
            java.lang.Object r1 = r11.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            android.widget.ImageView r0 = r2.A02
            r0.setImageBitmap(r1)
            return
        L_0x031e:
            r1 = move-exception
            if (r5 == 0) goto L_0x0324
            r5.countDown()
        L_0x0324:
            throw r1
        L_0x0325:
            return
        L_0x0326:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediafileurils/broadcastscanmediaintent/unable to scan file "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35771jE.run():void");
    }

    public C35771jE(AnonymousClass1S4 r2, Object obj) {
        this.A02 = 18;
        this.A01 = r2;
        this.A00 = new C598735p(obj);
    }
}
