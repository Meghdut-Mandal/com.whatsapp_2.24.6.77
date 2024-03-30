package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Vi  reason: invalid class name and case insensitive filesystem */
public abstract class C132806Vi {
    public static final Integer A00(Object obj, Object obj2) {
        int compareTo;
        boolean z = true;
        boolean A1W = AnonymousClass000.A1W(obj);
        if (obj2 != null) {
            z = false;
        }
        if (z ^ A1W) {
            throw new ClassCastException("One of the input is null, but the other one is not");
        } else if (obj == null || obj2 == null) {
            return 0;
        } else {
            AnonymousClass011 A01 = A01(obj, obj2);
            Object obj3 = A01.first;
            Object obj4 = A01.second;
            if (obj3.getClass() == obj4.getClass()) {
                if (obj3 instanceof Long) {
                    int i = (C36431kI.A09(obj3) > C36431kI.A09(obj4) ? 1 : (C36431kI.A09(obj3) == C36431kI.A09(obj4) ? 0 : -1));
                    if (i < 0) {
                        compareTo = -1;
                    } else {
                        compareTo = C90504aG.A1T(i);
                    }
                } else if (obj3 instanceof Double) {
                    compareTo = Double.compare(C90504aG.A01(obj3), C90504aG.A01(obj4));
                } else if (obj3 instanceof Boolean) {
                    compareTo = Boolean.compare(AnonymousClass000.A1X(obj3), AnonymousClass000.A1X(obj4));
                } else if (!(obj3 instanceof String)) {
                    return null;
                } else {
                    compareTo = ((String) obj3).compareTo((String) obj4);
                }
                return Integer.valueOf(compareTo);
            }
            throw new ClassCastException("Two input are not the same type");
        }
    }

    public static final AnonymousClass011 A01(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Number)) {
            return C36441kJ.A19(obj, Double.valueOf(C90504aG.A01(obj2)));
        }
        if ((obj instanceof Number) && (obj2 instanceof Double)) {
            return C36441kJ.A19(Double.valueOf(C90504aG.A01(obj)), obj2);
        }
        if (obj instanceof Integer) {
            obj = C90484aE.A0h((Number) obj);
        }
        if (obj2 instanceof Integer) {
            obj2 = C90484aE.A0h((Number) obj2);
        }
        return C36441kJ.A19(obj, obj2);
    }

    public static final boolean A02(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return AnonymousClass00C.A0J(obj2, obj);
        }
        AnonymousClass011 A01 = A01(obj, obj2);
        Object obj3 = A01.first;
        Object obj4 = A01.second;
        if (obj3.getClass() != obj4.getClass()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The two values for comparison are different classes. Expected: ");
            A0u.append(C36441kJ.A1A(obj.getClass()).BHa());
            A0u.append(", Actual: ");
            throw new ClassCastException(AnonymousClass000.A0q(C36441kJ.A1A(obj2.getClass()).BHa(), A0u));
        } else if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            JSONObject jSONObject2 = (JSONObject) obj4;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass00C.A08(keys);
            while (keys.hasNext()) {
                String A0C = AnonymousClass001.A0C(keys);
                if (!A02(jSONObject.opt(A0C), jSONObject2.opt(A0C))) {
                    return false;
                }
            }
            return true;
        } else if (obj3 instanceof JSONArray) {
            return A04((JSONArray) obj3, (JSONArray) obj4);
        } else {
            if ((obj3 instanceof Number) || (obj3 instanceof Boolean) || (obj3 instanceof String)) {
                return obj3.equals(obj4);
            }
            throw AnonymousClass001.A0E("The class type is currently not supported, only supports Number, Boolean, String, JSONObject, and JSONArray");
        }
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() != 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    Object obj3 = jSONArray.get(i);
                    AnonymousClass00C.A08(obj3);
                    AnonymousClass011 A01 = A01(obj3, obj2);
                    Object obj4 = A01.first;
                    Object obj5 = A01.second;
                    Class<?> cls = obj4.getClass();
                    if (cls == obj5.getClass()) {
                        i++;
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("The two values for comparison are different classes. Expected: ");
                        A0u.append(C36441kJ.A1A(cls).BHa());
                        A0u.append(", Actual: ");
                        throw new ClassCastException(AnonymousClass000.A0q(C36441kJ.A1A(obj2.getClass()).BHa(), A0u));
                    }
                }
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (A02(jSONArray.get(i2), obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw AnonymousClass001.A0E("Expected value is not an array");
    }

    public static final boolean A04(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                if (A02(jSONArray.get(i), jSONArray2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
