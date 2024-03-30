package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Ct  reason: invalid class name and case insensitive filesystem */
public abstract class C03000Ct implements AnonymousClass0Cs, Serializable {
    public static final Object NO_RECEIVER = C03040Cx.A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public transient AnonymousClass0Cs reflected;
    public final String signature;

    public abstract AnonymousClass0Cs computeReflected();

    public AnonymousClass0Cs compute() {
        AnonymousClass0Cs r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public C019008c getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new C12670iT(cls);
        }
        return new C019308f(cls);
    }

    public C03000Ct(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        getReflected().call(objArr);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public Object callBy(Map map) {
        getReflected().callBy(map);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public List getAnnotations() {
        getReflected().getAnnotations();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public List getParameters() {
        getReflected().getParameters();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass0Cs getReflected() {
        AnonymousClass0Cs compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C05150Nt();
    }

    public C17950sL getReturnType() {
        getReflected().getReturnType();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public List getTypeParameters() {
        getReflected().getTypeParameters();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass0Nf getVisibility() {
        getReflected().getVisibility();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isAbstract() {
        getReflected().isAbstract();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isFinal() {
        getReflected().isFinal();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isOpen() {
        getReflected().isOpen();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isSuspend() {
        getReflected().isSuspend();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }
}
