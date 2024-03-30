package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import java.util.List;

/* renamed from: X.1nH  reason: invalid class name and case insensitive filesystem */
public class C37831nH extends ArrayAdapter {
    public final /* synthetic */ ListChatInfoActivity A00;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C603537n r0;
        TextEmojiLabel textEmojiLabel;
        String str;
        if (view == null) {
            int itemViewType = getItemViewType(i);
            int i2 = R.layout.f9nameremoved;
            if (itemViewType == 0) {
                i2 = R.layout.f9nameremoved;
            }
            ListChatInfoActivity listChatInfoActivity = this.A00;
            view = listChatInfoActivity.getLayoutInflater().inflate(i2, viewGroup, false);
            r0 = new C603537n();
            r0.A01 = AnonymousClass3SF.A01(view, listChatInfoActivity.A06, R.id.name);
            r0.A00 = C36401kF.A0P(view, R.id.status);
            r0.A02 = C36391kE.A0N(view, R.id.avatar);
            view.setTag(r0);
        } else {
            r0 = (C603537n) view.getTag();
        }
        Object item = getItem(i);
        C18740tg.A06(item);
        AnonymousClass141 r3 = (AnonymousClass141) item;
        r0.A03 = r3;
        r0.A01.A05(r3);
        ImageView imageView = r0.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36401kF.A0o(new AnonymousClass3CG(getContext()).A00, R.string.f12nameremoved));
        C011004s.A08(imageView, AnonymousClass000.A0q(AnonymousClass143.A03(r3.A0H), A0u));
        ListChatInfoActivity listChatInfoActivity2 = this.A00;
        listChatInfoActivity2.A0D.A08(r0.A02, r3);
        C48932iI.A00(r0.A02, r3, this, r0, 6);
        if (listChatInfoActivity2.A0B.A0g(r3, -1)) {
            r0.A00.setVisibility(0);
            textEmojiLabel = r0.A00;
            str = AnonymousClass171.A03(listChatInfoActivity2.A0B, r3, R.string.f12nameremoved);
        } else {
            String str2 = r3.A0X;
            TextEmojiLabel textEmojiLabel2 = r0.A00;
            if (str2 != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel = r0.A00;
                str = r3.A0X;
            } else {
                textEmojiLabel2.setVisibility(8);
                return view;
            }
        }
        textEmojiLabel.A0I(str);
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37831nH(Context context, ListChatInfoActivity listChatInfoActivity, List list) {
        super(context, 0, list);
        this.A00 = listChatInfoActivity;
    }

    public int getCount() {
        return this.A00.A0h.size();
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        AnonymousClass171 r1 = this.A00.A0B;
        C18740tg.A06(item);
        return r1.A0g((AnonymousClass141) item, -1) ? 1 : 0;
    }
}
