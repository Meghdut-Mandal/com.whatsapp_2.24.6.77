package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1NM  reason: invalid class name */
public class AnonymousClass1NM implements AnonymousClass191, AnonymousClass1NK, AnonymousClass1NL, AnonymousClass00M {
    public SharedPreferences A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final AnonymousClass1KK A03;
    public final AnonymousClass1NP A04;
    public final C25791Hr A05;
    public final AnonymousClass1NU A06;
    public final AnonymousClass16D A07;
    public final C27131Na A08;
    public final C25851Hx A09;
    public final AnonymousClass163 A0A;
    public final C220412q A0B;
    public final C20310xM A0C;
    public final AnonymousClass17X A0D;
    public final C24541Cv A0E;
    public final AnonymousClass17T A0F;
    public final AnonymousClass17U A0G;
    public final AnonymousClass12O A0H;
    public final AnonymousClass1FV A0I;
    public final C26171Jd A0J;
    public final AnonymousClass1DW A0K;
    public final C235518x A0L;
    public final C20810yC A0M;
    public final AnonymousClass17V A0N;
    public final AnonymousClass1NW A0O;
    public final AnonymousClass1A1 A0P;
    public final AnonymousClass1EM A0Q;
    public final C19930wk A0R;
    public final C19460v5 A0S;
    public final C25681Hg A0T;
    public final AnonymousClass1NV A0U;
    public final AnonymousClass185 A0V;
    public final C19970wo A0W;
    public final C19420v0 A0X;
    public final AnonymousClass168 A0Y;
    public final AnonymousClass1NZ A0Z;
    public final AnonymousClass1NO A0a;
    public final C21010yW A0b;
    public final AnonymousClass1NN A0c;
    public final C19890wg A0d;
    public final AnonymousClass1CR A0e;
    public final C27171Ne A0f;
    public final C27151Nc A0g;
    public final AnonymousClass005 A0h;

    public static String A01(String str, int i) {
        StringBuilder sb;
        String str2;
        if (i == 1) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_messageToAgent";
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_messageFromAgent";
        } else if (i == 3) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_editFromAgent";
        } else {
            throw new IllegalArgumentException("agent type does not exit");
        }
        sb.append(str2);
        return sb.toString();
    }

    public void A08(C51912oa r9, AnonymousClass11F r10) {
        SharedPreferences A002 = A00(this);
        String rawString = r10.getRawString();
        AnonymousClass00C.A0D(rawString, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append("_BotMentionsRowCount");
        this.A0R.execute(new C35521ip(this, A002, r9, sb.toString(), 6));
    }

    public synchronized void A0C(AnonymousClass11F r15, List list) {
        synchronized (this) {
            SharedPreferences A002 = A00(this);
            String rawString = r15.getRawString();
            StringBuilder sb = new StringBuilder();
            sb.append(rawString);
            sb.append("_integrity");
            String obj = sb.toString();
            String[] split = A002.getString(obj, "0,null,null,0").split(",");
            long A003 = C202339lc.A00(split, 0);
            long A004 = C202339lc.A00(split, 3);
            Integer A022 = C202339lc.A02(split);
            Boolean A012 = C202339lc.A01(split, 2);
            long j = A003 + 1;
            if (list != null) {
                int i = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((AnonymousClass3T1) it.next()).A1T(4194304)) {
                        i++;
                    }
                }
                A004 += (long) i;
            }
            A002.edit().putString(obj, TextUtils.join(",", Arrays.asList(new Serializable[]{Long.valueOf(j), A022, A012, Long.valueOf(A004)}))).apply();
        }
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BSi(C107265Nh r1, boolean z) {
    }

    public /* synthetic */ void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ void BSl(C107265Nh r1) {
    }

    public /* synthetic */ void BSm(AnonymousClass11F r1, CallState callState, String str) {
    }

    public void BTN(AnonymousClass11F r9, UserJid userJid, C64933Qa r11, int i) {
        this.A0R.execute(new C35391ic(this, r11, r9, userJid, i, 1));
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bgj() {
    }

    public static SharedPreferences A00(AnonymousClass1NM r2) {
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = r2.A0d.A00("chatCounts");
        r2.A00 = A002;
        return A002;
    }

    public static void A03(AnonymousClass026 r3, AnonymousClass1NM r4, UserJid userJid) {
        AnonymousClass141 A082;
        if (!r4.A02.A0M(userJid) && (A082 = r4.A07.A08(userJid)) != null && A082.A0C()) {
            r4.A0R.execute(new C35321iV(r4, userJid, r3, 39));
        }
    }

    public static boolean A06(AnonymousClass1NM r0, AnonymousClass3T1 r1, C64933Qa r2) {
        if (r1 == null && r0.A0J.A07(r2) == 56) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x092e, code lost:
        if (r1 != false) goto L_0x0930;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0a5f, code lost:
        if (r25 < 0) goto L_0x0a61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0ac0, code lost:
        if (r10.A0F == null) goto L_0x0ac2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0bae, code lost:
        if (r11.A0j == false) goto L_0x0bb0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0636 A[Catch:{ all -> 0x0da4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0436 A[Catch:{ all -> 0x0da4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A07() {
        /*
            r38 = this;
            r8 = r38
            monitor-enter(r8)
            android.content.SharedPreferences r22 = A00(r8)     // Catch:{ all -> 0x0e57 }
            X.0wo r0 = r8.A0W     // Catch:{ all -> 0x0e57 }
            long r20 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0e57 }
            X.17V r0 = r8.A0N     // Catch:{ all -> 0x0e57 }
            r37 = r0
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            long r18 = r0.A02(r1)     // Catch:{ all -> 0x0e57 }
            long r16 = r20 - r18
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0e55
            java.util.Map r0 = r22.getAll()     // Catch:{ all -> 0x0e57 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0e57 }
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0e57 }
            r3.<init>()     // Catch:{ all -> 0x0e57 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0e57 }
        L_0x0034:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0e57 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "thread_user_secret"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "_"
            int r1 = r2.lastIndexOf(r0)     // Catch:{ all -> 0x0e57 }
            r0 = -1
            if (r1 == r0) goto L_0x0064
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ all -> 0x0e57 }
        L_0x0064:
            r3.add(r2)     // Catch:{ all -> 0x0e57 }
            goto L_0x0034
        L_0x0068:
            java.util.Iterator r23 = r3.iterator()     // Catch:{ all -> 0x0e57 }
        L_0x006c:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0da7
            java.lang.Object r7 = r23.next()     // Catch:{ all -> 0x0e57 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0e57 }
            X.2T9 r6 = new X.2T9     // Catch:{ all -> 0x0e57 }
            r6.<init>()     // Catch:{ all -> 0x0e57 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r18 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A25 = r0     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r1.getString(r7, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0217
            X.9fc r2 = X.C199619fc.A00(r1)     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A07     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1Y = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A06     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1X = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A01     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0w = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A00     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0v = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A0A     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A2Q = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A09     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A2P = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A08     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A2O = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0M     // Catch:{ all -> 0x0e57 }
            r6.A0x = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0y     // Catch:{ all -> 0x0e57 }
            r6.A1o = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0x     // Catch:{ all -> 0x0e57 }
            r6.A1n = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A18     // Catch:{ all -> 0x0e57 }
            r6.A28 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A16     // Catch:{ all -> 0x0e57 }
            r6.A26 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0n     // Catch:{ all -> 0x0e57 }
            r6.A1O = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0o     // Catch:{ all -> 0x0e57 }
            r6.A1P = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0H     // Catch:{ all -> 0x0e57 }
            r6.A0b = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = r2.A0B     // Catch:{ all -> 0x0e57 }
            r6.A0B = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0F     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0107
            long r3 = r0.longValue()     // Catch:{ all -> 0x0e57 }
            r0 = 2
            long r3 = r3 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0e57 }
            r6.A0Z = r0     // Catch:{ all -> 0x0e57 }
        L_0x0107:
            java.lang.Long r0 = r2.A0S     // Catch:{ all -> 0x0e57 }
            r6.A12 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0G     // Catch:{ all -> 0x0e57 }
            r6.A0a = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A15     // Catch:{ all -> 0x0e57 }
            r6.A1x = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A14     // Catch:{ all -> 0x0e57 }
            r6.A1v = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A13     // Catch:{ all -> 0x0e57 }
            r6.A1u = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0L     // Catch:{ all -> 0x0e57 }
            r6.A0u = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0I     // Catch:{ all -> 0x0e57 }
            r6.A0p = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0O     // Catch:{ all -> 0x0e57 }
            r6.A0z = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0N     // Catch:{ all -> 0x0e57 }
            r6.A0y = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0Q     // Catch:{ all -> 0x0e57 }
            r6.A11 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0P     // Catch:{ all -> 0x0e57 }
            r6.A10 = r0     // Catch:{ all -> 0x0e57 }
            X.0yC r3 = r8.A0M     // Catch:{ all -> 0x0e57 }
            r0 = 5785(0x1699, float:8.107E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.C20800yB.A01(r1, r3, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0177
            java.lang.Long r0 = r2.A1C     // Catch:{ all -> 0x0e57 }
            r6.A2E = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0s     // Catch:{ all -> 0x0e57 }
            r6.A1i = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A1E     // Catch:{ all -> 0x0e57 }
            r6.A2K = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A1B     // Catch:{ all -> 0x0e57 }
            r6.A2D = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0r     // Catch:{ all -> 0x0e57 }
            r6.A1h = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A1D     // Catch:{ all -> 0x0e57 }
            r6.A2J = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0g     // Catch:{ all -> 0x0e57 }
            r6.A1G = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0c     // Catch:{ all -> 0x0e57 }
            r6.A1C = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0i     // Catch:{ all -> 0x0e57 }
            r6.A1I = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0f     // Catch:{ all -> 0x0e57 }
            r6.A1F = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0b     // Catch:{ all -> 0x0e57 }
            r6.A1B = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0h     // Catch:{ all -> 0x0e57 }
            r6.A1H = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0a     // Catch:{ all -> 0x0e57 }
            r6.A1A = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0Z     // Catch:{ all -> 0x0e57 }
            r6.A19 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0177:
            r0 = 5963(0x174b, float:8.356E-42)
            boolean r0 = X.C20800yB.A01(r1, r3, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x01f3
            java.lang.Long r0 = r2.A1G     // Catch:{ all -> 0x0e57 }
            r6.A2N = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A1F     // Catch:{ all -> 0x0e57 }
            r6.A2M = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0k     // Catch:{ all -> 0x0e57 }
            r6.A1K = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0j     // Catch:{ all -> 0x0e57 }
            r6.A1J = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0m     // Catch:{ all -> 0x0e57 }
            r6.A1M = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0l     // Catch:{ all -> 0x0e57 }
            r6.A1L = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0Y     // Catch:{ all -> 0x0e57 }
            r6.A18 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0X     // Catch:{ all -> 0x0e57 }
            r6.A17 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0E     // Catch:{ all -> 0x0e57 }
            r6.A0X = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0D     // Catch:{ all -> 0x0e57 }
            r6.A0W = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0U     // Catch:{ all -> 0x0e57 }
            r6.A14 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0T     // Catch:{ all -> 0x0e57 }
            r6.A13 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0K     // Catch:{ all -> 0x0e57 }
            r6.A0t = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0J     // Catch:{ all -> 0x0e57 }
            r6.A0s = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0W     // Catch:{ all -> 0x0e57 }
            r6.A16 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0V     // Catch:{ all -> 0x0e57 }
            r6.A15 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A1A     // Catch:{ all -> 0x0e57 }
            r6.A2A = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A19     // Catch:{ all -> 0x0e57 }
            r6.A29 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0e     // Catch:{ all -> 0x0e57 }
            r6.A1E = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0d     // Catch:{ all -> 0x0e57 }
            r6.A1D = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A12     // Catch:{ all -> 0x0e57 }
            r6.A1s = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A11     // Catch:{ all -> 0x0e57 }
            r6.A1r = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A10     // Catch:{ all -> 0x0e57 }
            r6.A1q = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0z     // Catch:{ all -> 0x0e57 }
            r6.A1p = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0u     // Catch:{ all -> 0x0e57 }
            r6.A1k = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0t     // Catch:{ all -> 0x0e57 }
            r6.A1j = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0w     // Catch:{ all -> 0x0e57 }
            r6.A1m = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0v     // Catch:{ all -> 0x0e57 }
            r6.A1l = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A17     // Catch:{ all -> 0x0e57 }
            r6.A27 = r0     // Catch:{ all -> 0x0e57 }
        L_0x01f3:
            long r0 = r2.A05     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A23 = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A03     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A22 = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A04     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A20 = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r2.A02     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1z = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r2.A0q     // Catch:{ all -> 0x0e57 }
            r6.A1W = r0     // Catch:{ all -> 0x0e57 }
        L_0x0217:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_businessTools"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0259
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.Long r3 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 1
            java.lang.Long r2 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            java.lang.Long r1 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            java.lang.Long r0 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            r6.A1U = r3     // Catch:{ all -> 0x0e57 }
            r6.A0Y = r2     // Catch:{ all -> 0x0e57 }
            r6.A1N = r1     // Catch:{ all -> 0x0e57 }
            r6.A1t = r0     // Catch:{ all -> 0x0e57 }
        L_0x0259:
            X.13q r36 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x0e57 }
            r0 = r36
            X.11F r9 = r0.A02(r7)     // Catch:{ all -> 0x0e57 }
            if (r9 == 0) goto L_0x0459
            X.17T r3 = r8.A0F     // Catch:{ all -> 0x0d87 }
            r2 = 0
            long r0 = r3.A04(r9, r2)     // Catch:{ all -> 0x0d87 }
            r10 = 1
            r32 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x042e
            X.1A1 r4 = r8.A0P     // Catch:{ all -> 0x0d87 }
            X.175 r4 = r4.A01     // Catch:{ all -> 0x0d87 }
            X.3T1 r31 = r4.A01(r0)     // Catch:{ all -> 0x0d87 }
            if (r31 != 0) goto L_0x0292
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r3.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "ChatMessageCounts/getGaStatus/Null message for id - "
            r3.append(r2)     // Catch:{ all -> 0x0d87 }
            r3.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0d87 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d87 }
            goto L_0x042e
        L_0x0292:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0d87 }
            r0 = 11
            r1.set(r0, r2)     // Catch:{ all -> 0x0d87 }
            r0 = 12
            r1.set(r0, r2)     // Catch:{ all -> 0x0d87 }
            r0 = 13
            r1.set(r0, r2)     // Catch:{ all -> 0x0d87 }
            r0 = 14
            r1.set(r0, r2)     // Catch:{ all -> 0x0d87 }
            long r4 = r1.getTimeInMillis()     // Catch:{ all -> 0x0d87 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r29 = r4 - r0
            long r27 = r37.A01()     // Catch:{ all -> 0x0d87 }
            r26 = 1
            r0 = 1
            int[] r12 = new int[r0]     // Catch:{ all -> 0x0d87 }
            r0 = 7
            r12[r2] = r0     // Catch:{ all -> 0x0d87 }
            X.17U r14 = r8.A0G     // Catch:{ all -> 0x0d87 }
            X.12q r0 = r14.A01     // Catch:{ all -> 0x0d87 }
            X.3Qp r13 = r0.A09(r9, r2)     // Catch:{ all -> 0x0d87 }
            r0 = -9223372036854775808
            if (r13 == 0) goto L_0x0350
            long r10 = r13.A0H     // Catch:{ all -> 0x0d87 }
            int r15 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x034e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r1.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r10.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = " AND "
            r10.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = X.AnonymousClass17W.A00(r12)     // Catch:{ all -> 0x0d87 }
            r10.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0d87 }
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r15 = "sort_id"
            r1.append(r15)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = " ASC LIMIT 1"
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0d87 }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0d87 }
            X.163 r0 = r14.A00     // Catch:{ all -> 0x0d87 }
            long r24 = r0.A08(r9)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = java.lang.String.valueOf(r24)     // Catch:{ all -> 0x0d87 }
            r1[r2] = r0     // Catch:{ all -> 0x0d87 }
            X.12P r0 = r14.A02     // Catch:{ all -> 0x0d87 }
            X.1M0 r11 = r0.get()     // Catch:{ all -> 0x0d87 }
            X.14e r14 = r11.A02     // Catch:{ all -> 0x0d7d }
            java.lang.String r0 = "GET_FIRST_SORT_REF_SQL_EXCLUDE_TYPES"
            android.database.Cursor r10 = r14.A09(r10, r0, r1)     // Catch:{ all -> 0x0d7d }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x0d6a }
            if (r0 == 0) goto L_0x0334
            int r0 = r10.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0d6a }
            long r0 = r10.getLong(r0)     // Catch:{ all -> 0x0d6a }
            r13.A0H = r0     // Catch:{ all -> 0x0d6a }
            goto L_0x0348
        L_0x0334:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d6a }
            r1.<init>()     // Catch:{ all -> 0x0d6a }
            java.lang.String r0 = "msgstore/getfirstsortrefexcludetypes can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x0d6a }
            r1.append(r9)     // Catch:{ all -> 0x0d6a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d6a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0d6a }
        L_0x0348:
            r10.close()     // Catch:{ all -> 0x0d7d }
            r11.close()     // Catch:{ all -> 0x0d87 }
        L_0x034e:
            long r0 = r13.A0H     // Catch:{ all -> 0x0d87 }
        L_0x0350:
            X.0xM r10 = r8.A0C     // Catch:{ all -> 0x0d87 }
            X.3T1 r10 = r10.A0U(r0)     // Catch:{ all -> 0x0d87 }
            if (r10 != 0) goto L_0x036e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r3.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = "Failed to get message from coreMessageStore, sortId - "
            r3.append(r2)     // Catch:{ all -> 0x0d87 }
            r3.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0d87 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d87 }
            goto L_0x042e
        L_0x036e:
            long r0 = r10.A0I     // Catch:{ all -> 0x0d87 }
            int r10 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r10 <= 0) goto L_0x037a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d87 }
            goto L_0x0430
        L_0x037a:
            r0 = r29
            long r24 = r3.A06(r9, r12, r0)     // Catch:{ all -> 0x0d87 }
            long r14 = r3.A06(r9, r12, r4)     // Catch:{ all -> 0x0d87 }
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x0d87 }
            X.163 r0 = r3.A00     // Catch:{ all -> 0x0d87 }
            long r0 = r0.A08(r9)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0d87 }
            r10 = 0
            r13[r2] = r0     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = java.lang.Long.toString(r24)     // Catch:{ all -> 0x0d87 }
            r13[r26] = r0     // Catch:{ all -> 0x0d87 }
            java.lang.String r1 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x0d87 }
            r0 = 2
            r13[r0] = r1     // Catch:{ all -> 0x0d87 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r2.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND _id>? AND _id<=?"
            r2.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d87 }
            r1.<init>()     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = X.AnonymousClass17W.A00(r12)     // Catch:{ all -> 0x0d87 }
            r1.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d87 }
            r2.append(r0)     // Catch:{ all -> 0x0d87 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0d87 }
            X.12P r0 = r3.A01     // Catch:{ all -> 0x0d87 }
            X.1M0 r11 = r0.get()     // Catch:{ all -> 0x0d87 }
            X.14e r2 = r11.A02     // Catch:{ all -> 0x0d7d }
            java.lang.String r0 = "COUNT_MESSAGES_EXCLUDE_TYPES"
            android.database.Cursor r2 = r2.A09(r1, r0, r13)     // Catch:{ all -> 0x0d7d }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0d71 }
            if (r0 == 0) goto L_0x03fa
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d71 }
            int r10 = r2.getInt(r0)     // Catch:{ all -> 0x0d71 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d71 }
            r1.<init>()     // Catch:{ all -> 0x0d71 }
            java.lang.String r0 = "msgstore/getmessagesatid/pos:"
            r1.append(r0)     // Catch:{ all -> 0x0d71 }
            r1.append(r10)     // Catch:{ all -> 0x0d71 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d71 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d71 }
            goto L_0x040e
        L_0x03fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d71 }
            r1.<init>()     // Catch:{ all -> 0x0d71 }
            java.lang.String r0 = "msgstore/getmessagesatid/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x0d71 }
            r1.append(r9)     // Catch:{ all -> 0x0d71 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d71 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d71 }
        L_0x040e:
            r2.close()     // Catch:{ all -> 0x0d7d }
            r11.close()     // Catch:{ all -> 0x0d87 }
            long r2 = (long) r10     // Catch:{ all -> 0x0d87 }
            r0 = r31
            long r0 = r0.A0I     // Catch:{ all -> 0x0d87 }
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0428
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0428
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x0d87 }
            goto L_0x0430
        L_0x0428:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d87 }
            goto L_0x0430
        L_0x042e:
            r0 = r32
        L_0x0430:
            r6.A0T = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0459
            r1 = r9
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0e57 }
            X.16D r0 = r8.A07     // Catch:{ all -> 0x0e57 }
            X.141 r0 = r0.A08(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x05df
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r2.<init>()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Contact is null for jid - "
        L_0x0448:
            r2.append(r0)     // Catch:{ all -> 0x0e57 }
            r2.append(r1)     // Catch:{ all -> 0x0e57 }
        L_0x044e:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0e57 }
        L_0x0452:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0e57 }
        L_0x0455:
            r0 = r32
            r6.A0M = r0     // Catch:{ all -> 0x0e57 }
        L_0x0459:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_commerce"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x04bf
            X.9eV r1 = X.C198979eV.A00(r1)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0e57 }
            r6.A1g = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0e57 }
            r6.A1d = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A05     // Catch:{ all -> 0x0e57 }
            r6.A1f = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x0e57 }
            r6.A1e = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x0e57 }
            r6.A0r = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x0e57 }
            r6.A0q = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = r1.A00     // Catch:{ all -> 0x0e57 }
            r6.A0n = r0     // Catch:{ all -> 0x0e57 }
            X.16D r0 = r8.A07     // Catch:{ all -> 0x0e57 }
            X.141 r0 = r0.A08(r9)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x04bf
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x04bf
            boolean r0 = r1.A07     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A07 = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r1.A09     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A09 = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r1.A08     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A08 = r0     // Catch:{ all -> 0x0e57 }
        L_0x04bf:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_integrity"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0514
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            long r9 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            long r3 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Integer r2 = X.C202339lc.A02(r1)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            java.lang.Boolean r1 = X.C202339lc.A01(r1, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0e57 }
            r6.A24 = r0     // Catch:{ all -> 0x0e57 }
            X.13o r0 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.Jid r0 = r0.A02(r7)     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.AnonymousClass143.A0G(r0)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x050e
            r6.A0N = r2     // Catch:{ all -> 0x0e57 }
            r6.A06 = r1     // Catch:{ all -> 0x0e57 }
        L_0x050e:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0e57 }
            r6.A21 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0514:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = X.AnonymousClass3Lg.A01(r7)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x05a9
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            long r34 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 1
            long r32 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            long r30 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            long r28 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 4
            long r26 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 5
            long r24 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 6
            long r13 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 7
            long r11 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 8
            long r9 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 9
            long r3 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 10
            long r1 = X.C202339lc.A00(r1, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r34)     // Catch:{ all -> 0x0e57 }
            r6.A0d = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x0e57 }
            r6.A0c = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0e57 }
            r6.A2F = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x0e57 }
            r6.A2L = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0e57 }
            r6.A2R = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0e57 }
            r6.A0g = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e57 }
            r6.A0i = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e57 }
            r6.A0j = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0e57 }
            r6.A0e = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0e57 }
            r6.A0f = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A0h = r0     // Catch:{ all -> 0x0e57 }
        L_0x05a9:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_discovery"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0645
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            int r3 = r4.length     // Catch:{ all -> 0x0e57 }
            r2 = 0
            if (r3 <= r0) goto L_0x0632
            r1 = r4[r0]     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0633
            goto L_0x0632
        L_0x05df:
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0455
            X.1KK r0 = r8.A03     // Catch:{ all -> 0x0e57 }
            X.9uZ r0 = r0.A07(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x05f6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r2.<init>()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Failed to get profile for jid - "
            goto L_0x0448
        L_0x05f6:
            java.lang.String r1 = r0.A0D     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0602
            r0 = 1
            goto L_0x060b
        L_0x0602:
            java.lang.String r0 = "shop"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0611
            r0 = 0
        L_0x060b:
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            goto L_0x0455
        L_0x0611:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0455
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x062e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r2.<init>()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Unknown commerceExperience value - "
            r2.append(r0)     // Catch:{ all -> 0x0e57 }
            r2.append(r1)     // Catch:{ all -> 0x0e57 }
            goto L_0x044e
        L_0x062e:
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Empty commerceExperience value"
            goto L_0x0452
        L_0x0632:
            r1 = r2
        L_0x0633:
            r0 = 1
            if (r3 <= r0) goto L_0x0641
            r3 = r4[r0]     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0641
            r2 = r3
        L_0x0641:
            r6.A2S = r1     // Catch:{ all -> 0x0e57 }
            r6.A2T = r2     // Catch:{ all -> 0x0e57 }
        L_0x0645:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_actions"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0671
            r0 = 0
            long r0 = X.AnonymousClass6R8.A01(r2, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0m = r0     // Catch:{ all -> 0x0e57 }
        L_0x0671:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_cart"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x069d
            r0 = 0
            long r0 = X.AnonymousClass6R8.A01(r2, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0k = r0     // Catch:{ all -> 0x0e57 }
        L_0x069d:
            r2 = 1
            r8.A05(r6, r7, r2)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            r8.A05(r6, r7, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            r8.A05(r6, r7, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r3.<init>()     // Catch:{ all -> 0x0e57 }
            r3.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = "_BotMentionsRowCount"
            r3.append(r1)     // Catch:{ all -> 0x0e57 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r3, r5)     // Catch:{ all -> 0x0e57 }
            X.AnonymousClass00C.A0D(r1, r2)     // Catch:{ all -> 0x0e57 }
            r3 = 44
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0e57 }
            java.util.List r1 = X.AnonymousClass099.A0K(r1, r3, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0e57 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.Long r9 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            if (r9 != 0) goto L_0x06eb
            r9 = r14
        L_0x06eb:
            long r0 = r9.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r12 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r12.<init>(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = X.C202339lc.A04(r4, r2)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x06fb
            r0 = r14
        L_0x06fb:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r10.<init>(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            java.lang.Long r0 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x070c
            r0 = r14
        L_0x070c:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r9.<init>(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            java.lang.Long r0 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x071d
            r0 = r14
        L_0x071d:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r11.<init>(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 4
            java.lang.Long r0 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x072e
            r0 = r14
        L_0x072e:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r13 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r13.<init>(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 5
            java.lang.Long r0 = X.C202339lc.A04(r4, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x073f
            r14 = r0
        L_0x073f:
            long r0 = r14.longValue()     // Catch:{ all -> 0x0e57 }
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0e57 }
            r4.<init>(r0)     // Catch:{ all -> 0x0e57 }
            long r0 = r12.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1c = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r10.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1T = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r9.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1b = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r11.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1S = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r13.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0o = r0     // Catch:{ all -> 0x0e57 }
            long r0 = r4.get()     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1R = r0     // Catch:{ all -> 0x0e57 }
            r0 = r36
            X.11F r4 = r0.A02(r7)     // Catch:{ all -> 0x0e57 }
            X.1Hg r0 = r8.A0T     // Catch:{ all -> 0x0e57 }
            X.0yC r9 = r0.A01     // Catch:{ all -> 0x0e57 }
            X.0yV r1 = X.C21000yV.A01     // Catch:{ all -> 0x0e57 }
            r0 = 6358(0x18d6, float:8.91E-42)
            boolean r0 = X.C20800yB.A01(r1, r9, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x07ec
            boolean r0 = X.C197029b1.A00(r4)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x07ec
            r9 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_BotMessagePromptsRowCount"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = r0.getString(r1, r5)     // Catch:{ all -> 0x0e57 }
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ all -> 0x0e57 }
            java.util.List r1 = X.AnonymousClass099.A0K(r0, r3, r9)     // Catch:{ all -> 0x0e57 }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ all -> 0x0e57 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r1 = X.C202339lc.A04(r0, r9)     // Catch:{ all -> 0x0e57 }
            r11 = 0
            if (r1 != 0) goto L_0x07d2
            r9 = 0
            goto L_0x07d6
        L_0x07d2:
            long r9 = r1.longValue()     // Catch:{ all -> 0x0e57 }
        L_0x07d6:
            java.lang.Long r0 = X.C202339lc.A04(r0, r2)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x07e0
            long r11 = r0.longValue()     // Catch:{ all -> 0x0e57 }
        L_0x07e0:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0e57 }
            r6.A2B = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e57 }
            r6.A2C = r0     // Catch:{ all -> 0x0e57 }
        L_0x07ec:
            X.0yC r5 = r8.A0M     // Catch:{ all -> 0x0e57 }
            r10 = 2474(0x9aa, float:3.467E-42)
            X.0yV r3 = X.C21000yV.A02     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.C20800yB.A01(r3, r5, r10)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0841
            X.1Ne r0 = r8.A0f     // Catch:{ all -> 0x0e57 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x0e57 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0e57 }
        L_0x0800:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0841
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0e57 }
            X.1Nd r0 = (X.C27161Nd) r0     // Catch:{ all -> 0x0e57 }
            X.0yC r0 = r0.A00     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.C20800yB.A01(r3, r0, r10)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0800
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r7)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_location"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r1 = 0
            r0 = r22
            java.lang.String r9 = r0.getString(r9, r1)     // Catch:{ all -> 0x0e57 }
            if (r9 == 0) goto L_0x0800
            int r0 = r9.length()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0800
            r0 = 0
            long r0 = X.AnonymousClass6R8.A01(r9, r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1V = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0800
        L_0x0841:
            if (r4 == 0) goto L_0x006c
            r9 = 28800000(0x1b77400, double:1.42290906E-316)
            long r0 = r18 - r9
            java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x0e57 }
            r9.<init>(r0)     // Catch:{ all -> 0x0e57 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = "yyyy/MM/dd"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0e57 }
            r0.<init>(r1, r10)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r0.format(r9)     // Catch:{ all -> 0x0e57 }
            r6.A2U = r1     // Catch:{ all -> 0x0e57 }
            java.util.Random r9 = new java.util.Random     // Catch:{ all -> 0x0e57 }
            r9.<init>()     // Catch:{ all -> 0x0e57 }
            r0 = r37
            byte[] r9 = r0.A05(r9)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r0.<init>()     // Catch:{ all -> 0x0e57 }
            r0.append(r7)     // Catch:{ all -> 0x0e57 }
            r0.append(r1)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = X.AnonymousClass17V.A00(r9, r0)     // Catch:{ all -> 0x0e57 }
            r6.A2V = r0     // Catch:{ all -> 0x0e57 }
            X.16D r9 = r8.A07     // Catch:{ all -> 0x0e57 }
            X.141 r11 = r9.A08(r4)     // Catch:{ all -> 0x0e57 }
            r1 = 0
            if (r11 == 0) goto L_0x093e
            boolean r0 = r11.A0G()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x093e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0e57 }
            r6.A03 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r0 = r9.A0G(r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x08a6
            X.141 r10 = r9.A08(r0)     // Catch:{ all -> 0x0e57 }
        L_0x08a3:
            boolean r0 = r4 instanceof X.AnonymousClass147     // Catch:{ all -> 0x0e57 }
            goto L_0x08a8
        L_0x08a6:
            r10 = 0
            goto L_0x08a3
        L_0x08a8:
            if (r0 == 0) goto L_0x0937
            X.17X r0 = r8.A0D     // Catch:{ all -> 0x0e57 }
            r1 = r4
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ all -> 0x0e57 }
            X.17r r0 = r0.A07     // Catch:{ all -> 0x0e57 }
            X.6X6 r2 = r0.A0C(r1)     // Catch:{ all -> 0x0e57 }
            java.util.Map r0 = r2.A08     // Catch:{ all -> 0x0e57 }
            int r0 = r0.size()     // Catch:{ all -> 0x0e57 }
            long r0 = (long) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1Q = r0     // Catch:{ all -> 0x0e57 }
            X.0y7 r0 = r2.A07()     // Catch:{ all -> 0x0e57 }
            X.14x r2 = r0.iterator()     // Catch:{ all -> 0x0e57 }
        L_0x08ca:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x08ee
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0e57 }
            X.6PM r0 = (X.AnonymousClass6PM) r0     // Catch:{ all -> 0x0e57 }
            X.0wQ r1 = r8.A02     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r0 = r0.A03     // Catch:{ all -> 0x0e57 }
            boolean r1 = r1.A0M(r0)     // Catch:{ all -> 0x0e57 }
            if (r1 != 0) goto L_0x08ca
            X.141 r0 = r9.A08(r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x08ca
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x08ca
            r0 = 1
            goto L_0x08ef
        L_0x08ee:
            r0 = 0
        L_0x08ef:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A01 = r0     // Catch:{ all -> 0x0e57 }
            X.12q r1 = r8.A0B     // Catch:{ all -> 0x0e57 }
            r12 = r4
            X.147 r12 = (X.AnonymousClass147) r12     // Catch:{ all -> 0x0e57 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.AnonymousClass143.A0G(r12)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0906
            r0 = 0
            goto L_0x091d
        L_0x0906:
            int r2 = r1.A06(r12)     // Catch:{ all -> 0x0e57 }
            r1 = 2
            if (r2 == r1) goto L_0x0919
            r0 = 3
            if (r2 == r0) goto L_0x0914
            r0 = 6
            if (r2 == r0) goto L_0x0919
            r0 = 1
        L_0x0914:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            goto L_0x091d
        L_0x0919:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0e57 }
        L_0x091d:
            r6.A0V = r0     // Catch:{ all -> 0x0e57 }
            X.1NN r0 = r8.A0c     // Catch:{ all -> 0x0e57 }
            boolean r1 = r0.A00(r11, r12)     // Catch:{ all -> 0x0e57 }
            if (r1 != 0) goto L_0x0930
            X.1Jx r0 = r0.A03     // Catch:{ all -> 0x0e57 }
            boolean r1 = r0.A00(r11, r12)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            if (r1 == 0) goto L_0x0931
        L_0x0930:
            r0 = 1
        L_0x0931:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A00 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0937:
            boolean r0 = r11.A13     // Catch:{ all -> 0x0e57 }
            r1 = 2
            if (r0 == 0) goto L_0x0946
            r1 = 1
            goto L_0x0946
        L_0x093e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A03 = r0     // Catch:{ all -> 0x0e57 }
            r10 = r11
            goto L_0x094c
        L_0x0946:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A0U = r0     // Catch:{ all -> 0x0e57 }
        L_0x094c:
            X.005 r0 = r8.A0h     // Catch:{ all -> 0x0e57 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0e57 }
            X.1HX r0 = (X.AnonymousClass1HX) r0     // Catch:{ all -> 0x0e57 }
            X.1Hg r0 = r0.A00     // Catch:{ all -> 0x0e57 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0966
            boolean r0 = X.C197029b1.A00(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0G = r0     // Catch:{ all -> 0x0e57 }
        L_0x0966:
            boolean r0 = X.C55942vR.A00(r5)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x097e
            X.1NV r0 = r8.A0U     // Catch:{ all -> 0x0e57 }
            X.1A5 r0 = r0.A00     // Catch:{ all -> 0x0e57 }
            X.141 r0 = r0.A01(r4)     // Catch:{ all -> 0x0e57 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0F = r0     // Catch:{ all -> 0x0e57 }
        L_0x097e:
            if (r11 == 0) goto L_0x09a7
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = X.C20800yB.A01(r3, r5, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x09a7
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x09a7
            X.141 r0 = r9.A08(r0)     // Catch:{ all -> 0x0e57 }
            r1 = 1
            if (r0 == 0) goto L_0x09db
            int r0 = r0.A00     // Catch:{ all -> 0x0e57 }
            if (r0 != r1) goto L_0x09db
        L_0x09a1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A0E = r0     // Catch:{ all -> 0x0e57 }
        L_0x09a7:
            X.18x r2 = r8.A0L     // Catch:{ all -> 0x0e57 }
            java.lang.Integer r0 = r2.A04()     // Catch:{ all -> 0x0e57 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0e57 }
            long r0 = (long) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1y = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x09ca
            r0 = r4
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0e57 }
            int r0 = r2.A00(r0)     // Catch:{ all -> 0x0e57 }
            long r0 = (long) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1w = r0     // Catch:{ all -> 0x0e57 }
        L_0x09ca:
            X.12q r2 = r8.A0B     // Catch:{ all -> 0x0e57 }
            r0 = 0
            X.3Qp r12 = r2.A09(r4, r0)     // Catch:{ all -> 0x0e57 }
            if (r12 == 0) goto L_0x0a12
            X.3un r0 = r12.A0b     // Catch:{ all -> 0x0e57 }
            int r1 = r0.disappearingMessagesInitiator     // Catch:{ all -> 0x0e57 }
            r0 = 2
            if (r1 == 0) goto L_0x09e1
            goto L_0x09dd
        L_0x09db:
            r1 = 0
            goto L_0x09a1
        L_0x09dd:
            if (r1 != r0) goto L_0x09e2
            r0 = 3
            goto L_0x09e2
        L_0x09e1:
            r0 = 1
        L_0x09e2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0Q = r0     // Catch:{ all -> 0x0e57 }
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C20800yB.A01(r3, r5, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0a12
            X.3Id r1 = r12.A0a     // Catch:{ all -> 0x0e57 }
            if (r1 == 0) goto L_0x0a12
            int r0 = r1.A00     // Catch:{ all -> 0x0e57 }
            int r0 = X.AnonymousClass3UK.A01(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0S = r0     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = r1.A01     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0a12
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x0e57 }
            r0 = 2
            if (r1 == 0) goto L_0x0a0c
            r0 = 1
        L_0x0a0c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0R = r0     // Catch:{ all -> 0x0e57 }
        L_0x0a12:
            X.163 r13 = r8.A0A     // Catch:{ all -> 0x0e57 }
            long r27 = r13.A08(r4)     // Catch:{ all -> 0x0e57 }
            r25 = -1
            r14 = 0
            int r0 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0a61
            X.12P r0 = r13.A04     // Catch:{ all -> 0x0e57 }
            X.1M0 r24 = r0.get()     // Catch:{ all -> 0x0e57 }
            r0 = r24
            X.14e r0 = r0.A02     // Catch:{ all -> 0x0d95 }
            r14 = r0
            java.lang.String r12 = "SELECT created_timestamp FROM chat WHERE _id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0d95 }
            r15 = r0
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x0d95 }
            r15[r1] = r0     // Catch:{ all -> 0x0d95 }
            java.lang.String r0 = "GET_CREATED_TIME_FOR_CHAT"
            r1 = r0
            android.database.Cursor r1 = r14.A09(r12, r1, r15)     // Catch:{ all -> 0x0d95 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0d89 }
            if (r0 == 0) goto L_0x0a55
            java.lang.String r0 = "created_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d89 }
            boolean r12 = r1.isNull(r0)     // Catch:{ all -> 0x0d89 }
            if (r12 != 0) goto L_0x0a55
            long r25 = r1.getLong(r0)     // Catch:{ all -> 0x0d89 }
        L_0x0a55:
            r1.close()     // Catch:{ all -> 0x0d95 }
            r24.close()     // Catch:{ all -> 0x0e57 }
            r14 = 0
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a9f
        L_0x0a61:
            X.0xM r12 = r8.A0C     // Catch:{ all -> 0x0e57 }
            r0 = r27
            long r25 = r12.A0K(r0)     // Catch:{ all -> 0x0e57 }
            int r0 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0a9f
            X.12P r0 = r13.A04     // Catch:{ all -> 0x0e57 }
            X.1M0 r12 = r0.A05()     // Catch:{ all -> 0x0e57 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0d9a }
            r1.<init>()     // Catch:{ all -> 0x0d9a }
            java.lang.String r13 = "created_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0d9a }
            r1.put(r13, r0)     // Catch:{ all -> 0x0d9a }
            X.14e r13 = r12.A02     // Catch:{ all -> 0x0d9a }
            java.lang.String r29 = "chat"
            java.lang.String r30 = "_id=?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0d9a }
            r15 = 0
            java.lang.String r14 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x0d9a }
            r0[r15] = r14     // Catch:{ all -> 0x0d9a }
            java.lang.String r31 = "setCreatedTime"
            r27 = r13
            r28 = r1
            r32 = r0
            r27.A01(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0d9a }
            r12.close()     // Catch:{ all -> 0x0e57 }
        L_0x0a9f:
            int r1 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0aa5
            r0 = 1
        L_0x0aa5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0H = r0     // Catch:{ all -> 0x0e57 }
            X.1CR r12 = r8.A0e     // Catch:{ all -> 0x0e57 }
            boolean r14 = r12.A0j(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x0e57 }
            X.3LI r0 = X.AnonymousClass1CR.A02(r12, r0)     // Catch:{ all -> 0x0e57 }
            boolean r1 = r0.A0J     // Catch:{ all -> 0x0e57 }
            if (r10 == 0) goto L_0x0ac2
            X.3IL r0 = r10.A0F     // Catch:{ all -> 0x0e57 }
            r13 = 1
            if (r0 != 0) goto L_0x0ac3
        L_0x0ac2:
            r13 = 0
        L_0x0ac3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0e57 }
            r6.A02 = r0     // Catch:{ all -> 0x0e57 }
            if (r14 != 0) goto L_0x0acd
            r0 = 1
            goto L_0x0ad1
        L_0x0acd:
            r0 = 2
            if (r1 == 0) goto L_0x0ad1
            r0 = 3
        L_0x0ad1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0O = r0     // Catch:{ all -> 0x0e57 }
            r0 = 4505(0x1199, float:6.313E-42)
            boolean r0 = X.C20800yB.A01(r3, r5, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0af6
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x0e57 }
            X.3LI r0 = X.AnonymousClass1CR.A02(r12, r0)     // Catch:{ all -> 0x0e57 }
            int r13 = r0.A02     // Catch:{ all -> 0x0e57 }
            r1 = 1
            r0 = 2
            if (r13 == r0) goto L_0x0af0
            if (r13 == r1) goto L_0x0af0
            r1 = 0
        L_0x0af0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A05 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0af6:
            if (r10 == 0) goto L_0x0b2c
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r10.A06(r0)     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0e57 }
            boolean r0 = r10.A0C()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0b16
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0P = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r10.A0A()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0b43
            if (r1 == 0) goto L_0x0b43
            goto L_0x0b34
        L_0x0b16:
            boolean r0 = X.AnonymousClass143.A0H(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0b24
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0P = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0b43
        L_0x0b24:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0P = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0b43
        L_0x0b2c:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0P = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0b43
        L_0x0b34:
            X.185 r0 = r8.A0V     // Catch:{ all -> 0x0e57 }
            boolean r0 = r0.A04(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0b43
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0P = r0     // Catch:{ all -> 0x0e57 }
        L_0x0b43:
            boolean r0 = r12.A0k(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0C = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r2.A0N(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A04 = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r4 instanceof X.C223313w     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0b99
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0D = r0     // Catch:{ all -> 0x0e57 }
            r10 = r4
            X.13w r10 = (X.C223313w) r10     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = r6.A0B     // Catch:{ all -> 0x0e57 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0e57 }
            X.1FV r1 = r8.A0I     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0bb8
            monitor-enter(r1)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ all -> 0x0da4 }
            long r14 = X.AnonymousClass1FV.A00(r1, r10)     // Catch:{ all -> 0x0da4 }
            r12 = 0
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0b81
            r0 = 1
        L_0x0b81:
            monitor-exit(r1)     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0I = r0     // Catch:{ all -> 0x0e57 }
            X.12O r0 = r8.A0H     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r10)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            if (r1 != 0) goto L_0x0b92
            r0 = 1
        L_0x0b92:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0J = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0bbe
        L_0x0b99:
            if (r11 == 0) goto L_0x0bb0
            boolean r0 = r11.A0G()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0bb0
            r0 = r4
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0e57 }
            int r1 = r2.A05(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            if (r1 != r0) goto L_0x0bb0
            boolean r0 = r11.A0j     // Catch:{ all -> 0x0e57 }
            r1 = 1
            if (r0 != 0) goto L_0x0bb1
        L_0x0bb0:
            r1 = 0
        L_0x0bb1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0e57 }
            r6.A0D = r0     // Catch:{ all -> 0x0e57 }
            goto L_0x0bbe
        L_0x0bb8:
            java.lang.Boolean r0 = r1.A06(r10)     // Catch:{ all -> 0x0e57 }
            r6.A0K = r0     // Catch:{ all -> 0x0e57 }
        L_0x0bbe:
            int r0 = r2.A02(r4)     // Catch:{ all -> 0x0e57 }
            long r0 = (long) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1a = r0     // Catch:{ all -> 0x0e57 }
            X.1NO r0 = r8.A0a     // Catch:{ all -> 0x0e57 }
            long r0 = r0.A01(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A1Z = r0     // Catch:{ all -> 0x0e57 }
            int r0 = X.AnonymousClass3TD.A00(r9, r2, r4)     // Catch:{ all -> 0x0e57 }
            long r0 = (long) r0     // Catch:{ all -> 0x0e57 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0l = r0     // Catch:{ all -> 0x0e57 }
            X.0v0 r0 = r8.A0X     // Catch:{ all -> 0x0e57 }
            X.005 r9 = r0.A00     // Catch:{ all -> 0x0e57 }
            java.lang.Object r2 = r9.get()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = "1on1_invite_sender"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)     // Catch:{ all -> 0x0e57 }
            com.whatsapp.jid.UserJid r1 = r1.A02(r7)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0c03
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0c0b
        L_0x0c03:
            X.1NZ r0 = r8.A0Z     // Catch:{ all -> 0x0e57 }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0c12
        L_0x0c0b:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0A = r0     // Catch:{ all -> 0x0e57 }
        L_0x0c12:
            r0 = 4471(0x1177, float:6.265E-42)
            boolean r0 = X.C20800yB.A01(r3, r5, r0)     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0c3f
            if (r1 == 0) goto L_0x0c3f
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x0e57 }
            if (r1 != 0) goto L_0x0c24
            r0 = 0
            goto L_0x0c39
        L_0x0c24:
            java.lang.Object r3 = r9.get()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0e57 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0e57 }
            r2.<init>()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "contactless_jids_store"
            java.util.Set r0 = r3.getStringSet(r0, r2)     // Catch:{ all -> 0x0e57 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0e57 }
        L_0x0c39:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r6.A0L = r0     // Catch:{ all -> 0x0e57 }
        L_0x0c3f:
            X.0yW r13 = r8.A0b     // Catch:{ all -> 0x0e57 }
            r13.Blw(r6)     // Catch:{ all -> 0x0e57 }
            java.lang.String r14 = r4.getRawString()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r1.append(r14)     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = "_notification"
            r1.append(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x0cc8
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.Long r12 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 1
            java.lang.Long r30 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 2
            java.lang.Long r29 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            java.lang.Long r28 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 4
            java.lang.Long r15 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 5
            java.lang.Long r11 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 6
            java.lang.Long r10 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 7
            java.lang.Long r9 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 8
            java.lang.Long r5 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 9
            java.lang.Long r3 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 10
            java.lang.Long r2 = X.C202339lc.A04(r1, r0)     // Catch:{ all -> 0x0e57 }
            r26 = 0
            if (r12 == 0) goto L_0x0cb4
            long r24 = r12.longValue()     // Catch:{ all -> 0x0e57 }
            int r0 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x0cfd
        L_0x0cb4:
            if (r3 == 0) goto L_0x0cbe
            long r24 = r3.longValue()     // Catch:{ all -> 0x0e57 }
            int r0 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x0cfd
        L_0x0cbe:
            if (r2 == 0) goto L_0x0cc8
            long r24 = r2.longValue()     // Catch:{ all -> 0x0e57 }
            int r0 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x0cfd
        L_0x0cc8:
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x0e57 }
            r0 = 0
            java.lang.String r1 = r1.getString(r7, r0)     // Catch:{ all -> 0x0e57 }
            X.2Pg r4 = new X.2Pg     // Catch:{ all -> 0x0e57 }
            r4.<init>()     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = r6.A2V     // Catch:{ all -> 0x0e57 }
            r4.A02 = r0     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = r6.A2U     // Catch:{ all -> 0x0e57 }
            r4.A01 = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0e57 }
            if (r0 != 0) goto L_0x006c
            X.9fc r0 = X.C199619fc.A00(r1)     // Catch:{ all -> 0x0e57 }
            java.lang.Long r3 = r0.A0p     // Catch:{ all -> 0x0e57 }
            if (r3 == 0) goto L_0x006c
            long r5 = r3.longValue()     // Catch:{ all -> 0x0e57 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            r4.A00 = r3     // Catch:{ all -> 0x0e57 }
            r13.Bly(r4)     // Catch:{ all -> 0x0e57 }
            goto L_0x006c
        L_0x0cfd:
            X.2Sr r1 = new X.2Sr     // Catch:{ all -> 0x0e57 }
            r1.<init>()     // Catch:{ all -> 0x0e57 }
            r0 = r37
            java.lang.String r0 = r0.A03(r14)     // Catch:{ all -> 0x0e57 }
            r1.A0E = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = X.AnonymousClass143.A0G(r4)     // Catch:{ all -> 0x0e57 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r1.A00 = r0     // Catch:{ all -> 0x0e57 }
            boolean r0 = r4 instanceof X.AnonymousClass147     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0d27
            X.1EM r14 = r8.A0Q     // Catch:{ all -> 0x0e57 }
            r0 = r4
            X.147 r0 = (X.AnonymousClass147) r0     // Catch:{ all -> 0x0e57 }
            int r0 = r14.A00(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r1.A02 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0d27:
            boolean r0 = r4 instanceof X.AnonymousClass144     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0d3f
            X.17X r0 = r8.A0D     // Catch:{ all -> 0x0e57 }
            X.144 r4 = (X.AnonymousClass144) r4     // Catch:{ all -> 0x0e57 }
            X.17r r0 = r0.A07     // Catch:{ all -> 0x0e57 }
            int r0 = r0.A0A(r4)     // Catch:{ all -> 0x0e57 }
            int r0 = X.AnonymousClass3UK.A03(r0)     // Catch:{ all -> 0x0e57 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0e57 }
            r1.A01 = r0     // Catch:{ all -> 0x0e57 }
        L_0x0d3f:
            if (r5 == 0) goto L_0x0d4b
            long r24 = r5.longValue()     // Catch:{ all -> 0x0e57 }
            int r0 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d4b
            r1.A03 = r5     // Catch:{ all -> 0x0e57 }
        L_0x0d4b:
            r1.A06 = r9     // Catch:{ all -> 0x0e57 }
            r0 = r28
            r1.A07 = r0     // Catch:{ all -> 0x0e57 }
            r1.A08 = r15     // Catch:{ all -> 0x0e57 }
            r0 = r29
            r1.A09 = r0     // Catch:{ all -> 0x0e57 }
            r1.A0A = r11     // Catch:{ all -> 0x0e57 }
            r1.A0B = r10     // Catch:{ all -> 0x0e57 }
            r1.A0C = r12     // Catch:{ all -> 0x0e57 }
            r0 = r30
            r1.A0D = r0     // Catch:{ all -> 0x0e57 }
            r1.A04 = r3     // Catch:{ all -> 0x0e57 }
            r1.A05 = r2     // Catch:{ all -> 0x0e57 }
            r13.Blw(r1)     // Catch:{ all -> 0x0e57 }
            goto L_0x0cc8
        L_0x0d6a:
            r1 = move-exception
            if (r10 == 0) goto L_0x0d7c
            r10.close()     // Catch:{ all -> 0x0d78 }
            goto L_0x0d7c
        L_0x0d71:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d7c
            r2.close()     // Catch:{ all -> 0x0d78 }
            goto L_0x0d7c
        L_0x0d78:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d7d }
        L_0x0d7c:
            throw r1     // Catch:{ all -> 0x0d7d }
        L_0x0d7d:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0d82 }
            goto L_0x0d86
        L_0x0d82:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d87 }
        L_0x0d86:
            throw r1     // Catch:{ all -> 0x0d87 }
        L_0x0d87:
            r0 = move-exception
            goto L_0x0da6
        L_0x0d89:
            r2 = move-exception
            if (r1 == 0) goto L_0x0d94
            r1.close()     // Catch:{ all -> 0x0d90 }
            goto L_0x0d94
        L_0x0d90:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x0d95 }
        L_0x0d94:
            throw r2     // Catch:{ all -> 0x0d95 }
        L_0x0d95:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0d9f }
            goto L_0x0da3
        L_0x0d9a:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0d9f }
            goto L_0x0da3
        L_0x0d9f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e57 }
        L_0x0da3:
            throw r1     // Catch:{ all -> 0x0e57 }
        L_0x0da4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0e57 }
        L_0x0da6:
            throw r0     // Catch:{ all -> 0x0e57 }
        L_0x0da7:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r18 + r5
            long r3 = r0 + r5
            int r2 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0db8
            long r16 = r16 / r5
            long r16 = r16 * r5
            long r0 = r18 + r16
        L_0x0db8:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r2 = r2.clear()     // Catch:{ all -> 0x0e57 }
            r2.apply()     // Catch:{ all -> 0x0e57 }
            r2 = r37
            r2.A04(r0)     // Catch:{ all -> 0x0e57 }
            X.1Na r4 = r8.A08     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r0 = X.C27131Na.A01(r4)     // Catch:{ all -> 0x0e57 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0e57 }
            java.util.Set r2 = r0.keySet()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r0 = X.C27131Na.A00(r4)     // Catch:{ all -> 0x0e57 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0e57 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x0e57 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0e57 }
            r0.<init>()     // Catch:{ all -> 0x0e57 }
            r0.addAll(r2)     // Catch:{ all -> 0x0e57 }
            r0.addAll(r1)     // Catch:{ all -> 0x0e57 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0e57 }
        L_0x0df5:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0e57 }
            if (r0 == 0) goto L_0x0e55
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0e57 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0e57 }
            java.lang.String r0 = ","
            java.lang.String[] r7 = r5.split(r0)     // Catch:{ all -> 0x0e57 }
            int r2 = r7.length     // Catch:{ all -> 0x0e57 }
            r1 = 2
            r0 = 0
            r6 = 1
            if (r2 != r1) goto L_0x0e36
            r1 = r7[r0]     // Catch:{ all -> 0x0e57 }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x0e57 }
            X.11F r3 = r0.A02(r1)     // Catch:{ all -> 0x0e57 }
            if (r3 == 0) goto L_0x0e36
            X.1A1 r2 = r4.A03     // Catch:{ all -> 0x0e57 }
            r1 = r7[r6]     // Catch:{ all -> 0x0e57 }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x0e57 }
            r0.<init>(r3, r1, r6)     // Catch:{ all -> 0x0e57 }
            X.3T1 r1 = r2.A03(r0)     // Catch:{ all -> 0x0e57 }
            if (r1 == 0) goto L_0x0e36
            X.0wo r0 = r4.A02     // Catch:{ all -> 0x0e57 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0e57 }
            long r0 = r1.A0I     // Catch:{ all -> 0x0e57 }
            int r1 = X.AnonymousClass6XI.A00(r2, r0)     // Catch:{ all -> 0x0e57 }
            r0 = 3
            if (r1 >= r0) goto L_0x0e36
            goto L_0x0df5
        L_0x0e36:
            android.content.SharedPreferences r0 = X.C27131Na.A01(r4)     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x0e57 }
            r0.apply()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences r0 = X.C27131Na.A00(r4)     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0e57 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x0e57 }
            r0.apply()     // Catch:{ all -> 0x0e57 }
            goto L_0x0df5
        L_0x0e55:
            monitor-exit(r8)
            return
        L_0x0e57:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NM.A07():void");
    }

    public void A09(AnonymousClass11F r4, int i) {
        if (!this.A02.A0M(r4)) {
            this.A0R.execute(new C35261iP(this, r4, i, 11));
        }
    }

    public void A0A(AnonymousClass11F r4, int i) {
        if (!this.A02.A0M(r4)) {
            this.A0R.execute(new C35261iP(this, r4, i, 12));
        }
    }

    public void A0B(AnonymousClass11F r4, int i) {
        if (!this.A02.A0M(r4)) {
            this.A0R.execute(new C35261iP(this, r4, i, 13));
        }
    }

    public void A0D(UserJid userJid, int i) {
        A03(new AnonymousClass9wp(i), this, userJid);
    }

    public void A0E(C107265Nh r5, Integer num) {
        Object obj;
        if (r5 != null && num != null) {
            if (r5.A0M()) {
                obj = r5.A0D;
            } else {
                obj = r5.A04.A01;
            }
            if (obj != null) {
                this.A0R.execute(new C35321iV(this, obj, num, 38));
            }
        }
    }

    public void BTO(AnonymousClass11F r4, C64933Qa r5) {
        this.A0R.execute(new C35321iV(this, r5, r4, 41));
    }

    public void BTP(AnonymousClass11F r4, C64933Qa r5) {
        this.A0R.execute(new C35321iV(this, r4, r5, 36));
    }

    public void BTQ(C64933Qa r4, List list) {
        this.A0R.execute(new C35321iV(this, list, r4, 42));
    }

    public void BaT(AnonymousClass11F r4) {
        this.A0R.execute(new C35681j5(this, r4, 11));
    }

    public void Bau(AnonymousClass3T1 r4, int i) {
        if (i == 25 && !r4.A1J.A02 && C66013Ui.A0L(r4.A1I)) {
            this.A0R.execute(new C35681j5(this, r4, 10));
        }
    }

    public void Bb6(Collection collection, Map map) {
        if (map != null && !map.isEmpty()) {
            this.A0R.execute(new C35321iV(this, map, collection, 43));
        }
    }

    public static void A02(SharedPreferences sharedPreferences, C199619fc r2, String str) {
        sharedPreferences.edit().putString(str, r2.toString()).apply();
    }

    private void A05(AnonymousClass2T9 r5, String str, int i) {
        String string = A00(this).getString(A01(str, i), (String) null);
        if (!TextUtils.isEmpty(string)) {
            long A012 = AnonymousClass6R8.A01(string, 0);
            if (i != 1) {
                Long valueOf = Long.valueOf(A012);
                if (i != 2) {
                    r5.A2G = valueOf;
                } else {
                    r5.A2H = valueOf;
                }
            } else {
                r5.A2I = Long.valueOf(A012);
            }
        }
    }

    public void BSa(C107265Nh r5) {
        Object obj;
        if (r5.A0M()) {
            obj = r5.A0D;
        } else {
            obj = r5.A04.A01;
        }
        if (obj != null) {
            this.A0R.execute(new C35321iV(this, obj, r5, 37));
        }
    }

    public AnonymousClass1NM(C19460v5 r4, C19700wN r5, C19730wQ r6, AnonymousClass1KK r7, AnonymousClass1NP r8, C25791Hr r9, AnonymousClass1NU r10, C25681Hg r11, AnonymousClass1NV r12, AnonymousClass16D r13, AnonymousClass185 r14, C27131Na r15, C19970wo r16, C19420v0 r17, C25851Hx r18, AnonymousClass163 r19, C220412q r20, C20310xM r21, AnonymousClass17X r22, AnonymousClass168 r23, C24541Cv r24, AnonymousClass1NZ r25, AnonymousClass17T r26, AnonymousClass17U r27, AnonymousClass1NO r28, AnonymousClass12O r29, AnonymousClass1FV r30, C26171Jd r31, AnonymousClass1DW r32, C235518x r33, C20810yC r34, C21010yW r35, AnonymousClass17V r36, AnonymousClass1NN r37, AnonymousClass1NW r38, C19890wg r39, AnonymousClass1CR r40, AnonymousClass1A1 r41, C27171Ne r42, C27151Nc r43, AnonymousClass1EM r44, C19770wU r45, AnonymousClass005 r46) {
        this.A0W = r16;
        this.A0M = r34;
        this.A0T = r11;
        this.A0A = r19;
        this.A01 = r5;
        this.A02 = r6;
        this.A0B = r20;
        this.A0b = r35;
        this.A0F = r26;
        this.A0G = r27;
        this.A0Y = r23;
        this.A0h = r46;
        this.A07 = r13;
        this.A0K = r32;
        this.A0Q = r44;
        this.A0c = r37;
        this.A0P = r41;
        this.A0E = r24;
        this.A0H = r29;
        this.A0e = r40;
        this.A05 = r9;
        this.A0N = r36;
        this.A0J = r31;
        this.A0a = r28;
        this.A0V = r14;
        this.A0X = r17;
        this.A04 = r8;
        this.A06 = r10;
        this.A03 = r7;
        this.A0I = r30;
        this.A0C = r21;
        this.A0U = r12;
        this.A0D = r22;
        this.A0d = r39;
        this.A0S = r4;
        this.A09 = r18;
        this.A0O = r38;
        this.A0Z = r25;
        this.A08 = r15;
        this.A0L = r33;
        this.A0g = r43;
        this.A0f = r42;
        this.A0R = new C19930wk(r45, false);
    }

    /* JADX WARNING: type inference failed for: r0v244, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v249, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0187, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0191, code lost:
        if (r0.longValue() != 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0193, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0199, code lost:
        if (r10.A1T(1) == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x019b, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019e, code lost:
        r25 = false;
        r13 = false;
        r26 = false;
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a5, code lost:
        if (r10 == null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01af, code lost:
        if (X.C20800yB.A01(r7, r35, 5963) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b1, code lost:
        r1 = X.C66013Ui.A0D(r10.A1I);
        r24 = "video".equals(r1);
        r23 = "gif".equals(r1);
        r21 = "audio".equals(r1);
        r20 = "document".equals(r1);
        r19 = "sticker".equals(r1);
        r18 = "ptv".equals(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01dd, code lost:
        if ((r10 instanceof X.C46812bi) == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01df, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e8, code lost:
        if (((X.C46812bi) r10).A1l() != false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ea, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ed, code lost:
        r24 = false;
        r23 = false;
        r21 = false;
        r20 = false;
        r19 = false;
        r18 = false;
        r17 = false;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01fc, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01fe, code lost:
        r12 = r10 instanceof X.AnonymousClass2bS;
        r0 = r10.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0204, code lost:
        if (r0 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020c, code lost:
        if ((r0.A1J.A00 instanceof X.C177528dw) == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020e, code lost:
        r16 = r10 instanceof X.AnonymousClass2bT;
        r11 = X.C199619fc.A00(r33.getString(r32, "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"));
        r27 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0222, code lost:
        if (r42 == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0224, code lost:
        r11.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0227, code lost:
        if (r25 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0229, code lost:
        r11.A01(43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022e, code lost:
        if (r43 == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0230, code lost:
        r11.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0234, code lost:
        if (r15 == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0236, code lost:
        r11.A01(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023a, code lost:
        if (r9 == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023c, code lost:
        r11.A01(21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0241, code lost:
        if (r44 == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0243, code lost:
        r11.A01(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0248, code lost:
        if (r31 == false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x024a, code lost:
        r11.A01(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x024f, code lost:
        if (r13 == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0251, code lost:
        r11.A01(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0256, code lost:
        if (r25 == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0258, code lost:
        r11.A01(33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025d, code lost:
        if (r26 == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025f, code lost:
        r11.A01(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0264, code lost:
        if (r25 == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0266, code lost:
        r11.A01(37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026b, code lost:
        if (r28 == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x026d, code lost:
        r11.A01(39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0272, code lost:
        if (r25 == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0274, code lost:
        r11.A01(41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0279, code lost:
        if (r24 == false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027b, code lost:
        r11.A01(49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0280, code lost:
        if (r25 == false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0282, code lost:
        r11.A01(51);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0287, code lost:
        if (r23 == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0289, code lost:
        r11.A01(53);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x028e, code lost:
        if (r25 == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0290, code lost:
        r11.A01(55);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0295, code lost:
        if (r21 == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0297, code lost:
        r11.A01(57);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x029c, code lost:
        if (r25 == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x029e, code lost:
        r11.A01(59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02a3, code lost:
        if (r20 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a5, code lost:
        r11.A01(61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02aa, code lost:
        if (r25 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ac, code lost:
        r11.A01(63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02b1, code lost:
        if (r19 == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02b3, code lost:
        r11.A01(65);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02b8, code lost:
        if (r25 == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02ba, code lost:
        r11.A01(67);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02bf, code lost:
        if (r18 == false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c1, code lost:
        r11.A01(70);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02c6, code lost:
        if (r17 == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02c8, code lost:
        r11.A01(72);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02cd, code lost:
        if (r12 == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02cf, code lost:
        r11.A01(74);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02d4, code lost:
        if (r34 == false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d6, code lost:
        r11.A01(76);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02db, code lost:
        if (r16 == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02dd, code lost:
        r11.A01(45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02e2, code lost:
        if (r30 == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02e4, code lost:
        r0 = 47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02e8, code lost:
        r11.A01(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02ec, code lost:
        if (r25 == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02ee, code lost:
        r11.A01(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02f3, code lost:
        if (r43 == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02f5, code lost:
        r11.A01(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02f9, code lost:
        if (r15 == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02fb, code lost:
        r11.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02ff, code lost:
        if (r44 == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0301, code lost:
        r11.A01(23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0306, code lost:
        if (r29 == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0308, code lost:
        r11.A01(30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x030d, code lost:
        if (r13 == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x030f, code lost:
        r11.A01(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0314, code lost:
        if (r25 == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0316, code lost:
        r11.A01(34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x031b, code lost:
        if (r26 == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x031d, code lost:
        r11.A01(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0322, code lost:
        if (r25 == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0324, code lost:
        r11.A01(38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0329, code lost:
        if (r28 == false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x032b, code lost:
        r11.A01(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0330, code lost:
        if (r25 == false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0332, code lost:
        r11.A01(42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0337, code lost:
        if (r24 == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0339, code lost:
        r11.A01(50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x033e, code lost:
        if (r25 == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0340, code lost:
        r11.A01(52);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0345, code lost:
        if (r23 == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0347, code lost:
        r11.A01(54);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x034c, code lost:
        if (r25 == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x034e, code lost:
        r11.A01(56);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0353, code lost:
        if (r21 == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0355, code lost:
        r11.A01(58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x035a, code lost:
        if (r25 == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x035c, code lost:
        r11.A01(60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0361, code lost:
        if (r20 == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0363, code lost:
        r11.A01(62);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0368, code lost:
        if (r25 == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x036a, code lost:
        r11.A01(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x036f, code lost:
        if (r19 == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0371, code lost:
        r11.A01(66);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0376, code lost:
        if (r25 == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0378, code lost:
        r11.A01(68);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x037d, code lost:
        if (r18 == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x037f, code lost:
        r11.A01(71);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0384, code lost:
        if (r17 == false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0386, code lost:
        r11.A01(73);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x038b, code lost:
        if (r12 == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x038d, code lost:
        r11.A01(75);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0392, code lost:
        if (r34 == false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0394, code lost:
        r11.A01(77);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0399, code lost:
        if (r14 == false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x039b, code lost:
        r11.A01(78);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03a0, code lost:
        if (r16 == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03a2, code lost:
        r11.A01(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03a7, code lost:
        if (r30 == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03a9, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03ab, code lost:
        r11.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        r17 = X.AnonymousClass143.A0G(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03b2, code lost:
        if (r17 != false) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03b4, code lost:
        r12 = r4.A07.A08(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03ba, code lost:
        if (r12 != null) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x03bc, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - ");
        r1.append(r6.getRawString());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03d7, code lost:
        if (r11.A0B != null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03d9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03da, code lost:
        if (r42 != false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03dc, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03dd, code lost:
        r11.A0B = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03e3, code lost:
        if (r42 != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03e5, code lost:
        if (r10 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03e7, code lost:
        r11.A0R = java.lang.Long.valueOf(r10.A0G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03f3, code lost:
        if (r12.A0C() == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03f5, code lost:
        r1 = r11.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03f7, code lost:
        if (r1 != null) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x03f9, code lost:
        r11.A0F = 0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0401, code lost:
        r11.A0C = java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0408, code lost:
        r0 = r11.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x040a, code lost:
        if (r0 == null) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0412, code lost:
        if ((r0.booleanValue() ^ r42) == false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0414, code lost:
        r11.A0F = java.lang.Long.valueOf(r1.longValue() + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0422, code lost:
        if (r42 == false) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0424, code lost:
        r12 = r11.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0426, code lost:
        if (r12 == null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x042a, code lost:
        if (r11.A0S != null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x042c, code lost:
        if (r10 == null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r41.intValue() != 1) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x042e, code lost:
        r11.A0S = java.lang.Long.valueOf((r10.A0I - r12.longValue()) / 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x043e, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x043f, code lost:
        if (r44 == false) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0441, code lost:
        r14 = r4.A0J.A08(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0447, code lost:
        if (r14 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0449, code lost:
        r13 = r14.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x044d, code lost:
        if (r9 == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x044f, code lost:
        if (r13 == null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0451, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0459, code lost:
        if (r13.A1T(4194304) != false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x045b, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x045d, code lost:
        r12 = null;
        r0 = X.C24541Cv.A01(r4.A0E, r6, 1, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x046a, code lost:
        if (r0.isEmpty() != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x046c, code lost:
        r12 = (X.AnonymousClass3T1) r0.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0472, code lost:
        if (r42 == false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0474, code lost:
        if (r44 != false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0476, code lost:
        if (r13 != null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0478, code lost:
        if (r12 == null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x047a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0481, code lost:
        if (r12.A1T(4194304) != false) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0483, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0484, code lost:
        if (r16 != false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0486, code lost:
        if (r0 == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0488, code lost:
        r11.A01(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x048d, code lost:
        if (r44 == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0495, code lost:
        if (r14.A1T(4194304) == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0497, code lost:
        r11.A01(29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x049c, code lost:
        if (r42 == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x04a4, code lost:
        if (r14.A1T(2097152) == false) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04a6, code lost:
        r0 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04af, code lost:
        if (r14.A1T(4194304) == false) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04b1, code lost:
        r0 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04b3, code lost:
        r11.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04b6, code lost:
        if (r10 == null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04ba, code lost:
        if (r10.A10 == false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x04bc, code lost:
        if (r42 != false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x04be, code lost:
        r11.A01(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x04c3, code lost:
        A02(r33, r11, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x04ca, code lost:
        if (r17 != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x04cc, code lost:
        r1 = A00(r4);
        r0 = r6.getRawString();
        r10 = new java.lang.StringBuilder();
        r10.append(r0);
        r10.append("_commerce");
        r11 = r10.toString();
        r10 = X.C198979eV.A00(r1.getString(r11, "null,false,false,null,false,null,null,null,null,null"));
        r13 = r37.A03(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x04f5, code lost:
        if (r13 == null) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x04f7, code lost:
        r12 = r13 instanceof X.C46952bw;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x04f9, code lost:
        if (r12 != false) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x04fd, code lost:
        if ((r13 instanceof X.C46852bm) != false) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04ff, code lost:
        r14 = r13.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0503, code lost:
        if (r14 == 52) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0507, code lost:
        if (r14 == 54) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x050b, code lost:
        if ((r13 instanceof X.AnonymousClass2bV) == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x050d, code lost:
        r14 = r13.A0b();
        r0 = r4.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0517, code lost:
        if (r0.A0G(r14) != false) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x051d, code lost:
        if (r0.A0H(r14) == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x051f, code lost:
        if (r42 == false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0521, code lost:
        if (r12 == false) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0523, code lost:
        r0 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0527, code lost:
        if (r0 != null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0529, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x052c, code lost:
        r12 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0530, code lost:
        r10.A03 = java.lang.Long.valueOf(r12 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0538, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x053c, code lost:
        if (r0 != null) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x053e, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0541, code lost:
        r12 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0545, code lost:
        r10.A02 = java.lang.Long.valueOf(r12 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x054e, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0552, code lost:
        if (r0 != null) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0554, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0559, code lost:
        if ((r13 instanceof X.AnonymousClass2bV) == false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x055b, code lost:
        if (r42 == false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x055d, code lost:
        r12 = r13.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0563, code lost:
        if ((r12 instanceof X.C46852bm) == false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0571, code lost:
        if (((X.C46852bm) r12).A1J.A01.startsWith("product_inquiry") == false) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0573, code lost:
        r0 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0577, code lost:
        if (r0 != null) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0579, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x057c, code lost:
        r12 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0580, code lost:
        r10.A05 = java.lang.Long.valueOf(r12 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0589, code lost:
        r12 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x058d, code lost:
        r10.A01 = java.lang.Long.valueOf(r12 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0595, code lost:
        r1.edit().putString(r11, r10.toString()).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05a4, code lost:
        if (r42 == false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05a6, code lost:
        r10 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05aa, code lost:
        if ((r10 instanceof X.C177538dx) == false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05ac, code lost:
        r4.A09(r6, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05b1, code lost:
        r1 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x05b3, code lost:
        if (r10 == null) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x05b5, code lost:
        r12 = X.C27131Na.A00(r1);
        r8 = r8.A01;
        r11 = r12.getString(X.C27131Na.A02(r10, r8), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05c9, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05cc, code lost:
        r0 = r11.contains("quick_reply");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05d3, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x05d5, code lost:
        if (r0 == false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x05dd, code lost:
        if (r36.A0M(r6) != false) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x05df, code lost:
        r4.A0R.execute(new X.C35261iP(r4, r6, 3, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x05eb, code lost:
        X.C27131Na.A00(r1).edit().remove(X.C27131Na.A02(r10, r8)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05fe, code lost:
        r11 = X.C27131Na.A01(r1).getInt(X.C27131Na.A02(r10, r8), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x060a, code lost:
        if (r11 == 0) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x060c, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        if (r2 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x060f, code lost:
        if (r11 == 1) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0612, code lost:
        if (r11 == 2) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0614, code lost:
        r0 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0616, code lost:
        if (r11 == 3) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0619, code lost:
        if (r11 != 4) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x061b, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x061e, code lost:
        r0 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0620, code lost:
        r4.A09(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0623, code lost:
        X.C27131Na.A01(r1).edit().remove(X.C27131Na.A02(r10, r8)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0636, code lost:
        if (r22 == null) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0638, code lost:
        r12 = A00(r4);
        r8 = A01(r6.getRawString(), r22.intValue());
        r12.edit().putString(r8, java.lang.Long.toString(X.AnonymousClass6R8.A01(r12.getString(r8, "0"), 0) + 1)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x066e, code lost:
        if (X.C20800yB.A01(r7, r35, 2474) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0670, code lost:
        if (r2 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0672, code lost:
        r11 = A00(r4);
        r1 = r4.A0g;
        r8 = new X.C63303Jn(r5, r27, r15, r9);
        X.AnonymousClass00C.A0D(r11, 3);
        r14 = r1.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x068d, code lost:
        if (r14.hasNext() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x069b, code lost:
        if (X.C20800yB.A01(r7, ((X.C27141Nb) r14.next()).A00, 2474) == false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x069d, code lost:
        r0 = r2 instanceof X.C46902br;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x06a1, code lost:
        if ((r2 instanceof X.AnonymousClass2bL) == false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06a3, code lost:
        if (r0 != false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x06a7, code lost:
        if (r8.A00 == false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x06a9, code lost:
        r0 = r6.getRawString();
        X.AnonymousClass00C.A0D(r0, 0);
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append("_location");
        r5 = r1.toString();
        r9 = "0";
        r0 = r11.getString(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x06c7, code lost:
        if (r0 == null) goto L_0x06ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x06c9, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x06ca, code lost:
        r11.edit().putString(r5, java.lang.String.valueOf(X.AnonymousClass6R8.A01(r9, 0) + 1)).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r22 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        if (r2 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0121, code lost:
        if (r2.A0S() == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r33 = A00(r4);
        r32 = r6.getRawString();
        r10 = r37.A03(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0132, code lost:
        if (r10 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0134, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013a, code lost:
        if (X.C66013Ui.A0i(r10) != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013e, code lost:
        if (r10 != null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0140, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        if (r4.A0J.A07(r8) == 93) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014c, code lost:
        r30 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014e, code lost:
        if (r10 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0150, code lost:
        r29 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0158, code lost:
        if (r10.A1T(androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015a, code lost:
        r29 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015c, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015d, code lost:
        if (r10 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0167, code lost:
        if (X.C20800yB.A01(r7, r35, 5785) == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0169, code lost:
        r13 = r10 instanceof X.AnonymousClass2bV;
        r28 = X.C66013Ui.A0q(r10);
        r1 = r10.A1I;
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        if (r1 == 1) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0177, code lost:
        if (r1 == 25) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        if (r1 == 57) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017f, code lost:
        if (r1 == 42) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0181, code lost:
        r26 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0183, code lost:
        if (r42 == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0185, code lost:
        r0 = r10.A0h;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A04(X.AnonymousClass1NM r37, X.AnonymousClass11F r38, com.whatsapp.jid.UserJid r39, X.C64933Qa r40, java.lang.Integer r41, boolean r42, boolean r43, boolean r44) {
        /*
            r4 = r37
            monitor-enter(r4)
            X.17V r1 = r4.A0N     // Catch:{ all -> 0x06e7 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x06e7 }
            r0.<init>()     // Catch:{ all -> 0x06e7 }
            long r6 = r1.A02(r0)     // Catch:{ all -> 0x06e7 }
            X.1A1 r0 = r4.A0P     // Catch:{ all -> 0x06e7 }
            r37 = r0
            r8 = r40
            X.3T1 r0 = r0.A03(r8)     // Catch:{ all -> 0x06e7 }
            r3 = 0
            r5 = r42
            if (r0 == 0) goto L_0x0056
            long r0 = r0.A0I     // Catch:{ all -> 0x06e7 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0056
            X.11F r0 = r8.A00     // Catch:{ all -> 0x06e7 }
            int r6 = X.AnonymousClass3UK.A04(r0)     // Catch:{ all -> 0x06e7 }
            X.0yC r2 = r4.A0M     // Catch:{ all -> 0x06e7 }
            r1 = 3098(0xc1a, float:4.341E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x06e7 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00f6
            X.0wN r2 = r4.A01     // Catch:{ all -> 0x06e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e7 }
            r1.<init>()     // Catch:{ all -> 0x06e7 }
            java.lang.String r0 = "message-out-of-logging-window-"
            r1.append(r0)     // Catch:{ all -> 0x06e7 }
            r1.append(r5)     // Catch:{ all -> 0x06e7 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x06e7 }
            r1.append(r6)     // Catch:{ all -> 0x06e7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06e7 }
            r0 = 0
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x06e7 }
            goto L_0x00f6
        L_0x0056:
            X.0wQ r0 = r4.A02     // Catch:{ all -> 0x06e7 }
            r36 = r0
            r6 = r38
            boolean r0 = r0.A0M(r6)     // Catch:{ all -> 0x06e7 }
            if (r0 != 0) goto L_0x00f6
            r0 = r37
            X.3T1 r2 = r0.A03(r8)     // Catch:{ all -> 0x06e7 }
            X.005 r1 = r4.A0h     // Catch:{ all -> 0x06e7 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x06e7 }
            X.1HX r0 = (X.AnonymousClass1HX) r0     // Catch:{ all -> 0x06e7 }
            X.1Hg r0 = r0.A00     // Catch:{ all -> 0x06e7 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x06e7 }
            r22 = 0
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r9 = r1.get()     // Catch:{ all -> 0x06e7 }
            X.1HX r9 = (X.AnonymousClass1HX) r9     // Catch:{ all -> 0x06e7 }
            if (r2 == 0) goto L_0x0086
            java.util.List r0 = r2.A0w     // Catch:{ all -> 0x06e7 }
            r22 = r0
        L_0x0086:
            r7 = 1
            X.AnonymousClass00C.A0D(r6, r7)     // Catch:{ all -> 0x06e7 }
            r10 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x06e7 }
            if (r42 != 0) goto L_0x00ae
            boolean r0 = X.C197029b1.A00(r6)     // Catch:{ all -> 0x06e7 }
            if (r0 != 0) goto L_0x009f
            if (r39 == 0) goto L_0x00bd
            boolean r0 = X.C197029b1.A00(r39)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00bd
        L_0x009f:
            if (r41 == 0) goto L_0x00a8
            int r0 = r41.intValue()     // Catch:{ all -> 0x06e7 }
            r1 = 3
            if (r0 == r7) goto L_0x00a9
        L_0x00a8:
            r1 = 2
        L_0x00a9:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x06e7 }
            goto L_0x00bd
        L_0x00ae:
            boolean r0 = X.C197029b1.A00(r6)     // Catch:{ all -> 0x06e7 }
            if (r0 != 0) goto L_0x00bc
            r0 = r22
            com.whatsapp.jid.UserJid r0 = r9.A01(r0)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00bd
        L_0x00bc:
            r10 = r1
        L_0x00bd:
            r22 = r10
        L_0x00bf:
            if (r42 != 0) goto L_0x00c4
            r9 = 1
            if (r2 == 0) goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            X.0yC r0 = r4.A0M     // Catch:{ all -> 0x06e7 }
            r35 = r0
            r1 = 5963(0x174b, float:8.356E-42)
            X.0yV r7 = X.C21000yV.A02     // Catch:{ all -> 0x06e7 }
            boolean r0 = X.C20800yB.A01(r7, r0, r1)     // Catch:{ all -> 0x06e7 }
            r34 = 0
            if (r0 == 0) goto L_0x00e3
            if (r2 != 0) goto L_0x00e3
            X.1Jd r0 = r4.A0J     // Catch:{ all -> 0x06e7 }
            int r1 = r0.A07(r8)     // Catch:{ all -> 0x06e7 }
            r0 = 67
            if (r1 != r0) goto L_0x00e3
            r34 = 1
        L_0x00e3:
            if (r9 != 0) goto L_0x00e9
            boolean r0 = r2 instanceof X.AnonymousClass0p5     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00f8
        L_0x00e9:
            boolean r0 = A06(r4, r2, r8)     // Catch:{ all -> 0x06e7 }
            if (r0 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00f2
            goto L_0x0104
        L_0x00f2:
            if (r34 != 0) goto L_0x00f8
            if (r22 != 0) goto L_0x00f8
        L_0x00f6:
            monitor-exit(r4)
            return
        L_0x00f8:
            if (r2 == 0) goto L_0x010e
            int r0 = r2.A1I     // Catch:{ all -> 0x06e7 }
            boolean r0 = X.C66013Ui.A0L(r0)     // Catch:{ all -> 0x06e7 }
            r15 = 1
            if (r0 != 0) goto L_0x011c
            goto L_0x0119
        L_0x0104:
            X.1Jd r0 = r4.A0J     // Catch:{ all -> 0x06e7 }
            int r1 = r0.A07(r8)     // Catch:{ all -> 0x06e7 }
            r0 = 93
            if (r1 != r0) goto L_0x00f2
        L_0x010e:
            r1 = 68
            X.1Jd r0 = r4.A0J     // Catch:{ all -> 0x06e7 }
            int r0 = r0.A07(r8)     // Catch:{ all -> 0x06e7 }
            if (r1 != r0) goto L_0x0119
            goto L_0x00f6
        L_0x0119:
            r15 = 0
            if (r2 == 0) goto L_0x0123
        L_0x011c:
            X.3T1 r0 = r2.A0S()     // Catch:{ all -> 0x06e7 }
            r9 = 1
            if (r0 != 0) goto L_0x0124
        L_0x0123:
            r9 = 0
        L_0x0124:
            android.content.SharedPreferences r33 = A00(r4)     // Catch:{ all -> 0x06e5 }
            java.lang.String r32 = r6.getRawString()     // Catch:{ all -> 0x06e5 }
            r0 = r37
            X.3T1 r10 = r0.A03(r8)     // Catch:{ all -> 0x06e5 }
            if (r10 == 0) goto L_0x013c
            boolean r0 = X.C66013Ui.A0i(r10)     // Catch:{ all -> 0x06e5 }
            r31 = 1
            if (r0 != 0) goto L_0x014c
        L_0x013c:
            r31 = 0
            if (r10 != 0) goto L_0x014c
            X.1Jd r0 = r4.A0J     // Catch:{ all -> 0x06e5 }
            int r1 = r0.A07(r8)     // Catch:{ all -> 0x06e5 }
            r0 = 93
            r30 = 1
            if (r1 == r0) goto L_0x015a
        L_0x014c:
            r30 = 0
            if (r10 == 0) goto L_0x015a
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r10.A1T(r0)     // Catch:{ all -> 0x06e5 }
            r29 = 1
            if (r0 != 0) goto L_0x015c
        L_0x015a:
            r29 = 0
        L_0x015c:
            r14 = 1
            if (r10 == 0) goto L_0x019e
            r1 = 5785(0x1699, float:8.107E-42)
            r0 = r35
            boolean r0 = X.C20800yB.A01(r7, r0, r1)     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x019e
            boolean r13 = r10 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x06e5 }
            boolean r28 = X.C66013Ui.A0q(r10)     // Catch:{ all -> 0x06e5 }
            int r1 = r10.A1I     // Catch:{ all -> 0x06e5 }
            r26 = 1
            if (r1 == r14) goto L_0x0183
            r0 = 25
            if (r1 == r0) goto L_0x0183
            r0 = 57
            if (r1 == r0) goto L_0x0183
            r0 = 42
            if (r1 == r0) goto L_0x0183
            r26 = 0
        L_0x0183:
            if (r42 == 0) goto L_0x0193
            java.lang.Long r0 = r10.A0h     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x0193
            long r16 = r0.longValue()     // Catch:{ all -> 0x06e5 }
            r11 = 0
            int r0 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x019b
        L_0x0193:
            boolean r0 = r10.A1T(r14)     // Catch:{ all -> 0x06e5 }
            r25 = 0
            if (r0 == 0) goto L_0x01a7
        L_0x019b:
            r25 = 1
            goto L_0x01a7
        L_0x019e:
            r25 = 0
            r13 = 0
            r26 = 0
            r28 = 0
            if (r10 == 0) goto L_0x01ed
        L_0x01a7:
            r1 = 5963(0x174b, float:8.356E-42)
            r0 = r35
            boolean r0 = X.C20800yB.A01(r7, r0, r1)     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x01ed
            int r0 = r10.A1I     // Catch:{ all -> 0x06e5 }
            java.lang.String r1 = X.C66013Ui.A0D(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "video"
            boolean r24 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "gif"
            boolean r23 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "audio"
            boolean r21 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "document"
            boolean r20 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "sticker"
            boolean r19 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "ptv"
            boolean r18 = r0.equals(r1)     // Catch:{ all -> 0x06e5 }
            boolean r0 = r10 instanceof X.C46812bi     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x01ea
            r0 = r10
            X.2bi r0 = (X.C46812bi) r0     // Catch:{ all -> 0x06e5 }
            boolean r0 = r0.A1l()     // Catch:{ all -> 0x06e5 }
            r17 = 1
            if (r0 != 0) goto L_0x01fe
        L_0x01ea:
            r17 = 0
            goto L_0x01fe
        L_0x01ed:
            r24 = 0
            r23 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r12 = 0
        L_0x01fc:
            r14 = 0
            goto L_0x020e
        L_0x01fe:
            boolean r12 = r10 instanceof X.AnonymousClass2bS     // Catch:{ all -> 0x06e5 }
            X.3T1 r0 = r10.A0S()     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x01fc
            X.3Qa r0 = r0.A1J     // Catch:{ all -> 0x06e5 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x06e5 }
            boolean r0 = r0 instanceof X.C177528dw     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x01fc
        L_0x020e:
            boolean r0 = r10 instanceof X.AnonymousClass2bT     // Catch:{ all -> 0x06e5 }
            r16 = r0
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            r11 = r33
            r1 = r32
            java.lang.String r0 = r11.getString(r1, r0)     // Catch:{ all -> 0x06e5 }
            X.9fc r11 = X.C199619fc.A00(r0)     // Catch:{ all -> 0x06e5 }
            r27 = r43
            if (r42 == 0) goto L_0x02e8
            r11.A01(r3)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x022e
            r0 = 43
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x022e:
            if (r43 == 0) goto L_0x0234
            r0 = 2
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0234:
            if (r15 == 0) goto L_0x023a
            r0 = 4
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x023a:
            if (r9 == 0) goto L_0x0241
            r0 = 21
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0241:
            if (r44 == 0) goto L_0x0248
            r0 = 22
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0248:
            if (r31 == 0) goto L_0x024f
            r0 = 24
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x024f:
            if (r13 == 0) goto L_0x025d
            r0 = 31
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x025d
            r0 = 33
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x025d:
            if (r26 == 0) goto L_0x026b
            r0 = 35
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x026b
            r0 = 37
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x026b:
            if (r28 == 0) goto L_0x0279
            r0 = 39
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0279
            r0 = 41
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0279:
            if (r24 == 0) goto L_0x0287
            r0 = 49
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0287
            r0 = 51
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0287:
            if (r23 == 0) goto L_0x0295
            r0 = 53
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0295
            r0 = 55
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0295:
            if (r21 == 0) goto L_0x02a3
            r0 = 57
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x02a3
            r0 = 59
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02a3:
            if (r20 == 0) goto L_0x02b1
            r0 = 61
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x02b1
            r0 = 63
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02b1:
            if (r19 == 0) goto L_0x02bf
            r0 = 65
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x02bf
            r0 = 67
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02bf:
            if (r18 == 0) goto L_0x02c6
            r0 = 70
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02c6:
            if (r17 == 0) goto L_0x02cd
            r0 = 72
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02cd:
            if (r12 == 0) goto L_0x02d4
            r0 = 74
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02d4:
            if (r34 == 0) goto L_0x02db
            r0 = 76
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02db:
            if (r16 == 0) goto L_0x02e2
            r0 = 45
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02e2:
            if (r30 == 0) goto L_0x03ae
            r0 = 47
            goto L_0x03ab
        L_0x02e8:
            r0 = 1
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x02f3
            r0 = 44
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02f3:
            if (r43 == 0) goto L_0x02f9
            r0 = 3
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02f9:
            if (r15 == 0) goto L_0x02ff
            r0 = 5
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x02ff:
            if (r44 == 0) goto L_0x0306
            r0 = 23
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0306:
            if (r29 == 0) goto L_0x030d
            r0 = 30
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x030d:
            if (r13 == 0) goto L_0x031b
            r0 = 32
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x031b
            r0 = 34
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x031b:
            if (r26 == 0) goto L_0x0329
            r0 = 36
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0329
            r0 = 38
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0329:
            if (r28 == 0) goto L_0x0337
            r0 = 40
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0337
            r0 = 42
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0337:
            if (r24 == 0) goto L_0x0345
            r0 = 50
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0345
            r0 = 52
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0345:
            if (r23 == 0) goto L_0x0353
            r0 = 54
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0353
            r0 = 56
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0353:
            if (r21 == 0) goto L_0x0361
            r0 = 58
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x0361
            r0 = 60
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0361:
            if (r20 == 0) goto L_0x036f
            r0 = 62
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x036f
            r0 = 64
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x036f:
            if (r19 == 0) goto L_0x037d
            r0 = 66
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
            if (r25 == 0) goto L_0x037d
            r0 = 68
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x037d:
            if (r18 == 0) goto L_0x0384
            r0 = 71
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0384:
            if (r17 == 0) goto L_0x038b
            r0 = 73
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x038b:
            if (r12 == 0) goto L_0x0392
            r0 = 75
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0392:
            if (r34 == 0) goto L_0x0399
            r0 = 77
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x0399:
            if (r14 == 0) goto L_0x03a0
            r0 = 78
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x03a0:
            if (r16 == 0) goto L_0x03a7
            r0 = 46
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x03a7:
            if (r30 == 0) goto L_0x03ae
            r0 = 48
        L_0x03ab:
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x03ae:
            boolean r17 = X.AnonymousClass143.A0G(r6)     // Catch:{ all -> 0x06e3 }
            if (r17 != 0) goto L_0x043e
            X.16D r0 = r4.A07     // Catch:{ all -> 0x06e3 }
            X.141 r12 = r0.A08(r6)     // Catch:{ all -> 0x06e3 }
            if (r12 != 0) goto L_0x03d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e3 }
            r1.<init>()     // Catch:{ all -> 0x06e3 }
            java.lang.String r0 = "ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - "
            r1.append(r0)     // Catch:{ all -> 0x06e3 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x06e3 }
            r1.append(r0)     // Catch:{ all -> 0x06e3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06e3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e3 }
            goto L_0x043e
        L_0x03d5:
            java.lang.Boolean r0 = r11.A0B     // Catch:{ all -> 0x06e3 }
            if (r0 != 0) goto L_0x03ef
            r0 = 0
            if (r42 != 0) goto L_0x03dd
            r0 = 1
        L_0x03dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06e3 }
            r11.A0B = r0     // Catch:{ all -> 0x06e3 }
            if (r42 != 0) goto L_0x03ef
            if (r10 == 0) goto L_0x03ef
            long r0 = r10.A0G     // Catch:{ all -> 0x06e3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06e3 }
            r11.A0R = r0     // Catch:{ all -> 0x06e3 }
        L_0x03ef:
            boolean r0 = r12.A0C()     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x0422
            java.lang.Long r1 = r11.A0F     // Catch:{ all -> 0x06e3 }
            if (r1 != 0) goto L_0x0408
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06e3 }
            r11.A0F = r0     // Catch:{ all -> 0x06e3 }
        L_0x0401:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x06e3 }
            r11.A0C = r0     // Catch:{ all -> 0x06e3 }
            goto L_0x0422
        L_0x0408:
            java.lang.Boolean r0 = r11.A0C     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x0401
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x06e3 }
            r0 = r0 ^ r42
            if (r0 == 0) goto L_0x0401
            long r12 = r1.longValue()     // Catch:{ all -> 0x06e3 }
            r0 = 1
            long r12 = r12 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06e3 }
            r11.A0F = r0     // Catch:{ all -> 0x06e3 }
            goto L_0x0401
        L_0x0422:
            if (r42 == 0) goto L_0x043e
            java.lang.Long r12 = r11.A0R     // Catch:{ all -> 0x06e3 }
            if (r12 == 0) goto L_0x043e
            java.lang.Long r0 = r11.A0S     // Catch:{ all -> 0x06e3 }
            if (r0 != 0) goto L_0x043e
            if (r10 == 0) goto L_0x043e
            long r0 = r10.A0I     // Catch:{ all -> 0x06e3 }
            long r12 = r12.longValue()     // Catch:{ all -> 0x06e3 }
            long r0 = r0 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06e3 }
            r11.A0S = r0     // Catch:{ all -> 0x06e3 }
        L_0x043e:
            r14 = r10
            if (r44 == 0) goto L_0x0447
            X.1Jd r0 = r4.A0J     // Catch:{ all -> 0x06e3 }
            X.3T1 r14 = r0.A08(r8)     // Catch:{ all -> 0x06e3 }
        L_0x0447:
            if (r14 == 0) goto L_0x04b6
            X.3T1 r13 = r14.A0S()     // Catch:{ all -> 0x06e3 }
            if (r9 == 0) goto L_0x045b
            if (r13 == 0) goto L_0x045b
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r13.A1T(r0)     // Catch:{ all -> 0x06e3 }
            r16 = 1
            if (r0 != 0) goto L_0x045d
        L_0x045b:
            r16 = 0
        L_0x045d:
            r12 = 0
            X.1Cv r0 = r4.A0E     // Catch:{ all -> 0x06e3 }
            r1 = r0
            r0 = 1
            java.util.ArrayList r0 = X.C24541Cv.A01(r1, r6, r0, r3, r3)     // Catch:{ all -> 0x06e3 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x06e3 }
            if (r1 != 0) goto L_0x0472
            java.lang.Object r12 = r0.get(r3)     // Catch:{ all -> 0x06e3 }
            X.3T1 r12 = (X.AnonymousClass3T1) r12     // Catch:{ all -> 0x06e3 }
        L_0x0472:
            if (r42 == 0) goto L_0x0483
            if (r44 != 0) goto L_0x0483
            if (r13 != 0) goto L_0x0483
            if (r12 == 0) goto L_0x0483
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = r12.A1T(r0)     // Catch:{ all -> 0x06e3 }
            r0 = 1
            if (r1 != 0) goto L_0x0484
        L_0x0483:
            r0 = 0
        L_0x0484:
            if (r16 != 0) goto L_0x0488
            if (r0 == 0) goto L_0x048d
        L_0x0488:
            r0 = 28
            r11.A01(r0)     // Catch:{ all -> 0x06e3 }
        L_0x048d:
            if (r44 == 0) goto L_0x049c
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r14.A1T(r0)     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x049c
            r0 = 29
            r11.A01(r0)     // Catch:{ all -> 0x06e3 }
        L_0x049c:
            if (r42 == 0) goto L_0x04a9
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r14.A1T(r0)     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x04b6
            r0 = 26
            goto L_0x04b3
        L_0x04a9:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r14.A1T(r0)     // Catch:{ all -> 0x06e3 }
            if (r0 == 0) goto L_0x04b6
            r0 = 27
        L_0x04b3:
            r11.A01(r0)     // Catch:{ all -> 0x06e3 }
        L_0x04b6:
            if (r10 == 0) goto L_0x04c3
            boolean r0 = r10.A10     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x04c3
            if (r42 != 0) goto L_0x04c3
            r0 = 20
            r11.A01(r0)     // Catch:{ all -> 0x06e5 }
        L_0x04c3:
            r1 = r33
            r0 = r32
            A02(r1, r11, r0)     // Catch:{ all -> 0x06e5 }
            if (r17 != 0) goto L_0x05a4
            android.content.SharedPreferences r1 = A00(r4)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x06e5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e5 }
            r10.<init>()     // Catch:{ all -> 0x06e5 }
            r10.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "_commerce"
            r10.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r11 = r10.toString()     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r1.getString(r11, r0)     // Catch:{ all -> 0x06e5 }
            X.9eV r10 = X.C198979eV.A00(r0)     // Catch:{ all -> 0x06e5 }
            r0 = r37
            X.3T1 r13 = r0.A03(r8)     // Catch:{ all -> 0x06e5 }
            if (r13 == 0) goto L_0x0557
            boolean r12 = r13 instanceof X.C46952bw     // Catch:{ all -> 0x06e5 }
            if (r12 != 0) goto L_0x051f
            boolean r0 = r13 instanceof X.C46852bm     // Catch:{ all -> 0x06e5 }
            if (r0 != 0) goto L_0x051f
            int r14 = r13.A1I     // Catch:{ all -> 0x06e5 }
            r0 = 52
            if (r14 == r0) goto L_0x051f
            r0 = 54
            if (r14 == r0) goto L_0x051f
            boolean r0 = r13 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x0557
            java.lang.String r14 = r13.A0b()     // Catch:{ all -> 0x06e5 }
            X.1DW r0 = r4.A0K     // Catch:{ all -> 0x06e5 }
            boolean r16 = r0.A0G(r14)     // Catch:{ all -> 0x06e5 }
            if (r16 != 0) goto L_0x051f
            boolean r0 = r0.A0H(r14)     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x0557
        L_0x051f:
            if (r42 == 0) goto L_0x054e
            if (r12 == 0) goto L_0x0538
            java.lang.Long r0 = r10.A03     // Catch:{ all -> 0x06e5 }
            r16 = 1
            if (r0 != 0) goto L_0x052c
            r12 = 0
            goto L_0x0530
        L_0x052c:
            long r12 = r0.longValue()     // Catch:{ all -> 0x06e5 }
        L_0x0530:
            long r12 = r12 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06e5 }
            r10.A03 = r0     // Catch:{ all -> 0x06e5 }
        L_0x0538:
            java.lang.Long r0 = r10.A02     // Catch:{ all -> 0x06e5 }
            r16 = 1
            if (r0 != 0) goto L_0x0541
            r12 = 0
            goto L_0x0545
        L_0x0541:
            long r12 = r0.longValue()     // Catch:{ all -> 0x06e5 }
        L_0x0545:
            long r12 = r12 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06e5 }
            r10.A02 = r0     // Catch:{ all -> 0x06e5 }
            goto L_0x0595
        L_0x054e:
            java.lang.Long r0 = r10.A01     // Catch:{ all -> 0x06e5 }
            r16 = 1
            if (r0 != 0) goto L_0x0589
            r12 = 0
            goto L_0x058d
        L_0x0557:
            boolean r0 = r13 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x05a4
            if (r42 == 0) goto L_0x0636
            X.3T1 r12 = r13.A0S()     // Catch:{ all -> 0x06e5 }
            boolean r0 = r12 instanceof X.C46852bm     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x0595
            X.2bm r12 = (X.C46852bm) r12     // Catch:{ all -> 0x06e5 }
            X.3Qa r0 = r12.A1J     // Catch:{ all -> 0x06e5 }
            java.lang.String r12 = r0.A01     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r12.startsWith(r0)     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x0595
            java.lang.Long r0 = r10.A05     // Catch:{ all -> 0x06e5 }
            r16 = 1
            if (r0 != 0) goto L_0x057c
            r12 = 0
            goto L_0x0580
        L_0x057c:
            long r12 = r0.longValue()     // Catch:{ all -> 0x06e5 }
        L_0x0580:
            long r12 = r12 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06e5 }
            r10.A05 = r0     // Catch:{ all -> 0x06e5 }
            goto L_0x0595
        L_0x0589:
            long r12 = r0.longValue()     // Catch:{ all -> 0x06e5 }
        L_0x058d:
            long r12 = r12 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06e5 }
            r10.A01 = r0     // Catch:{ all -> 0x06e5 }
        L_0x0595:
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r11, r0)     // Catch:{ all -> 0x06e5 }
            r0.apply()     // Catch:{ all -> 0x06e5 }
        L_0x05a4:
            if (r42 == 0) goto L_0x0636
            X.11F r10 = r8.A00     // Catch:{ all -> 0x06e5 }
            boolean r0 = r10 instanceof X.C177538dx     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x05b1
            r0 = 19
            r4.A09(r6, r0)     // Catch:{ all -> 0x06e5 }
        L_0x05b1:
            X.1Na r1 = r4.A08     // Catch:{ all -> 0x06e5 }
            if (r10 == 0) goto L_0x0636
            android.content.SharedPreferences r12 = X.C27131Na.A00(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r8 = r8.A01     // Catch:{ all -> 0x06e5 }
            java.lang.String r11 = X.C27131Na.A02(r10, r8)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = ""
            java.lang.String r11 = r12.getString(r11, r0)     // Catch:{ all -> 0x06e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x05cc
            goto L_0x05d3
        L_0x05cc:
            java.lang.String r0 = "quick_reply"
            boolean r0 = r11.contains(r0)     // Catch:{ all -> 0x06e5 }
            goto L_0x05d4
        L_0x05d3:
            r0 = 0
        L_0x05d4:
            r12 = 3
            if (r0 == 0) goto L_0x05fe
            r0 = r36
            boolean r0 = r0.A0M(r6)     // Catch:{ all -> 0x06e5 }
            if (r0 != 0) goto L_0x05eb
            X.0wk r13 = r4.A0R     // Catch:{ all -> 0x06e5 }
            r11 = 10
            X.1iP r0 = new X.1iP     // Catch:{ all -> 0x06e5 }
            r0.<init>((X.AnonymousClass1NM) r4, (X.AnonymousClass11F) r6, (int) r12, (int) r11)     // Catch:{ all -> 0x06e5 }
            r13.execute(r0)     // Catch:{ all -> 0x06e5 }
        L_0x05eb:
            android.content.SharedPreferences r0 = X.C27131Na.A00(r1)     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = X.C27131Na.A02(r10, r8)     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r0 = r11.remove(r0)     // Catch:{ all -> 0x06e5 }
            r0.apply()     // Catch:{ all -> 0x06e5 }
        L_0x05fe:
            android.content.SharedPreferences r11 = X.C27131Na.A01(r1)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = X.C27131Na.A02(r10, r8)     // Catch:{ all -> 0x06e5 }
            int r11 = r11.getInt(r0, r3)     // Catch:{ all -> 0x06e5 }
            if (r11 == 0) goto L_0x0636
            r13 = 1
            r0 = 8
            if (r11 == r13) goto L_0x0620
            r0 = 2
            if (r11 == r0) goto L_0x061e
            r0 = 11
            if (r11 == r12) goto L_0x0620
            r0 = 4
            if (r11 != r0) goto L_0x0623
            r0 = 10
            goto L_0x0620
        L_0x061e:
            r0 = 12
        L_0x0620:
            r4.A09(r6, r0)     // Catch:{ all -> 0x06e5 }
        L_0x0623:
            android.content.SharedPreferences r0 = X.C27131Na.A01(r1)     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = X.C27131Na.A02(r10, r8)     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x06e5 }
            r0.apply()     // Catch:{ all -> 0x06e5 }
        L_0x0636:
            if (r22 == 0) goto L_0x0666
            android.content.SharedPreferences r12 = A00(r4)     // Catch:{ all -> 0x06e5 }
            java.lang.String r1 = r6.getRawString()     // Catch:{ all -> 0x06e5 }
            int r0 = r22.intValue()     // Catch:{ all -> 0x06e5 }
            java.lang.String r8 = A01(r1, r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = "0"
            java.lang.String r10 = r12.getString(r8, r0)     // Catch:{ all -> 0x06e5 }
            r0 = 0
            long r10 = X.AnonymousClass6R8.A01(r10, r0)     // Catch:{ all -> 0x06e5 }
            r0 = 1
            long r10 = r10 + r0
            android.content.SharedPreferences$Editor r1 = r12.edit()     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x06e5 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r8, r0)     // Catch:{ all -> 0x06e5 }
            r0.apply()     // Catch:{ all -> 0x06e5 }
        L_0x0666:
            r10 = 2474(0x9aa, float:3.467E-42)
            r0 = r35
            boolean r0 = X.C20800yB.A01(r7, r0, r10)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00f6
            if (r2 == 0) goto L_0x00f6
            android.content.SharedPreferences r11 = A00(r4)     // Catch:{ all -> 0x06e7 }
            X.1Nc r1 = r4.A0g     // Catch:{ all -> 0x06e7 }
            X.3Jn r8 = new X.3Jn     // Catch:{ all -> 0x06e7 }
            r0 = r27
            r8.<init>(r5, r0, r15, r9)     // Catch:{ all -> 0x06e7 }
            r0 = 3
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ all -> 0x06e7 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x06e7 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x06e7 }
        L_0x0689:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x06e7 }
            X.1Nb r0 = (X.C27141Nb) r0     // Catch:{ all -> 0x06e7 }
            X.0yC r0 = r0.A00     // Catch:{ all -> 0x06e7 }
            boolean r0 = X.C20800yB.A01(r7, r0, r10)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x0689
            boolean r1 = r2 instanceof X.AnonymousClass2bL     // Catch:{ all -> 0x06e7 }
            boolean r0 = r2 instanceof X.C46902br     // Catch:{ all -> 0x06e7 }
            if (r1 == 0) goto L_0x0689
            if (r0 != 0) goto L_0x0689
            boolean r0 = r8.A00     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x0689
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x06e7 }
            X.AnonymousClass00C.A0D(r0, r3)     // Catch:{ all -> 0x06e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e7 }
            r1.<init>()     // Catch:{ all -> 0x06e7 }
            r1.append(r0)     // Catch:{ all -> 0x06e7 }
            java.lang.String r0 = "_location"
            r1.append(r0)     // Catch:{ all -> 0x06e7 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x06e7 }
            java.lang.String r9 = "0"
            java.lang.String r0 = r11.getString(r5, r9)     // Catch:{ all -> 0x06e7 }
            if (r0 == 0) goto L_0x06ca
            r9 = r0
        L_0x06ca:
            r0 = 0
            long r12 = X.AnonymousClass6R8.A01(r9, r0)     // Catch:{ all -> 0x06e7 }
            r0 = 1
            long r12 = r12 + r0
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x06e7 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x06e7 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r5, r0)     // Catch:{ all -> 0x06e7 }
            r0.apply()     // Catch:{ all -> 0x06e7 }
            goto L_0x0689
        L_0x06e3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06e5 }
        L_0x06e5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06e7 }
        L_0x06e7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NM.A04(X.1NM, X.11F, com.whatsapp.jid.UserJid, X.3Qa, java.lang.Integer, boolean, boolean, boolean):void");
    }
}
