package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Hl  reason: invalid class name and case insensitive filesystem */
public final class C85534Hl extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ boolean $isMV;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85534Hl(AnonymousClass3UC r2, WeakReference weakReference, boolean z) {
        super(0);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
        this.$isMV = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C225314u A0W = C36411kG.A0W(this.$weakActivity);
        if (A0W != null) {
            AnonymousClass3UC r3 = this.this$0;
            AnonymousClass3UC.A04(A0W, r3, (AnonymousClass00S) null, C36341k9.A08(r3.A02, 3835), this.$isMV);
        }
        return AnonymousClass0AJ.A00;
    }
}
