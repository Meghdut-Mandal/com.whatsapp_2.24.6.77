package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.4Md  reason: invalid class name and case insensitive filesystem */
public final class C86754Md extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $isMV;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86754Md(AnonymousClass3UC r2, WeakReference weakReference, boolean z) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
        this.$isMV = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent A0D;
        String packageName;
        String str;
        Context A0G = C36441kJ.A0G(this.$weakActivity);
        if (A0G != null) {
            AnonymousClass3UC r4 = this.this$0;
            boolean z = this.$isMV;
            r4.A04.A07(2, true);
            boolean A0E = r4.A02.A0E(6618);
            if (!z || !A0E) {
                A0D = C36431kI.A0D();
                packageName = A0G.getPackageName();
                str = "com.whatsapp.newsletter.ui.NewsletterCreationActivity";
            } else {
                A0D = C36431kI.A0D();
                packageName = A0G.getPackageName();
                str = "com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity";
            }
            A0D.setClassName(packageName, str);
            A0G.startActivity(A0D);
        }
        return AnonymousClass0AJ.A00;
    }
}
