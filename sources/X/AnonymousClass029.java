package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.029  reason: invalid class name */
public class AnonymousClass029 {
    public static final AnonymousClass007 A01 = new AnonymousClass007(0);
    public final /* synthetic */ AnonymousClass01z A00;

    public AnonymousClass029(AnonymousClass01z r1) {
        this.A00 = r1;
    }

    public AnonymousClass02E A00(String str) {
        C13150jO r1;
        try {
            ClassLoader classLoader = this.A00.A07.A01.getClassLoader();
            try {
                AnonymousClass007 r12 = A01;
                AnonymousClass007 r2 = (AnonymousClass007) r12.get(classLoader);
                if (r2 == null) {
                    r2 = new AnonymousClass007(0);
                    r12.put(classLoader, r2);
                }
                Class<?> cls = (Class) r2.get(str);
                if (cls == null) {
                    cls = Class.forName(str, false, classLoader);
                    r2.put(str, cls);
                }
                return (AnonymousClass02E) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to instantiate fragment ");
                sb.append(str);
                sb.append(": make sure class name exists");
                r1 = new C13150jO(sb.toString(), e);
                throw r1;
            } catch (ClassCastException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to instantiate fragment ");
                sb2.append(str);
                sb2.append(": make sure class is a valid subclass of Fragment");
                r1 = new C13150jO(sb2.toString(), e2);
                throw r1;
            }
        } catch (InstantiationException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C13150jO(sb3.toString(), e3);
        } catch (IllegalAccessException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C13150jO(sb4.toString(), e4);
        } catch (NoSuchMethodException e5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": could not find Fragment constructor");
            throw new C13150jO(sb5.toString(), e5);
        } catch (InvocationTargetException e6) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Unable to instantiate fragment ");
            sb6.append(str);
            sb6.append(": calling Fragment constructor caused an exception");
            throw new C13150jO(sb6.toString(), e6);
        }
    }

    public AnonymousClass029() {
    }
}
