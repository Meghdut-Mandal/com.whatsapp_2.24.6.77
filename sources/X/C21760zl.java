package X;

import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0zl  reason: invalid class name and case insensitive filesystem */
public abstract class C21760zl {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static volatile boolean A06;

    public static Object A01(Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException e) {
            Log.e("SystemPropertiesHiddenMembers/invoke/IllegalAccessException/", e);
            A06 = false;
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("SystemPropertiesHiddenMembers/invoke/InvocationTargetException/", e2);
            return null;
        }
    }

    static {
        boolean z;
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Class<String> cls2 = String.class;
            C21770zm r6 = new C21770zm(cls.getMethod("addChangeCallback", new Class[]{Runnable.class}), cls.getMethod("get", new Class[]{cls2}), cls.getMethod("getBoolean", new Class[]{cls2, Boolean.TYPE}), cls.getMethod("getInt", new Class[]{cls2, Integer.TYPE}), cls.getMethod("getLong", new Class[]{cls2, Long.TYPE}), cls.getMethod("set", new Class[]{cls2, cls2}));
            A00 = r6.A00;
            A03 = r6.A02;
            A02 = r6.A01;
            A01 = r6.A03;
            A04 = r6.A04;
            A05 = r6.A05;
            z = true;
        } catch (ClassNotFoundException e) {
            e = e;
            str = "SystemPropertiesHiddenMembers/newInstance/ClassNotFoundException/";
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "SystemPropertiesHiddenMembers/newInstance/NoSuchMethodException/";
        }
        A06 = z;
        Log.e(str, e);
        z = false;
        A06 = z;
    }

    public static long A00(String str) {
        if (A06) {
            Number number = (Number) A01(A04, str, 0L);
            if (number != null) {
                return number.longValue();
            }
        }
        return 0;
    }

    public static String A02(String str) {
        if (A06) {
            String str2 = (String) A01(A03, str);
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }
}
