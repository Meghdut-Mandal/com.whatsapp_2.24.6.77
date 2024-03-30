package X;

import java.util.Set;

/* renamed from: X.1N6  reason: invalid class name */
public final class AnonymousClass1N6 {
    public static final AnonymousClass00T A0A = C001400p.A00(C000800j.NONE, AnonymousClass1N7.A00);
    public int A00 = 8;
    public final C20810yC A01;
    public final C19770wU A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(new AnonymousClass1N8(this));
    public final AnonymousClass00T A04 = new AnonymousClass00U(new AnonymousClass1N9(this));
    public final C19970wo A05;
    public final C21010yW A06;
    public final C233818g A07;
    public final AnonymousClass005 A08;
    public volatile boolean A09;

    public AnonymousClass1N6(C19970wo r3, C20810yC r4, C21010yW r5, C233818g r6, C19770wU r7, AnonymousClass005 r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r8, 6);
        this.A05 = r3;
        this.A01 = r4;
        this.A02 = r7;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r8;
    }

    public static final synchronized void A00(AnonymousClass11F r7, AnonymousClass1N6 r8, int i) {
        synchronized (r8) {
            Integer valueOf = Integer.valueOf(r8.A00);
            Integer valueOf2 = Integer.valueOf(i);
            if (!((Set) A0A.getValue()).contains(new AnonymousClass011(valueOf, valueOf2))) {
                C28891Um r3 = new C28891Um();
                r3.A06 = Integer.valueOf(r8.A00);
                r3.A05 = valueOf2;
                C233818g r2 = r8.A07;
                r3.A0B = Long.valueOf((long) r2.A00());
                r3.A0A = Long.valueOf(C19970wo.A00(r8.A05) - C233518d.A00(r2.A00).getLong("session_start_timestamp", -1));
                Object obj = r8.A08.get();
                AnonymousClass00C.A08(obj);
                for (C28911Up r1 : (Iterable) obj) {
                    if (r1.BtG(r7)) {
                        r1.B0W(r3, r7);
                    }
                }
                r8.A06.Blv(r3);
                r8.A00 = i;
            }
        }
    }

    public final synchronized void A01() {
        if (((Boolean) this.A03.getValue()).booleanValue() && this.A00 != 1) {
            if (this.A09) {
                this.A09 = false;
            } else {
                A00((AnonymousClass11F) null, this, 1);
            }
        }
    }

    public final synchronized void A02(AnonymousClass11F r4, int i) {
        if (((Boolean) this.A03.getValue()).booleanValue() && ((1 << i) & ((Number) this.A04.getValue()).intValue()) == 0) {
            this.A02.Boy(new C35261iP((Object) this, i, 39, (Object) r4));
        }
    }

    public final synchronized void A03(AnonymousClass11F r4, int i) {
        if (((Boolean) this.A03.getValue()).booleanValue() && ((1 << i) & ((Number) this.A04.getValue()).intValue()) == 0) {
            this.A09 = true;
            A00(r4, this, i);
        }
    }
}
