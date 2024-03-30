package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Hy  reason: invalid class name and case insensitive filesystem */
public final class C85664Hy extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ C44072La $newsletter;
    public final /* synthetic */ String $pcId = null;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85664Hy(C44072La r2, AnonymousClass3UC r3, WeakReference weakReference, int i) {
        super(0);
        this.$weakActivity = weakReference;
        this.this$0 = r3;
        this.$newsletter = r2;
        this.$entryPoint = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C225314u A0W = C36411kG.A0W(this.$weakActivity);
        if (A0W != null) {
            AnonymousClass3UC r1 = this.this$0;
            C44072La r0 = this.$newsletter;
            int i = this.$entryPoint;
            r1.A09(A0W, r0.A0J(), this.$pcId, (C006302t) null, i);
        }
        return AnonymousClass0AJ.A00;
    }
}
