package X;

import java.io.File;
import java.util.List;

/* renamed from: X.9eF  reason: invalid class name and case insensitive filesystem */
public class C198819eF {
    public static final File A03 = C90524aI.A0S("/sys/kernel/debug/tracing/trace");
    public boolean A00;
    public final Object A01 = C90524aI.A0w();
    public final List A02 = AnonymousClass001.A0I();

    public void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            int i = 0;
            while (true) {
                List list = this.A02;
                if (i < list.size()) {
                    list.get(i);
                    AnonymousClass9Z0.A00();
                    i++;
                }
            }
        }
    }
}
