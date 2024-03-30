package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.3aA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67593aA implements AnonymousClass026 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Menu A02;
    public final /* synthetic */ MenuItem A03;
    public final /* synthetic */ WaImageButton A04;
    public final /* synthetic */ AnonymousClass2H1 A05;

    public /* synthetic */ C67593aA(Context context, Menu menu, MenuItem menuItem, WaImageButton waImageButton, AnonymousClass2H1 r5, int i) {
        this.A05 = r5;
        this.A02 = menu;
        this.A01 = context;
        this.A00 = i;
        this.A04 = waImageButton;
        this.A03 = menuItem;
    }

    public final void accept(Object obj) {
        AnonymousClass2H1 r6 = this.A05;
        Menu menu = this.A02;
        Context context = this.A01;
        int i = this.A00;
        WaImageButton waImageButton = this.A04;
        MenuItem menuItem = this.A03;
        AnonymousClass141 r9 = (AnonymousClass141) obj;
        if (r9 == null) {
            menu.removeItem(32);
            return;
        }
        Bitmap A09 = C36401kF.A09(context, r6.A0C, r9, i);
        if (A09 != null) {
            waImageButton.setImageDrawable(r6.A0H.A01(context.getResources(), A09, C68443bu.A00));
        } else {
            AnonymousClass1Pp r2 = r6.A09;
            r2.A05(waImageButton, -2.14748365E9f, r2.A02(r9), i);
        }
        r6.A0I(menuItem, R.string.f12nameremoved, true);
    }
}
