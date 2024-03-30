package X;

import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;
import java.util.Objects;

/* renamed from: X.5LO  reason: invalid class name */
public final class AnonymousClass5LO extends C98104qs {
    public boolean A00;
    public final /* synthetic */ C146646vw A01;

    public void Bgx(AnonymousClass6E4 r12) {
        AnonymousClass00C.A0D(r12, 0);
        super.Bgx(r12);
        if (r12.A07.A00 >= ((double) this.A00) && !this.A00) {
            C146646vw r3 = this.A01;
            AnonymousClass6VH r7 = r3.A08;
            C017507m r5 = new C017507m(3);
            r5.A06(300);
            View view = r7.A07;
            r5.A08(view);
            WaTextView waTextView = r7.A03;
            r5.A08(waTextView);
            r5.A07(new DecelerateInterpolator());
            r5.A0A(new C162557om(r3, 1));
            C018607y.A02((ViewGroup) r3.A0J, r5);
            view.setVisibility(8);
            waTextView.setVisibility(0);
            r3.A00 = 0.0f;
            r3.A0C = false;
            r3.A0D = false;
            AnonymousClass5LJ r0 = new AnonymousClass5LJ(r3);
            r3.A06 = r0;
            r0.A00();
            C160177ka r6 = r3.A07;
            if (r6 != null) {
                r3.A04 = SystemClock.elapsedRealtime();
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r6;
                if (!(textStatusComposerActivity.A0i == null || textStatusComposerActivity.A0j == null)) {
                    C018607y.A01((ViewGroup) textStatusComposerActivity.A00);
                    C018607y.A01(textStatusComposerActivity.A05);
                    textStatusComposerActivity.A0i.setScaleX(1.0f);
                    textStatusComposerActivity.A0i.setScaleY(1.0f);
                    View view2 = textStatusComposerActivity.A00;
                    Objects.requireNonNull(view2);
                    VoiceRecordingView voiceRecordingView = textStatusComposerActivity.A0i;
                    StatusEditText statusEditText = textStatusComposerActivity.A0f;
                    AnonymousClass00C.A0D(voiceRecordingView, 0);
                    AnonymousClass00C.A0D(statusEditText, 1);
                    C017507m r02 = new C017507m(3);
                    r02.A08(statusEditText);
                    r02.A08(voiceRecordingView);
                    r02.A02 = 0;
                    C017307k r52 = new C017307k();
                    r52.A02 = 200;
                    r52.A03 = true;
                    r52.A0a(r02);
                    r52.A0Y(new DecelerateInterpolator());
                    r52.A0X(300);
                    C018607y.A02((ViewGroup) view2, r52);
                    ViewGroup viewGroup = textStatusComposerActivity.A05;
                    ImageButton imageButton = textStatusComposerActivity.A07;
                    TextView textView = textStatusComposerActivity.A09;
                    C36351kA.A1J(imageButton, textView, 1);
                    AnonymousClass056 r9 = new AnonymousClass056();
                    r9.A0Z(5);
                    r9.A08(imageButton);
                    r9.A08(textView);
                    r9.A02 = 0;
                    AnonymousClass05D r32 = new AnonymousClass05D();
                    r32.A00 = Float.POSITIVE_INFINITY;
                    r9.A0Q(r32);
                    r9.A06(1500);
                    C017507m r03 = new C017507m(2);
                    r03.A08(imageButton);
                    r03.A08(textView);
                    r03.A02 = 0;
                    r03.A06(300);
                    C017307k r53 = new C017307k();
                    r53.A03 = true;
                    r53.A02 = 200;
                    r53.A0a(r9);
                    r53.A0a(r03);
                    r53.A0Y(new DecelerateInterpolator());
                    C018607y.A02(viewGroup, r53);
                    textStatusComposerActivity.A0f.setVisibility(8);
                    textStatusComposerActivity.A0i.setVisibility(0);
                    textStatusComposerActivity.A07.setVisibility(8);
                    textStatusComposerActivity.A09.setVisibility(8);
                    C148836zV r72 = textStatusComposerActivity.A0j;
                    r72.A0J.A02();
                    PowerManager.WakeLock wakeLock = r72.A02;
                    if (wakeLock != null) {
                        wakeLock.acquire(C148836zV.A00(r72) + C148836zV.A0N);
                    }
                    C160187kb r92 = r72.A0H;
                    r92.BJQ();
                    VoiceRecordingView voiceRecordingView2 = (VoiceRecordingView) r92;
                    VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = voiceRecordingView2.A0A;
                    voiceStatusRecordingVisualizer.A0B.clear();
                    voiceStatusRecordingVisualizer.A00 = 0;
                    voiceStatusRecordingVisualizer.A01 = 750;
                    voiceStatusRecordingVisualizer.A05 = false;
                    voiceStatusRecordingVisualizer.invalidate();
                    long j = r72.A01;
                    if (j != -1) {
                        C37151lt A002 = r72.A0D.A00(r72, j);
                        r72.A06 = A002;
                        A002.A01();
                        C55902vN.A00(C36361kB.A06(voiceRecordingView2));
                    }
                    r72.A05(0);
                    r72.A0A = true;
                }
            }
            this.A00 = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LO(C146646vw r3, AnonymousClass6VH r4) {
        super(r4, 1.0f, 2.0f);
        this.A01 = r3;
    }
}
