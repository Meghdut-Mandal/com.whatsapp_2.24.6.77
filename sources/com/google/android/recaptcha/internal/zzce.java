package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0AJ;
import X.C36381kD;
import X.C90464aC;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class zzce implements InvocationHandler {
    public final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (AnonymousClass00C.A0J(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (AnonymousClass00C.A0J(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (!AnonymousClass00C.A0J(method.getName(), "equals") || method.getParameterTypes().length == 0) {
            if (zza(obj, method, objArr)) {
                if ((this.zza != null || !AnonymousClass00C.A0J(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !AnonymousClass00C.A0J(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
                    throw C90464aC.A0P(method.getReturnType(), " cannot be returned from method with return type ", C36381kD.A11(this.zza));
                }
                Object obj3 = this.zza;
                if (obj3 != null) {
                    return obj3;
                }
            }
            return AnonymousClass0AJ.A00;
        }
        boolean z = false;
        if (!(objArr == null || objArr.length == 0 || AnonymousClass000.A0J(objArr[0]) != obj.hashCode())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
