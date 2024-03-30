package X;

import android.content.Context;
import android.view.ViewStub;

/* renamed from: X.7Oz  reason: invalid class name and case insensitive filesystem */
public final class C153607Oz extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20810yC $abProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass01z $fragmentManager;
    public final /* synthetic */ C159477jQ $glassesEventHandler;
    public final /* synthetic */ C006302t $permissionCheckCallback;
    public final /* synthetic */ ViewStub $viewStub;
    public final /* synthetic */ C147076wd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153607Oz(Context context, ViewStub viewStub, AnonymousClass01z r4, C20810yC r5, C147076wd r6, C159477jQ r7, C006302t r8) {
        super(0);
        this.this$0 = r6;
        this.$abProps = r5;
        this.$context = context;
        this.$glassesEventHandler = r7;
        this.$viewStub = viewStub;
        this.$fragmentManager = r4;
        this.$permissionCheckCallback = r8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C203169nR r0;
        C147076wd r1 = this.this$0;
        C20810yC r4 = this.$abProps;
        Context context = this.$context;
        C159477jQ r2 = this.$glassesEventHandler;
        C203169nR r02 = C108915Vl.A00;
        if (r02 == null) {
            AnonymousClass6n9 r12 = r1.A06;
            if (r12 != null) {
                C108915Vl.A00 = new C203169nR(context, r12, r4, r2);
            } else {
                throw C36331k8.A0d("supMediaStreamPerfLoggerImpl");
            }
        } else if (AnonymousClass00C.A0J(r02.A02, AnonymousClass21D.A00) && (r0 = C108915Vl.A00) != null) {
            r0.A08();
        }
        C203169nR r13 = C108915Vl.A00;
        if (r13 != null) {
            r13.A05 = this.$permissionCheckCallback;
        }
        C147076wd.A00(this.this$0);
        C147076wd r42 = this.this$0;
        ViewStub viewStub = this.$viewStub;
        AnonymousClass01z r22 = this.$fragmentManager;
        C159477jQ r5 = this.$glassesEventHandler;
        AnonymousClass17Y r03 = r42.A02;
        if (r03 != null) {
            r03.A0H(new C1503474x((Object) r22, (Object) viewStub, (Object) r42, (Object) r5, 43));
            this.this$0.A09 = null;
            return AnonymousClass0AJ.A00;
        }
        throw C36321k7.A06();
    }
}
