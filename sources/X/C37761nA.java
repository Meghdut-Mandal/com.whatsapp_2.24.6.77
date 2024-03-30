package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.1nA  reason: invalid class name and case insensitive filesystem */
public class C37761nA extends ArrayAdapter {
    public final /* synthetic */ PhoneContactsSelector A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37761nA(Context context, PhoneContactsSelector phoneContactsSelector, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A00 = phoneContactsSelector;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C604237u r0;
        Object item = getItem(i);
        C18740tg.A06(item);
        C62583Gs r6 = (C62583Gs) item;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, false);
            r0 = new C604237u(view);
            view.setTag(r0);
        } else {
            r0 = (C604237u) view.getTag();
        }
        PhoneContactsSelector phoneContactsSelector = this.A00;
        AnonymousClass1Pp r3 = phoneContactsSelector.A0A;
        ImageView imageView = r0.A00;
        r3.A06(imageView, R.drawable.avatar_contact);
        phoneContactsSelector.A0D.A05(imageView, r6);
        r0.A01.A0J(r6.A06, phoneContactsSelector.A0Y, 0, false);
        SelectionCheckView selectionCheckView = r0.A03;
        selectionCheckView.A04(r6.A03, false);
        selectionCheckView.setTag(r6);
        return view;
    }
}
