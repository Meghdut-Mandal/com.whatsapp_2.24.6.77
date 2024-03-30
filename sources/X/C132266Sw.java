package X;

import java.io.File;

/* renamed from: X.6Sw  reason: invalid class name and case insensitive filesystem */
public class C132266Sw {
    public final AnonymousClass11c A00;
    public final C19600wD A01;
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C21370z6 A04;
    public final C21860zv A05;
    public final AnonymousClass6Sj A06;
    public final C21010yW A07;
    public final C19700wN A08;
    public final C20810yC A09;
    public final AnonymousClass005 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012c, code lost:
        if (r3.exists() != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        if (r3 != null) goto L_0x0137;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(boolean r24) {
        /*
            r23 = this;
            r8 = 0
            r7 = r23
            X.0wG r0 = r7.A02
            r22 = r0
            if (r24 == 0) goto L_0x004e
            java.io.File[] r4 = X.AnonymousClass11c.A01(r22)
            int r3 = r4.length
            r2 = 0
        L_0x000f:
            if (r2 >= r3) goto L_0x001b
            r1 = r4[r2]
            X.11c r0 = r7.A00
            r0.A04(r1)
            int r2 = r2 + 1
            goto L_0x000f
        L_0x001b:
            r7.A01()
            X.0z6 r0 = r7.A04
            X.00T r3 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r3)
            java.lang.String r2 = "appexitinfo_stack_top_hashcode"
            r1 = -1
            int r0 = r0.getInt(r2, r1)
            if (r0 != r1) goto L_0x0049
            r1 = 0
        L_0x0030:
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r3)
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            if (r1 == 0) goto L_0x0048
            int r1 = r1.intValue()
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r3)
            X.C36341k9.A0v(r0, r2, r1)
        L_0x0048:
            return r8
        L_0x0049:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0030
        L_0x004e:
            java.io.File[] r20 = X.AnonymousClass11c.A01(r22)
            r0 = r20
            int r0 = r0.length
            r21 = r0
            r10 = 0
            r19 = 0
        L_0x005a:
            java.lang.String r5 = "os_stacktrace_"
            r0 = r21
            if (r10 >= r0) goto L_0x0263
            r9 = r20[r10]
            java.lang.String r0 = r9.getName()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x025f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ANRExceptionUploadHelper/file/name="
            X.C90474aD.A16(r9, r0, r1)
            java.lang.String r0 = "; canRead="
            r1.append(r0)
            boolean r0 = r9.canRead()
            X.C36331k8.A1S(r1, r0)
            boolean r0 = r9.canRead()
            if (r0 == 0) goto L_0x0256
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = ".stacktrace"
            boolean r18 = r1.endsWith(r0)
            r1 = 0
            java.lang.String r6 = "anr_file_timestamp"
            if (r18 != 0) goto L_0x00e7
            long r3 = r9.lastModified()
            X.0v0 r5 = r7.A03
            long r11 = r5.A0V(r6)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            java.io.BufferedReader r12 = X.C90504aG.A0Z(r9)     // Catch:{ IOException -> 0x024d }
            java.lang.String r0 = "Cmd line: (\\S+)"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x00dc }
        L_0x00b3:
            java.lang.String r0 = r12.readLine()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d7
            java.util.regex.Matcher r2 = r11.matcher(r0)     // Catch:{ all -> 0x00dc }
            boolean r0 = r2.find()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00b3
            r0 = 1
            r2.group(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "com.whatsapp"
            java.lang.String r0 = r2.group(r0)     // Catch:{ all -> 0x00dc }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00b3
            r12.close()     // Catch:{ IOException -> 0x024d }
            goto L_0x00e6
        L_0x00d7:
            r12.close()     // Catch:{ IOException -> 0x024d }
            goto L_0x0253
        L_0x00dc:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e5
        L_0x00e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x024d }
        L_0x00e5:
            throw r1     // Catch:{ IOException -> 0x024d }
        L_0x00e6:
            r1 = r3
        L_0x00e7:
            X.0wD r0 = r7.A01
            X.1M8 r0 = r0.A04()
            if (r0 == 0) goto L_0x0247
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0247
            X.0zv r0 = r7.A05
            java.util.Map r12 = r0.A01()
            r4 = 0
            if (r18 == 0) goto L_0x012f
            java.lang.String r13 = r9.getName()
        L_0x0100:
            java.lang.String r0 = r9.getName()
            java.lang.String r11 = X.AnonymousClass11c.A00(r0)
            if (r11 == 0) goto L_0x0153
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 >= r0) goto L_0x0131
            java.io.File r3 = X.C90524aI.A0R(r22)
            java.lang.String r0 = "traces"
            java.io.File r5 = X.C36441kJ.A0w(r3, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sigquit_exitinfo_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r3)
            java.io.File r3 = X.C36441kJ.A0w(r5, r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0153
            goto L_0x0137
        L_0x012f:
            r13 = r4
            goto L_0x0100
        L_0x0131:
            java.io.File r3 = r7.A00(r11)
            if (r3 == 0) goto L_0x0153
        L_0x0137:
            java.io.BufferedReader r0 = X.C90504aG.A0Z(r3)     // Catch:{ Exception -> 0x014d }
            java.lang.String r4 = r0.readLine()     // Catch:{ all -> 0x0143 }
            r0.close()     // Catch:{ Exception -> 0x014d }
            goto L_0x0153
        L_0x0143:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ Exception -> 0x014d }
        L_0x014c:
            throw r3     // Catch:{ Exception -> 0x014d }
        L_0x014d:
            r3 = move-exception
            java.lang.String r0 = "ANRExceptionUploadHelper/os-exit-info-not-read"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x0153:
            X.58Y r5 = new X.58Y
            r5.<init>()
            java.lang.Integer r0 = X.C36381kD.A0n()
            r5.A01 = r0
            java.lang.Long r0 = X.C90474aD.A0Y()
            r5.A02 = r0
            java.lang.String r17 = "anr"
            r0 = r17
            r5.A07 = r0
            boolean r0 = X.AnonymousClass14B.A0F(r4)
            if (r0 != 0) goto L_0x018e
            int r14 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = ""
            r0 = 30
            if (r14 >= r0) goto L_0x0243
            java.lang.String r0 = "\\([^()]*\\)"
        L_0x017a:
            java.lang.String r4 = r4.replaceAll(r0, r3)
            int r3 = r4.length()
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = java.lang.Math.min(r3, r0)
            java.lang.String r0 = r4.substring(r8, r0)
            r5.A05 = r0
        L_0x018e:
            if (r13 == 0) goto L_0x01f4
            java.lang.String r4 = "_"
            int r3 = r13.indexOf(r4)
            if (r3 <= 0) goto L_0x01a0
            java.lang.String r0 = r13.substring(r8, r3)
            if (r0 == 0) goto L_0x01a0
            r5.A04 = r0
        L_0x01a0:
            java.lang.String r14 = X.AnonymousClass11c.A00(r13)
            if (r14 == 0) goto L_0x01d8
            java.lang.Object r0 = r12.get(r14)
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x01d8
            X.5tI r15 = X.C21860zv.A00(r0)
            java.lang.String r0 = r15.A02
            r5.A03 = r0
            java.lang.String r0 = r15.A01
            r5.A08 = r0
            java.lang.Integer r0 = r15.A00
            r5.A00 = r0
            X.0z6 r0 = r7.A04
            X.00T r0 = r0.A01
            android.content.SharedPreferences r16 = X.C36411kG.A0E(r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r15 = "running_tasks_"
            java.lang.String r14 = X.AnonymousClass000.A0p(r15, r14, r0)
            r0 = r16
            java.lang.String r0 = X.C36371kC.A0t(r0, r14)
            r5.A09 = r0
        L_0x01d8:
            r0 = 1
            int r3 = r3 + 1
            r14 = 0
            if (r3 < r0) goto L_0x01f2
            int r3 = r13.indexOf(r4, r3)
            int r3 = r3 + 1
            if (r3 < r0) goto L_0x01f2
            java.lang.String r0 = "."
            int r0 = r13.indexOf(r0, r3)
            if (r0 < 0) goto L_0x01f2
            java.lang.String r14 = r13.substring(r3, r0)
        L_0x01f2:
            r5.A0A = r14
        L_0x01f4:
            X.0yW r0 = r7.A07
            r0.Blv(r5)
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            r13 = 1
            java.lang.String r4 = "secondary_log_files[os_stacktrace]"
            r0 = r22
            android.content.Context r14 = r0.A00
            java.lang.String r0 = "android_anr"
            java.lang.String r3 = "ANRExceptionUploadHelper"
            boolean r0 = X.AnonymousClass6Sj.A01(r14, r9, r0, r3, r5)
            if (r0 == 0) goto L_0x0227
            X.AnonymousClass6Sj.A00(r14, r11, r3, r12, r5)
            java.io.File r0 = r7.A00(r11)
            if (r0 == 0) goto L_0x021a
            X.AnonymousClass6Sj.A01(r14, r0, r4, r3, r5)
        L_0x021a:
            X.6Sj r3 = r7.A06
            java.util.List r0 = java.util.Collections.singletonList(r17)
            java.util.HashSet r0 = X.C90524aI.A0k(r0)
            r3.A02(r0, r5, r13)
        L_0x0227:
            if (r18 == 0) goto L_0x023d
            X.11c r0 = r7.A00
            r0.A04(r9)
            java.lang.String r0 = X.C90504aG.A0l(r4, r5)
            if (r0 == 0) goto L_0x023b
            java.io.File r0 = X.C90524aI.A0S(r0)
            r0.delete()
        L_0x023b:
            r0 = 1
            goto L_0x0257
        L_0x023d:
            X.0v0 r0 = r7.A03
            r0.A1h(r6, r1)
            goto L_0x023b
        L_0x0243:
            java.lang.String r0 = "\\d"
            goto L_0x017a
        L_0x0247:
            java.lang.String r0 = "ANRExceptionUploadHelper/roamingorunknown/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0256
        L_0x024d:
            r1 = move-exception
            java.lang.String r0 = "ANRExceptionUploadHelper/failed to parse system anr file "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0253:
            r5.A1h(r6, r3)
        L_0x0256:
            r0 = 0
        L_0x0257:
            if (r19 != 0) goto L_0x025d
            r19 = 0
            if (r0 == 0) goto L_0x025f
        L_0x025d:
            r19 = 1
        L_0x025f:
            int r10 = r10 + 1
            goto L_0x005a
        L_0x0263:
            java.io.File[] r4 = X.AnonymousClass11c.A01(r22)
            int r3 = r4.length
            r2 = 0
        L_0x0269:
            if (r8 >= r3) goto L_0x0282
            r1 = r4[r8]
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x027f
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x027f
            int r2 = r2 + 1
        L_0x027f:
            int r8 = r8 + 1
            goto L_0x0269
        L_0x0282:
            if (r2 == 0) goto L_0x028d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ANRExceptionUploadHelper/no sigquit trace matched/"
            X.C36321k7.A1T(r0, r1, r2)
        L_0x028d:
            if (r19 == 0) goto L_0x0292
            r7.A01()
        L_0x0292:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132266Sw.A02(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.A0E(7771) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File A00(java.lang.String r7) {
        /*
            r6 = this;
            X.0yC r2 = r6.A09
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0011
            r0 = 7771(0x1e5b, float:1.089E-41)
            boolean r1 = r2.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r5 = 0
            if (r0 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x003d
            X.005 r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.6OP r0 = (X.AnonymousClass6OP) r0
            java.io.File r4 = r0.A01(r7)
            r3 = 0
            java.lang.String r2 = "ANRExceptionUploadHelper/"
            if (r4 == 0) goto L_0x0036
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0036
            X.0wN r1 = r6.A08
            java.lang.String r0 = "found"
            r1.A0E(r2, r0, r3)
            return r4
        L_0x0036:
            X.0wN r1 = r6.A08
            java.lang.String r0 = "not-found"
            r1.A0E(r2, r0, r3)
        L_0x003d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132266Sw.A00(java.lang.String):java.io.File");
    }

    private void A01() {
        File[] fileArr;
        File A0w = C36441kJ.A0w(C90524aI.A0R(this.A02), "traces");
        if (!A0w.exists() || (fileArr = A0w.listFiles(AnonymousClass723.A00)) == null) {
            fileArr = new File[0];
        }
        for (File delete : fileArr) {
            delete.delete();
        }
    }

    public C132266Sw(C19700wN r1, AnonymousClass11c r2, C19600wD r3, C19630wG r4, C19420v0 r5, C21370z6 r6, C21860zv r7, AnonymousClass6Sj r8, C20810yC r9, C21010yW r10, AnonymousClass005 r11) {
        this.A02 = r4;
        this.A09 = r9;
        this.A00 = r2;
        this.A07 = r10;
        this.A08 = r1;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A0A = r11;
        this.A05 = r7;
        this.A06 = r8;
    }
}
