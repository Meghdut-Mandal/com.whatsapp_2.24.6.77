package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.1nT  reason: invalid class name and case insensitive filesystem */
public class C37951nT extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public boolean hasStableIds() {
        return true;
    }

    public C37951nT(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public int getCount() {
        return this.A00.A0E.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.A0E.get(i);
    }

    public long getItemId(int i) {
        return ((AnonymousClass141) C36421kH.A0Y(this.A00.A0E, i)).A0I();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass38W r0;
        if (view == null) {
            view = C36361kB.A0E(this.A00.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
            r0 = new AnonymousClass38W();
            r0.A02 = C36401kF.A0P(view, R.id.name);
            r0.A01 = C36391kE.A0P(view, R.id.time_left);
            r0.A00 = C36391kE.A0N(view, R.id.avatar);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass38W) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        AnonymousClass141 r5 = (AnonymousClass141) C36421kH.A0Y(liveLocationPrivacyActivity.A0E, i);
        if (r5 != null) {
            long A08 = C36431kI.A08(liveLocationPrivacyActivity);
            long A0H = liveLocationPrivacyActivity.A07.A0H(C36331k8.A0G(r5));
            r0.A03 = r5;
            r0.A01.setText(AnonymousClass3UY.A0C(liveLocationPrivacyActivity.A00, A0H - A08));
            r0.A02.setText(liveLocationPrivacyActivity.A00.A0G(liveLocationPrivacyActivity.A02.A0H(r5)));
            C011504z.A06(r0.A00, 2);
            liveLocationPrivacyActivity.A03.A08(r0.A00, r0.A03);
        }
        return view;
    }
}
