package X;

/* renamed from: X.2Lh  reason: invalid class name */
public class AnonymousClass2Lh extends C201669k5 {
    public final String A00;

    public String A07() {
        return "setting_pushName";
    }

    public AnonymousClass2Lh(C201539jo r10, String str, String str2, long j) {
        super(C199769fw.A03, r10, str, "critical_block", 1, j, false);
        this.A00 = str2;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8OM.DEFAULT_INSTANCE.A0p();
        String str = this.A00;
        A0p.A0S();
        AnonymousClass8OM r1 = (AnonymousClass8OM) A0p.A00;
        str.getClass();
        r1.bitField0_ |= 1;
        r1.name_ = str;
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        A04.A0S();
        AnonymousClass8SS r2 = (AnonymousClass8SS) A04.A00;
        AnonymousClass8OM r12 = (AnonymousClass8OM) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.pushNameSetting_ = r12;
        r2.bitField0_ |= 64;
        return A04;
    }

    public String[] A0A() {
        return new String[]{"setting_pushName"};
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PushNameSettingMutation{rowId=");
        A0u.append(this.A07);
        A0u.append(", pushName=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        A0u.append(", areDependenciesMissing=");
        A0u.append(A09());
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
