package X;

/* renamed from: X.0Uj  reason: invalid class name and case insensitive filesystem */
public final class C06620Uj {
    public final Object A00;
    public final Object A01;
    public final Throwable A02;
    public final C006302t A03;
    public final C15210ms A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06620Uj) {
                C06620Uj r5 = (C06620Uj) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0H = ((((((AnonymousClass000.A0H(this.A01) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A00)) * 31;
        Throwable th = this.A02;
        if (th != null) {
            i = th.hashCode();
        }
        return A0H + i;
    }

    public C06620Uj(Object obj, Object obj2, Throwable th, C006302t r4, C15210ms r5) {
        this.A01 = obj;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = obj2;
        this.A02 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompletedContinuation(result=");
        A0u.append(this.A01);
        A0u.append(", cancelHandler=");
        A0u.append(this.A04);
        A0u.append(", onCancellation=");
        A0u.append(this.A03);
        A0u.append(", idempotentResume=");
        A0u.append(this.A00);
        A0u.append(", cancelCause=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
