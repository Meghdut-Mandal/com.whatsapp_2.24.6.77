package X;

import android.net.Uri;
import com.whatsapp.conversation.CustomStickerConfirmationDialog;

/* renamed from: X.4AS  reason: invalid class name */
public final class AnonymousClass4AS extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CustomStickerConfirmationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AS(CustomStickerConfirmationDialog customStickerConfirmationDialog) {
        super(0);
        this.this$0 = customStickerConfirmationDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Uri parse;
        String string = this.this$0.A0b().getString("URI");
        if (string != null && (parse = Uri.parse(string)) != null) {
            return parse;
        }
        throw AnonymousClass001.A09("Could not retrieve uri from arguments bundle.");
    }
}
