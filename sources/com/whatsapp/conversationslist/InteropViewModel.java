package com.whatsapp.conversationslist;

import X.AnonymousClass04R;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1A6;
import X.C001700s;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C109325Xd;
import X.C18820ts;
import X.C32881eL;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class InteropViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C32881eL A01;
    public final C005502l A02;
    public final AnonymousClass1A6 A03;
    public final C18820ts A04;

    @DebugMetadata(c = "com.whatsapp.conversationslist.InteropViewModel$1", f = "InteropViewModel.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversationslist.InteropViewModel$1  reason: invalid class name */
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
                final InteropViewModel interopViewModel = InteropViewModel.this;
                C005502l r2 = interopViewModel.A02;
                AnonymousClass1 r0 = new C009003v((C023509x) null) {
                    public int label;

                    public final C023509x create(Object obj, C023509x r4) {
                        return 

                        public InteropViewModel(AnonymousClass1A6 r4, C18820ts r5, C32881eL r6, C005502l r7) {
                            C36321k7.A18(r5, r4, r6, r7);
                            this.A04 = r5;
                            this.A03 = r4;
                            this.A01 = r6;
                            this.A02 = r7;
                            C36331k8.A1T(new AnonymousClass1((C023509x) null), C109325Xd.A00(this));
                        }
                    }
