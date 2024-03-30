package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.1Z8  reason: invalid class name */
public class AnonymousClass1Z8 implements AnonymousClass1Z6 {
    public C19930wk A00;
    public final C24801Dv A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final C24721Dn A04;
    public final AnonymousClass1Z9 A05;
    public final C29391Wl A06;
    public final Object A07 = new Object();
    public final C29371Wj A08;
    public volatile boolean A09 = false;

    public boolean A03(C64683Pa r13, boolean z) {
        C64683Pa r8 = r13;
        int i = r13.A01;
        Map map = AnonymousClass3RX.A00;
        if ((Integer.valueOf(i) != null && 999 == i) || 170 == i || 150 == i) {
            return false;
        }
        long A002 = C19970wo.A00(this.A02);
        long j = r13.A02;
        int i2 = r13.A04;
        if (j == -1) {
            if (!z) {
                this.A00.execute(new C35251iO(this, r8, 7, A002));
                return true;
            }
            A02(r13, A002);
            return true;
        } else if (A002 / 1000 <= j + (((long) i2) * 3600)) {
            return true;
        } else {
            if (!z) {
                this.A00.execute(new C35761jD(this, r13, 14));
                return false;
            }
            A01(r13, 150);
            return false;
        }
    }

    public void BJY(JSONObject jSONObject, int[] iArr) {
    }

    public void BVo(int[] iArr, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r12 != 999) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C64683Pa r11, int r12) {
        /*
            r10 = this;
            X.1Wj r2 = r10.A08
            java.util.Map r0 = X.AnonymousClass3RX.A00
            r1 = 0
            r0 = 1
            if (r12 == r0) goto L_0x003a
            r0 = 100
            if (r12 == r0) goto L_0x003a
            r0 = 110(0x6e, float:1.54E-43)
            if (r12 == r0) goto L_0x003a
            r0 = 120(0x78, float:1.68E-43)
            if (r12 == r0) goto L_0x003a
            r0 = 130(0x82, float:1.82E-43)
            if (r12 == r0) goto L_0x003a
            r0 = 150(0x96, float:2.1E-43)
            if (r12 == r0) goto L_0x003a
            r0 = 170(0xaa, float:2.38E-43)
            if (r12 == r0) goto L_0x003a
            r0 = 999(0x3e7, float:1.4E-42)
            if (r12 == r0) goto L_0x003a
        L_0x0024:
            X.38g r0 = r11.A05
            int r4 = r0.A00
            int r5 = r1.intValue()
            long r7 = r11.A02
            int r6 = r11.A00
            r9 = 1
            X.3Su r3 = new X.3Su
            r3.<init>(r4, r5, r6, r7, r9)
            X.C29371Wj.A00(r2, r3, r1)
            return
        L_0x003a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z8.A00(X.3Pa, int):void");
    }

    public void A01(C64683Pa r8, int i) {
        Integer valueOf;
        int i2 = r8.A05.A00;
        int i3 = r8.A01;
        Map map = AnonymousClass3RX.A00;
        if (999 != i) {
            if (!AnonymousClass3RX.A00.containsKey(Integer.valueOf(i))) {
                StringBuilder sb = new StringBuilder();
                sb.append("UserNoticeBadgeManager/transitionUserNoticeBadgeState encountered invalid stage value=");
                sb.append(i);
                sb.append(" when trying to update the stage for notice with id=");
                sb.append(i2);
                Log.e(sb.toString());
                return;
            }
        }
        A00(r8, i);
        Integer valueOf2 = Integer.valueOf(i3);
        if ((valueOf2 != null && 999 == valueOf2.intValue()) || ((valueOf = Integer.valueOf(i)) != null && 999 == valueOf.intValue())) {
            this.A05.A02(i2);
            this.A04.A00(i2, 999);
        } else if (AnonymousClass3RX.A01(valueOf, valueOf2)) {
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                if (1 == intValue || 100 == intValue) {
                    if (valueOf == null || !AnonymousClass3RX.A00.containsKey(valueOf)) {
                        return;
                    }
                    r8.A01 = i;
                    this.A05.A04(r8);
                    this.A04.A00(i2, i);
                } else if (110 == intValue || 120 == intValue || 130 == intValue) {
                    Object obj = AnonymousClass3RX.A00.get(valueOf2);
                    if (obj == null) {
                        obj = C023409w.A00;
                    }
                    List list = (List) obj;
                    if (!(i == 150 || !(!list.isEmpty()) || ((Number) list.get(0)).intValue() == i)) {
                        return;
                    }
                    r8.A01 = i;
                    this.A05.A04(r8);
                    this.A04.A00(i2, i);
                }
            }
            if (150 != i3) {
                if (170 != i3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UserNoticeBadgeManager/transitionUserNoticeBadgeStage notice with id:");
                    sb2.append(i2);
                    sb2.append(" has invalid stage TRIGGERED on client side. Removing this notice's content from client side.");
                    Log.e(sb2.toString());
                    this.A05.A02(i2);
                    return;
                }
                return;
            }
            r8.A01 = i;
            this.A05.A04(r8);
            this.A04.A00(i2, i);
        }
    }

    public void A02(C64683Pa r8, long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (r8.A02 == -1) {
            r8.A02 = seconds;
            this.A05.A04(r8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 >= 15) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r4 = new java.util.HashSet();
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r1.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = (X.C65613Su) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r0 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r4.add(java.lang.Integer.valueOf(r0.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r5 = r12.A05;
        r2 = r5.A00().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r2.hasNext() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r1 = ((X.C64683Pa) r2.next()).A05.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r5.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r2 = r5.A07;
        r3 = X.C000400e.A0B((java.util.Map) r2.getValue()).values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        if (r3.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        r1 = ((X.C128646Db) r3.next()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        r5.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        r6 = new java.util.ArrayList();
        r11 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r11.hasNext() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        r7 = (X.C65613Su) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r7 != null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        com.whatsapp.util.Log.e("UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        r1 = X.C000400e.A0B((java.util.Map) r2.getValue());
        r3 = java.lang.Integer.valueOf(r7.A01);
        r10 = (X.C128646Db) r1.get(r3);
        r4 = r5.A09;
        r9 = (X.C65613Su) X.C000400e.A0B((java.util.Map) r4.getValue()).get(r3);
        r8 = X.AnonymousClass3RX.A00(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        if (r8 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        if (999 != r8.intValue()) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        if (r10 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010f, code lost:
        r5.A03(r10.A00, r10.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        if (r10 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011d, code lost:
        if (r7.A03 > r10.A01) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011f, code lost:
        if (r9 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012b, code lost:
        if (X.AnonymousClass3RX.A01(r8, X.AnonymousClass3RX.A00(r9.A00)) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        r1 = X.AnonymousClass3RX.A00(r7.A00).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        if (1 == r1) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        if (r1 == 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013e, code lost:
        if (100 == r1) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        if (999 == r1) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014e, code lost:
        if (X.AnonymousClass3RX.A00.containsKey(java.lang.Integer.valueOf(r1)) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        r1 = r7.A00;
        r0 = (X.C65613Su) ((java.util.Map) r4.getValue()).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015e, code lost:
        if (r0 == null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0160, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0162, code lost:
        r0 = (X.C64683Pa) ((java.util.Map) r5.A06.getValue()).get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0170, code lost:
        if (r0 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0172, code lost:
        r0.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0174, code lost:
        r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0179, code lost:
        r6.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0182, code lost:
        if (r6.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
        r6.size();
        r5.A04.A06(r6);
        r4 = r5.A09;
        ((java.util.Map) r4.getValue()).clear();
        r3 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019f, code lost:
        if (r3.hasNext() == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a1, code lost:
        r2 = (X.C65613Su) r3.next();
        ((java.util.Map) r4.getValue()).put(java.lang.Integer.valueOf(r2.A01), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b7, code lost:
        r4 = new java.util.ArrayList(X.AnonymousClass03U.A06(r6, 10));
        r1 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ca, code lost:
        if (r1.hasNext() == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cc, code lost:
        r4.add(java.lang.Integer.valueOf(((X.C65613Su) r1.next()).A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e1, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id ");
        r1.append(r4);
        com.whatsapp.util.Log.i(r1.toString());
        r3 = new X.AnonymousClass6EH();
        r3.A02("notices_id", X.C007103b.A0m(r4));
        r0 = r5.A00;
        r0.A0G();
        r7 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020a, code lost:
        if (r7 != null) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020f, code lost:
        if (r0 != null) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0211, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id ");
        r2.append(X.C007103b.A0Q(",", "", "", r4, (X.C006302t) null));
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022e, code lost:
        r3.A00.put("url", r0.toString());
        r8 = r3.A00();
        r1 = new X.C1271667f();
        r1.A00 = X.C023109s.A01;
        r1 = r1.A00();
        r3 = new X.C97384pE(com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class);
        r3.A06("tag.whatsapp.usernotice.cms.content.fetch");
        r3.A03(r1);
        r6 = X.C023109s.A00;
        r3.A05(r6, java.util.concurrent.TimeUnit.HOURS, 1);
        r3.A00.A0A = r8;
        r2 = new java.lang.StringBuilder();
        r2.append("tag.whatsapp.usernotice.cms.content.fetch.");
        r2.append(X.C007103b.A0Q(",", "", "", r4, (X.C006302t) null));
        r1 = r2.toString();
        ((X.AnonymousClass6VR) r5.A05.get()).A03((X.C97404pG) r3.A00(), r6, r1).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0294, code lost:
        r2 = new android.net.Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v2").appendQueryParameter("ids", X.C007103b.A0Q(",", "", "", r4, (X.C006302t) null));
        r6 = r5.A03;
        r2 = r2.appendQueryParameter("lg", r6.A06()).appendQueryParameter("lc", r6.A05()).appendQueryParameter("cc", X.AnonymousClass1M4.A00(r7.cc)).appendQueryParameter("platform", "android");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        if (r5.A02.A00.getResources().getDisplayMetrics().densityDpi > 240) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02fc, code lost:
        r1 = "hdpi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02fe, code lost:
        r0 = r2.appendQueryParameter("img-size", r1).build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x030a, code lost:
        r1 = "xxhdpi";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJZ(java.util.List r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/handleDisclosures/metadata list size: "
            r1.append(r0)
            int r0 = r13.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r2 = r12.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.0yV r1 = X.C21000yV.A01
            r0 = 1799(0x707, float:2.521E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x022c
            java.lang.Object r3 = r12.A07
            monitor-enter(r3)
            r2 = 0
        L_0x002c:
            boolean r1 = r12.A09     // Catch:{ all -> 0x01de }
            r0 = 15
            if (r1 != 0) goto L_0x003c
            if (r2 >= r0) goto L_0x01dc
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0039 }
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x002c
        L_0x003c:
            if (r2 >= r0) goto L_0x01dc
            monitor-exit(r3)     // Catch:{ all -> 0x01de }
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r1 = r13.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r1.next()
            X.3Su r0 = (X.C65613Su) r0
            if (r0 == 0) goto L_0x0048
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L_0x0048
        L_0x0060:
            X.1Z9 r5 = r12.A05
            java.util.List r0 = r5.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x006a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r2.next()
            X.3Pa r0 = (X.C64683Pa) r0
            X.38g r0 = r0.A05
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x006a
            r5.A02(r1)
            goto L_0x006a
        L_0x0088:
            X.00T r2 = r5.A07
            java.lang.Object r0 = r2.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.C000400e.A0B(r0)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x009c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r3.next()
            X.6Db r0 = (X.C128646Db) r0
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x009c
            r5.A02(r1)
            goto L_0x009c
        L_0x00b8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r13.iterator()
        L_0x00c1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r7 = r11.next()
            X.3Su r7 = (X.C65613Su) r7
            if (r7 != 0) goto L_0x00d5
            java.lang.String r0 = "UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00c1
        L_0x00d5:
            java.lang.Object r0 = r2.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r1 = X.C000400e.A0B(r0)
            int r0 = r7.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r1.get(r3)
            X.6Db r10 = (X.C128646Db) r10
            X.00T r4 = r5.A09
            java.lang.Object r0 = r4.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.C000400e.A0B(r0)
            java.lang.Object r9 = r0.get(r3)
            X.3Su r9 = (X.C65613Su) r9
            int r0 = r7.A00
            java.lang.Integer r8 = X.AnonymousClass3RX.A00(r0)
            if (r8 == 0) goto L_0x0117
            r1 = 999(0x3e7, float:1.4E-42)
            int r0 = r8.intValue()
            if (r1 != r0) goto L_0x0117
            if (r10 == 0) goto L_0x00c1
            int r1 = r10.A00
            java.lang.String r0 = r10.A06
            r5.A03(r1, r0)
            goto L_0x00c1
        L_0x0117:
            if (r10 == 0) goto L_0x0179
            int r1 = r7.A03
            int r0 = r10.A01
            if (r1 > r0) goto L_0x0179
            if (r9 == 0) goto L_0x00c1
            int r0 = r9.A00
            java.lang.Integer r0 = X.AnonymousClass3RX.A00(r0)
            boolean r0 = X.AnonymousClass3RX.A01(r8, r0)
            if (r0 == 0) goto L_0x00c1
            int r0 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass3RX.A00(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r0 == r1) goto L_0x0150
            if (r1 == 0) goto L_0x0150
            r0 = 100
            if (r0 == r1) goto L_0x0150
            r0 = 999(0x3e7, float:1.4E-42)
            if (r0 == r1) goto L_0x0150
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = X.AnonymousClass3RX.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00c1
        L_0x0150:
            int r1 = r7.A00
            java.lang.Object r0 = r4.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r3)
            X.3Su r0 = (X.C65613Su) r0
            if (r0 == 0) goto L_0x0162
            r0.A00 = r1
        L_0x0162:
            X.00T r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r3)
            X.3Pa r0 = (X.C64683Pa) r0
            if (r0 == 0) goto L_0x0174
            r0.A01 = r1
        L_0x0174:
            r5.A01()
            goto L_0x00c1
        L_0x0179:
            r6.add(r7)
            goto L_0x00c1
        L_0x017e:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x022c
            r6.size()
            X.1Wl r0 = r5.A04
            r0.A06(r6)
            X.00T r4 = r5.A09
            java.lang.Object r0 = r4.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            java.util.Iterator r3 = r6.iterator()
        L_0x019b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r2 = r3.next()
            X.3Su r2 = (X.C65613Su) r2
            java.lang.Object r1 = r4.getValue()
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x019b
        L_0x01b7:
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r6, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x01c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r1.next()
            X.3Su r0 = (X.C65613Su) r0
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L_0x01c6
        L_0x01dc:
            monitor-exit(r3)     // Catch:{ all -> 0x01de }
            goto L_0x022c
        L_0x01de:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01de }
            throw r0
        L_0x01e1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6EH r3 = new X.6EH
            r3.<init>()
            int[] r1 = X.C007103b.A0m(r4)
            java.lang.String r0 = "notices_id"
            r3.A02(r0, r1)
            X.0wQ r0 = r5.A00
            r0.A0G()
            com.whatsapp.Me r7 = r0.A00
            if (r7 != 0) goto L_0x0294
            r0 = 0
        L_0x020d:
            java.lang.String r7 = ","
            if (r0 != 0) goto L_0x022e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id "
            r2.append(r0)
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r7, r0, r0, r4, r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x022c:
            r0 = 1
            return r0
        L_0x022e:
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "url"
            java.util.Map r0 = r3.A00
            r0.put(r1, r2)
            X.6X2 r8 = r3.A00()
            X.67f r1 = new X.67f
            r1.<init>()
            java.lang.Integer r0 = X.C023109s.A01
            r1.A00 = r0
            X.6Tb r1 = r1.A00()
            java.lang.Class<com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker> r0 = com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class
            X.4pE r3 = new X.4pE
            r3.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch"
            r3.A06(r0)
            r3.A03(r1)
            java.lang.Integer r6 = X.C023109s.A00
            r0 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r3.A05(r6, r2, r0)
            X.6QA r0 = r3.A00
            r0.A0A = r8
            X.5s0 r3 = r3.A00()
            X.4pG r3 = (X.C97404pG) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch."
            r2.append(r0)
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r7, r0, r0, r4, r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            X.0zS r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.6VR r0 = (X.AnonymousClass6VR) r0
            X.6WE r0 = r0.A03(r3, r6, r1)
            r0.A02()
            goto L_0x022c
        L_0x0294:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r6 = r1.appendPath(r0)
            java.lang.String r2 = ","
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.C007103b.A0Q(r2, r0, r0, r4, r1)
            java.lang.String r0 = "ids"
            android.net.Uri$Builder r2 = r6.appendQueryParameter(r0, r1)
            X.0ts r6 = r5.A03
            java.lang.String r1 = r6.A06()
            java.lang.String r0 = "lg"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = r6.A05()
            java.lang.String r0 = "lc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r0 = r7.cc
            java.lang.String r1 = X.AnonymousClass1M4.A00(r0)
            java.lang.String r0 = "cc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.0wG r0 = r5.A02
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x030a
            java.lang.String r1 = "hdpi"
        L_0x02fe:
            java.lang.String r0 = "img-size"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r0.build()
            goto L_0x020d
        L_0x030a:
            java.lang.String r1 = "xxhdpi"
            goto L_0x02fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z8.BJZ(java.util.List, boolean, boolean):boolean");
    }

    public AnonymousClass1Z8(C24801Dv r3, C19970wo r4, C20810yC r5, C24721Dn r6, C29371Wj r7, AnonymousClass1Z9 r8, C29391Wl r9, C19770wU r10) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A08 = r7;
        this.A04 = r6;
        this.A05 = r8;
        this.A06 = r9;
        this.A00 = new C19930wk(r10, false);
    }
}
