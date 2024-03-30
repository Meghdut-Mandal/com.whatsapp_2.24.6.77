package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6XM  reason: invalid class name */
public class AnonymousClass6XM {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass6F3 A04;
    public AnonymousClass6QD A05;
    public C131656Py A06;
    public C131656Py A07;
    public C125085zI A08;
    public HashSet A09;
    public boolean A0A;
    public AnonymousClass6F3[] A0B;
    public final long A0C;
    public final Handler A0D;
    public final C1271867h A0E;
    public final AnonymousClass7ez A0F;
    public final AnonymousClass64W A0G;
    public final List A0H = C90524aI.A0l();
    public final Map A0I = AnonymousClass001.A0J();
    public final Map A0J = AnonymousClass001.A0J();
    public final ExecutorService A0K = C129246Ga.A00("AUDIO_PRELOAD_QUEUE", new AnonymousClass75M(), 4, true);
    public final Handler.Callback A0L;
    public final Thread.UncaughtExceptionHandler A0M;

    public static void A01(AnonymousClass6XM r5) {
        List list;
        r5.A00 = 0;
        AnonymousClass6MV r4 = new AnonymousClass6MV();
        while (true) {
            list = r5.A0H;
            if (list.isEmpty()) {
                break;
            }
            try {
                ((Future) list.remove(0)).get();
            } catch (Exception e) {
                AnonymousClass6MV.A00(r4, e);
            }
        }
        list.clear();
        Map map = r5.A0I;
        Iterator it = C90524aI.A0k(map.keySet()).iterator();
        while (it.hasNext()) {
            AnonymousClass60I.A00(new C162577oo(r4, A00(r5, C36341k9.A0A(it))));
        }
        map.clear();
        r5.A0K.shutdown();
        Handler handler = r5.A0D;
        handler.removeCallbacksAndMessages((Object) null);
        handler.getLooper().quit();
        Throwable th = r4.A01;
        if (th != null) {
            throw th;
        }
    }

    public static void A02(AnonymousClass6XM r9) {
        boolean z;
        AnonymousClass6XM r6 = r9;
        C131656Py r2 = r9.A06;
        if (r2 != null) {
            for (C1269366h r0 : r2.A01) {
                String str = r0.A01;
                r2.A01(str);
                r2.A02(str);
            }
            z = true;
        } else {
            z = false;
        }
        HashMap A0J2 = AnonymousClass001.A0J();
        Iterator A10 = C36371kC.A10(r9.A05.A02(AnonymousClass5TE.AUDIO));
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            A11.getKey();
            Iterator A13 = C90514aH.A13(A11.getValue());
            if (A13.hasNext()) {
                A13.next();
                throw AnonymousClass001.A0A("getMediaEffect");
            }
        }
        HashMap A0J3 = AnonymousClass001.A0J();
        Iterator A102 = C36371kC.A10(A0J2);
        if (A102.hasNext()) {
            AnonymousClass000.A11(A102).getValue();
            throw AnonymousClass001.A0A("getStartTime");
        }
        C162587op r4 = new C162587op(r9.A08.A07, r6, A0J2, A0J3, 0);
        r6.A06 = r4;
        if (z) {
            r4.A00(r6.A02);
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(1);
    }

    public static C160937lp A00(AnonymousClass6XM r4, int i) {
        Map map = r4.A0I;
        Integer valueOf = Integer.valueOf(i);
        Future future = (Future) map.get(valueOf);
        if (future != null) {
            try {
                return (C160937lp) future.get();
            } catch (Exception unused) {
                map.remove(valueOf);
                r4.A0E.A02.A03[i] = false;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r8.A0A != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass6XM r8) {
        /*
            long r2 = r8.A02
            long r6 = r8.A03
            r5 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            boolean r0 = r8.A0A
            r4 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            int r1 = r8.A00
            r0 = 2
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            X.6F3 r1 = r8.A04
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r0 = r1.A01(r2, r0)
            if (r0 == 0) goto L_0x0021
            r5 = 1
        L_0x0021:
            return r5
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XM.A03(X.6XM):boolean");
    }

    public AnonymousClass6XM(C1271867h r15, AnonymousClass7ez r16, C125085zI r17, AnonymousClass64W r18) {
        C163797qm r4 = new C163797qm(this, 0);
        this.A0L = r4;
        AnonymousClass75O r3 = new AnonymousClass75O(this);
        this.A0M = r3;
        C125085zI r0 = r17;
        this.A08 = r0;
        this.A05 = r0.A05;
        this.A0F = r16;
        this.A0G = r18;
        this.A0E = r15;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.A0C = (timeUnit.toMicros(1) * 1024) / ((long) 44100);
        this.A04 = new AnonymousClass6F3(timeUnit, -1, -1);
        this.A09 = C36441kJ.A16();
        HandlerThread handlerThread = new HandlerThread("audio", -16);
        handlerThread.start();
        this.A0D = new C91624cL(r4, handlerThread.getLooper(), r3);
    }
}
