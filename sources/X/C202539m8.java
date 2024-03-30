package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9m8  reason: invalid class name and case insensitive filesystem */
public final class C202539m8 {
    public int A00 = -1;
    public List A01 = C023409w.A00;
    public Map A02 = C000400e.A0D();
    public Set A03 = C004702c.A00;
    public final int A04;
    public final C160327kp A05;
    public final AnonymousClass9CE A06 = new AnonymousClass9CE(this.A05.getFrameCount());
    public final C1263563p A07;
    public final AnonymousClass6NZ A08;
    public final ConcurrentHashMap A09 = C90524aI.A0s();
    public final AtomicBoolean A0A = C36431kI.A1H();
    public final AnonymousClass60E A0B;

    public static final int A00(C160327kp r6) {
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (r6.BDi() / r6.getFrameCount()));
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public static final C21649ATp A02(C202539m8 r5, int i) {
        int i2 = r5.A06.A00;
        Iterator it = new C15020mZ(0, i2).iterator();
        while (it.hasNext()) {
            int A052 = (i - C165617ti.A05(it)) % i2;
            Integer valueOf = Integer.valueOf(A052);
            if (A052 < 0 || valueOf == null) {
                A052 += i2;
            }
            AU0 au0 = (AU0) C90484aE.A0j(r5.A09, A052);
            if (au0 != null && au0.A02()) {
                return new C21649ATp(au0, A052);
            }
        }
        return null;
    }

    public static final void A03(C202539m8 r2, int i, int i2) {
        if (!r2.A0A.getAndSet(true)) {
            C113695fx.A00.execute(new A1N(r2, i, i2));
        }
    }

    public void A04(int i) {
        C160327kp r4 = this.A05;
        int BDi = r4.BDi();
        int loopCount = r4.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = BDi * loopCount;
        AnonymousClass60E r2 = this.A0B;
        int frameCount = r4.getFrameCount();
        int A002 = A00(r4);
        if (i > A002) {
            i = A002;
        }
        LinkedHashMap A003 = r2.A00(i2, frameCount, i);
        this.A02 = A003;
        this.A03 = C007103b.A0f(A003.values());
    }

    public C202539m8(C160327kp r3, AnonymousClass60E r4, C1263563p r5, AnonymousClass6NZ r6) {
        this.A08 = r6;
        this.A07 = r5;
        this.A0B = r4;
        this.A05 = r3;
        this.A04 = A00(r3);
        A04(A00(this.A05));
    }

    public static final AU0 A01(AU0 au0, C202539m8 r8, int i, int i2, int i3) {
        AU0 A012;
        int i4;
        Bitmap bitmap;
        AU0 A002;
        C21649ATp A022 = A02(r8, i);
        if (A022 == null || (A002 = A022.A01.A00()) == null) {
            A012 = r8.A08.A01(Bitmap.Config.ARGB_8888, i2, i3);
            AnonymousClass00C.A08(A012);
            C1263563p r1 = r8.A07;
            Object A013 = A012.A01();
            AnonymousClass00C.A08(A013);
            i4 = 0;
            r1.A00((Bitmap) A013, 0);
            Object A014 = A012.A01();
            AnonymousClass00C.A08(A014);
            bitmap = (Bitmap) A014;
        } else {
            if (au0 == null || (A012 = au0.A00()) == null) {
                A012 = r8.A08.A02((Bitmap) A002.A01());
                AnonymousClass00C.A08(A012);
            } else {
                Object A015 = A002.A01();
                AnonymousClass00C.A08(A015);
                Bitmap bitmap2 = (Bitmap) A015;
                if (A012.A02()) {
                    Canvas canvas = new Canvas((Bitmap) A012.A01());
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
            }
            A002.close();
            Object A016 = A012.A01();
            AnonymousClass00C.A08(A016);
            bitmap = (Bitmap) A016;
            i4 = A022.A00;
        }
        if (i4 > i) {
            new Canvas(bitmap).drawColor(0, PorterDuff.Mode.CLEAR);
            Iterator it = new C15020mZ(0, i).iterator();
            while (it.hasNext()) {
                r8.A07.A00(bitmap, C165617ti.A05(it));
            }
        } else if (i4 < i) {
            Iterator it2 = new C15020mZ(i4 + 1, i).iterator();
            while (it2.hasNext()) {
                r8.A07.A00(bitmap, C165617ti.A05(it2));
            }
        }
        return A012;
    }
}
