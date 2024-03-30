package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1nP  reason: invalid class name and case insensitive filesystem */
public final class C37911nP extends BaseAdapter {
    public final List A00 = AnonymousClass001.A0I();
    public final C006302t A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        AnonymousClass00C.A0D(viewGroup, 2);
        if (!(view == null && (view = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved)) == null)) {
            TextView A0M = C36341k9.A0M(view, R.id.sticker_info_button);
            switch (((C52042on) this.A00.get(i)).ordinal()) {
                case 0:
                    i2 = R.string.f12nameremoved;
                    break;
                case 1:
                    i2 = R.string.f12nameremoved;
                    break;
                case 2:
                case 6:
                    i2 = R.string.f12nameremoved;
                    break;
                case 3:
                    i2 = R.string.f12nameremoved;
                    break;
                case 4:
                    i2 = R.string.f12nameremoved;
                    break;
                case 5:
                    i2 = R.string.f12nameremoved;
                    break;
                case 7:
                    i2 = R.string.f12nameremoved;
                    break;
                case 8:
                    i2 = R.string.f12nameremoved;
                    break;
                case 9:
                    i2 = R.string.f12nameremoved;
                    break;
                case 10:
                    i2 = R.string.f12nameremoved;
                    break;
                default:
                    throw C36441kJ.A18();
            }
            A0M.setText(i2);
            C67143Yr.A00(A0M, this, i, 25);
        }
        return view;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public C37911nP(C006302t r2) {
        this.A01 = r2;
    }
}
