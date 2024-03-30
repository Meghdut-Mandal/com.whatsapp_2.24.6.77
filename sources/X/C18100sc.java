package X;

import java.util.Map;

/* renamed from: X.0sc  reason: invalid class name and case insensitive filesystem */
public class C18100sc extends C009904e {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C18100sc(AnonymousClass01X r1, AnonymousClass04Z r2, String str, int i) {
        this.A03 = i;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void A00() {
        ((AnonymousClass01X) this.A00).A05(this.A02);
    }

    public void A01(AnonymousClass0YW r6, Object obj) {
        int i = this.A03;
        AnonymousClass01X r3 = (AnonymousClass01X) this.A00;
        Map map = r3.A03;
        String str = this.A02;
        Number number = (Number) map.get(str);
        if (i != 0) {
            if (number != null) {
                r3.A00.add(str);
                try {
                    r3.A04((AnonymousClass04Z) this.A01, r6, obj, number.intValue());
                } catch (Exception e) {
                    r3.A00.remove(str);
                    throw e;
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                A0u.append(this.A01);
                A0u.append(" and input ");
                A0u.append(obj);
                throw AnonymousClass000.A0g(". You must ensure the ActivityResultLauncher is registered before calling launch().", A0u);
            }
        } else if (number != null) {
            r3.A00.add(str);
            r3.A04((AnonymousClass04Z) this.A01, r6, obj, number.intValue());
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            A0u2.append(this.A01);
            A0u2.append(" and input ");
            A0u2.append(obj);
            throw AnonymousClass000.A0g(". You must ensure the ActivityResultLauncher is registered before calling launch().", A0u2);
        }
    }
}
