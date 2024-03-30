package com.whatsapp.chatlock.search;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass2Ec;
import X.AnonymousClass3AB;
import X.C001600r;
import X.C009003v;
import X.C023509x;
import X.C36341k9;
import X.C63603Kr;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.search.ChatLockContactSearchManager$setSearchSource$2$1", f = "ChatLockContactSearchManager.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockContactSearchManager$setSearchSource$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $searchString;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3AB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockContactSearchManager$setSearchSource$2$1(AnonymousClass3AB r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$searchString = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ChatLockContactSearchManager$setSearchSource$2$1(this.this$0, this.$searchString, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C001600r r5;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3AB r0 = this.this$0;
            r5 = r0.A02;
            C63603Kr r4 = r0.A04;
            String str = this.$searchString;
            AnonymousClass00C.A07(str);
            this.L$0 = r5;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A04, new ChatLockPasscodeManager$validatePasscode$3(r4, str, (C023509x) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (C001600r) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C36341k9.A19(r5, AnonymousClass00C.A0J(obj, AnonymousClass2Ec.A00));
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockContactSearchManager$setSearchSource$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
