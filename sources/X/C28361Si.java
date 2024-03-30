package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Si  reason: invalid class name and case insensitive filesystem */
public class C28361Si {
    public long A00 = (System.currentTimeMillis() - 200);
    public boolean A01;
    public Handler A02;
    public C81343wr A03;
    public final AnonymousClass1TI A04;
    public final AnonymousClass1TJ A05;
    public final AnonymousClass1TK A06;
    public final C19970wo A07;
    public final C25271Fq A08;
    public final C19420v0 A09;
    public final C24541Cv A0A;
    public final C26171Jd A0B;
    public final C20600xp A0C;
    public final AnonymousClass1TB A0D;
    public final AnonymousClass1CR A0E;
    public final AnonymousClass1A1 A0F;
    public final C19770wU A0G;
    public final Map A0H = new HashMap();
    public final C19700wN A0I;
    public final C19730wQ A0J;
    public final C21100yf A0K;
    public final AnonymousClass1RU A0L;
    public final AnonymousClass16D A0M;
    public final AnonymousClass171 A0N;
    public final C21060yb A0O;
    public final C19630wG A0P;
    public final C18820ts A0Q;
    public final C220412q A0R;
    public final C219712j A0S;
    public final AnonymousClass1FZ A0T;
    public final AnonymousClass1TA A0U;
    public final C20810yC A0V;
    public final AnonymousClass1TL A0W = new AnonymousClass1TL(this);
    public final AnonymousClass1TE A0X;
    public final AnonymousClass1T9 A0Y;
    public final C23971Ao A0Z;
    public volatile long A0a;

    public synchronized Handler A04() {
        Handler handler;
        handler = this.A02;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Notifications", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A02 = handler;
        }
        return handler;
    }

    public void A09() {
        A01(this, (AnonymousClass3T1) null, true, true, false, false, false, false);
    }

    public void A0A() {
        A01(this, (AnonymousClass3T1) null, true, true, false, true, false, true);
    }

    public void A0F(AnonymousClass3T1 r9, boolean z, boolean z2) {
        A01(this, r9, z, this.A01, false, false, false, z2);
    }

    public static void A00(AnonymousClass11F r12, C28361Si r13, AnonymousClass2bM r14, int i) {
        ArrayList arrayList = new ArrayList();
        Map map = r13.A0H;
        List<AnonymousClass3LF> list = (List) map.get(r12);
        if (list == null) {
            map.put(r12, r13.A07(r12, 1));
            return;
        }
        for (AnonymousClass3LF r8 : list) {
            if (r8 instanceof AnonymousClass2Z7) {
                AnonymousClass2Z7 r6 = (AnonymousClass2Z7) r8;
                int i2 = r14.A1I;
                AnonymousClass3T1 r5 = r6.A00;
                if (i2 == r5.A1I) {
                    C64933Qa A1Z = ((AnonymousClass2bM) r5).A1Z();
                    C18740tg.A06(A1Z);
                    if (A1Z.equals(r14.A1Z()) && !C65733Tg.A03(r14)) {
                        C219712j r82 = r13.A0S;
                        if (C65733Tg.A03(r14)) {
                            C18740tg.A0D(false, "this method should not be called for messageAddOn revokes");
                        } else {
                            Set set = r6.A00.A03;
                            AnonymousClass11F A0J2 = r14.A0J();
                            boolean z = r14.A1J.A00 instanceof AnonymousClass144;
                            boolean z2 = true;
                            if (z && A0J2 != null) {
                                long A072 = r82.A07(A0J2);
                                if (i2 != r6.A00.A1I || !r6.A00.A03.contains(Long.valueOf(A072))) {
                                    z2 = false;
                                }
                            }
                            r6.A00 = r14;
                            int i3 = r6.A00.A00;
                            if (!z2) {
                                i3++;
                                AnonymousClass11F A0J3 = r14.A0J();
                                if (z && A0J3 != null) {
                                    set.add(Long.valueOf(r82.A07(A0J3)));
                                }
                            }
                            C605638i r0 = new C605638i(r6.A00.A01, r14, i3);
                            r6.A00 = r0;
                            r0.A03.addAll(set);
                        }
                        Collections.sort(list, new C81413wy(true));
                        map.put(r12, list);
                        return;
                    }
                }
            }
            arrayList.add(r8);
        }
        for (C605638i A052 : r13.A0B.A0G(r12, i)) {
            arrayList.add(r13.A05(A052));
        }
        Collections.sort(arrayList, new C81413wy(true));
        map.put(r12, arrayList);
        if (arrayList.isEmpty()) {
            r13.A08.A06(r12, "MessageNotification5");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if ((X.C19970wo.A00(r2.A07) - r0.longValue()) < java.util.concurrent.TimeUnit.SECONDS.toMillis(5)) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0197, code lost:
        if ((r12.A1J.A00 instanceof X.C28981Uw) == false) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C28361Si r15, X.AnonymousClass3T1 r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            r12 = r16
            if (r16 == 0) goto L_0x000d
            X.3Qa r0 = r12.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            r1 = r15
            r15 = r18
            r16 = r19
            if (r17 != 0) goto L_0x005f
            if (r12 == 0) goto L_0x003c
            X.1T9 r4 = r1.A0Y
            X.1TL r2 = r1.A0W
            monitor-enter(r4)
            boolean r0 = r4.A03     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0033
            X.3Qa r5 = r12.A1J     // Catch:{ all -> 0x0036 }
            X.0wo r0 = r4.A04     // Catch:{ all -> 0x0036 }
            long r6 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0036 }
            X.39K r3 = new X.39K     // Catch:{ all -> 0x0036 }
            r8 = r15
            r9 = r16
            r3.<init>(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x0036 }
            r4.A01 = r3     // Catch:{ all -> 0x0036 }
            r4.A00 = r2     // Catch:{ all -> 0x0036 }
        L_0x0033:
            boolean r0 = r4.A03     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0039:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x005f
        L_0x003c:
            X.1RU r2 = r1.A0L
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x0134
            java.lang.Long r0 = r2.A00
            if (r0 == 0) goto L_0x0134
            long r6 = r0.longValue()
            X.0wo r0 = r2.A07
            long r4 = X.C19970wo.A00(r0)
            long r4 = r4 - r6
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 5
            long r2 = r0.toMillis(r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0134
        L_0x005f:
            r14 = 1
        L_0x0060:
            if (r12 == 0) goto L_0x0137
            X.1TE r4 = r1.A0X
            boolean r0 = r4.A01(r12)
            if (r0 == 0) goto L_0x0189
            r9 = 0
            X.0wG r0 = r4.A02
            android.content.Context r6 = r0.A00
            X.AnonymousClass00C.A08(r6)
            X.3Qa r0 = r12.A1J
            X.11F r3 = r0.A00
            X.C18740tg.A06(r3)
            X.16D r7 = r4.A00
            X.141 r5 = r7.A0D(r3)
            android.net.Uri r8 = X.AnonymousClass1U4.A00(r5)
            java.lang.String r0 = X.C56682wi.A00
            r2 = 2
            android.content.Intent r1 = X.AnonymousClass190.A0F(r6, r2)
            r1.setData(r8)
            r1.setAction(r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            java.lang.String r0 = "fromNotification"
            r11 = 1
            android.content.Intent r0 = r1.putExtra(r0, r11)
            X.AnonymousClass00C.A08(r0)
            android.app.PendingIntent r10 = X.C65743Th.A00(r6, r2, r0, r9)
            X.005 r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.0xp r1 = (X.C20600xp) r1
            java.lang.String r9 = r1.A0H(r5, r12)
            java.lang.CharSequence r8 = r1.A0G(r12)
            X.0yb r0 = r4.A01
            X.0ya r0 = r0.A0O()
            r2 = 0
            if (r0 == 0) goto L_0x00c6
            android.net.Uri r0 = r7.A04(r5, r0)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r2 = r0.toString()
        L_0x00c6:
            android.graphics.Bitmap r0 = r1.A0C(r5)
            if (r0 == 0) goto L_0x0132
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.A03(r0)
        L_0x00d0:
            X.0TO r0 = new X.0TO
            r0.<init>()
            r0.A01 = r9
            r0.A00 = r1
            r0.A03 = r2
            X.0UW r7 = new X.0UW
            r7.<init>(r0)
            r0 = 0
            X.0Yy r2 = new X.0Yy
            r2.<init>(r6, r0)
            r0 = 2131102026(0x7f06094a, float:1.7816478E38)
            int r0 = X.AnonymousClass00F.A00(r6, r0)
            r2.A06 = r0
            java.lang.String r0 = "otp_notification_group"
            r2.A0N = r0
            long r0 = r12.A0I
            r2.A09(r0)
            r0 = 3
            r2.A06(r0)
            r2.A09 = r11
            r2.A0F(r9)
            r2.A0E(r8)
            r2.A0D = r10
            java.util.ArrayList r0 = r2.A0S
            r0.add(r7)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r2.A0B
            r0.icon = r1
            X.005 r0 = r4.A07
            java.lang.Object r0 = r0.get()
            X.0xw r0 = (X.C20670xw) r0
            X.AnonymousClass00C.A0B(r3)
            java.lang.String r0 = r0.A00(r3, r14)
            if (r0 == 0) goto L_0x0125
            r2.A0M = r0
        L_0x0125:
            r4.A00(r6, r2, r5, r12)
            X.1Fq r1 = r4.A03
            android.app.Notification r0 = r2.A05()
            r1.A05(r0, r3)
            return
        L_0x0132:
            r1 = 0
            goto L_0x00d0
        L_0x0134:
            r14 = 0
            goto L_0x0060
        L_0x0137:
            if (r21 == 0) goto L_0x018c
            r11 = 0
            r13 = 0
            r18 = 1
            X.1TK r10 = r1.A06
        L_0x013f:
            r17 = r22
            X.3wr r3 = r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            X.3wr r0 = r1.A03
            if (r0 == 0) goto L_0x0158
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0158
            android.os.Handler r2 = r1.A04()
            X.3wr r0 = r1.A03
            r2.removeCallbacks(r0)
        L_0x0158:
            r1.A03 = r3
            if (r20 == 0) goto L_0x017f
            long r5 = android.os.SystemClock.uptimeMillis()
            long r2 = r1.A0a
            long r5 = r5 - r2
            r3 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x017f
            java.lang.String r0 = "messagenotification/posting delayed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r2 = r1.A04()
            X.3wr r0 = r1.A03
            long r3 = r3 - r5
            r2.postDelayed(r0, r3)
        L_0x0178:
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.A0a = r2
            return
        L_0x017f:
            android.os.Handler r2 = r1.A04()
            X.3wr r0 = r1.A03
            r2.post(r0)
            goto L_0x0178
        L_0x0189:
            X.C66013Ui.A0F(r12)
        L_0x018c:
            r11 = 0
            if (r12 == 0) goto L_0x0199
            X.3Qa r0 = r12.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            r18 = 1
            if (r0 != 0) goto L_0x019b
        L_0x0199:
            r18 = 0
        L_0x019b:
            X.1TK r10 = r1.A06
            r13 = 0
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28361Si.A01(X.1Si, X.3T1, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static void A02(List list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(((AnonymousClass3LF) it.next()).A00.A1J.A01);
                sb.append(' ');
            }
            sb.toString();
        }
    }

    public AnonymousClass2Z7 A05(C605638i r15) {
        C20810yC r10 = this.A0V;
        C19630wG r7 = this.A0P;
        C19700wN r1 = this.A0I;
        C19730wQ r2 = this.A0J;
        C21100yf r3 = this.A0K;
        C23971Ao r13 = this.A0Z;
        AnonymousClass16D r4 = this.A0M;
        C21060yb r6 = this.A0O;
        return new AnonymousClass2Z7(r1, r2, r3, r4, this.A0N, r6, r7, this.A0Q, this.A0U, r10, this.A0C, r15, r13);
    }

    public AnonymousClass3LF A06(AnonymousClass3T1 r15) {
        C20810yC r10 = this.A0V;
        C19700wN r1 = this.A0I;
        C19730wQ r2 = this.A0J;
        C19630wG r7 = this.A0P;
        C21100yf r3 = this.A0K;
        C23971Ao r13 = this.A0Z;
        AnonymousClass16D r4 = this.A0M;
        C21060yb r6 = this.A0O;
        return new AnonymousClass3LF(r1, r2, r3, r4, this.A0N, r6, r7, this.A0Q, this.A0U, r10, this.A0C, r15, r13);
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0222, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0223, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a9 A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A07(X.AnonymousClass11F r23, int r24) {
        /*
            r22 = this;
            r13 = r22
            X.12q r0 = r13.A0R
            r2 = r23
            int r3 = r0.A02(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = r24
            if (r3 <= r0) goto L_0x0021
            X.1Cv r1 = r13.A0A
            r0 = 7
            int r0 = java.lang.Math.min(r3, r0)
            java.util.ArrayList r0 = r1.A07(r2, r0)
            r5.addAll(r0)
        L_0x0021:
            r4 = 0
            r3 = 0
        L_0x0023:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0038
            java.lang.Object r0 = r5.get(r3)
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            int r1 = r0.A0D
            r0 = 13
            if (r1 > r0) goto L_0x0038
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0038:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0042
            java.util.List r5 = r5.subList(r4, r3)
        L_0x0042:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r5.iterator()
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r1.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3LF r0 = r13.A06(r0)
            r12.add(r0)
            goto L_0x004b
        L_0x005f:
            java.util.List r3 = java.util.Collections.emptyList()
            X.1CR r1 = r13.A0E
            java.lang.String r0 = r2.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r1, r0)
            X.3LI r0 = r0.A02()
            boolean r0 = r0.A0H
            if (r0 != 0) goto L_0x007d
            X.1Jd r1 = r13.A0B
            r0 = 56
            java.util.List r3 = r1.A0G(r2, r0)
        L_0x007d:
            java.util.Iterator r1 = r3.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.38i r0 = (X.C605638i) r0
            X.2Z7 r0 = r13.A05(r0)
            r12.add(r0)
            goto L_0x0081
        L_0x0095:
            X.1Jd r4 = r13.A0B
            java.util.List r0 = r4.A0F(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x009f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r3.next()
            X.37G r1 = (X.AnonymousClass37G) r1
            X.1TJ r0 = r13.A05
            X.2Z6 r0 = r0.A00(r1)
            r12.add(r0)
            goto L_0x009f
        L_0x00b5:
            r0 = 67
            java.util.List r0 = r4.A0G(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r1.next()
            X.38i r0 = (X.C605638i) r0
            X.2Z7 r0 = r13.A05(r0)
            r12.add(r0)
            goto L_0x00bf
        L_0x00d3:
            r0 = 93
            java.util.List r0 = r4.A0G(r2, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r1.next()
            X.38i r0 = (X.C605638i) r0
            X.2Z7 r0 = r13.A05(r0)
            r12.add(r0)
            goto L_0x00dd
        L_0x00f1:
            X.1FZ r11 = r13.A0T
            r9 = 10
            r1 = 0
            X.163 r0 = r11.A00
            long r7 = r0.A08(r2)
            X.12q r0 = r11.A01
            long r5 = r0.A07(r2)
            X.12P r0 = r11.A05
            X.1M0 r10 = r0.get()
            X.14e r4 = r10.A02     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = "\n          SELECT \n            message_row_id,\n            last_comment_ts,\n            last_comment_message_row_id\n          FROM message_comment_parent JOIN available_message_view \n          WHERE \n            message_row_id = _id\n            AND message_comment_parent.chat_row_id = ? \n            AND last_comment_message_row_id > ?\n            AND from_me = 1\n          ORDER BY last_comment_message_row_id\n          LIMIT ?\n        "
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0220 }
            r2[r1] = r0     // Catch:{ all -> 0x0220 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0220 }
            r2[r1] = r0     // Catch:{ all -> 0x0220 }
            r1 = 2
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0220 }
            r2[r1] = r0     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "SELECT_PARENT_MESSAGES_FOR_COMMENTS_NOTIFICATION"
            android.database.Cursor r9 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "message_row_id"
            int r8 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "last_comment_ts"
            int r7 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "last_comment_message_row_id"
            int r6 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0219 }
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0219 }
            r5 = 0
            if (r0 == 0) goto L_0x01b3
            int r0 = r9.getCount()     // Catch:{ all -> 0x0219 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0219 }
            r4.<init>(r0)     // Catch:{ all -> 0x0219 }
        L_0x014b:
            long r2 = r9.getLong(r8)     // Catch:{ all -> 0x0219 }
            boolean r0 = r9.isNull(r7)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0157
            r14 = r5
            goto L_0x015f
        L_0x0157:
            long r0 = r9.getLong(r7)     // Catch:{ all -> 0x0219 }
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0219 }
        L_0x015f:
            boolean r0 = r9.isNull(r6)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0166
            goto L_0x016f
        L_0x0166:
            long r0 = r9.getLong(r6)     // Catch:{ all -> 0x0219 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0219 }
            goto L_0x0170
        L_0x016f:
            r1 = r5
        L_0x0170:
            if (r1 == 0) goto L_0x01a6
            if (r14 == 0) goto L_0x01a6
            X.1A1 r0 = r11.A07     // Catch:{ all -> 0x0219 }
            X.175 r15 = r0.A01     // Catch:{ all -> 0x0219 }
            X.3T1 r14 = r15.A01(r2)     // Catch:{ all -> 0x0219 }
            long r0 = r1.longValue()     // Catch:{ all -> 0x0219 }
            X.3T1 r1 = r15.A01(r0)     // Catch:{ all -> 0x0219 }
            if (r14 == 0) goto L_0x01a6
            if (r1 == 0) goto L_0x01a6
            boolean r0 = r1 instanceof X.AnonymousClass2bO     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x01a6
            X.3Qa r0 = r14.A1J     // Catch:{ all -> 0x0219 }
            r16 = r0
            X.AnonymousClass00C.A07(r16)     // Catch:{ all -> 0x0219 }
            long r14 = r14.A1O     // Catch:{ all -> 0x0219 }
            java.util.LinkedHashSet r17 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0219 }
            r17.<init>()     // Catch:{ all -> 0x0219 }
            X.3K6 r0 = new X.3K6     // Catch:{ all -> 0x0219 }
            r18 = r2
            r20 = r14
            r15 = r1
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0219 }
            goto L_0x01a7
        L_0x01a6:
            r0 = r5
        L_0x01a7:
            if (r0 == 0) goto L_0x01ac
            r4.add(r0)     // Catch:{ all -> 0x0219 }
        L_0x01ac:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x014b
            goto L_0x01b5
        L_0x01b3:
            X.09w r4 = X.C023409w.A00     // Catch:{ all -> 0x0219 }
        L_0x01b5:
            r9.close()     // Catch:{ all -> 0x0220 }
            r10.close()
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r9 = r4.iterator()
            r8 = r5
        L_0x01c5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r6 = r9.next()
            X.3K6 r6 = (X.AnonymousClass3K6) r6
            java.util.Set r0 = r6.A05
            r7.addAll(r0)
            if (r8 == 0) goto L_0x01e4
            X.3T1 r0 = r8.A03
            long r2 = r0.A1N
            X.3T1 r0 = r6.A03
            long r0 = r0.A1N
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x01c5
        L_0x01e4:
            r8 = r6
            goto L_0x01c5
        L_0x01e6:
            if (r8 == 0) goto L_0x0204
            java.util.Set r0 = r8.A05
            r0.addAll(r7)
            long r3 = r8.A02
            X.3Qa r6 = r8.A04
            long r1 = r8.A00
            X.3T1 r0 = r8.A03
            X.3K6 r5 = new X.3K6
            r14 = r5
            r15 = r0
            r16 = r6
            r17 = r7
            r18 = r3
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r20)
        L_0x0204:
            if (r5 == 0) goto L_0x020f
            X.1TI r0 = r13.A04
            X.2Z8 r0 = r0.A00(r5)
            r12.add(r0)
        L_0x020f:
            r1 = 1
            X.3wy r0 = new X.3wy
            r0.<init>(r1)
            java.util.Collections.sort(r12, r0)
            return r12
        L_0x0219:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x021b }
        L_0x021b:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x0220 }
            throw r0     // Catch:{ all -> 0x0220 }
        L_0x0220:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28361Si.A07(X.11F, int):java.util.ArrayList");
    }

    public void A08() {
        AnonymousClass1T9 r1 = this.A0Y;
        synchronized (r1) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }

    public void A0G(C64933Qa r10, boolean z, boolean z2) {
        if (r10 != null) {
            AnonymousClass3T1 A032 = this.A0F.A03(r10);
            if (A032 != null) {
                C66013Ui.A0F(A032);
                A01(this, A032, false, z, z2, false, false, true);
                return;
            }
            Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            return;
        }
        Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
    }

    public static boolean A03(AnonymousClass3T1 r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3LF r2 = (AnonymousClass3LF) it.next();
            if (r2.A00.A1J.equals(r4.A1J) && r2.A00.A1I == r4.A1I) {
                return true;
            }
        }
        return false;
    }

    public void A0B(AnonymousClass11F r4) {
        A04().post(new C35741jB(this, r4, 45));
        A08();
    }

    public void A0C(AnonymousClass11F r4, AnonymousClass3T1 r5) {
        A04().post(new C35631j0(this, r4, r5, 44));
    }

    public void A0D(AnonymousClass11F r4, AnonymousClass3T1 r5) {
        A04().post(new C35631j0(this, r5, r4, 45));
    }

    public void A0E(AnonymousClass3T1 r4) {
        A04().post(new C35741jB(this, r4, 47));
    }

    public void A0H(boolean z) {
        A04().post(new C35231iM(this, 6, z));
        A08();
    }

    public C28361Si(C19700wN r5, AnonymousClass1TI r6, AnonymousClass1TJ r7, AnonymousClass1TK r8, C19730wQ r9, C21100yf r10, AnonymousClass1RU r11, AnonymousClass16D r12, AnonymousClass171 r13, C21060yb r14, C19970wo r15, C19630wG r16, C25271Fq r17, C19420v0 r18, C18820ts r19, C220412q r20, C219712j r21, C24541Cv r22, AnonymousClass1FZ r23, C26171Jd r24, AnonymousClass1TA r25, C20810yC r26, C20600xp r27, AnonymousClass1TB r28, AnonymousClass1TE r29, AnonymousClass1T9 r30, AnonymousClass1CR r31, C23971Ao r32, AnonymousClass1A1 r33, C19770wU r34) {
        this.A0P = r16;
        this.A07 = r15;
        this.A0V = r26;
        this.A0S = r21;
        this.A0I = r5;
        this.A0J = r9;
        this.A0G = r34;
        this.A0R = r20;
        this.A0K = r10;
        this.A0Z = r32;
        this.A0M = r12;
        this.A0O = r14;
        this.A0N = r13;
        this.A0Q = r19;
        this.A0L = r11;
        this.A0F = r33;
        this.A0A = r22;
        this.A0E = r31;
        this.A0C = r27;
        this.A0Y = r30;
        C26171Jd r1 = r24;
        this.A0B = r1;
        this.A0U = r25;
        this.A09 = r18;
        this.A0D = r28;
        this.A08 = r17;
        this.A0X = r29;
        this.A0T = r23;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        r1.A0X = new AnonymousClass1TM(this);
    }
}
