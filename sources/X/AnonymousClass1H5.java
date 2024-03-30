package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1H5  reason: invalid class name */
public class AnonymousClass1H5 {
    public int A00 = 3;
    public long A01 = 0;
    public AnonymousClass66N A02;
    public long A03 = 0;
    public final C19700wN A04;
    public final C20050ww A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C19420v0 A08;
    public final C18820ts A09;
    public final C20810yC A0A;
    public final AnonymousClass13E A0B;
    public final C24121Be A0C;
    public final C21080yd A0D;
    public final C19770wU A0E;
    public final AnonymousClass17Z A0F;
    public final C21010yW A0G;
    public final HashMap A0H = new HashMap();

    public static synchronized int A00(AnonymousClass1H5 r1) {
        int i;
        synchronized (r1) {
            i = r1.A00;
        }
        return i;
    }

    public static synchronized int A01(AnonymousClass1H5 r1, int i) {
        synchronized (r1) {
            if (r1.A00 == 0 && i == 0) {
                Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
                i = r1.A00;
            } else {
                r1.A00 = i;
            }
        }
        return i;
    }

    public static synchronized long A02(AnonymousClass1H5 r6) {
        long j;
        synchronized (r6) {
            j = r6.A03;
            if (j == 0) {
                j = ((SharedPreferences) r6.A08.A00.get()).getLong("downloadable_manifest_last_fetched_time_millis", 0);
                r6.A03 = j;
            }
        }
        return j;
    }

    public static synchronized void A03(C1269966n r3, AnonymousClass1H5 r4, String str) {
        String str2;
        synchronized (r4) {
            int i = r4.A00;
            if (i == 0) {
                HashMap hashMap = r4.A0H;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null || arrayList.isEmpty()) {
                    hashMap.put(str, new ArrayList(Collections.singletonList(r3)));
                } else {
                    arrayList.add(r3);
                    hashMap.put(str, arrayList);
                }
            } else if (i == 5) {
                AnonymousClass66N r0 = r4.A02;
                C18740tg.A06(r0);
                r3.A01((C131636Pw) r0.A01.get(str));
            } else if (i == 1) {
                r3.A00();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
                sb.append(str);
                sb.append(" state : ");
                if (i == 2) {
                    str2 = "MANIFEST_STALE";
                } else if (i != 3) {
                    str2 = "READ_NEEDED";
                } else {
                    str2 = "NO_MANIFEST";
                }
                sb.append(str2);
                Log.e(sb.toString());
            }
        }
    }

    public static synchronized void A06(AnonymousClass1H5 r2, long j) {
        synchronized (r2) {
            r2.A03 = j;
            C19420v0.A00(r2.A08).putLong("downloadable_manifest_last_fetched_time_millis", j).apply();
        }
    }

    public AnonymousClass1H5(C19700wN r3, C20050ww r4, C19970wo r5, C19630wG r6, AnonymousClass17Z r7, C19420v0 r8, C18820ts r9, C20810yC r10, C21010yW r11, AnonymousClass13E r12, C24121Be r13, C21080yd r14, C19770wU r15) {
        this.A07 = r6;
        this.A06 = r5;
        this.A0A = r10;
        this.A04 = r3;
        this.A0E = r15;
        this.A05 = r4;
        this.A0G = r11;
        this.A09 = r9;
        this.A0D = r14;
        this.A0B = r12;
        this.A08 = r8;
        this.A0C = r13;
        this.A0F = r7;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03ca  */
    public static void A04(X.C131636Pw r18, X.AnonymousClass1H5 r19, X.C24111Bd r20, boolean r21) {
        /*
            X.C18740tg.A00()
            r0 = r19
            int r2 = A00(r0)
            r3 = 0
            r10 = 1
            r1 = 0
            if (r2 != 0) goto L_0x000f
            r1 = 1
        L_0x000f:
            X.C18740tg.A0C(r1)
            r1 = r21 ^ 1
            r15 = 0
            if (r1 != 0) goto L_0x01d6
            if (r18 != 0) goto L_0x0074
            r7 = r15
        L_0x001a:
            X.C18740tg.A00()
            int r2 = A00(r0)
            r9 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r2 != 0) goto L_0x002e
            r1 = 1
        L_0x002e:
            X.C18740tg.A0C(r1)
            X.0ts r1 = r0.A09
            android.content.Context r1 = r1.A00
            java.util.Locale r1 = X.C18820ts.A01(r1)
            java.lang.String r14 = X.C26621Kw.A05(r1)
            X.17Z r1 = X.AnonymousClass17Z.$redex_init_class
            X.0yC r4 = r0.A0A
            X.1Be r2 = r0.A0C
            java.lang.String r12 = "manifest"
            java.lang.String r1 = "wa/static/downloadable"
            android.net.Uri$Builder r2 = X.AnonymousClass6XA.A00(r4, r2, r1)
            java.lang.String r1 = "category"
            r2.appendQueryParameter(r1, r12)
            java.lang.String r1 = "locale"
            r2.appendQueryParameter(r1, r14)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = "existing_id"
            r2.appendQueryParameter(r1, r7)
        L_0x0060:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "version"
            r2.appendQueryParameter(r1, r15)
        L_0x006b:
            android.net.Uri r1 = r2.build()
            java.lang.String r4 = r1.toString()
            goto L_0x0079
        L_0x0074:
            java.lang.String r7 = r18.A01()
            goto L_0x001a
        L_0x0079:
            X.13E r2 = r0.A0B     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            X.0yd r1 = r0.A0D     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            X.6v1 r4 = r2.A02(r1, r4, r15)     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            java.net.HttpURLConnection r2 = r4.A01     // Catch:{ all -> 0x01c0 }
            int r8 = r2.getResponseCode()     // Catch:{ all -> 0x01c0 }
            r1 = 400(0x190, float:5.6E-43)
            if (r8 < r1) goto L_0x00ad
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
            r6.<init>()     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = "ManifestManager/fetch/Error, code="
            r6.append(r1)     // Catch:{ all -> 0x01c0 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x01c0 }
            r6.append(r1)     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x01c0 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01c0 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c0 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            goto L_0x01f7
        L_0x00ad:
            r2.getResponseCode()     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = "idhash"
            java.lang.String r13 = r2.getHeaderField(r1)     // Catch:{ all -> 0x01c0 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01c0 }
            if (r1 != 0) goto L_0x01b2
            boolean r1 = X.AnonymousClass6XA.A05(r13)     // Catch:{ all -> 0x01c0 }
            if (r1 == 0) goto L_0x01b2
            int r2 = r2.getResponseCode()     // Catch:{ all -> 0x01c0 }
            r1 = 304(0x130, float:4.26E-43)
            if (r2 != r1) goto L_0x00e2
            boolean r1 = r13.equals(r7)     // Catch:{ all -> 0x01c0 }
            X.C18740tg.A0C(r1)     // Catch:{ all -> 0x01c0 }
            X.6Pw r11 = new X.6Pw     // Catch:{ all -> 0x01c0 }
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c0 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c0 }
            r2.<init>(r6, r11)     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            goto L_0x01f7
        L_0x00e2:
            boolean r1 = r13.equals(r7)     // Catch:{ all -> 0x01c0 }
            if (r1 == 0) goto L_0x00e9
            r9 = 0
        L_0x00e9:
            X.C18740tg.A0C(r9)     // Catch:{ all -> 0x01c0 }
            X.C18740tg.A00()     // Catch:{ all -> 0x01c0 }
            int r2 = A00(r0)     // Catch:{ all -> 0x01c0 }
            r1 = 0
            if (r2 != 0) goto L_0x00f7
            r1 = 1
        L_0x00f7:
            X.C18740tg.A0C(r1)     // Catch:{ all -> 0x01c0 }
            X.0ww r7 = r0.A05     // Catch:{ IOException -> 0x019e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x019e }
            r1 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x019e }
            X.5RE r9 = r4.B8D(r7, r2, r1)     // Catch:{ IOException -> 0x019e }
            X.0wG r1 = r0.A07     // Catch:{ all -> 0x0194 }
            android.content.Context r8 = r1.A00     // Catch:{ all -> 0x0194 }
            java.io.File r7 = r8.getFilesDir()     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = "downloadable"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0194 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0194 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0194 }
            if (r2 != 0) goto L_0x012b
            boolean r1 = r1.mkdirs()     // Catch:{ all -> 0x0194 }
            if (r1 != 0) goto L_0x012b
            java.lang.String r1 = "ManifestManager/store/Could not make file subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0194 }
            goto L_0x0147
        L_0x012b:
            java.io.File r7 = r8.getFilesDir()     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = "downloadable/manifest.json"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0194 }
            r1.<init>(r7, r2)     // Catch:{ all -> 0x0194 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0194 }
            if (r2 == 0) goto L_0x014b
            boolean r2 = r1.delete()     // Catch:{ all -> 0x0194 }
            if (r2 != 0) goto L_0x014b
            java.lang.String r1 = "ManifestManager/store/Could not delete existing manifest!"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0194 }
        L_0x0147:
            r9.close()     // Catch:{ IOException -> 0x019e }
            goto L_0x01a4
        L_0x014b:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r2]     // Catch:{ all -> 0x0194 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0194 }
            r7.<init>(r1)     // Catch:{ all -> 0x0194 }
        L_0x0154:
            int r2 = r9.read(r8)     // Catch:{ all -> 0x018a }
            r1 = -1
            if (r2 == r1) goto L_0x015f
            r7.write(r8, r3, r2)     // Catch:{ all -> 0x018a }
            goto L_0x0154
        L_0x015f:
            r7.close()     // Catch:{ all -> 0x0194 }
            r9.close()     // Catch:{ IOException -> 0x019e }
            X.0v0 r2 = r0.A08     // Catch:{ all -> 0x01c0 }
            X.6Pw r11 = new X.6Pw     // Catch:{ all -> 0x01c0 }
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = r11.A02()     // Catch:{ all -> 0x01c0 }
            r2.A1k(r12, r1)     // Catch:{ all -> 0x01c0 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c0 }
            r0.A02 = r15     // Catch:{ all -> 0x0187 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c0 }
            X.6Pw r11 = new X.6Pw     // Catch:{ all -> 0x01c0 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c0 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c0 }
            r2.<init>(r6, r11)     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            goto L_0x01f7
        L_0x0187:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c0 }
            throw r1     // Catch:{ all -> 0x01c0 }
        L_0x018a:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0194 }
        L_0x0193:
            throw r2     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x019e }
        L_0x019d:
            throw r2     // Catch:{ IOException -> 0x019e }
        L_0x019e:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/store/Failed : "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x01c0 }
        L_0x01a4:
            java.lang.String r1 = "ManifestManager/fetch/Store failed for MANIFEST"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x01c0 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c0 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            goto L_0x01f7
        L_0x01b2:
            java.lang.String r1 = "ManifestManager/fetch/Improper manifest hash from server!"
            X.AnonymousClass6XA.A04(r1)     // Catch:{ all -> 0x01c0 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x01c0 }
            r2.<init>(r5, r15)     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
            goto L_0x01f7
        L_0x01c0:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x01c5 }
            goto L_0x01c9
        L_0x01c5:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
        L_0x01c9:
            throw r2     // Catch:{ IOException -> 0x01ca, JSONException -> 0x01d9 }
        L_0x01ca:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/fetch/Failed! "
            com.whatsapp.util.Log.e(r1, r2)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r15)
            goto L_0x01f7
        L_0x01d6:
            r5 = r18
            goto L_0x020e
        L_0x01d9:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "ManifestManager/fetch/json exception while fetching manifest."
            r2.append(r1)
            java.lang.String r1 = r4.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.AnonymousClass6XA.A04(r1)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r15)
        L_0x01f7:
            java.lang.Object r1 = r2.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r5 = r2.second
            X.6Pw r5 = (X.C131636Pw) r5
            if (r1 == 0) goto L_0x03ca
            X.0wo r1 = r0.A06
            long r1 = X.C19970wo.A00(r1)
            A06(r0, r1)
        L_0x020e:
            X.C18740tg.A06(r5)
            java.lang.String r1 = r5.A00
            X.C18740tg.A06(r1)
            X.0wG r1 = r0.A07
            android.content.Context r1 = r1.A00
            java.io.File r2 = r1.getFilesDir()
            java.lang.String r1 = "downloadable/manifest.json"
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r1)
            X.C18740tg.A00()
            int r2 = A00(r0)
            r1 = 0
            if (r2 != 0) goto L_0x0230
            r1 = 1
        L_0x0230:
            X.C18740tg.A0C(r1)
            X.66N r1 = r0.A02
            if (r1 != 0) goto L_0x040c
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x0272
            java.lang.String r1 = "ManifestManager/read/Manifest file doesn't exist, but read called!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0242:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Read failed."
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0247:
            r19 = r20
            long r1 = r19.A01()
            long r7 = r19.A00()
            r5 = 17
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x03d1
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Load failed on all retries!"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0wo r1 = r0.A06
            long r1 = X.C19970wo.A00(r1)
            r0.A01 = r1
            X.0v0 r2 = r0.A08
            java.lang.String r1 = "manifest"
            r2.A1k(r1, r15)
            A01(r0, r10)
            r0.A05(r15, r3)
            return
        L_0x0272:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x03c2 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x03c2 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x03c2 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x03c2 }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ IOException -> 0x03c2 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x03c2 }
            r4.beginObject()     // Catch:{ all -> 0x03b8 }
        L_0x0289:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x03a5
            java.lang.String r8 = r4.nextName()     // Catch:{ all -> 0x03b8 }
            int r2 = r8.hashCode()     // Catch:{ all -> 0x03b8 }
            r1 = 1296516636(0x4d47461c, float:2.08953792E8)
            if (r2 != r1) goto L_0x02a5
            java.lang.String r1 = "categories"
            boolean r2 = r8.equals(r1)     // Catch:{ all -> 0x03b8 }
            r1 = 0
            if (r2 != 0) goto L_0x02a6
        L_0x02a5:
            r1 = -1
        L_0x02a6:
            java.lang.String r7 = "ManifestManager/read/Skipping unknown field "
            if (r1 == 0) goto L_0x02c5
            r4.skipValue()     // Catch:{ all -> 0x03b8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b8 }
            r2.<init>()     // Catch:{ all -> 0x03b8 }
            r2.append(r7)     // Catch:{ all -> 0x03b8 }
            r2.append(r8)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = " in MANIFEST"
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03b8 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03b8 }
            goto L_0x0289
        L_0x02c5:
            r4.beginObject()     // Catch:{ all -> 0x03b8 }
        L_0x02c8:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x037a
            java.lang.String r13 = r4.nextName()     // Catch:{ all -> 0x03b8 }
            r4.beginObject()     // Catch:{ all -> 0x03b8 }
            r14 = 0
            r16 = r15
            r2 = r15
        L_0x02d9:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x0363
            java.lang.String r8 = r4.nextName()     // Catch:{ all -> 0x03b8 }
            int r1 = r8.hashCode()     // Catch:{ all -> 0x03b8 }
            switch(r1) {
                case 116079: goto L_0x0355;
                case 235331633: goto L_0x0321;
                case 1652450738: goto L_0x0314;
                case 1950472728: goto L_0x0308;
                default: goto L_0x02ea;
            }     // Catch:{ all -> 0x03b8 }
        L_0x02ea:
            r4.skipValue()     // Catch:{ all -> 0x03b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b8 }
            r1.<init>()     // Catch:{ all -> 0x03b8 }
            r1.append(r7)     // Catch:{ all -> 0x03b8 }
            r1.append(r8)     // Catch:{ all -> 0x03b8 }
            java.lang.String r8 = " while reading category "
            r1.append(r8)     // Catch:{ all -> 0x03b8 }
            r1.append(r13)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03b8 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03b8 }
            goto L_0x02d9
        L_0x0308:
            java.lang.String r1 = "default_locale"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x02ea
            r4.nextString()     // Catch:{ all -> 0x03b8 }
            goto L_0x02d9
        L_0x0314:
            java.lang.String r1 = "id_hash"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x02ea
            java.lang.String r14 = r4.nextString()     // Catch:{ all -> 0x03b8 }
            goto L_0x02d9
        L_0x0321:
            java.lang.String r1 = "bundles"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x02ea
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x03b8 }
            r2.<init>()     // Catch:{ all -> 0x03b8 }
            r4.beginArray()     // Catch:{ all -> 0x03b8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03b8 }
        L_0x0335:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x0351
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = r4.nextString()     // Catch:{ all -> 0x03b8 }
            r2.put(r8, r1)     // Catch:{ all -> 0x03b8 }
            int r1 = r9.intValue()     // Catch:{ all -> 0x03b8 }
            int r1 = r1 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03b8 }
            goto L_0x0335
        L_0x0351:
            r4.endArray()     // Catch:{ all -> 0x03b8 }
            goto L_0x02d9
        L_0x0355:
            java.lang.String r1 = "url"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x02ea
            java.lang.String r16 = r4.nextString()     // Catch:{ all -> 0x03b8 }
            goto L_0x02d9
        L_0x0363:
            r4.endObject()     // Catch:{ all -> 0x03b8 }
            if (r14 == 0) goto L_0x037f
            boolean r1 = X.AnonymousClass6XA.A05(r14)     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x037f
            X.6Pw r12 = new X.6Pw     // Catch:{ all -> 0x03b8 }
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x03b8 }
            r6.put(r13, r12)     // Catch:{ all -> 0x03b8 }
            goto L_0x02c8
        L_0x037a:
            r4.endObject()     // Catch:{ all -> 0x03b8 }
            goto L_0x0289
        L_0x037f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b8 }
            r2.<init>()     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = "ManifestManager/read/Category "
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            r2.append(r13)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = " does not have proper hash : "
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            r2.append(r14)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = " Quitting!"
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03b8 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x03b8 }
            r4.close()     // Catch:{ IOException -> 0x03c2 }
            goto L_0x0242
        L_0x03a5:
            r4.endObject()     // Catch:{ all -> 0x03b8 }
            X.66N r1 = new X.66N     // Catch:{ all -> 0x03b8 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x03b8 }
            monitor-enter(r0)     // Catch:{ all -> 0x03b8 }
            r0.A02 = r1     // Catch:{ all -> 0x03b5 }
            monitor-exit(r0)     // Catch:{ all -> 0x03b8 }
            r4.close()     // Catch:{ IOException -> 0x03c2 }
            goto L_0x040c
        L_0x03b5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03b8 }
            throw r1     // Catch:{ all -> 0x03b8 }
        L_0x03b8:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x03bd }
            goto L_0x03c1
        L_0x03bd:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x03c2 }
        L_0x03c1:
            throw r2     // Catch:{ IOException -> 0x03c2 }
        L_0x03c2:
            r2 = move-exception
            java.lang.String r1 = "ManifestManager/read/Failed!"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0242
        L_0x03ca:
            java.lang.String r1 = "ManifestManager/fetchWithBackoff/Fetch failed."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0247
        L_0x03d1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "ManifestManager/fetchWithBackoff/Load failed, will retry after "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = " seconds for the "
            r5.append(r3)
            long r3 = r19.A00()
            r5.append(r3)
            java.lang.String r3 = "th time"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
            X.0wU r5 = r0.A0E
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r20 = 9
            X.1iY r3 = new X.1iY
            r17 = r0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r0 = "ManifestManager/fetch"
            r5.BpM(r3, r0, r1)
            return
        L_0x040c:
            X.66N r5 = r0.A02
            X.C18740tg.A06(r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r1 = r5.A01
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r4 = r1.iterator()
        L_0x0420:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x044d
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.6Pw r1 = (X.C131636Pw) r1
            java.lang.String r12 = r1.A01
            java.lang.String r13 = r1.A01()
            java.lang.String r14 = r1.A00
            java.lang.String r15 = r1.A02
            java.util.Map r1 = r1.A03
            X.6Pw r11 = new X.6Pw
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r3.put(r2, r11)
            goto L_0x0420
        L_0x044d:
            X.6Pw r1 = r5.A00
            java.lang.String r5 = r1.A01
            java.lang.String r6 = r1.A01()
            java.lang.String r7 = r1.A00
            java.lang.String r8 = r1.A02
            java.util.Map r9 = r1.A03
            X.6Pw r4 = new X.6Pw
            r4.<init>(r5, r6, r7, r8, r9)
            X.66N r2 = new X.66N
            r2.<init>(r4, r3)
            r1 = 5
            A01(r0, r1)
            r0.A05(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H5.A04(X.6Pw, X.1H5, X.1Bd, boolean):void");
    }

    private void A05(AnonymousClass66N r7, boolean z) {
        ArrayList arrayList;
        C18740tg.A00();
        if (z) {
            C18740tg.A06(r7);
        }
        synchronized (this) {
            HashMap hashMap = this.A0H;
            arrayList = new ArrayList(hashMap.entrySet());
            hashMap.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            Iterator it2 = ((AbstractCollection) entry.getValue()).iterator();
            while (it2.hasNext()) {
                C1269966n r2 = (C1269966n) it2.next();
                if (z) {
                    r2.A01((C131636Pw) r7.A01.get(entry.getKey()));
                } else {
                    r2.A00();
                }
            }
        }
    }
}
