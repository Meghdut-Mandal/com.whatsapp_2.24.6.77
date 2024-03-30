package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0, 2}, l = {152, 153, 155, 156}, m = "onLoadingStates", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.3yu  reason: invalid class name and case insensitive filesystem */
public final class C82563yu extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82563yu(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C023509x r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManagementViewModel.A02(this.this$0, (Map) null, this);
    }
}
