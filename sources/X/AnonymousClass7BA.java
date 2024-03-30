package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0, 0, 0, 0, 0}, l = {169}, m = "checkDefaultMediaBuckets", n = {"this", "collector", "cameraMediaListCounts", "$this$forEach$iv", "includeMediaTypes"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
/* renamed from: X.7BA  reason: invalid class name */
public final class AnonymousClass7BA extends AnonymousClass0A0 {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7BA(GalleryPickerViewModel galleryPickerViewModel, C023509x r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A03((GalleryPickerViewModel.BucketsCollector) null, this.this$0, this, 0);
    }
}
