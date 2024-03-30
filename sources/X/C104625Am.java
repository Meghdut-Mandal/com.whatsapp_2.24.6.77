package X;

/* renamed from: X.5Am  reason: invalid class name and case insensitive filesystem */
public class C104625Am extends AnonymousClass683 {
    public final C19420v0 A00;

    public C104625Am(C19600wD r11, C19970wo r12, C19420v0 r13, C18820ts r14, C146146v7 r15, C146166v9 r16, AnonymousClass1XJ r17, C21010yW r18, AnonymousClass6O2 r19, C19770wU r20) {
        super(r11, r12, r14, r18, r15, r16, r17, r19, r20);
        this.A00 = r13;
    }

    public AnonymousClass6LL A00() {
        if (C36371kC.A01(C36341k9.A0E(this.A00), "emoji_search_algorithm_version") == 2) {
            return super.A00();
        }
        return new AnonymousClass6LL();
    }

    public boolean A01(AnonymousClass6LL r5) {
        boolean A01 = super.A01(r5);
        if (A01) {
            C36341k9.A0v(C19420v0.A00(this.A00), "emoji_search_algorithm_version", 2);
        }
        return A01;
    }
}
