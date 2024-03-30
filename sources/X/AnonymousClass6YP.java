package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.SoundPool;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6YP  reason: invalid class name */
public class AnonymousClass6YP {
    public static int A1a;
    public static SoundPool A1b;
    public static int A1c;
    public static int A1d;
    public static int A1e;
    public static int A1f;
    public static volatile int A1g;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass28U A09;
    public AnonymousClass3PE A0A;
    public AnonymousClass11F A0B;
    public AnonymousClass5BQ A0C;
    public AnonymousClass3T1 A0D;
    public C91684cR A0E;
    public AnonymousClass3DQ A0F;
    public C132476Tw A0G;
    public AnonymousClass6Q9 A0H;
    public File A0I;
    public File A0J;
    public Runnable A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public ObjectAnimator A0P;
    public Handler A0Q;
    public PowerManager.WakeLock A0R;
    public AnonymousClass3DQ A0S;
    public boolean A0T;
    public final Rect A0U;
    public final Handler A0V;
    public final Handler A0W;
    public final View A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final TextView A0b;
    public final AnonymousClass01I A0c;
    public final AnonymousClass5VT A0d = new AnonymousClass5VT(0.0d);
    public final AnonymousClass5VT A0e;
    public final C19700wN A0f;
    public final C225014r A0g;
    public final AnonymousClass17Y A0h;
    public final AudioRecordFactory A0i;
    public final OpusRecorderFactory A0j;
    public final C33091eh A0k;
    public final C227815t A0l;
    public final AnonymousClass1V6 A0m;
    public final C39821ts A0n;
    public final C21060yb A0o;
    public final C19970wo A0p;
    public final C19420v0 A0q;
    public final C20810yC A0r;
    public final AnonymousClass1Y4 A0s;
    public final AnonymousClass1LX A0t;
    public final AnonymousClass3L2 A0u;
    public final AnonymousClass6QH A0v;
    public final AnonymousClass3P4 A0w;
    public final AnonymousClass3QH A0x;
    public final ClippingLayout A0y;
    public final ClippingLayout A0z;
    public final C19770wU A10;
    public final C65813To A11;
    public final C1492470k A12;
    public final AnonymousClass2ZP A13;
    public final AnonymousClass3Dv A14;
    public final C128666Dd A15;
    public final C160207kd A16;
    public final C121915tv A17;
    public final C158657hr A18;
    public final AnonymousClass005 A19;
    public final Runnable A1A;
    public final AtomicInteger A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final int A1E;
    public final int A1F;
    public final C20690y0 A1G;
    public final AnonymousClass1X4 A1H;
    public final AnonymousClass3FY A1I;
    public final C18820ts A1J;
    public final C21860zv A1K;
    public final AnonymousClass1D5 A1L;
    public final C19890wg A1M;
    public final C29711Xr A1N;
    public final C158577hj A1O;
    public final C64263Nh A1P;
    public final AnonymousClass13J A1Q;
    public final AnonymousClass3DT A1R;
    public final AnonymousClass33M A1S;
    public final C34071gP A1T;
    public final AnonymousClass1NK A1U;
    public final C27721Pm A1V;
    public final Runnable A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;

    public static void A0B(AnonymousClass6YP r6, AnonymousClass6Q9 r7, long j, boolean z) {
        try {
            if (!r6.A0O) {
                r7.A06();
            }
        } catch (Exception e) {
            if (!z || j < 1000) {
                C36321k7.A1K(e, "voicenote/stopandreleasevoicerecorder/stop ", AnonymousClass000.A0u());
            } else {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e);
                r6.A0f.A0D("VoiceNoteRecordingUI/stopAndReleaseVoiceRecorder/stop", (String) null, e);
            }
        } catch (Throwable th) {
            r6.A0u.A02(r7, j, z);
            throw th;
        }
        r6.A0u.A02(r7, j, z);
        try {
            ((OpusRecorder) r7.A09.getValue()).close();
            r7.A04.release();
            r6.A0O = false;
        } catch (Exception e2) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e2);
            r6.A0f.A0D("VoiceNoteRecordingUI/stopAndReleaseVoiceRecorder/release", (String) null, e2);
        }
        Runnable runnable = r6.A0K;
        if (runnable != null) {
            runnable.run();
            r6.A0K = null;
        }
        AnonymousClass3DQ r0 = r6.A0S;
        if (r0 != null) {
            r0.A00();
            r6.A0S = null;
        }
        C91684cR r1 = r6.A0E;
        if (r1 != null) {
            synchronized (r1) {
                r1.A02.quit();
            }
            r6.A0E = null;
        }
        Handler handler = r6.A0Q;
        if (handler != null) {
            handler.getLooper().quit();
            r6.A0Q = null;
        }
    }

    public static void A0D(AnonymousClass6YP r15, boolean z) {
        SharedPreferences.Editor A002;
        SharedPreferences A0E2;
        String str;
        AnonymousClass6YP r7 = r15;
        if (r15.A0V() && z) {
            r15.A04(A1c);
            C55922vP.A00(r15.A0o);
        }
        if (!AnonymousClass000.A1V(r15.A0H) || r15.A0B == null) {
            r15.A0I = null;
            r15.A0J = null;
            return;
        }
        C128666Dd r2 = r15.A15;
        r2.A03 = true;
        AnonymousClass11F r1 = r2.A06.A00.A0B;
        if (r1 != null) {
            if (r1 instanceof C177618e5) {
                C19420v0 r0 = r2.A04;
                A002 = C19420v0.A00(r0);
                A0E2 = C36341k9.A0E(r0);
                str = "ptt_draft_review_broadcast";
            } else if (AnonymousClass143.A0G(r1)) {
                C19420v0 r02 = r2.A04;
                A002 = C19420v0.A00(r02);
                A0E2 = C36341k9.A0E(r02);
                str = "ptt_draft_review_group";
            } else {
                boolean A0H2 = AnonymousClass143.A0H(r1);
                C19420v0 r03 = r2.A04;
                A002 = C19420v0.A00(r03);
                A0E2 = C36341k9.A0E(r03);
                if (A0H2) {
                    str = "ptt_draft_review_interop";
                } else {
                    str = "ptt_draft_review_individual";
                }
            }
            C36341k9.A0w(A002, str, C36341k9.A0B(A0E2, str) + 1);
        }
        AnonymousClass01I r22 = r15.A0c;
        C33521fV.A00(r22, r15.A0o, r22.getString(R.string.f12nameremoved));
        Log.i("voicenote/cachevoicenoteandpreview");
        r15.A0n.A0S();
        long elapsedRealtime = (SystemClock.elapsedRealtime() - r7.A06) + r7.A05;
        r7.A05 = elapsedRealtime;
        C36321k7.A1V("voicenote/cachevoicenoteandpreview duration:", AnonymousClass000.A0u(), elapsedRealtime);
        AnonymousClass6Q9 r23 = r7.A0H;
        r7.A0H = null;
        r7.A02();
        if (r7.A0r.A0E(6501)) {
            Handler A003 = r7.A00();
            A003.removeCallbacks(r7.A1W);
            A003.post(new C81243wh(r7, r23, 3, elapsedRealtime, z));
            return;
        }
        A0B(r7, r23, elapsedRealtime, false);
        File A032 = r23.A03();
        r7.A0M(A032, (File) r23.A0A.getValue(), r23.A01, A032.length(), elapsedRealtime, z);
    }

    public static void A0E(AnonymousClass6YP r11, boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        AnonymousClass6YP r4 = r11;
        r11.A1K.A02("VoiceNoteRecording", "End");
        C1492470k r0 = r11.A12;
        View view = r11.A0a;
        r0.A0E.setActivated(false);
        View findViewById = view.findViewById(R.id.input_layout_content);
        findViewById.setFocusable(true);
        C011504z.A06(findViewById, 1);
        ObjectAnimator objectAnimator = r11.A0P;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        r11.A0v.A02();
        if (r11.A0T) {
            AnonymousClass01I r2 = r11.A0c;
            C33521fV.A00(r2, r11.A0o, r2.getString(R.string.f12nameremoved));
        } else if (r11.A0H != null && r11.A0B != null) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("voicenote/stopvoicenote ");
            boolean z5 = z;
            C36331k8.A1S(A0u2, z);
            boolean z6 = !z;
            r4.A0T = z6;
            if (z6) {
                AnonymousClass01I r22 = r4.A0c;
                C33521fV.A00(r22, r4.A0o, r22.getString(R.string.f12nameremoved));
            }
            r4.A0n.A0S();
            r4.A1H.A0J(r4.A0B);
            r4.A03();
            C132476Tw r02 = r4.A0G;
            if (r02 != null && r02.A0D()) {
                r4.A0G.A09();
            }
            AnonymousClass6Q9 r03 = r4.A0H;
            if (r03 == null || !AnonymousClass6Q9.A00(r03)) {
                j = r4.A05;
            } else {
                j = (SystemClock.elapsedRealtime() - r4.A06) + r4.A05;
                r4.A05 = j;
            }
            C36321k7.A1V("voicenote/stopvoicenote duration:", AnonymousClass000.A0u(), j);
            AnonymousClass6Q9 r23 = r4.A0H;
            r4.A0H = null;
            r4.A02();
            boolean z7 = z4;
            if (r4.A0r.A0E(6501)) {
                r4.A0N = true;
                Handler A002 = r4.A00();
                A002.removeCallbacks(r4.A1W);
                A002.post(new C1500873x(r4, r23, j, z5, z4, z2, z3));
                return;
            }
            A0B(r4, r23, j, z5);
            File A032 = r23.A03();
            r4.A0N(A032, (File) r23.A0A.getValue(), A032.length(), j, z5, z7, z2, z3);
        }
    }

    public void A0I() {
        A0D(this, false);
        A0T(false, false);
        this.A0V.removeCallbacks(this.A1A);
        if (this.A0G != null) {
            A0L();
            this.A0G.A06();
            this.A0G = null;
        }
        this.A1V.unregisterObserver(this.A1U);
    }

    public void A0M(File file, File file2, long j, long j2, long j3, boolean z) {
        this.A13.A00();
        this.A16.BWB();
        long j4 = j2;
        if (j2 < 100 && j3 >= 1000) {
            C36341k9.A1M("voicenote/file too small; not previewing; voiceNoteFileLength=", AnonymousClass000.A0u(), j4);
            A01();
        }
        AnonymousClass6QH r7 = this.A0v;
        ImageView imageView = r7.A0O;
        float f = r7.A0C;
        int i = 1;
        if (C36401kF.A1X(r7.A0R)) {
            i = -1;
        }
        imageView.setTranslationX(f * ((float) i));
        C160887lk r2 = r7.A04;
        if (r2 != null) {
            r2.Bf2();
        }
        if (this.A0C != null) {
            A0F(file2, 0, false);
        }
        C90464aC.A0t(this.A0R);
        if (z) {
            this.A1T.A00 = false;
            if (this.A1Y) {
                this.A0c.setRequestedOrientation(-1);
            }
            this.A0x.A01();
        }
        if (j3 < 1000 || j2 < 100) {
            A03();
            A0G(false);
            C1498172w.A02(this.A10, file, file2, 9);
            this.A0I = null;
            this.A0J = null;
            return;
        }
        Pair A042 = this.A11.A04(this.A0B, this.A0D, file, file2);
        File file3 = (File) A042.first;
        File file4 = (File) A042.second;
        AnonymousClass3DT r6 = this.A1R;
        if (file3 != null) {
            long j5 = j;
            if (j >= 2) {
                r6.A01.Boy(new C80363vH(r6, file3.getName().split("@")[0], 1, j5));
            }
        }
        C1498172w.A02(this.A10, file, file2, 9);
        A03();
        C132476Tw r0 = this.A0G;
        if (r0 != null && r0.A0D()) {
            this.A0G.A09();
        }
        if (z && !this.A0c.isFinishing()) {
            if (file3 != null) {
                A0P(file3, file4, false, true);
            } else {
                Log.e("voicenote/ error caching voice note for preview");
                A0G(false);
            }
        }
        this.A0I = file3;
        this.A0J = file4;
    }

    public void A0S(boolean z) {
        File file = this.A0I;
        if (file != null) {
            this.A1R.A00(file);
            File file2 = this.A0I;
            A0O(file2, this.A0J, file2.length(), z);
            this.A0I = null;
            A04(A1e);
            this.A0J = null;
        }
    }

    public void A0T(boolean z, boolean z2) {
        A0E(this, z, z2, true, false);
    }

    private Handler A00() {
        Handler handler = this.A0Q;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("VoiceRecorderHandler");
        handlerThread.start();
        Handler A0M2 = C90514aH.A0M(handlerThread);
        this.A0Q = A0M2;
        return A0M2;
    }

    private void A01() {
        View view = this.A0a;
        C90494aF.A0v(view, R.id.voice_note_pulse);
        ObjectAnimator objectAnimator = this.A0P;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        A04(A1f);
        View findViewById = view.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = view.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = view.findViewById(R.id.voice_cancel_trashcan_lid);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160);
        translateAnimation3.setStartOffset(746);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160);
        rotateAnimation2.setStartOffset(746);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        boolean A0E2 = this.A0r.A0E(4268);
        int i = R.id.emoji_picker_btn;
        if (A0E2) {
            i = R.id.input_attach_button_left;
        }
        View findViewById4 = view.findViewById(i);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C100694vR(findViewById2, findViewById, findViewById3, findViewById4, this));
    }

    private void A02() {
        C35771jE r2;
        Runnable runnable = this.A0K;
        if (runnable != null) {
            runnable.run();
            this.A0K = null;
        }
        int i = this.A1F;
        if (i > 0) {
            C19770wU r7 = this.A10;
            C35771jE BpM = r7.BpM(new C1497472p(this, 30), "VoiceNoteRecordingUI/maxEncoderStopTimeToCrashAppRunnable", ((long) i) * 1000);
            int i2 = this.A1E;
            if (i2 >= i) {
                r2 = r7.BpM(new C1497472p(this, 31), "VoiceNoteRecordingUI/maxEncoderStopTimeToLogCriticalErrorRunnable", ((long) i2) * 1000);
            } else {
                r2 = null;
            }
            this.A0K = new AnonymousClass737(this, BpM, r2, 22);
        }
    }

    private void A03() {
        if (this.A1X) {
            AnonymousClass6QH r0 = this.A0v;
            r0.A0G.removeCallbacks(r0.A0T);
            View view = this.A0a;
            if (view != null && view.getKeepScreenOn()) {
                view.setKeepScreenOn(false);
            }
            if (this.A0L) {
                this.A0L = false;
                this.A0l.unregisterObserver(this.A0k);
            }
        }
    }

    private void A04(int i) {
        SoundPool soundPool = A1b;
        AnonymousClass00C.A0D(soundPool, 0);
        ((C19930wk) this.A19.get()).execute(new AnonymousClass73O(soundPool, (WeakReference) null, 1.0f, 1.0f, i));
    }

    public static void A05(AnonymousClass6YP r3) {
        C132476Tw r2 = r3.A0G;
        if (r2 != null) {
            try {
                int i = r3.A04;
                if (i != -1) {
                    r2.A0A(i);
                    if (r3.A0G.A0D()) {
                        r3.A0V.post(r3.A1A);
                        C1492470k r32 = r3.A12;
                        r32.A0J.A01();
                        r32.A01.setImageResource(R.drawable.inline_audio_pause);
                        C36331k8.A0q(r32.A05, r32.A01, R.string.f12nameremoved);
                    }
                }
            } catch (IOException e) {
                C36321k7.A1W("Error resuming playback after seek ", AnonymousClass000.A0u(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        com.whatsapp.util.Log.e("VoiceNoteRecordingUI/resumeRecording/resume failed", r1);
        r6.A0T(false, false);
        r6.A0g.BO5(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass6YP r6) {
        /*
            X.6Q9 r2 = r6.A0H
            if (r2 != 0) goto L_0x000a
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording/resume voice recorder is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            X.6QH r1 = r6.A0v
            r0 = 1
            r1.A0A = r0
            X.70k r5 = r6.A12
            X.00T r0 = r2.A0A
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x001f
            X.0wU r1 = r5.A0K
            r0 = 5
            X.C1498172w.A02(r1, r5, r2, r0)
        L_0x001f:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A06 = r0
            X.6Tw r0 = r6.A0G
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0034
            X.6Tw r0 = r6.A0G
            r0.A09()
        L_0x0034:
            r4 = 0
            A09(r6)     // Catch:{ IOException -> 0x00a8 }
            boolean r0 = r6.A1Y     // Catch:{ IOException -> 0x00a8 }
            if (r0 == 0) goto L_0x0041
            X.01I r0 = r6.A0c     // Catch:{ IOException -> 0x00a8 }
            X.C55902vN.A00(r0)     // Catch:{ IOException -> 0x00a8 }
        L_0x0041:
            X.1gP r0 = r6.A1T     // Catch:{ IOException -> 0x00a8 }
            r3 = 1
            r0.A00 = r3     // Catch:{ IOException -> 0x00a8 }
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()     // Catch:{ IOException -> 0x00a8 }
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)     // Catch:{ IOException -> 0x00a8 }
            r0 = 16
            X.C162657ow.A00(r2, r5, r0)     // Catch:{ IOException -> 0x00a8 }
            X.1RJ r0 = r5.A0J     // Catch:{ IOException -> 0x00a8 }
            android.view.View r0 = r0.A01()     // Catch:{ IOException -> 0x00a8 }
            r0.startAnimation(r2)     // Catch:{ IOException -> 0x00a8 }
            android.view.animation.AnimationSet r2 = X.C55912vO.A00(r4)     // Catch:{ IOException -> 0x00a8 }
            android.view.animation.AnimationSet r1 = X.C55912vO.A00(r3)     // Catch:{ IOException -> 0x00a8 }
            X.4vS r0 = new X.4vS     // Catch:{ IOException -> 0x00a8 }
            r0.<init>(r1, r5, r4)     // Catch:{ IOException -> 0x00a8 }
            r2.setAnimationListener(r0)     // Catch:{ IOException -> 0x00a8 }
            r0 = 13
            X.C162657ow.A00(r1, r5, r0)     // Catch:{ IOException -> 0x00a8 }
            android.widget.ImageButton r0 = r5.A0D     // Catch:{ IOException -> 0x00a8 }
            r0.startAnimation(r2)     // Catch:{ IOException -> 0x00a8 }
            X.5VT r3 = r6.A0e     // Catch:{ IOException -> 0x00a8 }
            X.6Q9 r2 = r6.A0H     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ IOException -> 0x00a8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a8 }
            r0.start()     // Catch:{ IOException -> 0x00a8 }
            X.4cR r1 = new X.4cR     // Catch:{ IOException -> 0x00a8 }
            r1.<init>(r0, r3, r2)     // Catch:{ IOException -> 0x00a8 }
            r6.A0E = r1     // Catch:{ IOException -> 0x00a8 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00a8 }
            r1.sendEmptyMessage(r4)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x00a8 }
            android.os.Handler r0 = r6.A0W     // Catch:{ IOException -> 0x00a8 }
            r0.sendEmptyMessage(r4)     // Catch:{ IOException -> 0x00a8 }
            X.01I r2 = r6.A0c     // Catch:{ IOException -> 0x00a8 }
            X.0yb r1 = r6.A0o     // Catch:{ IOException -> 0x00a8 }
            r0 = 2131895857(0x7f122631, float:1.9426559E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IOException -> 0x00a8 }
            X.C33521fV.A00(r2, r1, r0)     // Catch:{ IOException -> 0x00a8 }
            return
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x00a8 }
            throw r0     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeRecording/resume failed"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A0T(r4, r4)
            X.14r r1 = r6.A0g
            r0 = 2131889330(0x7f120cb2, float:1.941332E38)
            r1.BO5(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A06(X.6YP):void");
    }

    public static void A07(AnonymousClass6YP r3) {
        C1492470k r32 = r3.A12;
        r32.A0J.A01();
        ImageButton imageButton = r32.A01;
        Context context = r32.A05;
        C36391kE.A18(context, imageButton, R.drawable.inline_audio_play);
        C36331k8.A0q(context, r32.A01, R.string.f12nameremoved);
    }

    public static void A08(AnonymousClass6YP r8) {
        boolean z;
        int i;
        if (r8.A0G != null) {
            C1492470k r2 = r8.A12;
            if (AnonymousClass000.A1Q(r2.A04.getVisibility())) {
                if (r2.A04.getProgress() != 0 || r8.A0G.A0D()) {
                    z = false;
                    i = r2.A04.getProgress();
                } else {
                    z = true;
                    i = r2.A04.getMax();
                }
            } else if (r2.A03.getVisibility() != 0) {
                z = true;
                i = 0;
            } else if (r2.A03.A00 != 0.0f || r8.A0G.A0D()) {
                z = false;
                i = r8.A0G.A02();
            } else {
                z = true;
                i = r8.A0G.A03();
            }
            AnonymousClass01I r7 = r8.A0c;
            int i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            String A0v2 = C36391kE.A0v(r7, AnonymousClass3UY.A0A(r8.A1J, (long) i), new Object[1], 0, i2);
            r2.A04.setContentDescription(A0v2);
            r2.A03.setContentDescription(A0v2);
        }
    }

    public static void A09(AnonymousClass6YP r3) {
        AnonymousClass6Q9 r0 = r3.A0H;
        if (r0 != null) {
            r0.A05();
            AnonymousClass17Y r2 = r3.A0h;
            AnonymousClass2ZP r1 = r3.A13;
            Objects.requireNonNull(r1);
            C1497472p.A01(r2, r1, 29);
            r3.A0S = r3.A0w.A01(3);
        }
    }

    public static void A0A(AnonymousClass6YP r4, int i, boolean z) {
        C132476Tw r0 = r4.A0G;
        if (r0 != null && z) {
            r4.A04 = i;
            if (i == 0 && !r0.A0D()) {
                i = r4.A0G.A03();
            }
            C1492470k r2 = r4.A12;
            C90504aG.A16(r2.A02, r2.A0H, C36391kE.A0B((long) i));
            if (!r4.A0G.A0D()) {
                A07(r4);
            }
        }
    }

    private void A0G(boolean z) {
        View view = this.A0a;
        view.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        if (this.A1X) {
            view.findViewById(R.id.send).setEnabled(C36421kH.A1a(C36371kC.A0u(this.A0b).trim()));
            C1492470k r1 = this.A12;
            r1.A0B.setVisibility(8);
            r1.A09.setVisibility(8);
            VoiceVisualizer voiceVisualizer = r1.A0G;
            voiceVisualizer.A0C.clear();
            voiceVisualizer.A06 = false;
            voiceVisualizer.A03 = 0;
            voiceVisualizer.A04 = 166;
        }
        this.A0v.A05(z);
        View findViewById = view.findViewById(R.id.input_layout_content);
        findViewById.clearAnimation();
        AlphaAnimation A0D2 = C36351kA.A0D();
        A0D2.setDuration(160);
        A0D2.setFillBefore(true);
        A0D2.setFillAfter(true);
        findViewById.startAnimation(A0D2);
        view.findViewById(R.id.footer).setClipBounds((Rect) null);
        this.A0z.setClipBounds((Rect) null);
        View findViewById2 = view.findViewById(R.id.voice_note_pulse);
        findViewById2.clearAnimation();
        ((ImageView) findViewById2).getDrawable().setAlpha(255);
    }

    public void A0H() {
        if (TextUtils.isEmpty(C36371kC.A0u(this.A0b).trim()) && this.A14.A00() && A0W()) {
            C64263Nh.A00(this.A1P, 3);
            this.A0v.A01();
        }
    }

    public void A0J() {
        Log.i("VoiceNoteRecordingUI/onPauseActivity/");
        if (this.A0r.A0E(4166)) {
            A0D(this, A0V());
        } else {
            A0K();
        }
    }

    public void A0K() {
        if (A0V()) {
            AnonymousClass6Q9 r3 = this.A0H;
            if (r3 == null) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/voice recorder ir null");
                return;
            }
            try {
                AnonymousClass00T r1 = r3.A09;
                ((OpusRecorder) r1.getValue()).pause();
                r3.A01 = ((OpusRecorder) r1.getValue()).getPageNumber();
                try {
                    this.A0H.A07();
                } catch (IOException e) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e);
                }
                this.A15.A03 = true;
                long elapsedRealtime = (SystemClock.elapsedRealtime() - this.A06) + this.A05;
                this.A05 = elapsedRealtime;
                if (!C36401kF.A1U((elapsedRealtime > 1000 ? 1 : (elapsedRealtime == 1000 ? 0 : -1)))) {
                    A0T(false, false);
                    return;
                }
                A04(A1c);
                C21060yb r32 = this.A0o;
                C55922vP.A00(r32);
                C91684cR r12 = this.A0E;
                if (r12 != null) {
                    synchronized (r12) {
                        r12.A02.quit();
                    }
                    this.A0E = null;
                }
                Handler handler = this.A0Q;
                if (handler != null) {
                    handler.getLooper().quitSafely();
                    this.A0Q = null;
                }
                this.A0x.A01();
                if (this.A1Y) {
                    this.A0c.setRequestedOrientation(-1);
                }
                this.A0W.removeCallbacksAndMessages((Object) null);
                C1492470k r5 = this.A12;
                r5.A0L.clear();
                A0P(this.A0H.A03(), (File) this.A0H.A0A.getValue(), false, true);
                this.A1T.A00 = false;
                this.A13.A00();
                VoiceVisualizer voiceVisualizer = r5.A0G;
                voiceVisualizer.A06 = false;
                voiceVisualizer.A03 = 0;
                voiceVisualizer.A04 = 166;
                AnonymousClass3DQ r0 = this.A0S;
                if (r0 != null) {
                    r0.A00();
                    this.A0S = null;
                }
                AnonymousClass01I r13 = this.A0c;
                C33521fV.A00(r13, r32, r13.getString(R.string.f12nameremoved));
            } catch (IOException e2) {
                Log.e("VoiceNoteRecordingUI/pauseRecording/pause failed", e2);
                try {
                    this.A0H.A07();
                } catch (IOException e3) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e3);
                }
            } catch (Throwable th) {
                try {
                    this.A0H.A07();
                    throw th;
                } catch (IOException e4) {
                    Log.e("VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed", e4);
                    throw th;
                }
            }
        }
    }

    public void A0L() {
        C132476Tw r0 = this.A0G;
        if (r0 != null && r0.A0D()) {
            this.A0G.A04();
            this.A0x.A01();
            AnonymousClass3DQ r02 = this.A0F;
            if (r02 != null) {
                r02.A00();
                this.A0F = null;
            }
        }
        A07(this);
        this.A0V.removeCallbacks(this.A1A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r5 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r32 > 100) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        X.C36341k9.A1M("voicenote/file too small; not sending; voiceNoteFileLength=", X.AnonymousClass000.A0u(), r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(java.io.File r30, java.io.File r31, long r32, long r34, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            r29 = this;
            r8 = r29
            r0 = r39
            r8.A0G(r0)
            X.2ZP r0 = r8.A13
            r0.A00()
            r7 = 0
            r8.A0N = r7
            r1 = 1000(0x3e8, double:4.94E-321)
            r19 = r34
            int r0 = (r34 > r1 ? 1 : (r34 == r1 ? 0 : -1))
            boolean r5 = X.C36401kF.A1U(r0)
            r3 = 100
            r0 = r32
            int r2 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            boolean r2 = X.C36401kF.A1U(r2)
            r9 = r31
            if (r36 == 0) goto L_0x012d
            if (r2 == 0) goto L_0x012d
            if (r5 != 0) goto L_0x0034
        L_0x002b:
            int r2 = A1a
            r8.A04(r2)
        L_0x0030:
            if (r36 == 0) goto L_0x0124
            if (r5 == 0) goto L_0x0041
        L_0x0034:
            int r2 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0041
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "voicenote/file too small; not sending; voiceNoteFileLength="
            X.C36341k9.A1M(r2, r3, r0)
        L_0x0041:
            X.1gP r2 = r8.A1T
            r2.A00 = r7
            r2 = 0
            r8.A0H = r2
            X.01I r3 = r8.A0c
            r2 = -1
            r3.setRequestedOrientation(r2)
            X.3QH r2 = r8.A0x
            r2.A01()
            android.os.PowerManager$WakeLock r2 = r8.A0R
            X.C90464aC.A0t(r2)
            X.0yb r2 = r8.A0o
            X.C55922vP.A00(r2)
            r6 = 1
            r14 = r30
            if (r36 == 0) goto L_0x0105
            r3 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r34 > r3 ? 1 : (r34 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00d7
            r3 = 100
            int r2 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00d7
            X.0yC r3 = r8.A0r
            r2 = 7698(0x1e12, float:1.0787E-41)
            boolean r2 = r3.A0E(r2)
            if (r2 != 0) goto L_0x007d
            r2 = 50
            android.os.SystemClock.sleep(r2)
        L_0x007d:
            int r2 = A1e
            r8.A04(r2)
            X.6Dd r3 = r8.A15
            X.6QH r2 = r8.A0v
            boolean r2 = r2.A0A
            r22 = r0
            r24 = r2
            r25 = r19
            r21 = r3
            r21.A00(r22, r24, r25)
            X.3DT r3 = r8.A1R
            java.io.File r2 = r8.A0I
            r3.A00(r2)
            X.5BQ r2 = r8.A0C
            if (r2 == 0) goto L_0x00cd
            long r1 = X.C36391kE.A0B(r19)
            int r0 = (int) r1
            r8.A0F(r9, r0, r6)
        L_0x00a6:
            X.7kd r0 = r8.A16
            r0.BkZ()
        L_0x00ab:
            int r1 = r8.A01
            if (r1 == 0) goto L_0x00bf
            android.view.View r3 = r8.A0a
            r0 = 21
            X.3wm r2 = new X.3wm
            r2.<init>((java.lang.Object) r8, (int) r1, (int) r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            r8.A01 = r7
        L_0x00bf:
            android.view.View r0 = r8.A0X
            r0.setFocusable(r6)
            r0.setFocusableInTouchMode(r6)
            r0.requestFocus()
            r8.A0M = r7
            return
        L_0x00cd:
            r15 = r38
            r10 = r8
            r11 = r14
            r12 = r9
            r13 = r0
            r10.A0O(r11, r12, r13, r15)
            goto L_0x00a6
        L_0x00d7:
            if (r5 != 0) goto L_0x011c
            int r2 = A1d
            r8.A04(r2)
            X.6Dd r2 = r8.A15
            X.6QH r3 = r8.A0v
            boolean r13 = r3.A0A
            X.9Q5 r15 = r2.A05
            long r10 = r2.A01
            long r4 = r2.A02
            boolean r12 = r2.A03
            long r2 = r2.A00
            r16 = 3
            r27 = r13
            r28 = r12
            r23 = r4
            r25 = r2
            r21 = r10
            r17 = r0
            r15.A00(r16, r17, r19, r21, r23, r25, r27, r28)
            X.1ts r0 = r8.A0n
            r0.A0U(r7)
            goto L_0x011c
        L_0x0105:
            r3 = 0
            int r2 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x011c
            X.6Dd r3 = r8.A15
            X.6QH r2 = r8.A0v
            boolean r2 = r2.A0A
            r21 = r0
            r23 = r2
            r24 = r19
            r20 = r3
            r20.A01(r21, r23, r24)
        L_0x011c:
            X.0wU r1 = r8.A10
            r0 = 9
            X.C1498172w.A02(r1, r14, r9, r0)
            goto L_0x00ab
        L_0x0124:
            X.5BQ r2 = r8.A0C
            if (r2 == 0) goto L_0x0041
            r8.A0F(r9, r7, r7)
            goto L_0x0041
        L_0x012d:
            if (r5 == 0) goto L_0x002b
            if (r37 == 0) goto L_0x002b
            r8.A01()
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A0N(java.io.File, java.io.File, long, long, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (r1.A0M == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.io.File r20, java.io.File r21, long r22, boolean r24) {
        /*
            r19 = this;
            r2 = r20
            X.C18740tg.A06(r2)
            r1 = r19
            X.11F r0 = r1.A0B
            X.C18740tg.A06(r0)
            X.6Dd r3 = r1.A15
            X.6Tw r0 = r1.A0G
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.A03()
            long r7 = (long) r0
        L_0x0017:
            X.6QH r0 = r1.A0v
            boolean r6 = r0.A0A
            r4 = r22
            r3.A00(r4, r6, r7)
            X.0y0 r5 = r1.A1G
            X.0wg r4 = r1.A1M
            X.11F r0 = r1.A0B
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00ae
            X.1Gl r3 = X.C25471Gl.A0U
        L_0x002c:
            r0 = 1
            java.io.File r4 = X.AnonymousClass1GW.A0F(r5, r4, r3, r2, r0)
            boolean r0 = r2.renameTo(r4)
            if (r0 != 0) goto L_0x0049
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voicenote/sendvoicenotefile/failed to rename "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " to "
            X.C36321k7.A1J(r4, r0, r3)
            r4 = r2
        L_0x0049:
            X.3Qj r7 = new X.3Qj
            r7.<init>()
            r7.A0I = r4
            X.1D5 r5 = r1.A1L
            X.11F r9 = r1.A0B
            r6 = 0
            X.3T1 r10 = r1.A0D
            X.0yC r3 = r1.A0r
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r1.A0M
            r4 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            r15 = 2
            X.0yC r3 = r5.A0A
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x0076
            r15 = 82
        L_0x0076:
            r17 = 0
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = 1
            r18 = r24
            r8 = r6
            X.2bU r5 = r5.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.28U r4 = r1.A09
            if (r4 == 0) goto L_0x009a
            X.3PE r3 = r1.A0A
            if (r3 == 0) goto L_0x009a
            X.3FY r0 = r1.A1I
            X.3BG r0 = r0.A00(r4, r3)
            r5.A0V = r0
            r0 = 1024(0x400, float:1.435E-42)
            r5.A0j(r0)
        L_0x009a:
            int r0 = r5.A0B
            if (r0 != 0) goto L_0x00a4
            int r0 = X.AnonymousClass1GW.A04(r2)
            r5.A0B = r0
        L_0x00a4:
            X.3L2 r0 = r1.A0u
            X.2bi r5 = (X.C46812bi) r5
            r1 = r21
            r0.A00(r6, r5, r1)
            return
        L_0x00ae:
            X.1Gl r3 = X.C25471Gl.A0L
            goto L_0x002c
        L_0x00b2:
            r7 = -1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A0O(java.io.File, java.io.File, long, boolean):void");
    }

    public void A0Q(boolean z) {
        AnonymousClass11F r1;
        this.A1R.A00(this.A0I);
        if (z && (r1 = this.A0B) != null) {
            this.A11.A06(r1);
            this.A0I = null;
            this.A0J = null;
        }
        this.A0V.removeCallbacks(this.A1A);
        if (this.A0G != null) {
            A0L();
            this.A0G.A06();
            this.A0G = null;
        }
        View findViewById = this.A0a.findViewById(R.id.input_layout_content);
        findViewById.setFocusable(true);
        C011504z.A06(findViewById, 1);
        float f = -1.0f;
        if (C36351kA.A1Y(this.A1J)) {
            f = 1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setAnimationListener(new C162647ov(findViewById, this, 2));
        findViewById.startAnimation(translateAnimation);
        C1492470k r2 = this.A12;
        r2.A0B.setVisibility(8);
        r2.A09.setVisibility(8);
        VoiceVisualizer voiceVisualizer = r2.A0G;
        voiceVisualizer.A0C.clear();
        voiceVisualizer.A06 = false;
        voiceVisualizer.A03 = 0;
        voiceVisualizer.A04 = 166;
    }

    public void A0R(boolean z) {
        SharedPreferences.Editor A002;
        SharedPreferences A0E2;
        String str;
        if (this.A0H != null) {
            C128666Dd r6 = this.A15;
            AnonymousClass11F r1 = r6.A06.A00.A0B;
            if (r1 != null) {
                if (r1 instanceof C177618e5) {
                    C19420v0 r0 = r6.A04;
                    A002 = C19420v0.A00(r0);
                    A0E2 = C36341k9.A0E(r0);
                    str = "ptt_lock_broadcast";
                } else if (AnonymousClass143.A0G(r1)) {
                    C19420v0 r02 = r6.A04;
                    A002 = C19420v0.A00(r02);
                    A0E2 = C36341k9.A0E(r02);
                    str = "ptt_lock_group";
                } else {
                    boolean A0H2 = AnonymousClass143.A0H(r1);
                    C19420v0 r03 = r6.A04;
                    A002 = C19420v0.A00(r03);
                    A0E2 = C36341k9.A0E(r03);
                    if (A0H2) {
                        str = "ptt_lock_interop";
                    } else {
                        str = "ptt_lock_individual";
                    }
                }
                C36341k9.A0w(A002, str, C36341k9.A0B(A0E2, str) + 1);
            }
            AnonymousClass9Q5 r04 = r6.A05;
            r04.A00.Bly(new AnonymousClass2Mx());
            View view = this.A0a;
            C90494aF.A0v(view, R.id.buttons);
            C227815t r12 = this.A0l;
            if (r12.A00.A00() >= 16.0d) {
                if (!view.getKeepScreenOn()) {
                    view.setKeepScreenOn(true);
                }
                if (!this.A0L) {
                    this.A0L = true;
                    r12.registerObserver(this.A0k);
                }
            }
            C1492470k r5 = this.A12;
            C1492270i r62 = new C1492270i(this, z);
            C163627qV r3 = new C163627qV(this, 0);
            C36351kA.A1E(r5.A0C, r62, 9);
            C36351kA.A1E(r5.A0D, r3, 11);
            r5.A0B.setVisibility(0);
            r5.A02();
            VoiceVisualizer voiceVisualizer = r5.A0G;
            voiceVisualizer.setEnabled(true);
            if (r5.A0M) {
                voiceVisualizer.setVisibility(0);
            }
            r5.A0A.setVisibility(0);
            r5.A0J.A03(8);
            AnonymousClass2ZP r13 = this.A13;
            Log.i("voicenote/notifyVoiceNoteLocked");
            C18740tg.A01();
            Iterator A0s2 = C36361kB.A0s(r13);
            while (A0s2.hasNext()) {
                ((AnonymousClass3L3) A0s2.next()).A01();
            }
            this.A0v.A06(true);
            C36381kD.A18(view, R.id.voice_recorder_decor);
        }
    }

    public boolean A0U() {
        return AnonymousClass000.A1Q(this.A12.A0B.getVisibility());
    }

    public boolean A0V() {
        AnonymousClass6Q9 r0 = this.A0H;
        if (r0 == null || !AnonymousClass6Q9.A00(r0)) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        SharedPreferences.Editor A002;
        SharedPreferences A0E2;
        String str;
        AnonymousClass33M r0 = this.A1S;
        if (r0 != null) {
            C62493Gj r2 = r0.A00;
            AnonymousClass1YV.A02(r2.A03, true);
            r2.A02.A06();
        }
        this.A0N = false;
        C128666Dd r8 = this.A15;
        AnonymousClass11F r1 = r8.A06.A00.A0B;
        if (r1 != null) {
            if (r1 instanceof C177618e5) {
                C19420v0 r02 = r8.A04;
                A002 = C19420v0.A00(r02);
                A0E2 = C36341k9.A0E(r02);
                str = "ptt_record_broadcast";
            } else if (AnonymousClass143.A0G(r1)) {
                C19420v0 r03 = r8.A04;
                A002 = C19420v0.A00(r03);
                A0E2 = C36341k9.A0E(r03);
                str = "ptt_record_group";
            } else {
                boolean A0H2 = AnonymousClass143.A0H(r1);
                C19420v0 r04 = r8.A04;
                A002 = C19420v0.A00(r04);
                A0E2 = C36341k9.A0E(r04);
                if (A0H2) {
                    str = "ptt_record_interop";
                } else {
                    str = "ptt_record_individual";
                }
            }
            C36341k9.A0w(A002, str, C36341k9.A0B(A0E2, str) + 1);
        }
        r8.A03 = false;
        r8.A00 = 0;
        r8.A01 = 0;
        r8.A02 = 0;
        AnonymousClass3L2 r9 = this.A0u;
        C225014r r4 = this.A0g;
        AnonymousClass01I r3 = this.A0c;
        if (r9.A03(r3, r4, this.A0B)) {
            if (this.A0H != null) {
                Log.e("voicenote/startvoicenote/inprogress");
            } else {
                this.A1K.A02("VoiceNoteRecording", "Resume");
                View view = this.A0X;
                view.clearFocus();
                view.setFocusable(false);
                this.A0m.A04();
                if (this.A1Y) {
                    C55902vN.A00(r3);
                }
                PowerManager.WakeLock wakeLock = this.A0R;
                if (wakeLock != null) {
                    wakeLock.acquire();
                }
                this.A0x.A02();
                this.A0n.A0S();
                C55922vP.A00(this.A0o);
                SoundPool soundPool = A1b;
                int i = A1g;
                C165087sr r05 = new C165087sr(this, 9);
                AnonymousClass00C.A0D(soundPool, 0);
                ((C19930wk) this.A19.get()).execute(new AnonymousClass73O(soundPool, AnonymousClass001.A0F(r05), 1.0f, 1.0f, i));
                C121915tv r7 = this.A17;
                TextView textView = r7.A00;
                C18820ts r32 = r7.A02;
                C90504aG.A16(textView, r32, 0);
                textView.setVisibility(0);
                C90504aG.A16(r7.A01, r32, 0);
                this.A02 = 0;
                this.A03 = 0;
                C1492470k r72 = this.A12;
                r72.A0L.clear();
                this.A00 = 0;
                AnonymousClass5VT r22 = this.A0d;
                r22.A00.set(Double.doubleToRawLongBits(1.0d));
                View view2 = this.A0a;
                View findViewById = view2.findViewById(R.id.voice_note_pulse);
                findViewById.setVisibility(0);
                if (this.A0P == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", new float[]{0.0f, 1.0f});
                    this.A0P = ofFloat;
                    ofFloat.setInterpolator(new C133386Yf(r22));
                    this.A0P.setDuration(500);
                    this.A0P.setRepeatMode(2);
                    this.A0P.setRepeatCount(-1);
                }
                this.A0P.start();
                C90494aF.A0v(view2, R.id.buttons);
                View findViewById2 = view2.findViewById(R.id.input_layout_content);
                findViewById2.clearAnimation();
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(160);
                alphaAnimation.setFillBefore(true);
                alphaAnimation.setFillAfter(true);
                findViewById2.startAnimation(alphaAnimation);
                C36341k9.A10(view2, R.id.voice_recorder_decor, 0);
                findViewById2.setFocusable(false);
                C011504z.A06(findViewById2, 4);
                try {
                    C20810yC r15 = this.A0r;
                    AnonymousClass17Y r14 = this.A0h;
                    AudioRecordFactory audioRecordFactory = this.A0i;
                    OpusRecorderFactory opusRecorderFactory = this.A0j;
                    OpusRecorderFactory opusRecorderFactory2 = opusRecorderFactory;
                    AudioRecordFactory audioRecordFactory2 = audioRecordFactory;
                    C19700wN r12 = this.A0f;
                    this.A0H = new AnonymousClass6Q9(r12, this.A1G, r14, audioRecordFactory2, opusRecorderFactory2, this.A0p, r15, r72);
                    this.A1T.A00 = true;
                    this.A07 = SystemClock.elapsedRealtime();
                    this.A06 = SystemClock.elapsedRealtime();
                    this.A05 = 0;
                    if (this.A1Z) {
                        A00().post(new C1497472p(this, 33));
                    } else {
                        this.A0H.A04();
                    }
                } catch (Exception unused) {
                    r9.A01(this.A0H, 0, false);
                    A0T(false, false);
                    r4.BO5(R.string.f12nameremoved);
                }
                if (this.A1D) {
                    Handler A003 = A00();
                    Runnable runnable = this.A1W;
                    A003.removeCallbacks(runnable);
                    A003.postDelayed(runnable, 160);
                } else {
                    Runnable runnable2 = this.A1W;
                    view2.removeCallbacks(runnable2);
                    view2.postDelayed(runnable2, 160);
                }
                this.A0T = false;
                r72.A0E.setActivated(false);
                this.A0v.A03(this.A07);
                if (this.A1X) {
                    r72.A03(R.drawable.ic_pause_draft_preview);
                }
                return true;
            }
        }
        return false;
    }

    public static void A0C(AnonymousClass6YP r2, File file) {
        C18740tg.A06(file);
        try {
            C132476Tw r0 = r2.A0G;
            if (r0 != null) {
                r0.A06();
            }
            C132476Tw A002 = C132476Tw.A00((C19630wG) null, (C20810yC) null, (AnonymousClass6KH) null, file, 3);
            r2.A0G = A002;
            A002.A05();
            r2.A0G.A0C(r2.A1O);
        } catch (IOException e) {
            r2.A0G = null;
            Log.e("voicenoterecordingui/prepareVoiceNoteDraftPlayer/ error creating audio player for voice note preview ", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r12.A0M == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(java.io.File r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voicenote/onrecordingstopped "
            X.C36321k7.A1X(r0, r1, r15)
            X.5BQ r1 = r12.A0C
            r0 = 1
            r1.A01 = r0
            if (r15 == 0) goto L_0x006f
            X.3Qj r3 = new X.3Qj
            r3.<init>()
            r3.A0Q = r0
            X.5BQ r0 = r12.A0C
            X.5z9 r0 = r0.A02
            java.io.File r0 = r0.A07
            X.C18740tg.A06(r0)
            r3.A0I = r0
            X.1Xr r2 = r12.A1N
            X.11F r4 = r12.A0B
            X.C18740tg.A06(r4)
            long r7 = r12.A08
            java.lang.String r6 = r0.getName()
            java.io.File r0 = r3.A0I
            long r9 = r0.length()
            X.3T1 r5 = r12.A0D
            X.0yC r1 = r12.A0r
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r12.A0M
            r11 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r11 = 0
        L_0x0047:
            X.2bi r3 = r2.A00(r3, r4, r5, r6, r7, r9, r11)
            r3.A0B = r14
            X.28U r2 = r12.A09
            if (r2 == 0) goto L_0x0062
            X.3PE r1 = r12.A0A
            if (r1 == 0) goto L_0x0062
            X.3FY r0 = r12.A1I
            X.3BG r0 = r0.A00(r2, r1)
            r3.A0V = r0
            r0 = 1024(0x400, float:1.435E-42)
            r3.A0j(r0)
        L_0x0062:
            X.5BQ r0 = r12.A0C
            X.6vi r1 = r0.A00
            X.3L2 r0 = r12.A0u
            r0.A00(r1, r3, r13)
        L_0x006b:
            r0 = 0
            r12.A0C = r0
            return
        L_0x006f:
            X.1Y4 r2 = r12.A0s
            X.5BQ r1 = r12.A0C
            java.lang.String r0 = "app/mediajobmanager/cancelVoiceNoteUpload"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1D0 r3 = r2.A0C
            X.6vi r2 = r1.A00
            X.0wU r1 = r3.A0F
            X.1j9 r0 = new X.1j9
            r0.<init>(r3, r2)
            r1.Boy(r0)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A0F(java.io.File, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r1 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(java.io.File r6, java.io.File r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            A0C(r5, r6)
            X.6Tw r0 = r5.A0G
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.A03()
            long r0 = (long) r0
            r5.A05 = r0
            A07(r5)
            X.70k r3 = r5.A12
            X.5n4 r2 = new X.5n4
            r2.<init>(r5)
            android.widget.ImageButton r1 = r3.A01
            r0 = 10
            X.C36351kA.A1E(r1, r2, r0)
            long r0 = r5.A05
            android.widget.TextView r4 = r3.A02
            X.0ts r2 = r3.A0H
            long r0 = X.C36391kE.A0B(r0)
            X.C90504aG.A16(r4, r2, r0)
            X.6Tw r2 = r5.A0G
            X.6Q9 r0 = r5.A0H
            if (r0 == 0) goto L_0x0039
            boolean r1 = X.AnonymousClass6Q9.A00(r0)
            r0 = 1
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r3.A04(r2, r7, r9, r0)
            A08(r5)
            android.view.View r1 = r5.A0a
            r0 = 2131435233(0x7f0b1ee1, float:1.8492302E38)
            X.C36381kD.A18(r1, r0)
            r0 = 2131430929(0x7f0b0e11, float:1.8483573E38)
            X.C90494aF.A0v(r1, r0)
            r0 = 2131428420(0x7f0b0444, float:1.8478484E38)
            android.view.View r0 = r1.findViewById(r0)
            r4 = 0
            r0.setVisibility(r4)
            r0 = 2131429693(0x7f0b093d, float:1.8481066E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 10
            X.7oc r0 = new X.7oc
            r0.<init>(r5, r1)
            X.C012005e.A0V(r2, r0)
            X.6QH r2 = r5.A0v
            android.view.View r0 = r2.A0L
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0O
            r0.setVisibility(r1)
            X.4df r1 = r2.A05
            if (r1 == 0) goto L_0x0080
            r0 = 4
            r1.setVisibility(r0)
        L_0x0080:
            android.view.ViewGroup r0 = r3.A0B
            r0.setVisibility(r4)
            r4 = 1
            r0.setClickable(r4)
            X.70h r2 = new X.70h
            r2.<init>(r5, r6)
            android.widget.ImageButton r1 = r3.A0C
            r0 = 9
            X.C36351kA.A1E(r1, r2, r0)
            X.7qF r1 = new X.7qF
            r1.<init>(r5, r4)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A04
            r0.setOnSeekBarChangeListener(r1)
            X.6sN r1 = new X.6sN
            r1.<init>(r5)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r3.A03
            r0.A05 = r1
            if (r8 == 0) goto L_0x00b6
            X.0wU r2 = r5.A10
            r1 = 32
            X.72p r0 = new X.72p
            r0.<init>(r5, r1)
            r2.Boy(r0)
        L_0x00b6:
            r5.A0I = r6
            r5.A0J = r7
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A0P(java.io.File, java.io.File, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0X(android.view.MotionEvent r5, android.view.View r6, boolean r7) {
        /*
            r4 = this;
            int r1 = r5.getAction()
            r2 = 0
            if (r1 == 0) goto L_0x0046
            r3 = 1
            if (r1 == r3) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x0010
            X.6QH r1 = r4.A0v
            android.widget.TextView r0 = r4.A0b
            int r0 = r0.getWidth()
            r1.A04(r5, r0, r7)
            return r2
        L_0x0021:
            android.widget.TextView r0 = r4.A0b
            java.lang.String r0 = X.C36371kC.A0u(r0)
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x0010
            X.6QH r0 = r4.A0v
            boolean r0 = r0.A07(r1, r7, r3)
            if (r0 == 0) goto L_0x0010
            if (r1 != 0) goto L_0x0010
            r6.playSoundEffect(r2)
            X.7kd r0 = r4.A16
            r0.BgJ()
            return r2
        L_0x0046:
            X.1ts r0 = r4.A0n
            r0.A0S()
            X.6QH r1 = r4.A0v
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.A0X(android.view.MotionEvent, android.view.View, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x010e, code lost:
        if (r5.A0E(6751) == false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6YP(android.view.View r44, X.AnonymousClass01I r45, X.C19700wN r46, X.C225014r r47, X.C20690y0 r48, X.AnonymousClass17Y r49, X.AnonymousClass1X4 r50, com.whatsapp.audioRecording.AudioRecordFactory r51, com.whatsapp.audioRecording.OpusRecorderFactory r52, X.C227815t r53, X.AnonymousClass1V6 r54, X.C39821ts r55, X.AnonymousClass3FY r56, X.C21060yb r57, X.C19970wo r58, X.C19630wG r59, X.C19420v0 r60, X.C18820ts r61, X.C21860zv r62, X.C20810yC r63, X.AnonymousClass1D5 r64, X.AnonymousClass1Y4 r65, X.AnonymousClass1LX r66, X.C19890wg r67, X.C29711Xr r68, X.AnonymousClass3L2 r69, X.AnonymousClass3P4 r70, X.AnonymousClass3QH r71, X.C64263Nh r72, X.AnonymousClass13J r73, X.C19770wU r74, X.C65813To r75, X.AnonymousClass3DT r76, X.C1492470k r77, X.AnonymousClass9Q5 r78, X.AnonymousClass2ZP r79, X.AnonymousClass3Dv r80, X.C160207kd r81, X.AnonymousClass33M r82, X.C34071gP r83, X.C27721Pm r84, X.AnonymousClass005 r85, boolean r86, boolean r87) {
        /*
            r43 = this;
            r0 = r43
            r0.<init>()
            android.os.Handler r15 = X.C36341k9.A0H()
            r0.A0V = r15
            r2 = 0
            X.5VT r1 = new X.5VT
            r1.<init>(r2)
            r0.A0d = r1
            r1 = 1
            X.5VT r9 = new X.5VT
            r9.<init>(r1)
            r0.A0e = r9
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            r0.A0U = r1
            r1 = 0
            r0.A0M = r1
            r2 = -1
            r0.A04 = r2
            r7 = 2
            X.7qZ r6 = new X.7qZ
            r6.<init>(r0, r7)
            r0.A1U = r6
            r4 = 1
            X.6YF r2 = new X.6YF
            r2.<init>(r0, r4)
            r0.A1O = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r1)
            r0.A1B = r2
            X.6pY r2 = new X.6pY
            r2.<init>(r0)
            r0.A0k = r2
            r37 = r58
            r2 = r37
            r0.A0p = r2
            r5 = r63
            r0.A0r = r5
            r41 = r49
            r2 = r41
            r0.A0h = r2
            r2 = r69
            r0.A0u = r2
            r2 = r46
            r0.A0f = r2
            r2 = r74
            r0.A10 = r2
            r2 = r48
            r0.A1G = r2
            r2 = r71
            r0.A0x = r2
            r40 = r50
            r2 = r40
            r0.A1H = r2
            r2 = r64
            r0.A1L = r2
            r12 = r84
            r0.A1V = r12
            r2 = r76
            r0.A1R = r2
            r2 = r73
            r0.A1Q = r2
            r38 = r57
            r2 = r38
            r0.A0o = r2
            r13 = r61
            r0.A1J = r13
            r2 = r66
            r0.A0t = r2
            r2 = r51
            r0.A0i = r2
            r36 = r77
            r2 = r36
            r0.A12 = r2
            r2 = r83
            r0.A1T = r2
            r14 = r60
            r0.A0q = r14
            r2 = r79
            r0.A13 = r2
            r2 = r53
            r0.A0l = r2
            r2 = r75
            r0.A11 = r2
            r2 = r68
            r0.A1N = r2
            r2 = r85
            r0.A19 = r2
            r2 = r65
            r0.A0s = r2
            r2 = r67
            r0.A1M = r2
            r2 = r70
            r0.A0w = r2
            r2 = r62
            r0.A1K = r2
            r2 = r52
            r0.A0j = r2
            r2 = r56
            r0.A1I = r2
            r2 = r80
            r0.A14 = r2
            r17 = r86
            r2 = r17
            r0.A1X = r2
            r2 = r87
            r0.A1Y = r2
            r2 = r72
            r0.A1P = r2
            r2 = r54
            r0.A0m = r2
            r3 = r45
            r0.A0c = r3
            r42 = r47
            r2 = r42
            r0.A0g = r2
            r2 = r44
            r0.A0a = r2
            r8 = r81
            r0.A16 = r8
            r8 = 1139(0x473, float:1.596E-42)
            boolean r8 = r5.A0E(r8)
            r0.A1C = r8
            r8 = 6752(0x1a60, float:9.462E-42)
            boolean r8 = r5.A0E(r8)
            r0.A1D = r8
            if (r8 == 0) goto L_0x0110
            r8 = 6751(0x1a5f, float:9.46E-42)
            boolean r10 = r5.A0E(r8)
            r8 = 1
            if (r10 != 0) goto L_0x0111
        L_0x0110:
            r8 = 0
        L_0x0111:
            r0.A1Z = r8
            r39 = r55
            r8 = r39
            r0.A0n = r8
            X.5tv r8 = new X.5tv
            r8.<init>(r2, r13)
            r0.A17 = r8
            r8 = r82
            r0.A1S = r8
            r8 = 2131435217(0x7f0b1ed1, float:1.849227E38)
            r10 = 2131435217(0x7f0b1ed1, float:1.849227E38)
            android.widget.ImageView r11 = X.C36401kF.A0G(r2, r8)
            boolean r16 = X.C222013h.A07
            r8 = 2131233040(0x7f080910, float:1.8082206E38)
            if (r16 == 0) goto L_0x0138
            r8 = 2131233041(0x7f080911, float:1.8082208E38)
        L_0x0138:
            r11.setImageResource(r8)
            r8 = 2131435234(0x7f0b1ee2, float:1.8492304E38)
            android.view.ViewGroup r25 = X.C36411kG.A0O(r2, r8)
            android.widget.ImageView r26 = X.C36401kF.A0G(r2, r10)
            r8 = 2131435236(0x7f0b1ee4, float:1.8492308E38)
            android.widget.TextView r27 = X.C36391kE.A0O(r2, r8)
            r8 = 2131435239(0x7f0b1ee7, float:1.8492315E38)
            android.view.View r18 = X.C012005e.A02(r2, r8)
            r8 = 2131435238(0x7f0b1ee6, float:1.8492313E38)
            android.view.View r19 = X.C012005e.A02(r2, r8)
            r8 = 2131435237(0x7f0b1ee5, float:1.849231E38)
            android.view.View r20 = X.C012005e.A02(r2, r8)
            r8 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r21 = X.C012005e.A02(r2, r8)
            r8 = 2131435208(0x7f0b1ec8, float:1.8492252E38)
            android.view.View r22 = X.C012005e.A02(r2, r8)
            r8 = 2131435211(0x7f0b1ecb, float:1.8492258E38)
            android.view.View r23 = X.C012005e.A02(r2, r8)
            r8 = 2131435233(0x7f0b1ee1, float:1.8492302E38)
            android.view.View r24 = X.C012005e.A02(r2, r8)
            boolean r35 = X.AnonymousClass000.A1P(r17)
            android.content.res.Resources r10 = r3.getResources()
            r8 = 2131168767(0x7f070dff, float:1.7951845E38)
            float r33 = r10.getDimension(r8)
            X.6yc r10 = new X.6yc
            r10.<init>(r0)
            r11 = 0
            X.6QH r8 = new X.6QH
            r34 = 0
            r29 = r59
            r28 = r37
            r30 = r14
            r31 = r13
            r32 = r10
            r16 = r8
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.A0v = r8
            X.6yb r10 = new X.6yb
            r16 = r10
            r17 = r2
            r18 = r3
            r19 = r39
            r20 = r38
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r8.A04 = r10
            android.os.PowerManager r13 = r38.A0G()
            if (r13 != 0) goto L_0x02f9
            java.lang.String r8 = "voicenoterecordingui pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r8)
        L_0x01c8:
            android.media.SoundPool r8 = A1b
            if (r8 != 0) goto L_0x0213
            android.media.SoundPool r10 = new android.media.SoundPool
            r10.<init>(r4, r4, r1)
            A1b = r10
            r8 = 2132017218(0x7f140042, float:1.9672708E38)
            int r8 = r10.load(r3, r8, r1)
            A1g = r8
            android.media.SoundPool r13 = A1b
            r8 = 2132017215(0x7f14003f, float:1.9672702E38)
            r10 = 2132017215(0x7f14003f, float:1.9672702E38)
            int r8 = r13.load(r3, r8, r1)
            A1d = r8
            android.media.SoundPool r13 = A1b
            r8 = 2132017216(0x7f140040, float:1.9672704E38)
            int r8 = r13.load(r3, r8, r1)
            A1e = r8
            android.media.SoundPool r13 = A1b
            r8 = 2132017217(0x7f140041, float:1.9672706E38)
            int r8 = r13.load(r3, r8, r1)
            A1f = r8
            android.media.SoundPool r13 = A1b
            r8 = 2132017219(0x7f140043, float:1.967271E38)
            int r8 = r13.load(r3, r8, r1)
            A1c = r8
            android.media.SoundPool r8 = A1b
            int r1 = r8.load(r3, r10, r1)
            A1a = r1
        L_0x0213:
            r1 = 2131435219(0x7f0b1ed3, float:1.8492274E38)
            android.view.View r1 = r2.findViewById(r1)
            com.whatsapp.util.ClippingLayout r1 = (com.whatsapp.util.ClippingLayout) r1
            r0.A0z = r1
            r1 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            r10 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r2, r1)
            r0.A0b = r1
            r1 = 2131430928(0x7f0b0e10, float:1.848357E38)
            android.view.View r8 = r2.findViewById(r1)
            r0.A0Y = r8
            r1 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r1 = r2.findViewById(r1)
            com.whatsapp.util.ClippingLayout r1 = (com.whatsapp.util.ClippingLayout) r1
            r0.A0y = r1
            android.view.View r1 = r8.findViewById(r10)
            r0.A0X = r1
            r1 = 746(0x2ea, float:1.045E-42)
            r5.A0E(r1)
            r1 = 2131435243(0x7f0b1eeb, float:1.8492323E38)
            android.view.ViewGroup r10 = X.C36411kG.A0P(r2, r1)
            X.7oX r8 = new X.7oX
            r8.<init>(r3, r0, r4)
            r1 = -1
            r10.addView(r8, r1, r1)
            r1 = 2131433099(0x7f0b168b, float:1.8487974E38)
            android.view.View r1 = r2.findViewById(r1)
            r0.A0Z = r1
            r12.registerObserver(r6)
            r1 = 3657(0xe49, float:5.125E-42)
            long r28 = X.C36401kF.A04(r5, r1)
            X.5n5 r6 = new X.5n5
            r6.<init>(r0)
            X.6Dd r1 = new X.6Dd
            r2 = r78
            r1.<init>(r14, r2, r6)
            r0.A15 = r1
            X.5dB r12 = new X.5dB
            r12.<init>(r0, r11)
            r1 = 3
            X.5dB r11 = new X.5dB
            r11.<init>(r0, r1)
            X.7sc r10 = new X.7sc
            r10.<init>(r0, r7)
            X.7sc r8 = new X.7sc
            r8.<init>(r0, r1)
            r1 = 4
            X.7sc r3 = new X.7sc
            r3.<init>(r0, r1)
            X.7sc r2 = new X.7sc
            r2.<init>(r0, r4)
            X.4cS r1 = new X.4cS
            r16 = r1
            r17 = r9
            r18 = r40
            r19 = r37
            r20 = r36
            r21 = r10
            r22 = r8
            r23 = r3
            r24 = r2
            r25 = r6
            r26 = r12
            r27 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A0W = r1
            X.5dB r3 = new X.5dB
            r3.<init>(r0, r7)
            X.5dB r2 = new X.5dB
            r2.<init>(r0, r4)
            r12 = 12
            X.73N r1 = new X.73N
            r7 = r1
            r8 = r3
            r9 = r2
            r10 = r15
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A1A = r1
            r11 = 13
            X.73N r1 = new X.73N
            r6 = r1
            r7 = r0
            r8 = r37
            r9 = r41
            r10 = r42
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A1W = r1
            X.7qV r1 = new X.7qV
            r1.<init>(r0, r4)
            r0.A18 = r1
            r1 = 7333(0x1ca5, float:1.0276E-41)
            int r1 = r5.A07(r1)
            r0.A1F = r1
            r1 = 7334(0x1ca6, float:1.0277E-41)
            int r1 = r5.A07(r1)
            r0.A1E = r1
            return
        L_0x02f9:
            r10 = 6
            java.lang.String r8 = "voicenote"
            android.os.PowerManager$WakeLock r8 = X.C111765co.A00(r13, r8, r10)
            r0.A0R = r8
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YP.<init>(android.view.View, X.01I, X.0wN, X.14r, X.0y0, X.17Y, X.1X4, com.whatsapp.audioRecording.AudioRecordFactory, com.whatsapp.audioRecording.OpusRecorderFactory, X.15t, X.1V6, X.1ts, X.3FY, X.0yb, X.0wo, X.0wG, X.0v0, X.0ts, X.0zv, X.0yC, X.1D5, X.1Y4, X.1LX, X.0wg, X.1Xr, X.3L2, X.3P4, X.3QH, X.3Nh, X.13J, X.0wU, X.3To, X.3DT, X.70k, X.9Q5, X.2ZP, X.3Dv, X.7kd, X.33M, X.1gP, X.1Pm, X.005, boolean, boolean):void");
    }
}
