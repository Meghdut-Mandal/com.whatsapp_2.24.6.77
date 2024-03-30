package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public class C21020yX implements C21010yW {
    public long A00;
    public AnonymousClass1C9 A01;
    public AnonymousClass1C9 A02;
    public AnonymousClass1C9 A03;
    public AnonymousClass1C9 A04;
    public AnonymousClass1E5 A05;
    public AnonymousClass1E5 A06;
    public AnonymousClass1E5 A07;
    public AnonymousClass1E5 A08;
    public AnonymousClass005 A09;
    public AnonymousClass005 A0A;
    public boolean A0B;
    public int A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C19760wT A0G;
    public final C19420v0 A0H;
    public final C20810yC A0I;
    public final C20980yT A0J;
    public final C20870yI A0K;
    public final C20930yO A0L;
    public final C20900yL A0M;
    public final C20880yJ A0N;
    public final AnonymousClass005 A0O;
    public final CountDownLatch A0P = new CountDownLatch(1);
    public final CountDownLatch A0Q = new CountDownLatch(1);
    public final CountDownLatch A0R = new CountDownLatch(1);
    public final CountDownLatch A0S = new CountDownLatch(1);
    public final C20970yS A0T;
    public volatile int A0U;
    public volatile boolean A0V;
    public volatile boolean A0W;

    private Integer A00(C18950u5 r9, int i, boolean z) {
        C18950u5 r2 = r9;
        int A002 = this.A0T.A00(i);
        if (A002 != 0) {
            int abs = Math.abs(A002);
            r2 = new C18950u5(abs, abs, abs, abs, false);
        } else {
            A002 = r9.A00;
            if (z) {
                A002 = -A002;
            }
        }
        if (r2.A00()) {
            return Integer.valueOf(A002);
        }
        return null;
    }

    public Integer B3I(C20890yK r3, C18950u5 r4, boolean z) {
        int i = r3.code;
        if (r4 == null) {
            r4 = r3.samplingRate;
        }
        return A00(r4, i, false);
    }

    public void Blu(C18950u5 r15, byte[] bArr, int i, int i2, boolean z) {
        C35281iR r1;
        C19930wk r0;
        int i3 = i;
        Integer A002 = A00(r15, i3, false);
        if (A002 != null) {
            int intValue = A002.intValue();
            byte[] bArr2 = bArr;
            int i4 = i2;
            if (i2 == 0 || i4 == 1) {
                r1 = new C35281iR(this, bArr2, i4, i3, intValue, 0);
                r0 = this.A0N.A01;
            } else {
                r1 = new C35281iR(this, bArr2, i4, i3, intValue, 1);
                r0 = this.A0N.A02;
            }
            r0.execute(r1);
        }
    }

    public void Blv(C20890yK r3) {
        Bls(r3, (C18950u5) null, true);
    }

    @Deprecated
    public void Blw(C20890yK r2) {
        A02(r2, 1);
        A04(r2, "");
    }

    public void Blx(C20890yK r2, C18950u5 r3) {
        Bls(r2, r3, false);
    }

    public void Bly(C20890yK r3) {
        Bls(r3, (C18950u5) null, false);
    }

    public void Bph(boolean z) {
        int nextInt;
        C35231iM r1 = new C35231iM(3, (Object) this, z);
        C20880yJ r2 = this.A0N;
        r2.A01.execute(r1);
        if (this.A0U <= 0 || (nextInt = new Random().nextInt(this.A0U) + 5) <= 0) {
            r2.A02.execute(new C35231iM(2, (Object) this, z));
            return;
        }
        r2.A02.A03(new C35241iN(this, nextInt, 0, z), (long) (nextInt * 1000));
    }

    public void Bro(int i) {
        synchronized (this) {
            this.A0U = i;
        }
    }

    private void A01() {
        int i = (this.A0C + 1) % 10;
        this.A0C = i;
        if (i == 0) {
            this.A0M.A05();
        }
    }

    private void A02(C20890yK r4, int i) {
        C35261iP r1;
        C19930wk r0;
        int i2 = r4.bufferChannel;
        if (i2 == 3) {
            int[] iArr = C56372wB.A00;
            if (iArr[0] != r4.code) {
                return;
            }
        } else if (i2 == 0 || i2 == 1) {
            r1 = new C35261iP((Object) this, i, 26, (Object) r4);
            r0 = this.A0N.A01;
            r0.execute(r1);
        }
        r1 = new C35261iP((Object) this, i, 27, (Object) r4);
        r0 = this.A0N.A02;
        r0.execute(r1);
    }

    public static void A04(C20890yK r3, String str) {
        if (r3 instanceof WamCall) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime/printevent");
            sb.append(str);
            sb.append(": ");
            sb.append(r3.toString());
            Log.i(sb.toString());
        }
    }

    public static void A05(C21020yX r7) {
        if (r7.A05.A01() > r7.A02.A04.A00.A04.A02.remaining() && !r7.A02.A07()) {
            if (r7.A02.A04.A06()) {
                r7.A02.A04();
                r7.A0M.A05();
                r7.A05.A03((Integer) null);
            } else {
                C20900yL r6 = r7.A0M;
                Long l = r6.A0N;
                if (l == null) {
                    r6.A0N = 0L;
                    l = 0L;
                }
                Long l2 = r6.A0O;
                if (l2 == null) {
                    r6.A0O = 0L;
                    l2 = 0L;
                }
                r6.A0N = Long.valueOf(l.longValue() + 1);
                r6.A0O = Long.valueOf(l2.longValue() + ((long) r7.A05.A01()));
                r6.A05();
                StringBuilder sb = new StringBuilder();
                sb.append("wamruntime/recordPrivateStatsDroppedEvent: ");
                sb.append("no space in buffer for more events");
                Log.w(sb.toString());
                return;
            }
        }
        if (r7.A05.A01() > r7.A02.A01()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        AnonymousClass1C9 r2 = r7.A02;
        AnonymousClass1E5 r0 = r7.A05;
        r2.A05(r0.A01, r0.A02);
        r7.A01();
        r7.A02.A03();
        ((C159447jN) r7.A09.get()).Bpg(r7.A02, true);
    }

    public static void A06(C21020yX r3) {
        if (r3.A06.A01() > r3.A03.A04.A00.A04.A02.remaining() && !r3.A03.A07()) {
            if (r3.A03.A04.A06()) {
                r3.A03.A04();
                r3.A0M.A05();
                r3.A06.A03((Integer) null);
            } else {
                A09(r3, "no space in buffer for more events");
                return;
            }
        }
        if (r3.A06.A01() > r3.A03.A01()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        AnonymousClass1C9 r2 = r3.A03;
        AnonymousClass1E5 r0 = r3.A06;
        r2.A05(r0.A01, r0.A02);
        r3.A0M.A0S = Long.valueOf(r3.A03.A02());
        r3.A01();
        r3.A03.A03();
    }

    public static void A07(C21020yX r7) {
        if (r7.A07.A01() > r7.A04.A04.A00.A04.A02.remaining() && !r7.A04.A07()) {
            if (r7.A04.A04.A06()) {
                r7.A04.A04();
                r7.A07.A03((Integer) null);
            } else {
                C20900yL r5 = r7.A0M;
                Long l = r5.A0P;
                if (l == null) {
                    r5.A0P = 0L;
                    l = 0L;
                }
                Long l2 = r5.A0Q;
                if (l2 == null) {
                    r5.A0Q = 0L;
                    l2 = 0L;
                }
                r5.A0P = Long.valueOf(l.longValue() + 1);
                r5.A0Q = Long.valueOf(l2.longValue() + ((long) r7.A07.A01()));
                r5.A05();
                Log.w("wamruntime/logevent: no room for a new event record");
                return;
            }
        }
        if (r7.A07.A01() > r7.A04.A01()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        AnonymousClass1C9 r2 = r7.A04;
        AnonymousClass1E5 r0 = r7.A07;
        r2.A05(r0.A01, r0.A02);
        r7.A0M.A0T = Long.valueOf(r7.A04.A02());
        r7.A01();
        r7.A04.A03();
        ((C159447jN) r7.A0A.get()).Bpg(r7.A04, false);
    }

    public static void A08(C21020yX r7, int i, boolean z) {
        if (r7.A08.A01() > r7.A01.A04.A00.A04.A02.remaining() && !r7.A01.A07()) {
            if (r7.A01.A04.A06()) {
                r7.A01.A04();
                C19420v0.A00(r7.A0H).putBoolean("wam_is_current_buffer_real_time", false).apply();
                r7.A08.A03((Integer) null);
            } else {
                r7.A08.A01();
                C20900yL r6 = r7.A0M;
                Long l = r6.A0J;
                if (l == null) {
                    r6.A0J = 0L;
                    l = 0L;
                }
                Long l2 = r6.A0K;
                if (l2 == null) {
                    r6.A0K = 0L;
                    l2 = 0L;
                }
                r6.A0J = Long.valueOf(l.longValue() + 1);
                r6.A0K = Long.valueOf(l2.longValue() + ((long) r7.A08.A01()));
                r6.A05();
                if (r7.A0V) {
                    AnonymousClass00T r1 = r7.A0J.A00;
                    String valueOf = String.valueOf(i);
                    ((SharedPreferences) r1.getValue()).edit().putInt(valueOf, ((SharedPreferences) r1.getValue()).getInt(valueOf, 0) + 1).apply();
                }
                Log.w("wamruntime/recordDroppedEvent");
                return;
            }
        }
        if (r7.A08.A01() > r7.A01.A01()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        AnonymousClass1C9 r2 = r7.A01;
        AnonymousClass1E5 r0 = r7.A08;
        r2.A05(r0.A01, r0.A02);
        C20900yL r22 = r7.A0M;
        r22.A0R = Long.valueOf(r7.A01.A02());
        r7.A01();
        AnonymousClass1C9 r12 = r7.A01;
        if (r12.A04.A00.A00() == 1 && !z) {
            if (!r12.A01) {
                r22.A0F = true;
            }
            if (!r22.A06()) {
                A03(r22, r7, 0, true);
            }
            if (r7.A0V) {
                C20980yT r13 = r7.A0J;
                AnonymousClass00T r5 = r13.A00;
                Set<String> keySet = ((SharedPreferences) r5.getValue()).getAll().keySet();
                AnonymousClass00C.A0D(keySet, 0);
                List<C20890yK> A002 = C15060md.A00(new C12790if(AnonymousClass4NB.A00, C15060md.A02(AnonymousClass4NA.A00, new C12790if(new AnonymousClass4K3(r13), new C18650tV(keySet, 0)))));
                ((SharedPreferences) r5.getValue()).edit().clear().apply();
                for (C20890yK A032 : A002) {
                    A03(A032, r7, 0, true);
                }
            }
        }
    }

    public static void A09(C21020yX r6, String str) {
        C20900yL r5 = r6.A0M;
        Long l = r5.A0L;
        if (l == null) {
            r5.A0L = 0L;
            l = 0L;
        }
        Long l2 = r5.A0M;
        if (l2 == null) {
            r5.A0M = 0L;
            l2 = 0L;
        }
        r5.A0L = Long.valueOf(l.longValue() + 1);
        r5.A0M = Long.valueOf(l2.longValue() + ((long) r6.A06.A01()));
        r5.A05();
        StringBuilder sb = new StringBuilder();
        sb.append("wamruntime/recordPrivateStatsDroppedEvent: ");
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A0A(C21020yX r1, CountDownLatch countDownLatch) {
        C19930wk r0;
        if (countDownLatch == r1.A0R || countDownLatch == r1.A0Q) {
            r0 = r1.A0N.A02;
        } else {
            r0 = r1.A0N.A01;
        }
        r0.A01();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public static boolean A0B(C21020yX r2) {
        if (!r2.A0D) {
            A0A(r2, r2.A0P);
            r2.A0L.A00(0);
            r2.A0D = true;
        }
        return r2.A01.A01;
    }

    public static boolean A0C(C21020yX r2) {
        if (!r2.A0E) {
            A0A(r2, r2.A0R);
            r2.A0L.A00(2);
            r2.A0E = true;
        }
        return r2.A03.A01;
    }

    public static boolean A0D(C21020yX r2) {
        if (!r2.A0F) {
            A0A(r2, r2.A0S);
            r2.A0L.A00(1);
            r2.A0F = true;
        }
        return r2.A04.A01;
    }

    public void BKR(Context context, AnonymousClass14Z r6, C223714a r7, AnonymousClass005 r8, AnonymousClass005 r9, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A0A = r8;
        this.A09 = r9;
        this.A0V = z2;
        this.A0U = i4;
        this.A0K.A00 = this;
        C20810yC r1 = this.A0I;
        synchronized (r1) {
            r1.A02 = this;
        }
        this.A0N.A00.execute(new C223814b(context, this, i2));
        C20930yO r3 = this.A0L;
        r3.A02.A00.execute(new C35721j9(r3, r6, 2));
    }

    public void BP7() {
        this.A0N.A01.execute(new C35691j6(this, 49));
    }

    public void Bd0() {
        if (C20800yB.A00(C21000yV.A02, this.A0I, 7018) != 600) {
            ((C20270xI) this.A0O.get()).A00(new C74363lU(this));
        }
    }

    public void Bls(C20890yK r4, C18950u5 r5, boolean z) {
        String str;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        Integer A002 = A00(r5, i, z);
        if (A002 != null) {
            A02(r4, A002.intValue());
            StringBuilder sb = new StringBuilder();
            sb.append("(sampled with weight ");
            sb.append(A002);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "(dropped)";
        }
        A04(r4, str);
    }

    public void Buf() {
        this.A00 = TimeUnit.SECONDS.toMillis((long) Math.min(300, C20800yB.A00(C21000yV.A02, this.A0I, 7018)));
        C35711j8 r1 = new C35711j8(this, 1);
        C20880yJ r2 = this.A0N;
        r2.A01.execute(r1);
        r2.A02.execute(new C35711j8(this, 0));
    }

    public C21020yX(C19760wT r3, C19420v0 r4, C20810yC r5, C20980yT r6, C20970yS r7, C20870yI r8, C20930yO r9, C20900yL r10, C20880yJ r11, AnonymousClass005 r12) {
        this.A0I = r5;
        this.A0K = r8;
        this.A0N = r11;
        this.A0M = r10;
        this.A0L = r9;
        this.A0H = r4;
        this.A0T = r7;
        this.A0J = r6;
        this.A0G = r3;
        this.A0O = r12;
        this.A0W = false;
    }

    public static void A03(C20890yK r2, C21020yX r3, int i, boolean z) {
        if (A0B(r3)) {
            r3.A08.A02(r2, i);
            r3.A08.A03((Integer) null);
            A08(r3, r2.code, z);
            C20900yL r0 = r3.A0M;
            if (r2 == r0) {
                r0.A0J = null;
                r0.A0K = null;
                r0.A0E = null;
                r0.A0L = null;
                r0.A0M = null;
                r0.A0N = null;
                r0.A0O = null;
                r0.A0P = null;
                r0.A0Q = null;
                r0.A04 = null;
                r0.A05 = null;
                r0.A06 = null;
                r0.A07 = null;
                r0.A08 = null;
                r0.A09 = null;
                r0.A0A = null;
                r0.A03 = null;
                r0.A02 = null;
                r0.A0I = null;
                r0.A0H = null;
                r0.A0G = null;
                r0.A0F = null;
                r0.A0D = null;
                r0.A0C = null;
                r0.A0B = null;
                r0.A01 = null;
                r0.A00 = null;
                r0.A05();
            }
            if (!z) {
                r3.A01.A03();
            }
        }
    }

    public void Blz(C20890yK r3, int i) {
        A02(r3, i);
        StringBuilder sb = new StringBuilder();
        sb.append("(with weight=");
        sb.append(i);
        sb.append(")");
        A04(r3, sb.toString());
    }
}
