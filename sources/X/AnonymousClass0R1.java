package X;

/* renamed from: X.0R1  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass0R1 {
    public static final AnonymousClass05H A00(C005102h r5, AnonymousClass05H r6) {
        AnonymousClass05H r4 = r6;
        C005102h r2 = r5;
        if (r5.get(C007403e.A00) != null) {
            throw AnonymousClass001.A08(AnonymousClass000.A0l(r5, "Flow context cannot contain job in it. Had ", AnonymousClass000.A0u()));
        } else if (r5.equals(C008903u.A00)) {
            return r4;
        } else {
            if (r6 instanceof AnonymousClass05M) {
                return ((AnonymousClass05M) r4).B7l(C023109s.A00, r5, -3);
            }
            return new C15420nJ((Integer) null, r2, (C05250Oz) null, r4, 0, 12);
        }
    }
}
