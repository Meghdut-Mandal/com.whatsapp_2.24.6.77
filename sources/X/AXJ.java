package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

public final class AXJ implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;

    public AXJ(AlgorithmParameterSpec algorithmParameterSpec) {
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        Method method = C200749i9.A00;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new C22623Arp((byte[]) method.invoke(algorithmParameterSpec, new Object[0]), AnonymousClass000.A0I(C200749i9.A01.invoke(algorithmParameterSpec, new Object[0])) / 8);
    }
}
