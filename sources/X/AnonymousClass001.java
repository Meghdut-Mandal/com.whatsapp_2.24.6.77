package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.001  reason: invalid class name */
public abstract class AnonymousClass001 {
    public static float A00(float f, float f2, float f3) {
        return f2 + (f3 * (f - f2));
    }

    public static int A02(int i, int i2, int i3) {
        return Math.max(i3, i - i2);
    }

    public static int A04(View view, int i, int i2) {
        return (i - i2) - view.getPaddingRight();
    }

    public static Object[] A0L() {
        return new Object[1];
    }

    public static Object[] A0M() {
        return new Object[2];
    }

    public static int A01(int i, int i2) {
        return ((i - 7) & i2) + (i2 & 7);
    }

    public static Rect A06() {
        return new Rect();
    }

    public static Bundle A07() {
        return new Bundle();
    }

    public static IllegalArgumentException A08(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A09(String str) {
        return new IllegalStateException(str);
    }

    public static NullPointerException A0A(String str) {
        return new NullPointerException(str);
    }

    public static RuntimeException A0B(Throwable th) {
        return new RuntimeException(th);
    }

    public static UnsupportedOperationException A0D() {
        return new UnsupportedOperationException();
    }

    public static UnsupportedOperationException A0E(String str) {
        return new UnsupportedOperationException(str);
    }

    public static WeakReference A0F(Object obj) {
        return new WeakReference(obj);
    }

    public static Method A0G(Class cls, Object obj, String str, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getMethod(str, clsArr);
    }

    public static Method A0H(Class cls, Object obj, String str, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getDeclaredMethod(str, clsArr);
    }

    public static ArrayList A0I() {
        return new ArrayList();
    }

    public static HashMap A0J() {
        return new HashMap();
    }

    public static int A03(View view, int i) {
        return View.combineMeasuredStates(i, view.getMeasuredState());
    }

    public static int A05(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i).getVisibility();
    }

    public static String A0C(Iterator it) {
        return (String) it.next();
    }

    public static C15560nX A0K(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        return (C15560nX) atomicReferenceFieldUpdater.get(obj);
    }
}
