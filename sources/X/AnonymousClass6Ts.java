package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Ts  reason: invalid class name */
public class AnonymousClass6Ts {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C27631Pa A02;
    public final AnonymousClass6YM A03;
    public final AnonymousClass63S A04;
    public final C25271Fq A05;
    public final AnonymousClass1HJ A06;
    public final AnonymousClass1HO A07;
    public final C232317r A08;
    public final C20810yC A09;
    public final C19930wk A0A;
    public final AnonymousClass13J A0B;
    public final C19770wU A0C;
    public final C34051gN A0D;
    public final AnonymousClass1HK A0E;
    public final C26211Jh A0F;
    public final boolean A0G;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
        if (r7 == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C107265Nh A02(com.whatsapp.jid.DeviceJid r42, com.whatsapp.jid.UserJid r43, java.lang.String r44, int r45, long r46, boolean r48) {
        /*
            r41 = this;
            r3 = 0
            r1 = r41
            r8 = r43
            r0 = r44
            r7 = r45
            X.5Nh r6 = r1.A03(r8, r0, r7, r3)
            if (r6 != 0) goto L_0x01f6
            X.5Nh r5 = r1.A04(r0)
            r33 = r46
            if (r5 == 0) goto L_0x01c3
            java.lang.String r0 = X.C34681hT.A09(r0)
            X.6by r4 = new X.6by
            r4.<init>(r7, r8, r0, r3)
            int r0 = r5.A09
            X.1HJ r3 = r1.A06
            if (r0 != 0) goto L_0x01f2
            X.5Nh r0 = X.AnonymousClass1HJ.A00(r3, r4)
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread callLog already exists for this key="
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            X.C18740tg.A0E(r2, r0)
            java.util.ArrayList r0 = r5.A0C()
            java.util.ArrayList r11 = X.C36401kF.A0v(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0047:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r8.next()
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r7 = r0.A00
            int r6 = r0.A01
            r0 = -1
            X.5Nf r2 = new X.5Nf
            r2.<init>(r7, r6, r0)
            r11.add(r2)
            goto L_0x0047
        L_0x0062:
            X.5Iy r0 = r5.A03
            r20 = r0
            r31 = -1
            boolean r0 = r5.A0K
            r37 = r0
            int r0 = r5.A09
            r27 = r0
            int r0 = r5.A07
            r28 = r0
            X.5Tz r22 = r5.A0B()
            long r0 = r5.A0B
            r2 = 0
            boolean r6 = r5.A05
            r39 = r6
            com.whatsapp.jid.GroupJid r6 = r5.A0D
            r19 = r6
            boolean r15 = r5.A0J
            com.whatsapp.jid.DeviceJid r14 = r5.A02
            java.lang.String r13 = r5.A0H
            X.C107265Nh.A01(r5)
            int r12 = r5.A0A
            X.5Ng r10 = r5.A0F
            X.3Ir r9 = r5.A0C
            int r8 = r5.A08
            X.661 r7 = r5.A0G
            X.5Nh r6 = new X.5Nh
            r38 = 0
            r16 = r6
            r17 = r9
            r18 = r14
            r21 = r4
            r23 = r10
            r24 = r7
            r25 = r13
            r26 = r11
            r29 = r12
            r30 = r8
            r35 = r0
            r40 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38, r39, r40)
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r3.A0K
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.writeLock()
            r0.lock()
            X.1HK r9 = r3.A07     // Catch:{ all -> 0x01ba }
            monitor-enter(r9)     // Catch:{ all -> 0x01ba }
            monitor-enter(r6)     // Catch:{ all -> 0x01b7 }
            boolean r7 = r6.A05()     // Catch:{ all -> 0x01b4 }
            int r11 = r6.A01     // Catch:{ all -> 0x01b4 }
            monitor-exit(r6)     // Catch:{ all -> 0x01b7 }
            r17 = 1
            boolean r0 = r6.A05     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x00d2
            r1 = 1
            if (r7 != 0) goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x01b7 }
            X.12P r0 = r9.A04     // Catch:{ all -> 0x01b7 }
            X.1M0 r10 = r0.A05()     // Catch:{ all -> 0x01b7 }
            X.71s r16 = r10.B1k()     // Catch:{ all -> 0x01aa }
            X.14e r13 = r10.A02     // Catch:{ all -> 0x01a0 }
            java.lang.String r12 = "call_log"
            java.lang.String r15 = "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?"
            r0 = 4
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x01a0 }
            X.12j r1 = r9.A02     // Catch:{ all -> 0x01a0 }
            X.6by r7 = r5.A04     // Catch:{ all -> 0x01a0 }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x01a0 }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x01a0 }
            X.C36401kF.A1T(r14, r2, r0)     // Catch:{ all -> 0x01a0 }
            boolean r0 = r7.A03     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "1"
        L_0x00fe:
            r14[r17] = r0     // Catch:{ all -> 0x01a0 }
            r1 = 2
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x01a0 }
            r14[r1] = r0     // Catch:{ all -> 0x01a0 }
            r1 = 3
            int r0 = r7.A00     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x01a0 }
            r14[r1] = r0     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "deleteCallLog/DELETE_CALL_LOG"
            r13.A03(r12, r15, r0, r14)     // Catch:{ all -> 0x01a0 }
            X.6by r0 = r6.A04     // Catch:{ all -> 0x01a0 }
            android.content.ContentValues r1 = X.AnonymousClass1HK.A00(r9, r0, r6)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r13.A05(r12, r0, r1)     // Catch:{ all -> 0x01a0 }
            r6.A04(r0)     // Catch:{ all -> 0x01a0 }
            X.5Ng r0 = r6.A0F     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0136
            X.5Ng r12 = r6.A0F     // Catch:{ all -> 0x01a0 }
            long r0 = r6.A02()     // Catch:{ all -> 0x01a0 }
            r12.A04(r0)     // Catch:{ all -> 0x01a0 }
            X.1HO r1 = r9.A03     // Catch:{ all -> 0x01a0 }
            X.5Ng r0 = r6.A0F     // Catch:{ all -> 0x01a0 }
            r1.A06(r0)     // Catch:{ all -> 0x01a0 }
        L_0x0136:
            monitor-enter(r6)     // Catch:{ all -> 0x01a0 }
            goto L_0x013b
        L_0x0138:
            java.lang.String r0 = "0"
            goto L_0x00fe
        L_0x013b:
            int r0 = r6.A01     // Catch:{ all -> 0x019d }
            if (r11 != r0) goto L_0x0145
            r6.A02 = r2     // Catch:{ all -> 0x019d }
            int r0 = r0 + 1
            r6.A01 = r0     // Catch:{ all -> 0x019d }
        L_0x0145:
            monitor-exit(r6)     // Catch:{ all -> 0x01a0 }
            X.AnonymousClass1HK.A02(r9, r6)     // Catch:{ all -> 0x01a0 }
            r16.A00()     // Catch:{ all -> 0x01a0 }
            r16.close()     // Catch:{ all -> 0x01aa }
            r10.close()     // Catch:{ all -> 0x01b7 }
            monitor-exit(r9)     // Catch:{ all -> 0x01ba }
            X.1HS r0 = r3.A00     // Catch:{ all -> 0x01ba }
            r0.A01(r5)     // Catch:{ all -> 0x01ba }
            r0.A00(r6)     // Catch:{ all -> 0x01ba }
            X.1C7 r2 = r3.A06     // Catch:{ all -> 0x01ba }
            r0 = 32
            X.1j5 r1 = new X.1j5     // Catch:{ all -> 0x01ba }
            r1.<init>(r3, r6, r0)     // Catch:{ all -> 0x01ba }
            r0 = 16
            r2.A01(r1, r0)     // Catch:{ all -> 0x01ba }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.writeLock()
            r0.unlock()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread; callLog.key="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = "; callLog.row_id="
            r2.append(r0)
            long r0 = r5.A02()
            r2.append(r0)
            java.lang.String r0 = "; new key="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; new row_id="
            r2.append(r0)
            long r0 = r6.A02()
            X.C36351kA.A1S(r2, r0)
            return r6
        L_0x019d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x01a5 }
            goto L_0x01a9
        L_0x01a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01aa }
        L_0x01a9:
            throw r1     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01af }
            goto L_0x01b3
        L_0x01af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01b7 }
        L_0x01b3:
            throw r1     // Catch:{ all -> 0x01b7 }
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01b7 }
            throw r0     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.writeLock()
            r0.unlock()
            throw r1
        L_0x01c3:
            X.1HJ r2 = r1.A06
            java.lang.String r1 = X.C34681hT.A09(r0)
            r32 = 0
            X.6by r0 = new X.6by
            r0.<init>(r7, r8, r1, r3)
            X.AnonymousClass1HJ.A01(r2, r0)
            X.5Nh r6 = new X.5Nh
            r30 = r42
            r35 = r48
            r29 = r6
            r31 = r0
            r29.<init>(r30, r31, r32, r33, r35)
            X.AnonymousClass1HJ.A02(r2, r6)
            X.0yC r1 = r2.A0F
            r0 = 6120(0x17e8, float:8.576E-42)
            int r1 = r1.A07(r0)
            r0 = 1
            if (r1 < r0) goto L_0x01f6
            X.AnonymousClass1HJ.A03(r2, r6)
            return r6
        L_0x01f2:
            X.5Nh r6 = r3.A07(r4, r5)
        L_0x01f6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ts.A02(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.lang.String, int, long, boolean):X.5Nh");
    }

    public void A05(GroupJid groupJid, C107265Nh r11, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str) && this.A0G) {
                C36321k7.A1Q("voip/setCallLogIsScheduledCall scheduledId:", str, AnonymousClass000.A0u());
                r11.A0G(1);
                AnonymousClass661 r1 = new AnonymousClass661(str);
                synchronized (r11) {
                    if (!C1901797e.A00(r11.A0G, r1)) {
                        r11.A0G = r1;
                        r11.A03();
                    }
                }
                C26211Jh r3 = this.A0F;
                r3.A01.A01(new C35501in(r3, groupJid2, str2, 1, r11.A02()), 68);
            }
        }
    }

    public void A07(C107265Nh r11, boolean z) {
        synchronized (r11) {
            if (r11.A0J != z) {
                r11.A0J = z;
                r11.A03();
            }
        }
        String str = r11.A04.A02;
        String A082 = C34681hT.A08(str);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/setCallLogIsJoinableGroupCall callId:");
        A0u.append(A082);
        C36321k7.A1X(" joinable:", A0u, z);
        if (z) {
            C18740tg.A0D(AnonymousClass000.A1V(r11.A02), "Can't rejoin from call logs missing call creator");
            C34051gN r3 = this.A0D;
            r3.A03.execute(new C35651j2(r3, r11, 12));
            if (r11.A0F == null) {
                GroupJid groupJid = r11.A0D;
                if (groupJid != null) {
                    this.A0A.execute(new C1502274l(this, groupJid, str, 31));
                }
                r11.A0L(new AnonymousClass5Ng(r11.A0D, str, r11.A02(), r11.A0K));
                return;
            }
            return;
        }
        C34051gN r32 = this.A0D;
        r32.A03.execute(new C35651j2(r32, r11, 13));
        if (r11.A0F != null) {
            r11.A0L((AnonymousClass5Ng) null);
            A00(this, r11);
            synchronized (this) {
                if (r11.A08 == 2 && r11.A0F == null) {
                    Iterator A002 = C107265Nh.A00(r11);
                    while (A002.hasNext()) {
                        UserJid userJid = ((C107255Nf) A002.next()).A00;
                        if (!r11.A0T(userJid)) {
                            synchronized (r11) {
                                C107255Nf r1 = (C107255Nf) r11.A00.get(userJid);
                                if (r1 != null) {
                                    r11.A0L.add(r1);
                                    r11.A00.remove(userJid);
                                    r11.A03();
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.A02.A06(A082);
    }

    public void A08(C107265Nh r11, AnonymousClass114[] r12) {
        String str;
        int i = 0;
        if (r12 != null) {
            boolean A0K = C34681hT.A0K(this.A09);
            AnonymousClass6YM r5 = this.A03;
            boolean A0q = r5.A0q(r11);
            HashSet A16 = C36441kJ.A16();
            HashSet A162 = C36441kJ.A16();
            for (AnonymousClass114 r1 : r12) {
                if (r1 != null) {
                    A16.add(r1.getCallUserJid());
                    if (r1.isCallConnected()) {
                        A162.add(r1.getCallUserJid());
                    }
                }
            }
            Iterator A002 = C107265Nh.A00(r11);
            while (A002.hasNext()) {
                C107255Nf r0 = (C107255Nf) A002.next();
                if (r0 != null) {
                    A16.add(r0.A00);
                }
            }
            Iterator it = A16.iterator();
            while (true) {
                int i2 = 2;
                if (!it.hasNext()) {
                    break;
                }
                UserJid A0o = C36441kJ.A0o(it);
                if (A0q || A0K || this.A0G) {
                    boolean contains = A162.contains(A0o);
                    if (A0q || A0K) {
                        if (contains) {
                            i2 = 5;
                        } else if (r11.A0T(A0o)) {
                            i2 = 100;
                        }
                    }
                    r11.A0K(A0o, i2);
                    if (contains) {
                        i++;
                    }
                }
            }
            if (i >= 2) {
                GroupJid groupJid = r11.A0D;
                if (r11.A0G != null) {
                    str = r11.A0G.A00;
                } else {
                    str = null;
                }
                if (groupJid != null && !TextUtils.isEmpty(str) && r5.A3H) {
                    r5.A36.Bp1(new C1502274l(r5, groupJid, str, 33));
                    return;
                }
                return;
            }
            return;
        }
        C18740tg.A0D(false, "Empty list of participant jids when updating call log");
    }

    public static void A00(AnonymousClass6Ts r1, C107265Nh r2) {
        C108555Tz r12;
        AnonymousClass6CH r13 = r1.A03.A0n;
        if (r13.A00) {
            r12 = C108555Tz.A03;
        } else if (r13.A03) {
            r12 = C108555Tz.A02;
        } else if (r13.A01) {
            r12 = C108555Tz.A05;
        } else if (r13.A02) {
            r12 = C108555Tz.A04;
        } else {
            return;
        }
        synchronized (r2) {
            if (r2.A0E != r12) {
                r2.A0E = r12;
                r2.A03();
            }
        }
    }

    public static void A01(CallInfo callInfo, C107265Nh r5) {
        Iterator A0y = AnonymousClass000.A0y(callInfo.participants);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            UserJid userJid = (UserJid) A11.getKey();
            int i = ((AnonymousClass6EE) A11.getValue()).A02;
            int i2 = 2;
            if (i == 1) {
                i2 = 5;
            }
            r5.A0K(userJid, i2);
        }
    }

    public C107265Nh A03(UserJid userJid, String str, int i, boolean z) {
        return AnonymousClass1HJ.A00(this.A06, new C135006by(i, userJid, C34681hT.A09(str), z));
    }

    public C107265Nh A04(String str) {
        AnonymousClass5Ng A042 = this.A07.A04(C34681hT.A09(str));
        if (A042 != null) {
            return this.A06.A06(A042.A02());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (X.C34681hT.A0A(r6.A00, r6.A02) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (X.AnonymousClass143.A0I(r2) == false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(com.whatsapp.jid.GroupJid r8, X.C107265Nh r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            X.5Ng r0 = r9.A0F
            if (r0 == 0) goto L_0x0014
            X.5Ng r0 = r9.A0F
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = X.C1901797e.A00(r0, r8)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "VoiceService/setGroupJidInCallLog: mismatched groupJid in joinableCallLog and callLog"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0013:
            return
        L_0x0014:
            if (r8 == 0) goto L_0x0029
            if (r11 == 0) goto L_0x0029
            X.0wQ r0 = r7.A01
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "voip/setCallLogIsAudioChat true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r9.A0G(r0)
        L_0x0029:
            com.whatsapp.jid.GroupJid r0 = r9.A0D
            if (r0 != 0) goto L_0x0013
            if (r8 == 0) goto L_0x0013
            r9.A0J(r8)
            X.1HJ r4 = r7.A06
            boolean r1 = X.C36421kH.A1a(r10)
            com.whatsapp.jid.GroupJid r0 = r9.A0D
            if (r0 == 0) goto L_0x0013
            if (r1 != 0) goto L_0x0013
            X.12q r2 = r4.A08
            com.whatsapp.jid.GroupJid r1 = r9.A0D
            r0 = 0
            X.3Qp r0 = r2.A09(r1, r0)
            if (r0 == 0) goto L_0x0013
            X.0yC r1 = r4.A0F
            com.whatsapp.jid.GroupJid r0 = r9.A0D
            if (r0 == 0) goto L_0x0058
            r0 = 4895(0x131f, float:6.86E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0058
            return
        L_0x0058:
            X.1HR r6 = r4.A02
            X.19w r1 = r6.A03
            com.whatsapp.jid.GroupJid r0 = r9.A0D
            X.3Qa r2 = X.C36411kG.A0o(r0, r1)
            long r0 = r9.A01
            X.2cO r3 = new X.2cO
            r3.<init>(r2, r0)
            int r1 = r9.A08
            r0 = 2
            if (r1 != r0) goto L_0x0078
            X.0yC r1 = r6.A02
            X.0wQ r0 = r6.A00
            boolean r0 = X.C34681hT.A0A(r0, r1)
            if (r0 == 0) goto L_0x007c
        L_0x0078:
            int r0 = r9.A08
            r3.A00 = r0
        L_0x007c:
            X.6by r5 = r9.A04
            com.whatsapp.jid.UserJid r2 = r5.A01
            java.lang.Class r0 = r2.getClass()
            boolean r1 = r0.equals(r0)
            java.lang.String r0 = "Jid disparity between callLog.key.jid and callLog.getRemoteJid"
            X.C18740tg.A0D(r1, r0)
            boolean r0 = X.AnonymousClass143.A0F(r2)
            if (r0 == 0) goto L_0x009a
            boolean r0 = X.AnonymousClass143.A0I(r2)
            r1 = 1
            if (r0 != 0) goto L_0x009b
        L_0x009a:
            r1 = 0
        L_0x009b:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00a7
            X.0wQ r0 = r6.A00
            if (r1 == 0) goto L_0x00bc
            X.13w r2 = r0.A08()
        L_0x00a7:
            r3.A0q(r2)
            boolean r0 = r9.A0K
            r3.A02 = r0
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.C34681hT.A08(r0)
            r3.A01 = r0
            X.0xM r0 = r4.A09
            r0.A0h(r3)
            return
        L_0x00bc:
            com.whatsapp.jid.PhoneUserJid r2 = X.C36441kJ.A0n(r0)
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ts.A06(com.whatsapp.jid.GroupJid, X.5Nh, java.lang.String, boolean):void");
    }

    public AnonymousClass6Ts(C19700wN r4, C19730wQ r5, C27631Pa r6, AnonymousClass6YM r7, AnonymousClass63S r8, C34051gN r9, C25271Fq r10, AnonymousClass1HK r11, AnonymousClass1HJ r12, AnonymousClass1HO r13, C232317r r14, C26211Jh r15, C20810yC r16, AnonymousClass13J r17, C19770wU r18, boolean z) {
        this.A09 = r16;
        this.A00 = r4;
        this.A01 = r5;
        C19770wU r2 = r18;
        this.A0C = r2;
        this.A0E = r11;
        this.A03 = r7;
        this.A0B = r17;
        this.A06 = r12;
        this.A04 = r8;
        this.A0F = r15;
        this.A07 = r13;
        this.A02 = r6;
        this.A05 = r10;
        this.A0D = r9;
        this.A08 = r14;
        this.A0G = z;
        this.A0A = new C19930wk(r2, true);
    }
}
