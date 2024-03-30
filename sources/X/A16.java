package X;

import android.view.Choreographer;
import android.view.Window;

public class A16 implements C23011B0b {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer A03;
    public final AnonymousClass9CB A04;
    public final Choreographer.FrameCallback A05;

    public void B5O(Window window) {
        this.A02 = false;
        this.A03.removeFrameCallback(this.A05);
    }

    public void B6P(Window window) {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        this.A03.postFrameCallback(this.A05);
    }

    public A16(Choreographer choreographer, AnonymousClass9CB r4) {
        this.A03 = choreographer;
        this.A04 = r4;
        this.A05 = new C207299us(choreographer, this);
    }
}
