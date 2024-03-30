package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1DL  reason: invalid class name */
public class AnonymousClass1DL {
    public final C19700wN A00;
    public final AnonymousClass164 A01;
    public final AnonymousClass178 A02;
    public final AnonymousClass1DO A03;
    public final C20810yC A04;
    public final AnonymousClass1C5 A05;
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final AnonymousClass1DM A07;
    public final AnonymousClass1C7 A08;
    public final AnonymousClass19A A09;
    public final AnonymousClass19L A0A;
    public final C19770wU A0B;

    public static Message A00(C19700wN r8, C20810yC r9, AnonymousClass3T1 r10, int i) {
        long j = r10.A1Q;
        C203429o0.A0B(r8, r9, "message", "receipt", r10.A1J.A01, j, true);
        return Message.obtain((Handler) null, 0, 9, i, r10);
    }

    public static Message A01(C19700wN r8, C20810yC r9, C207209uj r10) {
        C19700wN r0 = r8;
        C20810yC r1 = r9;
        C203429o0.A0B(r0, r1, r10.A05, r10.A03(), r10.A07, r10.A00, r10.A04());
        return Message.obtain((Handler) null, 0, 129, 0, r10);
    }

    public static C207209uj A02(AnonymousClass3T1 r5, String str, String str2) {
        C64933Qa r4 = r5.A1J;
        Pair A062 = C203359nq.A06(r5.A1T, r4.A00, r5.A0J());
        AnonymousClass9YT r2 = new AnonymousClass9YT();
        r2.A05 = "message";
        r2.A07 = r4.A01;
        r2.A00 = r5.A1Q;
        r2.A02 = (Jid) A062.first;
        r2.A01 = (Jid) A062.second;
        r2.A08 = str;
        if (!TextUtils.isEmpty(str2)) {
            r2.A08("error", str2);
        }
        return r2.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if ((r3 instanceof X.C28981Uw) != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap A03(java.util.Collection r6) {
        /*
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0009:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r6.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            int r2 = r1.A0D
            r0 = 16
            if (r2 != r0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt since its already sent; message.key="
        L_0x0027:
            r2.append(r0)
            X.3Qa r0 = r1.A1J
            r2.append(r0)
        L_0x002f:
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0009
        L_0x0037:
            int r2 = r1.A1I
            r0 = 11
            if (r2 != r0) goto L_0x004a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt due to decryption failure; message.key="
            goto L_0x0027
        L_0x004a:
            r0 = 31
            if (r2 != r0) goto L_0x005b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skipping read receipt due to multi device placeholder; message.key="
            goto L_0x0027
        L_0x005b:
            boolean r0 = X.C66013Ui.A0n(r1)
            if (r0 == 0) goto L_0x0071
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for revoked message"
        L_0x006d:
            r2.append(r0)
            goto L_0x002f
        L_0x0071:
            boolean r0 = X.C63903Lw.A00(r1)
            if (r0 == 0) goto L_0x0084
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for bot message"
            goto L_0x006d
        L_0x0084:
            r0 = 19
            if (r2 != r0) goto L_0x0095
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skip read receipt for hsm rejection message. key="
            goto L_0x0027
        L_0x0095:
            r0 = 21
            if (r2 != r0) goto L_0x00a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ReadReceipts"
            r2.append(r0)
            java.lang.String r0 = "/generateReceiptGroups skip sending read receipt for request declined message."
            goto L_0x006d
        L_0x00a6:
            X.3Qa r4 = r1.A1J
            X.11F r3 = r4.A00
            boolean r0 = X.AnonymousClass143.A0H(r3)
            if (r0 != 0) goto L_0x0009
            X.11F r0 = r1.A0N
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 != 0) goto L_0x0009
            X.11F r2 = r1.A0J()
            boolean r0 = r1 instanceof X.AnonymousClass2bM
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r3 instanceof X.C28981Uw
            r1 = 0
            if (r0 == 0) goto L_0x00c6
        L_0x00c5:
            r1 = 1
        L_0x00c6:
            X.3PO r0 = new X.3PO
            r0.<init>(r3, r2, r1)
            java.lang.Object r1 = r5.get(r0)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 != 0) goto L_0x00db
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.put(r0, r1)
        L_0x00db:
            java.lang.String r0 = r4.A01
            r1.add(r0)
            goto L_0x0009
        L_0x00e2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A03(java.util.Collection):java.util.HashMap");
    }

    public static void A04(Message message, AnonymousClass1DL r4, long j) {
        r4.A0A.A03(j);
        AnonymousClass19A r2 = r4.A09;
        AnonymousClass00C.A0D(message, 0);
        AnonymousClass19A.A01(message, r2, (String) null, false);
    }

    private void A05(AnonymousClass3T1 r4) {
        if (!(r4.A1J.A00 instanceof C177528dw) && this.A05.A06(r4)) {
            if (r4.A0D == 17) {
                A06(r4);
            } else {
                this.A08.A01(new C35741jB(this, r4, 12), 43);
            }
        }
    }

    private void A06(AnonymousClass3T1 r4) {
        if (!(r4 instanceof AnonymousClass2bM) && !(r4.A1J.A00 instanceof C28981Uw)) {
            r4.A0n(16);
            this.A0B.Boy(new C35741jB(this, r4, 13));
        }
    }

    public static boolean A07(AnonymousClass3T1 r2) {
        int i;
        int i2 = r2.A0D;
        if (i2 == 16 || i2 == 6 || C66013Ui.A0n(r2) || (i = r2.A1I) == 19 || i == 21 || C203359nq.A0C(r2) || C63903Lw.A00(r2) || AnonymousClass143.A0H(r2.A1J.A00) || AnonymousClass143.A0H(r2.A0N)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass3T1 r10) {
        /*
            r9 = this;
            int r1 = r10.A1I
            r7 = 0
            r0 = 31
            if (r1 != r0) goto L_0x000b
            r9.A0B(r10, r7)
        L_0x000a:
            return
        L_0x000b:
            X.11F r8 = r10.A0J()
            r1 = r8
            if (r8 != 0) goto L_0x0016
            X.3Qa r0 = r10.A1J
            X.11F r8 = r0.A00
        L_0x0016:
            boolean r0 = r1 instanceof X.C177638e7
            if (r0 != 0) goto L_0x004b
            boolean r0 = r10.A14
            if (r0 != 0) goto L_0x004b
            X.3Qa r2 = r10.A1J
            X.11F r5 = r2.A00
            boolean r0 = r5 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x004b
            int r1 = r10.A0D
            r0 = 6
            if (r1 == r0) goto L_0x004b
            boolean r0 = X.C63903Lw.A00(r10)
            if (r0 == 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts"
            r1.append(r0)
            java.lang.String r0 = "/acknowledgeMessageIfNeeded ignoring bot response key="
            r1.append(r0)
            r1.append(r2)
        L_0x0043:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts"
            r1.append(r0)
            java.lang.String r0 = "/acknowledgeMessageIfNeeded ignoring key="
            r1.append(r0)
            X.3Qa r0 = r10.A1J
            r1.append(r0)
            java.lang.String r0 = " status="
            r1.append(r0)
            int r0 = r10.A0D
            r1.append(r0)
            goto L_0x0043
        L_0x006a:
            X.1DM r4 = r9.A07
            X.0yC r2 = r4.A06
            r1 = 6163(0x1813, float:8.636E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r6 = 1
            if (r0 == 0) goto L_0x0109
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0109
            boolean r0 = X.AnonymousClass143.A0H(r8)
            if (r0 != 0) goto L_0x0109
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            X.36K r0 = X.AnonymousClass1DM.A01(r4, r8)
            if (r0 == 0) goto L_0x0107
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0109
            java.util.Map r3 = X.AnonymousClass1DM.A02(r4)
            X.0wo r0 = r4.A04
            long r1 = r0.A04()
            X.36K r0 = new X.36K
            r0.<init>(r4, r6, r1)
            r3.put(r8, r0)
            r4 = 2
        L_0x00a2:
            r8 = 1
            if (r4 != 0) goto L_0x00c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReadReceipts"
            r1.append(r0)
            java.lang.String r0 = "/acknowledgeMessageIfNeeded Privacy token decision not computed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wN r1 = r9.A00
            java.lang.String r0 = "ReadReceipts/PrivacyTokenDecisionNotComputed"
            r1.A0E(r0, r7, r6)
        L_0x00c2:
            int r1 = r10.A0D
            r0 = 13
            if (r1 != r0) goto L_0x0111
            X.1C5 r3 = r9.A05
            boolean r0 = r3.A03(r5)
            if (r0 == 0) goto L_0x0111
            long r5 = r10.A0I
            r1 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0111
            boolean r0 = X.C66013Ui.A0n(r10)
            if (r0 != 0) goto L_0x0111
            boolean r0 = r10.A1Y
            if (r0 != 0) goto L_0x0111
            boolean r0 = r10.A1Z
            if (r0 == 0) goto L_0x010b
            boolean r0 = r3.A06(r10)
            if (r0 != 0) goto L_0x0105
            long r1 = r10.A1Q
            X.0yC r3 = r9.A04
            X.0wN r0 = r9.A00
            android.os.Message r0 = A00(r0, r3, r10, r4)
            A04(r0, r9, r1)
        L_0x00fc:
            r0 = 0
            r10.A1Z = r0
            if (r8 == 0) goto L_0x010b
            r9.A09(r10)
            return
        L_0x0105:
            r8 = 0
            goto L_0x00fc
        L_0x0107:
            r4 = 0
            goto L_0x00a2
        L_0x0109:
            r4 = 1
            goto L_0x00a2
        L_0x010b:
            boolean r0 = r9.A0H(r10, r4)
            if (r0 != 0) goto L_0x000a
        L_0x0111:
            long r1 = r10.A1Q
            X.0yC r3 = r9.A04
            X.0wN r0 = r9.A00
            android.os.Message r0 = A00(r0, r3, r10, r4)
            A04(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A08(X.3T1):void");
    }

    public void A0A(AnonymousClass3T1 r6, int i) {
        if (r6.A0D == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts");
            sb.append("/sendNack ignoring key=");
            sb.append(r6.A1J);
            sb.append(" status=");
            sb.append(r6.A0D);
            Log.i(sb.toString());
            return;
        }
        C207209uj A022 = A02(r6, (String) null, String.valueOf(i));
        A04(A01(this.A00, this.A04, A022), this, r6.A1Q);
    }

    public void A0B(AnonymousClass3T1 r6, String str) {
        if (r6.A0D == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts");
            sb.append("/acknowledgeMessageSilent ignoring type=");
            sb.append(str);
            sb.append(" key=");
            sb.append(r6.A1J);
            Log.i(sb.toString());
            return;
        }
        C207209uj A022 = A02(r6, str, (String) null);
        A04(A01(this.A00, this.A04, A022), this, r6.A1Q);
    }

    public void A0E(C23084B3s b3s, String str, String str2) {
        if (str != null) {
            long BDf = b3s.BDf();
            C207209uj BHp = b3s.BHp(str2);
            A04(A01(this.A00, this.A04, BHp), this, BDf);
        }
    }

    public void A0G(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            int size = ((AbstractCollection) entry.getValue()).size();
            int i = 0;
            while (i < size) {
                int min = Math.min(i + 256, size);
                this.A01.A01(new SendReadReceiptJob(((AnonymousClass3PO) entry.getKey()).A00, ((AnonymousClass3PO) entry.getKey()).A01, (AnonymousClass11F) null, (DeviceJid) null, (String[]) ((AbstractList) entry.getValue()).subList(i, min).toArray(new String[0]), -1, 0, ((AnonymousClass3PO) entry.getKey()).A02));
                i = min;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if ((r0.A0J() instanceof X.C177638e7) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.AnonymousClass3T1 r22, int r23) {
        /*
            r21 = this;
            r0 = r22
            boolean r1 = A07(r0)
            r2 = r21
            if (r1 == 0) goto L_0x0079
            boolean r1 = r0 instanceof X.AnonymousClass2bM
            if (r1 != 0) goto L_0x0018
            X.11F r1 = r0.A0J()
            boolean r1 = r1 instanceof X.C177638e7
            r17 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r17 = 1
        L_0x001a:
            X.1C5 r8 = r2.A05
            X.3Qa r1 = r0.A1J
            X.11F r9 = r1.A00
            X.C18740tg.A06(r9)
            r7 = 1
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.String r5 = r1.A01
            r1 = 0
            r6[r1] = r5
            long r3 = r0.A0I
            java.lang.Throwable r10 = new java.lang.Throwable
            r10.<init>()
            r11 = r6
            r12 = r3
            r14 = r17
            boolean r3 = r8.A05(r9, r10, r11, r12, r14)
            if (r3 == 0) goto L_0x0079
            X.C18740tg.A06(r9)
            X.11F r10 = r0.A0J()
            com.whatsapp.jid.DeviceJid r11 = r0.A1T
            r12 = 0
            java.lang.String[] r13 = new java.lang.String[r7]
            r13[r1] = r5
            long r15 = r0.A1Q
            r14 = r23
            X.9Nu r8 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r17)
            long r3 = r0.A1Q
            X.0yC r14 = r2.A04
            X.0wN r13 = r2.A00
            long r5 = r8.A01
            X.3Qa r7 = r8.A06
            java.lang.String r7 = r7.A01
            java.lang.String r15 = "message"
            java.lang.String r16 = "read-receipt"
            r20 = 1
            r17 = r7
            r18 = r5
            X.C203429o0.A0B(r13, r14, r15, r16, r17, r18, r20)
            r5 = 419(0x1a3, float:5.87E-43)
            android.os.Message r1 = android.os.Message.obtain(r12, r1, r5, r1, r8)
            A04(r1, r2, r3)
            r1 = 1
        L_0x0075:
            r2.A05(r0)
            return r1
        L_0x0079:
            r1 = 0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A0H(X.3T1, int):boolean");
    }

    public AnonymousClass1DL(C19700wN r3, AnonymousClass164 r4, AnonymousClass1DM r5, AnonymousClass1C7 r6, AnonymousClass178 r7, AnonymousClass1DO r8, C20810yC r9, AnonymousClass19A r10, AnonymousClass1C5 r11, AnonymousClass19L r12, C19770wU r13) {
        this.A04 = r9;
        this.A00 = r3;
        this.A0B = r13;
        this.A01 = r4;
        this.A09 = r10;
        this.A02 = r7;
        this.A05 = r11;
        this.A08 = r6;
        this.A0A = r12;
        this.A07 = r5;
        this.A03 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if ((r5 instanceof X.C177638e7) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass3T1 r15) {
        /*
            r14 = this;
            boolean r0 = A07(r15)
            if (r0 == 0) goto L_0x0034
            X.164 r1 = r14.A01
            X.3Qa r3 = r15.A1J
            X.11F r4 = r3.A00
            X.C18740tg.A06(r4)
            X.11F r5 = r15.A0J()
            com.whatsapp.jid.DeviceJid r7 = r15.A1T
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r0 = r3.A01
            r8[r2] = r0
            long r9 = r15.A0I
            boolean r0 = r15 instanceof X.AnonymousClass2bM
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5 instanceof X.C177638e7
            r13 = 0
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r13 = 1
        L_0x0029:
            long r11 = r15.A1Q
            r6 = 0
            com.whatsapp.jobqueue.job.SendReadReceiptJob r3 = new com.whatsapp.jobqueue.job.SendReadReceiptJob
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13)
            r1.A01(r3)
        L_0x0034:
            r14.A05(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DL.A09(X.3T1):void");
    }

    public void A0C(C23084B3s b3s) {
        long j;
        Message A002;
        if (b3s.BNC()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ReadReceipts");
            sb.append("/acknowledgeMessageIfNeeded ignoring because retry key=");
            sb.append(b3s.BE4());
            Log.i(sb.toString());
            return;
        }
        if (b3s instanceof C21336AHo) {
            j = b3s.BDf();
            A002 = Message.obtain((Handler) null, 0, 362, 0, b3s);
        } else {
            C21337AHp aHp = (C21337AHp) b3s;
            AnonymousClass3T1 r0 = aHp.A0P;
            if (r0 == null) {
                j = aHp.A07;
                A002 = A00(this.A00, this.A04, aHp.A01(C74383lW.A00), 1);
            } else {
                A08(r0);
                return;
            }
        }
        A04(A002, this, j);
    }

    public void A0D(C23084B3s b3s, int i) {
        C207209uj BHp = b3s.BHp(String.valueOf(i));
        A04(A01(this.A00, this.A04, BHp), this, b3s.BDf());
    }

    public void A0F(Collection collection) {
        long max;
        SendReadReceiptJob sendReadReceiptJob;
        A0G(A03(collection));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r3 = (AnonymousClass3T1) it.next();
            if (this.A05.A06(r3)) {
                if (r3.A0D == 17) {
                    A06(r3);
                } else {
                    if (C63903Lw.A00(r3) && r3.A0D != 16) {
                        if (C197029b1.A00(r3.A0J())) {
                            C64933Qa r8 = r3.A1J;
                            AnonymousClass11F r13 = r8.A00;
                            boolean A0G = AnonymousClass143.A0G(r13);
                            AnonymousClass164 r2 = this.A01;
                            if (A0G) {
                                sendReadReceiptJob = new SendReadReceiptJob(r13, r3.A0J(), (AnonymousClass11F) null, (DeviceJid) null, new String[]{r8.A01}, r3.A0I, r3.A1Q, true);
                            } else {
                                sendReadReceiptJob = new SendReadReceiptJob(r3.A0J(), (AnonymousClass11F) null, r13, (DeviceJid) null, new String[]{r8.A01}, r3.A0I, r3.A1Q, true);
                            }
                            r2.A01(sendReadReceiptJob);
                        }
                        A06(r3);
                    }
                    AnonymousClass11F r10 = r3.A1J.A00;
                    if (r10 instanceof C177528dw) {
                        AnonymousClass11F A0J = r3.A0J();
                        if (A0J instanceof PhoneUserJid) {
                            Number number = (Number) hashMap2.get(A0J);
                            if (number == null) {
                                max = r3.A1O;
                            } else {
                                max = Math.max(number.longValue(), r3.A1O);
                            }
                            hashMap2.put(A0J, Long.valueOf(max));
                        }
                    } else {
                        AnonymousClass3T1 r9 = (AnonymousClass3T1) hashMap.get(r10);
                        if (r9 != null && r9.A1O > r3.A1O) {
                            r3 = r9;
                        }
                        hashMap.put(r10, r3);
                    }
                }
            }
        }
        this.A08.A01(new C35631j0(this, hashMap, hashMap2, 35), 43);
    }
}
