package X;

/* renamed from: X.54j  reason: invalid class name and case insensitive filesystem */
public final class C1032054j extends C201669k5 {
    public final AnonymousClass6BL A00;
    public final C19730wQ A01;
    public final C107265Nh A02;

    public C1032054j(C19730wQ r10, AnonymousClass6BL r11, C199769fw r12, C201539jo r13, C107265Nh r14, String str, long j) {
        super(r12, r13, str, "regular", 7, j, false);
        this.A00 = r11;
        this.A02 = r14;
        this.A01 = r10;
    }

    public String A07() {
        return "call_log";
    }

    public String[] A0A() {
        String str;
        String[] strArr = new String[4];
        strArr[0] = "call_log";
        AnonymousClass6BL r2 = this.A00;
        strArr[1] = r2.A00.getRawString();
        strArr[2] = r2.A01;
        if (r2.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[3] = str;
        return strArr;
    }

    public AnonymousClass8LN A04() {
        C107265Nh r1 = this.A02;
        if (r1 == null) {
            return super.A04();
        }
        C100074uQ A03 = AnonymousClass6W3.A03(this.A01, r1);
        AnonymousClass8LN A04 = super.A04();
        if (A04 == null) {
            return null;
        }
        AnonymousClass8NN A0p = C99804tz.DEFAULT_INSTANCE.A0p();
        C99804tz r12 = (C99804tz) C90524aI.A0H(A0p);
        A03.getClass();
        r12.callLogRecord_ = A03;
        r12.bitField0_ |= 1;
        C99804tz r2 = (C99804tz) A0p.A0R();
        AnonymousClass8SS r13 = (AnonymousClass8SS) C90524aI.A0H(A04);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r2.getClass();
        r13.callLogAction_ = r2;
        r13.bitField1_ |= 16;
        return A04;
    }
}
