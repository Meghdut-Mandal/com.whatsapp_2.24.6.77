package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.7vs  reason: invalid class name and case insensitive filesystem */
public class C166457vs extends LinearLayout implements C18700tb {
    public int A00;
    public int A01;
    public C19700wN A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public C21060yb A05;
    public C18820ts A06;
    public AnonymousClass1H2 A07;
    public C19890wg A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;
    public final C33301f4 A0B;

    public void setMessage(AnonymousClass2bS r9, List list) {
        int i;
        String str;
        if (r9 == null) {
            this.A02.A0E("fmessagepoll-null", "fMessagePoll null on search", true);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (list == null || list.isEmpty()) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        String str2 = r9.A03;
        C18820ts r7 = this.A06;
        CharSequence A022 = C65783Tl.A02(context, r7, str2, list);
        StringBuilder A0u = AnonymousClass000.A0u();
        boolean z = false;
        for (AnonymousClass3PS r1 : r9.A05) {
            if (z) {
                str = ", ";
            } else {
                str = "";
            }
            A0u.append(str);
            A0u.append(r1.A03);
            z = true;
        }
        A00(this.A04, C65783Tl.A02(getContext(), r7, A0u, list), list);
        A00(textEmojiLabel, A022, list);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public C166457vs(Context context, C33301f4 r5) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A02 = C36391kE.A0V(r1);
            this.A07 = C36351kA.A0e(r1);
            this.A05 = C36351kA.A0U(r1);
            this.A06 = C36341k9.A0T(r1);
            this.A08 = C36351kA.A0m(r1);
        }
        this.A0B = r5;
        setOrientation(1);
        setGravity(16);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A03 = C36401kF.A0O(this, R.id.search_row_poll_name);
        this.A04 = C36401kF.A0O(this, R.id.search_row_poll_options);
        C165567td.A0k(context, this);
        this.A00 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A01 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        C33511fU.A03(this.A03);
        this.A03.setMaxLines(2);
        this.A04.setMaxLines(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    private void A00(TextEmojiLabel textEmojiLabel, CharSequence charSequence, List list) {
        Context context = getContext();
        TextPaint paint = textEmojiLabel.getPaint();
        int maxLines = textEmojiLabel.getMaxLines();
        int measuredWidth = ((View) textEmojiLabel.getParent()).getMeasuredWidth();
        CharSequence charSequence2 = charSequence;
        AnonymousClass2LE r3 = new AnonymousClass2LE(context, paint, this.A05, this.A06, this.A07, this.A08, charSequence2, list, maxLines, measuredWidth);
        C23169B8d b8d = new C23169B8d(textEmojiLabel, 1);
        if (charSequence2.length() > 768 || AnonymousClass3TC.A02(charSequence2)) {
            textEmojiLabel.setPlaceholder(80);
            this.A0B.A00(b8d, r3);
            return;
        }
        try {
            b8d.BU2(r3.call());
        } catch (AnonymousClass02S unused) {
        }
    }
}
