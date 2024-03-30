package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.1vk  reason: invalid class name and case insensitive filesystem */
public final class C40561vk extends AnonymousClass0CZ {
    public final AnonymousClass171 A00;
    public final /* synthetic */ SelectedContactsList A01;

    public C40561vk(AnonymousClass171 r1, SelectedContactsList selectedContactsList) {
        this.A01 = selectedContactsList;
        this.A00 = r1;
    }

    public int A0J() {
        return this.A01.A09.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42141yL r82 = (C42141yL) r8;
        SelectedContactsList selectedContactsList = this.A01;
        AnonymousClass141 r6 = (AnonymousClass141) selectedContactsList.A09.get(i);
        TextView textView = r82.A01;
        AnonymousClass171 r5 = this.A00;
        textView.setText(C36381kD.A0v(r5, r6));
        selectedContactsList.A08.B5h(r82.A02, r6, false);
        View view = r82.A00;
        C67113Yo.A00(view, this, r6, r82, 30);
        Resources resources = view.getResources();
        Object[] A0L = AnonymousClass001.A0L();
        C36361kB.A1F(r5, r6, A0L, 0);
        view.setContentDescription(resources.getString(R.string.f12nameremoved, A0L));
        C33521fV.A03(view, R.string.f12nameremoved);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42141yL(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, this.A01.getSelectedContactsLayout()));
    }
}
