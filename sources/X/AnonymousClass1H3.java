package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.1H3  reason: invalid class name */
public abstract class AnonymousClass1H3 {
    public static final HashMap A0J = new C36311k6(1);
    public C131636Pw A00 = null;
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public final C19700wN A03;
    public final C20050ww A04;
    public final C19600wD A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C19420v0 A08;
    public final AnonymousClass1H5 A09;
    public final C20810yC A0A;
    public final AnonymousClass13E A0B;
    public final C24121Be A0C;
    public final C21080yd A0D;
    public final C19770wU A0E;
    public final SparseIntArray A0F = new SparseIntArray();
    public final AnonymousClass17Z A0G;
    public final C21010yW A0H;
    public final List A0I = new ArrayList();

    public static synchronized void A00(AnonymousClass1H3 r3, int i) {
        synchronized (r3) {
            r3.A01.put(i, Long.valueOf(C19970wo.A00(r3.A06)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r3.A07() == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        ((X.C159437jM) r2.next()).BeC(r3.A07());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1.hasNext() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        ((X.C159437jM) r1.next()).BWY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1H3 r3, java.lang.String r4) {
        /*
            monitor-enter(r3)
            java.util.List r2 = r3.A0I     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            return
        L_0x000b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            r2.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0034
            java.lang.Object r0 = r3.A07()
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r2 = r1.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()
            X.7jM r1 = (X.C159437jM) r1
            java.lang.Object r0 = r3.A07()
            r1.BeC(r0)
            goto L_0x0020
        L_0x0034:
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.7jM r0 = (X.C159437jM) r0
            r0.BWY()
            goto L_0x0038
        L_0x0048:
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H3.A02(X.1H3, java.lang.String):void");
    }

    public synchronized int A05(int i) {
        return this.A0F.get(i, 0);
    }

    public synchronized C131636Pw A06() {
        C131636Pw r3;
        r3 = this.A00;
        if (r3 == null) {
            r3 = null;
            try {
                C19420v0 r0 = this.A08;
                String A082 = A08();
                StringBuilder sb = new StringBuilder();
                sb.append("downloadable_category_local_info_json_");
                sb.append(A082);
                String string = ((SharedPreferences) r0.A00.get()).getString(sb.toString(), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    C131636Pw A002 = C131636Pw.A00(string);
                    this.A00 = A002;
                    return A002;
                }
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
                sb2.append(A08());
                sb2.append(e.getMessage());
                AnonymousClass6XA.A04(sb2.toString());
            }
        }
        return r3;
    }

    public Object A07() {
        SparseArray sparseArray;
        AnonymousClass1H4 r2 = (AnonymousClass1H4) this;
        synchronized (r2) {
            sparseArray = r2.A00;
            if (sparseArray.size() == 0) {
                sparseArray = null;
            }
        }
        return sparseArray;
    }

    public synchronized void A09() {
        this.A08.A1k(A08(), (String) null);
        this.A00 = null;
    }

    public synchronized void A0B(int i, int i2) {
        SparseIntArray sparseIntArray = this.A0F;
        int i3 = sparseIntArray.get(i2, 0);
        if (!(i3 == 3 && i == 3)) {
            if (i3 == 1) {
                if (i != 1) {
                }
            } else if (i3 == 3 && i == 1) {
            }
            HashMap hashMap = A0J;
            hashMap.get(Integer.valueOf(i3));
            hashMap.get(Integer.valueOf(i));
            sparseIntArray.put(i2, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap2 = A0J;
        sb.append((String) hashMap2.get(Integer.valueOf(i3)));
        sb.append(" to ");
        sb.append((String) hashMap2.get(Integer.valueOf(i)));
        sb.append("!");
        Log.e(sb.toString());
    }

    public synchronized void A0C(C159437jM r5, int i) {
        int A052 = A05(i);
        if (A052 == 3 || A052 == 1) {
            this.A0I.add(r5);
        } else {
            if (!(A052 == 4 || A052 == 2)) {
                if (A052 != 5 || A07() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CategoryManager/registerCallback/Unexpected state encountered - ");
                    sb.append((String) A0J.get(Integer.valueOf(A052)));
                    Log.e(sb.toString());
                } else {
                    Object A072 = A07();
                    C18740tg.A06(A072);
                    r5.BeC(A072);
                }
            }
            r5.BWY();
        }
    }

    public boolean A0E(int i) {
        boolean contains;
        AnonymousClass1H4 r2 = (AnonymousClass1H4) this;
        synchronized (r2) {
            r2.A0H(i);
            contains = r2.A02.contains(Integer.valueOf(i));
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r2 = X.AnonymousClass1H4.A03(r3, r9, r10, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (X.AnonymousClass6YY.A0R(r2) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r5.renameTo(r2) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DoodleEmojiManager/store : rename failed, from ");
        r1.append(r5);
        r1.append(" to ");
        r1.append(r2);
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass1H4.A04(r3, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.C162167o8 r8, java.lang.String r9, int r10) {
        /*
            r7 = this;
            r3 = r7
            X.1H4 r3 = (X.AnonymousClass1H4) r3
            monitor-enter(r3)
            X.C18740tg.A00()     // Catch:{ all -> 0x00b5 }
            int r2 = r3.A05(r10)     // Catch:{ all -> 0x00b5 }
            r5 = 1
            r6 = 0
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0012
            r0 = 1
        L_0x0012:
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x00b5 }
            X.0ww r2 = r3.A04     // Catch:{ IOException -> 0x00ac }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00ac }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00ac }
            X.5RE r0 = r8.B8D(r2, r1, r0)     // Catch:{ IOException -> 0x00ac }
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00ac }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00ac }
            java.io.File r5 = X.AnonymousClass1H4.A03(r3, r9, r10, r5)     // Catch:{ all -> 0x00a2 }
            boolean r0 = X.AnonymousClass6YY.A0R(r5)     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare temporary cache subdirectory"
        L_0x0036:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x0095
        L_0x003a:
            java.lang.String r1 = r5.getCanonicalPath()     // Catch:{ all -> 0x00a2 }
        L_0x003e:
            java.util.zip.ZipEntry r2 = r4.getNextEntry()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0068
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00a2 }
            java.io.File r0 = X.AnonymousClass6YY.A05(r1, r0)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0052
            X.AnonymousClass6YY.A0S(r0, r4)     // Catch:{ all -> 0x00a2 }
            goto L_0x003e
        L_0x0052:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r1.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "DoodleEmojiManager/store/Potentially malicious file:"
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00a2 }
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a2 }
            goto L_0x0036
        L_0x0068:
            java.io.File r2 = X.AnonymousClass1H4.A03(r3, r9, r10, r6)     // Catch:{ all -> 0x00a2 }
            boolean r0 = X.AnonymousClass6YY.A0R(r2)     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "DoodleEmojiManager/store/Could not prepare emoji subdirectory"
            goto L_0x0036
        L_0x0075:
            boolean r0 = r5.renameTo(r2)     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r1.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "DoodleEmojiManager/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            r1.append(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            r1.append(r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a2 }
            goto L_0x0036
        L_0x0095:
            r4.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00b2
        L_0x0099:
            X.AnonymousClass1H4.A04(r3, r9, r10)     // Catch:{ all -> 0x00a2 }
            r4.close()     // Catch:{ IOException -> 0x00ac }
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x00a2:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00ac }
        L_0x00ab:
            throw r1     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            java.lang.String r0 = "DoodleEmojiManager/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00b2:
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H3.A0F(X.7o8, java.lang.String, int):boolean");
    }

    public Map A0G(String str, String str2, String str3, String str4, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        if (str2 != null) {
            hashMap.put("locale", str2);
        }
        if (str3 != null) {
            hashMap.put("existing_id", str3);
        }
        return hashMap;
    }

    public AnonymousClass1H3(C19700wN r2, C20050ww r3, C19600wD r4, C19970wo r5, C19630wG r6, AnonymousClass17Z r7, C19420v0 r8, AnonymousClass1H5 r9, C20810yC r10, C21010yW r11, AnonymousClass13E r12, C24121Be r13, C21080yd r14, C19770wU r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0A = r10;
        this.A03 = r2;
        this.A0E = r15;
        this.A04 = r3;
        this.A0H = r11;
        this.A09 = r9;
        this.A0D = r14;
        this.A0B = r12;
        this.A08 = r8;
        this.A05 = r4;
        this.A0C = r13;
        this.A0G = r7;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A01(X.AnonymousClass1H3 r19, X.C131636Pw r20, X.C24111Bd r21, java.lang.String r22, int r23) {
        /*
            X.C18740tg.A00()
            r9 = r19
            r14 = r23
            int r1 = r9.A05(r14)
            r3 = 3
            r0 = 0
            if (r1 != r3) goto L_0x0010
            r0 = 1
        L_0x0010:
            X.C18740tg.A0C(r0)
            X.C18740tg.A00()
            int r2 = r9.A05(r14)
            r1 = 1
            r0 = 0
            if (r2 != r3) goto L_0x001f
            r0 = 1
        L_0x001f:
            X.C18740tg.A0C(r0)
            r6 = r20
            java.lang.String r10 = r6.A01
            X.6Pw r0 = r9.A06()
            r13 = 0
            if (r0 != 0) goto L_0x0055
            r12 = r13
        L_0x002e:
            java.lang.String r0 = r6.A03(r14)
            boolean r0 = r0.equals(r12)
            r1 = r1 ^ r0
            X.C18740tg.A0C(r1)
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            java.lang.String r2 = r6.A02
            r11 = r22
            if (r2 != 0) goto L_0x005a
            X.0yC r3 = r9.A0A
            X.1Be r2 = r9.A0C
            java.util.Map r1 = r9.A0G(r10, r11, r12, r13, r14)
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass6XA.A00(r3, r2, r0)
            java.lang.String r2 = X.AnonymousClass6XA.A03(r0, r1)
            goto L_0x005a
        L_0x0055:
            java.lang.String r12 = r0.A03(r14)
            goto L_0x002e
        L_0x005a:
            X.13E r1 = r9.A0B     // Catch:{ IOException -> 0x01d6 }
            X.0yd r0 = r9.A0D     // Catch:{ IOException -> 0x01d6 }
            X.6v1 r2 = r1.A02(r0, r2, r13)     // Catch:{ IOException -> 0x01d6 }
            java.net.HttpURLConnection r7 = r2.A01     // Catch:{ all -> 0x01cc }
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x01cc }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r1.<init>()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "CategoryManager/fetch/Error, code="
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            int r0 = r7.getResponseCode()     // Catch:{ all -> 0x01cc }
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            r2.close()     // Catch:{ IOException -> 0x01d6 }
            goto L_0x01dc
        L_0x0089:
            r7.getResponseCode()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "idhash"
            java.lang.String r5 = r7.getHeaderField(r0)     // Catch:{ all -> 0x01cc }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "CategoryManager/fetch/Server did not return an idhash."
            X.AnonymousClass6XA.A04(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r4 = r6.A03(r14)     // Catch:{ all -> 0x01cc }
        L_0x00a1:
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x01cc }
            goto L_0x00dd
        L_0x00a6:
            java.lang.String r0 = r6.A03(r14)     // Catch:{ all -> 0x01cc }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01cc }
            if (r0 != 0) goto L_0x00db
            r6.A03(r14)     // Catch:{ all -> 0x01cc }
            X.1H5 r3 = r9.A09     // Catch:{ all -> 0x01cc }
            monitor-enter(r3)     // Catch:{ all -> 0x01cc }
            int r0 = X.AnonymousClass1H5.A00(r3)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00da
            X.66N r0 = r3.A02     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00da
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01c9 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x01c9 }
            X.6Pw r0 = (X.C131636Pw) r0     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x01c9 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r0 = 0
            X.AnonymousClass1H5.A06(r3, r0)     // Catch:{ all -> 0x01c9 }
        L_0x00da:
            monitor-exit(r3)     // Catch:{ all -> 0x01cc }
        L_0x00db:
            r4 = r5
            goto L_0x00a1
        L_0x00dd:
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x010f
            if (r5 == 0) goto L_0x00ee
            boolean r0 = r5.equals(r12)     // Catch:{ all -> 0x01cc }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "CategoryManager/fetch/Server's hash doesn't match manifest's even though server returned not-modified!"
            X.AnonymousClass6XA.A04(r0)     // Catch:{ all -> 0x01cc }
        L_0x00ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r1.<init>()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "CategoryManager/fetch/Unnecessary http request made. Category "
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            r1.append(r10)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = " is already up-to-date. Local idhash was "
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            r1.append(r12)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            r2.close()     // Catch:{ IOException -> 0x01d6 }
            goto L_0x01b9
        L_0x010f:
            if (r5 == 0) goto L_0x011c
            boolean r0 = r5.equals(r12)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "CategoryManager/fetch/Server's hash matches manifest's even though server didn't return not-modified!"
            X.AnonymousClass6XA.A04(r0)     // Catch:{ all -> 0x01cc }
        L_0x011c:
            boolean r0 = r9.A0F(r2, r4, r14)     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = "!"
            if (r0 != 0) goto L_0x0140
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r1.<init>()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "CategoryManager/fetch/Store failed for "
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            r1.append(r10)     // Catch:{ all -> 0x01cc }
            r1.append(r3)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cc }
            r2.close()     // Catch:{ IOException -> 0x01d6 }
            goto L_0x01dc
        L_0x0140:
            r9.A0D(r12)     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = r6.A01()     // Catch:{ all -> 0x01cc }
            monitor-enter(r9)     // Catch:{ all -> 0x01cc }
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x01c6 }
            r0 = 0
            if (r1 != 0) goto L_0x0150
            r0 = 1
        L_0x0150:
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x01c6 }
            X.6Pw r0 = r9.A06()     // Catch:{ all -> 0x01c6 }
            r9.A00 = r0     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x01c6 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x0178
        L_0x0165:
            java.lang.String r16 = r9.A08()     // Catch:{ all -> 0x01c6 }
            X.6Pw r15 = new X.6Pw     // Catch:{ all -> 0x01c6 }
            r20 = r13
            r18 = r11
            r19 = r13
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01c6 }
            r9.A00 = r15     // Catch:{ all -> 0x01c6 }
        L_0x0178:
            X.6Pw r0 = r9.A00     // Catch:{ all -> 0x01c6 }
            java.util.Map r1 = r0.A03     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ all -> 0x01c6 }
            r1.put(r0, r4)     // Catch:{ all -> 0x01c6 }
            X.0v0 r3 = r9.A08     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r1 = r9.A08()     // Catch:{ JSONException -> 0x0193 }
            X.6Pw r0 = r9.A00     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r0 = r0.A02()     // Catch:{ JSONException -> 0x0193 }
            r3.A1k(r1, r0)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x01b3
        L_0x0193:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            r1.<init>()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "CategoryManager/setLocalIdHash/json exception while setting local category info for "
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r9.A08()     // Catch:{ all -> 0x01c6 }
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x01c6 }
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c6 }
            X.AnonymousClass6XA.A04(r0)     // Catch:{ all -> 0x01c6 }
        L_0x01b3:
            monitor-exit(r9)     // Catch:{ all -> 0x01cc }
            r2.close()     // Catch:{ IOException -> 0x01d6 }
            r12 = r4
            goto L_0x01bb
        L_0x01b9:
            if (r12 == 0) goto L_0x01dc
        L_0x01bb:
            r0 = 5
            r9.A0B(r0, r14)
            A00(r9, r14)
            A02(r9, r12)
            return
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01d6 }
        L_0x01d5:
            throw r1     // Catch:{ IOException -> 0x01d6 }
        L_0x01d6:
            r1 = move-exception
            java.lang.String r0 = "CategoryManager/fetch/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01dc:
            long r1 = r21.A01()
            long r7 = r21.A00()
            r3 = 17
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x020b
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            monitor-enter(r9)
            android.util.SparseArray r2 = r9.A02     // Catch:{ all -> 0x0208 }
            X.0wo r0 = r9.A06     // Catch:{ all -> 0x0208 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0208 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0208 }
            r2.put(r14, r0)     // Catch:{ all -> 0x0208 }
            monitor-exit(r9)
            r0 = 4
            r9.A0B(r0, r14)
            A02(r9, r13)
            return
        L_0x0208:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x020b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "CategoryManager/fetchWithBackoff/Load failed, will retry after "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " seconds for the "
            r5.append(r0)
            long r3 = r21.A00()
            r5.append(r3)
            java.lang.String r0 = "th time"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wU r5 = r9.A0E
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.73S r3 = new X.73S
            r18 = r3
            r19 = r9
            r20 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.String r0 = "CategoryManager/fetch"
            r5.BpM(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H3.A01(X.1H3, X.6Pw, X.1Bd, java.lang.String, int):void");
    }

    public String A08() {
        return "doodle_emoji";
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(int r14, int r15) {
        /*
            r13 = this;
            java.lang.String r6 = r13.A08()
            X.6Pw r5 = r13.A06()
            r7 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x001e
        L_0x0015:
            X.66n r9 = new X.66n
            r9.<init>(r13, r15, r14)
            X.1H5 r3 = r13.A09
            monitor-enter(r3)
            goto L_0x0063
        L_0x001e:
            if (r14 != 0) goto L_0x0015
            r1 = r13
            monitor-enter(r1)
            android.util.SparseArray r0 = r13.A01     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x01dc }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            long r3 = r0.longValue()     // Catch:{ all -> 0x01dc }
            goto L_0x0034
        L_0x0032:
            r3 = 0
        L_0x0034:
            monitor-exit(r1)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 + r0
            X.0wo r0 = r13.A06
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            boolean r0 = r13.A0E(r15)
            if (r0 != 0) goto L_0x0061
            r13.A09()
            java.lang.String r0 = "CategoryManager/state is up-to-date but files are not present!"
            X.AnonymousClass6XA.A04(r0)
            r0 = 0
        L_0x0052:
            r13.A0B(r0, r15)
            if (r5 != 0) goto L_0x005c
            r0 = 0
        L_0x0058:
            A02(r13, r0)
            return
        L_0x005c:
            java.lang.String r0 = r5.A03(r15)
            goto L_0x0058
        L_0x0061:
            r0 = 5
            goto L_0x0052
        L_0x0063:
            java.lang.String r5 = "manifest"
            r8 = 0
            X.66N r0 = r3.A02     // Catch:{ JSONException -> 0x00cc }
            if (r0 == 0) goto L_0x006d
            X.6Pw r8 = r0.A00     // Catch:{ JSONException -> 0x00cc }
            goto L_0x00e5
        L_0x006d:
            X.0v0 r4 = r3.A08     // Catch:{ JSONException -> 0x00cc }
            X.005 r0 = r4.A00     // Catch:{ JSONException -> 0x00cc }
            java.lang.Object r2 = r0.get()     // Catch:{ JSONException -> 0x00cc }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ JSONException -> 0x00cc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00cc }
            r1.<init>()     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r0 = "downloadable_category_local_info_json_"
            r1.append(r0)     // Catch:{ JSONException -> 0x00cc }
            r1.append(r5)     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r1 = r2.getString(r0, r7)     // Catch:{ JSONException -> 0x00cc }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00cc }
            if (r0 != 0) goto L_0x00e5
            X.6Pw r10 = X.C131636Pw.A00(r1)     // Catch:{ JSONException -> 0x00cc }
            r10.A01()     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r0 = r10.A01()     // Catch:{ JSONException -> 0x00cc }
            boolean r0 = X.AnonymousClass6XA.A05(r0)     // Catch:{ JSONException -> 0x00cc }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "ManifestManager/getLocalManifestHash/Local manifest hash is not base64-urlsafe!"
            X.AnonymousClass6XA.A04(r0)     // Catch:{ JSONException -> 0x00cc }
            r4.A1k(r5, r7)     // Catch:{ JSONException -> 0x00cc }
            goto L_0x00e5
        L_0x00ac:
            X.0wG r0 = r3.A07     // Catch:{ JSONException -> 0x00cc }
            android.content.Context r0 = r0.A00     // Catch:{ JSONException -> 0x00cc }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ JSONException -> 0x00cc }
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r0 = new java.io.File     // Catch:{ JSONException -> 0x00cc }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x00cc }
            boolean r0 = r0.exists()     // Catch:{ JSONException -> 0x00cc }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/Local manifest hash is ok but manifest file is not present!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x00cc }
            r4.A1k(r5, r7)     // Catch:{ JSONException -> 0x00cc }
            goto L_0x00e5
        L_0x00ca:
            r8 = r10
            goto L_0x00e5
        L_0x00cc:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r1.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "ManifestManager/getLocalManifestInfo/error while getting local manifest info. FIX ASAP"
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x01d9 }
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            X.AnonymousClass6XA.A04(r0)     // Catch:{ all -> 0x01d9 }
        L_0x00e5:
            int r0 = r3.A00     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01d2
            r2 = 2
            if (r0 == r2) goto L_0x014b
            r10 = 4
            if (r0 == r10) goto L_0x014b
            if (r8 == 0) goto L_0x00f2
            goto L_0x0105
        L_0x00f2:
            X.0wo r7 = r3.A06     // Catch:{ all -> 0x01d7 }
            long r11 = X.C19970wo.A00(r7)     // Catch:{ all -> 0x01d7 }
            long r0 = X.AnonymousClass1H5.A02(r3)     // Catch:{ all -> 0x01d7 }
            long r11 = r11 - r0
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0123
            goto L_0x0128
        L_0x0105:
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x01d7 }
            if (r1 == 0) goto L_0x00f2
            X.0ts r0 = r3.A09     // Catch:{ all -> 0x01d7 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x01d7 }
            java.util.Locale r0 = X.C18820ts.A01(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = X.C26621Kw.A05(r0)     // Catch:{ all -> 0x01d7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x00f2
            X.0wo r0 = r3.A06     // Catch:{ all -> 0x01d7 }
            X.C19970wo.A00(r0)     // Catch:{ all -> 0x01d7 }
            X.AnonymousClass1H5.A02(r3)     // Catch:{ all -> 0x01d7 }
        L_0x0123:
            int r4 = X.AnonymousClass1H5.A01(r3, r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x0152
        L_0x0128:
            r0 = 1
            if (r14 != r0) goto L_0x0134
            if (r8 != 0) goto L_0x013c
            X.C19970wo.A00(r7)     // Catch:{ all -> 0x01d7 }
            X.AnonymousClass1H5.A02(r3)     // Catch:{ all -> 0x01d7 }
            goto L_0x019f
        L_0x0134:
            if (r8 != 0) goto L_0x013c
            r0 = 3
            int r4 = X.AnonymousClass1H5.A01(r3, r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x0152
        L_0x013c:
            X.66N r0 = r3.A02     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x0145
            int r4 = X.AnonymousClass1H5.A01(r3, r10)     // Catch:{ all -> 0x01d7 }
            goto L_0x0152
        L_0x0145:
            r0 = 5
            int r4 = X.AnonymousClass1H5.A01(r3, r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x0152
        L_0x014b:
            java.lang.String r0 = "ManifestManager/computeState/Unexpected state encountered!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d7 }
            int r4 = r3.A00     // Catch:{ all -> 0x01d7 }
        L_0x0152:
            if (r4 == 0) goto L_0x01d2
            if (r4 == r2) goto L_0x019f
            r0 = 3
            if (r4 == r0) goto L_0x018c
            r0 = 4
            if (r4 == r0) goto L_0x01a1
            r0 = 5
            if (r4 == r0) goto L_0x017b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d7 }
            r1.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "ManifestManager/getCategoryFromState/Unexpected state : "
            r1.append(r0)     // Catch:{ all -> 0x01d7 }
            r0 = 1
            if (r4 == r0) goto L_0x0178
            if (r4 == r2) goto L_0x0175
            r0 = 3
            if (r4 == r0) goto L_0x0172
            goto L_0x018f
        L_0x0172:
            java.lang.String r0 = "NO_MANIFEST"
            goto L_0x0191
        L_0x0175:
            java.lang.String r0 = "MANIFEST_STALE"
            goto L_0x0191
        L_0x0178:
            java.lang.String r0 = "LOADING_FAILED"
            goto L_0x0191
        L_0x017b:
            X.66N r0 = r3.A02     // Catch:{ all -> 0x01d7 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x01d7 }
            java.util.HashMap r0 = r0.A01     // Catch:{ all -> 0x01d7 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x01d7 }
            X.6Pw r0 = (X.C131636Pw) r0     // Catch:{ all -> 0x01d7 }
            r9.A01(r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x018c:
            java.lang.String r0 = "ManifestManager/getCategoryFromState/no local manifest hash found and it's too soon for a server fetch, cannot get category info!"
            goto L_0x0198
        L_0x018f:
            java.lang.String r0 = "READ_NEEDED"
        L_0x0191:
            r1.append(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d7 }
        L_0x0198:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d7 }
            r9.A00()     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x019f:
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            r0 = 0
            X.AnonymousClass1H5.A01(r3, r0)     // Catch:{ all -> 0x01d0 }
            if (r14 != 0) goto L_0x01c0
            long r4 = r3.A01     // Catch:{ all -> 0x01d0 }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r0
            X.0wo r0 = r3.A06     // Catch:{ all -> 0x01d0 }
            long r1 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x01d0 }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c0
            r0 = 1
            X.AnonymousClass1H5.A01(r3, r0)     // Catch:{ all -> 0x01d0 }
            r9.A00()     // Catch:{ all -> 0x01d0 }
            goto L_0x01d5
        L_0x01c0:
            X.AnonymousClass1H5.A03(r9, r3, r6)     // Catch:{ all -> 0x01d0 }
            X.0wU r2 = r3.A0E     // Catch:{ all -> 0x01d0 }
            r1 = 11
            X.1iS r0 = new X.1iS     // Catch:{ all -> 0x01d0 }
            r0.<init>(r3, r8, r1, r7)     // Catch:{ all -> 0x01d0 }
            r2.Boy(r0)     // Catch:{ all -> 0x01d0 }
            goto L_0x01d5
        L_0x01d0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d7 }
        L_0x01d2:
            X.AnonymousClass1H5.A03(r9, r3, r6)     // Catch:{ all -> 0x01d7 }
        L_0x01d5:
            monitor-exit(r3)
            return
        L_0x01d7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H3.A0A(int, int):void");
    }

    public void A0D(String str) {
    }
}
