package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

public final class AXK implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;
    public final /* synthetic */ AZr A01;

    public AXK(AlgorithmParameterSpec algorithmParameterSpec, AZr aZr) {
        this.A01 = aZr;
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        AZr aZr = this.A01;
        Method method = C200749i9.A01;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new AZo(aZr, (byte[]) C200749i9.A00.invoke(algorithmParameterSpec, new Object[0]), (byte[]) null, AnonymousClass000.A0I(method.invoke(algorithmParameterSpec, new Object[0])));
    }
}
