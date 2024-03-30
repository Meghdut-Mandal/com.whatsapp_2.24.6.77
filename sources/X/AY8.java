package X;

import java.util.Iterator;

public class AY8 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C21674AUx A02;

    public AY8(C21674AUx aUx) {
        this.A02 = aUx;
        this.A00 = 0;
        this.A01 = aUx.A02();
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public /* bridge */ /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            AnonymousClass8I5 r2 = (AnonymousClass8I5) this.A02;
            if (r2 instanceof AnonymousClass8I4) {
                AnonymousClass8I4 r22 = (AnonymousClass8I4) r2;
                b = r22.bytes[r22.bytesOffset + i];
            } else {
                b = r2.bytes[i];
            }
            return Byte.valueOf(b);
        }
        throw C165617ti.A0e();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }

    public AY8() {
    }
}
