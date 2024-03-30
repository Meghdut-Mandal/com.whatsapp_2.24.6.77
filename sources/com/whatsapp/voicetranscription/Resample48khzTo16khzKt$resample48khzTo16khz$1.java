package com.whatsapp.voicetranscription;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C12250hk;
import X.C14090kx;
import X.C16970qV;
import X.C90524aI;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscription.Resample48khzTo16khzKt$resample48khzTo16khz$1", f = "resample48khzTo16khz.kt", i = {0, 0, 0, 1, 1}, l = {14, 15}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "secondByte", "$this$sequence", "iterator"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"})
public final class Resample48khzTo16khzKt$resample48khzTo16khz$1 extends C14090kx implements C009003v {
    public final /* synthetic */ C16970qV $source;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Resample48khzTo16khzKt$resample48khzTo16khz$1(C023509x r1, C16970qV r2) {
        super(r1);
        this.$source = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        Resample48khzTo16khzKt$resample48khzTo16khz$1 resample48khzTo16khzKt$resample48khzTo16khz$1 = new Resample48khzTo16khzKt$resample48khzTo16khz$1(r4, this.$source);
        resample48khzTo16khzKt$resample48khzTo16khz$1.L$0 = obj;
        return resample48khzTo16khzKt$resample48khzTo16khz$1;
    }

    public final Object invokeSuspend(Object obj) {
        C12250hk r3;
        Iterator it;
        Object obj2;
        Object obj3;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r3 = (C12250hk) this.L$0;
            it = this.$source.iterator();
        } else if (i == 1) {
            int i2 = this.I$0;
            Object obj4 = this.L$1;
            C12250hk r1 = (C12250hk) this.L$0;
            AnonymousClass0AN.A00(obj);
            Integer A0a = C90524aI.A0a(i2);
            this.L$0 = r1;
            this.L$1 = obj4;
            this.label = 2;
            r1.A01(A0a, this);
            return r6;
        } else if (i == 2) {
            it = (Iterator) this.L$1;
            r3 = (C12250hk) this.L$0;
            AnonymousClass0AN.A00(obj);
            if (it.hasNext()) {
                it.next();
            }
            if (it.hasNext()) {
                it.next();
            }
            if (it.hasNext()) {
                it.next();
            }
            if (it.hasNext()) {
                it.next();
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        if (it.hasNext()) {
            obj2 = it.next();
        } else {
            obj2 = null;
        }
        Number number = (Number) obj2;
        if (number != null) {
            int intValue = number.intValue();
            if (it.hasNext()) {
                obj3 = it.next();
            } else {
                obj3 = null;
            }
            Number number2 = (Number) obj3;
            if (number2 != null) {
                int intValue2 = number2.intValue();
                Integer A0a2 = C90524aI.A0a(intValue);
                this.L$0 = r3;
                this.L$1 = it;
                this.I$0 = intValue2;
                this.label = 1;
                r3.A01(A0a2, this);
                return r6;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Resample48khzTo16khzKt$resample48khzTo16khz$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
