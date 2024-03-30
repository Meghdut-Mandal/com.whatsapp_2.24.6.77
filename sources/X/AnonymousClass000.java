package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.000  reason: invalid class name */
public abstract class AnonymousClass000 {
    public static int A02(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static int A05(int i, int i2) {
        return Math.abs(i - i2);
    }

    public static int A0K(Object obj, Object[] objArr) {
        objArr[0] = obj;
        return Arrays.hashCode(objArr);
    }

    public static int A0L(Object obj, Object[] objArr) {
        objArr[1] = obj;
        return Arrays.hashCode(objArr);
    }

    public static long A0N(int i, long j) {
        long j2 = (((long) i) * 72340172838076673L) ^ j;
        return (~j2) & (j2 - 72340172838076673L);
    }

    public static long A0Q(long j) {
        return ((~j) << 7) & j;
    }

    public static long A0R(long j) {
        return j & ((~j) << 7) & -9187201950435737472L;
    }

    public static Object A0h(Class cls, Object obj, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static void A15(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
        objArr[7] = obj4;
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static boolean A1O(int i) {
        return i == 1;
    }

    public static boolean A1P(int i) {
        return i != 0;
    }

    public static boolean A1Q(int i) {
        return i == 0;
    }

    public static boolean A1R(int i) {
        return i > 0;
    }

    public static boolean A1S(int i, int i2) {
        return i == i2;
    }

    public static boolean A1T(int i, int i2) {
        return i < i2;
    }

    public static boolean A1V(Object obj) {
        return obj != null;
    }

    public static boolean A1W(Object obj) {
        return obj == null;
    }

    public static Object[] A1b(Object obj) {
        return new Object[]{obj};
    }

    public static float A01(AnonymousClass0NO r0, int i) {
        return r0.A0p.getResources().getDimension(i);
    }

    public static int A03(int i) {
        if (i <= 0) {
            return 0;
        }
        AnonymousClass0GA r0 = C05860Ri.A01;
        return Math.max(7, -1 >>> Integer.numberOfLeadingZeros(i));
    }

    public static int A08(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A0E(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        return i + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0F(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        return i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static int A0H(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0I(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A0J(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A0M(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.hashCode(objArr);
    }

    public static long A0P(long j) {
        return j & (j - 1);
    }

    public static long A0S(long[] jArr, int i) {
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return ((jArr[i2 + 1] << (64 - i3)) & ((-((long) i3)) >> 63)) | (jArr[i2] >>> i3);
    }

    public static long A0T(long[] jArr, int i) {
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static IllegalStateException A0e() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static RuntimeException A0j() {
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0s(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static StringBuilder A0u() {
        return new StringBuilder();
    }

    public static StringBuilder A0v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0w(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        return sb;
    }

    public static UnsupportedOperationException A0x() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static void A12(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static void A1E(StringBuilder sb, int i, int i2) {
        if (i < i2) {
            sb.append(',');
            sb.append(' ');
        }
    }

    public static void A1G(C15460nN r2) {
        if (C15460nN.A01.addAndGet(r2, -65536) == r2.A04() && r2.A00() != null) {
            r2.A02();
        }
    }

    public static void A1H(long[] jArr, int i) {
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
    }

    public static boolean A1X(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static long[] A1a(int i) {
        if (i == 0) {
            return C05860Ri.A00;
        }
        int i2 = ((((i + 1) + 7) + 7) & -8) >> 3;
        long[] jArr = new long[i2];
        Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        return jArr;
    }

    public static float A00(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static int A04(int i) {
        int i2 = i * -862048943;
        return i2 ^ (i2 << 16);
    }

    public static int A06(int i, int i2, long j) {
        return ((Long.numberOfTrailingZeros(j) >> 3) + i) & i2;
    }

    public static int A07(int i, int i2, long j) {
        return (i + (Long.numberOfTrailingZeros(j) >> 3)) & i2;
    }

    public static int A09(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A0A(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A0B(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static int A0C(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A0D(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A0G(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        return childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
    }

    public static Configuration A0U(Context context) {
        return context.getResources().getConfiguration();
    }

    public static PorterDuffColorFilter A0V(ColorStateList colorStateList, PorterDuff.Mode mode, Drawable drawable) {
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static Parcelable A0W(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static DisplayMetrics A0X(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static View A0Y(Reference reference) {
        return (View) reference.get();
    }

    public static View A0Z(AbstractList abstractList, int i) {
        return (View) abstractList.get(i);
    }

    public static ViewGroup.MarginLayoutParams A0a(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static IllegalArgumentException A0b(Object obj) {
        return new IllegalArgumentException(obj.toString());
    }

    public static IllegalArgumentException A0c(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0d(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0f(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static IllegalStateException A0g(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Object A0i(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0k(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0l(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0m(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A0n(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public static String A0o(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0p(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0q(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0r(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0t(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static Iterator A0y(Map map) {
        return map.entrySet().iterator();
    }

    public static Iterator A0z(Map map) {
        return map.values().iterator();
    }

    public static Iterator A10(Map map) {
        return map.keySet().iterator();
    }

    public static Map.Entry A11(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A13(Drawable drawable, View view) {
        drawable.setState(view.getDrawableState());
    }

    public static void A14(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A16(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A17(AnonymousClass0NO r1) {
        r1.onStateChange(r1.getState());
    }

    public static void A1A(Object obj, String str) {
        Log.w(str, obj.toString());
    }

    public static void A1B(Object obj, StringBuilder sb) {
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1C(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getSimpleName());
    }

    public static void A1D(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1F(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1I(Object[] objArr, float f, int i) {
        objArr[i] = Float.valueOf(f);
    }

    public static void A1J(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
    }

    public static void A1K(Object[] objArr, int i) {
        objArr[1] = Integer.valueOf(i);
    }

    public static void A1L(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }

    public static void A1M(Object[] objArr, int i, long j) {
        objArr[i] = Long.valueOf(j);
    }

    public static void A1N(Object[] objArr, int i, boolean z) {
        objArr[i] = Boolean.valueOf(z);
    }

    public static boolean A1U(IBinder iBinder, Parcel parcel) {
        parcel.writeStrongBinder(iBinder);
        parcel.writeInt(1);
        return false;
    }

    public static boolean A1Y(Object obj, Method method, Object[] objArr) {
        return ((Boolean) method.invoke(obj, objArr)).booleanValue();
    }

    public static boolean A1Z(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static long A0O(long j) {
        return j & ((~j) << 6) & -9187201950435737472L;
    }
}
