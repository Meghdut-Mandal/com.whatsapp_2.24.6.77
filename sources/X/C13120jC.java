package X;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public final class C13120jC implements C17380rC {
    public final long A00;

    public AnonymousClass05H B37(AnonymousClass05K r5) {
        return C07430Xq.A01(new C18510tH((C009003v) new AnonymousClass0l1((C023509x) null), (AnonymousClass05H) C06830Vg.A00(new C14290lO((C023509x) null, this), r5), 3));
    }

    public String toString() {
        C13540k2 r7 = new C13540k2(2);
        long j = this.A00;
        if (j > 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("stopTimeout=");
            A0u.append(j);
            r7.add(AnonymousClass000.A0q("ms", A0u));
        }
        C13540k2 A002 = AnonymousClass03S.A00(r7);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SharingStarted.WhileSubscribed(");
        A0u2.append(C007103b.A0Q(", ", "", "", A002, (C006302t) null));
        return AnonymousClass000.A0t(A0u2, ')');
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13120jC) || this.A00 != ((C13120jC) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A08(this.A00) * 31) + AnonymousClass000.A08(Long.MAX_VALUE);
    }

    public C13120jC(long j) {
        this.A00 = j;
        if (!(j >= 0)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("stopTimeout(");
            A0u.append(j);
            throw AnonymousClass000.A0c(" ms) cannot be negative", A0u);
        }
    }
}
