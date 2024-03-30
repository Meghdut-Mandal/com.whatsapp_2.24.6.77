package com.whatsapp.status.archive;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass05I;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C06820Vf;
import X.C18510tH;
import X.C33311f5;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1", f = "StatusArchiveSettingsBottomSheetDialog.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class StatusArchiveSettingsBottomSheetDialog$onCreate$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StatusArchiveSettingsBottomSheetDialog this$0;

    @DebugMetadata(c = "com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1$1", f = "StatusArchiveSettingsBottomSheetDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog$onCreate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05I r3 = ((StatusArchiveSettingsViewModel) StatusArchiveSettingsBottomSheetDialog.this.A03.getValue()).A03;
                final StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = StatusArchiveSettingsBottomSheetDialog.this;
                C06820Vf.A01(C33311f5.A00(StatusArchiveSettingsBottomSheetDialog.this), new C18510tH((C009003v) new C009003v((C023509x) null) {
                    public /* synthetic */ boolean Z$0;
                    public int label;

                    public final C023509x create(Object obj, C023509x r4) {
                        AnonymousClass1 r1 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public StatusArchiveSettingsBottomSheetDialog$onCreate$1(StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog, C023509x r3) {
                            super(2, r3);
                            this.this$0 = statusArchiveSettingsBottomSheetDialog;
                        }

                        public final C023509x create(Object obj, C023509x r4) {
                            return new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0AN.A00(obj);
                                final StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = this.this$0;
                                AnonymousClass01P r2 = AnonymousClass01P.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                this.label = 1;
                                if (AnonymousClass3LK.A01(r2, statusArchiveSettingsBottomSheetDialog, this, r0) == r5) {
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
