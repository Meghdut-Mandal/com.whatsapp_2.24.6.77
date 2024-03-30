package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1R3  reason: invalid class name */
public final class AnonymousClass1R3 implements AnonymousClass1R2 {
    public static final AnonymousClass1R3 A00 = new AnonymousClass1R3();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect A01(android.app.Activity r11) {
        /*
            r10 = this;
            r5 = 0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.String r0 = "windowConfiguration"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            boolean r0 = X.C53022qa.A00(r11)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.String r4 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r0 == 0) goto L_0x0041
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.String r1 = "getBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            X.AnonymousClass00C.A0E(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            goto L_0x006d
        L_0x0041:
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.String r1 = "getAppBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            X.AnonymousClass00C.A0E(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005c }
            goto L_0x006d
        L_0x005c:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRectSize(r2)
        L_0x006d:
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r9 = r0.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            X.AnonymousClass00C.A08(r9)
            r9.getRealSize(r4)
            boolean r0 = X.C53022qa.A00(r11)
            if (r0 != 0) goto L_0x00a3
            android.content.res.Resources r6 = r11.getResources()
            java.lang.String r3 = "navigation_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r0 = r6.getIdentifier(r3, r1, r0)
            if (r0 <= 0) goto L_0x00cb
            int r3 = r6.getDimensionPixelSize(r0)
        L_0x009a:
            int r1 = r2.bottom
            int r1 = r1 + r3
            int r0 = r4.y
            if (r1 != r0) goto L_0x00ba
            r2.bottom = r1
        L_0x00a3:
            int r1 = r2.width()
            int r0 = r4.x
            if (r1 < r0) goto L_0x00b3
            int r1 = r2.height()
            int r0 = r4.y
            if (r1 >= r0) goto L_0x0158
        L_0x00b3:
            boolean r0 = X.C53022qa.A00(r11)
            if (r0 != 0) goto L_0x0158
            goto L_0x00cd
        L_0x00ba:
            int r1 = r2.right
            int r1 = r1 + r3
            int r0 = r4.x
            if (r1 != r0) goto L_0x00c4
            r2.right = r1
            goto L_0x00a3
        L_0x00c4:
            int r0 = r2.left
            if (r0 != r3) goto L_0x00a3
            r2.left = r5
            goto L_0x00a3
        L_0x00cb:
            r3 = 0
            goto L_0x009a
        L_0x00cd:
            java.lang.String r0 = "android.view.DisplayInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r8 = 1
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Object r7 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.String r1 = "getDisplayInfo"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Class r3 = r7.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r0[r5] = r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r0[r5] = r7     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r1.invoke(r9, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.String r0 = "displayCutout"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            r0.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            java.lang.Object r3 = r0.get(r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            boolean r0 = r3 instanceof android.view.DisplayCutout     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            if (r0 == 0) goto L_0x0119
            android.view.DisplayCutout r3 = (android.view.DisplayCutout) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0113 }
            goto L_0x011a
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
        L_0x0119:
            r3 = 0
        L_0x011a:
            if (r3 == 0) goto L_0x0158
            int r1 = r2.left
            int r0 = X.AnonymousClass3SG.A01(r3)
            if (r1 != r0) goto L_0x0126
            r2.left = r5
        L_0x0126:
            int r1 = r4.x
            int r0 = r2.right
            int r1 = r1 - r0
            int r0 = X.AnonymousClass3SG.A02(r3)
            if (r1 != r0) goto L_0x013a
            int r1 = r2.right
            int r0 = X.AnonymousClass3SG.A02(r3)
            int r1 = r1 + r0
            r2.right = r1
        L_0x013a:
            int r1 = r2.top
            int r0 = X.AnonymousClass3SG.A03(r3)
            if (r1 != r0) goto L_0x0144
            r2.top = r5
        L_0x0144:
            int r1 = r4.y
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r0 = X.AnonymousClass3SG.A00(r3)
            if (r1 != r0) goto L_0x0158
            int r1 = r2.bottom
            int r0 = X.AnonymousClass3SG.A00(r3)
            int r1 = r1 + r0
            r2.bottom = r1
        L_0x0158:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R3.A01(android.app.Activity):android.graphics.Rect");
    }

    public final Rect A02(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            AnonymousClass00C.A0E(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w("WindowMetricsCalculatorCompat", e);
            return A01(activity);
        }
    }

    public final Rect A00(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C53022qa.A00(activity)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                    return rect;
                }
            }
        }
        return rect;
    }

    public AnonymousClass1R5 B3H(Activity activity) {
        Rect rect;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = AnonymousClass1R4.A00(activity);
        } else if (i2 >= 29) {
            rect = A02(activity);
        } else if (i2 >= 28) {
            rect = A01(activity);
        } else if (i2 >= 24) {
            rect = A00(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            AnonymousClass00C.A08(defaultDisplay);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect();
            int i3 = point.x;
            if (i3 == 0 || (i = point.y) == 0) {
                defaultDisplay.getRectSize(rect);
            } else {
                rect.right = i3;
                rect.bottom = i;
            }
        }
        return new AnonymousClass1R5(rect);
    }
}
