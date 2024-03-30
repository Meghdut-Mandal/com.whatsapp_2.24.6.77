package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6Y8;
import X.C009003v;
import X.C023509x;
import X.C36441kJ;
import X.C39901uB;
import X.C64793Pl;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$1", f = "CustomStickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CustomStickerViewModel$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C39901uB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStickerViewModel$1(C39901uB r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CustomStickerViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CustomStickerViewModel$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Bitmap A05;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C39901uB r0 = this.this$0;
            Bitmap decodeStream = BitmapFactory.decodeStream(r0.A05.A07(r0.A01, true), (Rect) null, (BitmapFactory.Options) null);
            if (decodeStream != null) {
                C39901uB r5 = this.this$0;
                AnonymousClass05L r4 = r5.A08;
                do {
                    value = r4.getValue();
                    Bitmap A04 = AnonymousClass6Y8.A04(decodeStream, 512, 16);
                    AnonymousClass00C.A08(A04);
                    Context context = r5.A04.A00;
                    A05 = AnonymousClass6Y8.A05(A04, new PorterDuffColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP), C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
                    AnonymousClass00C.A08(A05);
                } while (!r4.B3B(value, new C64793Pl(A05)));
                decodeStream.recycle();
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
