package com.whatsapp.profile;

import X.ACS;
import X.AnonymousClass0PG;
import X.AnonymousClass141;
import X.AnonymousClass16I;
import X.AnonymousClass16K;
import X.AnonymousClass16L;
import X.AnonymousClass17X;
import X.AnonymousClass1EL;
import X.AnonymousClass1O8;
import X.AnonymousClass1P3;
import X.AnonymousClass1X7;
import X.AnonymousClass2b6;
import X.AnonymousClass3M3;
import X.AnonymousClass3UJ;
import X.AnonymousClass3YH;
import X.AnonymousClass6YY;
import X.B78;
import X.B79;
import X.B7E;
import X.C165567td;
import X.C165587tf;
import X.C180818mT;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19730wQ;
import X.C202899mr;
import X.C20690y0;
import X.C226815j;
import X.C23133B6o;
import X.C23140B7a;
import X.C233117z;
import X.C24341Cb;
import X.C24361Cd;
import X.C24511Cs;
import X.C27541Op;
import X.C27761Ps;
import X.C32001cn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36441kJ;
import X.C87854Qk;
import X.C89354Wf;
import X.C90524aI;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ViewProfilePhoto extends C180818mT {
    public C19460v5 A00;
    public C24361Cd A01;
    public AnonymousClass16I A02;
    public C27761Ps A03;
    public AnonymousClass17X A04;
    public C27541Op A05;
    public C233117z A06;
    public AnonymousClass1EL A07;
    public AnonymousClass1O8 A08;
    public AnonymousClass1P3 A09;
    public boolean A0A;
    public C87854Qk A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C32001cn A0E;
    public final C226815j A0F;
    public final C24511Cs A0G;

    public class SavePhoto extends AnonymousClass2b6 {
        public boolean A00;

        public SavePhoto(int i) {
            this.A00 = false;
            C89354Wf.A00(this, 31);
        }

        public SavePhoto() {
            this(0);
        }
    }

    public static void A01(ViewProfilePhoto viewProfilePhoto) {
        AnonymousClass141 A0D2 = viewProfilePhoto.A04.A0D(C36331k8.A0G(viewProfilePhoto.A09));
        viewProfilePhoto.A09 = A0D2;
        if (A0D2.A0G()) {
            viewProfilePhoto.setTitle(R.string.f12nameremoved);
        } else {
            viewProfilePhoto.A3F(viewProfilePhoto.A05.A0H(viewProfilePhoto.A09));
        }
    }

    public static void A07(ViewProfilePhoto viewProfilePhoto) {
        FileInputStream A082;
        TextView textView;
        int i;
        if (C202899mr.A02(C36351kA.A0j(viewProfilePhoto.A09))) {
            viewProfilePhoto.A00.setVisibility(0);
            viewProfilePhoto.A0B.setVisibility(8);
            viewProfilePhoto.A02.setVisibility(8);
            return;
        }
        if (AnonymousClass3M3.A00(viewProfilePhoto.A09, viewProfilePhoto.A0A)) {
            viewProfilePhoto.A00.setVisibility(8);
            viewProfilePhoto.A0B.setVisibility(8);
            viewProfilePhoto.A02.setVisibility(8);
            viewProfilePhoto.A01.setImageResource(R.drawable.avatar_server_psa_large);
            return;
        }
        try {
            A082 = viewProfilePhoto.A03.A08(viewProfilePhoto.A09, true);
            if (A082 == null) {
                viewProfilePhoto.A0B.setVisibility(8);
                viewProfilePhoto.A00.setVisibility(8);
                viewProfilePhoto.A02.setVisibility(0);
                viewProfilePhoto.A01.setVisibility(8);
                if (viewProfilePhoto.A09.A0G()) {
                    textView = viewProfilePhoto.A02;
                    i = R.string.f12nameremoved;
                } else {
                    textView = viewProfilePhoto.A02;
                    i = R.string.f12nameremoved;
                }
                textView.setText(i);
                return;
            }
            viewProfilePhoto.A0B.setVisibility(0);
            viewProfilePhoto.A02.setVisibility(8);
            if (viewProfilePhoto.A09.A05 == 0) {
                viewProfilePhoto.A00.setVisibility(0);
            } else {
                viewProfilePhoto.A00.setVisibility(8);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            Bitmap decodeStream = BitmapFactory.decodeStream(A082, (Rect) null, options);
            viewProfilePhoto.A0B.A08(decodeStream);
            viewProfilePhoto.A01.setImageBitmap(decodeStream);
            A082.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C165567td.A11(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C165567td.A0v(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A03 = (AnonymousClass16L) A0B2.A0q.get();
            this.A0C = (AnonymousClass1X7) A0B2.A4o.get();
            this.A0A = A0B2.AzV();
            this.A04 = C36341k9.A0R(A0B2);
            this.A05 = C36341k9.A0S(A0B2);
            this.A07 = (C24341Cb) A0B2.A4n.get();
            this.A06 = (AnonymousClass16K) A0B2.A2C.get();
            this.A08 = C165587tf.A0N(A0B2);
            this.A02 = C165587tf.A0M(A0B2);
            this.A07 = C36381kD.A0d(A0B2);
            this.A01 = (C24361Cd) A0B2.A1j.get();
            this.A08 = (AnonymousClass1O8) A0B2.A6q.get();
            this.A09 = (AnonymousClass1P3) A0B2.AX7.get();
            this.A05 = (C27541Op) A0B2.A3n.get();
            this.A04 = C36351kA.A0b(A0B2);
            this.A06 = (C233117z) A0B2.A3w.get();
            this.A03 = (C27761Ps) A0B2.A2D.get();
            this.A00 = C19470v6.A00;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r7.getBooleanExtra("skip_cropping", false) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 12
            r3 = -1
            r2 = 13
            if (r5 == r0) goto L_0x004a
            if (r5 == r2) goto L_0x000d
            super.onActivityResult(r5, r6, r7)
        L_0x000c:
            return
        L_0x000d:
            X.1P3 r0 = r4.A09
            java.io.File r0 = r0.A02()
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x002f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "viewprofilephoto/failed-delete-file"
            r1.append(r0)
            X.1P3 r0 = r4.A09
            java.io.File r0 = r0.A02()
            java.lang.String r0 = r0.getAbsolutePath()
            X.C36341k9.A1O(r1, r0)
        L_0x002f:
            if (r6 != r3) goto L_0x0040
            r0 = 1
            r4.A0D = r0
            X.16I r1 = r4.A02
            X.141 r0 = r4.A09
            X.11F r0 = X.C36351kA.A0j(r0)
            r1.A01(r0)
            goto L_0x0078
        L_0x0040:
            if (r6 != 0) goto L_0x000c
            if (r7 == 0) goto L_0x000c
            X.1P3 r0 = r4.A09
            r0.A04(r7, r4)
            return
        L_0x004a:
            if (r6 != r3) goto L_0x000c
            r1 = 0
            if (r7 == 0) goto L_0x0086
            java.lang.String r0 = "is_reset"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0070
            r0 = 1
            r4.A0D = r0
            X.16I r1 = r4.A02
            X.141 r0 = r4.A09
            X.11F r0 = X.C36351kA.A0j(r0)
            r1.A01(r0)
            X.1P3 r1 = r4.A09
            X.141 r0 = r4.A09
            r1.A0D(r0)
            X.AnonymousClass0PG.A00(r4)
            return
        L_0x0070:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0086
        L_0x0078:
            X.1P3 r1 = r4.A09
            X.141 r0 = r4.A09
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x000c
            A07(r4)
            return
        L_0x0086:
            X.1P3 r0 = r4.A09
            r0.A05(r7, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c7, code lost:
        if (X.AnonymousClass3M3.A01(r9.A0A, r6.A0H) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            android.content.Intent r0 = r9.getIntent()
            X.6CU r11 = X.AnonymousClass6UU.A00(r0)
            r2 = 2131897115(0x7f122b1b, float:1.942911E38)
            X.68G r0 = new X.68G
            r0.<init>()
            X.AnonymousClass6UU.A02(r9, r11, r0)
            r0 = r19
            super.onCreate(r0)
            r0 = 2131626460(0x7f0e09dc, float:1.8880157E38)
            r9.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r8 = X.C36411kG.A0R(r9)
            X.07B r0 = X.C36431kI.A0Q(r9, r8)
            X.C18740tg.A06(r0)
            r4 = 1
            r0.A0U(r4)
            X.11F r6 = X.C36331k8.A0F(r9)
            X.C18740tg.A06(r6)
            X.16D r0 = r9.A04
            X.141 r0 = r0.A0D(r6)
            r9.A09 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "viewprofilephoto/create "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " photo_full_id:"
            r1.append(r0)
            X.141 r0 = r9.A09
            int r0 = r0.A05
            X.C36321k7.A1Y(r1, r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "can_user_remove_photo"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r9.A0A = r0
            X.0v5 r1 = r9.A00
            boolean r0 = r1.A05()
            r3 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.A02()
            X.005 r0 = (X.AnonymousClass005) r0
            r0.get()
            java.lang.String r0 = "isProfileLockedAndMvEditEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x007b:
            X.16I r1 = r9.A02
            X.15j r0 = r9.A0F
            r1.registerObserver(r0)
            X.1Cd r1 = r9.A01
            X.1cn r0 = r9.A0E
            r1.registerObserver(r0)
            X.17z r1 = r9.A06
            X.1Cs r0 = r9.A0G
            r1.registerObserver(r0)
            X.0wQ r0 = r9.A02
            r0.A0G()
            X.142 r5 = r0.A0E
            if (r5 != 0) goto L_0x00a9
            java.lang.String r0 = "viewprofilephoto/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass190.A09(r9)
            r9.startActivity(r0)
            r9.finish()
            return
        L_0x00a9:
            X.141 r0 = r9.A09
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x01cb
            r0 = 2131890290(0x7f121072, float:1.9415268E38)
        L_0x00b4:
            r9.setTitle(r0)
        L_0x00b7:
            X.11F r0 = r5.A0H
            boolean r5 = r6.equals(r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            if (r5 == 0) goto L_0x017e
            X.141 r6 = r9.A09
            int r5 = r6.A05
            if (r5 <= 0) goto L_0x00eb
            X.16K r5 = r9.A06
            java.io.File r5 = r5.A00(r6)
            if (r5 == 0) goto L_0x00eb
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x00eb
            X.141 r5 = r9.A09
            r5.A05 = r3
            X.1O8 r7 = r9.A08
            X.11F r6 = X.C36351kA.A0j(r5)
            X.141 r5 = r9.A09
            int r5 = r5.A05
            r7.A01(r6, r5, r4)
        L_0x00e6:
            android.os.Handler r4 = r9.A0D
            r4.sendEmptyMessageDelayed(r3, r0)
        L_0x00eb:
            X.1Ps r12 = r9.A03
            X.141 r14 = r9.A09
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168345(0x7f070c59, float:1.795099E38)
            int r16 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168343(0x7f070c57, float:1.7950985E38)
            float r15 = r1.getDimension(r0)
            r3 = 1
            r17 = 1
            r13 = r9
            android.graphics.Bitmap r4 = r12.A07(r13, r14, r15, r16, r17)
            r0 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.A00 = r0
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r9.A0B = r0
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r9, r0)
            r9.A02 = r0
            r0 = 2131432712(0x7f0b1508, float:1.848719E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r9, r0)
            r9.A01 = r0
            com.whatsapp.mediaview.PhotoView r1 = r9.A3k()
            r1.A0O = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A08 = r0
            r1.A08(r4)
            android.widget.ImageView r0 = r9.A3i()
            r0.setImageBitmap(r4)
            A07(r9)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "circular_return_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x015e
            android.content.Context r0 = r9.getApplicationContext()
            java.lang.String r0 = X.C36401kF.A0o(r0, r2)
        L_0x015e:
            boolean r12 = X.AnonymousClass3U9.A00
            r9.A3l(r12, r0)
            r0 = 2131433484(0x7f0b180c, float:1.8488755E38)
            android.view.View r6 = r9.findViewById(r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r7 = r9.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r10 = r9.A0B
            X.AnonymousClass6UU.A01(r6, r7, r8, r9, r10, r11, r12)
            X.1Op r1 = r9.A05
            X.4Qk r0 = r9.A0B
            r1.A00(r0)
            return
        L_0x017e:
            X.AHi r7 = new X.AHi
            r7.<init>()
            X.1X7 r5 = r9.A0C
            X.AA2 r6 = new X.AA2
            r6.<init>(r9, r7, r5)
            X.1Cb r5 = r9.A07
            boolean r5 = r5.A04(r6)
            if (r5 == 0) goto L_0x00eb
            X.141 r6 = r9.A09
            int r5 = r6.A05
            if (r5 <= 0) goto L_0x01aa
            X.16K r5 = r9.A06
            java.io.File r5 = r5.A00(r6)
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x01aa
            X.141 r5 = r9.A09
            r5.A05 = r3
        L_0x01aa:
            X.1O8 r7 = r9.A08
            X.141 r5 = r9.A09
            X.11F r6 = X.C36351kA.A0j(r5)
            X.141 r5 = r9.A09
            int r5 = r5.A05
            r7.A01(r6, r5, r4)
            X.141 r6 = r9.A09
            int r4 = r6.A05
            if (r4 != 0) goto L_0x00eb
            X.0xf r5 = r9.A0A
            X.11F r4 = r6.A0H
            boolean r4 = X.AnonymousClass3M3.A01(r5, r4)
            if (r4 != 0) goto L_0x00eb
            goto L_0x00e6
        L_0x01cb:
            X.11F r0 = r5.A0H
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d8
            r0 = 2131896926(0x7f122a5e, float:1.9428727E38)
            goto L_0x00b4
        L_0x01d8:
            X.171 r1 = r9.A05
            X.141 r0 = r9.A09
            java.lang.String r0 = r1.A0H(r0)
            r9.A3F(r0)
            X.0yC r1 = r9.A0D
            r0 = 7036(0x1b7c, float:9.86E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00b7
            android.view.Window r1 = r9.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass141 r1 = this.A09;
        C19730wQ r0 = this.A02;
        r0.A0G();
        if (r1.equals(r0.A0E) || this.A09.A0G()) {
            MenuItem add = menu.add(0, R.id.menuitem_edit, 0, R.string.f12nameremoved);
            add.setShowAsAction(2);
            ImageView imageView = (ImageView) C36441kJ.A0R(add, R.layout.f9nameremoved);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_action_edit);
                AnonymousClass3YH.A00(imageView, this, add, 24);
                C36331k8.A0q(this, imageView, R.string.f12nameremoved);
                add.setActionView(imageView);
            }
            MenuItem add2 = menu.add(0, 1, 0, R.string.f12nameremoved);
            add2.setShowAsAction(2);
            ImageView imageView2 = (ImageView) C36441kJ.A0R(add2, R.layout.f9nameremoved);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_action_share);
                AnonymousClass3YH.A00(imageView2, this, add2, 25);
                C36331k8.A0q(this, imageView2, R.string.f12nameremoved);
                add2.setActionView(imageView2);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        FileOutputStream fileOutputStream;
        MenuItem menuItem2 = menuItem;
        int itemId = menuItem2.getItemId();
        if (itemId == R.id.menuitem_edit) {
            this.A09.A08(this, this.A09, 12, 1, -1, this.A0A, false, false);
            return true;
        } else if (itemId == 1) {
            C20690y0 r2 = this.A04;
            AnonymousClass141 r1 = this.A09;
            C19730wQ r0 = this.A02;
            r0.A0G();
            if (r1.equals(r0.A0E)) {
                str = "me.jpg";
            } else {
                str = "photo.jpg";
            }
            File A0X = r2.A0X(str);
            try {
                File A002 = this.A06.A00(this.A09);
                C18740tg.A06(A002);
                FileInputStream fileInputStream = new FileInputStream(A002);
                try {
                    fileOutputStream = new FileOutputStream(A0X);
                    AnonymousClass6YY.A0J(fileInputStream, fileOutputStream);
                    Uri A012 = AnonymousClass6YY.A01(this, A0X);
                    this.A03.A02().A0C(A012.toString());
                    Intent[] intentArr = new Intent[2];
                    intentArr[0] = new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A012);
                    startActivity(AnonymousClass3UJ.A01((IntentSender) null, (CharSequence) null, C90524aI.A0p(C36441kJ.A0H(this, SavePhoto.class).putExtra("android.intent.extra.STREAM", Uri.fromFile(A0X)).putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A05.A0H(this.A09)), intentArr, 1)));
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A06(R.string.f12nameremoved, 1);
                return true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            AnonymousClass0PG.A00(this);
            return true;
        }
        throw th;
    }

    public ViewProfilePhoto(int i) {
        this.A0C = false;
        C23140B7a.A00(this, 14);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0D.removeMessages(0);
        this.A02.unregisterObserver(this.A0F);
        this.A01.unregisterObserver(this.A0E);
        this.A05.A01(this.A0B);
        this.A06.unregisterObserver(this.A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r5.A09.A13 != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r6) {
        /*
            r5 = this;
            int r0 = r6.size()
            if (r0 == 0) goto L_0x0089
            X.141 r1 = r5.A09
            X.0wQ r0 = r5.A02
            r0.A0G()
            X.142 r0 = r0.A0E
            boolean r4 = r1.equals(r0)
            r2 = 0
            r1 = 1
            if (r4 != 0) goto L_0x001f
            X.141 r0 = r5.A09
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0089
        L_0x001f:
            android.view.MenuItem r3 = r6.findItem(r1)
            X.16K r1 = r5.A06
            X.141 r0 = r5.A09
            java.io.File r0 = r1.A00(r0)
            X.C18740tg.A06(r0)
            boolean r0 = r0.exists()
            r3.setVisible(r0)
            r0 = 2131431650(0x7f0b10e2, float:1.8485035E38)
            android.view.MenuItem r3 = r6.findItem(r0)
            if (r4 != 0) goto L_0x0059
            X.17X r4 = r5.A04
            X.141 r1 = r5.A09
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            X.C18740tg.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r4.A0D(r0)
            if (r0 != 0) goto L_0x0059
            X.141 r0 = r5.A09
            boolean r0 = r0.A13
            if (r0 != 0) goto L_0x0086
        L_0x0059:
            X.0v5 r1 = r5.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r1.A02()
            X.005 r0 = (X.AnonymousClass005) r0
            r0.get()
            java.lang.String r0 = "shouldDisableProfileEdits"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0071:
            X.1EL r1 = r5.A07
            X.141 r0 = r5.A09
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0086
            X.1EL r1 = r5.A07
            X.141 r0 = r5.A09
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0086
            r2 = 1
        L_0x0086:
            r3.setVisible(r2)
        L_0x0089:
            boolean r0 = super.onPrepareOptionsMenu(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public ViewProfilePhoto() {
        this(0);
        this.A0D = new C23133B6o(Looper.getMainLooper(), this, 5);
        this.A0A = false;
        this.A0F = new B79(this, 6);
        this.A0E = new B78(this, 3);
        this.A0G = new B7E(this, 3);
        this.A0B = new ACS(this);
    }
}
