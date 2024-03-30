package X;

import com.whatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.3e7  reason: invalid class name and case insensitive filesystem */
public final class C69803e7 implements C88454St {
    public final /* synthetic */ AnonymousClass141 A00;
    public final /* synthetic */ GroupDetailsCard A01;
    public final /* synthetic */ AnonymousClass147 A02;

    public void BuQ(AnonymousClass141 r1) {
    }

    public C69803e7(AnonymousClass141 r1, GroupDetailsCard groupDetailsCard, AnonymousClass147 r3) {
        this.A01 = groupDetailsCard;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BmB(AnonymousClass141 r12, boolean z, boolean z2) {
        GroupDetailsCard groupDetailsCard = this.A01;
        AnonymousClass1ND callsManager = groupDetailsCard.getCallsManager();
        AnonymousClass141 r3 = this.A00;
        callsManager.Buc(groupDetailsCard.getContext(), this.A02, AnonymousClass3UL.A04(groupDetailsCard.getMeManager(), groupDetailsCard.getContactManager(), groupDetailsCard.getGroupParticipantsManager(), r3), 10, z);
    }
}
