package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.73H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73H implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C132476Tw A01;
    public final /* synthetic */ C135856dN A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ AnonymousClass73H(C132476Tw r1, C135856dN r2, File file, double d) {
        this.A02 = r2;
        this.A03 = file;
        this.A00 = d;
        this.A01 = r1;
    }

    public final void run() {
        C135856dN r5 = this.A02;
        File file = this.A03;
        double d = this.A00;
        C132476Tw r4 = this.A01;
        if (d == 0.0d) {
            d = 43.0d;
        }
        ArrayList A022 = AnonymousClass6Qz.A02(file, (int) d);
        ArrayList A0v = C36401kF.A0v(A022);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            A0v.add(Float.valueOf(((float) ((Number) it.next()).byteValue()) / 100.0f));
        }
        r5.A03.A0F.A0H(new AnonymousClass737(r5, A0v, r4, 20));
    }
}
