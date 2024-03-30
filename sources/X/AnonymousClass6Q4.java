package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Map;

/* renamed from: X.6Q4  reason: invalid class name */
public abstract class AnonymousClass6Q4 {
    public int A00;
    public int A01;
    public long A02 = AnonymousClass6TU.A01;
    public long A03 = C90484aE.A0J(0, 0);
    public long A04 = C113565fk.A00;

    public static void A0A(AnonymousClass6Q5 r4) {
        if (r4.A01) {
            r4.A03();
            if (r4.A00 != null) {
                Map map = r4.A05;
                map.clear();
                C161677nI r1 = r4.A04;
                r1.B7X(new AnonymousClass7RT(r4));
                map.putAll(r4.A01(r1.BCj()));
                r4.A01 = false;
            }
        }
    }

    public abstract void A0E(C006302t r1, float f, long j);

    public static final void A09(AnonymousClass6Q4 r8) {
        long j = r8.A03;
        int A08 = C90494aF.A08(j);
        long j2 = r8.A04;
        int A06 = Constraints.A06(j2, A08);
        r8.A01 = A06;
        int A032 = C90474aD.A03(j);
        int A05 = Constraints.A05(j2, A032);
        r8.A00 = A05;
        r8.A02 = C90484aE.A0J((A06 - A08) / 2, (A05 - A032) / 2);
    }

    public int A0B() {
        AnonymousClass6Q4 A002;
        if (this instanceof C94734ih) {
            A002 = ((C94734ih) this).A0O.A0F.A0R.A04;
        } else if (!(this instanceof C94724ig)) {
            return C90474aD.A03(this.A03);
        } else {
            A002 = C94744ii.A00(((C94724ig) this).A0H.A0F);
        }
        return A002.A0B();
    }

    public int A0C() {
        AnonymousClass6Q4 A002;
        if (this instanceof C94734ih) {
            A002 = ((C94734ih) this).A0O.A0F.A0R.A04;
        } else if (!(this instanceof C94724ig)) {
            return C90494aF.A08(this.A03);
        } else {
            A002 = C94744ii.A00(((C94724ig) this).A0H.A0F);
        }
        return A002.A0C();
    }

    public final void A0D(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A09(this);
        }
    }

    public /* synthetic */ Object BF4() {
        if (this instanceof C94894iy) {
            C137846gp r8 = ((C94894iy) this).A0G;
            AnonymousClass6XQ r2 = r8.A0R;
            if (!AnonymousClass000.A1P(64 & r2.A02.A00)) {
                return null;
            }
            Object obj = null;
            for (C137856gq r6 = r2.A05; r6 != null; r6 = r6.A04) {
                if ((r6.A01 & 64) != 0) {
                    C1506776e r4 = null;
                    C137856gq r3 = r6;
                    do {
                        if (r3 instanceof C161797nU) {
                            obj = ((C161797nU) r3).BPv(r8.A0B, obj);
                        } else if ((r3.A01 & 64) != 0 && (r3 instanceof C94114hf)) {
                            int i = 0;
                            for (C137856gq r22 = ((C94114hf) r3).A00; r22 != null; r22 = r22.A02) {
                                if ((r22.A01 & 64) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r3 = r22;
                                    } else {
                                        r4 = C90464aC.A0F(r4);
                                        r3 = C90524aI.A0D(r4, r3);
                                        r4.A0D(r22);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r3 = AnonymousClass6VZ.A00(r4);
                        continue;
                    } while (r3 != null);
                }
            }
            return obj;
        } else if (this instanceof C94924j1) {
            return ((C94924j1) this).A04.BF4();
        } else {
            if (this instanceof C94734ih) {
                return ((C94734ih) this).A08;
            }
            return ((C94724ig) this).A05;
        }
    }
}
