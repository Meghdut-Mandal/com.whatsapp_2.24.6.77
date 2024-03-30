package X;

/* renamed from: X.72m  reason: invalid class name and case insensitive filesystem */
public class C1497172m implements Runnable {
    public Object A00;
    public final int A01;

    public C1497172m(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new C1497172m(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c5, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0306, code lost:
        if (r2 != null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04af, code lost:
        if (r1 != null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04b7, code lost:
        if (r0 == null) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04cd, code lost:
        if (r1 != null) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04d5, code lost:
        if (r0 != null) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d7, code lost:
        com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A01(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0554, code lost:
        r1.BEl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0557, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0120, code lost:
        if (r3.A00 == 3) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014c, code lost:
        X.C36411kG.A1P(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0605;
                case 1: goto L_0x05d0;
                case 2: goto L_0x0592;
                case 3: goto L_0x0584;
                case 4: goto L_0x0573;
                case 5: goto L_0x0565;
                case 6: goto L_0x0558;
                case 7: goto L_0x0516;
                case 8: goto L_0x054c;
                case 9: goto L_0x0540;
                case 10: goto L_0x0534;
                case 11: goto L_0x054c;
                case 12: goto L_0x0540;
                case 13: goto L_0x0528;
                case 14: goto L_0x0534;
                case 15: goto L_0x0528;
                case 16: goto L_0x0516;
                case 17: goto L_0x050b;
                case 18: goto L_0x04ee;
                case 19: goto L_0x04e1;
                case 20: goto L_0x0439;
                case 21: goto L_0x03f2;
                case 22: goto L_0x03e4;
                case 23: goto L_0x036c;
                case 24: goto L_0x0352;
                case 25: goto L_0x0338;
                case 26: goto L_0x02f2;
                case 27: goto L_0x02dc;
                case 28: goto L_0x0299;
                case 29: goto L_0x0282;
                case 30: goto L_0x027a;
                case 31: goto L_0x026c;
                case 32: goto L_0x024a;
                case 33: goto L_0x0223;
                case 34: goto L_0x0223;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x01f5;
                case 39: goto L_0x01ea;
                case 40: goto L_0x01e2;
                case 41: goto L_0x01da;
                case 42: goto L_0x01cc;
                case 43: goto L_0x0150;
                case 44: goto L_0x0132;
                case 45: goto L_0x0114;
                case 46: goto L_0x00f0;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00b9;
                case 49: goto L_0x05f9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r13.A00
            X.6SP r5 = (X.AnonymousClass6SP) r5
            java.lang.String r4 = "BusinessSearchRecentSearchManager/saveRecentSearches/Failed!"
            java.util.concurrent.locks.ReadWriteLock r3 = r5.A05
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.lock()
            r2 = 0
            java.io.File r0 = X.AnonymousClass6SP.A00(r5)     // Catch:{ Exception -> 0x009e }
            java.io.FileOutputStream r6 = X.C90524aI.A0W(r0)     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x0097 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0097 }
            r7.<init>(r6, r0)     // Catch:{ all -> 0x0097 }
            java.util.List r9 = r5.A00     // Catch:{ all -> 0x0090 }
            X.AnonymousClass00C.A07(r9)     // Catch:{ all -> 0x0090 }
            org.json.JSONArray r8 = X.C90524aI.A0u()     // Catch:{ all -> 0x0090 }
            monitor-enter(r9)     // Catch:{ all -> 0x0090 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x008d }
        L_0x0032:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x008d }
            X.60m r11 = (X.C1255960m) r11     // Catch:{ all -> 0x008d }
            boolean r0 = r11 instanceof X.AnonymousClass51k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0058
            X.51k r11 = (X.AnonymousClass51k) r11     // Catch:{ all -> 0x008d }
            org.json.JSONObject r10 = X.C36441kJ.A1B()     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r11.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "query"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.Long r1 = r11.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "lastUpdated"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            r1 = 1
            goto L_0x0074
        L_0x0058:
            X.51l r11 = (X.AnonymousClass51l) r11     // Catch:{ all -> 0x008d }
            org.json.JSONObject r10 = X.C36441kJ.A1B()     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r11.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "id"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r11.A01     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "jid"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.Long r1 = r11.A00     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "lastUpdated"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            r1 = 0
        L_0x0074:
            java.lang.String r0 = "type"
            r10.put(r0, r1)     // Catch:{ all -> 0x008d }
            r8.put(r10)     // Catch:{ all -> 0x008d }
            goto L_0x0032
        L_0x007d:
            monitor-exit(r9)     // Catch:{ all -> 0x0090 }
            r0 = 2
            java.lang.String r0 = r8.toString(r0)     // Catch:{ all -> 0x0090 }
            r7.write(r0)     // Catch:{ all -> 0x0090 }
            r7.close()     // Catch:{ all -> 0x0097 }
            r6.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00a8
        L_0x008d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ Exception -> 0x009e }
            throw r0     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x00b0 }
            X.0wN r1 = r5.A01     // Catch:{ all -> 0x00b0 }
            r0 = 0
            r1.A0E(r4, r2, r0)     // Catch:{ all -> 0x00b0 }
        L_0x00a8:
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            return
        L_0x00b0:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x00b9:
            java.lang.Object r2 = r13.A00
            X.6xQ r2 = (X.C147566xQ) r2
            X.6Ru r1 = r2.A01
            java.util.List r0 = X.C132016Ru.A02
            X.C132016Ru.A00(r1, r0)
            java.util.List r0 = X.C132016Ru.A01
            X.C132016Ru.A00(r1, r0)
            X.61r r0 = r2.A00
            r0.A00()
            return
        L_0x00cf:
            java.lang.Object r5 = r13.A00
            X.6zT r5 = (X.C148816zT) r5
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x00da
            r3 = 0
        L_0x00da:
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x00ec
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x00ec
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x00ec
            r5.A0C(r2, r4)
        L_0x00ec:
            r5.A0D(r2, r3)
            return
        L_0x00f0:
            java.lang.Object r5 = r13.A00
            X.6zT r5 = (X.C148816zT) r5
            int r1 = r5.A00
            r4 = 0
            r0 = 2
            boolean r3 = X.C36381kD.A1U(r1, r0)
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x010e
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x010e
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x010e
            r5.A0C(r2, r4)
        L_0x010e:
            r0 = r3 ^ 1
            r5.A0D(r2, r0)
            return
        L_0x0114:
            java.lang.Object r3 = r13.A00
            X.6zT r3 = (X.C148816zT) r3
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0122
            int r2 = r3.A00
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x0123
        L_0x0122:
            r1 = 1
        L_0x0123:
            r3.A06 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/audio_route/rememberBluetoothState "
            r2.append(r0)
            r2.append(r1)
            goto L_0x014c
        L_0x0132:
            java.lang.Object r3 = r13.A00
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.Object r2 = X.C148816zT.A0K
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 0
            r0 = 2
            int r1 = r3.requestAudioFocus(r2, r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "result of audio focus for voice call: "
            r2.append(r0)
            r2.append(r1)
        L_0x014c:
            X.C36411kG.A1P(r2)
            return
        L_0x0150:
            java.lang.Object r0 = r13.A00
            X.6s4 r0 = (X.C144366s4) r0
            X.0wD r0 = r0.A00
            r4 = 1
            int r0 = r0.A03(r4)
            if (r0 != 0) goto L_0x0162
            r4 = 3
        L_0x015e:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0166
        L_0x0162:
            if (r0 != r4) goto L_0x015e
            r4 = 2
            goto L_0x015e
        L_0x0166:
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x01be }
            java.util.ArrayList r1 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x01be }
            r0 = 3
            if (r4 == r0) goto L_0x01c7
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x01be }
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0178:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x01bc }
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch:{ Exception -> 0x01bc }
            boolean r0 = r5.isUp()     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0178
            boolean r0 = r5.isLoopback()     // Catch:{ Exception -> 0x01bc }
            if (r0 != 0) goto L_0x0178
            boolean r0 = r5.isVirtual()     // Catch:{ Exception -> 0x01bc }
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r1 = X.C90514aH.A0y(r0)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "wlan"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01b0
            r0 = 2
            if (r4 == r0) goto L_0x01b3
            goto L_0x0178
        L_0x01b0:
            r0 = 1
            if (r4 != r0) goto L_0x0178
        L_0x01b3:
            int r0 = r5.getMTU()     // Catch:{ Exception -> 0x01bc }
            int r2 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x01bc }
            goto L_0x0178
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c2
        L_0x01be:
            r0 = move-exception
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x01c2:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01c5:
            if (r2 != r3) goto L_0x01c8
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            com.whatsapp.voipcalling.Voip.updateNetworkMedium(r4, r2)
            return
        L_0x01cc:
            java.lang.Object r0 = r13.A00
            X.6s4 r0 = (X.C144366s4) r0
            X.0wD r0 = r0.A00
            boolean r0 = r0.A0A()
            com.whatsapp.voipcalling.Voip.updateNetworkRestrictions(r0)
            return
        L_0x01da:
            java.lang.Object r0 = r13.A00
            X.6VN r0 = (X.AnonymousClass6VN) r0
            r0.A06()
            return
        L_0x01e2:
            java.lang.Object r0 = r13.A00
            X.6VN r0 = (X.AnonymousClass6VN) r0
            r0.A05()
            return
        L_0x01ea:
            java.lang.Object r0 = r13.A00
            com.whatsapp.calling.CallDetailsLayout r0 = (com.whatsapp.calling.CallDetailsLayout) r0
            android.widget.TextView r1 = r0.A03
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x01f5:
            java.lang.Object r4 = r13.A00
            com.whatsapp.businessupsell.BusinessProfileEducation r4 = (com.whatsapp.businessupsell.BusinessProfileEducation) r4
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r1 = "key_extra_verified_level"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            r3 = 3
            boolean r0 = X.AnonymousClass000.A1S(r0, r3)
            if (r0 == 0) goto L_0x0604
            X.9c4 r2 = r4.A02
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "key_extra_business_jid"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.C197659c4.A00(r2, r0, r1, r3, r3)
            return
        L_0x0223:
            java.lang.Object r2 = r13.A00
            X.6YD r2 = (X.AnonymousClass6YD) r2
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.AnonymousClass6YD.A07(r2, r1)
            X.08S r0 = r2.A07
            java.lang.Object r0 = r0.A04()
            X.1S3 r0 = (X.AnonymousClass1S3) r0
            if (r0 == 0) goto L_0x0604
            java.lang.String r0 = r0.A02()
            if (r0 == 0) goto L_0x0604
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0604
            X.08S r0 = r2.A06
            r0.A0C(r1)
            return
        L_0x024a:
            java.lang.Object r2 = r13.A00
            X.6Th r2 = (X.AnonymousClass6Th) r2
            X.6Th r0 = X.AnonymousClass6Th.$redex_init_class
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            r2.A00()
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0604
            X.1Rs r0 = r2.A04
            X.C36341k9.A17(r0, r1)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r2 = r2.A06
            r0 = 20000(0x4e20, double:9.8813E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x026c:
            java.lang.Object r1 = r13.A00
            X.6Th r1 = (X.AnonymousClass6Th) r1
            X.6Th r0 = X.AnonymousClass6Th.$redex_init_class
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A01()
            return
        L_0x027a:
            java.lang.Object r0 = r13.A00
            X.6Pa r0 = (X.C131436Pa) r0
            X.C131436Pa.A00(r0)
            return
        L_0x0282:
            java.lang.Object r3 = r13.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            java.util.ArrayList r2 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A04(r3)
            r1 = 1
            X.5EM r0 = new X.5EM
            r0.<init>(r1)
            r2.add(r0)
            X.08S r0 = r3.A0F
            r0.A0C(r2)
            return
        L_0x0299:
            java.lang.Object r3 = r13.A00
            X.6PX r3 = (X.AnonymousClass6PX) r3
            X.66j r2 = r3.A04
            r2.A01()
            X.00s r1 = r3.A00
            java.util.List r0 = r2.A00()
            r1.A0C(r0)
            java.util.List r1 = r2.A00()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0604
            X.6pD r2 = r3.A03
            X.6Eo r0 = r3.A05
            java.lang.Integer r3 = r0.A03()
            java.lang.Integer r4 = X.C36361kB.A0i()
            int r0 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            if (r1 == 0) goto L_0x02d4
            java.lang.String r0 = "recent_search_count"
            r5.put(r0, r1)
        L_0x02d4:
            r6 = 1
            r7 = 8
            r8 = 2
            r2.A08(r3, r4, r5, r6, r7, r8)
            return
        L_0x02dc:
            java.lang.Object r2 = r13.A00
            X.4kv r2 = (X.C95434kv) r2
            r0 = 3
            r2.A00 = r0
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A09
            r1.removeCallbacks(r0)
            X.5EQ r0 = X.C95434kv.A00(r2)
            r2.A0C(r0)
            return
        L_0x02f2:
            java.lang.Object r4 = r13.A00
            X.4kv r4 = (X.C95434kv) r4
            X.6Eo r3 = r4.A04
            X.6Sz r1 = r4.A05
            X.1QW r0 = r3.A05
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x030f
            X.6QG r2 = r3.A02()
        L_0x0306:
            if (r2 == 0) goto L_0x0334
        L_0x0308:
            X.C95434kv.A02(r2, r4)
            X.C95434kv.A03(r4)
            return
        L_0x030f:
            X.6QG r2 = r3.A01()
            if (r2 != 0) goto L_0x0319
            X.6QG r2 = r1.A02()
        L_0x0319:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A06
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x0306
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0330
            java.lang.String r0 = r2.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0330
            goto L_0x0308
        L_0x0330:
            r0 = 1
            r1.set(r0)
        L_0x0334:
            r4.A0F()
            return
        L_0x0338:
            java.lang.Object r1 = r13.A00
            X.51F r1 = (X.AnonymousClass51F) r1
            X.4kp r0 = r1.A3i()
            X.1Rs r0 = r0.A0W
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x0604
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0604
            X.AnonymousClass51F.A07(r1)
            return
        L_0x0352:
            java.lang.Object r1 = r13.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.widget.ImageView r1 = r1.A00
            if (r1 != 0) goto L_0x0365
            java.lang.String r0 = "myLocationBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0365:
            r0 = 2131232965(0x7f0808c5, float:1.8082054E38)
            r1.setImageResource(r0)
            return
        L_0x036c:
            java.lang.Object r0 = r13.A00
            X.79B r0 = (X.AnonymousClass79B) r0
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r3 = r0.A00
            X.5Jw r0 = r3.A04
            if (r0 == 0) goto L_0x0604
            X.6L0 r4 = r3.A02
            boolean r2 = r4.A02
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "pt"
            boolean r0 = r0.equals(r1)
            if (r2 == r0) goto L_0x039e
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r1)
            r4.A02 = r0
            java.util.List r0 = X.AnonymousClass6L0.A00(r4)
            r4.A01 = r0
        L_0x039e:
            java.util.List r1 = r4.A01
            int r0 = r4.A00
            java.lang.String r2 = X.C36401kF.A0s(r1, r0)
            int r0 = r4.A00
            int r1 = r0 + 1
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            int r1 = r1 % r0
            r4.A00 = r1
            java.lang.String r0 = X.C106485Jw.A0H
            X.C106485Jw.A0F = r0
            java.lang.String r0 = X.C106485Jw.A0G
            X.C106485Jw.A0H = r0
            X.C106485Jw.A0G = r2
            X.5Jw r1 = r3.A04
            androidx.appcompat.widget.SearchView r0 = r1.A06
            if (r0 == 0) goto L_0x0604
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.A0d
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0604
            android.animation.ObjectAnimator r0 = r1.A02
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A03
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A01
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A00
            r0.start()
            return
        L_0x03e4:
            java.lang.Object r1 = r13.A00
            X.6DV r1 = (X.AnonymousClass6DV) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0604
            X.7g0 r0 = r1.A02
            r0.Be6()
            return
        L_0x03f2:
            java.lang.Object r1 = r13.A00
            X.64E r1 = (X.AnonymousClass64E) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.ref.WeakReference r0 = r1.A00
            if (r0 == 0) goto L_0x0604
            java.lang.Object r1 = r0.get()
            X.7jA r1 = (X.C159317jA) r1
            if (r1 == 0) goto L_0x0604
            X.7rw r1 = (X.C164517rw) r1
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0420
            java.lang.Object r1 = r1.A01
            X.6Sz r1 = (X.C132296Sz) r1
            X.6Tm r0 = r1.A09
            r0.A03()
            X.0wN r3 = r1.A01
            java.lang.String r2 = "directory_geocoder_timed_out"
            java.lang.String r1 = "Approx location could not be generated"
            r0 = 0
            r3.A0E(r2, r1, r0)
            return
        L_0x0420:
            java.lang.Object r5 = r1.A01
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager r5 = (com.whatsapp.businessdirectory.util.BaseGPSLocationManager) r5
            java.lang.Object r4 = r1.A00
            r3 = 0
            X.17Y r2 = r5.A05
            r1 = 26
            X.74l r0 = new X.74l
            r0.<init>(r5, r4, r3, r1)
            r2.A0H(r0)
            java.lang.String r0 = "Geocoding address timed out"
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A03(r5, r0)
            return
        L_0x0439:
            java.lang.Object r3 = r13.A00
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager r3 = (com.whatsapp.businessdirectory.util.BaseGPSLocationManager) r3
            java.lang.String r0 = "System location services LocationManager timed out"
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A03(r3, r0)
            X.4rx r2 = r3.A01
            if (r2 == 0) goto L_0x0470
            r0 = 0
            X.0Wq r1 = new X.0Wq
            r1.<init>(r0)
            X.6nC r0 = new X.6nC
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.0JY r1 = r1.A00()
            r0 = 0
            com.google.android.gms.tasks.zzw r4 = X.C07590Yl.A01(r2, r1, r0)
            if (r4 == 0) goto L_0x0470
            X.7S6 r2 = new X.7S6
            r2.<init>(r3)
            r1 = 0
            X.5Xb r0 = new X.5Xb
            r0.<init>(r2, r1)
            r4.addOnSuccessListener(r0)
        L_0x0470:
            X.4rx r2 = r3.A01
            if (r2 == 0) goto L_0x0499
            r0 = 0
            X.0Wq r1 = new X.0Wq
            r1.<init>(r0)
            X.6nC r0 = new X.6nC
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.0JY r1 = r1.A00()
            r0 = 0
            com.google.android.gms.tasks.zzw r2 = X.C07590Yl.A01(r2, r1, r0)
            if (r2 == 0) goto L_0x0499
            r1 = 0
            X.7rY r0 = new X.7rY
            r0.<init>(r3, r1)
            r2.addOnFailureListener(r0)
        L_0x0499:
            X.0yE r2 = r3.A09
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x04b9
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x04b1
            X.0yb r0 = r3.A07
            android.location.LocationManager r1 = r0.A0C()
            r3.A00 = r1
            if (r1 == 0) goto L_0x04b9
        L_0x04b1:
            java.lang.String r0 = "gps"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 != 0) goto L_0x04d7
        L_0x04b9:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x04db
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x04cf
            X.0yb r0 = r3.A07
            android.location.LocationManager r1 = r0.A0C()
            r3.A00 = r1
            if (r1 == 0) goto L_0x04db
        L_0x04cf:
            java.lang.String r0 = "network"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 == 0) goto L_0x04db
        L_0x04d7:
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A01(r0, r3)
            return
        L_0x04db:
            java.lang.String r0 = "Unable to fetch last known location from location services"
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A03(r3, r0)
            return
        L_0x04e1:
            java.lang.Object r1 = r13.A00
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager r1 = (com.whatsapp.businessdirectory.util.BaseGPSLocationManager) r1
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A02(r1)
            java.lang.String r0 = "FusedLocationProvider timed out"
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A03(r1, r0)
            return
        L_0x04ee:
            java.lang.Object r0 = r13.A00
            X.7oi r0 = (X.C162517oi) r0
            java.lang.Object r0 = r0.A00
            X.8Wd r0 = (X.C174338Wd) r0
            X.4kf r5 = r0.A0H
            com.whatsapp.jid.UserJid r4 = r0.A0M
            java.lang.String r3 = r0.A0R
            int r1 = r0.A00
            r0 = -1
            boolean r2 = X.C36381kD.A1U(r1, r0)
            X.9lS r1 = r5.A04
            int r0 = r5.A00
            r1.A04(r0, r4, r3, r2)
            return
        L_0x050b:
            java.lang.Object r0 = r13.A00
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 0
            r1.A0h(r0)
            return
        L_0x0516:
            java.lang.Object r1 = r13.A00
            X.A9g r1 = (X.C21121A9g) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.BCb()
            r1.BCc()
            r1.BEk()
            goto L_0x0554
        L_0x0528:
            java.lang.Object r1 = r13.A00
            X.A9g r1 = (X.C21121A9g) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.BCc()
            return
        L_0x0534:
            java.lang.Object r1 = r13.A00
            X.A9g r1 = (X.C21121A9g) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.BCb()
            return
        L_0x0540:
            java.lang.Object r1 = r13.A00
            X.A9g r1 = (X.C21121A9g) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.BEk()
            return
        L_0x054c:
            java.lang.Object r1 = r13.A00
            X.A9g r1 = (X.C21121A9g) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
        L_0x0554:
            r1.BEl()
            return
        L_0x0558:
            java.lang.Object r0 = r13.A00
            X.4Sq r0 = (X.C88424Sq) r0
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r0 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r0
            r0.Bnv()
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity.A0Q(r0)
            return
        L_0x0565:
            java.lang.Object r1 = r13.A00
            X.4Sq r1 = (X.C88424Sq) r1
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.AnonymousClass190.A0C(r1)
            r1.startActivity(r0)
            return
        L_0x0573:
            java.lang.Object r1 = r13.A00
            X.4Sq r1 = (X.C88424Sq) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r1 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r1
            r1.Bnv()
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity.A0Q(r1)
            return
        L_0x0584:
            java.lang.Object r0 = r13.A00
            X.3Ae r0 = (X.C61003Ae) r0
            X.17Y r2 = r0.A03
            r1 = 0
            r0 = 2131897196(0x7f122b6c, float:1.9429275E38)
            r2.A06(r0, r1)
            return
        L_0x0592:
            java.lang.Object r0 = r13.A00
            X.3gF r0 = (X.C71113gF) r0
            X.1KA r5 = r0.A02
            X.3dm r4 = new X.3dm
            r4.<init>(r0)
            X.1He r0 = r5.A02
            X.2p6 r1 = r0.A02()
            X.2p6 r0 = X.C52232p6.IN_WAITLIST
            if (r1 != r0) goto L_0x0604
            X.0wo r0 = r5.A03
            long r6 = X.C19970wo.A00(r0)
            X.1HY r0 = r5.A00
            X.0v0 r0 = r0.A00
            java.lang.String r1 = "bonsai_last_waitlist_update_ms"
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            long r2 = X.C36341k9.A0B(r0, r1)
            X.0yC r1 = r5.A04
            r0 = 5413(0x1525, float:7.585E-42)
            int r0 = r1.A07(r0)
            long r0 = X.C36371kC.A07(r0)
            long r2 = r2 + r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0604
            r5.A01(r4)
            return
        L_0x05d0:
            java.lang.Object r3 = r13.A00
            X.57j r3 = (X.AnonymousClass57j) r3
            X.1He r2 = r3.A04
            X.2p6 r1 = r2.A02()
            X.2p6 r0 = X.C52232p6.IN_WAITLIST
            if (r1 != r0) goto L_0x0604
            X.C25661He.A00(r2)
            X.2p6 r1 = r2.A02()
            X.2p6 r0 = X.C52232p6.AI_AVAILABLE
            if (r1 != r0) goto L_0x0604
            X.1HX r0 = r3.A03
            X.1Hg r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0604
            X.3D1 r0 = r3.A05
            r0.A00()
            return
        L_0x05f9:
            java.lang.Object r0 = r13.A00
            X.6xQ r0 = (X.C147566xQ) r0
            X.6Ru r1 = r0.A01
            java.util.List r0 = X.C132016Ru.A02
            X.C132016Ru.A00(r1, r0)
        L_0x0604:
            return
        L_0x0605:
            java.lang.Object r2 = r13.A00
            X.1uI r2 = (X.C39931uI) r2
            X.1hi r1 = r2.A09
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0621
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0621
            java.lang.String r0 = r2.A01
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0621
            java.util.List r0 = r2.A02
        L_0x061d:
            r1.A0D(r0)
            return
        L_0x0621:
            X.09w r0 = X.C023409w.A00
            goto L_0x061d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497172m.run():void");
    }
}
