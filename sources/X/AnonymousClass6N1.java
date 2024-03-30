package X;

import java.util.Map;

/* renamed from: X.6N1  reason: invalid class name */
public class AnonymousClass6N1 {
    public static final String A04 = AnonymousClass6VD.A01("WorkTimer");
    public final C157107bq A00;
    public final Object A01 = C36441kJ.A11();
    public final Map A02 = AnonymousClass001.A0J();
    public final Map A03 = AnonymousClass001.A0J();

    public void A00(AnonymousClass69L r6) {
        synchronized (this.A01) {
            if (((AnonymousClass75C) this.A03.remove(r6)) != null) {
                AnonymousClass6VD.A02(AnonymousClass6VD.A00(), r6, "Stopping timer for ", A04, AnonymousClass000.A0u());
                this.A02.remove(r6);
            }
        }
    }

    public AnonymousClass6N1(C157107bq r2) {
        this.A00 = r2;
    }
}
