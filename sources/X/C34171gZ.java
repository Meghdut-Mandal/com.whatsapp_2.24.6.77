package X;

import android.view.Choreographer;

/* renamed from: X.1gZ  reason: invalid class name and case insensitive filesystem */
public class C34171gZ {
    public long A00 = -1;
    public long A01 = -1;
    public C34161gY A02;
    public boolean A03 = false;
    public final Choreographer.FrameCallback A04;
    public final Choreographer A05;

    public C34171gZ(Choreographer choreographer, C34161gY r4) {
        this.A05 = choreographer;
        this.A02 = r4;
        this.A04 = new C34181ga(this);
    }
}
