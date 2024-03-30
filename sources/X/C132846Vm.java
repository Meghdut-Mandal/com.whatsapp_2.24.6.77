package X;

/* renamed from: X.6Vm  reason: invalid class name and case insensitive filesystem */
public abstract class C132846Vm {
    public static final AnonymousClass5WB A00 = new AnonymousClass5WB();

    public static final AnonymousClass041 A00(C161337ma r2, C005102h r3) {
        C007603g r1;
        C009203x r12 = C007403e.A00;
        if (r3.get(r12) != null) {
            C007603g r13 = new C007603g((C007403e) null);
            r13.A0x(AnonymousClass001.A08("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            r1 = r13;
        } else {
            C005102h A07 = ((C136916fF) r2).A0V.A07();
            r1 = A07.plus(new C007603g((C007403e) A07.get(r12))).plus(r3);
        }
        return C009403z.A02(r1);
    }

    public static final void A01(C161337ma r4, Object obj, Object obj2, C009003v r7) {
        r4.Bum(590241125);
        C136916fF r3 = (C136916fF) r4;
        C005102h A07 = r3.A0V.A07();
        boolean A1X = C90464aC.A1X(r4, obj, obj2, 511388516);
        Object BnZ = r4.BnZ();
        if (A1X || BnZ == C129736Ig.A00) {
            r4.Bwv(new C137026fT(A07, r7));
        }
        C136916fF.A0G(r3);
    }

    public static final void A02(C161337ma r2, Object obj, C006302t r4) {
        r2.Bum(-1371986847);
        boolean A1T = C90494aF.A1T(r2, obj);
        Object BnZ = r2.BnZ();
        if (A1T || BnZ == C129736Ig.A00) {
            r2.Bwv(new C137016fS(r4));
        }
        C136916fF.A0G((C136916fF) r2);
    }

    public static final void A03(C161337ma r4, Object obj, C009003v r6) {
        r4.Bum(1179185413);
        C136916fF r3 = (C136916fF) r4;
        C005102h A07 = r3.A0V.A07();
        boolean A1T = C90494aF.A1T(r4, obj);
        Object BnZ = r4.BnZ();
        if (A1T || BnZ == C129736Ig.A00) {
            r4.Bwv(new C137026fT(A07, r6));
        }
        C136916fF.A0G(r3);
    }
}
