package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1HJ  reason: invalid class name */
public class AnonymousClass1HJ {
    public AnonymousClass1HS A00;
    public final C19730wQ A01;
    public final AnonymousClass1HR A02;
    public final AnonymousClass1HQ A03;
    public final C19970wo A04;
    public final C20060wx A05;
    public final AnonymousClass1C7 A06;
    public final AnonymousClass1HK A07;
    public final C220412q A08;
    public final C20310xM A09;
    public final AnonymousClass1DQ A0A;
    public final AnonymousClass176 A0B;
    public final AnonymousClass16J A0C;
    public final AnonymousClass12P A0D;
    public final C227915v A0E;
    public final C20810yC A0F;
    public final C21010yW A0G;
    public final AnonymousClass13J A0H;
    public final AnonymousClass1HP A0I;
    public final Map A0J = new HashMap();
    public final ReentrantReadWriteLock A0K;

    public AnonymousClass1HJ(C19730wQ r3, AnonymousClass1HR r4, AnonymousClass1HQ r5, C19970wo r6, C20060wx r7, AnonymousClass1C7 r8, AnonymousClass1HK r9, C220412q r10, C20310xM r11, AnonymousClass1DQ r12, AnonymousClass176 r13, AnonymousClass16J r14, AnonymousClass12P r15, C227915v r16, C20810yC r17, C21010yW r18, AnonymousClass13J r19, AnonymousClass1HP r20) {
        AnonymousClass1HS r1 = new AnonymousClass1HS();
        this.A04 = r6;
        this.A00 = r1;
        this.A0F = r17;
        this.A01 = r3;
        this.A08 = r10;
        this.A0G = r18;
        this.A07 = r9;
        this.A05 = r7;
        this.A0A = r12;
        this.A0I = r20;
        this.A09 = r11;
        this.A0C = r14;
        this.A06 = r8;
        this.A0B = r13;
        this.A0D = r15;
        this.A0E = r16;
        this.A03 = r5;
        this.A02 = r4;
        this.A0H = r19;
        this.A0K = new ReentrantReadWriteLock();
    }

    public static C107265Nh A00(AnonymousClass1HJ r3, C135006by r4) {
        C107265Nh r0;
        AnonymousClass1HS r2 = r3.A00;
        C002000v r1 = r2.A00;
        synchronized (r1) {
            r0 = (C107265Nh) r1.A04(r4);
        }
        if (r0 == null && (r0 = r3.A07.A05(r4)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    public static void A01(AnonymousClass1HJ r2, C135006by r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/checkIfCallLogAlreadyExists; callLog.key=");
        sb.append(r3);
        Log.i(sb.toString());
        if (A00(r2, r3) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CallsMessageStore/checkIfCallLogAlreadyExists call log already exists for this key=");
            sb2.append(r3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static void A02(AnonymousClass1HJ r9, C107265Nh r10) {
        boolean z;
        boolean A052;
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = r9.A0K;
        reentrantReadWriteLock.writeLock().lock();
        try {
            AnonymousClass1HK r3 = r9.A07;
            synchronized (r3) {
                if (r10.A06 || r10.A05) {
                    Log.w("CallLogStore/insertCallLog - only regular call log is stored here");
                } else {
                    synchronized (r10) {
                        A052 = r10.A05();
                        i = r10.A01;
                    }
                    if (!A052) {
                        Log.w("CallLogStore/insertCallLog - no need to commit");
                    } else {
                        AnonymousClass1M0 A053 = r3.A04.A05();
                        try {
                            C1495671s B1k = A053.B1k();
                            try {
                                r10.A04(A053.A02.A05("call_log", "insertCallLog/INSERT_CALL_LOG", AnonymousClass1HK.A00(r3, r10.A04, r10)));
                                synchronized (r10) {
                                    int i2 = r10.A01;
                                    if (i == i2) {
                                        r10.A02 = false;
                                        r10.A01 = i2 + 1;
                                    }
                                }
                                AnonymousClass1HK.A02(r3, r10);
                                B1k.A00();
                                B1k.close();
                                A053.close();
                                z = true;
                            } catch (Throwable th) {
                                B1k.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                A053.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                }
                z = false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CallsMessageStore/insertCallLog; callLog.key=");
            sb.append(r10.A04);
            sb.append("; callLog.getRowId()=");
            sb.append(r10.A02());
            Log.i(sb.toString());
            if (z) {
                r9.A00.A00(r10);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r10.A07 == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        r2 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass1HJ r9, X.C107265Nh r10) {
        /*
            com.whatsapp.jid.GroupJid r0 = r10.A0D
            if (r0 != 0) goto L_0x007f
            X.6by r0 = r10.A04
            com.whatsapp.jid.UserJid r4 = r0.A01
        L_0x0008:
            if (r4 == 0) goto L_0x0076
            X.6by r0 = r10.A04
            boolean r1 = r0.A03
            java.lang.String r5 = r0.A02
            java.lang.String r0 = X.C34681hT.A08(r5)
            X.3Qa r8 = new X.3Qa
            r8.<init>(r4, r0, r1)
            X.176 r7 = r9.A0B
            X.177 r0 = r7.A01
            X.3T1 r3 = r0.A00(r8)
            boolean r0 = r3 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0077
            X.5Iz r3 = (X.C106265Iz) r3
            if (r3 == 0) goto L_0x0077
            X.3Kh r0 = r3.A01
            r0.A01(r10)
            X.1HQ r6 = r9.A03
            r3.A00 = r6
            X.0yC r2 = r9.A0F
            r1 = 7515(0x1d5b, float:1.0531E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0041
            r7.A0C(r8)
        L_0x0041:
            X.0yC r2 = r9.A0F
            r1 = 7515(0x1d5b, float:1.0531E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0050
            r7.A0B(r3)
        L_0x0050:
            boolean r0 = r10.A0M()
            if (r0 == 0) goto L_0x0088
            X.5Ng r0 = r10.A0F
            if (r0 == 0) goto L_0x0082
            com.whatsapp.jid.GroupJid r0 = r10.A0D
            if (r0 != 0) goto L_0x0071
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r4)
            if (r0 == 0) goto L_0x0082
            int r1 = r10.A08(r0)
            r0 = 5
            if (r1 != r0) goto L_0x0082
            int r0 = r10.A07
            if (r0 != 0) goto L_0x0082
        L_0x0071:
            java.util.Map r0 = r9.A0J
            r0.put(r4, r3)
        L_0x0076:
            return
        L_0x0077:
            X.1HQ r6 = r9.A03
            X.5Iz r3 = new X.5Iz
            r3.<init>((X.AnonymousClass1HQ) r6, (X.C64933Qa) r8, (X.C107265Nh) r10)
            goto L_0x0041
        L_0x007f:
            com.whatsapp.jid.GroupJid r4 = r10.A0D
            goto L_0x0008
        L_0x0082:
            java.util.Map r0 = r9.A0J
            r0.remove(r4)
            return
        L_0x0088:
            int r0 = r10.A07
            if (r0 != 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00c5
            java.util.HashMap r2 = r6.A00
            java.lang.String r0 = X.C34681hT.A08(r5)
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L_0x00ac
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00ac
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x00ac
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x00ac
        L_0x00a6:
            java.util.Map r0 = r9.A0J
            r0.put(r4, r3)
            return
        L_0x00ac:
            java.lang.String r0 = X.C34681hT.A08(r5)
            java.lang.Object r0 = r2.get(r0)
            com.whatsapp.voipcalling.CallState r0 = (com.whatsapp.voipcalling.CallState) r0
            if (r0 == 0) goto L_0x00c5
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00a6
            r0 = 2
            if (r1 == r0) goto L_0x00a6
            r0 = 3
            if (r1 == r0) goto L_0x00a6
        L_0x00c5:
            java.util.Map r0 = r9.A0J
            r0.remove(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HJ.A03(X.1HJ, X.5Nh):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:135:0x0181=Splitter:B:135:0x0181, B:119:0x0159=Splitter:B:119:0x0159} */
    public static void A04(X.AnonymousClass1HJ r19, X.C107265Nh r20) {
        /*
            r4 = r20
            long r1 = r4.A02()
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x01d8
            r5 = r19
            X.1HK r3 = r5.A07
            monitor-enter(r3)
            boolean r0 = r4.A06     // Catch:{ all -> 0x01d5 }
            r6 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = r4.A05     // Catch:{ all -> 0x01d5 }
            r1 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x01d5 }
            long r7 = r4.A02()     // Catch:{ all -> 0x01d5 }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x002c
            r1 = 1
        L_0x002c:
            java.lang.String r0 = "CallLog row_id is not set"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x01d5 }
            monitor-enter(r4)     // Catch:{ all -> 0x01d5 }
            boolean r0 = r4.A05()     // Catch:{ all -> 0x01d2 }
            int r8 = r4.A01     // Catch:{ all -> 0x01d2 }
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            if (r0 == 0) goto L_0x01ae
            X.12P r0 = r3.A04     // Catch:{ all -> 0x01d5 }
            X.1M0 r7 = r0.A05()     // Catch:{ all -> 0x01d5 }
            X.71s r14 = r7.B1k()     // Catch:{ all -> 0x01a4 }
            X.6by r0 = r4.A04     // Catch:{ all -> 0x019a }
            android.content.ContentValues r16 = X.AnonymousClass1HK.A00(r3, r0, r4)     // Catch:{ all -> 0x019a }
            X.14e r15 = r7.A02     // Catch:{ all -> 0x019a }
            java.lang.String r17 = "call_log"
            java.lang.String r18 = "_id = ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x019a }
            long r0 = r4.A02()     // Catch:{ all -> 0x019a }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x019a }
            r9[r2] = r0     // Catch:{ all -> 0x019a }
            java.lang.String r19 = "updateCallLog/UPDATE_CALL_LOG"
            r20 = r9
            r15.A01(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x019a }
            monitor-enter(r4)     // Catch:{ all -> 0x019a }
            int r0 = r4.A01     // Catch:{ all -> 0x0197 }
            if (r8 != r0) goto L_0x006f
            r4.A02 = r2     // Catch:{ all -> 0x0197 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x0197 }
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x019a }
            X.AnonymousClass1HK.A02(r3, r4)     // Catch:{ all -> 0x019a }
            X.5Ng r0 = r4.A0F     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0109
            boolean r0 = r4.A0I     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x018d
            X.5Ng r8 = r4.A0F     // Catch:{ all -> 0x019a }
            long r0 = r4.A02()     // Catch:{ all -> 0x019a }
            r8.A04(r0)     // Catch:{ all -> 0x019a }
            X.5Ng r1 = r4.A0F     // Catch:{ all -> 0x019a }
            monitor-enter(r1)     // Catch:{ all -> 0x019a }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x0105 }
            monitor-exit(r1)     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0171
            X.1HO r10 = r3.A03     // Catch:{ all -> 0x019a }
            X.5Ng r1 = r4.A0F     // Catch:{ all -> 0x019a }
            monitor-enter(r1)     // Catch:{ all -> 0x019a }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x0105 }
            int r9 = r1.A01     // Catch:{ all -> 0x0105 }
            monitor-exit(r1)     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "No update needed"
            X.C18740tg.A0D(r2, r0)     // Catch:{ all -> 0x019a }
            goto L_0x0178
        L_0x00a3:
            X.12P r0 = r10.A01     // Catch:{ all -> 0x019a }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x019a }
            X.71s r13 = r8.B1k()     // Catch:{ all -> 0x0182 }
            android.content.ContentValues r16 = X.AnonymousClass1HO.A00(r10, r1)     // Catch:{ all -> 0x00fb }
            X.14e r15 = r8.A02     // Catch:{ all -> 0x00fb }
            java.lang.String r17 = "joinable_call_log"
            java.lang.String r18 = "call_log_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x00fb }
            long r11 = r1.A02()     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x00fb }
            r0[r2] = r11     // Catch:{ all -> 0x00fb }
            java.lang.String r19 = "joinable_call_log_store/update"
            r20 = r0
            r15.A01(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00fb }
            X.1HN r0 = r10.A00     // Catch:{ all -> 0x00fb }
            r0.A00(r1)     // Catch:{ all -> 0x00fb }
            monitor-enter(r1)     // Catch:{ all -> 0x00fb }
            int r0 = r1.A01     // Catch:{ all -> 0x00f8 }
            if (r9 != r0) goto L_0x00da
            r1.A02 = r2     // Catch:{ all -> 0x00f8 }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x00f8 }
        L_0x00da:
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            r13.A00()     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r9.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "JoinableCallLogStore/updateCallLogInternal/updaetd; joinableCallLog.callId="
            r9.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x00fb }
            r9.append(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00fb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fb }
            r13.close()     // Catch:{ all -> 0x0182 }
            goto L_0x016d
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0182 }
        L_0x0104:
            throw r1     // Catch:{ all -> 0x0182 }
        L_0x0105:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x019a }
            goto L_0x0199
        L_0x0109:
            boolean r0 = r4.A0I     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x018d
            X.1HO r13 = r3.A03     // Catch:{ all -> 0x019a }
            X.6by r0 = r4.A09()     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r0.A02     // Catch:{ all -> 0x019a }
            X.12P r0 = r13.A01     // Catch:{ all -> 0x019a }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x019a }
            X.14e r12 = r8.A02     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "joinable_call_log"
            java.lang.String r9 = "call_id = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0182 }
            r1[r2] = r11     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "joinable_call_log_store/DELETE_CALL_LOG"
            r12.A03(r10, r9, r0, r1)     // Catch:{ all -> 0x0182 }
            X.1HN r12 = r13.A00     // Catch:{ all -> 0x0182 }
            java.util.HashMap r1 = r12.A00     // Catch:{ all -> 0x0182 }
            monitor-enter(r1)     // Catch:{ all -> 0x0182 }
            java.lang.Object r10 = r1.remove(r11)     // Catch:{ all -> 0x017f }
            X.5Ng r10 = (X.AnonymousClass5Ng) r10     // Catch:{ all -> 0x017f }
            monitor-enter(r1)     // Catch:{ all -> 0x017f }
            r9 = 0
            r1.put(r11, r9)     // Catch:{ all -> 0x017c }
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            monitor-exit(r1)     // Catch:{ all -> 0x017f }
            if (r10 == 0) goto L_0x0159
            com.whatsapp.jid.GroupJid r0 = r10.A02     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x0159
            java.util.HashMap r1 = r12.A01     // Catch:{ all -> 0x0182 }
            monitor-enter(r1)     // Catch:{ all -> 0x0182 }
            com.whatsapp.jid.GroupJid r0 = r10.A02     // Catch:{ all -> 0x0156 }
            r1.remove(r0)     // Catch:{ all -> 0x0156 }
            com.whatsapp.jid.GroupJid r0 = r10.A02     // Catch:{ all -> 0x0156 }
            monitor-enter(r1)     // Catch:{ all -> 0x0156 }
            r1.put(r0, r9)     // Catch:{ all -> 0x0153 }
            monitor-exit(r1)     // Catch:{ all -> 0x0153 }
            monitor-exit(r1)     // Catch:{ all -> 0x0156 }
            goto L_0x0159
        L_0x0153:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0156 }
            goto L_0x0181
        L_0x0159:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0182 }
            r1.<init>()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "JoinableCallLogStore/deleteCallLog/callId="
            r1.append(r0)     // Catch:{ all -> 0x0182 }
            r1.append(r11)     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0182 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0182 }
        L_0x016d:
            r8.close()     // Catch:{ all -> 0x019a }
            goto L_0x0178
        L_0x0171:
            X.1HO r1 = r3.A03     // Catch:{ all -> 0x019a }
            X.5Ng r0 = r4.A0F     // Catch:{ all -> 0x019a }
            r1.A06(r0)     // Catch:{ all -> 0x019a }
        L_0x0178:
            monitor-enter(r4)     // Catch:{ all -> 0x019a }
            r4.A0I = r2     // Catch:{ all -> 0x0197 }
            goto L_0x018c
        L_0x017c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017f }
        L_0x0181:
            throw r0     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0187 }
            goto L_0x018b
        L_0x0187:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x019a }
        L_0x018b:
            throw r1     // Catch:{ all -> 0x019a }
        L_0x018c:
            monitor-exit(r4)     // Catch:{ all -> 0x019a }
        L_0x018d:
            r14.A00()     // Catch:{ all -> 0x019a }
            r14.close()     // Catch:{ all -> 0x01a4 }
            r7.close()     // Catch:{ all -> 0x01d5 }
            goto L_0x01ae
        L_0x0197:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019a }
        L_0x0199:
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x019f }
            goto L_0x01a3
        L_0x019f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01a4 }
        L_0x01a3:
            throw r1     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01a9 }
            goto L_0x01ad
        L_0x01a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01d5 }
        L_0x01ad:
            throw r1     // Catch:{ all -> 0x01d5 }
        L_0x01ae:
            monitor-exit(r3)
            X.1HS r0 = r5.A00
            r0.A00(r4)
            X.1DQ r0 = r5.A0A
            android.os.Handler r2 = r0.A02
            r1 = 34
            X.1j5 r0 = new X.1j5
            r0.<init>(r5, r4, r1)
            r2.post(r0)
            X.0yC r2 = r5.A0F
            r1 = 6120(0x17e8, float:8.576E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            if (r0 < r6) goto L_0x01d8
            A03(r5, r4)
            return
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            throw r0     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HJ.A04(X.1HJ, X.5Nh):void");
    }

    public C107265Nh A05(long j) {
        C107265Nh r0;
        C002000v r1 = this.A00.A01;
        synchronized (r1) {
            r0 = (C107265Nh) r1.A04(Long.valueOf(j));
        }
        return r0;
    }

    public C107265Nh A06(long j) {
        C107265Nh r0;
        AnonymousClass1HS r2 = this.A00;
        C002000v r1 = r2.A01;
        synchronized (r1) {
            r0 = (C107265Nh) r1.A04(Long.valueOf(j));
        }
        if (r0 == null && (r0 = this.A07.A04(j)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r7.A05 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C107265Nh A07(X.C135006by r21, X.C107265Nh r22) {
        /*
            r20 = this;
            r4 = r20
            r3 = r21
            X.5Nh r0 = A00(r4, r3)
            if (r0 != 0) goto L_0x015f
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r4.A0K
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()
            r0.lock()
            X.1HK r6 = r4.A07     // Catch:{ all -> 0x0156 }
            monitor-enter(r6)     // Catch:{ all -> 0x0156 }
            r7 = r22
            boolean r0 = r7.A06     // Catch:{ all -> 0x0150 }
            r8 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0023
            boolean r0 = r7.A05     // Catch:{ all -> 0x0150 }
            r1 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x0150 }
            long r11 = r7.A02()     // Catch:{ all -> 0x0150 }
            r9 = -1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            java.lang.String r0 = "CallLog row_id is not set"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x0150 }
            X.12P r0 = r6.A04     // Catch:{ all -> 0x0150 }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x0150 }
            X.71s r10 = r5.B1k()     // Catch:{ all -> 0x0146 }
            android.content.ContentValues r15 = X.AnonymousClass1HK.A00(r6, r3, r7)     // Catch:{ all -> 0x013c }
            X.14e r14 = r5.A02     // Catch:{ all -> 0x013c }
            java.lang.String r16 = "call_log"
            java.lang.String r17 = "_id = ?"
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x013c }
            long r0 = r7.A02()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x013c }
            r8[r13] = r0     // Catch:{ all -> 0x013c }
            java.lang.String r18 = "updateCallLog/UPDATE_CALL_LOG"
            r19 = r8
            r14.A01(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x013c }
            r10.A00()     // Catch:{ all -> 0x013c }
            X.6by r8 = r7.A04     // Catch:{ all -> 0x013c }
            java.lang.String r9 = "; new key="
            r10.close()     // Catch:{ all -> 0x0146 }
            r5.close()     // Catch:{ all -> 0x0150 }
            X.5Nh r5 = r6.A05(r3)     // Catch:{ all -> 0x0150 }
            monitor-exit(r6)     // Catch:{ all -> 0x0156 }
            if (r5 == 0) goto L_0x0125
            X.1HS r0 = r4.A00     // Catch:{ all -> 0x0156 }
            r0.A01(r7)     // Catch:{ all -> 0x0156 }
            r0.A00(r5)     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r6.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread; callLog.key="
            r6.append(r0)     // Catch:{ all -> 0x0156 }
            r6.append(r8)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "; callLog.row_id="
            r6.append(r0)     // Catch:{ all -> 0x0156 }
            long r0 = r7.A02()     // Catch:{ all -> 0x0156 }
            r6.append(r0)     // Catch:{ all -> 0x0156 }
            r6.append(r9)     // Catch:{ all -> 0x0156 }
            r6.append(r3)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0156 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0156 }
            boolean r0 = r7.A0M()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x010f
            X.0yC r0 = r4.A0F     // Catch:{ all -> 0x0156 }
            boolean r0 = X.C34681hT.A0K(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x010f
            X.176 r7 = r4.A0B     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = X.C34681hT.A08(r0)     // Catch:{ all -> 0x0156 }
            X.177 r10 = r7.A01     // Catch:{ all -> 0x0156 }
            monitor-enter(r10)     // Catch:{ all -> 0x0156 }
            X.00v r9 = r10.A01     // Catch:{ all -> 0x0153 }
            java.util.LinkedHashMap r0 = r9.A06()     // Catch:{ all -> 0x0153 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0153 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0153 }
            r0.<init>(r1)     // Catch:{ all -> 0x0153 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0153 }
            r8.<init>()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x00d4:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0153 }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ all -> 0x0153 }
            X.3Qa r1 = r3.A1J     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0153 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x00d4
            r8.add(r3)     // Catch:{ all -> 0x0153 }
            r9.A05(r1)     // Catch:{ all -> 0x0153 }
            goto L_0x00d4
        L_0x00f1:
            monitor-exit(r10)     // Catch:{ all -> 0x0156 }
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x0156 }
        L_0x00f6:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x010f
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0156 }
            X.3T1 r1 = (X.AnonymousClass3T1) r1     // Catch:{ all -> 0x0156 }
            java.util.Map r0 = r7.A02     // Catch:{ all -> 0x0156 }
            X.3Qa r1 = r1.A1J     // Catch:{ all -> 0x0156 }
            r0.remove(r1)     // Catch:{ all -> 0x0156 }
            X.12q r0 = r7.A00     // Catch:{ all -> 0x0156 }
            r0.A0L(r1)     // Catch:{ all -> 0x0156 }
            goto L_0x00f6
        L_0x010f:
            X.1C7 r3 = r4.A06     // Catch:{ all -> 0x0156 }
            r0 = 36
            X.1j5 r1 = new X.1j5     // Catch:{ all -> 0x0156 }
            r1.<init>(r4, r5, r0)     // Catch:{ all -> 0x0156 }
            r0 = 16
            r3.A01(r1, r0)     // Catch:{ all -> 0x0156 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()
            r0.unlock()
            return r5
        L_0x0125:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r1.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread error on creating new call log for this key="
            r1.append(r0)     // Catch:{ all -> 0x0156 }
            r1.append(r3)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0156 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0156 }
            r0.<init>(r1)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x013c:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0146 }
        L_0x0145:
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0150 }
        L_0x014f:
            throw r1     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0156 }
            goto L_0x0155
        L_0x0153:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0156 }
        L_0x0155:
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()
            r0.unlock()
            throw r1
        L_0x015f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread already exists for this key="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HJ.A07(X.6by, X.5Nh):X.5Nh");
    }

    public ArrayList A08(AnonymousClass4QI r18, int i, int i2) {
        String str;
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0K;
        reentrantReadWriteLock.readLock().lock();
        try {
            AnonymousClass1HK r11 = this.A07;
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {Integer.toString(i), Integer.toString(i2)};
            long uptimeMillis = SystemClock.uptimeMillis();
            AnonymousClass1M0 A042 = r11.A04.get();
            try {
                C224114e r9 = A042.A02;
                boolean A012 = C20800yB.A01(C21000yV.A02, r11.A05, 6136);
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id");
                if (A012) {
                    str = " ORDER BY timestamp DESC LIMIT ?,?";
                } else {
                    str = " ORDER BY call_log._id DESC LIMIT ?,?";
                }
                sb.append(str);
                Cursor A093 = r9.A09(sb.toString(), "GET_CALL_LOG_SQL", strArr);
                try {
                    int columnIndexOrThrow = A093.getColumnIndexOrThrow("_id");
                    while (A093.moveToNext() && (r18 == null || !r18.BtY())) {
                        A092 = r9.A09("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALLS", new String[]{Long.toString(A093.getLong(columnIndexOrThrow))});
                        C107265Nh A013 = AnonymousClass1HK.A01(A093, A092, r11);
                        if (A013 != null) {
                            arrayList2.add(A013);
                        }
                        if (A092 != null) {
                            A092.close();
                        }
                    }
                    A093.close();
                    A042.close();
                    r11.A01.A01("CallLogStore/getCalls", SystemClock.uptimeMillis() - uptimeMillis);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CallLogStore/getCalls/size=");
                    sb2.append(arrayList2.size());
                    Log.i(sb2.toString());
                    arrayList.addAll(arrayList2);
                    reentrantReadWriteLock.readLock().unlock();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CallsMessageStore/calls/size:");
                    sb3.append(arrayList.size());
                    Log.i(sb3.toString());
                    return arrayList;
                } catch (Throwable th) {
                    if (A093 != null) {
                        A093.close();
                    }
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A042.close();
                throw th2;
            }
        } catch (SQLiteException e) {
            try {
                Log.e("CallsMessageStore/getCalls/db/unavailable", e);
                return arrayList;
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public void A09(C107265Nh r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/updateCallLog; callLog.key=");
        sb.append(r4.A04);
        sb.append("; callLog.row_id=");
        sb.append(r4.A02());
        Log.i(sb.toString());
        this.A06.A01(new C35681j5(this, r4, 33), 16);
    }

    public void A0B(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/deleteCallLogs ");
        sb.append(collection.size());
        Log.i(sb.toString());
        this.A06.A01(new C35681j5(this, collection, 28), 17);
    }

    public void A0A(C107265Nh r4) {
        C18740tg.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("CallsMessageStore/updateCallLogOnCurrentThread; callLog.key=");
        sb.append(r4.A04);
        sb.append("; callLog.row_id=");
        sb.append(r4.A02());
        Log.i(sb.toString());
        A04(this, r4);
    }
}
