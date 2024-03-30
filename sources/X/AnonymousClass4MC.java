package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.4MC  reason: invalid class name */
public final class AnonymousClass4MC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MC(AnonymousClass3UC r2, WeakReference weakReference) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0G = C36441kJ.A0G(this.$weakActivity);
        if (A0G != null) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(A0G.getPackageName(), "com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity");
            A0G.startActivity(A0D);
        }
        return AnonymousClass0AJ.A00;
    }
}
