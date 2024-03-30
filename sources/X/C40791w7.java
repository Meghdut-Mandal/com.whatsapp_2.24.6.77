package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1w7  reason: invalid class name and case insensitive filesystem */
public class C40791w7 extends AnonymousClass0CZ {
    public int A00 = -1;
    public AnonymousClass34M A01;
    public final List A02 = AnonymousClass001.A0I();

    public int A0J() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        View view;
        C41781xl r82 = (C41781xl) r8;
        C64193Na r1 = (C64193Na) this.A02.get(i);
        if (getItemViewType(i) == 0) {
            C43932Km r83 = (C43932Km) r82;
            String str = r1.A02;
            boolean isEmpty = TextUtils.isEmpty(str);
            View view2 = r83.A0H;
            if (isEmpty) {
                view2.setVisibility(8);
                return;
            }
            view2.setVisibility(0);
            r83.A00.A0I(str);
            return;
        }
        C206729ts r6 = r1.A00;
        C43942Kn r84 = (C43942Kn) r82;
        String str2 = r1.A01;
        if (r6 == null) {
            view = r84.A0H;
        } else {
            r84.A00.setChecked(AnonymousClass000.A1S(r84.A04(), r84.A05.A00));
            r84.A0H.setVisibility(0);
            String str3 = r6.A01;
            boolean isEmpty2 = TextUtils.isEmpty(str3);
            TextEmojiLabel textEmojiLabel = r84.A02;
            if (isEmpty2) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.A0I(str3);
                textEmojiLabel.setVisibility(0);
            }
            r84.A04.A0I(r6.A03);
            String str4 = r6.A00;
            boolean isEmpty3 = TextUtils.isEmpty(str4);
            TextEmojiLabel textEmojiLabel2 = r84.A01;
            if (isEmpty3) {
                textEmojiLabel2.setVisibility(8);
            } else {
                textEmojiLabel2.A0I(str4);
                textEmojiLabel2.setVisibility(0);
            }
            boolean isEmpty4 = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel3 = r84.A03;
            view = textEmojiLabel3;
            if (!isEmpty4) {
                textEmojiLabel3.A0I(str2);
                textEmojiLabel3.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public int getItemViewType(int i) {
        return C36421kH.A1a(((C64193Na) this.A02.get(i)).A02) ^ true ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        List list = AnonymousClass0D3.A0I;
        if (i == 0) {
            return new C43932Km(A0C.inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        return new C43942Kn(A0C.inflate(R.layout.f9nameremoved, viewGroup, false), this);
    }
}
