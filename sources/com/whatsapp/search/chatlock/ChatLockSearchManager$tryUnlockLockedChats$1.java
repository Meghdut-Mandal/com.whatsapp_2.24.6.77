package com.whatsapp.search.chatlock;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1S3;
import X.AnonymousClass1SD;
import X.AnonymousClass2Ec;
import X.AnonymousClass2dO;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import X.C598735p;
import X.C63603Kr;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1", f = "ChatLockSearchManager.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockSearchManager$tryUnlockLockedChats$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C598735p $cancellableInput;
    public final /* synthetic */ AnonymousClass1S3 $query;
    public final /* synthetic */ C10810fG $result;
    public int label;
    public final /* synthetic */ AnonymousClass1SD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockSearchManager$tryUnlockLockedChats$1(AnonymousClass1S3 r2, AnonymousClass1SD r3, C598735p r4, C023509x r5, C10810fG r6) {
        super(2, r5);
        this.this$0 = r3;
        this.$query = r2;
        this.$cancellableInput = r4;
        this.$result = r6;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new ChatLockSearchManager$tryUnlockLockedChats$1(this.$query, this.this$0, this.$cancellableInput, r8, this.$result);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C63603Kr r4 = (C63603Kr) this.this$0.A04.get();
            String A02 = this.$query.A02();
            AnonymousClass00C.A08(A02);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A04, new ChatLockPasscodeManager$validatePasscode$3(r4, A02, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (AnonymousClass00C.A0J(obj, AnonymousClass2Ec.A00)) {
            this.$cancellableInput.A00.A04();
            this.$result.element = new AnonymousClass2dO(this.this$0.A05);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockSearchManager$tryUnlockLockedChats$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
