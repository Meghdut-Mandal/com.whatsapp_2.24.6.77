package com.whatsapp.media.motionphotos;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass6IQ;
import X.AnonymousClass6QO;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import X.C25501Go;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1", f = "MotionPhotosController.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class MotionPhotosController$getMotionPhotos$3$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ File $file;
    public final /* synthetic */ AnonymousClass6QO $it;
    public int label;
    public final /* synthetic */ C25501Go this$0;

    @DebugMetadata(c = "com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1$1", f = "MotionPhotosController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.media.motionphotos.MotionPhotosController$getMotionPhotos$3$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            File file = file;
            return new AnonymousClass1(r2, r3, file, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                if (AnonymousClass6IQ.A00(file)) {
                    r3.A02.add(r2.A0J);
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
    public MotionPhotosController$getMotionPhotos$3$1$1(AnonymousClass6QO r2, C25501Go r3, File file, C023509x r5) {
        super(2, r5);
        this.$file = file;
        this.this$0 = r3;
        this.$it = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        File file = this.$file;
        return new MotionPhotosController$getMotionPhotos$3$1$1(this.$it, this.this$0, file, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C005602m r5 = AnonymousClass19R.A01;
            final File file = this.$file;
            final C25501Go r3 = this.this$0;
            final AnonymousClass6QO r2 = this.$it;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r5, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MotionPhotosController$getMotionPhotos$3$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
