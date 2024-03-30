package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AnY  reason: case insensitive filesystem */
public final class C22495AnY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Context $activityContext;
    public final /* synthetic */ AnonymousClass3T1 $message;
    public final /* synthetic */ C207219uk $messageContent;
    public final /* synthetic */ C21135A9v this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22495AnY(Context context, C21135A9v a9v, AnonymousClass3T1 r4, C207219uk r5) {
        super(1);
        this.this$0 = a9v;
        this.$activityContext = context;
        this.$message = r4;
        this.$messageContent = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass9W6 r9 = (AnonymousClass9W6) obj;
        C21135A9v a9v = this.this$0;
        Context context = this.$activityContext;
        AnonymousClass3T1 r6 = this.$message;
        C207219uk r1 = this.$messageContent;
        AnonymousClass9Y1 r3 = a9v.A01;
        r3.A01(10);
        C206819u1 r5 = r1.A05;
        if (r5 != null) {
            C206659tl r0 = r1.A03;
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = null;
            }
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.ProductListActivity");
            A0D.putExtra("message_content", r5);
            A0D.putExtra("message_title", str);
            context.startActivity(A0D);
            UserJid userJid = r5.A00;
            String str2 = r5.A01.A01;
            C202279lS r2 = a9v.A02;
            r2.A0N.add(new A92(r2, new C193139Jz(a9v, r6, r5), str2));
            if (!r2.A0A(new AnonymousClass9NZ(r9, userJid, 0, (Integer) null, str2, r3.A02, false))) {
                C36321k7.A1P("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ", "Failed to send product request", AnonymousClass000.A0u());
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
