package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/* renamed from: X.9YQ  reason: invalid class name */
public abstract class AnonymousClass9YQ {
    public final C194789Rg A00;

    public static C173718St A00(Class cls, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("can not map a ");
        sb.append(obj);
        sb.append(" to ");
        sb.append(cls.getName());
        return new C173718St(sb.toString());
    }

    public Object A01() {
        if (!(this instanceof C22576Ap5)) {
            if (this instanceof C22577Ap6) {
                try {
                    return C165607th.A0m(((C22577Ap6) this).A00);
                } catch (Exception unused) {
                    return null;
                }
            } else if (!(this instanceof C22575Ap4)) {
                if (this instanceof C22578Ap7) {
                    return AnonymousClass001.A0I();
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Invalid or non Implemented status");
                throw C90514aH.A0s(C165567td.A0W(this, " createArray() in ", A0u));
            }
        }
        return new C21900AcU();
    }

    public Object A02() {
        if (this instanceof C22576Ap5) {
            return C36431kI.A1G();
        }
        if (this instanceof C22577Ap6) {
            try {
                return C165607th.A0m(((C22577Ap6) this).A00);
            } catch (Exception unused) {
                return null;
            }
        } else if (this instanceof C22575Ap4) {
            return new C21901AcV();
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid or non Implemented status");
            throw C90514aH.A0s(C165567td.A0W(this, " createObject() in ", A0u));
        }
    }

    public Object A03(Object obj) {
        if (this instanceof C22564Aot) {
            List<Object> list = (List) obj;
            Object[] objArr = (Object[]) Array.newInstance(((C22564Aot) this).A01, list.size());
            int i = 0;
            for (Object obj2 : list) {
                objArr[i] = obj2;
                i++;
            }
            return objArr;
        } else if (this instanceof C22574Ap3) {
            return C36331k8.A0h(obj);
        } else {
            if (this instanceof C22573Ap2) {
                if (obj == null) {
                    return null;
                }
                Class<Long> cls = Long.class;
                Class<?> cls2 = obj.getClass();
                if (cls.isAssignableFrom(cls2)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls2) || Double.class.isAssignableFrom(cls2) || BigDecimal.class.isAssignableFrom(cls2) || Float.class.isAssignableFrom(cls2)) {
                    return C90514aH.A0m((Number) obj);
                }
                if (String.class.isAssignableFrom(cls2)) {
                    return Long.valueOf(obj.toString());
                }
                throw A00(cls, cls2);
            } else if (this instanceof C22572Ap1) {
                if (obj == null) {
                    return null;
                }
                Class<Integer> cls3 = Integer.class;
                Class<?> cls4 = obj.getClass();
                if (cls3.isAssignableFrom(cls4)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls4) || Double.class.isAssignableFrom(cls4) || BigDecimal.class.isAssignableFrom(cls4) || Float.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (String.class.isAssignableFrom(cls4)) {
                    return Integer.valueOf(obj.toString());
                }
                throw A00(cls3, cls4);
            } else if (this instanceof C22571Ap0) {
                if (obj == null) {
                    return null;
                }
                Class<Float> cls5 = Float.class;
                Class<?> cls6 = obj.getClass();
                if (cls5.isAssignableFrom(cls6)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls6) || Long.class.isAssignableFrom(cls6) || BigDecimal.class.isAssignableFrom(cls6) || Double.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (String.class.isAssignableFrom(cls6)) {
                    return Float.valueOf(obj.toString());
                }
                throw A00(cls5, cls6);
            } else if (this instanceof C22570Aoz) {
                if (obj == null) {
                    return null;
                }
                Class<Double> cls7 = Double.class;
                Class<?> cls8 = obj.getClass();
                if (cls7.isAssignableFrom(cls8)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls8) || Long.class.isAssignableFrom(cls8) || BigDecimal.class.isAssignableFrom(cls8) || Float.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                if (String.class.isAssignableFrom(cls8)) {
                    return Double.valueOf(obj.toString());
                }
                throw A00(cls7, cls8);
            } else if (this instanceof C22569Aoy) {
                if (obj == null) {
                    return null;
                }
                Class<Date> cls9 = Date.class;
                Class<?> cls10 = obj.getClass();
                if (cls9.isAssignableFrom(cls10)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls10)) {
                    return new Date(C36431kI.A09(obj));
                }
                if (String.class.isAssignableFrom(cls10)) {
                    try {
                        return DateFormat.getInstance().parse(obj.toString());
                    } catch (ParseException e) {
                        throw new C173718St((Throwable) e);
                    }
                } else {
                    throw A00(cls9, cls10);
                }
            } else if (this instanceof C22568Aox) {
                if (obj == null) {
                    return null;
                }
                Class<Boolean> cls11 = Boolean.class;
                Class<?> cls12 = obj.getClass();
                if (cls11.isAssignableFrom(cls12)) {
                    return obj;
                }
                throw A00(cls11, cls12);
            } else if (this instanceof C22567Aow) {
                if (obj == null) {
                    return null;
                }
                return new BigInteger(obj.toString());
            } else if (!(this instanceof C22566Aov)) {
                return obj;
            } else {
                if (obj == null) {
                    return null;
                }
                return C165617ti.A0b(obj.toString());
            }
        }
    }

    public AnonymousClass9YQ(C194789Rg r1) {
        this.A00 = r1;
    }
}
