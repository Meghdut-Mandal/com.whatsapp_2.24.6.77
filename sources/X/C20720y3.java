package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0y3  reason: invalid class name and case insensitive filesystem */
public class C20720y3 implements AnonymousClass00M {
    public static CountDownLatch A13 = new CountDownLatch(1);
    public static final AtomicBoolean A14 = new AtomicBoolean();
    public static final long A15 = TimeUnit.MINUTES.toMillis(15);
    public long A00 = -1;
    public long A01 = 0;
    public long A02;
    public HandlerThread A03;
    public UserJid A04;
    public AnonymousClass1VM A05;
    public AnonymousClass1WK A06;
    public C31901cZ A07;
    public AnonymousClass1WP A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public int A0C;
    public final Handler A0D = new Handler(Looper.getMainLooper(), new C36091jk(this, 2));
    public final BroadcastReceiver A0E = new C36011jc(this, 0);
    public final Handler A0F;
    public final C19730wQ A0G;
    public final AnonymousClass19J A0H;
    public final AnonymousClass1MK A0I;
    public final C221913g A0J;
    public final C19600wD A0K;
    public final AnonymousClass1M6 A0L;
    public final C236519h A0M;
    public final C21060yb A0N;
    public final AnonymousClass1MP A0O;
    public final C19970wo A0P;
    public final C19630wG A0Q;
    public final C20810yC A0R;
    public final C21510zM A0S;
    public final C25781Hq A0T;
    public final AnonymousClass1MN A0U;
    public final C26951Md A0V = new C26951Md("message_handler/logged_flag/disconnected", true);
    public final AnonymousClass19Z A0W;
    public final AnonymousClass19A A0X;
    public final C26961Me A0Y;
    public final C26991Mh A0Z;
    public final C235819a A0a;
    public final C24111Bd A0b;
    public final AnonymousClass19O A0c;
    public final AnonymousClass1MV A0d;
    public final AnonymousClass005 A0e;
    public final Object A0f = new Object();
    public final AtomicBoolean A0g = new AtomicBoolean();
    public final AnonymousClass004 A0h;
    public final C21390zA A0i;
    public final AnonymousClass130 A0j;
    public final AnonymousClass1MZ A0k;
    public final C25271Fq A0l;
    public final C26951Md A0m = new C26951Md("message_handler/logged_flag/must_ignore_network_once", false);
    public final C26951Md A0n = new C26951Md("message_handler/logged_flag/must_reconnect", true);
    public final C26941Mc A0o = new C26941Mc(Looper.getMainLooper(), this);
    public final AnonymousClass1MT A0p;
    public final AnonymousClass1MQ A0q;
    public final AnonymousClass19L A0r;
    public final AnonymousClass1ML A0s;
    public final C26921Ma A0t;
    public final AnonymousClass1MM A0u;
    public final AnonymousClass1JV A0v;
    public final C19770wU A0w;
    public final Random A0x = new Random();
    public final AtomicBoolean A0y = new AtomicBoolean();
    public volatile boolean A0z = false;
    public volatile boolean A10;
    public volatile boolean A11;
    public volatile boolean A12;

    public static void A06(C20720y3 r6, boolean z, boolean z2, boolean z3) {
        AnonymousClass1VM r0;
        C20720y3 r1 = r6;
        if (r6.A0J.A02()) {
            r0 = r6.A05;
        } else {
            r0 = null;
        }
        A00(r0, r1, (String) null, (String) null, 0, z, z2, z3, false, false);
    }

    public void A07() {
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", true);
        this.A0Y.sendMessage(obtain);
    }

    public void A08() {
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", false);
        this.A0Y.sendMessage(obtain);
    }

    public void A0A() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("long_connect", true);
        this.A0Y.sendMessage(Message.obtain((Handler) null, 3, bundle));
        A0C(0, true, false, false, false);
    }

    public void A0B(int i) {
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i);
        this.A0Y.sendMessage(obtain);
    }

    public void A0C(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        A0F((String) null, (String) null, i, z, z2, z3, z4, false, false);
    }

    public void A0E(AnonymousClass1VM r5) {
        Message obtain = Message.obtain((Handler) null, 0, r5);
        obtain.getData().putBoolean("should_register", true);
        this.A0Y.sendMessage(obtain);
    }

    public void A0F(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", z);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z2);
        obtain.getData().putBoolean("reset", z3);
        obtain.getData().putBoolean("check_connection", z4);
        obtain.getData().putBoolean("notify_on_failure", z5);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z6);
        obtain.getData().putInt("connect_reason", i);
        this.A0Y.sendMessage(obtain);
    }

    public static void A01(C20720y3 r4) {
        synchronized (r4.A0f) {
            C26951Md r2 = r4.A0n;
            boolean z = false;
            if (!r4.A0p.A02()) {
                z = true;
            }
            r2.A00(z);
        }
    }

    public static void A02(C20720y3 r140) {
        C20720y3 r8 = r140;
        if (!r8.A12) {
            Log.i("MessageHandler/start");
            r8.A12 = true;
            AnonymousClass1MZ r1 = r8.A0k;
            C26941Mc r107 = r8.A0o;
            C18800tq r7 = r1.A00.A00;
            C19630wG r71 = (C19630wG) r7.A91.get();
            C19970wo r70 = (C19970wo) r7.A8b.get();
            C20810yC r69 = (C20810yC) r7.A02.get();
            C221112x r68 = (C221112x) r7.A2r.get();
            C19700wN r67 = (C19700wN) r7.A2U.get();
            C19730wQ r66 = (C19730wQ) r7.A4g.get();
            C19770wU r65 = (C19770wU) r7.A9Y.get();
            C21360z5 r64 = (C21360z5) r7.A7P.get();
            C20050ww r63 = (C20050ww) r7.A7v.get();
            C220412q r62 = (C220412q) r7.A1l.get();
            C21010yW r61 = (C21010yW) r7.A79.get();
            C21100yf r60 = (C21100yf) r7.A7f.get();
            AnonymousClass130 r59 = (AnonymousClass130) r7.A0O.get();
            AnonymousClass13I r58 = (AnonymousClass13I) r7.A4a.get();
            AnonymousClass19B r57 = (AnonymousClass19B) r7.A6c.get();
            AnonymousClass19A r56 = (AnonymousClass19A) r7.A4x.get();
            AnonymousClass1MK r55 = (AnonymousClass1MK) r7.A75.get();
            AnonymousClass1VN r54 = (AnonymousClass1VN) r7.A13.get();
            AnonymousClass1DT r53 = (AnonymousClass1DT) r7.A55.get();
            AnonymousClass1VO r52 = (AnonymousClass1VO) r7.A3R.get();
            AnonymousClass1VQ r51 = (AnonymousClass1VQ) r7.A9j.get();
            AnonymousClass005 A002 = C18840tu.A00(r7.A9k);
            AnonymousClass005 A003 = C18840tu.A00(r7.A9o);
            AnonymousClass19O r50 = (AnonymousClass19O) r7.A9f.get();
            AnonymousClass1EU r49 = (AnonymousClass1EU) r7.A6M.get();
            C20310xM r48 = (C20310xM) r7.A2S.get();
            C19470v6 r72 = C19470v6.A00;
            AnonymousClass1A1 r47 = (AnonymousClass1A1) r7.A3H.get();
            C20350xQ r46 = (C20350xQ) r7.A3k.get();
            C20300xL r45 = (C20300xL) r7.A5R.get();
            AnonymousClass1C5 r44 = (AnonymousClass1C5) r7.A7B.get();
            C231117f A7k = C18800tq.A7k(r7);
            AnonymousClass1VS r43 = (AnonymousClass1VS) r7.A8r.get();
            AnonymousClass1VT r42 = (AnonymousClass1VT) r7.A7R.get();
            C24961El r41 = (C24961El) r7.A9L.get();
            AnonymousClass1CF r40 = (AnonymousClass1CF) r7.A8K.get();
            AnonymousClass1VU r39 = (AnonymousClass1VU) r7.A62.get();
            C20920yN r38 = (C20920yN) r7.A78.get();
            AnonymousClass1VW r37 = (AnonymousClass1VW) r7.A9h.get();
            AnonymousClass1VX r36 = (AnonymousClass1VX) r7.A1V.get();
            AnonymousClass19L r35 = (AnonymousClass19L) r7.A4Y.get();
            AnonymousClass1MT r34 = (AnonymousClass1MT) r7.A53.get();
            AnonymousClass12P r33 = (AnonymousClass12P) r7.A5G.get();
            AnonymousClass1VY r32 = (AnonymousClass1VY) r7.A6N.get();
            C19420v0 r31 = (C19420v0) r7.A9G.get();
            C29041Vc r30 = (C29041Vc) r7.A9l.get();
            C29091Vh r29 = (C29091Vh) r7.A1n.get();
            C29101Vi r28 = (C29101Vi) r7.A9m.get();
            C29111Vj r27 = (C29111Vj) r7.A4Z.get();
            C29121Vk r26 = (C29121Vk) r7.A6I.get();
            C29241Vw r25 = (C29241Vw) r7.A0P.get();
            C29251Vx r24 = (C29251Vx) r7.A1m.get();
            C21380z9 r23 = (C21380z9) r7.A4b.get();
            C227315o builderWithExpectedSize = C20760y7.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(C18800tq.ARQ(C18800tq.AJI(r7), C18800tq.AJK(r7), C18800tq.AJM(r7), C18800tq.AJN(r7), C18800tq.AJO(r7)));
            builderWithExpectedSize.addAll(C18800tq.ARR(C18800tq.AJJ(r7), C18800tq.AJL(r7), C18800tq.AJP(r7)));
            C20760y7 build = builderWithExpectedSize.build();
            AnonymousClass1WD r22 = (AnonymousClass1WD) r7.A23.get();
            AnonymousClass1WE r21 = (AnonymousClass1WE) r7.A21.get();
            AnonymousClass12U r20 = (AnonymousClass12U) r7.A7L.get();
            C21390zA r19 = (C21390zA) r7.A0J.get();
            AnonymousClass1WF r18 = (AnonymousClass1WF) r7.A3W.get();
            C235819a r17 = (C235819a) r7.A9i.get();
            AnonymousClass1DV ALh = C18800tq.ALh(r7);
            Object obj = r7.A0y.get();
            Objects.requireNonNull(obj);
            AnonymousClass1WI r73 = new AnonymousClass1WI(new AnonymousClass1GC(obj), (C19460v5) r7.A5w.get(), (C19700wN) r7.A2U.get(), (C20050ww) r7.A7v.get(), new AnonymousClass1WH((C19730wQ) r7.A4g.get(), (C19980wp) r7.A1x.get()), (AnonymousClass1WG) r7.A1d.get(), (AnonymousClass1EU) r7.A6M.get(), ALh);
            AnonymousClass1WK r712 = new AnonymousClass1WK(r72, r19, r59, r36, r67, (AnonymousClass1WJ) r7.A22.get(), r66, r53, r45, r64, r60, r63, r25, r55, (AnonymousClass1VR) r7.A1y.get(), (C221913g) r7.A20.get(), r21, r70, r71, (AnonymousClass17Z) r7.A95.get(), r31, (C19900wh) r7.A9J.get(), r62, r48, r33, r68, r69, r38, r61, r46, r37, r40, r54, r29, r22, r107, r52, (AnonymousClass1W9) r7.A46.get(), r56, r34, r57, r44, r17, r51, r28, r35, r27, r39, r26, r49, (AnonymousClass1PE) r7.A6k.get(), r18, r32, r30, r73, r43, r58, r20, r42, r24, r47, A7k, r65, r23, r41, r50, A002, A003, build);
            r8.A06 = r712;
            r712.start();
        }
    }

    public static void A03(C20720y3 r20, Integer num, int i, boolean z, boolean z2) {
        AnonymousClass11F r0;
        boolean containsKey;
        C20720y3 r9 = r20;
        Context context = r9.A0Q.A00;
        synchronized (r9.A0f) {
            r9.A0V.A00(false);
            r9.A0w.Bp1(new C35741jB(r9, num, 8));
            C26921Ma r4 = r9.A0t;
            r4.A03.Boz(new C35761jD(r4, r9.A0j.A0J(), 21), "sendKeystoreAttestation");
            if (!r9.A09 && Build.VERSION.SDK_INT < 29) {
                r9.A09 = r9.A0Z.isConnected();
                Log.i("MessageHandler/handleConnected setting isNetworkUp to true");
            }
            int i2 = i;
            r9.A0C = i2;
            r9.A0c.A04 = Integer.valueOf(i2);
            boolean z3 = z;
            if (!r9.A0J.A02()) {
                AnonymousClass1WP r7 = r9.A08;
                C18740tg.A01();
                r7.A0q.A03();
                r7.A0B.A01(z3);
                AnonymousClass09F r1 = r7.A05;
                r1.A00 = false;
                r7.A0i.A02 = false;
                r1.A01 = false;
                AnonymousClass19I r02 = r7.A0X;
                AnonymousClass19I r19 = r02;
                Map map = r02.A01;
                synchronized (map) {
                    try {
                        map.clear();
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                AnonymousClass1XT r12 = r7.A09;
                synchronized (r12) {
                    try {
                        r12.A08.clear();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C20300xL r2 = r7.A08;
                synchronized (r2) {
                    try {
                        r2.A01 = false;
                        r2.A00 = 0;
                        C20300xL.A01(r2, 0);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                Log.i("server connected");
                C19420v0 r10 = r7.A0L;
                C19420v0.A00(r10).putBoolean("spam_banned", false).apply();
                r10.A1h("spam_banned_expiry_timestamp", 0);
                C19420v0.A00(r10).putBoolean("underage_account_banned", false).apply();
                AnonymousClass1BS r13 = r7.A0l;
                r13.A01 = true;
                AnonymousClass1BS.A07(r13);
                C19730wQ r14 = r7.A06;
                if (!r14.A0L()) {
                    r14.A0G();
                    if (r14.A03 != null) {
                        r7.A0r.Boy(new C35711j8(r7, 26));
                    }
                }
                C19770wU r122 = r7.A0r;
                r122.Boy(new C35711j8(r7, 27));
                C20810yC r11 = r7.A0T;
                C21000yV r5 = C21000yV.A02;
                if (C20800yB.A01(r5, r11, 877)) {
                    AnonymousClass1E9 r22 = r7.A0o;
                    Objects.requireNonNull(r22);
                    r122.Boy(new C35711j8(r22, 21));
                }
                C19460v5 r15 = r7.A01;
                if (r15.A05()) {
                    r15.A02();
                    th = new NullPointerException("isPremiumOrMetaVerifiedFeatureEnabled");
                    throw th;
                }
                AnonymousClass1OG r23 = r7.A0D;
                Objects.requireNonNull(r23);
                r122.Boy(new C35711j8(r23, 22));
                AnonymousClass12P r03 = r7.A0P;
                AnonymousClass12P r18 = r03;
                if (r03.A07) {
                    if (C20800yB.A01(r5, r11, 7883)) {
                        AnonymousClass1XX r16 = r7.A0A;
                        C48962iL r04 = r16.A00;
                        if (r04 != null) {
                            r04.A0D(true);
                        }
                        C48962iL r24 = new C48962iL(r16);
                        r16.A00 = r24;
                        r16.A0B.Box(r24, new Void[0]);
                    } else {
                        AnonymousClass1Y4 r132 = r7.A0V;
                        C35711j8 r05 = new C35711j8(r7, 28);
                        AnonymousClass1Y2 r17 = r132.A0M;
                        synchronized (r17) {
                            r17.A01.clear();
                        }
                        ArrayList arrayList = new ArrayList();
                        synchronized (r132.A0Q) {
                            try {
                                for (Map.Entry entry : r132.A0R.entrySet()) {
                                    AnonymousClass1GN r25 = r132.A0K;
                                    AnonymousClass4R0 r110 = (AnonymousClass4R0) entry.getValue();
                                    synchronized (r25) {
                                        containsKey = r25.A01.containsKey(r110);
                                    }
                                    if (containsKey) {
                                        arrayList.addAll(C007103b.A0Y(((AnonymousClass3SC) entry.getKey()).A02));
                                    }
                                }
                            } catch (Throwable th4) {
                                while (true) {
                                    th = th4;
                                    break;
                                }
                            }
                        }
                        C101294xJ r26 = new C101294xJ(r132, arrayList, true);
                        r132.A0P.Boy(r26);
                        r26.A0B(new C164947sd(r132, arrayList, r05, 1), r132.A0S);
                    }
                }
                AnonymousClass19A r3 = r7.A0Y;
                AnonymousClass19H r06 = r3.A05;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = r06.A00;
                synchronized (linkedHashMap2) {
                    try {
                        Iterator it = linkedHashMap2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            if (((Integer) ((Pair) entry2.getValue()).second).intValue() < 3) {
                                linkedHashMap.put((String) entry2.getKey(), (Message) ((Pair) entry2.getValue()).first);
                            } else {
                                it.remove();
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("unacked-messages/getUnackedMessages: ");
                        sb.append(linkedHashMap.size());
                        Log.i(sb.toString());
                    } catch (Throwable th5) {
                        while (true) {
                            th = th5;
                            break;
                        }
                    }
                }
                AnonymousClass00C.A0B(linkedHashMap);
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    String str = (String) entry3.getKey();
                    Message message = (Message) entry3.getValue();
                    AnonymousClass00C.A0B(message);
                    AnonymousClass00C.A0B(str);
                    AnonymousClass00C.A0D(message, 0);
                    AnonymousClass00C.A0D(str, 1);
                    AnonymousClass19A.A01(message, r3, str, true);
                }
                C27361Nx r32 = r7.A0e;
                Set set = r32.A05;
                HashSet hashSet = new HashSet(set);
                set.clear();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    r32.A07((AnonymousClass11F) it2.next());
                }
                C191819Ep r142 = new C191819Ep(r7);
                List<AnonymousClass376> list = r19.A00;
                synchronized (list) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("in-flight-messages/for-each/send-pending-requests: ");
                        sb2.append(list.size());
                        Log.i(sb2.toString());
                        for (AnonymousClass376 r07 : list) {
                            String str2 = r07.A01;
                            Message message2 = r07.A00;
                            boolean z4 = r07.A02;
                            AnonymousClass19A r08 = r142.A00.A0Y;
                            if (z4) {
                                AnonymousClass00C.A0D(str2, 1);
                                AnonymousClass19A.A01(message2, r08, str2, true);
                            } else {
                                r08.A0C(message2, str2);
                            }
                        }
                        list.clear();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                AnonymousClass1ML r133 = r7.A0d;
                if (r133.A00 != 3) {
                    AnonymousClass1G6 A002 = r7.A0H.A00();
                    if (A002.A01 && (r0 = (AnonymousClass11F) A002.A00().getContact().A06(AnonymousClass11F.class)) != null) {
                        r32.A07(r0);
                    }
                }
                boolean z5 = false;
                if (r133.A00 == 3) {
                    z5 = true;
                }
                if (z2 == z5) {
                    if (!z5) {
                        r7.A0f.A00();
                    } else {
                        r7.A0f.A01();
                    }
                }
                if (r7.A0M.A03()) {
                    r10.A1s(true);
                    r122.Boy(new C35711j8(r7, 20));
                }
                if (((SharedPreferences) r10.A00.get()).getBoolean("future_proof_processing_needed", false)) {
                    r18.A06();
                    if (r18.A08) {
                        C30051Za r33 = r7.A0W;
                        r33.A0I.Boz(new C35711j8(r33, 19), "FutureProofMessageHandler/processFutureMessages");
                    }
                }
                if (C20800yB.A00(r5, r11, 7018) == 600) {
                    r7.A0U.Bph(false);
                }
            } else {
                r9.A0H.A01(z3);
            }
            MessageService.A00(context);
            AnonymousClass1MT r52 = r9.A0p;
            if (r52.A02()) {
                Handler handler = r9.A0d.A02;
                handler.sendMessage(handler.obtainMessage(1, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
            }
            r9.A0b.A02();
            A01(r9);
            AnonymousClass1MN r42 = r9.A0U;
            C31901cZ r34 = r9.A07;
            r42.A04 = r52.A02();
            r42.A07.post(new C35741jB(r42, r34, 6));
            r9.A0q.A00();
            r9.A0l.A03(10, "MessageHandler1");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r1 == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C20720y3 r8, boolean r9) {
        /*
            X.1MN r7 = r8.A0U
            long r4 = r7.A0G
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0010
            r9 = 1
        L_0x0010:
            X.19L r5 = r8.A0r
            monitor-enter(r5)
            X.0yC r2 = r5.A00     // Catch:{ all -> 0x015d }
            X.0yV r1 = X.C21000yV.A01     // Catch:{ all -> 0x015d }
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "LoggableStanzaCache/clearNonMessageStanzas"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015d }
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x015d }
            r0.clear()     // Catch:{ all -> 0x015d }
            java.util.Map r0 = r5.A02     // Catch:{ all -> 0x015d }
            r0.clear()     // Catch:{ all -> 0x015d }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x015d }
            r0.clear()     // Catch:{ all -> 0x015d }
        L_0x0033:
            X.19K r0 = r5.A01     // Catch:{ all -> 0x015d }
            java.lang.Iterable r0 = r0.getObservers()     // Catch:{ all -> 0x015d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x015d }
        L_0x003d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x015d }
            X.19N r0 = (X.AnonymousClass19N) r0     // Catch:{ all -> 0x015d }
            r0.BVp()     // Catch:{ all -> 0x015d }
            goto L_0x003d
        L_0x004d:
            java.lang.String r0 = "LoggableStanzaCache/clear"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015d }
            int[] r3 = r5.A05     // Catch:{ all -> 0x015d }
            r2 = 4
            r1 = 0
        L_0x0056:
            r0 = r3[r1]     // Catch:{ all -> 0x015d }
            java.util.Map r0 = r5.A02(r0)     // Catch:{ all -> 0x015d }
            r0.clear()     // Catch:{ all -> 0x015d }
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0033
            goto L_0x0056
        L_0x0064:
            monitor-exit(r5)
            X.0wG r0 = r8.A0Q
            android.content.Context r2 = r0.A00
            java.lang.Object r3 = r8.A0f
            monitor-enter(r3)
            X.1Md r0 = r8.A0V     // Catch:{ all -> 0x015a }
            r0.A00(r4)     // Catch:{ all -> 0x015a }
            X.1WP r0 = r8.A08     // Catch:{ all -> 0x015a }
            r0.A02()     // Catch:{ all -> 0x015a }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x015a }
            r0 = 26
            if (r1 < r0) goto L_0x007e
            if (r9 != 0) goto L_0x008d
        L_0x007e:
            java.lang.String r0 = "messageservice/stopService"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015a }
            java.lang.Class<com.whatsapp.messaging.MessageService> r1 = com.whatsapp.messaging.MessageService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x015a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x015a }
            r2.stopService(r0)     // Catch:{ all -> 0x015a }
        L_0x008d:
            X.19Z r5 = r8.A0W     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "disconnected"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015a }
            r0.<init>(r1)     // Catch:{ all -> 0x015a }
            r5.A01(r0)     // Catch:{ all -> 0x015a }
            X.19a r6 = r8.A0a     // Catch:{ all -> 0x015a }
            X.1cZ r0 = r8.A07     // Catch:{ all -> 0x015a }
            r5 = 0
            if (r0 == 0) goto L_0x00a7
            boolean r1 = r0.BK2()     // Catch:{ all -> 0x015a }
            r0 = 1
            if (r1 != 0) goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r6.A06(r0)     // Catch:{ all -> 0x015a }
            android.os.Handler r6 = r7.A07     // Catch:{ all -> 0x015a }
            r1 = 16
            X.1j8 r0 = new X.1j8     // Catch:{ all -> 0x015a }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x015a }
            r6.post(r0)     // Catch:{ all -> 0x015a }
            X.1MQ r6 = r8.A0q     // Catch:{ all -> 0x015a }
            X.00T r0 = r6.A03     // Catch:{ all -> 0x015a }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x015a }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x015a }
            X.00T r0 = r6.A04     // Catch:{ all -> 0x015a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x015a }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x015a }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x015a }
            X.1MV r0 = r8.A0d     // Catch:{ all -> 0x015a }
            r6 = 3
            android.os.Handler r1 = r0.A02     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "com.whatsapp.MessageHandler.LOGOUT_ACTION"
            android.os.Message r0 = r1.obtainMessage(r6, r0)     // Catch:{ all -> 0x015a }
            r1.sendMessage(r0)     // Catch:{ all -> 0x015a }
            X.1MM r1 = r8.A0u     // Catch:{ all -> 0x015a }
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r1.A01(r2, r0)     // Catch:{ all -> 0x015a }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0g     // Catch:{ all -> 0x015a }
            boolean r0 = r0.getAndSet(r5)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0144
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x015a }
            X.0Yy r6 = X.C20600xp.A02(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "failure_notifications@1"
            r6.A0M = r0     // Catch:{ all -> 0x015a }
            r1 = 2131891680(0x7f1215e0, float:1.9418087E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x015a }
            r0[r5] = r7     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x015a }
            r6.A0G(r0)     // Catch:{ all -> 0x015a }
            X.0wo r0 = r8.A0P     // Catch:{ all -> 0x015a }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x015a }
            r6.A09(r0)     // Catch:{ all -> 0x015a }
            r0 = 3
            r6.A06(r0)     // Catch:{ all -> 0x015a }
            r6.A0I(r4)     // Catch:{ all -> 0x015a }
            r6.A0F(r7)     // Catch:{ all -> 0x015a }
            r0 = 2131891681(0x7f1215e1, float:1.9418089E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x015a }
            r6.A0E(r0)     // Catch:{ all -> 0x015a }
            android.content.Intent r0 = X.AnonymousClass190.A09(r2)     // Catch:{ all -> 0x015a }
            android.app.PendingIntent r0 = X.C65743Th.A00(r2, r4, r0, r5)     // Catch:{ all -> 0x015a }
            r6.A0D = r0     // Catch:{ all -> 0x015a }
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r6.A0B     // Catch:{ all -> 0x015a }
            r0.icon = r1     // Catch:{ all -> 0x015a }
            X.1Fq r2 = r8.A0l     // Catch:{ all -> 0x015a }
            r1 = 10
            android.app.Notification r0 = r6.A05()     // Catch:{ all -> 0x015a }
            r2.A02(r1, r0)     // Catch:{ all -> 0x015a }
            X.1JV r0 = r8.A0v     // Catch:{ all -> 0x015a }
            r0.A00()     // Catch:{ all -> 0x015a }
        L_0x0144:
            if (r9 == 0) goto L_0x0151
            X.1Mh r0 = r8.A0Z     // Catch:{ all -> 0x015a }
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0153
            A05(r8, r5)     // Catch:{ all -> 0x015a }
        L_0x0151:
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            goto L_0x0159
        L_0x0153:
            X.1Md r0 = r8.A0n     // Catch:{ all -> 0x015a }
            r0.A00(r4)     // Catch:{ all -> 0x015a }
            goto L_0x0151
        L_0x0159:
            return
        L_0x015a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            throw r0
        L_0x015d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20720y3.A04(X.0y3, boolean):void");
    }

    public void A09() {
        AnonymousClass1WK r0 = this.A06;
        if (r0 != null) {
            r0.A19();
        }
    }

    public void A0D(long j, boolean z, boolean z2) {
        Handler handler = this.A0D;
        Message obtain = Message.obtain(handler, 0, z ? 1 : 0, 0);
        Bundle data = obtain.getData();
        data.putLong("networkId", j);
        data.putBoolean("networkIsBlocked", z2);
        handler.sendMessage(obtain);
    }

    public void A0G(boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageHandler/service/stop/unregister:");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass19J r1 = this.A0H;
        r1.A06 = false;
        r1.A03 = i;
        Message obtain = Message.obtain((Handler) null, 1);
        Bundle data = obtain.getData();
        data.putBoolean("should_unregister", z);
        data.putInt("logoutReason", i);
        this.A0Y.sendMessage(obtain);
    }

    public void A0H(boolean z, boolean z2) {
        String str;
        if (C20800yB.A01(C21000yV.A02, this.A0R, 6495)) {
            if (!z) {
                Handler handler = this.A0F;
                if (handler.hasMessages(2)) {
                    Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry message canceled");
                    handler.removeMessages(2);
                }
            } else if (!z2) {
                this.A0F.sendEmptyMessageDelayed(2, 60000);
                str = "MessageHandler/onCaptivePortalDetectionAndWaitDone retry message scheduled for handler with delay: 60000ms";
            }
            A14.set(z);
            A13.countDown();
            return;
        }
        Context context = this.A0Q.A00;
        AlarmManager A052 = this.A0N.A05();
        if (A052 != null) {
            Intent intent = new Intent("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION").setPackage("com.whatsapp");
            if (!z) {
                PendingIntent A012 = C65743Th.A01(context, 0, intent, 536870912);
                if (A012 != null) {
                    Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm canceled");
                    A052.cancel(A012);
                    A012.cancel();
                }
            } else if (!z2) {
                this.A0M.A00(C65743Th.A01(context, 0, intent, 134217728), 2, SystemClock.elapsedRealtime() + 60000);
                str = "MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm set for 60000ms from now";
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A14.set(z);
        A13.countDown();
        return;
        Log.i(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.C20720y3 r11, boolean r12) {
        /*
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r11.A02
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            java.lang.String r0 = "MessageHandler/scheduleReconnect/already-pending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0016:
            X.0wG r0 = r11.A0Q
            android.content.Context r10 = r0.A00
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0028
            X.1Bd r0 = r11.A0b
            long r3 = r11.A01
            r0.A03(r3)
            r0 = 0
            r11.A0B = r0
        L_0x0028:
            X.1Bd r0 = r11.A0b
            long r8 = r0.A01()
            long r3 = r0.A00()
            r11.A01 = r3
            r3 = 10000(0x2710, double:4.9407E-320)
            long r8 = r8 * r3
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "MessageHandler/scheduleReconnect/immediate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r11.A0B(r0)
            return
        L_0x0045:
            java.util.Random r5 = r11.A0x
            long r6 = r5.nextLong()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 & r3
            r3 = 2
            long r3 = r8 / r3
            long r6 = r6 % r8
            long r3 = r3 + r6
            if (r12 == 0) goto L_0x00c6
            long r7 = A15
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            r0 = 60
            int r0 = r5.nextInt(r0)
            int r0 = r0 + -30
            long r3 = (long) r0
            long r7 = r7 + r3
            java.lang.String r0 = "MessageHandler/scheduleReconnect/backoff clamped to ~15mins"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MessageHandler/scheduleReconnect/backoff:"
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r4 = r11.A0R
            r3 = 6495(0x195f, float:9.101E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            r3 = 0
            r9 = 3
            r6 = 0
            if (r0 == 0) goto L_0x00a3
            android.os.Handler r5 = r11.A0F
            r0 = 1
            android.os.Message r0 = r5.obtainMessage(r0, r9, r6)
            boolean r0 = r5.sendMessageDelayed(r0, r7)
            if (r0 == 0) goto L_0x00c8
            long r1 = r1 + r7
        L_0x00a0:
            r11.A02 = r1
            return
        L_0x00a3:
            java.lang.String r0 = "com.whatsapp.MessageHandler.RECONNECT_ACTION"
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r5 = r5.setPackage(r0)
            java.lang.String r0 = "connect_reason"
            r5.putExtra(r0, r9)
            android.app.PendingIntent r6 = X.C65743Th.A01(r10, r6, r5, r6)
            long r1 = r1 + r7
            X.19h r5 = r11.A0M
            r0 = 2
            boolean r0 = r5.A00(r6, r0, r1)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "MessageHandler/scheduleReconnect AlarmManager is null"
            goto L_0x00ca
        L_0x00c6:
            r7 = r3
            goto L_0x006e
        L_0x00c8:
            java.lang.String r0 = "MessageHandler/scheduleReconnect handler is false"
        L_0x00ca:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r11.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20720y3.A05(X.0y3, boolean):void");
    }

    public /* synthetic */ boolean A0I(Message message) {
        boolean z;
        boolean z2;
        C31901cZ r3;
        Bundle data = message.getData();
        boolean z3 = false;
        if (message.arg1 != 0) {
            z3 = true;
        }
        long j = data.getLong("networkId");
        boolean z4 = data.getBoolean("networkIsBlocked");
        synchronized (this.A0f) {
            z = false;
            if (this.A09 != z3) {
                if (z3) {
                    Log.i("MessageHandler/handleNetworkChange/up");
                    if (C20800yB.A01(C21000yV.A02, this.A0R, 5940) && (r3 = this.A07) != null) {
                        ((C31911ca) r3).removeMessages(9);
                    }
                    A06(this, false, true, false);
                } else {
                    Log.i("MessageHandler/handleNetworkChange/down");
                    C31901cZ r0 = this.A07;
                    if (r0 != null) {
                        if (z4) {
                            Log.i("MessageHandler/handleNetworkChange/sendDisconnect");
                            if (C20800yB.A01(C21000yV.A02, this.A0R, 5940)) {
                                ((C31911ca) this.A07).sendEmptyMessageDelayed(9, 300);
                            } else {
                                this.A07.Bpn(true, 1);
                            }
                        } else {
                            r0.Bpn(true, 11);
                        }
                    }
                }
                this.A09 = z3;
                this.A00 = j;
                z = true;
            } else if (z3) {
                long j2 = this.A00;
                if (j != j2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageHandler/handleNetworkChange/switch old=");
                    sb.append(j2);
                    sb.append(" new=");
                    sb.append(j);
                    Log.i(sb.toString());
                    C31901cZ r02 = this.A07;
                    if (r02 != null) {
                        r02.Bpn(true, 11);
                    }
                    this.A00 = j;
                    z2 = true;
                } else {
                    z2 = false;
                }
                A06(this, false, false, true);
                z = z2;
            }
        }
        if (z) {
            this.A0T.A01(this.A0K.A04());
        }
        return true;
    }

    public C20720y3(C21390zA r9, AnonymousClass130 r10, AnonymousClass1MZ r11, C19730wQ r12, AnonymousClass19J r13, AnonymousClass1MK r14, C221913g r15, C19600wD r16, AnonymousClass1M6 r17, C236519h r18, C21060yb r19, AnonymousClass1MP r20, C19970wo r21, C19630wG r22, C25271Fq r23, C20810yC r24, C21510zM r25, C25781Hq r26, AnonymousClass1MN r27, AnonymousClass19Z r28, AnonymousClass19A r29, AnonymousClass1MT r30, AnonymousClass1MQ r31, C235819a r32, AnonymousClass19L r33, AnonymousClass1ML r34, C26921Ma r35, AnonymousClass1MM r36, AnonymousClass1JV r37, C19770wU r38, AnonymousClass19O r39, AnonymousClass1MV r40, AnonymousClass005 r41, AnonymousClass004 r42) {
        C26991Mh r3;
        ConditionVariable conditionVariable = C18740tg.A00;
        C19630wG r4 = r22;
        this.A0Q = r4;
        this.A0P = r21;
        this.A0R = r24;
        this.A0M = r18;
        this.A0G = r12;
        this.A0w = r38;
        this.A0X = r29;
        this.A0I = r14;
        this.A0S = r25;
        this.A0N = r19;
        this.A0s = r34;
        this.A0u = r36;
        this.A0H = r13;
        this.A0U = r27;
        this.A0T = r26;
        this.A0O = r20;
        this.A0q = r31;
        this.A0r = r33;
        this.A0p = r30;
        this.A0L = r17;
        this.A0d = r40;
        this.A0c = r39;
        this.A0l = r23;
        this.A0W = r28;
        this.A0k = r11;
        this.A0i = r9;
        this.A0K = r16;
        this.A0a = r32;
        this.A0v = r37;
        this.A0J = r15;
        this.A0h = r42;
        this.A0j = r10;
        this.A0t = r35;
        this.A0e = r41;
        this.A0b = new C24111Bd(1, 17280);
        this.A0Y = new C26961Me(Looper.getMainLooper(), this);
        Context context = r4.A00;
        this.A0F = new Handler(Looper.getMainLooper(), new C26971Mf(this));
        C26981Mg.A00(new C36011jc(this, 1), context, new IntentFilter("com.whatsapp.MessageHandler.RECONNECT_ACTION"), (Handler) null, C19430v1.A0C, false);
        if (Build.VERSION.SDK_INT >= 29) {
            r3 = new C27001Mi(this.A0N, this.A0O, this, this.A0c);
        } else {
            C19630wG r7 = this.A0Q;
            AnonymousClass1MP r6 = this.A0O;
            r3 = new C146846wG(this.A0K, this.A0L, r6, r7, this);
        }
        this.A0Z = r3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A00(X.AnonymousClass1VM r10, X.C20720y3 r11, java.lang.String r12, java.lang.String r13, int r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r4 = 1
            r2 = 0
            if (r16 == 0) goto L_0x0014
            long r0 = r11.A02
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x001d
            long r5 = android.os.SystemClock.elapsedRealtime()
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x001d
        L_0x0014:
            r8 = 0
        L_0x0015:
            X.0wG r0 = r11.A0Q
            android.content.Context r5 = r0.A00
            java.lang.Object r3 = r11.A0f
            monitor-enter(r3)
            goto L_0x001f
        L_0x001d:
            r8 = 1
            goto L_0x0015
        L_0x001f:
            X.1Md r0 = r11.A0V     // Catch:{ all -> 0x0150 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0057
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0053
            int r1 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x003e }
            int r0 = r11.A0C     // Catch:{ NumberFormatException -> 0x003e }
            if (r1 != r0) goto L_0x0053
            X.1cZ r1 = r11.A07     // Catch:{ NumberFormatException -> 0x003e }
            X.C18740tg.A06(r1)     // Catch:{ NumberFormatException -> 0x003e }
            r0 = 6
            r1.Bpn(r4, r0)     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x014b
        L_0x003e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r1.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary invalid sessionId="
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r12)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0150 }
        L_0x0053:
            if (r17 == 0) goto L_0x0135
            goto L_0x012b
        L_0x0057:
            X.1MT r7 = r11.A0p     // Catch:{ all -> 0x0150 }
            monitor-enter(r7)     // Catch:{ all -> 0x0150 }
            X.1MU r6 = r7.A00     // Catch:{ all -> 0x014d }
            int r0 = r6.A00     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x006c
            if (r14 == 0) goto L_0x006c
            r6.A00 = r14     // Catch:{ all -> 0x014d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x014d }
            r6.A02 = r0     // Catch:{ all -> 0x014d }
            r6.A01 = r2     // Catch:{ all -> 0x014d }
        L_0x006c:
            monitor-exit(r7)     // Catch:{ all -> 0x0150 }
            if (r15 != 0) goto L_0x0079
            if (r8 != 0) goto L_0x0079
            X.1Md r9 = r11.A0n     // Catch:{ all -> 0x0150 }
            boolean r0 = r9.A00     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0083
            goto L_0x014b
        L_0x0079:
            X.1Md r9 = r11.A0n     // Catch:{ all -> 0x0150 }
            r9.A00(r4)     // Catch:{ all -> 0x0150 }
            X.1Md r0 = r11.A0m     // Catch:{ all -> 0x0150 }
            r0.A00(r4)     // Catch:{ all -> 0x0150 }
        L_0x0083:
            boolean r0 = r11.A09     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x008f
            long r0 = r11.A00     // Catch:{ all -> 0x0150 }
            r7 = -1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00c1
        L_0x008f:
            boolean r0 = r9.A00     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0125
            X.1Md r1 = r11.A0m     // Catch:{ all -> 0x0150 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0125
            r1.A00(r2)     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r6.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network/ignore ("
            r6.append(r0)     // Catch:{ all -> 0x0150 }
            boolean r0 = r11.A09     // Catch:{ all -> 0x0150 }
            r6.append(r0)     // Catch:{ all -> 0x0150 }
            r0 = 44
            r6.append(r0)     // Catch:{ all -> 0x0150 }
            long r0 = r11.A00     // Catch:{ all -> 0x0150 }
            r6.append(r0)     // Catch:{ all -> 0x0150 }
            r0 = 41
            r6.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
        L_0x00c1:
            boolean r0 = r11.A12     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x014b
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0g     // Catch:{ all -> 0x0150 }
            r1 = r18
            r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x0150 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.A0y     // Catch:{ all -> 0x0150 }
            r0 = r19
            r1.compareAndSet(r2, r0)     // Catch:{ all -> 0x0150 }
            X.1WP r0 = r11.A08     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x014b
            X.1cZ r0 = r11.A07     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x014b
            boolean r0 = r11.A0A     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x014b
            boolean r0 = r1.getAndSet(r2)     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x0100
            X.1Fq r2 = r11.A0l     // Catch:{ all -> 0x0150 }
            r1 = 10
            java.lang.String r0 = "MessageHandler3"
            r2.A03(r1, r0)     // Catch:{ all -> 0x0150 }
            X.0zA r0 = r11.A0i     // Catch:{ all -> 0x0150 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0100
            X.1MM r2 = r11.A0u     // Catch:{ all -> 0x0150 }
            java.lang.Class<com.whatsapp.service.GcmFGService> r1 = com.whatsapp.service.GcmFGService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0150 }
            r0.<init>()     // Catch:{ all -> 0x0150 }
            r2.A03(r5, r0, r1)     // Catch:{ all -> 0x0150 }
        L_0x0100:
            X.1ML r0 = r11.A0s     // Catch:{ all -> 0x0150 }
            int r1 = r0.A00     // Catch:{ all -> 0x0150 }
            r0 = 3
            r8 = 1
            if (r1 != r0) goto L_0x0109
            r8 = 0
        L_0x0109:
            com.whatsapp.jid.UserJid r0 = r11.A04     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0116
            X.13g r0 = r11.A0J     // Catch:{ all -> 0x0150 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0116
            r4 = 0
        L_0x0116:
            X.C18740tg.A0B(r4)     // Catch:{ all -> 0x0150 }
            X.1cZ r4 = r11.A07     // Catch:{ all -> 0x0150 }
            com.whatsapp.jid.UserJid r5 = r11.A04     // Catch:{ all -> 0x0150 }
            boolean r9 = r11.A0z     // Catch:{ all -> 0x0150 }
            r6 = r10
            r7 = r13
            r4.Bpk(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0150 }
            goto L_0x014b
        L_0x0125:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            goto L_0x014b
        L_0x012b:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/not_disconnected/check_connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            X.1MN r0 = r11.A0U     // Catch:{ all -> 0x0150 }
            r0.A08()     // Catch:{ all -> 0x0150 }
        L_0x0135:
            X.1MT r0 = r11.A0p     // Catch:{ all -> 0x0150 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x014b
            X.1MV r0 = r11.A0d     // Catch:{ all -> 0x0150 }
            r2 = 2
            android.os.Handler r1 = r0.A02     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "com.whatsapp.MessageHandler.LOGOUT_ACTION"
            android.os.Message r0 = r1.obtainMessage(r2, r0)     // Catch:{ all -> 0x0150 }
            r1.sendMessage(r0)     // Catch:{ all -> 0x0150 }
        L_0x014b:
            monitor-exit(r3)     // Catch:{ all -> 0x0150 }
            return
        L_0x014d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0150 }
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0150 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20720y3.A00(X.1VM, X.0y3, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
