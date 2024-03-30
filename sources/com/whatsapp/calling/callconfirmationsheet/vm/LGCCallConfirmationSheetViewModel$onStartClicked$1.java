package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass1ND;
import X.AnonymousClass3UL;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C19730wQ;
import X.C36381kD;
import X.C36401kF;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel$onStartClicked$1", f = "LGCCallConfirmationSheetViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class LGCCallConfirmationSheetViewModel$onStartClicked$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ LGCCallConfirmationSheetViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel$onStartClicked$1$1", f = "LGCCallConfirmationSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel$onStartClicked$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(context, lGCCallConfirmationSheetViewModel2, A0I, r6);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel = lGCCallConfirmationSheetViewModel2;
                AnonymousClass1ND r1 = lGCCallConfirmationSheetViewModel.A02;
                List list = A0I;
                r1.Buc(context, lGCCallConfirmationSheetViewModel.A07, list, lGCCallConfirmationSheetViewModel.A00, lGCCallConfirmationSheetViewModel.A0D);
                AnonymousClass05L r12 = lGCCallConfirmationSheetViewModel2.A0C;
                AnonymousClass0AJ r0 = AnonymousClass0AJ.A00;
                r12.setValue(r0);
                return r0;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LGCCallConfirmationSheetViewModel$onStartClicked$1(Context context, LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = lGCCallConfirmationSheetViewModel;
        this.$context = context;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new LGCCallConfirmationSheetViewModel$onStartClicked$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel = this.this$0;
            AnonymousClass147 r3 = lGCCallConfirmationSheetViewModel.A07;
            AnonymousClass17X r1 = lGCCallConfirmationSheetViewModel.A05;
            C19730wQ r0 = lGCCallConfirmationSheetViewModel.A01;
            AnonymousClass16D r2 = lGCCallConfirmationSheetViewModel.A03;
            final ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = AnonymousClass3UL.A03(r0, r1, r3).iterator();
            while (it.hasNext()) {
                C36381kD.A1H(r2, C36401kF.A0a(it), A0I);
            }
            final LGCCallConfirmationSheetViewModel lGCCallConfirmationSheetViewModel2 = this.this$0;
            C005502l r32 = lGCCallConfirmationSheetViewModel2.A0A;
            final Context context = this.$context;
            AnonymousClass1 r02 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r32, r02) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LGCCallConfirmationSheetViewModel$onStartClicked$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
