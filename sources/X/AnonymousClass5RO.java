package X;

import java.lang.reflect.Method;

/* renamed from: X.5RO  reason: invalid class name */
public class AnonymousClass5RO extends ClassLoader {
    public static final String A00 = C202429lo.class.getName();
    public static final Class[] A01;

    public Class A00(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", A01);
            declaredMethod.setAccessible(true);
            ClassLoader parent = getParent();
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = bArr;
            AnonymousClass000.A1L(objArr, 0, 2);
            AnonymousClass000.A1L(objArr, bArr.length, 3);
            return (Class) declaredMethod.invoke(parent, objArr);
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    public synchronized Class loadClass(String str, boolean z) {
        Class cls;
        if (str.equals(A00)) {
            cls = C202429lo.class;
        } else {
            cls = super.loadClass(str, z);
        }
        return cls;
    }

    static {
        Class cls = Integer.TYPE;
        A01 = new Class[]{String.class, byte[].class, cls, cls};
    }

    public AnonymousClass5RO(ClassLoader classLoader) {
        super(classLoader);
    }
}
