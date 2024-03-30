package X;

/* renamed from: X.06O  reason: invalid class name */
public class AnonymousClass06O extends AnonymousClass06N {
    public void A00(C014006c r8, float f, float f2, float f3) {
        r8.A02(f3 * f2, 180.0f, 180.0f - 90.0f);
        float f4 = f3 * 2.0f * f2;
        AnonymousClass0D9 r1 = new AnonymousClass0D9(0.0f, 0.0f, f4, f4);
        r1.A03 = 180.0f;
        r1.A04 = 90.0f;
        r8.A05.add(r1);
        AnonymousClass0DA r2 = new AnonymousClass0DA(r1);
        float f5 = 180.0f + 90.0f;
        C014006c.A00(r8, 180.0f);
        r8.A06.add(r2);
        r8.A00 = f5;
        float f6 = (0.0f + f4) * 0.5f;
        float f7 = (f4 - 0.0f) / 2.0f;
        double radians = Math.toRadians((double) f5);
        r8.A02 = (((float) Math.cos(radians)) * f7) + f6;
        r8.A03 = f6 + (f7 * ((float) Math.sin(radians)));
    }
}
