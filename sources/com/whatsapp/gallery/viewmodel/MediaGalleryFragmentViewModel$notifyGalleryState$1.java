package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C54362sp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$notifyGalleryState$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$notifyGalleryState$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C54362sp $state;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$notifyGalleryState$1$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$notifyGalleryState$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r2, mediaGalleryFragmentViewModel, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                mediaGalleryFragmentViewModel.A04.A0D(r2);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$notifyGalleryState$1(C54362sp r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$state = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new MediaGalleryFragmentViewModel$notifyGalleryState$1(this.$state, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            C005502l r3 = mediaGalleryFragmentViewModel.A09;
            final C54362sp r2 = this.$state;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r6) {
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
        return ((MediaGalleryFragmentViewModel$notifyGalleryState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
