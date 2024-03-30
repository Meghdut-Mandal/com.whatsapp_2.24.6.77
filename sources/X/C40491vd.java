package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.1vd  reason: invalid class name and case insensitive filesystem */
public final class C40491vd extends AnonymousClass0CZ {
    public final /* synthetic */ PhoneContactsSelector A00;

    public C40491vd(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    public int A0J() {
        return this.A00.A0i.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        C42141yL r62 = (C42141yL) r6;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C62583Gs r3 = (C62583Gs) phoneContactsSelector.A0i.get(i);
        String str = r3.A05;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = r62.A01;
        if (!isEmpty) {
            textView.setText(str);
        } else {
            textView.setText(r3.A06);
        }
        ThumbnailButton thumbnailButton = r62.A02;
        phoneContactsSelector.A0A.A06(thumbnailButton, R.drawable.avatar_contact);
        phoneContactsSelector.A0D.A05(thumbnailButton, r3);
        AnonymousClass3YE.A00(r62.A00, this, r3, 44);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42141yL(C36361kB.A0E(this.A00.getLayoutInflater(), viewGroup, R.layout.f9nameremoved));
    }
}
