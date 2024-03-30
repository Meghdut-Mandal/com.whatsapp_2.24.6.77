package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.6YT  reason: invalid class name */
public class AnonymousClass6YT {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public SoundPool A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public C225314u A0A;
    public C135316cV A0B;
    public C161087m8 A0C;
    public C92104d8 A0D;
    public AnonymousClass6WU A0E;
    public AnonymousClass6F9 A0F;
    public C1256160p A0G;
    public AnonymousClass64G A0H;
    public AnonymousClass6OO A0I;
    public AnonymousClass147 A0J;
    public File A0K;
    public String A0L;
    public List A0M = Collections.emptyList();
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q = true;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T;
    public boolean A0U;
    public Integer A0V;
    public boolean A0W;
    public final long A0X;
    public final AnonymousClass02E A0Y;
    public final C20690y0 A0Z;
    public final AnonymousClass17Y A0a;
    public final C106835Ln A0b;
    public final AnonymousClass16L A0c;
    public final AnonymousClass1MK A0d;
    public final C119455pq A0e;
    public final AnonymousClass1Q4 A0f;
    public final C128886Dz A0g;
    public final C121475tC A0h;
    public final C132726Uz A0i;
    public final C133106Wu A0j;
    public final C64953Qc A0k;
    public final C21060yb A0l;
    public final C19970wo A0m;
    public final C19630wG A0n;
    public final C19420v0 A0o;
    public final C18820ts A0p;
    public final C20810yC A0q;
    public final AnonymousClass6N7 A0r;
    public final C19890wg A0s;
    public final C64783Pk A0t;
    public final C1270866x A0u;
    public final C19770wU A0v;
    public final AnonymousClass1NK A0w = new C163667qZ(this, 1);
    public final C27721Pm A0x;
    public final Runnable A0y = new C81323wp(this, 1);
    public final boolean A0z;
    public final boolean A10;
    public final /* synthetic */ C125075zH A11;
    public final /* synthetic */ C160007kJ A12;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009d, code lost:
        if (r12 == 5) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(android.graphics.Bitmap r19, X.AnonymousClass02E r20, X.AnonymousClass4V2 r21, java.util.Collection r22, java.util.List r23, int r24, boolean r25) {
        /*
            r18 = this;
            r10 = 0
            r9 = 0
            r8 = 1
            r0 = 4
            r7 = r18
            r15 = r22
            r11 = r24
            r4 = r25
            if (r11 != r0) goto L_0x011e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            X.6Uz r2 = r7.A0i
            int r0 = r15.size()
            r2.A04(r4, r0)
        L_0x001b:
            X.6Dz r6 = r7.A0g
            boolean r5 = r6.A02(r15)
            int r12 = r7.A02
            int r0 = r15.size()
            int r12 = r12 - r0
            if (r12 != 0) goto L_0x0046
            boolean r0 = r7.A0S
            if (r0 != 0) goto L_0x0046
            X.0yC r4 = r7.A0q
            r3 = 2693(0xa85, float:3.774E-42)
            int r2 = r4.A07(r3)
            r0 = 2614(0xa36, float:3.663E-42)
            int r0 = r4.A07(r0)
            int r2 = r2 - r0
            int r12 = r12 + r2
            int r0 = r4.A07(r3)
            r7.A02 = r0
            r7.A0S = r8
        L_0x0046:
            java.util.ArrayList r4 = X.C36441kJ.A15(r15)
            X.14u r0 = r7.A0A
            java.lang.String r3 = "Host activity is NULL"
            java.util.Objects.requireNonNull(r0, r3)
            X.3FR r2 = new X.3FR
            r2.<init>(r0)
            r2.A0H = r4
            java.util.List r0 = r7.A0M
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r0)
            r2.A0G = r0
            java.util.Set r0 = r6.A09
            int r0 = r0.size()
            int r12 = r12 - r0
            r2.A01 = r12
            boolean r0 = r7.A0S
            r2.A0Q = r0
            X.7kJ r14 = r7.A12
            int r0 = r14.BEh()
            int r0 = X.AnonymousClass3LY.A00(r1, r0, r5)
            r2.A02 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r12 = r7.A0X
            long r0 = r0 - r12
            r2.A05 = r0
            long r0 = r7.A03
            r2.A07 = r0
            X.147 r0 = r7.A0J
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r2.A0E = r0
            boolean r0 = r7.A0P
            r2.A0K = r0
            r2.A0L = r5
            int r12 = r14.BEh()
            r0 = 4
            if (r12 == r0) goto L_0x009f
            r1 = 5
            r0 = 1
            if (r12 != r1) goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r2.A0M = r0
            r0 = 2
            if (r11 != r0) goto L_0x00c7
            X.14u r0 = r7.A0A
            java.util.Objects.requireNonNull(r0, r3)
            boolean r0 = r0 instanceof com.whatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x0117
            r1 = 2131428553(0x7f0b04c9, float:1.8478754E38)
            android.view.View r0 = r7.A09
            android.view.View r1 = X.C012005e.A02(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            int r0 = r0.topMargin
            r2.A03 = r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            int r0 = r0.bottomMargin
            r2.A00 = r0
        L_0x00c7:
            r14.BEh()
            r14.BEh()
            int r1 = r14.BEh()
            r0 = 17
            if (r1 != r0) goto L_0x010a
            r2.A0N = r9
            r2.A0P = r9
            r2.A0I = r8
            r2.A0O = r8
        L_0x00dd:
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x0183
            java.lang.Object r1 = r4.get(r9)
            android.net.Uri r1 = (android.net.Uri) r1
            java.util.List r12 = r7.A0N
            java.lang.String r11 = r7.A0L
            X.6Tg r0 = r6.A03
            java.util.Map r0 = r0.A00
            java.util.ArrayList r0 = X.C90494aF.A0g(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x00f7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r4.next()
            X.6QO r0 = (X.AnonymousClass6QO) r0
            r0.A0H(r10)
            r0.A0J(r10)
            goto L_0x00f7
        L_0x010a:
            int r1 = r14.BEh()
            r0 = 14
            boolean r0 = X.C36381kD.A1U(r1, r0)
            r2.A0N = r0
            goto L_0x00dd
        L_0x0117:
            int r0 = r7.A01
            r2.A03 = r0
            r2.A00 = r0
            goto L_0x00c7
        L_0x011e:
            r0 = 3
            if (r11 != r0) goto L_0x015f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            X.6Uz r3 = r7.A0i
            int r5 = r15.size()
            boolean r0 = X.C132726Uz.A02(r3)
            if (r0 == 0) goto L_0x001b
            X.58n r2 = new X.58n
            r2.<init>()
            X.1Xu r0 = r3.A01
            java.lang.Long r0 = r0.A00
            r2.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.A03 = r0
            java.lang.Integer r0 = X.C36371kC.A0n()
            r2.A09 = r0
            int r0 = X.C36371kC.A00(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r5)
            r2.A0F = r0
            X.0yW r0 = r3.A00
            r0.Blv(r2)
            goto L_0x001b
        L_0x015f:
            r1 = r10
            goto L_0x001b
        L_0x0162:
            X.6Tg r0 = r6.A03
            X.6QO r4 = r0.A03(r1)
            if (r12 == 0) goto L_0x017a
            X.1YL r1 = r6.A07
            java.lang.String r0 = r4.A0D()
            r1.A01(r0, r12)
            java.lang.String r0 = r4.A0D()
            r4.A0J(r0)
        L_0x017a:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0183
            r4.A0H(r11)
        L_0x0183:
            java.lang.Integer r0 = r7.A0V
            r2.A0B = r0
            X.6Tg r1 = r6.A03
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            X.C132366Tg.A02(r0, r1)
            r2.A09 = r0
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x01e7
            int r0 = r15.size()
            if (r0 != r8) goto L_0x01e7
            r6 = r23
            if (r23 == 0) goto L_0x01e7
            r11 = r19
            if (r19 == 0) goto L_0x01e7
            if (r21 == 0) goto L_0x01e7
            long r16 = r21.getContentLength()
            r12 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x01e7
            java.util.Iterator r0 = r15.iterator()
            java.lang.Object r1 = r0.next()
            android.net.Uri r1 = (android.net.Uri) r1
            r2.A08 = r1
            X.16L r0 = r7.A0c
            X.1SZ r4 = r0.A02()
            java.lang.StringBuilder r1 = X.C36381kD.A11(r1)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r4.A0D(r0, r11)
            X.14u r1 = r7.A0A
            java.util.Objects.requireNonNull(r1, r3)
            X.00I[] r0 = new X.AnonymousClass00I[r9]
            java.lang.Object[] r0 = r6.toArray(r0)
            X.00I[] r0 = (X.AnonymousClass00I[]) r0
            X.0Gb r0 = X.AnonymousClass0YW.A01(r1, r0)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r10 = r0.toBundle()
        L_0x01e7:
            android.content.Intent r1 = r2.A01()
            r0 = 101(0x65, float:1.42E-43)
            r2 = r20
            r2.A0t(r1, r0, r10)
            if (r5 == 0) goto L_0x0205
            int r0 = r15.size()
            if (r0 != r8) goto L_0x0205
            X.14u r1 = r7.A0A
            java.util.Objects.requireNonNull(r1, r3)
            r0 = 2130772017(0x7f010031, float:1.714714E38)
            r1.overridePendingTransition(r0, r9)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YT.A0R(android.graphics.Bitmap, X.02E, X.4V2, java.util.Collection, java.util.List, int, boolean):void");
    }

    public static int A00(AnonymousClass6YT r3) {
        int i = 0;
        if (!r3.A0z && r3.A0D != null) {
            C21050ya A0O2 = r3.A0l.A0O();
            C18740tg.A06(A0O2);
            if (Settings.System.getInt(A0O2.A00, "accelerometer_rotation", 0) == 0 && r3.A0D.A00 != -1) {
                C225314u r1 = r3.A0A;
                Objects.requireNonNull(r1, "Host activity is NULL");
                i = ((r3.A0D.A00 - ((4 - r1.getWindowManager().getDefaultDisplay().getRotation()) % 4)) * 90) % 360;
                while (i < 0) {
                    i += 360;
                }
            }
        }
        return i;
    }

    public static int A01(AnonymousClass6YT r1) {
        if (AnonymousClass000.A1S(r1.A0g.A00, 2)) {
            return 18;
        }
        return 17;
    }

    private void A02() {
        C225314u r9 = this.A0A;
        if (r9 != null) {
            C21060yb r8 = this.A0l;
            C18820ts r7 = this.A0p;
            Set set = this.A0g.A09;
            long size = (long) set.size();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L2, set.size(), 0);
            C33521fV.A00(r9, r8, r7.A0L(A0L2, R.plurals.f10nameremoved, size));
        }
    }

    private void A03(int i) {
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(this.A05);
        A0a2.setMargins(0, i, 0, A0a2.bottomMargin);
        this.A05.setLayoutParams(A0a2);
        View A022 = C012005e.A02(this.A09, R.id.gallery_container);
        C36341k9.A0z(A022, A022.getPaddingLeft(), i);
    }

    public static void A05(AnonymousClass6YT r0) {
        C41041wW r02;
        AnonymousClass6F9 r03 = r0.A0F;
        if (r03 != null && (r02 = r03.A04) != null) {
            r02.A06();
        }
    }

    public static void A06(AnonymousClass6YT r3) {
        AnonymousClass6F9 r0;
        C128886Dz r2 = r3.A0g;
        if (r2.A01 == 1 && (r0 = r3.A0F) != null) {
            AnimatorSet animatorSet = r0.A00;
            if (animatorSet == null || !animatorSet.isStarted()) {
                r2.A01 = 2;
                A0C(r3);
                r3.A0F.A02(false);
            }
        }
    }

    public static void A07(AnonymousClass6YT r10) {
        C225314u r6;
        C92104d8 r0;
        if (r10.A0f.A00.A0C()) {
            Log.i("cameraui/startvideocapture");
            C128886Dz r5 = r10.A0g;
            Set set = r5.A09;
            if (set.size() >= r10.A02) {
                r10.A02 = r10.A0q.A07(2693);
            }
            int size = set.size();
            int i = r10.A02;
            boolean z = true;
            if (size >= i) {
                AnonymousClass17Y r52 = r10.A0a;
                C19630wG r2 = r10.A0n;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, i, 0);
                r52.A0E(r2.A02(R.string.f12nameremoved, objArr), 0);
            } else if (r10.A0d.A03()) {
                r10.A0a.A06(R.string.f12nameremoved, 1);
                r10.A12.BSr();
            } else {
                C133106Wu r22 = r10.A0j;
                if (r22.A0A) {
                    r22.A08.markerStart(554249147);
                    C133106Wu.A03(r22, "start_video_capture", 554249147);
                }
                C20690y0 r8 = r10.A0Z;
                C19890wg r7 = r10.A0s;
                C25471Gl r62 = C25471Gl.A0i;
                int i2 = 1;
                if (r10.A0q.A0E(401)) {
                    i2 = 4;
                }
                r10.A0K = AnonymousClass3RU.A00(r8, r7, r62, ".mp4", i2);
                if (!r10.A10 && (r0 = r10.A0D) != null) {
                    r0.disable();
                }
                int A002 = A00(r10);
                if (r10.A0C.BQ2() && (r6 = r10.A0A) != null) {
                    AnonymousClass6WU r1 = r10.A0E;
                    Objects.requireNonNull(r6, "Host activity is NULL");
                    Window window = r6.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    View view = r1.A0B;
                    view.setVisibility(0);
                    view.setBackgroundColor(-855638017);
                    attributes.screenBrightness = 1.0f;
                    window.setAttributes(attributes);
                }
                boolean A1S = AnonymousClass000.A1S(r5.A00, 2);
                AnonymousClass6WU r9 = r10.A0E;
                if (A1S) {
                    AnonymousClass6WU.A01(r9, 1.0f, 1.25f);
                } else {
                    HashMap hashMap = AnonymousClass6WU.A0N;
                    r9.A0H.setActivated(true);
                    float[] A0v2 = C90524aI.A0v();
                    C90484aE.A1O(A0v2, 1.0f, 0.6f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v2);
                    ofFloat.setDuration(220);
                    ofFloat.setInterpolator(AnonymousClass6WU.A0M);
                    C111565cU.A00(ofFloat, r9, 18);
                    ofFloat.start();
                    AnonymousClass6WU.A01(r9, 1.0f, 2.0f);
                    r10.A0E.A0H.setPressed(false);
                }
                r10.A08.setKeepScreenOn(true);
                r22.A05 = SystemClock.elapsedRealtime();
                C161087m8 r23 = r10.A0C;
                File file = r10.A0K;
                if (r23.BLt()) {
                    A002 = 360 - A002;
                }
                r23.Buy(file, A002);
                AnonymousClass6OO r72 = r10.A0I;
                boolean A1S2 = AnonymousClass000.A1S(r5.A00, 2);
                r72.A00 = System.currentTimeMillis();
                r72.A04.sendEmptyMessage(0);
                r72.A01(true, true, !A1S2);
                AnonymousClass6WU r12 = r10.A0E;
                if (!AnonymousClass000.A1S(r5.A00, 2) || !r10.A0z) {
                    z = false;
                }
                r12.A04(z);
                r10.A0G.A00.setVisibility(4);
                A0J(r10, false);
                AnonymousClass3T3.A03(r10.A0l);
            }
        } else {
            r10.A0E.A02();
            C225314u r3 = r10.A0A;
            Objects.requireNonNull(r3, "Host activity is NULL");
            C225314u r02 = r10.A0A;
            Objects.requireNonNull(r02, "Host activity is NULL");
            AnonymousClass3FM r13 = new AnonymousClass3FM(r02);
            r13.A01 = R.drawable.permission_mic;
            r13.A02 = R.string.f12nameremoved;
            r13.A0A = null;
            r13.A03 = R.string.f12nameremoved;
            r13.A08 = null;
            r13.A0C = new String[]{"android.permission.RECORD_AUDIO"};
            r3.startActivity(r13.A02());
        }
    }

    public static void A09(AnonymousClass6YT r10) {
        int i;
        DisplayCutout displayCutout;
        C225314u r0 = r10.A0A;
        if (r0 == null || AnonymousClass000.A0U(r0).screenWidthDp < 600) {
            View A022 = C012005e.A02(r10.A09, R.id.camera_mode_tab_layout);
            View A023 = C012005e.A02(r10.A09, R.id.camera_view_holder);
            Rect A062 = AnonymousClass001.A06();
            Rect A063 = AnonymousClass001.A06();
            A023.getLocalVisibleRect(A062);
            A023.getGlobalVisibleRect(A062);
            r10.A09.getLocalVisibleRect(A063);
            r10.A09.getGlobalVisibleRect(A063);
            int measuredHeight = A022.getMeasuredHeight();
            int measuredHeight2 = (r10.A09.getMeasuredHeight() - A023.getMeasuredHeight()) - measuredHeight;
            C225314u r1 = r10.A0A;
            Objects.requireNonNull(r1, "Host activity is NULL");
            int i2 = 0;
            if (!(r1 instanceof CameraActivity)) {
                if (!A0M(r10)) {
                    i2 = A062.top;
                }
                r10.A01 = A062.top;
                A04(A022, -1, i2);
                int i3 = i2 + measuredHeight;
                A0D(r10, i3);
                A0E(r10, i3);
            } else if (measuredHeight2 >= 0) {
                if (measuredHeight2 > measuredHeight) {
                    i2 = measuredHeight2 / 2;
                }
                int i4 = A062.top;
                int i5 = (i4 - (measuredHeight - i4)) - i2;
                if (!C19550w8.A05() || (displayCutout = r10.A09.getRootWindowInsets().getDisplayCutout()) == null || displayCutout.getSafeInsetTop() <= i5) {
                    i = i5;
                } else {
                    i = displayCutout.getSafeInsetTop();
                }
                int i6 = measuredHeight + i2;
                A04(A022, R.id.camera_actions, i2);
                r10.A03(i);
                A0D(r10, i6);
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(A023);
                A0a2.setMargins(0, i5, 0, i6);
                A023.setLayoutParams(A0a2);
                A0E(r10, i6);
            } else {
                int i7 = A063.bottom - A062.bottom;
                A04(A022, -1, i7);
                r10.A03(A062.top);
                int i8 = i7 + measuredHeight;
                A0D(r10, i8);
                A0E(r10, i8);
            }
        }
    }

    public static void A0A(AnonymousClass6YT r8) {
        Log.i("cameraui/takepicture");
        if (r8.A0U && r8.A04 != null) {
            if (r8.A0q.A0E(4959)) {
                C106835Ln r1 = r8.A0b;
                SoundPool soundPool = r8.A04;
                int i = r8.A00;
                AnonymousClass00C.A0D(soundPool, 0);
                r1.execute(new AnonymousClass73O(soundPool, (WeakReference) null, 1.0f, 1.0f, i));
            } else {
                r8.A04.play(r8.A00, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
        Set set = r8.A0g.A09;
        if (set.size() >= r8.A02) {
            r8.A02 = r8.A0q.A07(2693);
        }
        int size = set.size();
        int i2 = r8.A02;
        if (size >= i2) {
            AnonymousClass17Y r3 = r8.A0a;
            C19630wG r2 = r8.A0n;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, i2, 0);
            r3.A0E(r2.A02(R.string.f12nameremoved, objArr), 0);
            return;
        }
        C133106Wu r22 = r8.A0j;
        r22.A00 = SystemClock.elapsedRealtime();
        if (r22.A0A) {
            r22.A08.markerStart(554240366);
        }
        AnonymousClass6WU r12 = r8.A0E;
        r12.A0H.setEnabled(false);
        r12.A0I.setEnabled(false);
        r12.A0F.setEnabled(false);
        if (r8.A0F != null && !C90514aH.A1a(set)) {
            r8.A0F.A01();
            r8.A0E.A04(false);
            r8.A0G.A00.setVisibility(4);
        }
        if (r8.A0C.BQ2()) {
            C225314u r23 = r8.A0A;
            if (r23 != null) {
                AnonymousClass6WU r13 = r8.A0E;
                Objects.requireNonNull(r23, "Host activity is NULL");
                Window window = r23.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                View view = r13.A0B;
                view.setVisibility(0);
                view.setBackgroundColor(-3886);
                attributes.screenBrightness = 1.0f;
                window.setAttributes(attributes);
            }
            r8.A08.postDelayed(new C81323wp(r8, 0), 300);
            return;
        }
        A0B(r8);
    }

    public static void A0B(AnonymousClass6YT r3) {
        r3.A0C.BvW(new C1268165s(r3), AnonymousClass000.A1R(r3.A0g.A09.size()));
    }

    public static void A0C(AnonymousClass6YT r6) {
        int i;
        int i2;
        int A012;
        AnonymousClass6F9 r2 = r6.A0F;
        if (r2 != null) {
            AnonymousClass6WU r4 = r6.A0E;
            boolean A1O = AnonymousClass000.A1O(r6.A0g.A01);
            View view = r2.A02;
            if (view != null) {
                i = view.getMeasuredHeight();
            } else {
                i = 0;
            }
            if (!r4.A05.A01) {
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(r4.A0C);
                ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(r4.A0I);
                int i3 = A0a2.bottomMargin;
                if (A1O) {
                    A012 = i + i3;
                    i2 = C65103Qt.A01(r4.A09, 8.0f);
                } else {
                    i2 = A0a3.bottomMargin + A0a2.height;
                    A012 = C65103Qt.A01(r4.A09, 8.0f);
                }
                int i4 = A012 + i2;
                int[] A1O2 = C36441kJ.A1O();
                A1O2[0] = i3;
                A1O2[1] = i4;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1O2);
                C90494aF.A0q(ofInt);
                ofInt.addUpdateListener(new C110885bO(r4, A0a2, 3));
                ofInt.setDuration(150);
                ofInt.start();
            }
        }
    }

    public static void A0D(AnonymousClass6YT r3, int i) {
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(r3.A05);
        A0a2.setMargins(0, A0a2.topMargin, 0, i);
        r3.A05.setLayoutParams(A0a2);
    }

    public static void A0E(AnonymousClass6YT r4, int i) {
        AnonymousClass6F9 r3 = r4.A0F;
        if (r3 != null) {
            r3.A0B.A0Y(C36441kJ.A06(C36421kH.A0B(r4.A0n), R.dimen.f7nameremoved, i) + r3.A0A.getMeasuredHeight(), false);
        }
    }

    public static void A0F(AnonymousClass6YT r7, AnonymousClass4V2 r8) {
        if (r8 != null) {
            C128886Dz r4 = r7.A0g;
            r4.A05 = AnonymousClass143.A0L(r7.A0M);
            Uri B7k = r8.B7k();
            C20810yC r3 = r7.A0q;
            Set set = r4.A09;
            int i = 1;
            if (set.contains(B7k)) {
                set.remove(B7k);
                r4.A03.A00.remove(B7k);
            } else {
                int A072 = r3.A07(2614);
                if (set.size() >= A072) {
                    A072 = r3.A07(2693);
                }
                if ((!r4.A05 || set.size() < 1 || r3.A0E(5643)) && set.size() < A072) {
                    set.add(B7k);
                    if (set.size() > 1) {
                        r4.A04 = true;
                    }
                    r4.A03.A06(new AnonymousClass6QO(B7k));
                } else {
                    if (!r4.A05 || r3.A0E(5643)) {
                        i = r7.A02;
                    }
                    AnonymousClass17Y r42 = r7.A0a;
                    Resources A0B2 = C36421kH.A0B(r7.A0n);
                    Object[] A0L2 = AnonymousClass001.A0L();
                    r42.A0E(A0B2.getQuantityString(R.plurals.f10nameremoved, i, A0L2), C36361kB.A1b(A0L2, i) ? 1 : 0);
                }
            }
            if (C90514aH.A1a(set)) {
                r7.A02();
            }
            C90504aG.A1B(r7.A0E, set);
            A05(r7);
        }
    }

    public static void A0G(AnonymousClass6YT r5, AnonymousClass4V2 r6, AnonymousClass2Ty r7, boolean z) {
        if (r6 == null) {
            Log.i("cameraui/showpreview/media-is-null");
            return;
        }
        Uri B7k = r6.B7k();
        C36321k7.A1K(B7k, "cameraui/showpreview ", AnonymousClass000.A0u());
        C225314u r0 = r5.A0A;
        if (r0 != null && !r0.BLh()) {
            if (z) {
                r5.A0g.A08.add(0, r6);
            }
            C128886Dz r4 = r5.A0g;
            r4.A03.A06(new AnonymousClass6QO(B7k));
            Set set = r4.A09;
            if (set.size() > 0) {
                set.add(B7k);
                if (set.size() > 1) {
                    r4.A04 = true;
                }
                A05(r5);
                r5.A0E.A05(true, set.size());
                r5.A02();
                r5.A0C.Boh();
                A0J(r5, true);
                return;
            }
            A0H(r5, r7, Collections.singletonList(B7k));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0067, code lost:
        if (r1.A09.size() != 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(X.AnonymousClass6YT r8, X.AnonymousClass2Ty r9, java.util.Collection r10) {
        /*
            boolean r0 = X.AnonymousClass3U9.A00
            r7 = 0
            r2 = r8
            if (r0 == 0) goto L_0x0076
            if (r9 == 0) goto L_0x0076
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = X.C011004s.A03(r9)
            X.C36341k9.A1H(r9, r0, r7)
            r1 = 2131430736(0x7f0b0d50, float:1.8483181E38)
            android.view.View r0 = r8.A09
            android.view.View r1 = X.C012005e.A02(r0, r1)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            r1 = 2131430379(0x7f0b0beb, float:1.8482457E38)
            android.view.View r0 = r8.A09
            android.view.View r1 = X.C012005e.A02(r0, r1)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            r1 = 2131430289(0x7f0b0b91, float:1.8482275E38)
            android.view.View r0 = r8.A09
            android.view.View r1 = X.C012005e.A02(r0, r1)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            r1 = 2131433833(0x7f0b1969, float:1.8489463E38)
            android.view.View r0 = r8.A09
            android.view.View r1 = X.C012005e.A02(r0, r1)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            android.graphics.Bitmap r3 = r9.A06
            X.4V2 r5 = r9.A08
        L_0x0057:
            X.6Dz r1 = r8.A0g
            r6 = r10
            boolean r0 = r1.A02(r10)
            if (r0 == 0) goto L_0x0069
            java.util.Set r0 = r1.A09
            int r0 = r0.size()
            r8 = 2
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r8 = 3
        L_0x006a:
            X.02E r4 = r2.A0Y
            java.util.Set r0 = r1.A09
            boolean r9 = X.C90514aH.A1a(r0)
            r2.A0R(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0076:
            r3 = r7
            r5 = r7
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YT.A0H(X.6YT, X.2Ty, java.util.Collection):void");
    }

    public static void A0I(AnonymousClass6YT r4, ArrayList arrayList) {
        C128886Dz r3 = r4.A0g;
        r3.A04 = true;
        Set set = r3.A09;
        set.clear();
        if (arrayList != null) {
            set.addAll(arrayList);
        }
        r4.A0W = true;
        C90504aG.A1B(r4.A0E, set);
        if (r3.A01 != 1) {
            A0C(r4);
        }
        A05(r4);
        r4.A0O();
        r4.A0i.A03(9);
    }

    public static void A0J(AnonymousClass6YT r3, boolean z) {
        AnonymousClass6F9 r0 = r3.A0F;
        if (r0 != null) {
            r0.A03(z);
            AnonymousClass6WU r2 = r3.A0E;
            Set set = r3.A0g.A09;
            r2.A05(z & C90514aH.A1a(set), set.size());
        }
    }

    public static void A0K(AnonymousClass6YT r13, boolean z) {
        StringBuilder A0u2;
        AnonymousClass3T3.A03(r13.A0l);
        C133106Wu r4 = r13.A0j;
        C133106Wu.A02(r4, "video_record", 554249147);
        C36321k7.A1X("cameraui/stopvideocapture ", AnonymousClass000.A0u(), z);
        r13.A08.setKeepScreenOn(false);
        r4.A06 = SystemClock.elapsedRealtime();
        C133106Wu.A03(r4, "stop_video_recording", 554249147);
        r13.A0C.Bv8();
        C132726Uz r5 = r13.A0i;
        boolean BLt = r13.A0C.BLt();
        C132726Uz.A01(r5, r13.A0C.getFlashMode(), r13.A0C.getZoomLevel(), 2, SystemClock.elapsedRealtime() - r4.A05, BLt, A0M(r13));
        Integer valueOf = Integer.valueOf(r13.A0C.getCameraApi());
        C161087m8 r0 = r13.A0C;
        int cameraType = r0.getCameraType();
        boolean z2 = !r0.BLt();
        String l = Long.toString(r13.A0C.getVideoResolution());
        long elapsedRealtime = SystemClock.elapsedRealtime() - r4.A06;
        long j = r4.A04;
        AnonymousClass585 r9 = new AnonymousClass585();
        r9.A02 = Integer.valueOf(cameraType);
        r9.A00 = valueOf;
        r9.A01 = Integer.valueOf(z2 ? 1 : 0);
        r9.A05 = l;
        r9.A03 = Long.valueOf(j);
        r9.A04 = Long.valueOf(elapsedRealtime);
        if (r4.A09) {
            r4.A07.Bly(r9);
        }
        boolean z3 = r4.A0A;
        if (z3) {
            C133106Wu.A02(r4, "stop_video_recording", 554249147);
            C133106Wu.A01(r4, valueOf, 554249147, cameraType);
            C133106Wu.A00(r4, 554249147, z2);
        }
        C225314u r2 = r13.A0A;
        if (r2 != null) {
            AnonymousClass6WU r1 = r13.A0E;
            Objects.requireNonNull(r2, "Host activity is NULL");
            Window window = r2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            r1.A0B.setVisibility(4);
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
            if (!z) {
                r13.A0E.A02();
                r13.A0I.A01(AnonymousClass000.A1S(r13.A0g.A00, 2), false, false);
                AnonymousClass6OO r22 = r13.A0I;
                Handler handler = r22.A04;
                handler.removeMessages(0);
                handler.removeMessages(1);
                r22.A01(false, false, false);
                C92104d8 r02 = r13.A0D;
                if (r02 != null) {
                    r02.enable();
                }
            }
        }
        if (!z || r13.A0K == null) {
            File file = r13.A0K;
            if (file == null || !file.exists()) {
                A0u2 = AnonymousClass000.A0u();
                A0u2.append("cameraui/video file doesn't exist: ");
                A0u2.append(r13.A0K);
            } else {
                if (!r13.A0K.delete()) {
                    A0u2 = AnonymousClass000.A0u();
                    A0u2.append("cameraui/failed to delete video ");
                    A0u2.append(r13.A0K.getAbsolutePath());
                }
                r13.A0K = null;
                r13.A0O();
            }
            C90504aG.A1G(A0u2);
            r13.A0K = null;
            r13.A0O();
        } else {
            C133106Wu.A03(r4, "show_media_preview", 554249147);
            A0G(r13, new C145656uJ(r13.A0K), (AnonymousClass2Ty) null, true);
            C133106Wu.A02(r4, "show_media_preview", 554249147);
        }
        if (z3) {
            r4.A08.markerEnd(554249147, 2);
        }
    }

    public static void A0L(AnonymousClass6YT r4, boolean z) {
        AnonymousClass6WU r3 = r4.A0E;
        float f = 2.0f;
        if (r3.A07) {
            f = 1.25f;
        }
        AnonymousClass6WU.A01(r3, f, 1.0f);
        r4.A08.postDelayed(new AnonymousClass75B(19, (Object) r4, z), 220);
    }

    public static boolean A0M(AnonymousClass6YT r1) {
        return AnonymousClass000.A1S(C36341k9.A04(r1.A0n.A00), 2);
    }

    public void A0N() {
        this.A0u.A02(C36421kH.A0U(), 1, A01(this));
        boolean A0S2 = A0S();
        boolean A1S = AnonymousClass000.A1S(this.A0g.A00, 2);
        if (A0S2) {
            if (A1S) {
                A0L(this, this.A0I.A02());
            }
        } else if (A1S) {
            A07(this);
        } else {
            A0A(this);
        }
    }

    public void A0O() {
        Log.i("cameraui/restoreui");
        A0J(this, true);
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        boolean BLy = this.A0C.BLy();
        if (!BLy) {
            this.A08.requestLayout();
            C164757sK.A00(this.A08.getViewTreeObserver(), this, 5);
        }
        this.A0I.A01(AnonymousClass000.A1S(this.A0g.A00, 2), A0S(), false);
        AnonymousClass6WU r4 = this.A0E;
        A0M(this);
        WaImageView waImageView = r4.A0H;
        waImageView.setVisibility(0);
        waImageView.setEnabled(BLy);
        CircularProgressBar circularProgressBar = r4.A04;
        if (circularProgressBar != null) {
            circularProgressBar.setVisibility(0);
        }
        WaImageView waImageView2 = r4.A0I;
        waImageView2.setEnabled(BLy);
        boolean z = true;
        boolean A1Q = AnonymousClass000.A1Q(waImageView2.getVisibility());
        waImageView2.setVisibility(C36351kA.A00(r4.A0K ? 1 : 0));
        boolean A1Q2 = AnonymousClass000.A1Q(waImageView2.getVisibility());
        if (!A1Q && A1Q2) {
            waImageView2.startAnimation(r4.A02);
        }
        WaImageView waImageView3 = r4.A0F;
        waImageView3.setEnabled(BLy);
        boolean A1Q3 = AnonymousClass000.A1Q(waImageView3.getVisibility());
        AnonymousClass6WU.A00(r4);
        if (waImageView3.getVisibility() != 0) {
            z = false;
        }
        if (!A1Q3 && z) {
            waImageView3.startAnimation(r4.A02);
        }
        r4.A0G.setVisibility(r4.A05.A00);
        WaImageView waImageView4 = r4.A0E;
        if (waImageView4 != null) {
            waImageView4.setVisibility(0);
        }
        AnonymousClass6F9 r0 = this.A0F;
        if (r0 != null && r0.A0B.A0J != 3) {
            this.A0G.A00.setVisibility(0);
        }
    }

    public void A0P() {
        int i;
        View view;
        C133106Wu r2 = this.A0j;
        C160007kJ r5 = this.A12;
        C133106Wu.A04(r2, "warm", AnonymousClass3LY.A01(r5.BEh()));
        C133106Wu.A03(r2, "showCamera", 554251647);
        C225314u r4 = this.A0A;
        if (r4 != null) {
            AnonymousClass1RC.A06(r4, C224514j.A00(r4, R.attr.f4nameremoved, R.color.f6nameremoved), 2);
            if (!AnonymousClass6YG.A02() || !this.A0d.A03()) {
                this.A0O = true;
                C92104d8 r0 = this.A0D;
                if (r0 != null) {
                    r0.enable();
                }
                r2.A02 = SystemClock.elapsedRealtime();
                C132726Uz r1 = this.A0i;
                switch (r5.BEh()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 14;
                        break;
                    default:
                        i = 1;
                        break;
                }
                r1.A03(i);
                this.A0C.Bok();
                this.A08.removeCallbacks(this.A0y);
                int i2 = 0;
                this.A06.setVisibility(0);
                this.A0G.A00.setVisibility(0);
                if (this.A08.getVisibility() == 0) {
                    view = this.A07;
                    i2 = 8;
                } else {
                    view = this.A08;
                }
                view.setVisibility(i2);
                A0J(this, true);
                this.A0Y.A1V(true);
                C133106Wu.A02(r2, "showCamera", 554251647);
                return;
            }
            this.A0a.A06(R.string.f12nameremoved, 1);
            r5.BSr();
            C133106Wu.A02(r2, "showCamera", 554251647);
            r2.A05(4);
            return;
        }
        C133106Wu.A02(r2, "showCamera", 554251647);
        r2.A05(87);
        throw AnonymousClass001.A09("need to call onCreate first");
    }

    public void A0Q(int i, int i2, Intent intent) {
        if (i != 90 && i != 101) {
            return;
        }
        if (i2 == -1) {
            C160007kJ r5 = this.A12;
            r5.BEh();
            r5.BEh();
            if (r5.BEh() == 17 || r5.BEh() == 14) {
                C225314u r0 = this.A0A;
                Objects.requireNonNull(r0, "Host activity is NULL");
                r0.setResult(-1, intent);
                C225314u r02 = this.A0A;
                Objects.requireNonNull(r02, "Host activity is NULL");
                r02.finish();
                return;
            }
            C128886Dz r8 = this.A0g;
            List<C162037nv> list = r8.A08;
            for (C162037nv r3 : list) {
                Set set = r8.A09;
                if (!C90514aH.A1a(set) || set.contains(r3.B7k())) {
                    C225314u r1 = this.A0A;
                    Objects.requireNonNull(r1, "Host activity is NULL");
                    AnonymousClass1GW.A0O(r1, r3.B7k());
                } else {
                    File BBo = r3.BBo();
                    if (!BBo.delete()) {
                        C36321k7.A1L(BBo, "cameraui/cannot-delete-file ", AnonymousClass000.A0u());
                    }
                }
            }
            r8.A09.clear();
            r8.A03 = new C132366Tg();
            list.clear();
            A05(this);
            ArrayList A0u2 = C36401kF.A0u(intent, AnonymousClass11F.class, "jids");
            if (A0u2.size() == 1 && !A0u2.equals(this.A0M)) {
                Context context = this.A0n.A00;
                Intent A1Y = C36441kJ.A0j().A1Y(context, (AnonymousClass11F) A0u2.get(0));
                AnonymousClass3M9.A01(A1Y, "CameraUi");
                context.startActivity(A1Y);
            }
            r5.BgC();
        } else if (i2 == 1) {
            this.A0g.A03.A05(intent.getExtras());
            this.A0V = Integer.valueOf(intent.getIntExtra("media_quality_selection", 0));
            this.A0M = C36401kF.A0u(intent, AnonymousClass11F.class, "jids");
            A0I(this, intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
        } else if (i2 == 0) {
            C128886Dz r12 = this.A0g;
            if (!C90514aH.A1a(r12.A09) && !r12.A08.isEmpty()) {
                r12.A00();
                A05(this);
            }
            A0O();
        }
    }

    public boolean A0S() {
        C161087m8 r0 = this.A0C;
        if (r0 != null && r0.BMx()) {
            return true;
        }
        AnonymousClass6OO r02 = this.A0I;
        if (r02 == null) {
            return false;
        }
        Handler handler = r02.A04;
        if (handler.hasMessages(0) || handler.hasMessages(1)) {
            return true;
        }
        return false;
    }

    public static void A04(View view, int i, int i2) {
        AnonymousClass0BJ r1 = (AnonymousClass0BJ) view.getLayoutParams();
        r1.A0p = i;
        r1.A0D = 0;
        r1.setMargins(0, 0, 0, i2);
        view.setLayoutParams(r1);
    }

    public static void A08(AnonymousClass6YT r12) {
        String str;
        if (!r12.A0S() || (AnonymousClass000.A1S(r12.A0g.A00, 2) && r12.A0z)) {
            if (AnonymousClass000.A1Q(r12.A0H.A03.getVisibility())) {
                r12.A0H.A00(false, true);
            }
            if (!r12.A0R) {
                r12.A0R = true;
                C133106Wu r2 = r12.A0j;
                boolean BLt = r12.A0C.BLt();
                r2.A03 = SystemClock.elapsedRealtime();
                if (r2.A0A) {
                    C21430zE r3 = r2.A08;
                    r3.markerStart(554250848);
                    if (BLt) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    r3.markerAnnotate(554250848, "origin", str);
                }
                r12.A0C.BQC();
                AnonymousClass6WU r4 = r12.A0E;
                boolean BLt2 = r12.A0C.BLt();
                int i = r4.A00;
                int i2 = i - 180;
                if (BLt2) {
                    i2 = i + 180;
                }
                RotateAnimation rotateAnimation = new RotateAnimation((float) i, (float) i2, 1, 0.5f, 1, 0.5f);
                C90514aH.A1K(rotateAnimation);
                rotateAnimation.setDuration(100);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(AnonymousClass6WU.A0M);
                rotateAnimation.setDuration(200);
                rotateAnimation.setStartOffset(100);
                rotateAnimation.setAnimationListener(new C100684vQ(r4, BLt2));
                r4.A0I.startAnimation(rotateAnimation);
            }
        }
    }

    public AnonymousClass6YT(AnonymousClass02E r4, C20690y0 r5, AnonymousClass17Y r6, C106835Ln r7, AnonymousClass16L r8, AnonymousClass1MK r9, C160007kJ r10, AnonymousClass1Q4 r11, C128886Dz r12, C125075zH r13, C132726Uz r14, C133106Wu r15, C64953Qc r16, C21060yb r17, C19970wo r18, C19630wG r19, C19420v0 r20, C18820ts r21, C20810yC r22, AnonymousClass6N7 r23, C19890wg r24, C64783Pk r25, C1270866x r26, C19770wU r27, C27721Pm r28, boolean z) {
        this.A11 = r13;
        this.A12 = r10;
        this.A0n = r19;
        this.A0m = r18;
        this.A0c = r8;
        C20810yC r2 = r22;
        this.A0q = r2;
        this.A0a = r6;
        this.A0v = r27;
        this.A0Z = r5;
        this.A0r = r23;
        this.A0x = r28;
        this.A0d = r9;
        this.A0l = r17;
        this.A0p = r21;
        this.A0b = r7;
        this.A0g = r12;
        this.A0Y = r4;
        this.A0o = r20;
        this.A0i = r14;
        this.A0j = r15;
        this.A0f = r11;
        this.A0s = r24;
        this.A0u = r26;
        this.A0k = r16;
        this.A0t = r25;
        this.A0z = r2.A0E(125);
        this.A02 = r2.A07(2614);
        this.A0X = SystemClock.elapsedRealtime();
        this.A10 = z;
        this.A0h = new C121475tC(this.A12.BEh());
        this.A0e = new C119455pq(r2, this.A12.BEh());
    }
}
