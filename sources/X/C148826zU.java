package X;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.format.DateUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6zU  reason: invalid class name and case insensitive filesystem */
public class C148826zU implements C158547hg, AnonymousClass1V5 {
    public static int A12;
    public static AnonymousClass166 A13 = new AnonymousClass166(250);
    public static byte[] A14;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 0;
    public Activity A09;
    public Sensor A0A;
    public SensorEventListener A0B;
    public SensorManager A0C;
    public AudioManager.OnAudioFocusChangeListener A0D;
    public Visualizer A0E;
    public AnonymousClass7gN A0F;
    public C160817ld A0G;
    public AnonymousClass7gO A0H;
    public AnonymousClass379 A0I;
    public C46812bi A0J;
    public AnonymousClass3DQ A0K;
    public C132476Tw A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public float A0V;
    public int A0W;
    public long A0X;
    public C19420v0 A0Y;
    public AnonymousClass005 A0Z;
    public boolean A0a;
    public final PowerManager.WakeLock A0b;
    public final AnonymousClass2ZM A0c;
    public final AnonymousClass1V6 A0d;
    public final C21060yb A0e;
    public final AnonymousClass6OW A0f;
    public final C90964bE A0g;
    public final AnonymousClass1V4 A0h;
    public final AnonymousClass3P4 A0i;
    public final AnonymousClass3L3 A0j = new AnonymousClass5NZ(this);
    public final AnonymousClass2ZP A0k;
    public final boolean A0l;
    public final Handler A0m = new C162377oU(Looper.getMainLooper(), this, 2);
    public final C19700wN A0n;
    public final AnonymousClass17Y A0o;
    public final C19630wG A0p;
    public final C20830yE A0q;
    public final C21860zv A0r;
    public final AnonymousClass16J A0s;
    public final C20810yC A0t;
    public final AnonymousClass4V1 A0u;
    public final AnonymousClass1Q0 A0v;
    public final C158577hj A0w = new AnonymousClass6YF(this, 0);
    public final AnonymousClass3QH A0x;
    public final AnonymousClass9Q5 A0y;
    public final AnonymousClass005 A0z;
    public final boolean A10;
    public volatile boolean A11;

    public boolean A0J(int i) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else if (i == 1) {
            f = 1.5f;
        } else if (i == 2) {
            f = 2.0f;
        } else {
            throw C90464aC.A0R("setFastPlaybackPlayerState: Did not handle FastPlaybackPlayerState: ", AnonymousClass000.A0u(), i);
        }
        C36321k7.A1T("messageaudioplayer/setFastPlaybackPlayerState fastPlaybackPlayerState: ", AnonymousClass000.A0u(), i);
        C132476Tw r1 = this.A0L;
        if (r1 == null || !(r1 instanceof AnonymousClass5LW) || !this.A10) {
            return true;
        }
        return r1.A0E(this.A0n, f);
    }

    private void A00() {
        AudioManager A0D2 = this.A0e.A0D();
        if (A0D2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0D;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C133606Zg(this.A0d);
                this.A0D = onAudioFocusChangeListener;
            }
            A0D2.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    private void A01() {
        C148826zU A002 = this.A0d.A00();
        if (A002 != this && A002 != null) {
            if (this.A0t.A0E(952)) {
                A002.A0H(false, false);
            } else {
                A002.A0H(true, false);
            }
        }
    }

    private void A02() {
        int i;
        if (this.A0E == null && !this.A0l && this.A0H != null && (i = Build.VERSION.SDK_INT) != 26) {
            if ((i != 28 || !Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("Mi 9 Lite")) && this.A0q.A0C()) {
                try {
                    Visualizer visualizer = new Visualizer(0);
                    this.A0E = visualizer;
                    visualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.A0E.setDataCaptureListener(new C133676Zo(this), Visualizer.getMaxCaptureRate() / 2, true, true);
                    this.A0E.setEnabled(true);
                } catch (RuntimeException e) {
                    Log.e("visualmediaplayer/start ", e);
                }
            }
        }
    }

    private void A03() {
        if (this.A0T) {
            boolean z = this.A0M;
            AnonymousClass6OW r0 = this.A0f;
            if (z) {
                r0.A02(this);
            } else {
                r0.A01();
            }
        }
        C160817ld r02 = this.A0G;
        if (r02 != null && C90494aF.A1W(r02, this)) {
            this.A0G.BcI(A0A());
        }
        C46812bi r03 = this.A0J;
        int A0A2 = A0A();
        C36341k9.A1K(r03.A1J, A13, A0A2);
        this.A11 = false;
        this.A0g.A05(this);
        this.A0h.A01.remove(this);
        AnonymousClass3DQ r04 = this.A0K;
        if (r04 != null) {
            r04.A00();
            this.A0K = null;
        }
        A08(false);
    }

    public static void A05(C148826zU r4) {
        BluetoothHeadset bluetoothHeadset = r4.A0g.A00;
        AudioManager A0D2 = r4.A0e.A0D();
        PowerManager.WakeLock wakeLock = r4.A0b;
        if (wakeLock != null && !wakeLock.isHeld() && !r4.A0h.A00 && !A09(bluetoothHeadset, A0D2) && r4.A0L.A0D() && !r4.A0M) {
            wakeLock.acquire();
            Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
        }
    }

    public static void A06(C148826zU r1) {
        PowerManager.WakeLock wakeLock = r1.A0b;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release(1);
            Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r0 instanceof X.AnonymousClass5LU) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(boolean r23) {
        /*
            r22 = this;
            r10 = r22
            X.2bi r2 = r10.A0J
            int r1 = r2.A09
            r0 = 1
            if (r1 == r0) goto L_0x000e
            boolean r0 = r10.A0S
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.3Qj r0 = r2.A01
            if (r0 == 0) goto L_0x000d
            java.io.File r0 = r0.A0I
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            r18 = 0
            if (r0 == 0) goto L_0x0026
            r18 = 5
        L_0x0026:
            X.6Tw r0 = r10.A0L
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0 instanceof X.AnonymousClass5LU
            r17 = 3
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            r17 = 5
        L_0x0032:
            int r0 = A12
            int r16 = X.C90494aF.A06(r0)
            int r0 = r10.A0A()
            float r1 = (float) r0
            int r0 = r10.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r1, r0)
            float r1 = r10.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            r10.A00 = r2
            r1 = r2
        L_0x0050:
            X.9Q5 r11 = r10.A0y
            boolean r13 = r10.A0a
            int r0 = r10.A08
            r21 = r0
            int r0 = r10.A07
            long r14 = (long) r0
            double r8 = (double) r1
            int r0 = r10.A06
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            X.2bi r2 = r10.A0J
            int r2 = r2.A0B
            long r2 = (long) r2
            long r6 = r4.toMillis(r2)
            boolean r2 = r10.A0S
            r20 = r2
            int r2 = r10.A03
            long r4 = (long) r2
            boolean r2 = r10.A0R
            r19 = r2
            int r2 = r10.A04
            long r2 = (long) r2
            X.58f r12 = new X.58f
            r12.<init>()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.A01 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            r12.A06 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r12.A05 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            r12.A07 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r12.A04 = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r12.A0B = r13
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r12.A03 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A0C = r0
            double r0 = (double) r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r6
            long r6 = java.lang.Math.round(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r12.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            r12.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r12.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r12.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.A0A = r0
            X.0yW r0 = r11.A00
            r0.Blw(r12)
            r0 = 0
            r10.A00 = r0
            r0 = 0
            r10.A04 = r0
            r10.A03 = r0
            r10.A0R = r0
            r10.A0S = r0
            if (r23 == 0) goto L_0x000d
            X.2bi r0 = r10.A0J
            X.3Qa r0 = r0.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C177618e5
            r5 = 1
            if (r0 == 0) goto L_0x010d
            X.0v0 r4 = r10.A0Y
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r4)
            java.lang.String r3 = "ptt_fast_playback_broadcast"
        L_0x0100:
            long r1 = X.C36341k9.A0B(r1, r3)
            long r1 = r1 + r5
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)
            X.C36341k9.A0w(r0, r3, r1)
            return
        L_0x010d:
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x011c
            X.0v0 r4 = r10.A0Y
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r4)
            java.lang.String r3 = "ptt_fast_playback_group"
            goto L_0x0100
        L_0x011c:
            boolean r0 = X.AnonymousClass143.A0H(r1)
            X.0v0 r4 = r10.A0Y
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r4)
            if (r0 == 0) goto L_0x012b
            java.lang.String r3 = "ptt_fast_playback_interop"
            goto L_0x0100
        L_0x012b:
            java.lang.String r3 = "ptt_fast_playback_individual"
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148826zU.A07(boolean):void");
    }

    private void A08(boolean z) {
        C46812bi r3 = this.A0J;
        C64933Qa r2 = r3.A1J;
        if ((r2.A00 instanceof C28981Uw) && r3.A0D != 16 && !r2.A02) {
            if (!z) {
                if (((long) A0A()) <= Math.min(C36371kC.A07(r3.A0B), 3000)) {
                    return;
                }
            }
            this.A0u.B0V(this.A0J);
        }
    }

    public int A0A() {
        C132476Tw r0 = this.A0L;
        if (r0 == null) {
            return 0;
        }
        return Math.max(this.A02, r0.A02());
    }

    public void A0B(int i) {
        try {
            C132476Tw r0 = this.A0L;
            if (r0 != null) {
                r0.A0A(i);
            }
            this.A02 = i;
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0D(C46812bi r3) {
        Number A102 = C36441kJ.A10(r3.A1J, A13);
        if (A102 != null) {
            A0B(A102.intValue());
        }
    }

    public void A0E(boolean z) {
        C132476Tw r0 = this.A0L;
        if (r0 != null && r0.A0D()) {
            this.A0L.A04();
            ((C160497l6) this.A0z.get()).Bqh();
            this.A0Q = true;
            Visualizer visualizer = this.A0E;
            if (visualizer != null) {
                visualizer.setEnabled(false);
                this.A0E.release();
                this.A0E = null;
            }
            A03();
            A06(this);
            if (!z) {
                A07(false);
            } else {
                float min = Math.min(((float) A0A()) / ((float) this.A01), 1.0f);
                if (min > this.A00) {
                    this.A00 = min;
                }
            }
        }
        A00();
    }

    public void A0G(boolean z) {
        Activity activity;
        float f;
        C132476Tw r0;
        BluetoothHeadset bluetoothHeadset = this.A0g.A00;
        AudioManager A0D2 = this.A0e.A0D();
        if (this.A0h.A00 || A09(bluetoothHeadset, A0D2)) {
            z = false;
        }
        if (this.A0N == z) {
            return;
        }
        if (!z || ((r0 = this.A0L) != null && r0.A0D())) {
            C36321k7.A1X("messageaudioplayer/onearproximity ", AnonymousClass000.A0u(), z);
            this.A0N = z;
            if (this.A0b == null && (activity = this.A09) != null) {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (z) {
                    this.A0V = attributes.screenBrightness;
                    f = 0.1f;
                } else {
                    f = this.A0V;
                }
                attributes.screenBrightness = f;
                window.setAttributes(attributes);
            }
            C160817ld r02 = this.A0G;
            if (r02 != null) {
                r02.BWK(z);
            }
            C132476Tw r03 = this.A0L;
            if (r03 != null && r03.A0D()) {
                int A022 = this.A0L.A02();
                this.A0L.A06();
                this.A0L = null;
                C65013Qj A002 = AnonymousClass2bU.A00(this.A0J);
                int i = 3;
                if (z) {
                    i = 0;
                }
                try {
                    this.A0W = i;
                    C132476Tw A003 = C132476Tw.A00(this.A0p, this.A0t, (AnonymousClass6KH) this.A0Z.get(), A002.A0I, i);
                    this.A0L = A003;
                    A003.A0C(this.A0w);
                    Activity activity2 = this.A09;
                    if (activity2 != null) {
                        activity2.setVolumeControlStream(this.A0W);
                    }
                    if (z && A0D2 != null) {
                        A0D2.setSpeakerphoneOn(false);
                    }
                    this.A0L.A05();
                    int max = Math.max(0, A022 - 1000);
                    this.A02 = max;
                    this.A0L.A0A(max);
                    if (z || System.currentTimeMillis() - this.A0X < 1500) {
                        if (!A0J(A12)) {
                            A12 = 0;
                        }
                        this.A0L.A08();
                        return;
                    }
                    this.A0Q = true;
                    A03();
                    A06(this);
                    A00();
                } catch (IOException | IllegalStateException unused) {
                    this.A0o.A06(R.string.f12nameremoved, 0);
                }
            }
        }
    }

    public void A0H(boolean z, boolean z2) {
        boolean z3;
        AnonymousClass379 r0;
        int i;
        AnonymousClass7gN r1;
        SensorEventListener sensorEventListener;
        Sensor sensor;
        C132476Tw r12;
        if (this.A01 == A0A() || A0A() + 50 > this.A01 || ((r12 = this.A0L) != null && (r12 instanceof AnonymousClass5LW) && ((AnonymousClass5LW) r12).A05)) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("messageaudioplayer/stop playbackCompleted: ");
        A0u2.append(z3);
        A0u2.append(" duration: ");
        A0u2.append(this.A01);
        A0u2.append(" position: ");
        C36321k7.A1Y(A0u2, A0A());
        A07(z3);
        C160497l6 r2 = (C160497l6) this.A0z.get();
        if (z3) {
            r2.Bnw(this.A0J.A1N);
        } else {
            r2.Bqh();
        }
        C132476Tw r02 = this.A0L;
        if (r02 != null) {
            r02.A06();
            this.A0L = null;
        }
        Visualizer visualizer = this.A0E;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.A0E.release();
            this.A0E = null;
        }
        if (this.A0b != null || !this.A0N) {
            SensorManager sensorManager = this.A0C;
            if (!(sensorManager == null || (sensorEventListener = this.A0B) == null || (sensor = this.A0A) == null)) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
                this.A0C = null;
            }
            A06(this);
        }
        A00();
        Activity activity = this.A09;
        if (activity != null) {
            activity.setVolumeControlStream(Integer.MIN_VALUE);
        }
        if (z) {
            this.A02 = 0;
        }
        this.A0Q = false;
        this.A0m.removeMessages(0);
        if (z3 && (r1 = this.A0F) != null) {
            r1.Bcm(this.A0W);
        }
        AnonymousClass1V6 r8 = this.A0d;
        if (r8.A00 == this) {
            if (this.A0T) {
                boolean z4 = this.A0O;
                AnonymousClass6OW r6 = this.A0f;
                if (!z4) {
                    r6.A01();
                } else if (!r6.A04) {
                    RemoteViews remoteViews = new RemoteViews(r6.A0E.A00.getPackageName(), R.layout.f9nameremoved);
                    int i2 = this.A01;
                    remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, i2, i2, false);
                    remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (this.A01 / 1000)));
                    AnonymousClass6OW.A00(remoteViews, r6, true);
                } else if (!r6.A05) {
                    AnonymousClass6OW.A00(new RemoteViews(r6.A0E.A00.getPackageName(), R.layout.f9nameremoved), r6, true);
                    r6.A06 = false;
                }
            }
            C160817ld r03 = this.A0G;
            if (r03 != null && C90494aF.A1W(r03, this)) {
                if (this.A0J.A0B != 0) {
                    i = this.A0J.A0B * 1000;
                } else {
                    i = this.A01;
                }
                this.A0G.Bhp(i, z);
            }
            if (z) {
                A13.remove(this.A0J.A1J);
            }
            this.A0k.unregisterObserver(this.A0j);
            this.A0g.A05(this);
            this.A0h.A01.remove(this);
            this.A11 = false;
            AnonymousClass3DQ r04 = this.A0K;
            if (r04 != null) {
                r04.A00();
                this.A0K = null;
            }
        }
        r8.A08((C148826zU) null);
        if (z2 && (r0 = this.A0I) != null) {
            View view = r0.A00;
            AnonymousClass1V6 r13 = r0.A01;
            AnonymousClass005 r05 = r0.A02;
            if (view == null) {
                AnonymousClass3UR.A09(r13, r05);
            } else {
                AnonymousClass3UR.A04(view, r13, r05);
            }
        }
        A08(z3);
        this.A0r.A02("PttPlayback", "End");
    }

    public boolean A0I() {
        C132476Tw r0 = this.A0L;
        if (r0 == null || !r0.A0D()) {
            return false;
        }
        return true;
    }

    public void BSG(int i) {
        if (i == 0) {
            A05(this);
        } else if (i == 2) {
            A06(this);
        }
    }

    public void BYr(boolean z) {
        if (z) {
            A06(this);
        } else {
            A05(this);
        }
    }

    private void A04(C148826zU r5) {
        A05(this);
        if (this.A0C == null) {
            SensorManager A0A2 = this.A0e.A0A();
            this.A0C = A0A2;
            if (A0A2 != null) {
                Sensor defaultSensor = A0A2.getDefaultSensor(8);
                this.A0A = defaultSensor;
                if (defaultSensor != null) {
                    AnonymousClass6ZY r2 = new AnonymousClass6ZY(this, r5);
                    this.A0B = r2;
                    this.A0C.registerListener(r2, defaultSensor, 2);
                }
            }
        }
    }

    public static boolean A09(BluetoothHeadset bluetoothHeadset, AudioManager audioManager) {
        try {
            if (C19550w8.A08()) {
                if (audioManager != null) {
                    return C111685cg.A00(audioManager);
                }
                return false;
            } else if (bluetoothHeadset == null) {
                return false;
            } else {
                for (BluetoothDevice bluetoothClass : bluetoothHeadset.getConnectedDevices()) {
                    if (bluetoothClass.getBluetoothClass().getMajorDeviceClass() == 1024) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public void A0C(int i, boolean z, boolean z2) {
        int i2;
        String A0w2;
        int BGL;
        A01();
        this.A0v.A01();
        if (this.A09 != null && !this.A0x.A03()) {
            this.A09.setVolumeControlStream(3);
        }
        AudioManager A0D2 = this.A0e.A0D();
        if (A0D2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0D;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C133606Zg(this.A0d);
                this.A0D = onAudioFocusChangeListener;
            }
            int i3 = 1;
            if (this.A0J.A09 == 1) {
                i3 = 3;
            }
            A0D2.requestAudioFocus(onAudioFocusChangeListener, 3, i3);
        }
        this.A0a = false;
        this.A0X = System.currentTimeMillis();
        if (this.A0L == null) {
            Log.i("messageaudioplayer/start");
            this.A0r.A02("PttPlayback", "Resume");
            try {
                File file = AnonymousClass2bU.A00(this.A0J).A0I;
                if (file != null) {
                    this.A0W = 3;
                    C132476Tw A002 = C132476Tw.A00(this.A0p, this.A0t, (AnonymousClass6KH) this.A0Z.get(), file, 3);
                    this.A0L = A002;
                    A002.A0C(this.A0w);
                    A002.A05();
                    if (!A0J(i)) {
                        A12 = 0;
                    }
                    if (z && (BGL = ((C160497l6) this.A0z.get()).BGL(this.A0J.A1N)) >= 0) {
                        this.A02 = BGL;
                    }
                    this.A0L.A0A(this.A02);
                    this.A0L.A08();
                    C132476Tw r1 = this.A0L;
                    if (r1 instanceof AnonymousClass5LW) {
                        this.A01 = this.A0J.A0B * 1000;
                        C132476Tw r2 = this.A0L;
                        C117085lg r12 = new C117085lg(this);
                        if (!(r2 instanceof AnonymousClass5LU) && (r2 instanceof AnonymousClass5LW)) {
                            ((AnonymousClass5LW) r2).A02 = r12;
                        }
                    } else {
                        this.A01 = r1.A03();
                    }
                    this.A0m.sendEmptyMessage(0);
                    if (AnonymousClass1CM.A02(this.A0J)) {
                        this.A0s.A05(this.A0J, 25);
                    }
                    A02();
                    if (this.A0T) {
                        AnonymousClass6OW r10 = this.A0f;
                        C46812bi r9 = this.A0J;
                        if (r9 != null && ((i2 = r9.A1I) == 2 || i2 == 82)) {
                            boolean z3 = true;
                            if (r10.A02 != r9) {
                                r10.A02 = r9;
                                Bitmap bitmap = null;
                                r10.A03 = null;
                                Context context = r10.A0E.A00;
                                C07700Yy A022 = C20600xp.A02(context);
                                A022.A0M = "media_playback@1";
                                A022.A0C(new NotificationCompat$DecoratedCustomViewStyle());
                                A022.A0W = false;
                                r10.A01 = A022;
                                A022.A0X = true;
                                C36361kB.A1A(A022);
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
                                C64933Qa r13 = r9.A1J;
                                if (r13.A02) {
                                    C19730wQ r0 = r10.A07;
                                    r0.A0G();
                                    AnonymousClass142 r14 = r0.A0E;
                                    if (r14 != null) {
                                        bitmap = r10.A0B.A02(context, r14, dimensionPixelSize, dimensionPixelSize2);
                                    }
                                    int i4 = r9.A09;
                                    int i5 = R.string.f12nameremoved;
                                    if (i4 == 1) {
                                        i5 = R.string.f12nameremoved;
                                    }
                                    A0w2 = context.getString(i5);
                                } else {
                                    AnonymousClass16D r22 = r10.A09;
                                    AnonymousClass11F r15 = r13.A00;
                                    if (!(r15 instanceof C28981Uw)) {
                                        r15 = r9.A0L();
                                    }
                                    C18740tg.A06(r15);
                                    AnonymousClass141 A0D3 = r22.A0D(r15);
                                    bitmap = r10.A0B.A02(context, A0D3, dimensionPixelSize, dimensionPixelSize2);
                                    String A0v2 = C36381kD.A0v(r10.A0A, A0D3);
                                    int i6 = r9.A09;
                                    int i7 = R.string.f12nameremoved;
                                    if (i6 == 1) {
                                        i7 = R.string.f12nameremoved;
                                    }
                                    A0w2 = C36351kA.A0w(context, A0v2, 1, i7);
                                }
                                r10.A03 = A0w2;
                                if (bitmap == null) {
                                    bitmap = AnonymousClass1Pp.A01(context, r10.A08, (float) dimensionPixelSize2, R.drawable.avatar_contact, dimensionPixelSize);
                                }
                                r10.A01.A0A(bitmap);
                            }
                            r10.A02 = r9;
                            AccessibilityManager A0M2 = r10.A0D.A0M();
                            if (A0M2 == null || !A0M2.isTouchExplorationEnabled()) {
                                z3 = false;
                            }
                            r10.A04 = z3;
                            r10.A06 = false;
                            r10.A05 = false;
                        }
                        r10.A02(this);
                    }
                    C160817ld r02 = this.A0G;
                    if (r02 != null && C90494aF.A1W(r02, this)) {
                        this.A0G.Bh8(this.A01);
                    }
                    A13.remove(this.A0J.A1J);
                    this.A0k.registerObserver(this.A0j);
                    this.A0g.A04(this);
                    this.A0h.A01.add(this);
                    this.A0c.A00(this.A0J);
                    this.A11 = true;
                    this.A0K = this.A0i.A01(4);
                    A04(this);
                    this.A0d.A09(this, z2);
                    return;
                }
            } catch (IOException | IllegalStateException e) {
                this.A0n.A0E("messageaudioplayer/failed to prepare mediaplayer", e.toString(), true);
                throw e;
            } catch (IOException | IllegalStateException e2) {
                Log.e(e2);
            }
            this.A0o.A06(R.string.f12nameremoved, 0);
            this.A0a = true;
            A0H(true, false);
            return;
        }
        Log.i("messageaudioplayer/resume");
        try {
            this.A0L.A0A(this.A02);
            if (!A0J(i)) {
                A12 = 0;
            }
            this.A0L.A08();
            this.A0Q = false;
            this.A0m.sendEmptyMessage(0);
            A04(this);
            A02();
            if (this.A0T) {
                this.A0f.A02(this);
            }
            C160817ld r03 = this.A0G;
            if (r03 != null && C90494aF.A1W(r03, this)) {
                this.A0G.BfR();
            }
            A13.remove(this.A0J.A1J);
            this.A0c.A00(this.A0J);
            this.A11 = true;
            this.A0g.A04(this);
            this.A0h.A01.add(this);
            this.A0K = this.A0i.A01(4);
        } catch (IOException | IllegalStateException unused) {
            this.A0o.A06(R.string.f12nameremoved, 0);
            this.A0a = true;
            A0H(true, false);
        }
    }

    public void A0F(boolean z) {
        A01();
        C132476Tw r0 = this.A0L;
        if (r0 == null || !r0.A0D()) {
            int i = 0;
            if (z) {
                i = A12;
            }
            A0C(i, true, false);
            return;
        }
        A0E(false);
    }

    public C148826zU(Activity activity, C19700wN r5, AnonymousClass17Y r6, AnonymousClass2ZM r7, AnonymousClass1V6 r8, C21060yb r9, C19630wG r10, C20830yE r11, C19420v0 r12, C21860zv r13, AnonymousClass16J r14, C20810yC r15, AnonymousClass4V1 r16, AnonymousClass6OW r17, C90964bE r18, AnonymousClass1V4 r19, AnonymousClass3P4 r20, AnonymousClass1Q0 r21, AnonymousClass3QH r22, AnonymousClass9Q5 r23, AnonymousClass2ZP r24, AnonymousClass005 r25, AnonymousClass005 r26, boolean z, boolean z2) {
        this.A09 = activity;
        this.A0p = r10;
        this.A0t = r15;
        this.A0o = r6;
        this.A0n = r5;
        this.A0x = r22;
        this.A0e = r9;
        this.A0v = r21;
        this.A0s = r14;
        this.A0y = r23;
        this.A0k = r24;
        this.A0q = r11;
        this.A0Y = r12;
        this.A0c = r7;
        this.A0g = r18;
        this.A0f = r17;
        this.A0h = r19;
        this.A0d = r8;
        this.A0u = r16;
        this.A0i = r20;
        this.A0r = r13;
        this.A0z = r25;
        this.A0T = z;
        this.A0l = z2;
        this.A0Z = r26;
        PowerManager A0G2 = r9.A0G();
        if (A0G2 == null) {
            Log.w("messageaudioplayer pm=null");
        } else {
            this.A0b = C111765co.A00(A0G2, "WhatsApp MessageAudioPlayer ProximityWakeLock", 32);
        }
        this.A10 = C132476Tw.A01(r15);
    }
}
