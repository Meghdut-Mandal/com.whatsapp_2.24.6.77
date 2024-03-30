package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.6gE  reason: invalid class name and case insensitive filesystem */
public final class C137496gE implements C161927nh {
    public C158827iI A00;
    public C158827iI A01;
    public final C128306Bs A02 = new C128306Bs();
    public final AnonymousClass7bT A03 = new C137486gD(this);

    private final C158827iI A00(C125185zS r9, C114365h6 r10, C109085Wf r11, float f, int i) {
        ColorFilter colorFilter;
        C158827iI A022 = A02(r11);
        if (r9 != null) {
            r9.A00(A022, f, BHc());
        } else {
            C137416g6 r2 = (C137416g6) A022;
            if (r2.A02 != null) {
                r2.A02 = null;
                r2.A01.setShader((Shader) null);
            }
            Paint paint = r2.A01;
            long j = C133336Xx.A01;
            if ((((long) paint.getColor()) << 32) != j) {
                A022.BqV(j);
            }
            if (((float) paint.getAlpha()) / 255.0f != f) {
                A022.Bq5(f);
            }
        }
        C137416g6 r22 = (C137416g6) A022;
        if (!AnonymousClass00C.A0J(r22.A03, r10)) {
            r22.A03 = r10;
            Paint paint2 = r22.A01;
            if (r10 != null) {
                colorFilter = r10.A00;
            } else {
                colorFilter = null;
            }
            paint2.setColorFilter(colorFilter);
        }
        int i2 = r22.A00;
        if (!(i2 == 3 || i2 == 3)) {
            r22.A00 = 3;
            AnonymousClass5WY.A00(3, r22.A01);
        }
        Paint paint3 = r22.A01;
        if (C90504aG.A1T(paint3.isFilterBitmap() ? 1 : 0) != i) {
            boolean z = false;
            if (i == 0) {
                z = true;
            }
            paint3.setFilterBitmap(!z);
        }
        return A022;
    }

    public static final C158827iI A01(C137496gE r7, C109085Wf r8, int i, long j) {
        C158827iI A022 = r7.A02(r8);
        C137416g6 r72 = (C137416g6) A022;
        Paint paint = r72.A01;
        long j2 = C133336Xx.A01;
        if ((((long) paint.getColor()) << 32) != j) {
            A022.BqV(j);
        }
        if (r72.A02 != null) {
            r72.A02 = null;
            paint.setShader((Shader) null);
        }
        if (!AnonymousClass00C.A0J(r72.A03, (Object) null)) {
            r72.A03 = null;
            paint.setColorFilter((ColorFilter) null);
        }
        int i2 = r72.A00;
        if (!(i2 == i || i2 == i)) {
            r72.A00 = i;
            AnonymousClass5WY.A00(i, paint);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        return A022;
    }

    public void B60(C114365h6 r15, C109085Wf r16, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        long j4 = j2;
        long j5 = j3;
        float A032 = C90504aG.A03(j4, j5);
        this.A02.A01.B5z(A01(this, r16, 3, j), C133206Xf.A00(j4), C133206Xf.A01(j4), C133206Xf.A00(j4) + AnonymousClass6X0.A01(j5), A032, f, f2, false);
    }

    public void B62(C114365h6 r4, C109085Wf r5, float f, float f2, int i, long j, long j2) {
        this.A02.A01.B61(A01(this, r5, 3, j), f, j2);
    }

    public void B65(C114365h6 r12, C23085B3v b3v, C109085Wf r14, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A02.A01.B66(b3v, A00((C125185zS) null, r12, r14, f, i2), j, j2, j3, j4);
    }

    public void B6B(C125185zS r9, C114365h6 r10, C161177mK r11, C109085Wf r12, float f, int i) {
        this.A02.A01.B6A(A00(r9, (C114365h6) null, r12, f, 1), r11);
    }

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvh(long j) {
        return AnonymousClass6GH.A00(this, j);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (r1 != 3) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C158827iI A02(X.C109085Wf r6) {
        /*
            r5 = this;
            X.4iU r0 = X.C94604iU.A00
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x0019
            X.7iI r3 = r5.A00
            if (r3 != 0) goto L_0x0018
            X.6g6 r3 = new X.6g6
            r3.<init>()
            android.graphics.Paint r0 = r3.A01
            X.C36431kI.A1L(r0)
            r5.A00 = r3
        L_0x0018:
            return r3
        L_0x0019:
            boolean r0 = r6 instanceof X.C94594iT
            if (r0 == 0) goto L_0x00a8
            X.7iI r3 = r5.A01
            if (r3 != 0) goto L_0x002d
            X.6g6 r3 = new X.6g6
            r3.<init>()
            android.graphics.Paint r0 = r3.A01
            X.C36421kH.A0q(r0)
            r5.A01 = r3
        L_0x002d:
            r0 = r3
            X.6g6 r0 = (X.C137416g6) r0
            android.graphics.Paint r2 = r0.A01
            float r0 = r2.getStrokeWidth()
            X.4iT r6 = (X.C94594iT) r6
            float r1 = r6.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            r2.setStrokeWidth(r1)
        L_0x0041:
            android.graphics.Paint$Cap r1 = r2.getStrokeCap()
            if (r1 == 0) goto L_0x0058
            int[] r0 = X.C113545fi.A00
            int r1 = X.C90524aI.A03(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0058
            r0 = 2
            r4 = 1
            if (r1 == r0) goto L_0x0059
            r0 = 3
            r4 = 2
            if (r1 == r0) goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            int r1 = r6.A02
            if (r4 == r1) goto L_0x0065
            r0 = 2
            if (r1 != r0) goto L_0x009f
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x0062:
            r2.setStrokeCap(r0)
        L_0x0065:
            float r0 = r2.getStrokeMiter()
            float r1 = r6.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            r2.setStrokeMiter(r1)
        L_0x0072:
            android.graphics.Paint$Join r1 = r2.getStrokeJoin()
            if (r1 == 0) goto L_0x0088
            int[] r0 = X.C113545fi.A01
            int r1 = X.C90524aI.A03(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0088
            r4 = 2
            if (r1 == r4) goto L_0x0089
            r0 = 3
            r4 = 1
            if (r1 == r0) goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            int r1 = r6.A03
            if (r4 == r1) goto L_0x0018
            r0 = 0
            if (r1 != r0) goto L_0x0096
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L_0x0092:
            r2.setStrokeJoin(r0)
            return r3
        L_0x0096:
            r0 = 2
            if (r1 != r0) goto L_0x009c
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L_0x0092
        L_0x009c:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0092
        L_0x009f:
            r0 = 1
            if (r1 != r0) goto L_0x00a5
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x0062
        L_0x00a5:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x0062
        L_0x00a8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137496gE.A02(X.5Wf):X.7iI");
    }

    public void B6C(C114365h6 r3, C161177mK r4, C109085Wf r5, float f, int i, long j) {
        this.A02.A01.B6A(A01(this, r5, 3, j), r4);
    }

    public void B6E(C114365h6 r12, C109085Wf r13, float f, int i, long j, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        float A032 = C90504aG.A03(j4, j5);
        this.A02.A01.B6D(A01(this, r13, i, j), C133206Xf.A00(j4), C133206Xf.A01(j4), C133206Xf.A00(j4) + AnonymousClass6X0.A01(j5), A032);
    }

    public void B6G(C114365h6 r14, C109085Wf r15, float f, int i, long j, long j2, long j3, long j4) {
        long j5 = j2;
        long j6 = j3;
        float A032 = C90504aG.A03(j5, j6);
        long j7 = AnonymousClass6RD.A00;
        float A012 = C90464aC.A01(j4);
        float A002 = C90464aC.A00(j4);
        this.A02.A01.B6F(A01(this, r15, 3, j), C133206Xf.A00(j5), C133206Xf.A01(j5), C133206Xf.A00(j5) + AnonymousClass6X0.A01(j6), A032, A012, A002);
    }

    public /* synthetic */ long B9U() {
        long j = ((C137486gD) this.A03).A01.A02.A00;
        return AnonymousClass5WS.A01(AnonymousClass6X0.A01(j), j);
    }

    public float BAy() {
        return this.A02.A02.BAy();
    }

    public float BC0() {
        return this.A02.A02.BC0();
    }

    public /* synthetic */ long BHc() {
        return ((C137486gD) this.A03).A01.A02.A00;
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A02.A03;
    }

    public AnonymousClass7bT BBD() {
        return this.A03;
    }

    public /* synthetic */ float Bvi(float f) {
        return f / BAy();
    }

    public /* synthetic */ float Bvq(float f) {
        return f * BAy();
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6GH.A01(this, f / BAy());
    }
}
