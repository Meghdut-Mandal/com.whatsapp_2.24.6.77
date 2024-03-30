package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.1nN  reason: invalid class name and case insensitive filesystem */
public class C37891nN extends BaseAdapter {
    public SupportTopicsActivity A00;
    public ArrayList A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C602236y r0;
        C66733Xc r5 = (C66733Xc) this.A01.get(i);
        if (view == null) {
            r0 = new C602236y(this);
            view = LayoutInflater.from(this.A00).inflate(R.layout.f9nameremoved, viewGroup, false);
            r0.A01 = C36411kG.A0Z(view, R.id.topic_title);
            r0.A00 = view.findViewById(R.id.topic_divider);
            view.setTag(r0);
        } else {
            r0 = (C602236y) view.getTag();
        }
        WaTextView waTextView = r0.A01;
        waTextView.setText(r5.A03);
        AnonymousClass3YG.A00(waTextView, this, r5, 36);
        if (this.A00.A01 == 2) {
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f);
            waTextView.setPadding(i2, i2, i2, i2);
            r0.A00.setVisibility(0);
            return view;
        }
        r0.A00.setVisibility(8);
        return view;
    }

    public C37891nN(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }
}
