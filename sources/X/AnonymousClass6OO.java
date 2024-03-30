package X;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.camera.recording.RecordingView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6OO  reason: invalid class name */
public class AnonymousClass6OO {
    public long A00;
    public RecordingView A01;
    public final long A02;
    public final long A03;
    public final Handler A04 = new C162377oU(Looper.getMainLooper(), this, 1);
    public final C117045lc A05;
    public final C19970wo A06;
    public final C18820ts A07;

    public static String A00(AnonymousClass6OO r5, long j) {
        Locale A0x = C36401kF.A0x(r5.A07);
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, TimeUnit.MILLISECONDS.toMinutes(j));
        C36421kH.A1P(A0M, TimeUnit.MILLISECONDS.toSeconds(j) % 60);
        return String.format(A0x, "%02d:%02d", A0M);
    }

    public void A01(boolean z, boolean z2, boolean z3) {
        RecordingView recordingView = this.A01;
        recordingView.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (z && z3) {
            AlphaAnimation A0D = C36351kA.A0D();
            A0D.setDuration(220);
            recordingView.startAnimation(A0D);
        }
        recordingView.setSelected(z2);
        if (!z || !z2) {
            recordingView.A00.setText(A00(this, 0));
            recordingView.A01.setProgress(0);
        }
    }

    public AnonymousClass6OO(C117045lc r4, RecordingView recordingView, C19970wo r6, C18820ts r7, long j, long j2) {
        this.A05 = r4;
        this.A01 = recordingView;
        this.A07 = r7;
        this.A06 = r6;
        recordingView.A01.setVisibility(8);
        recordingView.A00.setPadding(0, 0, 0, 0);
        recordingView.A00.setTextSize(2, 14.0f);
        recordingView.A00.setLetterSpacing(0.09f);
        recordingView.setBackground(AnonymousClass0BT.A00((Resources.Theme) null, recordingView.A02.getResources(), R.drawable.camera_info_background_new));
        recordingView.A00.setText(AnonymousClass3UY.A07(r7, 0));
        this.A03 = j;
        this.A02 = j2;
    }

    public boolean A02() {
        return AnonymousClass000.A1R(((System.currentTimeMillis() - this.A00) > 1000 ? 1 : ((System.currentTimeMillis() - this.A00) == 1000 ? 0 : -1)));
    }
}
