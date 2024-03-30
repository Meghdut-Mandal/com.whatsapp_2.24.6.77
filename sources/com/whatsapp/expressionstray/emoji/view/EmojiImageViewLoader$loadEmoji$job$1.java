package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5TR;
import X.C009003v;
import X.C023509x;
import X.C1270066o;
import X.C1275368r;
import X.C128566Ct;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmoji$job$1", f = "EmojiImageViewLoader.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmoji$job$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C128566Ct $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmoji$job$1(C128566Ct r2, EmojiImageViewLoader emojiImageViewLoader, C023509x r4) {
        super(2, r4);
        this.this$0 = emojiImageViewLoader;
        this.$task = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiImageViewLoader$loadEmoji$job$1(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        View A0Y;
        C1270066o r2;
        int i;
        AnonymousClass5TR r0;
        Object obj3;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            EmojiImageViewLoader emojiImageViewLoader = this.this$0;
            C128566Ct r5 = this.$task;
            this.label = 1;
            Integer num = r5.A03;
            if (num != null) {
                emojiImageViewLoader.A02.A00(num.intValue(), "emoji_image_loader_load_start", (String) null);
            }
            C1275368r r9 = r5.A02;
            WeakReference weakReference = r5.A04;
            View A0Y2 = AnonymousClass000.A0Y(weakReference);
            if (A0Y2 != null) {
                obj2 = A0Y2.getTag();
            } else {
                obj2 = null;
            }
            if (AnonymousClass00C.A0J(r9, obj2) && (A0Y = AnonymousClass000.A0Y(weakReference)) != null) {
                BitmapDrawable A05 = emojiImageViewLoader.A00.A05(A0Y.getResources(), r5.A01, r5.A00);
                if (A05 != null) {
                    View A0Y3 = AnonymousClass000.A0Y(weakReference);
                    if (A0Y3 != null) {
                        obj3 = A0Y3.getTag();
                    } else {
                        obj3 = null;
                    }
                    if (AnonymousClass00C.A0J(r9, obj3)) {
                        if (AnonymousClass0A2.A00(this, emojiImageViewLoader.A05, new EmojiImageViewLoader$loadEmojiIntoView$5(A05, r5, emojiImageViewLoader, (C023509x) null)) == r6) {
                            return r6;
                        }
                    } else if (num != null) {
                        r2 = emojiImageViewLoader.A02;
                        i = num.intValue();
                        r0 = AnonymousClass5TR.CANCEL;
                    }
                } else if (num != null) {
                    r2 = emojiImageViewLoader.A02;
                    i = num.intValue();
                    r0 = AnonymousClass5TR.FAIL;
                }
                r2.A01(r0, i);
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmoji$job$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
