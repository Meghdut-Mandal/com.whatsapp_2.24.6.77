package X;

/* renamed from: X.9ZG  reason: invalid class name */
public abstract class AnonymousClass9ZG {
    public static final String A01(Integer num) {
        if (num == null) {
            return "UNKNOWN";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "DIGITAL_GOODS";
        }
        if (intValue == 2) {
            return "PHYSICAL_GOODS";
        }
        return "UNKNOWN";
    }

    public static final C131606Ps A00() {
        C131606Ps A0F = C165567td.A0F();
        A0F.A03("p2m_type", "p2m_lite");
        A0F.A03("merchant_type", "api");
        return A0F;
    }
}
