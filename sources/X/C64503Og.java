package X;

import java.util.Timer;

/* renamed from: X.3Og  reason: invalid class name and case insensitive filesystem */
public abstract class C64503Og {
    public static Timer A02 = new Timer();
    public boolean A00;
    public final C82323yW A01;

    public C64503Og() {
        C82323yW r1 = new C82323yW(this);
        this.A01 = r1;
        A02.schedule(r1, 20000);
    }
}
