package X;

/* renamed from: X.69P  reason: invalid class name */
public class AnonymousClass69P {
    public long A00 = -1;
    public final C160327kp A01;

    public long A01() {
        long j = this.A00;
        if (j != -1) {
            return j;
        }
        this.A00 = 0;
        C160327kp r6 = this.A01;
        int frameCount = r6.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.A00 += (long) r6.BC6(i);
        }
        return this.A00;
    }

    public AnonymousClass69P(C160327kp r3) {
        this.A01 = r3;
    }

    public int A00(long j) {
        int i;
        long A012 = A01();
        if (A012 == 0) {
            i = 0;
            long j2 = 0;
            do {
                j2 += (long) this.A01.BC6(i);
                i++;
            } while (0 >= j2);
        } else {
            C160327kp r5 = this.A01;
            if (r5.getLoopCount() != 0 && j / A012 >= ((long) r5.getLoopCount())) {
                return -1;
            }
            long j3 = j % A012;
            i = 0;
            long j4 = 0;
            do {
                j4 += (long) r5.BC6(i);
                i++;
            } while (j3 >= j4);
        }
        return i - 1;
    }

    public long A02(long j) {
        long A012 = A01();
        long j2 = 0;
        if (A012 != 0) {
            C160327kp r5 = this.A01;
            if (r5.getLoopCount() == 0 || j / A01() < ((long) r5.getLoopCount())) {
                long j3 = j % A012;
                int frameCount = r5.getFrameCount();
                for (int i = 0; i < frameCount && j2 <= j3; i++) {
                    j2 += (long) r5.BC6(i);
                }
                return j + (j2 - j3);
            }
        }
        return -1;
    }
}
