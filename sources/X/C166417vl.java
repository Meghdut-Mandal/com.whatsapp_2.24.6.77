package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.7vl  reason: invalid class name and case insensitive filesystem */
public abstract class C166417vl extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static void A02(C18800tq r1, C182698pV r2) {
        r2.A05 = (C19970wo) r1.A8b.get();
        r2.A08 = (C20810yC) r1.A02.get();
        r2.A01 = (C19730wQ) r1.A4g.get();
        r2.A07 = (AnonymousClass1H2) r1.A2x.get();
        r2.A02 = (AnonymousClass16D) r1.A2A.get();
        r2.A04 = (C21060yb) r1.A8W.get();
        r2.A03 = (AnonymousClass171) r1.A90.get();
        r2.A06 = (C18820ts) r1.A9X.get();
        r2.A09 = (C19890wg) r1.A7i.get();
        r2.A00 = C19470v6.A00;
    }

    public void A04() {
        if (this instanceof C182658pR) {
            C182658pR r1 = (C182658pR) this;
            if (!r1.A00) {
                r1.A00 = true;
                A02(A00(r1), r1);
            }
        } else if (this instanceof C182648pQ) {
            C182648pQ r12 = (C182648pQ) this;
            if (!r12.A00) {
                r12.A00 = true;
                A02(A00(r12), r12);
            }
        } else if (this instanceof C182668pS) {
            C182668pS r13 = (C182668pS) this;
            if (!r13.A00) {
                r13.A00 = true;
                A02(A00(r13), r13);
            }
        } else if (this instanceof C182638pP) {
            C182638pP r2 = (C182638pP) this;
            if (!r2.A09) {
                r2.A09 = true;
                C18800tq A002 = A00(r2);
                A02(A002, r2);
                r2.A06 = (AnonymousClass1X7) A002.A4o.get();
                r2.A02 = C36351kA.A0M(A002);
                r2.A01 = C36391kE.A0V(A002);
                r2.A08 = C36341k9.A0Z(A002);
                r2.A00 = C36351kA.A0J(A002);
                r2.A04 = (AnonymousClass1TA) A002.A7h.get();
                r2.A03 = C165587tf.A0N(A002);
                r2.A07 = (AnonymousClass13J) A002.A6z.get();
            }
        } else if (this instanceof C182558pH) {
            C182558pH r14 = (C182558pH) this;
            if (!r14.A01) {
                r14.A01 = true;
                A02(A00(r14), r14);
            }
        } else if (this instanceof C182538pF) {
            C182538pF r15 = (C182538pF) this;
            if (!r15.A00) {
                r15.A00 = true;
                A02(A00(r15), r15);
            }
        } else if (this instanceof C182568pI) {
            C182568pI r16 = (C182568pI) this;
            if (!r16.A01) {
                r16.A01 = true;
                A02(A00(r16), r16);
            }
        } else if (this instanceof C182578pJ) {
            C182578pJ r22 = (C182578pJ) this;
            if (!r22.A03) {
                r22.A03 = true;
                C18800tq A003 = A00(r22);
                A02(A003, r22);
                r22.A00 = C36351kA.A0M(A003);
                r22.A01 = C36361kB.A0V(A003);
            }
        } else if (this instanceof C182548pG) {
            C182548pG r17 = (C182548pG) this;
            if (!r17.A01) {
                r17.A01 = true;
                A02(A00(r17), r17);
            }
        } else if (this instanceof C182598pL) {
            C182598pL r23 = (C182598pL) this;
            if (r23 instanceof C182678pT) {
                C182678pT r24 = (C182678pT) r23;
                if (!r24.A03) {
                    r24.A03 = true;
                    C18800tq A004 = A00(r24);
                    A02(A004, r24);
                    r24.A01 = (AnonymousClass1DU) A004.A4T.get();
                    r24.A00 = (C32731e6) A004.A6S.get();
                }
            } else if (!r23.A00) {
                r23.A00 = true;
                A02(A00(r23), r23);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A02(((C27861Qc) ((C27851Qb) generatedComponent())).A0M, (C182698pV) this);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C166417vl(Context context) {
        super(context);
        A04();
    }

    public static C18800tq A00(C166417vl r0) {
        return ((C27861Qc) ((C27851Qb) r0.generatedComponent())).A0M;
    }

    public static CharSequence A01(AnonymousClass141 r8, AnonymousClass3T1 r9, C182698pV r10) {
        Context context = r10.getContext();
        boolean z = r9.A1J.A02;
        return AnonymousClass3TZ.A03(context, r10.A01, r10.A03, r10.A06, r8, r10.A08, z);
    }
}
