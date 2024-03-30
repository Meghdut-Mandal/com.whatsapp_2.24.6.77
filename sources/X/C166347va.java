package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7va  reason: invalid class name and case insensitive filesystem */
public class C166347va extends BaseAdapter {
    public final Context A00;
    public final C180038l6 A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.A01.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        AnonymousClass9NI r5 = (AnonymousClass9NI) this.A01.A00.get(i);
        ImageView A0G = C36401kF.A0G(inflate, R.id.status_icon);
        A0G.setColorFilter(context.getResources().getColor(r5.A00), PorterDuff.Mode.SRC_IN);
        A0G.setImageResource(r5.A01);
        TextView A0O = C36391kE.A0O(inflate, R.id.transaction_status);
        A0O.setText(r5.A05);
        int i2 = r5.A03;
        if (i2 == R.color.f6nameremoved) {
            i2 = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        C36351kA.A15(context.getResources(), A0O, i2);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.status_subtitle);
        A0O2.setText(r5.A04);
        C36351kA.A15(context.getResources(), A0O2, r5.A02);
        View A02 = C012005e.A02(inflate, R.id.line);
        if (i == getCount() - 1) {
            A02.setVisibility(8);
        }
        return inflate;
    }

    public C166347va(Context context, C180038l6 r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
