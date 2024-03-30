package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass11F;
import X.AnonymousClass12P;
import X.AnonymousClass16L;
import X.AnonymousClass1JD;
import X.AnonymousClass1N6;
import X.AnonymousClass1XS;
import X.AnonymousClass2RC;
import X.AnonymousClass3FQ;
import X.AnonymousClass3K8;
import X.AnonymousClass3U9;
import X.AnonymousClass4RX;
import X.AnonymousClass64G;
import X.AnonymousClass6F9;
import X.AnonymousClass6OO;
import X.AnonymousClass6WU;
import X.AnonymousClass6YT;
import X.C007103b;
import X.C012005e;
import X.C100934wH;
import X.C125075zH;
import X.C1264664c;
import X.C1270866x;
import X.C128886Dz;
import X.C132366Tg;
import X.C132446Tt;
import X.C134496b8;
import X.C145656uJ;
import X.C145666uK;
import X.C157297cj;
import X.C162037nv;
import X.C18740tg;
import X.C18950u5;
import X.C19430v1;
import X.C20830yE;
import X.C21050ya;
import X.C225314u;
import X.C25841Hw;
import X.C29411Wn;
import X.C36321k7;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C41041wW;
import X.C64953Qc;
import X.C88924Uo;
import X.C90504aG;
import X.C90524aI;
import X.C92104d8;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CameraActivity extends C100934wH implements AnonymousClass4RX, C157297cj {
    public C29411Wn A00;
    public AnonymousClass16L A01;
    public AnonymousClass6YT A02;
    public C125075zH A03;
    public C64953Qc A04;
    public C20830yE A05;
    public AnonymousClass12P A06;
    public C25841Hw A07;
    public AnonymousClass1XS A08;
    public WhatsAppLibLoader A09;
    public AnonymousClass1JD A0A;
    public AnonymousClass3FQ A0B;
    public C1264664c A0C;
    public AnonymousClass1N6 A0D;
    public C1270866x A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass02E A0G;
    public final Rect A0H = AnonymousClass001.A06();

    public boolean A2g() {
        return true;
    }

    public void Bdw() {
        this.A02.A0t.A0e = false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            if (i != 90) {
                super.onActivityResult(i, i2, intent);
            } else {
                this.A02.A0Q(i, i2, intent);
            }
        } else if (i2 == -1) {
            this.A02.A0P();
        } else {
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d8, code lost:
        if (r8 == 0) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r12 = this;
            X.6YT r2 = r12.A02
            X.14u r0 = r2.A0A
            if (r0 == 0) goto L_0x0110
            r7 = 0
            boolean r0 = r2.A0S()
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.6OO r0 = r2.A0I
            boolean r0 = r0.A02()
            X.AnonymousClass6YT.A0L(r2, r0)
        L_0x0017:
            return
        L_0x0018:
            X.6F9 r0 = r2.A0F
            if (r0 == 0) goto L_0x008a
            com.whatsapp.camera.CameraBottomSheetBehavior r3 = r0.A0B
            int r1 = r3.A0J
            r0 = 3
            if (r1 != r0) goto L_0x005e
            r0 = 4
            r3.A0W(r0)
            X.6Uz r3 = r2.A0i
            X.6Dz r0 = r2.A0g
            java.util.Set r0 = r0.A09
            boolean r2 = X.C90514aH.A1a(r0)
            boolean r0 = X.C132726Uz.A02(r3)
            if (r0 == 0) goto L_0x0017
            X.58n r1 = new X.58n
            r1.<init>()
            X.1Xu r0 = r3.A01
            java.lang.Long r0 = r0.A00
            r1.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A01 = r0
            java.lang.Integer r0 = X.C36371kC.A0p()
            r1.A09 = r0
            int r0 = X.C36371kC.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            X.0yW r0 = r3.A00
            r0.Blv(r1)
            return
        L_0x005e:
            X.6Dz r1 = r2.A0g
            java.util.Set r3 = r1.A09
            boolean r0 = X.C90514aH.A1a(r3)
            if (r0 == 0) goto L_0x008a
            r3.clear()
            X.6Tg r0 = new X.6Tg
            r0.<init>()
            r1.A03 = r0
            java.util.List r0 = r1.A08
            r0.clear()
            X.6WU r1 = r2.A0E
            int r0 = r3.size()
            r1.A05(r7, r0)
            X.6F9 r0 = r2.A0F
            X.1wW r0 = r0.A04
            if (r0 == 0) goto L_0x0017
            r0.A06()
            return
        L_0x008a:
            X.6Dz r0 = r2.A0g
            r0.A00()
            X.AnonymousClass6YT.A05(r2)
            X.6Uz r3 = r2.A0i
            X.7m8 r0 = r2.A0C
            boolean r11 = r0.BLt()
            X.7m8 r0 = r2.A0C
            int r8 = r0.getZoomLevel()
            X.7m8 r0 = r2.A0C
            java.lang.String r10 = r0.getFlashMode()
            boolean r9 = X.AnonymousClass6YT.A0M(r2)
            X.7kJ r0 = r2.A12
            int r4 = r0.BEh()
            boolean r0 = X.C132726Uz.A02(r3)
            if (r0 == 0) goto L_0x0110
            X.58n r2 = new X.58n
            r2.<init>()
            java.lang.Integer r0 = X.C36381kD.A0n()
            r2.A09 = r0
            X.1Xu r1 = r3.A01
            java.lang.Long r0 = r1.A00
            r2.A0G = r0
            r6 = 2
            r5 = 1
            int r0 = X.C36391kE.A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 100
            if (r8 == r0) goto L_0x00da
            r0 = 1
            if (r8 != 0) goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            int r0 = X.C132726Uz.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            if (r9 == 0) goto L_0x00ee
            r6 = 1
        L_0x00ee:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A00 = r0
            if (r4 == r5) goto L_0x0108
            r0 = 2
            if (r4 == r0) goto L_0x0108
            r0 = 3
            if (r4 != r0) goto L_0x010b
        L_0x0108:
            r0 = 0
            r1.A00 = r0
        L_0x010b:
            X.0yW r0 = r3.A00
            r0.Blv(r2)
        L_0x0110:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onBackPressed():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0248, code lost:
        if (r0 != false) goto L_0x024a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r46) {
        /*
            r45 = this;
            r7 = r45
            r6 = r46
            super.onCreate(r6)
            X.6rv r13 = new X.6rv
            r13.<init>(r7)
            if (r46 == 0) goto L_0x001c
            X.01z r1 = r7.getSupportFragmentManager()
            java.lang.String r0 = "media_picker_fragment_tag"
            X.02E r0 = r1.A0M(r6, r0)
            r7.A0G = r0
            if (r0 != 0) goto L_0x0026
        L_0x001c:
            X.005 r0 = r7.A0F
            java.lang.Object r0 = r0.get()
            X.02E r0 = (X.AnonymousClass02E) r0
            r7.A0G = r0
        L_0x0026:
            X.3FQ r2 = r7.A0B
            X.0yC r1 = r7.A0D
            r0 = 611(0x263, float:8.56E-43)
            boolean r1 = r1.A0E(r0)
            X.0yf r0 = r7.A06
            X.0yi r5 = X.C21100yf.A0o
            boolean r0 = r0.A09(r5)
            r4 = 0
            X.3Pk r38 = r2.A00(r7, r1, r0)
            X.5zH r12 = r7.A03
            X.02E r0 = r7.A0G
            r44 = r0
            X.0wG r0 = r12.A0C
            r32 = r0
            X.0wo r0 = r12.A0B
            r31 = r0
            X.16L r0 = r12.A03
            r43 = r0
            X.0yC r0 = r12.A0G
            r35 = r0
            X.17Y r0 = r12.A01
            r23 = r0
            X.0wU r0 = r12.A0K
            r21 = r0
            X.0y0 r0 = r12.A00
            r20 = r0
            X.6N7 r0 = r12.A0H
            r19 = r0
            X.1Pm r0 = r12.A0L
            r18 = r0
            X.1MK r0 = r12.A04
            r22 = r0
            X.0yb r0 = r12.A0A
            r17 = r0
            X.0ts r0 = r12.A0E
            r16 = r0
            X.5Ln r15 = r12.A02
            X.6Dz r14 = r12.A06
            X.0v0 r11 = r12.A0D
            X.6Uz r10 = r12.A07
            X.6Wu r9 = r12.A08
            X.1Q4 r8 = r12.A05
            X.0wg r3 = r12.A0I
            X.66x r2 = r12.A0J
            X.3Qc r1 = r12.A09
            X.1Hw r0 = r12.A0F
            boolean r42 = r0.A02()
            X.6YT r0 = new X.6YT
            r24 = r8
            r25 = r14
            r26 = r12
            r27 = r10
            r28 = r9
            r29 = r1
            r30 = r17
            r33 = r11
            r34 = r16
            r36 = r19
            r37 = r3
            r39 = r2
            r40 = r21
            r41 = r18
            r16 = r0
            r17 = r44
            r18 = r20
            r19 = r23
            r20 = r15
            r21 = r43
            r23 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r7.A02 = r0
            r0 = 2131896388(0x7f122844, float:1.9427636E38)
            r7.setTitle(r0)
            X.0wQ r0 = r7.A02
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x069a
            X.12P r0 = r7.A06
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x069a
            X.12U r0 = r7.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x069a
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r7.A09
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e9:
            r7.finish()
        L_0x00ec:
            return
        L_0x00ed:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.intent.action.CREATE_SHORTCUT"
            boolean r0 = r0.equals(r1)
            r1 = -1
            if (r0 == 0) goto L_0x0110
            X.1Wn r0 = r7.A00
            X.0wG r0 = r0.A09
            android.content.Context r2 = r0.A00
            X.0X5 r0 = X.C29411Wn.A00(r2)
            android.content.Intent r0 = X.AnonymousClass0Z4.A01(r2, r0)
            r7.setResult(r1, r0)
            goto L_0x00e9
        L_0x0110:
            X.0wx r0 = r7.A08
            long r10 = r0.A01()
            X.0yC r2 = r7.A0D
            r0 = 3658(0xe4a, float:5.126E-42)
            long r8 = X.C36401kF.A04(r2, r0)
            r2 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x012c
            X.17Y r1 = r7.A05
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            r1.A04(r0, r2)
            goto L_0x00e9
        L_0x012c:
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r19 = "media_sharing_user_journey_origin"
            r0 = r19
            int r8 = r3.getIntExtra(r0, r1)
            android.content.Intent r0 = r7.getIntent()
            int r3 = r0.getFlags()
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x016a
            java.lang.String r0 = "cameraactivity/create/restart-old-shortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.camera.LauncherCameraActivity"
            r3.setClassName(r1, r0)
            r0 = r19
            r3.putExtra(r0, r8)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "camera_origin"
            r3.putExtra(r0, r2)
            r7.startActivity(r3)
            goto L_0x00e9
        L_0x016a:
            android.view.Window r8 = r7.getWindow()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r3)
            r8.setBackgroundDrawable(r0)
            android.view.Window r0 = r7.getWindow()
            X.C24801Dv.A04(r0)
            r0 = 2131624016(0x7f0e0050, float:1.88752E38)
            r7.setContentView((int) r0)
            r0 = 2131428545(0x7f0b04c1, float:1.8478738E38)
            android.view.View r15 = r7.findViewById(r0)
            android.view.Window r3 = r7.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r3.addFlags(r0)
            r15.setSystemUiVisibility(r0)
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x0292
            android.os.Bundle r0 = X.C36371kC.A0H(r7)
            if (r0 == 0) goto L_0x0292
            android.os.Bundle r3 = X.C36371kC.A0H(r7)
            java.lang.String r0 = "media_preview_params"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0292
            X.6Tg r20 = new X.6Tg
            r20.<init>()
            android.os.Bundle r3 = X.C36371kC.A0H(r7)
            r0 = r20
            r0.A05(r3)
        L_0x01be:
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r3 = r3.getStringArrayListExtra(r0)
            if (r3 == 0) goto L_0x0280
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            java.util.ArrayList r9 = X.AnonymousClass143.A06(r0, r3)
        L_0x01d0:
            X.1Hw r0 = r7.A07
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x027b
            r7.setRequestedOrientation(r1)
            android.view.Window r1 = r7.getWindow()
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            r0.rotationAnimation = r2
            r1.setAttributes(r0)
        L_0x01e8:
            X.6YT r8 = r7.A02
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.content.Intent r3 = r7.getIntent()
            r0 = 0
            java.lang.String r2 = "quoted_message_row_id"
            long r2 = r3.getLongExtra(r2, r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            X.147 r14 = X.C65533Sl.A00(r1, r0)
            android.content.Intent r10 = r7.getIntent()
            java.lang.String r0 = "chat_opened_from_url"
            r1 = 0
            boolean r13 = r10.getBooleanExtra(r0, r1)
            android.content.Intent r10 = r7.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r12 = r10.getStringExtra(r0)
            android.content.Intent r10 = r7.getIntent()
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r10.getStringExtra(r0)
            java.util.ArrayList r10 = X.C65713Te.A03(r0)
            if (r46 != 0) goto L_0x0276
            android.content.Intent r11 = r7.getIntent()
            java.lang.String r0 = "uris"
            java.util.ArrayList r18 = r11.getParcelableArrayListExtra(r0)
        L_0x0231:
            android.content.Intent r11 = r7.getIntent()
            java.lang.String r0 = "enable_qr_scan"
            boolean r0 = r11.getBooleanExtra(r0, r1)
            if (r0 != 0) goto L_0x024a
            boolean r0 = r7 instanceof com.whatsapp.camera.LauncherCameraActivity
            if (r0 == 0) goto L_0x0274
            X.0yf r0 = r7.A06
            boolean r0 = r0.A09(r5)
        L_0x0247:
            r11 = 0
            if (r0 == 0) goto L_0x024b
        L_0x024a:
            r11 = 1
        L_0x024b:
            android.content.Intent r5 = r7.getIntent()
            java.lang.String r0 = "add_more_image"
            boolean r17 = r5.getBooleanExtra(r0, r1)
            if (r46 != 0) goto L_0x0261
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "selected_uris"
            java.util.ArrayList r4 = r1.getParcelableArrayListExtra(r0)
        L_0x0261:
            X.66x r0 = r7.A0E
            r33 = r0
            r5 = r9
            if (r15 == 0) goto L_0x0296
            android.view.LayoutInflater r6 = r7.getLayoutInflater()
            r1 = 2131624343(0x7f0e0197, float:1.8875863E38)
            r0 = 1
            r6.inflate(r1, r15, r0)
            goto L_0x0296
        L_0x0274:
            r0 = 0
            goto L_0x0247
        L_0x0276:
            r18 = r4
            r20 = r4
            goto L_0x0231
        L_0x027b:
            r7.setRequestedOrientation(r2)
            goto L_0x01e8
        L_0x0280:
            X.11F r0 = X.C36331k8.A0F(r7)
            if (r0 != 0) goto L_0x028c
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x01d0
        L_0x028c:
            java.util.List r9 = java.util.Collections.singletonList(r0)
            goto L_0x01d0
        L_0x0292:
            r20 = r4
            goto L_0x01be
        L_0x0296:
            X.6Wu r6 = r8.A0j     // Catch:{ all -> 0x06a8 }
            X.7kJ r0 = r8.A12     // Catch:{ all -> 0x06a8 }
            int r0 = r0.BEh()     // Catch:{ all -> 0x06a8 }
            java.lang.String r1 = X.AnonymousClass3LY.A01(r0)     // Catch:{ all -> 0x06a8 }
            java.lang.String r0 = "cold"
            X.C133106Wu.A04(r6, r0, r1)     // Catch:{ all -> 0x06a8 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x06a8 }
            r6.A01 = r0     // Catch:{ all -> 0x06a8 }
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r16 = "onCreate"
            r0 = r16
            X.C133106Wu.A03(r6, r0, r1)     // Catch:{ all -> 0x06a8 }
            r8.A0A = r7     // Catch:{ all -> 0x06a8 }
            if (r9 != 0) goto L_0x02bf
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x06a8 }
        L_0x02bf:
            r8.A0M = r5     // Catch:{ all -> 0x06a8 }
            r8.A03 = r2     // Catch:{ all -> 0x06a8 }
            r8.A0J = r14     // Catch:{ all -> 0x06a8 }
            r8.A0P = r13     // Catch:{ all -> 0x06a8 }
            r8.A0L = r12     // Catch:{ all -> 0x06a8 }
            r8.A0N = r10     // Catch:{ all -> 0x06a8 }
            r0 = 2131433484(0x7f0b180c, float:1.8488755E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x06a8 }
            r8.A09 = r1     // Catch:{ all -> 0x06a8 }
            r0 = 2131428544(0x7f0b04c0, float:1.8478735E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)     // Catch:{ all -> 0x06a8 }
            r8.A06 = r0     // Catch:{ all -> 0x06a8 }
            r1 = 2131428551(0x7f0b04c7, float:1.847875E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.View r0 = X.C012005e.A02(r0, r1)     // Catch:{ all -> 0x06a8 }
            r8.A07 = r0     // Catch:{ all -> 0x06a8 }
            X.1Pm r1 = r8.A0x     // Catch:{ all -> 0x06a8 }
            X.1NK r0 = r8.A0w     // Catch:{ all -> 0x06a8 }
            r1.registerObserver(r0)     // Catch:{ all -> 0x06a8 }
            if (r4 == 0) goto L_0x02fe
            X.6Dz r1 = r8.A0g     // Catch:{ all -> 0x06a8 }
            r0 = 1
            r1.A04 = r0     // Catch:{ all -> 0x06a8 }
            java.util.Set r0 = r1.A09     // Catch:{ all -> 0x06a8 }
            r0.clear()     // Catch:{ all -> 0x06a8 }
            r0.addAll(r4)     // Catch:{ all -> 0x06a8 }
        L_0x02fe:
            X.0wg r0 = r8.A0s     // Catch:{ all -> 0x06a8 }
            X.0yb r10 = r8.A0l     // Catch:{ all -> 0x06a8 }
            int r1 = X.AnonymousClass1K2.A02(r10, r0)     // Catch:{ all -> 0x06a8 }
            X.14u r2 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = "Host activity is NULL"
            java.util.Objects.requireNonNull(r2, r5)     // Catch:{ all -> 0x06a8 }
            boolean r0 = r8.A0z     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x0432
            java.lang.String r0 = "createSimpleView"
            X.7m8 r1 = X.C129436Gy.A00(r2, r0, r1)     // Catch:{ all -> 0x06a8 }
            if (r1 == 0) goto L_0x0432
            java.lang.String r0 = "camera/CameraInterface/LiteCameraView/"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06a8 }
        L_0x031e:
            r8.A0C = r1     // Catch:{ all -> 0x06a8 }
            r1.setQrScanningEnabled(r11)     // Catch:{ all -> 0x06a8 }
            X.7m8 r1 = r8.A0C     // Catch:{ all -> 0x06a8 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x06a8 }
            r8.A08 = r1     // Catch:{ all -> 0x06a8 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x06a8 }
            r1 = 2131428553(0x7f0b04c9, float:1.8478754E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.ViewGroup r4 = X.C36411kG.A0O(r0, r1)     // Catch:{ all -> 0x06a8 }
            android.view.View r3 = r8.A08     // Catch:{ all -> 0x06a8 }
            r2 = -2
            r1 = 17
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2, r2, r1)     // Catch:{ all -> 0x06a8 }
            r4.addView(r3, r0)     // Catch:{ all -> 0x06a8 }
            X.14u r0 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r0, r5)     // Catch:{ all -> 0x06a8 }
            boolean r0 = r0 instanceof com.whatsapp.camera.CameraActivity     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x035b
            boolean r0 = r8.A10     // Catch:{ all -> 0x06a8 }
            if (r0 != 0) goto L_0x035b
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()     // Catch:{ all -> 0x06a8 }
            X.0BJ r1 = (X.AnonymousClass0BJ) r1     // Catch:{ all -> 0x06a8 }
            java.lang.String r0 = "9:16"
            r1.A0u = r0     // Catch:{ all -> 0x06a8 }
        L_0x035b:
            X.0wG r0 = r8.A0n     // Catch:{ all -> 0x06a8 }
            android.content.res.Resources r3 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x06a8 }
            android.view.View r0 = r8.A06     // Catch:{ all -> 0x06a8 }
            android.content.Context r2 = r0.getContext()     // Catch:{ all -> 0x06a8 }
            r1 = 2130968861(0x7f04011d, float:1.7546388E38)
            r0 = 2131099982(0x7f06014e, float:1.7812333E38)
            int r0 = X.C224514j.A00(r2, r1, r0)     // Catch:{ all -> 0x06a8 }
            int r1 = r3.getColor(r0)     // Catch:{ all -> 0x06a8 }
            android.view.View r0 = r8.A06     // Catch:{ all -> 0x06a8 }
            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x06a8 }
            android.view.View r0 = r8.A07     // Catch:{ all -> 0x06a8 }
            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x06a8 }
            r1 = 2131428532(0x7f0b04b4, float:1.8478711E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.View r3 = X.C012005e.A02(r0, r1)     // Catch:{ all -> 0x06a8 }
            r8.A05 = r3     // Catch:{ all -> 0x06a8 }
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N     // Catch:{ all -> 0x06a8 }
            X.7m8 r1 = r8.A0C     // Catch:{ all -> 0x06a8 }
            boolean r11 = r8.A10     // Catch:{ all -> 0x06a8 }
            X.5tC r13 = r8.A0h     // Catch:{ all -> 0x06a8 }
            boolean r4 = r13.A01     // Catch:{ all -> 0x06a8 }
            X.5tE r0 = new X.5tE     // Catch:{ all -> 0x06a8 }
            r0.<init>(r11, r4)     // Catch:{ all -> 0x06a8 }
            X.6WU r2 = new X.6WU     // Catch:{ all -> 0x06a8 }
            r2.<init>(r3, r1, r0)     // Catch:{ all -> 0x06a8 }
            r8.A0E = r2     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r1 = r2.A0H     // Catch:{ all -> 0x06a8 }
            r3 = 12
            X.3YE r0 = new X.3YE     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2, r8, r3)     // Catch:{ all -> 0x06a8 }
            r1.setOnClickListener(r0)     // Catch:{ all -> 0x06a8 }
            r3 = 1
            X.7q2 r0 = new X.7q2     // Catch:{ all -> 0x06a8 }
            r0.<init>(r8, r3)     // Catch:{ all -> 0x06a8 }
            r1.setOnLongClickListener(r0)     // Catch:{ all -> 0x06a8 }
            r0 = 4
            X.AnonymousClass6UI.A00(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r1 = r2.A0I     // Catch:{ all -> 0x06a8 }
            r0 = 38
            X.C135456cj.A01(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r1 = r2.A0F     // Catch:{ all -> 0x06a8 }
            r0 = 36
            X.C135456cj.A01(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            android.view.View r1 = r2.A0C     // Catch:{ all -> 0x06a8 }
            r0 = 28
            X.C48812i6.A00(r1, r8, r2, r0)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r1 = r2.A0G     // Catch:{ all -> 0x06a8 }
            r0 = 37
            X.C135456cj.A01(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r1 = r2.A0E     // Catch:{ all -> 0x06a8 }
            r0 = 35
            X.C135456cj.A01(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            r1 = 2131428546(0x7f0b04c2, float:1.847874E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.View r1 = X.C012005e.A02(r0, r1)     // Catch:{ all -> 0x06a8 }
            r0 = 0
            r1.setFitsSystemWindows(r0)     // Catch:{ all -> 0x06a8 }
            r1.invalidate()     // Catch:{ all -> 0x06a8 }
            android.view.View r0 = r8.A08     // Catch:{ all -> 0x06a8 }
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()     // Catch:{ all -> 0x06a8 }
            r0 = 6
            X.C164757sK.A00(r1, r8, r0)     // Catch:{ all -> 0x06a8 }
            X.6rt r12 = new X.6rt     // Catch:{ all -> 0x06a8 }
            r12.<init>(r8)     // Catch:{ all -> 0x06a8 }
            r1 = 2131428547(0x7f0b04c3, float:1.8478742E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.View r2 = X.C012005e.A02(r0, r1)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.camera.mode.CameraModeTabLayout r2 = (com.whatsapp.camera.mode.CameraModeTabLayout) r2     // Catch:{ all -> 0x06a8 }
            boolean r1 = r13.A02     // Catch:{ all -> 0x06a8 }
            X.60p r0 = new X.60p     // Catch:{ all -> 0x06a8 }
            r0.<init>(r12, r2, r1)     // Catch:{ all -> 0x06a8 }
            r8.A0G = r0     // Catch:{ all -> 0x06a8 }
            X.5lc r14 = new X.5lc     // Catch:{ all -> 0x06a8 }
            r14.<init>(r8)     // Catch:{ all -> 0x06a8 }
            r1 = 2131433211(0x7f0b16fb, float:1.8488201E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.View r2 = X.C012005e.A02(r0, r1)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.camera.recording.RecordingView r2 = (com.whatsapp.camera.recording.RecordingView) r2     // Catch:{ all -> 0x06a8 }
            X.0ts r0 = r8.A0p     // Catch:{ all -> 0x06a8 }
            r32 = r0
            X.0wo r15 = r8.A0m     // Catch:{ all -> 0x06a8 }
            java.util.List r0 = r8.A0M     // Catch:{ all -> 0x06a8 }
            boolean r12 = X.AnonymousClass143.A0L(r0)     // Catch:{ all -> 0x06a8 }
            X.0yC r1 = r8.A0q     // Catch:{ all -> 0x06a8 }
            r0 = 3185(0xc71, float:4.463E-42)
            if (r12 == 0) goto L_0x0440
            goto L_0x043e
        L_0x0432:
            java.lang.String r0 = "camera/CameraInterface/CameraView"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06a8 }
            X.53k r1 = new X.53k     // Catch:{ all -> 0x06a8 }
            r1.<init>(r2)     // Catch:{ all -> 0x06a8 }
            goto L_0x031e
        L_0x043e:
            r0 = 4155(0x103b, float:5.822E-42)
        L_0x0440:
            long r26 = X.C36401kF.A04(r1, r0)     // Catch:{ all -> 0x06a8 }
            X.5pq r13 = r8.A0e     // Catch:{ all -> 0x06a8 }
            java.util.List r12 = r8.A0M     // Catch:{ all -> 0x06a8 }
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)     // Catch:{ all -> 0x06a8 }
            boolean r0 = X.AnonymousClass143.A0N(r12)     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x04c3
            X.0yC r12 = r13.A01     // Catch:{ all -> 0x06a8 }
            r0 = 7901(0x1edd, float:1.1072E-41)
            int r0 = r12.A07(r0)     // Catch:{ all -> 0x06a8 }
            long r28 = X.C36371kC.A07(r0)
        L_0x045e:
            X.6OO r0 = new X.6OO     // Catch:{ all -> 0x06a8 }
            r21 = r0
            r22 = r14
            r23 = r2
            r24 = r15
            r25 = r32
            r21.<init>(r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x06a8 }
            r8.A0I = r0     // Catch:{ all -> 0x06a8 }
            X.7m8 r12 = r8.A0C     // Catch:{ all -> 0x06a8 }
            r2 = 2131428549(0x7f0b04c5, float:1.8478746E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.ViewGroup r2 = X.C36411kG.A0O(r0, r2)     // Catch:{ all -> 0x06a8 }
            X.64G r0 = new X.64G     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2, r12, r3)     // Catch:{ all -> 0x06a8 }
            r8.A0H = r0     // Catch:{ all -> 0x06a8 }
            X.14u r12 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r12, r5)     // Catch:{ all -> 0x06a8 }
            X.6ru r2 = new X.6ru     // Catch:{ all -> 0x06a8 }
            r2.<init>(r8)     // Catch:{ all -> 0x06a8 }
            X.6cV r0 = new X.6cV     // Catch:{ all -> 0x06a8 }
            r0.<init>(r12, r2, r3)     // Catch:{ all -> 0x06a8 }
            r8.A0B = r0     // Catch:{ all -> 0x06a8 }
            android.view.View r12 = r8.A08     // Catch:{ all -> 0x06a8 }
            r2 = 2
            X.2s6 r0 = new X.2s6     // Catch:{ all -> 0x06a8 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x06a8 }
            r12.setOnTouchListener(r0)     // Catch:{ all -> 0x06a8 }
            X.60p r0 = r8.A0G     // Catch:{ all -> 0x06a8 }
            com.whatsapp.camera.mode.CameraModeTabLayout r13 = r0.A00     // Catch:{ all -> 0x06a8 }
            android.content.Context r12 = r13.getContext()     // Catch:{ all -> 0x06a8 }
            X.5ld r2 = new X.5ld     // Catch:{ all -> 0x06a8 }
            r2.<init>(r0)     // Catch:{ all -> 0x06a8 }
            X.4d2 r0 = new X.4d2     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2)     // Catch:{ all -> 0x06a8 }
            X.0Th r2 = new X.0Th     // Catch:{ all -> 0x06a8 }
            r2.<init>(r12, r0)     // Catch:{ all -> 0x06a8 }
            r0 = 5
            X.AnonymousClass6UI.A00(r13, r2, r0)     // Catch:{ all -> 0x06a8 }
            X.7m8 r2 = r8.A0C     // Catch:{ all -> 0x06a8 }
            X.6rs r0 = new X.6rs     // Catch:{ all -> 0x06a8 }
            r0.<init>(r8)     // Catch:{ all -> 0x06a8 }
            r2.setCameraCallback(r0)     // Catch:{ all -> 0x06a8 }
            goto L_0x04cf
        L_0x04c3:
            int r12 = r13.A00     // Catch:{ all -> 0x06a8 }
            r0 = 14
            if (r12 != r0) goto L_0x04cc
            r28 = 30000(0x7530, double:1.4822E-319)
            goto L_0x045e
        L_0x04cc:
            r28 = -1
            goto L_0x045e
        L_0x04cf:
            if (r11 != 0) goto L_0x04ee
            X.14u r11 = r8.A0A     // Catch:{ all -> 0x06a8 }
            boolean r0 = r11 instanceof com.whatsapp.camera.CameraActivity     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x04ee
            X.5lZ r2 = new X.5lZ     // Catch:{ all -> 0x06a8 }
            r2.<init>(r8)     // Catch:{ all -> 0x06a8 }
            X.4d8 r0 = new X.4d8     // Catch:{ all -> 0x06a8 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x06a8 }
            r8.A0D = r0     // Catch:{ all -> 0x06a8 }
            boolean r0 = r0.canDetectOrientation()     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x04f7
            X.4d8 r0 = r8.A0D     // Catch:{ all -> 0x06a8 }
            r0.enable()     // Catch:{ all -> 0x06a8 }
        L_0x04ee:
            r0 = 789(0x315, float:1.106E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x06a8 }
            r8.A0U = r0     // Catch:{ all -> 0x06a8 }
            goto L_0x04fb
        L_0x04f7:
            r0 = 0
            r8.A0D = r0     // Catch:{ all -> 0x06a8 }
            goto L_0x04ee
        L_0x04fb:
            if (r0 == 0) goto L_0x0517
            X.6WU r0 = r8.A0E     // Catch:{ all -> 0x06a8 }
            com.whatsapp.WaImageView r0 = r0.A0H     // Catch:{ all -> 0x06a8 }
            r11 = 0
            r0.setSoundEffectsEnabled(r11)     // Catch:{ all -> 0x06a8 }
            android.media.SoundPool r2 = new android.media.SoundPool     // Catch:{ all -> 0x06a8 }
            r2.<init>(r3, r3, r11)     // Catch:{ all -> 0x06a8 }
            r8.A04 = r2     // Catch:{ all -> 0x06a8 }
            X.14u r1 = r8.A0A     // Catch:{ all -> 0x06a8 }
            r0 = 2132017218(0x7f140042, float:1.9672708E38)
            int r0 = r2.load(r1, r0, r11)     // Catch:{ all -> 0x06a8 }
            r8.A00 = r0     // Catch:{ all -> 0x06a8 }
        L_0x0517:
            X.14u r0 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r0, r5)     // Catch:{ all -> 0x06a8 }
            android.view.View r11 = r0.A00     // Catch:{ all -> 0x06a8 }
            X.C18740tg.A04(r11)     // Catch:{ all -> 0x06a8 }
            X.C18740tg.A04(r11)     // Catch:{ all -> 0x06a8 }
            X.14u r0 = r8.A0A     // Catch:{ all -> 0x06a8 }
            r2 = 0
            if (r0 == 0) goto L_0x0534
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r0)     // Catch:{ all -> 0x06a8 }
            int r1 = r0.screenWidthDp     // Catch:{ all -> 0x06a8 }
            r0 = 600(0x258, float:8.41E-43)
            if (r1 < r0) goto L_0x0534
            r2 = 1
        L_0x0534:
            X.6F9 r13 = new X.6F9     // Catch:{ all -> 0x06a8 }
            r13.<init>(r11, r2, r4)     // Catch:{ all -> 0x06a8 }
            r8.A0F = r13     // Catch:{ all -> 0x06a8 }
            X.16L r14 = r8.A0c     // Catch:{ all -> 0x06a8 }
            X.14u r12 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r12, r5)     // Catch:{ all -> 0x06a8 }
            X.6Dz r11 = r8.A0g     // Catch:{ all -> 0x06a8 }
            java.util.Set r0 = r11.A09     // Catch:{ all -> 0x06a8 }
            r31 = r0
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x06a8 }
            r0 = 3
            X.0u1 r29 = X.C165307tD.A00(r11, r0)     // Catch:{ all -> 0x06a8 }
            java.util.List r0 = r11.A08     // Catch:{ all -> 0x06a8 }
            r30 = r0
            X.66x r15 = r8.A0u     // Catch:{ all -> 0x06a8 }
            android.os.Handler r2 = X.C36341k9.A0H()     // Catch:{ all -> 0x06a8 }
            java.lang.String r1 = "camera-ui"
            X.3K8 r0 = new X.3K8     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2, r14, r10, r1)     // Catch:{ all -> 0x06a8 }
            r13.A05 = r0     // Catch:{ all -> 0x06a8 }
            X.0yC r25 = r12.getAbProps()     // Catch:{ all -> 0x06a8 }
            X.17Y r10 = r12.A05     // Catch:{ all -> 0x06a8 }
            X.0wU r2 = r12.A04     // Catch:{ all -> 0x06a8 }
            X.1wW r1 = new X.1wW     // Catch:{ all -> 0x06a8 }
            r21 = r1
            r22 = r12
            r23 = r10
            r24 = r8
            r26 = r0
            r27 = r15
            r28 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x06a8 }
            r13.A04 = r1     // Catch:{ all -> 0x06a8 }
            androidx.recyclerview.widget.RecyclerView r2 = r13.A0A     // Catch:{ all -> 0x06a8 }
            r2.setAdapter(r1)     // Catch:{ all -> 0x06a8 }
            r2.A0U = r3     // Catch:{ all -> 0x06a8 }
            android.content.res.Resources r1 = r13.A07     // Catch:{ all -> 0x06a8 }
            r0 = 2131165639(0x7f0701c7, float:1.79455E38)
            int r10 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x06a8 }
            X.4n5 r1 = new X.4n5     // Catch:{ all -> 0x06a8 }
            r0 = r32
            r1.<init>(r13, r0, r10)     // Catch:{ all -> 0x06a8 }
            r2.A0t(r1)     // Catch:{ all -> 0x06a8 }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ all -> 0x06a8 }
            r1.<init>(r3)     // Catch:{ all -> 0x06a8 }
            r0 = 0
            r1.A1f(r0)     // Catch:{ all -> 0x06a8 }
            r2.setLayoutManager(r1)     // Catch:{ all -> 0x06a8 }
            X.6F9 r10 = r8.A0F     // Catch:{ all -> 0x06a8 }
            X.14u r2 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r2, r5)     // Catch:{ all -> 0x06a8 }
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r10.A0B     // Catch:{ all -> 0x06a8 }
            X.4sq r0 = new X.4sq     // Catch:{ all -> 0x06a8 }
            r0.<init>(r2, r8, r10, r15)     // Catch:{ all -> 0x06a8 }
            r1.A0a(r0)     // Catch:{ all -> 0x06a8 }
            if (r4 == 0) goto L_0x05da
            X.6F9 r12 = r8.A0F     // Catch:{ all -> 0x06a8 }
            X.14u r10 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r10, r5)     // Catch:{ all -> 0x06a8 }
            X.6N7 r4 = r8.A0r     // Catch:{ all -> 0x06a8 }
            X.5la r2 = new X.5la     // Catch:{ all -> 0x06a8 }
            r2.<init>(r8)     // Catch:{ all -> 0x06a8 }
            X.0wU r1 = r8.A0v     // Catch:{ all -> 0x06a8 }
            X.6Tt r0 = r12.A06     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x05d0
            r0.A0D(r3)     // Catch:{ all -> 0x06a8 }
        L_0x05d0:
            X.2iZ r0 = new X.2iZ     // Catch:{ all -> 0x06a8 }
            r0.<init>(r10, r2, r4)     // Catch:{ all -> 0x06a8 }
            r12.A06 = r0     // Catch:{ all -> 0x06a8 }
            X.C36331k8.A1F(r0, r1)     // Catch:{ all -> 0x06a8 }
        L_0x05da:
            r1 = 2131428536(0x7f0b04b8, float:1.847872E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x06a8 }
            android.view.ViewGroup r2 = X.C36411kG.A0O(r0, r1)     // Catch:{ all -> 0x06a8 }
            X.14u r0 = r8.A0A     // Catch:{ all -> 0x06a8 }
            X.4dS r1 = new X.4dS     // Catch:{ all -> 0x06a8 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x06a8 }
            r0 = 0
            r2.addView(r1, r0)     // Catch:{ all -> 0x06a8 }
            X.14u r0 = r8.A0A     // Catch:{ all -> 0x06a8 }
            java.util.Objects.requireNonNull(r0, r5)     // Catch:{ all -> 0x06a8 }
            X.09Y r4 = X.C36341k9.A0O(r0)     // Catch:{ all -> 0x06a8 }
            r2 = 2131430456(0x7f0b0c38, float:1.8482613E38)
            X.02E r1 = r8.A0Y     // Catch:{ all -> 0x06a8 }
            java.lang.String r0 = "media_picker_fragment_tag"
            r4.A0F(r1, r0, r2)     // Catch:{ all -> 0x06a8 }
            r4.A00(r3)     // Catch:{ all -> 0x06a8 }
            if (r18 == 0) goto L_0x0623
            int r0 = r18.size()     // Catch:{ all -> 0x06a8 }
            if (r0 <= 0) goto L_0x0623
            if (r20 == 0) goto L_0x0623
            if (r17 == 0) goto L_0x0623
            X.6Tg r0 = r11.A03     // Catch:{ all -> 0x06a8 }
            java.util.Map r1 = r0.A00     // Catch:{ all -> 0x06a8 }
            r1.clear()     // Catch:{ all -> 0x06a8 }
            r0 = r20
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x06a8 }
            r1.putAll(r0)     // Catch:{ all -> 0x06a8 }
            r0 = r18
            X.AnonymousClass6YT.A0I(r8, r0)     // Catch:{ all -> 0x06a8 }
        L_0x0623:
            android.content.Intent r2 = r7.getIntent()     // Catch:{ all -> 0x06a8 }
            r1 = -1
            r0 = r19
            int r4 = r2.getIntExtra(r0, r1)     // Catch:{ all -> 0x06a8 }
            android.content.Intent r2 = r7.getIntent()     // Catch:{ all -> 0x06a8 }
            r1 = 9
            java.lang.String r0 = "media_sharing_user_journey_start_target"
            int r2 = r2.getIntExtra(r0, r1)     // Catch:{ all -> 0x06a8 }
            if (r4 <= 0) goto L_0x064e
            int r1 = r11.A00     // Catch:{ all -> 0x06a8 }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ all -> 0x06a8 }
            r1 = 17
            if (r0 == 0) goto L_0x0649
            r1 = 18
        L_0x0649:
            r0 = r33
            r0.A01(r1, r4, r2)     // Catch:{ all -> 0x06a8 }
        L_0x064e:
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            r0 = r16
            X.C133106Wu.A02(r6, r0, r1)
            X.0yE r1 = r7.A05
            r0 = 30
            boolean r1 = com.whatsapp.RequestPermissionActivity.A0I(r7, r1, r0)
            X.6YT r0 = r7.A02
            if (r1 == 0) goto L_0x067f
            r0.A0P()
        L_0x0665:
            int r0 = r9.size()
            if (r0 > r3) goto L_0x0679
            int r0 = r9.size()
            if (r0 != r3) goto L_0x00ec
            java.lang.Object r0 = X.C36391kE.A0t(r9)
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x00ec
        L_0x0679:
            X.1XS r0 = r7.A08
            r0.A01(r9)
            return
        L_0x067f:
            X.6Wu r5 = r0.A0j
            r0 = 0
            r5.A01 = r0
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0665
            X.0zE r4 = r5.A08
            r2 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r1 = "error_message"
            java.lang.String r0 = "permission"
            r4.markerAnnotate((int) r2, (java.lang.String) r1, (java.lang.String) r0)
            r0 = 4
            r5.A05(r0)
            goto L_0x0665
        L_0x069a:
            java.lang.String r0 = "cameraactivity/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass190.A09(r7)
            r7.startActivity(r0)
            goto L_0x00e9
        L_0x06a8:
            r3 = move-exception
            X.6Wu r2 = r8.A0j
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r0 = "onCreate"
            X.C133106Wu.A02(r2, r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass6YT r2 = this.A02;
        if (r2.A0A != null && ((i == 25 || i == 24) && r2.A0C.BLy())) {
            if (keyEvent.getRepeatCount() <= 0) {
                if (!r2.A0S()) {
                    AnonymousClass6F9 r0 = r2.A0F;
                    if (r0 != null && r0.A0B.A0J == 4) {
                        Log.i("cameraui/volume-key-down");
                        if (AnonymousClass000.A1S(r2.A0g.A00, 2)) {
                            AnonymousClass6YT.A07(r2);
                        } else {
                            Handler handler = r2.A0I.A04;
                            handler.sendMessageDelayed(handler.obtainMessage(1), 500);
                        }
                    }
                } else if (AnonymousClass000.A1S(r2.A0g.A00, 2)) {
                    AnonymousClass6YT.A0L(r2, r2.A0I.A02());
                }
            }
            return true;
        }
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AnonymousClass6YT r2 = this.A02;
        if (r2.A0A != null && !AnonymousClass000.A1S(r2.A0g.A00, 2) && (i == 25 || i == 24)) {
            AnonymousClass6OO r3 = r2.A0I;
            Handler handler = r3.A04;
            handler.removeMessages(0);
            handler.removeMessages(1);
            r3.A01(false, false, false);
            if (r2.A0C.BMx()) {
                Log.i("cameraui/volume-key-up/stop-video-capture");
                AnonymousClass6YT.A0L(r2, r2.A0I.A02());
            } else {
                AnonymousClass6F9 r0 = r2.A0F;
                if (r0 != null && r0.A0B.A0J == 4 && r2.A0C.BLy()) {
                    Log.i("cameraui/volume-key-up/take-picture");
                    AnonymousClass6YT.A0A(r2);
                }
            }
        } else if (super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void A2X() {
        if (!isDestroyed() && !isFinishing()) {
            this.A0D.A03((AnonymousClass11F) null, 20);
            super.A2X();
            if (getIntent().getIntExtra("camera_origin", 8) == 4 && this.A0D.A0E(7905)) {
                this.A0C.A00();
            }
        }
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass6YT r4 = this.A02;
        C225314u r1 = r4.A0A;
        if (r1 != null) {
            if (!r4.A10) {
                Objects.requireNonNull(r1, "Host activity is NULL");
                if (!(r1 instanceof CameraActivity)) {
                    View A022 = C012005e.A02(r4.A09, R.id.camera_mode_tab_layout);
                    View A023 = C012005e.A02(r4.A09, R.id.camera_view_holder);
                    Rect A062 = AnonymousClass001.A06();
                    Rect A063 = AnonymousClass001.A06();
                    A023.getLocalVisibleRect(A062);
                    A023.getGlobalVisibleRect(A062);
                    r4.A09.getLocalVisibleRect(A063);
                    r4.A09.getGlobalVisibleRect(A063);
                    int i = 0;
                    if (!AnonymousClass6YT.A0M(r4)) {
                        i = r4.A01;
                    }
                    AnonymousClass6YT.A04(A022, -1, i);
                    AnonymousClass6YT.A0D(r4, A022.getMeasuredHeight() + i);
                    AnonymousClass6YT.A0E(r4, A022.getMeasuredHeight() + i);
                }
            }
            AnonymousClass6F9 r12 = r4.A0F;
            if (r12 != null) {
                r12.A03(true);
            }
        }
    }

    public void onDestroy() {
        Integer num;
        int intValue;
        super.onDestroy();
        AnonymousClass6YT r4 = this.A02;
        if (r4.A0A != null) {
            AnonymousClass6OO r3 = r4.A0I;
            Handler handler = r3.A04;
            handler.removeMessages(0);
            handler.removeMessages(1);
            r3.A01(false, false, false);
            r4.A0x.unregisterObserver(r4.A0w);
            AnonymousClass6F9 r32 = r4.A0F;
            if (r32 != null) {
                C132446Tt r1 = r32.A06;
                if (r1 != null) {
                    r1.A0D(true);
                    r32.A06 = null;
                }
                AnonymousClass3K8 r0 = r32.A05;
                if (r0 != null) {
                    r0.A00();
                    r32.A05 = null;
                }
                C41041wW r12 = r32.A04;
                if (r12 != null) {
                    r12.A06.A02();
                    C88924Uo r02 = r12.A00;
                    if (r02 != null) {
                        r02.close();
                        r12.A00 = null;
                    }
                    r32.A04 = null;
                }
            }
            r4.A0A = null;
        }
        this.A01.A02().A02.A07(-1);
        C64953Qc r2 = this.A04;
        AnonymousClass2RC r03 = r2.A01;
        if (!(r03 == null || (num = r03.A02) == null || ((intValue = num.intValue()) != 3 && intValue != 4))) {
            r2.A02(intValue);
        }
        AnonymousClass3U9.A07(this);
    }

    public void onPause() {
        super.onPause();
        this.A0A.A00();
        AnonymousClass6YT r3 = this.A02;
        if (r3.A0A != null) {
            if (r3.A0C.BMx()) {
                AnonymousClass6YT.A0K(r3, r3.A0I.A02());
            }
            if (r3.A08.getVisibility() == 0) {
                AnonymousClass6WU r2 = r3.A0E;
                r2.A0H.setVisibility(4);
                CircularProgressBar circularProgressBar = r2.A04;
                if (circularProgressBar != null) {
                    circularProgressBar.setVisibility(4);
                }
                r2.A02();
                r3.A08.setVisibility(8);
                r3.A0E.A0H.setEnabled(false);
            }
            r3.A0C.pause();
            C92104d8 r0 = r3.A0D;
            if (r0 != null) {
                r0.disable();
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Object r4;
        super.onRestoreInstanceState(bundle);
        AnonymousClass6YT r3 = this.A02;
        C128886Dz r6 = r3.A0g;
        if (r6 != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("multi_selected");
            r6.A04 = true;
            Set set = r6.A09;
            set.clear();
            if (parcelableArrayList != null) {
                set.addAll(parcelableArrayList);
            }
            r6.A03.A05(bundle);
            List list = r6.A08;
            list.clear();
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("captured_media");
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                C21050ya A0O = r6.A06.A0O();
                C18740tg.A06(A0O);
                AnonymousClass00C.A0D(A0O, 0);
                ArrayList A0J = C36321k7.A0J(parcelableArrayList2);
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    C134496b8 r42 = (C134496b8) it.next();
                    int i = r42.A00;
                    if (i == 1) {
                        r4 = new C145666uK(A0O, r42.A02, r42.A01, r42.A03);
                    } else if (i == 3) {
                        r4 = new C145656uJ(r42.A02);
                    } else {
                        throw C90524aI.A0Y(AnonymousClass000.A0r("Unsupported media type: ", AnonymousClass000.A0u(), i));
                    }
                    A0J.add(r4);
                }
                list.addAll(C36441kJ.A15(A0J));
            }
            r6.A04 = C36401kF.A1a(list);
            AnonymousClass6WU r0 = r3.A0E;
            if (r0 != null) {
                C90504aG.A1B(r0, set);
            }
        }
        AnonymousClass6F9 r02 = r3.A0F;
        if (r02 != null) {
            C41041wW r03 = r02.A04;
            if (r03 != null) {
                r03.A06();
            }
            r3.A0F.A00();
            boolean A1S = AnonymousClass000.A1S(r3.A0F.A0B.A0J, 3);
            View view = r3.A05;
            if (A1S) {
                view.setVisibility(4);
                r3.A0G.A00.setVisibility(4);
                AnonymousClass64G r2 = r3.A0H;
                r2.A01.setBackgroundColor(C36421kH.A0B(r3.A0n).getColor(R.color.f6nameremoved));
                return;
            }
            view.setVisibility(0);
            r3.A0G.A00.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        AnonymousClass6YT r4 = this.A02;
        if (r4.A0A != null && r4.A0O) {
            r4.A0C.Bok();
            if (r4.A08.getVisibility() == 8) {
                r4.A08.setVisibility(0);
            }
            C92104d8 r0 = r4.A0D;
            if (r0 != null) {
                r0.enable();
            }
            AnonymousClass6WU r2 = r4.A0E;
            r2.A0H.setVisibility(0);
            CircularProgressBar circularProgressBar = r2.A04;
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
            }
            r4.A0E.A02();
            CircularProgressBar circularProgressBar2 = r4.A0E.A04;
            if (circularProgressBar2 != null) {
                circularProgressBar2.setProgress(0);
            }
            if (r4.A0H.A03.getVisibility() == 0) {
                r4.A0H.A00(false, true);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass02E A0N = getSupportFragmentManager().A0N("media_picker_fragment_tag");
        if (A0N != null) {
            getSupportFragmentManager().A0Y(bundle, A0N, "media_picker_fragment_tag");
        }
        C128886Dz r2 = this.A02.A0g;
        if (r2 != null) {
            bundle.putParcelableArrayList("multi_selected", C36441kJ.A15(r2.A09));
            C132366Tg r0 = r2.A03;
            Bundle A072 = AnonymousClass001.A07();
            C132366Tg.A02(A072, r0);
            bundle.putBundle("media_preview_params", A072);
            List list = r2.A08;
            AnonymousClass00C.A0D(list, 0);
            List<C162037nv> A0V = C007103b.A0V(list);
            ArrayList A0J = C36321k7.A0J(A0V);
            for (C162037nv r1 : A0V) {
                AnonymousClass00C.A0D(r1, 1);
                int BE7 = r1.BE7();
                A0J.add(new C134496b8(r1.BBo(), BE7, r1.BGs(), r1.BLq()));
            }
            bundle.putParcelableArrayList("captured_media", C36441kJ.A15(A0J));
        }
    }
}
