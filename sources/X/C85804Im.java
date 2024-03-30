package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog;

/* renamed from: X.4Im  reason: invalid class name and case insensitive filesystem */
public final class C85804Im extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85804Im(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Dialog dialog;
        Window window;
        Boolean bool = (Boolean) obj;
        AnonymousClass00C.A0B(bool);
        if (bool.booleanValue()) {
            ParticipantListBottomSheetDialog participantListBottomSheetDialog = this.this$0;
            Context A1D = participantListBottomSheetDialog.A1D();
            if (!(A1D == null || (dialog = participantListBottomSheetDialog.A02) == null || (window = dialog.getWindow()) == null)) {
                window.setNavigationBarColor(AnonymousClass00F.A00(A1D, R.color.f6nameremoved));
            }
            View view = participantListBottomSheetDialog.A0F;
            if (view != null) {
                View A02 = C012005e.A02(view, R.id.title);
                AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                ((TextView) A02).setText(R.string.f12nameremoved);
                C36371kC.A13(view.getContext(), C36411kG.A0K(view), R.drawable.audio_chat_activity_bottom_sheet_background);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
