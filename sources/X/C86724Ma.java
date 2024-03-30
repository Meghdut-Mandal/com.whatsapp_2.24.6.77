package X;

import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.4Ma  reason: invalid class name and case insensitive filesystem */
public final class C86724Ma extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass1RY $contactPhotosLoader;
    public final /* synthetic */ AnonymousClass141 $groupContact;
    public final /* synthetic */ GroupPhotoHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86724Ma(AnonymousClass1RY r2, GroupPhotoHeader groupPhotoHeader, AnonymousClass141 r4) {
        super(1);
        this.this$0 = groupPhotoHeader;
        this.$contactPhotosLoader = r2;
        this.$groupContact = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GroupPhotoHeader groupPhotoHeader = this.this$0;
        this.$contactPhotosLoader.A04(groupPhotoHeader, new C53982sD(groupPhotoHeader, 6), this.$groupContact, C36391kE.A06(groupPhotoHeader));
        return AnonymousClass0AJ.A00;
    }
}
