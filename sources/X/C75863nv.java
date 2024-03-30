package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3nv  reason: invalid class name and case insensitive filesystem */
public final class C75863nv implements AnonymousClass4V1 {
    public C28981Uw A00;
    public Runnable A01;
    public Runnable A02;
    public final AnonymousClass164 A03;
    public final C20810yC A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass4CZ(this));
    public final C19970wo A06;
    public final C19770wU A07;
    public final Object A08 = C36441kJ.A11();
    public final Map A09 = C36431kI.A1G();
    public final Set A0A = C36441kJ.A17();

    public static final void A03(C75863nv r11, boolean z) {
        r11.A02 = null;
        Map map = r11.A09;
        if (!map.isEmpty()) {
            ArrayList A0I = AnonymousClass001.A0I();
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (r11.A08) {
                Iterator A0y = AnonymousClass000.A0y(C000400e.A0B(map));
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (C36431kI.A09(A11.getValue()) < uptimeMillis) {
                        Set set = r11.A0A;
                        set.add(A11.getKey());
                        A0I.add(A11.getKey());
                        if (set.size() > 20) {
                            A02(r11, false);
                        }
                    }
                }
                if (z) {
                    A02(r11, false);
                    map.clear();
                } else {
                    AnonymousClass3R6.A02(map, A0I.toArray(new AnonymousClass3T1[0]));
                }
            }
            r11.A00();
        }
    }

    public void B2i(C28981Uw r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (AnonymousClass00C.A0J(this.A00, r4)) {
            this.A07.Boy(new C81123wV((Object) this, 4));
        }
    }

    private final void A00() {
        if (this.A02 == null && !this.A09.isEmpty()) {
            this.A02 = this.A07.BpM(new C81123wV((Object) this, 5), "NewsletterViewReceiptManagerWithLock/scheduleTheNewRunIfNeeded", C36351kA.A08(this.A05));
        }
    }

    public static final void A01(C75863nv r5) {
        if (r5.A01 == null) {
            r5.A01 = r5.A07.BpM(new C81123wV((Object) r5, 3), "NewsletterViewReceiptManagerWithLock/scheduleTheReceiptSendIfNeeded", 10000);
        }
    }

    public static final void A02(C75863nv r5, boolean z) {
        C28981Uw r4;
        Set set = r5.A0A;
        if (!set.isEmpty() && (r4 = r5.A00) != null) {
            C10810fG r3 = new C10810fG();
            if (z) {
                synchronized (r5.A08) {
                    r3.element = C007103b.A0Y(set);
                    set.clear();
                }
            } else {
                r3.element = C007103b.A0Y(set);
                set.clear();
            }
            r5.A07.Boy(new AnonymousClass736(r5, r4, r3, 15));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPq(X.AnonymousClass3T1 r7) {
        /*
            r6 = this;
            X.3Qa r0 = r7.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r1, r0)
            X.1Uw r1 = (X.C28981Uw) r1
            X.1Uw r0 = r6.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x001d
            r0 = 1
            A03(r6, r0)
            r6.A00 = r1
        L_0x001d:
            java.lang.Object r5 = r6.A08
            monitor-enter(r5)
            java.util.Set r0 = r6.A0A     // Catch:{ all -> 0x004c }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x004a
            java.util.Map r4 = r6.A09     // Catch:{ all -> 0x004c }
            boolean r0 = r4.containsKey(r7)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x004a
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004c }
            X.00T r0 = r6.A05     // Catch:{ all -> 0x004c }
            long r0 = X.C36351kA.A08(r0)     // Catch:{ all -> 0x004c }
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004c }
            r4.put(r7, r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r5)
            r6.A00()
            A01(r6)
            return
        L_0x004a:
            monitor-exit(r5)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75863nv.BPq(X.3T1):void");
    }

    public C75863nv(AnonymousClass164 r2, C19970wo r3, C20810yC r4, C19770wU r5) {
        C36321k7.A18(r3, r4, r5, r2);
        this.A06 = r3;
        this.A04 = r4;
        this.A07 = r5;
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
            synchronized (this.A08) {
                this.A0A.add(r3);
            }
            A01(this);
        }
    }

    public void BPs(AnonymousClass3T1 r3) {
        if (C64933Qa.A00(r3) instanceof C28981Uw) {
            synchronized (this.A08) {
                this.A09.remove(r3);
            }
        }
    }
}
