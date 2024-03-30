package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Nz  reason: invalid class name and case insensitive filesystem */
public class C27381Nz implements C20420xX {
    public Handler A00;
    public final C19460v5 A01;
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final AnonymousClass19J A05;
    public final C27501Ol A06;
    public final AnonymousClass1KK A07;
    public final AnonymousClass1KL A08;
    public final C19600wD A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass1O1 A0B;
    public final AnonymousClass1O6 A0C;
    public final C27491Ok A0D;
    public final AnonymousClass1O0 A0E;
    public final AnonymousClass1O4 A0F;
    public final C27521On A0G;
    public final C27511Om A0H;
    public final AnonymousClass1A6 A0I;
    public final C21060yb A0J;
    public final C19970wo A0K;
    public final C19630wG A0L;
    public final C20830yE A0M;
    public final C20060wx A0N;
    public final C20810yC A0O;
    public final AnonymousClass1EV A0P;
    public final AnonymousClass12U A0Q;
    public final C19930wk A0R;
    public final AnonymousClass005 A0S;
    public final Runnable A0T;
    public final Random A0U = new Random();
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AnonymousClass1O8 A0W;

    public static synchronized Handler A00(C27381Nz r3) {
        Handler handler;
        synchronized (r3) {
            handler = r3.A00;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("sync", 10);
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                r3.A00 = handler;
            }
        }
        return handler;
    }

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYp() {
    }

    public static ArrayList A01(C27381Nz r4, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) it.next();
            AnonymousClass141 A082 = r4.A0A.A08(r1);
            if (A082 == null) {
                A082 = new AnonymousClass141(r1);
            }
            arrayList.add(A082);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x013c, code lost:
        if (r2.A0D != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x013e, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0142, code lost:
        if (r0.A0D == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0144, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0148, code lost:
        if (r2.A0E != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x014a, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014e, code lost:
        if (r0.A0E == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0150, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0154, code lost:
        if (r2.A09 != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0156, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x015a, code lost:
        if (r0.A09 == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015c, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0160, code lost:
        if (r2.A0K != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0162, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0166, code lost:
        if (r0.A0K == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0168, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x016c, code lost:
        if (r2.A0J != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x016e, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0172, code lost:
        if (r0.A0J == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0174, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0176, code lost:
        r3.A00 = new X.AnonymousClass6NS(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r9 = r3.A01();
        r9.A00 = java.lang.Math.max(r2.A00, r0.A00);
        r3 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x018d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r2 = new java.util.ArrayList(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0193, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r3 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0196, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r3.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x019a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r2 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x019d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r0 = new java.util.ArrayList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01a3, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r3.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01a8, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a9, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01ab, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01ae, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01b1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01b4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("these requests cannot be combined ");
        r3.append(r2);
        r3.append(" and ");
        r3.append(r0);
        r1 = new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01d6, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Context/Mode (");
        r1.append(r13);
        r1.append("/");
        r1.append(r11);
        r1.append(") do not represent a recognized SyncType");
        r1 = new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01f9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/combineRequests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.A02.remove(r0);
        r3 = (X.AnonymousClass34F) r1.A01.remove(r0);
        X.C27511Om.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r5 = java.lang.Math.max(r3.A00 - android.os.SystemClock.elapsedRealtime(), 0);
        A00(r4).removeCallbacks(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r12 != r9) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r12 == r13) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r12 == r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r12 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r13 = r12.context;
        r11 = r9.context;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r13.compareTo(r11) < 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r11 = r12.mode;
        r9 = r9.mode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r11.compareTo(r9) < 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r15 = X.C108515Tu.values();
        r14 = r15.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        r12 = r15[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r12.context != r13) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        if (r12.mode != r11) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r3 = new X.C131666Pz(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r2.A01 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (r0.A01 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r9 >= r14) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b2, code lost:
        r3.A02 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b6, code lost:
        if (r2.A07 == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        if (r0.A07 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bd, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00be, code lost:
        r3.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
        if (r2.A08 == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c4, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (r0.A08 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        r3.A04 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ce, code lost:
        if (r2.A06 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d0, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d3, code lost:
        if (r0.A06 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d5, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d6, code lost:
        r3.A01 = r9;
        X.C131666Pz.A00(r3, r2.A04);
        X.C131666Pz.A00(r3, r0.A04);
        r9 = r2.A05;
        r11 = r3.A07;
        r11.addAll(r9);
        r11.addAll(r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f0, code lost:
        if (r2.A0B != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f2, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        if (r0.A0B == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fa, code lost:
        if (r2.A0H != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fc, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ff, code lost:
        if (r0.A0H == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0101, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0104, code lost:
        if (r2.A0I != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0106, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0109, code lost:
        if (r0.A0I == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x010b, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010e, code lost:
        if (r2.A0G != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0110, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0113, code lost:
        if (r0.A0G == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0115, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0118, code lost:
        if (r2.A0A != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x011a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011e, code lost:
        if (r0.A0A == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0120, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0124, code lost:
        if (r2.A0C != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0126, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012a, code lost:
        if (r0.A0C == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012c, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0130, code lost:
        if (r2.A0F != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0132, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0136, code lost:
        if (r0.A0F == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0138, code lost:
        r18 = true;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:193:0x02a4=Splitter:B:193:0x02a4, B:163:0x01b7=Splitter:B:163:0x01b7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C27381Nz r22, X.C131586Pq r23) {
        /*
            r2 = r23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactSyncRequestExecutor/queueRequest "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r22
            java.util.concurrent.atomic.AtomicBoolean r10 = r4.A0V
            monitor-enter(r10)
            r5 = -1
            X.1Om r1 = r4.A0H     // Catch:{ all -> 0x02d8 }
            monitor-enter(r1)     // Catch:{ all -> 0x02d8 }
            java.util.Set r0 = r1.A02     // Catch:{ all -> 0x02d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x02d8 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x02d8 }
        L_0x0027:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x02d8 }
            r7 = 0
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x02d8 }
            X.6Pq r0 = (X.C131586Pq) r0     // Catch:{ all -> 0x02d8 }
            X.5Tu r9 = r0.A02     // Catch:{ all -> 0x02d8 }
            X.5Tu r12 = r2.A02     // Catch:{ all -> 0x02d8 }
            if (r9 != r12) goto L_0x0027
            X.5Tu r13 = X.C108515Tu.A0K     // Catch:{ all -> 0x02d8 }
            if (r9 == r13) goto L_0x0027
            java.lang.String r3 = "ContactSyncRequestExecutor/combineRequests"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02d8 }
            monitor-enter(r1)     // Catch:{ all -> 0x02d8 }
            java.util.Set r3 = r1.A02     // Catch:{ all -> 0x02d5 }
            r3.remove(r0)     // Catch:{ all -> 0x02d5 }
            java.util.Map r3 = r1.A01     // Catch:{ all -> 0x02d5 }
            java.lang.Object r3 = r3.remove(r0)     // Catch:{ all -> 0x02d5 }
            X.34F r3 = (X.AnonymousClass34F) r3     // Catch:{ all -> 0x02d5 }
            X.C27511Om.A00(r1)     // Catch:{ all -> 0x02d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x02d8 }
            long r5 = r3.A00     // Catch:{ all -> 0x02d8 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d8 }
            long r5 = r5 - r14
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x02d8 }
            android.os.Handler r11 = A00(r4)     // Catch:{ all -> 0x02d8 }
            java.lang.Runnable r3 = r3.A01     // Catch:{ all -> 0x02d8 }
            r11.removeCallbacks(r3)     // Catch:{ all -> 0x02d8 }
            if (r12 != r9) goto L_0x01b7
            if (r12 == r13) goto L_0x01b7
            if (r12 == r9) goto L_0x009d
            if (r9 == 0) goto L_0x009d
            if (r12 != 0) goto L_0x0076
            r12 = r9
            goto L_0x009d
        L_0x0076:
            X.5Tc r13 = r12.context     // Catch:{ all -> 0x02d8 }
            X.5Tc r11 = r9.context     // Catch:{ all -> 0x02d8 }
            int r3 = r13.compareTo(r11)     // Catch:{ all -> 0x02d8 }
            if (r3 < 0) goto L_0x0081
            r13 = r11
        L_0x0081:
            X.5TH r11 = r12.mode     // Catch:{ all -> 0x02d8 }
            X.5TH r9 = r9.mode     // Catch:{ all -> 0x02d8 }
            int r3 = r11.compareTo(r9)     // Catch:{ all -> 0x02d8 }
            if (r3 < 0) goto L_0x008c
            r11 = r9
        L_0x008c:
            X.5Tu[] r15 = X.C108515Tu.values()     // Catch:{ all -> 0x02d8 }
            int r14 = r15.length     // Catch:{ all -> 0x02d8 }
            r9 = 0
            goto L_0x00ae
        L_0x0093:
            r12 = r15[r9]     // Catch:{ all -> 0x02d8 }
            X.5Tc r3 = r12.context     // Catch:{ all -> 0x02d8 }
            if (r3 != r13) goto L_0x00ac
            X.5TH r3 = r12.mode     // Catch:{ all -> 0x02d8 }
            if (r3 != r11) goto L_0x00ac
        L_0x009d:
            X.6Pz r3 = new X.6Pz     // Catch:{ all -> 0x02d8 }
            r3.<init>(r12)     // Catch:{ all -> 0x02d8 }
            boolean r9 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x00b1
            boolean r11 = r0.A01     // Catch:{ all -> 0x02d8 }
            r9 = 0
            if (r11 == 0) goto L_0x00b2
            goto L_0x00b1
        L_0x00ac:
            int r9 = r9 + 1
        L_0x00ae:
            if (r9 >= r14) goto L_0x01d6
            goto L_0x0093
        L_0x00b1:
            r9 = 1
        L_0x00b2:
            r3.A02 = r9     // Catch:{ all -> 0x02d8 }
            boolean r9 = r2.A07     // Catch:{ all -> 0x02d8 }
            if (r9 == 0) goto L_0x00bd
            boolean r11 = r0.A07     // Catch:{ all -> 0x02d8 }
            r9 = 1
            if (r11 != 0) goto L_0x00be
        L_0x00bd:
            r9 = 0
        L_0x00be:
            r3.A03 = r9     // Catch:{ all -> 0x02d8 }
            boolean r9 = r2.A08     // Catch:{ all -> 0x02d8 }
            if (r9 == 0) goto L_0x00c9
            boolean r11 = r0.A08     // Catch:{ all -> 0x02d8 }
            r9 = 1
            if (r11 != 0) goto L_0x00ca
        L_0x00c9:
            r9 = 0
        L_0x00ca:
            r3.A04 = r9     // Catch:{ all -> 0x02d8 }
            boolean r9 = r2.A06     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x00d5
            boolean r11 = r0.A06     // Catch:{ all -> 0x02d8 }
            r9 = 0
            if (r11 == 0) goto L_0x00d6
        L_0x00d5:
            r9 = 1
        L_0x00d6:
            r3.A01 = r9     // Catch:{ all -> 0x02d8 }
            java.util.List r9 = r2.A04     // Catch:{ all -> 0x02d8 }
            X.C131666Pz.A00(r3, r9)     // Catch:{ all -> 0x02d8 }
            java.util.List r9 = r0.A04     // Catch:{ all -> 0x02d8 }
            X.C131666Pz.A00(r3, r9)     // Catch:{ all -> 0x02d8 }
            java.util.Set r9 = r2.A05     // Catch:{ all -> 0x02d8 }
            java.util.Set r11 = r3.A07     // Catch:{ all -> 0x02d8 }
            r11.addAll(r9)     // Catch:{ all -> 0x02d8 }
            java.util.Set r9 = r0.A05     // Catch:{ all -> 0x02d8 }
            r11.addAll(r9)     // Catch:{ all -> 0x02d8 }
            boolean r9 = r2.A0B     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x00f7
            boolean r9 = r0.A0B     // Catch:{ all -> 0x02d8 }
            r12 = 0
            if (r9 == 0) goto L_0x00f8
        L_0x00f7:
            r12 = 1
        L_0x00f8:
            boolean r9 = r2.A0H     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0101
            boolean r9 = r0.A0H     // Catch:{ all -> 0x02d8 }
            r13 = 0
            if (r9 == 0) goto L_0x0102
        L_0x0101:
            r13 = 1
        L_0x0102:
            boolean r9 = r2.A0I     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x010b
            boolean r9 = r0.A0I     // Catch:{ all -> 0x02d8 }
            r14 = 0
            if (r9 == 0) goto L_0x010c
        L_0x010b:
            r14 = 1
        L_0x010c:
            boolean r9 = r2.A0G     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0115
            boolean r9 = r0.A0G     // Catch:{ all -> 0x02d8 }
            r15 = 0
            if (r9 == 0) goto L_0x0116
        L_0x0115:
            r15 = 1
        L_0x0116:
            boolean r9 = r2.A0A     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0120
            boolean r9 = r0.A0A     // Catch:{ all -> 0x02d8 }
            r16 = 0
            if (r9 == 0) goto L_0x0122
        L_0x0120:
            r16 = 1
        L_0x0122:
            boolean r9 = r2.A0C     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x012c
            boolean r9 = r0.A0C     // Catch:{ all -> 0x02d8 }
            r17 = 0
            if (r9 == 0) goto L_0x012e
        L_0x012c:
            r17 = 1
        L_0x012e:
            boolean r9 = r2.A0F     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0138
            boolean r9 = r0.A0F     // Catch:{ all -> 0x02d8 }
            r18 = 0
            if (r9 == 0) goto L_0x013a
        L_0x0138:
            r18 = 1
        L_0x013a:
            boolean r9 = r2.A0D     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0144
            boolean r9 = r0.A0D     // Catch:{ all -> 0x02d8 }
            r19 = 0
            if (r9 == 0) goto L_0x0146
        L_0x0144:
            r19 = 1
        L_0x0146:
            boolean r9 = r2.A0E     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0150
            boolean r9 = r0.A0E     // Catch:{ all -> 0x02d8 }
            r20 = 0
            if (r9 == 0) goto L_0x0152
        L_0x0150:
            r20 = 1
        L_0x0152:
            boolean r9 = r2.A09     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x015c
            boolean r9 = r0.A09     // Catch:{ all -> 0x02d8 }
            r21 = 0
            if (r9 == 0) goto L_0x015e
        L_0x015c:
            r21 = 1
        L_0x015e:
            boolean r9 = r2.A0K     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0168
            boolean r9 = r0.A0K     // Catch:{ all -> 0x02d8 }
            r22 = 0
            if (r9 == 0) goto L_0x016a
        L_0x0168:
            r22 = 1
        L_0x016a:
            boolean r9 = r2.A0J     // Catch:{ all -> 0x02d8 }
            if (r9 != 0) goto L_0x0174
            boolean r9 = r0.A0J     // Catch:{ all -> 0x02d8 }
            r23 = 0
            if (r9 == 0) goto L_0x0176
        L_0x0174:
            r23 = 1
        L_0x0176:
            X.6NS r11 = new X.6NS     // Catch:{ all -> 0x02d8 }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02d8 }
            r3.A00 = r11     // Catch:{ all -> 0x02d8 }
            X.6Pq r9 = r3.A01()     // Catch:{ all -> 0x02d8 }
            int r11 = r2.A00     // Catch:{ all -> 0x02d8 }
            int r3 = r0.A00     // Catch:{ all -> 0x02d8 }
            int r3 = java.lang.Math.max(r11, r3)     // Catch:{ all -> 0x02d8 }
            r9.A00 = r3     // Catch:{ all -> 0x02d8 }
            java.util.List r3 = r2.A03     // Catch:{ all -> 0x02d8 }
            monitor-enter(r3)     // Catch:{ all -> 0x02d8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01b4 }
            r2.<init>(r3)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r3)     // Catch:{ all -> 0x01b4 }
            java.util.List r3 = r9.A03     // Catch:{ all -> 0x02d8 }
            monitor-enter(r3)     // Catch:{ all -> 0x02d8 }
            r3.addAll(r2)     // Catch:{ all -> 0x01b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            java.util.List r2 = r0.A03     // Catch:{ all -> 0x02d8 }
            monitor-enter(r2)     // Catch:{ all -> 0x02d8 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01ae }
            r0.<init>(r2)     // Catch:{ all -> 0x01ae }
            monitor-exit(r2)     // Catch:{ all -> 0x01ae }
            monitor-enter(r3)     // Catch:{ all -> 0x02d8 }
            r3.addAll(r0)     // Catch:{ all -> 0x01ab }
            monitor-exit(r3)     // Catch:{ all -> 0x01ab }
            r2 = r9
            goto L_0x01fa
        L_0x01ab:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ab }
            goto L_0x01f9
        L_0x01ae:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ae }
            goto L_0x01f9
        L_0x01b1:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b1 }
            goto L_0x01f9
        L_0x01b4:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b4 }
            goto L_0x01f9
        L_0x01b7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r3.<init>()     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = "these requests cannot be combined "
            r3.append(r1)     // Catch:{ all -> 0x02d8 }
            r3.append(r2)     // Catch:{ all -> 0x02d8 }
            java.lang.String r1 = " and "
            r3.append(r1)     // Catch:{ all -> 0x02d8 }
            r3.append(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02d8 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02d8 }
            r1.<init>(r0)     // Catch:{ all -> 0x02d8 }
            goto L_0x01f9
        L_0x01d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r1.<init>()     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "Context/Mode ("
            r1.append(r0)     // Catch:{ all -> 0x02d8 }
            r1.append(r13)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x02d8 }
            r1.append(r11)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = ") do not represent a recognized SyncType"
            r1.append(r0)     // Catch:{ all -> 0x02d8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02d8 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02d8 }
            r1.<init>(r0)     // Catch:{ all -> 0x02d8 }
        L_0x01f9:
            throw r1     // Catch:{ all -> 0x02d8 }
        L_0x01fa:
            X.74u r0 = new X.74u     // Catch:{ all -> 0x02d8 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x02d8 }
            boolean r3 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r3 == 0) goto L_0x0214
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02d8 }
            r3.postDelayed(r0, r7)     // Catch:{ all -> 0x02d8 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d8 }
            r1.A02(r2, r0, r3)     // Catch:{ all -> 0x02d8 }
        L_0x0211:
            monitor-exit(r10)     // Catch:{ all -> 0x02d8 }
            goto L_0x02d1
        L_0x0214:
            X.19J r11 = r4.A05     // Catch:{ all -> 0x02d8 }
            int r9 = r11.A04     // Catch:{ all -> 0x02d8 }
            r3 = 2
            if (r9 != r3) goto L_0x02c3
            boolean r3 = r11.A02()     // Catch:{ all -> 0x02d8 }
            if (r3 != 0) goto L_0x02c3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0249
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02d8 }
            r3.postDelayed(r0, r5)     // Catch:{ all -> 0x02d8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r4.<init>()     // Catch:{ all -> 0x02d8 }
            java.lang.String r3 = "ContactSyncRequestExecutor/delay/combine "
            r4.append(r3)     // Catch:{ all -> 0x02d8 }
            r4.append(r5)     // Catch:{ all -> 0x02d8 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x02d8 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02d8 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d8 }
            long r3 = r3 + r5
            r1.A02(r2, r0, r3)     // Catch:{ all -> 0x02d8 }
            goto L_0x0211
        L_0x0249:
            boolean r3 = r2.A01     // Catch:{ all -> 0x02d8 }
            if (r3 == 0) goto L_0x0250
            r5 = 0
            goto L_0x025a
        L_0x0250:
            int r3 = r2.A00     // Catch:{ all -> 0x02d8 }
            if (r3 != 0) goto L_0x0265
            X.1On r3 = r4.A0G     // Catch:{ all -> 0x02d8 }
            long r5 = r3.A00()     // Catch:{ all -> 0x02d8 }
        L_0x025a:
            android.os.Handler r3 = A00(r4)     // Catch:{ all -> 0x02d8 }
            r3.postDelayed(r0, r5)     // Catch:{ all -> 0x02d8 }
            X.1On r8 = r4.A0G     // Catch:{ all -> 0x02d8 }
            monitor-enter(r8)     // Catch:{ all -> 0x02d8 }
            goto L_0x028a
        L_0x0265:
            r11 = 1000(0x3e8, double:4.94E-321)
            r7 = 1
            int r5 = r3 * 2
            r3 = 8
            int r3 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x02d8 }
            long r7 = r7 << r3
            long r7 = r7 * r11
            java.util.Random r3 = r4.A0U     // Catch:{ all -> 0x02d8 }
            long r5 = r3.nextLong()     // Catch:{ all -> 0x02d8 }
            long r5 = r5 % r7
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x02d8 }
            long r7 = r7 + r5
            X.1On r3 = r4.A0G     // Catch:{ all -> 0x02d8 }
            long r5 = r3.A00()     // Catch:{ all -> 0x02d8 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x02d8 }
            goto L_0x025a
        L_0x028a:
            java.util.LinkedList r7 = r8.A00     // Catch:{ all -> 0x02d2 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x02d2 }
            r7.addFirst(r3)     // Catch:{ all -> 0x02d2 }
            java.util.LinkedList r7 = r8.A00     // Catch:{ all -> 0x02d2 }
            int r4 = r7.size()     // Catch:{ all -> 0x02d2 }
            r3 = 10
            if (r4 != r3) goto L_0x02a4
            r7.removeLast()     // Catch:{ all -> 0x02d2 }
        L_0x02a4:
            monitor-exit(r8)     // Catch:{ all -> 0x02d8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d8 }
            r4.<init>()     // Catch:{ all -> 0x02d8 }
            java.lang.String r3 = "ContactSyncRequestExecutor/delay "
            r4.append(r3)     // Catch:{ all -> 0x02d8 }
            r4.append(r5)     // Catch:{ all -> 0x02d8 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x02d8 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02d8 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d8 }
            long r3 = r3 + r5
            r1.A02(r2, r0, r3)     // Catch:{ all -> 0x02d8 }
            goto L_0x0211
        L_0x02c3:
            java.lang.String r3 = "ContactSyncRequestExecutor/freeze until connection returns"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x02d8 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02d8 }
            r1.A02(r2, r0, r3)     // Catch:{ all -> 0x02d8 }
            goto L_0x0211
        L_0x02d1:
            return
        L_0x02d2:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02d8 }
            goto L_0x02d7
        L_0x02d5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02d8 }
        L_0x02d7:
            throw r0     // Catch:{ all -> 0x02d8 }
        L_0x02d8:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27381Nz.A02(X.1Nz, X.6Pq):void");
    }

    public static void A03(C27381Nz r2, Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactSyncRequestExecutor/queueRequests count=");
        sb.append(collection.size());
        Log.i(sb.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A02(r2, (C131586Pq) it.next());
        }
    }

    public void BYo() {
        this.A0R.execute(new C35691j6(this, 0));
    }

    public C27381Nz(C19460v5 r5, C19700wN r6, AnonymousClass17Y r7, C19730wQ r8, AnonymousClass19J r9, C27501Ol r10, AnonymousClass1KK r11, AnonymousClass1KL r12, C19600wD r13, AnonymousClass16D r14, AnonymousClass16K r15, AnonymousClass1O1 r16, AnonymousClass1O6 r17, C27491Ok r18, AnonymousClass1O0 r19, AnonymousClass1O4 r20, AnonymousClass1A6 r21, C21060yb r22, C19970wo r23, C19630wG r24, C20830yE r25, C20060wx r26, C20810yC r27, AnonymousClass1EV r28, AnonymousClass1O8 r29, AnonymousClass12U r30, C19770wU r31, AnonymousClass005 r32) {
        this.A0L = r24;
        this.A0K = r23;
        this.A0O = r27;
        this.A0E = r19;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A0N = r26;
        this.A0A = r14;
        this.A0J = r22;
        this.A05 = r9;
        this.A0F = r20;
        this.A01 = r5;
        this.A0D = r18;
        this.A0W = r29;
        this.A0M = r25;
        this.A08 = r12;
        this.A0S = r32;
        this.A0I = r21;
        this.A0P = r28;
        this.A07 = r11;
        this.A0Q = r30;
        this.A09 = r13;
        AnonymousClass1O6 r3 = r17;
        this.A0C = r3;
        this.A0B = r16;
        this.A06 = r10;
        this.A0T = new C35671j4(r15, 48);
        this.A0R = new C19930wk(r31, false);
        this.A0H = new C27511Om(r3);
        this.A0G = new C27521On();
    }
}
