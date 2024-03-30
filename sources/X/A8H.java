package X;

import java.util.Objects;

public class A8H implements C22906AyI {
    public final C194879Rp A00;
    public final C195299Tr A01;
    public final Object A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A8H a8h = (A8H) obj;
            if (!Objects.equals(this.A01, a8h.A01) || !this.A03.equals(a8h.A03) || !Objects.equals(this.A00, a8h.A00)) {
                return false;
            }
        }
        return true;
    }

    public A8H(C194879Rp r2, C195299Tr r3, Object obj) {
        this.A01 = r3;
        this.A03 = obj.toString();
        this.A00 = r2;
        this.A02 = r3.A00(r2, obj, obj).A00();
    }

    public Object get() {
        return this.A02;
    }
}
