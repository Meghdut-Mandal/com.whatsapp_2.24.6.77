package X;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: X.0YT  reason: invalid class name */
public abstract class AnonymousClass0YT {
    public static Field A00;
    public static boolean A01;
    public static Class A02;
    public static Field A03;
    public static Field A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;

    public static void A00(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            A02(resources);
        } else if (i >= 23) {
            A01(resources);
        } else {
            if (!A01) {
                try {
                    Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                    A00 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                }
                A01 = true;
            }
            Field field = A00;
            if (field != null) {
                try {
                    Map map = (Map) field.get(resources);
                    if (map != null) {
                        map.clear();
                    }
                } catch (IllegalAccessException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                }
            }
        }
    }

    public static void A01(Resources resources) {
        if (!A01) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    A03(obj);
                }
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
    }

    public static void A02(Resources resources) {
        String str;
        if (!A05) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                A03 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    if (!A01) {
                        try {
                            Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                            A00 = declaredField2;
                            declaredField2.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e2);
                        }
                        A01 = true;
                    }
                    Field field2 = A00;
                    if (field2 != null) {
                        try {
                            Object obj2 = field2.get(obj);
                            if (obj2 != null) {
                                A03(obj2);
                            }
                        } catch (IllegalAccessException e3) {
                            e = e3;
                            str = "Could not retrieve value from ResourcesImpl#mDrawableCache";
                            Log.e("ResourcesFlusher", str, e);
                        }
                    }
                }
            } catch (IllegalAccessException e4) {
                e = e4;
                str = "Could not retrieve value from Resources#mResourcesImpl";
                Log.e("ResourcesFlusher", str, e);
            }
        }
    }

    public static void A03(Object obj) {
        if (!A06) {
            try {
                A02 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            A06 = true;
        }
        Class cls = A02;
        if (cls != null) {
            if (!A07) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    A04 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                A07 = true;
            }
            Field field = A04;
            if (field != null) {
                try {
                    LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
                    if (longSparseArray != null) {
                        longSparseArray.clear();
                    }
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
            }
        }
    }
}
