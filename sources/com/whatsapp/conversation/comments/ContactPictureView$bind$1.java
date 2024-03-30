package com.whatsapp.conversation.comments;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass1RY;
import X.AnonymousClass3T1;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C19730wQ;
import X.C36371kC;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ContactPictureView$bind$1", f = "ContactPictureView.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class ContactPictureView$bind$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass1RY $contactPhotoLoader;
    public final /* synthetic */ AnonymousClass3T1 $message;
    public int label;
    public final /* synthetic */ ContactPictureView this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.comments.ContactPictureView$bind$1$1", f = "ContactPictureView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.comments.ContactPictureView$bind$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            return new AnonymousClass1(contactPictureView3, A0D, A0P, r8);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass1RY.this.A08(contactPictureView3, A0D);
                ContactPictureView contactPictureView = contactPictureView3;
                Context context = contactPictureView.getContext();
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = A0P;
                C36371kC.A14(context, contactPictureView, A0L, R.string.f12nameremoved);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPictureView$bind$1(AnonymousClass1RY r2, ContactPictureView contactPictureView, AnonymousClass3T1 r4, C023509x r5) {
        super(2, r5);
        this.this$0 = contactPictureView;
        this.$message = r4;
        this.$contactPhotoLoader = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ContactPictureView$bind$1(this.$contactPhotoLoader, this.this$0, this.$message, r6);
    }

    public final Object invokeSuspend(Object obj) {
        final AnonymousClass141 A0D;
        final String A0P;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ContactPictureView contactPictureView = this.this$0;
            AnonymousClass3T1 r1 = this.$message;
            if (r1.A1J.A02) {
                C19730wQ meManager = contactPictureView.getMeManager();
                meManager.A0G();
                A0D = meManager.A0E;
            } else {
                UserJid A0L = r1.A0L();
                if (A0L != null) {
                    A0D = contactPictureView.getContactManager().A0D(A0L);
                }
            }
            if (A0D != null) {
                boolean z = this.$message.A1J.A02;
                ContactPictureView contactPictureView2 = this.this$0;
                if (z) {
                    A0P = contactPictureView2.getContext().getString(R.string.f12nameremoved);
                } else {
                    A0P = this.this$0.getWaContactNames().A0P(A0D, contactPictureView2.getWaContactNames().A0A(this.$message.A1J.A00));
                }
                AnonymousClass00C.A0B(A0P);
                C005502l mainDispatcher = this.this$0.getMainDispatcher();
                final AnonymousClass1RY r5 = this.$contactPhotoLoader;
                final ContactPictureView contactPictureView3 = this.this$0;
                AnonymousClass1 r4 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, mainDispatcher, r4) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactPictureView$bind$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
