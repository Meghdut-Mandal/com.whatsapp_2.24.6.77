package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.6WW  reason: invalid class name */
public class AnonymousClass6WW {
    public static C91594cI A0K;
    public static final Object A0L = C36441kJ.A11();
    public static final ArrayList A0M = AnonymousClass001.A0I();
    public static final ArrayList A0N = AnonymousClass001.A0I();
    public static final ArrayList A0O = AnonymousClass001.A0I();
    public static final ArrayList A0P = AnonymousClass001.A0I();
    public static final ArrayList A0Q = AnonymousClass001.A0I();
    public static final Interpolator A0R = new AccelerateDecelerateInterpolator();
    public static final AnonymousClass6P6 A0S = new AnonymousClass6P6(64);
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public long A07 = 300;
    public long A08 = -1;
    public long A09;
    public Interpolator A0A = A0R;
    public ArrayList A0B = null;
    public ArrayList A0C = null;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];

    public static AnonymousClass6WW A00(float f, float f2) {
        AnonymousClass6WW r4 = (AnonymousClass6WW) A0S.A00();
        if (r4 == null) {
            r4 = new AnonymousClass6WW();
        }
        r4.A03 = 2;
        float[] fArr = r4.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = r4.A0J;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        r4.A0E = false;
        return r4;
    }

    public static void A01(AnonymousClass6WW r5) {
        A0M.remove(r5);
        A0P.remove(r5);
        A0N.remove(r5);
        r5.A04 = 0;
        r5.A0G = false;
        if (r5.A0F) {
            r5.A0F = false;
            ArrayList arrayList = r5.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C139266jV r2 = (C139266jV) r5.A0B.get(i);
                    if (r5 == r2.A0I) {
                        r2.A0I = null;
                    } else if (r5 == r2.A0J) {
                        r2.A0J = null;
                    } else if (r5 == r2.A0K) {
                        r2.A0K = null;
                    } else if (r5 == r2.A0H) {
                        r2.A0H = null;
                    }
                    r5.A04();
                    if (r2.A0L && r2.A0I == null && r2.A0J == null && r2.A0K == null && r2.A0H == null) {
                        r2.A0L = false;
                        C158997ia r0 = r2.A08;
                        if (r0 != null) {
                            r2.A08 = null;
                            r0.BY0();
                        }
                        r2.A04();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 >= 1.0f) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass6WW r9, long r10) {
        /*
            int r0 = r9.A04
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0011
            r9.A04 = r6
            long r2 = r9.A08
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
            r9.A09 = r10
        L_0x0011:
            long r3 = r9.A07
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            long r0 = r9.A09
            long r10 = r10 - r0
            float r2 = (float) r10
            float r0 = (float) r3
            float r2 = r2 / r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00d4
        L_0x0023:
            int r7 = r9.A02
            int r1 = r9.A05
            if (r7 < r1) goto L_0x00b9
            r0 = -1
            if (r1 == r0) goto L_0x00b9
            float r2 = java.lang.Math.min(r2, r5)
        L_0x0030:
            int r1 = r9.A03
            r7 = 2
            r3 = 0
            r4 = 1
            if (r1 != r7) goto L_0x006f
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0046
            r9.A0D = r3
            float[] r0 = r9.A0J
            r1 = r0[r4]
            r0 = r0[r3]
            float r1 = r1 - r0
            r9.A01 = r1
        L_0x0046:
            android.view.animation.Interpolator r0 = r9.A0A
            float r1 = r0.getInterpolation(r2)
            float[] r0 = r9.A0J
            r3 = r0[r3]
            float r0 = r9.A01
            float r1 = r1 * r0
            float r3 = r3 + r1
        L_0x0054:
            r9.A00 = r3
            java.util.ArrayList r0 = r9.A0C
            if (r0 == 0) goto L_0x00e5
            r2 = 0
            int r1 = r0.size()
        L_0x005f:
            if (r2 >= r1) goto L_0x00e5
            java.util.ArrayList r0 = r9.A0C
            java.lang.Object r0 = r0.get(r2)
            X.7eR r0 = (X.AnonymousClass7eR) r0
            r0.BRA(r9)
            int r2 = r2 + 1
            goto L_0x005f
        L_0x006f:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            android.view.animation.Interpolator r0 = r9.A0A
            float r2 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            r1 = r0[r3]
            float r2 = r2 - r1
            r0 = r0[r4]
            float r0 = r0 - r1
            float r2 = r2 / r0
            float[] r0 = r9.A0J
            r3 = r0[r3]
            r0 = r0[r4]
            float r0 = r0 - r3
            float r2 = r2 * r0
            float r3 = r3 + r2
            goto L_0x0054
        L_0x008d:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b3
            android.view.animation.Interpolator r0 = r9.A0A
            float r5 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            int r4 = r9.A03
            int r3 = r4 + -2
            r2 = r0[r3]
            float r5 = r5 - r2
            int r1 = r4 + -1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r5 = r5 / r0
            float[] r0 = r9.A0J
            r3 = r0[r3]
            r1 = r0[r1]
            int r4 = r4 - r7
            r0 = r0[r4]
            float r1 = r1 - r0
            float r5 = r5 * r1
            float r3 = r3 + r5
            goto L_0x0054
        L_0x00b3:
            float[] r0 = r9.A0J
            int r1 = r1 - r4
            r3 = r0[r1]
            goto L_0x0054
        L_0x00b9:
            java.util.ArrayList r6 = r9.A0B
            if (r6 == 0) goto L_0x00ca
            int r1 = r6.size()
            r0 = 0
        L_0x00c2:
            if (r0 >= r1) goto L_0x00ca
            r6.get(r0)
            int r0 = r0 + 1
            goto L_0x00c2
        L_0x00ca:
            int r0 = (int) r2
            int r7 = r7 + r0
            r9.A02 = r7
            float r2 = r2 % r5
            long r0 = r9.A09
            long r0 = r0 + r3
            r9.A09 = r0
        L_0x00d4:
            r6 = 0
            goto L_0x0030
        L_0x00d7:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x00db:
            long r0 = r10 - r2
            r9.A09 = r0
            r0 = -1
            r9.A08 = r0
            goto L_0x0011
        L_0x00e5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WW.A02(X.6WW, long):boolean");
    }

    public void A03() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0P.contains(this) || A0N.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C139266jV r2 = (C139266jV) this.A0B.get(i);
                    if (this == r2.A0I) {
                        r2.A0I = null;
                    } else if (this == r2.A0J) {
                        r2.A0J = null;
                    } else if (this == r2.A0K) {
                        r2.A0K = null;
                    } else if (this == r2.A0H) {
                        r2.A0H = null;
                    }
                    A04();
                    if (r2.A0I == null && r2.A0J == null && r2.A0K == null && r2.A0H == null) {
                        r2.A0L = false;
                        C158997ia r0 = r2.A08;
                        if (r0 != null) {
                            r2.A08 = null;
                            r0.BT0();
                        }
                        r2.A04();
                    }
                }
            }
            A01(this);
        }
    }

    public void A04() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0;
        this.A08 = -1;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300;
        this.A05 = 0;
        this.A0A = A0R;
        this.A00 = 0.0f;
        this.A0D = true;
        A0S.A02(this);
    }

    public void A06(long j) {
        if (j >= 0) {
            this.A07 = j;
            return;
        }
        throw AnonymousClass001.A08(C36381kD.A0z("Animators cannot have negative duration: ", AnonymousClass000.A0u(), j));
    }

    public void A07(C139266jV r2) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            this.A0B = arrayList;
        }
        arrayList.add(r2);
    }

    public void A08(AnonymousClass7eR r2) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0I();
            this.A0C = arrayList;
        }
        arrayList.add(r2);
    }

    public void A05() {
        long j;
        C91594cI r0;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0P.add(this);
            if (!this.A0E || this.A04 == 0) {
                j = 0;
            } else {
                j = AnimationUtils.currentAnimationTimeMillis() - this.A09;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = j;
                int i = 0;
                if (this.A0E) {
                    i = 2;
                }
                this.A04 = i;
            }
            this.A09 = currentAnimationTimeMillis - j;
            this.A0E = true;
            A02(this, currentAnimationTimeMillis);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2);
                }
            }
            synchronized (A0L) {
                r0 = A0K;
                if (r0 == null) {
                    r0 = new C91594cI();
                    A0K = r0;
                }
            }
            r0.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }
}
