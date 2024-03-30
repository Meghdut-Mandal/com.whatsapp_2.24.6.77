package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3nu  reason: invalid class name and case insensitive filesystem */
public final class C75853nu implements AnonymousClass4V1 {
    public C28981Uw A00;
    public Runnable A01;
    public Runnable A02;
    public final AnonymousClass164 A03;
    public final C20810yC A04;
    public final C19970wo A05;
    public final C19770wU A06;
    public final Set A07 = C36441kJ.A17();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();

    private final synchronized void A00() {
        if (this.A02 == null && !this.A08.isEmpty()) {
            this.A02 = this.A06.BpM(new C81123wV((Object) this, 2), "NewsletterViewReceiptManager/scheduleTheNewRunIfNeeded", C36441kJ.A0B(this.A04, 4648));
        }
    }

    public static final synchronized void A02(C75853nu r6) {
        synchronized (r6) {
            if (r6.A01 == null) {
                r6.A01 = r6.A06.BpM(new C81123wV((Object) r6, 0), "NewsletterViewReceiptManager/scheduleTheReceiptSendIfNeeded", 10000);
            }
        }
    }

    public static final synchronized void A03(C75853nu r9, boolean z) {
        synchronized (r9) {
            r9.A02 = null;
            ConcurrentHashMap concurrentHashMap = r9.A08;
            if (!concurrentHashMap.isEmpty()) {
                Map A0B = C000400e.A0B(concurrentHashMap);
                ArrayList A0I = AnonymousClass001.A0I();
                long uptimeMillis = SystemClock.uptimeMillis();
                Iterator A0y = AnonymousClass000.A0y(A0B);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (C36431kI.A09(A11.getValue()) < uptimeMillis) {
                        Set set = r9.A07;
                        set.add(A11.getKey());
                        A0I.add(A11.getKey());
                        if (set.size() > 20) {
                            A01(r9);
                        }
                    }
                }
                if (z) {
                    A01(r9);
                    concurrentHashMap.clear();
                } else {
                    AnonymousClass3R6.A02(concurrentHashMap, A0I.toArray(new AnonymousClass3T1[0]));
                }
                r9.A00();
            }
        }
    }

    public void B2i(C28981Uw r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (AnonymousClass00C.A0J(this.A00, r4)) {
            this.A06.Boy(new C81123wV((Object) this, 1));
        }
    }

    public static final void A01(C75853nu r5) {
        Set set = r5.A07;
        if (!set.isEmpty()) {
            List A0Y = C007103b.A0Y(set);
            C28981Uw r3 = r5.A00;
            if (r3 != null) {
                set.clear();
                r5.A06.Boy(new AnonymousClass736(r5, r3, A0Y, 14));
            }
        }
    }

    public void BPq(AnonymousClass3T1 r6) {
        AnonymousClass11F r1 = r6.A1J.A00;
        if (r1 instanceof C28981Uw) {
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            C28981Uw r12 = (C28981Uw) r1;
            if (!AnonymousClass00C.A0J(r12, this.A00)) {
                A03(this, true);
                this.A00 = r12;
            }
            if (!this.A07.contains(r6)) {
                ConcurrentHashMap concurrentHashMap = this.A08;
                if (!concurrentHashMap.contains(r6)) {
                    C36421kH.A1K(r6, concurrentHashMap, SystemClock.uptimeMillis() + C36441kJ.A0B(this.A04, 4648));
                    A00();
                    A02(this);
                }
            }
        }
    }

    public C75853nu(AnonymousClass164 r2, C19970wo r3, C20810yC r4, C19770wU r5) {
        C36321k7.A18(r3, r4, r5, r2);
        this.A05 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A03 = r2;
    }

    public void B0V(AnonymousClass2bU r3) {
        AnonymousClass11F A002 = C64933Qa.A00(r3);
        if (A002 instanceof C28981Uw) {
            AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            C28981Uw r1 = (C28981Uw) A002;
            if (!AnonymousClass00C.A0J(r1, this.A00)) {
                A03(this, true);
                this.A00 = r1;
            }
            this.A07.add(r3);
            A02(this);
        }
    }

    public void BPs(AnonymousClass3T1 r2) {
        if (C64933Qa.A00(r2) instanceof C28981Uw) {
            this.A08.remove(r2);
        }
    }
}
