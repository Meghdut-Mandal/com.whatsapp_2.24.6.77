package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C009003v;
import X.C05250Oz;
import X.C137076fY;
import X.C161547n5;
import X.C36381kD;
import X.C36391kE;
import X.C92424dv;
import X.C93994hT;
import android.content.Context;
import android.util.AttributeSet;

public final class ComposeView extends C92424dv {
    public boolean A00;
    public final C161547n5 A01;

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(C009003v r2) {
        this.A00 = true;
        this.A01.setValue(r2);
        if (!isAttachedToWindow()) {
            return;
        }
        if (this.A01 != null || isAttachedToWindow()) {
            C92424dv.A01(this);
            return;
        }
        throw AnonymousClass001.A09("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = C93994hT.A00(C137076fY.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public CharSequence getAccessibilityClassName() {
        return AnonymousClass000.A0k(this);
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
