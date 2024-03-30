package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.1nK  reason: invalid class name and case insensitive filesystem */
public class C37861nK extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass27v A00;

    private AnonymousClass00I A00(View view, ViewGroup viewGroup, AnonymousClass2Gj r6) {
        C62463Gg r0;
        if (view == null) {
            AnonymousClass27v r2 = this.A00;
            view = C36361kB.A0E(r2.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
            r0 = new C62463Gg(view, r2.A05);
            view.setTag(r0);
        } else {
            r0 = (C62463Gg) view.getTag();
        }
        this.A00.A3v(r0, r6.A00);
        return C36441kJ.A0W(view, r0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37861nK(Context context, AnonymousClass27v r3, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A00 = r3;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        C18740tg.A06(item);
        AnonymousClass3BW r1 = (AnonymousClass3BW) item;
        if (r1 instanceof C43302Gi) {
            return 0;
        }
        if (r1 instanceof AnonymousClass2Gf) {
            return 1;
        }
        if (r1 instanceof C43282Gg) {
            return 2;
        }
        return 3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass34B r0;
        String lowerCase;
        AnonymousClass391 r02;
        AnonymousClass00I A0W;
        int itemViewType = getItemViewType(i);
        AnonymousClass3BW r5 = (AnonymousClass3BW) getItem(i);
        if (itemViewType == 0) {
            if (view == null) {
                AnonymousClass27v r2 = this.A00;
                view = C36361kB.A0E(r2.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
                C011504z.A06(view, 2);
                r0 = new AnonymousClass34B(C36411kG.A0Z(view, R.id.title), r2);
                view.setTag(r0);
            } else {
                r0 = (AnonymousClass34B) view.getTag();
            }
            WaTextView waTextView = r0.A00;
            C33511fU.A03(waTextView);
            waTextView.setText(((C43302Gi) r5).A00);
            return view;
        } else if (itemViewType != 2) {
            if (itemViewType != 3) {
                A0W = A00(view, viewGroup, (AnonymousClass2Gj) r5);
            } else {
                AnonymousClass27v r4 = this.A00;
                C43292Gh r52 = (C43292Gh) r5;
                if (view == null) {
                    view = C36361kB.A0E(r4.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
                    r02 = new AnonymousClass391(view, r4.A05);
                    view.setTag(r02);
                } else {
                    r02 = (AnonymousClass391) view.getTag();
                }
                List list = r52.A00;
                r02.A03.A08((AnonymousClass141) C36391kE.A0t(list), r4.A0O);
                TextEmojiLabel textEmojiLabel = r02.A02;
                if (!TextUtils.isEmpty(textEmojiLabel.getText())) {
                    r02.A01.setContentDescription(textEmojiLabel.getText());
                }
                C67113Yo.A00(r02.A00, r4, list, r02, 29);
                if (r4.A0D.A07(6739) == 1) {
                    WDSButton wDSButton = r02.A04;
                    wDSButton.setVariant(C27981Qp.OUTLINE);
                    wDSButton.setSize(C34271gk.SMALL);
                }
                A0W = C36441kJ.A0W(view, r02);
            }
            return (View) A0W.A00;
        } else {
            AnonymousClass00I A002 = A00(view, viewGroup, (AnonymousClass2Gj) r5);
            View view2 = (View) A002.A00;
            AnonymousClass27v r3 = this.A00;
            C62463Gg r8 = (C62463Gg) A002.A01;
            C43282Gg r53 = (C43282Gg) r5;
            if (r53.A00) {
                AnonymousClass141 r22 = r53.A00;
                String A02 = AnonymousClass171.A02(r3, r3.A0I, r22);
                String A04 = AnonymousClass3U8.A04(C36351kA.A0j(r22));
                if (!TextUtils.isEmpty(A04)) {
                    if (TextUtils.isEmpty(A02)) {
                        lowerCase = "";
                    } else {
                        lowerCase = A02.toLowerCase(C36401kF.A0x(r3.A0I));
                    }
                    TextEmojiLabel textEmojiLabel2 = r8.A02;
                    textEmojiLabel2.setVisibility(0);
                    Resources resources = r3.getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = lowerCase;
                    textEmojiLabel2.A0I(C36411kG.A0w(resources, A04, objArr, 1, R.string.f12nameremoved));
                    return view2;
                }
            }
            r8.A02.setVisibility(8);
            return view2;
        }
    }

    public int getViewTypeCount() {
        return 4;
    }
}
