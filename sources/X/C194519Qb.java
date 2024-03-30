package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.util.Log;

/* renamed from: X.9Qb  reason: invalid class name and case insensitive filesystem */
public final class C194519Qb {
    public final /* synthetic */ MemberSuggestedGroupsManager A00;
    public final /* synthetic */ AnonymousClass147 A01;

    public C194519Qb(MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass147 r2) {
        this.A00 = memberSuggestedGroupsManager;
        this.A01 = r2;
    }

    public Object A00(C186108vQ r6, C023509x r7) {
        B01 b01;
        if (r6 != null) {
            b01 = r6.A00;
        } else {
            b01 = null;
        }
        boolean z = b01 instanceof C185288tu;
        if ((z && ((C185288tu) b01).A00 == 0) || (b01 instanceof AnonymousClass8u1) || (b01 instanceof AnonymousClass8u0) || (b01 instanceof AnonymousClass8u2)) {
            this.A00.A06(this.A01, C023409w.A00);
        } else if ((!z || ((C185288tu) b01).A00 != 1) && b01 != null) {
            Log.e("MemberSuggestedGroupsManager/fetchSuggestedGroups/unknown error");
        }
        Log.e("MemberSuggestedGroupsManager/fetchSuggestedGroups error");
        Object A012 = MemberSuggestedGroupsManager.A01(this.A00, this.A01, r7, false);
        if (A012 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A012;
    }
}
