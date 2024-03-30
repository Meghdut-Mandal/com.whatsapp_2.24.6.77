package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.49u  reason: invalid class name and case insensitive filesystem */
public final class C835449u extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C835449u(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass147 A0k = C36431kI.A0k(this.this$0.A0V);
        if (A0k == null) {
            return null;
        }
        AnonymousClass3C9 r0 = this.this$0.A01;
        if (r0 != null) {
            return r0.A00(A0k);
        }
        throw C36331k8.A0d("communityMemberAddUtilsFactory");
    }
}
