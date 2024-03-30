package com.whatsapp.calling;

import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RY;
import X.AnonymousClass3U5;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C27731Pn;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C88514Sz;
import X.C95724mA;
import X.C96114mo;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class PeerAvatarLayout extends RecyclerView implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C96114mo A05;
    public AnonymousClass1Pp A06;
    public C88514Sz A07;
    public AnonymousClass1RY A08;
    public C27731Pn A09;
    public C18820ts A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;

    public void A16(List list) {
        C96114mo r2 = this.A05;
        List list2 = r2.A00;
        if (!list.equals(list2)) {
            list2.clear();
            list2.addAll(list);
            r2.A06();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A06 = C36361kB.A0V(A0W);
            this.A09 = C36351kA.A0T(A0W);
            this.A0A = C36341k9.A0T(A0W);
        }
        this.A05 = new C96114mo(this);
        C95724mA r1 = new C95724mA();
        r1.A1f(0);
        setLayoutManager(r1);
        setAdapter(this.A05);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = new AnonymousClass3U5(this.A06, 1);
        C27731Pn r3 = this.A09;
        Resources resources = getResources();
        int i2 = this.A04;
        this.A08 = r3.A06("peer-avatar-photo", 0.0f, resources.getDimensionPixelSize(i2 == 0 ? R.dimen.f7nameremoved : i2));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1RY r0 = this.A08;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setFixedContactPhotoSizeRes(int i) {
        this.A04 = i;
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PeerAvatarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
