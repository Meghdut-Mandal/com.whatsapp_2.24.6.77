package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C122825vU;
import X.C223313w;
import X.C90464aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForLid$2", f = "ContactUsernameProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForLid$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C223313w $lidUserJid;
    public int label;
    public final /* synthetic */ C122825vU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForLid$2(C223313w r2, C122825vU r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$lidUserJid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ContactUsernameProvider$getUsernameForLid$2(this.$lidUserJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            String A01 = this.this$0.A00.A01(this.$lidUserJid);
            if (A01 == null) {
                return null;
            }
            if (A01.length() <= 0 || A01.charAt(0) != '@') {
                return C90464aC.A0f(A01, AnonymousClass000.A0u(), '@');
            }
            return A01;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForLid$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
