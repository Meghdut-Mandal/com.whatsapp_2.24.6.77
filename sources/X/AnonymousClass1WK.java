package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1WK  reason: invalid class name */
public class AnonymousClass1WK extends HandlerThread {
    public long A00;
    public C200189gp A01;
    public C166107v2 A02;
    public AnonymousClass1WS A03;
    public AnonymousClass9WB A04;
    public C29281Wa A05;
    public AnonymousClass1WX A06;
    public C201609jx A07;
    public C200139gg A08;
    public final C19460v5 A09;
    public final C21390zA A0A;
    public final AnonymousClass130 A0B;
    public final AnonymousClass1VX A0C;
    public final C19700wN A0D;
    public final AnonymousClass1WJ A0E;
    public final C19730wQ A0F;
    public final AnonymousClass1DT A0G;
    public final C20300xL A0H;
    public final C21360z5 A0I;
    public final C21100yf A0J;
    public final C20050ww A0K;
    public final C29241Vw A0L;
    public final AnonymousClass1MK A0M;
    public final AnonymousClass1VR A0N;
    public final C221913g A0O;
    public final AnonymousClass1WE A0P;
    public final C19970wo A0Q;
    public final C19630wG A0R;
    public final AnonymousClass17Z A0S;
    public final C19420v0 A0T;
    public final C19900wh A0U;
    public final C220412q A0V;
    public final C20310xM A0W;
    public final AnonymousClass12P A0X;
    public final C221112x A0Y;
    public final C20810yC A0Z;
    public final C20920yN A0a;
    public final C21010yW A0b;
    public final C20350xQ A0c;
    public final AnonymousClass1VW A0d;
    public final AnonymousClass1CF A0e;
    public final AnonymousClass1VN A0f;
    public final C29091Vh A0g;
    public final AnonymousClass1WD A0h;
    public final C26931Mb A0i;
    public final AnonymousClass1VO A0j;
    public final AnonymousClass1W9 A0k;
    public final C26951Md A0l = new C26951Md("connection_thread/logged_flag/connected", false);
    public final C26951Md A0m = new C26951Md("connection_thread/logged_flag/disconnecting", false);
    public final C26951Md A0n = new C26951Md("connection_thread/logged_flag/quit", false);
    public final AnonymousClass19A A0o;
    public final AnonymousClass1MT A0p;
    public final AnonymousClass19B A0q;
    public final AnonymousClass1C5 A0r;
    public final C235819a A0s;
    public final AnonymousClass1VQ A0t;
    public final C29101Vi A0u;
    public final AnonymousClass19L A0v;
    public final C29111Vj A0w;
    public final AnonymousClass1VU A0x;
    public final C29121Vk A0y;
    public final AnonymousClass1EU A0z;
    public final AnonymousClass1PE A10;
    public final AnonymousClass1WF A11;
    public final AnonymousClass1VY A12;
    public final C29041Vc A13;
    public final AnonymousClass1WI A14;
    public final AnonymousClass1VS A15;
    public final AnonymousClass13I A16;
    public final AnonymousClass12U A17;
    public final AnonymousClass1VT A18;
    public final C29251Vx A19;
    public final AnonymousClass1A1 A1A;
    public final C231017e A1B;
    public final C19770wU A1C;
    public final C21380z9 A1D;
    public final C24961El A1E;
    public final AnonymousClass19O A1F;
    public final AnonymousClass005 A1G;
    public final AnonymousClass005 A1H;
    public final Map A1I = new HashMap(0);
    public final Random A1J;
    public final Set A1K;

    public static int A00(int i, int i2) {
        return i2 != -1 ? i2 : i;
    }

    public static Message A01() {
        return Message.obtain((Handler) null, 0, 24, 0);
    }

    public static Message A02() {
        return Message.obtain((Handler) null, 0, 22, 0);
    }

    public static Message A03() {
        return Message.obtain((Handler) null, 0, 0, 0);
    }

    public static Message A04() {
        return Message.obtain((Handler) null, 0, 23, 0);
    }

    public static Message A05(List list) {
        return Message.obtain((Handler) null, 0, 406, 0, list);
    }

    private C122695vH A07(AnonymousClass6L6 r10, int i) {
        try {
            C200189gp A022 = this.A0h.A02(r10);
            this.A01 = A022;
            A022.A05(30000);
            A0J();
            int nextInt = this.A1J.nextInt();
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionThread/tryOpenSocket: socket connected; sessionId=");
            sb.append(nextInt);
            Log.i(sb.toString());
            ((C28791Ub) this.A1H.get()).A00();
            AnonymousClass6FQ r3 = new AnonymousClass6FQ(r10.A02, nextInt, r10.A00, i);
            AnonymousClass005 r2 = this.A1G;
            ((AnonymousClass1W5) r2.get()).A03(r3);
            try {
                InputStream A002 = AnonymousClass1WD.A00(this.A01, r10);
                C20050ww r8 = this.A0K;
                C1032754q r5 = new C1032754q(r8, (AnonymousClass1W5) r2.get(), A002, 1);
                C1032854r r22 = new C1032854r(r8, (AnonymousClass1W5) r2.get(), AnonymousClass1WD.A01(this.A01, r10), 1);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ConnectionThread/tryOpenSocket: created IO streams; sessionId=");
                sb2.append(nextInt);
                Log.i(sb2.toString());
                this.A0t.A08(r3);
                return new C122695vH(r10, r3, r5, r22);
            } catch (IOException e) {
                this.A0t.A0B(r3, 3);
                throw e;
            }
        } catch (SocketException e2) {
            this.A0t.A0B(new AnonymousClass6FQ(r10.A02, 0, r10.A00, i), 2);
            throw e2;
        } catch (IOException e3) {
            this.A0t.A0B(new AnonymousClass6FQ(r10.A02, 0, r10.A00, i), 3);
            throw e3;
        }
    }

    private void A0I() {
        A13(false);
    }

    /* access modifiers changed from: private */
    public void A0N() {
        A0U(8, 0, true);
    }

    public static final void A0e(C20920yN r2, String str) {
        AnonymousClass00C.A0D(r2, 0);
        r2.BqE(str, 2795, 0);
        r2.BqE(str, 2795, 1);
    }

    private void A0v(AnonymousClass8SR r8, C29021Va r9, C200139gg r10, AnonymousClass6FQ r11, AtomicReference atomicReference, AtomicReference atomicReference2) {
        AnonymousClass1VQ r1;
        int i;
        try {
            A0w(r8, r9, r10, atomicReference, atomicReference2);
            this.A0T.A0x();
            this.A0t.A07(r11);
        } catch (C235919b e) {
            e = e;
            r1 = this.A0t;
            i = 7;
            r1.A0A(r11, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0t;
            i = 8;
            r1.A0A(r11, i);
            throw e;
        } catch (AnonymousClass1WL e3) {
            e = e3;
            r1 = this.A0t;
            i = 9;
            r1.A0A(r11, i);
            throw e;
        }
    }

    private void A11(AnonymousClass6FQ r14, int i, int i2, int i3, int i4, long j, long j2) {
        C20890yK A002 = this.A0t.A00(r14, i, i2, i3, i4, j, (long) 6, j2);
        if (A002 != null) {
            if (i == 1 || i == 5) {
                this.A0b.Bly(A002);
            } else {
                this.A0b.Blw(A002);
            }
        }
        AnonymousClass1MT r0 = this.A0p;
        if (i == 1) {
            r0.A01();
        } else {
            r0.A00();
        }
    }

    private HashMap A0G(C193399Lh r43, C199709fp r44, Map map) {
        HashMap hashMap = new HashMap();
        C199709fp r41 = r44;
        Map map2 = map;
        C195859Wi r2 = new C195859Wi(r43, r41, map2, this.A1I);
        for (C29261Vy B4x : this.A1K) {
            A10(B4x.B4x(r2), hashMap);
        }
        C19970wo r40 = this.A0Q;
        C20810yC r39 = this.A0Z;
        C19700wN r38 = this.A0D;
        C21010yW r37 = this.A0b;
        AnonymousClass19A r23 = this.A0o;
        C29111Vj r24 = this.A0w;
        C29121Vk r15 = this.A0y;
        AnonymousClass1W9 r14 = this.A0k;
        A10(new C182038oR(r38, r40, r39, r37, r41, r14, r23, r24, r15, map2), hashMap);
        C19730wQ r13 = this.A0F;
        AnonymousClass1VN r12 = this.A0f;
        AnonymousClass1DT r11 = this.A0G;
        AnonymousClass1EU r10 = this.A0z;
        C20310xM r9 = this.A0W;
        C231017e r7 = this.A1B;
        C24961El r5 = this.A1E;
        AnonymousClass1CF r4 = this.A0e;
        AnonymousClass1VY r3 = this.A12;
        C19420v0 r22 = this.A0T;
        C19700wN r152 = r38;
        C19730wQ r16 = r13;
        AnonymousClass1DT r17 = r11;
        AnonymousClass1WE r18 = this.A0P;
        C19970wo r19 = r40;
        A10(new C182018oP(r152, r16, r17, r18, r19, r22, r9, r39, r37, r4, r12, r41, r14, r23, r24, r15, r10, this.A10, r3, r7, r5, map2), hashMap);
        C199709fp r153 = r41;
        A10(new C182108oY(r38, r13, r40, r22, r39, r37, r153, r153, map2), hashMap);
        return hashMap;
    }

    private C202619mJ A0H(AnonymousClass8SR r12, AnonymousClass6FQ r13, InputStream inputStream, OutputStream outputStream, AZA aza, AZ8 az8) {
        AnonymousClass1VQ r1;
        int i;
        try {
            C202619mJ r2 = new C202619mJ(this.A0Q, this.A0S, r12, this.A18, inputStream, outputStream, aza, az8);
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionThread/performHandshake: completed noise handshake; sessionId=");
            sb.append(r13.A04);
            Log.i(sb.toString());
            this.A0t.A06(r13);
            return r2;
        } catch (AnonymousClass1WM e) {
            e = e;
            r1 = this.A0t;
            i = 4;
            r1.A09(r13, i);
            throw e;
        } catch (IOException e2) {
            e = e2;
            r1 = this.A0t;
            i = 5;
            r1.A09(r13, i);
            throw e;
        } catch (AnonymousClass1WO e3) {
            e = e3;
            r1 = this.A0t;
            i = 6;
            r1.A09(r13, i);
            throw e;
        }
    }

    private void A0J() {
        String str;
        if (!this.A01.A0A()) {
            str = "ConnectionThread/configureTcpKeepalive: not supported";
        } else {
            C20810yC r2 = this.A0Z;
            if (!r2.A0E(7831)) {
                str = "ConnectionThread/configureTcpKeepalive: not enabled";
            } else {
                try {
                    this.A01.A03();
                    this.A01.A06(r2.A07(7832));
                    this.A01.A07(r2.A07(7833));
                    this.A01.A08(r2.A07(7834));
                } catch (Exception e) {
                    Log.e("ConnectionThread/configureTcpKeepalive: failed to set socket options", e);
                    this.A0D.A0D("setsockopt-tcp-keepalive", e.getMessage(), e);
                }
                str = "ConnectionThread/configureTcpKeepalive: set socket options";
            }
        }
        Log.i(str);
    }

    private void A0L() {
        this.A05.Bpy(A02());
    }

    /* access modifiers changed from: private */
    public void A0O() {
        this.A05.Bpy(A01());
        AnonymousClass1VX r1 = this.A0C;
        if (r1.A02()) {
            r1.A01();
        }
    }

    /* access modifiers changed from: private */
    public void A0P() {
        this.A05.Bpy(A04());
    }

    /* access modifiers changed from: private */
    public void A0Q() {
        this.A05.Bpy(C203429o0.A05(true));
        this.A03.A02();
    }

    /* access modifiers changed from: private */
    public void A0R(int i) {
        if (this.A0M.A00()) {
            Log.i("ConnectionThread/handleLogoutTimeout/skip-voip-active");
            this.A03.A07(i);
            A0L();
            return;
        }
        ((AnonymousClass1W5) this.A1G.get()).A02(i);
        Log.i("ConnectionThread/handleLogoutTimeout/close-socket");
        A0I();
    }

    /* access modifiers changed from: private */
    public void A0S(int i) {
        this.A0n.A00(true);
        A15(false, i);
    }

    /* access modifiers changed from: private */
    public void A0U(int i, long j, boolean z) {
        if (j > 0) {
            long j2 = this.A00;
            if (j2 > j) {
                StringBuilder sb = new StringBuilder();
                sb.append("ConnectionThread/handleDisconnect/skip disconnectRequestTime:");
                sb.append(j);
                sb.append(" lastConnectedTime:");
                sb.append(j2);
                Log.i(sb.toString());
                return;
            }
        }
        A15(z, i);
    }

    private void A0V(long j) {
        C19420v0 r1 = this.A0T;
        r1.A1H(j);
        r1.A25(false);
    }

    private void A0W(long j, long j2) {
        AnonymousClass2NL r3 = new AnonymousClass2NL();
        long abs = Math.abs(j - j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(abs);
        if (timeUnit.toMinutes(abs) % 60 >= 30) {
            hours++;
        }
        if (j < j2) {
            hours *= -1;
        }
        if (hours != 0) {
            r3.A00 = Long.valueOf(hours);
            this.A0b.Bly(r3);
        }
    }

    /* access modifiers changed from: private */
    public void A0Z(Message message) {
        this.A05.Bpy(Message.obtain(message));
        if (C1900396q.A00(message) == 37) {
            this.A03.A02();
        }
    }

    public static void A0d(C19420v0 r3, C20920yN r4, C203399nx r5) {
        String A0g2 = r5.A0g("location");
        if (TextUtils.isEmpty(A0g2) || A0g2.length() < 40) {
            A0e(r4, A0g2);
            r3.A1S(A0g2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0400, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0401, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0408, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0409, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x040e, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0410, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0412, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0413, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0414, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x043f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0440, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0441, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x046c, code lost:
        if (r0.A01 != null) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0499, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x049a, code lost:
        r5 = 8;
        r3 = 0;
        r12 = false;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a1, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a2, code lost:
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ab, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04ac, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ae, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04af, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04b3, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04b4, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04c9, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04cb, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04cc, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04d1, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04d2, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04d6, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04d7, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04d8, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04da, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04db, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04dd, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04de, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04ef, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04f0, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04f2, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04f3, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x057c, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x057e, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x057f, code lost:
        r5 = 8;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0585, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0586, code lost:
        r5 = 8;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x058b, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x058e, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x058f, code lost:
        r2 = -1;
        r5 = 8;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0678, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0679, code lost:
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x067b, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030e A[Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x040e A[ExcHandler: 19b (e X.19b), PHI: r20 
      PHI: (r20v36 int) = (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int), (r20v5 int), (r20v5 int) binds: [B:44:0x0119, B:45:?, B:53:0x0136, B:63:0x015c, B:64:?, B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:96:0x02ac, B:97:?, B:90:0x0261, B:85:0x01c4, B:86:?, B:79:0x01b4, B:73:0x0188, B:69:0x0177, B:60:0x0157] A[DONT_GENERATE, DONT_INLINE], Splitter:B:98:0x02b1] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0410 A[ExcHandler: IOException (e java.io.IOException), PHI: r20 
      PHI: (r20v35 int) = (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int), (r20v5 int), (r20v5 int) binds: [B:44:0x0119, B:45:?, B:53:0x0136, B:63:0x015c, B:64:?, B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:96:0x02ac, B:97:?, B:90:0x0261, B:85:0x01c4, B:86:?, B:79:0x01b4, B:73:0x0188, B:69:0x0177, B:60:0x0157] A[DONT_GENERATE, DONT_INLINE], Splitter:B:44:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0412 A[ExcHandler: 19b (e X.19b), PHI: r1 
      PHI: (r1v49 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:40:0x0112, B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:40:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x042f A[Catch:{ 1WL -> 0x0599, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x043f A[ExcHandler: IOException (e java.io.IOException), PHI: r1 
      PHI: (r1v46 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:40:0x0112, B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:40:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x045c A[Catch:{ 1WL -> 0x0599, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0473 A[Catch:{ 1WL -> 0x0599, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04ab A[ExcHandler: 1WO (e X.1WO), PHI: r20 
      PHI: (r20v41 int) = (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int) binds: [B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:101:0x02cc, B:73:0x0188] A[DONT_GENERATE, DONT_INLINE], Splitter:B:66:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ae A[ExcHandler: 1WN (e X.1WN), PHI: r20 
      PHI: (r20v40 int) = (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int) binds: [B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:101:0x02cc, B:73:0x0188] A[DONT_GENERATE, DONT_INLINE], Splitter:B:66:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04c9 A[ExcHandler: all (th java.lang.Throwable), PHI: r20 
      PHI: (r20v34 int) = (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int) binds: [B:44:0x0119, B:45:?, B:53:0x0136, B:63:0x015c, B:64:?, B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:73:0x0188] A[DONT_GENERATE, DONT_INLINE], Splitter:B:44:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04cb A[ExcHandler: 1WM (e X.1WM), PHI: r1 
      PHI: (r1v52 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:42:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04d1 A[ExcHandler: 1WM (e X.1WM), PHI: r20 
      PHI: (r20v39 int) = (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int) binds: [B:66:0x016e, B:82:0x01ba, B:87:0x01c7, B:93:0x0274, B:98:0x02b1, B:101:0x02cc, B:73:0x0188] A[DONT_GENERATE, DONT_INLINE], Splitter:B:66:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04d6 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v38 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:40:0x0112, B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:40:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04da A[ExcHandler: 1WO (e X.1WO), PHI: r1 
      PHI: (r1v36 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:40:0x0112, B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:40:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04dd A[ExcHandler: 1WO (e X.1WO), PHI: r20 
      PHI: (r20v33 int) = (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int), (r20v5 int) binds: [B:44:0x0119, B:45:?, B:53:0x0136, B:63:0x015c, B:64:?, B:96:0x02ac, B:97:?, B:90:0x0261, B:85:0x01c4, B:86:?, B:79:0x01b4, B:69:0x0177, B:60:0x0157] A[DONT_GENERATE, DONT_INLINE], Splitter:B:44:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ef A[ExcHandler: 1WN (e X.1WN), PHI: r1 
      PHI: (r1v32 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v66 X.6FQ) binds: [B:40:0x0112, B:42:0x0116, B:43:?, B:49:0x012b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:40:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04f2 A[ExcHandler: 1WN (e X.1WN), PHI: r20 
      PHI: (r20v32 int) = (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v5 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v42 int), (r20v5 int), (r20v5 int) binds: [B:44:0x0119, B:45:?, B:53:0x0136, B:63:0x015c, B:64:?, B:96:0x02ac, B:97:?, B:90:0x0261, B:85:0x01c4, B:86:?, B:79:0x01b4, B:69:0x0177, B:60:0x0157] A[DONT_GENERATE, DONT_INLINE], Splitter:B:44:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x054e A[Catch:{ 1WL -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x058b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05d5 A[Catch:{ all -> 0x0673 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x05d7 A[Catch:{ all -> 0x0673 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0678 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 r9 r20 
      PHI: (r1v22 X.6FQ) = (r1v19 X.6FQ), (r1v19 X.6FQ), (r1v44 X.6FQ), (r1v47 X.6FQ) binds: [B:38:0x00f0, B:39:?, B:200:0x0456, B:184:0x0429] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v9 boolean) = (r9v6 boolean), (r9v6 boolean), (r9v24 boolean), (r9v25 boolean) binds: [B:38:0x00f0, B:39:?, B:200:0x0456, B:184:0x0429] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v8 int) = (r20v5 int), (r20v5 int), (r20v27 int), (r20v29 int) binds: [B:38:0x00f0, B:39:?, B:200:0x0456, B:184:0x0429] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0493 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0493 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0493 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(com.whatsapp.jid.UserJid r65, X.AnonymousClass1VM r66, java.lang.String r67, boolean r68, boolean r69) {
        /*
            r64 = this;
            java.lang.String r28 = "ConnectionThread/connect/socket/disconnect "
            java.lang.String r27 = "ConnectionThread/connect/socket/closed"
            r0 = r64
            X.13g r1 = r0.A0O
            boolean r26 = r1.A02()
            r43 = r65
            if (r65 != 0) goto L_0x0018
            if (r26 != 0) goto L_0x0018
            java.lang.String r0 = "ConnectionThread/connect/ignored/jid null and not in companion reg"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0017:
            return
        L_0x0018:
            X.1Md r1 = r0.A0l
            r63 = r1
            boolean r1 = r63.A01()
            if (r1 != 0) goto L_0x0017
            X.19B r1 = r0.A0q
            r62 = r1
            r62.A06()
            X.1W9 r1 = r0.A0k
            r1.A01()
            X.0z5 r2 = r0.A0I
            boolean r1 = r2.A03()
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/clock"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1Mb r0 = r0.A0i
            r0.BTq()
            return
        L_0x0041:
            if (r26 != 0) goto L_0x0051
            X.13I r1 = r0.A16
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "ConnectionThread/connect/not-allowed/login-failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0051:
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.1Mb r0 = r0.A0i
            r0.Bgr()
            return
        L_0x0062:
            X.1Md r1 = r0.A0n
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = "ConnectionThread/connect/not-allowed/quit-flag-set"
            r0.A12(r1)
            return
        L_0x0070:
            java.lang.String r1 = "ConnectionThread/connect"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1VQ r14 = r0.A0t
            r14.A01()
            X.1Mb r11 = r0.A0i
            r11.BUL()
            X.9gp r1 = r0.A01
            if (r1 == 0) goto L_0x008c
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x008c
            r0.A0I()
        L_0x008c:
            X.1VO r1 = r0.A0j
            java.util.ArrayList r34 = r1.A01()
            X.0wo r1 = r0.A0Q
            r61 = r1
            long r47 = r61.A05()
            X.0v0 r1 = r0.A0T
            r60 = r1
            int r1 = r60.A07()
            int r7 = r1 + 1
            r3 = 0
            r2 = -1
            r4 = 0
            X.6FQ r1 = new X.6FQ
            r1.<init>(r4, r3, r2, r3)
            java.util.concurrent.atomic.AtomicReference r57 = new java.util.concurrent.atomic.AtomicReference
            r57.<init>()
            r4 = 1
            r19 = r68
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            X.12x r8 = r0.A0Y     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            X.0yC r4 = r0.A0Z     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            r59 = r4
            X.1VS r4 = r0.A15     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            X.3QR r32 = r4.A00()     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            java.util.Random r6 = r0.A1J     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            r4 = -1
            r5 = 0
            X.6V9 r25 = new X.6V9     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            r33 = r67
            r29 = r25
            r30 = r8
            r31 = r59
            r35 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            int r8 = r60.A0G()     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            r6 = r25
            r6.A04(r8)     // Catch:{ 1WL -> 0x05a6, all -> 0x05a0 }
            r9 = 0
            r20 = -1
        L_0x00e2:
            boolean r2 = r25.A05()     // Catch:{ 1WL -> 0x058e, all -> 0x058b }
            if (r2 == 0) goto L_0x056c
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x057e, all -> 0x058b }
            if (r2 != 0) goto L_0x056c
            int r24 = r3 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            r3.<init>()     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            java.lang.String r2 = "ConnectionThread/connect: connecting; attempt="
            r3.append(r2)     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            r2 = r24
            r3.append(r2)     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            java.lang.String r2 = " state="
            r3.append(r2)     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            int r2 = r25.A02()     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            r3.append(r2)     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            java.lang.String r2 = r3.toString()     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 1WL -> 0x0585, all -> 0x0678 }
            int r8 = r25.A02()     // Catch:{ 1WM -> 0x0515, 1WN -> 0x04ef, IOException -> 0x043f, 19b -> 0x0412, 1WO -> 0x04da, all -> 0x04d6 }
            X.6FQ r3 = new X.6FQ     // Catch:{ 1WM -> 0x04cb, 1WN -> 0x04ef, IOException -> 0x043f, 19b -> 0x0412, 1WO -> 0x04da, all -> 0x04d6 }
            r6 = 0
            r3.<init>(r6, r5, r4, r8)     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            r1 = r25
            X.6L6 r6 = r0.A09(r1, r8)     // Catch:{ 1WM -> 0x04c4, 1WN -> 0x04bf, IOException -> 0x0406, 19b -> 0x03fe, 1WO -> 0x04ba, all -> 0x04b1 }
            int r4 = r6.A00     // Catch:{ 1WM -> 0x04c4, 1WN -> 0x04bf, IOException -> 0x0406, 19b -> 0x03fe, 1WO -> 0x04ba, all -> 0x04b1 }
            X.5q3 r2 = r6.A02     // Catch:{ 1WM -> 0x04c4, 1WN -> 0x04bf, IOException -> 0x0406, 19b -> 0x03fe, 1WO -> 0x04ba, all -> 0x04b1 }
            X.6FQ r1 = new X.6FQ     // Catch:{ 1WM -> 0x04c4, 1WN -> 0x04bf, IOException -> 0x0406, 19b -> 0x03fe, 1WO -> 0x04ba, all -> 0x04b1 }
            r1.<init>(r2, r5, r4, r8)     // Catch:{ 1WM -> 0x04c4, 1WN -> 0x04bf, IOException -> 0x0406, 19b -> 0x03fe, 1WO -> 0x04ba, all -> 0x04b1 }
            X.5vH r8 = r0.A07(r6, r8)     // Catch:{ 1WM -> 0x04cb, 1WN -> 0x04ef, IOException -> 0x043f, 19b -> 0x0412, 1WO -> 0x04da, all -> 0x04d6 }
            X.6FQ r1 = r8.A01     // Catch:{ 1WM -> 0x04cb, 1WN -> 0x04ef, IOException -> 0x043f, 19b -> 0x0412, 1WO -> 0x04da, all -> 0x04d6 }
            X.7v2 r6 = new X.7v2     // Catch:{ 1WM -> 0x04cb, 1WN -> 0x04ef, IOException -> 0x0408, 19b -> 0x0400, 1WO -> 0x04da, all -> 0x04b3 }
            r6.<init>(r0)     // Catch:{ 1WM -> 0x04cb, 1WN -> 0x04ef, IOException -> 0x0408, 19b -> 0x0400, 1WO -> 0x04da, all -> 0x04b3 }
            X.9fp r4 = new X.9fp     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            r2 = r61
            r4.<init>(r2, r6)     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            boolean r23 = r60.A2Q()     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            boolean r22 = r62.A09()     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            X.1VU r2 = r0.A0x     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            r58 = r2
            boolean r21 = r58.A01()     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            if (r26 != 0) goto L_0x015b
            if (r69 != 0) goto L_0x0157
            if (r22 != 0) goto L_0x0157
            if (r23 != 0) goto L_0x0157
            if (r21 == 0) goto L_0x015b
        L_0x0157:
            java.lang.Boolean r2 = X.C18750th.A03     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            r3 = 1
            goto L_0x015c
        L_0x015b:
            r3 = 0
        L_0x015c:
            X.1Vh r5 = r0.A0g     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            int r15 = r1.A04     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            X.5q3 r2 = r1.A05     // Catch:{ 1WM -> 0x04ce, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x04c9 }
            r44 = r66
            r41 = r5
            r42 = r2
            r45 = r15
            r46 = r7
            r49 = r3
            X.8SR r50 = r41.A01(r42, r43, r44, r45, r46, r47, r49)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r1.A03(r3)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r3 == 0) goto L_0x0183
            int r2 = r62.A03()     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            long r12 = (long) r2     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            r1.A02(r2)     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
        L_0x0183:
            if (r26 == 0) goto L_0x0188
            r55 = 0
            goto L_0x018e
        L_0x0188:
            X.130 r2 = r0.A0B     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.AZ8 r55 = r2.A0F()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
        L_0x018e:
            X.130 r10 = r0.A0B     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.5q4 r5 = r10.A0D()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            int r2 = r5.A00     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r20 = r2
            X.AZA r2 = r5.A01     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r2 == 0) goto L_0x03ed
            java.io.InputStream r12 = r8.A02     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.io.OutputStream r5 = r8.A03     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r49 = r0
            r51 = r1
            r52 = r12
            r53 = r5
            r54 = r2
            X.9mJ r12 = r49.A0H(r50, r51, r52, r53, r54, r55)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.AZ8 r5 = r12.A05()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r55 == 0) goto L_0x01b9
            byte[] r8 = r55.A00()     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            goto L_0x01ba
        L_0x01b9:
            r8 = 0
        L_0x01ba:
            byte[] r2 = r5.A00()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            boolean r2 = java.util.Arrays.equals(r8, r2)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r2 != 0) goto L_0x01c7
            r10.A0I(r5)     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
        L_0x01c7:
            X.19D r8 = new X.19D     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r8.<init>()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.0wN r2 = r0.A0D     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9Ii r10 = r12.A03()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.1Va r13 = new X.1Va     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5 = r59
            r13.<init>(r2, r5, r8, r10)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9R9 r10 = r12.A04()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9nk r12 = new X.9nk     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r12.<init>(r2, r5, r8, r10)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.util.concurrent.ConcurrentHashMap r10 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r10.<init>()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.1WJ r5 = r0.A0E     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9Lh r5 = r5.A00(r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.util.HashMap r41 = r0.A0G(r5, r4, r10)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.0wQ r5 = r0.A0F     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r32 = r5
            X.12q r5 = r0.A0V     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r34 = r5
            X.0yW r5 = r0.A0b     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r18 = r5
            X.19A r5 = r0.A0o     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r17 = r5
            X.19O r5 = r0.A1F     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r16 = r5
            X.0z9 r5 = r0.A1D     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r44 = r5
            X.0zA r8 = r0.A0A     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9jx r5 = new X.9jx     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r29 = r5
            r30 = r8
            r31 = r2
            r33 = r61
            r35 = r59
            r36 = r18
            r37 = r17
            r38 = r13
            r39 = r44
            r40 = r16
            r42 = r10
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r0.A07 = r5     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.5mM r8 = new X.5mM     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r8.<init>(r0)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.0wG r5 = r0.A0R     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r18 = r5
            X.0wU r5 = r0.A1C     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r17 = r5
            X.0yf r5 = r0.A0J     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r31 = r5
            X.19L r5 = r0.A0v     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r16 = r5
            X.9gg r5 = new X.9gg     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r29 = r5
            r30 = r2
            r32 = r18
            r33 = r60
            r34 = r59
            r35 = r8
            r36 = r4
            r37 = r16
            r38 = r12
            r39 = r17
            r40 = r10
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r0.A08 = r5     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.util.concurrent.atomic.AtomicReference r56 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r56.<init>()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r26 != 0) goto L_0x0273
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            r51 = r0
            r52 = r50
            r53 = r13
            r54 = r4
            r55 = r1
            r51.A0v(r52, r53, r54, r55, r56, r57)     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            r8 = 17
            goto L_0x0274
        L_0x0273:
            r8 = 3
        L_0x0274:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5.<init>()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.lang.String r4 = "ConnectionThread/connect: switching to "
            r5.append(r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5.append(r8)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.lang.String r4 = " minute read timeout; sessionId="
            r5.append(r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5.append(r15)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.lang.String r4 = r5.toString()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9gp r4 = r0.A01     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            int r5 = r8 * 60
            int r5 = r5 * 1000
            r4.A05(r5)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            long r4 = r61.A07()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r0.A00 = r4     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            boolean r5 = r4.A06()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.1Vx r4 = r0.A19     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r4.A00()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r5 == 0) goto L_0x02b1
            X.1Vw r4 = r0.A0L     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
            r4.A00()     // Catch:{ 1WM -> 0x04a1, 1WN -> 0x04f2, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04dd, all -> 0x0499 }
        L_0x02b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5.<init>()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.lang.String r4 = "ConnectionThread/connect: fetching client config; sessionId="
            r5.append(r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r5.append(r15)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            java.lang.String r4 = r5.toString()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            r4.A03()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0410, 19b -> 0x040e, 1WO -> 0x04ab, all -> 0x04c9 }
            if (r26 != 0) goto L_0x0317
            int r4 = r31.A03()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0313, 19b -> 0x030f, 1WO -> 0x04ab, all -> 0x0542 }
            java.lang.Object r5 = r56.get()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0313, 19b -> 0x030f, 1WO -> 0x04ab, all -> 0x0542 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0313, 19b -> 0x030f, 1WO -> 0x04ab, all -> 0x0542 }
            if (r5 == 0) goto L_0x02e2
            int r5 = r5.intValue()     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0313, 19b -> 0x030f, 1WO -> 0x04ab, all -> 0x0542 }
            if (r5 == r4) goto L_0x02e2
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04d1, 1WN -> 0x04ae, IOException -> 0x0313, 19b -> 0x030f, 1WO -> 0x04ab, all -> 0x0542 }
            r8 = 1
            goto L_0x02ed
        L_0x02e2:
            r8 = 1
            X.0wh r4 = r0.A0U     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            boolean r4 = r4.A03()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r4 == 0) goto L_0x02f1
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x02ed:
            r4.A05(r8)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            goto L_0x030c
        L_0x02f1:
            long r17 = r61.A02()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r15 = r31.A06()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r12 = r31.A05()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r12 = r12 + r15
            int r4 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r4 < 0) goto L_0x0306
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x030c
        L_0x0306:
            X.9gg r5 = r0.A08     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4 = 0
            r5.A05(r4)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x030c:
            if (r68 == 0) goto L_0x031e
            goto L_0x0319
        L_0x030f:
            r4 = move-exception
            r8 = 1
            goto L_0x0415
        L_0x0313:
            r4 = move-exception
            r8 = 1
            goto L_0x0442
        L_0x0317:
            r8 = 1
            goto L_0x031e
        L_0x0319:
            X.9gg r4 = r0.A08     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4.A02()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x031e:
            X.9jx r5 = r0.A07     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            X.8rN r4 = new X.8rN     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4.<init>(r2, r6, r5)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4.start()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r2 = r63
            r2.A00(r8)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            java.lang.String r4 = "offline_resume"
            r2 = r44
            r2.A01(r4, r8)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            X.9gp r2 = r0.A01     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            java.net.InetAddress r2 = r2.A01()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            boolean r9 = r2 instanceof java.net.Inet6Address     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4 = 0
            r2 = r60
            r2.A16(r4)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r0.A02 = r6     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r26 != 0) goto L_0x03c9
            if (r69 != 0) goto L_0x036d
            if (r22 == 0) goto L_0x036d
            java.util.ArrayList r2 = r62.A05()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            boolean r4 = r2.isEmpty()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r4 != 0) goto L_0x036d
            int r4 = r2.size()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            int r4 = r4 - r8
            java.lang.Object r4 = r2.get(r4)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            X.9WB r4 = (X.AnonymousClass9WB) r4     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r0.A04 = r4     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r2.size()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            X.1Wa r4 = r0.A05     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            android.os.Message r2 = A05(r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r4.Bpy(r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x036d:
            if (r23 == 0) goto L_0x0383
            X.0xL r2 = r0.A0H     // Catch:{ InterruptedException -> 0x037c, ExecutionException -> 0x0375 }
            r2.A04()     // Catch:{ InterruptedException -> 0x037c, ExecutionException -> 0x0375 }
            goto L_0x038e
        L_0x0375:
            r4 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/execution-exception"
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            goto L_0x038e
        L_0x037c:
            r4 = move-exception
            java.lang.String r2 = "ConnectionThread/connect/signal/interrupted-exception"
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            goto L_0x038e
        L_0x0383:
            boolean r2 = r60.A2O()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r2 == 0) goto L_0x038e
            X.0xL r2 = r0.A0H     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r2.A06()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x038e:
            if (r69 != 0) goto L_0x03a5
            if (r3 == 0) goto L_0x03a5
            if (r21 == 0) goto L_0x0395
            goto L_0x0399
        L_0x0395:
            r0.A0Q()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            goto L_0x03a5
        L_0x0399:
            r2 = 18
            X.1j8 r3 = new X.1j8     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r3.<init>(r0, r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r2 = r58
            r2.A00(r3)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x03a5:
            java.lang.Integer r4 = r60.A0Z()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r4 == 0) goto L_0x03bc
            X.12P r2 = r0.A0X     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            boolean r2 = r2.A07()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r2 == 0) goto L_0x03bc
            X.0xQ r3 = r0.A0c     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            int r2 = r4.intValue()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r3.A0U(r2, r8)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x03bc:
            X.1VX r3 = r0.A0C     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            boolean r2 = r3.A02()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r2 == 0) goto L_0x03c9
            if (r68 == 0) goto L_0x03c9
            r3.A01()     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x03c9:
            r3 = 1190(0x4a6, float:1.668E-42)
            r2 = r59
            boolean r2 = r2.A0E(r3)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            if (r2 == 0) goto L_0x03dc
            X.9gg r2 = r0.A08     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r4 = r2.A02     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r2 = r2.A01     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r0.A0W(r4, r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x03dc:
            X.9gg r2 = r0.A08     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r4 = r2.A02     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r12
            long r2 = r2.A01     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            long r2 = r2 * r12
            r10 = r61
            r10.A09(r4, r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            goto L_0x0474
        L_0x03ed:
            r8 = 1
            java.lang.String r2 = "ConnectionThread/connect/failed to load auth key, postponing login"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r3 = 0
            X.1WN r2 = new X.1WN     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            r2.<init>(r3)     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
            throw r2     // Catch:{ 1WM -> 0x04a9, 1WN -> 0x04a7, IOException -> 0x03fc, 19b -> 0x03fa, 1WO -> 0x04a5 }
        L_0x03fa:
            r4 = move-exception
            goto L_0x0415
        L_0x03fc:
            r4 = move-exception
            goto L_0x0442
        L_0x03fe:
            r4 = move-exception
            goto L_0x0402
        L_0x0400:
            r4 = move-exception
            r3 = r1
        L_0x0402:
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x0415
        L_0x0406:
            r4 = move-exception
            goto L_0x040a
        L_0x0408:
            r4 = move-exception
            r3 = r1
        L_0x040a:
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x0442
        L_0x040e:
            r4 = move-exception
            goto L_0x0414
        L_0x0410:
            r4 = move-exception
            goto L_0x0441
        L_0x0412:
            r4 = move-exception
            r6 = 0
        L_0x0414:
            r8 = 1
        L_0x0415:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ed }
            r3.<init>()     // Catch:{ all -> 0x04ed }
            java.lang.String r2 = "ConnectionThread/connect/socket/next-port/corrupt-stream-exception "
            r3.append(r2)     // Catch:{ all -> 0x04ed }
            r3.append(r4)     // Catch:{ all -> 0x04ed }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x04ed }
            com.whatsapp.util.Log.i(r2, r4)     // Catch:{ all -> 0x04ed }
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x0493
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x043a
            boolean r2 = r2.A09()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x043a
            goto L_0x0466
        L_0x043a:
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x0471
            goto L_0x046e
        L_0x043f:
            r4 = move-exception
            r6 = 0
        L_0x0441:
            r8 = 1
        L_0x0442:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ed }
            r3.<init>()     // Catch:{ all -> 0x04ed }
            r2 = r28
            r3.append(r2)     // Catch:{ all -> 0x04ed }
            r3.append(r4)     // Catch:{ all -> 0x04ed }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x04ed }
            com.whatsapp.util.Log.i(r2, r4)     // Catch:{ all -> 0x04ed }
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x0493
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x046a
            boolean r2 = r2.A09()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x046a
        L_0x0466:
            r0.A0I()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            goto L_0x0471
        L_0x046a:
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x0471
        L_0x046e:
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
        L_0x0471:
            if (r6 == 0) goto L_0x0493
            goto L_0x0487
        L_0x0474:
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x0493
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x048b
            boolean r2 = r2.A09()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 != 0) goto L_0x048b
            r0.A0I()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
        L_0x0487:
            r6.A00()     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            goto L_0x0493
        L_0x048b:
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            if (r2 == 0) goto L_0x0487
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ 1WL -> 0x0599, all -> 0x0678 }
            goto L_0x0487
        L_0x0493:
            r3 = r24
            r5 = 0
            r4 = -1
            goto L_0x00e2
        L_0x0499:
            r4 = move-exception
            r5 = 8
            r3 = 0
            r12 = 0
            r8 = 1
            goto L_0x0548
        L_0x04a1:
            r4 = move-exception
            r5 = 8
            goto L_0x0519
        L_0x04a5:
            r4 = move-exception
            goto L_0x04df
        L_0x04a7:
            r4 = move-exception
            goto L_0x04f4
        L_0x04a9:
            r4 = move-exception
            goto L_0x04d3
        L_0x04ab:
            r4 = move-exception
            r8 = 1
            goto L_0x04df
        L_0x04ae:
            r4 = move-exception
            r8 = 1
            goto L_0x04f4
        L_0x04b1:
            r4 = move-exception
            goto L_0x04b5
        L_0x04b3:
            r4 = move-exception
            r3 = r1
        L_0x04b5:
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x0544
        L_0x04ba:
            r4 = move-exception
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x04df
        L_0x04bf:
            r4 = move-exception
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x04f4
        L_0x04c4:
            r4 = move-exception
            r6 = 0
            r8 = 1
            r1 = r3
            goto L_0x04d3
        L_0x04c9:
            r4 = move-exception
            goto L_0x04d8
        L_0x04cb:
            r4 = move-exception
            r6 = 0
            goto L_0x04cf
        L_0x04ce:
            r4 = move-exception
        L_0x04cf:
            r8 = 1
            goto L_0x04d3
        L_0x04d1:
            r4 = move-exception
            r8 = 1
        L_0x04d3:
            r5 = 8
            goto L_0x051a
        L_0x04d6:
            r4 = move-exception
            r6 = 0
        L_0x04d8:
            r8 = 1
            goto L_0x0544
        L_0x04da:
            r4 = move-exception
            r6 = 0
            goto L_0x04de
        L_0x04dd:
            r4 = move-exception
        L_0x04de:
            r8 = 1
        L_0x04df:
            java.lang.String r2 = "ConnectionThread/connect/socket/invalid-certificate-exception"
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ all -> 0x04ed }
            r4 = 10
            r3 = -1
            X.1WL r2 = new X.1WL     // Catch:{ all -> 0x04ed }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x04ed }
            throw r2     // Catch:{ all -> 0x04ed }
        L_0x04ed:
            r4 = move-exception
            goto L_0x0544
        L_0x04ef:
            r4 = move-exception
            r6 = 0
            goto L_0x04f3
        L_0x04f2:
            r4 = move-exception
        L_0x04f3:
            r8 = 1
        L_0x04f4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0511 }
            r3.<init>()     // Catch:{ all -> 0x0511 }
            r2 = r28
            r3.append(r2)     // Catch:{ all -> 0x0511 }
            r3.append(r4)     // Catch:{ all -> 0x0511 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0511 }
            com.whatsapp.util.Log.i(r2, r4)     // Catch:{ all -> 0x0511 }
            r5 = 8
            r3 = -1
            X.1WL r2 = new X.1WL     // Catch:{ all -> 0x0540 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0540 }
            throw r2     // Catch:{ all -> 0x0540 }
        L_0x0511:
            r4 = move-exception
            r5 = 8
            goto L_0x0546
        L_0x0515:
            r4 = move-exception
            r5 = 8
            r6 = 0
        L_0x0519:
            r8 = 1
        L_0x051a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0540 }
            r3.<init>()     // Catch:{ all -> 0x0540 }
            java.lang.String r2 = "ConnectionThread/connect/socket/goaway"
            r3.append(r2)     // Catch:{ all -> 0x0540 }
            r3.append(r4)     // Catch:{ all -> 0x0540 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0540 }
            com.whatsapp.util.Log.i(r2, r4)     // Catch:{ all -> 0x0540 }
            int r3 = r25.A02()     // Catch:{ all -> 0x053a }
            r10 = 6
            r4 = -1
            X.1WL r2 = new X.1WL     // Catch:{ all -> 0x053d }
            r2.<init>(r10, r4)     // Catch:{ all -> 0x053d }
            throw r2     // Catch:{ all -> 0x053d }
        L_0x053a:
            r4 = move-exception
            r3 = 0
            goto L_0x053e
        L_0x053d:
            r4 = move-exception
        L_0x053e:
            r12 = 1
            goto L_0x0548
        L_0x0540:
            r4 = move-exception
            goto L_0x0546
        L_0x0542:
            r4 = move-exception
            r8 = 1
        L_0x0544:
            r5 = 8
        L_0x0546:
            r3 = 0
            r12 = 0
        L_0x0548:
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x0569 }
            if (r2 != 0) goto L_0x0568
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0569 }
            if (r2 == 0) goto L_0x055c
            boolean r2 = r2.A09()     // Catch:{ 1WL -> 0x0569 }
            if (r2 != 0) goto L_0x055c
            r0.A0I()     // Catch:{ 1WL -> 0x0569 }
            goto L_0x0563
        L_0x055c:
            X.9gp r2 = r0.A01     // Catch:{ 1WL -> 0x0569 }
            if (r2 == 0) goto L_0x0563
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ 1WL -> 0x0569 }
        L_0x0563:
            if (r6 == 0) goto L_0x0568
            r6.A00()     // Catch:{ 1WL -> 0x0569 }
        L_0x0568:
            throw r4     // Catch:{ 1WL -> 0x0569 }
        L_0x0569:
            r10 = move-exception
            r2 = -1
            goto L_0x05b0
        L_0x056c:
            r5 = 8
            r8 = 1
            boolean r2 = r63.A01()     // Catch:{ 1WL -> 0x0594, all -> 0x058b }
            if (r2 != 0) goto L_0x063f
            r2 = r60
            r2.A16(r7)     // Catch:{ 1WL -> 0x057c, all -> 0x058b }
            goto L_0x063f
        L_0x057c:
            r10 = move-exception
            goto L_0x0582
        L_0x057e:
            r10 = move-exception
            r5 = 8
            r8 = 1
        L_0x0582:
            r24 = r3
            goto L_0x0589
        L_0x0585:
            r10 = move-exception
            r5 = 8
            r8 = 1
        L_0x0589:
            r2 = -1
            goto L_0x059d
        L_0x058b:
            r6 = move-exception
            goto L_0x067b
        L_0x058e:
            r10 = move-exception
            r2 = -1
            r5 = 8
            r8 = 1
            goto L_0x0596
        L_0x0594:
            r10 = move-exception
            r2 = -1
        L_0x0596:
            r24 = r3
            goto L_0x059d
        L_0x0599:
            r10 = move-exception
            r2 = -1
            r5 = 8
        L_0x059d:
            r3 = 0
            r12 = 0
            goto L_0x05b0
        L_0x05a0:
            r6 = move-exception
            r20 = -1
            r9 = 0
            goto L_0x067c
        L_0x05a6:
            r10 = move-exception
            r5 = 8
            r8 = 1
            r20 = -1
            r9 = 0
            r12 = 0
            r24 = 0
        L_0x05b0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0673 }
            r6.<init>()     // Catch:{ all -> 0x0673 }
            java.lang.String r4 = "ConnectionThread/connect/login/failure type:"
            r6.append(r4)     // Catch:{ all -> 0x0673 }
            int r4 = r10.type     // Catch:{ all -> 0x0673 }
            r6.append(r4)     // Catch:{ all -> 0x0673 }
            java.lang.String r4 = " code:"
            r6.append(r4)     // Catch:{ all -> 0x0673 }
            int r4 = r10.code     // Catch:{ all -> 0x0673 }
            r6.append(r4)     // Catch:{ all -> 0x0673 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0673 }
            com.whatsapp.util.Log.w(r4, r10)     // Catch:{ all -> 0x0673 }
            int r6 = r10.type     // Catch:{ all -> 0x0673 }
            r4 = 6
            if (r6 != r4) goto L_0x05d7
            r4 = 4
            goto L_0x05e2
        L_0x05d7:
            if (r6 == r5) goto L_0x05e2
            r4 = 10
            if (r6 != r4) goto L_0x05df
            r4 = 7
            goto L_0x05e2
        L_0x05df:
            int r2 = r10.serverErrorCode     // Catch:{ all -> 0x066f }
            r4 = 3
        L_0x05e2:
            r11.BaN(r10)     // Catch:{ all -> 0x066f }
            boolean r5 = r63.A01()
            if (r5 != 0) goto L_0x0618
            if (r12 == 0) goto L_0x0618
            r5 = r60
            r5.A1B(r3)
        L_0x05f2:
            boolean r3 = r63.A01()
            if (r3 == 0) goto L_0x05f9
            r4 = 1
        L_0x05f9:
            int r7 = r7 - r8
            int r25 = r24 + -1
            long r2 = (long) r2
            r21 = r0
            r22 = r1
            r23 = r4
            r24 = r7
            r26 = r20
            r27 = r47
            r29 = r2
            r21.A11(r22, r23, r24, r25, r26, r27, r29)
            boolean r2 = r63.A01()
            if (r2 != 0) goto L_0x061c
            r14.A04(r1)
            goto L_0x066b
        L_0x0618:
            r60.A0s()
            goto L_0x05f2
        L_0x061c:
            int r4 = r1.A04
            java.lang.Object r3 = r57.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = r19
            r11.BUK(r3, r4, r9, r2)
            X.1Wa r3 = r0.A05
            X.9gg r2 = r0.A08
            r3.Bpl(r2)
            r14.A03(r1)
            X.005 r0 = r0.A1G
            java.lang.Object r0 = r0.get()
            X.1W5 r0 = (X.AnonymousClass1W5) r0
            r0.A03(r1)
            goto L_0x066b
        L_0x063f:
            r60.A0s()
            boolean r2 = r63.A01()
            r23 = 5
            if (r2 == 0) goto L_0x064c
            r23 = 1
        L_0x064c:
            int r7 = r7 - r8
            int r25 = r3 + -1
            long r2 = (long) r4
            r21 = r0
            r22 = r1
            r24 = r7
            r26 = r20
            r27 = r47
            r29 = r2
            r21.A11(r22, r23, r24, r25, r26, r27, r29)
            boolean r2 = r63.A01()
            if (r2 != 0) goto L_0x061c
            r14.A04(r1)
            r11.BVq(r8)
        L_0x066b:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x066f:
            r6 = move-exception
            r3 = r24
            goto L_0x067c
        L_0x0673:
            r6 = move-exception
            r3 = r24
            r2 = -1
            goto L_0x067c
        L_0x0678:
            r6 = move-exception
            r3 = r24
        L_0x067b:
            r2 = -1
        L_0x067c:
            r60.A0s()
            boolean r5 = r63.A01()
            r4 = 1
            r23 = 5
            if (r5 == 0) goto L_0x068a
            r23 = 1
        L_0x068a:
            int r7 = r7 - r4
            int r25 = r3 + -1
            long r2 = (long) r2
            r21 = r0
            r22 = r1
            r24 = r7
            r26 = r20
            r27 = r47
            r29 = r2
            r21.A11(r22, r23, r24, r25, r26, r27, r29)
            boolean r2 = r63.A01()
            if (r2 != 0) goto L_0x06ad
            r14.A04(r1)
            r11.BVq(r4)
        L_0x06a9:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r6
        L_0x06ad:
            int r4 = r1.A04
            java.lang.Object r3 = r57.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = r19
            r11.BUK(r3, r4, r9, r2)
            X.1Wa r3 = r0.A05
            X.9gg r2 = r0.A08
            r3.Bpl(r2)
            r14.A03(r1)
            X.005 r0 = r0.A1G
            java.lang.Object r0 = r0.get()
            X.1W5 r0 = (X.AnonymousClass1W5) r0
            r0.A03(r1)
            goto L_0x06a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WK.A0g(com.whatsapp.jid.UserJid, X.1VM, java.lang.String, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    public void A0u(C29281Wa r3) {
        this.A05 = r3;
        this.A0i.BUO(new C31911ca(this));
    }

    /* access modifiers changed from: private */
    public void A0x(C64933Qa r2) {
        this.A03.A08(r2);
    }

    public static void A0y(AnonymousClass1WL r2, C203399nx r3) {
        r2.logoutMessageHeader = r3.A0i("logout_message_header", (String) null);
        r2.logoutMessageSubtext = r3.A0i("logout_message_subtext", (String) null);
        r2.logoutMessageLocale = r3.A0i("logout_message_locale", (String) null);
        r2.logoutMainButtonText = r3.A0i("logout_main_button_text", (String) null);
        r2.logoutMainButtonUrl = r3.A0i("logout_main_button_url", (String) null);
        r2.logoutSecondaryButtonText = r3.A0i("logout_secondary_button_text", (String) null);
        r2.logoutSecondaryButtonUrl = r3.A0i("logout_secondary_button_url", (String) null);
    }

    /* access modifiers changed from: private */
    public void A0z(C200139gg r3) {
        if (r3 == this.A08) {
            A15(true, 2);
        }
    }

    /* access modifiers changed from: private */
    public void A12(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionThread/quitIfNeeded should quit: ");
        C26951Md r1 = this.A0n;
        sb.append(r1.A01());
        Log.i(sb.toString());
        if (r1.A01()) {
            Log.i(str);
            this.A06.quit();
            quit();
        }
    }

    private void A13(boolean z) {
        if (z) {
            try {
                Log.i("ConnectionThread/setSoLinger");
                this.A01.A04();
            } catch (SocketException e) {
                this.A0D.A0D("set-so-linger-failed", (String) null, e);
            }
        }
        Log.i("ConnectionThread/closeSocket");
        this.A01.A02();
    }

    private void A14(boolean z) {
        AnonymousClass9WB r1;
        if (z && (r1 = this.A04) != null) {
            this.A0q.A08(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r6.A0Z.A0E(7106) == false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A15(boolean r7, int r8) {
        /*
            r6 = this;
            X.1WS r0 = r6.A03
            boolean r1 = r0.A09()
            X.1WS r0 = r6.A03
            int r4 = r0.A00
            r0.A03()
            X.9jx r0 = r6.A07
            if (r0 == 0) goto L_0x0016
            r0.A02()
        L_0x0016:
            X.1Md r5 = r6.A0l
            boolean r0 = r5.A01()
            java.lang.String r2 = "quit during forced disconnect"
            if (r0 == 0) goto L_0x0065
            X.1Md r3 = r6.A0m
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x0065
            r4 = 1
            if (r7 == 0) goto L_0x0097
            java.lang.String r0 = "ConnectionThread/disconnect/reader_thread/mark_finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7v2 r0 = r6.A02
            if (r0 == 0) goto L_0x0037
            r0.A00()
        L_0x0037:
            X.005 r0 = r6.A1G
            java.lang.Object r0 = r0.get()
            X.1W5 r0 = (X.AnonymousClass1W5) r0
            r0.A02(r8)
            r3 = 0
            if (r4 != r8) goto L_0x0050
            X.0yC r1 = r6.A0Z
            r0 = 7106(0x1bc2, float:9.958E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r6.A13(r0)
            X.1Wa r0 = r6.A05
            r0.Bpo()
            X.1Mb r0 = r6.A0i
            r0.BVq(r4)
            r5.A00(r3)
        L_0x0061:
            r6.A12(r2)
        L_0x0064:
            return
        L_0x0065:
            if (r1 == 0) goto L_0x007b
            if (r7 == 0) goto L_0x0089
            X.1WS r1 = r6.A03
            int r0 = A00(r8, r4)
            r1.A06(r0)
        L_0x0072:
            X.1Md r0 = r6.A0m
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0064
            goto L_0x0061
        L_0x007b:
            if (r7 == 0) goto L_0x0089
            X.005 r0 = r6.A1G
            java.lang.Object r0 = r0.get()
            X.1W5 r0 = (X.AnonymousClass1W5) r0
            r0.A02(r8)
            goto L_0x0072
        L_0x0089:
            X.1Md r0 = r6.A0m
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "quit even if not connected"
            r6.A12(r0)
            return
        L_0x0097:
            X.1WS r0 = r6.A03
            r0.A07(r8)
            X.1Wa r1 = r6.A05
            android.os.Message r0 = X.C203429o0.A01()
            r1.Bpy(r0)
            r3.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WK.A15(boolean, int):void");
    }

    private void A16(boolean z, int i) {
        AnonymousClass1W5 r0;
        C201609jx r02 = this.A07;
        if (r02 != null) {
            r02.A02();
        }
        this.A0l.A00(false);
        this.A0m.A00(false);
        if (!this.A0n.A01()) {
            AnonymousClass1WS r03 = this.A03;
            int A012 = r03.A01();
            r03.A05();
            this.A05.Bpo();
            this.A0i.BVq(z);
            if (!z) {
                r0 = (AnonymousClass1W5) this.A1G.get();
                if (A012 == -1) {
                    A012 = 4;
                }
            } else if (i == 0) {
                this.A0D.A0E("logout-report-new-exception", "please include correct error type", false);
            } else if (i == 1) {
                r0 = (AnonymousClass1W5) this.A1G.get();
                if (A012 == -1) {
                    A012 = 3;
                }
            } else if (i == 2) {
                r0 = (AnonymousClass1W5) this.A1G.get();
                if (A012 == -1) {
                    A012 = 5;
                }
            }
            r0.A02(A012);
        } else {
            A12("ConnectionThread/quit after disconnected");
        }
        this.A03.A03();
    }

    /* access modifiers changed from: private */
    public boolean A17() {
        return this.A03.A09();
    }

    public void A19() {
        C201609jx r0 = this.A07;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void onLooperPrepared() {
        this.A03 = new AnonymousClass1WS(this);
        C20810yC r1 = this.A0Z;
        AnonymousClass19B r4 = this.A0q;
        AnonymousClass19L r6 = this.A0v;
        AnonymousClass1WU r5 = new AnonymousClass1WU(this);
        AnonymousClass1C5 r0 = this.A0r;
        Objects.requireNonNull(r0);
        AnonymousClass1WV r2 = new AnonymousClass1WV(r0);
        AnonymousClass1WI r02 = this.A14;
        Objects.requireNonNull(r02);
        AnonymousClass1WX r03 = new AnonymousClass1WX(r1, r2, new AnonymousClass1WW(r02), r4, r5, r6);
        this.A06 = r03;
        r03.start();
        this.A0u.A00();
        this.A0s.A03(this.A0o);
    }

    private AnonymousClass6L6 A09(AnonymousClass6V9 r7, int i) {
        try {
            AnonymousClass6L6 A032 = r7.A03();
            this.A0t.A05(new AnonymousClass6FQ(A032.A02, 0, A032.A00, i));
            return A032;
        } catch (UnknownHostException e) {
            this.A0t.A02(i);
            throw e;
        }
    }

    private void A0K() {
    }

    /* access modifiers changed from: private */
    public void A0M() {
        A0I();
        A16(false, -1);
    }

    /* access modifiers changed from: private */
    public void A0T(int i) {
        A0I();
        A16(true, i);
    }

    /* access modifiers changed from: private */
    public void A0X(Message message) {
        String string = message.getData().getString("iqId");
        C18740tg.A06(string);
        if (!this.A0s.A08((C203399nx) message.obj, string)) {
            this.A0i.BZM(string);
        }
    }

    /* access modifiers changed from: private */
    public void A0Y(Message message) {
        int A002 = C111105bk.A00(message);
        if (A002 == 4) {
            long j = message.getData().getLong("timestamp");
            C19970wo r2 = this.A0Q;
            r2.A09(j * 1000, r2.A03());
            this.A05.Bpy(A03());
            ((AnonymousClass1W5) this.A1G.get()).A01();
        } else if (A002 != 87) {
            C235819a r1 = this.A0s;
            if (r1.A07(A002)) {
                r1.A02(Message.obtain(message), A002);
            } else {
                this.A0i.Bkn(Message.obtain(message));
            }
        } else {
            this.A03.A04();
            A14(((Boolean) message.obj).booleanValue());
        }
    }

    private void A0w(AnonymousClass8SR r16, C29021Va r17, C200139gg r18, AtomicReference atomicReference, AtomicReference atomicReference2) {
        AnonymousClass1WL r2;
        boolean A0u2 = r16.A0u().A0u();
        C203399nx A082 = r17.A08();
        boolean z = false;
        while (A082 != null) {
            if (C203399nx.A0I(A082, "web")) {
                if (z) {
                    throw new C235919b("multiple web nodes encountered on login");
                } else if (A0u2) {
                    C203399nx A0c2 = A082.A0c("error");
                    if (A0c2 != null) {
                        C199709fp.A00(A0c2.A0S("code", 500));
                    }
                    A082 = r17.A08();
                    z = true;
                } else {
                    throw new C235919b("web node given during login without any web ref provided");
                }
            } else if (C203399nx.A0I(A082, "success")) {
                if (!A0u2 || z) {
                    String A0g2 = A082.A0g("t");
                    if (A0g2 != null) {
                        try {
                            long parseLong = Long.parseLong(A0g2);
                            C200139gg r9 = r18;
                            r9.A02 = parseLong;
                            r9.A01 = this.A0Q.A03() / 1000;
                            A0V(parseLong);
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("invalid server time; timeString=");
                            sb.append(A0g2);
                            throw new C235919b(sb.toString());
                        }
                    }
                    int A0S2 = A082.A0S("props", -1);
                    if (A0S2 != -1) {
                        atomicReference.set(Integer.valueOf(A0S2));
                    }
                    int A0S3 = A082.A0S("abprops", -1);
                    if (A0S3 != -1) {
                        atomicReference2.set(Integer.valueOf(A0S3));
                    }
                    Jid A0X2 = A082.A0X(Jid.class, "lid");
                    if (A0X2 != null) {
                        this.A0F.A0H(A0X2);
                    }
                    String A0i2 = A082.A0i("display_name", (String) null);
                    if (A0i2 != null) {
                        this.A0F.A0K(A0i2);
                    }
                    A0d(this.A0T, this.A0a, A082);
                    C201609jx r0 = this.A07;
                    if (r0 != null) {
                        r0.A03();
                        return;
                    }
                    return;
                }
                throw new C235919b("web was expected but not seen before success");
            } else if (C203399nx.A0I(A082, "failure")) {
                int A0R2 = A082.A0R("reason");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ConnectionThread/login/failure/reason=");
                sb2.append(A0R2);
                Log.w(sb2.toString());
                if (this.A0F.A0L() && this.A0T.A2Q()) {
                    this.A0N.A00(3, (long) A0R2);
                }
                A0d(this.A0T, this.A0a, A082);
                if (A0R2 >= 500) {
                    if (A0R2 < 600) {
                        throw new AnonymousClass1WL(4, A0R2);
                    }
                } else if (A0R2 == 402) {
                    AnonymousClass1WL r22 = new AnonymousClass1WL(2, A0R2);
                    r22.expire_time_out = A082.A0R("expire");
                    r22.code = A082.A0R("code");
                    r22.banMessage = A082.A0i("message", (String) null);
                    r22.faqUrl = A082.A0i("url", (String) null);
                    throw r22;
                }
                if (A0R2 == 403) {
                    AnonymousClass1WL r23 = new AnonymousClass1WL(7, A0R2);
                    r23.violationType = A082.A0S("vt", 0);
                    r23.banAppealToken = A082.A0i("appeal_token", (String) null);
                    A0y(r23, A082);
                    throw r23;
                } else if (A0R2 == 405) {
                    AnonymousClass1WL r24 = new AnonymousClass1WL(3, A0R2);
                    r24.expiration_time = A082.A0V("t", 0) * 1000;
                    throw r24;
                } else if (A0R2 == 406) {
                    AnonymousClass1WL r25 = new AnonymousClass1WL(5, A0R2);
                    r25.code = A082.A0S("code", 0);
                    throw r25;
                } else if (A0R2 != 416) {
                    if (A0R2 != 401 || !this.A0Z.A0E(3281)) {
                        r2 = new AnonymousClass1WL(0, A0R2);
                    } else {
                        r2 = new AnonymousClass1WL(9, A0R2);
                    }
                    A0y(r2, A082);
                    throw r2;
                } else {
                    AnonymousClass1WL r26 = new AnonymousClass1WL(11, A0R2);
                    r26.violationType = A082.A0S("vt", 0);
                    r26.violationReason = A082.A0i("violation_reason", (String) null);
                    r26.violationSourceAcct = A082.A0S("source_acct", -1);
                    r26.banAppealToken = A082.A0i("appeal_token", (String) null);
                    A0y(r26, A082);
                    throw r26;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unexpected node received during login sequence; node=");
                sb3.append(A082.A0f());
                throw new C235919b(sb3.toString());
            }
        }
        throw new C235919b("node stream ended unexpectedly");
    }

    public static void A10(C195969Wz r5, Map map) {
        String[] A032 = r5.A03();
        int length = A032.length;
        int i = 0;
        while (i < length) {
            String str = A032[i];
            if (!map.containsKey(str)) {
                map.put(str, r5);
                i++;
            } else {
                throw new IllegalStateException("ConnectionReader/addStanzaHandler this stanza is already handled");
            }
        }
    }

    public boolean quit() {
        boolean quit = super.quit();
        this.A0i.Be5();
        return quit;
    }

    public AnonymousClass1WK(C19460v5 r4, C21390zA r5, AnonymousClass130 r6, AnonymousClass1VX r7, C19700wN r8, AnonymousClass1WJ r9, C19730wQ r10, AnonymousClass1DT r11, C20300xL r12, C21360z5 r13, C21100yf r14, C20050ww r15, C29241Vw r16, AnonymousClass1MK r17, AnonymousClass1VR r18, C221913g r19, AnonymousClass1WE r20, C19970wo r21, C19630wG r22, AnonymousClass17Z r23, C19420v0 r24, C19900wh r25, C220412q r26, C20310xM r27, AnonymousClass12P r28, C221112x r29, C20810yC r30, C20920yN r31, C21010yW r32, C20350xQ r33, AnonymousClass1VW r34, AnonymousClass1CF r35, AnonymousClass1VN r36, C29091Vh r37, AnonymousClass1WD r38, C26931Mb r39, AnonymousClass1VO r40, AnonymousClass1W9 r41, AnonymousClass19A r42, AnonymousClass1MT r43, AnonymousClass19B r44, AnonymousClass1C5 r45, C235819a r46, AnonymousClass1VQ r47, C29101Vi r48, AnonymousClass19L r49, C29111Vj r50, AnonymousClass1VU r51, C29121Vk r52, AnonymousClass1EU r53, AnonymousClass1PE r54, AnonymousClass1WF r55, AnonymousClass1VY r56, C29041Vc r57, AnonymousClass1WI r58, AnonymousClass1VS r59, AnonymousClass13I r60, AnonymousClass12U r61, AnonymousClass1VT r62, C29251Vx r63, AnonymousClass1A1 r64, C231017e r65, C19770wU r66, C21380z9 r67, C24961El r68, AnonymousClass19O r69, AnonymousClass005 r70, AnonymousClass005 r71, Set set) {
        super("ConnectionThread", 1);
        this.A0i = r39;
        this.A0R = r22;
        this.A0Q = r21;
        this.A0Z = r30;
        this.A0Y = r29;
        this.A0D = r8;
        this.A0F = r10;
        this.A1C = r66;
        this.A0I = r13;
        this.A0K = r15;
        this.A0V = r26;
        this.A0b = r32;
        this.A0J = r14;
        this.A0B = r6;
        this.A16 = r60;
        this.A0q = r44;
        this.A0o = r42;
        this.A0M = r17;
        this.A0f = r36;
        this.A0G = r11;
        this.A0j = r40;
        this.A0t = r47;
        this.A1G = r70;
        this.A1H = r71;
        this.A1F = r69;
        this.A15 = r59;
        this.A0z = r53;
        this.A09 = r4;
        this.A0W = r27;
        this.A1A = r64;
        this.A0c = r33;
        this.A0H = r12;
        this.A0r = r45;
        this.A1E = r68;
        this.A0e = r35;
        this.A1B = r65;
        this.A18 = r62;
        this.A0a = r31;
        this.A0x = r51;
        this.A0d = r34;
        this.A0C = r7;
        this.A0v = r49;
        this.A0p = r43;
        this.A0X = r28;
        this.A12 = r56;
        this.A0T = r24;
        this.A13 = r57;
        this.A0g = r37;
        this.A0u = r48;
        this.A0w = r50;
        this.A0y = r52;
        this.A0L = r16;
        this.A19 = r63;
        this.A1D = r67;
        this.A1K = set;
        this.A0h = r38;
        this.A0P = r20;
        this.A17 = r61;
        this.A0A = r5;
        this.A11 = r55;
        this.A0s = r46;
        this.A0U = r25;
        this.A0N = r18;
        this.A0k = r41;
        this.A0S = r23;
        this.A10 = r54;
        this.A0O = r19;
        this.A14 = r58;
        this.A0E = r9;
        this.A1J = new Random();
    }
}
