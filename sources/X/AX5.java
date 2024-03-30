package X;

import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class AX5 implements InvocationHandler {
    public final C019108d A00;

    public Object invoke(Object obj, Method method, Object[] objArr) {
        boolean A1X;
        boolean A1a = C36341k9.A1a(obj, method);
        boolean z = true;
        if (!AnonymousClass00C.A0J(method.getName(), "test") || !method.getReturnType().equals(Boolean.TYPE) || objArr == null || objArr.length != A1a) {
            z = false;
        }
        Pair pair = null;
        boolean z2 = false;
        if (z) {
            C019108d r0 = this.A00;
            if (objArr != null) {
                pair = objArr[0];
            }
            C05680Qq.A00(pair, r0);
            if (this instanceof AnonymousClass80T) {
                AnonymousClass00C.A0D(pair, 1);
                A1X = C90464aC.A1Y(pair, ((AnonymousClass80T) this).A00);
            } else {
                AnonymousClass80U r3 = (AnonymousClass80U) this;
                Pair pair2 = pair;
                AnonymousClass00C.A0D(pair2, 1);
                C019108d r02 = r3.A01;
                Object obj2 = pair2.first;
                C05680Qq.A00(obj2, r02);
                C019108d r03 = r3.A02;
                Object obj3 = pair2.second;
                C05680Qq.A00(obj3, r03);
                A1X = AnonymousClass000.A1X(r3.A00.invoke(obj2, obj3));
            }
            return Boolean.valueOf(A1X);
        } else if (AnonymousClass00C.A0J(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            Object obj4 = objArr[0];
            AnonymousClass00C.A0B(obj4);
            if (obj == obj4) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } else if (AnonymousClass00C.A0J(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return C165607th.A0j(this);
        } else {
            if (AnonymousClass00C.A0J(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return toString();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected method call object:");
            A0u.append(obj);
            A0u.append(", method: ");
            A0u.append(method);
            throw AnonymousClass001.A0E(AnonymousClass000.A0l(objArr, ", args: ", A0u));
        }
    }

    public AX5(C019108d r1) {
        this.A00 = r1;
    }
}
