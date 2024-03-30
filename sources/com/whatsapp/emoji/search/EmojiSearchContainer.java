package com.whatsapp.emoji.search;

import X.AnonymousClass1H2;
import X.AnonymousClass1QZ;
import X.AnonymousClass1XN;
import X.AnonymousClass4QX;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19890wg;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C41121we;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;

public class EmojiSearchContainer extends FrameLayout implements C18700tb {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public C18820ts A05;
    public AnonymousClass1XN A06;
    public AnonymousClass1H2 A07;
    public C41121we A08;
    public EmojiSearchProvider A09;
    public AnonymousClass4QX A0A;
    public C19890wg A0B;
    public AnonymousClass1QZ A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;

    public static void A00(EmojiSearchContainer emojiSearchContainer, String str) {
        EmojiSearchProvider emojiSearchProvider = emojiSearchContainer.A09;
        if (emojiSearchProvider != null && emojiSearchProvider.A02) {
            emojiSearchContainer.A02.setVisibility(8);
            emojiSearchContainer.A01.setVisibility(0);
            emojiSearchContainer.A08.A0L(emojiSearchContainer.A09.A02(str));
            emojiSearchContainer.A0D = str;
        }
    }

    public void A01() {
        if (!this.A0F) {
            this.A0F = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A07 = C36351kA.A0e(A0W);
            this.A06 = C36351kA.A0d(A0W);
            this.A05 = C36341k9.A0T(A0W);
            this.A0B = C36351kA.A0m(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiSearchContainer(Context context) {
        super(context);
        A01();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
