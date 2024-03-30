package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.6WC  reason: invalid class name */
public final class AnonymousClass6WC {
    public int A00;
    public int A01;
    public C195979Xa A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final View A0A;
    public final Set A0B;
    public final ConcurrentLinkedQueue A0C = new ConcurrentLinkedQueue();
    public final AnonymousClass6PP[] A0D = {new AnonymousClass6PP(0, 0, 0.0f), new AnonymousClass6PP(0, 0, 0.0f)};
    public final AnonymousClass6E3[] A0E;
    public final FrameLayout A0F;
    public final C117925n3 A0G = new C117925n3(this);

    public final void A04(C195979Xa r5, Integer num) {
        int intValue = num.intValue();
        if (this.A06) {
            this.A02 = r5;
            this.A03 = num;
        } else if (intValue == 0) {
            this.A0C.add(r5);
            A01(this);
        } else if (intValue == 1) {
            this.A0C.clear();
            A00(r5, this, false);
        } else if (intValue == 2) {
            this.A0C.clear();
            this.A01 = -1;
            A00(r5, this, true);
        }
    }

    public AnonymousClass6WC(Context context, AnonymousClass17Y r20, AnonymousClass6KH r21, C19770wU r22) {
        Context context2 = context;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A0F = frameLayout;
        this.A0A = frameLayout;
        AnonymousClass17Y r9 = r20;
        AnonymousClass6KH r10 = r21;
        C19770wU r11 = r22;
        int i = 0;
        AnonymousClass6E3[] r4 = {new AnonymousClass6E3(context2, r9, r10, r11, 0), new AnonymousClass6E3(context2, r9, r10, r11, 1)};
        this.A0E = r4;
        Set newConcurrentHashSet = AnonymousClass6X9.newConcurrentHashSet();
        AnonymousClass00C.A08(newConcurrentHashSet);
        this.A0B = newConcurrentHashSet;
        this.A01 = -1;
        do {
            AnonymousClass6E3 r2 = r4[i];
            r2.A05 = this.A0G;
            r2.A0A.setAlpha(0.0f);
            this.A0F.addView(r2.A0A);
            i++;
        } while (i < 2);
    }

    public static final void A00(C195979Xa r3, AnonymousClass6WC r4, boolean z) {
        String str = r3.A0F.A0H;
        AnonymousClass6E3 r1 = r4.A0E[(r4.A00 + 1) % 2];
        r4.A04 = str;
        r4.A05 = null;
        r1.A00();
        r1.A01(r3, z);
        r4.A07 = true;
    }

    public static final void A01(AnonymousClass6WC r2) {
        if (!r2.A07) {
            ConcurrentLinkedQueue concurrentLinkedQueue = r2.A0C;
            if (!concurrentLinkedQueue.isEmpty()) {
                C195979Xa r1 = (C195979Xa) concurrentLinkedQueue.poll();
                AnonymousClass00C.A0B(r1);
                A00(r1, r2, false);
            }
        }
    }

    public static final void A02(AnonymousClass6WC r4) {
        int i = (r4.A00 + 1) % 2;
        if (!r4.A06) {
            AnonymousClass6E3[] r3 = r4.A0E;
            AnonymousClass6E3 r2 = r3[i];
            A03(r4, i);
            C204359ps r0 = r2.A02;
            if (r0 != null) {
                r0.A0C();
            }
            r2.A0A.setAlpha(1.0f);
            AnonymousClass6E3 r02 = r3[r4.A00 % 2];
            r02.A00();
            r02.A0A.setAlpha(0.0f);
            r4.A00++;
            r4.A07 = false;
            r4.A04 = null;
            r4.A05 = null;
        }
    }

    public static final void A03(AnonymousClass6WC r6, int i) {
        int height;
        int i2;
        float f;
        AnonymousClass6PP r1 = r6.A0D[i];
        if (r1.A04) {
            FrameLayout frameLayout = r6.A0F;
            if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && frameLayout.getParent() != null) {
                View A0K = C36411kG.A0K(frameLayout);
                if (A0K.getWidth() > 0 && A0K.getHeight() > 0) {
                    float A012 = C36441kJ.A01(A0K) / C36441kJ.A02(A0K);
                    float f2 = r1.A00;
                    frameLayout.getWidth();
                    frameLayout.getHeight();
                    float f3 = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, 0.0f));
                    if (f2 <= A012) {
                        i2 = A0K.getWidth();
                        height = (int) (((float) i2) / f2);
                        f = ((float) (A0K.getHeight() - height)) * max;
                    } else {
                        height = A0K.getHeight();
                        i2 = (int) (((float) height) * f2);
                        f3 = ((float) (A0K.getWidth() - i2)) * max;
                        f = 0.0f;
                    }
                    frameLayout.getLayoutParams().width = i2;
                    C36411kG.A1A(frameLayout, height);
                    frameLayout.setX(f3);
                    frameLayout.setY(f);
                    frameLayout.requestLayout();
                }
            }
        }
    }
}
