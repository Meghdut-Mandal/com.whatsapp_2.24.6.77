package X;

import java.util.Iterator;

public final class AY7 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C21673AUw A02;

    public AY7(C21673AUw aUw) {
        this.A02 = aUw;
        this.A00 = 0;
        this.A01 = aUw.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            AnonymousClass8E0 r2 = (AnonymousClass8E0) this.A02;
            if (r2 instanceof C170578Dz) {
                C170578Dz r22 = (C170578Dz) r2;
                b = r22.zzb[r22.zzc + i];
            } else {
                b = r2.zzb[i];
            }
            return Byte.valueOf(b);
        }
        throw C165617ti.A0e();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }

    public AY7() {
    }
}
