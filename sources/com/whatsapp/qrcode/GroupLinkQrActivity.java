package com.whatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y6;
import X.AnonymousClass4P3;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19730wQ;
import X.C19770wU;
import X.C20350xQ;
import X.C20690y0;
import X.C20810yC;
import X.C27591Ow;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C46332Wm;
import X.C49522jG;
import X.C53122qo;
import X.C55862vJ;
import X.C62233Fh;
import X.C65683Tb;
import X.C87884Qn;
import X.C89354Wf;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;

public class GroupLinkQrActivity extends AnonymousClass155 implements AnonymousClass4P3, C87884Qn {
    public AnonymousClass16D A00;
    public C18820ts A01;
    public C20350xQ A02;
    public C27591Ow A03;
    public AnonymousClass19A A04;
    public ContactQrContactCardView A05;
    public AnonymousClass1EM A06;
    public AnonymousClass141 A07;
    public AnonymousClass147 A08;
    public C62233Fh A09;
    public String A0A;
    public boolean A0B;

    private void A07(boolean z) {
        boolean z2 = z;
        if (z) {
            Bu2(0, R.string.f12nameremoved);
        }
        C20810yC r3 = this.A0D;
        C46332Wm r1 = new C46332Wm(this.A05, r3, this, this.A03, this.A04, z2);
        AnonymousClass147 r0 = this.A08;
        C18740tg.A06(r0);
        r1.A07(r0);
    }

    public void Bop() {
        A07(true);
    }

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A04 = C36361kB.A0c(A0B2);
            this.A00 = C36341k9.A0R(A0B2);
            this.A01 = C36341k9.A0T(A0B2);
            this.A06 = C36371kC.A0l(A0B2);
            this.A02 = C36361kB.A0a(A0B2);
            this.A03 = C36391kE.A0g(A0B2);
        }
    }

    public void onStop() {
        this.A09.A00(getWindow());
        super.onStop();
    }

    public GroupLinkQrActivity(int i) {
        this.A0B = false;
        C89354Wf.A00(this, 34);
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AnonymousClass000.A0p("https://chat.whatsapp.com/", str, AnonymousClass000.A0u());
    }

    public void BZi(String str, int i, boolean z) {
        Bnv();
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str != null) {
            A0u.append("invitelink/gotcode/");
            A0u.append(str);
            C36321k7.A1X(" recreate:", A0u, z);
            C20350xQ r0 = this.A02;
            r0.A14.put(this.A08, str);
            this.A0A = str;
            this.A05.setQrCode(A01(str));
            if (z) {
                BO5(R.string.f12nameremoved);
                return;
            }
            return;
        }
        C36321k7.A1T("invitelink/failed/", A0u, i);
        if (i == 436) {
            Btm(InviteLinkUnavailableDialogFragment.A03(true, true));
            C20350xQ r02 = this.A02;
            r02.A14.remove(this.A08);
            return;
        }
        this.A05.A06(C55862vJ.A00(i, this.A06.A06(this.A08)), 0);
        if (TextUtils.isEmpty(this.A0A)) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        AnonymousClass3UF.A0C(this, A0O, this.A01);
        A0O.setTitle((int) R.string.f12nameremoved);
        A0O.setNavigationOnClickListener(new AnonymousClass3Y6(this, 0));
        setSupportActionBar(A0O);
        setTitle(R.string.f12nameremoved);
        AnonymousClass147 A062 = AnonymousClass147.A01.A06(C36341k9.A0d(this));
        C18740tg.A06(A062);
        this.A08 = A062;
        this.A07 = this.A00.A0D(A062);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById(R.id.group_qr_card);
        this.A05 = contactQrContactCardView;
        contactQrContactCardView.A02(this.A07, true);
        this.A05.setStyle(0);
        boolean A063 = this.A06.A06(this.A08);
        ContactQrContactCardView contactQrContactCardView2 = this.A05;
        int i = R.string.f12nameremoved;
        if (A063) {
            i = R.string.f12nameremoved;
        }
        contactQrContactCardView2.setPrompt(getString(i));
        this.A09 = new C62233Fh();
        String A1A = C36431kI.A1A(this.A08, this.A02.A14);
        this.A0A = A1A;
        if (!TextUtils.isEmpty(A1A)) {
            this.A05.setQrCode(A01(this.A0A));
        }
        A07(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass3UF.A09(this, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            if (this.A0A == null) {
                A07(false);
                this.A05.A06(R.string.f12nameremoved, 0);
                return true;
            }
            boolean A062 = this.A06.A06(this.A08);
            Bu1(R.string.f12nameremoved);
            C19770wU r5 = this.A04;
            AnonymousClass17Y r11 = this.A05;
            C19730wQ r12 = this.A02;
            C20690y0 r10 = this.A04;
            int i = R.string.f12nameremoved;
            if (A062) {
                i = R.string.f12nameremoved;
            }
            C49522jG r8 = new C49522jG(this, r10, r11, r12, C36391kE.A0v(this, A01(this.A0A), new Object[1], 0, i));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass141 r3 = this.A07;
            String A012 = A01(this.A0A);
            int i2 = R.string.f12nameremoved;
            if (A062) {
                i2 = R.string.f12nameremoved;
            }
            bitmapArr[0] = C65683Tb.A00(this, r3, A012, getString(i2), true);
            r5.Box(r8, bitmapArr);
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Btm(C53122qo.A00(this.A08, true));
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        this.A09.A01(getWindow(), this.A08);
    }

    public GroupLinkQrActivity() {
        this(0);
    }
}
