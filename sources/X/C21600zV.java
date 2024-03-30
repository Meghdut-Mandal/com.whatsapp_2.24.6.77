package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0zV  reason: invalid class name and case insensitive filesystem */
public class C21600zV {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public final C21540zP A00;
    public final C21590zU A01;
    public final C21610zW A02;
    public final C19770wU A03;
    public final AnonymousClass005 A04;
    public final ConcurrentHashMap A05;
    public final C35371ia A06;
    public final C21470zI A07;
    public final ArrayBlockingQueue A08;

    public static void A00(C21600zV r3, int i) {
        ConcurrentHashMap concurrentHashMap = r3.A05;
        Integer valueOf = Integer.valueOf(i);
        AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(valueOf, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        atomicInteger.incrementAndGet();
    }

    public static void A01(C21600zV r7, C21820zr r8, int i) {
        C21810zq r6 = r8.A04;
        if (r6 != C21810zq.A02) {
            for (C21720zh r1 : r6.A00) {
                if (i != 1) {
                    r1.BWT(r8);
                } else {
                    r1.BhB(r8);
                }
            }
            for (C21720zh r2 : r6.A01) {
                if (r7.A08.offer(new C21830zs(r2, r8, i))) {
                    A00(r7, r8.A01);
                } else {
                    r7.A07.B1g();
                }
            }
            r7.A03.Boz(r7.A06, "qpl_bg_listeners");
        }
    }

    public C21600zV(C21540zP r7, C21470zI r8, C21590zU r9, C21610zW r10, C19770wU r11, AnonymousClass005 r12) {
        this.A04 = r12;
        this.A03 = r11;
        this.A07 = r8;
        this.A00 = r7;
        this.A01 = r9;
        this.A02 = r10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        this.A08 = arrayBlockingQueue;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = concurrentHashMap;
        this.A06 = new C35371ia(arrayBlockingQueue, concurrentHashMap, r8, r12, 24);
    }
}
