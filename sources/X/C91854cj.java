package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.4cj  reason: invalid class name and case insensitive filesystem */
public final class C91854cj extends CharacterStyle implements UpdateAppearance {
    public final C161547n5 A00 = C93994hT.A00(C137076fY.A00, new AnonymousClass6X0(AnonymousClass6X0.A01), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C94474iH A01;
    public final float A02;
    public final C157597dn A03 = new C94014hV((C157587dm) null, new AnonymousClass7JK(this));

    public void updateDrawState(TextPaint textPaint) {
        float f = this.A02;
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(C14960mT.A01(C15040mb.A01(f, 0.0f, 1.0f) * ((float) 255)));
        }
        textPaint.setShader((Shader) this.A03.getValue());
    }

    public C91854cj(C94474iH r5, float f) {
        this.A01 = r5;
        this.A02 = f;
    }
}
