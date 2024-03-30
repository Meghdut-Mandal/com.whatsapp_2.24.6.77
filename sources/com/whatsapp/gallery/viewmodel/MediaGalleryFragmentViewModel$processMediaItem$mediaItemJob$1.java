package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2U2;
import X.C009003v;
import X.C023509x;
import X.C36351kA;
import X.C88924Uo;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C88924Uo $mediaList;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1(C88924Uo r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C023509x r4, int i) {
        super(2, r4);
        this.$mediaList = r2;
        this.$position = i;
        this.this$0 = mediaGalleryFragmentViewModel;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1(this.$mediaList, this.this$0, r6, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C88924Uo r1 = this.$mediaList;
                if (!(r1 == null || r1.BmQ(this.$position) == null)) {
                    MediaGalleryFragmentViewModel.A01(new AnonymousClass2U2(this.$position), this.this$0);
                }
            } catch (CancellationException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MediaGalleryFragmentViewModel/CancellationException/processMediaItem/position = ");
                A0u.append(this.$position);
                C36351kA.A1Q("/error", A0u, e);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
