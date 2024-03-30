package X;

import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

/* renamed from: X.AiB  reason: case insensitive filesystem */
public final class C22188AiB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ViewNewsletterProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22188AiB(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        super(0);
        this.this$0 = viewNewsletterProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.setResult(-1);
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.this$0;
        ViewNewsletterProfilePhoto.A0F(viewNewsletterProfilePhoto, viewNewsletterProfilePhoto.getIntent().getBooleanExtra("open_pic_selection_sheet", false));
        if (this.this$0.getIntent().getBooleanExtra("open_pic_selection_sheet", false)) {
            AnonymousClass0PG.A00(this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
