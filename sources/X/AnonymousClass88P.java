package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.88P  reason: invalid class name */
public class AnonymousClass88P extends AnonymousClass88Z implements B5h {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C23107B5m A06;
    public C157787eg A07;
    public B2o A08;
    public C22875AxW A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public C20985A1z A0E;
    public C23012B0d A0F;
    public final Handler A0G;
    public final Handler A0H;
    public final C198549dl A0I;
    public final C23076B3g A0J;
    public final AnonymousClass9VB A0K = new AnonymousClass9VB();
    public final boolean A0L;
    public final C140226lF A0M;
    public volatile AnonymousClass9CX A0N;
    public volatile boolean A0O;
    public volatile C199559fW A0P;

    public AnonymousClass88P(B3B b3b) {
        super(b3b);
        C23076B3g a2a;
        AnonymousClass94Q r0 = B4H.A00;
        Object r1 = new C198549dl();
        B3B b3b2 = this.A00;
        Object BA0 = b3b2.BA0(r0);
        this.A0I = (C198549dl) (BA0 != null ? BA0 : r1);
        this.A0H = C1894193s.A00(b3b);
        this.A0G = ((C23111B5q) b3b2.B9z(C23111B5q.A00)).BCG("Lite-Controller-Thread");
        this.A0M = new C140226lF(this);
        this.A0L = true;
        this.A0A = false;
        boolean z = false;
        Object BA02 = b3b2.BA0(B42.A00);
        if (AnonymousClass000.A1X(BA02 != null ? BA02 : z)) {
            a2a = new A2B();
        } else {
            a2a = new A2A();
        }
        this.A0J = a2a;
    }

    public static void A00(AnonymousClass88P r16) {
        int i;
        C20985A1z a1z;
        int i2;
        AnonymousClass88P r2 = r16;
        int i3 = r2.A03;
        if (i3 != 0 && (i = r2.A02) != 0 && (a1z = r2.A0E) != null) {
            boolean z = true;
            boolean z2 = false;
            int i4 = i3;
            if (r2.A05 % 180 != 0) {
                z2 = true;
                i4 = i;
            }
            int i5 = i4;
            if (!z2) {
                i3 = i;
            }
            int i6 = r2.A04;
            int i7 = i3;
            if (i6 % 180 == 0) {
                z = false;
                i7 = i4;
                i4 = i3;
            }
            int i8 = i7;
            int i9 = i7;
            if (z) {
                i9 = i4;
            }
            r2.A0D = i9;
            if (!z) {
                i7 = i4;
            }
            r2.A0C = i7;
            if (r2.A0A) {
                i2 = r2.A01;
            } else {
                i2 = 0;
            }
            C194849Rm A002 = a1z.A00(i5, i3, i9, i7, i6, i2, r2.A00, r2.A0B);
            C199559fW r1 = r2.A0P;
            if (r1 != null) {
                r1.A01 = r2.A04;
            }
            r2.A06.Bwt(0, A002.A01, A002.A00, i8, i4, r2.A0B);
            int i10 = r2.A0D;
            int i11 = r2.A0C;
            if (i10 != 0 && i11 != 0) {
                List list = r2.A0K.A00;
                if (0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass001.A0A("onOutputSizeChanged");
                }
            }
        }
    }

    public static void A01(AnonymousClass88P r2, C199559fW r3) {
        C199559fW r1 = r2.A0P;
        if (!(r1 == null || r1 == r3)) {
            ((C1690483a) r2.A06).A05.A02.A03(r1);
        }
        r2.A0P = r3;
        if (r3 != null) {
            A22 a22 = new A22(r2.A0I, r3);
            if (r2.A0O) {
                a22.A03 = 3;
            }
            a22.A07 = true;
            ((C1690483a) r2.A06).A05.A02.A00(a22);
        }
    }

    public void A06(C23012B0d b0d, int i) {
        if (this.A0H.getLooper() != Looper.myLooper()) {
            throw AnonymousClass001.A09("getInputTextureId() must be called at SurfacePipe thread.");
        } else if (b0d instanceof C20985A1z) {
            this.A0F = b0d;
            C157787eg r1 = this.A07;
            if (r1 == null) {
                r1 = new C23144B7e(this, 0);
                this.A07 = r1;
            }
            b0d.BrL(r1);
            this.A0E = (C20985A1z) b0d;
            C20979A1t a1t = new C20979A1t(this.A0I, this.A0F);
            if (i != 0) {
                a1t.A00 = i;
            }
            ((C1690483a) this.A06).A05.A02.A02(a1t);
        } else {
            throw C90464aC.A0P(b0d, "glInput must implement GlInputUpdateAware interface: ", AnonymousClass000.A0u());
        }
    }

    public C1691688a BDJ() {
        return B5h.A00;
    }
}
