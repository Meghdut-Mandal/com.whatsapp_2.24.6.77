package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager", f = "MemberSuggestedGroupsManager.kt", i = {0, 0, 0, 0}, l = {98, 100, 102}, m = "fetchSuggestedGroupsSuspended", n = {"this", "parentGroupJid", "hintGroupJid", "useMex"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* renamed from: X.3zI  reason: invalid class name and case insensitive filesystem */
public final class C82803zI extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82803zI(MemberSuggestedGroupsManager memberSuggestedGroupsManager, C023509x r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass147) null, (AnonymousClass147) null, this, false);
    }
}
