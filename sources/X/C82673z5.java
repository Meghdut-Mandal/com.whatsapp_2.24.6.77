package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {0, 0}, l = {420, 421}, m = "subgroupAction", n = {"this", "stateOnSuccess"}, s = {"L$0", "I$0"})
/* renamed from: X.3z5  reason: invalid class name and case insensitive filesystem */
public final class C82673z5 extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82673z5(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C023509x r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManagementViewModel.A04(this.this$0, (List) null, this, (C006302t) null, 0);
    }
}
