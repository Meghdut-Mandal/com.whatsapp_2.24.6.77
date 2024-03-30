package com.whatsapp;

import X.AnonymousClass00h;
import X.AnonymousClass100;
import X.AnonymousClass101;
import X.AnonymousClass11n;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass18Z;
import X.AnonymousClass1A2;
import X.AnonymousClass1G4;
import X.AnonymousClass1M7;
import X.AnonymousClass1V1;
import X.AnonymousClass1YV;
import X.AnonymousClass3BJ;
import X.AnonymousClass4VM;
import X.C000600g;
import X.C131086Nr;
import X.C132956Vy;
import X.C1497072l;
import X.C162347oR;
import X.C18720te;
import X.C18740tg;
import X.C18780to;
import X.C18800tq;
import X.C18810tr;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C18930u3;
import X.C19420v0;
import X.C19430v1;
import X.C19600wD;
import X.C19620wF;
import X.C19650wI;
import X.C19690wM;
import X.C19700wN;
import X.C19770wU;
import X.C19970wo;
import X.C20010ws;
import X.C20030wu;
import X.C20060wx;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C21350z4;
import X.C21360z5;
import X.C21400zB;
import X.C21410zC;
import X.C21420zD;
import X.C21700zf;
import X.C21860zv;
import X.C223914c;
import X.C224314h;
import X.C25271Fq;
import X.C26621Kw;
import X.C26981Mg;
import X.C27501Ol;
import X.C28901Un;
import X.C29341Wg;
import X.C35621iz;
import X.C35641j1;
import X.C35671j4;
import X.C35761jD;
import X.C36611kd;
import X.C45072Py;
import X.C80253v6;
import X.C90954bD;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.reflect.Method;
import java.security.Security;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spo";
    public final Context appContext;
    public final C18720te appStartStat;
    public C21420zD applicationCreatePerfTracker;
    public boolean asyncInitStarted;
    public boolean isFirstColdStart = false;
    public C18820ts whatsAppLocale;

    /* JADX INFO: finally extract failed */
    private boolean decompressAsset(AnonymousClass101 r15, C19970wo r16, boolean z, C21010yW r18, C20060wx r19, C19420v0 r20, C19700wN r21) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = z;
        try {
            if (r15.A02(this.appContext, COMPRESSED_LIBS_ARCHIVE_NAME, 0, false, z2)) {
                this.isFirstColdStart = true;
                C45072Py r2 = new C45072Py();
                r2.A02 = COMPRESSED_LIBS_ARCHIVE_NAME;
                r2.A01 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                r18.Bly(r2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractAppShellDelegate/decompressAsset time:");
            sb.append(SystemClock.uptimeMillis() - uptimeMillis);
            sb.append(" firstColdStart:");
            sb.append(this.isFirstColdStart);
            Log.i(sb.toString());
            return true;
        } catch (Exception e) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AbstractAppShellDelegate/decompressLibraries: Error decompressing archive libs.spo, usingLegacyMethod: ");
                sb2.append(z2);
                Log.w(sb2.toString(), e);
                maybeReportDecompressionFailure(r19, e, r20, r21);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AbstractAppShellDelegate/decompressAsset time:");
                sb3.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb3.append(" firstColdStart:");
                sb3.append(this.isFirstColdStart);
                Log.i(sb3.toString());
                return false;
            } catch (Throwable th) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("AbstractAppShellDelegate/decompressAsset time:");
                sb4.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb4.append(" firstColdStart:");
                sb4.append(this.isFirstColdStart);
                Log.i(sb4.toString());
                throw th;
            }
        }
    }

    private void decompressLibraries(WhatsAppLibLoader whatsAppLibLoader, AnonymousClass101 r19, C19970wo r20, C19700wN r21, C21010yW r22, C20060wx r23, C19420v0 r24) {
        Context context = this.appContext;
        try {
            WhatsAppLibLoader.A01(context, "superpack");
            byte[] bArr = new byte[3];
            try {
                AssetDecompressor.testDecompressorLibraryUsable(bArr);
                if (!Arrays.equals(new byte[]{71, 119, 83}, bArr)) {
                    Log.w("whatsappassetdecompressor/usable compressor test array does not match");
                    Log.e("AbstractAppShellDelegate/decompressLibraries: Could not load decompressor libraries");
                    return;
                }
                Log.i("whatsappassetdecompressor/decompressor-usable isLibraryUsable: True");
                Context context2 = this.appContext;
                Objects.requireNonNull("2.24.6.77");
                boolean z = true;
                C18740tg.A0C(!"2.24.6.77".isEmpty());
                int i = AssetDecompressor.get_architecture();
                StringBuilder sb = new StringBuilder();
                sb.append("2.24.6.77");
                sb.append(":");
                sb.append(new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[i]);
                sb.append(":");
                sb.append(new File(context2.getPackageCodePath()).lastModified() / 1000);
                AnonymousClass101 r10 = r19;
                r10.A01 = sb.toString();
                r10.A02 = true;
                AnonymousClass100 r3 = r10.A03;
                if (!(i == 0 || i == 3)) {
                    z = false;
                }
                r3.A01(z, new File(context2.getFilesDir(), "decompressed/libs.spo").getAbsolutePath());
                C19970wo r11 = r20;
                C19700wN r32 = r21;
                C21010yW r13 = r22;
                C20060wx r14 = r23;
                C19420v0 r15 = r24;
                C19700wN r16 = r32;
                if (!decompressAsset(r10, r11, false, r13, r14, r15, r16) && decompressAsset(r10, r11, true, r13, r14, r15, r16)) {
                    r32.A0E("AbstractAppShellDelegate/decompressLibraries/fallback", (String) null, false);
                }
            } catch (UnsatisfiedLinkError e) {
                Log.w("whatsappassetdecompressor/decompressor-usable error while testing compressor library usability testLibraryUsable", e);
            }
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("whatsapplibloader/compression library is corrupt/");
            sb2.append(e2);
            Log.i(sb2.toString());
            WhatsAppLibLoader.A00(context);
        }
    }

    private void initCrashHandling(C21350z4 r1, C21400zB r2) {
        r1.A0C = r2;
        C21410zC.A00 = r1;
    }

    private void initLogging(C19600wD r2) {
        Log.connectivityInfoProvider = new C19690wM(r2);
    }

    private void initStartupPathPerfLogging(C18780to r11) {
        C21420zD r1 = (C21420zD) ((C18800tq) r11).AfI.A00.A0D.get();
        this.applicationCreatePerfTracker = r1;
        long j = this.appStartStat.A03;
        C21700zf r2 = r1.A00;
        r2.A04.A04 = true;
        r2.A06.BPN(703926783, "perf_origin", "ApplicationCreatePerfTracker", j, TimeUnit.NANOSECONDS);
        r2.A05(j);
        this.applicationCreatePerfTracker.A00.A07("app_creation_on_create");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installAnrDetector(X.C19970wo r18, X.C20810yC r19, X.C21010yW r20, X.AnonymousClass10P r21, com.whatsapp.nativelibloader.WhatsAppLibLoader r22, X.AnonymousClass10Q r23, X.AnonymousClass10R r24) {
        /*
            r17 = this;
            r5 = r17
            X.0zD r0 = r5.applicationCreatePerfTracker
            java.lang.String r4 = "InstallAnrDetector"
            X.0zf r0 = r0.A00
            r0.A07(r4)
            java.lang.Boolean r0 = X.C18750th.A03
            android.content.Context r7 = r5.appContext
            r6 = r22
            monitor-enter(r6)
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x023d }
            java.lang.Boolean r0 = r6.A00     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 != 0) goto L_0x0088
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r6.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            X.101 r1 = r6.A06     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            java.lang.String r0 = "libs.spo"
            boolean r0 = r1.A01(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 == 0) goto L_0x006c
            X.AnonymousClass10B.A00(r7)     // Catch:{ IOException -> 0x006c }
            java.lang.String[] r8 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A08     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r3 = 3
            r2 = 0
        L_0x002e:
            r1 = r8[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            boolean r0 = X.AnonymousClass101.A00(r7, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 != 0) goto L_0x0039
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A01(r7, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
        L_0x0039:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x002e
            boolean r0 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A03()     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "whatsapplibloader/load-startup-libs unable to use loaded libraries; trying install direct from apk"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            java.util.List r0 = java.util.Arrays.asList(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A02(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs install direct from apk worked; retesting library usability"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            boolean r0 = com.whatsapp.nativelibloader.WhatsAppLibLoader.A03()     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "whatsapplibloader/load-startup-libs library usability still broken; throwing to corrupt installation activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            java.lang.String r1 = "unable to use libraries despite successful install directly from apk"
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            goto L_0x0093
        L_0x0067:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r6.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            goto L_0x0094
        L_0x006c:
            java.lang.String r0 = "whatsappsoloader/decompression failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            X.0xn r3 = r6.A05     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r1 = 20
            X.1jB r0 = new X.1jB     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r0.<init>(r7, r3, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r2.post(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            goto L_0x0217
        L_0x0088:
            boolean r0 = r0.booleanValue()     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            if (r0 != 0) goto L_0x0094
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
        L_0x0093:
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x0130 }
        L_0x0094:
            monitor-exit(r6)
            r1 = 5391(0x150f, float:7.554E-42)
            X.0yV r0 = X.C21000yV.A02
            r2 = r19
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            java.lang.String r8 = "anr_detector"
            java.lang.String r13 = "abort_hook"
            java.lang.String r11 = "breakpad"
            r10 = r21
            r9 = r23
            if (r0 == 0) goto L_0x0219
            X.135 r7 = new X.135
            r7.<init>()
            X.135 r6 = new X.135
            r6.<init>()
            X.135 r3 = new X.135
            r3.<init>()
            X.135 r2 = new X.135
            r2.<init>()
            long r14 = android.os.SystemClock.elapsedRealtime()
            r1 = 2
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r5, (int) r1)
            r10.A02(r0, r11)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A00 = r0
            java.lang.String r0 = "anrDetector/breakpad-manager"
            r7.A02 = r0
            long r11 = android.os.SystemClock.elapsedRealtime()
            X.11Z r0 = X.AnonymousClass11Z.A00
            r10.A02(r0, r13)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A00 = r0
            java.lang.String r0 = "anrDetector/abortHooks"
            r6.A02 = r0
            long r11 = android.os.SystemClock.elapsedRealtime()
            r1 = 5
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r9, (int) r1)
            r10.A02(r0, r8)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A00 = r0
            java.lang.String r0 = "anrDetector/anrDetectorUtil"
            r3.A02 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            java.lang.String r0 = "anrDetector/overall"
            r2.A02 = r0
            r0 = r20
            r0.Bly(r7)     // Catch:{ all -> 0x012e }
            r0.Bly(r6)     // Catch:{ all -> 0x012e }
            r0.Bly(r3)     // Catch:{ all -> 0x012e }
            r0.Bly(r2)     // Catch:{ all -> 0x012e }
            goto L_0x0230
        L_0x012e:
            r0 = move-exception
            throw r0
        L_0x0130:
            r3 = move-exception
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A00(r7)     // Catch:{ all -> 0x023d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x023d }
            r2.<init>()     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs: available internal storage: "
            r2.append(r0)     // Catch:{ all -> 0x023d }
            X.0wx r0 = r6.A04     // Catch:{ all -> 0x023d }
            long r0 = r0.A02()     // Catch:{ all -> 0x023d }
            r2.append(r0)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x023d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023d }
            java.lang.String r8 = "WhatsAppLibLoader/loadStartupLibs"
            com.whatsapp.util.Log.e(r8, r3)     // Catch:{ all -> 0x023d }
            X.0v0 r3 = r6.A03     // Catch:{ all -> 0x023b }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r2 = "corrupt_installation_reported_timestamp"
            boolean r0 = r3.A2V(r2, r0)     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0202
            java.io.File r9 = r7.getFilesDir()     // Catch:{ all -> 0x023b }
            java.lang.String r1 = "decompressed/libs.spo"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x023b }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x023b }
            java.io.File[] r10 = r0.listFiles()     // Catch:{ all -> 0x023b }
            if (r10 != 0) goto L_0x0183
            java.lang.String r0 = "whatsapplibloader/nativeLibs/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023b }
        L_0x0176:
            X.0wN r9 = r6.A01     // Catch:{ all -> 0x023b }
            java.lang.String r1 = "native libraries are missing"
            r0 = 1
            r9.A0E(r8, r1, r0)     // Catch:{ all -> 0x023b }
            r3.A1Z(r2)     // Catch:{ all -> 0x023b }
            goto L_0x0202
        L_0x0183:
            int r0 = r10.length     // Catch:{ all -> 0x023b }
            r16 = r0
            r11 = 0
        L_0x0187:
            r0 = r16
            if (r11 >= r0) goto L_0x0176
            r15 = r10[r11]     // Catch:{ all -> 0x023b }
            java.lang.String r13 = r15.getName()     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r9.<init>()     // Catch:{ all -> 0x023b }
            boolean r0 = r15.canRead()     // Catch:{ all -> 0x023b }
            java.lang.String r1 = "-"
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = "r"
        L_0x01a0:
            r9.append(r0)     // Catch:{ all -> 0x023b }
            boolean r0 = r15.canWrite()     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = "w"
        L_0x01ab:
            r9.append(r0)     // Catch:{ all -> 0x023b }
            boolean r0 = r15.canExecute()     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x01b6
            java.lang.String r1 = "x"
        L_0x01b6:
            r9.append(r1)     // Catch:{ all -> 0x023b }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x023b }
            long r0 = r15.lastModified()     // Catch:{ all -> 0x023b }
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x023b }
            r12.<init>(r0)     // Catch:{ all -> 0x023b }
            java.lang.String r14 = r12.toString()     // Catch:{ all -> 0x023b }
            long r0 = r15.length()     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r12.<init>()     // Catch:{ all -> 0x023b }
            java.lang.String r15 = "whatsapplibloader/nativeLib Name: "
            r12.append(r15)     // Catch:{ all -> 0x023b }
            r12.append(r13)     // Catch:{ all -> 0x023b }
            java.lang.String r13 = ", Permissions: "
            r12.append(r13)     // Catch:{ all -> 0x023b }
            r12.append(r9)     // Catch:{ all -> 0x023b }
            java.lang.String r9 = ", Last Modified: "
            r12.append(r9)     // Catch:{ all -> 0x023b }
            r12.append(r14)     // Catch:{ all -> 0x023b }
            java.lang.String r9 = ", Size: "
            r12.append(r9)     // Catch:{ all -> 0x023b }
            r12.append(r0)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x023b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023b }
            goto L_0x01ff
        L_0x01fb:
            r0 = r1
            goto L_0x01ab
        L_0x01fd:
            r0 = r1
            goto L_0x01a0
        L_0x01ff:
            int r11 = r11 + 1
            goto L_0x0187
        L_0x0202:
            X.0xn r3 = r6.A05     // Catch:{ all -> 0x023d }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x023d }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x023d }
            r2.<init>(r0)     // Catch:{ all -> 0x023d }
            r1 = 20
            X.1jB r0 = new X.1jB     // Catch:{ all -> 0x023d }
            r0.<init>(r7, r3, r1)     // Catch:{ all -> 0x023d }
            r2.post(r0)     // Catch:{ all -> 0x023d }
        L_0x0217:
            monitor-exit(r6)
            goto L_0x0230
        L_0x0219:
            r1 = 3
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r5, (int) r1)
            r10.A02(r0, r11)
            X.11Z r0 = X.AnonymousClass11Z.A00
            r10.A02(r0, r13)
            r1 = 6
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r9, (int) r1)
            r10.A02(r0, r8)
        L_0x0230:
            com.whatsapp.wamsys.JniBridge.setDependencies(r24)
            X.0zD r0 = r5.applicationCreatePerfTracker
            X.0zf r0 = r0.A00
            r0.A06(r4)
            return
        L_0x023b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.installAnrDetector(X.0wo, X.0yC, X.0yW, X.10P, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.10Q, X.10R):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
        if (r0.A08 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void lambda$queueAsyncInit$6(X.AnonymousClass1A2 r8, X.C18780to r9) {
        /*
            X.0u5 r4 = X.AnonymousClass1A2.A01
            java.lang.String r5 = "async-init"
            X.0yW r3 = r8.A00
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r0)
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.0tq r9 = (X.C18800tq) r9
            X.004 r0 = r9.A6L
            X.005 r0 = X.C18840tu.A00(r0)
            java.lang.Object r0 = r0.get()
            X.1XA r0 = (X.AnonymousClass1XA) r0
            r0.A00()
            X.0tq r0 = r9.AfI
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A0G
            java.lang.Object r1 = r0.get()
            X.30S r1 = (X.AnonymousClass30S) r1
            X.004 r0 = r9.A7L     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006e }
            X.12U r0 = (X.AnonymousClass12U) r0     // Catch:{ all -> 0x006e }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x004b
            X.004 r0 = r9.A5G     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006e }
            X.12P r0 = (X.AnonymousClass12P) r0     // Catch:{ all -> 0x006e }
            r0.A06()     // Catch:{ all -> 0x006e }
            boolean r0 = r0.A08     // Catch:{ all -> 0x006e }
            r2 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x006e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x006e }
        L_0x0052:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x006e }
            X.0wO r0 = (X.C19710wO) r0     // Catch:{ all -> 0x006e }
            r0.BIB()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0066
            r0.BRM()     // Catch:{ all -> 0x006e }
        L_0x0066:
            r0.BRL()     // Catch:{ all -> 0x006e }
            goto L_0x0052
        L_0x006a:
            X.C54992tt.A00(r3, r4, r5, r6, r7)
            return
        L_0x006e:
            r0 = move-exception
            X.C54992tt.A00(r3, r4, r5, r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$6(X.1A2, X.0to):void");
    }

    private void logDebugInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractAppShellDelegate/debug_info: pkg=");
        sb.append(this.appContext.getPackageName());
        sb.append("; v=");
        sb.append(C18930u3.A01());
        sb.append("; vc=");
        sb.append(240677001);
        sb.append("; p=");
        sb.append("consumer");
        sb.append("; e=");
        sb.append(90);
        sb.append("; g=");
        sb.append("726e71215cbf71ca18f3595bfb681b24ca0a1d59");
        sb.append("; t=");
        sb.append(1711380747000L);
        sb.append("; d=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append("; os=Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; abis=");
        sb.append(TextUtils.join(",", Build.SUPPORTED_ABIS));
        Log.i(sb.toString());
    }

    private void maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(C18780to r5) {
        if (new File(this.appContext.getDir("account_switching", 0), "checkpoint").exists()) {
            Log.i("AbstractAppShellDelegate/onCreate/checkpoint file exists/recoverFromFailureToSwitchAccountsDuringAppStartup");
            ((C131086Nr) C18840tu.A00(((C18800tq) r5).A0B).get()).A03(true);
            r5.B3m().A0E("AbstractAppShellDelegate/recoverFromFailureToSwitchAccountsDuringAppStartup", (String) null, false);
        }
    }

    private void maybeReportDecompressionFailure(C20060wx r6, Exception exc, C19420v0 r8, C19700wN r9) {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractAppShellDelegate/maybeReportDecompressionFailure: available internal storage: ");
        sb.append(r6.A02());
        Log.i(sb.toString());
        Log.e("AbstractAppShellDelegate/maybeReportDecompressionFailure", exc);
        if (r8.A2V("decompression_failure_reported_timestamp", 86400000)) {
            r9.A0E("AbstractAppShellDelegate/maybeReportDecompressionFailure", "superpack decompression failed", true);
            r8.A1Z("decompression_failure_reported_timestamp");
        }
    }

    private void setBouncyCastleProvider() {
        this.applicationCreatePerfTracker.A00.A07("SetBouncyCastleProvider");
        Security.addProvider(new AnonymousClass11n());
        this.applicationCreatePerfTracker.A00.A06("SetBouncyCastleProvider");
    }

    private void setStrictModePolicyForAppInit() {
        this.applicationCreatePerfTracker.A00.A07("SetStrictModePolicyForAppInit");
        this.applicationCreatePerfTracker.A00.A06("SetStrictModePolicyForAppInit");
    }

    private void setupTestEnvironmentForDebug() {
        Context context = this.appContext;
        Context context2 = C132956Vy.A00;
        android.util.Log.w("EndToEnd-Test", "Prepare");
        C132956Vy.A00 = context;
        C132956Vy.A01();
    }

    /* renamed from: lambda$installAnrDetector$0$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m0lambda$installAnrDetector$0$comwhatsappAbstractAppShellDelegate() {
        BreakpadManager.A00(this.appContext);
    }

    /* renamed from: lambda$installAnrDetector$2$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m1lambda$installAnrDetector$2$comwhatsappAbstractAppShellDelegate() {
        BreakpadManager.A00(this.appContext);
    }

    /* renamed from: lambda$onCreate$4$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ String m2lambda$onCreate$4$comwhatsappAbstractAppShellDelegate() {
        return this.appContext.getString(R.string.gcm_defaultSenderId);
    }

    /* renamed from: lambda$queueAsyncInit$5$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m3lambda$queueAsyncInit$5$comwhatsappAbstractAppShellDelegate() {
        C18830tt r15 = ((C18800tq) C18810tr.A00(this.appContext, C18800tq.class)).AfI.A00;
        C18800tq r1 = r15.ADO;
        Context context = r1.AfJ.A00;
        C19620wF.A00(context);
        C20810yC r16 = (C20810yC) r1.A02.get();
        C19770wU r26 = (C19770wU) r1.A9Y.get();
        C36611kd r27 = new C36611kd(C18840tu.A00(r15.ADO.A56));
        AnonymousClass16D r17 = (AnonymousClass16D) r1.A2A.get();
        AnonymousClass171 r18 = (AnonymousClass171) r1.A90.get();
        C21060yb r19 = (C21060yb) r1.A8W.get();
        C27501Ol r14 = (C27501Ol) r1.A0H.get();
        C90954bD r152 = (C90954bD) r15.A0M.get();
        AnonymousClass1M7 r162 = (AnonymousClass1M7) r15.A13.get();
        AnonymousClass3BJ r10 = new AnonymousClass3BJ(context, (AnonymousClass1V1) r1.A0N.get(), (C21360z5) r1.A7P.get(), r14, r152, r162, r17, r18, r19, (C25271Fq) r1.A9D.get(), r16, (AnonymousClass1YV) r1.A5S.get(), (C29341Wg) r1.A8q.get(), (AnonymousClass1G4) r1.A7Z.get(), (C19650wI) r1.A4f.get(), r26, r27);
        Method method = C000600g.A03;
        AnonymousClass00h.A01("AppAsyncInit/BroadcastReceiver");
        new C35671j4(r10.A05, 41).run();
        Context context2 = r10.A00;
        C21060yb r6 = r10.A08;
        C19650wI r5 = r10.A0D;
        AnonymousClass1G4 r4 = r10.A0C;
        C28901Un r12 = C28901Un.A04;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C26981Mg.A01(C28901Un.A04, context2, intentFilter, true);
        r5.Bp3(new C35761jD(r4, r6, 45));
        new C1497072l(r10.A04, 36).run();
        AnonymousClass1YV r3 = r10.A0A;
        Objects.requireNonNull(r3);
        new C80253v6(r3, 34).run();
        C26981Mg.A00(r10.A0E, context2, new IntentFilter("com.whatsapp.alarm.WEB_RENOTIFY"), (Handler) null, C19430v1.A0C, false);
        C26981Mg.A01(new AnonymousClass4VM(r10, 1), context2, new IntentFilter("android.intent.action.TIME_SET"), true);
        C26981Mg.A01(new AnonymousClass4VM(r10, 2), context2, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"), true);
        C26981Mg.A01(new AnonymousClass4VM(r10, 3), context2, new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        C26981Mg.A01(new AnonymousClass4VM(r10.A06, 0), context2, new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        C27501Ol r32 = r10.A03;
        if (!r32.A00.A0L()) {
            C26981Mg.A01(new C162347oR(r32, 0), context2, new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
        }
        AnonymousClass1V1 r42 = r10.A01;
        try {
            C26981Mg.A01(r42.A00, context2, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), true);
        } catch (Exception e) {
            r42.A01.A0D("AudioBecomingNoisyMonitor", e.getMessage(), e);
        }
        AnonymousClass00h.A00();
    }

    /* renamed from: lambda$queueAsyncInit$7$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ boolean m4lambda$queueAsyncInit$7$comwhatsappAbstractAppShellDelegate(C18780to r8) {
        Log.i("app-init main thread idle");
        synchronized (this) {
            if (!this.asyncInitStarted) {
                this.asyncInitStarted = true;
                C18800tq r6 = (C18800tq) r8;
                C18830tt r5 = r6.AfI.A00;
                AnonymousClass18Z r4 = (AnonymousClass18Z) C18840tu.A00(r5.A0L).get();
                r4.A0I.execute(new C35621iz(r4, this.appContext, 40));
                C19770wU r3 = (C19770wU) r6.A9Y.get();
                r3.Boy(new C35641j1((Object) this, 4));
                r3.Boy(new C35621iz((AnonymousClass1A2) r6.A6R.get(), r8, 0));
                ((C21860zv) r5.A4A.get()).A02("AppInit", "End");
                ConditionVariable conditionVariable = C18740tg.A00;
            }
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18820ts r3 = this.whatsAppLocale;
        C18740tg.A06(r3);
        Locale A00 = C20030wu.A00(configuration);
        if (!r3.A05.equals(A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("whatsapplocale/savedefaultlanguage/phone language changed to: ");
            String[] strArr = C26621Kw.A04;
            sb.append(A00.toLanguageTag());
            Log.i(sb.toString());
            r3.A05 = A00;
            if (!r3.A06) {
                r3.A04 = A00;
                C18820ts.A02(r3);
                for (C20010ws BaC : r3.A09) {
                    BaC.BaC();
                }
            }
        }
        C18820ts r0 = this.whatsAppLocale;
        C18740tg.A06(r0);
        r0.A0O();
        C224314h.A02(true, configuration);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|2c|5|6|7|8|(1:10)|11|(1:13)|14|15|16|17|18|(3:22|23|24)|25|26|(1:28)(3:32|(1:34)|35)|29|(3:31|36|37)(35:38|39|(4:41|(2:44|42)|172|45)|46|47|48|(1:50)(2:51|(1:55))|56|57|(1:59)|60|61|(6:63|64|65|66|67|68)(4:76|77|78|81)|82|83|(1:87)|89|90|(1:93)|96|(1:100)|101|(1:103)|104|105|106|(1:108)(4:109|110|111|112)|113|114|115|116|(2:118|5ba)|142|143|144)|145|146|147|148) */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0704, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        X.C18740tg.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x070c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        X.AnonymousClass00h.A00();
        r7.A06("AppInit_main");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0713, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x04af, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.C05600Qi.A00(r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x04b3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04f9, code lost:
        if (X.C20800yB.A01(r11, r10, 7359) == false) goto L_0x04fb;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x02f4 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0338 A[Catch:{ all -> 0x0704, all -> 0x070c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x034b A[Catch:{ all -> 0x0704, all -> 0x070c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x034c A[Catch:{ all -> 0x0704, all -> 0x070c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x03a4 A[SYNTHETIC, Splitter:B:38:0x03a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r51 = this;
            java.lang.String r18 = "MainThreadInit"
            r1 = r51
            android.content.Context r2 = r1.appContext
            java.lang.Class<X.0to> r0 = X.C18780to.class
            java.lang.Object r4 = X.C18810tr.A00(r2, r0)
            X.0to r4 = (X.C18780to) r4
            r0 = r4
            X.0tq r0 = (X.C18800tq) r0
            X.004 r2 = r0.A24
            java.lang.Object r2 = r2.get()
            X.0wD r2 = (X.C19600wD) r2
            r1.initLogging(r2)
            java.lang.String r2 = "AbstractAppShellDelegate/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r1.maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(r4)
            X.0wN r5 = r4.B3m()
            X.0u2 r3 = com.whatsapp.util.Log.LOGGER_THREAD
            java.lang.String r2 = X.C18920u2.A06
            monitor-enter(r3)
            r3.A00 = r5     // Catch:{ all -> 0x071b }
            monitor-exit(r3)
            X.004 r2 = r0.A2V
            java.lang.Object r3 = r2.get()
            X.0z4 r3 = (X.C21350z4) r3
            X.004 r2 = r0.A1D
            java.lang.Object r2 = r2.get()
            X.0zB r2 = (X.C21400zB) r2
            r3.A0C = r2
            X.C21410zC.A00 = r3
            r1.initStartupPathPerfLogging(r4)
            r1.logDebugInfo()
            X.0tq r2 = r0.AfI
            X.0tt r10 = r2.A00
            X.004 r2 = r10.A4A
            java.lang.Object r7 = r2.get()
            X.0zv r7 = (X.C21860zv) r7
            android.content.Context r6 = r1.appContext     // Catch:{ all -> 0x0719 }
            X.0wk r5 = r7.A03     // Catch:{ all -> 0x0719 }
            r3 = 25
            X.1j5 r2 = new X.1j5     // Catch:{ all -> 0x0719 }
            r2.<init>(r7, r6, r3)     // Catch:{ all -> 0x0719 }
            r5.execute(r2)     // Catch:{ all -> 0x0719 }
            java.lang.String r11 = "AppInit"
            java.lang.String r2 = "Resume"
            r7.A02(r11, r2)     // Catch:{ all -> 0x0719 }
            X.0zD r2 = r1.applicationCreatePerfTracker
            java.lang.String r6 = "DecompressLibraries"
            X.0zf r2 = r2.A00
            r2.A07(r6)
            X.004 r2 = r0.A9W
            java.lang.Object r8 = r2.get()
            com.whatsapp.nativelibloader.WhatsAppLibLoader r8 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r8
            X.004 r2 = r0.A9V
            java.lang.Object r7 = r2.get()
            X.101 r7 = (X.AnonymousClass101) r7
            X.0wo r22 = r4.Bvc()
            X.0wN r23 = r4.B3m()
            X.004 r2 = r0.A79
            java.lang.Object r5 = r2.get()
            X.0yW r5 = (X.C21010yW) r5
            X.004 r2 = r0.A8B
            java.lang.Object r3 = r2.get()
            X.0wx r3 = (X.C20060wx) r3
            X.004 r2 = r0.A9G
            java.lang.Object r2 = r2.get()
            X.0v0 r2 = (X.C19420v0) r2
            r19 = r1
            r20 = r8
            r21 = r7
            r24 = r5
            r25 = r3
            r26 = r2
            r19.decompressLibraries(r20, r21, r22, r23, r24, r25, r26)
            X.0zD r2 = r1.applicationCreatePerfTracker
            X.0zf r2 = r2.A00
            r2.A06(r6)
            X.0wo r20 = r4.Bvc()
            X.0yC r21 = r4.Azp()
            X.004 r2 = r0.A79
            java.lang.Object r13 = r2.get()
            X.0yW r13 = (X.C21010yW) r13
            X.004 r2 = r10.A3g
            java.lang.Object r12 = r2.get()
            X.10P r12 = (X.AnonymousClass10P) r12
            X.004 r2 = r0.A9W
            java.lang.Object r9 = r2.get()
            com.whatsapp.nativelibloader.WhatsAppLibLoader r9 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r9
            X.004 r2 = r10.A00
            java.lang.Object r8 = r2.get()
            X.10Q r8 = (X.AnonymousClass10Q) r8
            X.004 r2 = r10.A2R
            X.005 r7 = X.C18840tu.A00(r2)
            X.004 r2 = r10.A2Q
            X.005 r6 = X.C18840tu.A00(r2)
            X.004 r2 = r10.A2O
            X.005 r5 = X.C18840tu.A00(r2)
            X.004 r2 = r10.A2P
            X.005 r3 = X.C18840tu.A00(r2)
            X.10R r2 = new X.10R
            r2.<init>(r7, r6, r5, r3)
            r22 = r13
            r23 = r12
            r24 = r9
            r25 = r8
            r26 = r2
            r19.installAnrDetector(r20, r21, r22, r23, r24, r25, r26)
            X.004 r2 = r0.A7u
            java.lang.Object r6 = r2.get()
            X.11e r6 = (X.AnonymousClass11e) r6
            boolean r2 = X.AnonymousClass11j.A00()
            if (r2 != 0) goto L_0x0135
            X.AnonymousClass11e.A01(r6)
            android.os.Handler r5 = r6.A0B
            r3 = 2
            X.1jA r2 = new X.1jA
            r2.<init>((java.lang.Object) r6, (int) r3)
            r5.post(r2)
            X.0u5 r2 = r6.A0J
            r6.A02 = r2
            r2 = 1
            r6.A01 = r2
            r2 = 24772609(0x17a0001, float:4.591775E-38)
            X.AnonymousClass11e.A02(r6, r11, r2)
        L_0x0135:
            X.004 r2 = r0.A7u
            java.lang.Object r2 = r2.get()
            X.11e r2 = (X.AnonymousClass11e) r2
            boolean r6 = r1.isFirstColdStart
            java.lang.String r5 = "decompress_libraries"
            X.0zf r3 = r2.A03
            if (r3 == 0) goto L_0x0149
            r2 = 1
            r3.A0B(r5, r6, r2)
        L_0x0149:
            X.004 r2 = r0.A7u
            java.lang.Object r3 = r2.get()
            X.11e r3 = (X.AnonymousClass11e) r3
            java.lang.String r19 = "app_creation_on_create"
            r2 = r19
            r3.A09(r2)
            X.004 r2 = r10.A1r
            java.lang.Object r7 = r2.get()
            X.11l r7 = (X.AnonymousClass11l) r7
            r2 = 0
            X.1k0 r6 = new X.1k0
            r6.<init>(r1, r2)
            r5 = 0
            X.0u1 r3 = new X.0u1
            r3.<init>(r5, r6)
            r7.A00 = r3
            r1.setBouncyCastleProvider()
            java.lang.Boolean r3 = X.C18750th.A03
            r1.setStrictModePolicyForAppInit()
            java.lang.String r5 = "AppShell/onCreate"
            java.lang.reflect.Method r3 = X.C000600g.A03
            X.AnonymousClass00h.A01(r5)
            X.0ts r3 = r4.BxU()     // Catch:{ all -> 0x0714 }
            r1.whatsAppLocale = r3     // Catch:{ all -> 0x0714 }
            X.004 r3 = r0.A9J     // Catch:{ all -> 0x0714 }
            X.005 r3 = X.C18840tu.A00(r3)     // Catch:{ all -> 0x0714 }
            java.lang.Object r20 = r3.get()     // Catch:{ all -> 0x0714 }
            r3 = r20
            X.0wh r3 = (X.C19900wh) r3     // Catch:{ all -> 0x0714 }
            r20 = r3
            X.0zD r3 = r1.applicationCreatePerfTracker     // Catch:{ all -> 0x0714 }
            X.0zf r5 = r3.A00     // Catch:{ all -> 0x0714 }
            r3 = r18
            r5.A07(r3)     // Catch:{ all -> 0x0714 }
            android.content.Context r5 = r1.appContext     // Catch:{ all -> 0x0714 }
            java.lang.Class<X.0tq> r3 = X.C18800tq.class
            java.lang.Object r6 = X.C18810tr.A00(r5, r3)     // Catch:{ all -> 0x0714 }
            X.0tq r6 = (X.C18800tq) r6     // Catch:{ all -> 0x0714 }
            X.004 r3 = r6.A7u     // Catch:{ all -> 0x0714 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0714 }
            X.11e r3 = (X.AnonymousClass11e) r3     // Catch:{ all -> 0x0714 }
            java.lang.String r21 = "main_thread_init"
            r5 = r21
            r3.A09(r5)     // Catch:{ all -> 0x0714 }
            X.0tq r5 = r6.AfI     // Catch:{ all -> 0x0714 }
            X.0tt r6 = r5.A00     // Catch:{ all -> 0x0714 }
            X.004 r5 = r6.A0D     // Catch:{ all -> 0x0714 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0714 }
            X.0zD r5 = (X.C21420zD) r5     // Catch:{ all -> 0x0714 }
            java.lang.String r24 = "app_init_instance"
            X.0zf r5 = r5.A00     // Catch:{ all -> 0x0714 }
            r50 = r5
            r7 = r5
            r5 = r24
            r7.A07(r5)     // Catch:{ all -> 0x0714 }
            X.0tq r5 = r6.ADO     // Catch:{ all -> 0x0714 }
            X.0v9 r7 = r5.AfJ     // Catch:{ all -> 0x0714 }
            android.content.Context r7 = r7.A00     // Catch:{ all -> 0x0714 }
            r26 = r7
            X.C19620wF.A00(r26)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A02     // Catch:{ all -> 0x0714 }
            java.lang.Object r23 = r7.get()     // Catch:{ all -> 0x0714 }
            r7 = r23
            X.0yC r7 = (X.C20810yC) r7     // Catch:{ all -> 0x0714 }
            r23 = r7
            X.004 r7 = r5.A2U     // Catch:{ all -> 0x0714 }
            java.lang.Object r22 = r7.get()     // Catch:{ all -> 0x0714 }
            r7 = r22
            X.0wN r7 = (X.C19700wN) r7     // Catch:{ all -> 0x0714 }
            r22 = r7
            X.004 r7 = r5.A4g     // Catch:{ all -> 0x0714 }
            java.lang.Object r17 = r7.get()     // Catch:{ all -> 0x0714 }
            r7 = r17
            X.0wQ r7 = (X.C19730wQ) r7     // Catch:{ all -> 0x0714 }
            r17 = r7
            X.004 r7 = r5.A9Y     // Catch:{ all -> 0x0714 }
            java.lang.Object r16 = r7.get()     // Catch:{ all -> 0x0714 }
            r7 = r16
            X.0wU r7 = (X.C19770wU) r7     // Catch:{ all -> 0x0714 }
            r16 = r7
            X.004 r7 = r5.A1l     // Catch:{ all -> 0x0714 }
            java.lang.Object r15 = r7.get()     // Catch:{ all -> 0x0714 }
            X.12q r15 = (X.C220412q) r15     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A7v     // Catch:{ all -> 0x0714 }
            java.lang.Object r14 = r7.get()     // Catch:{ all -> 0x0714 }
            X.0ww r14 = (X.C20050ww) r14     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A1b     // Catch:{ all -> 0x0714 }
            java.lang.Object r13 = r7.get()     // Catch:{ all -> 0x0714 }
            X.12t r13 = (X.C220712t) r13     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A9C     // Catch:{ all -> 0x0714 }
            java.lang.Object r12 = r7.get()     // Catch:{ all -> 0x0714 }
            X.12u r12 = (X.C220812u) r12     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A4a     // Catch:{ all -> 0x0714 }
            java.lang.Object r11 = r7.get()     // Catch:{ all -> 0x0714 }
            X.13I r11 = (X.AnonymousClass13I) r11     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A52     // Catch:{ all -> 0x0714 }
            X.005 r42 = X.C18840tu.A00(r7)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A6z     // Catch:{ all -> 0x0714 }
            java.lang.Object r10 = r7.get()     // Catch:{ all -> 0x0714 }
            X.13J r10 = (X.AnonymousClass13J) r10     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A9X     // Catch:{ all -> 0x0714 }
            java.lang.Object r9 = r7.get()     // Catch:{ all -> 0x0714 }
            X.0ts r9 = (X.C18820ts) r9     // Catch:{ all -> 0x0714 }
            X.004 r7 = r6.A0C     // Catch:{ all -> 0x0714 }
            X.005 r43 = X.C18840tu.A00(r7)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A9W     // Catch:{ all -> 0x0714 }
            java.lang.Object r8 = r7.get()     // Catch:{ all -> 0x0714 }
            com.whatsapp.nativelibloader.WhatsAppLibLoader r8 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r8     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A5U     // Catch:{ all -> 0x0714 }
            X.005 r44 = X.C18840tu.A00(r7)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r5.A5G     // Catch:{ all -> 0x0714 }
            X.005 r45 = X.C18840tu.A00(r7)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r6.A0B     // Catch:{ all -> 0x0714 }
            X.005 r46 = X.C18840tu.A00(r7)     // Catch:{ all -> 0x0714 }
            X.13N r38 = X.C18830tt.AD0(r6)     // Catch:{ all -> 0x0714 }
            X.004 r7 = r6.A0D     // Catch:{ all -> 0x0714 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0714 }
            X.0zD r7 = (X.C21420zD) r7     // Catch:{ all -> 0x0714 }
            X.004 r6 = r6.A04     // Catch:{ all -> 0x0714 }
            X.005 r47 = X.C18840tu.A00(r6)     // Catch:{ all -> 0x0714 }
            X.004 r6 = r5.A4G     // Catch:{ all -> 0x0714 }
            X.005 r48 = X.C18840tu.A00(r6)     // Catch:{ all -> 0x0714 }
            X.004 r6 = r5.A5F     // Catch:{ all -> 0x0714 }
            X.005 r49 = X.C18840tu.A00(r6)     // Catch:{ all -> 0x0714 }
            X.004 r5 = r5.A3X     // Catch:{ all -> 0x0714 }
            java.lang.Object r6 = r5.get()     // Catch:{ all -> 0x0714 }
            X.13Q r6 = (X.AnonymousClass13Q) r6     // Catch:{ all -> 0x0714 }
            X.13U r5 = new X.13U     // Catch:{ all -> 0x0714 }
            r25 = r5
            r27 = r22
            r28 = r17
            r29 = r14
            r30 = r9
            r31 = r13
            r32 = r15
            r33 = r6
            r34 = r23
            r35 = r8
            r36 = r7
            r37 = r11
            r39 = r10
            r40 = r16
            r41 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x0714 }
            r7 = r50
            r6 = r24
            r7.A06(r6)     // Catch:{ all -> 0x0714 }
            X.0zD r6 = r5.A0A     // Catch:{ all -> 0x0714 }
            java.lang.String r8 = "AppInit_main"
            X.0zf r7 = r6.A00     // Catch:{ all -> 0x0714 }
            r7.A07(r8)     // Catch:{ all -> 0x0714 }
            java.lang.String r6 = "AppInit/main"
            X.AnonymousClass00h.A01(r6)     // Catch:{ all -> 0x0714 }
            android.content.Context r6 = r5.A00     // Catch:{ all -> 0x070c }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x070c }
            r9 = 22
            if (r10 > r9) goto L_0x02f4
            java.lang.String r10 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x070c }
            java.lang.String r9 = "samsung"
            boolean r9 = r9.equalsIgnoreCase(r10)     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x02f4
            java.lang.String r9 = "android.sec.clipboard.ClipboardUIManager"
            java.lang.Class r12 = java.lang.Class.forName(r9)     // Catch:{ Exception -> 0x02f4 }
            java.lang.String r11 = "getInstance"
            r10 = 1
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x02f4 }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r9[r2] = r13     // Catch:{ Exception -> 0x02f4 }
            java.lang.reflect.Method r11 = r12.getDeclaredMethod(r11, r9)     // Catch:{ Exception -> 0x02f4 }
            r11.setAccessible(r10)     // Catch:{ Exception -> 0x02f4 }
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02f4 }
            r10[r2] = r6     // Catch:{ Exception -> 0x02f4 }
            r11.invoke(r9, r10)     // Catch:{ Exception -> 0x02f4 }
        L_0x02f4:
            android.app.Application r10 = X.C19560w9.A00(r6)     // Catch:{ all -> 0x070c }
            X.005 r9 = r5.A0G     // Catch:{ all -> 0x070c }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x070c }
            android.app.Application$ActivityLifecycleCallbacks r9 = (android.app.Application.ActivityLifecycleCallbacks) r9     // Catch:{ all -> 0x070c }
            r10.registerActivityLifecycleCallbacks(r9)     // Catch:{ all -> 0x070c }
            X.13W r9 = new X.13W     // Catch:{ all -> 0x070c }
            r9.<init>()     // Catch:{ all -> 0x070c }
            X.AnonymousClass13X.A00 = r9     // Catch:{ all -> 0x070c }
            X.13Y r10 = new X.13Y     // Catch:{ all -> 0x070c }
            r10.<init>()     // Catch:{ all -> 0x070c }
            java.util.concurrent.atomic.AtomicReference r9 = X.AnonymousClass13Z.A00     // Catch:{ all -> 0x070c }
            r9.set(r10)     // Catch:{ all -> 0x070c }
            X.C221413a.A00 = r6     // Catch:{ all -> 0x070c }
            X.0ts r11 = r5.A04     // Catch:{ all -> 0x070c }
            java.lang.String r10 = "StringPackIdsRegister"
            r7.A07(r10)     // Catch:{ all -> 0x070c }
            X.13c r9 = new X.13c     // Catch:{ all -> 0x070c }
            r9.<init>()     // Catch:{ all -> 0x070c }
            X.C221713d.A02 = r9     // Catch:{ all -> 0x070c }
            r7.A06(r10)     // Catch:{ all -> 0x070c }
            java.lang.String r10 = "loadAndApplyForcedLanguage"
            r7.A07(r10)     // Catch:{ all -> 0x070c }
            X.0wh r9 = r11.A08     // Catch:{ all -> 0x070c }
            java.lang.String r13 = r9.A01()     // Catch:{ all -> 0x070c }
            boolean r9 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x034c
            java.lang.String r9 = "whatsapplocale/loadandapplyforcedlanguage/no language to load"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x070c }
            r11.A06 = r2     // Catch:{ all -> 0x070c }
        L_0x033f:
            r7.A06(r10)     // Catch:{ all -> 0x070c }
            com.whatsapp.nativelibloader.WhatsAppLibLoader r9 = r5.A09     // Catch:{ all -> 0x070c }
            boolean r9 = r9.A04()     // Catch:{ all -> 0x070c }
            r14 = 1
            if (r9 != 0) goto L_0x03a4
            goto L_0x039d
        L_0x034c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x070c }
            r12.<init>()     // Catch:{ all -> 0x070c }
            java.lang.String r9 = "whatsapplocale/loadandapplyforcedlanguage/language to load: "
            r12.append(r9)     // Catch:{ all -> 0x070c }
            r12.append(r13)     // Catch:{ all -> 0x070c }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x070c }
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x070c }
            java.lang.String r12 = X.AnonymousClass9ZR.A00(r13)     // Catch:{ all -> 0x070c }
            java.lang.String[] r9 = X.C26621Kw.A04     // Catch:{ all -> 0x070c }
            java.util.Locale r9 = java.util.Locale.forLanguageTag(r12)     // Catch:{ all -> 0x070c }
            r11.A04 = r9     // Catch:{ all -> 0x070c }
            java.lang.String r9 = r9.getCountry()     // Catch:{ all -> 0x070c }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x0391
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x070c }
            r12.<init>()     // Catch:{ all -> 0x070c }
            r12.append(r13)     // Catch:{ all -> 0x070c }
            java.lang.String r9 = "-IN"
            r12.append(r9)     // Catch:{ all -> 0x070c }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x070c }
            java.lang.String r9 = X.AnonymousClass9ZR.A00(r9)     // Catch:{ all -> 0x070c }
            java.util.Locale r9 = java.util.Locale.forLanguageTag(r9)     // Catch:{ all -> 0x070c }
            r11.A04 = r9     // Catch:{ all -> 0x070c }
        L_0x0391:
            r9 = 1
            r11.A06 = r9     // Catch:{ all -> 0x070c }
            java.util.Locale r9 = r11.A04     // Catch:{ all -> 0x070c }
            java.util.Locale.setDefault(r9)     // Catch:{ all -> 0x070c }
            X.C18820ts.A03(r11)     // Catch:{ all -> 0x070c }
            goto L_0x033f
        L_0x039d:
            X.0ww r5 = r5.A03     // Catch:{ all -> 0x0702 }
            r5.A02()     // Catch:{ all -> 0x0702 }
            goto L_0x06a8
        L_0x03a4:
            X.13N r10 = r5.A0C     // Catch:{ all -> 0x070c }
            X.0wh r9 = r10.A00     // Catch:{ all -> 0x070c }
            android.content.SharedPreferences r13 = r9.A01     // Catch:{ all -> 0x070c }
            java.lang.String r12 = "version"
            java.lang.String r9 = "0.0.0"
            java.lang.String r9 = r13.getString(r12, r9)     // Catch:{ all -> 0x070c }
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x070c }
            java.lang.String r11 = "2.24.6.77"
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x070c }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x070c }
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x040b
            android.content.SharedPreferences$Editor r15 = r13.edit()     // Catch:{ all -> 0x070c }
            java.lang.String r9 = "run_on_connect_tasks_for_version_change"
            android.content.SharedPreferences$Editor r9 = r15.putBoolean(r9, r14)     // Catch:{ all -> 0x070c }
            r9.apply()     // Catch:{ all -> 0x070c }
            android.content.SharedPreferences$Editor r15 = r13.edit()     // Catch:{ all -> 0x070c }
            java.lang.String r9 = "async_tasks_pending_for_version_change"
            android.content.SharedPreferences$Editor r9 = r15.putBoolean(r9, r14)     // Catch:{ all -> 0x070c }
            r9.apply()     // Catch:{ all -> 0x070c }
            X.12U r9 = r10.A01     // Catch:{ all -> 0x070c }
            r9.A00()     // Catch:{ all -> 0x070c }
            X.005 r9 = r10.A03     // Catch:{ all -> 0x070c }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x070c }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x070c }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x070c }
        L_0x03ed:
            boolean r9 = r10.hasNext()     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x03fd
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x070c }
            X.7hf r9 = (X.C158537hf) r9     // Catch:{ all -> 0x070c }
            r9.BRD()     // Catch:{ all -> 0x070c }
            goto L_0x03ed
        L_0x03fd:
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x070c }
            android.content.SharedPreferences$Editor r9 = r13.edit()     // Catch:{ all -> 0x070c }
            android.content.SharedPreferences$Editor r9 = r9.putString(r12, r11)     // Catch:{ all -> 0x070c }
            r9.apply()     // Catch:{ all -> 0x070c }
        L_0x040b:
            X.005 r9 = r5.A0N     // Catch:{ all -> 0x070c }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x070c }
            com.whatsapp.NativeMediaHandler r9 = (com.whatsapp.NativeMediaHandler) r9     // Catch:{ all -> 0x070c }
            com.whatsapp.NativeMediaHandler.initFileHandlingCallbacks(r9)     // Catch:{ all -> 0x070c }
            X.005 r9 = r5.A0H     // Catch:{ all -> 0x070c }
            java.lang.Object r10 = r9.get()     // Catch:{ all -> 0x070c }
            X.13f r10 = (X.C221813f) r10     // Catch:{ all -> 0x070c }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x070c }
            X.C18740tg.A01 = r9     // Catch:{ all -> 0x070c }
            X.005 r9 = r10.A02     // Catch:{ all -> 0x0704 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0704 }
            X.12U r9 = (X.AnonymousClass12U) r9     // Catch:{ all -> 0x0704 }
            int r11 = r9.A00()     // Catch:{ all -> 0x0704 }
            r9 = 6
            if (r11 != r9) goto L_0x043f
            X.005 r9 = r10.A01     // Catch:{ all -> 0x0704 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0704 }
            X.1WQ r9 = (X.AnonymousClass1WQ) r9     // Catch:{ all -> 0x0704 }
            r9.A01()     // Catch:{ all -> 0x0704 }
            goto L_0x045d
        L_0x043f:
            X.005 r9 = r10.A00     // Catch:{ all -> 0x0704 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0704 }
            X.13g r9 = (X.C221913g) r9     // Catch:{ all -> 0x0704 }
            int r11 = r9.A00()     // Catch:{ all -> 0x0704 }
            r9 = 7
            if (r11 == r9) goto L_0x0452
            r9 = 9
            if (r11 != r9) goto L_0x045d
        L_0x0452:
            X.005 r9 = r10.A01     // Catch:{ all -> 0x0704 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x0704 }
            X.1WQ r9 = (X.AnonymousClass1WQ) r9     // Catch:{ all -> 0x0704 }
            r9.A03(r14)     // Catch:{ all -> 0x0704 }
        L_0x045d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x070c }
            X.C18740tg.A01 = r9     // Catch:{ all -> 0x070c }
            X.005 r10 = r10.A00     // Catch:{ all -> 0x070c }
            java.lang.Object r9 = r10.get()     // Catch:{ all -> 0x070c }
            X.13g r9 = (X.C221913g) r9     // Catch:{ all -> 0x070c }
            boolean r9 = r9.A02()     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x047a
            java.lang.Object r9 = r10.get()     // Catch:{ all -> 0x070c }
            X.13g r9 = (X.C221913g) r9     // Catch:{ all -> 0x070c }
            r9.A01(r2)     // Catch:{ all -> 0x070c }
        L_0x047a:
            X.13I r11 = r5.A0B     // Catch:{ all -> 0x0702 }
            X.0wG r9 = r11.A01     // Catch:{ all -> 0x0702 }
            android.content.Context r13 = r9.A00     // Catch:{ all -> 0x0702 }
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x0702 }
            java.io.File r12 = r13.getFilesDir()     // Catch:{ all -> 0x0702 }
            java.lang.String r10 = "login_failed"
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0702 }
            r9.<init>(r12, r10)     // Catch:{ all -> 0x0702 }
            r9.getAbsolutePath()     // Catch:{ all -> 0x0702 }
            r9.exists()     // Catch:{ all -> 0x0702 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0702 }
            if (r9 == 0) goto L_0x04b4
            java.io.FileInputStream r9 = r13.openFileInput(r10)     // Catch:{ IOException -> 0x04ba }
            java.io.DataInputStream r12 = new java.io.DataInputStream     // Catch:{ IOException -> 0x04ba }
            r12.<init>(r9)     // Catch:{ IOException -> 0x04ba }
            boolean r9 = r12.readBoolean()     // Catch:{ all -> 0x04ad }
            r11.A00 = r9     // Catch:{ all -> 0x04ad }
            r12.close()     // Catch:{ IOException -> 0x04ba }
            goto L_0x04c2
        L_0x04ad:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x04af }
        L_0x04af:
            r9 = move-exception
            X.C05600Qi.A00(r12, r10)     // Catch:{ IOException -> 0x04ba }
            throw r9     // Catch:{ IOException -> 0x04ba }
        L_0x04b4:
            java.lang.String r9 = "loginmanager/loadloginfailed/none"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x0702 }
            goto L_0x04c0
        L_0x04ba:
            r10 = move-exception
            java.lang.String r9 = "loginmanager/failed login_failed"
            com.whatsapp.util.Log.w(r9, r10)     // Catch:{ all -> 0x0702 }
        L_0x04c0:
            r11.A00 = r2     // Catch:{ all -> 0x0702 }
        L_0x04c2:
            X.0wN r9 = r5.A01     // Catch:{ all -> 0x070c }
            X.C19780wV.A04 = r9     // Catch:{ all -> 0x070c }
            X.0wY r12 = X.C19780wV.A06     // Catch:{ all -> 0x070c }
            r12.A02 = r9     // Catch:{ all -> 0x070c }
            X.0yC r10 = r5.A08     // Catch:{ all -> 0x070c }
            X.13J r13 = r5.A0D     // Catch:{ all -> 0x070c }
            X.AnonymousClass00C.A0D(r10, r2)     // Catch:{ all -> 0x070c }
            X.AnonymousClass00C.A0D(r13, r14)     // Catch:{ all -> 0x070c }
            r9 = 4524(0x11ac, float:6.34E-42)
            X.0yV r11 = X.C21000yV.A02     // Catch:{ all -> 0x070c }
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A05 = r9     // Catch:{ all -> 0x070c }
            r9 = 7474(0x1d32, float:1.0473E-41)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A06 = r9     // Catch:{ all -> 0x070c }
            boolean r9 = X.C19550w8.A01()     // Catch:{ all -> 0x070c }
            r16 = 1
            if (r9 != 0) goto L_0x04fb
            boolean r9 = X.C222013h.A05     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x04fb
            r9 = 7359(0x1cbf, float:1.0312E-41)
            boolean r15 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            r9 = 1
            if (r15 != 0) goto L_0x04fc
        L_0x04fb:
            r9 = 0
        L_0x04fc:
            X.C222013h.A09 = r9     // Catch:{ all -> 0x070c }
            r9 = 5509(0x1585, float:7.72E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A07 = r9     // Catch:{ all -> 0x070c }
            r9 = 6942(0x1b1e, float:9.728E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A08 = r9     // Catch:{ all -> 0x070c }
            r9 = 5510(0x1586, float:7.721E-42)
            r10.A0E(r9)     // Catch:{ all -> 0x070c }
            r9 = 5353(0x14e9, float:7.501E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A0A = r9     // Catch:{ all -> 0x070c }
            r9 = 6481(0x1951, float:9.082E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A0B = r9     // Catch:{ all -> 0x070c }
            r9 = 3985(0xf91, float:5.584E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A0C = r9     // Catch:{ all -> 0x070c }
            r9 = 6851(0x1ac3, float:9.6E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A02 = r9     // Catch:{ all -> 0x070c }
            r9 = 6629(0x19e5, float:9.289E-42)
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            X.C222013h.A03 = r9     // Catch:{ all -> 0x070c }
            boolean r9 = X.C222013h.A05     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x0542
            r9 = 7673(0x1df9, float:1.0752E-41)
            goto L_0x0545
        L_0x0542:
            r16 = 0
            goto L_0x054b
        L_0x0545:
            boolean r9 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x0542
        L_0x054b:
            X.C222013h.A04 = r16     // Catch:{ all -> 0x070c }
            boolean r9 = X.C222013h.A07     // Catch:{ all -> 0x070c }
            if (r9 != 0) goto L_0x0555
            boolean r9 = X.C222013h.A08     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x055c
        L_0x0555:
            X.13i r9 = new X.13i     // Catch:{ all -> 0x070c }
            r9.<init>()     // Catch:{ all -> 0x070c }
            X.C222013h.A01 = r9     // Catch:{ all -> 0x070c }
        L_0x055c:
            boolean r9 = X.C222013h.A09     // Catch:{ all -> 0x070c }
            if (r9 == 0) goto L_0x0567
            X.341 r9 = new X.341     // Catch:{ all -> 0x070c }
            r9.<init>(r13)     // Catch:{ all -> 0x070c }
            X.C222013h.A00 = r9     // Catch:{ all -> 0x070c }
        L_0x0567:
            java.lang.String r9 = "AppInit/msgStore/checkHealth"
            X.AnonymousClass00h.A01(r9)     // Catch:{ all -> 0x070c }
            java.lang.String r13 = "MsgStoreInit"
            r7.A07(r13)     // Catch:{ all -> 0x070c }
            X.0wQ r9 = r5.A02     // Catch:{ all -> 0x06fa }
            r9.A0G()     // Catch:{ all -> 0x06fa }
            com.whatsapp.Me r9 = r9.A00     // Catch:{ all -> 0x06fa }
            if (r9 == 0) goto L_0x0589
            X.12t r9 = r5.A05     // Catch:{ all -> 0x06fa }
            X.C220712t.A02(r9, r14)     // Catch:{ all -> 0x06fa }
            r14 = 2
            X.1j8 r9 = new X.1j8     // Catch:{ all -> 0x06fa }
            r9.<init>(r5, r14)     // Catch:{ all -> 0x06fa }
            r9.run()     // Catch:{ all -> 0x06fa }
            goto L_0x05a6
        L_0x0589:
            X.005 r9 = r5.A0M     // Catch:{ all -> 0x06fa }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x06fa }
            X.12P r9 = (X.AnonymousClass12P) r9     // Catch:{ all -> 0x06fa }
            X.0wr r9 = r9.A01     // Catch:{ all -> 0x06fa }
            r9.A01()     // Catch:{ all -> 0x06fa }
            java.lang.String r9 = "app-init/main/sendInitialMigrationInfoNeededBroadcast"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ all -> 0x06f8 }
            X.005 r9 = r5.A0J     // Catch:{ all -> 0x06f8 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x06f8 }
            X.1QD r9 = (X.AnonymousClass1QD) r9     // Catch:{ all -> 0x06f8 }
            r9.A02()     // Catch:{ all -> 0x06f8 }
        L_0x05a6:
            r7.A06(r13)     // Catch:{ all -> 0x070c }
            X.AnonymousClass00h.A00()     // Catch:{ all -> 0x070c }
            X.0wU r9 = r5.A0E     // Catch:{ all -> 0x0702 }
            boolean r9 = r9 instanceof X.C19780wV     // Catch:{ all -> 0x0702 }
            if (r9 == 0) goto L_0x061a
            r9 = 1442(0x5a2, float:2.02E-42)
            boolean r16 = X.C20800yB.A01(r11, r10, r9)     // Catch:{ all -> 0x0702 }
            java.util.concurrent.Executor r14 = X.C19780wV.A07     // Catch:{ all -> 0x0702 }
            monitor-enter(r12)     // Catch:{ all -> 0x0702 }
            java.util.List r13 = r12.A01     // Catch:{ all -> 0x0616 }
            boolean r9 = r13.isEmpty()     // Catch:{ all -> 0x0616 }
            X.C18740tg.A0C(r9)     // Catch:{ all -> 0x0616 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0616 }
            r10.<init>()     // Catch:{ all -> 0x0616 }
            java.lang.String r9 = "job-anomaly-detector-"
            r10.append(r9)     // Catch:{ all -> 0x0616 }
            java.lang.String r9 = X.C21870zw.A00     // Catch:{ all -> 0x0616 }
            r10.append(r9)     // Catch:{ all -> 0x0616 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0616 }
            android.os.HandlerThread r15 = new android.os.HandlerThread     // Catch:{ all -> 0x0616 }
            r15.<init>(r9)     // Catch:{ all -> 0x0616 }
            r15.start()     // Catch:{ all -> 0x0616 }
            X.0wZ r10 = r12.A00     // Catch:{ all -> 0x0616 }
            X.14E r9 = new X.14E     // Catch:{ all -> 0x0616 }
            r9.<init>(r10, r14)     // Catch:{ all -> 0x0616 }
            r13.add(r9)     // Catch:{ all -> 0x0616 }
            X.14F r9 = new X.14F     // Catch:{ all -> 0x0616 }
            r9.<init>(r15, r10, r14)     // Catch:{ all -> 0x0616 }
            r13.add(r9)     // Catch:{ all -> 0x0616 }
            if (r16 == 0) goto L_0x05fb
            X.14J r9 = new X.14J     // Catch:{ all -> 0x0616 }
            r9.<init>(r10, r14)     // Catch:{ all -> 0x0616 }
            r13.add(r9)     // Catch:{ all -> 0x0616 }
        L_0x05fb:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0616 }
        L_0x05ff:
            boolean r9 = r13.hasNext()     // Catch:{ all -> 0x0616 }
            if (r9 == 0) goto L_0x0619
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x0616 }
            X.14D r10 = (X.AnonymousClass14D) r10     // Catch:{ all -> 0x0616 }
            monitor-enter(r10)     // Catch:{ all -> 0x0616 }
            java.util.Set r9 = r10.A02     // Catch:{ all -> 0x0613 }
            r9.add(r12)     // Catch:{ all -> 0x0613 }
            monitor-exit(r10)     // Catch:{ all -> 0x0616 }
            goto L_0x05ff
        L_0x0613:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0616 }
            throw r0     // Catch:{ all -> 0x0616 }
        L_0x0616:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0702 }
            throw r0     // Catch:{ all -> 0x0702 }
        L_0x0619:
            monitor-exit(r12)     // Catch:{ all -> 0x0702 }
        L_0x061a:
            X.0ww r9 = r5.A03     // Catch:{ all -> 0x0702 }
            r9.A02()     // Catch:{ all -> 0x0702 }
            X.12u r9 = r5.A0F     // Catch:{ all -> 0x0702 }
            r9.A02(r6)     // Catch:{ all -> 0x0702 }
            X.005 r5 = r5.A0I     // Catch:{ all -> 0x0702 }
            java.lang.Object r13 = r5.get()     // Catch:{ all -> 0x0702 }
            X.14Y r13 = (X.AnonymousClass14Y) r13     // Catch:{ all -> 0x0702 }
            X.005 r5 = r13.A0A     // Catch:{ all -> 0x0702 }
            java.lang.Object r9 = r5.get()     // Catch:{ all -> 0x0702 }
            X.0yW r9 = (X.C21010yW) r9     // Catch:{ all -> 0x0702 }
            X.005 r12 = r13.A01     // Catch:{ all -> 0x0702 }
            java.util.Objects.requireNonNull(r12)     // Catch:{ all -> 0x0702 }
            r5 = 7
            X.1k0 r10 = new X.1k0     // Catch:{ all -> 0x0702 }
            r10.<init>(r12, r5)     // Catch:{ all -> 0x0702 }
            r12 = 0
            X.0u1 r17 = new X.0u1     // Catch:{ all -> 0x0702 }
            r5 = r17
            r5.<init>(r12, r10)     // Catch:{ all -> 0x0702 }
            X.14Z r16 = new X.14Z     // Catch:{ all -> 0x0702 }
            r5 = r16
            r5.<init>(r13)     // Catch:{ all -> 0x0702 }
            X.14a r10 = new X.14a     // Catch:{ all -> 0x0702 }
            r10.<init>(r6, r13)     // Catch:{ all -> 0x0702 }
            X.005 r15 = r13.A04     // Catch:{ all -> 0x0702 }
            java.util.Objects.requireNonNull(r15)     // Catch:{ all -> 0x0702 }
            r5 = 8
            X.1k0 r14 = new X.1k0     // Catch:{ all -> 0x0702 }
            r14.<init>(r15, r5)     // Catch:{ all -> 0x0702 }
            X.0u1 r5 = new X.0u1     // Catch:{ all -> 0x0702 }
            r5.<init>(r12, r14)     // Catch:{ all -> 0x0702 }
            X.0yC r13 = r13.A00     // Catch:{ all -> 0x0702 }
            r12 = 6977(0x1b41, float:9.777E-42)
            int r29 = X.C20800yB.A00(r11, r13, r12)     // Catch:{ all -> 0x0702 }
            r12 = 3991(0xf97, float:5.593E-42)
            boolean r33 = X.C20800yB.A01(r11, r13, r12)     // Catch:{ all -> 0x0702 }
            r12 = 305(0x131, float:4.27E-43)
            int r31 = X.C20800yB.A00(r11, r13, r12)     // Catch:{ all -> 0x0702 }
            r28 = 3
            r30 = 8
            r32 = 1
            r22 = r9
            r23 = r6
            r24 = r16
            r25 = r10
            r26 = r17
            r27 = r5
            r22.BKR(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0702 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x070c }
            r6.<init>()     // Catch:{ all -> 0x070c }
            java.lang.String r5 = "app-init/async/device_info/OS_BUILD_NUMBER "
            r6.append(r5)     // Catch:{ all -> 0x070c }
            java.lang.String r5 = android.os.Build.DISPLAY     // Catch:{ all -> 0x070c }
            r6.append(r5)     // Catch:{ all -> 0x070c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x070c }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x070c }
            java.lang.String r5 = "app-init/main/done"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x070c }
        L_0x06a8:
            X.AnonymousClass00h.A00()     // Catch:{ all -> 0x0714 }
            r7.A06(r8)     // Catch:{ all -> 0x0714 }
            java.lang.String r7 = "main_thread"
            java.lang.String r6 = "init"
            java.lang.String r5 = "_end"
            r3.A0B(r7, r6, r5)     // Catch:{ all -> 0x0714 }
            r5 = r21
            r3.A08(r5)     // Catch:{ all -> 0x0714 }
            X.0zD r3 = r1.applicationCreatePerfTracker     // Catch:{ all -> 0x0714 }
            X.0zf r5 = r3.A00     // Catch:{ all -> 0x0714 }
            r3 = r18
            r5.A06(r3)     // Catch:{ all -> 0x0714 }
            android.os.ConditionVariable r3 = X.C18740tg.A00     // Catch:{ all -> 0x0714 }
            r3.open()     // Catch:{ all -> 0x0714 }
            r1.queueAsyncInit(r4)     // Catch:{ all -> 0x0714 }
            X.AnonymousClass00h.A00()
            int r3 = r20.A00()
            X.C002300y.A00(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            X.C18740tg.A01 = r2
            X.0zD r1 = r1.applicationCreatePerfTracker
            X.0zf r2 = r1.A00
            r1 = r19
            r2.A06(r1)
            r1 = 2
            r2.A0C(r1)
            X.004 r0 = r0.A7u
            java.lang.Object r1 = r0.get()
            X.11e r1 = (X.AnonymousClass11e) r1
            r0 = r19
            r1.A08(r0)
            return
        L_0x06f8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06fa }
        L_0x06fa:
            r1 = move-exception
            r7.A06(r13)     // Catch:{ all -> 0x070c }
            X.AnonymousClass00h.A00()     // Catch:{ all -> 0x070c }
            goto L_0x070b
        L_0x0702:
            r1 = move-exception
            goto L_0x070b
        L_0x0704:
            r1 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x070c }
            X.C18740tg.A01 = r0     // Catch:{ all -> 0x070c }
        L_0x070b:
            throw r1     // Catch:{ all -> 0x070c }
        L_0x070c:
            r0 = move-exception
            X.AnonymousClass00h.A00()     // Catch:{ all -> 0x0714 }
            r7.A06(r8)     // Catch:{ all -> 0x0714 }
            throw r0     // Catch:{ all -> 0x0714 }
        L_0x0714:
            r0 = move-exception
            X.AnonymousClass00h.A00()
            throw r0
        L_0x0719:
            r0 = move-exception
            throw r0
        L_0x071b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.onCreate():void");
    }

    public AbstractAppShellDelegate(Context context, C18720te r3) {
        this.appContext = context;
        this.appStartStat = r3;
    }

    private void queueAsyncInit(C18780to r3) {
        Looper.myQueue().addIdleHandler(new C223914c(r3, this));
    }
}
