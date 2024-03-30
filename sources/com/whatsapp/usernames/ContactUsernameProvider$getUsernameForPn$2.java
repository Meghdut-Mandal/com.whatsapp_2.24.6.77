package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C122825vU;
import X.C223313w;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForPn$2", f = "ContactUsernameProvider.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForPn$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ PhoneUserJid $phoneUserJid;
    public int label;
    public final /* synthetic */ C122825vU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForPn$2(PhoneUserJid phoneUserJid, C122825vU r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$phoneUserJid = phoneUserJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ContactUsernameProvider$getUsernameForPn$2(this.$phoneUserJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C223313w A09 = this.this$0.A01.A09(this.$phoneUserJid);
            if (A09 == null) {
                return null;
            }
            C122825vU r3 = this.this$0;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A02, new ContactUsernameProvider$getUsernameForLid$2(A09, r3, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactUsernameProvider$getUsernameForPn$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
