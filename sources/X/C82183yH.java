package X;

import com.whatsapp.community.CommunityMembersViewModel;

/* renamed from: X.3yH  reason: invalid class name and case insensitive filesystem */
public final class C82183yH implements AnonymousClass05H {
    public final /* synthetic */ CommunityMembersViewModel A00;
    public final /* synthetic */ AnonymousClass05H A01;

    public C82183yH(CommunityMembersViewModel communityMembersViewModel, AnonymousClass05H r2) {
        this.A01 = r2;
        this.A00 = communityMembersViewModel;
    }

    public Object B36(C023509x r5, AnonymousClass05G r6) {
        Object B36 = this.A01.B36(r5, new AnonymousClass4Z9(r6, this.A00, 0));
        if (B36 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return B36;
    }
}
