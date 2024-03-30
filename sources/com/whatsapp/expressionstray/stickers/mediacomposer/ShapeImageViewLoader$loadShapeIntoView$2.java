package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6BO;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShapeIntoView$2", f = "ShapeImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShapeIntoView$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10810fG $cachedDrawable;
    public final /* synthetic */ AnonymousClass6BO $task;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShapeIntoView$2(AnonymousClass6BO r2, C023509x r3, C10810fG r4) {
        super(2, r3);
        this.$task = r2;
        this.$cachedDrawable = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ShapeImageViewLoader$loadShapeIntoView$2(this.$task, r5, this.$cachedDrawable);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.$task.A00.setImageDrawable((Drawable) this.$cachedDrawable.element);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShapeImageViewLoader$loadShapeIntoView$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
