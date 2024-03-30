package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass16L;
import X.AnonymousClass17Y;
import X.AnonymousClass1R1;
import X.AnonymousClass1RC;
import X.AnonymousClass35W;
import X.AnonymousClass37Q;
import X.AnonymousClass3L4;
import X.AnonymousClass3T0;
import X.AnonymousClass6N7;
import X.C001700s;
import X.C03570Gk;
import X.C132446Tt;
import X.C167937zR;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C20830yE;
import X.C21060yb;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C40891wH;
import X.C41211wq;
import X.C47232e6;
import X.C54022sH;
import X.C65963Ud;
import X.C68963ck;
import X.C70863fq;
import X.C81163wZ;
import X.C88754Tx;
import X.C88774Tz;
import X.C89364Wg;
import X.C89854Yd;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class WallpaperCategoriesActivity extends AnonymousClass155 implements C88774Tz {
    public C88754Tx A00;
    public AnonymousClass16L A01;
    public C19630wG A02;
    public C20830yE A03;
    public AnonymousClass6N7 A04;
    public AnonymousClass11F A05;
    public AnonymousClass3T0 A06;
    public C40891wH A07;
    public C68963ck A08;
    public boolean A09;
    public boolean A0A;
    public final C54022sH A0B;

    public void BVh(int i) {
    }

    public void BVi(int i) {
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A02 = C36351kA.A0W(r2);
            this.A01 = C36401kF.A0S(r2);
            this.A04 = C27111My.A2D(A0L);
            this.A06 = (AnonymousClass3T0) r1.A4L.get();
            this.A03 = C36351kA.A0X(r2);
        }
    }

    public void BVj(int i) {
        if (i == 112) {
            AnonymousClass3T0 r2 = this.A06;
            AnonymousClass11F r1 = this.A05;
            if (r2 instanceof C47232e6) {
                C47232e6.A04(this, r1, (AnonymousClass37Q) null, (C47232e6) r2);
            }
            C36331k8.A0m(this);
        } else if (i == 113) {
            AnonymousClass3T0 r22 = this.A06;
            if (r22 instanceof C47232e6) {
                C47232e6 r23 = (C47232e6) r22;
                C81163wZ.A00(r23.A04, r23, 48);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        C001700s r1;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1R1.A04((ViewGroup) C03570Gk.A0B(this, R.id.container), new C89854Yd(this, 13));
        AnonymousClass1R1.A03(this);
        AnonymousClass17Y r14 = this.A05;
        C70863fq r15 = new C70863fq(r14);
        this.A00 = r15;
        this.A08 = new C68963ck(this, this, r14, r15, this.A0B, this.A08, this.A06);
        this.A05 = C36401kF.A0Z(getIntent(), "chat_jid");
        boolean A1T = C36421kH.A1T(getIntent(), "is_using_global_wallpaper");
        setSupportActionBar((Toolbar) C03570Gk.A0B(this, R.id.wallpaper_categories_toolbar));
        C36321k7.A0O(this);
        if (this.A05 == null || A1T) {
            boolean A0A2 = AnonymousClass1RC.A0A(this);
            i = R.string.f12nameremoved;
            if (A0A2) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
        }
        setTitle(i);
        this.A05 = C36401kF.A0Z(getIntent(), "chat_jid");
        this.A09 = this.A03.A0D();
        AnonymousClass3T0 r12 = this.A06;
        if (r12 instanceof C47232e6) {
            r1 = ((C47232e6) r12).A00;
        } else {
            r1 = null;
        }
        C18740tg.A06(r1);
        C65963Ud.A00(this, r1, 16);
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass000.A1F(A0I, 0);
        AnonymousClass000.A1F(A0I, 1);
        AnonymousClass000.A1F(A0I, 2);
        AnonymousClass000.A1F(A0I, 3);
        AnonymousClass000.A1F(A0I, 5);
        boolean z = this.A06.A0B(this, this.A05).A03;
        if (!z) {
            AnonymousClass000.A1F(A0I, 4);
        }
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.categories);
        AnonymousClass35W r9 = new AnonymousClass35W(this, z);
        Handler A0H = C36341k9.A0H();
        C21060yb r6 = this.A08;
        C40891wH r3 = new C40891wH(A0H, this.A01, r6, this.A02, this.A04, r9, this.A04, A0I);
        this.A07 = r3;
        recyclerView.setLayoutManager(new C167937zR(this, r3));
        recyclerView.A0t(new C41211wq(this.A00, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        recyclerView.setAdapter(this.A07);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A05 == null) {
            C36391kE.A1F(menu, 999, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public WallpaperCategoriesActivity(int i) {
        this.A0A = false;
        C89364Wg.A00(this, 40);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            setResult(i2);
            if (this.A08.BQk(intent, i, i2)) {
                finish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0z = AnonymousClass000.A0z(this.A07.A09);
        while (A0z.hasNext()) {
            ((C132446Tt) A0z.next()).A0D(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            AnonymousClass3L4 r3 = new AnonymousClass3L4(113);
            String string = getString(R.string.f12nameremoved);
            Bundle bundle = r3.A00;
            bundle.putCharSequence("message", string);
            bundle.putString("positive_button", getString(R.string.f12nameremoved));
            bundle.putString("negative_button", getString(R.string.f12nameremoved));
            Btm(r3.A00());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (this.A09 != this.A03.A0D()) {
            this.A09 = this.A03.A0D();
            this.A07.A06();
        }
    }

    public WallpaperCategoriesActivity() {
        this(0);
        this.A0B = new C54022sH();
        this.A05 = null;
    }
}
