package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class AX4 implements InvocationHandler {
    public final C006302t A00;
    public final C019108d A01;

    public Object invoke(Object obj, Method method, Object[] objArr) {
        boolean A1a = C36341k9.A1a(obj, method);
        boolean z = true;
        if (!AnonymousClass00C.A0J(method.getName(), "accept") || objArr == null || objArr.length != A1a) {
            z = false;
        }
        Object obj2 = null;
        boolean z2 = false;
        if (z) {
            C019108d r0 = this.A01;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            C05680Qq.A00(obj2, r0);
            AnonymousClass00C.A0D(obj2, 0);
            this.A00.invoke(obj2);
            return AnonymousClass0AJ.A00;
        } else if (AnonymousClass00C.A0J(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            if (obj == objArr[0]) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } else if (AnonymousClass00C.A0J(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return C165607th.A0j(this.A00);
        } else {
            if (AnonymousClass00C.A0J(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return this.A00.toString();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected method call object:");
            A0u.append(obj);
            A0u.append(", method: ");
            A0u.append(method);
            throw AnonymousClass001.A0E(AnonymousClass000.A0l(objArr, ", args: ", A0u));
        }
    }

    public AX4(C006302t r1, C019108d r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
