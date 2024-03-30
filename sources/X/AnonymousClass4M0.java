package X;

import com.whatsapp.conversation.EditMessageActivity;

/* renamed from: X.4M0  reason: invalid class name */
public final class AnonymousClass4M0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass3T1 $message;
    public final /* synthetic */ EditMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M0(EditMessageActivity editMessageActivity, AnonymousClass3T1 r3) {
        super(1);
        this.this$0 = editMessageActivity;
        this.$message = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145166tS r4 = (C145166tS) obj;
        C39471sS r0 = this.this$0.A0B;
        if (r0 == null) {
            throw C36331k8.A0d("webPagePreviewViewModel");
        }
        r0.A0T(r4);
        if (r4 == null || !r0.A0Y()) {
            EditMessageActivity.A0G(this.this$0, 8);
        } else {
            EditMessageActivity.A07(this.this$0);
            C39471sS r1 = this.this$0.A0B;
            if (r1 == null) {
                throw C36331k8.A0d("webPagePreviewViewModel");
            }
            r1.A0X(C64933Qa.A04(this.$message));
        }
        return AnonymousClass0AJ.A00;
    }
}
