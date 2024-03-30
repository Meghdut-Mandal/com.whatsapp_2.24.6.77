package com.whatsapp.calling.psa.view;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass05K;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C13170jR;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2", f = "GroupCallPsaBottomSheet.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class GroupCallPsaBottomSheet$onViewCreated$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ GroupCallPsaBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2$1", f = "GroupCallPsaBottomSheet.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet$onViewCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05K r3 = ((GroupCallPsaViewModel) GroupCallPsaBottomSheet.this.A04.getValue()).A05;
                AnonymousClass4Z8 r0 = new AnonymousClass4Z8(GroupCallPsaBottomSheet.this, 4);
                this.label = 1;
                if (r3.B36(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0e();
            } else {
                AnonymousClass0AN.A00(obj);
            }
            throw new C13170jR();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaBottomSheet$onViewCreated$2(GroupCallPsaBottomSheet groupCallPsaBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = groupCallPsaBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GroupCallPsaBottomSheet$onViewCreated$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaBottomSheet$onViewCreated$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final GroupCallPsaBottomSheet groupCallPsaBottomSheet = this.this$0;
            AnonymousClass01P r2 = AnonymousClass01P.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A01(r2, groupCallPsaBottomSheet, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
