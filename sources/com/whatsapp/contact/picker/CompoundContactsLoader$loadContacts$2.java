package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass314;
import X.AnonymousClass3I5;
import X.AnonymousClass4Z8;
import X.C000400e;
import X.C005502l;
import X.C008903u;
import X.C009003v;
import X.C023109s;
import X.C023509x;
import X.C06830Vg;
import X.C12790if;
import X.C12800ig;
import X.C15380nF;
import X.C18650tV;
import X.C36431kI;
import X.C86704Ly;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2", f = "CompoundContactsLoader.kt", i = {0}, l = {45}, m = "invokeSuspend", n = {"resultMap"}, s = {"L$1"})
public final class CompoundContactsLoader$loadContacts$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ C005502l $dispatcher;
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass314 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2(AnonymousClass314 r2, AnonymousClass147 r3, C023509x r4, C005502l r5, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$concurrentCapacity = i;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new CompoundContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r8, this.$dispatcher, this.$concurrentCapacity);
    }

    public final Object invokeSuspend(Object obj) {
        Map map;
        Iterator it;
        String str;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Set set = this.this$0.A00;
            AnonymousClass00C.A0D(set, 0);
            C12790if r1 = new C12790if(new C86704Ly(this.$groupJid, this.$dispatcher), new C18650tV(set, 0));
            int i2 = this.$concurrentCapacity;
            if (i2 > 0) {
                C12800ig r0 = new C12800ig(r1, i2, i2);
                map = C36431kI.A1G();
                it = r0.iterator();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                if (i2 != i2) {
                    A0u.append("Both size ");
                    A0u.append(i2);
                    str = " and step ";
                } else {
                    str = "size ";
                }
                A0u.append(str);
                A0u.append(i2);
                throw AnonymousClass000.A0c(" must be greater than zero.", A0u);
            }
        } else if (i == 1) {
            map = (Map) this.L$1;
            it = (Iterator) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        while (it.hasNext()) {
            C06830Vg r02 = C06830Vg.$redex_init_class;
            C008903u r3 = C008903u.A00;
            C15380nF r2 = new C15380nF(C023109s.A00, (Iterable) it.next(), r3, -2);
            AnonymousClass4Z8 r03 = new AnonymousClass4Z8(map, 9);
            this.L$0 = it;
            this.L$1 = map;
            this.label = 1;
            if (r2.B36(this, r03) == r4) {
                return r4;
            }
        }
        return new AnonymousClass3I5(C000400e.A0B(map));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
