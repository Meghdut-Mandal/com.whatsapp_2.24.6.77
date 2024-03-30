package X;

/* renamed from: X.3GP  reason: invalid class name */
public final class AnonymousClass3GP {
    public int A00 = 3;
    public AnonymousClass3XT A01;
    public boolean A02;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AnonymousClass00C.A0J(cls2, cls)) {
            return false;
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.protocol.StatusData");
        AnonymousClass3GP r4 = (AnonymousClass3GP) obj;
        return AnonymousClass00C.A0J(this.A01, r4.A01) && this.A00 == r4.A00 && this.A02 == r4.A02;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        AnonymousClass000.A1K(objArr, this.A00);
        objArr[2] = Boolean.valueOf(this.A02);
        return AnonymousClass000.A0M((Object) null, objArr, 3);
    }
}
