package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.4A1  reason: invalid class name */
public final class AnonymousClass4A1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4A1(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        C57062xc r1 = addGroupParticipantsSelector.A00;
        if (r1 != null) {
            return new C68143bP(r1, C36431kI.A0k(addGroupParticipantsSelector.A0Q), C36431kI.A0k(this.this$0.A0V), C36431kI.A1E(this.this$0.A0M), C36331k8.A1b(this.this$0.A0T));
        }
        throw C36331k8.A0d("viewModelFactory");
    }
}
