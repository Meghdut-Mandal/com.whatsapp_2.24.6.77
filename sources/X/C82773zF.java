package X;

import com.whatsapp.community.CommunityMembersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel", f = "CommunityMembersViewModel.kt", i = {0, 0, 0}, l = {365}, m = "updateCommunityParticipants", n = {"this", "participantsToUpdate", "isPhotoUpdate"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: X.3zF  reason: invalid class name and case insensitive filesystem */
public final class C82773zF extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82773zF(CommunityMembersViewModel communityMembersViewModel, C023509x r2) {
        super(r2);
        this.this$0 = communityMembersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CommunityMembersViewModel.A01(this.this$0, this, (C16970qV) null, false);
    }
}
