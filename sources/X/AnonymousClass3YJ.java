package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.3YJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YJ implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass2JI A02;

    public /* synthetic */ AnonymousClass3YJ(Context context, AnonymousClass2JI r2, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = context;
    }

    public final void onClick(View view) {
        AnonymousClass2JI r0 = this.A02;
        long j = this.A00;
        Context context = this.A01;
        AnonymousClass2Z5 r3 = new AnonymousClass2Z5(r0.A02, String.valueOf(j));
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.product.integrityappeals.NewsletterRequestReviewActivity");
        A0D.putExtra("appeal-request", r3);
        context.startActivity(A0D);
    }
}
