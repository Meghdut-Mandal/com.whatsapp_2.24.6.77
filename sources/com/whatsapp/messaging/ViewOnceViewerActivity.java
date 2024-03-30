package com.whatsapp.messaging;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Z;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass3T1;
import X.AnonymousClass3UF;
import X.AnonymousClass3UJ;
import X.AnonymousClass3YU;
import X.AnonymousClass4TX;
import X.C013105r;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C236419g;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C595134f;
import X.C64933Qa;
import X.C89344We;
import X.C90394a5;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import java.util.Collections;
import java.util.Objects;

public class ViewOnceViewerActivity extends AnonymousClass155 {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public AnonymousClass17Z A02;
    public AnonymousClass16J A03;
    public C236419g A04;
    public AnonymousClass1A1 A05;
    public ViewOnceAudioFragment A06;
    public ViewOnceTextFragment A07;
    public C64933Qa A08;
    public boolean A09;
    public final AnonymousClass191 A0A;

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36351kA.A0n(A0B);
            this.A02 = C36411kG.A0c(A0B);
            this.A03 = C36361kB.A0Z(A0B);
            this.A04 = C36381kD.A0a(A0B);
            this.A00 = C36341k9.A0R(A0B);
            this.A01 = C36341k9.A0S(A0B);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        AnonymousClass3T1 A032 = this.A05.A03(this.A08);
        if (A032 == null) {
            this.A03.A0E("Expand VO: No message found", (String) null, false);
            return false;
        }
        AnonymousClass11F A0J = A032.A0J();
        if (A0J == null || (findItem = menu.findItem(R.id.menu_report)) == null) {
            return true;
        }
        findItem.setTitle(C36321k7.A0A(this, C36381kD.A0v(this.A01, this.A00.A0D(A0J)), R.string.f12nameremoved));
        return true;
    }

    public ViewOnceViewerActivity(int i) {
        this.A09 = false;
        C89344We.A00(this, 14);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass02E A0L = getSupportFragmentManager().A0L(R.id.view_once_fragment_container);
        if (A0L != null) {
            A0L.A1N(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        AnonymousClass09Y r2;
        int i;
        AnonymousClass02E r0;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass17Z r02 = AnonymousClass17Z.$redex_init_class;
        getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
        this.A08 = A022;
        if (A022 == null) {
            finish();
            return;
        }
        AnonymousClass3T1 A032 = this.A05.A03(A022);
        C18740tg.A06(A032);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        if (A032.A1I == 82) {
            str = "view_once_audio";
            ViewOnceAudioFragment viewOnceAudioFragment = (ViewOnceAudioFragment) supportFragmentManager.A0N(str);
            this.A06 = viewOnceAudioFragment;
            if (viewOnceAudioFragment == null) {
                C64933Qa r22 = this.A08;
                ViewOnceAudioFragment viewOnceAudioFragment2 = new ViewOnceAudioFragment();
                Bundle A072 = AnonymousClass001.A07();
                AnonymousClass3UJ.A08(A072, r22);
                viewOnceAudioFragment2.A17(A072);
                this.A06 = viewOnceAudioFragment2;
            }
            r2 = new AnonymousClass09Y(supportFragmentManager);
            i = R.id.view_once_fragment_container;
            r0 = this.A06;
        } else {
            str = "view_once_text";
            ViewOnceTextFragment viewOnceTextFragment = (ViewOnceTextFragment) supportFragmentManager.A0N(str);
            this.A07 = viewOnceTextFragment;
            if (viewOnceTextFragment == null) {
                C64933Qa r23 = this.A08;
                ViewOnceTextFragment viewOnceTextFragment2 = new ViewOnceTextFragment();
                Bundle A073 = AnonymousClass001.A07();
                AnonymousClass3UJ.A08(A073, r23);
                viewOnceTextFragment2.A17(A073);
                this.A07 = viewOnceTextFragment2;
            }
            r2 = new AnonymousClass09Y(supportFragmentManager);
            i = R.id.view_once_fragment_container;
            r0 = this.A07;
        }
        r2.A0F(r0, str, i);
        r2.A01();
        this.A03.registerObserver(this.A0A);
        Toolbar A0R = C36411kG.A0R(this);
        if (A0R != null) {
            A0R.A0F();
            Drawable A012 = AnonymousClass08I.A01(C013105r.A01(this, R.drawable.ic_close));
            AnonymousClass076.A06(A012, -1);
            A0R.setNavigationIcon(A012);
            if (C36431kI.A0Q(this, A0R) != null) {
                getSupportActionBar().A0X(false);
                getSupportActionBar().A0U(true);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.clear();
        menu.add(0, R.id.menu_view_once_info, 1, R.string.f12nameremoved).setIcon(AnonymousClass3UF.A02(this, R.drawable.ic_viewonce, R.color.f6nameremoved)).setShowAsAction(1);
        menu.add(1, R.id.menu_delete, 0, R.string.f12nameremoved);
        menu.add(1, R.id.menu_report, 0, R.string.f12nameremoved);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.unregisterObserver(this.A0A);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        AnonymousClass3T1 A032 = this.A05.A03(this.A08);
        Objects.requireNonNull(A032);
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.menu_view_once_info) {
            ViewOnceNuxBottomSheet.A03(getSupportFragmentManager(), (C595134f) null, (AnonymousClass3T1) ((AnonymousClass4TX) A032), true);
            return true;
        } else if (itemId == R.id.menu_delete) {
            C36421kH.A1A(DeleteMessagesDialogFragment.A03(A032.A1J.A00, Collections.singletonList(A032)), this);
            return true;
        } else if (itemId == R.id.menu_report) {
            this.A04.A07().A0A(new AnonymousClass3YU(A032, this, 9));
            return true;
        }
        return true;
    }

    public ViewOnceViewerActivity() {
        this(0);
        this.A0A = C90394a5.A00(this, 24);
    }
}
