package com.whatsapp.settings.chat.wallpaper;

import X.C03570Gk;
import X.C18800tq;
import X.C18820ts;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import X.C40821wA;
import X.C41211wq;
import X.C89364Wg;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.collections.AutoFitGridLayoutManager;

public class SolidColorWallpaper extends C225314u {
    public static final int[] A04 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public C18820ts A00;
    public int[] A01;
    public boolean A02;
    public int[] A03;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            if (intent == null || !intent.hasExtra("wallpaper_color_file")) {
                setResult(0, (Intent) null);
            } else {
                setResult(-1, intent);
            }
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
            this.A00 = C36341k9.A0T(A0B);
        }
    }

    public SolidColorWallpaper(int i) {
        this.A02 = false;
        C89364Wg.A00(this, 38);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        boolean A1X = C36341k9.A1X(this);
        C36361kB.A0v(this, R.id.separator);
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.color_grid);
        recyclerView.A0t(new C41211wq(this.A00, getResources().getDimensionPixelOffset(R.dimen.f7nameremoved)));
        int[] intArray = getResources().getIntArray(R.array.f3nameremoved);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair A0Q = C36441kJ.A0Q(intArray, iArr);
        int[] iArr2 = (int[]) A0Q.first;
        this.A03 = iArr2;
        this.A01 = (int[]) A0Q.second;
        recyclerView.setAdapter(new C40821wA(this, this, iArr2));
        recyclerView.A0U = A1X;
        recyclerView.setLayoutManager(new AutoFitGridLayoutManager(this, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }

    public SolidColorWallpaper() {
        this(0);
    }
}
