package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3lB  reason: invalid class name and case insensitive filesystem */
public abstract class C74173lB implements AnonymousClass00M {
    public C46972by A00;
    public final int A01;
    public final AnonymousClass17Y A02;
    public final C19630wG A03;
    public final C20310xM A04;
    public final AnonymousClass16J A05;
    public final C51622o7 A06;
    public final C20690y0 A07;
    public final AnonymousClass171 A08;
    public final C24341Cb A09;
    public final C19970wo A0A;
    public final C25271Fq A0B;
    public final C20060wx A0C;
    public final C20810yC A0D;
    public final C21010yW A0E;
    public final C20520xh A0F;
    public final C29961Yr A0G;
    public final AnonymousClass1ST A0H;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A01() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.AnonymousClass2dC
            if (r0 == 0) goto L_0x0016
            r0 = r3
            X.2dC r0 = (X.AnonymousClass2dC) r0
            monitor-enter(r2)
            X.0v0 r0 = r0.A01     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "newsletter_gdpr_report_expiration_timestamp"
            long r0 = X.C36341k9.A0B(r1, r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0026
        L_0x0016:
            r0 = r3
            X.2dB r0 = (X.AnonymousClass2dB) r0
            monitor-enter(r2)
            X.0v0 r0 = r0.A01     // Catch:{ all -> 0x0028 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "gdpr_report_expiration_timestamp"
            long r0 = X.C36341k9.A0B(r1, r0)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74173lB.A01():long");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public long A02() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.AnonymousClass2dC
            if (r0 == 0) goto L_0x0012
            r0 = r3
            X.2dC r0 = (X.AnonymousClass2dC) r0
            monitor-enter(r2)
            X.0v0 r1 = r0.A01     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "newsletter_gdpr_report_timestamp"
            long r0 = r1.A0V(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x0012:
            r0 = r3
            X.2dB r0 = (X.AnonymousClass2dB) r0
            monitor-enter(r2)
            X.0v0 r1 = r0.A01     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "gdpr_report_timestamp"
            long r0 = r1.A0V(r0)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74173lB.A02():long");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C52472pU A04() {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.AnonymousClass2dC
            if (r0 == 0) goto L_0x002e
            r0 = r7
            X.2dC r0 = (X.AnonymousClass2dC) r0
            monitor-enter(r6)
            X.0v0 r0 = r0.A01     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "newsletter_gdpr_report_state"
            r4 = 0
            int r3 = r1.getInt(r0, r4)     // Catch:{ all -> 0x0059 }
            X.2pU[] r2 = X.C52472pU.values()     // Catch:{ all -> 0x0059 }
            int r1 = r2.length     // Catch:{ all -> 0x0059 }
        L_0x001b:
            if (r4 >= r1) goto L_0x0026
            r5 = r2[r4]     // Catch:{ all -> 0x0059 }
            int r0 = r5.value     // Catch:{ all -> 0x0059 }
            if (r0 == r3) goto L_0x004f
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0026:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0059 }
            r1.<init>(r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0058
        L_0x002e:
            r0 = r7
            X.2dB r0 = (X.AnonymousClass2dB) r0
            monitor-enter(r6)
            X.0v0 r0 = r0.A01     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "gdpr_report_state"
            r4 = 0
            int r3 = r1.getInt(r0, r4)     // Catch:{ all -> 0x0059 }
            X.2pU[] r2 = X.C52472pU.values()     // Catch:{ all -> 0x0059 }
            int r1 = r2.length     // Catch:{ all -> 0x0059 }
        L_0x0044:
            if (r4 >= r1) goto L_0x0051
            r5 = r2[r4]     // Catch:{ all -> 0x0059 }
            int r0 = r5.value     // Catch:{ all -> 0x0059 }
            if (r0 == r3) goto L_0x004f
            int r4 = r4 + 1
            goto L_0x0044
        L_0x004f:
            monitor-exit(r6)
            return r5
        L_0x0051:
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0059 }
            r1.<init>(r0)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74173lB.A04():X.2pU");
    }

    public synchronized void A08() {
        Log.i("gdpr/on-report-deleted");
        A09();
    }

    public final synchronized void A09() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File A052 = A05();
        if (A052.exists() && !A052.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        AnonymousClass6YY.A0E(this.A07.A0D(), 0);
        A07();
    }

    public final synchronized void A0A() {
        File A0w;
        if (A04().value >= C52472pU.NONE.value) {
            int i = A04().value;
            C52472pU r2 = C52472pU.DOWNLOAD_FAILED;
            if (i <= r2.value) {
                if (A04().value == C52472pU.DOWNLOADED.value) {
                    if (this instanceof AnonymousClass2dC) {
                        A0w = C36441kJ.A0w(((AnonymousClass2dC) this).A00.A01.A00.getFilesDir(), "channels_gdpr.zip");
                    } else {
                        A0w = C36441kJ.A0w(((AnonymousClass2dB) this).A00.A01.A00.getFilesDir(), "gdpr.zip");
                    }
                    if (!A0w.exists()) {
                        Log.e("gdpr/validate-state/report-media-file-missing");
                        A0B(C52472pU.AVAILABLE.value);
                    }
                }
                C52472pU A042 = A04();
                C52472pU r1 = C52472pU.AVAILABLE;
                if (A042 == r1 && A03() == null) {
                    Log.e("gdpr/validate-state/report-message-missing");
                    A07();
                }
                if (A04() == r1 || A04() == r2) {
                    C19970wo r5 = this.A0A;
                    if (C19970wo.A00(r5) > A01()) {
                        long A002 = C19970wo.A00(r5);
                        long A012 = A01();
                        if (A002 > A012) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("gdpr/validate-state/report-too-old current:");
                            A0u.append(A002);
                            C36321k7.A1V(" expired:", A0u, A012);
                            A07();
                        }
                    }
                }
            }
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("gdpr/validate-state/wrong-state ");
        C36331k8.A1P(A04(), A0u2);
    }

    public final synchronized void A0D(long j) {
        Log.i("gdpr/on-report-requested");
        A0B(C52472pU.REQUESTED.value);
        if (this instanceof AnonymousClass2dC) {
            ((AnonymousClass2dC) this).A01.A1h("newsletter_gdpr_report_timestamp", j);
        } else {
            ((AnonymousClass2dB) this).A01.A1h("gdpr_report_timestamp", j);
        }
    }

    public final synchronized void A0F(byte[] bArr, long j, long j2) {
        AnonymousClass00C.A0D(bArr, 1);
        Log.i("gdpr/on-report-available");
        try {
            C18750th.A0A(A05(), bArr);
            this.A00 = A00(bArr);
            if (A03() == null) {
                Log.e("gdpr/on-report-available/cannot-create-message");
            } else {
                A0B(C52472pU.AVAILABLE.value);
                boolean z = this instanceof AnonymousClass2dC;
                if (z) {
                    ((AnonymousClass2dC) this).A01.A1h("newsletter_gdpr_report_timestamp", j);
                } else {
                    ((AnonymousClass2dB) this).A01.A1h("gdpr_report_timestamp", j);
                }
                if (z) {
                    C36341k9.A0w(C19420v0.A00(((AnonymousClass2dC) this).A01), "newsletter_gdpr_report_expiration_timestamp", j2);
                } else {
                    C36341k9.A0w(C19420v0.A00(((AnonymousClass2dB) this).A01), "gdpr_report_expiration_timestamp", j2);
                }
            }
        } catch (IOException e) {
            Log.e("gdpr/on-report-available/cannot-save", e);
        }
        return;
    }

    private final C46972by A00(byte[] bArr) {
        C46972by r1;
        String str;
        try {
            AnonymousClass8SX A0i = AnonymousClass8SX.A0i(bArr);
            if (A0i != null) {
                AnonymousClass3T1 A002 = this.A0F.A00(C1899296d.A00(A0i, new C64933Qa(C177548dy.A00, "", false), 0).A00());
                AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageDocument");
                r1 = (C46972by) A002;
                try {
                    if (this instanceof AnonymousClass2dC) {
                        str = "channels_gdpr.zip";
                    } else {
                        str = "gdpr.zip";
                    }
                    r1.A06 = str;
                    return r1;
                } catch (AnonymousClass186 | C28541Tb e) {
                    e = e;
                    Log.e("gdpr/create-gdpr-message", e);
                    return r1;
                }
            } else {
                Log.e("gdpr/create-gdpr-message/null");
                return null;
            }
        } catch (AnonymousClass186 | C28541Tb e2) {
            e = e2;
            r1 = null;
            Log.e("gdpr/create-gdpr-message", e);
            return r1;
        }
    }

    public final C46972by A03() {
        byte[] A0J;
        if (this.A00 != null || (A0J = C18750th.A0J(A05())) == null) {
            return this.A00;
        }
        return A00(A0J);
    }

    public File A05() {
        boolean z = this instanceof AnonymousClass2dC;
        File filesDir = this.A03.A00.getFilesDir();
        if (z) {
            return C36441kJ.A0w(filesDir, "channels_gdpr.info");
        }
        return C36441kJ.A0w(filesDir, "gdpr.info");
    }

    public void A06() {
        int i;
        if (this instanceof AnonymousClass2dC) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
        }
        A0C(i);
    }

    public void A07() {
        if (this instanceof AnonymousClass2dC) {
            C36341k9.A0u(C19420v0.A00(((AnonymousClass2dC) this).A01).remove("newsletter_gdpr_report_expiration_timestamp").remove("newsletter_gdpr_report_timestamp"), "newsletter_gdpr_report_state");
        } else {
            C36341k9.A0u(C19420v0.A00(((AnonymousClass2dB) this).A01).remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp"), "gdpr_report_state");
        }
    }

    public void A0B(int i) {
        if (this instanceof AnonymousClass2dC) {
            C36341k9.A0v(C19420v0.A00(((AnonymousClass2dC) this).A01), "newsletter_gdpr_report_state", i);
        } else {
            C36341k9.A0v(C19420v0.A00(((AnonymousClass2dB) this).A01), "gdpr_report_state", i);
        }
    }

    public final void A0C(int i) {
        Log.i("gdpr/notify-report-available");
        C19630wG r5 = this.A03;
        Context context = r5.A00;
        AnonymousClass00C.A08(context);
        String A0m = C36361kB.A0m(context, i);
        C07700Yy A0F2 = C36421kH.A0F(context);
        A0F2.A0G(A0m);
        A0F2.A09(System.currentTimeMillis());
        A0F2.A06(3);
        A0F2.A0I(true);
        A0F2.A0F(r5.A01(R.string.f12nameremoved));
        A0F2.A0E(A0m);
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.report.ReportActivity");
        A0F2.A0D = C65743Th.A00(context, 0, A0D2, 0);
        C36361kB.A1A(A0F2);
        this.A0B.A02(16, A0F2.A05());
    }

    public final synchronized void A0E(Activity activity) {
        int i;
        synchronized (this) {
            Log.i("gdpr/download-report");
            C46972by A032 = A03();
            if (A032 != null) {
                C65013Qj A002 = AnonymousClass2bU.A00(A032);
                AnonymousClass17Y r7 = this.A02;
                C21010yW r6 = this.A0E;
                C20060wx r5 = this.A0C;
                AnonymousClass2XL r8 = new AnonymousClass2XL(activity, r7, this.A08, this.A09, r5, r6, this);
                if (this.A0D.A0E(555)) {
                    C29961Yr r72 = this.A0G;
                    C25471Gl A022 = AnonymousClass6Y1.A02(A032);
                    String A1b = A032.A1b();
                    String str = A032.A04;
                    C18740tg.A06(str);
                    String str2 = A032.A03;
                    String str3 = A032.A07;
                    String str4 = A002.A0J;
                    C18740tg.A06(str4);
                    byte[] bArr = A002.A0a;
                    long j = A032.A00;
                    if (this instanceof AnonymousClass2dC) {
                        i = 5;
                    } else {
                        i = 1;
                    }
                    r72.A0A(r8, A022, new AnonymousClass3YU(A032, this, 10), new AnonymousClass3YU(A032, this, 11), A1b, str, str2, str3, str4, (String) null, bArr, i, 8, 6, 0, j);
                } else {
                    this.A0H.A0C(r8, A032, 0);
                }
            } else {
                Log.e("gdpr/download/no-message");
            }
        }
    }

    public C74173lB(C20690y0 r2, AnonymousClass17Y r3, AnonymousClass171 r4, C24341Cb r5, C19970wo r6, C19630wG r7, C25271Fq r8, C20060wx r9, C20310xM r10, AnonymousClass16J r11, C20810yC r12, C21010yW r13, C20520xh r14, C29961Yr r15, AnonymousClass1ST r16, C51622o7 r17) {
        this.A03 = r7;
        this.A0A = r6;
        this.A0D = r12;
        this.A02 = r3;
        this.A07 = r2;
        this.A0E = r13;
        this.A0C = r9;
        this.A08 = r4;
        this.A04 = r10;
        this.A05 = r11;
        this.A09 = r5;
        this.A0G = r15;
        this.A0H = r16;
        this.A0B = r8;
        this.A0F = r14;
        this.A06 = r17;
        this.A01 = r12.A07(4866);
    }
}
