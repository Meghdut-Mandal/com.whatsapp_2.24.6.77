package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import com.whatsapp.wds.components.button.WDSButtonGroup;

/* renamed from: X.7sC  reason: invalid class name and case insensitive filesystem */
public class C164677sC implements C34871hm {
    public Object A00;
    public final int A01;

    public C164677sC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass1RJ r1, Object obj, int i) {
        r1.A07(new C164677sC(obj, i));
    }

    public final void BZ9(View view) {
        ImageView imageView;
        Object obj;
        int i;
        switch (this.A01) {
            case 0:
                Object obj2 = this.A00;
                C36341k9.A1D(obj2);
                View findViewById = view.findViewById(R.id.remove_promotion_cta);
                if (findViewById != null) {
                    C48772i1.A00(findViewById, new C135426cg(obj2, 34), 34);
                    return;
                }
                return;
            case 1:
                CallControlCard.setupOnAttach$lambda$8((CallControlCard) this.A00, (WDSButtonGroup) view);
                return;
            case 2:
                obj = this.A00;
                ImageView imageView2 = (ImageView) view;
                AnonymousClass00C.A0D(obj, 0);
                imageView2.setImageResource(R.drawable.vec_ic_calling_bluetooth);
                i = 15;
                imageView = imageView2;
                break;
            case 3:
                obj = this.A00;
                AnonymousClass00C.A0D(obj, 0);
                i = 16;
                imageView = view;
                break;
            case 4:
                obj = this.A00;
                ImageView imageView3 = (ImageView) view;
                AnonymousClass00C.A0D(obj, 0);
                imageView3.setImageResource(R.drawable.ic_lwc_mic);
                imageView3.getDrawable().setTintList((ColorStateList) null);
                i = 18;
                imageView = imageView3;
                break;
            case 5:
                obj = this.A00;
                ImageView imageView4 = (ImageView) view;
                AnonymousClass00C.A0D(obj, 0);
                imageView4.setImageResource(R.drawable.vec_ic_calling_speaker);
                i = 19;
                imageView = imageView4;
                break;
            case 6:
                obj = this.A00;
                TextView textView = (TextView) view;
                AnonymousClass00C.A0D(obj, 0);
                textView.setText(R.string.f12nameremoved);
                i = 20;
                imageView = textView;
                break;
            default:
                C1492470k r1 = (C1492470k) this.A00;
                r1.A01 = C90514aH.A0T(view, R.id.voice_note_draft_playback_btn_v2);
                r1.A02 = C36391kE.A0O(view, R.id.voice_note_draft_time_v2);
                r1.A04 = (VoiceNoteSeekBar) C012005e.A02(view, R.id.voice_note_draft_seekbar_v2);
                r1.A03 = (VoiceVisualizer) C012005e.A02(view, R.id.voice_note_draft_preview_audio_visualizer);
                C011504z.A06(r1.A02, 2);
                return;
        }
        C135456cj.A01(imageView, obj, i);
    }
}
