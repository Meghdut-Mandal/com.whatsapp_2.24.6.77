package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.9Xo  reason: invalid class name and case insensitive filesystem */
public abstract class C196079Xo {
    public final C207099uY A00;
    public final AnonymousClass9WU A01;
    public final String A02;
    public final List A03;

    public C196079Xo(C207099uY r10, AnonymousClass9RF r11, String str, List list) {
        AnonymousClass9WU r3;
        this.A00 = r10;
        this.A02 = str;
        this.A03 = Collections.unmodifiableList(list);
        boolean z = r11 instanceof AnonymousClass832;
        AnonymousClass832 r112 = r11;
        if (z) {
            AnonymousClass832 r113 = (AnonymousClass832) r11;
            C194829Rk r1 = r113.A01;
            r112 = r113;
            if (r1 != null) {
                C207099uY r0 = this.A00;
                r3 = new AnonymousClass9WU(0, r1.A00(r0.A0Q, r0.A04, 0, 0), -1);
                this.A01 = r3;
            }
        }
        r3 = r112.A02;
        this.A01 = r3;
    }
}
