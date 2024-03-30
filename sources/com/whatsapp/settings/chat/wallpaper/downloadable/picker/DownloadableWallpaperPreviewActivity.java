package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass000;
import X.C03570Gk;
import X.C132446Tt;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36411kG;
import X.C36441kJ;
import X.C47212e0;
import X.C47272eD;
import X.C597335b;
import X.C64383Nt;
import X.C89364Wg;
import X.C89704Xo;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DownloadableWallpaperPreviewActivity extends C47212e0 {
    public MarginCorrectedViewPager A00;
    public C64383Nt A01;
    public List A02;
    public List A03;
    public Resources A04;
    public C47272eD A05;
    public C597335b A06;
    public boolean A07;
    public final Set A08;

    public void onBackPressed() {
        setResult(0, (Intent) null);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36341k9.A0q(this, C03570Gk.A0B(this, R.id.container), C36411kG.A01(this));
        this.A00.setEnabled(false);
        try {
            this.A04 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloadableWallpaperPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        C18740tg.A06(parcelableArrayListExtra);
        this.A02 = parcelableArrayListExtra;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
        this.A03 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
        this.A00 = (MarginCorrectedViewPager) C03570Gk.A0B(this, R.id.wallpaper_preview);
        C19770wU r9 = this.A04;
        C64383Nt r7 = this.A01;
        C47272eD r3 = new C47272eD(this, this.A04, this.A00, r7, this.A06, r9, this.A02, integerArrayListExtra, this.A03, this.A01);
        this.A05 = r3;
        this.A00.setAdapter(r3);
        this.A00.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
        this.A00.A0K(new C89704Xo(this, 2));
        this.A00.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36341k9.A0R(A0B);
            this.A02 = C36341k9.A0S(A0B);
            this.A01 = (C64383Nt) r1.A1V.get();
        }
    }

    public void onDestroy() {
        Iterator A0z = AnonymousClass000.A0z(this.A05.A06);
        while (A0z.hasNext()) {
            ((C132446Tt) A0z.next()).A0D(true);
        }
        super.onDestroy();
    }

    public DownloadableWallpaperPreviewActivity(int i) {
        this.A07 = false;
        C89364Wg.A00(this, 43);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public DownloadableWallpaperPreviewActivity() {
        this(0);
        this.A08 = C36441kJ.A16();
        this.A06 = new C597335b(this);
    }
}
