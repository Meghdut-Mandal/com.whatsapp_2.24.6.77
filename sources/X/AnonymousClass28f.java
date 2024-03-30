package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.28f  reason: invalid class name */
public abstract class AnonymousClass28f extends AnonymousClass18Q implements C88684Tq {
    public AnonymousClass141 A00;
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C19730wQ A03;
    public final C20500xf A04;
    public final AnonymousClass01L A05;
    public final C225014r A06;
    public final AnonymousClass17Y A07;
    public final C21100yf A08;
    public final AnonymousClass3CG A09;
    public final AnonymousClass1MK A0A;
    public final AnonymousClass4V7 A0B;
    public final AnonymousClass1NM A0C;
    public final C18820ts A0D;
    public final C220412q A0E;
    public final C20810yC A0F;
    public final AnonymousClass11F A0G;
    public final C32641dx A0H;
    public final C26371Jx A0I;
    public final C19770wU A0J;
    public final C19460v5 A0K;
    public final AnonymousClass1X4 A0L;
    public final C32001cn A0M = new AnonymousClass4W0(this, 6);
    public final C24361Cd A0N;
    public final AnonymousClass1AO A0O;
    public final AnonymousClass340 A0P;
    public final AnonymousClass36C A0Q;
    public final C62073Er A0R;
    public final C226815j A0S = AnonymousClass4W3.A00(this, 13);
    public final AnonymousClass16I A0T;
    public final C19420v0 A0U;
    public final AnonymousClass1A5 A0V;
    public final C236419g A0W;
    public final C24511Cs A0X = new AnonymousClass4WB(this, 11);
    public final C233117z A0Y;
    public final AnonymousClass1CR A0Z;

    public static void A02(AnonymousClass28f r2) {
        r2.A00 = r2.A0V.A01(r2.A0G);
    }

    public int A0C() {
        AnonymousClass1CR r0 = this.A0Z;
        AnonymousClass11F r2 = this.A0G;
        if (!r0.A0j(r2)) {
            if (AnonymousClass1DH.A02(this.A0U, this.A0E, r2)) {
                return R.string.f12nameremoved;
            }
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public MenuItem A0D(Menu menu, int i, int i2, int i3) {
        if (menu == null) {
            return null;
        }
        MenuItem add = menu.add(0, i, 0, i2);
        C20810yC r2 = this.A0F;
        if (!C36361kB.A1Y(r2)) {
            return add;
        }
        add.setIcon(AnonymousClass3UF.A03(this.A05, i3, AnonymousClass1MI.A01(r2)));
        return add;
    }

    public void A0E(Menu menu) {
        if (menu != null && this.A08.A09(C21100yf.A0v)) {
            A0D(menu, 3, R.string.f12nameremoved, R.drawable.ic_settings_export);
        }
    }

    public void A0H(MenuItem menuItem) {
        AnonymousClass01L r4 = this.A05;
        SpannableString A0O2 = C36441kJ.A0O(r4.getString(A0C()));
        AnonymousClass11F r2 = this.A0G;
        if (AnonymousClass1DH.A02(this.A0U, this.A0E, r2)) {
            A0O2.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(r4, R.color.f6nameremoved)), 0, A0O2.length(), 0);
        }
        menuItem.setTitle(A0O2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        r3.putExtra(r0, r1);
        r5.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bbx(android.view.MenuItem r17) {
        /*
            r16 = this;
            r4 = r16
            X.1AO r1 = r4.A0O
            r0 = 6
            r1.A01 = r0
            int r1 = r17.getItemId()
            r0 = 12
            r6 = 1
            if (r1 == r0) goto L_0x00e0
            r0 = 14
            if (r1 == r0) goto L_0x00b8
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x00b2
            r0 = 0
            switch(r1) {
                case 2: goto L_0x001e;
                case 3: goto L_0x0028;
                case 4: goto L_0x0109;
                case 5: goto L_0x003f;
                case 6: goto L_0x0070;
                case 7: goto L_0x008e;
                case 8: goto L_0x002f;
                case 9: goto L_0x00a6;
                case 10: goto L_0x0094;
                default: goto L_0x001d;
            }
        L_0x001d:
            return r0
        L_0x001e:
            X.340 r0 = r4.A0P
            X.1Wn r1 = r0.A00
            X.141 r0 = r0.A01
            r1.A05(r0)
            goto L_0x003d
        L_0x0028:
            X.3Er r0 = r4.A0R
            boolean r0 = r0.A00()
            return r0
        L_0x002f:
            X.36C r0 = r4.A0Q
            X.3tK r2 = new X.3tK
            r2.<init>(r0)
            X.1ed r1 = r0.A02
            X.11F r0 = r0.A01
            r1.A01(r0, r2)
        L_0x003d:
            r0 = 1
            return r0
        L_0x003f:
            java.lang.String r0 = "conversation/menu/wallpaper/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01L r5 = r4.A05
            X.11F r4 = r4.A0G
            if (r4 == 0) goto L_0x0065
            boolean r0 = X.AnonymousClass1RC.A0A(r5)
            if (r0 != 0) goto L_0x0065
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity"
        L_0x005a:
            android.content.Intent r3 = r2.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r4)
            java.lang.String r0 = "chat_jid"
            goto L_0x0087
        L_0x0065:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity"
            goto L_0x005a
        L_0x0070:
            X.01L r5 = r4.A05
            X.11F r2 = r4.A0G
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallery.MediaGalleryActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r2)
            java.lang.String r0 = "jid"
        L_0x0087:
            r3.putExtra(r0, r1)
            r5.startActivity(r3)
            return r6
        L_0x008e:
            X.01L r0 = r4.A05
            r0.onSearchRequested()
            return r6
        L_0x0094:
            X.0v5 r1 = r4.A0K
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0127
            r1.A02()
            java.lang.String r0 = "exportChatMessages"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00a6:
            X.19g r0 = r4.A0W
            X.3ty r1 = r0.A07()
            r0 = 9
            X.C79593ty.A00(r1, r4, r0)
            return r6
        L_0x00b2:
            X.01L r0 = r4.A05
            r0.finish()
            return r6
        L_0x00b8:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            r0 = 2131890534(0x7f121166, float:1.9415763E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r15 = 2131896227(0x7f1227a3, float:1.942731E38)
            r0 = 2131891584(0x7f121580, float:1.9417892E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r11 = r7
            r13 = r7
            r14 = r7
            r8 = r7
            com.whatsapp.WaMessageDialogFragment r1 = X.AnonymousClass5ZU.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.01L r0 = r4.A05
            X.01z r0 = r0.getSupportFragmentManager()
            X.C65443Sb.A01(r1, r0)
            return r6
        L_0x00e0:
            X.0wU r1 = r4.A0J
            r0 = 31
            X.C80223v3.A02(r1, r4, r0)
            X.11F r3 = r4.A0G
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0127
            X.1Jx r0 = r4.A0I
            r1 = r3
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0127
            X.01L r2 = r4.A05
            X.12q r0 = r4.A0E
            int r1 = r0.A03(r1)
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass190.A0Y(r2, r3, r1, r0)
            r2.startActivity(r0)
            return r6
        L_0x0109:
            X.11F r5 = r4.A0G
            X.12q r1 = r4.A0E
            X.0v0 r0 = r4.A0U
            boolean r0 = X.AnonymousClass1DH.A02(r0, r1, r5)
            if (r0 == 0) goto L_0x0128
            X.01L r3 = r4.A05
            X.1X4 r2 = r4.A0L
            r0 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r1 = r3.findViewById(r0)
            java.lang.Integer r0 = X.C36371kC.A0o()
            X.AnonymousClass1DH.A00(r3, r1, r2, r5, r0)
        L_0x0127:
            return r6
        L_0x0128:
            X.1CR r0 = r4.A0Z
            boolean r0 = r0.A0j(r5)
            if (r0 == 0) goto L_0x0138
            X.0wU r1 = r4.A0J
            r0 = 32
            X.C80223v3.A02(r1, r4, r0)
            return r6
        L_0x0138:
            X.2oi r0 = X.C51992oi.CONVERSATION_SCREEN
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass3RD.A01(r5, r0)
            X.01L r0 = r4.A05
            X.01z r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A1f(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28f.Bbx(android.view.MenuItem):boolean");
    }

    public boolean BdM(Menu menu) {
        boolean BJx = this.A0B.BJx();
        A00(menu, 8, BJx);
        A00(menu, 7, BJx);
        A00(menu, 3, BJx);
        A00(menu, 9, true);
        MenuItem findItem = menu.findItem(1);
        if (findItem != null) {
            SubMenu subMenu = findItem.getSubMenu();
            A00(subMenu, 10, BJx);
            findItem.setVisible(subMenu.hasVisibleItems());
        }
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0T.registerObserver(this.A0S);
        this.A0N.registerObserver(this.A0M);
        this.A0Y.registerObserver(this.A0X);
    }

    public void onActivityDestroyed(Activity activity) {
        this.A0T.unregisterObserver(this.A0S);
        this.A0N.unregisterObserver(this.A0M);
        this.A0Y.unregisterObserver(this.A0X);
    }

    public static void A00(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public static void A01(MenuItem menuItem, AnonymousClass28f r2, int i, boolean z) {
        r2.A0I(menuItem, i, z);
        menuItem.setShowAsAction(2);
    }

    public void A0F(Menu menu) {
        A0D(menu, 2, R.string.f12nameremoved, R.drawable.ic_spam_add);
    }

    public void A0G(Menu menu) {
        A0D(menu, 8, R.string.f12nameremoved, R.drawable.ic_settings_clearchat);
    }

    public void A0I(MenuItem menuItem, int i, boolean z) {
        AnonymousClass3Z8 r0;
        View actionView = menuItem.getActionView();
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        actionView.setAlpha(f);
        actionView.setEnabled(z);
        if (z) {
            if (!C36351kA.A1Y(this.A0D)) {
                r0 = new AnonymousClass3Z8(0.2f, 0.0f, 0.0f, 0.0f);
            }
            actionView.setOnTouchListener(r0);
            AnonymousClass3YE.A00(actionView, this, menuItem, 49);
            actionView.setOnLongClickListener(new AnonymousClass3Z3(this, i));
        }
    }

    public AnonymousClass28f(AnonymousClass01L r5, C19460v5 r6, C19460v5 r7, C19460v5 r8, AnonymousClass3C4 r9, AnonymousClass3C5 r10, C58012zB r11, C225014r r12, AnonymousClass17Y r13, C19730wQ r14, C21100yf r15, AnonymousClass1X4 r16, AnonymousClass3CG r17, AnonymousClass1MK r18, C24361Cd r19, AnonymousClass1AO r20, AnonymousClass16I r21, AnonymousClass4V7 r22, AnonymousClass1NM r23, C19420v0 r24, C18820ts r25, C220412q r26, AnonymousClass1A5 r27, AnonymousClass141 r28, C236419g r29, C20810yC r30, C20500xf r31, C233117z r32, AnonymousClass11F r33, C32641dx r34, AnonymousClass1CR r35, C26371Jx r36, C19770wU r37) {
        this.A0F = r30;
        this.A05 = r5;
        this.A06 = r12;
        this.A0B = r22;
        this.A07 = r13;
        this.A03 = r14;
        this.A0J = r37;
        this.A0E = r26;
        this.A02 = r6;
        this.A08 = r15;
        this.A0L = r16;
        this.A04 = r31;
        this.A0A = r18;
        this.A0D = r25;
        this.A09 = r17;
        this.A0H = r34;
        this.A0O = r20;
        this.A0T = r21;
        this.A01 = r7;
        this.A0C = r23;
        this.A0Z = r35;
        this.A0N = r19;
        this.A0U = r24;
        this.A0W = r29;
        this.A0V = r27;
        this.A0I = r36;
        this.A0Y = r32;
        this.A0K = r8;
        AnonymousClass11F r3 = r33;
        this.A0G = r3;
        AnonymousClass141 r2 = r28;
        this.A00 = r2;
        this.A0Q = new AnonymousClass36C(r5, r3, C36411kG.A0p(r9.A00.A01.A00));
        this.A0R = r10.A00(r5, r12, r2, r3);
        this.A0P = new AnonymousClass340((C29411Wn) r11.A00.A01.A9H.get(), r2);
    }
}
