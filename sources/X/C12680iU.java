package X;

import java.io.Serializable;

/* renamed from: X.0iU  reason: invalid class name and case insensitive filesystem */
public class C12680iU implements AnonymousClass00Q, Serializable {
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12680iU)) {
            return false;
        }
        C12680iU r4 = (C12680iU) obj;
        return this.isTopLevel == r4.isTopLevel && this.arity == r4.arity && this.flags == r4.flags && AnonymousClass00C.A0J(this.receiver, r4.receiver) && AnonymousClass00C.A0J(this.owner, r4.owner) && this.name.equals(r4.name) && this.signature.equals(r4.signature);
    }

    public int hashCode() {
        int i = 0;
        int A0J = AnonymousClass000.A0J(this.receiver) * 31;
        Class cls = this.owner;
        if (cls != null) {
            i = cls.hashCode();
        }
        int hashCode = (((((A0J + i) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        int i2 = 1237;
        if (this.isTopLevel) {
            i2 = 1231;
        }
        return ((((hashCode + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public C12680iU(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = AnonymousClass000.A1O(i2 & 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public String toString() {
        return C05650Qn.A00(this);
    }

    public int getArity() {
        return this.arity;
    }
}
