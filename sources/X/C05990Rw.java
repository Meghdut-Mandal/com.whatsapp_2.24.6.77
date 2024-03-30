package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Rw  reason: invalid class name and case insensitive filesystem */
public abstract class C05990Rw {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.app.Dialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.app.Dialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.app.Dialog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.view.KeyEvent r8, android.view.View r9, android.view.Window.Callback r10, X.AnonymousClass013 r11) {
        /*
            r4 = 0
            if (r11 == 0) goto L_0x00cb
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x000e
            boolean r0 = r11.BvE(r8)
            return r0
        L_0x000e:
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005d
            android.app.Activity r10 = (android.app.Activity) r10
            r10.onUserInteraction()
            android.view.Window r5 = r10.getWindow()
            r0 = 8
            boolean r0 = r5.hasFeature(r0)
            r7 = 1
            if (r0 == 0) goto L_0x0093
            android.app.ActionBar r6 = r10.getActionBar()
            int r1 = r8.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x0093
            if (r6 == 0) goto L_0x0093
            boolean r0 = A02
            if (r0 != 0) goto L_0x0048
            java.lang.Class r3 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.String r2 = "onMenuKeyEvent"
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0046 }
            java.lang.Class<android.view.KeyEvent> r0 = android.view.KeyEvent.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0G(r3, r0, r2, r1, r4)     // Catch:{ NoSuchMethodException -> 0x0046 }
            A01 = r0     // Catch:{ NoSuchMethodException -> 0x0046 }
        L_0x0046:
            A02 = r7
        L_0x0048:
            java.lang.reflect.Method r1 = A01
            if (r1 == 0) goto L_0x0093
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0093 }
            r0[r4] = r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0093 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0093 }
            if (r0 == 0) goto L_0x0093
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0093 }
            if (r0 == 0) goto L_0x0093
            goto L_0x00ba
        L_0x005d:
            boolean r0 = r10 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x00bc
            android.app.Dialog r10 = (android.app.Dialog) r10
            boolean r0 = A03
            if (r0 != 0) goto L_0x0077
            r2 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r0 = "mOnKeyListener"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0075 }
            A00 = r0     // Catch:{ NoSuchFieldException -> 0x0075 }
            r0.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0075 }
        L_0x0075:
            A03 = r2
        L_0x0077:
            java.lang.reflect.Field r0 = A00
            if (r0 == 0) goto L_0x0084
            java.lang.Object r1 = r0.get(r10)     // Catch:{ IllegalAccessException -> 0x0084 }
            android.content.DialogInterface$OnKeyListener r1 = (android.content.DialogInterface.OnKeyListener) r1     // Catch:{ IllegalAccessException -> 0x0084 }
            if (r1 == 0) goto L_0x0084
            goto L_0x00b0
        L_0x0084:
            android.view.Window r1 = r10.getWindow()
            boolean r0 = r1.superDispatchKeyEvent(r8)
            if (r0 != 0) goto L_0x00ba
            android.view.View r1 = r1.getDecorView()
            goto L_0x009d
        L_0x0093:
            boolean r0 = r5.superDispatchKeyEvent(r8)
            if (r0 != 0) goto L_0x00ba
            android.view.View r1 = r5.getDecorView()
        L_0x009d:
            boolean r0 = X.C012005e.A0e(r1, r8)
            if (r0 != 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00ae
            android.view.KeyEvent$DispatcherState r0 = r1.getKeyDispatcherState()
        L_0x00a9:
            boolean r0 = r8.dispatch(r10, r0, r10)
            return r0
        L_0x00ae:
            r0 = 0
            goto L_0x00a9
        L_0x00b0:
            int r0 = r8.getKeyCode()
            boolean r0 = r1.onKey(r10, r0, r8)
            if (r0 == 0) goto L_0x0084
        L_0x00ba:
            r0 = 1
            return r0
        L_0x00bc:
            if (r9 == 0) goto L_0x00c4
            boolean r0 = X.C012005e.A0e(r9, r8)
            if (r0 != 0) goto L_0x00ca
        L_0x00c4:
            boolean r0 = r11.BvE(r8)
            if (r0 == 0) goto L_0x00cb
        L_0x00ca:
            r4 = 1
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05990Rw.A00(android.view.KeyEvent, android.view.View, android.view.Window$Callback, X.013):boolean");
    }
}
