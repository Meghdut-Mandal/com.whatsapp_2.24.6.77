package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import X.C39791tm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class ConversationRowCatalogPreview extends ConstraintLayout implements C18700tb {
    public C39791tm A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowCatalogPreview(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C39791tm getViewModel() {
        return this.A00;
    }

    public final void setViewModel(C39791tm r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCatalogPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public ConversationRowCatalogPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCatalogPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
    }
}
