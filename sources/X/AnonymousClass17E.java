package X;

/* renamed from: X.17E  reason: invalid class name */
public class AnonymousClass17E {
    public final C19700wN A00;
    public final AnonymousClass00T A01;

    public AnonymousClass17E(C19700wN r3, AnonymousClass17B r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r3;
        this.A01 = new AnonymousClass00U(new AnonymousClass17G(r4));
    }

    public AnonymousClass3T1 A00(C64933Qa r5, int i, long j) {
        StringBuilder sb;
        String str;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass00T r1 = this.A01;
        try {
            return ((B6E) ((AnonymousClass9XG) r1.getValue()).A00(i)).B4a(r5, j);
        } catch (AnonymousClass17F e) {
            String num = Integer.toString(i);
            AnonymousClass00C.A08(num);
            boolean A02 = ((AnonymousClass9XG) r1.getValue()).A02(i);
            C19700wN r12 = this.A00;
            if (A02) {
                r12.A0D("fmessage-factory-message-type-not-supported", num, e);
                sb = new StringBuilder();
                sb.append("FMessageFactorySubsystem; cannot create ");
                sb.append(num);
                str = " (not supported)";
            } else {
                r12.A0D("fmessage-factory-message-type-not-registered", num, e);
                sb = new StringBuilder();
                sb.append("FMessageFactorySubsystem; cannot crete ");
                sb.append(num);
                str = " (not registered)";
            }
            sb.append(str);
            C18740tg.A0D(false, sb.toString());
            return new AnonymousClass2bF(r5, i, j);
        }
    }
}
