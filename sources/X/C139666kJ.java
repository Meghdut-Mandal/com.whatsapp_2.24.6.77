package X;

import android.util.SparseArray;

/* renamed from: X.6kJ  reason: invalid class name and case insensitive filesystem */
public final class C139666kJ implements C160337kq {
    public final int A00;

    public void Bm9(C161977nn r14, C160897ll r15, C123025vo r16, AnonymousClass00S r17, int i) {
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            C161977nn r8 = r14;
            int frameCount = (i + i3) % r14.getFrameCount();
            if (C132886Vq.A00.BMH(2)) {
                C132886Vq.A01(C139666kJ.class, Integer.valueOf(frameCount), Integer.valueOf(i), "Preparing frame %d, last drawn: %d");
            }
            int A0A = C36391kE.A0A(r14) + frameCount;
            C123025vo r7 = r16;
            SparseArray sparseArray = r7.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(A0A) != null) {
                    C132886Vq.A02(C123025vo.class, Integer.valueOf(frameCount), "Already scheduled decode job for frame %d");
                } else {
                    C160897ll r9 = r15;
                    if (r15.B3W(frameCount)) {
                        C132886Vq.A02(C123025vo.class, Integer.valueOf(frameCount), "Frame %d is cached already.");
                    } else {
                        AnonymousClass74O r6 = new AnonymousClass74O(r7, r8, r9, frameCount, A0A, 0);
                        sparseArray.put(A0A, r6);
                        r7.A04.execute(r6);
                    }
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    public C139666kJ(int i) {
        this.A00 = i;
    }

    public void Bho() {
    }

    public AU0 B8m(int i, int i2, int i3) {
        return null;
    }

    public void Bm8(AnonymousClass00S r2, int i, int i2) {
    }

    public C139666kJ() {
        this(3);
    }
}
