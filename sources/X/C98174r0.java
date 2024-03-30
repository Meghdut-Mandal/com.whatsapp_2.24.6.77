package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.CountDownTimer;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.4r0  reason: invalid class name and case insensitive filesystem */
public abstract class C98174r0 extends C132456Tu implements C161287mV {
    public C140456lc A00;
    public final long A01;

    public static Integer A00(C1271967i r2, C140456lc r3, int i) {
        C140456lc A0W = r3.A0W(i);
        if (A0W != null) {
            return Integer.valueOf(AnonymousClass5Z8.A01(r2, A0W, 0));
        }
        return null;
    }

    public C98174r0(C1271967i r5, C140456lc r6) {
        super(C023109s.A01);
        this.A01 = (long) r6.A03;
        this.A00 = r6;
        C1257261a[] r3 = {new C1257261a(new C140726m4(r5, this), this), new C1257261a(new C140736m5(r5, this), this)};
        int i = 0;
        do {
            A0E(r3[i]);
            i++;
        } while (i < 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b2, code lost:
        if (r2 != false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0726, code lost:
        if (r14 != null) goto L_0x0728;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x082b, code lost:
        if (r4.A0f(58, false) != false) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0a00, code lost:
        if (r3.equals("front") != false) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0ab4, code lost:
        if (r3 == false) goto L_0x0ab6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0625  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0bef  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0c3e  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0c9f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0F(android.view.View r26, X.C1271967i r27, X.C140456lc r28, java.lang.Object r29) {
        /*
            r25 = this;
            r0 = r26
            r3 = r25
            boolean r1 = r3 instanceof X.C100324up
            if (r1 == 0) goto L_0x001e
            X.4up r3 = (X.C100324up) r3
            X.6lc r5 = r3.A00
            java.lang.String r4 = X.C140456lc.A0K(r5)
            r2 = 35
            r1 = 0
            boolean r2 = r5.A0f(r2, r1)
            X.6Ti r1 = r3.A01
            r1.A03(r0, r4, r2)
        L_0x001c:
            r0 = 0
            return r0
        L_0x001e:
            boolean r2 = r3 instanceof X.C100314uo
            r1 = r27
            if (r2 == 0) goto L_0x0097
            X.4uo r3 = (X.C100314uo) r3
            X.6lc r4 = r3.A00
            r2 = 52
            r3 = 1
            boolean r14 = r4.A0f(r2, r3)
            r2 = 56
            boolean r13 = r4.A0f(r2, r3)
            r2 = 59
            r6 = 0
            boolean r15 = r4.A0f(r2, r6)
            r2 = 44
            java.util.List r2 = r4.A0d(r2)
            java.util.Iterator r10 = r2.iterator()
            r9 = 0
            r12 = r9
            r11 = r9
            r8 = 0
            r7 = 0
        L_0x004b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0079
            X.6lc r5 = X.C90514aH.A0Y(r10)
            r3 = 36
            java.lang.String r2 = "regular"
            java.lang.String r3 = r5.A0a(r3, r2)
            java.lang.String r2 = "hd"
            boolean r4 = r3.equals(r2)
            r3 = 35
            r2 = 41
            if (r4 == 0) goto L_0x0086
            android.net.Uri r12 = X.C140456lc.A04(r5)
            int r8 = r5.A0T(r2, r6)
            int r7 = r5.A0T(r3, r6)
        L_0x0075:
            if (r12 == 0) goto L_0x004b
            if (r11 == 0) goto L_0x004b
        L_0x0079:
            android.content.Context r1 = r1.A00
            android.app.Activity r2 = X.C24801Dv.A00(r1)
            if (r26 == 0) goto L_0x0085
            if (r11 != 0) goto L_0x0a17
            if (r12 != 0) goto L_0x0a17
        L_0x0085:
            return r9
        L_0x0086:
            android.net.Uri r11 = X.C140456lc.A04(r5)
            if (r8 == 0) goto L_0x008e
            if (r7 != 0) goto L_0x0075
        L_0x008e:
            int r8 = r5.A0T(r2, r6)
            int r7 = r5.A0T(r3, r6)
            goto L_0x0075
        L_0x0097:
            boolean r2 = r3 instanceof X.C100304un
            if (r2 == 0) goto L_0x0143
            X.4un r3 = (X.C100304un) r3
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.6lc r6 = r3.A00
            java.lang.String r2 = X.C140456lc.A0O(r6)
            if (r2 != 0) goto L_0x0112
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x00a9:
            r0.setScaleType(r2)
            r2 = 44
            X.6lc r4 = r6.A0W(r2)
            if (r4 == 0) goto L_0x00bb
            int r2 = X.AnonymousClass5Z8.A00(r1, r4)
            r0.setColorFilter(r2)
        L_0x00bb:
            r2 = 1
            X.6Wf r5 = new X.6Wf
            r5.<init>(r1, r4, r2)
            r2 = 0
            X.6Vl r4 = new X.6Vl
            r4.<init>(r1, r2)
            X.6Ti r7 = r3.A01
            java.lang.String r21 = X.C140456lc.A0L(r6)
            java.lang.String r12 = X.C140456lc.A0N(r6)
            java.lang.String r13 = X.C140456lc.A0J(r6)
            java.lang.String r3 = X.C140456lc.A0K(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r21)
            if (r2 != 0) goto L_0x0117
            X.6KT r6 = r7.A03
            X.63y r3 = r7.A02
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L_0x00f0
            r8 = r0
            r9 = r4
            r10 = r5
            r11 = r6
            X.C110015Zz.A00(r8, r9, r10, r11, r12, r13)
        L_0x00f0:
            X.6CW r16 = r3.A00()
            java.lang.ref.WeakReference r14 = X.AnonymousClass001.A0F(r0)
            java.lang.ref.WeakReference r15 = X.AnonymousClass001.A0F(r1)
            X.6zb r7 = new X.6zb
            r8 = r0
            r9 = r5
            r10 = r4
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r17 = 0
            r18 = r17
            r19 = r0
            r20 = r7
            r16.A00(r17, r18, r19, r20, r21)
            goto L_0x001c
        L_0x0112:
            android.widget.ImageView$ScaleType r2 = X.AnonymousClass6Y7.A09(r2)     // Catch:{ 5R5 -> 0x0a29 }
            goto L_0x00a9
        L_0x0117:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0128
            X.6KT r1 = r7.A03
            r8 = r0
            r9 = r4
            r10 = r5
            r11 = r1
            X.C110015Zz.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x001c
        L_0x0128:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x001c
            X.60i r1 = r7.A04
            java.io.File r1 = r1.A00(r3)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.getAbsolutePath()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1)
            r0.setImageBitmap(r1)
            goto L_0x001c
        L_0x0143:
            boolean r2 = r3 instanceof X.C100294um
            if (r2 == 0) goto L_0x023a
            X.4um r3 = (X.C100294um) r3
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.6lc r6 = r3.A00
            java.lang.String r8 = X.C140456lc.A0N(r6)
            boolean r2 = r1.A03
            if (r2 == 0) goto L_0x016b
            r2 = 36
            java.lang.Object r2 = X.C140456lc.A0I(r6, r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x016b
            r2 = 36
            java.lang.Object r8 = X.C140456lc.A0I(r6, r2)
            java.lang.String r8 = (java.lang.String) r8
        L_0x016b:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x01f1
            r2 = 44
            X.7ku r2 = r6.A0X(r2)
            if (r2 != 0) goto L_0x01aa
            r7 = 0
        L_0x017a:
            X.C133266Xn.A05(r1, r6)
            X.6Ti r9 = r3.A01
            android.net.Uri r10 = android.net.Uri.parse(r8)
            java.lang.String r4 = r10.getHost()
            java.lang.String r2 = "static.whatsapp.net"
            boolean r5 = r2.equals(r4)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r2 = r10.getHost()
            r4.append(r2)
            java.lang.String r2 = r10.getPath()
            if (r5 == 0) goto L_0x01a5
            r4.append(r2)
            java.lang.String r2 = r10.getQuery()
        L_0x01a5:
            java.lang.String r5 = X.AnonymousClass000.A0q(r2, r4)
            goto L_0x01b0
        L_0x01aa:
            X.6KE r7 = new X.6KE
            r7.<init>(r1, r6, r2)
            goto L_0x017a
        L_0x01b0:
            android.app.Activity r2 = X.C36361kB.A06(r0)     // Catch:{ Exception -> 0x01e6 }
            android.content.Intent r4 = r2.getIntent()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r2 = "flow_id"
            boolean r2 = r4.hasExtra(r2)     // Catch:{ Exception -> 0x01e6 }
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = "flow_message_version"
            boolean r2 = r4.hasExtra(r2)     // Catch:{ Exception -> 0x01e6 }
            if (r2 == 0) goto L_0x01e6
            android.net.Uri r5 = android.net.Uri.parse(r8)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r2 = r5.getHost()
            r4.append(r2)
            java.lang.String r2 = r5.getPath()
            r4.append(r2)
            java.lang.String r2 = r5.getQuery()
            java.lang.String r5 = X.AnonymousClass000.A0q(r2, r4)
        L_0x01e6:
            X.005 r2 = r9.A09
            java.lang.Object r2 = r2.get()
            X.64N r2 = (X.AnonymousClass64N) r2
            r2.A00(r0, r7, r8, r5)
        L_0x01f1:
            r2 = 46
            X.6lc r4 = r6.A0W(r2)
            if (r4 == 0) goto L_0x0211
            r2 = 36
            java.lang.Object r4 = X.C140456lc.A0I(r4, r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x0211
            X.6Ti r3 = r3.A01
            r2 = 0
            byte[] r2 = android.util.Base64.decode(r4, r2)
            r3.A04(r0, r2)
        L_0x0211:
            java.lang.String r2 = X.C140456lc.A0M(r6)
            if (r2 != 0) goto L_0x022a
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x0219:
            r0.setScaleType(r5)
            r2 = 35
            X.6lc r2 = r6.A0W(r2)
            if (r2 == 0) goto L_0x001c
            int r1 = X.AnonymousClass5Z8.A00(r1, r2)
            goto L_0x0805
        L_0x022a:
            android.widget.ImageView$ScaleType r5 = X.AnonymousClass6Y7.A09(r2)     // Catch:{ 5R5 -> 0x022f }
            goto L_0x0219
        L_0x022f:
            r4 = move-exception
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r3 = "WaRcCoreBloksImageComponentBinderUtils"
            java.lang.String r2 = "Failed to parse Image scaleType"
            X.AnonymousClass6RS.A00(r1, r3, r2, r4)
            goto L_0x0219
        L_0x023a:
            boolean r2 = r3 instanceof X.C100374uu
            r4 = r28
            if (r2 == 0) goto L_0x0257
            X.4uu r3 = (X.C100374uu) r3
            r8 = 0
            r0.setFocusable(r8)
            r2 = 45
            java.lang.Object r11 = X.C140456lc.A0I(r4, r2)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r2 = X.C140456lc.A0N(r4)
            r5 = 0
            if (r2 == 0) goto L_0x0a3e
            goto L_0x0a2f
        L_0x0257:
            boolean r2 = r3 instanceof X.C100284ul
            if (r2 == 0) goto L_0x02d4
            X.4ul r3 = (X.C100284ul) r3
            X.6lc r9 = r3.A00
            java.lang.String r2 = X.C140456lc.A0L(r9)
            r5 = 45
            java.lang.String r4 = "image"
            java.lang.String r14 = r9.A0a(r5, r4)
            r4 = 43
            java.lang.Object r7 = X.C140456lc.A0I(r9, r4)
            java.lang.String r7 = (java.lang.String) r7
            r4 = 46
            java.lang.Object r6 = X.C140456lc.A0I(r9, r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = X.C140456lc.A0O(r9)
            X.5pH r11 = new X.5pH
            r11.<init>(r1, r9)
            java.lang.ref.WeakReference r10 = X.AnonymousClass001.A0F(r1)
            java.lang.ref.WeakReference r9 = X.AnonymousClass001.A0F(r9)
            r5 = 0
            X.6Wf r4 = new X.6Wf
            r4.<init>(r9, r10, r5)
            X.6Ue r13 = r3.A01
            android.content.Context r10 = r1.A00
            r13.A00 = r5
            X.67i r3 = r11.A00
            X.6lc r1 = r11.A01
            java.lang.Object r12 = X.C133266Xn.A04(r3, r1)
            X.0ol r12 = (X.C16190ol) r12
            X.C18740tg.A06(r12)
            X.6qE r12 = (X.C143246qE) r12
            android.util.DisplayMetrics r3 = X.C90484aE.A0P()
            int r1 = r3.heightPixels
            r12.A01 = r1
            int r1 = r3.widthPixels
            r12.A02 = r1
            r1 = 2131428075(0x7f0b02eb, float:1.8477784E38)
            android.view.ViewGroup r9 = X.C36411kG.A0O(r0, r1)
            java.lang.String r1 = "front"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x02d0
            r3 = 1
            r12.A00 = r3
        L_0x02c5:
            int r2 = android.hardware.Camera.getNumberOfCameras()
            int r1 = r3 + 1
            if (r2 >= r1) goto L_0x0b52
            r3 = 0
            goto L_0x0b52
        L_0x02d0:
            r3 = 0
            r12.A00 = r5
            goto L_0x02c5
        L_0x02d4:
            boolean r2 = r3 instanceof X.C100334uq
            if (r2 == 0) goto L_0x03b3
            X.4uq r3 = (X.C100334uq) r3
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            boolean r7 = X.C36331k8.A1a(r0, r1)
            X.5wz r5 = r3.A04
            android.content.Context r4 = r5.A05
            java.io.File r6 = r4.getCacheDir()
            java.lang.String r2 = "avatar_image"
            java.io.File r6 = X.C36441kJ.A0w(r6, r2)
            r6.mkdirs()
            java.lang.String r2 = "TEMP_SELFIE.jpg"
            java.io.File r2 = X.C36441kJ.A0w(r6, r2)
            X.5oB r6 = new X.5oB
            r6.<init>()
            java.lang.String r2 = r2.getCanonicalPath()
            r6.A00 = r2
            r6.A01 = r7
            X.6bt r8 = new X.6bt
            r8.<init>((X.C118515oB) r6)
            android.content.Context r7 = r1.A00
            X.AnonymousClass00C.A08(r7)
            X.5pG r2 = r3.A02
            X.5kz r1 = r3.A03
            X.6Uu r6 = new X.6Uu
            r6.<init>(r7, r8, r2, r1)
            r3.A00 = r6
            r6.A00 = r0
            X.B5t r7 = r6.A02
            java.lang.String r8 = "null cannot be cast to non-null type com.facebook.cameracore.litecamera.LiteCameraController"
            if (r7 != 0) goto L_0x0358
            X.5kz r0 = r6.A08
            X.6k2 r1 = new X.6k2
            r1.<init>(r6)
            X.4uq r0 = r0.A00
            X.B5t r7 = r0.A01
            r7.Bri(r1)     // Catch:{ all -> 0x0350 }
            r3 = 921600(0xe1000, float:1.291437E-39)
            r2 = r7
            X.A0j r2 = (X.C20952A0j) r2     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = "Video resolution level must be set before initializing the camera."
            boolean r0 = r2.A0H     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x034b
            r2.A09 = r3     // Catch:{ all -> 0x0350 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r2.A05 = r0     // Catch:{ all -> 0x0350 }
            r7.Brj(r3)     // Catch:{ all -> 0x0350 }
            r1 = 1
            X.B3p r0 = r2.A0L     // Catch:{ all -> 0x0350 }
            r0.BrC(r1)     // Catch:{ all -> 0x0350 }
            goto L_0x0356
        L_0x034b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r1)     // Catch:{ all -> 0x0350 }
            throw r0     // Catch:{ all -> 0x0350 }
        L_0x0350:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
        L_0x0356:
            r6.A02 = r7
        L_0x0358:
            X.AnonymousClass00C.A0E(r7, r8)
            r0 = 1
            r7.Br3(r0)     // Catch:{ all -> 0x0362 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0362 }
            goto L_0x0367
        L_0x0362:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x0367:
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r0)
            if (r2 == 0) goto L_0x0374
            java.lang.String r1 = "AESelfieViewProvider"
            java.lang.String r0 = "Unable to set initial camera facing"
            X.AnonymousClass6YR.A09(r1, r0, r2)
        L_0x0374:
            android.content.Context r3 = r6.A05
            android.view.View r1 = r7.B9J(r3)
            android.widget.FrameLayout r0 = r6.A00
            if (r0 == 0) goto L_0x0381
            r0.addView(r1)
        L_0x0381:
            X.6bt r2 = r6.A06
            X.02l r1 = X.C006702x.A00
            X.6k1 r0 = new X.6k1
            r0.<init>(r3, r2, r6, r1)
            r6.A01 = r0
            com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager r0 = r0.A02
            r6.A03 = r0
            r7.Bok()
            android.app.Activity r3 = X.C132676Uu.A00(r3, r6)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x03aa
            X.03P r0 = X.AnonymousClass03K.A00
            X.041 r2 = X.C009403z.A02(r0)
            r1 = 0
            com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1 r0 = new com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
        L_0x03aa:
            android.app.Application r4 = (android.app.Application) r4
            android.app.Application$ActivityLifecycleCallbacks r0 = r5.A04
            r4.registerActivityLifecycleCallbacks(r0)
            goto L_0x001c
        L_0x03b3:
            boolean r2 = r3 instanceof X.C100274uk
            if (r2 == 0) goto L_0x03da
            X.4uk r3 = (X.C100274uk) r3
            X.07P r0 = (X.AnonymousClass07P) r0
            X.6Ti r5 = r3.A01
            X.C110005Zy.A00(r0, r1, r4, r5)
            X.6lc r3 = r3.A00
            r2 = 46
            X.6lc r2 = r3.A0W(r2)
            if (r2 == 0) goto L_0x03d1
            int r1 = X.AnonymousClass5Z8.A00(r1, r2)
            r0.setTextColor(r1)
        L_0x03d1:
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            X.0yC r1 = r5.A07
            X.C36331k8.A1A(r1, r0)
            goto L_0x001c
        L_0x03da:
            boolean r2 = r3 instanceof X.C100184ub
            if (r2 == 0) goto L_0x03ef
            X.7ku r5 = X.C140456lc.A0E(r4)
            if (r5 == 0) goto L_0x001c
            r3 = 4
        L_0x03e5:
            X.74n r2 = new X.74n
            r2.<init>(r4, r5, r1, r3)
            r0.post(r2)
            goto L_0x001c
        L_0x03ef:
            boolean r2 = r3 instanceof X.C100174ua
            if (r2 == 0) goto L_0x03fb
            X.7ku r5 = X.C140456lc.A0E(r4)
            if (r5 == 0) goto L_0x001c
            r3 = 3
            goto L_0x03e5
        L_0x03fb:
            boolean r2 = r3 instanceof X.C100224uf
            if (r2 == 0) goto L_0x0411
            X.4uf r3 = (X.C100224uf) r3
            X.07P r0 = (X.AnonymousClass07P) r0
            X.6Ti r3 = r3.A00
            android.text.SpannableStringBuilder r2 = X.AnonymousClass6RY.A00(r1, r4)
            X.AnonymousClass6RY.A01(r2, r0, r1, r4, r3)
            X.C36391kE.A1J(r0)
            goto L_0x001c
        L_0x0411:
            boolean r2 = r3 instanceof X.C100264uj
            if (r2 == 0) goto L_0x04b7
            X.4uj r3 = (X.C100264uj) r3
            r2 = 40
            r6 = -1
            int r10 = r4.A0T(r2, r6)
            r2 = 38
            int r9 = r4.A0T(r2, r6)
            r2 = 42
            int r5 = r4.A0T(r2, r6)
            r2 = 35
            int r4 = r4.A0T(r2, r6)
            X.6lc r7 = r3.A01
            r3 = 36
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7.A0S(r3, r2)
            r2 = 41
            X.7ku r2 = r7.A0X(r2)
            r8 = 0
            if (r2 == 0) goto L_0x04b5
            X.5sx r3 = new X.5sx
            r3.<init>(r1, r7, r2)
        L_0x0448:
            r1 = 2131428090(0x7f0b02fa, float:1.8477815E38)
            android.view.View r7 = X.C012005e.A02(r0, r1)
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r7 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r7
            float r2 = (float) r10
            float r1 = (float) r9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x048e
            r7.A01 = r2
            r7.A00 = r1
            float r0 = r7.A03
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0472
            float r0 = r7.A02
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0472
            r7.A03 = r2
            r7.A02 = r1
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x0472:
            r2 = 0
            float r0 = r7.A03
            float r1 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x047e
            r7.A03 = r1
            r2 = 1
        L_0x047e:
            float r0 = r7.A02
            float r1 = r7.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b2
            r7.A02 = r1
        L_0x0488:
            r7.invalidate()
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x048e:
            float r2 = (float) r5
            float r1 = (float) r4
            float r0 = r7.A01
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04aa
            float r0 = r7.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x04aa
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x04aa
            r7.A03 = r2
            r7.A02 = r1
            r7.invalidate()
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x04aa:
            X.6qS r0 = new X.6qS
            r0.<init>(r3, r6)
            r7.A05 = r0
            return r8
        L_0x04b2:
            if (r2 == 0) goto L_0x048e
            goto L_0x0488
        L_0x04b5:
            r3 = r8
            goto L_0x0448
        L_0x04b7:
            boolean r2 = r3 instanceof X.C100214ue
            if (r2 == 0) goto L_0x04dd
            r2 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.View r3 = X.C012005e.A02(r0, r2)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r0 = 35
            X.6lc r0 = r4.A0W(r0)
            if (r3 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x001c
            int r2 = X.AnonymousClass5Z8.A00(r1, r0)
            android.graphics.drawable.Drawable r1 = r3.getIndeterminateDrawable()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r0)
            goto L_0x001c
        L_0x04dd:
            boolean r2 = r3 instanceof X.C100204ud
            if (r2 == 0) goto L_0x04ea
            X.4ud r3 = (X.C100204ud) r3
            X.6Ti r2 = r3.A00
            X.C109985Zw.A00(r0, r1, r4, r2)
            goto L_0x001c
        L_0x04ea:
            boolean r2 = r3 instanceof X.C100364ut
            if (r2 == 0) goto L_0x067c
            X.4ut r3 = (X.C100364ut) r3
            java.lang.Object r9 = X.C133266Xn.A04(r1, r4)
            X.6oE r9 = (X.C142036oE) r9
            android.content.Context r2 = r1.A00
            android.app.Activity r5 = X.C24801Dv.A00(r2)
            r8 = 0
            r2 = 41
            boolean r2 = r4.A0f(r2, r8)
            if (r2 == 0) goto L_0x050e
            android.view.Window r5 = r5.getWindow()
            r2 = 8192(0x2000, float:1.14794E-41)
            r5.setFlags(r2, r2)
        L_0x050e:
            java.lang.String r2 = r9.A05
            android.util.Pair r0 = X.AnonymousClass6RX.A01(r0, r1, r4, r2)
            java.lang.Object r10 = r0.first
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            java.lang.Object r7 = r0.second
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r9.A04 = r7
            r0 = 49
            java.lang.Object r2 = X.C140456lc.A0I(r4, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r2)
            r0 = r0 ^ 1
            r7.setEnabled(r0)
            r7.setFocusableInTouchMode(r0)
            r7.setFocusable(r0)
            r2 = 1
            r7.setCursorVisible(r0)
            android.text.TextWatcher r11 = r9.A03
            if (r11 != 0) goto L_0x0551
            r0 = 58
            r5 = 0
            long r15 = r4.A0U(r0, r5)
            X.6cK r11 = new X.6cK
            r12 = r1
            r13 = r4
            r14 = r9
            r11.<init>(r12, r13, r14, r15)
            r9.A03 = r11
        L_0x0551:
            r7.addTextChangedListener(r11)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.6cG r0 = new X.6cG
            r0.<init>()
            r5.add(r0)
            r0 = 54
            java.lang.Object r6 = X.C140456lc.A0I(r4, r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x057a
            java.lang.String r0 = "lowercase"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x066d
            X.4cZ r0 = new X.4cZ
            r0.<init>(r3)
        L_0x0577:
            r5.add(r0)
        L_0x057a:
            r3 = 44
            r0 = -1
            int r3 = r4.A0T(r3, r0)
            if (r3 < 0) goto L_0x058b
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r3)
            r5.add(r0)
        L_0x058b:
            android.text.InputFilter[] r0 = new android.text.InputFilter[r8]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r7.setFilters(r0)
            r0 = 55
            java.lang.Object r5 = X.C140456lc.A0I(r4, r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 45
            java.lang.Object r12 = X.C140456lc.A0I(r4, r0)
            java.lang.String r12 = (java.lang.String) r12
            r0 = 53
            java.lang.Object r3 = X.C140456lc.A0I(r4, r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 59
            java.lang.Object r0 = X.C140456lc.A0I(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            r11 = 0
            if (r0 == 0) goto L_0x0656
            int r0 = X.AnonymousClass6RX.A00(r1, r0)
            if (r0 == 0) goto L_0x066a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x05c3:
            if (r6 == 0) goto L_0x05df
            if (r12 != 0) goto L_0x05c9
            if (r5 == 0) goto L_0x05df
        L_0x05c9:
            int r0 = r6.intValue()
            r3 = 2
            r0 = r0 & 2
            if (r0 != r3) goto L_0x0650
            if (r5 != 0) goto L_0x05d5
            r5 = r12
        L_0x05d5:
            X.4zt r0 = new X.4zt
            r0.<init>(r7, r5)
        L_0x05da:
            r9.A02 = r0
            r7.addTextChangedListener(r0)
        L_0x05df:
            android.text.TextWatcher r3 = r9.A02
            if (r3 == 0) goto L_0x05ea
            android.text.Editable r0 = r7.getEditableText()
            r3.afterTextChanged(r0)
        L_0x05ea:
            int r5 = r9.A01
            if (r5 < 0) goto L_0x0644
            int r3 = r9.A00
            if (r3 < r5) goto L_0x0644
            java.lang.String r0 = r9.A05
            int r0 = r0.length()
            if (r3 > r0) goto L_0x0644
            r7.setSelection(r5, r3)
        L_0x05fd:
            r0 = 46
            X.7ku r5 = r4.A0X(r0)
            if (r5 == 0) goto L_0x061b
            r0 = 7
            X.3Yo r3 = new X.3Yo
            r3.<init>((X.C1271967i) r1, (X.C140456lc) r4, (X.C160377ku) r5, (int) r0)
            r10.setOnClickListener(r3)
            r0 = 2131434629(0x7f0b1c85, float:1.8491077E38)
            android.view.View r0 = X.C012005e.A02(r10, r0)
            r0.setOnClickListener(r3)
            r0.setFocusable(r8)
        L_0x061b:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.AnonymousClass044.A00(r0)
            if (r0 != r2) goto L_0x0626
            r8 = 1
        L_0x0626:
            r1 = 5
            r2 = 3
            int r0 = X.C36421kH.A01(r8)
            r10.setGravity(r0)
            if (r8 != 0) goto L_0x0632
            r1 = 3
        L_0x0632:
            r7.setGravity(r1)
            if (r6 == 0) goto L_0x0643
            int r1 = r6.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0bc2
            if (r1 == r2) goto L_0x0bc2
            r0 = 4
            if (r1 == r0) goto L_0x0bc2
        L_0x0643:
            return r11
        L_0x0644:
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x05fd
            int r0 = r0.length()
            r7.setSelection(r0)
            goto L_0x05fd
        L_0x0650:
            X.3Xp r0 = new X.3Xp
            r0.<init>(r7, r5)
            goto L_0x05da
        L_0x0656:
            if (r3 == 0) goto L_0x066a
            int r0 = X.AnonymousClass6Y7.A07(r3)     // Catch:{ 5R5 -> 0x0662 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ 5R5 -> 0x0662 }
            goto L_0x05c3
        L_0x0662:
            r5 = move-exception
            java.lang.String r3 = "WaRcFormInputComponentBinderUtils"
            java.lang.String r0 = "Error parsing text input type"
            X.AnonymousClass6RS.A00(r1, r3, r0, r5)
        L_0x066a:
            r6 = r11
            goto L_0x05df
        L_0x066d:
            java.lang.String r0 = "uppercase"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x057a
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            goto L_0x0577
        L_0x067c:
            boolean r2 = r3 instanceof X.C100254ui
            if (r2 == 0) goto L_0x0766
            X.4ui r3 = (X.C100254ui) r3
            android.content.Context r9 = r1.A00
            X.6lc r7 = r3.A00
            java.lang.String r12 = X.C140456lc.A0M(r7)
            java.lang.String r15 = X.C140456lc.A0J(r7)
            r2 = 48
            r4 = 0
            long r4 = r7.A0U(r2, r4)
            r2 = 43
            r10 = 0
            int r16 = r7.A0T(r2, r10)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2 = 38
            r6 = 1
            boolean r2 = r7.A0f(r2, r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r8.equals(r2)
            r13 = r2 ^ 1
            r2 = 46
            boolean r2 = r7.A0f(r2, r10)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r8.equals(r2)
            r6 = r6 ^ r2
            java.lang.String r11 = X.C140456lc.A0N(r7)
            r2 = 45
            java.lang.Object r10 = X.C140456lc.A0I(r7, r2)
            java.lang.String r10 = (java.lang.String) r10
            r2 = 50
            java.lang.Object r14 = X.C140456lc.A0I(r7, r2)
            java.lang.String r14 = (java.lang.String) r14
            X.62d r2 = new X.62d
            r2.<init>(r1, r7, r3)
            X.6Ti r8 = r3.A01
            r1 = 2131430802(0x7f0b0d92, float:1.8483315E38)
            android.view.View r7 = X.C012005e.A02(r0, r1)
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r1 = 2131430918(0x7f0b0e06, float:1.848355E38)
            android.view.View r3 = X.C012005e.A02(r0, r1)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            if (r12 == 0) goto L_0x0717
            r3.setHint((java.lang.CharSequence) r12)
            java.lang.String r0 = "wa_flows"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0717
            X.048 r14 = X.AnonymousClass047.A01
            int r1 = r12.length()
            r0 = 0
            boolean r12 = r14.BN4(r12, r0, r1)
            r1 = 1
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.AnonymousClass044.A00(r0)
            if (r12 == 0) goto L_0x0763
            if (r0 == r1) goto L_0x0717
        L_0x0711:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r7.setGravity(r0)
        L_0x0717:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r12 = 1
            if (r0 != 0) goto L_0x074b
            java.util.Date r14 = X.C131826Qu.A01(r15)
            if (r14 == 0) goto L_0x0739
        L_0x0728:
            X.C18740tg.A06(r14)
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r12)
            java.lang.String r0 = r0.format(r14)
            r7.setText(r0)
            r1.setTime(r14)
        L_0x0739:
            r4 = 0
            X.5WQ r0 = new X.5WQ
            r0.<init>(r2, r4)
            r3.setEnabled(r13)
            r7.setEnabled(r13)
            r7.setClickable(r13)
            r4 = 0
            goto L_0x0bc6
        L_0x074b:
            r14 = 0
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0757
            java.util.Date r14 = new java.util.Date
            r14.<init>(r4)
            goto L_0x0728
        L_0x0757:
            if (r16 == 0) goto L_0x0739
            int r0 = r1.get(r12)
            int r0 = r0 + r16
            r1.set(r12, r0)
            goto L_0x0739
        L_0x0763:
            if (r0 != r1) goto L_0x0717
            goto L_0x0711
        L_0x0766:
            boolean r2 = r3 instanceof X.C100244uh
            if (r2 == 0) goto L_0x079c
            X.4uh r3 = (X.C100244uh) r3
            X.6lc r6 = r3.A00
            long r8 = X.C109975Zv.A00(r6)
            r4 = 0
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001c
            java.lang.String r4 = X.C140456lc.A0L(r6)
            r2 = 2131434232(0x7f0b1af8, float:1.8490272E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r0, r2)
            r2.setText(r4)
            java.lang.Object r2 = X.C133266Xn.A05(r1, r6)
            X.5ky r2 = (X.C116675ky) r2
            X.4cG r4 = new X.4cG
            r5 = r0
            r6 = r1
            r7 = r3
            r4.<init>(r5, r6, r7, r8)
            android.os.CountDownTimer r0 = r4.start()
            r2.A00 = r0
            goto L_0x001c
        L_0x079c:
            boolean r2 = r3 instanceof X.C100194uc
            if (r2 == 0) goto L_0x07a9
            X.4uc r3 = (X.C100194uc) r3
            X.6Ti r2 = r3.A00
            X.C109965Zu.A00(r0, r1, r4, r2)
            goto L_0x001c
        L_0x07a9:
            boolean r2 = r3 instanceof X.C100354us
            if (r2 == 0) goto L_0x07ec
            X.4us r3 = (X.C100354us) r3
            com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r0 = (com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText) r0
            r6 = 0
            r2 = r29
            X.5zL r7 = X.AnonymousClass6XF.A00(r0, r6, r1, r4, r2)
            r5 = 63
            r2 = 0
            boolean r2 = r4.A0f(r5, r2)
            if (r2 == 0) goto L_0x07eb
            float r2 = r0.getTextSize()
            float r0 = r7.A0F
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x07eb
            r7.A0F = r2
            android.text.Editable r0 = r7.A0J
            java.lang.String r0 = r0.toString()
            X.6WZ r5 = X.C133266Xn.A01(r1)
            X.4vL r2 = new X.4vL
            r2.<init>(r3, r7, r0)
            X.6lc r1 = r5.A04()
            X.6oW r0 = new X.6oW
            r0.<init>(r1, r4)
            r5.A08(r0, r2)
            r5.A05()
        L_0x07eb:
            return r6
        L_0x07ec:
            boolean r2 = r3 instanceof X.C100164uZ
            if (r2 == 0) goto L_0x080a
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            X.C36321k7.A0x(r1, r4)
            r2 = 35
            X.6lc r2 = r4.A0W(r2)
            if (r2 == 0) goto L_0x001c
            int r1 = X.AnonymousClass5Z8.A01(r1, r2, r3)
        L_0x0805:
            r0.setColorFilter(r1)
            goto L_0x001c
        L_0x080a:
            boolean r2 = r3 instanceof X.C100154uY
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof X.C100144uX
            if (r2 == 0) goto L_0x08d0
            X.4uX r3 = (X.C100144uX) r3
            r2 = 35
            r6 = 0
            boolean r8 = r4.A0f(r2, r6)
            r2 = 51
            boolean r2 = r4.A0f(r2, r6)
            r5 = 1
            if (r2 != 0) goto L_0x082d
            r2 = 58
            boolean r2 = r4.A0f(r2, r6)
            r15 = 0
            if (r2 == 0) goto L_0x082e
        L_0x082d:
            r15 = 1
        L_0x082e:
            r2 = 36
            X.7ku r14 = r4.A0X(r2)
            r2 = r0
            X.7lE r2 = (X.C160577lE) r2
            r6 = r2
            X.4ei r6 = (X.C92784ei) r6
            android.widget.Switch r7 = r6.A00
            r7.setChecked(r8)
            r6 = 38
            boolean r6 = r4.A0f(r6, r5)
            r0.setEnabled(r6)
            if (r15 != 0) goto L_0x084c
            if (r14 == 0) goto L_0x085a
        L_0x084c:
            X.6dk r9 = new X.6dk
            r10 = r0
            r11 = r3
            r12 = r1
            r13 = r4
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r7.setOnCheckedChangeListener(r9)
        L_0x085a:
            android.content.Context r11 = r1.A00
            r0 = 40
            X.6lc r0 = r4.A0W(r0)
            r15 = 0
            if (r0 != 0) goto L_0x08c7
            r12 = r15
        L_0x0866:
            r0 = 41
            java.lang.Integer r10 = A00(r1, r4, r0)
            r0 = 43
            java.lang.Integer r14 = A00(r1, r4, r0)
            r0 = 48
            java.lang.Integer r13 = A00(r1, r4, r0)
            r0 = 42
            java.lang.Integer r9 = A00(r1, r4, r0)
            r0 = 46
            java.lang.Integer r8 = A00(r1, r4, r0)
            r0 = 45
            java.lang.Integer r7 = A00(r1, r4, r0)
            r0 = 50
            java.lang.Integer r6 = A00(r1, r4, r0)
            r0 = 44
            java.lang.Integer r3 = A00(r1, r4, r0)
            r0 = 49
            java.lang.Integer r1 = A00(r1, r4, r0)
            if (r14 != 0) goto L_0x08bf
            if (r9 != 0) goto L_0x08bf
            if (r13 != 0) goto L_0x08a3
            r13 = r12
        L_0x08a3:
            if (r8 != 0) goto L_0x08a6
            r8 = r10
        L_0x08a6:
            android.content.res.ColorStateList r0 = X.AnonymousClass6RI.A00(r11, r12, r10, r13, r8)
            r2.BsT(r0)
        L_0x08ad:
            if (r7 != 0) goto L_0x0c42
            if (r3 != 0) goto L_0x0c42
            if (r6 != 0) goto L_0x08b4
            r6 = r12
        L_0x08b4:
            if (r1 != 0) goto L_0x08b7
            r1 = r10
        L_0x08b7:
            android.content.res.ColorStateList r0 = X.AnonymousClass6RI.A01(r11, r12, r10, r6, r1)
            r2.BsY(r0, r5)
            return r15
        L_0x08bf:
            android.content.res.ColorStateList r0 = X.AnonymousClass6RI.A00(r11, r14, r9, r13, r8)
            r2.BsT(r0)
            goto L_0x08ad
        L_0x08c7:
            int r0 = X.AnonymousClass5Z8.A00(r1, r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0866
        L_0x08d0:
            boolean r2 = r3 instanceof X.C100134uW
            if (r2 == 0) goto L_0x091f
            X.4fF r0 = (X.C92964fF) r0
            r7 = 0
            X.AnonymousClass00C.A0D(r0, r7)
            X.C36321k7.A0x(r1, r4)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 35
            X.6lc r3 = r4.A0W(r5)
            r4 = 24
            if (r3 == 0) goto L_0x0906
            r2 = 36
            java.lang.Object r2 = X.C140456lc.A0I(r3, r2)     // Catch:{ 5R5 -> 0x08fc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 5R5 -> 0x08fc }
            if (r2 != 0) goto L_0x08f4
            goto L_0x08f9
        L_0x08f4:
            float r2 = X.AnonymousClass6Y7.A01(r2)     // Catch:{ 5R5 -> 0x08fc }
            goto L_0x08fb
        L_0x08f9:
            r2 = 1103101952(0x41c00000, float:24.0)
        L_0x08fb:
            int r4 = (int) r2     // Catch:{ 5R5 -> 0x08fc }
        L_0x08fc:
            X.6lc r2 = r3.A0W(r5)
            if (r2 == 0) goto L_0x0906
            int r6 = X.AnonymousClass5Z8.A01(r1, r2, r7)
        L_0x0906:
            android.view.animation.Interpolator r2 = X.C91324bp.A09
            android.content.Context r1 = r1.A00
            X.AnonymousClass00C.A08(r1)
            X.4bp r3 = new X.4bp
            r3.<init>(r1, r6, r4)
            boolean r2 = r3 instanceof android.graphics.drawable.Animatable
            r1 = 0
            if (r2 == 0) goto L_0x0918
            r1 = r3
        L_0x0918:
            r0.A00 = r1
            r0.setImageDrawable(r3)
            goto L_0x09bb
        L_0x091f:
            boolean r2 = r3 instanceof X.C100124uV
            if (r2 == 0) goto L_0x09d6
            X.4fF r0 = (X.C92964fF) r0
            r12 = 0
            X.AnonymousClass00C.A0D(r0, r12)
            X.C36321k7.A0x(r1, r4)
            r2 = 40
            int r14 = r4.A0T(r2, r12)
            r7 = 35
            X.6lc r11 = r4.A0W(r7)
            r8 = 36
            java.lang.String r2 = "4.0dp"
            java.lang.String r10 = X.C140456lc.A0P(r4, r2, r8)
            r2 = 41
            X.6lc r9 = r4.A0W(r2)
            r2 = 38
            X.6lc r6 = r4.A0W(r2)
            r3 = 42
            java.lang.String r2 = "rectangle"
            java.lang.String r5 = X.C140456lc.A0P(r4, r2, r3)
            if (r11 == 0) goto L_0x095b
            int r15 = X.AnonymousClass5Z8.A01(r1, r11, r12)
            goto L_0x095c
        L_0x095b:
            r15 = -1
        L_0x095c:
            float r13 = X.AnonymousClass6Y7.A01(r10)     // Catch:{ 5R5 -> 0x0961 }
            goto L_0x0972
        L_0x0961:
            r3 = move-exception
            java.lang.String r2 = "CDSGlimmerViewUtils"
            X.AnonymousClass6RS.A02(r2, r3)
            android.content.Context r3 = r1.A00
            X.AnonymousClass00C.A08(r3)
            r2 = 1082130432(0x40800000, float:4.0)
            float r13 = X.C109525Xx.A00(r3, r2)
        L_0x0972:
            r4 = 1056964608(0x3f000000, float:0.5)
            r2 = 1050253722(0x3e99999a, float:0.3)
            if (r9 == 0) goto L_0x09d0
            float r3 = r9.A0S(r8, r2)
            float r2 = r9.A0S(r7, r4)
            X.5ny r9 = new X.5ny
            r9.<init>(r3, r2)
        L_0x0986:
            r4 = 1038174126(0x3de147ae, float:0.11)
            r2 = 1032268546(0x3d872b02, float:0.066)
            if (r6 == 0) goto L_0x09ca
            float r3 = r6.A0S(r8, r2)
            float r2 = r6.A0S(r7, r4)
            X.5ny r10 = new X.5ny
            r10.<init>(r3, r2)
        L_0x099b:
            java.lang.String r2 = "circle"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x09c7
            java.lang.Integer r12 = X.C023109s.A00
        L_0x09a5:
            android.animation.TimeInterpolator r2 = X.C91314bo.A09
            r0.getContext()
            X.4bo r8 = new X.4bo
            r11 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r2 = r8 instanceof android.graphics.drawable.Animatable
            r1 = 0
            if (r2 == 0) goto L_0x09b6
            r1 = r8
        L_0x09b6:
            r0.A00 = r1
            r0.setImageDrawable(r8)
        L_0x09bb:
            android.graphics.drawable.Animatable r1 = r0.A00
            if (r1 == 0) goto L_0x09c2
            r1.start()
        L_0x09c2:
            r1 = 1
            r0.A01 = r1
            goto L_0x001c
        L_0x09c7:
            java.lang.Integer r12 = X.C023109s.A01
            goto L_0x09a5
        L_0x09ca:
            X.5ny r10 = new X.5ny
            r10.<init>(r2, r4)
            goto L_0x099b
        L_0x09d0:
            X.5ny r9 = new X.5ny
            r9.<init>(r2, r4)
            goto L_0x0986
        L_0x09d6:
            boolean r2 = r3 instanceof X.C100234ug
            if (r2 == 0) goto L_0x0c4a
            X.4ug r3 = (X.C100234ug) r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.C36321k7.A0x(r1, r4)
            X.B5t r5 = r3.A00
            if (r5 != 0) goto L_0x09f3
            X.7eD r5 = r3.A01
            android.content.Context r2 = r1.A00
            X.B5t r5 = r5.B4g(r2)
            r3.A00 = r5
        L_0x09f3:
            java.lang.String r3 = X.C140456lc.A0J(r4)
            if (r3 == 0) goto L_0x0a02
            java.lang.String r2 = "front"
            boolean r3 = r3.equals(r2)
            r2 = 0
            if (r3 == 0) goto L_0x0a03
        L_0x0a02:
            r2 = 1
        L_0x0a03:
            X.AnonymousClass00C.A0B(r5)
            r5.Br3(r2)
            android.content.Context r1 = r1.A00
            android.view.View r1 = r5.B9J(r1)
            r0.addView(r1)
            r5.Bok()
            goto L_0x001c
        L_0x0a17:
            r1 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r0 = r0.findViewById(r1)
            com.whatsapp.videoplayback.BloksVideoPlayerView r0 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r0
            X.6D1 r10 = new X.6D1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A03(r2, r10)
            return r9
        L_0x0a29:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0a2f:
            int r2 = X.AnonymousClass6Y7.A06(r2)     // Catch:{ 5R5 -> 0x0a38 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch:{ 5R5 -> 0x0a38 }
            goto L_0x0a40
        L_0x0a38:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x0a3e:
            r16 = r5
        L_0x0a40:
            java.lang.String r9 = X.C140456lc.A0J(r4)
            java.lang.String r7 = X.C140456lc.A0M(r4)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r2 = 43
            r13 = 1
            boolean r2 = r4.A0f(r2, r13)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r10.equals(r2)
            r6 = r2 ^ 1
            r2 = 44
            boolean r2 = r4.A0f(r2, r13)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r10.equals(r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0b4b
            r2 = 42
            int r2 = X.C140456lc.A02(r1, r4, r2)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
        L_0x0a77:
            r2 = 36
            int r8 = r4.A0T(r2, r8)
            X.7qz r12 = new X.7qz
            r12.<init>(r4, r13)
            X.7qy r10 = new X.7qy
            r10.<init>(r1, r4, r13)
            r14 = 2
            X.7qy r2 = new X.7qy
            r2.<init>(r1, r4, r14)
            X.6Ti r4 = r3.A00
            android.content.Context r14 = r1.A00
            android.app.Activity r1 = X.C24801Dv.A00(r14)
            android.view.Window r3 = r1.getWindow()
            r1 = 8192(0x2000, float:1.14794E-41)
            r3.setFlags(r1, r1)
            r1 = 2131428871(0x7f0b0607, float:1.8479399E38)
            android.view.View r3 = r0.findViewById(r1)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            if (r3 != 0) goto L_0x0ada
            if (r11 == 0) goto L_0x0ab6
            java.lang.String r1 = "fb_pay"
            boolean r3 = r11.equals(r1)
            r1 = 2131624401(0x7f0e01d1, float:1.887598E38)
            if (r3 != 0) goto L_0x0ab9
        L_0x0ab6:
            r1 = 2131624400(0x7f0e01d0, float:1.8875979E38)
        L_0x0ab9:
            android.view.View r3 = android.view.View.inflate(r14, r1, r5)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            X.6cR r1 = new X.6cR
            r1.<init>(r4)
            r3.setCustomSelectionActionModeCallback(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3)
            X.6ol r1 = new X.6ol
            r1.<init>(r10, r2)
            if (r15 == 0) goto L_0x0b47
            int r0 = r15.intValue()
            r3.A0G(r1, r8, r0)
        L_0x0ada:
            if (r16 == 0) goto L_0x0ae3
            int r0 = r16.intValue()
            r3.setGravity(r0)
        L_0x0ae3:
            r11 = 0
            if (r9 == 0) goto L_0x0b43
            java.lang.String r0 = "error"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0b43
            r3.setErrorState(r13)
            r3.A0E()
            java.lang.String r0 = "no_error"
            r12.accept(r0)
            X.3Xn r0 = r3.A03
            r3.removeTextChangedListener(r0)
            X.6ol r1 = new X.6ol
            r1.<init>(r10, r2)
            if (r15 == 0) goto L_0x0b3f
            int r0 = r15.intValue()
            r3.A0G(r1, r8, r0)
        L_0x0b0c:
            r3.setEnabled(r6)
            r3.setCursorVisible(r11)
            if (r9 != 0) goto L_0x0b23
            if (r7 == 0) goto L_0x0b23
            java.lang.String r0 = r3.getCode()
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0b23
            r3.setCode(r7)
        L_0x0b23:
            if (r6 == 0) goto L_0x0b4e
            r3.requestFocus()
            java.lang.Object r2 = r3.getTag()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x0b39
            r0 = 4
            X.74h r2 = new X.74h
            r2.<init>(r4, r3, r0)
            r3.setTag(r2)
        L_0x0b39:
            r0 = 0
            r3.postDelayed(r2, r0)
            return r5
        L_0x0b3f:
            r3.A0F(r1, r8)
            goto L_0x0b0c
        L_0x0b43:
            r3.setErrorState(r11)
            goto L_0x0b0c
        L_0x0b47:
            r3.A0F(r1, r8)
            goto L_0x0ada
        L_0x0b4b:
            r15 = r5
            goto L_0x0a77
        L_0x0b4e:
            r3.A0E()
            return r5
        L_0x0b52:
            android.hardware.Camera r1 = android.hardware.Camera.open(r3)     // Catch:{ Exception -> 0x0b57 }
            goto L_0x0b62
        L_0x0b57:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "CAMERA EXPECTION"
            X.C36321k7.A1J(r3, r1, r2)
            r1 = 0
        L_0x0b62:
            r12.A03 = r1
            r12.A08 = r14
            r12.A07 = r7
            r12.A09 = r6
            r12.A0C = r5
            r12.A0A = r5
            r1 = 2131428548(0x7f0b04c4, float:1.8478744E38)
            android.view.View r1 = r0.findViewById(r1)
            com.whatsapp.bloks.BloksCameraOverlay r1 = (com.whatsapp.bloks.BloksCameraOverlay) r1
            r12.A05 = r1
            android.hardware.Camera r7 = r12.A03
            int r6 = r12.A00
            int r5 = r12.A02
            int r3 = r12.A01
            r2 = 0
            X.53i r1 = new X.53i
            r1.<init>(r10)
            r1.A02 = r7
            r1.A01 = r5
            r1.A00 = r3
            r1.A00 = r6
            r12.A06 = r1
            com.whatsapp.bloks.BloksCameraOverlay r1 = r12.A05
            X.C18740tg.A04(r1)
            if (r8 != 0) goto L_0x0b9a
            java.lang.String r8 = "original"
        L_0x0b9a:
            r1.A00(r8)
            r9.removeAllViews()
            X.53i r1 = r12.A06
            r9.addView(r1)
            X.53i r1 = r12.A06
            X.C18740tg.A04(r1)
            r1.getDisplayOrientation()
            r1 = 2131434094(0x7f0b1a6e, float:1.8489992E38)
            android.view.View r0 = X.C012005e.A02(r0, r1)
            X.6ZU r10 = new X.6ZU
            r10.<init>(r4, r12, r13)
            X.6ct r9 = new X.6ct
            r9.<init>(r10, r11, r12, r13, r14)
            r0.setOnClickListener(r9)
            return r2
        L_0x0bc2:
            r7.setTextDirection(r2)
            return r11
        L_0x0bc6:
            long r14 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0bcf }
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ NumberFormatException -> 0x0bcf }
            goto L_0x0bda
        L_0x0bcf:
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "WaBkComponentConfiguratorImpl/WaDatePicker/bind Max date is not a valid date format"
            X.C36321k7.A1P(r5, r11, r14)
            r16 = r4
        L_0x0bda:
            long r14 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x0be3 }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ NumberFormatException -> 0x0be3 }
            goto L_0x0bed
        L_0x0be3:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "WaBkComponentConfiguratorImpl/WaDatePicker/bind Min date is not a valid date format"
            X.C36321k7.A1P(r5, r10, r11)
            r10 = r4
        L_0x0bed:
            if (r13 == 0) goto L_0x0c3e
            X.C132376Ti.A00(r7, r3, r6)
            int r22 = r1.get(r12)
            r5 = 2
            int r23 = r1.get(r5)
            r5 = 5
            int r24 = r1.get(r5)
            r21 = 2132083161(0x7f1501d9, float:1.9806456E38)
            X.4fy r5 = new X.4fy
            r19 = r9
            r20 = r4
            r18 = r0
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            if (r16 == 0) goto L_0x0c1b
            android.widget.DatePicker r9 = r5.A01
            long r0 = r16.longValue()
            r9.setMaxDate(r0)
        L_0x0c1b:
            if (r10 == 0) goto L_0x0c26
            android.widget.DatePicker r9 = r5.A01
            long r0 = r10.longValue()
            r9.setMinDate(r0)
        L_0x0c26:
            r0 = 16
            X.C36361kB.A18(r7, r5, r0)
            X.6cI r0 = new X.6cI
            r0.<init>(r7, r3, r8, r6)
            r7.addTextChangedListener(r0)
            r1 = 15
            X.6ch r0 = new X.6ch
            r0.<init>(r2, r1)
            r3.setEndIconOnClickListener(r0)
            return r4
        L_0x0c3e:
            r7.setOnClickListener(r4)
            return r4
        L_0x0c42:
            android.content.res.ColorStateList r0 = X.AnonymousClass6RI.A01(r11, r7, r3, r6, r1)
            r2.BsY(r0, r5)
            return r15
        L_0x0c4a:
            X.4uv r3 = (X.C100384uv) r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r10 = 0
            X.AnonymousClass00C.A0D(r0, r10)
            X.C36321k7.A0x(r1, r4)
            java.lang.Object r7 = X.C133266Xn.A05(r1, r4)
            X.5s2 r7 = (X.C120765s2) r7
            r5 = 43
            r2 = 0
            float r2 = r4.A0S(r5, r2)
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            r2 = 40
            java.util.List r8 = r4.A0d(r2)
            r2 = 46
            java.util.List r5 = r4.A0d(r2)
            X.AnonymousClass00C.A08(r5)
            r2 = 45
            boolean r2 = r4.A0f(r2, r10)
            r9 = 0
            X.6Cg r6 = new X.6Cg
            r6.<init>(r11, r8, r5, r2)
            if (r7 == 0) goto L_0x0c8e
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r7.A01
            if (r2 != 0) goto L_0x0c99
            X.7sL r2 = new X.7sL
            r2.<init>(r3, r7, r0, r10)
            r7.A01 = r2
        L_0x0c8e:
            android.view.ViewTreeObserver r5 = r0.getViewTreeObserver()
            if (r7 == 0) goto L_0x0ccb
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r7.A01
        L_0x0c96:
            r5.addOnGlobalLayoutListener(r2)
        L_0x0c99:
            int r2 = r0.getChildCount()
            if (r2 <= 0) goto L_0x0d21
            android.view.View r5 = X.AnonymousClass0Q1.A00(r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.AnonymousClass00C.A0E(r5, r2)
            X.4g9 r5 = (X.C93214g9) r5
            r3.A01 = r5
            java.util.List r5 = r6.A03
            if (r7 == 0) goto L_0x0cc9
            X.6Cg r2 = r7.A02
            if (r2 == 0) goto L_0x0cc9
            java.util.List r2 = r2.A03
        L_0x0cb6:
            boolean r2 = X.AnonymousClass00C.A0J(r5, r2)
            if (r2 != 0) goto L_0x0d03
            java.lang.String r5 = "parametricSlider"
            if (r7 == 0) goto L_0x0cd4
            X.4g9 r2 = r3.A01
            if (r2 != 0) goto L_0x0ccd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0cc9:
            r2 = r9
            goto L_0x0cb6
        L_0x0ccb:
            r2 = r9
            goto L_0x0c96
        L_0x0ccd:
            int r0 = r0.getHeight()
            r2.A00(r7, r0)
        L_0x0cd4:
            java.lang.Float r8 = r6.A01
            if (r8 == 0) goto L_0x0ced
            float r2 = r8.floatValue()
            r0 = 100
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = (int) r2
            X.4g9 r0 = r3.A01
            if (r0 != 0) goto L_0x0cea
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0cea:
            r0.setProgress(r2)
        L_0x0ced:
            java.util.List r5 = r6.A02
            if (r8 == 0) goto L_0x0d15
            float r2 = r8.floatValue()
            r0 = 100
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0d15
            X.C100384uv.A01(r5)
        L_0x0d03:
            X.6dq r2 = new X.6dq
            r2.<init>(r3, r1, r4)
            r3.A00 = r2
            X.4g9 r0 = r3.A01
            if (r0 != 0) goto L_0x0d1a
            java.lang.String r0 = "parametricSlider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0d15:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x0d1a:
            r0.setOnSeekBarChangeListener(r2)
            if (r7 == 0) goto L_0x0d21
            r7.A02 = r6
        L_0x0d21:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98174r0.A0F(android.view.View, X.67i, X.6lc, java.lang.Object):java.lang.Object");
    }

    public void A0G(View view, C1271967i r5, C140456lc r6, Object obj, Object obj2) {
        Activity A002;
        if (this instanceof C100374uu) {
            Context context = r5.A00;
            CodeInputField codeInputField = (CodeInputField) C012005e.A02(view, R.id.code);
            codeInputField.removeTextChangedListener(codeInputField.A03);
            if (codeInputField.getTag() != null) {
                codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
            }
            ((ViewGroup) view).removeAllViews();
            A002 = C24801Dv.A00(context);
        } else if (this instanceof C100364ut) {
            C36411kG.A0O(view, R.id.container).removeAllViews();
            A002 = C24801Dv.A00(r5.A00);
        } else if (this instanceof C100354us) {
            AnonymousClass6XF.A04((BloksEditText) view, r5, r6);
            return;
        } else if (this instanceof C100344ur) {
            AbsSeekBar absSeekBar = (AbsSeekBar) view;
            C124975z6 r1 = (C124975z6) C133266Xn.A05(r5, r6);
            if (r1 != null) {
                absSeekBar.setThumb(r1.A08);
                r1.A0C = null;
                r1.A0D = null;
                r1.A07 = 0;
                r1.A03 = 0;
                r1.A00 = 0;
                r1.A02 = 0;
                r1.A05 = 0;
                r1.A04 = 0;
                r1.A06 = 0;
                r1.A08 = null;
                r1.A09 = null;
                r1.A0A = null;
                r1.A0B = null;
                return;
            }
            throw C90514aH.A0s("SliderController is null even though a controller is defined");
        } else if (this instanceof C100384uv) {
            ViewGroup viewGroup = (ViewGroup) view;
            AnonymousClass00C.A0D(viewGroup, 0);
            C36321k7.A0x(r5, r6);
            if (viewGroup.getChildCount() > 0) {
                View A003 = AnonymousClass0Q1.A00(viewGroup);
                AnonymousClass00C.A0E(A003, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                ((SeekBar) A003).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            }
            C120765s2 r0 = (C120765s2) C133266Xn.A05(r5, r6);
            if (r0 != null) {
                r0.A02 = null;
                r0.A01 = null;
                r0.A00 = null;
                return;
            }
            return;
        } else {
            return;
        }
        A002.getWindow().clearFlags(DefaultCrypto.BUFFER_SIZE);
    }

    public void A0H(View view, C1271967i r8, C140456lc r9, Object obj, Object obj2) {
        if (this instanceof C100324up) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C012005e.A02(view, R.id.video_view);
            videoSurfaceView.A04();
            VideoSurfaceView.A03(videoSurfaceView, false);
        } else if (this instanceof C100314uo) {
            ((C100314uo) this).A01.A02(view);
        } else if (this instanceof C100304un) {
            ImageView imageView = (ImageView) view;
            imageView.setImageBitmap((Bitmap) null);
            imageView.setImageDrawable((Drawable) null);
            imageView.setColorFilter((ColorFilter) null);
        } else if (this instanceof C100294um) {
            ImageView imageView2 = (ImageView) view;
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setTag((Object) null);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setColorFilter((ColorFilter) null);
            imageView2.setScaleX(1.0f);
        } else if (this instanceof C100374uu) {
        } else {
            if (this instanceof C100284ul) {
                C143246qE r1 = (C143246qE) ((C16190ol) C133266Xn.A05(r8, ((C100284ul) this).A00));
                C132536Ue.A02(r1);
                Camera camera = r1.A03;
                if (camera != null) {
                    camera.release();
                    r1.A03 = null;
                }
            } else if (this instanceof C100334uq) {
                C100334uq r2 = (C100334uq) this;
                ViewGroup viewGroup = (ViewGroup) view;
                AnonymousClass00C.A0D(viewGroup, 0);
                C132676Uu r12 = r2.A00;
                if (r12 == null) {
                    throw C36331k8.A0d("selfieViewProvider");
                }
                C23114B5t b5t = r12.A02;
                if (b5t != null) {
                    b5t.destroy();
                }
                C132676Uu.A01(C132676Uu.A00(r12.A05, r12), r12);
                r12.A02 = null;
                r12.A01 = null;
                viewGroup.removeAllViews();
                C123725wz r22 = r2.A04;
                Context context = r22.A05;
                AnonymousClass00C.A0E(context, "null cannot be cast to non-null type android.app.Application");
                ((Application) context).unregisterActivityLifecycleCallbacks(r22.A04);
            } else if (this instanceof C100274uk) {
                C36391kE.A1K((TextView) view);
            } else if (!(this instanceof C100184ub) && !(this instanceof C100174ua)) {
                if (this instanceof C100224uf) {
                    AnonymousClass07P r7 = (AnonymousClass07P) view;
                    C36391kE.A1K(r7);
                    r7.setGravity(8388659);
                    r7.setMovementMethod((MovementMethod) null);
                    ((TextEmojiLabel) r7).setLinkHandler((C34021gK) null);
                } else if (!(this instanceof C100264uj) && !(this instanceof C100214ue)) {
                    if (this instanceof C100204ud) {
                        C90504aG.A0J(view, R.id.recycler_view).setAdapter((AnonymousClass0CZ) null);
                    } else if (this instanceof C100364ut) {
                        C142036oE r5 = (C142036oE) C133266Xn.A05(r8, r9);
                        r5.A04 = null;
                        if (C36411kG.A0O(view, R.id.container).getChildCount() != 0) {
                            TextInputLayout textInputLayout = (TextInputLayout) C012005e.A02(view, R.id.default_text_input_layout);
                            EditText editText = (EditText) C012005e.A02(textInputLayout, R.id.text_view);
                            r5.A00 = editText.getSelectionEnd();
                            r5.A01 = editText.getSelectionStart();
                            r5.A05 = C36361kB.A0n(editText);
                            editText.removeTextChangedListener(r5.A03);
                            editText.setText("");
                            TextWatcher textWatcher = r5.A02;
                            if (textWatcher != null) {
                                editText.removeTextChangedListener(textWatcher);
                            }
                            editText.setFilters(AnonymousClass6RX.A00);
                            editText.setTypeface(Typeface.DEFAULT);
                            editText.setEnabled(true);
                            editText.setFocusableInTouchMode(true);
                            editText.setFocusable(true);
                            editText.setCursorVisible(true);
                            textInputLayout.setPasswordVisibilityToggleEnabled(true);
                            textInputLayout.setError((CharSequence) null);
                            textInputLayout.setErrorEnabled(false);
                            textInputLayout.setHint((CharSequence) "");
                        }
                    } else if (this instanceof C100254ui) {
                        TextView A0O = C36391kE.A0O(view, R.id.hintOrDate);
                        A0O.setOnClickListener((View.OnClickListener) null);
                        A0O.setText("");
                        A0O.setEnabled(false);
                        A0O.setClickable(false);
                        ((TextInputLayout) C012005e.A02(view, R.id.inputView)).setHint((CharSequence) "");
                    } else if (this instanceof C100244uh) {
                        C116675ky r13 = (C116675ky) C133266Xn.A05(r8, ((C100244uh) this).A00);
                        CountDownTimer countDownTimer = r13.A00;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                            r13.A00 = null;
                        }
                        C36391kE.A0O(view, R.id.start_message).setText("");
                        C36391kE.A0O(view, R.id.timer_text).setText("");
                    } else if (this instanceof C100194uc) {
                    } else {
                        if (this instanceof C100354us) {
                            AnonymousClass6XF.A05((BloksEditText) view, r8, r9);
                        } else if (this instanceof C100164uZ) {
                            ImageView imageView3 = (ImageView) view;
                            AnonymousClass00C.A0D(imageView3, 0);
                            imageView3.clearColorFilter();
                        } else if (this instanceof C100154uY) {
                        } else {
                            if (this instanceof C100144uX) {
                                ((C92784ei) ((C160577lE) view)).A00.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            } else if ((this instanceof C100134uW) || (this instanceof C100124uV)) {
                                C92964fF r72 = (C92964fF) view;
                                AnonymousClass00C.A0D(r72, 0);
                                Animatable animatable = r72.A00;
                                if (animatable != null) {
                                    animatable.stop();
                                }
                                r72.A01 = false;
                            } else if (this instanceof C100234ug) {
                                C100234ug r23 = (C100234ug) this;
                                ViewGroup viewGroup2 = (ViewGroup) view;
                                C36321k7.A0w(viewGroup2, r8);
                                viewGroup2.removeAllViews();
                                C23114B5t b5t2 = r23.A00;
                                if (b5t2 == null) {
                                    b5t2 = r23.A01.B4g(r8.A00);
                                    r23.A00 = b5t2;
                                }
                                AnonymousClass00C.A0B(b5t2);
                                b5t2.pause();
                            } else {
                                ViewGroup viewGroup3 = (ViewGroup) view;
                                AnonymousClass00C.A0D(viewGroup3, 0);
                                if (viewGroup3.getChildCount() > 0) {
                                    View A002 = AnonymousClass0Q1.A00(viewGroup3);
                                    AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                                    ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ Class BG1() {
        return getClass();
    }
}
