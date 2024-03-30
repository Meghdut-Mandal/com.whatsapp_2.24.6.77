package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6GY  reason: invalid class name */
public abstract class AnonymousClass6GY {
    public static final boolean A00(Object obj, Object obj2) {
        int compare;
        if (obj != obj2) {
            int i = 0;
            if (!(obj == null || obj2 == null)) {
                Class<?> cls = obj.getClass();
                if (AnonymousClass00C.A0J(cls, obj2.getClass())) {
                    if (obj instanceof Float) {
                        compare = Float.compare(C36441kJ.A03(obj), C36441kJ.A03(obj2));
                    } else if (obj instanceof Double) {
                        compare = Double.compare(C90504aG.A01(obj), C90504aG.A01(obj2));
                    } else if (obj instanceof AnonymousClass7cF) {
                        return ((C161997nq) ((AnonymousClass7cF) obj)).BLj((C161997nq) obj2);
                    } else {
                        if (cls.isArray()) {
                            if (obj instanceof byte[]) {
                                return Arrays.equals((byte[]) obj, (byte[]) obj2);
                            }
                            if (obj instanceof short[]) {
                                return Arrays.equals((short[]) obj, (short[]) obj2);
                            }
                            if (obj instanceof char[]) {
                                return Arrays.equals((char[]) obj, (char[]) obj2);
                            }
                            if (obj instanceof int[]) {
                                return Arrays.equals((int[]) obj, (int[]) obj2);
                            }
                            if (obj instanceof long[]) {
                                return Arrays.equals((long[]) obj, (long[]) obj2);
                            }
                            if (obj instanceof float[]) {
                                return Arrays.equals((float[]) obj, (float[]) obj2);
                            }
                            if (obj instanceof double[]) {
                                return Arrays.equals((double[]) obj, (double[]) obj2);
                            }
                            if (obj instanceof boolean[]) {
                                return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                            }
                            Object[] objArr = (Object[]) obj;
                            Object[] objArr2 = (Object[]) obj2;
                            int length = objArr.length;
                            if (length != objArr2.length) {
                                return false;
                            }
                            while (i < length) {
                                if (!A00(objArr[i], objArr2[i])) {
                                    return false;
                                }
                                i++;
                            }
                        } else if ((obj instanceof List) && (obj instanceof RandomAccess)) {
                            List list = (List) obj;
                            List list2 = (List) obj2;
                            if (list.size() != list2.size()) {
                                return false;
                            }
                            int size = list.size();
                            while (i < size) {
                                if (!A00(list.get(i), list2.get(i))) {
                                    return false;
                                }
                                i++;
                            }
                        } else if (!(obj instanceof Collection)) {
                            return obj.equals(obj2);
                        } else {
                            Collection<Object> collection = (Collection) obj;
                            Collection collection2 = (Collection) obj2;
                            if (collection.size() != collection2.size()) {
                                return false;
                            }
                            Iterator it = collection2.iterator();
                            for (Object A00 : collection) {
                                if (!A00(A00, it.next())) {
                                    return false;
                                }
                            }
                        }
                    }
                    return compare == 0;
                }
            }
            return false;
        }
    }

    public static final boolean A01(Object obj, Object obj2) {
        if (obj != obj2) {
            Class<?> cls = obj.getClass();
            if (AnonymousClass00C.A0J(cls, obj2.getClass())) {
                Field[] declaredFields = cls.getDeclaredFields();
                AnonymousClass00C.A08(declaredFields);
                int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    Field field = declaredFields[i];
                    try {
                        boolean isAccessible = field.isAccessible();
                        if (!isAccessible) {
                            field.setAccessible(true);
                        }
                        Object obj3 = field.get(obj);
                        Object obj4 = field.get(obj2);
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        if (A00(obj3, obj4)) {
                            i++;
                        }
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Unable to get fields by reflection.", e);
                    }
                }
            }
            return false;
        }
        return true;
    }
}
