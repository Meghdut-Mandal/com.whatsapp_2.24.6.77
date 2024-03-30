package com.whatsapp.conversation.conversationrow.bot.plugin;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2bV;
import X.AnonymousClass3KQ;
import X.AnonymousClass6Y8;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C130396Kx;
import X.C43532Ij;
import android.graphics.Bitmap;
import com.whatsapp.components.button.ThumbnailButton;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.bot.plugin.ReelCarouselItemView$updateProfilePhotoView$1", f = "ReelCarouselItemView.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class ReelCarouselItemView$updateProfilePhotoView$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bV $message;
    public int label;
    public final /* synthetic */ C43532Ij this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.bot.plugin.ReelCarouselItemView$updateProfilePhotoView$1$1", f = "ReelCarouselItemView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.bot.plugin.ReelCarouselItemView$updateProfilePhotoView$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(bitmap, r2, r32, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                Bitmap bitmap = bitmap;
                ThumbnailButton thumbnailButton = r2.A07;
                if (bitmap != null) {
                    thumbnailButton.setImageBitmap(bitmap);
                    r2.A07.setVisibility(0);
                } else {
                    thumbnailButton.setVisibility(8);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelCarouselItemView$updateProfilePhotoView$1(C43532Ij r2, AnonymousClass2bV r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$message = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ReelCarouselItemView$updateProfilePhotoView$1(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        final Bitmap bitmap;
        String str;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C43532Ij r3 = this.this$0;
            AnonymousClass2bV r0 = this.$message;
            int i2 = r3.A04;
            AnonymousClass3KQ A0N = r0.A0N();
            if (A0N == null || (str = A0N.A03) == null) {
                bitmap = null;
            } else {
                bitmap = AnonymousClass6Y8.A09(new C130396Kx(i2, i2), r3.getFMessageIO().A0O(str)).A02;
            }
            C005502l mainDispatcher = this.this$0.getMainDispatcher();
            final AnonymousClass2bV r32 = this.$message;
            final C43532Ij r2 = this.this$0;
            AnonymousClass1 r02 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, mainDispatcher, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReelCarouselItemView$updateProfilePhotoView$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
