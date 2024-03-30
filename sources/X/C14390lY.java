package X;

/* renamed from: X.0lY  reason: invalid class name and case insensitive filesystem */
public abstract class C14390lY extends C03000Ct implements C17960sM {
    public final boolean syntheticJavaProperty;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C14390lY) {
                C03000Ct r4 = (C03000Ct) obj;
                if (!getOwner().equals(r4.getOwner()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || !AnonymousClass00C.A0J(this.receiver, r4.receiver)) {
                    return false;
                }
            } else if (obj instanceof C17960sM) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14390lY(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, AnonymousClass000.A1S(i & 1, 1));
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    /* renamed from: A00 */
    public C17960sM getReflected() {
        if (!this.syntheticJavaProperty) {
            return (C17960sM) super.getReflected();
        }
        throw AnonymousClass001.A0E("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public AnonymousClass0Cs compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        AnonymousClass0Cs r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.0Cs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.0Cs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.0Cs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            X.0Cs r1 = r2.compute()
            if (r1 != r2) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "property "
            r1.append(r0)
            java.lang.String r0 = r2.name
            r1.append(r0)
            java.lang.String r0 = " (Kotlin reflection is not available)"
            r1.append(r0)
        L_0x0019:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14390lY.toString():java.lang.String");
    }
}
