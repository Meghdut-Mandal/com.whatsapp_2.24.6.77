package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6eG  reason: invalid class name and case insensitive filesystem */
public final class C136366eG implements C161417ms {
    public final float A00;
    public final AnonymousClass62M A01;

    public float BBa(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0178 A[EDGE_INSN: B:91:0x0178->B:52:0x0178 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BBI(float r26, float r27, float r28) {
        /*
            r25 = this;
            r3 = r25
            X.62M r0 = r3.A01
            double r0 = r0.A00
            double r0 = r0 * r0
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r26 - r27
            float r0 = r3.A00
            float r5 = r5 / r0
            float r4 = r28 / r0
            double r6 = (double) r2
            double r10 = (double) r1
            double r0 = (double) r4
            double r14 = (double) r5
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r10
            double r2 = java.lang.Math.sqrt(r6)
            double r4 = r4 * r2
            double r8 = r4 * r4
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 * r6
            double r8 = r8 - r2
            double r12 = -r4
            r4 = 0
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0241
            double r2 = java.lang.Math.abs(r8)
            double r2 = java.lang.Math.sqrt(r2)
            X.69A r6 = new X.69A
            r6.<init>(r4, r2)
        L_0x0037:
            double r2 = r6.A01
            double r2 = r2 + r12
            r6.A01 = r2
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r16
            r6.A01 = r2
            double r2 = r6.A00
            double r2 = r2 * r16
            r6.A00 = r2
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0236
            double r2 = java.lang.Math.abs(r8)
            double r2 = java.lang.Math.sqrt(r2)
            X.69A r7 = new X.69A
            r7.<init>(r4, r2)
        L_0x0059:
            double r8 = r7.A01
            r2 = -1
            double r2 = (double) r2
            double r8 = r8 * r2
            double r8 = r8 + r12
            double r8 = r8 * r16
            r3 = 0
            int r2 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0072
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0075
            r4 = 0
        L_0x006d:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r0
            return r4
        L_0x0072:
            if (r2 >= 0) goto L_0x0075
            double r0 = -r0
        L_0x0075:
            double r21 = java.lang.Math.abs(r14)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x015d
            double r6 = r6.A01
            double r4 = r6 * r21
            double r4 = r4 - r0
            double r18 = r6 - r8
            double r4 = r4 / r18
            double r21 = r21 - r4
            double r0 = r10 / r21
            double r0 = java.lang.Math.abs(r0)
            double r2 = java.lang.Math.log(r0)
            double r2 = r2 / r6
            double r0 = r10 / r4
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r8
            boolean r12 = java.lang.Double.isInfinite(r2)
            if (r12 != 0) goto L_0x015a
            boolean r12 = java.lang.Double.isNaN(r2)
            if (r12 != 0) goto L_0x015a
            boolean r12 = java.lang.Double.isInfinite(r0)
            if (r12 != 0) goto L_0x00bc
            boolean r12 = java.lang.Double.isNaN(r0)
            if (r12 != 0) goto L_0x00bc
            double r2 = java.lang.Math.max(r2, r0)
        L_0x00bc:
            double r23 = r21 * r6
            double r0 = -r4
            double r0 = r0 * r8
            double r12 = r23 / r0
            double r14 = java.lang.Math.log(r12)
            double r0 = r8 - r6
            double r14 = r14 / r0
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 != 0) goto L_0x00f9
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
            double r0 = r6 * r14
            double r12 = java.lang.Math.exp(r0)
            double r0 = r21 * r12
            double r12 = r8 * r14
            double r14 = java.lang.Math.exp(r12)
            double r12 = r4 * r14
            double r0 = r0 + r12
            double r12 = -r0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x014c
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            r2 = 0
        L_0x00f9:
            double r10 = -r10
        L_0x00fa:
            double r0 = r6 * r2
            double r12 = java.lang.Math.exp(r0)
            double r12 = r12 * r23
            double r19 = r4 * r8
            double r0 = r8 * r2
            double r0 = java.lang.Math.exp(r0)
            double r0 = r0 * r19
            double r12 = r12 + r0
            double r14 = java.lang.Math.abs(r12)
            r12 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0178
            r12 = 0
        L_0x011b:
            int r12 = r12 + 1
            double r0 = r6 * r2
            double r17 = java.lang.Math.exp(r0)
            double r15 = r17 * r21
            double r0 = r8 * r2
            double r13 = java.lang.Math.exp(r0)
            double r0 = r13 * r4
            double r15 = r15 + r0
            double r15 = r15 + r10
            double r17 = r17 * r23
            double r13 = r13 * r19
            double r17 = r17 + r13
            double r15 = r15 / r17
            double r0 = r2 - r15
            double r15 = X.C90504aG.A00(r2, r0)
            r2 = r0
            r13 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0178
            r0 = 100
            if (r12 >= r0) goto L_0x0178
            goto L_0x011b
        L_0x014c:
            double r0 = r4 * r8
            double r0 = r0 * r8
            double r2 = -r0
            double r0 = r23 * r6
            double r2 = r2 / r0
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r18
            goto L_0x00fa
        L_0x015a:
            r2 = r0
            goto L_0x00bc
        L_0x015d:
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0181
            double r4 = r6.A01
            double r2 = r4 * r21
            double r0 = r0 - r2
            double r2 = r6.A00
            double r0 = r0 / r2
            double r21 = r21 * r21
            double r0 = r0 * r0
            double r21 = r21 + r0
            double r0 = java.lang.Math.sqrt(r21)
            double r10 = r10 / r0
            double r2 = java.lang.Math.log(r10)
            double r2 = r2 / r4
        L_0x0178:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x006d
        L_0x0181:
            double r6 = r6.A01
            double r19 = r6 * r21
            double r0 = r0 - r19
            double r2 = r10 / r21
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r6
            double r4 = r10 / r0
            double r4 = java.lang.Math.abs(r4)
            double r13 = java.lang.Math.log(r4)
            r4 = r13
            r12 = 0
        L_0x019e:
            double r4 = r4 / r6
            double r4 = java.lang.Math.abs(r4)
            double r8 = java.lang.Math.log(r4)
            double r4 = r13 - r8
            int r12 = r12 + 1
            r8 = 6
            if (r12 < r8) goto L_0x019e
            double r4 = r4 / r6
            boolean r8 = java.lang.Double.isInfinite(r2)
            r12 = 1
            if (r8 != 0) goto L_0x0234
            boolean r8 = java.lang.Double.isNaN(r2)
            if (r8 != 0) goto L_0x0234
            boolean r8 = java.lang.Double.isInfinite(r4)
            if (r8 != 0) goto L_0x01cc
            boolean r8 = java.lang.Double.isNaN(r4)
            if (r8 != 0) goto L_0x01cc
            double r2 = java.lang.Math.max(r2, r4)
        L_0x01cc:
            double r8 = r19 + r0
            double r4 = -r8
            double r8 = r6 * r0
            double r4 = r4 / r8
            double r8 = r6 * r4
            double r15 = java.lang.Math.exp(r8)
            double r8 = r15 * r21
            double r13 = r0 * r4
            double r13 = r13 * r15
            double r8 = r8 + r13
            boolean r13 = java.lang.Double.isNaN(r4)
            if (r13 != 0) goto L_0x01fd
            r14 = 0
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x01fd
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x022c
            double r4 = -r8
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x022c
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01fd
            int r4 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x01fd
            r2 = 0
        L_0x01fd:
            double r10 = -r10
        L_0x01fe:
            r8 = 0
        L_0x01ff:
            int r8 = r8 + 1
            double r4 = r0 * r2
            double r17 = r21 + r4
            double r15 = r6 * r2
            double r13 = java.lang.Math.exp(r15)
            double r17 = r17 * r13
            double r17 = r17 + r10
            double r4 = (double) r12
            double r4 = r4 + r15
            double r4 = r4 * r0
            double r4 = r4 + r19
            double r4 = r4 * r13
            double r17 = r17 / r4
            double r4 = r2 - r17
            double r15 = X.C90504aG.A00(r2, r4)
            r2 = r4
            r13 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0178
            r4 = 100
            if (r8 >= r4) goto L_0x0178
            goto L_0x01ff
        L_0x022c:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            double r2 = -r4
            double r4 = r21 / r0
            double r2 = r2 - r4
            goto L_0x01fe
        L_0x0234:
            r2 = r4
            goto L_0x01cc
        L_0x0236:
            double r2 = java.lang.Math.sqrt(r8)
            X.69A r7 = new X.69A
            r7.<init>(r2, r4)
            goto L_0x0059
        L_0x0241:
            double r2 = java.lang.Math.sqrt(r8)
            X.69A r6 = new X.69A
            r6.<init>(r2, r4)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136366eG.BBI(float, float, float):long");
    }

    public /* bridge */ /* synthetic */ C160547lB BxH(C156857b4 r3) {
        return new C136416eM(new C163147pj((C161417ms) this));
    }

    public C136366eG(float f, float f2) {
        this.A00 = f2;
        AnonymousClass62M r4 = new AnonymousClass62M();
        r4.A02 = false;
        double d = r4.A00;
        if (((float) (d * d)) > 0.0f) {
            r4.A00 = Math.sqrt((double) f);
            r4.A02 = false;
            this.A01 = r4;
            return;
        }
        throw AnonymousClass001.A08("Spring stiffness constant must be positive.");
    }

    public float BIq(float f, float f2, float f3, long j) {
        long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
        AnonymousClass62M r0 = this.A01;
        r0.A01 = f2;
        return C90464aC.A01(r0.A00(f, f3, j2));
    }

    public float BIu(float f, float f2, float f3, long j) {
        long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
        AnonymousClass62M r0 = this.A01;
        r0.A01 = f2;
        return C90464aC.A00(r0.A00(f, f3, j2));
    }

    public C136366eG() {
        this(1500.0f, 0.01f);
    }
}
