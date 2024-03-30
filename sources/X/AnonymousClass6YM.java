package X;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.calling.crypto.DefaultCryptoCallback;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6YM  reason: invalid class name */
public class AnonymousClass6YM {
    public static String A3V;
    public static final ThreadPoolExecutor A3W = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final AtomicInteger A3X = new AtomicInteger();
    public long A00;
    public SoundPool A01;
    public AnonymousClass3DQ A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public Voip.RecordingInfo[] A0M;
    public double A0N = Double.NaN;
    public double A0O = Double.NaN;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public long A0T;
    public long A0U;
    public long A0V = -1;
    public long A0W = -1;
    public long A0X;
    public long A0Y;
    public BroadcastReceiver A0Z;
    public BroadcastReceiver A0a;
    public Handler A0b;
    public Handler A0c;
    public Handler A0d;
    public Handler A0e;
    public HandlerThread A0f;
    public PowerManager.WakeLock A0g;
    public PowerManager.WakeLock A0h;
    public PhoneStateListener A0i;
    public Pair A0j;
    public AnonymousClass1ZW A0k;
    public AnonymousClass6VN A0l;
    public C105545Fb A0m;
    public AnonymousClass6CH A0n;
    public C121455tA A0o;
    public C121455tA A0p;
    public C121455tA A0q;
    public C121455tA A0r;
    public C121455tA A0s;
    public C160737lV A0t;
    public AnonymousClass1Pk A0u;
    public AnonymousClass7gH A0v;
    public C1260962n A0w;
    public WamCall A0x;
    public AnonymousClass1X9 A0y;
    public C19930wk A0z;
    public C19930wk A10;
    public C132356Tf A11;
    public Boolean A12;
    public Integer A13 = 1500;
    public Integer A14;
    public Integer A15;
    public Integer A16;
    public Long A17;
    public String A18 = null;
    public String A19;
    public String A1A;
    public String A1B;
    public Map A1C;
    public Set A1D = C36441kJ.A16();
    public ScheduledThreadPoolExecutor A1E;
    public short A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J = false;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R = false;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V = true;
    public boolean A1W;
    public Integer A1X;
    public Integer A1Y;
    public final C19460v5 A1Z;
    public final C20690y0 A1a;
    public final AnonymousClass19J A1b;
    public final C106835Ln A1c;
    public final C122365uj A1d;
    public final C61693Db A1e;
    public final AnonymousClass6WJ A1f;
    public final AnonymousClass2ZG A1g;
    public final C110345aW A1h;
    public final C123765x3 A1i;
    public final C131176Oa A1j;
    public final ScreenShareResourceManager A1k;
    public final AnonymousClass65J A1l;
    public final AnonymousClass1HQ A1m;
    public final C27701Pj A1n;
    public final C34631hO A1o;
    public final C27301Nr A1p;
    public final C236519h A1q;
    public final C19420v0 A1r;
    public final C18820ts A1s;
    public final C20310xM A1t;
    public final C231417i A1u;
    public final C25781Hq A1v;
    public final C20350xQ A1w;
    public final C27361Nx A1x;
    public final AnonymousClass3P4 A1y;
    public final Map A1z = C90524aI.A0s();
    public final Map A20 = AnonymousClass001.A0J();
    public final Set A21;
    public final Context A22;
    public final TelephonyManager A23;
    public final C19460v5 A24;
    public final C21390zA A25;
    public final C19700wN A26;
    public final AnonymousClass5k7 A27;
    public final AnonymousClass17Y A28;
    public final C19730wQ A29;
    public final C20050ww A2A;
    public final AnonymousClass1WQ A2B;
    public final C30531aM A2C;
    public final C27631Pa A2D;
    public final C148816zT A2E;
    public final AnonymousClass1HM A2F;
    public final AnonymousClass1ND A2G;
    public final C1260862m A2H;
    public final AnonymousClass1PY A2I;
    public final AnonymousClass3U0 A2J;
    public final AnonymousClass1NF A2K;
    public final AnonymousClass6Ts A2L;
    public final C27691Pi A2M;
    public final AnonymousClass6ES A2N;
    public final OutgoingSignalingHandler A2O;
    public final AnonymousClass6XR A2P;
    public final VoiceServiceEventCallback A2Q;
    public final AnonymousClass1PW A2R;
    public final C27671Pf A2S;
    public final C130806Mm A2T;
    public final AnonymousClass6WM A2U;
    public final AnonymousClass6XP A2V;
    public final C144796sp A2W;
    public final C27641Pb A2X;
    public final AnonymousClass1MK A2Y;
    public final C27651Pc A2Z;
    public final C19600wD A2a;
    public final AnonymousClass16D A2b;
    public final AnonymousClass1DM A2c;
    public final AnonymousClass171 A2d;
    public final AnonymousClass1NM A2e;
    public final AnonymousClass1G5 A2f;
    public final C21060yb A2g;
    public final C19970wo A2h;
    public final C25271Fq A2i;
    public final C20830yE A2j;
    public final AnonymousClass189 A2k;
    public final AnonymousClass187 A2l;
    public final C79793uI A2m;
    public final C117145lm A2n;
    public final AnonymousClass1HJ A2o;
    public final AnonymousClass1HO A2p;
    public final C26211Jh A2q;
    public final AnonymousClass12O A2r;
    public final C25841Hw A2s;
    public final C20810yC A2t;
    public final AnonymousClass1C4 A2u;
    public final AnonymousClass19L A2v;
    public final C20600xp A2w;
    public final C30911ay A2x;
    public final AnonymousClass1YU A2y;
    public final AnonymousClass13I A2z;
    public final C31031bA A30;
    public final C88074Rh A31;
    public final AnonymousClass1G4 A32;
    public final AnonymousClass1CR A33;
    public final AnonymousClass1C6 A34;
    public final AnonymousClass13J A35;
    public final C19770wU A36;
    public final C27721Pm A37;
    public final JNIUtils A38;
    public final VoipCameraManager A39;
    public final AnonymousClass005 A3A;
    public final AnonymousClass005 A3B;
    public final AnonymousClass005 A3C;
    public final Map A3D = AnonymousClass001.A0J();
    public final Map A3E = AnonymousClass001.A0J();
    public final Map A3F = C90524aI.A0s();
    public final Set A3G = C36441kJ.A16();
    public final boolean A3H;
    public final C130046Jm A3I;
    public final AnonymousClass63T A3J;
    public final AnonymousClass798 A3K;
    public final C19980wp A3L;
    public final AnonymousClass17Z A3M;
    public final WhatsAppDynamicPytorchLoader A3N;
    public final C21380z9 A3O;
    public final AnonymousClass005 A3P;
    public final List A3Q = AnonymousClass001.A0I();
    public volatile int A3R = 0;
    public volatile Integer A3S;
    public volatile String A3T;
    public volatile boolean A3U;

    public static void A03(AnonymousClass6YM r4) {
        r4.A0P = 0;
        r4.A0j = new Pair((Object) null, -1L);
        r4.A1C = new HashMap();
    }

    public void A0Y(UserJid userJid, CallInfo callInfo, boolean z) {
        this.A1E.execute(new AnonymousClass755(this, userJid, callInfo, 4, z));
    }

    public synchronized void A0Z(UserJid userJid, String str) {
        AnonymousClass6CH r2 = this.A0n;
        C20600xp r3 = this.A2w;
        r2.A01 = r3.A0M(userJid);
        A0G(str).A05 = r2.A01;
        if (this.A2t.A0E(6307)) {
            r2.A00 = r3.A0L(userJid);
            r2.A03 = AnonymousClass000.A1Q(this.A2i.A00.A01() ? 1 : 0);
        }
        C36321k7.A1K(r2, "voip/updateDNDAndVoipNotificationChannelState Call Notification State: ", AnonymousClass000.A0u());
    }

    public static int A00(CallInfo callInfo) {
        switch (callInfo.callResult) {
            case 1:
                if (callInfo.isEndedByMe) {
                    return 2;
                }
                return 3;
            case 2:
                return 6;
            case 3:
            case 7:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                return 8;
            case 4:
            case 8:
            case 9:
                return 5;
            case 5:
                if (callInfo.isCaller) {
                    return 7;
                }
                return 5;
            case 6:
            case 10:
            case 14:
            case 19:
                return 1;
            case 18:
                return 4;
            default:
                return 9;
        }
    }

    private void A01() {
        ((C20780y9) this.A3B.get()).A01(C20530xi.class);
    }

    public static void A04(AnonymousClass6YM r4) {
        C160737lV r0;
        Log.i("voip/ear-far");
        C18740tg.A01();
        r4.A1I = false;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.isEitherSideRequestingUpgrade()) {
            C160737lV r02 = r4.A0t;
            if (r02 != null) {
                r02.BxK(callInfo);
            }
            r4.A2E.A09(callInfo, (Boolean) null);
        }
        if (r4.A0h == null && (r0 = r4.A0t) != null) {
            r0.Bdp(false);
        }
    }

    public static void A05(AnonymousClass6YM r5) {
        C160737lV r0;
        Log.i("voip/ear-near");
        C18740tg.A01();
        r5.A1I = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (r5.A1U || (callInfo != null && callInfo.isEitherSideRequestingUpgrade())) {
            C148816zT r2 = r5.A2E;
            if (C90514aH.A1V(r2.A00)) {
                r2.A0D(callInfo, false);
            }
            r5.A1U = false;
        }
        if (r5.A0h == null && (r0 = r5.A0t) != null) {
            r0.Bdp(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r3 == Integer.MIN_VALUE) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.AnonymousClass6YM r18, com.whatsapp.voipcalling.CallInfo r19, long r20) {
        /*
            r3 = r19
            X.C18740tg.A01()
            if (r19 == 0) goto L_0x0116
            com.whatsapp.voipcalling.CallState r4 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r0) goto L_0x0012
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r0 = 0
            if (r4 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            long r14 = r3.callDuration
            r2 = r18
            if (r0 == 0) goto L_0x0041
            X.1Pm r1 = r2.A37
            boolean r5 = r3.videoEnabled
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            boolean r17 = X.C36361kB.A1a(r4, r0)
            boolean r18 = r3.isAudioChat()
            boolean r4 = r3.isGroupCall
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r13 = r1.next()
            X.1NK r13 = (X.AnonymousClass1NK) r13
            r16 = r5
            r19 = r4
            r13.BSj(r14, r16, r17, r18, r19)
            goto L_0x002d
        L_0x0041:
            X.6XR r4 = r2.A2P
            boolean r0 = r4.A08(r3)
            if (r0 == 0) goto L_0x004f
            int r1 = r4.A00
            int r0 = r4.A06
            if (r1 >= r0) goto L_0x0058
        L_0x004f:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0058
            r4.A05()
        L_0x0058:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x0067
            boolean r0 = r3.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0067
            r4.A06()
        L_0x0067:
            X.7lV r1 = r2.A0t
            if (r1 == 0) goto L_0x0081
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            X.C18740tg.A01()
            java.lang.String r0 = r1.A1i
            if (r0 == 0) goto L_0x007e
            boolean r0 = X.C90514aH.A1X(r3, r0)
            if (r0 == 0) goto L_0x007e
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r3)
        L_0x007e:
            com.whatsapp.voipcalling.VoipActivityV2.A0s(r3, r1)
        L_0x0081:
            X.5Fb r0 = r2.A0m
            r3 = r20
            r0.A07(r14, r3)
            X.63T r7 = r2.A3J
            long r4 = java.lang.System.currentTimeMillis()
            long r8 = r7.A02
            long r1 = r4 - r8
            r12 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1R(r0)
            r10 = 0
            if (r6 == 0) goto L_0x00b7
            double r2 = r7.A00()
            r7.A00 = r2
            long r8 = r7.A02
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            double r0 = r7.A01
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L_0x00b5
        L_0x00b3:
            r7.A01 = r2
        L_0x00b5:
            r7.A02 = r4
        L_0x00b7:
            double r1 = r7.A01
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto L_0x011b
            double r3 = r7.A00
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x011b
            long r14 = r14 / r12
            double r1 = r1 - r3
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00cf
            r14 = 1
        L_0x00cf:
            double r3 = (double) r14
            double r1 = r1 / r3
            if (r6 == 0) goto L_0x011b
            X.15t r0 = r7.A03
            X.15u r0 = r0.A00
            int r3 = r0.A02
            if (r3 == 0) goto L_0x00e0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            if (r3 != r0) goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: "
            X.C36321k7.A1X(r0, r3, r6)
            int r0 = (int) r1
            float r5 = (float) r0
            double r3 = r7.A00
            int r0 = (int) r3
            float r0 = (float) r0
            int r4 = com.whatsapp.voipcalling.Voip.setBatteryState(r5, r0, r6)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r2 = " "
            r3.append(r2)
            double r0 = r7.A00
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = " got result: "
            X.C36321k7.A1T(r0, r3, r4)
            return
        L_0x0116:
            java.lang.String r0 = "voip/periodicalUpdateHandler we are not in an active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A09(X.6YM, com.whatsapp.voipcalling.CallInfo, long):void");
    }

    public static void A0A(AnonymousClass6YM r7, CallInfo callInfo, String str, int i) {
        String A0q2;
        Context context;
        int i2;
        C160737lV r0;
        C19460v5 r1 = r7.A1Z;
        if (r1.A05()) {
            AnonymousClass1ZY r2 = (AnonymousClass1ZY) r1.A02();
            if (r2.A01.A00.A09(C21100yf.A0P)) {
                AnonymousClass1VD.A00(new C146236vH(i), r2.A02);
            }
        }
        if (callInfo == null && (callInfo = C34681hT.A03(r7.A2C)) == null) {
            A0q2 = "voip/call/end without call info";
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C18740tg.A01();
            if (i == 25 || i == 24) {
                str = null;
            } else {
                if (!TextUtils.isEmpty(str) || !callInfo.isCaller || callInfo.callState != CallState.CALLING || r7.A0E || SystemClock.elapsedRealtime() - r7.A0T <= 10000) {
                    if (TextUtils.isEmpty(str) && i == 30) {
                        int i3 = (callInfo.callDuration > 0 ? 1 : (callInfo.callDuration == 0 ? 0 : -1));
                        context = r7.A22;
                        i2 = R.string.f12nameremoved;
                        if (i3 > 0) {
                            i2 = R.string.f12nameremoved;
                        }
                    }
                    if (!(str == null || (r0 = r7.A0t) == null)) {
                        ((VoipActivityV2) r0).A1h = str;
                        r7.A3S = C90494aF.A0U();
                    }
                } else {
                    context = r7.A22;
                    i2 = R.string.f12nameremoved;
                }
                str = context.getString(i2);
                ((VoipActivityV2) r0).A1h = str;
                r7.A3S = C90494aF.A0U();
            }
            r7.A3R = i;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("voip/call/end without text=");
            A0u2.append(str);
            A0u2.append(", reason code=");
            C36321k7.A1Y(A0u2, r7.A3R);
            Future future = r7.A2U.A0I;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r7.A1E;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.execute(new C81283wl((Object) r7, i, 17));
            }
            long A0J2 = C90514aH.A0J(elapsedRealtime);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("voip/call/end elapsed ");
            A0u3.append(A0J2);
            A0q2 = AnonymousClass000.A0q(" ms", A0u3);
        }
        Log.i(A0q2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A1I != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            boolean r0 = r4.A1H
            r3 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r4.A1I
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            r4.A1H = r2
            X.6zT r0 = r4.A2E
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0024
            boolean r0 = X.C34681hT.A0T(r5)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.videoEnabled
            if (r0 != 0) goto L_0x0024
            boolean r0 = X.AnonymousClass6YG.A08()
            if (r0 == 0) goto L_0x003c
        L_0x0024:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r4.A1U
            if (r0 != 0) goto L_0x0034
            if (r3 != 0) goto L_0x0034
            A06(r4)
        L_0x0033:
            return
        L_0x0034:
            X.C18740tg.A01()
            android.os.PowerManager$WakeLock r0 = r4.A0h
            if (r0 != 0) goto L_0x0033
            goto L_0x0052
        L_0x003c:
            if (r2 != 0) goto L_0x0024
            boolean r0 = r5.isCaller
            if (r0 != 0) goto L_0x004a
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r0)
            if (r0 != 0) goto L_0x0024
        L_0x004a:
            boolean r0 = r5.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0024
        L_0x0052:
            r2 = 32
            X.0yb r0 = r4.A2g     // Catch:{ Exception -> 0x0079 }
            android.os.PowerManager r1 = r0.A0G()     // Catch:{ Exception -> 0x0079 }
            if (r1 != 0) goto L_0x0062
            java.lang.String r0 = "voip/service/acquireProximityWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0080
        L_0x0062:
            android.os.PowerManager$WakeLock r0 = r4.A0h     // Catch:{ Exception -> 0x0079 }
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "VoiceService Proximity"
            android.os.PowerManager$WakeLock r0 = X.C111765co.A00(r1, r0, r2)     // Catch:{ Exception -> 0x0079 }
            r4.A0h = r0     // Catch:{ Exception -> 0x0079 }
            if (r0 == 0) goto L_0x0080
            r0.acquire()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "voip/service/acquireProximityWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0080
        L_0x0079:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            r4.A0h = r0
        L_0x0080:
            X.0yC r2 = r4.A2t
            X.0yV r1 = X.C21000yV.A01
            r0 = 6747(0x1a5b, float:9.455E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00a1
            X.0wk r1 = r4.A10
            if (r1 != 0) goto L_0x0098
            X.0wU r0 = r4.A36
            X.0wk r1 = X.C36411kG.A0r(r0)
            r4.A10 = r1
        L_0x0098:
            r1.A02()
            r0 = 36
            X.C1501574e.A00(r1, r4, r0)
            return
        L_0x00a1:
            X.62n r1 = r4.A0w
            X.7gH r0 = r4.A0v
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0B(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r5.A1O != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(X.C107265Nh r39, boolean r40) {
        /*
            r38 = this;
            r3 = r39
            X.C107265Nh.A01(r3)
            int r1 = r3.A0A
            r0 = 3
            if (r1 == r0) goto L_0x0130
            r5 = r38
            X.1HJ r4 = r5.A2o
            com.whatsapp.jid.GroupJid r0 = r3.A0D
            r21 = 0
            if (r0 != 0) goto L_0x0029
            X.0yC r2 = r4.A0F
            java.util.HashSet r0 = r3.A0D()
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x004c
            r0 = 4800(0x12c0, float:6.726E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x004c
        L_0x0029:
            X.1Pm r1 = r5.A37
            if (r40 != 0) goto L_0x0032
            boolean r0 = r5.A1O
            r2 = 0
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.String r0 = "voip/notifyCallMissed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r1.next()
            X.1NK r0 = (X.AnonymousClass1NK) r0
            r0.BSi(r3, r2)
            goto L_0x003c
        L_0x004c:
            java.util.HashSet r0 = r3.A0D()
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L_0x0068
            com.whatsapp.jid.GroupJid r0 = r3.A0D
            if (r0 != 0) goto L_0x0068
            X.3Ir r0 = r3.A0C
            if (r0 != 0) goto L_0x0068
            r0 = 4896(0x1320, float:6.861E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0068
            goto L_0x0029
        L_0x0068:
            X.12q r1 = r4.A08
            X.6by r0 = r3.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            r9 = 0
            X.3Qp r0 = r1.A09(r2, r9)
            if (r0 == 0) goto L_0x0029
            X.0wo r1 = r4.A04
            X.0wQ r0 = r4.A01
            java.lang.String r0 = X.C237919w.A00(r0, r1)
            X.3Qa r6 = new X.3Qa
            r6.<init>(r2, r0, r9)
            long r1 = r3.A01
            X.5J5 r0 = new X.5J5
            r0.<init>(r6, r1)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.3Qa r1 = r0.A1J
            X.11F r8 = r1.A00
            com.whatsapp.jid.UserJid r7 = X.C36401kF.A0b(r8)
            if (r7 != 0) goto L_0x00b4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "CallLog/fromFMessageMissedCall bad UserJid: "
            X.C36321k7.A1J(r8, r1, r6)
        L_0x00a0:
            java.util.List r6 = r0.A00
            r6.clear()
            r6.addAll(r2)
            X.76D r1 = X.AnonymousClass76D.A00
            java.util.Collections.sort(r6, r1)
            X.0xM r1 = r4.A09
            r1.A0h(r0)
            goto L_0x0029
        L_0x00b4:
            boolean r6 = r1.A02
            java.lang.String r1 = r1.A01
            X.6by r8 = new X.6by
            r8.<init>(r9, r7, r1, r6)
            r6 = -1
            long r9 = r0.A0I
            boolean r1 = r3.A0K
            r33 = r1
            r24 = 2
            X.5Tz r18 = r3.A0B()
            r31 = 0
            r35 = 1
            com.whatsapp.jid.GroupJid r1 = r3.A0D
            r37 = r1
            boolean r1 = r3.A0J
            r17 = r1
            java.util.List r22 = java.util.Collections.emptyList()
            com.whatsapp.jid.DeviceJid r1 = r3.A02
            r16 = r1
            X.C107265Nh.A01(r3)
            int r15 = r3.A0A
            X.5Ng r14 = r3.A0F
            X.3Ir r13 = r3.A0C
            int r12 = r3.A08
            X.661 r11 = r3.A0G
            X.5Nh r1 = new X.5Nh
            r23 = 0
            r27 = -1
            r34 = 0
            r19 = r14
            r20 = r11
            r25 = r15
            r26 = r12
            r29 = r9
            r36 = r17
            r14 = r16
            r15 = r37
            r16 = r0
            r17 = r8
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34, r35, r36)
            java.util.Iterator r12 = X.C107265Nh.A00(r3)
        L_0x0110:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r12.next()
            X.5Nf r8 = (X.C107255Nf) r8
            java.util.Map r11 = r1.A00
            com.whatsapp.jid.UserJid r10 = r8.A00
            int r9 = r8.A01
            X.5Nf r8 = new X.5Nf
            r8.<init>(r10, r9, r6)
            r11.put(r10, r8)
            goto L_0x0110
        L_0x012b:
            r2.add(r1)
            goto L_0x00a0
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0C(X.5Nh, boolean):void");
    }

    public static boolean A0E(Notification notification, AnonymousClass6YM r8, boolean z, boolean z2, boolean z3) {
        AnonymousClass13J r1 = r8.A35;
        C20830yE r0 = r8.A2j;
        boolean A082 = AnonymousClass3UD.A08(r0, r1, z2);
        boolean z4 = true;
        if (r0.A0C()) {
            z4 = false;
        }
        if (C19550w8.A0A()) {
            C21390zA r12 = r8.A25;
            if (!r12.A00 || A082 || z4) {
                Locale locale = Locale.US;
                Object[] A1Q2 = C36441kJ.A1Q();
                A1Q2[0] = C36441kJ.A0x(r12.A00);
                AnonymousClass000.A1N(A1Q2, 1, z4);
                AnonymousClass000.A1N(A1Q2, 2, A082);
                String.format(locale, "voiceService/startForegroundService/  Not starting foreground service because app is in background or missing mic/camera permission. isAppInBackground:%b, needMicPermission:%b, needCameraPermission: %b.", A1Q2);
                return false;
            }
        }
        AnonymousClass1PW r13 = r8.A2R;
        Context context = r13.A01.A00;
        AnonymousClass1MM r3 = r13.A02;
        C36321k7.A1K(notification, "voicefgservice/start-service notifcation:", AnonymousClass000.A0u());
        Intent putExtra = C36441kJ.A0I("com.whatsapp.service.VoiceFgService.START").putExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23).putExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", z).putExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED", z2);
        if (z3) {
            putExtra.putExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION", true);
        }
        VoiceFGService.A04 = notification;
        return r3.A03(context, putExtra, VoiceFGService.class);
    }

    public AnonymousClass53O A0F() {
        return new AnonymousClass53O(this);
    }

    public C124445yC A0G(String str) {
        Map map = this.A3D;
        C124445yC r0 = (C124445yC) map.get(str);
        if (r0 != null) {
            return r0;
        }
        C124445yC r02 = new C124445yC();
        map.put(str, r02);
        return r02;
    }

    public C91734cX A0H(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return this.A2S.A04(str);
    }

    public void A0J() {
        Object obj = this.A0A;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A0A = null;
        Object obj2 = this.A0B;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A0B = null;
        Object obj3 = this.A0C;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A0C = null;
    }

    public void A0K() {
        Object obj;
        Pair pair = this.A0j;
        long A092 = C36431kI.A09(pair.second);
        long j = 0;
        if (A092 > 0 && (obj = pair.first) != null) {
            long A0A2 = C36441kJ.A0A(A092);
            if (this.A1C.containsKey(obj)) {
                j = C36431kI.A09(this.A1C.get(this.A0j.first));
            }
            this.A1C.put(this.A0j.first, Long.valueOf(j + A0A2));
        }
        this.A0j = C36441kJ.A0Q((Object) null, C90484aE.A0g());
    }

    public void A0L() {
        this.A0e.removeMessages(0);
        this.A0e.sendEmptyMessageDelayed(0, 15000);
    }

    public void A0O() {
        long j = this.A0W;
        if (j != -1) {
            this.A00 += C36441kJ.A0A(j);
            this.A0W = -1;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0Q(int i) {
        this.A1E.execute(new AnonymousClass72j(i, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.74i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.74i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.73J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.73J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.73J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Runnable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0372, code lost:
        r2 = new X.C1501974i(r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r1 = X.C90514aH.A0J(r16);
        r5 = X.AnonymousClass000.A0u();
        r5.append("voip/service/cmd/");
        r5.append(r4);
        r5.append(" elapsed ");
        r5.append(r1);
        X.C36321k7.A1a(r5, " ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        if (r3.A2Y.A02() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016e, code lost:
        A08(r3, r5, r1, false, false);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C132636Up r23) {
        /*
            r22 = this;
            r12 = r23
            java.lang.String r4 = r12.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/cmd command="
            X.C36321k7.A1K(r12, r0, r1)
            r3 = r22
            boolean r1 = r3.A1S
            java.lang.String r21 = "hangup_call"
            java.lang.String r20 = "cancel_scheduled_call_reminder"
            java.lang.String r15 = "show_vc_lobby"
            java.lang.String r14 = "create_call_link"
            java.lang.String r13 = "refresh_notification"
            java.lang.String r11 = "handle_push_payload"
            java.lang.String r10 = "start_from_call_log"
            java.lang.String r9 = "set_scheduled_call_reminder"
            java.lang.String r8 = "preview_call_link"
            java.lang.String r7 = "check_ongoing_calls"
            java.lang.String r6 = "start_call"
            java.lang.String r5 = "handle_bcall_command"
            java.lang.String r0 = "receive_message"
            if (r1 != 0) goto L_0x008b
            boolean r1 = com.whatsapp.voipcalling.Voip.A08()
            if (r1 != 0) goto L_0x008b
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r6.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r10.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r11.equals(r4)
            if (r1 != 0) goto L_0x008b
            r1 = r21
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r7.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r14.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r8.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r5.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r9.equals(r4)
            if (r1 != 0) goto L_0x008b
            r1 = r20
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r13.equals(r4)
            if (r1 != 0) goto L_0x008b
            boolean r1 = r15.equals(r4)
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = "voip/service/cmd/not-started"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x008a:
            return
        L_0x008b:
            boolean r1 = r3.A1T
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "voip/service/cmd VoiceService is stopping, restart the service with the same command later."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.List r0 = r3.A3Q
            r0.add(r12)
            return
        L_0x009a:
            android.os.Bundle r2 = r12.A00
            if (r2 != 0) goto L_0x00a2
            android.os.Bundle r2 = X.AnonymousClass001.A07()
        L_0x00a2:
            long r16 = android.os.SystemClock.elapsedRealtime()
            r19 = -1
            int r18 = r4.hashCode()
            r1 = 1
            switch(r18) {
                case -2108450315: goto L_0x038d;
                case -1573659621: goto L_0x0393;
                case -1233448890: goto L_0x0399;
                case -1026884326: goto L_0x03a1;
                case -976156138: goto L_0x03ab;
                case -921141884: goto L_0x03b7;
                case -889332668: goto L_0x03c1;
                case 76499387: goto L_0x03cb;
                case 383498784: goto L_0x03d5;
                case 1281366991: goto L_0x03df;
                case 1331833598: goto L_0x03e9;
                case 1377948940: goto L_0x03f5;
                case 1444513451: goto L_0x0401;
                case 1591822776: goto L_0x040b;
                case 1724857030: goto L_0x0415;
                case 2017953372: goto L_0x041f;
                case 2138982608: goto L_0x042b;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            java.lang.String r7 = "notification_type"
            r10 = 0
            r8 = 0
            switch(r19) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00e6;
                case 2: goto L_0x0137;
                case 3: goto L_0x0146;
                case 4: goto L_0x0156;
                case 5: goto L_0x0174;
                case 6: goto L_0x01f6;
                case 7: goto L_0x0206;
                case 8: goto L_0x028d;
                case 9: goto L_0x0298;
                case 10: goto L_0x02ad;
                case 11: goto L_0x02dd;
                case 12: goto L_0x0330;
                case 13: goto L_0x033e;
                case 14: goto L_0x0356;
                case 15: goto L_0x0364;
                case 16: goto L_0x037c;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            java.lang.String r0 = "voip/service/cmd/unknown-action"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00bd:
            long r1 = X.C90514aH.A0J(r16)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/cmd/"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " elapsed "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " ms"
            X.C36321k7.A1a(r5, r0)
            X.1MK r0 = r3.A2Y
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x008a
            r3.A0L()
            return
        L_0x00e6:
            java.lang.Object r2 = r12.A02
            X.C18740tg.A06(r2)
            X.6NW r2 = (X.AnonymousClass6NW) r2
            int r0 = r2.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            long r5 = r2.A01
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0101
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.A07 = r0
        L_0x0101:
            java.lang.Integer r0 = r2.A09
            if (r0 == 0) goto L_0x0107
            r3.A15 = r0
        L_0x0107:
            r0 = 12
            X.74i r5 = new X.74i
            r5.<init>(r3, r2, r0)
            com.whatsapp.jid.GroupJid r0 = r2.A07
            if (r0 != 0) goto L_0x0133
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0133
            java.util.LinkedHashMap r0 = r2.A0C
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0133
            X.0yC r1 = r3.A2t
            r0 = 5989(0x1765, float:8.392E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0133
            X.0wU r2 = r3.A36
            r0 = 15
            X.74i r1 = new X.74i
            r1.<init>(r3, r5, r0)
            goto L_0x035f
        L_0x0133:
            r5.run()
            goto L_0x00bd
        L_0x0137:
            X.1PW r0 = r3.A2R
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00bd
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            goto L_0x016e
        L_0x0146:
            android.os.Message r0 = r12.A01
            X.C18740tg.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C18740tg.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            r0 = 16
            goto L_0x0372
        L_0x0156:
            X.0yb r0 = r3.A2g
            boolean r0 = X.C34681hT.A0F(r0)
            r3.A1K = r0
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "voip/service/cmd/ACTION_REFRESH_APP_BACKGROUND_RESTRICTIONS background restrictions no longer enabled, start FgService"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 2
            int r1 = r2.getInt(r7, r0)
        L_0x016e:
            r0 = 0
            A08(r3, r5, r1, r0, r0)
            goto L_0x00bd
        L_0x0174:
            android.os.Message r0 = r12.A01
            X.C18740tg.A06(r0)
            java.lang.Object r5 = r0.obj
            X.C18740tg.A06(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.arg2
            int r0 = r0.arg1
            if (r0 == r1) goto L_0x0187
            r1 = 0
        L_0x0187:
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r2 = 0
            if (r7 == r0) goto L_0x01cc
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x01c6
            X.6Ts r0 = r3.A2L
            X.5Nh r1 = r0.A04(r1)
            if (r1 == 0) goto L_0x01c6
            X.3Ir r0 = r1.A0C
            if (r0 == 0) goto L_0x01c6
            X.3Ir r0 = r1.A0C
            java.lang.String r0 = r0.A02
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01c6
            android.content.Context r8 = r3.A22
            X.0zA r0 = r3.A25
            boolean r1 = r0.A00
            r0 = 1
            java.lang.Boolean r9 = X.C36441kJ.A0x(r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r13 = r10
            r12 = r10
            android.content.Intent r0 = X.AnonymousClass190.A0z(r8, r9, r10, r11, r12, r13)
            r8.startActivity(r0)
            goto L_0x00bd
        L_0x01c6:
            X.17Y r1 = r3.A28
            r0 = 2131889278(0x7f120c7e, float:1.9413215E38)
            goto L_0x01d9
        L_0x01cc:
            X.0wD r0 = r3.A2a
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x01de
            X.17Y r1 = r3.A28
            r0 = 2131887337(0x7f1204e9, float:1.9409278E38)
        L_0x01d9:
            r1.A06(r0, r2)
            goto L_0x00bd
        L_0x01de:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/actionPreviewCallLink starting token:"
            X.C36321k7.A1Q(r0, r5, r2)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            X.73J r2 = new X.73J
            r12 = 0
            r8 = r2
            r9 = r3
            r10 = r5
            r11 = r6
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0377
        L_0x01f6:
            android.os.Message r0 = r12.A01
            X.C18740tg.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C18740tg.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            r0 = 8
            goto L_0x0372
        L_0x0206:
            java.lang.Object r5 = r12.A02
            X.C18740tg.A06(r5)
            X.6NW r5 = (X.AnonymousClass6NW) r5
            long r1 = r5.A01
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0219
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A07 = r0
        L_0x0219:
            X.5Nh r7 = r5.A08
            X.C18740tg.A06(r7)
            java.lang.Integer r0 = r5.A09
            X.C18740tg.A06(r0)
            int r14 = r0.intValue()
            boolean r6 = r5.A05
            java.lang.String r5 = r5.A02
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x023a
            java.lang.String r0 = "voip/actionStartFromCallLog can't start, a call is already ongoing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00bd
        L_0x023a:
            X.6by r0 = r7.A04
            java.lang.String r0 = r0.A02
            java.lang.String r2 = X.C34681hT.A08(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/actionStartFromCallLog starting callId:"
            X.C36321k7.A1Q(r0, r2, r1)
            java.util.ArrayList r13 = r7.A0C()
            java.util.HashSet r8 = X.C36441kJ.A16()
            java.util.Iterator r10 = r13.iterator()
        L_0x0257:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r9 = r10.next()
            X.5Nf r9 = (X.C107255Nf) r9
            int r1 = r9.A01
            r0 = 5
            if (r1 != r0) goto L_0x0257
            com.whatsapp.jid.UserJid r1 = r9.A00
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            if (r1 == 0) goto L_0x0276
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
        L_0x0272:
            r8.add(r0)
            goto L_0x0257
        L_0x0276:
            r0 = 0
            goto L_0x0272
        L_0x0278:
            r3.A0j(r8)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r3.A1E
            X.73q r0 = new X.73q
            r8 = r0
            r9 = r3
            r10 = r7
            r11 = r2
            r12 = r5
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.execute(r0)
            goto L_0x00bd
        L_0x028d:
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            r0 = 11
            X.74i r2 = new X.74i
            r2.<init>(r3, r12, r0)
            goto L_0x0377
        L_0x0298:
            r6 = 0
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0 = 2
            int r1 = r2.getInt(r7, r0)
            java.lang.String r0 = "is_media_projection"
            boolean r0 = r2.getBoolean(r0)
            A08(r3, r5, r1, r6, r0)
            goto L_0x00bd
        L_0x02ad:
            r6 = 7
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x02c4
            com.whatsapp.jid.GroupJid r5 = r0.groupJid
            if (r5 != 0) goto L_0x02be
            com.whatsapp.jid.UserJid r5 = r0.getCreatorJid()
            if (r5 == 0) goto L_0x02c4
        L_0x02be:
            X.1NM r1 = r3.A2e
            r0 = 6
            r1.A0B(r5, r0)
        L_0x02c4:
            java.lang.String r0 = "call_id"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r1 = "call_ui_action"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            r3.A0i(r5, r10, r0)
            X.1Fq r1 = r3.A2i
            java.lang.String r0 = "VoiceService2"
            r1.A03(r6, r0)
            goto L_0x00bd
        L_0x02dd:
            boolean r0 = r3.A1R
            if (r0 == 0) goto L_0x0306
            X.1MK r2 = r3.A2Y
            boolean r0 = r2.A00()
            if (r0 != 0) goto L_0x02ef
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0306
        L_0x02ef:
            android.content.Context r8 = r3.A22
            X.0zA r0 = r3.A25
            boolean r0 = r0.A00
            java.lang.Boolean r9 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r13 = r10
            r12 = r10
            android.content.Intent r0 = X.AnonymousClass190.A0z(r8, r9, r10, r11, r12, r13)
            r8.startActivity(r0)
        L_0x0306:
            boolean r0 = r3.A1R
            if (r0 != 0) goto L_0x032b
            X.1MK r0 = r3.A2Y
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x032b
            com.whatsapp.voipcalling.CallLinkInfo r0 = com.whatsapp.voipcalling.Voip.getCallLinkInfo()
            if (r0 == 0) goto L_0x032b
            int r2 = r0.linkState
            if (r2 == r1) goto L_0x031f
            r0 = 2
            if (r2 != r0) goto L_0x032b
        L_0x031f:
            android.os.Handler r0 = r3.A0c
            r1 = 50
            r0.removeMessages(r1)
            android.os.Handler r0 = r3.A0c
            X.C90514aH.A1I(r0, r1)
        L_0x032b:
            r0 = 0
            r3.A1R = r0
            goto L_0x00bd
        L_0x0330:
            java.util.concurrent.atomic.AtomicInteger r0 = A3X
            r0.getAndIncrement()
            android.os.Message r1 = r12.A01
            X.C18740tg.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            r0 = 7
            goto L_0x0372
        L_0x033e:
            android.os.Message r0 = r12.A01
            X.C18740tg.A06(r0)
            int r0 = r0.arg1
            if (r0 == r1) goto L_0x0348
            r1 = 0
        L_0x0348:
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r3.A1E
            r2 = 17
            X.75B r0 = new X.75B
            r0.<init>((int) r2, (java.lang.Object) r3, (boolean) r1)
            r5.execute(r0)
            goto L_0x00bd
        L_0x0356:
            X.0wU r2 = r3.A36
            r0 = 10
            X.74i r1 = new X.74i
            r1.<init>(r3, r12, r0)
        L_0x035f:
            r2.Bp1(r1)
            goto L_0x00bd
        L_0x0364:
            android.os.Message r0 = r12.A01
            X.C18740tg.A06(r0)
            java.lang.Object r1 = r0.obj
            X.C18740tg.A06(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r3.A1E
            r0 = 9
        L_0x0372:
            X.74i r2 = new X.74i
            r2.<init>(r3, r1, r0)
        L_0x0377:
            r7.execute(r2)
            goto L_0x00bd
        L_0x037c:
            java.lang.String r0 = "end_call_string"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "end_call_reason"
            int r0 = r2.getInt(r0)
            A0A(r3, r10, r1, r0)
            goto L_0x00bd
        L_0x038d:
            short r19 = X.C90504aG.A0y(r5, r4)
            goto L_0x00b0
        L_0x0393:
            short r19 = X.C90514aH.A1B(r6, r4)
            goto L_0x00b0
        L_0x0399:
            java.lang.String r0 = "start_foreground_service_from_push"
            short r19 = X.C90514aH.A1C(r0, r4)
            goto L_0x00b0
        L_0x03a1:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x00b0
            r19 = 3
            goto L_0x00b0
        L_0x03ab:
            java.lang.String r0 = "refresh_app_background_restrictions"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 4
            goto L_0x00b0
        L_0x03b7:
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x00b0
            r19 = 5
            goto L_0x00b0
        L_0x03c1:
            boolean r0 = r4.equals(r9)
            if (r0 == 0) goto L_0x00b0
            r19 = 6
            goto L_0x00b0
        L_0x03cb:
            boolean r0 = r4.equals(r10)
            if (r0 == 0) goto L_0x00b0
            r19 = 7
            goto L_0x00b0
        L_0x03d5:
            boolean r0 = r4.equals(r11)
            if (r0 == 0) goto L_0x00b0
            r19 = 8
            goto L_0x00b0
        L_0x03df:
            boolean r0 = r4.equals(r13)
            if (r0 == 0) goto L_0x00b0
            r19 = 9
            goto L_0x00b0
        L_0x03e9:
            java.lang.String r0 = "reject_call"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 10
            goto L_0x00b0
        L_0x03f5:
            java.lang.String r0 = "show_voip_activity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 11
            goto L_0x00b0
        L_0x0401:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 12
            goto L_0x00b0
        L_0x040b:
            boolean r0 = r4.equals(r14)
            if (r0 == 0) goto L_0x00b0
            r19 = 13
            goto L_0x00b0
        L_0x0415:
            boolean r0 = r4.equals(r15)
            if (r0 == 0) goto L_0x00b0
            r19 = 14
            goto L_0x00b0
        L_0x041f:
            r0 = r20
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 15
            goto L_0x00b0
        L_0x042b:
            r0 = r21
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b0
            r19 = 16
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0U(X.6Up):void");
    }

    public void A0V(C160737lV r8) {
        this.A0t = r8;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : this.A2w.A0O()) {
                if (statusBarNotification.getId() == 27) {
                    this.A2i.A04(27, statusBarNotification.getTag(), "joinable call");
                }
            }
            return;
        }
        Iterator it = this.A2D.A03().iterator();
        while (it.hasNext()) {
            this.A2i.A04(27, AnonymousClass001.A0C(it), "joinable call");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r2.A09(r3, java.lang.Boolean.valueOf(r0.A0U.A0H(r3))) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r4 = r0.participants;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(com.whatsapp.fieldstats.events.WamCall r27, com.whatsapp.voipcalling.CallGroupInfo r28, X.C107265Nh r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, long r35, long r37, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            r26 = this;
            r8 = r29
            r9 = r27
            X.6by r1 = r8.A04
            boolean r0 = r1.A03
            r2 = r0 ^ 1
            java.lang.String r0 = "processMissedIncomingCall should only be called on callee side"
            X.C18740tg.A0D(r2, r0)
            r6 = r26
            X.1NF r2 = r6.A2K
            r0 = 4
            r7 = r31
            r2.A04(r7, r0)
            java.lang.String r0 = "test.name"
            java.lang.String r11 = com.whatsapp.voipcalling.Voip.getVoipParamForCall(r0, r7)
            if (r11 == 0) goto L_0x0027
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r11 = 0
        L_0x0028:
            com.whatsapp.voipcalling.Voip.clearVoipParam(r7)
            r5 = 0
            r0 = r28
            if (r28 == 0) goto L_0x0049
            com.whatsapp.voipcalling.CallParticipant[] r4 = r0.participants
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0049
            r10 = 0
        L_0x0036:
            r0 = r4[r5]
            java.lang.String r2 = r0.state
            java.lang.String r0 = "connected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            int r10 = r10 + 1
        L_0x0044:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x0036
            r5 = r10
        L_0x0049:
            com.whatsapp.jid.GroupJid r4 = r8.A0D
            X.1C6 r2 = r6.A34
            X.0xQ r0 = r6.A1w
            r3 = r4
            X.147 r3 = (X.AnonymousClass147) r3
            if (r4 == 0) goto L_0x0066
            X.17X r0 = r0.A0U
            boolean r0 = r0.A0H(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A09(r3, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            r16 = 0
        L_0x0068:
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x0075
            com.whatsapp.jid.GroupJid r0 = r8.A0D
            if (r0 == 0) goto L_0x0075
            r2.A04(r0)
        L_0x0075:
            r14 = 0
            r13 = 5
            if (r45 == 0) goto L_0x008c
            if (r42 == 0) goto L_0x0081
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x008c
        L_0x0081:
            android.os.Handler r0 = r6.A0c
            r2 = r40
            android.os.Message r0 = android.os.Message.obtain(r0, r13, r2, r14, r8)
            r0.sendToTarget()
        L_0x008c:
            X.65J r10 = r6.A1l
            com.whatsapp.jid.UserJid r15 = r1.A01
            X.6YM r4 = r10.A04
            X.5yC r3 = r4.A0G(r7)
            r2 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r1 = X.C36371kC.A0m()
            if (r27 != 0) goto L_0x00dc
            X.0yC r9 = r10.A08
            r0 = 1939(0x793, float:2.717E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0220
            com.whatsapp.fieldstats.extension.WamCallExtended r9 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r9.<init>()
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)
            r9.callResult = r0
            r9.callSide = r12
            if (r5 <= 0) goto L_0x00c6
            r9.groupCallIsLastSegment = r1
            r9.groupCallIsGroupCallInvitee = r1
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r9.numConnectedParticipants = r0
            r9.fieldStatsRowType = r12
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r41)
            r9.videoEnabled = r0
            r9.callTestBucket = r11
            if (r42 == 0) goto L_0x00d2
            r9.joinableDuringCall = r1
        L_0x00d2:
            if (r43 == 0) goto L_0x00d6
            r9.isPendingCall = r1
        L_0x00d6:
            com.whatsapp.jid.GroupJid r0 = r8.A0D
            if (r0 == 0) goto L_0x00dc
            r9.isLinkedGroupCall = r1
        L_0x00dc:
            java.lang.Integer r0 = r3.A03
            r9.incomingCallUiAction = r0
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x00e6
            r9.doNotDisturbEnabled = r1
        L_0x00e6:
            X.6CH r12 = r4.A0n
            boolean r11 = r12.A01
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x00f0
            r11 = r11 | 2
        L_0x00f0:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x00f6
            r11 = r11 | 4
        L_0x00f6:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x00fc
            r11 = r11 | 8
        L_0x00fc:
            java.lang.Long r0 = X.C36441kJ.A0y(r11)
            r9.callNotificationState = r0
            X.661 r0 = r8.A0G
            if (r0 == 0) goto L_0x010e
            r9.isScheduledCall = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r37)
            r9.randomScheduledId = r0
        L_0x010e:
            int r0 = r8.A08
            if (r0 != r2) goto L_0x0114
            r9.isVoiceChat = r1
        L_0x0114:
            if (r44 == 0) goto L_0x0118
            r9.isPhashBased = r1
        L_0x0118:
            java.lang.Boolean r0 = r9.groupCallIsLastSegment
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x013a
            com.whatsapp.jid.GroupJid r0 = r8.A0D
            if (r0 == 0) goto L_0x013a
            X.0xQ r0 = r10.A09
            com.whatsapp.jid.GroupJid r11 = r8.A0D
            X.17X r0 = r0.A0U
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r11)
            if (r0 <= 0) goto L_0x0219
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r9.numInvitedParticipants = r0
        L_0x013a:
            java.lang.Long r23 = java.lang.Long.valueOf(r35)
            r20 = 0
            r22 = r30
            r24 = r32
            r25 = r33
            r21 = r20
            r18 = r9
            r19 = r15
            r17 = r10
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r42 == 0) goto L_0x015b
            X.1PY r0 = r4.A2I
            java.lang.String r0 = r0.A00(r7)
            r9.callRandomId = r0
        L_0x015b:
            boolean r0 = r8.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.privacySilenceUnknownCaller = r0
            X.1DM r0 = r10.A06
            boolean r0 = r0.A0C(r15)
            java.lang.Boolean r0 = X.C36441kJ.A0x(r0)
            r9.privacyUnknownCaller = r0
            com.whatsapp.jid.GroupJid r0 = r8.A0D
            if (r0 == 0) goto L_0x0186
            X.1C6 r11 = r10.A0A
            com.whatsapp.jid.GroupJid r0 = r8.A0D
            int r11 = X.AnonymousClass1C6.A00(r0, r11)
            r0 = 1
            if (r11 != r0) goto L_0x0186
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r9.privacyUnknownCaller = r0
        L_0x0186:
            X.1NM r12 = r10.A07
            X.6Ts r0 = r10.A03
            X.5Nh r11 = r0.A04(r7)
            java.lang.Integer r0 = r9.callResult
            r12.A0E(r11, r0)
            X.6Mm r10 = r10.A05
            r11 = r39
            r10.A01(r9, r11)
            if (r5 <= 0) goto L_0x01fd
            com.whatsapp.fieldstats.events.WamJoinableCall r0 = new com.whatsapp.fieldstats.events.WamJoinableCall
            r0.<init>()
            if (r42 == 0) goto L_0x01a7
            java.lang.String r9 = r9.callRandomId
            r0.callRandomId = r9
        L_0x01a7:
            boolean r3 = r3.A06
            if (r3 == 0) goto L_0x01ad
            r0.isRering = r1
        L_0x01ad:
            if (r42 == 0) goto L_0x01b1
            r0.joinableDuringCall = r1
        L_0x01b1:
            com.whatsapp.jid.GroupJid r3 = r8.A0D
            if (r3 == 0) goto L_0x01b7
            r0.isLinkedGroupCall = r1
        L_0x01b7:
            X.661 r3 = r8.A0G
            if (r3 == 0) goto L_0x01c3
            r0.isScheduledCall = r1
            java.lang.Long r3 = java.lang.Long.valueOf(r37)
            r0.randomScheduledId = r3
        L_0x01c3:
            java.lang.Long r3 = X.C36441kJ.A0y(r5)
            r0.numConnectedPeers = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r41)
            r0.videoEnabled = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r0.lobbyEntryPoint = r3
            java.lang.Integer r3 = X.C36381kD.A0n()
            r0.lobbyExit = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r34)
            r0.legacyCallResult = r3
            if (r43 == 0) goto L_0x01e5
            r0.isPendingCall = r1
        L_0x01e5:
            if (r16 == 0) goto L_0x01e9
            r0.hasSpamDialog = r1
        L_0x01e9:
            int r3 = r8.A08
            if (r3 != r2) goto L_0x01ef
            r0.isVoiceChat = r1
        L_0x01ef:
            if (r44 == 0) goto L_0x01f3
            r0.isPhashBased = r1
        L_0x01f3:
            X.0yW r1 = r10.A00
            r1.Blw(r0)
            if (r39 == 0) goto L_0x01fd
            r1.BP7()
        L_0x01fd:
            java.util.Map r0 = r4.A3D
            r0.remove(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0218
            android.os.Handler r0 = r6.A0c
            r1 = 48
            r0.removeMessages(r1)
            android.os.Handler r0 = r6.A0c
            android.os.Message r0 = r0.obtainMessage(r1, r13, r14, r7)
            r0.sendToTarget()
        L_0x0218:
            return
        L_0x0219:
            java.lang.String r0 = "VoiceService:postMissedCallEventToFieldStat groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x013a
        L_0x0220:
            com.whatsapp.fieldstats.events.WamCall r9 = new com.whatsapp.fieldstats.events.WamCall
            r9.<init>()
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0W(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.voipcalling.CallGroupInfo, X.5Nh, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0b(CallInfo callInfo, int i) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A1E;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.execute(new AnonymousClass72j(i, 1));
        }
        C160737lV r2 = this.A0t;
        if (r2 != null) {
            r2.BwZ(callInfo, i, this.A2E.A0G(callInfo.callId));
        }
        boolean A0G2 = this.A2E.A0G(callInfo.callId);
        if (this.A2t.A0E(4624)) {
            ((AnonymousClass05L) ((C122415uo) this.A3P.get()).A00.getValue()).setValue(new AnonymousClass6A1(i, A0G2));
        }
        AnonymousClass6EE r1 = callInfo.self;
        if (r1 != null) {
            C105545Fb r0 = this.A0m;
            boolean z = r1.A0F;
            Iterator A0s2 = C36361kB.A0s(r0);
            while (A0s2.hasNext()) {
                C90524aI.A0K(A0s2).BRV(i, A0G2, z);
            }
        }
        A0B(callInfo);
        this.A1U = false;
    }

    public void A0d(CallState callState, String str) {
        int i;
        AudioManager A0D2 = this.A2g.A0D();
        switch (callState.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 10:
                if (A0D2 != null && !AnonymousClass000.A1V(A0H(str))) {
                    int mode = A0D2.getMode();
                    Integer num = this.A03;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 3;
                    }
                    if (mode != i) {
                        A0D2.setMode(i);
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("voip/updateAudioModeForCallState ");
                    A0u2.append(callState);
                    C36321k7.A1T(" to ", A0u2, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A0e(Integer num, String str, float f, float f2) {
        if (num != null) {
            float f3 = f;
            float f4 = f2;
            if (this.A2t.A0E(4959)) {
                C106835Ln r1 = this.A1c;
                SoundPool soundPool = this.A01;
                int intValue = num.intValue();
                AnonymousClass00C.A0D(soundPool, 0);
                r1.execute(new AnonymousClass73O(soundPool, (WeakReference) null, f, f2, intValue));
                return;
            }
            this.A01.play(num.intValue(), f3, f4, 0, 0, 1.0f);
            return;
        }
        C36321k7.A1Z(C36331k8.A0k("VoiceService/playSound/", str), " sound pool has not been loaded successfully");
    }

    public void A0f(String str) {
        Message.obtain(this.A0c, 26, str).sendToTarget();
    }

    public void A0l(List list, int i) {
        this.A28.Bp3(new C81333wq(this, i, 16, list));
    }

    public boolean A0m() {
        if (Build.VERSION.SDK_INT < 28 || !this.A2S.A0C()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0440, code lost:
        if (r5 == r9) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r10 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05a0, code lost:
        if (r5 == r8) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x062f, code lost:
        if (r3.callResult == 5) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0865, code lost:
        if (r5 == 9) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x08b5, code lost:
        if (r5 != 8) goto L_0x08b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x08b7, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08c6, code lost:
        if (X.C34681hT.A0T(r4) != false) goto L_0x08c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x08c8, code lost:
        A0B(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x08cb, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0936, code lost:
        com.whatsapp.voipcalling.VoipActivityV2.A1D(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0939, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        if (r0.A29.A0M(r3.getCreatorJid()) != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0ad9, code lost:
        r1 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0add, code lost:
        if (r1 == null) goto L_0x1012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0c16, code lost:
        r0.A1E.execute(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0c1b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x0d43, code lost:
        if (r3 != 3) goto L_0x1012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x0e11, code lost:
        r6 = r0.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x0e13, code lost:
        r6.A0A(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x0e16, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x0e6e, code lost:
        r1.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x0e71, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
        if (r0.A34.A06(X.C36331k8.A0G(r9)) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x0f2c, code lost:
        X.C18740tg.A0D(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x0f2f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x100b, code lost:
        A0a(com.whatsapp.voipcalling.Voip.getCallInfo());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:906:0x1012, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:908:0x1017, code lost:
        r0.A0m.A0A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:909:0x101c, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x086e  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0bda  */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x0be0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean A0o(android.os.Message r28) {
        /*
            r27 = this;
            r8 = r28
            int r5 = r8.what
            r3 = 0
            r6 = 2
            r12 = 0
            r1 = 0
            r2 = 1
            r0 = r27
            switch(r5) {
                case 1: goto L_0x0010;
                case 2: goto L_0x000f;
                case 3: goto L_0x001e;
                case 4: goto L_0x0027;
                case 5: goto L_0x06c8;
                case 6: goto L_0x06d5;
                case 7: goto L_0x06e3;
                case 8: goto L_0x06fd;
                case 9: goto L_0x000f;
                case 10: goto L_0x071e;
                case 11: goto L_0x0740;
                case 12: goto L_0x0740;
                case 13: goto L_0x000f;
                case 14: goto L_0x08be;
                case 15: goto L_0x0df4;
                case 16: goto L_0x000f;
                case 17: goto L_0x08cc;
                case 18: goto L_0x08d5;
                case 19: goto L_0x08fb;
                case 20: goto L_0x000f;
                case 21: goto L_0x000f;
                case 22: goto L_0x000f;
                case 23: goto L_0x093a;
                case 24: goto L_0x0951;
                case 25: goto L_0x096c;
                case 26: goto L_0x09aa;
                case 27: goto L_0x09b6;
                case 28: goto L_0x09d1;
                case 29: goto L_0x0ff3;
                case 30: goto L_0x09ee;
                case 31: goto L_0x0a36;
                case 32: goto L_0x0a85;
                case 33: goto L_0x0abc;
                case 34: goto L_0x0ae1;
                case 35: goto L_0x0bea;
                case 36: goto L_0x000f;
                case 37: goto L_0x0c0b;
                case 38: goto L_0x0c1c;
                case 39: goto L_0x0c42;
                case 40: goto L_0x0ad9;
                case 41: goto L_0x0c7a;
                case 42: goto L_0x0ca4;
                case 43: goto L_0x0d46;
                case 44: goto L_0x0d70;
                case 45: goto L_0x0d7f;
                case 46: goto L_0x0d8b;
                case 47: goto L_0x0dc2;
                case 48: goto L_0x0e17;
                case 49: goto L_0x0e3e;
                case 50: goto L_0x0e56;
                case 51: goto L_0x0e72;
                case 52: goto L_0x0ea5;
                case 53: goto L_0x0f86;
                case 54: goto L_0x0fd9;
                case 55: goto L_0x1013;
                case 56: goto L_0x1013;
                case 57: goto L_0x101d;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r1
        L_0x0010:
            long r5 = r0.A0X
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x100b
            java.lang.Long r1 = X.C90494aF.A0V(r5)
            r0.A07 = r1
            goto L_0x100b
        L_0x001e:
            X.63T r1 = r0.A3J
            double r3 = r1.A00()
            r0.A0O = r3
            return r2
        L_0x0027:
            X.1Fq r3 = r0.A2i
            r26 = r3
            r5 = 7
            java.lang.String r4 = "VoiceService1"
            r3.A03(r5, r4)
            com.whatsapp.voipcalling.CallState[] r4 = com.whatsapp.voipcalling.CallState.values()
            int r3 = r8.arg1
            r4 = r4[r3]
            java.lang.Object r3 = r8.obj
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            X.C18740tg.A01()
            if (r3 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r5 = r3.callState
            if (r4 == r5) goto L_0x1012
            java.lang.String r5 = r3.callId
            X.4cX r5 = r0.A0H(r5)
            boolean r16 = X.AnonymousClass000.A1V(r5)
            com.whatsapp.voipcalling.CallState r5 = r3.callState
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r7 = "voip/callStateChangedOnUIThread from "
            r9.append(r7)
            r9.append(r4)
            java.lang.String r7 = " to "
            r9.append(r7)
            r9.append(r5)
            java.lang.String r8 = " in UI Main thread. selfManagedConnection = "
            r7 = r16
            X.C36321k7.A1X(r8, r9, r7)
            com.whatsapp.jid.GroupJid r13 = r3.groupJid
            if (r13 == 0) goto L_0x008a
            r10 = r13
        L_0x0072:
            X.1Pm r7 = r0.A37
            java.lang.String r9 = r3.callId
            java.util.Iterator r8 = X.C36361kB.A0s(r7)
        L_0x007a:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r8.next()
            X.1NK r7 = (X.AnonymousClass1NK) r7
            r7.BSm(r10, r5, r9)
            goto L_0x007a
        L_0x008a:
            com.whatsapp.jid.UserJid r10 = r3.getInitialPeerJid()
            if (r10 == 0) goto L_0x0091
            goto L_0x0072
        L_0x0091:
            com.whatsapp.voipcalling.CallState r9 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            java.lang.String r12 = "refresh_notification"
            r11 = 4
            if (r5 != r9) goto L_0x0475
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r4 == r7) goto L_0x0475
            boolean r7 = r0.A1W
            if (r7 != 0) goto L_0x0466
            boolean r7 = r0.A0m()
            if (r7 == 0) goto L_0x04ea
            long r7 = android.os.SystemClock.elapsedRealtime()
            r0.A0X = r7
            java.util.List r20 = r3.getPeerJids()
            boolean r14 = r3.videoEnabled
            java.lang.String r13 = r3.callId
            com.whatsapp.jid.GroupJid r10 = r3.groupJid
            boolean r22 = r3.isAudioChat()
            r7 = 0
            r17 = r0
            r18 = r10
            r19 = r13
            r21 = r14
            boolean r10 = r17.A0p(r18, r19, r20, r21, r22)
            if (r10 == 0) goto L_0x0448
            r7 = 2000(0x7d0, double:9.88E-321)
        L_0x00cc:
            r0.A0T(r7)
        L_0x00cf:
            X.0yC r10 = r0.A2t
            r6 = 4809(0x12c9, float:6.739E-42)
            boolean r6 = r10.A0E(r6)
            if (r6 == 0) goto L_0x0433
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 != r6) goto L_0x0433
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r6) goto L_0x0440
            X.1PW r6 = r0.A2R
            X.C132636Up.A00(r6, r12)
        L_0x00e6:
            boolean r6 = r3.isPeerRequestingUpgrade()
            if (r6 != 0) goto L_0x00f1
            X.6XR r6 = r0.A2P
            r6.A06()
        L_0x00f1:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CALLING
            r7 = 0
            if (r5 != r6) goto L_0x0428
            X.6zT r6 = r0.A2E
            r6.A06(r3)
        L_0x00fb:
            X.7lV r7 = r0.A0t
            if (r7 == 0) goto L_0x0425
            r6 = r7
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            boolean r11 = r6.A1s
            r7.callStateChanged(r4, r3)
        L_0x0107:
            X.5Fb r12 = r0.A0m
            r12.A0A(r3)
            X.6Ts r6 = r0.A2L
            r25 = r6
            java.lang.String r7 = r3.callId
            X.5Nh r8 = r6.A04(r7)
            if (r8 != 0) goto L_0x014a
            boolean r6 = r3.isCaller
            if (r6 != 0) goto L_0x0129
            X.0wQ r7 = r0.A29
            com.whatsapp.jid.UserJid r6 = r3.getCreatorJid()
            boolean r6 = r7.A0M(r6)
            r14 = 0
            if (r6 == 0) goto L_0x012a
        L_0x0129:
            r14 = 1
        L_0x012a:
            com.whatsapp.jid.UserJid r6 = r3.getInitialPeerJid()
            java.lang.StringBuilder r7 = X.C36421kH.A0f(r6)
            java.lang.String r6 = "VoiceService:callStateChangedOnUiThread getCallLog with key[jid="
            X.C90504aG.A1F(r3, r6, r7, r14)
            java.lang.String r6 = "]"
            X.C36321k7.A1a(r7, r6)
            com.whatsapp.jid.UserJid r13 = r3.getInitialPeerJid()
            java.lang.String r8 = r3.callId
            int r7 = r3.initialGroupTransactionId
            r6 = r25
            X.5Nh r8 = r6.A03(r13, r8, r7, r14)
        L_0x014a:
            com.whatsapp.voipcalling.CallState r24 = com.whatsapp.voipcalling.CallState.NONE
            java.lang.String r23 = "can not find message for call id "
            r6 = r24
            if (r5 != r6) goto L_0x05c1
            if (r8 == 0) goto L_0x0422
            int r13 = r8.A09
        L_0x0156:
            r0.A1M = r1
            com.whatsapp.fieldstats.events.WamCall r6 = r0.A0x
            if (r6 == 0) goto L_0x03ff
            com.whatsapp.jid.UserJid r22 = r3.getInitialPeerJid()
            X.C18740tg.A06(r22)
            boolean r6 = r3.isCaller
            if (r6 != 0) goto L_0x0199
            boolean r6 = r3.isEndedByMe
            if (r6 != 0) goto L_0x016f
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 != r6) goto L_0x0199
        L_0x016f:
            if (r11 == 0) goto L_0x0199
            if (r8 == 0) goto L_0x0199
            X.3Az r6 = r3.callWaitingInfo
            int r6 = r6.A01
            if (r6 != 0) goto L_0x0199
            X.16D r7 = r0.A2b
            r6 = r22
            X.141 r9 = r7.A08(r6)
            if (r9 == 0) goto L_0x0199
            X.3IL r6 = r9.A0F
            if (r6 != 0) goto L_0x0199
            boolean r6 = r0.A1L
            if (r6 != 0) goto L_0x0199
            X.1C6 r7 = r0.A34
            X.11F r6 = X.C36331k8.A0G(r9)
            boolean r6 = r7.A06(r6)
            r21 = 1
            if (r6 != 0) goto L_0x019b
        L_0x0199:
            r21 = 0
        L_0x019b:
            java.lang.String r20 = " "
            X.3Az r6 = r3.callWaitingInfo
            int r7 = r6.A01
            r9 = 0
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 != r6) goto L_0x01e3
            if (r7 != 0) goto L_0x01e3
            if (r11 == 0) goto L_0x01e3
            r6 = 3780(0xec4, float:5.297E-42)
            java.lang.String r19 = r10.A09(r6)
            boolean r6 = X.AnonymousClass6RR.A00(r19)
            if (r6 != 0) goto L_0x01e3
            X.0wo r6 = r0.A2h
            long r17 = X.C19970wo.A00(r6)
            X.1Pa r6 = r0.A2D
            android.content.SharedPreferences r7 = X.C27631Pa.A00(r6)
            java.lang.String r6 = "last_app_update_dialog_timestamp"
            long r14 = X.C36341k9.A0B(r7, r6)
            int r6 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r6 < 0) goto L_0x01e1
            long r17 = r17 - r14
            r6 = 3781(0xec5, float:5.298E-42)
            int r6 = r10.A07(r6)
            int r6 = java.lang.Math.max(r6, r2)
            long r6 = (long) r6
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 * r14
            int r12 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x01e3
        L_0x01e1:
            r9 = r19
        L_0x01e3:
            boolean r6 = r0.A1N
            if (r6 != 0) goto L_0x03fc
            X.3Az r6 = r3.callWaitingInfo
            int r12 = r6.A01
            java.lang.Integer r7 = r0.A3S
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 != r6) goto L_0x03fc
            if (r12 != 0) goto L_0x03fc
            if (r11 == 0) goto L_0x03fc
            if (r7 == 0) goto L_0x03fc
            int r7 = r7.intValue()
            r6 = -1
            if (r7 == r6) goto L_0x03fc
            X.0wo r6 = r0.A2h
            long r14 = X.C19970wo.A00(r6)
            X.1Pa r6 = r0.A2D
            android.content.SharedPreferences r11 = X.C27631Pa.A00(r6)
            java.lang.String r6 = "last_call_rating_timestamp"
            long r11 = X.C36341k9.A0B(r11, r6)
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x021d
            long r14 = r14 - r11
            long r11 = X.C36371kC.A07(r7)
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x03fc
        L_0x021d:
            r15 = 1
        L_0x021e:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r6) goto L_0x0226
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 != r6) goto L_0x024e
        L_0x0226:
            double r11 = r0.A0O
            boolean r6 = java.lang.Double.isNaN(r11)
            if (r6 != 0) goto L_0x024e
            double r6 = r0.A0N
            boolean r14 = java.lang.Double.isNaN(r6)
            if (r14 != 0) goto L_0x024e
            com.whatsapp.fieldstats.events.WamCall r14 = r0.A0x
            double r6 = r6 - r11
            java.lang.Double r11 = java.lang.Double.valueOf(r6)
            r14.callBatteryChangePct = r11
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r0.A0O = r6
            r0.A0N = r6
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "VoiceService callStateChangedOnUIThread to NONE setting battery fieldstat: "
            X.C36321k7.A1K(r11, r6, r7)
        L_0x024e:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r6) goto L_0x0256
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 != r6) goto L_0x0268
        L_0x0256:
            java.lang.String r6 = r3.callId
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0268
            r6 = 3321(0xcf9, float:4.654E-42)
            boolean r6 = r10.A0E(r6)
            if (r6 == 0) goto L_0x0268
            X.17Z r6 = X.AnonymousClass17Z.$redex_init_class
        L_0x0268:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r21 == 0) goto L_0x0385
            r6 = -1
            if (r13 == r6) goto L_0x0381
            long r6 = X.C36371kC.A07(r13)
        L_0x0273:
            X.6EE r9 = r3.getDefaultPeerInfo()
            if (r9 == 0) goto L_0x0373
            X.6EE r9 = r3.getDefaultPeerInfo()
            boolean r9 = r9.A0C
            if (r9 == 0) goto L_0x0373
            java.lang.String r13 = "peer-interrupted"
        L_0x0283:
            android.content.Context r9 = r0.A22
            r19 = r9
            java.lang.String r9 = r3.callId
            r18 = r9
            boolean r15 = r3.isEndedByMe
            boolean r14 = r3.videoEnabled
            boolean r9 = r3.isGroupCallCreatedOnServer
            if (r9 == 0) goto L_0x036f
            com.whatsapp.jid.UserJid r17 = r3.getCreatorJid()
        L_0x0297:
            android.content.Intent r12 = X.C36431kI.A0D()
            java.lang.String r11 = r19.getPackageName()
            java.lang.String r9 = "com.whatsapp.calling.spam.CallSpamActivity"
            r12.setClassName(r11, r9)
            java.lang.String r11 = r22.getRawString()
            java.lang.String r9 = "caller_jid"
            r12.putExtra(r9, r11)
            java.lang.String r11 = "call_id"
            r9 = r18
            r12.putExtra(r11, r9)
            java.lang.String r9 = "call_duration"
            r12.putExtra(r9, r6)
            java.lang.String r9 = "call_terminator"
            r12.putExtra(r9, r15)
            java.lang.String r9 = "call_termination_reason"
            r12.putExtra(r9, r13)
            java.lang.String r9 = "call_video"
            r12.putExtra(r9, r14)
            if (r17 == 0) goto L_0x02d3
            java.lang.String r11 = r17.getRawString()
            java.lang.String r9 = "call_creator_jid"
            r12.putExtra(r9, r11)
        L_0x02d3:
            r12.setFlags(r10)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r9 = "voiceservice starting call spam activity "
            r10.append(r9)
            r9 = r22
            r10.append(r9)
            r9 = r20
            X.C36321k7.A1V(r9, r10, r6)
            r6 = r19
            r6.startActivity(r12)
        L_0x02ee:
            r9 = 1
        L_0x02ef:
            java.util.Map r7 = r0.A3D
            java.lang.String r6 = r3.callId
            r7.remove(r6)
            X.1NM r7 = r0.A2e
            com.whatsapp.fieldstats.events.WamCall r6 = r0.A0x
            java.lang.Integer r6 = r6.callResult
            r7.A0E(r8, r6)
            if (r9 == 0) goto L_0x0339
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "callStateChangedOnUIThread to NONE. callOfferElapsedTimeInMillisOnServer: "
            r7.append(r6)
            com.whatsapp.fieldstats.events.WamCall r6 = r0.A0x
            java.lang.Long r6 = r6.callOfferElapsedT
            X.C36321k7.A1N(r6, r7)
            X.6Mm r9 = r0.A2T
            com.whatsapp.fieldstats.events.WamCall r7 = r0.A0x
            boolean r6 = r0.A1V
            r9.A01(r7, r6)
            java.lang.String r6 = r0.A3T
            if (r6 == 0) goto L_0x0339
            X.6XP r11 = r0.A2V
            java.lang.String r6 = r0.A3T
            com.whatsapp.fieldstats.events.WamCall r10 = r0.A0x
            java.io.File r12 = X.C90524aI.A0S(r6)
            X.2PI r13 = new X.2PI
            r13.<init>()
            X.0wU r6 = r11.A04
            r14 = 22
            X.74x r9 = new X.74x
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14)
            r6.Boy(r9)
        L_0x0339:
            r7 = 3
        L_0x033a:
            boolean r12 = r0.A1S
            boolean r10 = r0.A3U
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 == r6) goto L_0x0362
            r0.A0D(r4, r3)
        L_0x0345:
            if (r8 == 0) goto L_0x05a3
            X.1Pm r10 = r0.A37
            java.lang.String r6 = "voip/notifyCallEnded"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            java.util.Iterator r9 = X.C36361kB.A0s(r10)
        L_0x0352:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0607
            java.lang.Object r6 = r9.next()
            X.1NK r6 = (X.AnonymousClass1NK) r6
            r6.BSa(r8)
            goto L_0x0352
        L_0x0362:
            boolean r6 = r0.A1S
            r9 = r6 ^ 1
            java.lang.String r6 = "web relay calls should not start fg activity"
            X.C18740tg.A0D(r9, r6)
            r0.A0L()
            goto L_0x0345
        L_0x036f:
            r17 = 0
            goto L_0x0297
        L_0x0373:
            X.6EE r9 = r3.self
            boolean r9 = r9.A0C
            if (r9 == 0) goto L_0x037d
            java.lang.String r13 = "self-interrupted"
            goto L_0x0283
        L_0x037d:
            java.lang.String r13 = "unknown"
            goto L_0x0283
        L_0x0381:
            r6 = -1
            goto L_0x0273
        L_0x0385:
            if (r15 == 0) goto L_0x03c9
            android.content.Context r12 = r0.A22
            com.whatsapp.fieldstats.events.WamCall r6 = r0.A0x
            android.os.Bundle r14 = X.C130806Mm.A00(r6)
            boolean r13 = r0.A1V
            java.lang.String r11 = r0.A3T
            android.content.Intent r9 = X.C36431kI.A0D()
            java.lang.String r7 = r12.getPackageName()
            java.lang.String r6 = "com.whatsapp.calling.callrating.CallRatingActivity"
            r9.setClassName(r7, r6)
            java.lang.String r6 = "event"
            r9.putExtra(r6, r14)
            java.lang.String r6 = "uploadFieldStat"
            r9.putExtra(r6, r13)
            java.lang.String r6 = "timeSeriesDir"
            r9.putExtra(r6, r11)
            r9.setFlags(r10)
            r12.startActivity(r9)
            X.1Pa r9 = r0.A2D
            X.0wo r6 = r0.A2h
            long r6 = X.C19970wo.A00(r6)
            android.content.SharedPreferences$Editor r10 = X.C90474aD.A0F(r9)
            java.lang.String r9 = "last_call_rating_timestamp"
            X.C36341k9.A0w(r10, r9, r6)
            r9 = 0
            goto L_0x02ef
        L_0x03c9:
            boolean r6 = X.AnonymousClass6RR.A00(r9)
            if (r6 != 0) goto L_0x02ee
            android.content.Context r12 = r0.A22
            android.content.Intent r11 = X.C36431kI.A0D()
            java.lang.String r7 = r12.getPackageName()
            java.lang.String r6 = "com.whatsapp.calling.VoipAppUpdateActivity"
            r11.setClassName(r7, r6)
            java.lang.String r6 = "feature"
            r11.putExtra(r6, r9)
            r11.setFlags(r10)
            r12.startActivity(r11)
            X.1Pa r9 = r0.A2D
            X.0wo r6 = r0.A2h
            long r6 = X.C19970wo.A00(r6)
            android.content.SharedPreferences$Editor r10 = X.C90474aD.A0F(r9)
            java.lang.String r9 = "last_app_update_dialog_timestamp"
            X.C36341k9.A0w(r10, r9, r6)
            goto L_0x02ee
        L_0x03fc:
            r15 = 0
            goto L_0x021e
        L_0x03ff:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r4 == r6) goto L_0x0339
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r4 == r6) goto L_0x0339
            int r10 = r3.callResult
            r6 = 7
            r7 = 3
            if (r10 == r6) goto L_0x033a
            boolean r6 = r3.isBCall
            if (r6 != 0) goto L_0x033a
            if (r4 == r9) goto L_0x0417
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r4 != r6) goto L_0x041b
        L_0x0417:
            boolean r6 = r0.A3U
            if (r6 != 0) goto L_0x033a
        L_0x041b:
            java.lang.String r6 = "callFieldStat can not be null when call state changed to NONE."
            X.C18740tg.A0D(r1, r6)
            goto L_0x033a
        L_0x0422:
            r13 = -1
            goto L_0x0156
        L_0x0425:
            r11 = 0
            goto L_0x0107
        L_0x0428:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 == r6) goto L_0x00fb
            X.6zT r6 = r0.A2E
            r6.A09(r3, r7)
            goto L_0x00fb
        L_0x0433:
            if (r4 != r9) goto L_0x0440
            boolean r8 = r0.A1G
            X.1NF r7 = r0.A2K
            java.lang.String r6 = r3.callId
            if (r8 == 0) goto L_0x0444
            r7.A04(r6, r11)
        L_0x0440:
            if (r5 == r9) goto L_0x00f1
            goto L_0x00e6
        L_0x0444:
            r7.A01(r6)
            goto L_0x0440
        L_0x0448:
            r0.A0X = r7
            android.telephony.TelephonyManager r13 = r0.A23
            X.0yE r10 = r0.A2j
            int r10 = X.AnonymousClass3UL.A00(r13, r10)
            if (r10 == 0) goto L_0x045c
            java.lang.String r3 = r3.callId
            java.lang.String r1 = "busy"
            r0.A0i(r3, r1, r11)
            return r2
        L_0x045c:
            boolean r10 = r0.A1G
            if (r10 == 0) goto L_0x0462
            r7 = 500(0x1f4, double:2.47E-321)
        L_0x0462:
            r0.A0T(r7)
            goto L_0x047d
        L_0x0466:
            r0.A1W = r1
            X.C90474aD.A12(r0, r3)
            A08(r0, r3, r6, r1, r1)
            X.6zT r6 = r0.A2E
            r6.A06(r3)
            goto L_0x00cf
        L_0x0475:
            r7 = 0
            if (r4 != r9) goto L_0x0482
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r5 != r10) goto L_0x0482
        L_0x047d:
            A08(r0, r3, r6, r1, r1)
            goto L_0x00cf
        L_0x0482:
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r5 != r10) goto L_0x04e1
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 != r10) goto L_0x04e1
            r0.A0X = r7
            boolean r6 = r3.isAudioChat()
            if (r6 == 0) goto L_0x04ee
            if (r13 == 0) goto L_0x04ee
            X.17Y r13 = r0.A28
            X.14r r6 = r13.A00
            if (r6 == 0) goto L_0x04ee
            X.0yC r6 = r0.A2t
            boolean r6 = X.C34681hT.A0N(r6)
            if (r6 == 0) goto L_0x04ee
            java.lang.String r10 = r3.callId
            java.lang.String r6 = r0.A19
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x04ee
            X.14r r13 = r13.A00
            X.005 r15 = r0.A3B
            java.lang.Object r6 = r15.get()
            X.0y9 r6 = (X.C20780y9) r6
            java.lang.Class<X.0xj> r14 = X.C20540xj.class
            r6.A01(r14)
            java.lang.String r10 = r3.callId
            X.AnonymousClass00C.A0D(r10, r1)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r8 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r8.<init>()
            android.os.Bundle r7 = X.AnonymousClass001.A07()
            java.lang.String r6 = "audio_chat_call_id"
            r7.putString(r6, r10)
            r8.A17(r7)
            java.lang.Object r6 = r15.get()
            X.0y9 r6 = (X.C20780y9) r6
            r6.A01(r14)
            java.lang.String r6 = "AudioChatBottomSheetDialog"
            r13.Btl(r8, r6)
            goto L_0x00cf
        L_0x04e1:
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r5 != r7) goto L_0x04f6
            boolean r7 = r0.A1P
            if (r7 != 0) goto L_0x04f6
            goto L_0x047d
        L_0x04ea:
            r7 = 0
            r0.A0X = r7
        L_0x04ee:
            boolean r6 = r0.A1G
            if (r6 == 0) goto L_0x00cc
            r7 = 500(0x1f4, double:2.47E-321)
            goto L_0x00cc
        L_0x04f6:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 != r6) goto L_0x0501
            android.os.Handler r6 = r0.A0c
            r6.removeMessages(r2)
            goto L_0x00cf
        L_0x0501:
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 != r8) goto L_0x050b
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r4 != r6) goto L_0x0511
            goto L_0x00cf
        L_0x050b:
            if (r5 == r8) goto L_0x0511
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r6) goto L_0x00cf
        L_0x0511:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r4 != r6) goto L_0x051a
            X.6zT r6 = r0.A2E
            r6.A06(r3)
        L_0x051a:
            X.1PW r6 = r0.A2R
            X.C132636Up.A00(r6, r12)
            boolean r6 = r0.A1K
            if (r6 == 0) goto L_0x0536
            if (r5 != r8) goto L_0x0529
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 != r6) goto L_0x052d
        L_0x0529:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 != r6) goto L_0x0536
        L_0x052d:
            X.7lV r6 = r0.A0t
            if (r6 == 0) goto L_0x0536
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            com.whatsapp.voipcalling.VoipActivityV2.A1B(r6, r1)
        L_0x0536:
            int r10 = r0.A0S
            r6 = -128(0xffffffffffffff80, float:NaN)
            if (r10 < r6) goto L_0x0556
            r6 = 256(0x100, float:3.59E-43)
            if (r10 > r6) goto L_0x0556
            if (r10 == 0) goto L_0x0556
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "voip/voipAudioLevelBase "
            X.C36321k7.A1T(r6, r7, r10)
            short r7 = r0.A1F
            int r6 = r0.A0S
            int r7 = r7 + r6
            short r6 = (short) r7
            r0.A1F = r6
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r6)
        L_0x0556:
            if (r16 == 0) goto L_0x0571
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r7 < r6) goto L_0x0571
            X.1Pf r7 = r0.A2S
            java.lang.String r6 = r3.callId
            X.4cX r7 = r7.A04(r6)
            if (r7 == 0) goto L_0x0571
            int r6 = r7.getConnectionCapabilities()
            r6 = r6 | 1
            r7.setConnectionCapabilities(r6)
        L_0x0571:
            if (r5 != r8) goto L_0x05a0
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 != r6) goto L_0x0582
            java.lang.String r10 = r3.callId
            r8 = 51
            java.lang.String r7 = "lonelyStateNotification"
            r6 = r26
            r6.A04(r8, r10, r7)
        L_0x0582:
            com.whatsapp.jid.GroupJid r13 = r3.groupJid
            java.lang.String r10 = r3.scheduledId
            if (r13 == 0) goto L_0x00cf
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 != 0) goto L_0x00cf
            boolean r6 = r0.A3H
            if (r6 == 0) goto L_0x00cf
            X.0wU r8 = r0.A36
            r7 = 33
            X.74l r6 = new X.74l
            r6.<init>(r0, r13, r10, r7)
            r8.Bp1(r6)
            goto L_0x00cf
        L_0x05a0:
            if (r5 != r8) goto L_0x00cf
            goto L_0x0582
        L_0x05a3:
            r9 = 10
            boolean r6 = r3.isBCall
            if (r6 != 0) goto L_0x0635
            boolean r6 = r3.isAudioChat()
            if (r6 != 0) goto L_0x0635
            if (r10 != 0) goto L_0x0635
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.PRECALLING
            boolean r10 = X.C36361kB.A1a(r4, r6)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r23)
            java.lang.String r6 = r3.callId
            X.C90464aC.A1N(r6, r8, r10)
            goto L_0x0635
        L_0x05c1:
            r7 = 3
            r9 = 10
            if (r4 == r6) goto L_0x05ca
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 != r6) goto L_0x0678
        L_0x05ca:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r5 == r6) goto L_0x0678
            java.lang.String r6 = r3.callId
            r12.A0B(r6)
            if (r8 == 0) goto L_0x05f9
            X.1Pm r12 = r0.A37
            java.lang.String r6 = "voip/notifyCallStarted"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            X.0zv r11 = r12.A00
            java.lang.String r10 = "Calling"
            java.lang.String r6 = "Resume"
            r11.A02(r10, r6)
            java.util.Iterator r10 = X.C36361kB.A0s(r12)
        L_0x05e9:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0678
            java.lang.Object r6 = r10.next()
            X.1NK r6 = (X.AnonymousClass1NK) r6
            r6.BSl(r8)
            goto L_0x05e9
        L_0x05f9:
            boolean r6 = r0.A3U
            if (r6 != 0) goto L_0x0678
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0v(r23)
            java.lang.String r6 = r3.callId
            X.C90464aC.A1N(r6, r8, r1)
            goto L_0x0678
        L_0x0607:
            X.0zv r10 = r10.A00
            java.lang.String r9 = "Calling"
            java.lang.String r6 = "End"
            r10.A02(r9, r6)
            boolean r6 = r8.A0N()
            if (r6 == 0) goto L_0x06af
            boolean r6 = r3.isJoinableGroupCall
            if (r6 != 0) goto L_0x06af
            com.whatsapp.jid.GroupJid r11 = r3.groupJid
            java.lang.String r10 = r3.scheduledId
            boolean r9 = r3.isAudioChat()
            r6 = r25
            r6.A06(r11, r8, r10, r9)
            if (r12 == 0) goto L_0x06ac
            int r11 = r3.callResult
            r9 = 10
            r10 = 5
            r6 = 1
            if (r11 != r10) goto L_0x0632
        L_0x0631:
            r6 = 0
        L_0x0632:
            r0.A0C(r8, r6)
        L_0x0635:
            X.3Az r6 = r3.callWaitingInfo
            int r6 = r6.A01
            boolean r6 = X.C90514aH.A1V(r6)
            r0.A1W = r6
            boolean r6 = r3.isJoinableGroupCall
            if (r6 == 0) goto L_0x0678
            boolean r6 = r3.isCaller
            if (r6 != 0) goto L_0x0678
            int r8 = r3.callResult
            r6 = 4
            if (r8 != r6) goto L_0x0678
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r4 == r6) goto L_0x0687
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 == r6) goto L_0x0687
            java.lang.String r11 = r3.callId
            X.3U0 r10 = r0.A2J
            android.content.Context r8 = r0.A22
            boolean r12 = r0.A1P
            r6 = -1
            X.3OE r19 = X.AnonymousClass3OE.A00(r3, r6, r12)
            X.1PW r6 = r0.A2R
            r21 = 2
            r22 = 1
            r17 = r10
            r18 = r8
            r20 = r6
            android.app.Notification r10 = r17.A06(r18, r19, r20, r21, r22)
            r8 = 27
            r6 = r26
            r6.A07(r11, r8, r10)
        L_0x0678:
            r6 = r24
            if (r4 != r6) goto L_0x0687
            X.1Pa r4 = r0.A2D
            android.content.SharedPreferences$Editor r6 = X.C90474aD.A0F(r4)
            java.lang.String r4 = "screen_sharing_backward_compat_shown"
            X.C36331k8.A0w(r6, r4, r1)
        L_0x0687:
            int r6 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r6 < r4) goto L_0x1012
            if (r16 == 0) goto L_0x1012
            X.1Pf r4 = r0.A2S
            java.lang.String r0 = r3.callId
            X.4cX r6 = r4.A04(r0)
            if (r6 == 0) goto L_0x1012
            int r4 = r5.ordinal()
            if (r4 == r2) goto L_0x06c4
            if (r4 == r9) goto L_0x06c1
            r0 = 6
            if (r4 == r0) goto L_0x06c1
            if (r4 == r7) goto L_0x06bd
            if (r4 == r1) goto L_0x06b2
            r0 = 7
            if (r4 == r0) goto L_0x06b2
            return r2
        L_0x06ac:
            r9 = 10
            goto L_0x0631
        L_0x06af:
            r9 = 10
            goto L_0x0635
        L_0x06b2:
            int r0 = A00(r3)
            r6.A01(r0)
            r6.setAudioModeIsVoip(r1)
            return r2
        L_0x06bd:
            r6.setRinging()
            return r2
        L_0x06c1:
            r6.setActive()
        L_0x06c4:
            r6.setAudioModeIsVoip(r2)
            return r2
        L_0x06c8:
            java.lang.Object r4 = r8.obj
            X.5Nh r4 = (X.C107265Nh) r4
            int r3 = r8.arg1
            if (r3 <= 0) goto L_0x06d1
            r1 = 1
        L_0x06d1:
            r0.A0C(r4, r1)
            return r2
        L_0x06d5:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r3 = r8.arg2
            boolean r3 = X.AnonymousClass000.A1R(r3)
            r0.A0c(r4, r3, r1)
            return r2
        L_0x06e3:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r1) goto L_0x1012
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x06f6
            r1.BxK(r4)
        L_0x06f6:
            X.5Fb r1 = r0.A0m
            r1.A0A(r4)
            goto L_0x08c8
        L_0x06fd:
            X.7lV r4 = r0.A0t
            if (r4 == 0) goto L_0x1012
            java.lang.Object r3 = r8.obj
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.C18740tg.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipActivityV2/videoRenderStarted "
            X.C36321k7.A1K(r3, r0, r1)
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A01(r4)
            com.whatsapp.voipcalling.VoipActivityV2.A0u(r0, r4)
            com.whatsapp.voipcalling.VoipActivityV2.A13(r4)
            return r2
        L_0x071e:
            java.lang.Object r3 = r8.obj
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.5Fb r1 = r0.A0m
            java.util.Iterator r0 = X.C36361kB.A0s(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1012
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x0732:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r1)
            r0.BcG(r3)
            goto L_0x0732
        L_0x0740:
            com.whatsapp.voipcalling.CallInfo r7 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r4 = r8.what
            int r5 = r8.arg1
            X.C18740tg.A01()
            if (r7 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r8 = r7.callState
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.NONE
            if (r8 == r3) goto L_0x1012
            r9 = 3
            if (r5 != r9) goto L_0x0759
            r7.isPeerRequestingUpgrade()
        L_0x0759:
            X.6Ts r10 = r0.A2L
            if (r5 == 0) goto L_0x075f
            if (r5 != r2) goto L_0x0784
        L_0x075f:
            boolean r3 = r7.isGroupCall
            if (r3 != 0) goto L_0x0784
            X.0yC r8 = r10.A09
            java.util.Map r3 = r7.participants
            java.util.Set r3 = r3.keySet()
            int r3 = r3.size()
            int r3 = r3 - r2
            if (r3 > r2) goto L_0x0784
            r3 = 4800(0x12c0, float:6.726E-42)
            boolean r3 = r8.A0E(r3)
            if (r3 == 0) goto L_0x0784
            X.0wU r8 = r10.A0C
            X.74i r3 = new X.74i
            r3.<init>(r10, r7, r6)
            r8.Bp1(r3)
        L_0x0784:
            r8 = 6
            r11 = 11
            if (r4 != r11) goto L_0x07a7
            if (r5 != r8) goto L_0x07a7
            X.0yb r3 = r0.A2g
            android.media.AudioManager r10 = r3.A0D()
            if (r10 == 0) goto L_0x07a7
            java.lang.Boolean r3 = r0.A12
            if (r3 == 0) goto L_0x079d
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x07a7
        L_0x079d:
            boolean r3 = r0.A0n(r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.A12 = r3
        L_0x07a7:
            r3 = 7
            r10 = 5
            if (r5 == r3) goto L_0x085b
            if (r5 == r10) goto L_0x085b
            r3 = 9
            if (r5 == r3) goto L_0x085b
            r3 = 8
            if (r5 == r3) goto L_0x085b
            boolean r3 = r7.isEitherSideRequestingUpgrade()
            if (r3 == 0) goto L_0x07bf
            boolean r3 = r0.A1I
            if (r3 != 0) goto L_0x07db
        L_0x07bf:
            boolean r3 = r7.isEitherSideRequestingUpgrade()
            if (r3 == 0) goto L_0x07ca
            r0.A1U = r1
            r0.A0B(r7)
        L_0x07ca:
            X.7lV r3 = r0.A0t
            if (r3 == 0) goto L_0x07d1
            r3.BxK(r7)
        L_0x07d1:
            X.5Fb r3 = r0.A0m
            r3.A0A(r7)
            X.6zT r3 = r0.A2E
            r3.A09(r7, r12)
        L_0x07db:
            boolean r3 = r7.videoEnabled
            if (r3 == 0) goto L_0x0855
            boolean r3 = r7.isPeerRequestingUpgrade()
            if (r3 == 0) goto L_0x0855
            android.os.Handler r3 = r0.A0c
            r12 = 24
            r3.removeMessages(r12)
            android.os.Handler r11 = r0.A0c
            r3 = 30000(0x7530, double:1.4822E-319)
            r11.sendEmptyMessageDelayed(r12, r3)
            X.6XR r11 = r0.A2P
            com.whatsapp.jid.UserJid r4 = X.C90494aF.A0M(r7)
            long[] r3 = new long[r10]
            r3 = {0, 50, 100, 50, 1000} // fill-array
            r11.A07(r4, r3, r2)
            X.7lV r10 = r0.A0t
            if (r10 == 0) goto L_0x080c
            r3 = r10
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r3 = r3.A1u
            if (r3 != 0) goto L_0x0837
        L_0x080c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "voip/commonHandler/HANDLER_WHAT_PEER_VIDEO_STATE_CHANGED launch incoming request screen, voip activity is "
            X.C36321k7.A1K(r10, r3, r4)
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()
            com.whatsapp.jid.UserJid r3 = X.C90494aF.A0M(r7)
            r15.add(r3)
            r12 = 0
            android.content.Context r10 = r0.A22
            X.0zA r3 = r0.A25
            boolean r3 = r3.A00
            java.lang.Boolean r11 = X.C36441kJ.A0x(r3)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            r14 = r12
            android.content.Intent r3 = X.AnonymousClass190.A0z(r10, r11, r12, r13, r14, r15)
            r10.startActivity(r3)
        L_0x0837:
            r4 = 2
            if (r5 == r6) goto L_0x1012
            if (r5 == r8) goto L_0x1012
            if (r5 != r9) goto L_0x084d
            X.1G4 r3 = r0.A32
            boolean r3 = r3.A01()
            if (r3 == 0) goto L_0x084d
            boolean r3 = r7.isPeerRequestingUpgrade()
            if (r3 == 0) goto L_0x084d
            r4 = 1
        L_0x084d:
            boolean r3 = r0.A1O
            r3 = r3 ^ 1
            A08(r0, r7, r4, r3, r1)
            return r2
        L_0x0855:
            X.6XR r3 = r0.A2P
            r3.A06()
            goto L_0x0837
        L_0x085b:
            boolean r3 = r0.A1I
            if (r3 != 0) goto L_0x0861
            r0.A1U = r2
        L_0x0861:
            if (r4 != r11) goto L_0x08a7
            r3 = 9
            if (r5 != r3) goto L_0x08b7
        L_0x0867:
            r13 = 2131896058(0x7f1226fa, float:1.9426967E38)
        L_0x086a:
            X.7lV r4 = r0.A0t
            if (r4 == 0) goto L_0x088c
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            if (r13 <= 0) goto L_0x08a3
            r4.A1p = r2
            java.lang.String r3 = r4.getString(r13)
            r4.A3w(r3)
            android.os.Handler r3 = r4.A05
            r12 = 10
            r3.removeMessages(r12)
            android.os.Handler r11 = r4.A05
            r3 = 3000(0xbb8, double:1.482E-320)
            r11.sendEmptyMessageDelayed(r12, r3)
        L_0x0889:
            r0.A0B(r7)
        L_0x088c:
            X.5Fb r12 = r0.A0m
            if (r13 <= 0) goto L_0x08b9
            r3 = 3000(0xbb8, double:1.482E-320)
            java.util.Iterator r11 = X.C36361kB.A0s(r12)
            boolean r11 = r11.hasNext()
            if (r11 == 0) goto L_0x07db
            android.os.Handler r11 = r12.A00
            r11.sendEmptyMessageDelayed(r2, r3)
            goto L_0x07db
        L_0x08a3:
            r4.BxK(r7)
            goto L_0x0889
        L_0x08a7:
            r3 = 7
            if (r5 == r3) goto L_0x0867
            if (r5 != r10) goto L_0x08b0
            r13 = 2131896057(0x7f1226f9, float:1.9426964E38)
            goto L_0x086a
        L_0x08b0:
            r3 = 8
            r13 = 2131896056(0x7f1226f8, float:1.9426962E38)
            if (r5 == r3) goto L_0x086a
        L_0x08b7:
            r13 = 0
            goto L_0x086a
        L_0x08b9:
            r12.A0A(r7)
            goto L_0x07db
        L_0x08be:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r1 = X.C34681hT.A0T(r4)
            if (r1 == 0) goto L_0x1012
        L_0x08c8:
            r0.A0B(r4)
            return r2
        L_0x08cc:
            X.63T r1 = r0.A3J
            double r3 = r1.A00()
            r0.A0N = r3
            return r2
        L_0x08d5:
            X.7lV r5 = r0.A0t
            if (r5 == 0) goto L_0x1012
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A01(r5)
            X.6YM r0 = r5.A0r
            if (r0 == 0) goto L_0x1012
            if (r3 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x1012
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x1012
            boolean r0 = r5.A1s
            if (r0 == 0) goto L_0x1012
            r0 = 2131887473(0x7f120571, float:1.9409554E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0936
        L_0x08fb:
            X.7lV r5 = r0.A0t
            if (r5 == 0) goto L_0x1012
            java.lang.Object r4 = r8.obj
            X.11F r4 = (X.AnonymousClass11F) r4
            if (r4 == 0) goto L_0x1012
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A01(r5)
            X.6YM r0 = r5.A0r
            if (r0 == 0) goto L_0x1012
            if (r3 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x1012
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x1012
            boolean r0 = r5.A1s
            if (r0 == 0) goto L_0x1012
            java.util.Map r0 = r3.participants
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x1012
            X.171 r1 = r5.A15
            X.16D r0 = r5.A12
            java.lang.String r1 = X.C36381kD.A0u(r0, r1, r4)
            r0 = 2131887465(0x7f120569, float:1.9409538E38)
            java.lang.String r0 = X.C36351kA.A0w(r5, r1, r2, r0)
        L_0x0936:
            com.whatsapp.voipcalling.VoipActivityV2.A1D(r5, r0)
            return r2
        L_0x093a:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r1) goto L_0x1012
            X.6EE r1 = r4.self
            int r3 = r1.A06
            r1 = 3
            if (r3 != r1) goto L_0x1012
            r0.A0Q(r2)
            return r2
        L_0x0951:
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r3 = r4.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r1) goto L_0x1012
            boolean r1 = r4.isPeerRequestingUpgrade()
            if (r1 == 0) goto L_0x1012
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.72j r0 = new X.72j
            r0.<init>(r2, r6)
            goto L_0x0e6e
        L_0x096c:
            X.7lV r7 = r0.A0t
            if (r7 == 0) goto L_0x0984
            com.whatsapp.voipcalling.VoipActivityV2 r7 = (com.whatsapp.voipcalling.VoipActivityV2) r7
            X.C18740tg.A01()
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.VoipActivityV2.A01(r7)
            if (r5 == 0) goto L_0x0984
            com.whatsapp.voipcalling.CallState r4 = r5.callState
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 == r3) goto L_0x0984
            com.whatsapp.voipcalling.VoipActivityV2.A0u(r5, r7)
        L_0x0984:
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r5 == 0) goto L_0x1012
            X.5Fb r3 = r0.A0m
            r3.A0A(r5)
            X.3Az r3 = r5.callWaitingInfo
            int r3 = r3.A01
            if (r3 == r2) goto L_0x1012
            com.whatsapp.voipcalling.CallState r4 = r5.callState
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r3) goto L_0x09a6
            X.7lV r3 = r0.A0t
            if (r3 == 0) goto L_0x09a5
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r3 = r3.A1u
            if (r3 != 0) goto L_0x09a6
        L_0x09a5:
            r6 = 1
        L_0x09a6:
            A08(r0, r5, r6, r1, r1)
            return r2
        L_0x09aa:
            X.17Y r1 = r0.A28
            if (r1 == 0) goto L_0x1012
            java.lang.Object r0 = r8.obj
            java.lang.String r0 = (java.lang.String) r0
            r1.A0E(r0, r2)
            return r2
        L_0x09b6:
            X.6zT r4 = r0.A2E
            int r3 = r8.arg1
            r0 = 13
            X.3wl r1 = new X.3wl
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0)
            boolean r0 = X.C148816zT.A03(r4)
            if (r0 == 0) goto L_0x09cd
            X.0wk r0 = r4.A0H
            r0.execute(r1)
            return r2
        L_0x09cd:
            r1.run()
            return r2
        L_0x09d1:
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_SHOW_INCOMING_CALL_UI"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r3 = r8.obj
            if (r3 == 0) goto L_0x1012
            java.lang.String r3 = (java.lang.String) r3
            X.4cX r1 = r0.A0H(r3)
            boolean r1 = X.AnonymousClass000.A1V(r1)
            if (r1 == 0) goto L_0x1012
            X.1Pk r0 = r0.A0u
            if (r0 == 0) goto L_0x1012
            r0.A03(r3)
            return r2
        L_0x09ee:
            X.7lV r4 = r0.A0t
            if (r4 == 0) goto L_0x0ad9
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.C18740tg.A01()
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A01(r4)
            boolean r1 = X.C34681hT.A0T(r3)
            if (r1 == 0) goto L_0x0ad9
            X.C18740tg.A06(r3)
            com.whatsapp.voipcalling.VoipActivityV2.A0u(r3, r4)
            X.6YM r1 = r4.A0r
            if (r1 == 0) goto L_0x0ad9
            boolean r1 = r3.videoEnabled
            if (r1 == 0) goto L_0x0ad9
            boolean r1 = r3.isCallOnHold()
            if (r1 == 0) goto L_0x0a24
            X.711 r3 = r4.A0x
            X.53T r1 = r3.A03
            com.whatsapp.jid.UserJid r1 = r1.A0S()
            if (r1 == 0) goto L_0x0ad9
            X.AnonymousClass711.A02(r3, r1)
            goto L_0x0ad9
        L_0x0a24:
            X.6EE r1 = r3.self
            int r3 = r1.A06
            r1 = 6
            boolean r1 = X.AnonymousClass000.A1S(r3, r1)
            if (r1 != 0) goto L_0x0ad9
            X.711 r1 = r4.A0x
            r1.A06()
            goto L_0x0ad9
        L_0x0a36:
            java.lang.Object r6 = r8.obj
            if (r6 == 0) goto L_0x1012
            X.5po r6 = (X.C119435po) r6
            int r4 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r4 < r3) goto L_0x0a57
            java.lang.String r3 = r6.A01
            X.4cX r3 = r0.A0H(r3)
            boolean r3 = X.AnonymousClass000.A1V(r3)
            if (r3 == 0) goto L_0x0a57
            X.1Pf r5 = r0.A2S
            java.lang.String r4 = r6.A01
            java.lang.String r3 = r6.A00
            r5.A0A(r4, r3)
        L_0x0a57:
            X.7lV r3 = r0.A0t
            if (r3 == 0) goto L_0x0a75
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.7lV r5 = r0.A0t
            java.lang.String r4 = r6.A00
            if (r3 == 0) goto L_0x0a6a
            boolean r3 = r3.videoEnabled
            if (r3 == 0) goto L_0x0a6a
            r1 = 1
        L_0x0a6a:
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r5.A1i = r4
            if (r1 == 0) goto L_0x0a75
            X.711 r1 = r5.A0x
            r1.A05()
        L_0x0a75:
            X.5Fb r3 = r0.A0m
            java.lang.String r1 = r6.A00
            r3.A0B(r1)
            r1 = 13
            X.74i r4 = new X.74i
            r4.<init>(r0, r6, r1)
            goto L_0x0c16
        L_0x0a85:
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x0ad9
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r3 == 0) goto L_0x0ad9
            X.7lV r7 = r0.A0t
            com.whatsapp.voipcalling.VoipActivityV2 r7 = (com.whatsapp.voipcalling.VoipActivityV2) r7
            java.lang.String r1 = r7.A1i
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0ad9
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.VoipActivityV2.A01(r7)
            com.whatsapp.voipcalling.VoipActivityV2.A0s(r6, r7)
            if (r6 == 0) goto L_0x0ad9
            X.6YM r1 = r7.A0r
            r5 = 0
            if (r1 == 0) goto L_0x0aba
            X.6zT r4 = r1.A2E
            int r3 = r4.A00
            java.lang.String r1 = r6.callId
            boolean r1 = r4.A0G(r1)
            if (r1 == 0) goto L_0x0ab6
            r5 = 1
        L_0x0ab6:
            r7.BwZ(r6, r3, r5)
            goto L_0x0ad9
        L_0x0aba:
            r3 = 0
            goto L_0x0ab6
        L_0x0abc:
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x0ad9
            java.lang.String r4 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r4 == 0) goto L_0x0ad9
            X.7lV r3 = r0.A0t
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r1 = r3.A1i
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0ad9
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A01(r3)
            com.whatsapp.voipcalling.VoipActivityV2.A0s(r1, r3)
        L_0x0ad9:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x1012
            goto L_0x1017
        L_0x0ae1:
            com.whatsapp.voipcalling.CallInfo r9 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r9 == 0) goto L_0x1012
            int r5 = r8.arg1
            if (r5 == 0) goto L_0x1012
            r7 = 37
            if (r5 == r2) goto L_0x0b84
            if (r5 == r6) goto L_0x0b5d
            r3 = 3
            if (r5 == r3) goto L_0x0b35
            r3 = 4
            if (r5 == r3) goto L_0x0afb
            java.lang.String r0 = "Unknown state for call waiting"
            goto L_0x0f2c
        L_0x0afb:
            java.lang.Object r3 = r8.obj
            java.lang.String r3 = (java.lang.String) r3
            X.4cX r5 = r0.A0H(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r4 < r3) goto L_0x0b0f
            if (r5 == 0) goto L_0x0b0f
            r3 = 6
            r5.A01(r3)
        L_0x0b0f:
            X.7lV r4 = r0.A0t
            if (r4 == 0) goto L_0x0b2a
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            boolean r3 = r9.isAudioChat()
            if (r3 == 0) goto L_0x0b1e
            r4.finish()
        L_0x0b1e:
            java.lang.String r3 = r9.callId
            r4.A1i = r3
            r4.A1n = r1
            com.whatsapp.voipcalling.VoipActivityV2.A0v(r9, r4)
            com.whatsapp.voipcalling.VoipActivityV2.A0u(r9, r4)
        L_0x0b2a:
            X.5Fb r4 = r0.A0m
            java.lang.String r3 = r9.callId
            r4.A0B(r3)
            A08(r0, r9, r6, r1, r1)
            goto L_0x0b57
        L_0x0b35:
            X.7lV r3 = r0.A0t
            if (r3 == 0) goto L_0x0b57
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            boolean r1 = r9.videoEnabled
            if (r1 == 0) goto L_0x0b57
            X.711 r1 = r3.A0x
            r1.A06()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r3.A0q
            if (r1 == 0) goto L_0x0b57
            X.1hi r1 = r1.A0D
            boolean r1 = X.C36351kA.A1W(r1)
            if (r1 == 0) goto L_0x0b57
            com.whatsapp.calling.screenshare.ScreenShareViewModel r3 = r3.A0q
            X.5Sb r1 = X.C108075Sb.PENDING_CALL_NOTIFICATION
            r3.A0S(r1)
        L_0x0b57:
            android.os.Handler r0 = r0.A0c
            r0.removeMessages(r7)
            return r2
        L_0x0b5d:
            X.3Az r3 = r9.callWaitingInfo
            int r3 = r3.A01
            if (r3 != r2) goto L_0x1012
            X.5Fb r3 = r0.A0m
            r3.A0A(r9)
            X.7lV r5 = r0.A0t
            if (r5 == 0) goto L_0x0b80
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r4 = r9
            java.lang.String r3 = r5.A1i
            if (r3 == 0) goto L_0x0b7d
            boolean r3 = X.C90514aH.A1X(r9, r3)
            if (r3 == 0) goto L_0x0b7d
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r9)
        L_0x0b7d:
            com.whatsapp.voipcalling.VoipActivityV2.A0u(r4, r5)
        L_0x0b80:
            A08(r0, r9, r2, r1, r1)
            return r2
        L_0x0b84:
            X.3Az r5 = r9.callWaitingInfo
            int r5 = r5.A01
            if (r5 != r2) goto L_0x1012
            X.7lV r5 = r0.A0t
            if (r5 == 0) goto L_0x0b97
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r5.A1m = r1
            java.lang.String r1 = "MenuBottomSheet"
            r5.A3q(r1)
        L_0x0b97:
            java.lang.String r1 = r9.callId
            X.4cX r1 = r0.A0H(r1)
            boolean r1 = X.AnonymousClass000.A1V(r1)
            if (r1 == 0) goto L_0x0be4
            long r5 = android.os.SystemClock.elapsedRealtime()
            r0.A0X = r5
            X.3Az r1 = r9.callWaitingInfo
            java.util.List r10 = r1.A06
            boolean r8 = r1.A08
            java.lang.String r6 = r1.A04
            com.whatsapp.jid.GroupJid r5 = r1.A02
            boolean r1 = r1.A09
            r11 = r0
            r12 = r5
            r13 = r6
            r14 = r10
            r15 = r8
            r16 = r1
            boolean r1 = r11.A0p(r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0be4
            r3 = 2000(0x7d0, double:9.88E-321)
            r0.A0T(r3)
        L_0x0bc7:
            android.os.Message r5 = new android.os.Message
            r5.<init>()
            r5.what = r7
            X.3Az r4 = r9.callWaitingInfo
            java.lang.String r1 = r4.A04
            r5.obj = r1
            android.os.Handler r3 = r0.A0c
            int r0 = r4.A00
            if (r0 <= r2) goto L_0x0be0
            r0 = 23000(0x59d8, double:1.13635E-319)
        L_0x0bdc:
            r3.sendMessageDelayed(r5, r0)
            return r2
        L_0x0be0:
            r0 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x0bdc
        L_0x0be4:
            r0.A0X = r3
            r0.A0a(r9)
            goto L_0x0bc7
        L_0x0bea:
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x1012
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x1012
            X.7lV r3 = r0.A0t
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r0 = r3.A1i
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1012
            boolean r0 = r3.A1o
            if (r0 != 0) goto L_0x1012
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A02 = r0
            return r2
        L_0x0c0b:
            java.lang.Object r3 = r8.obj
            java.lang.String r3 = (java.lang.String) r3
            r1 = 31
            X.751 r4 = new X.751
            r4.<init>(r1, r3, r0)
        L_0x0c16:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.A1E
            r0.execute(r4)
            return r2
        L_0x0c1c:
            java.lang.String r3 = "voip/commonHandler/HANDLER_WHAT_RESTORE_AUDIO_ROUTE_AFTER_POTS_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r5 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallState r4 = r5.callState
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 == r3) goto L_0x1012
            X.6zT r3 = r0.A2E
            java.lang.String r0 = "voip/audio_route/restoreAudioRouteAfterPOTSCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0c3e
            r3.A0C(r5, r2)
            r3.A06 = r1
            return r2
        L_0x0c3e:
            r3.A09(r5, r12)
            return r2
        L_0x0c42:
            android.os.Bundle r3 = r8.getData()
            java.lang.String r1 = "participant_jids"
            android.os.Parcelable[] r4 = r3.getParcelableArray(r1)
            com.whatsapp.jid.UserJid[] r4 = (com.whatsapp.jid.UserJid[]) r4
            android.os.Bundle r3 = r8.getData()
            java.lang.String r1 = "audio_levels"
            int[] r3 = r3.getIntArray(r1)
            if (r4 == 0) goto L_0x1012
            if (r3 == 0) goto L_0x1012
            X.5Fb r1 = r0.A0m
            java.util.Iterator r0 = X.C36361kB.A0s(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1012
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x0c6c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r1)
            r0.BcF(r4, r3)
            goto L_0x0c6c
        L_0x0c7a:
            java.lang.Object r5 = r8.obj
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.5Fb r1 = r0.A0m
            java.util.Iterator r0 = X.C36361kB.A0s(r1)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1012
            com.whatsapp.voipcalling.CallInfo r4 = X.C105545Fb.A02(r1, r12)
            if (r4 == 0) goto L_0x1012
            java.util.Iterator r3 = X.C36361kB.A0s(r1)
        L_0x0c94:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r1 = X.C90524aI.A0K(r3)
            boolean r0 = r4.videoEnabled
            r1.BbH(r5, r0)
            goto L_0x0c94
        L_0x0ca4:
            java.lang.Object r4 = r8.obj
            com.whatsapp.voipcalling.CallLinkInfo r4 = (com.whatsapp.voipcalling.CallLinkInfo) r4
            int r9 = r8.arg1
            X.C18740tg.A01()
            int r3 = r4.linkState
            r8 = 3
            r7 = 4
            if (r3 != 0) goto L_0x0ce1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "callLinkStateChangedOnUiThread to NONE. oldLinkState: "
            X.C36321k7.A1T(r3, r4, r9)
            com.whatsapp.fieldstats.events.WamCall r5 = r0.A0x
            if (r5 == 0) goto L_0x0ccb
            if (r9 == r8) goto L_0x0cc4
            if (r9 != r7) goto L_0x0ccb
        L_0x0cc4:
            X.6Mm r4 = r0.A2T
            boolean r3 = r0.A1V
            r4.A01(r5, r3)
        L_0x0ccb:
            if (r9 != r7) goto L_0x0cdd
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.LINK
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0D(r4, r3)
            r0.A1L = r1
        L_0x0cd8:
            r0.A0q = r12
            r0.A0p = r12
            return r2
        L_0x0cdd:
            r0.A0L()
            goto L_0x0cd8
        L_0x0ce1:
            if (r3 != r2) goto L_0x0cfe
            if (r9 != 0) goto L_0x0d11
            android.content.Context r7 = r0.A22
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r4.videoEnabled
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r11 = r10
            android.content.Intent r0 = X.AnonymousClass190.A0z(r7, r8, r9, r10, r11, r12)
            r7.startActivity(r0)
            return r2
        L_0x0cfe:
            if (r3 != r6) goto L_0x0d11
            if (r9 != r2) goto L_0x0d11
            com.whatsapp.jid.UserJid r1 = r4.creatorJid
            X.C18740tg.A06(r1)
        L_0x0d07:
            X.5Fb r1 = r0.A0m
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallLinkInfoToCallInfo(r4)
            r1.A0A(r0)
            return r2
        L_0x0d11:
            if (r9 == r2) goto L_0x0d43
            if (r9 == r6) goto L_0x0d43
            if (r9 != r8) goto L_0x1012
            if (r3 != r7) goto L_0x1012
            r0.A1L = r2
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r1) goto L_0x1012
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C18740tg.A06(r4)
            X.5Fb r3 = r0.A0m
            java.lang.String r1 = r4.callId
            r3.A0B(r1)
            com.whatsapp.jid.UserJid r6 = X.C90494aF.A0M(r4)
            boolean r3 = r4.videoEnabled
            java.lang.String r1 = r4.callId
            r8 = 0
            r10 = 1
            r4 = r0
            r5 = r12
            r7 = r1
            r9 = r3
            r4.A0X(r5, r6, r7, r8, r9, r10)
            return r2
        L_0x0d43:
            if (r3 != r8) goto L_0x1012
            goto L_0x0d07
        L_0x0d46:
            java.lang.Object r6 = r8.obj
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.5Fb r3 = r0.A0m
            java.util.Iterator r1 = X.C36361kB.A0s(r3)
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L_0x0e11
            com.whatsapp.voipcalling.CallInfo r5 = X.C105545Fb.A02(r3, r12)
            if (r5 == 0) goto L_0x0e11
            java.util.Iterator r4 = X.C36361kB.A0s(r3)
        L_0x0d60:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0e11
            X.7m5 r3 = X.C90524aI.A0K(r4)
            boolean r1 = r5.videoEnabled
            r3.BbG(r6, r1)
            goto L_0x0d60
        L_0x0d70:
            int r3 = r8.arg1
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r0.A0l(r1, r3)
            r1 = 25
            r0.A0R(r1, r12)
            return r2
        L_0x0d7f:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x1012
            X.5Fb r0 = r0.A0m
            X.C105545Fb.A03(r0, r1, r2)
            return r2
        L_0x0d8b:
            int r3 = r8.arg1
            if (r3 != r2) goto L_0x0d90
            r1 = 1
        L_0x0d90:
            com.whatsapp.voipcalling.CallInfo r12 = com.whatsapp.voipcalling.Voip.getCallInfo()
            java.lang.Object r7 = r8.obj
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.C18740tg.A06(r7)
            X.5Fb r6 = r0.A0m
            java.util.Iterator r0 = X.C36361kB.A0s(r6)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0e13
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r5 = X.C105545Fb.A02(r6, r0)
            if (r5 == 0) goto L_0x0e13
            java.util.Iterator r4 = X.C36361kB.A0s(r6)
        L_0x0db2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0e13
            X.7m5 r3 = X.C90524aI.A0K(r4)
            boolean r0 = r5.videoEnabled
            r3.Bed(r7, r0, r1)
            goto L_0x0db2
        L_0x0dc2:
            java.lang.Object r7 = r8.obj
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            int r3 = r8.arg1
            if (r3 != r2) goto L_0x0dcb
            r1 = 1
        L_0x0dcb:
            X.C18740tg.A06(r7)
            X.5Fb r4 = r0.A0m
            java.util.Iterator r3 = X.C36361kB.A0s(r4)
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L_0x0e11
            com.whatsapp.voipcalling.CallInfo r6 = X.C105545Fb.A02(r4, r12)
            if (r6 == 0) goto L_0x0e11
            java.util.Iterator r5 = X.C36361kB.A0s(r4)
        L_0x0de4:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0e11
            X.7m5 r4 = X.C90524aI.A0K(r5)
            boolean r3 = r6.videoEnabled
            r4.Bea(r7, r3, r1)
            goto L_0x0de4
        L_0x0df4:
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x0e11
            java.lang.String r4 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r4 == 0) goto L_0x0e11
            X.7lV r3 = r0.A0t
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r1 = r3.A1i
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0e11
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A01(r3)
            com.whatsapp.voipcalling.VoipActivityV2.A0s(r1, r3)
        L_0x0e11:
            X.5Fb r6 = r0.A0m
        L_0x0e13:
            r6.A0A(r12)
            return r2
        L_0x0e17:
            int r5 = r8.arg1
            java.lang.Object r4 = r8.obj
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_CLEAN_UP_SELF_MANAGED_CONNECTION disconnectCause="
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = ", callId="
            X.C36321k7.A1Q(r1, r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r3 < r1) goto L_0x1012
            X.4cX r0 = r0.A0H(r4)
            if (r0 == 0) goto L_0x1012
            r0.A01(r5)
            return r2
        L_0x0e3e:
            int r5 = r8.arg1
            java.lang.Object r4 = r8.obj
            java.lang.String r4 = (java.lang.String) r4
            if (r5 == 0) goto L_0x0e47
            r1 = 1
        L_0x0e47:
            java.lang.String r3 = "voiceservice/end call with dialog/ Reason not set"
            X.C18740tg.A0D(r1, r3)
            X.1aM r1 = r0.A2C
            com.whatsapp.voipcalling.CallInfo r1 = X.C34681hT.A03(r1)
            A0A(r0, r1, r4, r5)
            return r2
        L_0x0e56:
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x1012
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r1 = r1.A1u
            if (r1 != 0) goto L_0x1012
            java.lang.String r3 = "default"
            java.lang.String r1 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.72i r0 = new X.72i
            r0.<init>(r3)
        L_0x0e6e:
            r1.execute(r0)
            return r2
        L_0x0e72:
            java.lang.Object r5 = r8.obj
            X.C18740tg.A06(r5)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            int r1 = r8.arg1
            if (r1 != r2) goto L_0x0e8b
            X.7lV r3 = r0.A0t
            if (r3 == 0) goto L_0x1012
            X.14p r3 = (X.C224914p) r3
            X.0wU r1 = r3.A04
            r0 = 11
            X.C1498172w.A02(r1, r3, r5, r0)
            return r2
        L_0x0e8b:
            X.5Fb r0 = r0.A0m
            X.6OZ r4 = r0.A05()
            java.util.Iterator r3 = X.C36361kB.A0s(r0)
        L_0x0e95:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r1 = X.C90524aI.A0K(r3)
            boolean r0 = r4.A0N
            r1.Bk9(r5, r0)
            goto L_0x0e95
        L_0x0ea5:
            java.lang.Object r9 = r8.obj
            X.C18740tg.A06(r9)
            X.6CG r9 = (X.AnonymousClass6CG) r9
            X.0wQ r3 = r0.A29
            com.whatsapp.jid.UserJid r4 = r9.A03
            boolean r3 = r3.A0M(r4)
            if (r3 == 0) goto L_0x0ecc
            int r3 = r9.A02
            if (r3 != r2) goto L_0x0ebb
            r1 = 1
        L_0x0ebb:
            r0.A1O = r1
            if (r1 != 0) goto L_0x0ecc
            X.7lV r1 = r0.A0t
            if (r1 == 0) goto L_0x0ec9
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r1 = r1.A1u
            if (r1 != 0) goto L_0x0ecc
        L_0x0ec9:
            com.whatsapp.voipcalling.Voip.stopVideoCaptureStream()
        L_0x0ecc:
            X.5Fb r7 = r0.A0m
            java.util.Iterator r0 = X.C36361kB.A0s(r7)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x1012
            int r8 = r9.A00
            r1 = 0
            r10 = 1
            if (r8 != r2) goto L_0x0f11
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0f11
            X.0wQ r0 = r7.A07
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x0f11
            r7.A02 = r2
            X.0yC r3 = r7.A08
            r0 = 3207(0xc87, float:4.494E-42)
            int r3 = r3.A07(r0)
            if (r3 <= 0) goto L_0x0f11
            r0 = 1
            if (r3 != r2) goto L_0x0efa
            r0 = 0
        L_0x0efa:
            X.3XF r5 = new X.3XF
            r5.<init>(r0, r2)
            java.util.Iterator r3 = X.C36361kB.A0s(r7)
        L_0x0f03:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0f11
            X.7m5 r0 = X.C90524aI.A0K(r3)
            r0.BS1(r5)
            goto L_0x0f03
        L_0x0f11:
            X.13J r0 = r7.A0A
            boolean r0 = r0.BN6()
            if (r0 == 0) goto L_0x1012
            int r5 = r9.A02
            if (r5 == r2) goto L_0x0f6f
            r0 = 3
            if (r5 == r6) goto L_0x0f3a
            if (r5 == r0) goto L_0x0f30
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CallDatasource/Unsupported screen share state: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r3, r5)
        L_0x0f2c:
            X.C18740tg.A0D(r1, r0)
            return r2
        L_0x0f30:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Screen share failed for "
            X.C36321k7.A1K(r4, r0, r1)
            return r2
        L_0x0f3a:
            if (r8 == r6) goto L_0x0f3f
            if (r8 == r0) goto L_0x0f3f
            r10 = 0
        L_0x0f3f:
            X.0wQ r0 = r7.A07
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x0f5b
            if (r10 == 0) goto L_0x0f5b
            java.util.Iterator r3 = X.C36361kB.A0s(r7)
        L_0x0f4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0f5b
            X.7m5 r0 = X.C90524aI.A0K(r3)
            r0.Bfr(r8)
            goto L_0x0f4d
        L_0x0f5b:
            if (r8 == r6) goto L_0x1012
            java.util.Iterator r3 = X.C36361kB.A0s(r7)
        L_0x0f61:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r3)
            r0.Bfs(r4, r1, r1)
            goto L_0x0f61
        L_0x0f6f:
            int r0 = r9.A01
            if (r0 < r6) goto L_0x0f74
            r1 = 1
        L_0x0f74:
            java.util.Iterator r3 = X.C36361kB.A0s(r7)
        L_0x0f78:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r3)
            r0.Bfs(r4, r2, r1)
            goto L_0x0f78
        L_0x0f86:
            java.lang.Object r5 = r8.obj
            X.C18740tg.A06(r5)
            X.6DW r5 = (X.AnonymousClass6DW) r5
            int r8 = r5.A01
            int r7 = r5.A00
            if (r8 == r7) goto L_0x1012
            if (r7 != r6) goto L_0x0fac
            boolean r1 = r5.A03
            if (r1 == 0) goto L_0x0fac
            X.0yC r3 = r0.A2t
            r1 = 4439(0x1157, float:6.22E-42)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x0fac
            java.lang.Integer r4 = r0.A1X
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "poorNetwork"
            r0.A0e(r4, r1, r3, r3)
        L_0x0fac:
            X.5Fb r4 = r0.A0m
            boolean r1 = X.C36381kD.A1U(r8, r7)
            java.lang.String r0 = "Method should only be called when the network health state changes"
            X.C18740tg.A0D(r1, r0)
            X.0yC r1 = r4.A08
            r0 = 3807(0xedf, float:5.335E-42)
            int r0 = r1.A07(r0)
            if (r0 <= 0) goto L_0x1012
            X.6OZ r0 = r4.A05()
            boolean r3 = r0.A0N
            java.util.Iterator r1 = X.C36361kB.A0s(r4)
        L_0x0fcb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r1)
            r0.BbU(r5, r3)
            goto L_0x0fcb
        L_0x0fd9:
            X.5Fb r1 = r0.A0m
            X.6OZ r0 = r1.A05()
            boolean r3 = r0.A0N
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x0fe5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1012
            X.7m5 r0 = X.C90524aI.A0K(r1)
            r0.BYw(r3)
            goto L_0x0fe5
        L_0x0ff3:
            java.lang.String r1 = "voip/commonHandler/HANDLER_WHAT_OFFLINE_COMPLETE"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            long r5 = r0.A0X
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x1012
            android.os.Handler r1 = r0.A0c
            boolean r1 = r1.hasMessages(r2)
            if (r1 == 0) goto L_0x1012
            android.os.Handler r1 = r0.A0c
            r1.removeMessages(r2)
        L_0x100b:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r0.A0a(r1)
        L_0x1012:
            return r2
        L_0x1013:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
        L_0x1017:
            X.5Fb r0 = r0.A0m
            r0.A0A(r1)
            return r2
        L_0x101d:
            X.1ND r4 = r0.A2G
            java.lang.Object r3 = r8.obj
            X.C18740tg.A06(r3)
            X.5Nh r3 = (X.C107265Nh) r3
            android.content.Context r0 = r0.A22
            X.1NE r4 = (X.AnonymousClass1NE) r4
            r4.BNr(r0, r3, r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0o(android.os.Message):boolean");
    }

    public boolean A0q(C107265Nh r4) {
        C20810yC r1 = this.A2t;
        if (r1.A0E(3675) || C34681hT.A0B(this.A29, r1) || r4.A08 == 2) {
            return true;
        }
        return false;
    }

    private void A02() {
        A06(this);
        C18740tg.A01();
        try {
            if (this.A0g != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0g.release();
                this.A0g = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            this.A0g = null;
        }
    }

    public static void A06(AnonymousClass6YM r4) {
        C18740tg.A01();
        try {
            if (r4.A0h != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                r4.A0h.release();
                r4.A0h = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            r4.A0h = null;
        }
        if (C20800yB.A01(C21000yV.A01, r4.A2t, 6747)) {
            C19930wk r1 = r4.A10;
            if (r1 == null) {
                r1 = C36411kG.A0r(r4.A36);
                r4.A10 = r1;
            }
            r1.A02();
            C1501574e.A00(r1, r4, 31);
        } else {
            r4.A0w.A00((AnonymousClass7gH) null);
        }
        r4.A1I = false;
    }

    public static void A07(AnonymousClass6YM r2, DeviceJid deviceJid, boolean z) {
        r2.A2O.maybeSendPendingOffer(deviceJid, Voip.getCurrentCallId());
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r2.A1E;
        if (scheduledThreadPoolExecutor != null) {
            try {
                scheduledThreadPoolExecutor.execute(new AnonymousClass75B(18, (Object) deviceJid, z));
            } catch (RejectedExecutionException unused) {
                Log.w("voip/handleDeviceBecomesInvalid: executor shutdown");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r13.A1J == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.AnonymousClass6YM r13, com.whatsapp.voipcalling.CallInfo r14, int r15, boolean r16, boolean r17) {
        /*
            X.C18740tg.A01()
            if (r14 == 0) goto L_0x00e2
            boolean r0 = r14.callEnding
            if (r0 != 0) goto L_0x00e2
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x00e2
            X.3Az r0 = r14.callWaitingInfo
            int r0 = r0.A01
            r4 = 0
            r3 = 1
            r5 = 1
            if (r0 == r3) goto L_0x0027
            r5 = 0
            X.1PW r0 = r13.A2R
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0035
            boolean r0 = r13.A1J
            if (r0 != 0) goto L_0x0035
        L_0x0027:
            r4 = 1
            X.1NF r2 = r13.A2K
            if (r5 == 0) goto L_0x00de
            X.3Az r0 = r14.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x0030:
            java.lang.String r0 = "build_voip_notification"
            r2.A03(r1, r0)
        L_0x0035:
            boolean r1 = r13.A1P
            r0 = -1
            X.3OE r8 = X.AnonymousClass3OE.A00(r14, r0, r1)
            X.3U0 r6 = r13.A2J
            android.content.Context r7 = r13.A22
            r2 = 0
            X.1PW r9 = r13.A2R
            boolean r11 = r13.A1K
            r10 = r15
            android.app.Notification r12 = r6.A06(r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x005a
            X.1NF r4 = r13.A2K
            java.lang.String r1 = r8.A05
            java.lang.String r0 = "start_foreground_service"
            r4.A03(r1, r0)
            if (r5 == 0) goto L_0x005a
            r4.A01(r1)
        L_0x005a:
            boolean r0 = r13.A1K
            r4 = 23
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "VoiceService/startForegroundService Background restrictions on"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Fq r0 = r13.A2i
            r0.A02(r4, r12)
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            if (r1 != 0) goto L_0x0074
            com.whatsapp.jid.UserJid r1 = r14.getCreatorJid()
            if (r1 == 0) goto L_0x0079
        L_0x0074:
            X.1NM r0 = r13.A2e
            r0.A0B(r1, r2)
        L_0x0079:
            r13.A1J = r3
        L_0x007b:
            return
        L_0x007c:
            X.0yC r1 = r13.A2t
            r0 = 7070(0x1b9e, float:9.907E-42)
            boolean r0 = r1.A0E(r0)
            r15 = r16
            r1 = r17
            if (r0 == 0) goto L_0x00bc
            X.0wk r0 = r13.A0z
            if (r0 != 0) goto L_0x0097
            X.0wU r2 = r13.A36
            X.0wk r0 = new X.0wk
            r0.<init>(r2, r3)
            r13.A0z = r0
        L_0x0097:
            X.76r r11 = new X.76r
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            X.Acc r3 = new X.Acc
            r3.<init>(r11)
            X.6no r2 = new X.6no
            r2.<init>(r8, r13, r14, r10)
            X.0wk r1 = r13.A0z
            java.util.Objects.requireNonNull(r2)
            r0 = 25
            X.74N r0 = X.AnonymousClass74N.A00(r2, r3, r0)
            r3.B0P(r0, r1)
            X.0wk r0 = r13.A0z
            r0.execute(r3)
            return
        L_0x00bc:
            boolean r0 = r14.videoEnabled
            boolean r0 = A0E(r12, r13, r15, r0, r1)
            if (r0 != 0) goto L_0x007b
            r11 = 1
            android.app.Notification r1 = r6.A06(r7, r8, r9, r10, r11)
            X.1Fq r0 = r13.A2i
            r0.A02(r4, r1)
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            if (r1 != 0) goto L_0x00d8
            com.whatsapp.jid.UserJid r1 = r14.getCreatorJid()
            if (r1 == 0) goto L_0x0079
        L_0x00d8:
            X.1NM r0 = r13.A2e
            r0.A0B(r1, r2)
            goto L_0x0079
        L_0x00de:
            java.lang.String r1 = r14.callId
            goto L_0x0030
        L_0x00e2:
            java.lang.String r0 = "do not create notification, we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A08(X.6YM, com.whatsapp.voipcalling.CallInfo, int, boolean, boolean):void");
    }

    private void A0D(CallState callState, CallInfo callInfo) {
        String str;
        int A002;
        PowerManager.WakeLock A003;
        C36321k7.A1K(this, "voip/service/stop ", AnonymousClass000.A0u());
        C18740tg.A01();
        synchronized (this) {
            AnonymousClass1PW r1 = this.A2R;
            if (r1.A03.get()) {
                Context context = r1.A01.A00;
                AnonymousClass1MM r12 = r1.A02;
                Log.i("voicefgservice/stop-service");
                r12.A01(context, VoiceFGService.class);
            }
            if (this.A1J) {
                Log.i("VoiceService/stopForegroundService cancel via waNotificationManager");
                this.A2i.A03(23, "VoiceService4");
                this.A1J = false;
            }
        }
        if (callInfo != null) {
            this.A2i.A04(51, callInfo.callId, "lonelyStateNotification");
        }
        if (this.A1S) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A1S = false;
            C108905Vk.A00 = false;
            C20810yC r7 = this.A2t;
            if (C34681hT.A0R(r7, false)) {
                C36341k9.A0u(C90474aD.A0F(this.A2D), "e2ee_shown_for_callid");
            }
            this.A0X = 0;
            this.A07 = null;
            this.A0D = false;
            this.A1I = false;
            this.A1P = false;
            this.A3S = null;
            this.A3T = null;
            this.A0x = null;
            this.A0M = null;
            this.A03 = null;
            this.A13 = 1500;
            AnonymousClass6XR r8 = this.A2P;
            r8.A02 = null;
            this.A04 = null;
            this.A17 = null;
            this.A1G = false;
            this.A0s = null;
            this.A0o = null;
            this.A0r = null;
            this.A0q = null;
            this.A0p = null;
            this.A1B = null;
            this.A1A = null;
            this.A1V = true;
            this.A16 = null;
            this.A14 = null;
            this.A0E = false;
            this.A0T = 0;
            this.A0I = false;
            this.A1F = 0;
            this.A0S = 0;
            this.A3R = 0;
            this.A2O.pendingCallOfferStanza = null;
            this.A1z.clear();
            this.A3F.clear();
            this.A2U.A03.A01.clear();
            this.A3E.clear();
            this.A0K = false;
            this.A1H = false;
            AnonymousClass63T r9 = this.A3J;
            r9.A02 = 0;
            r9.A01 = Double.NaN;
            r9.A00 = Double.NaN;
            this.A00 = 0;
            this.A0Y = 0;
            this.A0W = -1;
            this.A0V = -1;
            A03(this);
            this.A06 = null;
            this.A08 = null;
            this.A0L = false;
            this.A05 = null;
            this.A0H = false;
            this.A15 = null;
            this.A0U = 0;
            this.A0G = false;
            this.A1L = false;
            this.A3K.clear();
            this.A1N = false;
            this.A1D.clear();
            this.A3U = false;
            C27701Pj r13 = this.A1n;
            r13.A03.clear();
            r13.A04.clear();
            this.A18 = null;
            this.A19 = null;
            ((AnonymousClass1NE) this.A2G).A01 = null;
            TelephonyManager telephonyManager = this.A23;
            if (telephonyManager == null) {
                Log.w("voip/service/stop telephonyManager=null");
            } else if (!this.A2j.A0G()) {
                telephonyManager.listen(this.A0i, 0);
            }
            Context context2 = this.A22;
            context2.unregisterReceiver(this.A0Z);
            C148816zT r2 = this.A2E;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("voip/audio_route/onCallStop using telecom:");
            C36331k8.A1S(A0u2, r2.A05);
            if (!r2.A05) {
                r2.A0A.A01();
                r2.A0G.A05(r2);
                r2.A08.unregisterReceiver(r2.A0B);
            }
            r2.A03 = false;
            context2.unregisterReceiver(this.A0a);
            A04(this);
            A02();
            try {
                PowerManager A0G2 = this.A2g.A0G();
                if (A0G2 == null) {
                    Log.w("voice/service/turn-on-screen pm=null");
                } else if (!A0G2.isScreenOn() && (A003 = C111765co.A00(A0G2, "VoiceService end call", 268435466)) != null) {
                    A003.acquire(1);
                    A003.release();
                }
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
            r8.A06();
            if (this.A01 == null || !((callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) && callInfo != null && callInfo.callWaitingInfo.A01 == 0)) {
                r2.A05();
            } else {
                if (this.A1Q) {
                    A002 = C27631Pa.A00(this.A2D).getInt("end_call_tone_duration_ms", 500);
                } else {
                    A002 = C34681hT.A00(context2);
                    if (A002 <= 0) {
                        A002 = 500;
                    }
                }
                C36321k7.A1T("voip/service/playEndCallTone duration: ", AnonymousClass000.A0u(), A002);
                int i = r2.A00;
                float f = 0.5f;
                if (i == 2) {
                    f = 1.0f;
                }
                A0e(this.A1Y, "endCall", f, f);
                this.A0e.removeMessages(1);
                this.A0e.sendEmptyMessageDelayed(1, (long) (A002 + 100));
            }
            this.A0d.removeCallbacksAndMessages((Object) null);
            this.A1v.A00(C36371kC.A07(r7.A07(5938)));
            A0L();
            long A0J2 = C90514aH.A0J(elapsedRealtime);
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("voip/service/stop elapsed ");
            A0u3.append(A0J2);
            C36321k7.A1a(A0u3, " ms");
            if (4 <= Log.level) {
                StringBuilder A0v2 = AnonymousClass000.A0v("voip/service/stop");
                A0v2.append("/total threads count = ");
                Log.log(4, C36381kD.A10(A0v2, Thread.activeCount()));
            }
            boolean z = this.A0J;
            C21380z9 r14 = this.A3O;
            if (z) {
                str = "video_call";
            } else {
                str = "voice_call";
            }
            r14.A01(str, false);
            this.A2I.A02.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ X.AnonymousClass0AJ A0I(com.whatsapp.jid.GroupJid r10, X.C107265Nh r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.util.List r15, com.whatsapp.voipcalling.CallParticipantJid[] r16, int r17, boolean r18, boolean r19) {
        /*
            r9 = this;
            int r3 = r12.intValue()
            r2 = 0
            r7 = r16
            if (r3 != 0) goto L_0x0096
            X.0yC r0 = r9.A2t
            boolean r0 = X.C34681hT.A0K(r0)
            r1 = 1
            r4 = r18
            if (r0 == 0) goto L_0x004a
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r10 != 0) goto L_0x004a
            int r0 = r7.length
            if (r0 <= r1) goto L_0x004a
            if (r11 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0024
            X.AnonymousClass6Ts.A01(r3, r11)
        L_0x0024:
            X.1HJ r0 = r9.A2o
            r0.A09(r11)
            if (r17 > 0) goto L_0x0057
            X.005 r0 = r9.A3A
            java.lang.Object r8 = r0.get()
            X.6X4 r8 = (X.AnonymousClass6X4) r8
            r0.get()
            X.00T r0 = X.AnonymousClass6X4.A0E
            int r6 = r7.length
            java.util.ArrayList r5 = X.C36441kJ.A14(r6)
            r3 = 0
        L_0x003e:
            if (r3 >= r6) goto L_0x005a
            r0 = r16[r3]
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x003e
        L_0x004a:
            if (r11 == 0) goto L_0x0063
            if (r10 == 0) goto L_0x0024
            X.6Ts r0 = r9.A2L
            r0.A05(r10, r11, r13)
            r0.A06(r10, r11, r13, r4)
            goto L_0x0024
        L_0x0057:
            r9.A18 = r14
            goto L_0x0063
        L_0x005a:
            java.util.Set r3 = X.C007103b.A0f(r5)
            X.5SD r0 = X.AnonymousClass5SD.ADD_ONLY
            r8.A08(r0, r11, r3)
        L_0x0063:
            r8 = r15
            if (r18 != 0) goto L_0x0080
            android.content.Context r3 = r9.A22
            X.0zA r0 = r9.A25
            boolean r0 = r0.A00
            java.lang.Boolean r4 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r7 = r6
            android.content.Intent r0 = X.AnonymousClass190.A0z(r3, r4, r5, r6, r7, r8)
            r3.startActivity(r0)
        L_0x0080:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r9.A1E
            r1 = 34
            X.74l r0 = new X.74l
            r0.<init>(r9, r15, r14, r1)
            r3.execute(r0)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r1 = 2
            r0 = 0
            A08(r9, r3, r1, r0, r0)
            return r2
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall failed to start call "
            X.C36321k7.A1Q(r0, r14, r1)
            if (r11 == 0) goto L_0x00da
            X.0yC r0 = r9.A2t
            boolean r0 = X.C34681hT.A0K(r0)
            if (r0 == 0) goto L_0x00da
            r0 = 7
            r11.A0F(r0)
            X.1HJ r0 = r9.A2o
            r0.A09(r11)
            X.005 r0 = r9.A3A
            java.lang.Object r6 = r0.get()
            X.6X4 r6 = (X.AnonymousClass6X4) r6
            r0.get()
            X.00T r0 = X.AnonymousClass6X4.A0E
            int r5 = r7.length
            java.util.ArrayList r4 = X.C36441kJ.A14(r5)
            r1 = 0
        L_0x00c5:
            if (r1 >= r5) goto L_0x00d1
            r0 = r16[r1]
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x00c5
        L_0x00d1:
            java.util.Set r1 = X.C007103b.A0f(r4)
            X.5SD r0 = X.AnonymousClass5SD.ADD_ONLY
            r6.A08(r0, r11, r1)
        L_0x00da:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00eb
            X.4cX r1 = r9.A0H(r14)
            if (r1 == 0) goto L_0x00eb
            r0 = 9
            r1.A01(r0)
        L_0x00eb:
            r0 = 670001(0xa3931, float:9.38871E-40)
            if (r3 == r0) goto L_0x00f5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r9.A0D(r0, r2)
        L_0x00f5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0I(com.whatsapp.jid.GroupJid, X.5Nh, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, com.whatsapp.voipcalling.CallParticipantJid[], int, boolean, boolean):X.0AJ");
    }

    public void A0M() {
        Looper mainLooper;
        C001600r r0;
        C36321k7.A1K(this, "voip/service/create ", AnonymousClass000.A0u());
        C20810yC r8 = this.A2t;
        if (C20800yB.A01(C21000yV.A01, r8, 4934)) {
            HandlerThread handlerThread = new HandlerThread("voip-periodic-update");
            this.A0f = handlerThread;
            handlerThread.start();
            mainLooper = this.A0f.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0d = new C91654cO(mainLooper, this);
        this.A0b = new Handler(new C163797qm(this, 5));
        this.A0e = new Handler(new C163797qm(this, 6));
        this.A0c = new Handler(new C163797qm(this, 7));
        C19770wU r9 = this.A36;
        AnonymousClass79U r02 = new AnonymousClass79U((C19780wV) r9, new AnonymousClass77G("VoIP Signaling Thread"), 1);
        r02.allowCoreThreadTimeOut(false);
        this.A1E = r02;
        int A072 = r8.A07(3784);
        if (A072 > 0) {
            C132356Tf r3 = new C132356Tf(this.A26, (C29301Wc) null, this.A2h, (AnonymousClass12P) null, r8, r9, (Runnable) null, (long) (A072 * 1000));
            this.A11 = r3;
            r3.A03("voip-signaling-thread", this.A1E);
            this.A11.A01();
        }
        C21060yb r15 = this.A2g;
        this.A0w = new C1260962n(r15);
        this.A0i = new C91744cY(this);
        this.A0Z = new C162357oS(this, 2);
        this.A0a = new C162357oS(this, 3);
        this.A0v = new C164857sU(this, 1);
        C148816zT r4 = this.A2E;
        Log.i("voip/audio_route/init");
        r4.A0G.A02 = AnonymousClass001.A0F(r4);
        if (C148816zT.A0L) {
            r4.A0E.A08(r4.A0D);
        }
        C122365uj r03 = this.A1d;
        C18740tg.A01();
        AnonymousClass04S r32 = r03.A01;
        if (r32 != null) {
            C114235gt r04 = r03.A00;
            if (r04 == null) {
                r0 = C36441kJ.A0Z(C36381kD.A0m());
            } else {
                r0 = r04.A00;
            }
            r0.A0A(r32);
        }
        VoipCameraManager voipCameraManager = this.A39;
        Context context = this.A22;
        C30531aM r12 = this.A2C;
        voipCameraManager.setCaptureDeviceFactory(new C1493470w(context, r12, this.A1j, this.A1k, r15, r8, this.A35));
        AnonymousClass6WM r42 = this.A2U;
        r42.A05.registerObserver(r42.A04);
        r42.A01.registerObserver(r42.A00);
        r42.A0A.registerObserver(r42.A09);
        this.A32.registerObserver(this.A31);
        C142506oz r33 = new C142506oz(this);
        this.A0k = r33;
        this.A2B.registerObserver(r33);
        C148336yh r34 = new C148336yh(this);
        this.A0y = r34;
        this.A2z.registerObserver(r34);
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass53O A0F2 = A0F();
            this.A0u = A0F2;
            this.A2S.A08(A0F2);
        } else {
            this.A0u = null;
        }
        Voip.setVoipStackLogLevel(r8.A07(4028));
        Voip.nativeRegisterJNIUtils(this.A38);
        Voip.nativeRegisterEventCallback(this.A2Q);
        if (Voip.A00 == null) {
            DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A29);
            Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
            Voip.A00 = defaultCryptoCallback;
        }
        OutgoingSignalingHandler outgoingSignalingHandler = this.A2O;
        Voip.nativeRegisterSignalingXmppCallback(outgoingSignalingHandler);
        Voip.A02 = outgoingSignalingHandler;
        if (Build.VERSION.SDK_INT >= 22) {
            AnonymousClass6VN r05 = new AnonymousClass6VN(r15.A0E(), r12);
            this.A0l = r05;
            r05.A04();
        } else {
            this.A0l = null;
        }
        Voip.setEnableAudioEffectAvailabilityCache(r8.A0E(4247));
        C20810yC r35 = this.A2W.A00;
        if (r35.A0E(4349) && r35.A07(4872) == 1) {
            C1501574e.A01(r9, this, 30);
        }
        Log.i("voip/service/created");
    }

    public void A0N() {
        AnonymousClass6VN r0;
        C001600r r02;
        C36321k7.A1K(this, "voip/service/destroy ", AnonymousClass000.A0u());
        try {
            this.A2P.A06();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        A0J();
        SoundPool soundPool = this.A01;
        if (soundPool != null) {
            this.A1Y = null;
            this.A1X = null;
            if (this.A2t.A0E(6569)) {
                C19770wU r1 = this.A36;
                Objects.requireNonNull(soundPool);
                C1501574e.A01(r1, soundPool, 35);
            } else {
                soundPool.release();
            }
            this.A01 = null;
        }
        this.A39.setCaptureDeviceFactory((AnonymousClass7dI) null);
        C148816zT r2 = this.A2E;
        Log.i("voip/audio_route/deinit");
        r2.A02 = true;
        if (C148816zT.A0L) {
            r2.A0E.A09(r2.A0D);
        }
        r2.A0G.A02 = null;
        C122365uj r03 = this.A1d;
        C18740tg.A01();
        AnonymousClass04S r12 = r03.A01;
        if (r12 != null) {
            C114235gt r04 = r03.A00;
            if (r04 == null) {
                r02 = C36441kJ.A0Z(C36381kD.A0m());
            } else {
                r02 = r04.A00;
            }
            r02.A0B(r12);
        }
        A02();
        if (Build.VERSION.SDK_INT >= 22 && (r0 = this.A0l) != null) {
            r0.A03();
            this.A0l = null;
        }
        Voip.nativeUnregisterJNIUtils();
        Voip.nativeUnregisterEventCallback();
        Voip.nativeUnregisterSignalingXmppCallback();
        Voip.A02 = null;
        AnonymousClass6WM r22 = this.A2U;
        r22.A05.unregisterObserver(r22.A04);
        r22.A01.unregisterObserver(r22.A00);
        r22.A0A.unregisterObserver(r22.A09);
        this.A32.unregisterObserver(this.A31);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A1E;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdown();
            this.A1E = null;
            C132356Tf r13 = this.A11;
            if (r13 != null) {
                synchronized (r13) {
                    r13.A05.clear();
                    r13.A06.clear();
                    r13.A04.clear();
                    r13.A07.clear();
                }
                this.A11 = null;
            }
        }
        C19930wk r05 = this.A0z;
        if (r05 != null) {
            r05.A02();
            this.A0z = null;
        }
        HandlerThread handlerThread = this.A0f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A0f = null;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/service/destroyed pendingCommands: ");
        List<C132636Up> list = this.A3Q;
        C36321k7.A1Y(A0u2, list.size());
        for (C132636Up A002 : list) {
            this.A2R.A00(A002);
        }
        list.clear();
        if (Build.VERSION.SDK_INT >= 28 && this.A0u != null) {
            C27671Pf r23 = this.A2S;
            C18740tg.A0D(AnonymousClass000.A1Q(r23.A01()), "Self managed connections are not disconnected when VoiceService is being destroyed");
            r23.A05();
            r23.A09(this.A0u);
            this.A0u = null;
        }
        this.A2B.unregisterObserver(this.A0k);
        this.A2z.unregisterObserver(this.A0y);
        if (this.A1K && Build.VERSION.SDK_INT >= 28) {
            for (StatusBarNotification id : this.A2w.A0O()) {
                if (id.getId() == 23) {
                    this.A26.A0E("VoiceService/onDestroy", "voip/orphannotification", true);
                }
            }
        }
    }

    public void A0P() {
        C90464aC.A14(this);
        this.A0c.removeMessages(23);
        this.A0c.sendEmptyMessageDelayed(23, 45000);
        this.A1E.execute(AnonymousClass74W.A00);
    }

    public void A0R(int i, String str) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("end_call_reason", i);
        if (str != null) {
            A072.putString("end_call_string", str);
        }
        this.A2R.A00(new C132636Up("hangup_call", A072));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0S(int r4, java.util.List r5) {
        /*
            r3 = this;
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 1
            if (r4 == r2) goto L_0x008b
            r0 = 2
            if (r4 == r0) goto L_0x007b
            r1 = 6
            if (r4 == r1) goto L_0x006e
            r0 = 18
            if (r4 == r0) goto L_0x0054
            r0 = 10
            if (r4 == r0) goto L_0x0047
            r0 = 11
            if (r4 == r0) goto L_0x0047
            r0 = 34
            if (r4 == r0) goto L_0x0047
            r0 = 35
            if (r4 == r0) goto L_0x0047
            switch(r4) {
                case 21: goto L_0x0031;
                case 22: goto L_0x0031;
                case 23: goto L_0x0031;
                case 24: goto L_0x0031;
                case 25: goto L_0x0054;
                case 26: goto L_0x0031;
                case 27: goto L_0x0054;
                case 28: goto L_0x0047;
                case 29: goto L_0x0047;
                default: goto L_0x0024;
            }
        L_0x0024:
            r1 = 0
        L_0x0025:
            X.17Y r0 = r3.A28
            X.14r r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            r0.Btm(r1)
        L_0x0030:
            return
        L_0x0031:
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "finish"
            r1.putBoolean(r0, r2)
            r3.A01()
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A03(r1, r0, r4)
            goto L_0x0025
        L_0x0047:
            r3.A01()
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r4)
            goto L_0x0025
        L_0x0054:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.util.ArrayList r1 = X.C36441kJ.A15(r5)
            java.lang.String r0 = "user_jids"
            r2.putParcelableArrayList(r0, r1)
            r3.A01()
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A03(r2, r0, r4)
            goto L_0x0025
        L_0x006e:
            r3.A01()
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r1)
            goto L_0x0025
        L_0x007b:
            if (r1 == 0) goto L_0x0024
            r3.A01()
            java.util.Map r0 = r1.participants
            int r0 = r0.size()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A06(r5, r0, r2)
            goto L_0x0025
        L_0x008b:
            if (r1 == 0) goto L_0x0024
            r3.A01()
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 0
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A06(r5, r1, r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0S(int, java.util.List):void");
    }

    public void A0T(long j) {
        C36321k7.A1V("VoiceService/delayShowingIncomingCall delay = ", AnonymousClass000.A0u(), j);
        this.A0c.removeMessages(1);
        this.A0c.sendEmptyMessageDelayed(1, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r8 != com.whatsapp.voipcalling.CallState.ACCEPT_SENT) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r3.A34.A06(X.C36331k8.A0G(r6)) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        if (r3.A25.A00 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        if (r3.A0D == false) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(com.whatsapp.voipcalling.CallInfo r18) {
        /*
            r17 = this;
            X.C18740tg.A01()
            r4 = r18
            boolean r0 = X.C34681hT.A0T(r4)
            r3 = r17
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_START_ACTIVITY_FOR_INCOMING_CALL no active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r18 == 0) goto L_0x001c
            X.1NF r2 = r3.A2K
            java.lang.String r1 = r4.callId
            r0 = 4
            r2.A04(r1, r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Enter"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Az r0 = r4.callWaitingInfo
            int r0 = r0.A01
            r2 = 0
            r5 = 1
            boolean r10 = X.AnonymousClass000.A1S(r0, r5)
            com.whatsapp.jid.UserJid r9 = r4.getInitialPeerJid()
            X.C18740tg.A06(r9)
            com.whatsapp.voipcalling.CallState r8 = r4.callState
            boolean r6 = r4.isAudioChat()
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            r0 = 23
            if (r1 < r0) goto L_0x009e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r8 == r0) goto L_0x009e
            if (r6 == 0) goto L_0x006c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r8 == r0) goto L_0x009e
        L_0x004a:
            r7 = 1
        L_0x004b:
            if (r10 != 0) goto L_0x0055
            X.C90474aD.A12(r3, r4)
            X.6zT r0 = r3.A2E
            r0.A06(r4)
        L_0x0055:
            r1 = 2
            if (r7 == 0) goto L_0x0059
            r1 = 1
        L_0x0059:
            if (r10 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x0062
            boolean r0 = r3.A1O
            if (r0 != 0) goto L_0x0062
            r2 = 1
        L_0x0062:
            r0 = 0
            A08(r3, r4, r1, r2, r0)
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Exit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x006c:
            if (r10 != 0) goto L_0x004a
            r0 = 29
            if (r1 >= r0) goto L_0x004a
            X.16D r0 = r3.A2b
            X.141 r6 = r0.A08(r9)
            X.1CR r0 = r3.A33
            boolean r0 = r0.A0j(r9)
            if (r0 != 0) goto L_0x004a
            if (r6 == 0) goto L_0x0097
            X.3IL r0 = r6.A0F
            if (r0 != 0) goto L_0x0097
            boolean r0 = r3.A1L
            if (r0 != 0) goto L_0x0097
            X.1C6 r1 = r3.A34
            X.11F r0 = X.C36331k8.A0G(r6)
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0097
            goto L_0x004a
        L_0x0097:
            X.0zA r0 = r3.A25
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009e
            goto L_0x004a
        L_0x009e:
            boolean r0 = r4.isAudioChat()
            if (r0 != 0) goto L_0x004b
            X.1Pm r1 = r3.A37
            java.lang.String r0 = "voip/notifyShowingIncomingCallUI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C36361kB.A0s(r1)
        L_0x00af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r1.next()
            X.1NK r0 = (X.AnonymousClass1NK) r0
            r0.Bgj()
            goto L_0x00af
        L_0x00bf:
            r13 = 0
            android.content.Context r11 = r3.A22
            X.0zA r0 = r3.A25
            boolean r0 = r0.A00
            java.lang.Boolean r12 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)
            r15 = r14
            r16 = r13
            android.content.Intent r5 = X.AnonymousClass190.A0z(r11, r12, r13, r14, r15, r16)
            if (r10 == 0) goto L_0x00f8
            X.3Az r0 = r4.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x00db:
            java.lang.String r0 = "call_id"
            r5.putExtra(r0, r1)
            if (r10 != 0) goto L_0x00e7
            boolean r0 = r3.A0D
            r1 = 1
            if (r0 != 0) goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            java.lang.String r0 = "callAccepted"
            r5.putExtra(r0, r1)
            r1 = 6
            java.lang.String r0 = "lobbyEntryPoint"
            r5.putExtra(r0, r1)
            r11.startActivity(r5)
            goto L_0x004b
        L_0x00f8:
            java.lang.String r1 = r4.callId
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0a(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A0c(CallInfo callInfo, boolean z, boolean z2) {
        String A0o2;
        CallState callState;
        C18740tg.A01();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/phone-call-in-progress-changed: ");
        A0u2.append(z);
        if (callInfo == null) {
            A0o2 = null;
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append(", call state: ");
            A0o2 = AnonymousClass000.A0o(callInfo.callState, A0u3);
        }
        C36321k7.A1a(A0u2, A0o2);
        if (callInfo != null && (callState = callInfo.callState) != CallState.NONE) {
            if (!z) {
                if (!z2) {
                    Message obtainMessage = this.A0c.obtainMessage(38);
                    this.A0c.removeMessages(38);
                    this.A0c.sendMessageDelayed(obtainMessage, 2000);
                } else {
                    boolean z3 = callInfo.videoEnabled;
                    C148816zT r1 = this.A2E;
                    if (z3) {
                        r1.A09(callInfo, true);
                    } else {
                        r1.A0A(callInfo, true);
                    }
                }
                this.A2E.A0F(false);
            } else if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
                A0R(4, (String) null);
                return;
            } else {
                C148816zT r12 = this.A2E;
                r12.A07(callInfo);
                C148816zT.A02(r12, 45);
                this.A0G = true;
            }
            AnonymousClass752 r2 = new AnonymousClass752(this, callInfo, 15, z);
            if (this.A2t.A0E(2903)) {
                this.A1E.execute(r2);
            } else {
                r2.run();
            }
        }
    }

    public void A0g(String str) {
        C18740tg.A0D(AnonymousClass000.A1V(A0H(str)), "must be called for self managed connection");
        C91734cX A0H2 = A0H(str);
        if (Build.VERSION.SDK_INT >= 28 && A0H2 != null && A0H2.getState() == 5) {
            A0H2.onUnhold();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r8 == 10) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h(java.lang.String r7, int r8, boolean r9) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = X.C34681hT.A0T(r4)
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "voip/service/acceptCall No active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0010:
            boolean r5 = X.C90514aH.A1X(r4, r7)
            if (r5 == 0) goto L_0x006e
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x001a:
            boolean r3 = r0.isGroupCall
            if (r8 == 0) goto L_0x0028
            X.5yC r1 = r6.A0G(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A03 = r0
        L_0x0028:
            if (r5 != 0) goto L_0x0042
            r0 = 1
            r6.A0D = r0
            X.6XR r0 = r6.A2P
            r0.A06()
            X.6zT r2 = r6.A2E
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x003d
            r0 = 0
            r2.A0D(r4, r0)
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r6.A0d(r0, r7)
        L_0x0042:
            X.73C r4 = new X.73C
            r4.<init>(r6, r7, r5, r9)
            if (r3 != 0) goto L_0x0064
            X.6Jm r3 = r6.A3I
            r0 = 3
            if (r8 == r0) goto L_0x0053
            r0 = 10
            r2 = 0
            if (r8 != r0) goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            r1 = 6
            r0 = 2
            if (r2 != 0) goto L_0x0061
            r0 = 1
            if (r8 == r0) goto L_0x0060
            r0 = 5
            if (r8 == r0) goto L_0x0060
            if (r8 != r1) goto L_0x0064
        L_0x0060:
            r0 = 3
        L_0x0061:
            X.C130046Jm.A00(r3, r7, r0, r1)
        L_0x0064:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r6.A1E
            r1 = 100
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.schedule(r4, r1, r0)
            return
        L_0x006e:
            r0 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0h(java.lang.String, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r8 == 11) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r4 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1.A04.equals(r6) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 0
            if (r4 == 0) goto L_0x0016
            X.3Az r1 = r4.callWaitingInfo
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 == 0) goto L_0x0028
            X.5yC r1 = r5.A0G(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A03 = r0
        L_0x0028:
            if (r2 == 0) goto L_0x0054
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x002e:
            boolean r3 = r4.isGroupCall
        L_0x0030:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.A1E
            X.72z r0 = new X.72z
            r0.<init>(r6, r7, r2)
            r1.execute(r0)
            if (r3 != 0) goto L_0x0053
            X.6Jm r3 = r5.A3I
            r0 = 4
            if (r8 == r0) goto L_0x0046
            r0 = 11
            r2 = 0
            if (r8 != r0) goto L_0x0047
        L_0x0046:
            r2 = 1
        L_0x0047:
            r1 = 7
            r0 = 2
            if (r2 != 0) goto L_0x0050
            if (r8 == r0) goto L_0x004f
            if (r8 != r1) goto L_0x0053
        L_0x004f:
            r0 = 3
        L_0x0050:
            X.C130046Jm.A00(r3, r6, r0, r1)
        L_0x0053:
            return
        L_0x0054:
            if (r4 == 0) goto L_0x0030
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0i(java.lang.String, java.lang.String, int):void");
    }

    public void A0j(Collection collection) {
        if (collection.size() > 0 && this.A2t.A0E(5249)) {
            HashSet A002 = this.A2U.A03.A00(collection, true);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C36341k9.A1N("voip/maybePrefetchForGroupCall prefetch e2ee sessions for group call, ", A0u2, A002);
            C36341k9.A1O(A0u2, " session missing");
        }
    }

    public void A0k(List list) {
        DeviceJid deviceJid;
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList A0I3 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            C107265Nh A042 = this.A2L.A04(A0C2);
            if (!(A042 == null || (deviceJid = A042.A02) == null)) {
                A0I2.add(A0C2);
                A0I3.add(deviceJid);
            }
        }
        if (!A0I2.isEmpty()) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("VoiceService/actionCheckOngoingCalls: ongoing calls count=");
            C36321k7.A1Y(A0u2, A0I2.size());
            Voip.checkOngoingCalls(C36371kC.A1b(A0I2, 0), (DeviceJid[]) A0I3.toArray(new DeviceJid[0]));
        }
    }

    public boolean A0n(AudioManager audioManager) {
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        C148816zT r2 = this.A2E;
        if (AnonymousClass000.A1O(r2.A00) == isSpeakerphoneOn) {
            return false;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VoiceService:callEnding audio route mismatch detectecd. current = ");
        A0u2.append(audioManager.isSpeakerphoneOn());
        A0u2.append(", Expected = ");
        Log.w(C36421kH.A0d(A0u2, AnonymousClass000.A1O(r2.A00)));
        return true;
    }

    public boolean A0p(GroupJid groupJid, String str, List list, boolean z, boolean z2) {
        String charSequence;
        String A022;
        if (list.isEmpty()) {
            Log.e("voip/service/addIncomingCallToTelecom peerJids is empty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C27671Pf r2 = this.A2S;
            if (r2.A0E()) {
                Context context = this.A22;
                AnonymousClass16D r6 = this.A2b;
                AnonymousClass171 r4 = this.A2d;
                AnonymousClass141 A012 = AnonymousClass3UL.A01(r6, this.A1w, groupJid, this.A34, z2);
                if (A012 == null || (A022 = C36381kD.A0v(r4, A012)) == null) {
                    C61243Bc A042 = AnonymousClass3UD.A04(r6, r4, list, 2, AnonymousClass000.A1S(list.size(), 1));
                    if (A042 == null) {
                        charSequence = null;
                    } else {
                        charSequence = A042.A00(context).toString();
                    }
                    A022 = AnonymousClass3TB.A02(charSequence);
                    if (A022 == null) {
                        Log.w("voip/service/addIncomingCallToTelecom displayName is null");
                        return false;
                    }
                }
                return r2.A0F((UserJid) list.get(0), str, A022, z);
            }
        }
        return false;
    }

    public boolean A0r(String str) {
        return AnonymousClass000.A1V(A0H(str));
    }

    public AnonymousClass6YM(C19460v5 r52, C19460v5 r53, C21390zA r54, C19700wN r55, AnonymousClass5k5 r56, AnonymousClass5k6 r57, AnonymousClass5k7 r58, C20690y0 r59, AnonymousClass17Y r60, C19730wQ r61, C20050ww r62, AnonymousClass19J r63, AnonymousClass1WQ r64, C106835Ln r65, C227815t r66, C30531aM r67, C27631Pa r68, C61693Db r69, AnonymousClass6WJ r70, C105545Fb r71, AnonymousClass1HM r72, AnonymousClass2ZG r73, AnonymousClass1ND r74, C110345aW r75, C1260862m r76, AnonymousClass1PY r77, C123765x3 r78, AnonymousClass3U0 r79, AnonymousClass1NF r80, C131176Oa r81, ScreenShareResourceManager screenShareResourceManager, C27691Pi r83, C130046Jm r84, AnonymousClass1PW r85, C27671Pf r86, C130806Mm r87, AnonymousClass1HQ r88, AnonymousClass798 r89, C27701Pj r90, AnonymousClass6XP r91, C144796sp r92, C27641Pb r93, C34631hO r94, AnonymousClass1MK r95, C27651Pc r96, C19600wD r97, AnonymousClass16D r98, AnonymousClass1DM r99, AnonymousClass171 r100, C27301Nr r101, AnonymousClass1NM r102, AnonymousClass1G5 r103, C236519h r104, C19980wp r105, C21060yb r106, C19970wo r107, C19630wG r108, AnonymousClass17Z r109, C25271Fq r110, C20830yE r111, C19420v0 r112, C18820ts r113, AnonymousClass189 r114, AnonymousClass187 r115, C79793uI r116, C117145lm r117, AnonymousClass1HJ r118, C20310xM r119, AnonymousClass1HO r120, C26211Jh r121, AnonymousClass12O r122, C231417i r123, C25841Hw r124, C20810yC r125, C25781Hq r126, C20350xQ r127, AnonymousClass1GE r128, AnonymousClass1C4 r129, AnonymousClass19L r130, C20600xp r131, C27361Nx r132, C30911ay r133, AnonymousClass1YU r134, WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader, AnonymousClass13I r136, C31031bA r137, AnonymousClass1G4 r138, AnonymousClass1CR r139, AnonymousClass1C6 r140, C90964bE r141, AnonymousClass3P4 r142, AnonymousClass13J r143, C19770wU r144, C21380z9 r145, C27721Pm r146, JNIUtils jNIUtils, VoipCameraManager voipCameraManager, AnonymousClass005 r149, AnonymousClass005 r150, AnonymousClass005 r151, AnonymousClass005 r152) {
        A03(this);
        this.A12 = null;
        this.A0Q = 0;
        this.A0R = 0;
        this.A21 = Collections.synchronizedSet(C36441kJ.A16());
        this.A19 = null;
        this.A31 = new C148406yo(this);
        Context context = r108.A00;
        this.A22 = context;
        this.A2R = r85;
        C19970wo r39 = r107;
        this.A2h = r39;
        C20810yC r38 = r125;
        this.A2t = r38;
        AnonymousClass17Y r50 = r60;
        this.A28 = r50;
        this.A38 = jNIUtils;
        this.A1q = r104;
        this.A26 = r55;
        C19730wQ r49 = r61;
        this.A29 = r49;
        C19770wU r32 = r144;
        this.A36 = r32;
        this.A1a = r59;
        this.A2A = r62;
        this.A2C = r67;
        this.A2G = r74;
        this.A2u = r129;
        AnonymousClass1C6 r34 = r140;
        this.A34 = r34;
        this.A24 = r52;
        this.A2z = r136;
        this.A37 = r146;
        this.A2B = r64;
        this.A2Y = r95;
        this.A2K = r80;
        C105545Fb r1 = r71;
        this.A0m = r1;
        this.A1v = r126;
        r1.A01 = this;
        this.A2b = r98;
        this.A2l = r115;
        AnonymousClass13J r33 = r143;
        this.A35 = r33;
        C21060yb r40 = r106;
        this.A2g = r40;
        this.A2d = r100;
        this.A1s = r113;
        C27691Pi r47 = r83;
        this.A2M = r47;
        this.A2y = r134;
        C27361Nx r36 = r132;
        this.A1x = r36;
        this.A1f = r70;
        C20350xQ r37 = r127;
        this.A1w = r37;
        AnonymousClass19J r48 = r63;
        this.A1b = r48;
        this.A2W = r92;
        this.A2o = r118;
        AnonymousClass1NM r42 = r102;
        this.A2e = r42;
        AnonymousClass1CR r35 = r139;
        this.A33 = r35;
        this.A1p = r101;
        this.A2w = r131;
        this.A2k = r114;
        this.A1c = r65;
        this.A1u = r123;
        this.A39 = voipCameraManager;
        this.A2m = r116;
        this.A1i = r78;
        this.A2v = r130;
        AnonymousClass1DM r43 = r99;
        this.A2c = r43;
        this.A2q = r121;
        this.A2j = r111;
        this.A1r = r112;
        this.A1e = r69;
        this.A2H = r76;
        this.A2p = r120;
        this.A2V = r91;
        C130806Mm r45 = r87;
        this.A2T = r45;
        this.A30 = r137;
        this.A2D = r68;
        this.A2i = r110;
        this.A2n = r117;
        this.A3O = r145;
        this.A3I = r84;
        this.A2J = r79;
        this.A1Z = r53;
        this.A2x = r133;
        this.A1t = r119;
        this.A32 = r138;
        this.A3P = r149;
        this.A3C = r150;
        this.A2X = r93;
        this.A1j = r81;
        this.A1k = screenShareResourceManager;
        this.A25 = r54;
        C19600wD r44 = r97;
        this.A2a = r44;
        this.A2Z = r96;
        this.A1h = r75;
        WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader2 = whatsAppDynamicPytorchLoader;
        this.A3N = whatsAppDynamicPytorchLoader2;
        this.A27 = r58;
        this.A3K = r89;
        C27671Pf r46 = r86;
        this.A2S = r46;
        this.A1y = r142;
        this.A2Q = new VoiceServiceEventCallback(this, r128, whatsAppDynamicPytorchLoader2);
        C19980wp r41 = r105;
        this.A3L = r41;
        this.A3J = new AnonymousClass63T(r66);
        this.A23 = r40.A0K();
        C1256060o r15 = new C1256060o(this);
        C18800tq r0 = r57.A00.A00;
        C20810yC A0V2 = C36341k9.A0V(r0);
        C21010yW A0g2 = C36351kA.A0g(r0);
        AnonymousClass6WM r16 = new AnonymousClass6WM((C233418c) r0.A42.get(), (C20300xL) r0.A5R.get(), r15, (AnonymousClass67L) r0.A00.A1k.get(), (C30431aC) r0.A0Z.get(), (AnonymousClass189) r0.A7m.get(), (AnonymousClass187) r0.A7n.get(), (AnonymousClass18I) r0.A7o.get(), (AnonymousClass1IN) r0.A2Y.get(), (C117135ll) r0.A2Z.get(), (C232217q) r0.A8j.get(), (AnonymousClass1OD) r0.A2j.get(), A0V2, A0g2, (C30521aL) r0.A5s.get());
        this.A2U = r16;
        this.A2N = new AnonymousClass6ES(this, r39);
        C27701Pj r10 = r90;
        this.A2O = new OutgoingSignalingHandler(r39, r38, r49, r32, this, r47, r16, r41, r10);
        this.A2E = new C148816zT(context, r50, this, r46, r40, r38, r141, r33, r32);
        this.A2s = r124;
        this.A3M = r109;
        this.A2F = r72;
        this.A2r = r122;
        this.A1g = r73;
        this.A3B = r151;
        this.A1d = new C122365uj(context);
        this.A1o = r94;
        boolean A0M2 = C34681hT.A0M(r38);
        this.A3H = A0M2;
        this.A2f = r103;
        this.A2I = r77;
        this.A1m = r88;
        this.A2P = new AnonymousClass6XR(context, this, r40, r39, r38, r35, r33, r32);
        C18800tq r8 = r56.A00.A00;
        C20810yC A0V3 = C36341k9.A0V(r8);
        C19700wN A0V4 = C36391kE.A0V(r8);
        C19730wQ A0N2 = C36351kA.A0N(r8);
        C19770wU A0Z2 = C36341k9.A0Z(r8);
        AnonymousClass13J A0q2 = C36351kA.A0q(r8);
        C18830tt r02 = r8.A00;
        AnonymousClass63S A2n2 = C18830tt.A2n(r02);
        C25271Fq A0d2 = C36391kE.A0d(r8);
        AnonymousClass6Ts r11 = new AnonymousClass6Ts(A0V4, A0N2, (C27631Pa) r8.A8z.get(), this, A2n2, (C34051gN) r02.A4B.get(), A0d2, (AnonymousClass1HK) r8.A1H.get(), (AnonymousClass1HJ) r8.A1O.get(), (AnonymousClass1HO) r8.A4M.get(), (C232317r) r8.A61.get(), (C26211Jh) r8.A7X.get(), A0V3, A0q2, A0Z2, A0M2);
        this.A2L = r11;
        this.A1l = new AnonymousClass65J(r48, r11, this, r45, r44, r43, r42, r38, r37, r36, r34);
        this.A3A = r152;
        this.A1n = r10;
        this.A0n = new AnonymousClass6CH();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d7, code lost:
        if (r1 == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013e, code lost:
        if (r12 == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0298, code lost:
        if (r1.equals(r11.A08.A22.getString(com.whatsapp.R.string.f12nameremoved)) != false) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(com.whatsapp.jid.GroupJid r21, com.whatsapp.jid.UserJid r22, java.lang.String r23, boolean r24, boolean r25, boolean r26) {
        /*
            r20 = this;
            X.C18740tg.A01()
            r10 = r20
            r0 = r25
            r10.A0J = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/start "
            X.C36321k7.A1K(r10, r0, r1)
            boolean r0 = r10.A1S
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "voip/start/started, do nothing"
        L_0x0018:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001b:
            return
        L_0x001c:
            X.0yC r9 = r10.A2t
            r0 = 5845(0x16d5, float:8.19E-42)
            boolean r0 = r9.A0E(r0)
            r10.A1Q = r0
            android.content.Context r8 = r10.A22
            X.0wU r7 = r10.A36
            X.1Pa r2 = r10.A2D
            if (r0 == 0) goto L_0x004b
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r2)
            java.lang.String r0 = "end_call_tone_duration_last_cached_app_version"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L_0x004b
            X.1iP r0 = new X.1iP
            r0.<init>((android.content.Context) r8, (X.C27631Pa) r2)
            r7.Boy(r0)
        L_0x004b:
            r15 = r23
            X.4cX r0 = r10.A0H(r15)
            boolean r12 = X.AnonymousClass000.A1V(r0)
            if (r12 != 0) goto L_0x007d
            android.telephony.TelephonyManager r3 = r10.A23
            X.0yE r0 = r10.A2j
            int r2 = X.AnonymousClass3UL.A00(r3, r0)
            if (r24 == 0) goto L_0x006e
            if (r2 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/start/cellularCallInProgress "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            goto L_0x0018
        L_0x006e:
            if (r3 == 0) goto L_0x007d
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x007d
            android.telephony.PhoneStateListener r1 = r10.A0i
            r0 = 32
            r3.listen(r1, r0)
        L_0x007d:
            long r16 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/device_info MANUFACTURER: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.append(r0)
            java.lang.String r0 = ", MODEL: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = ", Device: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            r1.append(r0)
            java.lang.String r0 = ", Board: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.BOARD
            r1.append(r0)
            java.lang.String r0 = ", Hardware: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            r1.append(r0)
            java.lang.String r0 = ", CPU_API: "
            r1.append(r0)
            java.lang.String r0 = X.C131896Re.A02()
            r1.append(r0)
            java.lang.String r0 = ", OS: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1.append(r0)
            java.lang.String r0 = ", Build: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r1.append(r0)
            java.lang.String r0 = ", App: "
            r1.append(r0)
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)
            r1.append(r0)
            java.lang.String r0 = ", PowerSaving: "
            r1.append(r0)
            X.0yb r0 = r10.A2g
            r19 = r0
            android.os.PowerManager r0 = r19.A0G()
            if (r0 != 0) goto L_0x0192
            java.lang.String r0 = "voip/service/start pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x00f9:
            X.C36331k8.A1S(r1, r0)
            android.media.AudioManager r13 = r19.A0D()
            r6 = 0
            r10.A1I = r6
            r10.A1U = r6
            r10.A1P = r6
            com.whatsapp.voipcalling.Voip$DebugTapType[] r0 = com.whatsapp.voipcalling.Voip.DebugTapType.values()
            int r0 = r0.length
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r0 = new com.whatsapp.voipcalling.Voip.RecordingInfo[r0]
            r10.A0M = r0
            com.whatsapp.calling.service.OutgoingSignalingHandler r0 = r10.A2O
            r2 = 0
            r0.pendingCallOfferStanza = r2
            java.util.Map r0 = r10.A1z
            r0.clear()
            java.util.Map r0 = r10.A3F
            r0.clear()
            X.6WM r0 = r10.A2U
            X.67L r0 = r0.A03
            java.util.Set r0 = r0.A01
            r0.clear()
            android.content.BroadcastReceiver r1 = r10.A0Z
            java.lang.String r3 = "android.intent.action.SCREEN_OFF"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r3)
            r5 = 1
            X.C26981Mg.A01(r1, r8, r0, r5)
            X.6zT r11 = r10.A2E
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0140
            r3 = 1
            if (r12 != 0) goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/audio_route/onCallStart using telecom:"
            X.C36321k7.A1X(r0, r1, r3)
            r11.A05 = r3
            r11.A04 = r6
            r11.A07 = r6
            if (r3 != 0) goto L_0x017c
            X.6ER r1 = r11.A0A
            boolean r0 = r1.A03()
            r1.A01 = r0
            r1.A00()
            X.4bE r0 = r11.A0G
            r0.A04(r11)
            android.content.Context r4 = r11.A08
            X.4bC r3 = r11.A0B
            java.lang.String r1 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            android.content.Intent r3 = X.C26981Mg.A01(r3, r4, r0, r5)
            if (r3 == 0) goto L_0x017c
            r1 = -1
            java.lang.String r0 = "android.media.extra.SCO_AUDIO_STATE"
            int r0 = r3.getIntExtra(r0, r1)
            r11.A01 = r0
        L_0x017c:
            r11.A03 = r6
            android.content.BroadcastReceiver r3 = r10.A0a
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            X.C26981Mg.A01(r3, r8, r0, r5)
            X.C18740tg.A01()
            android.os.PowerManager$WakeLock r0 = r10.A0g
            if (r0 != 0) goto L_0x01bd
            goto L_0x0198
        L_0x0192:
            boolean r0 = r0.isPowerSaveMode()
            goto L_0x00f9
        L_0x0198:
            android.os.PowerManager r1 = r19.A0G()     // Catch:{ Exception -> 0x01b7 }
            if (r1 != 0) goto L_0x01a4
            java.lang.String r0 = "voip/service/acquirePartialWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bd
        L_0x01a4:
            java.lang.String r0 = "VoiceService"
            android.os.PowerManager$WakeLock r0 = X.C111765co.A00(r1, r0, r5)     // Catch:{ Exception -> 0x01b7 }
            r10.A0g = r0     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x01bd
            r0.acquire()     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = "voip/service/acquirePartialWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01b7 }
            goto L_0x01bd
        L_0x01b7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r10.A0g = r2
        L_0x01bd:
            X.13J r0 = r10.A35
            r18 = r0
            if (r13 == 0) goto L_0x01e2
            if (r12 != 0) goto L_0x01e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "audioManager "
            r1.append(r0)
            int r0 = r13.getMode()
            X.C36321k7.A1Y(r1, r0)
            X.0yb r0 = r11.A0F
            android.media.AudioManager r3 = r0.A0D()
            if (r3 != 0) goto L_0x0306
            java.lang.String r0 = "result of audio focus for voice call: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01e2:
            r4 = 0
            if (r24 != 0) goto L_0x0302
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x020b
            boolean r0 = r10.A0D
            if (r0 != 0) goto L_0x020b
            X.6XR r11 = r10.A2P
            int r1 = r10.A0R
            r0 = 0
            boolean r3 = r11.A08(r2)
            r11.A00 = r6
            r13 = r22
            if (r12 == 0) goto L_0x0240
            if (r1 == 0) goto L_0x0240
            if (r26 == 0) goto L_0x0208
            long[] r0 = r11.A09(r13, r3, r5)
        L_0x0208:
            r11.A07(r13, r0, r6)
        L_0x020b:
            r10.A04 = r4
        L_0x020d:
            android.os.Handler r2 = r10.A0d
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendEmptyMessageDelayed(r6, r0)
            android.media.SoundPool r0 = r10.A01
            if (r0 == 0) goto L_0x0233
            r10.A1Y = r4
            r10.A1X = r4
            java.util.Map r0 = r10.A20
            r0.clear()
            android.media.SoundPool r1 = r10.A01
            r0 = 6569(0x19a9, float:9.205E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x023c
            java.util.Objects.requireNonNull(r1)
            r0 = 35
            X.C1501574e.A01(r7, r1, r0)
        L_0x0233:
            android.media.SoundPool r1 = new android.media.SoundPool
            r1.<init>(r5, r6, r6)
            r10.A01 = r1
            goto L_0x0314
        L_0x023c:
            r1.release()
            goto L_0x0233
        L_0x0240:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.voipcalling.Voip.getPeerJid()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/ringtone/play, telecom: "
            X.C36321k7.A1X(r0, r2, r12)
            if (r1 != 0) goto L_0x025a
            java.lang.String r0 = "voip/ringtone/play/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0254:
            if (r26 != 0) goto L_0x020b
            r11.A07(r13, r4, r5)
            goto L_0x020b
        L_0x025a:
            X.0yb r0 = r11.A09
            android.media.AudioManager r2 = r0.A0D()
            if (r2 == 0) goto L_0x0272
            int r0 = r2.getRingerMode()
            if (r0 == 0) goto L_0x02fe
            if (r0 == r5) goto L_0x02fa
            r14 = 2
            if (r0 != r14) goto L_0x0272
            java.lang.String r0 = "voip/ringtone/ringer_mode/normal"
        L_0x026f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0272:
            boolean r0 = X.AnonymousClass6XR.A04(r11)
            if (r0 != 0) goto L_0x0254
            X.1CR r0 = r11.A0B
            X.3LI r0 = X.C36361kB.A0d(r1, r0)
            java.lang.String r1 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x029a
            X.6YM r0 = r11.A08
            android.content.Context r14 = r0.A22
            r0 = 2131894271(0x7f121fff, float:1.9423342E38)
            java.lang.String r0 = r14.getString(r0)
            boolean r0 = r1.equals(r0)
            r14 = 0
            if (r0 == 0) goto L_0x029b
        L_0x029a:
            r14 = 1
        L_0x029b:
            android.net.Uri r0 = r11.A02
            if (r0 != 0) goto L_0x0254
            if (r14 != 0) goto L_0x0254
            java.lang.String r14 = "/"
            java.lang.String r0 = "android.resource://"
            if (r26 == 0) goto L_0x02f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            android.content.Context r0 = r11.A07
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            r1.append(r14)
            r0 = 2132017169(0x7f140011, float:1.9672609E38)
            if (r3 == 0) goto L_0x02bf
            r0 = 2132017176(0x7f140018, float:1.9672623E38)
        L_0x02bf:
            java.lang.String r1 = X.C36381kD.A10(r1, r0)
        L_0x02c3:
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r11.A02 = r0
            if (r0 == 0) goto L_0x0254
            if (r2 == 0) goto L_0x02e7
            if (r12 != 0) goto L_0x02e7
            java.lang.String r0 = "voip/ringtone/setmode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r1 = r11.A0A
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02ec
            X.0wk r1 = X.AnonymousClass6XR.A00(r11)
            r0 = 26
            X.C1501574e.A00(r1, r2, r0)
        L_0x02e7:
            r11.A05()
            goto L_0x0254
        L_0x02ec:
            r2.setMode(r5)
            goto L_0x02e7
        L_0x02f0:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/ringtone/ "
            X.C36321k7.A1Q(r0, r1, r3)
            goto L_0x02c3
        L_0x02fa:
            java.lang.String r0 = "voip/ringtone/ringer_mode/vibrate"
            goto L_0x026f
        L_0x02fe:
            java.lang.String r0 = "voip/ringtone/ringer_mode/silent"
            goto L_0x026f
        L_0x0302:
            r10.A17 = r2
            goto L_0x020d
        L_0x0306:
            X.0wk r4 = r11.A0H
            r1 = 44
            X.72m r0 = new X.72m
            r0.<init>(r3, r1)
            r4.execute(r0)
            goto L_0x01e2
        L_0x0314:
            r0 = 2132017166(0x7f14000e, float:1.9672603E38)
            int r0 = r1.load(r8, r0, r5)     // Catch:{ NotFoundException -> 0x0363 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x0363 }
            r10.A1Y = r0     // Catch:{ NotFoundException -> 0x0363 }
            android.media.SoundPool r1 = r10.A01     // Catch:{ NotFoundException -> 0x0363 }
            r0 = 2132017195(0x7f14002b, float:1.9672662E38)
            int r0 = r1.load(r8, r0, r5)     // Catch:{ NotFoundException -> 0x0363 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x0363 }
            r10.A1X = r0     // Catch:{ NotFoundException -> 0x0363 }
            java.util.Map r3 = r10.A20     // Catch:{ NotFoundException -> 0x0363 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ NotFoundException -> 0x0363 }
            android.media.SoundPool r1 = r10.A01     // Catch:{ NotFoundException -> 0x0363 }
            r0 = 2132017172(0x7f140014, float:1.9672615E38)
            int r0 = r1.load(r8, r0, r5)     // Catch:{ NotFoundException -> 0x0363 }
            X.C36421kH.A1M(r2, r3, r0)     // Catch:{ NotFoundException -> 0x0363 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0363 }
            android.media.SoundPool r1 = r10.A01     // Catch:{ NotFoundException -> 0x0363 }
            r0 = 2132017175(0x7f140017, float:1.967262E38)
            int r0 = r1.load(r8, r0, r5)     // Catch:{ NotFoundException -> 0x0363 }
            X.C36421kH.A1M(r2, r3, r0)     // Catch:{ NotFoundException -> 0x0363 }
            java.lang.Integer r2 = X.C36361kB.A0j()     // Catch:{ NotFoundException -> 0x0363 }
            android.media.SoundPool r1 = r10.A01     // Catch:{ NotFoundException -> 0x0363 }
            r0 = 2132017162(0x7f14000a, float:1.9672595E38)
            int r0 = r1.load(r8, r0, r5)     // Catch:{ NotFoundException -> 0x0363 }
            X.C36421kH.A1M(r2, r3, r0)     // Catch:{ NotFoundException -> 0x0363 }
            goto L_0x0372
        L_0x0363:
            r1 = move-exception
            java.lang.String r0 = "voip/service/start failed to load call sound set"
            com.whatsapp.util.Log.w(r0, r1)
            r10.A1Y = r4
            r10.A1X = r4
            java.util.Map r0 = r10.A20
            r0.clear()
        L_0x0372:
            android.net.wifi.WifiManager r2 = r19.A0F()
            if (r2 == 0) goto L_0x0489
            boolean r0 = r2.isWifiEnabled()
            if (r0 == 0) goto L_0x0489
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0489
            android.net.wifi.WifiInfo r0 = r2.getConnectionInfo()
            int r0 = r0.getRssi()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r10.A09 = r0
        L_0x0392:
            r0 = 0
            r10.A0Y = r0
            r10.A00 = r0
            r0 = -1
            r10.A0V = r0
            r10.A0W = r0
            A03(r10)
            r10.A1S = r5
            X.C108905Vk.A00 = r5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.A0T = r0
            X.0v0 r0 = r10.A1r
            java.lang.String r2 = X.C21870zw.A00
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r15)
            java.lang.String r0 = "session_id_for_voip_call_id"
            X.C36341k9.A0x(r1, r0, r2)
            X.1C6 r2 = r10.A34
            X.0xQ r0 = r10.A1w
            r1 = r21
            X.147 r1 = (X.AnonymousClass147) r1
            if (r21 == 0) goto L_0x03d9
            X.17X r0 = r0.A0U
            boolean r0 = r0.A0H(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.A09(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x03da
        L_0x03d9:
            r0 = 0
        L_0x03da:
            r10.A0F = r0
            long r0 = r10.A0T
            long r0 = r0 - r16
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "voip/service/start elapsed "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " ms"
            X.C36321k7.A1a(r3, r0)
            java.lang.String r1 = "voip/service/start"
            r2 = 4
            int r0 = com.whatsapp.util.Log.level
            if (r2 > r0) goto L_0x040c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "/total threads count = "
            r1.append(r0)
            int r0 = java.lang.Thread.activeCount()
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            com.whatsapp.util.Log.log((int) r2, (java.lang.String) r0)
        L_0x040c:
            boolean r0 = X.C34681hT.A0F(r19)
            r10.A1K = r0
            boolean r0 = r10.A0J
            X.0z9 r1 = r10.A3O
            if (r0 == 0) goto L_0x0483
            java.lang.String r0 = "video_call"
            r1.A01(r0, r5)
        L_0x041d:
            r0 = 2843(0xb1b, float:3.984E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0433
            X.6Ts r5 = r10.A2L
            X.0wU r3 = r5.A0C
            r1 = 29
            X.751 r0 = new X.751
            r0.<init>(r1, r15, r5)
            r3.Boy(r0)
        L_0x0433:
            boolean r0 = r18.BN6()
            if (r0 == 0) goto L_0x044a
            X.6Oa r1 = r10.A1j
            r1.A05 = r6
            X.6Ea r0 = r1.A0K
            r0.A01()
            X.6Ea r0 = r1.A0J
            r0.A01()
            X.C131176Oa.A00(r1)
        L_0x044a:
            r0 = 3153(0xc51, float:4.418E-42)
            int r0 = r9.A07(r0)
            if (r0 < r2) goto L_0x046b
            X.5x3 r2 = r10.A1i
            r2.A00 = r6
            r0 = 0
            r2.A02 = r0
            r2.A01 = r0
            X.6Ea r0 = r2.A03
            r0.A01()
            X.6Ea r0 = r2.A04
            r0.A01()
            X.6Ea r0 = r2.A05
            r0.A01()
        L_0x046b:
            X.3Db r0 = r10.A1e
            X.0yC r1 = r0.A00
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001b
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001b
            X.6WJ r2 = r10.A1f
            monitor-enter(r2)
            goto L_0x048d
        L_0x0483:
            java.lang.String r0 = "voice_call"
            r1.A01(r0, r5)
            goto L_0x041d
        L_0x0489:
            r10.A09 = r4
            goto L_0x0392
        L_0x048d:
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x049a }
            r2.A01 = r4     // Catch:{ all -> 0x049a }
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x049a }
            r0.clear()     // Catch:{ all -> 0x049a }
            monitor-exit(r2)
            return
        L_0x049a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YM.A0X(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid, java.lang.String, boolean, boolean, boolean):void");
    }
}
