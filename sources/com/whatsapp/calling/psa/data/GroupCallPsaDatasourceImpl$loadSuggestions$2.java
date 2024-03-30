package com.whatsapp.calling.psa.data;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass03X;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4YZ;
import X.AnonymousClass6XG;
import X.C005502l;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C10810fG;
import X.C608139l;
import X.C65883Tv;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2", f = "GroupCallPsaDatasourceImpl.kt", i = {0}, l = {33}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class GroupCallPsaDatasourceImpl$loadSuggestions$2 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C608139l this$0;

    @DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1", f = "GroupCallPsaDatasourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r5, r4);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                ArrayList A0I = C608139l.this.A01.A0I();
                AnonymousClass6XG.A01(new C65883Tv(C608139l.this, 0), A0I);
                AnonymousClass00C.A0B(A0I);
                if (!A0I.isEmpty()) {
                    C608139l r2 = C608139l.this;
                    if (A0I.size() > 1) {
                        AnonymousClass03X.A08(A0I, new AnonymousClass4YZ(r2, 3));
                    }
                    C10810fG r22 = r4;
                    List subList = A0I.subList(0, Math.min(A0I.size(), 20));
                    AnonymousClass00C.A08(subList);
                    r22.element = subList;
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaDatasourceImpl$loadSuggestions$2(C608139l r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        final C10810fG r4;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r4 = new C10810fG();
            r4.element = C023409w.A00;
            final C608139l r3 = this.this$0;
            C005502l r2 = r3.A05;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.L$0 = r4;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            r4 = (C10810fG) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return r4.element;
    }
}
