package X;

import com.whatsapp.conversation.CustomStickerConfirmationDialog;

/* renamed from: X.4AR  reason: invalid class name */
public final class AnonymousClass4AR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CustomStickerConfirmationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AR(CustomStickerConfirmationDialog customStickerConfirmationDialog) {
        super(0);
        this.this$0 = customStickerConfirmationDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CustomStickerConfirmationDialog customStickerConfirmationDialog = this.this$0;
        C58212zV r2 = customStickerConfirmationDialog.A01;
        if (r2 != null) {
            Object value = customStickerConfirmationDialog.A04.getValue();
            AnonymousClass00C.A0D(value, 1);
            return AnonymousClass4ZG.A00(customStickerConfirmationDialog, value, r2, 6).A00(C39901uB.class);
        }
        throw C36331k8.A0d("customStickerViewModelFactory");
    }
}
