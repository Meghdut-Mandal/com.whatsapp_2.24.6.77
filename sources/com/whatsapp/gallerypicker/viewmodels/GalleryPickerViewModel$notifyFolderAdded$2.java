package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass59G;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2", f = "GalleryPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryPickerViewModel$notifyFolderAdded$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $galleryFolders;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$notifyFolderAdded$2(GalleryPickerViewModel galleryPickerViewModel, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = galleryPickerViewModel;
        this.$galleryFolders = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GalleryPickerViewModel$notifyFolderAdded$2(this.this$0, this.$galleryFolders, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A01.A0D(new AnonymousClass59G(this.$galleryFolders));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryPickerViewModel$notifyFolderAdded$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
