package X;

/* renamed from: X.9wu  reason: invalid class name and case insensitive filesystem */
public final class C207739wu implements AnonymousClass026 {
    public boolean A00;
    public boolean A01;
    public final C19420v0 A02;

    public C207739wu(C19420v0 r5) {
        AnonymousClass00C.A0D(r5, 1);
        this.A02 = r5;
        AnonymousClass005 r3 = r5.A00;
        this.A00 = C36391kE.A0H(r3).getBoolean("detect_device_foldable", false);
        this.A01 = C36391kE.A0H(r3).getBoolean("detect_device_foldable_bookmode", false);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        B5N b5n;
        AnonymousClass9V8 r6 = (AnonymousClass9V8) obj;
        C198589dp r3 = null;
        if (r6 != null) {
            b5n = AnonymousClass96Z.A00(r6);
        } else {
            b5n = null;
        }
        if (!this.A00 && b5n != null) {
            this.A00 = true;
            C36331k8.A0w(C19420v0.A00(this.A02), "detect_device_foldable", true);
        }
        if (!this.A01) {
            if (b5n != null) {
                AnonymousClass1R6 r32 = ((C208149xj) b5n).A00;
                if (r32.A02 - r32.A01 > r32.A00 - r32.A03) {
                    r3 = C198589dp.A01;
                } else {
                    r3 = C198589dp.A02;
                }
            }
            if (AnonymousClass00C.A0J(r3, C198589dp.A02)) {
                this.A01 = true;
                C36331k8.A0w(C19420v0.A00(this.A02), "detect_device_foldable_bookmode", true);
            }
        }
    }
}
