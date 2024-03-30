package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03X;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C81563xD;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.NonWaContactsLoader$loadContacts$2", f = "NonWaContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NonWaContactsLoader$loadContacts$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ NonWaContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonWaContactsLoader$loadContacts$2(NonWaContactsLoader nonWaContactsLoader, C023509x r3) {
        super(2, r3);
        this.this$0 = nonWaContactsLoader;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NonWaContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NonWaContactsLoader$loadContacts$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0I = AnonymousClass001.A0I();
            this.this$0.A00.A0o(A0I);
            NonWaContactsLoader nonWaContactsLoader = this.this$0;
            AnonymousClass03X.A08(A0I, new C81563xD(nonWaContactsLoader.A01, nonWaContactsLoader.A02));
            return C007103b.A0f(A0I);
        }
        throw AnonymousClass000.A0e();
    }
}
