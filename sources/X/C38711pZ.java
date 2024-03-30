package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1pZ  reason: invalid class name and case insensitive filesystem */
public class C38711pZ extends LinearLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;

    public void onMeasure(int i, int i2) {
        this.A03 = true;
        TextEmojiLabel textEmojiLabel = this.A08;
        measureChild(textEmojiLabel, i, i2);
        setupTitleAndDescriptionMaxLines(C36371kC.A0u(textEmojiLabel));
        super.onMeasure(i, i2);
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel.getPaint().measureText(str) > ((float) textEmojiLabel.getMeasuredWidth())) {
            textEmojiLabel.setMaxLines(2);
            this.A06.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A06.setMaxLines(2);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A07;
        textEmojiLabel.setVisibility(C36381kD.A00(TextUtils.isEmpty(str) ? 1 : 0));
        if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.A0I(C65783Tl.A02(getContext(), this.A00, str, list));
        }
    }

    public void setTitleAndDescription(String str, String str2, List list) {
        TextEmojiLabel textEmojiLabel;
        int i;
        CharSequence charSequence;
        TextEmojiLabel textEmojiLabel2 = this.A06;
        boolean z = false;
        textEmojiLabel2.setVisibility(C36381kD.A00(TextUtils.isEmpty(str2) ? 1 : 0));
        if (this.A03 || this.A08.getMeasuredWidth() != 0) {
            z = true;
        }
        this.A03 = z;
        if (z) {
            setupTitleAndDescriptionMaxLines(str);
        }
        if (list == null || list.isEmpty()) {
            textEmojiLabel = this.A08;
            i = this.A05;
        } else {
            textEmojiLabel = this.A08;
            i = this.A04;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        C18820ts r1 = this.A00;
        textEmojiLabel.A0I(C65783Tl.A02(context, r1, str, list));
        if (str2 != null) {
            charSequence = C65783Tl.A02(getContext(), r1, str2, list);
        } else {
            charSequence = "";
        }
        textEmojiLabel2.A0I(charSequence);
    }

    public C38711pZ(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        this.A03 = false;
        setOrientation(1);
        setGravity(16);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.file_attachment_metadata_title);
        this.A08 = A0O;
        this.A06 = C36401kF.A0O(this, R.id.file_attachment_metadata_description);
        this.A07 = C36401kF.A0O(this, R.id.file_attachment_metadata_subtext);
        this.A04 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A05 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        C33511fU.A03(A0O);
    }
}
