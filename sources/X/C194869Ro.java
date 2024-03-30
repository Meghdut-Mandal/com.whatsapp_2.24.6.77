package X;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: X.9Ro  reason: invalid class name and case insensitive filesystem */
public class C194869Ro {
    public C23091B4b A00;
    public C198579do A01;
    public Collection A02 = AnonymousClass001.A0I();
    public EnumSet A03 = EnumSet.noneOf(C188068yz.class);

    public C194879Rp A00() {
        C198579do r3;
        C23091B4b b4b = this.A00;
        if (b4b == null || (r3 = this.A01) == null) {
            C197409bf r0 = C197409bf.A01;
            if (b4b == null) {
                b4b = new A8O();
                this.A00 = b4b;
            }
            r3 = this.A01;
            if (r3 == null) {
                r3 = r0.A00;
                this.A01 = r3;
            }
        }
        return new C194879Rp(b4b, r3, this.A02, this.A03);
    }
}
