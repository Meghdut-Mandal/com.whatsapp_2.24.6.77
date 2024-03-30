package X;

/* renamed from: X.8sK  reason: invalid class name and case insensitive filesystem */
public final class C184368sK extends C118095nK {
    public final C184818t3 A00;
    public final C184068rq A01;
    public final C184068rq A02;
    public final C184618sj A03;
    public final Long A04;
    public final String A05;

    public C184368sK(C203399nx r11) {
        C203399nx r3 = r11;
        C203399nx.A0A(r11, "sub_group_suggestion");
        Long A0t = C36411kG.A0t();
        Long A0Q = C165567td.A0Q();
        C203539oF r2 = C203379ns.A00;
        this.A04 = (Long) r2.A0Z(r3, Long.class, A0t, A0Q, (Object) null, new String[]{"creation"}, false);
        this.A05 = (String) r2.A0Z(r3, String.class, C90474aD.A0Y(), 65536L, (Object) null, new String[]{"subject", "#elementValue"}, false);
        this.A00 = (C184818t3) C203539oF.A02(r11, C21468AMq.A00, 0);
        this.A01 = (C184068rq) C203379ns.A02(r11, C21469AMr.A00, new String[]{"description"});
        this.A03 = (C184618sj) C203379ns.A02(r11, C21470AMs.A00, new String[]{"is_existing_group"});
        this.A02 = (C184068rq) C203379ns.A02(r11, C21471AMt.A00, new String[]{"participant_count"});
        this.A00 = r11;
    }
}
