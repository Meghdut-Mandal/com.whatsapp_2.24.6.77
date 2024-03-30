package com.whatsapp.shareinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass22c;
import X.AnonymousClass23r;
import X.AnonymousClass23s;
import X.AnonymousClass23t;
import X.AnonymousClass3DX;
import X.AnonymousClass3GE;
import X.AnonymousClass3Y8;
import X.AnonymousClass4P3;
import X.AnonymousClass4VN;
import X.AnonymousClass92E;
import X.C023109s;
import X.C166187vF;
import X.C18740tg;
import X.C187798yY;
import X.C18800tq;
import X.C18830tt;
import X.C200649ht;
import X.C20350xQ;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C26981Mg;
import X.C27111My;
import X.C27591Ow;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C39631t2;
import X.C46332Wm;
import X.C55862vJ;
import X.C57812yr;
import X.C591932z;
import X.C65963Ud;
import X.C81173wa;
import X.C81203wd;
import X.C87884Qn;
import X.C89364Wg;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ShareGroupInviteLinkActivity extends AnonymousClass22c implements AnonymousClass4P3, C87884Qn {
    public C57812yr A00;
    public TextEmojiLabel A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C21010yW A04;
    public C20350xQ A05;
    public C27591Ow A06;
    public AnonymousClass147 A07;
    public AnonymousClass19A A08;
    public AnonymousClass1EM A09;
    public C32681e1 A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public AnonymousClass3GE A0E;
    public AnonymousClass3GE A0F;
    public AnonymousClass23r A0G;
    public AnonymousClass23t A0H;
    public AnonymousClass23s A0I;
    public C39631t2 A0J;
    public boolean A0K;
    public final BroadcastReceiver A0L;
    public final C591932z A0M;

    public void BZi(String str, int i, boolean z) {
        A07(true);
        A2C(false);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str != null) {
            A0u.append("invitelink/gotcode/");
            A0u.append(str);
            C36321k7.A1X(" recreate:", A0u, z);
            C20350xQ r0 = this.A05;
            r0.A14.put(this.A07, str);
            A01(this, str);
            if (z) {
                BO5(R.string.f12nameremoved);
                return;
            }
            return;
        }
        C36321k7.A1T("invitelink/failed/", A0u, i);
        if (i == 436) {
            Btm(InviteLinkUnavailableDialogFragment.A03(true, true));
            C20350xQ r02 = this.A05;
            r02.A14.remove(this.A07);
            A01(this, (String) null);
            return;
        }
        this.A05.A06(C55862vJ.A00(i, this.A09.A06(this.A07)), 0);
        if (TextUtils.isEmpty(this.A0C)) {
            finish();
        }
    }

    public void Bop() {
        A0F(true);
    }

    public static void A01(ShareGroupInviteLinkActivity shareGroupInviteLinkActivity, String str) {
        String A0p;
        shareGroupInviteLinkActivity.A0C = str;
        if (TextUtils.isEmpty(str)) {
            A0p = null;
        } else {
            A0p = AnonymousClass000.A0p("https://chat.whatsapp.com/", str, AnonymousClass000.A0u());
        }
        if (!TextUtils.isEmpty(str)) {
            shareGroupInviteLinkActivity.A01.setText(A0p);
            boolean A062 = shareGroupInviteLinkActivity.A09.A06(shareGroupInviteLinkActivity.A07);
            int i = R.string.f12nameremoved;
            if (A062) {
                i = R.string.f12nameremoved;
            }
            String A0w = C36351kA.A0w(shareGroupInviteLinkActivity, A0p, 1, i);
            AnonymousClass23t r3 = shareGroupInviteLinkActivity.A0H;
            r3.A02 = A0w;
            r3.A01 = C36391kE.A0v(shareGroupInviteLinkActivity, shareGroupInviteLinkActivity.A0B, new Object[1], 0, R.string.f12nameremoved);
            shareGroupInviteLinkActivity.A0H.A00 = shareGroupInviteLinkActivity.getString(R.string.f12nameremoved);
            shareGroupInviteLinkActivity.A0I.A00 = A0w;
            shareGroupInviteLinkActivity.A0G.A00 = A0p;
            return;
        }
        shareGroupInviteLinkActivity.A07(false);
        shareGroupInviteLinkActivity.A01.setText(" \n ");
    }

    private void A07(boolean z) {
        this.A01.setEnabled(z);
        this.A0G.A00.setEnabled(z);
        this.A0F.A00.setEnabled(z);
        this.A0H.A00.setEnabled(z);
        this.A0E.A00.setEnabled(z);
        this.A0I.A00.setEnabled(z);
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A04 = C36351kA.A0g(r2);
            this.A08 = C36361kB.A0c(r2);
            this.A02 = C36341k9.A0R(r2);
            this.A03 = C36341k9.A0S(r2);
            this.A09 = C36371kC.A0l(r2);
            this.A05 = C36361kB.A0a(r2);
            this.A06 = C36391kE.A0g(r2);
            this.A0A = C36351kA.A0p(r1);
            this.A00 = (C57812yr) A0L2.A1s.get();
        }
    }

    public ShareGroupInviteLinkActivity(int i) {
        this.A0K = false;
        C89364Wg.A00(this, 44);
    }

    private void A0F(boolean z) {
        boolean z2 = z;
        C36321k7.A1X("invitelink/sendgetlink/recreate:", AnonymousClass000.A0u(), z);
        if (z) {
            A07(false);
            A2C(true);
        }
        C20810yC r3 = this.A0D;
        C46332Wm r1 = new C46332Wm(this.A05, r3, this, this.A06, this.A08, z2);
        AnonymousClass147 r0 = this.A07;
        C18740tg.A06(r0);
        r1.A07(r0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A3m();
        AnonymousClass23s A3l = A3l();
        this.A0I = A3l;
        A3l.A02 = new C81203wd(this, C36371kC.A0o(), 4);
        AnonymousClass23r A3j = A3j();
        this.A0G = A3j;
        A3j.A02 = new C81203wd(this, 1, 4);
        AnonymousClass23t A3k = A3k();
        this.A0H = A3k;
        A3k.A02 = new C81203wd(this, C36371kC.A0n(), 4);
        AnonymousClass3GE r1 = new AnonymousClass3GE();
        this.A0E = r1;
        r1.A00 = A3i();
        this.A0E.A00(new AnonymousClass3Y8(this, 40), getString(R.string.f12nameremoved), R.drawable.ic_scan_qr);
        this.A0E.A00.setVisibility(0);
        AnonymousClass3GE r12 = new AnonymousClass3GE();
        this.A0F = r12;
        r12.A00 = A3i();
        this.A0F.A00(new AnonymousClass3Y8(this, 41), getString(R.string.f12nameremoved), R.drawable.ic_revoke_invite);
        AnonymousClass147 A062 = AnonymousClass147.A01.A06(C36341k9.A0d(this));
        C18740tg.A06(A062);
        this.A07 = A062;
        C57812yr r13 = this.A00;
        this.A0J = new C39631t2(C36341k9.A0R(r13.A00.A01), A062, C36341k9.A0Z(r13.A00.A01));
        this.A01 = C36421kH.A0I(this, R.id.share_link_description);
        boolean A063 = this.A09.A06(this.A07);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (A063) {
            textEmojiLabel.setText(R.string.f12nameremoved);
        } else {
            C36331k8.A1A(this.A0D, textEmojiLabel);
            this.A0D = true;
        }
        A0F(false);
        C26981Mg.A01(this.A0L, this, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"), true);
        C20350xQ r0 = this.A05;
        r0.A0h.registerObserver(this.A0M);
        C65963Ud.A00(this, this.A0J.A00, 18);
        C65963Ud.A00(this, this.A0J.A01, 17);
        C65963Ud.A00(this, this.A0J.A04, 19);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, R.id.menuitem_write_tag, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A0L);
        C20350xQ r0 = this.A05;
        r0.A0h.unregisterObserver(this.A0M);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_print) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("invitelink/printlink/");
            A0u.append(this.A0C);
            A0u.append(" jid:");
            C36321k7.A1N(this.A07, A0u);
            if (!(this.A07 == null || this.A0C == null)) {
                try {
                    EnumMap enumMap = new EnumMap(C187798yY.class);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("whatsapp://chat?code=");
                    AnonymousClass3DX r4 = C200649ht.A00(C023109s.A01, AnonymousClass000.A0q(this.A0C, A0u2), enumMap).A03;
                    String A0v = C36391kE.A0v(this, this.A0B, new Object[1], 0, R.string.f12nameremoved);
                    PrintManager printManager = (PrintManager) C21060yb.A02(this, "print");
                    if (printManager == null) {
                        Log.e("invitelink/print/no-print-manager");
                        return true;
                    }
                    printManager.print(A0v, new C166187vF(this, r4, this.A0C, A0v), (PrintAttributes) null);
                    return true;
                } catch (AnonymousClass92E e) {
                    Log.i("invitelink/", e);
                    return true;
                }
            }
        } else if (itemId != R.id.menuitem_write_tag) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("invitelink/writetag/");
            A0u3.append(this.A0C);
            A0u3.append(" jid:");
            C36321k7.A1N(this.A07, A0u3);
            if (!(this.A07 == null || (str = this.A0C) == null)) {
                Intent A0D2 = C36431kI.A0D();
                A0D2.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
                A0D2.putExtra("mime", "application/com.whatsapp.join");
                A0D2.putExtra("data", str);
                startActivity(A0D2);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131431715(0x7f0b1123, float:1.8485167E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x001a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setEnabled(r0)
        L_0x001a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onResume() {
        super.onResume();
        A01(this, C36431kI.A1A(this.A07, this.A05.A14));
        if (this.A0D) {
            C39631t2 r2 = this.A0J;
            C81173wa.A01(r2.A05, r2, 7);
        }
    }

    public ShareGroupInviteLinkActivity() {
        this(0);
        this.A0D = false;
        this.A0B = "";
        this.A0L = new AnonymousClass4VN(this, 4);
        this.A0M = new C591932z(this);
    }
}
