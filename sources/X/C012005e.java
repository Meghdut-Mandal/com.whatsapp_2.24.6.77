package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public abstract class C012005e {
    public static ThreadLocal A00;
    public static Field A01;
    public static boolean A02;
    public static Method A03;
    public static Method A04;
    public static WeakHashMap A05;
    public static boolean A06;
    public static final C012105f A07 = C012205g.A00;
    public static final C012305h A08 = new C012305h();
    public static final int[] A09 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final AtomicInteger A0A = new AtomicInteger(1);

    public static void A0Y(View view, AnonymousClass0Yd r8, C16710px r9, CharSequence charSequence) {
        C16710px r2 = r9;
        CharSequence charSequence2 = charSequence;
        if (r9 == null && charSequence == null) {
            A0R(view, ((AccessibilityNodeInfo.AccessibilityAction) r8.A03).getId());
        } else {
            AnonymousClass0Yd r1 = new AnonymousClass0Yd(r2, charSequence2, r8.A02, (Object) null, r8.A00);
            A0L(view);
            A0R(view, ((AccessibilityNodeInfo.AccessibilityAction) r1.A03).getId());
            A0C(view).add(r1);
        }
        A0O(view, 0);
    }

    public static void A0Z(View view, CharSequence charSequence) {
        new C18130sf(2).A02(view, charSequence);
    }

    public static void A0a(View view, boolean z) {
        new C18130sf(3).A02(view, Boolean.valueOf(z));
    }

    public static boolean A0c(View view) {
        Boolean bool = (Boolean) new C18130sf(3).A00(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0d(View view) {
        Boolean bool = (Boolean) new C18130sf(0).A00(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static int A00(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AnonymousClass07A.A00(view);
        }
        return 0;
    }

    public static View.AccessibilityDelegate A01(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C012905p.A00(view);
        }
        if (A02) {
            return null;
        }
        if (A01 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A02 = true;
                return null;
            }
        }
        Object obj = A01.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View A02(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass07R.A00(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static AnonymousClass0X6 A06(View view, AnonymousClass0X6 r4) {
        C012105f r3;
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(r4);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C07280Xa.A00(view, r4);
        }
        C16690pv r0 = (C16690pv) view.getTag(R.id.tag_on_receive_content_listener);
        if (r0 != null && (r4 = r0.BeE(view, r4)) == null) {
            return null;
        }
        if (view instanceof C012105f) {
            r3 = (C012105f) view;
        } else {
            r3 = A07;
        }
        return r3.BeF(r4);
    }

    public static AnonymousClass0V7 A07(View view) {
        WeakHashMap weakHashMap = A05;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A05 = weakHashMap;
        }
        AnonymousClass0V7 r1 = (AnonymousClass0V7) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0V7 r12 = new AnonymousClass0V7(view);
        A05.put(view, r12);
        return r12;
    }

    public static AnonymousClass09H A08(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass09S.A00(view);
        }
        return A09(view);
    }

    public static AnonymousClass09H A09(View view) {
        if (C06000Rx.A03 && view.isAttachedToWindow()) {
            try {
                Object obj = C06000Rx.A02.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) C06000Rx.A01.get(obj);
                    Rect rect2 = (Rect) C06000Rx.A00.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        AnonymousClass09O r4 = new AnonymousClass09O();
                        AnonymousClass09T A002 = AnonymousClass09T.A00(rect.left, rect.top, rect.right, rect.bottom);
                        AnonymousClass09P r42 = r4.A00;
                        r42.A05(A002);
                        r42.A06(AnonymousClass09T.A00(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        AnonymousClass09H A003 = r42.A00();
                        AnonymousClass09I r1 = A003.A00;
                        r1.A0G(A003);
                        r1.A0F(view.getRootView());
                        return A003;
                    }
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get insets from AttachInfo. ");
                sb.append(e.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e);
            }
        }
        return null;
    }

    public static void A0D() {
        Class<View> cls = View.class;
        try {
            A04 = cls.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A03 = cls.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        A06 = true;
    }

    public static void A0E(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C012905p.A01(context, typedArray, attributeSet, view, iArr, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.C011004s.A02(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(android.content.res.ColorStateList r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            A0G(r2, r3)
            if (r1 != r0) goto L_0x002f
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.C011004s.A01(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = X.C011004s.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002c
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002c:
            X.C011504z.A04(r2, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012005e.A0F(android.content.res.ColorStateList, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.C011004s.A02(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(android.graphics.PorterDuff.Mode r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            A0I(r2, r3)
            if (r1 != r0) goto L_0x002f
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.C011004s.A01(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = X.C011004s.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002c
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002c:
            X.C011504z.A04(r2, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012005e.A0H(android.graphics.PorterDuff$Mode, android.view.View):void");
    }

    public static void A0J(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass08E.A01(view);
            return;
        }
        if (!A06) {
            A0D();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void A0K(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass08E.A02(view);
            return;
        }
        if (!A06) {
            A0D();
        }
        Method method = A04;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void A0P(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            A0M(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0M((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0Q(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            A0M(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0M((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0S(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass07A.A01(view, i);
        }
    }

    public static void A0T(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass09S.A01(view, i);
        }
    }

    public static void A0V(View view, C011705b r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null && (A01(view) instanceof C011905d)) {
            r2 = new C011705b();
        }
        if (C011504z.A00(view) == 0) {
            C011504z.A06(view, 1);
        }
        if (r2 == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = r2.A00;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0W(View view, C16690pv r6, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            C07280Xa.A01(view, r6, strArr);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        boolean z2 = false;
        if (strArr != null) {
            z2 = true;
        }
        AnonymousClass0YM.A03(z2, "When the listener is set, MIME types must also be set");
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("A MIME type set here must not start with *: ");
            sb.append(Arrays.toString(strArr));
            AnonymousClass0YM.A03(!z, sb.toString());
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, r6);
    }

    public static void A0X(View view, AnonymousClass08C r3) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (r3 != null) {
                obj = r3.A01();
            } else {
                obj = null;
            }
            AnonymousClass08E.A00((PointerIcon) obj, view);
        }
    }

    public static boolean A0e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        AnonymousClass0Y2 r6 = (AnonymousClass0Y2) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (r6 == null) {
            r6 = new AnonymousClass0Y2();
            view.setTag(R.id.tag_unhandled_key_event_manager, r6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r6.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = AnonymousClass0Y2.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (r6.A02 == null) {
                        r6.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            r6.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                r6.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = AnonymousClass0Y2.A00(keyEvent, view, r6);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (A002 == null) {
                return false;
            }
            if (KeyEvent.isModifierKey(keyCode)) {
                return true;
            }
            SparseArray sparseArray = r6.A00;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                r6.A00 = sparseArray;
            }
            sparseArray.put(keyCode, new WeakReference(A002));
            return true;
        } else if (A002 != null) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0f(android.view.View r3, android.view.KeyEvent r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0026
            r1 = 2131434568(0x7f0b1c48, float:1.8490954E38)
            r0 = 2131434568(0x7f0b1c48, float:1.8490954E38)
            java.lang.Object r1 = r3.getTag(r1)
            X.0Y2 r1 = (X.AnonymousClass0Y2) r1
            if (r1 != 0) goto L_0x001c
            X.0Y2 r1 = new X.0Y2
            r1.<init>()
            r3.setTag(r0, r1)
        L_0x001c:
            java.lang.ref.WeakReference r0 = r1.A01
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L_0x0028
        L_0x0026:
            r0 = 0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.A01 = r0
            android.util.SparseArray r3 = r1.A00
            if (r3 != 0) goto L_0x003a
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.A00 = r3
        L_0x003a:
            int r0 = r4.getAction()
            r2 = 1
            if (r0 != r2) goto L_0x0056
            int r0 = r4.getKeyCode()
            int r1 = r3.indexOfKey(r0)
            if (r1 < 0) goto L_0x0056
            java.lang.Object r0 = r3.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r3.removeAt(r1)
            if (r0 != 0) goto L_0x0062
        L_0x0056:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r3.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0026
        L_0x0062:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x008d
            boolean r0 = X.C011304x.A02(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 2131434569(0x7f0b1c49, float:1.8490956E38)
            java.lang.Object r1 = r1.getTag(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            if (r1 == 0) goto L_0x008d
            int r0 = r1.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L_0x008d
            r1.get(r0)
            java.lang.String r1 = "onUnhandledKeyEvent"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x008d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012005e.A0f(android.view.View, android.view.KeyEvent):boolean");
    }

    public static String[] A0g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C07280Xa.A02(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static WindowInsets A03(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets A04(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static C011705b A05(View view) {
        View.AccessibilityDelegate A012 = A01(view);
        if (A012 == null) {
            return null;
        }
        if (A012 instanceof C011905d) {
            return ((C011905d) A012).A00;
        }
        return new C011705b(A012);
    }

    public static AnonymousClass09H A0A(View view, AnonymousClass09H r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A032 = A03(view, A062);
            if (!A032.equals(A062)) {
                return AnonymousClass09H.A01(view, A032);
            }
        }
        return r3;
    }

    public static AnonymousClass09H A0B(View view, AnonymousClass09H r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A042 = A04(view, A062);
            if (!A042.equals(A062)) {
                return AnonymousClass09H.A01(view, A042);
            }
        }
        return r3;
    }

    public static ArrayList A0C(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void A0L(View view) {
        C011705b A052 = A05(view);
        if (A052 == null) {
            A052 = new C011705b();
        }
        A0V(view, A052);
    }

    public static void A0M(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void A0N(View view, int i) {
        A0R(view, i);
        A0O(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r6.getWindowVisibility() != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0O(android.view.View r6, int r7) {
        /*
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r5 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x005e
            r4 = 1
            X.0sf r0 = new X.0sf
            r0.<init>(r4)
            java.lang.Object r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x002b
            int r0 = r6.getWindowVisibility()
            r3 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            int r1 = X.C011304x.A00(r6)
            r0 = 32
            if (r1 != 0) goto L_0x0092
            if (r3 != 0) goto L_0x0092
            if (r7 != r0) goto L_0x005f
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r6.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            A0b(r2, r7)
            r2.setSource(r6)
            r6.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            X.0sf r0 = new X.0sf
            r0.<init>(r4)
            java.lang.Object r0 = r0.A00(r6)
            r1.add(r0)
            r5.sendAccessibilityEvent(r2)
        L_0x005e:
            return
        L_0x005f:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L_0x005e
            android.view.ViewParent r0 = r6.getParent()
            A0U(r6, r6, r0, r7)     // Catch:{ AbstractMethodError -> 0x006d }
            goto L_0x0091
        L_0x006d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.view.ViewParent r0 = r6.getParent()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " does not fully implement ViewParent"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x0091:
            return
        L_0x0092:
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r3 != 0) goto L_0x009a
            r0 = 2048(0x800, float:2.87E-42)
        L_0x009a:
            r2.setEventType(r0)
            A0b(r2, r7)
            if (r3 == 0) goto L_0x00bb
            java.util.List r1 = r2.getText()
            X.0sf r0 = new X.0sf
            r0.<init>(r4)
            java.lang.Object r0 = r0.A00(r6)
            r1.add(r0)
            int r0 = X.C011504z.A00(r6)
            if (r0 != 0) goto L_0x00bb
            X.C011504z.A06(r6, r4)
        L_0x00bb:
            r6.sendAccessibilityEventUnchecked(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012005e.A0O(android.view.View, int):void");
    }

    public static void A0R(View view, int i) {
        ArrayList A0C = A0C(view);
        for (int i2 = 0; i2 < A0C.size(); i2++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((AnonymousClass0Yd) A0C.get(i2)).A03).getId() == i) {
                A0C.remove(i2);
                return;
            }
        }
    }

    public static void A0G(ColorStateList colorStateList, View view) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void A0I(PorterDuff.Mode mode, View view) {
        view.setBackgroundTintMode(mode);
    }

    public static void A0b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static void A0U(View view, View view2, ViewParent viewParent, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }
}
