package com.whatsapp.usernames.observers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C142446ot;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$onUsernameChanged$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C142446ot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$onUsernameChanged$1(UserJid userJid, C142446ot r3, String str, String str2, C023509x r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new UsernameChangeSystemMessageObserver$onUsernameChanged$1(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C142446ot r5 = this.this$0;
            UserJid userJid = this.$userJid;
            String str = this.$oldUsername;
            String str2 = this.$newUsername;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r5.A06, new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(userJid, r5, str, str2, (C023509x) null)) == r2) {
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
        return ((UsernameChangeSystemMessageObserver$onUsernameChanged$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
