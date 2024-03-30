package X;

import com.whatsapp.community.LinkExistingGroups;

/* renamed from: X.49N  reason: invalid class name */
public final class AnonymousClass49N extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ LinkExistingGroups this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49N(LinkExistingGroups linkExistingGroups) {
        super(0);
        this.this$0 = linkExistingGroups;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkExistingGroups linkExistingGroups = this.this$0;
        AnonymousClass147 r1 = linkExistingGroups.A0A;
        boolean z = false;
        if (r1 != null) {
            AnonymousClass17X r0 = linkExistingGroups.A06;
            if (r0 == null) {
                throw C36331k8.A0d("groupParticipantsManager");
            } else if (!r0.A0D(r1) && linkExistingGroups.A0D.A0E(5077)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
