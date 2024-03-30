package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1RB;
import X.C009003v;
import X.C023509x;
import X.C224314h;
import X.C224514j;
import X.C36331k8;
import X.C36341k9;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1$1$2", f = "FavoriteCallListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListActivity$initObservables$1$1$1$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ FavoriteCallListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListActivity$initObservables$1$1$1$2(FavoriteCallListActivity favoriteCallListActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = favoriteCallListActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        FavoriteCallListActivity$initObservables$1$1$1$2 favoriteCallListActivity$initObservables$1$1$1$2 = new FavoriteCallListActivity$initObservables$1$1$1$2(this.this$0, r4);
        favoriteCallListActivity$initObservables$1$1$1$2.Z$0 = AnonymousClass000.A1X(obj);
        return favoriteCallListActivity$initObservables$1$1$1$2;
    }

    public final Object invokeSuspend(Object obj) {
        int A00;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            boolean z = this.Z$0;
            FavoriteCallListActivity favoriteCallListActivity = this.this$0;
            favoriteCallListActivity.A09 = !z;
            Toolbar toolbar = favoriteCallListActivity.A02;
            if (toolbar != null) {
                int i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
                toolbar.setTitle(i);
            }
            FavoriteCallListActivity favoriteCallListActivity2 = this.this$0;
            if (z) {
                A00 = C224514j.A00(favoriteCallListActivity2, R.attr.f4nameremoved, R.color.f6nameremoved);
            } else {
                AnonymousClass00C.A0D(favoriteCallListActivity2, 0);
                A00 = C224314h.A00(favoriteCallListActivity2);
            }
            Window window = favoriteCallListActivity2.getWindow();
            AnonymousClass00C.A08(window);
            AnonymousClass1RB.A00(window, AnonymousClass00F.A00(favoriteCallListActivity2, A00), true);
            WDSToolbar wDSToolbar = favoriteCallListActivity2.A05;
            if (wDSToolbar == null) {
                throw C36331k8.A0d("wdsToolBar");
            }
            C36341k9.A0q(favoriteCallListActivity2, wDSToolbar, A00);
            this.this$0.invalidateOptionsMenu();
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListActivity$initObservables$1$1$1$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
