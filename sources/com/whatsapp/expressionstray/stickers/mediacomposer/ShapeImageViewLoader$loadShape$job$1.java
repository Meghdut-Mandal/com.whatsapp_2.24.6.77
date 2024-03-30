package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5CX;
import X.AnonymousClass5CZ;
import X.AnonymousClass6BO;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import X.C123795x6;
import X.C1275468s;
import X.C129196Ft;
import X.C36421kH;
import X.C36441kJ;
import X.C90524aI;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1", f = "ShapeImageViewLoader.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShape$job$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6BO $task;
    public int label;
    public final /* synthetic */ C123795x6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShape$job$1(AnonymousClass6BO r2, C123795x6 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$task = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ShapeImageViewLoader$loadShape$job$1(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        float f;
        float f2;
        float f3;
        float f4;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C123795x6 r1 = this.this$0;
            AnonymousClass6BO r5 = this.$task;
            this.label = 1;
            C1275468s r2 = r5.A01;
            ImageView imageView = r5.A00;
            if (AnonymousClass00C.A0J(r2, imageView.getTag())) {
                C129196Ft r9 = r5.A02;
                C10810fG r3 = new C10810fG();
                if (r9 instanceof AnonymousClass5CZ) {
                    drawable = ((AnonymousClass5CZ) r9).A00;
                } else if (r9 instanceof AnonymousClass5CX) {
                    drawable = ((AnonymousClass5CX) r9).A00;
                } else {
                    drawable = null;
                }
                r3.element = drawable;
                Context context = r1.A01;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                if (r3.element == null) {
                    boolean A0O = r9.A0O();
                    RectF A0N = C36441kJ.A0N();
                    if (A0O) {
                        f = r9.A08();
                        f3 = r9.A08();
                        float f5 = (float) dimensionPixelSize;
                        f2 = f5 - r9.A08();
                        f4 = f5 - r9.A08();
                    } else {
                        f = 0.0f;
                        f2 = (float) dimensionPixelSize;
                        f3 = 0.0f;
                        f4 = f2;
                    }
                    r9.A0J(A0N, f, f3, f2, f4);
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    AnonymousClass00C.A08(createBitmap);
                    r9.A0I(C90524aI.A0A(createBitmap));
                    r3.element = C36421kH.A0C(context, createBitmap);
                }
                if (AnonymousClass00C.A0J(r2, imageView.getTag()) && AnonymousClass0A2.A00(this, r1.A05, new ShapeImageViewLoader$loadShapeIntoView$2(r5, (C023509x) null, r3)) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShapeImageViewLoader$loadShape$job$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
