package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;

/* renamed from: X.6M0  reason: invalid class name */
public final class AnonymousClass6M0 {
    public final void A00(Context context, String str) {
        AudioChatBottomSheetDialog audioChatBottomSheetDialog = new AudioChatBottomSheetDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("audio_chat_call_id", str);
        audioChatBottomSheetDialog.A17(A07);
        audioChatBottomSheetDialog.A1f(((AnonymousClass01I) C24801Dv.A01(context, AnonymousClass155.class)).getSupportFragmentManager(), "AudioChatBottomSheetDialog");
    }
}
