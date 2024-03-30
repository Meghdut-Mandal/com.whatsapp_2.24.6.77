package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7vb  reason: invalid class name and case insensitive filesystem */
public class C166357vb extends BaseAdapter {
    public List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ C173788Ta A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public C166357vb(C173788Ta r2) {
        this.A01 = r2;
    }

    public static void A00(C166357vb r1, SelectionCheckView selectionCheckView, boolean z) {
        int i;
        C173788Ta r12 = r1.A01;
        if (r12.A0K) {
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
        }
        C36331k8.A0q(r12, selectionCheckView, i);
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass9LY r0;
        AnonymousClass141 r7 = (AnonymousClass141) this.A00.get(i);
        if (view == null) {
            C173788Ta r2 = this.A01;
            view = r2.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
            r0 = new AnonymousClass9LY();
            view.setTag(r0);
            r0.A00 = C36391kE.A0N(view, R.id.contactpicker_row_photo);
            r0.A01 = AnonymousClass3SF.A01(view, r2.A04, R.id.contactpicker_row_name);
            r0.A02 = (SelectionCheckView) view.findViewById(R.id.selection_check);
            C33511fU.A03(r0.A01.A01);
        } else {
            r0 = (AnonymousClass9LY) view.getTag();
        }
        view.setClickable(false);
        view.setLongClickable(false);
        Class<UserJid> cls = UserJid.class;
        Jid A06 = r7.A06(cls);
        C18740tg.A06(A06);
        r0.A03 = (UserJid) A06;
        C173788Ta r5 = this.A01;
        r5.A0B.A08(r0.A00, r7);
        C011504z.A06(r0.A00, 2);
        r0.A01.A08(r7, r5.A0H);
        boolean contains = r5.A0S.contains(r7.A06(cls));
        boolean z = r5.A0K;
        SelectionCheckView selectionCheckView = r0.A02;
        int i2 = R.drawable.teal_circle;
        if (z) {
            i2 = R.drawable.red_circle;
        }
        selectionCheckView.setSelectionBackground(i2);
        if (r5.A0R.remove(r7.A06(cls))) {
            r0.A02.getViewTreeObserver().addOnPreDrawListener(new C207439vD(this, r0, contains));
        } else {
            boolean A0O = r5.A05.A0O((UserJid) r7.A06(cls));
            SelectionCheckView selectionCheckView2 = r0.A02;
            if (A0O) {
                selectionCheckView2.A04(r5.A0K, false);
                C36331k8.A0q(r5, r0.A02, R.string.f12nameremoved);
                view.setAlpha(0.5f);
                return view;
            }
            selectionCheckView2.A04(contains, false);
            A00(this, r0.A02, contains);
        }
        view.setAlpha(1.0f);
        return view;
    }
}
