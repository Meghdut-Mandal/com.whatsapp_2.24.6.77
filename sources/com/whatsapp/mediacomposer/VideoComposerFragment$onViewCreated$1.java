package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass17Y;
import X.AnonymousClass19R;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import X.C1503474x;
import X.C36321k7;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.VideoComposerFragment$onViewCreated$1", f = "VideoComposerFragment.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class VideoComposerFragment$onViewCreated$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Bundle $savedInstanceState;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ VideoComposerFragment this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.VideoComposerFragment$onViewCreated$1$1", f = "VideoComposerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.VideoComposerFragment$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            VideoComposerFragment videoComposerFragment = videoComposerFragment;
            return new AnonymousClass1(uri, bundle, view, videoComposerFragment, r8);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                VideoComposerFragment videoComposerFragment = videoComposerFragment;
                VideoComposerFragment.A06(uri, videoComposerFragment, videoComposerFragment.A0M);
                VideoComposerFragment videoComposerFragment2 = videoComposerFragment;
                AnonymousClass17Y r0 = videoComposerFragment2.A02;
                if (r0 != null) {
                    r0.A0H(new C1503474x((Object) bundle, (Object) videoComposerFragment2, (Object) view, (Object) uri, 48));
                    return AnonymousClass0AJ.A00;
                }
                throw C36321k7.A06();
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoComposerFragment$onViewCreated$1(Uri uri, Bundle bundle, View view, VideoComposerFragment videoComposerFragment, C023509x r6) {
        super(2, r6);
        this.this$0 = videoComposerFragment;
        this.$uri = uri;
        this.$view = view;
        this.$savedInstanceState = bundle;
    }

    public final C023509x create(Object obj, C023509x r8) {
        VideoComposerFragment videoComposerFragment = this.this$0;
        return new VideoComposerFragment$onViewCreated$1(this.$uri, this.$savedInstanceState, this.$view, videoComposerFragment, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C005602m r0 = AnonymousClass19R.A01;
            final VideoComposerFragment videoComposerFragment = this.this$0;
            final Uri uri = this.$uri;
            final View view = this.$view;
            final Bundle bundle = this.$savedInstanceState;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VideoComposerFragment$onViewCreated$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
