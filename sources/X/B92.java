package X;

import android.content.Intent;

public class B92 implements AnonymousClass4P8 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public B92(AnonymousClass155 r1, C158077fl r2, C21117A9c a9c, Object obj, int i) {
        this.A04 = i;
        this.A00 = a9c;
        this.A02 = obj;
        this.A01 = r2;
        this.A03 = r1;
    }

    public boolean BQk(Intent intent, int i, int i2) {
        AnonymousClass17Y r4;
        Object obj;
        Object obj2;
        int i3;
        int i4 = this.A04;
        C21117A9c a9c = (C21117A9c) this.A00;
        if (i4 != 0) {
            if (i != 1002) {
                return false;
            }
            r4 = a9c.A00;
            obj = this.A02;
            obj2 = this.A01;
            i3 = 19;
        } else if (i != 1001) {
            return false;
        } else {
            r4 = a9c.A00;
            obj = this.A02;
            obj2 = this.A01;
            i3 = 15;
        }
        r4.Bp3(new AVb(obj, obj2, i3));
        ((AnonymousClass155) this.A03).A3a(this);
        return true;
    }
}
