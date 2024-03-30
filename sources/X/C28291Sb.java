package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Sb  reason: invalid class name and case insensitive filesystem */
public class C28291Sb {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass1C7 A02;
    public final C220412q A03;
    public final AnonymousClass12P A04;
    public final AnonymousClass1TN A05;
    public final AnonymousClass1QO A06;
    public final AnonymousClass1CM A07;
    public final AnonymousClass1C5 A08;
    public final AnonymousClass1DL A09;
    public final AnonymousClass1C4 A0A;
    public final C28301Sc A0B;
    public final Map A0C;
    public final AnonymousClass1DT A0D;
    public final C25791Hr A0E;
    public final C19970wo A0F;
    public final C220712t A0G;
    public final C20310xM A0H;
    public final AnonymousClass1DQ A0I;
    public final AnonymousClass1FN A0J;
    public final AnonymousClass1QI A0K;
    public final C20810yC A0L;
    public final C28361Si A0M;
    public final AnonymousClass1A1 A0N;
    public final C19770wU A0O;
    public final AnonymousClass005 A0P;

    public void A01(C06120Sj r9, C64933Qa r10, int i) {
        this.A02.A01(new C35341iX(this, r10, r9, i, 6), 36);
    }

    public static boolean A00(C64933Qa r0, int i) {
        if (r0.A02) {
            return false;
        }
        if (i == 13 || i == 16 || i == 17) {
            return true;
        }
        return false;
    }

    public void A02(List list) {
        StringBuilder sb;
        this.A02.A00();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64933Qa r1 = (C64933Qa) it.next();
            AnonymousClass11F r2 = r1.A00;
            C18740tg.A06(r2);
            AnonymousClass3T1 A032 = this.A0N.A03(r1);
            if (A032 != null) {
                if (r2 instanceof C177528dw) {
                    C28301Sc r4 = this.A0B;
                    AnonymousClass1HT r22 = r4.A02;
                    AnonymousClass11F A0J2 = A032.A0J();
                    C18740tg.A06(A0J2);
                    AnonymousClass00C.A0E(A0J2, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    r4.A01.A01(new C35661j3(A032, r4, r22.A03((UserJid) A0J2), 16), 51);
                } else {
                    HashMap hashMap2 = hashMap;
                    List list2 = (List) hashMap2.get(r2);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        hashMap2.put(r2, list2);
                    }
                    list2.add(A032);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            AnonymousClass11F r10 = (AnonymousClass11F) entry.getKey();
            List<AnonymousClass3T1> list3 = (List) entry.getValue();
            Collections.sort(list3, C81603xH.A00);
            AnonymousClass3T1 r9 = (AnonymousClass3T1) list3.get(list3.size() - 1);
            C220712t r12 = this.A0G;
            long j = r9.A1N;
            long j2 = r9.A1O;
            AnonymousClass005 r20 = r12.A01;
            ((C24731Do) r20.get()).A09.A00();
            C65073Qp A092 = r12.A00.A09(r10, false);
            if (A092 == null) {
                sb.append("msgstore/setchatseenonasynccommitthread/nochat/");
                sb.append(r10);
            } else {
                sb = new StringBuilder();
                sb.append("msgstore/setchatseenonasynccommitthread/");
                sb.append(r10);
                sb.append("/");
                sb.append(A092.A09());
                Log.i(sb.toString());
                if (A092.A0Q >= j2) {
                    sb = new StringBuilder();
                    sb.append("msgstore/setchatseenonasynccommitthread/");
                    sb.append(r10);
                    sb.append("/message already read");
                } else {
                    if (C20800yB.A01(C21000yV.A02, ((C24731Do) r20.get()).A0P, 7004)) {
                        ArrayList arrayList = new ArrayList();
                        for (AnonymousClass3T1 r15 : list3) {
                            if (r15.A1O >= A092.A0Q) {
                                arrayList.add(r15);
                            }
                        }
                        ((C24731Do) r20.get()).A0W.Boy(new C35631j0(r12, r10, arrayList, 5));
                    }
                    int A012 = ((C24731Do) r20.get()).A0K.A01(r10, j2);
                    int A022 = ((C24731Do) r20.get()).A0K.A02(r10, j2);
                    int A002 = ((C24731Do) r20.get()).A0F.A00(r10, j2);
                    int i = A012 - A022;
                    if (i < A092.A08) {
                        A092.A0H(i, A022, A012, A002);
                        A092.A0P = j;
                        A092.A0Q = j2;
                        if (((C24731Do) r20.get()).A0S.A04(r10)) {
                            A092.A0R = j;
                            A092.A0S = j2;
                        }
                        ((C24731Do) r20.get()).A0C.A0G(A092);
                        ((C24731Do) r20.get()).A0B.A01(r10, (Collection) null, 0);
                    }
                    C28361Si r0 = this.A0M;
                    r0.A0D(r10, r9);
                    r0.A0B(r10);
                }
            }
            Log.i(sb.toString());
            C28361Si r02 = this.A0M;
            r02.A0D(r10, r9);
            r02.A0B(r10);
        }
        if (!hashMap.isEmpty()) {
            this.A0M.A09();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r9 == 8) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C06120Sj r7, X.C64933Qa r8, int r9) {
        /*
            r6 = this;
            X.1C7 r0 = r6.A02
            r0.A00()
            X.1A1 r4 = r6.A0N
            X.3T1 r5 = r4.A03(r8)
            r2 = 0
            if (r5 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/nosuchmessage: "
            r1.append(r0)
            r1.append(r8)
        L_0x001b:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x0023:
            int r0 = r5.A0D
            boolean r0 = X.AnonymousClass3TJ.A02(r0, r9)
            if (r0 == 0) goto L_0x004b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/statusdowngrade: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " current:"
            r1.append(r0)
            int r0 = r5.A0D
            r1.append(r0)
            java.lang.String r0 = " new:"
            r1.append(r0)
            r1.append(r9)
            goto L_0x001b
        L_0x004b:
            r0 = 9
            if (r9 == r0) goto L_0x0058
            r0 = 10
            if (r9 == r0) goto L_0x0058
            r0 = 8
            r1 = 0
            if (r9 != r0) goto L_0x007b
        L_0x0058:
            r1 = 1
            boolean r0 = X.C66013Ui.A0a(r5)
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/status-played-non-ptt or view-once: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " type="
            r1.append(r0)
            int r0 = r5.A1I
            java.lang.String r0 = X.C66013Ui.A0D(r0)
            r1.append(r0)
            goto L_0x001b
        L_0x007b:
            r5.A0n(r9)
            if (r1 == 0) goto L_0x0085
            X.1QI r0 = r6.A0K
            r0.A03(r5)
        L_0x0085:
            long r2 = r5.A0I
            r0 = 4
            if (r9 != r0) goto L_0x00a3
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStatusStore/update/receipt/server/delay "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00a3:
            r0 = 11
            r1 = -1
            if (r9 == r0) goto L_0x00b9
            r0 = 12
            if (r9 == r0) goto L_0x00b9
            r0 = 16
            if (r9 == r0) goto L_0x00b9
            r0 = 17
            if (r9 == r0) goto L_0x00b9
            X.1DQ r0 = r6.A0I
            r0.A01(r5, r1)
        L_0x00b9:
            r4.A05(r5, r1)
            if (r7 == 0) goto L_0x00dc
            X.09F r1 = r7.A00
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00dc
            X.1C4 r4 = r1.A02
            r3 = 0
            X.1CM r0 = r4.A03
            X.0yC r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00de
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r4.A04(r0, r3)
        L_0x00dc:
            r0 = 1
            return r0
        L_0x00de:
            X.164 r1 = r4.A00
            com.whatsapp.jobqueue.job.SendPlayedReceiptJob r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJob
            r0.<init>(r5)
            r1.A01(r0)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28291Sb.A03(X.0Sj, X.3Qa, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0277, code lost:
        if (r22 != false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0292, code lost:
        if ((r6 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r7.A07.A00, 361) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r0.A07(r6) < r11.A1N) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0183, code lost:
        if (r20 == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d9, code lost:
        if (r10 == 13) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0342 A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x035e A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0361 A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x036b A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03a3 A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x035c A[EDGE_INSN: B:183:0x035c->B:141:0x035c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0225 A[Catch:{ all -> 0x0438, all -> 0x043d, all -> 0x0442 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.DeviceJid r33, X.AnonymousClass3T1 r34, int r35, long r36) {
        /*
            r32 = this;
            r10 = r35
            boolean r0 = X.AnonymousClass3TJ.A01(r10)
            X.C18740tg.A0B(r0)
            r13 = r33
            com.whatsapp.jid.UserJid r9 = r13.userJid
            r11 = r34
            X.3Qa r8 = r11.A1J
            r1 = 0
            r5 = 0
            r3 = r36
            int r0 = (r36 > r5 ? 1 : (r36 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/invalidtimestamp: key="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = ", timestamp="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return r1
        L_0x0037:
            r7 = r32
            X.1C5 r0 = r7.A08
            X.11F r6 = r8.A00
            boolean r0 = r0.A04(r6)
            if (r0 != 0) goto L_0x005e
            r0 = 13
            if (r10 == r0) goto L_0x005d
            r0 = 8
            if (r10 != r0) goto L_0x005e
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x005e
            X.1CM r0 = r7.A07
            X.0yC r5 = r0.A00
            r2 = 361(0x169, float:5.06E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r5, r2)
            if (r0 == 0) goto L_0x005e
        L_0x005d:
            r10 = 5
        L_0x005e:
            boolean r12 = r8.A02
            r5 = 0
            if (r12 != 0) goto L_0x0096
            X.0wQ r0 = r7.A01
            boolean r0 = X.C66013Ui.A0T(r0, r11)
            if (r0 != 0) goto L_0x0096
            r0 = 8
            if (r10 == r0) goto L_0x007a
            r0 = 13
            r4 = 16
            if (r10 == r0) goto L_0x007c
            r4 = 17
            if (r10 == r4) goto L_0x007c
            return r1
        L_0x007a:
            r4 = 10
        L_0x007c:
            boolean r0 = A00(r8, r4)
            if (r0 == 0) goto L_0x0091
            X.12q r0 = r7.A03
            X.C18740tg.A06(r6)
            long r9 = r0.A07(r6)
            long r2 = r11.A1N
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
        L_0x0091:
            boolean r0 = r7.A03(r5, r8, r4)
            return r0
        L_0x0096:
            int r2 = r11.A0D
            r0 = 6
            if (r2 != r0) goto L_0x00b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/invalidmessage: "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r1
        L_0x00b0:
            r0 = 15
            if (r10 == r0) goto L_0x00c1
            r0 = 5
            if (r10 != r0) goto L_0x00c7
            X.0wQ r2 = r7.A01
            com.whatsapp.jid.UserJid r0 = r13.userJid
            boolean r0 = r2.A0M(r0)
            if (r0 == 0) goto L_0x00c7
        L_0x00c1:
            X.1FN r0 = r7.A0J
            r0.A01(r13, r11, r3)
            return r1
        L_0x00c7:
            boolean r23 = X.AnonymousClass143.A0G(r6)
            boolean r0 = r6 instanceof X.C177528dw
            r22 = r0
            boolean r5 = r6 instanceof X.C177618e5
            boolean r0 = r6 instanceof X.C177538dx
            r21 = r0
            X.005 r0 = r7.A0P
            java.lang.Object r1 = r0.get()
            X.1HX r1 = (X.AnonymousClass1HX) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            boolean r0 = r1.A06(r11)
            r20 = 0
            if (r0 == 0) goto L_0x00eb
            r20 = 1
        L_0x00eb:
            java.lang.String r19 = " new:"
            java.lang.String r2 = " current:"
            java.lang.String r1 = "MessageStatusStore/updatetargetstatus/statusdowngrade: "
            if (r22 != 0) goto L_0x017f
            if (r5 == 0) goto L_0x013f
            X.1A1 r0 = r7.A0N
            r15 = r0
            X.C18740tg.A06(r9)
            java.lang.String r0 = r8.A01
            X.3Qa r14 = new X.3Qa
            r14.<init>(r9, r0, r12)
            X.3T1 r14 = r15.A03(r14)
            if (r14 != 0) goto L_0x0126
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/nosuchmessage for broadcast: "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r13)
        L_0x011d:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0124:
            r0 = 0
            return r0
        L_0x0126:
            int r0 = r14.A0D
            boolean r0 = X.AnonymousClass3TJ.A02(r0, r10)
            if (r0 == 0) goto L_0x0176
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            int r12 = r14.A0D
            goto L_0x01b5
        L_0x013f:
            if (r23 != 0) goto L_0x0185
            if (r20 != 0) goto L_0x0185
            int r12 = r11.A0D
            boolean r0 = X.AnonymousClass3TJ.A02(r12, r10)
            if (r0 == 0) goto L_0x01c2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r8)
            r5.append(r2)
            int r0 = r11.A0D
            r5.append(r0)
            r0 = r19
            r5.append(r0)
            r5.append(r10)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1FN r0 = r7.A0J
            X.C18740tg.A06(r13)
            r0.A01(r13, r11, r3)
            goto L_0x0124
        L_0x0176:
            r14.A0n(r10)
            X.1DQ r12 = r7.A0I
            r0 = -1
            r12.A01(r14, r0)
        L_0x017f:
            if (r23 != 0) goto L_0x0185
            if (r22 != 0) goto L_0x0185
            if (r20 == 0) goto L_0x0217
        L_0x0185:
            X.1QO r0 = r7.A06
            X.3CY r0 = r0.A00(r11)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r9)
            X.3Q6 r0 = (X.AnonymousClass3Q6) r0
            if (r0 == 0) goto L_0x0217
            int r12 = r0.A00()
            boolean r0 = X.AnonymousClass3TJ.A02(r12, r10)
            if (r0 == 0) goto L_0x0217
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            java.lang.String r0 = " remoteUser:"
            r3.append(r0)
            r3.append(r9)
            r3.append(r2)
        L_0x01b5:
            r3.append(r12)
            r0 = r19
            r3.append(r0)
            r3.append(r10)
            goto L_0x011d
        L_0x01c2:
            r11.A0n(r10)
            X.1DQ r1 = r7.A0I
            r0 = -1
            r1.A01(r11, r0)
            X.0wQ r0 = r7.A01
            boolean r0 = r0.A0N(r13)
            if (r0 != 0) goto L_0x0217
            r0 = 5
            if (r10 == r0) goto L_0x01db
            r0 = 13
            r1 = 0
            if (r10 != r0) goto L_0x01dc
        L_0x01db:
            r1 = 1
        L_0x01dc:
            r0 = 4
            if (r12 != r0) goto L_0x0217
            if (r1 == 0) goto L_0x0217
            X.0wo r0 = r7.A0F
            long r17 = X.C19970wo.A00(r0)
            long r0 = r11.A0I
            long r17 = r17 - r0
            X.1DT r14 = r7.A0D
            r16 = 1
            X.2PA r12 = new X.2PA
            r12.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r12.A02 = r0
            X.1DW r0 = r14.A0B
            r15 = r0
            X.1AW r0 = r14.A0P
            r1 = r0
            X.1EO r0 = r14.A0Q
            int r0 = X.C55802vD.A00(r15, r11, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r12.A01 = r0
            X.0yW r0 = r14.A0E
            r0.Bly(r12)
        L_0x0217:
            X.12P r0 = r7.A04
            X.1M0 r18 = r0.A05()
            X.71s r17 = r18.B1k()     // Catch:{ all -> 0x0442 }
            boolean r0 = r11.A1P     // Catch:{ all -> 0x0438 }
            if (r0 != 0) goto L_0x0266
            X.1QO r12 = r7.A06     // Catch:{ all -> 0x0438 }
            java.util.Set r0 = r12.A05     // Catch:{ all -> 0x0438 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x0438 }
            if (r0 != 0) goto L_0x0266
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0438 }
            r14.<init>()     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "receiptmanager/addMessageReceipt: key="
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            r14.append(r8)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = ", remoteDevice="
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            r14.append(r13)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = ", status="
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            r14.append(r10)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = ", ts="
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            r14.append(r3)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = ", rowId="
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            long r0 = r11.A1N     // Catch:{ all -> 0x0438 }
            r14.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0438 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0438 }
            goto L_0x0271
        L_0x0266:
            r17.A00()     // Catch:{ all -> 0x0438 }
            r17.close()     // Catch:{ all -> 0x0442 }
            r18.close()
            goto L_0x0124
        L_0x0271:
            if (r6 == 0) goto L_0x02d9
            if (r23 != 0) goto L_0x0279
            r16 = 0
            if (r22 == 0) goto L_0x027b
        L_0x0279:
            r16 = 1
        L_0x027b:
            X.0v5 r1 = r12.A01     // Catch:{ all -> 0x0438 }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x0438 }
            if (r0 == 0) goto L_0x0294
            java.lang.Object r0 = r1.A02()     // Catch:{ all -> 0x0438 }
            X.1HX r0 = (X.AnonymousClass1HX) r0     // Catch:{ all -> 0x0438 }
            boolean r0 = r0.A06(r11)     // Catch:{ all -> 0x0438 }
            if (r0 == 0) goto L_0x0294
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0438 }
            r15 = 1
            if (r0 != 0) goto L_0x0295
        L_0x0294:
            r15 = 0
        L_0x0295:
            X.1FN r0 = r12.A02     // Catch:{ all -> 0x0438 }
            r0.A01(r13, r11, r3)     // Catch:{ all -> 0x0438 }
            com.whatsapp.jid.UserJid r0 = r13.userJid     // Catch:{ all -> 0x0438 }
            r25 = r0
            X.1QP r0 = r12.A03     // Catch:{ all -> 0x0438 }
            r31 = r0
            long r0 = r11.A1N     // Catch:{ all -> 0x0438 }
            r24 = r31
            r26 = r10
            r27 = r0
            r29 = r3
            r24.A01(r25, r26, r27, r29)     // Catch:{ all -> 0x0438 }
            if (r5 == 0) goto L_0x02d3
            X.1A1 r0 = r12.A04     // Catch:{ all -> 0x0438 }
            r24 = r0
            X.C18740tg.A06(r25)     // Catch:{ all -> 0x0438 }
            java.lang.String r14 = r8.A01     // Catch:{ all -> 0x0438 }
            r13 = 1
            X.3Qa r1 = new X.3Qa     // Catch:{ all -> 0x0438 }
            r0 = r25
            r1.<init>(r0, r14, r13)     // Catch:{ all -> 0x0438 }
            r0 = r24
            X.3T1 r0 = r0.A03(r1)     // Catch:{ all -> 0x0438 }
            if (r0 == 0) goto L_0x02d3
            long r0 = r0.A1N     // Catch:{ all -> 0x0438 }
            r24 = r31
            r27 = r0
            r24.A01(r25, r26, r27, r29)     // Catch:{ all -> 0x0438 }
        L_0x02d3:
            if (r16 != 0) goto L_0x02db
            if (r5 != 0) goto L_0x02db
            if (r15 != 0) goto L_0x02db
        L_0x02d9:
            r1 = 0
            goto L_0x02dc
        L_0x02db:
            r1 = 1
        L_0x02dc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0438 }
            r3.<init>()     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/added="
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r1)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "; remoteChatJid="
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r6)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "; status="
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r10)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "; key.id="
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r4 = r8.A01     // Catch:{ all -> 0x0438 }
            r3.append(r4)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0438 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0438 }
            if (r1 == 0) goto L_0x031a
            if (r21 == 0) goto L_0x031a
            X.0xM r3 = r7.A0H     // Catch:{ all -> 0x0438 }
            r1 = 1
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x0438 }
            r0.<init>(r9, r4, r1)     // Catch:{ all -> 0x0438 }
            r3.A0q(r0, r10)     // Catch:{ all -> 0x0438 }
            goto L_0x031b
        L_0x031a:
            r1 = 1
        L_0x031b:
            if (r23 != 0) goto L_0x0323
            if (r22 != 0) goto L_0x0323
            if (r5 != 0) goto L_0x0323
            if (r20 == 0) goto L_0x03ff
        L_0x0323:
            X.C18740tg.A0B(r1)     // Catch:{ all -> 0x0438 }
            X.3CY r0 = r12.A00(r11)     // Catch:{ all -> 0x0438 }
            int r14 = r11.A0B     // Catch:{ all -> 0x0438 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x0438 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0438 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0438 }
            r13 = 0
            r6 = 0
            r5 = 0
        L_0x0339:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0438 }
            r10 = 13
            r4 = 5
            if (r0 == 0) goto L_0x035c
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0438 }
            X.3Q6 r0 = (X.AnonymousClass3Q6) r0     // Catch:{ all -> 0x0438 }
            int r3 = r0.A00()     // Catch:{ all -> 0x0438 }
            if (r3 == r4) goto L_0x0359
            r0 = 8
            if (r3 == r0) goto L_0x0355
            if (r3 == r10) goto L_0x0357
            goto L_0x0339
        L_0x0355:
            int r13 = r13 + 1
        L_0x0357:
            int r6 = r6 + 1
        L_0x0359:
            int r5 = r5 + 1
            goto L_0x0339
        L_0x035c:
            if (r13 < r14) goto L_0x0361
            r10 = 8
            goto L_0x0367
        L_0x0361:
            if (r6 >= r14) goto L_0x0367
            r10 = 4
            if (r5 < r14) goto L_0x0367
            r10 = 5
        L_0x0367:
            int r0 = r11.A0D     // Catch:{ all -> 0x0438 }
            if (r10 == r0) goto L_0x03a3
            int r0 = X.AnonymousClass3TJ.A00(r0, r10)     // Catch:{ all -> 0x0438 }
            if (r0 <= 0) goto L_0x03fc
            X.3CY r0 = r12.A00(r11)     // Catch:{ all -> 0x0438 }
            java.util.concurrent.ConcurrentHashMap r3 = r0.A00     // Catch:{ all -> 0x0438 }
            int r0 = r3.size()     // Catch:{ all -> 0x0438 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0438 }
            r4.<init>(r0)     // Catch:{ all -> 0x0438 }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x0438 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0438 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0438 }
        L_0x038b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0438 }
            if (r0 == 0) goto L_0x03a5
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0438 }
            X.3Q6 r0 = (X.AnonymousClass3Q6) r0     // Catch:{ all -> 0x0438 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0438 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0438 }
            r4.add(r0)     // Catch:{ all -> 0x0438 }
            goto L_0x038b
        L_0x03a3:
            r1 = 0
            goto L_0x0415
        L_0x03a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0438 }
            r3.<init>()     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade: "
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r8)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = " fMessage:"
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            int r0 = java.lang.System.identityHashCode(r11)     // Catch:{ all -> 0x0438 }
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = " remoteUser:"
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r9)     // Catch:{ all -> 0x0438 }
            r3.append(r2)     // Catch:{ all -> 0x0438 }
            int r0 = r11.A0D     // Catch:{ all -> 0x0438 }
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r0 = r19
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            r3.append(r10)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = " recipientCount:"
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            int r0 = r11.A0B     // Catch:{ all -> 0x0438 }
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = " statuses:"
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x0438 }
            r3.append(r0)     // Catch:{ all -> 0x0438 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0438 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0438 }
            X.0wN r2 = r7.A00     // Catch:{ all -> 0x0438 }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade"
            r2.A0E(r0, r3, r1)     // Catch:{ all -> 0x0438 }
        L_0x03fc:
            r11.A0n(r10)     // Catch:{ all -> 0x0438 }
        L_0x03ff:
            X.0xM r0 = r7.A0H     // Catch:{ all -> 0x0438 }
            r0.A0q(r8, r10)     // Catch:{ all -> 0x0438 }
            X.1QI r0 = r7.A0K     // Catch:{ all -> 0x0438 }
            r0.A03(r11)     // Catch:{ all -> 0x0438 }
            r0 = 19
            X.1j7 r2 = new X.1j7     // Catch:{ all -> 0x0438 }
            r2.<init>(r7, r11, r0)     // Catch:{ all -> 0x0438 }
            r0 = r18
            r0.B5o(r2)     // Catch:{ all -> 0x0438 }
        L_0x0415:
            r17.A00()     // Catch:{ all -> 0x0438 }
            r17.close()     // Catch:{ all -> 0x0442 }
            r18.close()
            if (r1 == 0) goto L_0x042f
            X.1DQ r0 = r7.A0I
            android.os.Handler r4 = r0.A02
            r0 = 2
            r3 = -1
            r2 = 0
        L_0x0427:
            android.os.Message r0 = android.os.Message.obtain(r4, r0, r3, r2, r11)
            r0.sendToTarget()
            return r1
        L_0x042f:
            r3 = -1
            r2 = 0
            X.1DQ r0 = r7.A0I
            android.os.Handler r4 = r0.A02
            r0 = 10
            goto L_0x0427
        L_0x0438:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x043d }
            goto L_0x0441
        L_0x043d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0442 }
        L_0x0441:
            throw r1     // Catch:{ all -> 0x0442 }
        L_0x0442:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0447 }
            throw r1
        L_0x0447:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28291Sb.A04(com.whatsapp.jid.DeviceJid, X.3T1, int, long):boolean");
    }

    public C28291Sb(C19700wN r2, C19730wQ r3, AnonymousClass1DT r4, C25791Hr r5, C19970wo r6, AnonymousClass1C7 r7, C220712t r8, C220412q r9, C20310xM r10, AnonymousClass1DQ r11, AnonymousClass176 r12, AnonymousClass12P r13, AnonymousClass1TN r14, AnonymousClass1FN r15, AnonymousClass1QO r16, AnonymousClass1QI r17, C20810yC r18, AnonymousClass1CM r19, AnonymousClass1C5 r20, AnonymousClass1DL r21, AnonymousClass1C4 r22, C28361Si r23, C28301Sc r24, AnonymousClass1A1 r25, C19770wU r26, AnonymousClass005 r27) {
        this.A0F = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r9;
        this.A0G = r8;
        this.A0A = r22;
        this.A09 = r21;
        this.A0B = r24;
        this.A0P = r27;
        this.A0I = r11;
        this.A0D = r4;
        this.A06 = r16;
        this.A0H = r10;
        this.A0N = r25;
        this.A08 = r20;
        this.A02 = r7;
        this.A07 = r19;
        this.A0M = r23;
        this.A04 = r13;
        this.A05 = r14;
        this.A0J = r15;
        this.A0K = r17;
        this.A0C = r12.A02;
        this.A0O = r26;
        this.A0E = r5;
        this.A0L = r18;
        r10.A00 = this;
    }
}
