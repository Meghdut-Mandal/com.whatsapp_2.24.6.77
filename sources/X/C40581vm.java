package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vm  reason: invalid class name and case insensitive filesystem */
public class C40581vm extends AnonymousClass0CZ {
    public ArrayList A00;
    public List A01 = AnonymousClass001.A0I();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public C40581vm(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42341yf r82 = (C42341yf) r8;
        AnonymousClass141 r4 = (AnonymousClass141) this.A01.get(i);
        r82.A01.setVisibility(8);
        r82.A04.A08(r4, this.A00);
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        groupAdminPickerActivity.A09.A08(r82.A00, r4);
        if (!groupAdminPickerActivity.A08.A0g(r4, -1) || r4.A0a == null) {
            r82.A02.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel = r82.A02;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0J(AnonymousClass171.A03(groupAdminPickerActivity.A08, r4, R.string.f12nameremoved), this.A00, 0, false);
        }
        String str = r4.A0X;
        TextEmojiLabel textEmojiLabel2 = r82.A03;
        if (str != null) {
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A0I(r4.A0X);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        r82.A0H.setTag(C36431kI.A0h(r4));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        List list = AnonymousClass0D3.A0I;
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new C42341yf(C36361kB.A0E(groupAdminPickerActivity.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), groupAdminPickerActivity);
    }
}
