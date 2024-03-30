package X;

/* renamed from: X.7yW  reason: invalid class name and case insensitive filesystem */
public abstract class C167657yW extends AnonymousClass04R {
    public int A0S() {
        if (this instanceof C186288vp) {
            return 0;
        }
        return C36331k8.A02(((C186298vq) this).A02.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r7 = r2.A00;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[Catch:{ Exception -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C186288vp
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r6 = r15
            X.8vq r6 = (X.C186298vq) r6
            X.9bg r8 = X.C197419bg.A01     // Catch:{ Exception -> 0x017b }
            r9 = 0
            X.9M0 r7 = r8.A00     // Catch:{ Exception -> 0x017b }
            boolean r0 = r7.A03     // Catch:{ Exception -> 0x017b }
            if (r0 != 0) goto L_0x0093
            java.lang.String r2 = "reflective setup failed using obj: %s method: %s field: %s"
            java.lang.String r12 = "mParams"
            java.lang.String r11 = "mViews"
            r1 = 1
            r7.A03 = r1     // Catch:{ Exception -> 0x017b }
            java.lang.String r10 = "android.view.WindowManagerGlobal"
            java.lang.String r5 = "getInstance"
            r4 = 3
            r3 = 2
            r14 = 0
            java.lang.Class r13 = java.lang.Class.forName(r10)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            java.lang.Object r0 = X.AnonymousClass000.A0h(r13, r9, r5)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            r7.A00 = r0     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            java.lang.reflect.Field r0 = r13.getDeclaredField(r11)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            r7.A02 = r0     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            r0.setAccessible(r1)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
        L_0x0036:
            java.lang.reflect.Field r0 = r13.getDeclaredField(r12)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            r7.A01 = r0     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            if (r0 == 0) goto L_0x0093
            r0.setAccessible(r1)     // Catch:{ InvocationTargetException -> 0x0060, ClassNotFoundException -> 0x006d, NoSuchFieldException -> 0x007e, NoSuchMethodException -> 0x0053, IllegalAccessException | RuntimeException -> 0x0042 }
            goto L_0x0093
        L_0x0042:
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = X.C36431kI.A1a(r10, r5, r4)     // Catch:{ Exception -> 0x017b }
            r0[r3] = r11     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)     // Catch:{ Exception -> 0x017b }
            goto L_0x0090
        L_0x0053:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = X.C36431kI.A1a(r5, r10, r3)     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "could not find method: %s on %s"
            goto L_0x0079
        L_0x0060:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = X.C36431kI.A1a(r5, r10, r3)     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "could not invoke: %s on %s"
            goto L_0x0079
        L_0x006d:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x017b }
            r0[r14] = r10     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "could not find class: %s"
        L_0x0079:
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x017b }
            goto L_0x0090
        L_0x007e:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = X.C36431kI.A1a(r12, r11, r4)     // Catch:{ Exception -> 0x017b }
            r0[r3] = r10     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "could not find field: %s or %s on %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x017b }
        L_0x0090:
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x017b }
        L_0x0093:
            java.lang.Object r2 = r7.A00     // Catch:{ Exception -> 0x017b }
            r11 = 0
            if (r2 == 0) goto L_0x017b
            java.lang.reflect.Field r1 = r7.A02     // Catch:{ Exception -> 0x017b }
            if (r1 == 0) goto L_0x017b
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x017b
            r12 = 2
            r5 = 3
            java.lang.String r4 = "Reflective access to %s or %s on %s failed."
            r3 = 1
            r10 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
            java.lang.reflect.Field r1 = r7.A01     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r0 = r7.A00     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
        L_0x00b6:
            java.util.List r11 = (java.util.List) r11     // Catch:{ RuntimeException -> 0x0160, IllegalAccessException -> 0x0144 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x017b }
            if (r2 == 0) goto L_0x00eb
            java.util.Iterator r7 = r2.iterator()     // Catch:{ Exception -> 0x017b }
        L_0x00c2:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r7.next()     // Catch:{ Exception -> 0x017b }
            int r2 = r10 + 1
            if (r10 >= 0) goto L_0x00d5
            java.lang.RuntimeException r0 = X.C36351kA.A0v()     // Catch:{ Exception -> 0x017b }
            throw r0     // Catch:{ Exception -> 0x017b }
        L_0x00d5:
            android.view.View r4 = (android.view.View) r4     // Catch:{ Exception -> 0x017b }
            if (r11 == 0) goto L_0x00e9
            java.lang.Object r1 = r11.get(r10)     // Catch:{ Exception -> 0x017b }
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1     // Catch:{ Exception -> 0x017b }
            if (r1 == 0) goto L_0x00e9
            X.9Ie r0 = new X.9Ie     // Catch:{ Exception -> 0x017b }
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x017b }
            r5.add(r0)     // Catch:{ Exception -> 0x017b }
        L_0x00e9:
            r10 = r2
            goto L_0x00c2
        L_0x00eb:
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x017b }
            if (r0 != 0) goto L_0x017b
            r7 = 0
            int r0 = r5.size()     // Catch:{ Exception -> 0x017b }
            r2 = r7
        L_0x00f7:
            int r4 = r0 + -1
            if (r0 <= 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            if (r2 == 0) goto L_0x011c
            goto L_0x011a
        L_0x00ff:
            java.lang.Object r2 = r5.get(r4)     // Catch:{ Exception -> 0x017b }
            X.9Ie r2 = (X.C192689Ie) r2     // Catch:{ Exception -> 0x017b }
            android.view.View r1 = r2.A00     // Catch:{ Exception -> 0x017b }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r9)     // Catch:{ Exception -> 0x017b }
            if (r0 != 0) goto L_0x0141
            r0 = 2131430333(0x7f0b0bbd, float:1.8482364E38)
            java.lang.Object r0 = r1.getTag(r0)     // Catch:{ Exception -> 0x017b }
            boolean r0 = X.C36371kC.A1X(r0, r3)     // Catch:{ Exception -> 0x017b }
            if (r0 != 0) goto L_0x0141
        L_0x011a:
            android.view.View r7 = r2.A00     // Catch:{ Exception -> 0x017b }
        L_0x011c:
            boolean r0 = r7 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x017b
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ Exception -> 0x017b }
            X.5QL r5 = new X.5QL     // Catch:{ Exception -> 0x017b }
            r5.<init>(r7, r8)     // Catch:{ Exception -> 0x017b }
            X.005 r0 = r6.A03     // Catch:{ Exception -> 0x017b }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x017b }
            X.5xV r4 = (X.C124045xV) r4     // Catch:{ Exception -> 0x017b }
            X.Aid r3 = new X.Aid     // Catch:{ Exception -> 0x017b }
            r3.<init>(r6)     // Catch:{ Exception -> 0x017b }
            X.0wU r2 = r4.A02     // Catch:{ Exception -> 0x017b }
            r1 = 34
            X.737 r0 = new X.737     // Catch:{ Exception -> 0x017b }
            r0.<init>(r4, r5, r3, r1)     // Catch:{ Exception -> 0x017b }
            r2.Boy(r0)     // Catch:{ Exception -> 0x017b }
            goto L_0x0143
        L_0x0141:
            r0 = r4
            goto L_0x00f7
        L_0x0143:
            return
        L_0x0144:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x017b }
            java.lang.reflect.Field r0 = r7.A02     // Catch:{ Exception -> 0x017b }
            r1[r10] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x017b }
            r1[r3] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x017b }
            r1[r12] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r5)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = java.lang.String.format(r2, r4, r0)     // Catch:{ Exception -> 0x017b }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x017b }
            return
        L_0x0160:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x017b }
            java.lang.reflect.Field r0 = r7.A02     // Catch:{ Exception -> 0x017b }
            r1[r10] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.reflect.Field r0 = r7.A01     // Catch:{ Exception -> 0x017b }
            r1[r3] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.Object r0 = r7.A00     // Catch:{ Exception -> 0x017b }
            r1[r12] = r0     // Catch:{ Exception -> 0x017b }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r5)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = java.lang.String.format(r2, r4, r0)     // Catch:{ Exception -> 0x017b }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x017b }
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167657yW.A0T():void");
    }

    public void A0U(boolean z) {
        if (!(this instanceof C186288vp)) {
            ((C186298vq) this).A00 = z;
        }
    }

    public boolean A0V() {
        if (this instanceof C186288vp) {
            return false;
        }
        return ((C186298vq) this).A01;
    }

    public boolean A0W() {
        if (this instanceof C186288vp) {
            return true;
        }
        return ((C186298vq) this).A00;
    }
}
