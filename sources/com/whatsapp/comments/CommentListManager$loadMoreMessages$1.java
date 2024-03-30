package com.whatsapp.comments;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36351kA;
import X.C65513Sj;
import X.C86644Ls;
import java.util.SortedSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.comments.CommentListManager$loadMoreMessages$1", f = "CommentListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentListManager$loadMoreMessages$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C65513Sj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentListManager$loadMoreMessages$1(C65513Sj r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommentListManager$loadMoreMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentListManager$loadMoreMessages$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        SortedSet sortedSet;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C65513Sj r4 = this.this$0;
            AnonymousClass05L r3 = r4.A0A;
            do {
                value = r3.getValue();
                sortedSet = (SortedSet) value;
            } while (!C36351kA.A1a(value, sortedSet, new C86644Ls(r4, sortedSet), r3));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
