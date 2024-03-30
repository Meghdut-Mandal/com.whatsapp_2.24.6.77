package X;

/* renamed from: X.0mq  reason: invalid class name and case insensitive filesystem */
public final class C15190mq extends C15210ms {
    public final AnonymousClass0n4[] A00;
    public final /* synthetic */ C07160Wo A01;

    public C15190mq(C07160Wo r1, AnonymousClass0n4[] r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A05() {
        AnonymousClass0n4[] r3 = this.A00;
        int length = r3.length;
        int i = 0;
        while (i < length) {
            AnonymousClass03l r0 = r3[i].A00;
            if (r0 != null) {
                r0.dispose();
                i++;
            } else {
                AnonymousClass00C.A0G("handle");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05();
        return AnonymousClass0AJ.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisposeHandlersOnCancel[");
        return AnonymousClass000.A0n(this.A00, A0u);
    }

    public void A04(Throwable th) {
        A05();
    }
}
