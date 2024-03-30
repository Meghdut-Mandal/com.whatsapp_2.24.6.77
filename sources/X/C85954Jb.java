package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.4Jb  reason: invalid class name and case insensitive filesystem */
public final class C85954Jb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass2H2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85954Jb(AnonymousClass2H2 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3KA r7 = (AnonymousClass3KA) obj;
        AnonymousClass2H2 r5 = this.this$0;
        AnonymousClass00C.A0B(r7);
        Menu menu = r5.A00;
        if (menu == null) {
            throw C36331k8.A0d("menu");
        }
        MenuItem findItem = menu.findItem(60);
        if (findItem != null && findItem.isVisible()) {
            r5.A05.invalidateOptionsMenu();
        }
        if (r7.A04) {
            AnonymousClass01L r4 = r5.A05;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            C39001qm A00 = AnonymousClass3LW.A00(r4);
            A00.A0d(r7.A01);
            A00.A0c(r7.A00);
            A00.A0m(r4, new AnonymousClass3UW(r7, r5, 10), R.string.f12nameremoved);
            A00.A0l(r4, C67883az.A00, R.string.f12nameremoved);
            C36341k9.A11(A00);
        } else {
            C36401kF.A0L(r5.A05).BO5(r7.A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
