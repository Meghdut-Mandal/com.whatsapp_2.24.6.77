package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6Ug  reason: invalid class name and case insensitive filesystem */
public class C132556Ug {
    public AnonymousClass6NA A00;
    public final C116505kh A01;
    public final C125295ze A02;
    public final Object A03 = C36441kJ.A11();
    public final List A04 = AnonymousClass001.A0I();
    public final Map A05 = AnonymousClass001.A0J();
    public final Map A06 = AnonymousClass001.A0J();
    public final Queue A07 = new PriorityBlockingQueue(10, new C163897qw(this, 6));
    public final C114755hm A08;
    public final C123135w0 A09;
    public final AnonymousClass5ZV A0A;

    public static ArrayList A00(C132556Ug r1) {
        if (Thread.holdsLock(r1.A03)) {
            List list = r1.A04;
            ArrayList A15 = C36441kJ.A15(list);
            list.clear();
            return A15;
        }
        throw AnonymousClass001.A09("Should always be called while holding lock");
    }

    public static void A01(C132556Ug r11) {
        if (r11.A00 == null) {
            Queue queue = r11.A07;
            if (!queue.isEmpty()) {
                AnonymousClass6NA r4 = (AnonymousClass6NA) queue.poll();
                r11.A00 = r4;
                C135056c3 r8 = r4.A04;
                Map map = r11.A05;
                if (!map.containsKey(r4)) {
                    boolean A1a = C36361kB.A1a(r4.A00, C023109s.A0C);
                    C123135w0 r7 = r11.A09;
                    C118525oC r6 = new C118525oC(r4, r11);
                    AtomicBoolean A1H = C36431kI.A1H();
                    r7.A03.execute(new C1503474x((Object) r6, (Object) r7, (Object) r8, (Object) A1H, 9));
                    C139366ji r1 = new C139366ji(A1H);
                    r4.A00(C023109s.A01);
                    map.put(r4, r1);
                    r11.A04.add(new AnonymousClass752(r11, r4, 3, A1a));
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    public static void A02(C132556Ug r0, List list) {
        if (!Thread.holdsLock(r0.A03)) {
            for (Object A1O : list) {
                C36411kG.A1O(A1O);
            }
            return;
        }
        throw AnonymousClass001.A09("Should never be called while holding lock");
    }

    public C132556Ug(C157757ed r4, C123135w0 r5, C116505kh r6, C125295ze r7, AnonymousClass5ZV r8) {
        this.A09 = r5;
        this.A02 = r7;
        this.A01 = r6;
        TimeUnit.SECONDS.toMillis(1);
        this.A08 = new C114755hm(r4);
        this.A0A = r8;
    }
}
