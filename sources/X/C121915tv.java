package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5tv  reason: invalid class name and case insensitive filesystem */
public class C121915tv {
    public final TextView A00;
    public final TextView A01;
    public final C18820ts A02;

    public C121915tv(View view, C18820ts r4) {
        this.A02 = r4;
        C36401kF.A0G(view, R.id.voice_cancel_animation).setImageResource(R.drawable.recording_mic_red);
        C36401kF.A0G(view, R.id.voice_cancel_trashcan_lid).setImageResource(R.drawable.rec_bucket_lid);
        C36401kF.A0G(view, R.id.voice_cancel_trashcan_body).setImageResource(R.drawable.rec_bucket_body);
        this.A00 = C36391kE.A0O(view, R.id.voice_note_info);
        this.A01 = C36391kE.A0O(view, R.id.voice_note_info_v2);
    }
}
