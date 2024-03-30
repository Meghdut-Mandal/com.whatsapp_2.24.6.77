package com.whatsapp.conversationslist;

import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass18S;
import X.AnonymousClass190;
import X.AnonymousClass1MI;
import X.AnonymousClass3L5;
import X.AnonymousClass3UF;
import X.C009904e;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C222713q;
import X.C235718z;
import X.C28361Si;
import X.C35231iM;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C53502rQ;
import X.C81113wU;
import X.C89334Wd;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

public final class LockedConversationsActivity extends AnonymousClass155 {
    public Intent A00;
    public AnonymousClass18S A01;
    public C235718z A02;
    public AnonymousClass3L5 A03;
    public C28361Si A04;
    public Integer A05;
    public C009904e A06;
    public boolean A07;

    public void Bih(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.Bih(r2);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.Bii(r2);
        C36341k9.A0n(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(getPackageName(), "com.whatsapp.chatlock.ChatLockSettingsActivity");
            startActivity(A0D);
            AnonymousClass3L5 r0 = this.A03;
            if (r0 != null) {
                r0.A00(0);
                return true;
            }
            throw C36331k8.A0d("chatLockLogger");
        } else if (itemId != 16908332) {
            return false;
        } else {
            A07(this);
            return true;
        }
    }

    public static final void A01(LockedConversationsActivity lockedConversationsActivity) {
        C28361Si r4 = lockedConversationsActivity.A04;
        if (r4 != null) {
            r4.A04().post(new C35231iM(r4, 5, true));
            r4.A08();
            AnonymousClass09Y A0O = C36341k9.A0O(lockedConversationsActivity);
            A0O.A0F(new LockedConversationsFragment(), "LockedConversationsFragment", R.id.container);
            A0O.A01();
            return;
        }
        throw C36331k8.A0d("messageNotification");
    }

    public static final void A0F(LockedConversationsActivity lockedConversationsActivity, AnonymousClass11F r6, Integer num) {
        int i;
        lockedConversationsActivity.A05 = num;
        lockedConversationsActivity.A3i().A00 = true;
        Boolean A0j = C36381kD.A0j();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(lockedConversationsActivity.getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
        if (r6 != null) {
            A0D.putExtra("extra_chat_jid", r6.getRawString());
        }
        A0D.putExtra("extra_open_chat_directly", A0j);
        A0D.putExtra("extra_unlock_entry_point", i);
        C009904e r0 = lockedConversationsActivity.A06;
        if (r0 == null) {
            throw C36331k8.A0d("reauthenticationLauncher");
        }
        r0.A02(A0D);
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36391kE.A0a(A0B);
            this.A02 = C36391kE.A0Z(A0B);
            this.A04 = C36371kC.A0g(A0B);
            this.A01 = (AnonymousClass18S) r1.A05.get();
        }
    }

    public final C235718z A3i() {
        C235718z r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatLockManager");
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void onRestart() {
        this.A04.Boy(new C81113wU((Object) this, 13));
        super.onRestart();
    }

    public void onWindowFocusChanged(boolean z) {
        Window window = getWindow();
        if (z) {
            window.clearFlags(DefaultCrypto.BUFFER_SIZE);
        } else {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        super.onWindowFocusChanged(z);
    }

    public LockedConversationsActivity(int i) {
        this.A07 = false;
        C89334Wd.A00(this, 9);
    }

    public static final void A07(LockedConversationsActivity lockedConversationsActivity) {
        Intent intent;
        if ((!lockedConversationsActivity.isTaskRoot() || AnonymousClass00C.A0J(lockedConversationsActivity.getComponentName().getClassName(), "com.whatsapp.HomeActivity")) && ((intent = lockedConversationsActivity.getIntent()) == null || !intent.getBooleanExtra("extra_from_lock_chat_helper", false))) {
            lockedConversationsActivity.finish();
            return;
        }
        Intent A032 = AnonymousClass190.A03(lockedConversationsActivity);
        Intent intent2 = lockedConversationsActivity.getIntent();
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("extra_from_lock_chat_helper", false);
        }
        A032.putExtra("extra_from_lock_chat_helper", z);
        lockedConversationsActivity.finishAndRemoveTask();
        lockedConversationsActivity.startActivity(A032);
    }

    public void onBackPressed() {
        A07(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (r6.A05.A06() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            X.04a r1 = new X.04a
            r1.<init>()
            r5 = 2
            X.3Ta r0 = new X.3Ta
            r0.<init>(r6, r5)
            X.04e r0 = r6.BnD(r0, r1)
            r6.A06 = r0
            r0 = 2131890849(0x7f1212a1, float:1.9416401E38)
            X.C36391kE.A15(r6, r0)
            boolean r3 = X.C36381kD.A1W(r6)
            r0 = 2131625422(0x7f0e05ce, float:1.8878052E38)
            r6.setContentView((int) r0)
            X.18z r0 = r6.A3i()
            r1 = 0
            r0.A02 = r1
            if (r7 != 0) goto L_0x0077
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r4 = "fromNotification"
            boolean r0 = r0.getBooleanExtra(r4, r1)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6.A3d()
            if (r0 == 0) goto L_0x0048
            X.18U r0 = r6.A05
            boolean r0 = r0.A06()
            r2 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = X.C36341k9.A0d(r6)
            X.11F r1 = r1.A02(r0)
            if (r2 == 0) goto L_0x0078
            X.18z r0 = r6.A3i()
            r0.A03 = r3
            X.18z r0 = r6.A3i()
            r0.A01 = r3
            A01(r6)
            if (r1 == 0) goto L_0x0077
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r0 = r0.A1Z(r6, r1, r5)
            X.AnonymousClass00C.A08(r0)
            r0.putExtra(r4, r3)
            r6.startActivity(r0)
        L_0x0077:
            return
        L_0x0078:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            A0F(r6, r1, r0)
            return
        L_0x0080:
            X.18z r0 = r6.A3i()
            r0.A03 = r3
            X.18z r0 = r6.A3i()
            r0.A01 = r3
            A01(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LockedConversationsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        if (A3i().A0K()) {
            if (menu != null) {
                menuItem = menu.add(0, 0, 0, R.string.f12nameremoved);
            } else {
                menuItem = null;
            }
            if (C36361kB.A1Y(this.A0D) && menuItem != null) {
                menuItem.setIcon(AnonymousClass3UF.A03(this, R.drawable.ic_settings_settings, AnonymousClass1MI.A01(this.A0D)));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        A3i().A07((C53502rQ) null).B2U();
    }

    public void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        C222713q r1 = AnonymousClass11F.A00;
        Boolean bool = null;
        if (intent != null) {
            str = intent.getStringExtra("jid");
        } else {
            str = null;
        }
        AnonymousClass11F A022 = r1.A02(str);
        if (A022 != null) {
            int i = 0;
            if (intent != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra("fromNotification", false));
            }
            if (C36341k9.A1Z(bool)) {
                i = 2;
            }
            if (!A3i().A00) {
                Intent A1Z = C36441kJ.A0j().A1Z(this, A022, i);
                AnonymousClass00C.A08(A1Z);
                A1Z.putExtra("fromNotification", bool);
                startActivity(A1Z);
                return;
            }
            this.A00 = intent;
        }
    }

    public LockedConversationsActivity() {
        this(0);
    }
}
