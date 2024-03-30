package X;

import android.os.ConditionVariable;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9ju  reason: invalid class name and case insensitive filesystem */
public abstract class C201579ju {
    public int A00 = -1;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C19700wN A05;
    public final AnonymousClass19L A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final C19970wo A0A;
    public final AnonymousClass11g A0B;
    public final C21010yW A0C;
    public final Integer A0D;
    public final Map A0E = C36431kI.A1G();
    public final boolean A0F;

    public C201579ju(C19700wN r17, C19970wo r18, AnonymousClass11g r19, C20810yC r20, C21010yW r21, AnonymousClass19L r22, Integer num, Integer num2, String str, int i, long j, long j2) {
        boolean z = true;
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0A = r18;
        this.A05 = r17;
        C21010yW r7 = r21;
        this.A0C = r7;
        this.A06 = r22;
        this.A0B = r19;
        this.A09 = str;
        this.A03 = j;
        this.A02 = i;
        this.A00 = 1;
        long j3 = j2;
        this.A01 = j3;
        this.A04 = j3;
        Integer B3I = r7.B3I(A02(new AnonymousClass9RP(0, 0, 0), -1), (C18950u5) null, false);
        this.A0D = B3I;
        this.A07 = num;
        this.A08 = num2;
        this.A0F = (B3I == null || ((1 << i) & r20.A07(7856)) == 0) ? false : z;
        A00(1);
        A00(0);
    }

    public synchronized void A04(int i) {
        int i2 = this.A00;
        if (i == i2) {
            C19700wN r3 = this.A05;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("tag=");
            A0u.append(A03());
            A0u.append(" stage=");
            A0u.append(i);
            r3.A0E("loggable_stanza_invalid_stage_begin", AnonymousClass000.A0r(" currentStage=", A0u, i2), true);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            A01(this, Integer.valueOf(i), i2, uptimeMillis - this.A01);
            this.A00 = i;
            this.A01 = uptimeMillis;
            A00(i);
        }
    }

    private void A00(int i) {
        if (this.A0F) {
            AnonymousClass11g r4 = this.A0B;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(this.A02);
            A0u.append("-");
            A0u.append(this.A03);
            String A0r = AnonymousClass000.A0r("-", A0u, i);
            AnonymousClass00C.A0D(A0r, 0);
            AnonymousClass11g.A00(r4, A0r, false);
        }
    }

    public C20890yK A02(AnonymousClass9RP r6, int i) {
        if (this instanceof C177818eQ) {
            C177818eQ r3 = (C177818eQ) this;
            C176558cJ r2 = new C176558cJ();
            r2.A06 = Long.valueOf(r6.A02);
            r2.A00 = Boolean.valueOf(r3.A05);
            Integer num = r3.A07;
            if (num != null) {
                r2.A07 = C90484aE.A0h(num);
            }
            r2.A08 = Long.valueOf(r3.A01);
            r2.A09 = C165597tg.A0f(r3.A07);
            r2.A03 = Integer.valueOf(i);
            r2.A0A = Long.valueOf(r3.A02);
            r2.A0B = r3.A08;
            r2.A01 = Integer.valueOf(r3.A06);
            r2.A02 = Integer.valueOf(r3.A00);
            r2.A04 = Long.valueOf(r6.A00);
            r2.A05 = Long.valueOf(r6.A01);
            return r2;
        } else if (this instanceof C177798eO) {
            C177798eO r32 = (C177798eO) this;
            C176458c9 r22 = new C176458c9();
            r22.A03 = Long.valueOf(r6.A02);
            Integer num2 = r32.A07;
            if (num2 != null) {
                r22.A04 = C90484aE.A0h(num2);
            }
            r22.A00 = Integer.valueOf(i);
            r22.A06 = r32.A01;
            r22.A05 = r32.A00;
            r22.A01 = Long.valueOf(r6.A00);
            r22.A02 = Long.valueOf(r6.A01);
            return r22;
        } else if (this instanceof C177808eP) {
            C177808eP r1 = (C177808eP) this;
            C176548cI r23 = new C176548cI();
            r23.A00 = Boolean.valueOf(r1.A05);
            r23.A04 = Integer.valueOf(r1.A00);
            r23.A0A = Long.valueOf(r6.A02);
            r23.A01 = Boolean.valueOf(r1.A02);
            r23.A02 = Boolean.valueOf(r1.A04);
            Integer num3 = r1.A07;
            if (num3 != null) {
                r23.A0B = C90484aE.A0h(num3);
            }
            r23.A03 = Boolean.valueOf(r1.A06);
            r23.A05 = Integer.valueOf(i);
            r23.A06 = Integer.valueOf(r1.A03);
            r23.A09 = Long.valueOf(r1.A01);
            r23.A07 = Long.valueOf(r6.A00);
            r23.A08 = Long.valueOf(r6.A01);
            return r23;
        } else {
            C177828eR r33 = (C177828eR) this;
            C176408c4 r24 = new C176408c4();
            r24.A02 = Long.valueOf(r6.A02);
            r24.A00 = Integer.valueOf(i);
            Integer num4 = r33.A07;
            if (num4 != null) {
                r24.A03 = C90484aE.A0h(num4);
            }
            r24.A01 = Integer.valueOf(r33.A00);
            r24.A04 = Long.valueOf(r6.A00);
            r24.A05 = Long.valueOf(r6.A01);
            return r24;
        }
    }

    public String A03() {
        if (this instanceof C177818eQ) {
            return "LoggableReceiptStanza";
        }
        if (this instanceof C177798eO) {
            return "LoggableNotificationStanza";
        }
        if (this instanceof C177808eP) {
            return "LoggableMessageStanza";
        }
        return "LoggableCallStanza";
    }

    public static void A01(C201579ju r15, Integer num, int i, long j) {
        long longValue;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoggableStanza/onStageComplete stage=");
        int i2 = i;
        A0u.append(i2);
        A0u.append(" newStage=");
        A0u.append(num);
        A0u.append("; duration=");
        long j2 = j;
        A0u.append(j2);
        String A0l = AnonymousClass000.A0l(r15, "; ", A0u);
        Integer num2 = r15.A0D;
        if (num2 != null) {
            AnonymousClass11h r4 = null;
            if (r15.A0F) {
                AnonymousClass11g r6 = r15.A0B;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(r15.A02);
                A0u2.append("-");
                A0u2.append(r15.A03);
                r4 = r6.A01(AnonymousClass000.A0r("-", A0u2, i2));
            }
            long j3 = -1;
            if (r4 == null) {
                longValue = -1;
            } else {
                Number A0b = C90524aI.A0b("msgstore.db", r4.A02);
                if (A0b == null) {
                    longValue = -1;
                } else {
                    longValue = A0b.longValue();
                }
                Number A0b2 = C90524aI.A0b("msgstore.db", r4.A03);
                if (A0b2 != null) {
                    j3 = A0b2.longValue();
                }
            }
            AnonymousClass9RP r8 = new AnonymousClass9RP(j2, longValue, j3);
            C36321k7.A1K(r8, ";", AnonymousClass000.A0v(A0l));
            Map map = r15.A0E;
            C90504aG.A1K(r8, map, i2);
            if (i == 0) {
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    r15.A0C.Blz(r15.A02((AnonymousClass9RP) A11.getValue(), C165577te.A08(A11)), num2.intValue());
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("loggableStanzaType=");
        A0u.append(this.A02);
        A0u.append("; id=");
        A0u.append(this.A03);
        A0u.append("; stanzaId=");
        A0u.append(this.A09);
        A0u.append("; currentStage=");
        A0u.append(this.A00);
        A0u.append("; offlineCount=");
        A0u.append(this.A07);
        A0u.append("; stanzaAttrsHash=");
        return AnonymousClass000.A0o(this.A08, A0u);
    }
}
