package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5TL;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C90524aI;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$process$1", f = "UTwoNetViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$process$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $maxDimension;
    public final /* synthetic */ int $minDimension;
    public final /* synthetic */ AnonymousClass5TL $predictionSize;
    public final /* synthetic */ List $types;
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$process$1$1", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.media.utwonet.UTwoNetViewModel$process$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public static final Bitmap A01(int[] iArr, int i, int i2) {
            int[] iArr2 = iArr;
            int i3 = i;
            if (iArr.length == i * i2) {
                Bitmap A09 = C90524aI.A09(i, i2);
                AnonymousClass00C.A08(A09);
                A09.setPixels(iArr2, 0, i3, 0, 0, i, i2);
                return A09;
            }
            throw AnonymousClass001.A09("Check failed.");
        }

        public static final double[] A02(double d) {
            double d2 = d * d;
            double d3 = d2 * d;
            double d4 = d * 0.5d;
            return new double[]{(((-0.5d * d3) + d2) - d4) * 1.0d, (((1.5d * d3) - (2.5d * d2)) + 1.0d) * 1.0d, ((-1.5d * d3) + (2.0d * d2) + d4) * 1.0d, ((d3 * 0.5d) - (d2 * 0.5d)) * 1.0d};
        }

        public final C023509x create(Object obj, C023509x r10) {
            UTwoNetViewModel uTwoNetViewModel = uTwoNetViewModel;
            Uri uri = uri;
            int i = i2;
            int i2 = i3;
            return new AnonymousClass1(uri, uTwoNetViewModel, r6, list, r10, i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:135:0x039b, code lost:
            if (r14[(r12 * r3) + r0] < r6[r11 + 1][r1 + 1]) goto L_0x039d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                r45 = this;
                r1 = r45
                int r0 = r1.label
                if (r0 != 0) goto L_0x053b
                X.AnonymousClass0AN.A00(r46)
                com.whatsapp.media.utwonet.UTwoNetViewModel r0 = r5
                r44 = r0
                X.5r5 r3 = r0.A00
                if (r3 == 0) goto L_0x0538
                android.net.Uri r5 = r4
                int r6 = r9
                int r7 = r10
                java.util.List r0 = r7
                r38 = r0
                X.5TL r14 = r6
                r0 = r44
                X.1Ax r4 = r0.A02     // Catch:{ Exception -> 0x0532 }
                r8 = 1
                r9 = 1
                android.graphics.Bitmap r19 = r4.A05(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0532 }
                r19.getWidth()     // Catch:{ Exception -> 0x0532 }
                r19.getHeight()     // Catch:{ Exception -> 0x0532 }
                X.4pm r1 = new X.4pm     // Catch:{ Exception -> 0x0532 }
                r0 = r19
                r1.<init>(r0)     // Catch:{ Exception -> 0x0532 }
                java.util.List r2 = X.C36371kC.A11(r1)     // Catch:{ Exception -> 0x0532 }
                r0 = r38
                X.AnonymousClass00C.A0D(r0, r8)     // Catch:{ Exception -> 0x0532 }
                boolean r1 = X.C90514aH.A1Y(r14)     // Catch:{ Exception -> 0x0532 }
                com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r5 = r3.A00     // Catch:{ Exception -> 0x0532 }
                java.lang.String r4 = "UTwoNet"
                boolean r0 = r5.modelLoaded(r4)     // Catch:{ Exception -> 0x0532 }
                if (r0 != 0) goto L_0x007d
                java.lang.String r1 = "U2Net is not ready"
                X.6GO r0 = new X.6GO     // Catch:{ Exception -> 0x0532 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0532 }
                X.4pp r1 = new X.4pp     // Catch:{ Exception -> 0x0532 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0532 }
            L_0x0057:
                boolean r0 = r1 instanceof X.C97534pq     // Catch:{ Exception -> 0x0532 }
                if (r0 == 0) goto L_0x050e
                X.4pq r1 = (X.C97534pq) r1     // Catch:{ Exception -> 0x0532 }
                java.util.List r0 = r1.A00     // Catch:{ Exception -> 0x0532 }
                java.lang.Class<X.4pn> r4 = X.C97504pn.class
                java.util.ArrayList r3 = X.C36341k9.A0l(r0)     // Catch:{ Exception -> 0x0532 }
                java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0532 }
            L_0x0069:
                boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0532 }
                if (r0 == 0) goto L_0x04f4
                java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0532 }
                boolean r0 = r4.isInstance(r1)     // Catch:{ Exception -> 0x0532 }
                if (r0 == 0) goto L_0x0069
                r3.add(r1)     // Catch:{ Exception -> 0x0532 }
                goto L_0x0069
            L_0x007d:
                java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x0532 }
                java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputBitmap"
                X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ Exception -> 0x0532 }
                X.4pm r1 = (X.C97494pm) r1     // Catch:{ Exception -> 0x0532 }
                android.graphics.Bitmap r0 = r1.A00     // Catch:{ Exception -> 0x0532 }
                r43 = r0
                int r3 = r43.getWidth()     // Catch:{ Exception -> 0x0532 }
                int r2 = r43.getHeight()     // Catch:{ Exception -> 0x0532 }
                int r1 = r14.value     // Catch:{ Exception -> 0x0532 }
                android.graphics.Bitmap r29 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r1, r8)     // Catch:{ Exception -> 0x0532 }
                X.AnonymousClass00C.A08(r29)     // Catch:{ Exception -> 0x0532 }
                r11 = 0
                int r7 = r29.getWidth()     // Catch:{ Exception -> 0x04dd }
                int r9 = r29.getHeight()     // Catch:{ Exception -> 0x04dd }
                int r8 = r9 * r7
                int[] r15 = new int[r8]     // Catch:{ Exception -> 0x04dd }
                r1 = 0
                r37 = 0
                r31 = 0
                r33 = 0
                r34 = 0
                r35 = r7
                r30 = r15
                r32 = r7
                r36 = r9
                r29.getPixels(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x04dd }
                int r22 = r8 * 2
                int r0 = r7 * 3
                int r0 = r0 * r9
                r13 = 4
                int r0 = r0 * 4
                java.nio.ByteBuffer r0 = X.C90474aD.A0l(r0)     // Catch:{ Exception -> 0x04dd }
                java.nio.FloatBuffer r6 = r0.asFloatBuffer()     // Catch:{ Exception -> 0x04dd }
            L_0x00ce:
                r21 = 1
                r20 = 2
                if (r1 >= r8) goto L_0x0115
                r10 = r15[r1]     // Catch:{ Exception -> 0x04dd }
                int r0 = r10 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                float r0 = (float) r0     // Catch:{ Exception -> 0x04dd }
                r16 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r16
                int r12 = r10 >> 8
                r12 = r12 & 255(0xff, float:3.57E-43)
                float r12 = (float) r12     // Catch:{ Exception -> 0x04dd }
                float r12 = r12 / r16
                r10 = r10 & 255(0xff, float:3.57E-43)
                float r10 = (float) r10     // Catch:{ Exception -> 0x04dd }
                float r10 = r10 / r16
                float[] r18 = X.C113765g5.A00     // Catch:{ Exception -> 0x04dd }
                r16 = r18[r11]     // Catch:{ Exception -> 0x04dd }
                float r0 = r0 - r16
                float[] r17 = X.C113765g5.A01     // Catch:{ Exception -> 0x04dd }
                r16 = r17[r11]     // Catch:{ Exception -> 0x04dd }
                float r0 = r0 / r16
                r6.put(r1, r0)     // Catch:{ Exception -> 0x04dd }
                int r0 = r8 + r1
                r16 = r18[r21]     // Catch:{ Exception -> 0x04dd }
                float r12 = r12 - r16
                r16 = r17[r21]     // Catch:{ Exception -> 0x04dd }
                float r12 = r12 / r16
                r6.put(r0, r12)     // Catch:{ Exception -> 0x04dd }
                int r0 = r22 + r1
                r12 = r18[r20]     // Catch:{ Exception -> 0x04dd }
                float r10 = r10 - r12
                r12 = r17[r20]     // Catch:{ Exception -> 0x04dd }
                float r10 = r10 / r12
                r6.put(r0, r10)     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 + 1
                goto L_0x00ce
            L_0x0115:
                X.AnonymousClass00C.A0B(r6)     // Catch:{ Exception -> 0x04dd }
                long[] r8 = new long[r13]     // Catch:{ Exception -> 0x04dd }
                r0 = 1
                r8[r11] = r0     // Catch:{ Exception -> 0x04dd }
                r0 = 3
                r8[r21] = r0     // Catch:{ Exception -> 0x04dd }
                long r0 = (long) r9     // Catch:{ Exception -> 0x04dd }
                r8[r20] = r0     // Catch:{ Exception -> 0x04dd }
                long r0 = (long) r7     // Catch:{ Exception -> 0x04dd }
                r7 = 3
                r8[r7] = r0     // Catch:{ Exception -> 0x04dd }
                X.5r4 r0 = new X.5r4     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r6, r8)     // Catch:{ Exception -> 0x04dd }
                java.nio.FloatBuffer r1 = r0.A00     // Catch:{ Exception -> 0x04dd }
                long[] r0 = r0.A01     // Catch:{ Exception -> 0x04dd }
                float[] r28 = r5.runModel(r4, r1, r0)     // Catch:{ Exception -> 0x04dd }
                if (r28 != 0) goto L_0x0146
                java.lang.String r1 = "Invalid outputFloatArray"
                X.6GO r0 = new X.6GO     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r1)     // Catch:{ Exception -> 0x04dd }
                X.4pp r1 = new X.4pp     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0057
            L_0x0146:
                int r15 = r14.value     // Catch:{ Exception -> 0x04dd }
                double r7 = (double) r15     // Catch:{ Exception -> 0x04dd }
                double r0 = (double) r3     // Catch:{ Exception -> 0x04dd }
                double r26 = r7 / r0
                double r0 = (double) r2     // Catch:{ Exception -> 0x04dd }
                double r7 = r7 / r0
                int r25 = r3 * r2
                r0 = r25
                float[] r6 = new float[r0]     // Catch:{ Exception -> 0x04dd }
                r10 = 0
            L_0x0155:
                if (r10 >= r2) goto L_0x01b3
                r9 = 0
            L_0x0158:
                if (r9 >= r3) goto L_0x01b0
                double r4 = (double) r9     // Catch:{ Exception -> 0x04dd }
                double r4 = r4 * r26
                double r0 = (double) r10     // Catch:{ Exception -> 0x04dd }
                double r0 = r0 * r7
                int r12 = (int) r4     // Catch:{ Exception -> 0x04dd }
                r24 = r12
                int r12 = (int) r0     // Catch:{ Exception -> 0x04dd }
                r23 = r12
                r12 = r24
                double r12 = (double) r12     // Catch:{ Exception -> 0x04dd }
                double r4 = r4 - r12
                r12 = r23
                double r12 = (double) r12     // Catch:{ Exception -> 0x04dd }
                double r0 = r0 - r12
                double[] r22 = A02(r4)     // Catch:{ Exception -> 0x04dd }
                double[] r18 = A02(r0)     // Catch:{ Exception -> 0x04dd }
                r4 = 0
                r13 = 0
            L_0x0178:
                r12 = 0
            L_0x0179:
                int r1 = r24 + -1
                int r1 = r1 + r13
                int r14 = r15 + -1
                if (r1 >= r11) goto L_0x01a3
                r1 = 0
            L_0x0181:
                int r0 = r23 + -1
                int r0 = r0 + r12
                if (r0 >= r11) goto L_0x0188
                r0 = 0
                goto L_0x018b
            L_0x0188:
                if (r0 <= r14) goto L_0x018b
                r0 = r14
            L_0x018b:
                r20 = r22[r13]     // Catch:{ Exception -> 0x04dd }
                r16 = r18[r12]     // Catch:{ Exception -> 0x04dd }
                double r20 = r20 * r16
                int r0 = r0 * r15
                int r0 = r0 + r1
                r0 = r28[r0]     // Catch:{ Exception -> 0x04dd }
                double r0 = (double) r0     // Catch:{ Exception -> 0x04dd }
                double r0 = r0 * r20
                double r4 = r4 + r0
                int r12 = r12 + 1
                r0 = 4
                if (r12 < r0) goto L_0x0179
                int r13 = r13 + 1
                if (r13 < r0) goto L_0x0178
                goto L_0x01a7
            L_0x01a3:
                if (r1 <= r14) goto L_0x0181
                r1 = r14
                goto L_0x0181
            L_0x01a7:
                int r1 = r10 * r3
                int r1 = r1 + r9
                float r0 = (float) r4     // Catch:{ Exception -> 0x04dd }
                r6[r1] = r0     // Catch:{ Exception -> 0x04dd }
                int r9 = r9 + 1
                goto L_0x0158
            L_0x01b0:
                int r10 = r10 + 1
                goto L_0x0155
            L_0x01b3:
                r8 = 1
                if (r25 == 0) goto L_0x04cf
                r5 = r6[r11]     // Catch:{ Exception -> 0x04dd }
                int r1 = r25 + -1
                X.0mZ r0 = new X.0mZ     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r8, r1)     // Catch:{ Exception -> 0x04dd }
                X.0k7 r4 = r0.iterator()     // Catch:{ Exception -> 0x04dd }
            L_0x01c3:
                boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x01d4
                int r0 = r4.A00()     // Catch:{ Exception -> 0x04dd }
                r0 = r6[r0]     // Catch:{ Exception -> 0x04dd }
                float r5 = java.lang.Math.max(r5, r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x01c3
            L_0x01d4:
                java.lang.Float r0 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x04dd }
                r5 = 0
                if (r0 == 0) goto L_0x04cf
                float r7 = r0.floatValue()     // Catch:{ Exception -> 0x04dd }
                r4 = r6[r11]     // Catch:{ Exception -> 0x04dd }
                X.0mZ r0 = new X.0mZ     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r8, r1)     // Catch:{ Exception -> 0x04dd }
                X.0k7 r1 = r0.iterator()     // Catch:{ Exception -> 0x04dd }
            L_0x01ea:
                boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x01fb
                int r0 = r1.A00()     // Catch:{ Exception -> 0x04dd }
                r0 = r6[r0]     // Catch:{ Exception -> 0x04dd }
                float r4 = java.lang.Math.min(r4, r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x01ea
            L_0x01fb:
                java.lang.Float r0 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x04cf
                float r4 = r0.floatValue()     // Catch:{ Exception -> 0x04dd }
            L_0x0205:
                r1 = r6[r5]     // Catch:{ Exception -> 0x04dd }
                float r1 = r1 - r4
                float r0 = r7 - r4
                float r1 = r1 / r0
                r6[r5] = r1     // Catch:{ Exception -> 0x04dd }
                r0 = 1056964608(0x3f000000, float:0.5)
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                r0 = 0
                if (r1 <= 0) goto L_0x0216
                r0 = 1065353216(0x3f800000, float:1.0)
            L_0x0216:
                r6[r5] = r0     // Catch:{ Exception -> 0x04dd }
                int r5 = r5 + 1
                r0 = r25
                if (r5 < r0) goto L_0x0205
                java.util.ArrayList r21 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x04dd }
                java.util.Iterator r20 = r38.iterator()     // Catch:{ Exception -> 0x04dd }
            L_0x0226:
                boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x04c6
                java.lang.String r9 = X.AnonymousClass001.A0C(r20)     // Catch:{ Exception -> 0x04dd }
                int r0 = r9.hashCode()     // Catch:{ Exception -> 0x04dd }
                switch(r0) {
                    case -1630362878: goto L_0x02f1;
                    case -379005363: goto L_0x0293;
                    case -222102746: goto L_0x0284;
                    case 1725137378: goto L_0x0245;
                    default: goto L_0x0237;
                }     // Catch:{ Exception -> 0x04dd }
            L_0x0237:
                java.lang.String r1 = "Unsupported type"
                X.6GO r0 = new X.6GO     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r1)     // Catch:{ Exception -> 0x04dd }
                X.4pp r1 = new X.4pp     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0057
            L_0x0245:
                java.lang.String r0 = "MASK_BITMAP"
                boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x0237
                int r10 = r29.getWidth()     // Catch:{ Exception -> 0x04dd }
                int r8 = r29.getHeight()     // Catch:{ Exception -> 0x04dd }
                int r0 = r10 * r8
                int[] r7 = new int[r0]     // Catch:{ Exception -> 0x04dd }
                r11 = 0
            L_0x025a:
                if (r11 >= r8) goto L_0x0274
                r5 = 0
            L_0x025d:
                if (r5 >= r10) goto L_0x0271
                int r4 = r11 * r10
                int r4 = r4 + r5
                r1 = r6[r4]     // Catch:{ Exception -> 0x04dd }
                r0 = 1132396544(0x437f0000, float:255.0)
                float r1 = r1 * r0
                int r0 = (int) r1     // Catch:{ Exception -> 0x04dd }
                int r0 = android.graphics.Color.rgb(r0, r0, r0)     // Catch:{ Exception -> 0x04dd }
                r7[r4] = r0     // Catch:{ Exception -> 0x04dd }
                int r5 = r5 + 1
                goto L_0x025d
            L_0x0271:
                int r11 = r11 + 1
                goto L_0x025a
            L_0x0274:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x04dd }
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r10, r8, r0)     // Catch:{ Exception -> 0x04dd }
                X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x04dd }
                X.4pn r1 = new X.4pn     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r0, r9)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0493
            L_0x0284:
                java.lang.String r0 = "MASK_ARRAY"
                boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x0237
                X.4po r1 = new X.4po     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r9, r6)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0493
            L_0x0293:
                java.lang.String r0 = "WA_CUTOUT_BITMAP"
                boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x0237
                float[] r6 = X.C63973Md.A00(r6, r3, r2)     // Catch:{ Exception -> 0x04dd }
                r7 = 1
                r0 = r25
                int[] r5 = new int[r0]     // Catch:{ Exception -> 0x04dd }
                r4 = 0
            L_0x02a5:
                r0 = r25
                if (r4 >= r0) goto L_0x02b8
                r1 = r6[r4]     // Catch:{ Exception -> 0x04dd }
                r0 = 1056964608(0x3f000000, float:0.5)
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                r0 = 0
                if (r1 < 0) goto L_0x02b3
                r0 = -1
            L_0x02b3:
                r5[r4] = r0     // Catch:{ Exception -> 0x04dd }
                int r4 = r4 + 1
                goto L_0x02a5
            L_0x02b8:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x04dd }
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r3, r2, r0)     // Catch:{ Exception -> 0x04dd }
                X.AnonymousClass00C.A08(r10)     // Catch:{ Exception -> 0x04dd }
                android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r3, r2, r0)     // Catch:{ Exception -> 0x04dd }
                X.AnonymousClass00C.A08(r8)     // Catch:{ Exception -> 0x04dd }
                android.graphics.Paint r7 = X.C36441kJ.A0L(r7)     // Catch:{ Exception -> 0x04dd }
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_IN     // Catch:{ Exception -> 0x04dd }
                android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r1)     // Catch:{ Exception -> 0x04dd }
                r7.setXfermode(r0)     // Catch:{ Exception -> 0x04dd }
                android.graphics.Canvas r5 = X.C90524aI.A0A(r8)     // Catch:{ Exception -> 0x04dd }
                r4 = 0
                r1 = 0
                r0 = r43
                r5.drawBitmap(r0, r4, r4, r1)     // Catch:{ Exception -> 0x04dd }
                r5.drawBitmap(r10, r4, r4, r7)     // Catch:{ Exception -> 0x04dd }
                r10.recycle()     // Catch:{ Exception -> 0x04dd }
                r43.recycle()     // Catch:{ Exception -> 0x04dd }
                X.4pn r1 = new X.4pn     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r8, r9)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0493
            L_0x02f1:
                java.lang.String r0 = "CUTOUT_BITMAP"
                boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x04dd }
                if (r0 == 0) goto L_0x0237
                r8 = 0
                int r15 = r6.length     // Catch:{ Exception -> 0x04dd }
                float[] r14 = new float[r15]     // Catch:{ Exception -> 0x04dd }
                r4 = 3
                float[][] r13 = new float[r4][]     // Catch:{ Exception -> 0x04dd }
                float[] r0 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r0 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r13[r37] = r0     // Catch:{ Exception -> 0x04dd }
                float[] r1 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r0 = 1
                r13[r0] = r1     // Catch:{ Exception -> 0x04dd }
                float[] r1 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r0 = 2
                r13[r0] = r1     // Catch:{ Exception -> 0x04dd }
                r12 = 0
            L_0x0318:
                r11 = 0
            L_0x0319:
                if (r11 >= r2) goto L_0x0353
                r10 = 0
            L_0x031c:
                if (r10 >= r3) goto L_0x0350
                r7 = 0
                r5 = -1
            L_0x0320:
                r4 = -1
            L_0x0321:
                int r1 = r11 + r5
                int r0 = r10 + r4
                if (r1 < 0) goto L_0x033f
                if (r1 >= r2) goto L_0x033f
                if (r0 < 0) goto L_0x033f
                if (r0 >= r3) goto L_0x033f
                int r16 = r5 + 1
                r17 = r13[r16]     // Catch:{ Exception -> 0x04dd }
                int r16 = r4 + 1
                r16 = r17[r16]     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 * r3
                int r1 = r1 + r0
                r0 = r6[r1]     // Catch:{ Exception -> 0x04dd }
                float r0 = r0 * r16
                float r7 = java.lang.Math.max(r7, r0)     // Catch:{ Exception -> 0x04dd }
            L_0x033f:
                int r4 = r4 + 1
                r0 = 2
                if (r4 < r0) goto L_0x0321
                int r5 = r5 + 1
                if (r5 < r0) goto L_0x0320
                int r0 = r11 * r3
                int r0 = r0 + r10
                r14[r0] = r7     // Catch:{ Exception -> 0x04dd }
                int r10 = r10 + 1
                goto L_0x031c
            L_0x0350:
                int r11 = r11 + 1
                goto L_0x0319
            L_0x0353:
                int r12 = r12 + 1
                r0 = 5
                if (r12 < r0) goto L_0x0318
                float[] r7 = new float[r15]     // Catch:{ Exception -> 0x04dd }
                r4 = 3
                float[][] r6 = new float[r4][]     // Catch:{ Exception -> 0x04dd }
                float[] r0 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r0 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r6[r37] = r0     // Catch:{ Exception -> 0x04dd }
                float[] r1 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r0 = 1
                r6[r0] = r1     // Catch:{ Exception -> 0x04dd }
                float[] r1 = new float[r4]     // Catch:{ Exception -> 0x04dd }
                r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04dd }
                r0 = 2
                r6[r0] = r1     // Catch:{ Exception -> 0x04dd }
                r5 = 0
            L_0x0375:
                r10 = 0
            L_0x0376:
                if (r10 >= r2) goto L_0x03b7
                r4 = 0
            L_0x0379:
                if (r4 >= r3) goto L_0x03b4
                r11 = -1
                r13 = 1
            L_0x037d:
                r1 = -1
            L_0x037e:
                int r12 = r10 + r11
                int r0 = r4 + r1
                if (r12 < 0) goto L_0x039d
                if (r12 >= r2) goto L_0x039d
                if (r0 < 0) goto L_0x039d
                if (r0 >= r3) goto L_0x039d
                if (r13 == 0) goto L_0x039d
                int r12 = r12 * r3
                int r12 = r12 + r0
                r13 = r14[r12]     // Catch:{ Exception -> 0x04dd }
                int r0 = r11 + 1
                r12 = r6[r0]     // Catch:{ Exception -> 0x04dd }
                int r0 = r1 + 1
                r0 = r12[r0]     // Catch:{ Exception -> 0x04dd }
                int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                r13 = 1
                if (r0 >= 0) goto L_0x039e
            L_0x039d:
                r13 = 0
            L_0x039e:
                int r1 = r1 + 1
                r0 = 2
                if (r1 < r0) goto L_0x037e
                int r11 = r11 + 1
                if (r11 < r0) goto L_0x037d
                int r1 = r10 * r3
                int r1 = r1 + r4
                r0 = 0
                if (r13 == 0) goto L_0x03af
                r0 = 1065353216(0x3f800000, float:1.0)
            L_0x03af:
                r7[r1] = r0     // Catch:{ Exception -> 0x04dd }
                int r4 = r4 + 1
                goto L_0x0379
            L_0x03b4:
                int r10 = r10 + 1
                goto L_0x0376
            L_0x03b7:
                int r5 = r5 + 1
                r0 = 5
                if (r5 < r0) goto L_0x0375
                float[] r11 = X.C63973Md.A00(r7, r3, r2)     // Catch:{ Exception -> 0x04dd }
                int r0 = r11.length     // Catch:{ Exception -> 0x04dd }
                float[] r6 = java.util.Arrays.copyOf(r11, r0)     // Catch:{ Exception -> 0x04dd }
                X.AnonymousClass00C.A08(r6)     // Catch:{ Exception -> 0x04dd }
                r10 = 0
            L_0x03c9:
                if (r10 >= r2) goto L_0x0415
                r7 = 0
            L_0x03cc:
                if (r7 >= r3) goto L_0x0412
                int r18 = r10 * r3
                int r18 = r18 + r7
                r17 = 0
                int[] r16 = X.C36441kJ.A1O()     // Catch:{ Exception -> 0x04dd }
                r16 = {1, 1} // fill-array     // Catch:{ Exception -> 0x04dd }
                int[][] r15 = X.C113645fs.A01     // Catch:{ Exception -> 0x04dd }
                r5 = 9
                r4 = 0
            L_0x03e0:
                r14 = r15[r4]     // Catch:{ Exception -> 0x04dd }
                r1 = r14[r37]     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 + r10
                r0 = 1
                r0 = r14[r0]     // Catch:{ Exception -> 0x04dd }
                int r0 = r0 + r7
                if (r1 < 0) goto L_0x0409
                if (r1 >= r2) goto L_0x0409
                if (r0 < 0) goto L_0x0409
                if (r0 >= r3) goto L_0x0409
                int r1 = r1 * r3
                int r1 = r1 + r0
                r13 = r11[r1]     // Catch:{ Exception -> 0x04dd }
                float[][] r12 = X.C113645fs.A00     // Catch:{ Exception -> 0x04dd }
                r1 = r16[r37]     // Catch:{ Exception -> 0x04dd }
                r0 = r14[r37]     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 + r0
                r12 = r12[r1]     // Catch:{ Exception -> 0x04dd }
                r0 = 1
                r1 = r16[r0]     // Catch:{ Exception -> 0x04dd }
                r0 = r14[r0]     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 + r0
                r0 = r12[r1]     // Catch:{ Exception -> 0x04dd }
                float r13 = r13 * r0
                float r17 = r17 + r13
            L_0x0409:
                int r4 = r4 + 1
                if (r4 < r5) goto L_0x03e0
                r6[r18] = r17     // Catch:{ Exception -> 0x04dd }
                int r7 = r7 + 1
                goto L_0x03cc
            L_0x0412:
                int r10 = r10 + 1
                goto L_0x03c9
            L_0x0415:
                int r7 = r43.getWidth()     // Catch:{ Exception -> 0x04dd }
                int r1 = r43.getHeight()     // Catch:{ Exception -> 0x04dd }
                int r38 = r43.getWidth()     // Catch:{ Exception -> 0x04dd }
                int r42 = r43.getHeight()     // Catch:{ Exception -> 0x04dd }
                int r0 = r38 * r42
                int[] r5 = new int[r0]     // Catch:{ Exception -> 0x04dd }
                r39 = 0
                r40 = 0
                r35 = r43
                r36 = r5
                r41 = r38
                r35.getPixels(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x04dd }
                r10 = 2147483647(0x7fffffff, float:NaN)
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ Exception -> 0x04dd }
                r12.<init>(r10, r10, r0, r0)     // Catch:{ Exception -> 0x04dd }
            L_0x0440:
                if (r8 >= r7) goto L_0x047e
                r11 = 0
            L_0x0443:
                if (r11 >= r1) goto L_0x047b
                int r13 = r11 * r7
                int r13 = r13 + r8
                r4 = r6[r13]     // Catch:{ Exception -> 0x04dd }
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0470
                int r0 = r12.left     // Catch:{ Exception -> 0x04dd }
                int r0 = java.lang.Math.min(r8, r0)     // Catch:{ Exception -> 0x04dd }
                r12.left = r0     // Catch:{ Exception -> 0x04dd }
                int r0 = r12.right     // Catch:{ Exception -> 0x04dd }
                int r0 = java.lang.Math.max(r8, r0)     // Catch:{ Exception -> 0x04dd }
                r12.right = r0     // Catch:{ Exception -> 0x04dd }
                int r0 = r12.top     // Catch:{ Exception -> 0x04dd }
                int r0 = java.lang.Math.min(r11, r0)     // Catch:{ Exception -> 0x04dd }
                r12.top = r0     // Catch:{ Exception -> 0x04dd }
                int r0 = r12.bottom     // Catch:{ Exception -> 0x04dd }
                int r0 = java.lang.Math.max(r11, r0)     // Catch:{ Exception -> 0x04dd }
                r12.bottom = r0     // Catch:{ Exception -> 0x04dd }
                goto L_0x0478
            L_0x0470:
                r4 = r5[r13]     // Catch:{ Exception -> 0x04dd }
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                r4 = r4 & r0
                r5[r13] = r4     // Catch:{ Exception -> 0x04dd }
            L_0x0478:
                int r11 = r11 + 1
                goto L_0x0443
            L_0x047b:
                int r8 = r8 + 1
                goto L_0x0440
            L_0x047e:
                int r0 = r12.left     // Catch:{ Exception -> 0x04dd }
                if (r0 != r10) goto L_0x049a
                int r1 = r43.getWidth()     // Catch:{ Exception -> 0x04dd }
                int r0 = r43.getHeight()     // Catch:{ Exception -> 0x04dd }
                android.graphics.Bitmap r0 = A01(r5, r1, r0)     // Catch:{ Exception -> 0x04dd }
            L_0x048e:
                X.4pn r1 = new X.4pn     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r0, r9)     // Catch:{ Exception -> 0x04dd }
            L_0x0493:
                r0 = r21
                r0.add(r1)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0226
            L_0x049a:
                int r13 = r12.width()     // Catch:{ Exception -> 0x04dd }
                int r11 = r12.height()     // Catch:{ Exception -> 0x04dd }
                int r0 = r13 * r11
                int[] r10 = new int[r0]     // Catch:{ Exception -> 0x04dd }
                r8 = 0
            L_0x04a7:
                if (r8 >= r13) goto L_0x04c1
                r4 = 0
            L_0x04aa:
                if (r4 >= r11) goto L_0x04be
                int r0 = r12.left     // Catch:{ Exception -> 0x04dd }
                int r0 = r0 + r8
                int r1 = r12.top     // Catch:{ Exception -> 0x04dd }
                int r1 = r1 + r4
                int r1 = r1 * r7
                int r0 = r0 + r1
                int r1 = r4 * r13
                int r1 = r1 + r8
                r0 = r5[r0]     // Catch:{ Exception -> 0x04dd }
                r10[r1] = r0     // Catch:{ Exception -> 0x04dd }
                int r4 = r4 + 1
                goto L_0x04aa
            L_0x04be:
                int r8 = r8 + 1
                goto L_0x04a7
            L_0x04c1:
                android.graphics.Bitmap r0 = A01(r10, r13, r11)     // Catch:{ Exception -> 0x04dd }
                goto L_0x048e
            L_0x04c6:
                X.4pq r1 = new X.4pq     // Catch:{ Exception -> 0x04dd }
                r0 = r21
                r1.<init>(r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0057
            L_0x04cf:
                java.lang.String r1 = "Failed to set to binary mask"
                X.6GO r0 = new X.6GO     // Catch:{ Exception -> 0x04dd }
                r0.<init>(r1)     // Catch:{ Exception -> 0x04dd }
                X.4pp r1 = new X.4pp     // Catch:{ Exception -> 0x04dd }
                r1.<init>(r0)     // Catch:{ Exception -> 0x04dd }
                goto L_0x0057
            L_0x04dd:
                r2 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0532 }
                java.lang.String r0 = "Prediction Error "
                java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ Exception -> 0x0532 }
                X.6GO r0 = new X.6GO     // Catch:{ Exception -> 0x0532 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0532 }
                X.4pp r1 = new X.4pp     // Catch:{ Exception -> 0x0532 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0532 }
                goto L_0x0057
            L_0x04f4:
                java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x0532 }
                java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x0532 }
            L_0x04fc:
                boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0532 }
                if (r0 == 0) goto L_0x0515
                java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0532 }
                X.4pn r0 = (X.C97504pn) r0     // Catch:{ Exception -> 0x0532 }
                android.graphics.Bitmap r0 = r0.A00     // Catch:{ Exception -> 0x0532 }
                r2.add(r0)     // Catch:{ Exception -> 0x0532 }
                goto L_0x04fc
            L_0x050e:
                r0 = r44
                X.00s r0 = r0.A01     // Catch:{ Exception -> 0x0532 }
                X.5C7 r2 = X.AnonymousClass5C7.A00     // Catch:{ Exception -> 0x0532 }
                goto L_0x0525
            L_0x0515:
                java.util.List r1 = X.C007103b.A0Y(r2)     // Catch:{ Exception -> 0x0532 }
                boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0532 }
                if (r0 == 0) goto L_0x052c
                X.5C7 r2 = X.AnonymousClass5C7.A00     // Catch:{ Exception -> 0x0532 }
            L_0x0521:
                r0 = r44
                X.00s r0 = r0.A01     // Catch:{ Exception -> 0x0532 }
            L_0x0525:
                r0.A0C(r2)     // Catch:{ Exception -> 0x0532 }
                r19.recycle()     // Catch:{ Exception -> 0x0532 }
                goto L_0x0538
            L_0x052c:
                X.5C6 r2 = new X.5C6     // Catch:{ Exception -> 0x0532 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0532 }
                goto L_0x0521
            L_0x0532:
                r1 = move-exception
                java.lang.String r0 = "UTwoNetViewModel/process/uri"
                com.whatsapp.util.Log.e(r0, r1)
            L_0x0538:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x053b:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.utwonet.UTwoNetViewModel$process$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$process$1(Uri uri, UTwoNetViewModel uTwoNetViewModel, AnonymousClass5TL r4, List list, C023509x r6, int i, int i2) {
        super(2, r6);
        this.this$0 = uTwoNetViewModel;
        this.$uri = uri;
        this.$minDimension = i;
        this.$maxDimension = i2;
        this.$types = list;
        this.$predictionSize = r4;
    }

    public final C023509x create(Object obj, C023509x r10) {
        UTwoNetViewModel uTwoNetViewModel = this.this$0;
        Uri uri = this.$uri;
        int i = this.$minDimension;
        int i2 = this.$maxDimension;
        return new UTwoNetViewModel$process$1(uri, uTwoNetViewModel, this.$predictionSize, this.$types, r10, i, i2);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final UTwoNetViewModel uTwoNetViewModel = this.this$0;
            C005502l r0 = uTwoNetViewModel.A05;
            final Uri uri = this.$uri;
            final int i2 = this.$minDimension;
            final int i3 = this.$maxDimension;
            final List list = this.$types;
            final AnonymousClass5TL r6 = this.$predictionSize;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UTwoNetViewModel$process$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
