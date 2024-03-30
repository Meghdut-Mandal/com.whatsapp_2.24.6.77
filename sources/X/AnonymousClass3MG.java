package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3MG  reason: invalid class name */
public abstract class AnonymousClass3MG {
    public static void A00(Context context, int i) {
        float f;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("android.resource://");
        A0u.append(context.getPackageName());
        A0u.append("/");
        Uri parse = Uri.parse(C36381kD.A10(A0u, R.raw.ptt_end_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(AnonymousClass3WS.A00);
        mediaPlayer.setAudioStreamType(i);
        if (i == 3) {
            f = 0.35f;
        } else {
            if (i == 0) {
                f = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
        mediaPlayer.setVolume(f, f);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.e("SequentialVoiceMemoPlayer/playEndTone ", e);
        }
    }

    public static void A01(Context context, AnonymousClass17Y r4, Runnable runnable, int i) {
        float f;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("android.resource://");
        A0u.append(context.getPackageName());
        A0u.append("/");
        Uri parse = Uri.parse(C36381kD.A10(A0u, R.raw.ptt_middle_fast));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(AnonymousClass3WS.A00);
        mediaPlayer.setAudioStreamType(i);
        if (i == 3) {
            f = 0.35f;
        } else {
            if (i == 0) {
                f = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0I(runnable, 600);
        }
        mediaPlayer.setVolume(f, f);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
            r4.A0I(runnable, 600);
        } catch (IOException e) {
            Log.e("SequentialVoiceMemoPlayer/playMiddleTone ", e);
        }
    }
}
