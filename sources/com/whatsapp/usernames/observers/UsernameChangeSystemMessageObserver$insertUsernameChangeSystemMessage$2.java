package com.whatsapp.usernames.observers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass2bI;
import X.AnonymousClass5JD;
import X.C009003v;
import X.C023509x;
import X.C142446ot;
import X.C20310xM;
import X.C36411kG;
import X.C65073Qp;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C142446ot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(UserJid userJid, C142446ot r3, String str, String str2, C023509x r6) {
        super(2, r6);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C65073Qp A09 = this.this$0.A00.A09(this.$userJid, true);
            if (A09 != null) {
                C142446ot r0 = this.this$0;
                AnonymousClass11F A06 = A09.A06();
                AnonymousClass00C.A08(A06);
                String str = this.$oldUsername;
                String str2 = this.$newUsername;
                AnonymousClass2bI A00 = r0.A04.A00(C36411kG.A0o(A06, r0.A03), 165, System.currentTimeMillis());
                AnonymousClass00C.A0E(A00, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageSystemUsernameChange");
                AnonymousClass5JD r1 = (AnonymousClass5JD) A00;
                AnonymousClass00C.A0D(str, 0);
                r1.A01 = str;
                AnonymousClass00C.A0D(str2, 0);
                r1.A00 = str2;
                ((C20310xM) this.this$0.A05.getValue()).A0h(r1);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
