package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.08f  reason: invalid class name and case insensitive filesystem */
public final class C019308f implements C019108d, C019208e {
    public static final HashMap A01;
    public static final Map A02;
    public static final Map A03;
    public static final HashMap A04;
    public static final HashMap A05;
    public final Class A00;

    public C019308f(Class cls) {
        AnonymousClass00C.A0D(cls, 1);
        this.A00 = cls;
    }

    static {
        int i = 0;
        List asList = Arrays.asList(new Class[]{AnonymousClass00S.class, C006302t.class, C009003v.class, C019408g.class, C019508h.class, C019608i.class, C019708j.class, C019808k.class, C019908l.class, C020008m.class, AnonymousClass08n.class, C020108o.class, C020208p.class, C020308q.class, C020408r.class, C020508s.class, C020608t.class, C020708u.class, C020808v.class, C020908w.class, C021008x.class, C021108y.class, C021208z.class});
        AnonymousClass00C.A08(asList);
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(asList, 10));
        for (Object next : asList) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass03T.A05();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                arrayList.add(new AnonymousClass011(next, Integer.valueOf(i)));
                i = i2;
            }
        }
        A02 = C000400e.A09(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        A04 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        A05 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("X.0Qo", "kotlin.String.Companion");
        hashMap3.put("X.0Ql", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AnonymousClass00C.A08(values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AnonymousClass00C.A0B(str);
            sb.append(AnonymousClass099.A0H(str, str));
            sb.append("CompanionObject");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            hashMap3.put(obj, sb2.toString());
        }
        for (Map.Entry entry : A02.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("X.00P");
            sb3.append(intValue);
            hashMap3.put(name, sb3.toString());
        }
        A01 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AnonymousClass099.A0H(str2, str2));
        }
        A03 = linkedHashMap;
    }

    public String BGN() {
        String str;
        Class cls = this.A00;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) A01.get(componentType.getName())) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("Array");
                String obj = sb.toString();
                if (obj == null) {
                    return "kotlin.Array";
                }
                return obj;
            }
            return "kotlin.Array";
        }
        String str2 = (String) A01.get(cls.getName());
        if (str2 == null) {
            return cls.getCanonicalName();
        }
        return str2;
    }

    public String BHa() {
        String str;
        StringBuilder sb;
        String name;
        Class cls = this.A00;
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    AnonymousClass00C.A0B(simpleName);
                    sb = new StringBuilder();
                    name = enclosingMethod.getName();
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        AnonymousClass00C.A0B(simpleName);
                        sb = new StringBuilder();
                        name = enclosingConstructor.getName();
                    } else {
                        AnonymousClass00C.A0B(simpleName);
                        AnonymousClass00C.A0D(simpleName, 0);
                        int A09 = AnonymousClass099.A09(simpleName, '$', 0, false);
                        if (A09 == -1) {
                            return simpleName;
                        }
                        String substring = simpleName.substring(A09 + 1, simpleName.length());
                        AnonymousClass00C.A08(substring);
                        return substring;
                    }
                }
                sb.append(name);
                sb.append('$');
                return AnonymousClass099.A0I(simpleName, sb.toString(), simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive() || (str = (String) A03.get(componentType.getName())) == null) {
                    return "Array";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Array");
                str2 = sb2.toString();
                if (str2 == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) A03.get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C019308f) || !AnonymousClass00C.A0J(C05620Qk.A00(this), C05620Qk.A00((C019108d) obj))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public int hashCode() {
        return C05620Qk.A00(this).hashCode();
    }

    public Class BDB() {
        return this.A00;
    }

    public List getAnnotations() {
        throw null;
    }
}
