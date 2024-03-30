package X;

import android.graphics.Matrix;
import android.util.Property;
import android.view.View;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.0IP  reason: invalid class name */
public class AnonymousClass0IP extends AnonymousClass054 {
    public static final Property A01 = new C18090sb(1);
    public static final Property A02 = new C18090sb(2);
    public static final String[] A03 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public Matrix A00 = new Matrix();

    private void A01(AnonymousClass0X9 r7) {
        Matrix matrix;
        View view = r7.A00;
        if (view.getVisibility() != 8) {
            Map map = r7.A02;
            map.put("android:changeTransform:parent", view.getParent());
            map.put("android:changeTransform:transforms", new AnonymousClass0XA(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            map.put("android:changeTransform:matrix", matrix);
            Matrix matrix3 = new Matrix();
            View view2 = (View) view.getParent();
            AnonymousClass0W5.A02.A02(matrix3, view2);
            matrix3.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            map.put("android:changeTransform:parentMatrix", matrix3);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0276, code lost:
        if (r18.getZ() > r17.getZ()) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029e, code lost:
        if (r7.size() == r2) goto L_0x0278;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A04(android.view.ViewGroup r23, X.AnonymousClass0X9 r24, X.AnonymousClass0X9 r25) {
        /*
            r22 = this;
            r21 = r24
            if (r24 == 0) goto L_0x0318
            r4 = r25
            if (r25 == 0) goto L_0x0318
            r0 = r21
            java.util.Map r13 = r0.A02
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x0318
            java.util.Map r3 = r4.A02
            boolean r0 = r3.containsKey(r12)
            if (r0 == 0) goto L_0x0318
            java.lang.Object r5 = r13.get(r12)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r2 = r3.get(r12)
            android.view.View r2 = (android.view.View) r2
            r11 = r22
            boolean r0 = r11.A0U(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0165
            boolean r0 = r11.A0U(r2)
            if (r0 == 0) goto L_0x0165
            X.0X9 r0 = r11.A0C(r5, r1)
            if (r0 == 0) goto L_0x0169
            android.view.View r0 = r0.A00
            if (r2 != r0) goto L_0x0169
        L_0x0041:
            r20 = 0
        L_0x0043:
            java.lang.String r0 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "android:changeTransform:matrix"
            r13.put(r0, r1)
        L_0x0050:
            java.lang.String r0 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r13.get(r0)
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            r13.put(r0, r1)
        L_0x005d:
            if (r20 == 0) goto L_0x0095
            java.lang.String r6 = "android:changeTransform:parentMatrix"
            java.lang.Object r5 = r3.get(r6)
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            android.view.View r1 = r4.A00
            r0 = 2131432326(0x7f0b1386, float:1.8486406E38)
            r1.setTag(r0, r5)
            android.graphics.Matrix r2 = r11.A00
            r2.reset()
            r5.invert(r2)
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r1 = r13.get(r0)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x0089
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r13.put(r0, r1)
        L_0x0089:
            java.lang.Object r0 = r13.get(r6)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            r1.postConcat(r0)
            r1.postConcat(r2)
        L_0x0095:
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r2 = r13.get(r0)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            java.lang.Object r7 = r3.get(r0)
            android.graphics.Matrix r7 = (android.graphics.Matrix) r7
            if (r2 != 0) goto L_0x00a7
            android.graphics.Matrix r2 = X.AnonymousClass0RI.A00
        L_0x00a7:
            if (r7 != 0) goto L_0x00ab
            android.graphics.Matrix r7 = X.AnonymousClass0RI.A00
        L_0x00ab:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x00db
            r10 = 0
        L_0x00b2:
            if (r20 == 0) goto L_0x0319
            if (r10 == 0) goto L_0x0319
            android.view.View r9 = r4.A00
            java.lang.String r0 = "android:changeTransform:parentMatrix"
            java.lang.Object r0 = r3.get(r0)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r0)
            X.0V3 r20 = X.AnonymousClass0W5.A02
            r2 = r23
            r0 = r20
            r0.A03(r3, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L_0x01bc
            boolean r0 = X.C09970dS.A04
            if (r0 != 0) goto L_0x0197
            r5 = 1
            goto L_0x016d
        L_0x00db:
            java.lang.String r0 = "android:changeTransform:transforms"
            java.lang.Object r6 = r3.get(r0)
            X.0XA r6 = (X.AnonymousClass0XA) r6
            android.view.View r5 = r4.A00
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setTranslationX(r1)
            r5.setTranslationY(r1)
            X.C011004s.A06(r5, r1)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            r5.setRotationX(r1)
            r5.setRotationY(r1)
            r5.setRotation(r1)
            r0 = 9
            float[] r1 = new float[r0]
            r2.getValues(r1)
            float[] r8 = new float[r0]
            r7.getValues(r8)
            X.0Wf r2 = new X.0Wf
            r2.<init>(r5, r1)
            android.util.Property r14 = A01
            float[] r0 = new float[r0]
            X.0ZD r10 = new X.0ZD
            r10.<init>(r0)
            r9 = 2
            float[][] r0 = new float[r9][]
            r17 = 0
            r0[r17] = r1
            r16 = 1
            r0[r16] = r8
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofObject(r14, r10, r0)
            r14 = r1[r9]
            r0 = 5
            r10 = r1[r0]
            r1 = r8[r9]
            r0 = r8[r0]
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r8.moveTo(r14, r10)
            r8.lineTo(r1, r0)
            android.util.Property r1 = A02
            r0 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r1, r0, r8)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r9]
            r0[r17] = r15
            r0[r16] = r1
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r2, r0)
            X.0DO r0 = new X.0DO
            r19 = r11
            r17 = r2
            r18 = r6
            r14 = r0
            r15 = r7
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r10.addListener(r0)
            r10.addPauseListener(r0)
            goto L_0x00b2
        L_0x0165:
            if (r5 != r2) goto L_0x0169
            goto L_0x0041
        L_0x0169:
            r20 = 1
            goto L_0x0043
        L_0x016d:
            X.C09970dS.A00()     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class r7 = X.C09970dS.A01     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.String r6 = "addGhost"
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x018d }
            r1 = 0
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r4[r1] = r0     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            r4[r5] = r0     // Catch:{ NoSuchMethodException -> 0x018d }
            r1 = 2
            java.lang.Class<android.graphics.Matrix> r0 = android.graphics.Matrix.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0H(r7, r0, r6, r4, r1)     // Catch:{ NoSuchMethodException -> 0x018d }
            X.C09970dS.A02 = r0     // Catch:{ NoSuchMethodException -> 0x018d }
            r0.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x018d }
            goto L_0x0195
        L_0x018d:
            r4 = move-exception
            java.lang.String r1 = "GhostViewApi21"
            java.lang.String r0 = "Failed to retrieve addGhost method"
            android.util.Log.i(r1, r0, r4)
        L_0x0195:
            X.C09970dS.A04 = r5
        L_0x0197:
            java.lang.reflect.Method r4 = X.C09970dS.A02
            r1 = 0
            if (r4 == 0) goto L_0x01b9
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            X.AnonymousClass000.A19(r9, r2, r3, r0)     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            X.0dS r14 = new X.0dS     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            r14.<init>(r0)     // Catch:{ IllegalAccessException -> 0x01b9, InvocationTargetException -> 0x01af }
            goto L_0x02df
        L_0x01af:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x01b9:
            r14 = r1
            goto L_0x02df
        L_0x01bc:
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0311
            r0 = 2131430506(0x7f0b0c6a, float:1.8482715E38)
            java.lang.Object r15 = r2.getTag(r0)
            X.0Em r15 = (X.C03410Em) r15
            r0 = 2131430505(0x7f0b0c69, float:1.8482713E38)
            java.lang.Object r14 = r9.getTag(r0)
            X.0ET r14 = (X.AnonymousClass0ET) r14
            r19 = 0
            if (r14 == 0) goto L_0x01e9
            android.view.ViewParent r1 = r14.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == r15) goto L_0x02c7
            int r0 = r14.A02
            r19 = r0
            r1.removeView(r14)
        L_0x01e9:
            X.0ET r14 = new X.0ET
            r14.<init>(r9)
            r14.A03 = r3
            if (r15 != 0) goto L_0x02a4
            X.0Em r15 = new X.0Em
            r15.<init>(r2)
        L_0x01f7:
            X.AnonymousClass0ET.A00(r2, r15)
            X.AnonymousClass0ET.A00(r2, r14)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            android.view.View r0 = r14.A04
            X.C03410Em.A00(r0, r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r0 = r15.getChildCount()
            int r6 = r0 + -1
            r5 = 0
        L_0x0211:
            if (r5 > r6) goto L_0x02ca
            int r0 = r5 + r6
            int r4 = r0 / 2
            android.view.View r0 = r15.getChildAt(r4)
            X.0ET r0 = (X.AnonymousClass0ET) r0
            android.view.View r0 = r0.A04
            X.C03410Em.A00(r0, r7)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0278
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0278
            r0 = 0
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r0 = r7.get(r0)
            if (r1 != r0) goto L_0x0278
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            r3 = 1
        L_0x0246:
            if (r3 >= r2) goto L_0x029a
            android.view.View r18 = X.AnonymousClass000.A0Z(r8, r3)
            android.view.View r17 = X.AnonymousClass000.A0Z(r7, r3)
            r1 = r18
            r0 = r17
            if (r1 == r0) goto L_0x0297
            android.view.ViewParent r3 = r18.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r16 = r3.getChildCount()
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x027e
            float r1 = r18.getZ()
            float r0 = r17.getZ()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a1
        L_0x0278:
            int r5 = r4 + 1
        L_0x027a:
            r7.clear()
            goto L_0x0211
        L_0x027e:
            r2 = 0
        L_0x027f:
            r0 = r16
            if (r2 >= r0) goto L_0x0278
            int r0 = X.AnonymousClass0W4.A00(r3, r2)
            android.view.View r0 = r3.getChildAt(r0)
            r1 = r18
            if (r0 == r1) goto L_0x02a1
            r1 = r0
            r0 = r17
            if (r1 == r0) goto L_0x0278
            int r2 = r2 + 1
            goto L_0x027f
        L_0x0297:
            int r3 = r3 + 1
            goto L_0x0246
        L_0x029a:
            int r0 = r7.size()
            if (r0 != r2) goto L_0x02a1
            goto L_0x0278
        L_0x02a1:
            int r6 = r4 + -1
            goto L_0x027a
        L_0x02a4:
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x02c0
            android.view.ViewGroup r1 = r15.A00
            X.0SN r0 = new X.0SN
            r0.<init>(r1)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.remove(r15)
            X.0SN r0 = new X.0SN
            r0.<init>(r1)
            android.view.ViewGroupOverlay r0 = r0.A00
            r0.add(r15)
            goto L_0x01f7
        L_0x02c0:
            java.lang.String r0 = "This GhostViewHolder is detached!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x02c7:
            r14.A03 = r3
            goto L_0x02d9
        L_0x02ca:
            if (r5 < 0) goto L_0x02f5
            int r0 = r15.getChildCount()
            if (r5 >= r0) goto L_0x02f5
            r15.addView(r14, r5)
        L_0x02d5:
            r0 = r19
            r14.A02 = r0
        L_0x02d9:
            int r0 = r14.A02
            int r0 = r0 + 1
            r14.A02 = r0
        L_0x02df:
            if (r14 == 0) goto L_0x0319
            java.lang.Object r1 = r13.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = r21
            android.view.View r2 = r0.A00
            r14.BoT(r2, r1)
        L_0x02ee:
            X.07k r0 = r11.A07
            if (r0 == 0) goto L_0x02f9
            X.07k r11 = r11.A07
            goto L_0x02ee
        L_0x02f5:
            r15.addView(r14)
            goto L_0x02d5
        L_0x02f9:
            X.0IV r0 = new X.0IV
            r0.<init>(r9, r14)
            r11.A0A(r0)
            if (r2 == r9) goto L_0x0309
            r1 = 0
            r0 = r20
            r0.A04(r2, r1)
        L_0x0309:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            r0.A04(r9, r1)
            return r10
        L_0x0311:
            java.lang.String r0 = "Ghosted views must be parented by a ViewGroup"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0318:
            r10 = 0
        L_0x0319:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IP.A04(android.view.ViewGroup, X.0X9, X.0X9):android.animation.Animator");
    }

    public void A0S(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public void A0T(AnonymousClass0X9 r1) {
        A01(r1);
    }

    public String[] A0W() {
        return A03;
    }
}
