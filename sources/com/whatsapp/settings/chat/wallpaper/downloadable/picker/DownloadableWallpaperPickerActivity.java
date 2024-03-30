package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00I;
import X.AnonymousClass2e1;
import X.AnonymousClass3YC;
import X.C03570Gk;
import X.C132446Tt;
import X.C167927zQ;
import X.C168087zg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36441kJ;
import X.C41211wq;
import X.C591832y;
import X.C64383Nt;
import X.C65933Ua;
import X.C81163wZ;
import X.C89364Wg;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadableWallpaperPickerActivity extends AnonymousClass2e1 {
    public View A00;
    public View A01;
    public AnonymousClass00I A02;
    public RecyclerView A03;
    public C18820ts A04;
    public C64383Nt A05;
    public C168087zg A06;
    public List A07;
    public boolean A08;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36341k9.A0T(A0B);
            this.A05 = (C64383Nt) r1.A1V.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 111) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    public DownloadableWallpaperPickerActivity(int i) {
        this.A08 = false;
        C89364Wg.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        int identifier;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        int i = R.string.f12nameremoved;
        if (booleanExtra) {
            i = R.string.f12nameremoved;
        }
        C36391kE.A15(this, i);
        Resources resources = null;
        try {
            resources = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            try {
                int identifier2 = resources.getIdentifier("wallpapers", "array", "com.whatsapp.wallpaper");
                if (identifier2 != 0) {
                    for (String str : resources.getStringArray(identifier2)) {
                        int identifier3 = resources.getIdentifier(str, "drawable", "com.whatsapp.wallpaper");
                        if (!(identifier3 == 0 || (identifier = resources.getIdentifier(AnonymousClass000.A0q("_small", AnonymousClass000.A0v(str)), "drawable", "com.whatsapp.wallpaper")) == 0)) {
                            AnonymousClass000.A1F(A0I, identifier);
                            AnonymousClass000.A1F(A0I2, identifier3);
                        }
                    }
                }
            } catch (Resources.NotFoundException e) {
                Log.e("WallpaperUtils/resource not found", e);
            }
            this.A02 = C36441kJ.A0W(A0I, A0I2);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("WallpaperCurrentPreviewActivity/com.whatsapp.wallpaper could not be found.", e2);
        }
        this.A01 = C03570Gk.A0B(this, R.id.wallpaper_thumbnails_progress_container);
        this.A00 = C03570Gk.A0B(this, R.id.wallpaper_thumbnail_error_container);
        this.A03 = (RecyclerView) C03570Gk.A0B(this, R.id.wallpaper_thumbnail_recyclerview);
        C168087zg r2 = new C168087zg(resources, new C591832y(this), this.A04);
        this.A06 = r2;
        this.A03.setLayoutManager(new C167927zQ(r2));
        this.A03.A0t(new C41211wq(this.A04, getResources().getDimensionPixelOffset(R.dimen.f7nameremoved)));
        this.A03.setAdapter(this.A06);
        if (this.A05.A00.A04() == null) {
            C64383Nt r3 = this.A05;
            r3.A04.execute(new C81163wZ((Object) r3, 47));
        }
        C36331k8.A0n(this);
        View A0B = C03570Gk.A0B(this, R.id.wallpaper_thumbnail_reload_button);
        A0B.setOnClickListener(new AnonymousClass3YC(this, A0B, 14));
        this.A05.A00.A08(this, new C65933Ua(A0B, this, 3, booleanExtra));
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0z = AnonymousClass000.A0z(this.A06.A04);
        while (A0z.hasNext()) {
            ((C132446Tt) A0z.next()).A0D(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public DownloadableWallpaperPickerActivity() {
        this(0);
        this.A07 = AnonymousClass001.A0I();
    }
}
