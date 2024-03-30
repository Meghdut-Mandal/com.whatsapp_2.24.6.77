package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: X.9i9  reason: invalid class name and case insensitive filesystem */
public class C200749i9 {
    public static final Method A00;
    public static final Method A01;
    public static final Class A02;

    static {
        Method method;
        Method method2;
        Class A002 = AnonymousClass11t.A00("javax.crypto.spec.GCMParameterSpec", C200749i9.class);
        A02 = A002;
        if (A002 != null) {
            try {
                method2 = (Method) AccessController.doPrivileged(new AXI("getTLen"));
            } catch (PrivilegedActionException unused) {
                method2 = null;
            }
            A01 = method2;
            try {
                method = (Method) AccessController.doPrivileged(new AXI("getIV"));
            } catch (PrivilegedActionException unused2) {
                method = null;
            }
        } else {
            method = null;
        }
        A00 = method;
    }

    public static AlgorithmParameterSpec A00(AnonymousClass121 r6) {
        C22623Arp arp;
        if (r6 != null) {
            try {
                arp = new C22623Arp(C22656AsM.A04(r6));
            } catch (NoSuchMethodException unused) {
                throw new InvalidParameterSpecException("No constructor found!");
            } catch (Exception e) {
                throw new InvalidParameterSpecException(C36331k8.A0i("Construction failed: ", AnonymousClass000.A0u(), e));
            }
        } else {
            arp = null;
        }
        Constructor constructor = A02.getConstructor(new Class[]{Integer.TYPE, byte[].class});
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, arp.A00 * 8, 0);
        objArr[1] = AnonymousClass124.A02(arp.A01);
        return (AlgorithmParameterSpec) constructor.newInstance(objArr);
    }
}
