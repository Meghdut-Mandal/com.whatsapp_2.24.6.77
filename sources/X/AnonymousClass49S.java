package X;

import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.49S  reason: invalid class name */
public final class AnonymousClass49S extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49S(CAGInfoFragment cAGInfoFragment) {
        super(0);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass01G r3 = (AnonymousClass01G) this.this$0.A0C.getValue();
        CAGInfoFragment cAGInfoFragment = this.this$0;
        AnonymousClass4OA r2 = cAGInfoFragment.A07;
        if (r2 != null) {
            Object value = cAGInfoFragment.A0B.getValue();
            AnonymousClass00C.A0D(value, 1);
            return AnonymousClass4ZG.A00(r3, value, r2, 13).A00(AnonymousClass2EH.class);
        }
        throw C36331k8.A0d("groupChatInfoViewModelFactory");
    }
}
