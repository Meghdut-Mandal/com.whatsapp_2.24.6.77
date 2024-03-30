package X;

import android.view.Choreographer;

/* renamed from: X.6Ku  reason: invalid class name and case insensitive filesystem */
public class C130366Ku {
    public long A00;
    public AnonymousClass6OB A01;
    public boolean A02;
    public final Choreographer.FrameCallback A03;
    public final Choreographer A04;

    public C130366Ku(Choreographer choreographer) {
        this.A04 = choreographer;
        this.A03 = new C164227rT(this, 1);
    }

    public static AnonymousClass6E4 A00() {
        return new AnonymousClass6OB(new C130366Ku(Choreographer.getInstance())).A00();
    }

    public C130366Ku() {
    }
}
