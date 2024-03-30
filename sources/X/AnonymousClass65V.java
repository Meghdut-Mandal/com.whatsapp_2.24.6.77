package X;

/* renamed from: X.65V  reason: invalid class name */
public abstract class AnonymousClass65V {
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        throw new X.AnonymousClass5R5(X.AnonymousClass000.A0p("can't parse orientation value: ", r2, X.AnonymousClass000.A0u()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A00(X.C1271967i r15, X.C140456lc r16, X.C140456lc r17) {
        /*
            r14 = this;
            r1 = r16
            int r2 = r1.A04
            r0 = 13318(0x3406, float:1.8662E-41)
            r6 = r17
            if (r2 == r0) goto L_0x0204
            r0 = 13322(0x340a, float:1.8668E-41)
            if (r2 == r0) goto L_0x00b7
            r0 = 13330(0x3412, float:1.868E-41)
            if (r2 == r0) goto L_0x016c
            r0 = 13332(0x3414, float:1.8682E-41)
            if (r2 == r0) goto L_0x0020
            r0 = 13340(0x341c, float:1.8693E-41)
            if (r2 == r0) goto L_0x014d
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
        L_0x001f:
            return r3
        L_0x0020:
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            r0 = 6
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r0]
            r2 = 35
            java.util.List r5 = r1.A0c(r2)
            r13 = 0
            r1 = 0
        L_0x0030:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x00a4
            X.6lc r8 = X.C90504aG.A0K(r5, r1)
            X.6lc r7 = r8.A0W(r2)
            if (r7 != 0) goto L_0x0099
            java.lang.String r7 = "StateDrawableUtils"
            java.lang.String r0 = "Null Drawable model when creating children of a StateDrawable"
            X.AnonymousClass6RS.A01(r7, r0)
            android.graphics.drawable.ColorDrawable r12 = new android.graphics.drawable.ColorDrawable
            r12.<init>()
        L_0x004c:
            r7 = 36
            java.lang.String r0 = ""
            java.lang.String r10 = r8.A0a(r7, r0)
            int r0 = r10.hashCode()
            r11 = 4
            r9 = 3
            r8 = 2
            r7 = 1
            switch(r0) {
                case -691041417: goto L_0x008e;
                case -318264286: goto L_0x0083;
                case 270940796: goto L_0x0078;
                case 1191572123: goto L_0x006d;
                case 1544803905: goto L_0x0062;
                default: goto L_0x005f;
            }
        L_0x005f:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0062:
            java.lang.String r0 = "default"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x005f
            r4[r13] = r12
            goto L_0x005f
        L_0x006d:
            java.lang.String r0 = "selected"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x005f
            r4[r8] = r12
            goto L_0x005f
        L_0x0078:
            java.lang.String r0 = "disabled"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x005f
            r4[r11] = r12
            goto L_0x005f
        L_0x0083:
            java.lang.String r0 = "pressed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x005f
            r4[r9] = r12
            goto L_0x005f
        L_0x008e:
            java.lang.String r0 = "focused"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x005f
            r4[r7] = r12
            goto L_0x005f
        L_0x0099:
            X.6NR r0 = X.AnonymousClass6NR.A00()
            X.65V r0 = r0.A02
            android.graphics.drawable.Drawable r12 = r0.A00(r15, r7, r6)
            goto L_0x004c
        L_0x00a4:
            r2 = 5
        L_0x00a5:
            r0 = r4[r2]
            if (r0 == 0) goto L_0x00b2
            int[][] r0 = X.C112665eG.A00
            r1 = r0[r2]
            r0 = r4[r2]
            r3.addState(r1, r0)
        L_0x00b2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x001f
            goto L_0x00a5
        L_0x00b7:
            r0 = 35
            X.6lc r4 = r1.A0W(r0)
            r0 = 36
            X.6lc r3 = r1.A0W(r0)
            if (r4 == 0) goto L_0x01fd
            if (r3 == 0) goto L_0x01fd
            r0 = 38
            X.6lc r8 = r1.A0W(r0)
            java.lang.String r2 = X.C140456lc.A0M(r1)
            if (r2 != 0) goto L_0x00d6
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 5R5 -> 0x0119 }
            goto L_0x0123
        L_0x00d6:
            int r0 = r2.hashCode()     // Catch:{ 5R5 -> 0x0119 }
            switch(r0) {
                case -1451623918: goto L_0x010e;
                case -1118360059: goto L_0x0103;
                case 404498110: goto L_0x00f8;
                case 1553519760: goto L_0x00ed;
                default: goto L_0x00dd;
            }     // Catch:{ 5R5 -> 0x0119 }
        L_0x00dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5R5 -> 0x0119 }
            java.lang.String r0 = "can't parse orientation value: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ 5R5 -> 0x0119 }
            X.5R5 r0 = new X.5R5     // Catch:{ 5R5 -> 0x0119 }
            r0.<init>(r1)     // Catch:{ 5R5 -> 0x0119 }
            throw r0     // Catch:{ 5R5 -> 0x0119 }
        L_0x00ed:
            java.lang.String r0 = "left_to_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 5R5 -> 0x0119 }
            if (r0 == 0) goto L_0x00dd
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ 5R5 -> 0x0119 }
            goto L_0x0123
        L_0x00f8:
            java.lang.String r0 = "top_left_to_bottom_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 5R5 -> 0x0119 }
            if (r0 == 0) goto L_0x00dd
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch:{ 5R5 -> 0x0119 }
            goto L_0x0123
        L_0x0103:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)     // Catch:{ 5R5 -> 0x0119 }
            if (r0 == 0) goto L_0x00dd
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 5R5 -> 0x0119 }
            goto L_0x0123
        L_0x010e:
            java.lang.String r0 = "bottom_left_to_top_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 5R5 -> 0x0119 }
            if (r0 == 0) goto L_0x00dd
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch:{ 5R5 -> 0x0119 }
            goto L_0x0123
        L_0x0119:
            r2 = move-exception
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing orientation for GradientDrawable"
            X.AnonymousClass6RS.A00(r15, r1, r0, r2)
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
        L_0x0123:
            r7 = 0
            int r5 = X.AnonymousClass5Z8.A01(r15, r4, r7)
            int r4 = X.AnonymousClass5Z8.A01(r15, r3, r7)
            r3 = 1
            r2 = 2
            if (r8 == 0) goto L_0x0146
            int r1 = X.AnonymousClass5Z8.A01(r15, r8, r7)
            r0 = 3
            int[] r0 = new int[r0]
            r0[r7] = r5
            r0[r3] = r1
            r0[r2] = r4
        L_0x013d:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r9, r0)
            if (r17 == 0) goto L_0x001f
            goto L_0x01ce
        L_0x0146:
            int[] r0 = new int[r2]
            r0[r7] = r5
            r0[r3] = r4
            goto L_0x013d
        L_0x014d:
            r0 = 35
            X.6lc r0 = r1.A0W(r0)     // Catch:{ 5R5 -> 0x015e }
            if (r0 == 0) goto L_0x0166
            int r0 = X.AnonymousClass5Z8.A00(r15, r0)     // Catch:{ 5R5 -> 0x015e }
            X.4bY r3 = X.C131776Qo.A01(r15, r6, r0)     // Catch:{ 5R5 -> 0x015e }
            return r3
        L_0x015e:
            r2 = move-exception
            java.lang.String r1 = "ThemedColorDrawableUtils"
            java.lang.String r0 = "Parse error for ThemedColorDrawable"
            X.AnonymousClass6RS.A00(r15, r1, r0, r2)
        L_0x0166:
            X.4bY r3 = new X.4bY
            r3.<init>()
            return r3
        L_0x016c:
            r0 = 35
            X.6lc r2 = r1.A0W(r0)
            java.lang.String r7 = "RippleDrawableUtils"
            if (r2 != 0) goto L_0x017b
            java.lang.String r0 = "Client received a RippleDrawable with null content"
            X.AnonymousClass6RS.A01(r7, r0)
        L_0x017b:
            if (r2 != 0) goto L_0x018b
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>()
        L_0x0182:
            r4 = 0
            if (r17 == 0) goto L_0x01bc
            r0 = 8
            float[] r3 = new float[r0]
            r2 = 0
            goto L_0x0196
        L_0x018b:
            X.6NR r0 = X.AnonymousClass6NR.A00()
            X.65V r0 = r0.A02
            android.graphics.drawable.Drawable r5 = r0.A00(r15, r2, r6)
            goto L_0x0182
        L_0x0196:
            r0 = 46
            java.lang.Object r0 = X.C140456lc.A0I(r6, r0)     // Catch:{ 5R5 -> 0x01aa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x01aa }
            if (r0 != 0) goto L_0x01a2
            r0 = 0
            goto L_0x01a6
        L_0x01a2:
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x01aa }
        L_0x01a6:
            java.util.Arrays.fill(r3, r0)     // Catch:{ 5R5 -> 0x01aa }
            goto L_0x01b2
        L_0x01aa:
            java.lang.String r0 = "Error parsing Corner radius for Box decoration"
            X.AnonymousClass6RS.A01(r7, r0)
            java.util.Arrays.fill(r3, r2)
        L_0x01b2:
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r3, r4, r4)
            android.graphics.drawable.ShapeDrawable r4 = new android.graphics.drawable.ShapeDrawable
            r4.<init>(r0)
        L_0x01bc:
            java.lang.String r0 = X.C140456lc.A0L(r1)
            int r0 = android.graphics.Color.parseColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            r3.<init>(r0, r5, r4)
            return r3
        L_0x01ce:
            r0 = 46
            java.lang.Object r0 = X.C140456lc.A0I(r6, r0)     // Catch:{ 5R5 -> 0x01f5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x01f5 }
            if (r0 != 0) goto L_0x01da
            r2 = 0
            goto L_0x01de
        L_0x01da:
            float r2 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x01f5 }
        L_0x01de:
            r0 = 56
            java.util.List r1 = r6.A0d(r0)     // Catch:{ 5R5 -> 0x01f5 }
            r0 = 15
            int r1 = X.C131796Qq.A00(r1, r0)     // Catch:{ 5R5 -> 0x01f5 }
            r0 = 8
            float[] r0 = new float[r0]     // Catch:{ 5R5 -> 0x01f5 }
            X.C131796Qq.A01(r0, r2, r1)     // Catch:{ 5R5 -> 0x01f5 }
            r3.setCornerRadii(r0)     // Catch:{ 5R5 -> 0x01f5 }
            return r3
        L_0x01f5:
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing Corner radius for Box decoration"
            X.AnonymousClass6RS.A01(r1, r0)
            return r3
        L_0x01fd:
            java.lang.String r0 = "Gradient drawable received with null begin or end color"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0204:
            r0 = 35
            java.lang.Object r0 = X.C140456lc.A0I(r1, r0)     // Catch:{ 5R5 -> 0x021d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x021d }
            if (r0 != 0) goto L_0x0214
            X.4bY r3 = new X.4bY     // Catch:{ 5R5 -> 0x021d }
            r3.<init>()     // Catch:{ 5R5 -> 0x021d }
            return r3
        L_0x0214:
            int r0 = X.AnonymousClass6Y7.A04(r0)     // Catch:{ 5R5 -> 0x021d }
            X.4bY r3 = X.C131776Qo.A01(r15, r6, r0)     // Catch:{ 5R5 -> 0x021d }
            return r3
        L_0x021d:
            r2 = move-exception
            java.lang.String r1 = "ColorDrawableUtils"
            java.lang.String r0 = "Error parsing color for ColorDrawable"
            X.AnonymousClass6RS.A00(r15, r1, r0, r2)
            X.4bY r3 = new X.4bY
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65V.A00(X.67i, X.6lc, X.6lc):android.graphics.drawable.Drawable");
    }
}
