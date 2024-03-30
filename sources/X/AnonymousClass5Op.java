package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Op  reason: invalid class name */
public class AnonymousClass5Op extends C101094wz {
    public MenuItem A00;
    public List A01;
    public final C159757js A02;

    public void BUv(Menu menu) {
        MenuItem menuItem;
        MenuItem add = menu.add(0, 56, 0, "");
        this.A00 = add;
        add.setShowAsAction(0);
        this.A00.setTitle(R.string.f12nameremoved);
        this.A00.setIcon(AnonymousClass3UF.A02(C36441kJ.A0G(this.A02.BJB().A04).getApplicationContext(), R.drawable.vec_ic_more, R.color.f6nameremoved));
        this.A00.setVisible(false);
        List list = this.A01;
        if (list != null && !list.isEmpty() && (menuItem = this.A00) != null) {
            menuItem.setVisible(true);
        }
    }

    public AnonymousClass5Op(C18820ts r1, C159757js r2) {
        super(r1);
        this.A02 = r2;
    }
}
