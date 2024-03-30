package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.media.download.ExpressPathGarbageCollectWorker;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ST  reason: invalid class name */
public class AnonymousClass1ST {
    public static final C18950u5 A0r = new C18950u5(1, 60, 200, false);
    public long A00;
    public final ConditionVariable A01 = new ConditionVariable(true);
    public final AnonymousClass1TO A02;
    public final C20690y0 A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final AnonymousClass1DT A06;
    public final C25721Hk A07 = new C25721Hk();
    public final AnonymousClass16J A08;
    public final C28291Sb A09;
    public final C20810yC A0A;
    public final AnonymousClass1SW A0B;
    public final AnonymousClass1D4 A0C;
    public final AnonymousClass1GO A0D;
    public final AnonymousClass1SU A0E;
    public final AnonymousClass1TS A0F = new AnonymousClass1TS(this);
    public final C25161Ff A0G;
    public final AnonymousClass1TQ A0H;
    public final AnonymousClass1TR A0I;
    public final AnonymousClass1C4 A0J;
    public final AnonymousClass1GQ A0K;
    public final AnonymousClass1BS A0L;
    public final AnonymousClass1A1 A0M;
    public final AnonymousClass1SV A0N;
    public final C19770wU A0O;
    public final HashMap A0P = new HashMap();
    public final HashMap A0Q = new HashMap();
    public final HashMap A0R = new HashMap();
    public final Set A0S = new HashSet();
    public final Executor A0T;
    public final Executor A0U;
    public final Handler A0V = new Handler(Looper.getMainLooper());
    public final C19700wN A0W;
    public final C24041Av A0X;
    public final AnonymousClass164 A0Y;
    public final C21060yb A0Z;
    public final C19970wo A0a;
    public final C19630wG A0b;
    public final C220412q A0c;
    public final C20310xM A0d;
    public final AnonymousClass17X A0e;
    public final AnonymousClass1DW A0f;
    public final C25521Gq A0g;
    public final AnonymousClass1E2 A0h;
    public final C19890wg A0i;
    public final AnonymousClass1AW A0j;
    public final AnonymousClass1EO A0k;
    public final AnonymousClass1MM A0l;
    public final AnonymousClass1CR A0m;
    public final C23981Ap A0n;
    public final WebpUtils A0o;
    public final C81873xm A0p;
    public final C21570zS A0q;

    public static void A02(C129166Fp r6, AnonymousClass1ST r7, AnonymousClass2bU r8, boolean z) {
        Boolean bool;
        boolean z2;
        String str;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l;
        String str2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l2;
        Long l3;
        Integer num6;
        Integer num7;
        Integer num8;
        String str3;
        Long l4;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str4;
        Boolean bool2;
        synchronized (r8) {
            C65013Qj r2 = r8.A01;
            C18740tg.A06(r2);
            C133136Wx A012 = r6.A01();
            C18740tg.A06(A012);
            r2.A0f = false;
            r2.A0e = false;
            r2.A0d = false;
            r2.A0c = false;
            synchronized (r6) {
                bool = r6.A02;
            }
            if (bool != null) {
                synchronized (r6) {
                    bool2 = r6.A02;
                }
                r2.A0Q = bool2.booleanValue();
            }
            if (r6.A04() != null) {
                r2.A0V = r6.A04().booleanValue();
            }
            synchronized (r6) {
                z2 = r6.A0H;
            }
            if (z2) {
                if (r8.A1Y() != null) {
                    r8.A1Y().A01();
                }
                r2.A0O = null;
                r2.A0N = null;
            }
            r2.A09 = r6.A00();
            synchronized (r6) {
                str = r6.A0D;
            }
            if (str != null) {
                synchronized (r6) {
                    str4 = r6.A0D;
                }
                r2.A0L = str4;
            }
            synchronized (r6) {
                bArr = r6.A0I;
            }
            if (bArr != null) {
                C46962bx r4 = (C46962bx) r8;
                C23981Ap r3 = r7.A0n;
                synchronized (r6) {
                    bArr2 = r6.A0I;
                }
                r4.A05 = r3.A03(r8.A05, bArr2);
            }
            synchronized (r6) {
                num = r6.A07;
            }
            if (num != null) {
                synchronized (r6) {
                    num10 = r6.A07;
                }
                r2.A02 = num10.intValue();
            }
            synchronized (r6) {
                num2 = r6.A08;
            }
            if (num2 != null) {
                synchronized (r6) {
                    num9 = r6.A08;
                }
                r2.A03 = num9.intValue();
            }
            synchronized (r6) {
                l = r6.A0B;
            }
            if (l != null) {
                synchronized (r6) {
                    l4 = r6.A0B;
                }
                r2.A0B = l4.longValue();
            }
            synchronized (r6) {
                str2 = r6.A0E;
            }
            if (str2 != null) {
                synchronized (r6) {
                    str3 = r6.A0E;
                }
                r2.A0J = str3;
            }
            synchronized (r6) {
                num3 = r6.A05;
            }
            if (num3 != null) {
                synchronized (r6) {
                    num8 = r6.A05;
                }
                r2.A01 = num8.intValue();
            }
            if (!z || A012.A03()) {
                synchronized (r6) {
                    num4 = r6.A0A;
                }
                if (num4 != null) {
                    synchronized (r6) {
                        num7 = r6.A0A;
                    }
                    r2.A0A = num7.intValue();
                }
                synchronized (r6) {
                    num5 = r6.A09;
                }
                if (num5 != null) {
                    synchronized (r6) {
                        num6 = r6.A09;
                    }
                    r2.A06 = num6.intValue();
                }
                synchronized (r6) {
                    l2 = r6.A0C;
                }
                if (l2 != null) {
                    synchronized (r6) {
                        l3 = r6.A0C;
                    }
                    r2.A0C = l3.longValue();
                }
                if (!(r8.A0V() == null || r6.A0H() == null)) {
                    r8.A1C(r6.A0H());
                }
            }
        }
    }

    public void A0C(C160107kT r9, AnonymousClass2bU r10, int i) {
        C160107kT r5 = r9;
        AnonymousClass2bU r4 = r10;
        int i2 = i;
        if (C20800yB.A01(C21000yV.A02, this.A0A, 5858)) {
            C35341iX r2 = new C35341iX(this, r4, r5, i2, 9);
            C81873xm r0 = this.A0p;
            if (r0 != null) {
                r0.execute(r2);
            } else {
                this.A0O.Boy(r2);
            }
        } else {
            A00(r9, this, r10, i);
        }
    }

    public void A0E(AnonymousClass2bU r2) {
        A06(this, r2, false, false);
    }

    public boolean A0F(C160107kT r10, C159517jU r11, AnonymousClass68C r12, AnonymousClass2bU r13, String str, boolean z) {
        C101334xN A0A2;
        HashMap hashMap = this.A0Q;
        synchronized (hashMap) {
            if (((C159517jU) hashMap.get(str)) == null) {
                C110995bZ.A00(str);
                hashMap.put(str, r11);
                r11.B0M(new C146446vc(this, str));
                return false;
            }
            C110995bZ.A00(str);
            AnonymousClass2bU r7 = r13;
            if (r13 != null) {
                AnonymousClass68C r6 = r12;
                if (!(r12 == null || (A0A2 = A0A(r13)) == null)) {
                    A0A2.A0H.A03(new AnonymousClass70S(r10, this, r6, r7, z), this.A0U);
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if ((r6 instanceof X.C101334xN) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C160107kT r15, X.AnonymousClass1ST r16, X.AnonymousClass2bU r17, int r18) {
        /*
            r11 = -1
            r13 = 1
            r14 = 0
            r8 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            X.4xN r5 = r7.A09(r8, r9, r10, r11, r13, r14)
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = r9.A03
            if (r0 == 0) goto L_0x0035
            X.0yC r2 = r7.A0A
            X.0yV r1 = X.C21000yV.A01
            r0 = 1539(0x603, float:2.157E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r9.A03
            java.util.HashMap r1 = r7.A0R
            monitor-enter(r1)
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x0032 }
            X.7jU r6 = (X.C159517jU) r6     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            boolean r0 = r6 instanceof X.C101334xN
            if (r0 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0032:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            r6 = 0
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/start manual download "
            r1.append(r0)
            X.3Qa r0 = r9.A1J
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.A08(r9)
            if (r0 == 0) goto L_0x007c
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x008d
            X.0yb r3 = r7.A0Z
            if (r3 == 0) goto L_0x008d
            X.0yC r2 = r7.A0A
            r1 = 7218(0x1c32, float:1.0115E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x008d
            X.0wG r0 = r7.A0b
            android.content.Context r0 = r0.A00
            X.C111025bc.A00(r0, r3)
        L_0x0079:
            A03(r7)
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            r1 = 2
            X.1jB r0 = new X.1jB
            r0.<init>(r6, r5, r1)
            r5 = r0
        L_0x0085:
            X.3xm r0 = r7.A0p
            if (r0 == 0) goto L_0x00a0
            r0.execute(r5)
            return
        L_0x008d:
            X.1MM r4 = r7.A0l
            X.0wG r0 = r7.A0b
            android.content.Context r3 = r0.A00
            java.lang.Class<com.whatsapp.media.download.service.MediaDownloadService> r2 = com.whatsapp.media.download.service.MediaDownloadService.class
            java.lang.String r1 = "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r4.A03(r3, r0, r2)
            goto L_0x0079
        L_0x00a0:
            X.0wU r0 = r7.A0O
            r0.Boy(r5)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A00(X.7kT, X.1ST, X.2bU, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r6.A01 != r2.A00) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r2.A01().A02 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C129166Fp r17, X.AnonymousClass1ST r18, X.AnonymousClass68C r19, X.AnonymousClass2bU r20, boolean r21) {
        /*
            r1 = r20
            monitor-enter(r1)
            X.3Qj r5 = r1.A01     // Catch:{ all -> 0x011b }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x011b }
            r2 = r17
            X.6Wx r9 = r2.A01()     // Catch:{ all -> 0x011b }
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x011b }
            r3 = r18
            if (r21 == 0) goto L_0x001b
            boolean r0 = r9.A03()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00df
        L_0x001b:
            java.io.File r4 = r2.A03()     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x00df
            r5.A0I = r4     // Catch:{ all -> 0x011b }
            boolean r0 = r1 instanceof X.C46882bp     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x003d
            com.whatsapp.jid.UserJid r0 = r1.A0L()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x003d
            boolean r0 = X.C197029b1.A00(r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x003d
            X.AnonymousClass1GW.A0R(r4)     // Catch:{ all -> 0x011b }
            long r6 = r4.length()     // Catch:{ all -> 0x011b }
            r2.A0C(r6)     // Catch:{ all -> 0x011b }
        L_0x003d:
            r6 = r19
            if (r21 == 0) goto L_0x0048
            int r4 = r6.A01     // Catch:{ all -> 0x011b }
            int r0 = r2.A00     // Catch:{ all -> 0x011b }
            r8 = 1
            if (r4 == r0) goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            X.6Wx r0 = r2.A01()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0058
            X.6Wx r0 = r2.A01()     // Catch:{ all -> 0x011b }
            java.io.File r0 = r0.A02     // Catch:{ all -> 0x011b }
            r4 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r21 == 0) goto L_0x00bf
            if (r8 != 0) goto L_0x00bf
            if (r4 != 0) goto L_0x00bf
            boolean r10 = r6.A0Y     // Catch:{ all -> 0x011b }
            X.2o7 r14 = r6.A0B     // Catch:{ all -> 0x011b }
            boolean r8 = r6.A0V     // Catch:{ all -> 0x011b }
            boolean r7 = r6.A0b     // Catch:{ all -> 0x011b }
            X.1Gl r13 = r6.A0A     // Catch:{ all -> 0x011b }
            int r4 = r6.A04     // Catch:{ all -> 0x011b }
            int r0 = r6.A01     // Catch:{ all -> 0x011b }
            java.lang.String r15 = r6.A0K     // Catch:{ all -> 0x011b }
            java.lang.String r9 = r9.A03     // Catch:{ all -> 0x011b }
            java.lang.String r11 = r6.A0L     // Catch:{ all -> 0x011b }
            if (r9 != 0) goto L_0x007e
            if (r11 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r9 = 0
            goto L_0x007e
        L_0x007a:
            java.lang.String r9 = X.AnonymousClass6YY.A07(r11)     // Catch:{ all -> 0x011b }
        L_0x007e:
            X.0y0 r11 = r3.A03     // Catch:{ all -> 0x011b }
            X.0wg r12 = r3.A0i     // Catch:{ all -> 0x011b }
            r20 = r8
            r21 = r7
            r19 = r10
            r18 = r0
            r17 = r4
            r16 = r9
            java.io.File r0 = X.AnonymousClass1GW.A0E(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x011b }
            r5.A0I = r0     // Catch:{ all -> 0x011b }
            r0.getAbsolutePath()     // Catch:{ all -> 0x011b }
            java.io.File r2 = r2.A03()     // Catch:{ IOException -> 0x00a1 }
            java.io.File r0 = r5.A0I     // Catch:{ IOException -> 0x00a1 }
            r11.A0e(r2, r0)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00df
        L_0x00a1:
            r4 = move-exception
            r0 = 0
            r5.A0V = r0     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011b }
            r2.<init>()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "MediaDownload/applyDownloadDataInWorkerThread/MMS download failed to copy file to duplicate download; mediaHash = "
            r2.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r6.A0H     // Catch:{ all -> 0x011b }
            r2.append(r0)     // Catch:{ all -> 0x011b }
            r2.append(r4)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x011b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            goto L_0x00df
        L_0x00bf:
            java.io.File r0 = r2.A03()     // Catch:{ all -> 0x011b }
            r0.getAbsolutePath()     // Catch:{ all -> 0x011b }
            java.io.File r0 = r2.A03()     // Catch:{ all -> 0x011b }
            r5.A0I = r0     // Catch:{ all -> 0x011b }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011b }
            r0.setLastModified(r6)     // Catch:{ all -> 0x011b }
            if (r8 != 0) goto L_0x00d7
            if (r4 == 0) goto L_0x00df
        L_0x00d7:
            X.1Av r4 = r3.A0X     // Catch:{ all -> 0x011b }
            java.io.File r2 = r5.A0I     // Catch:{ all -> 0x011b }
            r0 = 1
            r4.A06(r2, r0, r0)     // Catch:{ all -> 0x011b }
        L_0x00df:
            java.util.Set r2 = r3.A0S     // Catch:{ all -> 0x011b }
            monitor-enter(r2)     // Catch:{ all -> 0x011b }
            X.3Qa r0 = r1.A1J     // Catch:{ all -> 0x0118 }
            boolean r0 = r2.remove(r0)     // Catch:{ all -> 0x0118 }
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00f9
            java.io.File r5 = r5.A0I     // Catch:{ all -> 0x011b }
            if (r5 == 0) goto L_0x00f9
            X.1Av r4 = r3.A0X     // Catch:{ all -> 0x011b }
            int r6 = r1.A1I     // Catch:{ all -> 0x011b }
            r7 = 1
            r9 = 0
            r8 = 1
            r4.A05(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x011b }
        L_0x00f9:
            boolean r0 = r1 instanceof X.C46962bx     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0116
            X.0yC r4 = r3.A0A     // Catch:{ all -> 0x011b }
            r2 = 6590(0x19be, float:9.235E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x011b }
            boolean r0 = X.C20800yB.A01(r0, r4, r2)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0116
            r2 = r1
            X.2bx r2 = (X.C46962bx) r2     // Catch:{ all -> 0x011b }
            X.1Ap r0 = r3.A0n     // Catch:{ all -> 0x011b }
            X.6c4 r0 = r0.A00(r2)     // Catch:{ all -> 0x011b }
            X.3S2 r0 = r0.A04     // Catch:{ all -> 0x011b }
            r2.A05 = r0     // Catch:{ all -> 0x011b }
        L_0x0116:
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A01(X.6Fp, X.1ST, X.68C, X.2bU, boolean):void");
    }

    public static void A04(AnonymousClass1ST r6, AnonymousClass68C r7) {
        String str;
        String str2 = r7.A0G;
        File file = r7.A0D;
        if (file == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file is null";
        } else if (str2 == null) {
            str = "mediadownloadmanager/scheduleExpressPathFileCleanUp encrypted file hash is null";
        } else {
            C97384pE r5 = new C97384pE(ExpressPathGarbageCollectWorker.class);
            AnonymousClass6EH r4 = new AnonymousClass6EH();
            String absolutePath = file.getAbsolutePath();
            Map map = r4.A00;
            map.put("file_path", absolutePath);
            map.put("end_hash", str2);
            r5.A00.A0A = r4.A00();
            r5.A02(5, TimeUnit.MINUTES);
            ((AnonymousClass6VR) r6.A0q.get()).A07((C97404pG) r5.A00(), C023109s.A01, str2);
            return;
        }
        Log.e(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r4 == 24) goto L_0x0038;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=X.2bU, code=X.3T1, for r3v0, types: [X.2bU, X.3T1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass1ST r2, X.AnonymousClass3T1 r3, int r4, boolean r5) {
        /*
            if (r5 == 0) goto L_0x003c
            boolean r0 = X.C131806Qs.A02(r3)
            if (r0 == 0) goto L_0x0019
            X.164 r1 = r2.A0Y
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = new com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            r0.<init>(r3)
            r1.A01(r0)
            X.16J r1 = r2.A08
            r0 = 20
            r1.A05(r3, r0)
        L_0x0019:
            boolean r0 = X.C203369nr.A08(r3)
            if (r0 == 0) goto L_0x002d
            X.3Qa r1 = r3.A1J
            X.1A1 r0 = r2.A0M     // Catch:{ all -> 0x002a }
            X.3T1 r0 = r0.A03(r1)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x002d
            goto L_0x002c
        L_0x002a:
            r0 = move-exception
            throw r0
        L_0x002c:
            r3 = r0
        L_0x002d:
            X.0xM r2 = r2.A0d
            r0 = 13
            if (r4 == r0) goto L_0x0038
            r1 = 24
            r0 = 3
            if (r4 != r1) goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            r2.A0n(r3, r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A05(X.1ST, X.2bU, int, boolean):void");
    }

    public static void A06(AnonymousClass1ST r3, AnonymousClass2bU r4, boolean z, boolean z2) {
        C159517jU r2;
        AnonymousClass1GM r0;
        HashMap hashMap = r3.A0Q;
        synchronized (hashMap) {
            r2 = (C159517jU) hashMap.get(r4.A04);
        }
        if (r2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaDownloadManager/cancelDownload/message.key=");
            sb.append(r4.A1J);
            sb.append(", message.mediaHash=");
            sb.append(r4.A04);
            Log.i(sb.toString());
            r2.B2X(z2);
        }
        C64933Qa r22 = r4.A1J;
        if (r22.A00 instanceof C28981Uw) {
            r0 = r3.A0I;
        } else {
            r0 = r3.A0H;
        }
        r0.A08(r4);
        if (z) {
            Set set = r3.A0S;
            synchronized (set) {
                set.add(r22);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (X.AnonymousClass1GM.A00(r0, r3, r4) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.AnonymousClass1ST r3, X.AnonymousClass2bU r4) {
        /*
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x000c
            X.1TR r3 = r3.A0I
        L_0x000a:
            monitor-enter(r3)
            goto L_0x000f
        L_0x000c:
            X.1TQ r3 = r3.A0H
            goto L_0x000a
        L_0x000f:
            java.util.Map r2 = r3.A01     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ all -> 0x0037 }
            X.75K r0 = (X.AnonymousClass75K) r0     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.A03     // Catch:{ all -> 0x0037 }
            r0 = 1
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0024
            r1 = 0
            return r1
        L_0x0024:
            monitor-enter(r3)
            java.lang.Object r0 = r2.get(r4)     // Catch:{ all -> 0x0037 }
            X.75K r0 = (X.AnonymousClass75K) r0     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass1GM.A00(r0, r3, r4)     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            monitor-exit(r3)
            return r1
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A07(X.1ST, X.2bU):boolean");
    }

    private boolean A08(AnonymousClass2bU r7) {
        C20810yC r2 = this.A0A;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 1147) || ((!(r7 instanceof C46972by) && !(r7 instanceof C181798o3)) || (r7.A1J.A00 instanceof C177528dw) || r7.A00 <= ((long) C20800yB.A00(r1, r2, 1148)) * 1048576)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b2, code lost:
        if (r0.hostStorage != 2) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x031f, code lost:
        if (X.C203369nr.A08(r2) == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d1, code lost:
        if (r12.A02(r4) == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021c, code lost:
        if (((X.C46962bx) r2).A1l() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027a, code lost:
        if (r0 != 12) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028a, code lost:
        if (r2.A1Q() == false) goto L_0x028c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C101334xN A09(X.C160107kT r66, X.AnonymousClass2bU r67, int r68, long r69, boolean r71, boolean r72) {
        /*
            r65 = this;
            r2 = r67
            X.3Qj r5 = r2.A01
            r18 = 0
            if (r5 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS unable to download due to missing media data; message.key="
        L_0x000f:
            r1.append(r0)
            X.3Qa r0 = r2.A1J
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r18
        L_0x0029:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already completed; message.key="
            goto L_0x000f
        L_0x0039:
            r3 = r65
            X.1SU r0 = r3.A0E
            r64 = r0
            X.4xN r7 = r0.A00(r5)
            boolean r0 = r5.A0f
            r1 = 0
            r8 = r66
            r10 = r68
            r61 = r72
            if (r0 == 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            if (r72 != 0) goto L_0x0054
            r7.A06 = r1
        L_0x0054:
            int r0 = r7.A14
            if (r10 >= r0) goto L_0x00b8
            r5.A0d = r1
            r7.A14 = r10
            X.6Fk r1 = r7.A0j
            monitor-enter(r1)
            goto L_0x006d
        L_0x0060:
            int r0 = r5.A09
            r1 = 1
            if (r0 != r1) goto L_0x00d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS media has been marked suspicious; message.key="
            goto L_0x000f
        L_0x006d:
            r1.A00 = r10     // Catch:{ all -> 0x00b5 }
            monitor-exit(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download upgraded to "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; message.key="
            r1.append(r0)
            X.3Qa r0 = r2.A1J
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17Y r6 = r3.A04
            X.16J r5 = r3.A08
            r4 = -1
            r1 = 28
            X.1iP r0 = new X.1iP
            r0.<init>((java.lang.Object) r5, (int) r4, (int) r1, (java.lang.Object) r2)
            r6.A0H(r0)
            if (r68 != 0) goto L_0x0143
            boolean r0 = A07(r3, r2)
            if (r0 == 0) goto L_0x0143
            if (r66 == 0) goto L_0x00b4
            r7.B0M(r8)
        L_0x00b4:
            return r7
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS download already in progress (according to media data); message.key="
            r1.append(r0)
            X.3Qa r0 = r2.A1J
            r1.append(r0)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r18
        L_0x00d9:
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014a
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x014a
        L_0x00f1:
            X.11F r0 = r2.A0J()
            boolean r0 = r0 instanceof X.C177638e7
            if (r0 != 0) goto L_0x014a
            X.0u5 r0 = A0r
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0135
            X.0wN r6 = r3.A0W
            java.lang.String r4 = "MediaDownloadManager/createMediaDownloadForFMessage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "createMediaDownloadForFMessage/direct_path is "
            r7.append(r0)
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "null"
        L_0x0119:
            r7.append(r0)
            java.lang.String r0 = " encHash is "
            r7.append(r0)
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "null"
        L_0x012b:
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.A0E(r4, r0, r1)
        L_0x0135:
            if (r66 == 0) goto L_0x0143
            java.util.concurrent.Executor r2 = r3.A0T
            r1 = 11
            X.1j8 r0 = new X.1j8
            r0.<init>(r8, r1)
            r2.execute(r0)
        L_0x0143:
            return r18
        L_0x0144:
            java.lang.String r0 = "not null"
            goto L_0x012b
        L_0x0147:
            java.lang.String r0 = "not null"
            goto L_0x0119
        L_0x014a:
            X.17Y r0 = r3.A04
            r63 = r0
            r16 = 10
            X.1iX r1 = new X.1iX
            r11 = r1
            r12 = r3
            r13 = r2
            r14 = r5
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r0.Bp3(r1)
            X.1TS r6 = r3.A0F
            monitor-enter(r6)
            X.3Qa r7 = r2.A1J     // Catch:{ all -> 0x040d }
            boolean r1 = r6.containsKey(r7)     // Catch:{ all -> 0x040d }
            r0 = 0
            if (r1 != 0) goto L_0x016a
            r0 = 1
        L_0x016a:
            monitor-exit(r6)     // Catch:{ all -> 0x040d }
            if (r0 == 0) goto L_0x034b
            X.11F r9 = r7.A00
            X.0yC r1 = r3.A0A
            X.0y0 r0 = r3.A03
            r19 = r0
            X.1E2 r12 = r3.A0h
            X.1DW r0 = r3.A0f
            r35 = r0
            X.1CR r14 = r3.A0m
            X.1Gq r11 = r3.A0g
            X.1AW r0 = r3.A0j
            r20 = r0
            X.1EO r15 = r3.A0k
            X.3Qj r4 = r2.A01
            X.C18740tg.A06(r4)
            boolean r0 = X.AnonymousClass3T2.A04(r2)
            if (r0 == 0) goto L_0x033f
            r42 = 3
        L_0x0192:
            boolean r0 = r9 instanceof X.C177528dw
            r62 = r0
            java.lang.String r0 = r4.A0L
            if (r0 != 0) goto L_0x01a4
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.A0L = r0
        L_0x01a4:
            int r13 = r4.A0A
            int r1 = r4.A06
            X.3IX r17 = new X.3IX
            r0 = r17
            r0.<init>(r13, r1)
            boolean r0 = r9 instanceof X.C177548dy
            r16 = r0
            if (r0 == 0) goto L_0x033b
            java.lang.String r1 = r2.A1b()
            java.lang.String r0 = "gdpr.zip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x032b
            X.2o7 r23 = X.C51622o7.ACCOUNT
        L_0x01c3:
            boolean r0 = r2 instanceof X.AnonymousClass4TX
            r55 = r0
            boolean r0 = r2 instanceof X.C181798o3
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r12.A02(r4)
            r58 = 1
            if (r0 != 0) goto L_0x01d5
        L_0x01d3:
            r58 = 0
        L_0x01d5:
            X.1Gl r22 = X.AnonymousClass6Y1.A02(r2)
            java.lang.String r1 = r2.A03
            java.lang.String r12 = r2.A04
            java.lang.String r0 = r2.A07
            r34 = r0
            r32 = 0
            r27 = 0
            r21 = r19
            r24 = r1
            r25 = r12
            r26 = r0
            java.io.File r26 = r21.A0K(r22, r23, r24, r25, r26, r27)
            r27 = r19
            r28 = r22
            r29 = r23
            r30 = r12
            r31 = r0
            r33 = r55
            java.io.File r25 = r27.A0L(r28, r29, r30, r31, r32, r33)
            boolean r57 = r4.A03()
            boolean r0 = X.AnonymousClass2bU.A03(r34)
            r43 = 0
            if (r0 == 0) goto L_0x020f
            r43 = 2
        L_0x020f:
            boolean r0 = r2 instanceof X.C46962bx
            if (r0 == 0) goto L_0x021e
            r0 = r2
            X.2bx r0 = (X.C46962bx) r0
            boolean r0 = r0.A1l()
            r59 = 1
            if (r0 != 0) goto L_0x0220
        L_0x021e:
            r59 = 0
        L_0x0220:
            int r0 = r4.A04
            r38 = r0
            byte[] r0 = r4.A0X
            r36 = r0
            java.io.File r0 = r4.A0I
            r24 = r0
            long r0 = r2.A00
            r46 = r0
            int r0 = r2.A0B
            long r0 = (long) r0
            r48 = r0
            X.6Q6 r0 = r2.A1Y()
            X.76k r12 = new X.76k
            r12.<init>(r11, r0)
            java.lang.String r0 = r2.A04
            r28 = r0
            java.lang.String r29 = r2.A1b()
            java.lang.String r0 = r4.A0L
            r30 = r0
            java.lang.String r0 = r2.A03
            r31 = r0
            java.lang.String r0 = r2.A05
            r32 = r0
            java.lang.String r0 = r4.A0J
            r33 = r0
            int r0 = r2.A09
            r19 = r0
            int r40 = X.AnonymousClass1GX.A01(r2, r14)
            r1 = r35
            r0 = r20
            int r41 = X.C55802vD.A00(r1, r2, r0, r15)
            X.11F r0 = r2.A0J()
            boolean r14 = r0 instanceof X.C177638e7
            int r0 = r2.A0D
            r1 = 11
            r51 = 1
            if (r0 == r1) goto L_0x027c
            r51 = 0
            r1 = 12
            r52 = 1
            if (r0 == r1) goto L_0x027e
        L_0x027c:
            r52 = 0
        L_0x027e:
            X.3Kz r0 = r2.A0V()
            if (r0 == 0) goto L_0x028c
            boolean r0 = r2.A1Q()
            r53 = 1
            if (r0 != 0) goto L_0x028e
        L_0x028c:
            r53 = 0
        L_0x028e:
            int r1 = r2.A1I
            r0 = 20
            if (r1 != r0) goto L_0x0327
            r0 = r2
            X.2bx r0 = (X.C46962bx) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x029f
            int r0 = r4.A04
            if (r0 <= 0) goto L_0x0327
        L_0x029f:
            r54 = 1
        L_0x02a1:
            r50 = 0
            byte[] r13 = r4.A0a
            X.3Qj r0 = r2.A01
            java.lang.String r11 = r0.A0O
            X.3ur r0 = r2.A0b
            if (r0 == 0) goto L_0x02b4
            int r1 = r0.hostStorage
            r0 = 2
            r60 = 1
            if (r1 == r0) goto L_0x02b6
        L_0x02b4:
            r60 = 0
        L_0x02b6:
            X.68C r4 = new X.68C
            r56 = 0
            r20 = r9
            r21 = r17
            r27 = r34
            r34 = r11
            r35 = r12
            r37 = r13
            r39 = r19
            r44 = r46
            r46 = r48
            r48 = r62
            r49 = r14
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            X.1TO r1 = r3.A02
            android.os.ConditionVariable r0 = r3.A01
            int r58 = X.C203229nZ.A00(r9)
            r59 = r69
            r54 = r1
            r55 = r0
            r56 = r4
            r57 = r10
            X.4xN r10 = r54.A00(r55, r56, r57, r58, r59, r61)
            if (r9 == 0) goto L_0x02fb
            X.17X r0 = r3.A0e
            java.util.HashSet r0 = r0.A05(r9)
            int r1 = r0.size()
            X.6Fk r0 = r10.A0j
            r0.A01 = r1
        L_0x02fb:
            long r0 = r2.A0G
            X.6Fk r9 = r10.A0j
            r9.A0C = r0
            java.lang.String r0 = r7.A01
            r9.A0T = r0
            int r9 = r2.A0H()
            r1 = 2
            r0 = 0
            if (r9 != r1) goto L_0x030e
            r0 = 1
        L_0x030e:
            if (r16 != 0) goto L_0x0321
            if (r0 != 0) goto L_0x0321
            long r0 = r2.A1N
            r11 = -1
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0321
            boolean r1 = X.C203369nr.A08(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0322
        L_0x0321:
            r0 = 1
        L_0x0322:
            X.C18740tg.A0C(r0)
        L_0x0325:
            monitor-enter(r6)
            goto L_0x034f
        L_0x0327:
            r54 = 0
            goto L_0x02a1
        L_0x032b:
            java.lang.String r1 = r2.A1b()
            java.lang.String r0 = "channels_gdpr.zip"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x033b
            X.2o7 r23 = X.C51622o7.NEWSLETTER
            goto L_0x01c3
        L_0x033b:
            r23 = 0
            goto L_0x01c3
        L_0x033f:
            boolean r0 = X.C65703Td.A01(r1, r2)
            r42 = 1
            if (r0 == 0) goto L_0x0192
            r42 = 2
            goto L_0x0192
        L_0x034b:
            r10 = r18
            r4 = r10
            goto L_0x0325
        L_0x034f:
            boolean r0 = r6.containsKey(r7)     // Catch:{ all -> 0x040a }
            if (r0 != 0) goto L_0x0367
            if (r10 == 0) goto L_0x0367
            r6.put(r7, r2)     // Catch:{ all -> 0x040a }
            r0 = r64
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x040a }
            monitor-enter(r1)     // Catch:{ all -> 0x040a }
            r1.put(r5, r10)     // Catch:{ all -> 0x0364 }
            monitor-exit(r1)     // Catch:{ all -> 0x0364 }
            goto L_0x036a
        L_0x0364:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0364 }
            throw r0     // Catch:{ all -> 0x040a }
        L_0x0367:
            r10 = r18
            r4 = r10
        L_0x036a:
            monitor-exit(r6)     // Catch:{ all -> 0x040a }
            r5 = r71
            if (r71 == 0) goto L_0x037e
            X.16J r9 = r3.A08
            r6 = -1
            r0 = 28
            X.1iP r1 = new X.1iP
            r1.<init>((java.lang.Object) r9, (int) r6, (int) r0, (java.lang.Object) r2)
            r0 = r63
            r0.A0H(r1)
        L_0x037e:
            if (r10 == 0) goto L_0x0409
            java.lang.String r0 = r2.A04
            r11 = r3
            r12 = r8
            r13 = r10
            r14 = r4
            r15 = r2
            r16 = r0
            r17 = r5
            boolean r0 = r11.A0F(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x03b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/createMediaDownloadForFMessage/MMS existing download with hash for message.key="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", message.mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r18
        L_0x03b0:
            if (r66 == 0) goto L_0x03b5
            r10.B0M(r8)
        L_0x03b5:
            r0 = 7
            X.413 r1 = new X.413
            r1.<init>(r2, r0)
            java.util.concurrent.Executor r7 = r3.A0T
            X.1Hk r0 = r10.A0N
            r0.A03(r1, r7)
            r0 = 3
            X.3oS r1 = new X.3oS
            r1.<init>(r2, r3, r0)
            X.1Hk r0 = r10.A0L
            r0.A03(r1, r7)
            if (r71 == 0) goto L_0x03e7
            r0 = 0
            X.B9q r6 = new X.B9q
            r6.<init>(r3, r2, r0)
            java.util.concurrent.Executor r1 = r3.A0U
            X.1Hk r0 = r10.A0J
            r0.A03(r6, r1)
            r0 = 1
            X.4KQ r1 = new X.4KQ
            r1.<init>(r4, r3, r2, r0)
            X.1Hk r0 = r10.A0M
            r0.A03(r1, r7)
        L_0x03e7:
            r0 = 2
            X.3oS r1 = new X.3oS
            r1.<init>(r2, r3, r0)
            X.1Hk r0 = r10.A0I
            r0.A03(r1, r7)
            X.70O r1 = new X.70O
            r1.<init>(r3, r4, r2, r5)
            java.util.concurrent.Executor r4 = r3.A0U
            X.1Hk r0 = r10.A0H
            r0.A03(r1, r4)
            r0 = 6
            X.7sh r1 = new X.7sh
            r1.<init>(r3, r2, r0)
            X.1Hk r0 = r10.A0K
            r0.A03(r1, r4)
        L_0x0409:
            return r10
        L_0x040a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x040a }
            throw r0
        L_0x040d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x040d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A09(X.7kT, X.2bU, int, long, boolean, boolean):X.4xN");
    }

    public C101334xN A0A(AnonymousClass2bU r4) {
        C159517jU r1;
        HashMap hashMap = this.A0Q;
        synchronized (hashMap) {
            r1 = (C159517jU) hashMap.get(r4.A04);
        }
        if (r1 instanceof C101334xN) {
            return (C101334xN) r1;
        }
        return null;
    }

    public ArrayList A0B() {
        ArrayList arrayList;
        AnonymousClass1TS r2 = this.A0F;
        synchronized (r2) {
            arrayList = new ArrayList(r2.values());
        }
        return arrayList;
    }

    public static void A03(AnonymousClass1ST r4) {
        ArrayList A0B2 = r4.A0B();
        ArrayList arrayList = new ArrayList();
        Iterator it = A0B2.iterator();
        while (it.hasNext()) {
            AnonymousClass2bU r1 = (AnonymousClass2bU) it.next();
            if (r4.A08(r1)) {
                arrayList.add(r1);
            }
        }
        r4.A07.A04(arrayList);
    }

    public void A0D(C160107kT r6, AnonymousClass2bU r7, int i, long j, boolean z, boolean z2) {
        C159517jU r62;
        C101334xN r63;
        long j2;
        C101334xN A092 = A09(r6, r7, i, j, z, z2);
        if (A092 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaDownloadManager/queueDownload auto download ");
            C64933Qa r1 = r7.A1J;
            sb.append(r1);
            sb.append(", message.mediaHash=");
            sb.append(r7.A04);
            Log.i(sb.toString());
            if (r1.A00 instanceof C28981Uw) {
                if (AnonymousClass1GQ.A00(this.A0K, 3)) {
                    j2 = (long) AnonymousClass2tT.A00(this.A0c, this.A0A, r7);
                } else {
                    j2 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MediaDownloadManager/queueDownload queue in newsletterMediaDownloadPriorityQueue with delay ");
                sb2.append(j2);
                sb2.append("ms");
                Log.i(sb2.toString());
                this.A0V.postDelayed(new C35631j0(this, r7, A092, 31), j2);
                return;
            }
            if (r7.A03 != null) {
                if (C20800yB.A01(C21000yV.A01, this.A0A, 1539)) {
                    String str = r7.A03;
                    HashMap hashMap = this.A0R;
                    synchronized (hashMap) {
                        r62 = (C159517jU) hashMap.get(str);
                    }
                    if ((r62 instanceof C101334xN) && (r63 = (C101334xN) r62) != null) {
                        Objects.requireNonNull(A092);
                        r63.A0L.A03(new C164967sf(A092, 4), (Executor) null);
                        A092.A00.A03(new C164967sf(r63, 3), this.A0U);
                        this.A0O.Boy(new C35371ia(this, r63, r7, A092, 18));
                        return;
                    }
                }
            }
            this.A0H.A04(A092, r7);
        }
    }

    public AnonymousClass1ST(C19700wN r7, AnonymousClass1TO r8, C20690y0 r9, AnonymousClass17Y r10, C19730wQ r11, AnonymousClass1DT r12, C24041Av r13, AnonymousClass164 r14, C21060yb r15, C19970wo r16, C19630wG r17, C220412q r18, C20310xM r19, AnonymousClass17X r20, AnonymousClass16J r21, C28291Sb r22, AnonymousClass1DW r23, C20810yC r24, C25521Gq r25, AnonymousClass1SW r26, AnonymousClass1D4 r27, AnonymousClass1GO r28, AnonymousClass1SU r29, C25161Ff r30, AnonymousClass1TQ r31, AnonymousClass1TR r32, AnonymousClass1E2 r33, AnonymousClass1C4 r34, AnonymousClass1GQ r35, C19890wg r36, AnonymousClass1AW r37, AnonymousClass1EO r38, AnonymousClass1BS r39, AnonymousClass1MM r40, AnonymousClass1CR r41, C23981Ap r42, WebpUtils webpUtils, AnonymousClass1A1 r44, AnonymousClass1SV r45, C19770wU r46, C21570zS r47) {
        C81873xm r3 = null;
        this.A0a = r16;
        C20810yC r5 = r24;
        this.A0A = r5;
        this.A04 = r10;
        this.A05 = r11;
        this.A0W = r7;
        this.A0b = r17;
        C19770wU r4 = r46;
        this.A0O = r4;
        this.A0o = webpUtils;
        this.A0c = r18;
        this.A03 = r9;
        this.A0J = r34;
        this.A0h = r33;
        this.A0Y = r14;
        this.A0L = r39;
        this.A0f = r23;
        this.A06 = r12;
        this.A0E = r29;
        this.A0q = r47;
        this.A0G = r30;
        this.A0M = r44;
        this.A0C = r27;
        this.A0d = r19;
        this.A0l = r40;
        this.A08 = r21;
        this.A0K = r35;
        this.A0m = r41;
        this.A0n = r42;
        this.A0N = r45;
        this.A09 = r22;
        this.A0D = r28;
        this.A02 = r8;
        this.A0e = r20;
        this.A0i = r36;
        this.A0H = r31;
        this.A0B = r26;
        this.A0X = r13;
        this.A0g = r25;
        this.A0I = r32;
        this.A0j = r37;
        this.A0k = r38;
        Objects.requireNonNull(r10);
        this.A0T = new C36131jo(r10, 1);
        Objects.requireNonNull(r4);
        this.A0U = new C36131jo(r4, 2);
        C21000yV r1 = C21000yV.A02;
        this.A0p = C20800yB.A00(r1, r5, 776) > 0 ? new C81873xm(r4, C20800yB.A00(r1, r5, 776), false) : r3;
        this.A0Z = r15;
    }
}
