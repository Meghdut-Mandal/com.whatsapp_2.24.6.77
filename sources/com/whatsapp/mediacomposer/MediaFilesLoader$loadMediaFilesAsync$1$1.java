package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass6LY;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import X.C10790fE;
import X.C121725tc;
import X.C28201Rs;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.MediaFilesLoader$loadMediaFilesAsync$1$1", f = "MediaFilesLoader.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class MediaFilesLoader$loadMediaFilesAsync$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10790fE $filesToLoad;
    public final /* synthetic */ C121725tc $result;
    public final /* synthetic */ C28201Rs $resultEvent;
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ AnonymousClass6LY this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.MediaFilesLoader$loadMediaFilesAsync$1$1$1", f = "MediaFilesLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.MediaFilesLoader$loadMediaFilesAsync$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r9) {
            AnonymousClass6LY r3 = r6;
            C121725tc r2 = r5;
            return new AnonymousClass1(uri, r2, r3, r7, r9, r9);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AJ r0;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass6LY.A00(uri, r5, r6);
                C121725tc r3 = r5;
                C10790fE r2 = r9;
                C28201Rs r1 = r7;
                synchronized (r3) {
                    int i = r2.element - 1;
                    r2.element = i;
                    if (i == 0) {
                        r1.A0C(r3);
                    }
                    r0 = AnonymousClass0AJ.A00;
                }
                return r0;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaFilesLoader$loadMediaFilesAsync$1$1(Uri uri, C121725tc r3, AnonymousClass6LY r4, C28201Rs r5, C023509x r6, C10790fE r7) {
        super(2, r6);
        this.this$0 = r4;
        this.$result = r3;
        this.$uri = uri;
        this.$filesToLoad = r7;
        this.$resultEvent = r5;
    }

    public final C023509x create(Object obj, C023509x r9) {
        AnonymousClass6LY r3 = this.this$0;
        C121725tc r2 = this.$result;
        return new MediaFilesLoader$loadMediaFilesAsync$1$1(this.$uri, r2, r3, this.$resultEvent, r9, this.$filesToLoad);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C005602m r0 = AnonymousClass19R.A01;
            final AnonymousClass6LY r6 = this.this$0;
            final C121725tc r5 = this.$result;
            final Uri uri = this.$uri;
            final C10790fE r9 = this.$filesToLoad;
            final C28201Rs r7 = this.$resultEvent;
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
        return ((MediaFilesLoader$loadMediaFilesAsync$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
