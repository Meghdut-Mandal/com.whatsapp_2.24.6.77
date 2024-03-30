package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;
import com.whatsapp.ptv.PushToVideoRecordingCountdown;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.3UB  reason: invalid class name */
public class AnonymousClass3UB {
    public int A00 = 0;
    public long A01 = -1;
    public ViewPropertyAnimator A02;
    public C135316cV A03;
    public LiteCameraView A04;
    public AnonymousClass64G A05;
    public AnonymousClass3T1 A06;
    public AnonymousClass3B7 A07;
    public AnonymousClass35N A08;
    public C61173Av A09;
    public File A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final int A0L;
    public final View A0M;
    public final View A0N;
    public final C19700wN A0O;
    public final C57332y4 A0P;
    public final C57342y5 A0Q;
    public final C225314u A0R;
    public final AnonymousClass17Y A0S;
    public final AnonymousClass1XY A0T;
    public final AnonymousClass1MK A0U;
    public final C160007kJ A0V;
    public final MediaProgressRing A0W;
    public final MediaTimeDisplay A0X;
    public final MediaTimeDisplay A0Y;
    public final MediaTimeDisplay A0Z;
    public final C226515g A0a = new AnonymousClass3MK(this, 4);
    public final C24341Cb A0b;
    public final C21060yb A0c;
    public final C19970wo A0d;
    public final C18820ts A0e;
    public final C20060wx A0f;
    public final C20810yC A0g;
    public final C21010yW A0h;
    public final C19890wg A0i;
    public final PushToVideoRecordingCountdown A0j;
    public final AnonymousClass6QH A0k;
    public final C34831hi A0l = C36441kJ.A0s(false);
    public final C34831hi A0m = C36441kJ.A0s(1);
    public final C34831hi A0n = C36441kJ.A0s(false);
    public final C19770wU A0o;
    public final AnonymousClass1NK A0p = new AnonymousClass4YF(this, 4);
    public final C27721Pm A0q;
    public final List A0r;
    public final boolean A0s;
    public final View A0t;
    public final View A0u;
    public final View A0v;
    public final View A0w;
    public final C39501sW A0x;
    public final C20690y0 A0y;
    public final C19630wG A0z;
    public final C20830yE A10;
    public final C21860zv A11;
    public final boolean A12;

    private void A00() {
        C225314u r1;
        int i;
        boolean z = true;
        if (this.A0K != 1 || !C36351kA.A1W(this.A0l)) {
            z = false;
        }
        Drawable drawable = null;
        if (z) {
            drawable = AnonymousClass0BT.A00((Resources.Theme) null, C36421kH.A0B(this.A0z), R.drawable.recording_timestamp_background);
            r1 = this.A0R;
            i = R.color.f6nameremoved;
        } else {
            r1 = this.A0R;
            i = R.color.f6nameremoved;
        }
        int A002 = AnonymousClass00F.A00(r1, i);
        MediaTimeDisplay mediaTimeDisplay = this.A0Y;
        mediaTimeDisplay.setBackground(drawable);
        mediaTimeDisplay.setTextColor(A002);
    }

    public static void A01(AnonymousClass3UB r6) {
        int A072;
        if (r6.A0J && r6.A0C) {
            r6.A0J = false;
            if (A07(r6)) {
                PushToVideoRecordingCountdown pushToVideoRecordingCountdown = r6.A0j;
                C81133wW r4 = new C81133wW((Object) r6, 15);
                Handler handler = pushToVideoRecordingCountdown.A08;
                handler.removeCallbacksAndMessages((Object) null);
                PushToVideoRecordingCountdown.A01(pushToVideoRecordingCountdown, 0);
                if (((AccessibilityManager) pushToVideoRecordingCountdown.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                    A072 = 1000;
                } else {
                    A072 = pushToVideoRecordingCountdown.A05.A07(5412);
                }
                PushToVideoRecordingCountdown.A01(pushToVideoRecordingCountdown, 3);
                handler.postDelayed(new C81333wq(pushToVideoRecordingCountdown, A072, 34, r4), (long) A072);
                return;
            }
            A04(r6);
        }
    }

    public static void A02(AnonymousClass3UB r3) {
        if (AnonymousClass000.A1Q(r3.A05.A03.getVisibility())) {
            r3.A05.A00(false, true);
        }
        if (!r3.A0E) {
            r3.A0E = true;
            r3.A04.BQC();
        }
    }

    public static void A03(AnonymousClass3UB r15) {
        File file;
        if (r15.A0G && (file = r15.A0A) != null) {
            C61173Av r2 = r15.A09;
            C20810yC r7 = r2.A05;
            AnonymousClass17Y r4 = r2.A02;
            C21060yb r5 = r2.A03;
            FrameLayout frameLayout = r2.A01;
            C65083Qq A032 = C65083Qq.A03(frameLayout.getContext(), r4, r5, r2.A04, r7, r2.A06, r2.A09, (AnonymousClass6FG) null, file, false, true, false);
            r2.A00 = A032;
            View A082 = A032.A08();
            C36391kE.A1G(A082, frameLayout, -1, 17);
            A082.setClickable(true);
            r2.A08.A03(0);
            AnonymousClass3Y5.A00(A082, A032, 48);
            A032.A05 = C79653u4.A00;
            A032.A0R(new AnonymousClass4XB(r2, A032, 4));
            MediaProgressRing mediaProgressRing = r15.A0W;
            C225314u r22 = r15.A0R;
            mediaProgressRing.A01(r22, new C89484Ws(r15, 1));
            r15.A0Y.A03(r22, new C89494Wt(r15, 1));
        }
    }

    public static void A04(AnonymousClass3UB r5) {
        Log.i("ptvcameraui/startvideocapture");
        if (!r5.A0U.A00()) {
            r5.A11.A02("PTVRecording", "Resume");
            r5.A0A = AnonymousClass3RU.A00(r5.A0y, r5.A0i, C25471Gl.A0i, ".mp4", 1);
            r5.A0G = true;
            r5.A08.A01.setKeepScreenOn(true);
            r5.A04.Buy(r5.A0A, 360);
            C36341k9.A18(r5.A0l, true);
            r5.A00();
            AnonymousClass3T3.A03(r5.A0c);
            return;
        }
        r5.A0R.BO5(R.string.f12nameremoved);
        r5.A0V.BSr();
    }

    public static void A06(AnonymousClass3UB r4, boolean z, boolean z2) {
        if (r4.A0D) {
            C55922vP.A00(r4.A0c);
            A05(r4, new AnonymousClass75B(48, (Object) r4, z));
            C225314u r1 = r4.A0R;
            r1.setRequestedOrientation(-1);
            AnonymousClass07B supportActionBar = r1.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0E();
            }
            r4.A0I = true;
            r4.A0M.setVisibility(0);
            r4.A0t.setVisibility(0);
            C61173Av r12 = r4.A09;
            C65083Qq r0 = r12.A00;
            if (r0 != null) {
                r0.A0D();
            }
            r12.A00 = null;
            r12.A01.removeAllViews();
            r12.A08.A03(8);
            AnonymousClass6QH r3 = r4.A0k;
            r3.A0G.removeCallbacks(r3.A0T);
            r3.A02();
            r3.A05(z2);
            if (r4.A12) {
                ViewPropertyAnimator viewPropertyAnimator = r4.A02;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator withEndAction = r4.A0N.animate().alpha(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new C81133wW((Object) r4, 21));
                r4.A02 = withEndAction;
                withEndAction.start();
            } else {
                r4.A0N.setVisibility(8);
            }
            C70803fk r32 = ((C69823e9) r4.A0V).A00;
            C70803fk.A1O(r32, true);
            r4.A0q.unregisterObserver(r4.A0p);
            Runnable runnable = r4.A0B;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = r4.A0W.A04;
            if (runnable2 != null) {
                runnable2.run();
            }
            Runnable runnable3 = r4.A0Y.A05;
            if (runnable3 != null) {
                runnable3.run();
            }
            Runnable runnable4 = r4.A0Z.A05;
            if (runnable4 != null) {
                runnable4.run();
            }
            Runnable runnable5 = r4.A0X.A05;
            if (runnable5 != null) {
                runnable5.run();
            }
            r4.A0J = false;
            r32.A4l = null;
        }
    }

    public static boolean A07(AnonymousClass3UB r2) {
        Boolean bool = r2.A0H;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass000.A1R(r2.A0g.A07(5412)));
            r2.A0H = bool;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r3.A0D() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r19 = this;
            r0 = r19
            X.0yE r3 = r0.A10
            java.lang.String r1 = "android.permission.CAMERA"
            int r2 = r3.A02(r1)
            r6 = 1
            r1 = 0
            boolean r8 = X.AnonymousClass000.A1P(r2)
            boolean r2 = r3.A0C()
            r7 = r2 ^ 1
            boolean r2 = X.C19550w8.A07()
            if (r2 != 0) goto L_0x0023
            boolean r2 = r3.A0D()
            r5 = 1
            if (r2 == 0) goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r8 != 0) goto L_0x028f
            if (r7 != 0) goto L_0x028f
            if (r5 != 0) goto L_0x028f
            X.1MK r2 = r0.A0U
            boolean r2 = r2.A00()
            if (r2 != 0) goto L_0x0281
            X.14u r3 = r0.A0R
            X.1Cb r4 = r0.A0b
            X.15g r2 = r0.A0a
            boolean r2 = r4.A04(r2)
            if (r2 == 0) goto L_0x0056
            X.0wx r2 = r0.A0f
            long r9 = r2.A01()
            X.0yC r8 = r0.A0g
            r2 = 3658(0xe4a, float:5.126E-42)
            long r4 = X.C36401kF.A04(r8, r2)
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0057
            X.0yW r1 = r0.A0h
            r0 = 5
            X.AnonymousClass1V2.A05(r3, r3, r1, r0)
        L_0x0056:
            return
        L_0x0057:
            X.1sW r2 = r0.A0x
            X.1hi r2 = r2.A00
            java.lang.Object r2 = r2.A04()
            X.3Po r2 = (X.C64823Po) r2
            X.6QH r7 = r0.A0k
            float r4 = r2.A00
            float r2 = r2.A01
            r7.A00 = r4
            r7.A01 = r2
            android.view.View r2 = r0.A0N
            r2.setVisibility(r1)
            android.content.Context r5 = r2.getContext()
            r4 = 2131102052(0x7f060964, float:1.7816531E38)
            X.C36341k9.A0q(r5, r2, r4)
            boolean r4 = r0.A12
            if (r4 == 0) goto L_0x00ae
            android.view.ViewPropertyAnimator r4 = r0.A02
            if (r4 == 0) goto L_0x0085
            r4.cancel()
        L_0x0085:
            android.view.ViewPropertyAnimator r5 = r2.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r9 = r5.alpha(r4)
            r4 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r5 = r9.setDuration(r4)
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            android.view.ViewPropertyAnimator r9 = r5.setInterpolator(r4)
            r5 = 18
            X.3wW r4 = new X.3wW
            r4.<init>((java.lang.Object) r0, (int) r5)
            android.view.ViewPropertyAnimator r4 = r9.withStartAction(r4)
            r0.A02 = r4
            r4.start()
        L_0x00ae:
            X.07B r4 = r3.getSupportActionBar()
            if (r4 == 0) goto L_0x00b7
            r4.A0D()
        L_0x00b7:
            X.1Pm r5 = r0.A0q
            X.1NK r4 = r0.A0p
            r5.registerObserver(r4)
            X.0yb r5 = r0.A0c
            X.C55922vP.A00(r5)
            X.0wg r4 = r0.A0i
            int r5 = X.AnonymousClass1K2.A02(r5, r4)
            java.lang.String r4 = "createCenterCropView"
            X.7m8 r4 = X.C129436Gy.A00(r3, r4, r5)
            X.C18740tg.A06(r4)
            com.whatsapp.camera.litecamera.LiteCameraView r4 = (com.whatsapp.camera.litecamera.LiteCameraView) r4
            r0.A04 = r4
            r4.setQrScanningEnabled(r1)
            r4 = 2131428552(0x7f0b04c8, float:1.8478752E38)
            android.view.View r10 = X.C012005e.A02(r2, r4)
            X.2y5 r5 = r0.A0Q
            com.whatsapp.camera.litecamera.LiteCameraView r11 = r0.A04
            r4 = 2131428553(0x7f0b04c9, float:1.8478754E38)
            android.widget.FrameLayout r13 = X.C36441kJ.A0T(r2, r4)
            r4 = 2131428551(0x7f0b04c7, float:1.847875E38)
            android.view.View r12 = X.C012005e.A02(r2, r4)
            X.1Mz r4 = r5.A00
            X.0tq r4 = r4.A01
            X.0wG r14 = X.C36351kA.A0W(r4)
            X.35N r9 = new X.35N
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A08 = r9
            X.2y4 r5 = r0.A0P
            r4 = 2131432887(0x7f0b15b7, float:1.8487544E38)
            android.widget.FrameLayout r10 = X.C36441kJ.A0T(r2, r4)
            r4 = 2131432752(0x7f0b1530, float:1.848727E38)
            X.1RJ r17 = X.C36341k9.A0X(r2, r4)
            X.32h r4 = new X.32h
            r4.<init>(r0)
            X.1Mz r5 = r5.A00
            X.0tq r5 = r5.A01
            X.0yC r14 = X.C36341k9.A0V(r5)
            X.17Y r11 = X.C36351kA.A0M(r5)
            X.0yb r12 = X.C36351kA.A0U(r5)
            X.0wG r13 = X.C36351kA.A0W(r5)
            X.0wU r18 = X.C36341k9.A0Z(r5)
            X.0tt r5 = r5.A00
            X.004 r5 = r5.A1z
            java.lang.Object r15 = r5.get()
            X.6KH r15 = (X.AnonymousClass6KH) r15
            X.3Av r9 = new X.3Av
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A09 = r9
            r4 = 2131428532(0x7f0b04b4, float:1.8478711E38)
            android.view.View r11 = X.C012005e.A02(r2, r4)
            X.0ts r5 = r0.A0e
            com.whatsapp.camera.litecamera.LiteCameraView r4 = r0.A04
            int r9 = r0.A0K
            X.3B7 r10 = new X.3B7
            r12 = r4
            r13 = r5
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A07 = r10
            com.whatsapp.WaImageView r5 = r10.A07
            r4 = 43
            X.AnonymousClass3Y5.A00(r5, r0, r4)
            com.whatsapp.WaImageButton r5 = r10.A05
            r4 = 44
            X.AnonymousClass3Y5.A00(r5, r0, r4)
            com.whatsapp.WaImageButton r5 = r10.A06
            r4 = 45
            X.AnonymousClass3Y5.A00(r5, r0, r4)
            android.view.View r5 = r10.A04
            r4 = 46
            X.AnonymousClass3Y5.A00(r5, r0, r4)
            android.view.View r5 = r10.A03
            r4 = 47
            X.AnonymousClass3Y5.A00(r5, r0, r4)
            X.1hi r4 = r0.A0l
            X.08S r10 = X.AnonymousClass0VV.A01(r4)
            X.3a9 r8 = X.C67583a9.A00
            X.08S r11 = X.C36441kJ.A0Y()
            r5 = 4
            X.3Ua r4 = new X.3Ua
            r4.<init>(r8, r11)
            r11.A0F(r10, r4)
            r4 = 2
            X.3Ue r10 = new X.3Ue
            r10.<init>(r0, r4)
            java.lang.Runnable r4 = r0.A0B
            if (r4 == 0) goto L_0x019e
            r4.run()
        L_0x019e:
            r8 = 48
            X.736 r4 = new X.736
            r4.<init>(r0, r11, r10, r8)
            r0.A0B = r4
            r11.A08(r3, r10)
            X.4Wt r8 = new X.4Wt
            r8.<init>(r0, r1)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r4 = r0.A0Y
            r4.A03(r3, r8)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r4 = r0.A0Z
            r4.A03(r3, r8)
            com.whatsapp.camera.litecamera.LiteCameraView r10 = r0.A04
            r4 = 2131428549(0x7f0b04c5, float:1.8478746E38)
            android.view.ViewGroup r8 = X.C36411kG.A0O(r2, r4)
            X.64G r4 = new X.64G
            r4.<init>(r8, r10, r1)
            r0.A05 = r4
            X.3q9 r4 = new X.3q9
            r4.<init>(r0)
            r7.A04 = r4
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r8 = r0.A0X
            X.4Wt r4 = new X.4Wt
            r4.<init>(r0, r6)
            r8.A03(r3, r4)
            X.3e8 r8 = new X.3e8
            r8.<init>(r0)
            X.6cV r4 = new X.6cV
            r4.<init>(r3, r8, r1)
            r0.A03 = r4
            X.35N r10 = r0.A08
            r4 = 10
            X.2s6 r8 = new X.2s6
            r8.<init>(r0, r4)
            android.view.View r4 = r10.A01
            r4.setOnTouchListener(r8)
            com.whatsapp.camera.litecamera.LiteCameraView r8 = r0.A04
            X.4X4 r4 = new X.4X4
            r4.<init>(r0, r1)
            r8.A00 = r4
            com.whatsapp.conversation.conversationrow.MediaProgressRing r8 = r0.A0W
            X.4Ws r4 = new X.4Ws
            r4.<init>(r0, r1)
            r8.A01(r3, r4)
            X.C55902vN.A00(r3)
            X.3B7 r4 = r0.A07
            android.view.View r3 = r4.A01
            r3.setVisibility(r5)
            com.whatsapp.WaImageButton r3 = r4.A05
            r3.setVisibility(r5)
            android.view.View r4 = r0.A0w
            r3 = 0
            if (r9 != r6) goto L_0x021d
            r3 = 8
        L_0x021d:
            r4.setVisibility(r3)
            android.view.View r4 = r0.A0v
            r3 = 4
            if (r9 != r6) goto L_0x0226
            r3 = 0
        L_0x0226:
            r4.setVisibility(r3)
            android.view.View r3 = r0.A0M
            r3.setVisibility(r5)
            r7.A01()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.A03(r3)
            android.view.View r3 = r0.A0t
            r3.setVisibility(r5)
            r2.setVisibility(r1)
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r0.A04
            boolean r2 = r2.BLt()
            r0.A0I = r1
            if (r2 != 0) goto L_0x0256
            X.17Y r4 = r0.A0S
            r3 = 16
            X.3wW r2 = new X.3wW
            r2.<init>((java.lang.Object) r0, (int) r3)
            r4.A0H(r2)
        L_0x0256:
            r0.A0D = r6
            X.7kJ r2 = r0.A0V
            X.3e9 r2 = (X.C69823e9) r2
            X.3fk r2 = r2.A00
            X.C70803fk.A1O(r2, r1)
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r0.A04
            r2.Bok()
            X.35N r4 = r0.A08
            android.view.View r3 = r4.A01
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L_0x027d
            android.view.View r2 = r4.A00
            r1 = 8
            r2.setVisibility(r1)
        L_0x0277:
            r0.A0J = r6
            A01(r0)
            return
        L_0x027d:
            r3.setVisibility(r1)
            goto L_0x0277
        L_0x0281:
            X.14u r2 = r0.A0R
            r1 = 2131889338(0x7f120cba, float:1.9413337E38)
            r2.BO5(r1)
            X.7kJ r0 = r0.A0V
            r0.BSr()
            return
        L_0x028f:
            boolean r2 = A07(r0)
            if (r2 == 0) goto L_0x02a0
            com.whatsapp.ptv.PushToVideoRecordingCountdown r4 = r0.A0j
            android.os.Handler r3 = r4.A08
            r2 = 0
            r3.removeCallbacksAndMessages(r2)
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A01(r4, r1)
        L_0x02a0:
            X.14u r1 = r0.A0R
            X.17Y r0 = r0.A0S
            X.AnonymousClass3US.A06(r1, r0, r8, r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UB.A08():void");
    }

    public void A09(boolean z) {
        AnonymousClass3B7 r3 = this.A07;
        r3.A01.setVisibility(0);
        r3.A04.setVisibility(0);
        r3.A07.setVisibility(C36351kA.A00(r3.A0A ? 1 : 0));
        r3.A05.setVisibility(0);
        this.A0w.setVisibility(8);
        this.A0v.setVisibility(0);
        this.A0k.A06(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r8.A0F != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass3UB r8, java.lang.Runnable r9) {
        /*
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.ptv.PushToVideoRecordingCountdown r2 = r8.A0j
            android.os.Handler r1 = r2.A08
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r0 = 0
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A01(r2, r0)
            r0 = 0
            r2.A01 = r0
        L_0x0016:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x00ac
            X.35N r0 = r8.A08
            r5 = 0
            android.view.View r0 = r0.A01
            r0.setKeepScreenOn(r5)
            X.35N r0 = r8.A08
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r8.A0s
            if (r0 == 0) goto L_0x0038
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0038
            boolean r0 = r8.A0F
            r7 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x00b5
            if (r7 == 0) goto L_0x00b0
            r0 = 4
            X.3vC r3 = X.C80313vC.A00(r8, r9, r0)
            X.17Y r2 = r8.A0S
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.A0I(r3, r0)
            com.whatsapp.camera.litecamera.LiteCameraView r2 = r8.A04
            r1 = 49
            X.736 r0 = new X.736
            r0.<init>(r8, r3, r9, r1)
            r2.A04 = r0
            X.B5t r0 = r2.A0D
            r0.Bv9()
        L_0x005b:
            r6 = 1
            r8.A0F = r6
            X.1hi r0 = r8.A0l
            X.C36341k9.A18(r0, r5)
            X.14u r4 = r8.A0R
            android.view.Window r2 = r4.getWindow()
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.screenBrightness = r0
            r2.setAttributes(r1)
            X.3B7 r3 = r8.A07
            android.view.View r0 = r3.A04
            r2 = 4
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r1 = r3.A07
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0084
            r2 = 8
        L_0x0084:
            r1.setVisibility(r2)
            int r0 = r3.A00
            if (r0 == r6) goto L_0x0090
            android.view.View r0 = r3.A02
            r0.setVisibility(r5)
        L_0x0090:
            r8.A00()
            android.view.View r1 = r8.A0v
            int r0 = r8.A0K
            if (r0 == r6) goto L_0x009a
            r5 = 4
        L_0x009a:
            r1.setVisibility(r5)
            X.0zv r2 = r8.A11
            java.lang.String r1 = "PTVRecording"
            java.lang.String r0 = "End"
            r2.A02(r1, r0)
            r0 = -1
            r4.setRequestedOrientation(r0)
            if (r7 != 0) goto L_0x00af
        L_0x00ac:
            r9.run()
        L_0x00af:
            return
        L_0x00b0:
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r8.A04
            r0.Bv8()
        L_0x00b5:
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r8.A04
            r0.pause()
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UB.A05(X.3UB, java.lang.Runnable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r3 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getAction()
            r2 = 0
            if (r3 == 0) goto L_0x002b
            r1 = 1
            if (r3 == r1) goto L_0x0021
            r0 = 2
            if (r3 == r0) goto L_0x0011
            r0 = 3
            if (r3 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0I
            if (r0 != 0) goto L_0x0010
            X.6QH r1 = r4.A0k
            android.view.View r0 = r4.A0u
            int r0 = r0.getWidth()
            r1.A04(r5, r0, r2)
            return r2
        L_0x0021:
            boolean r0 = r4.A0I
            if (r0 != 0) goto L_0x0010
            X.6QH r0 = r4.A0k
            r0.A07(r1, r2, r2)
            return r2
        L_0x002b:
            X.6QH r1 = r4.A0k
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UB.A0A(android.view.MotionEvent):boolean");
    }

    public AnonymousClass3UB(View view, View view2, View view3, ViewGroup viewGroup, C39501sW r36, C19700wN r37, C57332y4 r38, C57342y5 r39, C225314u r40, C20690y0 r41, AnonymousClass17Y r42, AnonymousClass1XY r43, AnonymousClass1MK r44, C160007kJ r45, C24341Cb r46, C21060yb r47, C19970wo r48, C19630wG r49, C20830yE r50, C19420v0 r51, C18820ts r52, C20060wx r53, C21860zv r54, C20810yC r55, C21010yW r56, C19890wg r57, AnonymousClass3T1 r58, C19770wU r59, C27721Pm r60, List list, int i) {
        int i2;
        this.A11 = r54;
        C19630wG r7 = r49;
        this.A0z = r7;
        C19970wo r8 = r48;
        this.A0d = r8;
        C20810yC r2 = r55;
        this.A0g = r2;
        this.A0S = r42;
        this.A0O = r37;
        this.A0T = r43;
        this.A0o = r59;
        this.A0h = r56;
        this.A0y = r41;
        this.A0f = r53;
        this.A0q = r60;
        this.A0U = r44;
        this.A0c = r47;
        C18820ts r6 = r52;
        this.A0e = r6;
        this.A0b = r46;
        this.A10 = r50;
        this.A0i = r57;
        this.A0P = r38;
        this.A0Q = r39;
        this.A0V = r45;
        this.A0L = r2.A07(3356) * 1000;
        C225314u r12 = r40;
        this.A0R = r12;
        this.A0r = list;
        this.A0M = view;
        this.A0u = view2;
        this.A0t = view3;
        int i3 = i;
        this.A0K = i3;
        this.A0x = r36;
        ViewGroup viewGroup2 = viewGroup;
        this.A0N = viewGroup2;
        this.A0W = (MediaProgressRing) C012005e.A02(viewGroup2, R.id.recording_progress_ring);
        View view4 = this.A0N;
        MediaTimeDisplay mediaTimeDisplay = (MediaTimeDisplay) C012005e.A02(view4, R.id.recording_time_display_locked);
        mediaTimeDisplay.setVisibility(8);
        MediaTimeDisplay mediaTimeDisplay2 = (MediaTimeDisplay) C012005e.A02(view4, R.id.camera_entry_point_recording_time_display_locked);
        if (this.A0K != 1) {
            mediaTimeDisplay2.setVisibility(8);
            mediaTimeDisplay2 = mediaTimeDisplay;
        }
        this.A0Y = mediaTimeDisplay2;
        mediaTimeDisplay2.setVisibility(0);
        View view5 = this.A0N;
        View A022 = C012005e.A02(view5, R.id.recording_time_display_locked_container);
        A022.setVisibility(8);
        View A023 = C012005e.A02(view5, R.id.camera_entry_point_recording_time_display_locked_container);
        A023.setVisibility(8);
        A022 = this.A0K == 1 ? A023 : A022;
        this.A0v = A022;
        A022.setVisibility(0);
        this.A0w = C012005e.A02(this.A0N, R.id.recording_time_display_unlocked_container);
        this.A0Z = (MediaTimeDisplay) C012005e.A02(this.A0N, R.id.recording_time_display_unlocked);
        this.A06 = r58;
        this.A0j = (PushToVideoRecordingCountdown) C012005e.A02(this.A0N, R.id.recording_countdown);
        this.A0X = (MediaTimeDisplay) C012005e.A02(this.A0N, R.id.playback_time_display);
        ImageView A0G2 = C36401kF.A0G(this.A0N, R.id.voice_note_btn_slider);
        if (i3 == 1) {
            i2 = R.drawable.camera_entry_point_input_camera_white;
        } else {
            boolean z = C222013h.A07;
            i2 = R.drawable.input_camera_white_large;
            if (z) {
                i2 = R.drawable.input_camera_white_large_filled_wds;
            }
        }
        A0G2.setImageResource(i2);
        ImageView imageView = A0G2;
        this.A0k = new AnonymousClass6QH(r12, C012005e.A02(this.A0N, R.id.voice_note_slide_to_cancel_scroller), C012005e.A02(this.A0N, R.id.voice_note_slide_to_cancel_layout), C012005e.A02(this.A0N, R.id.voice_note_slide_to_cancel_animation), C012005e.A02(this.A0N, R.id.voice_cancel_trashcan), C012005e.A02(this.A0N, R.id.voice_cancel_animation), C012005e.A02(this.A0N, R.id.voice_cancel_trashcan_lid), C012005e.A02(this.A0N, R.id.voice_note_layout), C36411kG.A0O(this.A0N, R.id.voice_note_lock_container), imageView, C36391kE.A0O(this.A0N, R.id.voice_note_slide_to_cancel), r8, r7, r51, r6, new C77233qA(this), r12.getResources().getDimension(R.dimen.f7nameremoved), i3, true);
        this.A12 = r2.A0E(6847);
        this.A0s = r2.A0E(6885);
    }
}
